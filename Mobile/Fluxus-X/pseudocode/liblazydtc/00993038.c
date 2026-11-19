/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993038
 */

/* ix::WebSocketPerMessageDeflateOptions::getServerMaxWindowBits() const */

WebSocketPerMessageDeflateOptions __thiscall
ix::WebSocketPerMessageDeflateOptions::getServerMaxWindowBits
          (WebSocketPerMessageDeflateOptions *this)

{
  return this[4];
}

