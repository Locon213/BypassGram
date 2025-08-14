package org.bypassgram.dpi

object DpiBridge {
    init { System.loadLibrary("dpi") }
    external fun init(mtu: Int): Int
    external fun process(packet: ByteArray): Int
}
