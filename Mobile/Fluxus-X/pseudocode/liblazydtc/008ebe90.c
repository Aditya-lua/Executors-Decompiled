/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ebe90
 */

/* cpr::Session::intercept() */

void cpr::Session::intercept(void)

{
  undefined8 *puVar1;
  __shared_weak_count *p_Var2;
  long *plVar3;
  __shared_weak_count *this;
  char cVar4;
  bool bVar5;
  long in_x0;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  __shared_weak_count *p_Var9;
  
  uVar8 = *(ulong *)(in_x0 + 0x298);
  plVar6 = (long *)(*(long *)(in_x0 + 0x280) + (uVar8 >> 5 & 0x7fffffffffffff8));
  puVar1 = (undefined8 *)(*plVar6 + (uVar8 & 0xff) * 0x10);
  plVar3 = (long *)*puVar1;
  this = (__shared_weak_count *)puVar1[1];
  if (this != (__shared_weak_count *)0x0) {
    p_Var9 = this + 8;
    do {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var9,0x10);
      if (bVar5) {
        *(long *)p_Var9 = *(long *)p_Var9 + 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    uVar8 = *(ulong *)(in_x0 + 0x298);
    plVar6 = (long *)(*(long *)(in_x0 + 0x280) + (uVar8 >> 5 & 0x7fffffffffffff8));
  }
  p_Var9 = *(__shared_weak_count **)(*plVar6 + (uVar8 & 0xff) * 0x10 + 8);
  if (p_Var9 != (__shared_weak_count *)0x0) {
    p_Var2 = p_Var9 + 8;
    do {
      lVar7 = *(long *)p_Var2;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar5) {
        *(long *)p_Var2 = lVar7 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar7 == 0) {
      (**(code **)(*(long *)p_Var9 + 0x10))(p_Var9);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var9);
    }
  }
  uVar8 = *(ulong *)(in_x0 + 0x298) + 1;
  *(long *)(in_x0 + 0x2a0) = *(long *)(in_x0 + 0x2a0) + -1;
  *(ulong *)(in_x0 + 0x298) = uVar8;
  if (0x1ff < uVar8) {
    operator_delete((void *)**(undefined8 **)(in_x0 + 0x280));
    *(long *)(in_x0 + 0x280) = *(long *)(in_x0 + 0x280) + 8;
    *(long *)(in_x0 + 0x298) = *(long *)(in_x0 + 0x298) + -0x100;
  }
                    /* try { // try from 008ebf94 to 008ebfa3 has its CatchHandler @ 008ebffc */
  (**(code **)(*plVar3 + 0x10))(plVar3);
  if (this != (__shared_weak_count *)0x0) {
    p_Var9 = this + 8;
    do {
      lVar7 = *(long *)p_Var9;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var9,0x10);
      if (bVar5) {
        *(long *)p_Var9 = lVar7 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar7 == 0) {
      (**(code **)(*(long *)this + 0x10))(this);
      std::__ndk1::__shared_weak_count::__release_weak(this);
      return;
    }
  }
  return;
}

