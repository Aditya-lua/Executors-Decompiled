/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f78c
 */

/* ix::WebSocket::isOnMessageCallbackRegistered() const */

bool __thiscall ix::WebSocket::isOnMessageCallbackRegistered(WebSocket *this)

{
  return *(long *)(this + 0x3f0) != 0;
}

