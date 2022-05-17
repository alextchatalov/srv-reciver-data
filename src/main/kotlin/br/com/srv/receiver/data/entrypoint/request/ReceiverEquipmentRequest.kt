package br.com.srv.receiver.data.entrypoint.request

data class ReceiverEquipmentRequest(val clientId: String, val equipmentName: String, val temperature: String)