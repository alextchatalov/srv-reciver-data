package br.com.srv.receiver.data.dataprovider.gateway

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import br.com.srv.receiver.data.core.usercase.PersistEquipmentBoundary
import br.com.srv.receiver.data.dataprovider.entity.EquipmentEntity
import br.com.srv.receiver.data.dataprovider.mapper.ReceiverEquipmentToEquipmentEntityMapper
import br.com.srv.receiver.data.dataprovider.repository.EquipmentRepository
import org.springframework.stereotype.Controller
import mu.KotlinLogging

@Controller
class PersistEquipmentBoundaryGateway : PersistEquipmentBoundary {


    lateinit var repository: EquipmentRepository
    private val logger = KotlinLogging.logger {}

    var database: MutableList<EquipmentEntity> = mutableListOf()

    override fun execute(equipments: List<ReceiverEquipment>) {
        val equipmentsEntity = equipments.map { ReceiverEquipmentToEquipmentEntityMapper.convert(it) }.toList()
        //val equipmentEntitySaved = repository.save(equipmentEntity)
        database.addAll(equipmentsEntity)
        logger.info { "Save list of register in database: $database \n" }
    }
}