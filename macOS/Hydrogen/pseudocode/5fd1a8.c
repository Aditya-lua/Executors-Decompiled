
void FUN_005fd1a8(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x28;
  undefined8 in_stack_00000018;
  
  if (in_stack_00000018._4_4_ != 0x40) {
    uVar1 = 0;
    do {
      uVar2 = *(ulong *)(unaff_x20 + -8 + unaff_x19 * 8);
      uVar3 = uVar2 >> (unaff_x28 & 0x3f) | uVar1;
      uVar1 = uVar2 << ((ulong)in_stack_00000018._4_4_ & 0x3f);
      *(ulong *)(unaff_x20 + -8 + unaff_x19 * 8) = uVar3;
      unaff_x19 = unaff_x19 + -1;
    } while (unaff_x19 != 0);
  }
  return;
}

