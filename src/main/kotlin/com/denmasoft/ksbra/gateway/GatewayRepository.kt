package com.denmasoft.ksbra.gateway

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
@Repository
interface GatewayRepository : JpaRepository<Gateway, Long>