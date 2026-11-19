/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f79c
 */

/* ix::WebSocket::setTrafficTrackerCallback(std::__ndk1::function<void (unsigned long, bool)>
   const&) */

void ix::WebSocket::setTrafficTrackerCallback(function *param_1)

{
  long lVar1;
  function *pfVar2;
  code *pcVar3;
  function<void(unsigned_long,bool)> afStack_60 [32];
  long *local_40;
  long local_28;
  
  local_40 = (long *)afStack_60;
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  pfVar2 = *(function **)(param_1 + 0x20);
  if (pfVar2 == (function *)0x0) {
    local_40 = (long *)0x0;
  }
  else if (param_1 == pfVar2) {
    (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,afStack_60);
  }
  else {
    local_40 = (long *)(**(code **)(*(long *)pfVar2 + 0x10))();
  }
  std::__ndk1::function<void(unsigned_long,bool)>::swap
            (afStack_60,(function *)_onTrafficTrackerCallback);
  if (afStack_60 == (function<void(unsigned_long,bool)> *)local_40) {
    pcVar3 = *(code **)(*local_40 + 0x20);
  }
  else {
    if (local_40 == (long *)0x0) goto LAB_0098f83c;
    pcVar3 = *(code **)(*local_40 + 0x28);
  }
  (*pcVar3)();
LAB_0098f83c:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

