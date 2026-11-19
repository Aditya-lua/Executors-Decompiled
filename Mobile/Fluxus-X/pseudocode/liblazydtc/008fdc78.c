/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fdc78
 */

/* cpr::ThreadPool::~ThreadPool() */

void __thiscall cpr::ThreadPool::~ThreadPool(ThreadPool *this)

{
  __shared_weak_count *p_Var1;
  undefined8 *puVar2;
  ThreadPool *pTVar3;
  char cVar4;
  bool bVar5;
  void *pvVar6;
  long lVar7;
  long lVar8;
  __shared_weak_count *this_00;
  undefined8 *puVar10;
  undefined8 *puVar9;
  ThreadPool *pTVar11;
  
  *(undefined ***)this = &PTR__ThreadPool_00c4f108;
                    /* try { // try from 008fdc9c to 008fdc9f has its CatchHandler @ 008fdda0 */
  Stop(this);
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(this + 0xd0));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0xa8));
  std::__ndk1::
  __deque_base<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
  ::clear((__deque_base<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
           *)(this + 0x78));
  puVar2 = *(undefined8 **)(this + 0x88);
  puVar9 = *(undefined8 **)(this + 0x80);
  if (*(undefined8 **)(this + 0x80) != puVar2) {
    do {
      puVar10 = puVar9 + 1;
      operator_delete((void *)*puVar9);
      puVar9 = puVar10;
    } while (puVar2 != puVar10);
    lVar7 = *(long *)(this + 0x88);
    if (lVar7 != *(long *)(this + 0x80)) {
      *(ulong *)(this + 0x88) =
           lVar7 + (~((lVar7 + -8) - *(long *)(this + 0x80)) & 0xfffffffffffffff8U);
    }
  }
  pvVar6 = *(void **)(this + 0x78);
  if (pvVar6 != (void *)0x0) {
    operator_delete(pvVar6);
  }
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x50));
  if (*(long *)(this + 0x48) != 0) {
    lVar7 = *(long *)(this + 0x38);
    pTVar3 = *(ThreadPool **)(this + 0x40);
    lVar8 = *(long *)pTVar3;
    *(undefined8 *)(lVar8 + 8) = *(undefined8 *)(lVar7 + 8);
    **(long **)(lVar7 + 8) = lVar8;
    *(undefined8 *)(this + 0x48) = 0;
    while (pTVar3 != this + 0x38) {
      this_00 = *(__shared_weak_count **)(pTVar3 + 0x18);
      pTVar11 = *(ThreadPool **)(pTVar3 + 8);
      if (this_00 != (__shared_weak_count *)0x0) {
        p_Var1 = this_00 + 8;
        do {
          lVar7 = *(long *)p_Var1;
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar5) {
            *(long *)p_Var1 = lVar7 + -1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
        if (lVar7 == 0) {
          (**(code **)(*(long *)this_00 + 0x10))(this_00);
          std::__ndk1::__shared_weak_count::__release_weak(this_00);
        }
      }
      operator_delete(pTVar3);
      pTVar3 = pTVar11;
    }
  }
  return;
}

