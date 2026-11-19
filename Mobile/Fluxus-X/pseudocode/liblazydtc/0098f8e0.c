/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f8e0
 */

/* ix::WebSocket::invokeTrafficTrackerCallback(unsigned long, bool) */

void ix::WebSocket::invokeTrafficTrackerCallback(ulong param_1,bool param_2)

{
  long lVar1;
  undefined1 local_34 [4];
  ulong local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (_onTrafficTrackerCallback._32_8_ != 0) {
    local_34[0] = param_2;
    local_30 = param_1;
    (**(code **)(*(long *)_onTrafficTrackerCallback._32_8_ + 0x30))
              (_onTrafficTrackerCallback._32_8_,&local_30,local_34);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

