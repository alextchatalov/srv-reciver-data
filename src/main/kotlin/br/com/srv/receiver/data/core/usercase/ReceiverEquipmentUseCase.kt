package br.com.srv.receiver.data.core.usercase

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import org.springframework.stereotype.Controller

@Controller
class ReceiverEquipmentUseCase(val persistEquipmentBoundary:PersistEquipmentBoundary) {

    fun execute(equipments: List<ReceiverEquipment>) {
        persistEquipmentBoundary.execute(equipments)
    }
}