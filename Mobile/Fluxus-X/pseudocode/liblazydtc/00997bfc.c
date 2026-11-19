/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997bfc
 */

/* ix::WebSocketTransport::sendPing(ix::IXWebSocketSendData const&) */

void ix::WebSocketTransport::sendPing(IXWebSocketSendData *param_1)

{
  long lVar1;
  undefined8 uVar2;
  char *in_x8;
  code *pcVar3;
  long alStack_70 [4];
  long *local_50;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_50 = (long *)0x0;
                    /* try { // try from 00997c2c to 00997c43 has its CatchHandler @ 00997cb8 */
  sendData(param_1,9);
  if (alStack_70 == local_50) {
    pcVar3 = *(code **)(*local_50 + 0x20);
  }
  else {
    if (local_50 == (long *)0x0) goto LAB_00997c6c;
    pcVar3 = *(code **)(*local_50 + 0x28);
  }
  (*pcVar3)();
LAB_00997c6c:
  if (*in_x8 != '\0') {
    std::__ndk1::mutex::lock((mutex *)(param_1 + 0x2b0));
    uVar2 = std::__ndk1::chrono::steady_clock::now();
    *(undefined8 *)(param_1 + 0x2d8) = uVar2;
    std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x2b0));
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

