/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ed4c
 */

/* ix::WebSocket::getReadyState() const */

undefined4 __thiscall ix::WebSocket::getReadyState(WebSocket *this)

{
  uint uVar1;
  
  uVar1 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
  if (uVar1 < 4) {
    return *(undefined4 *)(&DAT_0029c7d0 + (long)(int)uVar1 * 4);
  }
  return 3;
}

