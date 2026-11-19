/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098aaa8
 */

/* ix::SocketServer::getConnectionsThreadsCount() */

undefined8 __thiscall ix::SocketServer::getConnectionsThreadsCount(SocketServer *this)

{
  undefined8 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0xa0));
  uVar1 = *(undefined8 *)(this + 0x98);
  std::__ndk1::mutex::unlock((mutex *)(this + 0xa0));
  return uVar1;
}

