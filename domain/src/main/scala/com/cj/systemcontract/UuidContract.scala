package com.cj.systemcontract

import java.util.UUID

trait UuidContract {
  def randomUUID: UUID

  def nameUUIDFromBytes(name: Array[Byte]): UUID

  def fromString(name: String): UUID
}
