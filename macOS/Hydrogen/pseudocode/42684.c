
undefined8 * FUN_00042684(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_00a13298;
  param_1[1] = &UNK_00a13378;
  lVar1 = param_1[0xe];
  uVar2 = param_1[0xc];
  if ((ulong)param_1[0xd] <= (ulong)param_1[0xc]) {
    uVar2 = param_1[0xd];
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
  func_0x00041f4c(param_1);
  param_1[0xf] = &UNK_00a15670;
  param_1[0x10] = &UNK_00a15720;
  lVar1 = param_1[0x19];
  uVar2 = param_1[0x17];
  if ((ulong)param_1[0x18] <= (ulong)param_1[0x17]) {
    uVar2 = param_1[0x18];
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
  lVar1 = param_1[0x15];
  uVar2 = param_1[0x13];
  if ((ulong)param_1[0x14] <= (ulong)param_1[0x13]) {
    uVar2 = param_1[0x14];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined4 *)(lVar1 + -4 + uVar2 * 4) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return param_1;
}

