/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f354c
 */

/* std::__ndk1::__deque_base<std::__ndk1::shared_ptr<cpr::Interceptor>,
   std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor> > >::clear() */

void __thiscall
std::__ndk1::
__deque_base<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
::clear(__deque_base<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
        *this)

{
  long lVar1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  __shared_weak_count *this_00;
  long *plVar10;
  long lVar11;
  
  puVar5 = *(undefined8 **)(this + 8);
  puVar8 = *(undefined8 **)(this + 0x10);
  if (puVar8 != puVar5) {
    uVar9 = *(ulong *)(this + 0x20);
    plVar10 = (long *)((long)puVar5 + (uVar9 >> 5 & 0x7fffffffffffff8));
    lVar11 = *plVar10 + (uVar9 & 0xff) * 0x10;
    lVar1 = *(long *)((long)puVar5 + (*(long *)(this + 0x28) + uVar9 >> 5 & 0x7fffffffffffff8)) +
            (*(long *)(this + 0x28) + uVar9 & 0xff) * 0x10;
    if (lVar1 != lVar11) {
      do {
        this_00 = *(__shared_weak_count **)(lVar11 + 8);
        if (this_00 != (__shared_weak_count *)0x0) {
          p_Var2 = this_00 + 8;
          do {
            lVar7 = *(long *)p_Var2;
            cVar3 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
            if (bVar4) {
              *(long *)p_Var2 = lVar7 + -1;
              cVar3 = ExclusiveMonitorsStatus();
            }
          } while (cVar3 != '\0');
          if (lVar7 == 0) {
            (**(code **)(*(long *)this_00 + 0x10))(this_00);
            __shared_weak_count::__release_weak(this_00);
          }
        }
        lVar11 = lVar11 + 0x10;
        if (lVar11 - *plVar10 == 0x1000) {
          plVar10 = plVar10 + 1;
          lVar11 = *plVar10;
        }
      } while (lVar1 != lVar11);
      puVar5 = *(undefined8 **)(this + 8);
      puVar8 = *(undefined8 **)(this + 0x10);
    }
  }
  *(undefined8 *)(this + 0x28) = 0;
  lVar11 = (long)puVar8 - (long)puVar5;
  while (uVar9 = lVar11 >> 3, 2 < uVar9) {
    operator_delete((void *)*puVar5);
    puVar5 = (undefined8 *)(*(long *)(this + 8) + 8);
    *(undefined8 **)(this + 8) = puVar5;
    lVar11 = *(long *)(this + 0x10) - (long)puVar5;
  }
  if (uVar9 == 1) {
    uVar6 = 0x80;
  }
  else {
    if (uVar9 != 2) {
      return;
    }
    uVar6 = 0x100;
  }
  *(undefined8 *)(this + 0x20) = uVar6;
  return;
}

