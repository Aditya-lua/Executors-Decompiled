/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fddd4
 */

/* cpr::ThreadPool::Stop() */

undefined8 __thiscall cpr::ThreadPool::Stop(ThreadPool *this)

{
  __shared_weak_count *p_Var1;
  char cVar2;
  bool bVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  ThreadPool *pTVar7;
  __shared_weak_count *this_00;
  ThreadPool *pTVar8;
  
  if (*(int *)(this + 0x20) == 0) {
    uVar4 = 0xffffffff;
  }
  else {
    *(int *)(this + 0x20) = 0;
    std::__ndk1::condition_variable::notify_all((condition_variable *)(this + 0xd0));
    for (pTVar7 = *(ThreadPool **)(this + 0x40); this + 0x38 != pTVar7;
        pTVar7 = *(ThreadPool **)(pTVar7 + 8)) {
      if (*(long *)*(thread **)(pTVar7 + 0x10) != 0) {
        std::__ndk1::thread::join(*(thread **)(pTVar7 + 0x10));
      }
    }
    if (*(long *)(this + 0x48) != 0) {
      lVar5 = *(long *)(this + 0x38);
      pTVar7 = *(ThreadPool **)(this + 0x40);
      lVar6 = *(long *)pTVar7;
      *(undefined8 *)(lVar6 + 8) = *(undefined8 *)(lVar5 + 8);
      **(long **)(lVar5 + 8) = lVar6;
      *(undefined8 *)(this + 0x48) = 0;
      while (pTVar7 != this + 0x38) {
        this_00 = *(__shared_weak_count **)(pTVar7 + 0x18);
        pTVar8 = *(ThreadPool **)(pTVar7 + 8);
        if (this_00 != (__shared_weak_count *)0x0) {
          p_Var1 = this_00 + 8;
          do {
            lVar5 = *(long *)p_Var1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
            if (bVar3) {
              *(long *)p_Var1 = lVar5 + -1;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          if (lVar5 == 0) {
            (**(code **)(*(long *)this_00 + 0x10))(this_00);
            std::__ndk1::__shared_weak_count::__release_weak(this_00);
          }
        }
        operator_delete(pTVar7);
        pTVar7 = pTVar8;
      }
    }
    uVar4 = 0;
    *(undefined8 *)(this + 0x28) = 0;
    *(undefined8 *)(this + 0x30) = 0;
  }
  return uVar4;
}

