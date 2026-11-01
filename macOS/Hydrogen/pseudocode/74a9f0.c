
undefined8 FUN_0074a9f0(void)

{
  ulong *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x19;
  ulong uVar4;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000030;
  
  uVar2 = func_0x00794ee8();
  *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
       *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
  func_0x007706e4();
  func_0x00768170();
  uVar3 = (ulong)in_stack_00000030._4_4_;
  if (in_stack_00000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar2;
  }
  auVar5 = ___stack_chk_fail();
  puVar1 = (ulong *)(auVar5._0_8_ + 0xa1a);
  uVar4 = *puVar1;
  *puVar1 = uVar4 | 0x8000000;
  uVar2 = func_0x007738a0(auVar5._0_8_,4,auVar5._8_8_,uVar3);
  *puVar1 = *puVar1 & 0xfffffffff0000000 | *puVar1 & 0x7ffffff | uVar4 & 0x8000000;
  return uVar2;
}

