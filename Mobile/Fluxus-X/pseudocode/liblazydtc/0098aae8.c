/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098aae8
 */

/* ix::SocketServer::onSetTerminatedCallback() */

void __thiscall ix::SocketServer::onSetTerminatedCallback(SocketServer *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x210));
  this[0x238] = (SocketServer)0x1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x210));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x1e0));
  return;
}

