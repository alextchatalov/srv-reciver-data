package br.com.srv.receiver.data.entrypoint.mapper

import br.com.srv.receiver.data.core.model.ReceiverEquipment
import br.com.srv.receiver.data.entrypoint.request.ReceiverEquipmentRequest

class ReceiverEquipmentRequestToReceiverEquipmentMapper {

    companion object {
        fun convert(receiverEquipmentRequest: ReceiverEquipmentRequest): ReceiverEquipment {
            return ReceiverEquipment(
                receiverEquipmentRequest.clientId,
                receiverEquipmentRequest.equipmentName,
                receiverEquipmentRequest.temperature
            )
        }
    }
}