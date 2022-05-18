package br.com.srv.receiver.data.core.usercase

import br.com.srv.receiver.data.core.model.ReceiverEquipment

interface PersistEquipmentBoundary {

    fun execute(equipment: ReceiverEquipment)
}