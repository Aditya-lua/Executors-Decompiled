/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2dcc
 */

/* ix::WebSocketPerMessageDeflateDecompressor::~WebSocketPerMessageDeflateDecompressor() */

void __thiscall
ix::WebSocketPerMessageDeflateDecompressor::~WebSocketPerMessageDeflateDecompressor
          (WebSocketPerMessageDeflateDecompressor *this)

{
                    /* try { // try from 009a2ddc to 009a2ddf has its CatchHandler @ 009a2de8 */
  inflateEnd(this + 0x4008);
  return;
}

