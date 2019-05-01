package com.denmasoft.ksbra.device

import com.denmasoft.ksbra.gateway.Gateway
import com.denmasoft.ksbra.models.BaseModel
import javax.persistence.*


@Entity
@Table(name="Device")
class Device(
        @Column(nullable = true)
        val name: String,
        @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
        @JoinColumn(name = "gateway_id")
        var gateway: Gateway? = null): BaseModel() {
}