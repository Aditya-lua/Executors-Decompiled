
undefined8 * FUN_00647d58(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_00a13118;
  param_1[1] = &UNK_00a131e8;
  lVar1 = param_1[10];
  uVar2 = param_1[8];
  if ((ulong)param_1[9] <= (ulong)param_1[8]) {
    uVar2 = param_1[9];
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
  *param_1 = &UNK_00a12ae8;
  param_1[1] = &UNK_00a12b98;
  lVar1 = param_1[6];
  uVar2 = param_1[4];
  if ((ulong)param_1[5] <= (ulong)param_1[4]) {
    uVar2 = param_1[5];
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
  return param_1;
}

