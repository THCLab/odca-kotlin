package com.thehumancolossuslab.oca

import com.benasher44.uuid.uuid4

data class AttributeDto(
    val name: String, val type: String, val isPii: Boolean,
    val translations: Map<String, Map<String, Any>>?,
    val format: String?, val characterEncoding: String?
) {
    val uuid: String

    init {
        this.uuid = uuid4().toString()
    }
}
