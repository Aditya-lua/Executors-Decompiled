/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2070
 */

/* ix::WebSocketPerMessageDeflate::WebSocketPerMessageDeflate() */

void __thiscall
ix::WebSocketPerMessageDeflate::WebSocketPerMessageDeflate(WebSocketPerMessageDeflate *this)

{
  WebSocketPerMessageDeflateCompressor *this_00;
  WebSocketPerMessageDeflateDecompressor *this_01;
  
  this_00 = operator_new(0x4078);
                    /* try { // try from 009a2090 to 009a2093 has its CatchHandler @ 009a20f8 */
  WebSocketPerMessageDeflateCompressor::WebSocketPerMessageDeflateCompressor(this_00);
  *(WebSocketPerMessageDeflateCompressor **)this = this_00;
                    /* try { // try from 009a2098 to 009a209f has its CatchHandler @ 009a20e0 */
  this_01 = operator_new(0x4078);
                    /* try { // try from 009a20a4 to 009a20a7 has its CatchHandler @ 009a20bc */
  WebSocketPerMessageDeflateDecompressor::WebSocketPerMessageDeflateDecompressor(this_01);
  *(WebSocketPerMessageDeflateDecompressor **)(this + 8) = this_01;
  return;
}

