package br.com.srv.receiver.data.entrypoint.resource

import br.com.srv.receiver.data.core.usercase.ReceiverEquipmentUseCase
import br.com.srv.receiver.data.entrypoint.mapper.ReceiverEquipmentRequestToReceiverEquipmentMapper
import br.com.srv.receiver.data.entrypoint.request.ReceiverEquipmentRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ReceiverEquipmentResource() {

    @Autowired
    lateinit var receiverEquipmentUseCase: ReceiverEquipmentUseCase

    @PostMapping("/receiver")
    fun receiver(@RequestBody equipments: List<ReceiverEquipmentRequest>): ResponseEntity<Void> {
        print("Receiving Data...")
        val equipmentsConverted = equipments.map { ReceiverEquipmentRequestToReceiverEquipmentMapper.convert(it) }.toList()
        receiverEquipmentUseCase.execute(equipmentsConverted)

        return ResponseEntity<Void>(HttpStatus.CREATED)
    }
}