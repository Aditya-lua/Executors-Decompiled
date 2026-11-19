/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994580
 */

/* ix::WebSocketServer::getHandshakeTimeoutSecs() */

undefined4 __thiscall ix::WebSocketServer::getHandshakeTimeoutSecs(WebSocketServer *this)

{
  return *(undefined4 *)(this + 0x23c);
}

