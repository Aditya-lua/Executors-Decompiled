/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2b74
 */

/* cpr::Session::AddInterceptor(std::__ndk1::shared_ptr<cpr::Interceptor> const&) */

void __thiscall cpr::Session::AddInterceptor(Session *this,shared_ptr *param_1)

{
  long *plVar1;
  ulong uVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  
  lVar8 = *(long *)(this + 0x288);
  lVar6 = *(long *)(this + 0x280);
  lVar5 = *(long *)(this + 0x2a0);
  uVar2 = 0;
  if (lVar8 - lVar6 != 0) {
    uVar2 = (lVar8 - lVar6) * 0x20 - 1;
  }
  uVar9 = lVar5 + *(long *)(this + 0x298);
  if (uVar2 == uVar9) {
    std::__ndk1::
    deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
    ::__add_back_capacity
              ((deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
                *)(this + 0x278));
    lVar5 = *(long *)(this + 0x2a0);
    lVar6 = *(long *)(this + 0x280);
    lVar8 = *(long *)(this + 0x288);
    uVar9 = *(long *)(this + 0x298) + lVar5;
  }
  if (lVar8 == lVar6) {
    puVar7 = (undefined8 *)0x0;
  }
  else {
    puVar7 = (undefined8 *)
             (*(long *)(lVar6 + (uVar9 >> 5 & 0x7fffffffffffff8)) + (uVar9 & 0xff) * 0x10);
  }
  *puVar7 = *(undefined8 *)param_1;
  lVar6 = *(long *)(param_1 + 8);
  puVar7[1] = lVar6;
  if (lVar6 != 0) {
    plVar1 = (long *)(lVar6 + 8);
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar4) {
        *plVar1 = *plVar1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    lVar5 = *(long *)(this + 0x2a0);
  }
  *(long *)(this + 0x2a0) = lVar5 + 1;
  return;
}

