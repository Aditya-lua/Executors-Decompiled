
void FUN_0074a8a0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong *puVar1;
  bool in_ZR;
  ulong uVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  
  if (!in_ZR) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
  auVar3 = ___stack_chk_fail();
  puVar1 = (ulong *)(auVar3._0_8_ + 0xa1a);
  uVar2 = *puVar1;
  *puVar1 = uVar2 | 0x8000000;
  func_0x007738a0(auVar3._0_8_,4,auVar3._8_8_,param_3);
  *puVar1 = *puVar1 & 0xfffffffff0000000 | *puVar1 & 0x7ffffff | uVar2 & 0x8000000;
  return;
}

