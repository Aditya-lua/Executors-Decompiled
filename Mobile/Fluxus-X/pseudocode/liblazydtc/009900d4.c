/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009900d4
 */

/* ix::WebSocket::setAutoThreadName(bool) */

void __thiscall ix::WebSocket::setAutoThreadName(WebSocket *this,bool param_1)

{
  this[0x4e8] = (WebSocket)param_1;
  return;
}

