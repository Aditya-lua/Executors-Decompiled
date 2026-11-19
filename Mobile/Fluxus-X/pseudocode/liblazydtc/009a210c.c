/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a210c
 */

/* ix::WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate() */

void __thiscall
ix::WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate(WebSocketPerMessageDeflate *this)

{
  WebSocketPerMessageDeflateDecompressor *this_00;
  WebSocketPerMessageDeflateCompressor *this_01;
  
  this_00 = *(WebSocketPerMessageDeflateDecompressor **)(this + 8);
  *(undefined8 *)(this + 8) = 0;
  if (this_00 != (WebSocketPerMessageDeflateDecompressor *)0x0) {
    WebSocketPerMessageDeflateDecompressor::~WebSocketPerMessageDeflateDecompressor(this_00);
    operator_delete(this_00);
  }
  this_01 = *(WebSocketPerMessageDeflateCompressor **)this;
  *(undefined8 *)this = 0;
  if (this_01 == (WebSocketPerMessageDeflateCompressor *)0x0) {
    return;
  }
  WebSocketPerMessageDeflateCompressor::~WebSocketPerMessageDeflateCompressor(this_01);
  operator_delete(this_01);
  return;
}

