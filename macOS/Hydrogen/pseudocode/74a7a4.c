
void FUN_0074a7a4(void)

{
  ulong *puVar1;
  char in_NG;
  char in_OV;
  ulong uVar2;
  ulong uVar3;
  long unaff_x22;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000030;
  
  if ((in_NG == in_OV) && (0 < iRam0000000000a2b570)) {
    func_0x0073cfbc();
  }
  *(undefined1 *)(unaff_x22 + 0x4f6) = 0;
  uVar2 = (ulong)in_stack_00000030._4_4_;
  if (in_stack_00000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
  auVar4 = ___stack_chk_fail();
  puVar1 = (ulong *)(auVar4._0_8_ + 0xa1a);
  uVar3 = *puVar1;
  *puVar1 = uVar3 | 0x8000000;
  func_0x007738a0(auVar4._0_8_,4,auVar4._8_8_,uVar2);
  *puVar1 = *puVar1 & 0xfffffffff0000000 | *puVar1 & 0x7ffffff | uVar3 & 0x8000000;
  return;
}

