
undefined8 * FUN_0065556c(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_00a0bf68;
  param_1[1] = &UNK_00a0c028;
  param_1[0xb] = &UNK_00a09a70;
  lVar1 = param_1[0x13];
  uVar2 = param_1[0x11];
  if ((ulong)param_1[0x12] <= (ulong)param_1[0x11]) {
    uVar2 = param_1[0x12];
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
  lVar1 = param_1[0xf];
  uVar2 = param_1[0xd];
  if ((ulong)param_1[0xe] <= (ulong)param_1[0xd]) {
    uVar2 = param_1[0xe];
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
  lVar1 = param_1[10];
  uVar2 = param_1[8];
  if ((ulong)param_1[9] <= (ulong)param_1[8]) {
    uVar2 = param_1[9];
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
  if ((long *)param_1[2] != (long *)0x0) {
    (**(code **)(*(long *)param_1[2] + 8))();
  }
  return param_1;
}

