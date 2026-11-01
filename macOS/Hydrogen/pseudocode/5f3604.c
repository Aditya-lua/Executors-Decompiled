
void FUN_005f3604(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  param_1[-1] = &UNK_009f5890;
  *param_1 = &UNK_009f5a40;
  lVar1 = param_1[0x14];
  uVar2 = param_1[0x12];
  if ((ulong)param_1[0x13] <= (ulong)param_1[0x12]) {
    uVar2 = param_1[0x13];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x006989cc(param_1 + 8);
  param_1[-1] = &UNK_00a0c238;
  *param_1 = &UNK_00a0c3e0;
  if ((long *)param_1[2] != (long *)0x0) {
    (**(code **)(*(long *)param_1[2] + 8))();
  }
  return;
}

