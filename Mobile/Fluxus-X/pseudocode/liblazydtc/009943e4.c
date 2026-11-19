/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009943e4
 */

/* ix::WebSocketServer::getConnectedClientsCount() */

undefined8 __thiscall ix::WebSocketServer::getConnectedClientsCount(WebSocketServer *this)

{
  undefined8 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
  uVar1 = *(undefined8 *)(this + 0x2e8);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
  return uVar1;
}

