
long * FUN_00633a7c(long *param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  
  lVar1 = *param_2;
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[9];
  param_1[0x28] = (long)&UNK_009f5d60;
  lVar1 = param_1[0x2c];
  uVar2 = param_1[0x2a];
  if ((ulong)param_1[0x2b] <= (ulong)param_1[0x2a]) {
    uVar2 = param_1[0x2b];
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
  param_1[0x22] = (long)&UNK_009f5d60;
  lVar1 = param_1[0x26];
  uVar2 = param_1[0x24];
  if ((ulong)param_1[0x25] <= (ulong)param_1[0x24]) {
    uVar2 = param_1[0x25];
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
  param_1[0x1e] = (long)&UNK_009f6678;
  if (param_1[0x1f] != 0) {
    param_1[0x20] = param_1[0x1f];
    __ZdlPv();
  }
  lVar1 = param_2[1];
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[8];
  func_0x00631cc8(param_1 + 5);
  param_1[2] = (long)&UNK_00a09aa0;
  if ((long *)param_1[4] != (long *)0x0) {
    (**(code **)(*(long *)param_1[4] + 8))();
  }
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
  return param_1;
}

