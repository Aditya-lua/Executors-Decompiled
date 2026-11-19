/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d228
 */

/* ix::WebSocket::setHandshakeTimeout(int) */

void __thiscall ix::WebSocket::setHandshakeTimeout(WebSocket *this,int param_1)

{
  *(int *)(this + 0x49c) = param_1;
  return;
}

