undefined8 * FUN_180215ce0(undefined8 *param_1,ulonglong param_2)

{
  longlong lVar1;
  longlong lVar2;
  undefined4 auStack_18 [2];
  undefined8 uStack_10;
  
  *param_1 = &UNK_180f48460;
  if (param_1[0x15] != 0) {
    FUN_180237e60();
    FUN_18022fa40(param_1[0x15]);
    lVar2 = param_1[0x15];
    if (lVar2 != 0) {
      CloseHandle(*(undefined8 *)(lVar2 + 8));
      func_0x000180e15340(lVar2,0x18);
    }
    param_1[0x15] = 0;
  }
  lVar2 = param_1[0x12];
  if (lVar2 != 0) {
    do {
      lVar1 = *(longlong *)(lVar2 + 0x20);
      param_1[0x12] = lVar1;
      if (lVar1 == 0) {
        param_1[0x13] = 0;
      }
      *(undefined8 *)(lVar2 + 0x20) = 0;
      auStack_18[0] = 0;
      uStack_10 = 0x1810bc020;
      (**(code **)(lVar2 + 0x28))(0,lVar2,auStack_18,0);
      lVar2 = param_1[0x12];
    } while (lVar2 != 0);
  }
  DeleteCriticalSection(param_1 + 0xc);
  if (param_1[10] != 0) {
    CloseHandle();
  }
  lVar2 = param_1[9];
  if (lVar2 != 0) {
    CloseHandle(*(undefined8 *)(lVar2 + 8));
    func_0x000180e15340(lVar2,0x18);
  }
  if (param_1[5] != 0) {
    CloseHandle();
  }
  *param_1 = &UNK_180f482e0;
  if ((param_2 & 1) != 0) {
    func_0x000180e15340(param_1,0xb0);
  }
  return param_1;
}

