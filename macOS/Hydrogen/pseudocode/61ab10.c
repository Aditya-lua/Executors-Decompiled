
void FUN_0061ab10(ulong param_1,int param_2)

{
  ulong uVar1;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x23;
  ulong unaff_x26;
  
  uVar1 = 0;
  if (unaff_x26 != 0) {
    uVar1 = in_x9 / unaff_x26;
  }
  uVar1 = uVar1 * unaff_x26;
  if (param_2 == 1) {
    uVar1 = in_x9 & param_1;
  }
  (**(code **)(*unaff_x23 + 0x30))();
  func_0x00685528();
  *(ulong *)(unaff_x20 + 0x38) = uVar1 - unaff_x19;
  return;
}

