/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a850
 */

/* ix::SocketServer::closeTerminatedThreads() */

void __thiscall ix::SocketServer::closeTerminatedThreads(SocketServer *this)

{
  thread *this_00;
  __shared_weak_count *p_Var1;
  SocketServer *pSVar2;
  char cVar3;
  bool bVar4;
  ulong uVar5;
  long lVar6;
  __shared_weak_count *this_01;
  SocketServer *pSVar7;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0xa0));
  pSVar7 = *(SocketServer **)(this + 0x90);
  while (this + 0x88 != pSVar7) {
                    /* try { // try from 0098a888 to 0098a8a3 has its CatchHandler @ 0098a934 */
    uVar5 = ConnectionState::isTerminated(*(ConnectionState **)(pSVar7 + 0x10));
    if ((uVar5 & 1) == 0) {
      pSVar7 = *(SocketServer **)(pSVar7 + 8);
    }
    else {
      this_00 = (thread *)(pSVar7 + 0x20);
      if (*(long *)this_00 != 0) {
        std::__ndk1::thread::join(this_00);
      }
      lVar6 = *(long *)pSVar7;
      pSVar2 = *(SocketServer **)(pSVar7 + 8);
      *(SocketServer **)(lVar6 + 8) = pSVar2;
      **(long **)(pSVar7 + 8) = lVar6;
      *(long *)(this + 0x98) = *(long *)(this + 0x98) + -1;
      std::__ndk1::thread::~thread(this_00);
      this_01 = *(__shared_weak_count **)(pSVar7 + 0x18);
      if (this_01 != (__shared_weak_count *)0x0) {
        p_Var1 = this_01 + 8;
        do {
          lVar6 = *(long *)p_Var1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar4) {
            *(long *)p_Var1 = lVar6 + -1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (lVar6 == 0) {
          (**(code **)(*(long *)this_01 + 0x10))(this_01);
          std::__ndk1::__shared_weak_count::__release_weak(this_01);
        }
      }
      operator_delete(pSVar7);
      pSVar7 = pSVar2;
    }
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xa0));
  return;
}

