/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a222c
 */

/* ix::WebSocketPerMessageDeflateCompressor::~WebSocketPerMessageDeflateCompressor() */

void __thiscall
ix::WebSocketPerMessageDeflateCompressor::~WebSocketPerMessageDeflateCompressor
          (WebSocketPerMessageDeflateCompressor *this)

{
                    /* try { // try from 009a223c to 009a223f has its CatchHandler @ 009a2248 */
  deflateEnd(this + 0x4008);
  return;
}

