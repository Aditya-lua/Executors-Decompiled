/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ed80
 */

/* ix::WebSocket::isClosing() const */

bool __thiscall ix::WebSocket::isClosing(WebSocket *this)

{
  int iVar1;
  
  iVar1 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
  return iVar1 == 0;
}

