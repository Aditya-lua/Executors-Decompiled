
void FUN_0064e0b0(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  param_1[-1] = &UNK_00a08ee8;
  *param_1 = &UNK_00a09030;
  func_0x00621dd4(param_1 + 10);
  param_1[8] = &UNK_00a098c0;
  if ((long *)param_1[9] != (long *)0x0) {
    (**(code **)(*(long *)param_1[9] + 8))();
  }
  param_1[-1] = &UNK_00a09150;
  *param_1 = &UNK_00a09280;
  param_1[2] = &UNK_009f5d60;
  lVar1 = param_1[6];
  uVar2 = param_1[4];
  if ((ulong)param_1[5] <= (ulong)param_1[4]) {
    uVar2 = param_1[5];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

