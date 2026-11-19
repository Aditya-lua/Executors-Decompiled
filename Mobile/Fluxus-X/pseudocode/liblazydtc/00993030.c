/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993030
 */

/* ix::WebSocketPerMessageDeflateOptions::getClientMaxWindowBits() const */

WebSocketPerMessageDeflateOptions __thiscall
ix::WebSocketPerMessageDeflateOptions::getClientMaxWindowBits
          (WebSocketPerMessageDeflateOptions *this)

{
  return this[3];
}

