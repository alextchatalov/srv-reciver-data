package br.com.srv.receiver.data.core.usercase

import br.com.srv.receiver.data.core.model.ReceiverEquipment

interface PersistEquipment {

    fun execute(equipment: ReceiverEquipment)
}