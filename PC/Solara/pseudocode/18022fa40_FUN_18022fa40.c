/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_18022fa40(longlong param_1)

{
  undefined1 auStack_48 [32];
  undefined8 uStack_28;
  undefined8 uStack_20;
  ulonglong uStack_18;
  
  uStack_18 = _DAT_1810c1700 ^ (ulonglong)auStack_48;
  uStack_28 = *(undefined8 *)(param_1 + 0x10);
  uStack_20 = *(undefined8 *)(param_1 + 8);
  WaitForMultipleObjects(2,&uStack_28,0,0xffffffff);
  CloseHandle(*(undefined8 *)(param_1 + 0x10));
  LOCK();
  UNLOCK();
  if (_DAT_1810cea20 == 0) {
    QueueUserAPC(_guard_check_icall,*(undefined8 *)(param_1 + 8),0);
    WaitForSingleObject(*(undefined8 *)(param_1 + 8),0xffffffff);
    FUN_180e155e0(uStack_18 ^ (ulonglong)auStack_48);
    return;
  }
  TerminateThread(*(undefined8 *)(param_1 + 8),0);
  FUN_180e155e0(uStack_18 ^ (ulonglong)auStack_48);
  return;
}

