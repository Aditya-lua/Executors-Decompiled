/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fbbc
 */

/* ix::WebSocket::sendMessage(ix::IXWebSocketSendData const&, ix::SendMessageKind,
   std::__ndk1::function<bool (int, int)> const&) */

void ix::WebSocket::sendMessage
               (undefined2 *param_1_00,WebSocketTransport *param_1,IXWebSocketSendData *param_3,
               int param_4,function *param_5)

{
  long lVar1;
  int iVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined1 local_64 [4];
  undefined4 local_60;
  undefined2 local_5c;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  iVar2 = WebSocketTransport::getReadyState(param_1);
  if (iVar2 != 3) {
    *param_1_00 = 0;
    *(undefined8 *)(param_1_00 + 4) = 0;
    *(undefined8 *)(param_1_00 + 8) = 0;
    goto LAB_0098fcf0;
  }
  std::__ndk1::mutex::lock((mutex *)(param_1 + 0x410));
  if (param_4 == 0) {
                    /* try { // try from 0098fc5c to 0098fc6f has its CatchHandler @ 0098fd20 */
    WebSocketTransport::sendText(param_1,param_3,param_5);
LAB_0098fc70:
    local_60 = local_80._2_4_;
    local_5c = local_80._6_2_;
    uVar5 = local_78;
    uVar6 = uStack_70;
    uVar3 = (undefined1)local_80;
    uVar4 = local_80._1_1_;
  }
  else {
    if (param_4 == 1) {
                    /* try { // try from 0098fc44 to 0098fc57 has its CatchHandler @ 0098fd24 */
      WebSocketTransport::sendBinary(param_1,param_3,param_5);
      goto LAB_0098fc70;
    }
    if (param_4 == 2) {
                    /* try { // try from 0098fc24 to 0098fc33 has its CatchHandler @ 0098fd28 */
      WebSocketTransport::sendPing((IXWebSocketSendData *)param_1);
      goto LAB_0098fc70;
    }
    uVar6 = 0;
    uVar5 = 0;
    uVar4 = 0;
    uVar3 = 0;
  }
  if (_onTrafficTrackerCallback._32_8_ != 0) {
    local_64[0] = 0;
                    /* try { // try from 0098fcc0 to 0098fccb has its CatchHandler @ 0098fd2c */
    local_80 = uVar6;
    (**(code **)(*(long *)_onTrafficTrackerCallback._32_8_ + 0x30))
              (_onTrafficTrackerCallback._32_8_,&local_80,local_64);
  }
  *(undefined1 *)param_1_00 = uVar3;
  *(undefined1 *)((long)param_1_00 + 1) = uVar4;
  param_1_00[3] = local_5c;
  *(undefined4 *)(param_1_00 + 1) = local_60;
  *(undefined8 *)(param_1_00 + 4) = uVar5;
  *(undefined8 *)(param_1_00 + 8) = uVar6;
  std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x410));
LAB_0098fcf0:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

