/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a648
 */

/* ix::SocketServer::stop() */

void __thiscall ix::SocketServer::stop(SocketServer *this)

{
  ulong uVar1;
  char *pcVar2;
  
  if (*(long *)(this + 0x70) != 0) {
    this[0x40] = (SocketServer)0x1;
    uVar1 = (**(code **)(**(long **)(this + 0x1d8) + 0x18))(*(long **)(this + 0x1d8),2);
    if ((uVar1 & 1) == 0) {
      pcVar2 = operator_new(0x30);
      builtin_strncpy(pcVar2,"SocketServer::stop: Cannot wake up from select",0x2f);
                    /* try { // try from 0098a6c4 to 0098a6cb has its CatchHandler @ 0098a76c */
      std::__ndk1::mutex::lock((mutex *)(this + 0x44));
      fprintf((FILE *)sched_yield,"%s\n",pcVar2);
      std::__ndk1::mutex::unlock((mutex *)(this + 0x44));
      operator_delete(pcVar2);
    }
    std::__ndk1::thread::join((thread *)(this + 0x70));
    this[0x40] = (SocketServer)0x0;
  }
  if (*(long *)(this + 0x80) != 0) {
    this[0x78] = (SocketServer)0x1;
    std::__ndk1::mutex::lock((mutex *)(this + 0x210));
    this[0x238] = (SocketServer)0x1;
    std::__ndk1::mutex::unlock((mutex *)(this + 0x210));
    std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x1e0));
    std::__ndk1::thread::join((thread *)(this + 0x80));
    this[0x78] = (SocketServer)0x0;
  }
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 200));
  Socket::closeSocket(*(int *)(this + 0x3c));
  return;
}

