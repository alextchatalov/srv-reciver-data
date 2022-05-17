package br.com.srv.receiver.data.dataprovider.mapper

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import br.com.srv.receiver.data.dataprovider.entity.EquipmentEntity

class ReceiverEquipmentToEquipmentEntityMapper {

    companion object {
        fun convert(receiverEquipment: ReceiverEquipment): EquipmentEntity {
            return EquipmentEntity(
                id = null,
                clientId = receiverEquipment.clientId,
                equipmentName = receiverEquipment.equipmentName,
                temperature = receiverEquipment.temperature
            )
        }
    }
}