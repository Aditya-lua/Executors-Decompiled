
undefined8 * FUN_00616ae8(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_00a0c668;
  param_1[1] = &UNK_00a0c878;
  if ((long *)param_1[0x12] != (long *)0x0) {
    (**(code **)(*(long *)param_1[0x12] + 8))();
  }
  *param_1 = &UNK_00a0c410;
  param_1[1] = &UNK_00a0c620;
  lVar1 = param_1[0xd];
  uVar2 = param_1[0xb];
  if ((ulong)param_1[0xc] <= (ulong)param_1[0xb]) {
    uVar2 = param_1[0xc];
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
  *param_1 = &UNK_00a0c238;
  param_1[1] = &UNK_00a0c3e0;
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
  return param_1;
}

