/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ffb8
 */

/* ix::WebSocket::isAutomaticReconnectionEnabled() const */

byte __thiscall ix::WebSocket::isAutomaticReconnectionEnabled(WebSocket *this)

{
  return (byte)this[0x438] & 1;
}

