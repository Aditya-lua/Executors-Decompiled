
void FUN_005d710c(void)

{
  ulong uVar1;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  
  func_0x007b05dc();
  if (unaff_x25 == unaff_x23) {
    return;
  }
  uVar1 = *(long *)(unaff_x25 + 0x18) - 0xc;
  if (0x14 < uVar1) {
    uVar1 = unaff_x24;
  }
                    /* WARNING: Could not recover jumptable at 0x005d6c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_005d6c88 + (ulong)*(byte *)(unaff_x26 + uVar1) * 4))();
  return;
}

