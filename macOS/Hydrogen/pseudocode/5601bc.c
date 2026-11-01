
void FUN_005601bc(long param_1)

{
  ulong uVar1;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  
  uVar1 = unaff_x22;
  if (*(long *)(param_1 + 0x18) != 0) {
    uVar1 = unaff_x22 + 1 >> 1;
  }
  if (*(ulong *)(param_1 + 0x10) < uVar1) {
    func_0x007acc40();
  }
  if (unaff_x21 != unaff_x23) {
    do {
      func_0x005629c4();
      unaff_x22 = unaff_x22 - 1;
    } while (unaff_x22 != 0);
  }
  return;
}

