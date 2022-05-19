package br.com.srv.receiver.data.dataprovider.gateway

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import br.com.srv.receiver.data.core.usercase.PersistEquipmentBoundary
import br.com.srv.receiver.data.dataprovider.entity.EquipmentEntity
import br.com.srv.receiver.data.dataprovider.mapper.ReceiverEquipmentToEquipmentEntityMapper
import br.com.srv.receiver.data.dataprovider.repository.EquipmentRepository
import org.springframework.stereotype.Controller

@Controller
class PersistEquipmentBoundaryGateway : PersistEquipmentBoundary {


    lateinit var repository: EquipmentRepository

    var database: MutableList<EquipmentEntity> = mutableListOf()

    override fun execute(equipments: List<ReceiverEquipment>) {
        print("Saving...")
        val equipmentsEntity = equipments.map { ReceiverEquipmentToEquipmentEntityMapper.convert(it) }.toList()
        //val equipmentEntitySaved = repository.save(equipmentEntity)
        database.addAll(equipmentsEntity)
        print("Save list of register in database: $database \n")
    }
}