
undefined8 * FUN_006475c8(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_009f9068;
  param_1[1] = &UNK_009f91b8;
  param_1[7] = &UNK_009f9250;
  param_1[0xc] = &UNK_009f92d0;
  lVar1 = param_1[0x10];
  uVar2 = param_1[0xe];
  if ((ulong)param_1[0xf] <= (ulong)param_1[0xe]) {
    uVar2 = param_1[0xf];
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
  *param_1 = &UNK_00a12e98;
  param_1[1] = &UNK_00a12fa0;
  param_1[7] = &UNK_00a13038;
  lVar1 = param_1[0xb];
  uVar2 = param_1[9];
  if ((ulong)param_1[10] <= (ulong)param_1[9]) {
    uVar2 = param_1[10];
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

