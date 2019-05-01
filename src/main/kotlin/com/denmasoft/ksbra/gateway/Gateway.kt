package com.denmasoft.ksbra.gateway

import com.denmasoft.ksbra.device.Device
import com.denmasoft.ksbra.models.BaseModel
import javax.persistence.*


@Entity
@Table(name="Gateway")
class Gateway(
        @Column(nullable = true)
        val name: String?=null,
        @OneToMany(mappedBy = "gateway", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
        var devices: List<Device> = emptyList()): BaseModel() {
    override fun toString(): String{
        return "{name: ${this.name}, devices: ${devices.map { it->it.name }}}"
    }
}