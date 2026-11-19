/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe3b8
 */

/* cpr::ThreadPool::DelThread(std::__ndk1::__thread_id) */

void __thiscall cpr::ThreadPool::DelThread(ThreadPool *this,pthread_t param_2)

{
  __shared_weak_count *p_Var1;
  ThreadPool *pTVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  time_t tVar6;
  time_t tVar7;
  long lVar8;
  __shared_weak_count *this_00;
  ThreadPool *pTVar9;
  
  tVar6 = time((time_t *)0x0);
  std::__ndk1::mutex::lock((mutex *)(this + 0x50));
  pTVar9 = this + 0x28;
  do {
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pTVar9,0x10);
    if (bVar4) {
      *(long *)pTVar9 = *(long *)pTVar9 + -1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  pTVar9 = this + 0x30;
  do {
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pTVar9,0x10);
    if (bVar4) {
      *(long *)pTVar9 = *(long *)pTVar9 + -1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  pTVar9 = *(ThreadPool **)(this + 0x40);
joined_r0x008fe424:
  do {
    if (this + 0x38 == pTVar9) {
      std::__ndk1::mutex::unlock((mutex *)(this + 0x50));
      return;
    }
    if ((*(int *)(pTVar9 + 0x28) == 0) && (*(long *)(pTVar9 + 0x38) < tVar6)) {
      if (*(long *)*(thread **)(pTVar9 + 0x10) != 0) {
        std::__ndk1::thread::join(*(thread **)(pTVar9 + 0x10));
        lVar8 = *(long *)pTVar9;
        pTVar2 = *(ThreadPool **)(pTVar9 + 8);
        *(ThreadPool **)(lVar8 + 8) = pTVar2;
        **(long **)(pTVar9 + 8) = lVar8;
        *(long *)(this + 0x48) = *(long *)(this + 0x48) + -1;
        this_00 = *(__shared_weak_count **)(pTVar9 + 0x18);
        if (this_00 != (__shared_weak_count *)0x0) {
          p_Var1 = this_00 + 8;
          do {
            lVar8 = *(long *)p_Var1;
            cVar3 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
            if (bVar4) {
              *(long *)p_Var1 = lVar8 + -1;
              cVar3 = ExclusiveMonitorsStatus();
            }
          } while (cVar3 != '\0');
          if (lVar8 == 0) {
            (**(code **)(*(long *)this_00 + 0x10))(this_00);
            std::__ndk1::__shared_weak_count::__release_weak(this_00);
          }
        }
        operator_delete(pTVar9);
        pTVar9 = pTVar2;
        goto joined_r0x008fe424;
      }
    }
    else {
                    /* try { // try from 008fe4b0 to 008fe4b7 has its CatchHandler @ 008fe4f8 */
      iVar5 = pthread_equal(*(pthread_t *)(pTVar9 + 0x20),param_2);
      if (iVar5 != 0) {
        *(undefined4 *)(pTVar9 + 0x28) = 0;
        tVar7 = time((time_t *)0x0);
        *(time_t *)(pTVar9 + 0x38) = tVar7;
      }
    }
    pTVar9 = *(ThreadPool **)(pTVar9 + 8);
  } while( true );
}

