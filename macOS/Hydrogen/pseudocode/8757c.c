
undefined8 * FUN_0008757c(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_009f5d60;
  lVar1 = param_1[4];
  uVar2 = param_1[2];
  if ((ulong)param_1[3] <= (ulong)param_1[2]) {
    uVar2 = param_1[3];
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
  return param_1;
}

