
void FUN_0064e0d8(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  unaff_x19[8] = param_1;
  if ((long *)unaff_x19[9] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[9] + 8))();
  }
  unaff_x19[-1] = &UNK_00a09150;
  *unaff_x19 = &UNK_00a09280;
  unaff_x19[2] = &UNK_009f5d60;
  lVar1 = unaff_x19[6];
  uVar2 = unaff_x19[4];
  if ((ulong)unaff_x19[5] <= (ulong)unaff_x19[4]) {
    uVar2 = unaff_x19[5];
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

