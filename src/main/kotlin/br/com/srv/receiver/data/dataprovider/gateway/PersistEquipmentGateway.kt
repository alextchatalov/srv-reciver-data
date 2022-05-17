package br.com.srv.receiver.data.dataprovider.gateway

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import br.com.srv.receiver.data.core.usercase.PersistEquipment
import br.com.srv.receiver.data.dataprovider.entity.EquipmentEntity
import br.com.srv.receiver.data.dataprovider.mapper.ReceiverEquipmentToEquipmentEntityMapper
import br.com.srv.receiver.data.dataprovider.repository.EquipmentRepository
import org.springframework.stereotype.Controller

@Controller
class PersistEquipmentGateway : PersistEquipment {


    lateinit var repository: EquipmentRepository

    var database: MutableList<EquipmentEntity> = mutableListOf()

    override fun execute(equipment: ReceiverEquipment) {
        val equipmentEntity = ReceiverEquipmentToEquipmentEntityMapper.convert(equipment)
        //val equipmentEntitySaved = repository.save(equipmentEntity)
        database.add(equipmentEntity)
        print("Register in database: ${database.size} \n")
    }
}