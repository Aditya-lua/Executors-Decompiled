/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ffac
 */

/* ix::WebSocket::disableAutomaticReconnection() */

void __thiscall ix::WebSocket::disableAutomaticReconnection(WebSocket *this)

{
  this[0x438] = (WebSocket)0x0;
  return;
}

