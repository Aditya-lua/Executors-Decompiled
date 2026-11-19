/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f860
 */

/* ix::WebSocket::resetTrafficTrackerCallback() */

void ix::WebSocket::resetTrafficTrackerCallback(void)

{
  long lVar1;
  code *pcVar2;
  function<void(unsigned_long,bool)> afStack_60 [32];
  long *local_40;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_40 = (long *)0x0;
  std::__ndk1::function<void(unsigned_long,bool)>::swap
            (afStack_60,(function *)_onTrafficTrackerCallback);
  if (afStack_60 == (function<void(unsigned_long,bool)> *)local_40) {
    pcVar2 = *(code **)(*local_40 + 0x20);
  }
  else {
    if (local_40 == (long *)0x0) goto LAB_0098f8bc;
    pcVar2 = *(code **)(*local_40 + 0x28);
  }
  (*pcVar2)();
LAB_0098f8bc:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

