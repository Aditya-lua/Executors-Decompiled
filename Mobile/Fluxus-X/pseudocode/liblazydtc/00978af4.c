/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978af4
 */

/* std::__ndk1::__deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> > > >::clear() */

void __thiscall
std::__ndk1::
__deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
::clear(__deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
        *this)

{
  __shared_weak_count *p_Var1;
  long lVar2;
  char cVar3;
  bool bVar4;
  long *plVar5;
  code *pcVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  ulong uVar11;
  __shared_weak_count *this_00;
  long *plVar12;
  long lVar13;
  
  puVar7 = *(undefined8 **)(this + 8);
  puVar10 = *(undefined8 **)(this + 0x10);
  if (puVar10 != puVar7) {
    uVar11 = *(ulong *)(this + 0x20);
    plVar12 = (long *)((long)puVar7 + (uVar11 >> 3 & 0x1ffffffffffffff8));
    lVar13 = *plVar12 + (uVar11 & 0x3f) * 0x40;
    lVar2 = *(long *)((long)puVar7 + (*(long *)(this + 0x28) + uVar11 >> 3 & 0x1ffffffffffffff8)) +
            (*(long *)(this + 0x28) + uVar11 & 0x3f) * 0x40;
    if (lVar2 != lVar13) {
      do {
        plVar5 = *(long **)(lVar13 + 0x30);
        if ((long *)(lVar13 + 0x10) == plVar5) {
          pcVar6 = *(code **)(*plVar5 + 0x20);
LAB_00978b84:
          (*pcVar6)();
        }
        else if (plVar5 != (long *)0x0) {
          pcVar6 = *(code **)(*plVar5 + 0x28);
          goto LAB_00978b84;
        }
        this_00 = *(__shared_weak_count **)(lVar13 + 8);
        if (this_00 != (__shared_weak_count *)0x0) {
          p_Var1 = this_00 + 8;
          do {
            lVar9 = *(long *)p_Var1;
            cVar3 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
            if (bVar4) {
              *(long *)p_Var1 = lVar9 + -1;
              cVar3 = ExclusiveMonitorsStatus();
            }
          } while (cVar3 != '\0');
          if (lVar9 == 0) {
            (**(code **)(*(long *)this_00 + 0x10))(this_00);
            __shared_weak_count::__release_weak(this_00);
          }
        }
        lVar13 = lVar13 + 0x40;
        if (lVar13 - *plVar12 == 0x1000) {
          plVar12 = plVar12 + 1;
          lVar13 = *plVar12;
        }
      } while (lVar2 != lVar13);
      puVar7 = *(undefined8 **)(this + 8);
      puVar10 = *(undefined8 **)(this + 0x10);
    }
  }
  *(undefined8 *)(this + 0x28) = 0;
  lVar13 = (long)puVar10 - (long)puVar7;
  while (uVar11 = lVar13 >> 3, 2 < uVar11) {
    operator_delete((void *)*puVar7);
    puVar7 = (undefined8 *)(*(long *)(this + 8) + 8);
    *(undefined8 **)(this + 8) = puVar7;
    lVar13 = *(long *)(this + 0x10) - (long)puVar7;
  }
  if (uVar11 == 1) {
    uVar8 = 0x20;
  }
  else {
    if (uVar11 != 2) {
      return;
    }
    uVar8 = 0x40;
  }
  *(undefined8 *)(this + 0x20) = uVar8;
  return;
}

