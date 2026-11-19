/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe234
 */

/* cpr::ThreadPool::AddThread(std::__ndk1::thread*) */

void __thiscall cpr::ThreadPool::AddThread(ThreadPool *this,thread *param_1)

{
  ThreadPool *pTVar1;
  char cVar2;
  bool bVar3;
  __shared_weak_count *this_00;
  time_t tVar4;
  long *plVar5;
  __shared_weak_count *p_Var6;
  long lVar7;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x50));
  pTVar1 = this + 0x28;
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(pTVar1,0x10);
    if (bVar3) {
      *(long *)pTVar1 = *(long *)pTVar1 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
                    /* try { // try from 008fe274 to 008fe27b has its CatchHandler @ 008fe360 */
  this_00 = operator_new(0x20);
  *(undefined8 *)(this_00 + 0x10) = 0;
  p_Var6 = this_00 + 8;
  *(long *)p_Var6 = 0;
  *(thread **)(this_00 + 0x18) = param_1;
  *(undefined ***)this_00 = &PTR____shared_weak_count_00c4f138;
  lVar7 = *(long *)param_1;
                    /* try { // try from 008fe2a4 to 008fe2b7 has its CatchHandler @ 008fe380 */
  tVar4 = time((time_t *)0x0);
  plVar5 = operator_new(0x40);
  plVar5[2] = (long)param_1;
  plVar5[3] = (long)this_00;
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var6,0x10);
    if (bVar3) {
      *(long *)p_Var6 = *(long *)p_Var6 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  plVar5[4] = lVar7;
  plVar5[6] = tVar4;
  plVar5[7] = 0;
  plVar5[1] = (long)(this + 0x38);
  *(undefined4 *)(plVar5 + 5) = 1;
  lVar7 = *(long *)(this + 0x38);
  *plVar5 = lVar7;
  *(long **)(lVar7 + 8) = plVar5;
  *(long **)(this + 0x38) = plVar5;
  *(long *)(this + 0x48) = *(long *)(this + 0x48) + 1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x50));
  do {
    lVar7 = *(long *)p_Var6;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var6,0x10);
    if (bVar3) {
      *(long *)p_Var6 = lVar7 + -1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (lVar7 == 0) {
    (**(code **)(*(long *)this_00 + 0x10))(this_00);
    std::__ndk1::__shared_weak_count::__release_weak(this_00);
    return;
  }
  return;
}

