
void FUN_00618f30(long param_1)

{
  ulong uVar1;
  undefined8 *unaff_x19;
  
  uVar1 = unaff_x19[9];
  if ((ulong)unaff_x19[10] <= (ulong)unaff_x19[9]) {
    uVar1 = unaff_x19[10];
  }
  if (param_1 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(param_1 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  unaff_x19[-1] = &UNK_00a0c238;
  *unaff_x19 = &UNK_00a0c3e0;
  if ((long *)unaff_x19[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[2] + 8))();
  }
  return;
}

