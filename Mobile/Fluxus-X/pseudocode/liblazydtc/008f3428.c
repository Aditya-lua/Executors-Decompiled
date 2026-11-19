/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3428
 */

/* cpr::Session::SetCancellationParam(std::__ndk1::shared_ptr<std::__ndk1::atomic<bool> >) */

void __thiscall cpr::Session::SetCancellationParam(Session *this,undefined8 *param_2)

{
  __shared_weak_count *p_Var1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  bool bVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  __shared_weak_count *this_00;
  undefined4 local_40;
  undefined2 local_3c;
  Session local_3a;
  
  lVar6 = tpidr_el0;
  lVar7 = *(long *)(lVar6 + 0x28);
  uVar2 = *param_2;
  uVar3 = param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  this_00 = *(__shared_weak_count **)(this + 0x228);
  *(undefined8 *)(this + 0x220) = uVar2;
  *(undefined8 *)(this + 0x228) = uVar3;
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      lVar8 = *(long *)p_Var1;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar5) {
        *(long *)p_Var1 = lVar8 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  this[0x230] = (Session)0x0;
  this[0x237] = local_3a;
  *(undefined2 *)(this + 0x235) = local_3c;
  *(undefined4 *)(this + 0x231) = local_40;
  this[0x238] = (Session)0x0;
  this[0x2a9] = (Session)0x1;
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4efb,
                   util::progressUserFunction<cpr::CancellationCallback>);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2749,this + 0x220);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2b,0);
  if (*(long *)(lVar6 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

