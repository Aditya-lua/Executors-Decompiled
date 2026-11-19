/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992458
 */

/* ix::WebSocketPerMessageDeflateOptions::sanitizeClientMaxWindowBits() */

void __thiscall
ix::WebSocketPerMessageDeflateOptions::sanitizeClientMaxWindowBits
          (WebSocketPerMessageDeflateOptions *this)

{
  if (this[3] == (WebSocketPerMessageDeflateOptions)0x8) {
    this[3] = (WebSocketPerMessageDeflateOptions)0x9;
  }
  return;
}

