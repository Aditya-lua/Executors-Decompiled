/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993020
 */

/* ix::WebSocketPerMessageDeflateOptions::getClientNoContextTakeover() const */

WebSocketPerMessageDeflateOptions __thiscall
ix::WebSocketPerMessageDeflateOptions::getClientNoContextTakeover
          (WebSocketPerMessageDeflateOptions *this)

{
  return this[1];
}

