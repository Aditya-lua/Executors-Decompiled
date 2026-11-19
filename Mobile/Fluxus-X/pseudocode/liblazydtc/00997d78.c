/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997d78
 */

/* ix::WebSocketTransport::poll() */

void __thiscall ix::WebSocketTransport::poll(WebSocketTransport *this)

{
  undefined1 auVar1 [16];
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  int iVar7;
  long lVar8;
  undefined1 auStack_60 [24];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if ((*(int *)(this + 0xe0) == 3) && (0 < *(int *)(this + 0x27c))) {
    std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
    lVar4 = std::__ndk1::chrono::steady_clock::now();
    lVar8 = *(long *)(this + 0x2d8);
    iVar7 = *(int *)(this + 0x27c);
    std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
    if ((long)iVar7 * 1000000000 < lVar4 - lVar8) {
      iVar7 = *(int *)(this + 0x2a0);
      if (iVar7 == 2) {
        if (((byte)this[0x280] & 1) == 0) {
          close(this,0x3f3,(basic_string_conflict *)&WebSocketCloseConstants::kPingTimeoutMessage,0,
                false);
          goto LAB_00997e44;
        }
        iVar7 = *(int *)(this + 0x2a0);
      }
      sendHeartBeat(auStack_60,this,iVar7);
    }
  }
LAB_00997e44:
  iVar7 = *(int *)(this + 0x27c);
  if (*(int *)(this + 0xe0) != 3) {
    iVar7 = 0;
  }
  if (0 < *(int *)(this + 0x27c)) {
    lVar4 = std::__ndk1::chrono::steady_clock::now();
    auVar1 = SEXT816(lVar4 - *(long *)(this + 0x2d8)) * SEXT816(0x431bde82d7b634db);
    iVar7 = *(int *)(this + 0x27c) * 1000 - ((int)(auVar1._8_8_ >> 0x12) - (auVar1._12_4_ >> 0x1f));
  }
  if ((iVar7 < 1) &&
     (uVar5 = Socket::isWakeUpFromPollSupported(*(Socket **)(this + 0xb0)), (uVar5 & 1) == 0)) {
    iVar7 = 0x14;
  }
  if (((byte)this[0x240] & 1) != 0) {
    iVar7 = 100;
  }
  uVar3 = Socket::isReadyToRead(*(Socket **)(this + 0xb0),iVar7);
  switch(uVar3) {
  case 0:
    uVar5 = receiveFromSocket(this);
    if ((uVar5 & 1) == 0) {
      uVar6 = 1;
      goto LAB_00997fdc;
    }
    break;
  case 3:
    std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00997f30 to 00997f33 has its CatchHandler @ 00998010 */
    (**(code **)(**(long **)(this + 0xb0) + 0x20))();
    goto LAB_00997f54;
  case 4:
    uVar5 = flushSendBuffer(this);
    if ((uVar5 & 1) == 0) {
      uVar6 = 2;
      goto LAB_00997fdc;
    }
    break;
  case 5:
    std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00997f50 to 00997f53 has its CatchHandler @ 0099800c */
    (**(code **)(**(long **)(this + 0xb0) + 0x20))();
LAB_00997f54:
    std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
  }
  uVar6 = 0;
  if (*(int *)(this + 0xe0) == 0) {
    std::__ndk1::mutex::lock((mutex *)(this + 0x244));
    lVar4 = std::__ndk1::chrono::steady_clock::now();
    lVar8 = *(long *)(this + 0x270);
    std::__ndk1::mutex::unlock((mutex *)(this + 0x244));
    uVar6 = 0;
    if (300000000 < lVar4 - lVar8) {
      *(undefined8 *)(this + 0x40) = *(undefined8 *)(this + 0x38);
      std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00997fc0 to 00997fc3 has its CatchHandler @ 00998008 */
      (**(code **)(**(long **)(this + 0xb0) + 0x20))();
      std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
      setReadyState(this,1);
      uVar6 = 0;
    }
  }
LAB_00997fdc:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

