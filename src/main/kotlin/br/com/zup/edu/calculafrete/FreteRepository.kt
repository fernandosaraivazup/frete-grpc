package br.com.zup.edu.calculafrete

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface FreteRepository : JpaRepository<Frete, Long> {

    fun findByCep(cep: String): Frete?
}
