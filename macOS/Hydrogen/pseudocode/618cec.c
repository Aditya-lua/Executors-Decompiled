
void FUN_00618cec(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  param_1[-1] = &UNK_009f7f30;
  *param_1 = &UNK_009f80e0;
  lVar1 = param_1[0xc];
  uVar2 = param_1[10];
  if ((ulong)param_1[0xb] <= (ulong)param_1[10]) {
    uVar2 = param_1[0xb];
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
  param_1[-1] = &UNK_00a0c238;
  *param_1 = &UNK_00a0c3e0;
  if ((long *)param_1[2] != (long *)0x0) {
    (**(code **)(*(long *)param_1[2] + 8))();
  }
  return;
}

