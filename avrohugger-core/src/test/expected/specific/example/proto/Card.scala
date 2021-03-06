/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.proto

import scala.annotation.switch

case class Card(var suit: Suit, var number: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(null, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos$ if pos$ == 0 => {
        suit
      }.asInstanceOf[AnyRef]
      case pos$ if pos$ == 1 => {
        number
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos$ if pos$ == 0 => this.suit = {
        value
      }.asInstanceOf[Suit]
      case pos$ if pos$ == 1 => this.number = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Card.SCHEMA$
}

object Card {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Card\",\"namespace\":\"example.proto\",\"fields\":[{\"name\":\"suit\",\"type\":{\"type\":\"enum\",\"name\":\"Suit\",\"symbols\":[\"SPADES\",\"HEARTS\",\"DIAMONDS\",\"CLUBS\"]}},{\"name\":\"number\",\"type\":\"int\"}]}")
}