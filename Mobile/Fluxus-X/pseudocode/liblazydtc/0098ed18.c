/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ed18
 */

/* ix::WebSocket::isConnected() const */

bool __thiscall ix::WebSocket::isConnected(WebSocket *this)

{
  uint uVar1;
  
  uVar1 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
  if (uVar1 < 4) {
    return (uVar1 & 0xf) == 3;
  }
  return false;
}

