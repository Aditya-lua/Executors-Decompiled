/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed48c
 */

/* cpr::Session::SetProgressCallback(cpr::ProgressCallback const&) */

void __thiscall cpr::Session::SetProgressCallback(Session *this,ProgressCallback *param_1)

{
  long lVar1;
  ProgressCallback *pPVar2;
  code *pcVar3;
  function<bool(long,long,long,long,long)> afStack_80 [32];
  long *local_60;
  long local_48;
  
  local_60 = (long *)afStack_80;
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *(undefined8 *)(this + 0x1a0) = *(undefined8 *)param_1;
  pPVar2 = *(ProgressCallback **)(param_1 + 0x30);
  if (pPVar2 == (ProgressCallback *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_1 + 0x10 == pPVar2) {
    (**(code **)(*(long *)pPVar2 + 0x18))(pPVar2,afStack_80);
  }
  else {
    local_60 = (long *)(**(code **)(*(long *)pPVar2 + 0x10))();
  }
  std::__ndk1::function<bool(long,long,long,long,long)>::swap(afStack_80,(function *)(this + 0x1b0))
  ;
  if (afStack_80 == (function<bool(long,long,long,long,long)> *)local_60) {
    pcVar3 = *(code **)(*local_60 + 0x20);
  }
  else {
    if (local_60 == (long *)0x0) goto LAB_008ed544;
    pcVar3 = *(code **)(*local_60 + 0x28);
  }
  (*pcVar3)();
LAB_008ed544:
  if (this[0x2a9] == (Session)0x0) {
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4efb,
                     util::progressUserFunction<cpr::ProgressCallback>);
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2749,(ProgressCallback *)(this + 0x1a0));
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2b,0);
  }
  else {
    CancellationCallback::SetProgressCallback
              ((CancellationCallback *)(this + 0x220),(ProgressCallback *)(this + 0x1a0));
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

