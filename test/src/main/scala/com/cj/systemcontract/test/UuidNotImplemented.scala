package com.cj.systemcontract.test

import java.util.UUID

import com.cj.systemcontract.UuidContract

trait UuidNotImplemented extends UuidContract {
  override def randomUUID: UUID = ???

  override def nameUUIDFromBytes(name: Array[Byte]): UUID = ???

  override def fromString(name: String): UUID = ???
}
