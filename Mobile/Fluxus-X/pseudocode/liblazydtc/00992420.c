/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992420
 */

/* ix::WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions(bool, bool, bool,
   unsigned char, unsigned char) */

void __thiscall
ix::WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
          (WebSocketPerMessageDeflateOptions *this,bool param_1,bool param_2,bool param_3,
          uchar param_4,uchar param_5)

{
  this[3] = (WebSocketPerMessageDeflateOptions)param_4;
  *this = (WebSocketPerMessageDeflateOptions)param_1;
  this[1] = (WebSocketPerMessageDeflateOptions)param_2;
  this[2] = (WebSocketPerMessageDeflateOptions)param_3;
  this[4] = (WebSocketPerMessageDeflateOptions)param_5;
  if (param_4 == '\b') {
    this[3] = (WebSocketPerMessageDeflateOptions)0x9;
  }
  return;
}

