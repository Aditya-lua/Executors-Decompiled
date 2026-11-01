
void FUN_00507828(undefined8 param_1,undefined8 param_2)

{
  long unaff_x29;
  undefined1 auVar1 [16];
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined *puStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  long lStack_20;
  undefined *puStack_18;
  
  func_0x00187bd4(param_1,param_2,1);
  if ((*(ulong *)(unaff_x29 + -0x100) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_000000a0,*(undefined8 *)(unaff_x29 + -0x100),1);
  }
  if ((*(ulong *)(unaff_x29 + -0xf8) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_000000a8,*(undefined8 *)(unaff_x29 + -0xf8),1);
  }
  if ((*(ulong *)(unaff_x29 + -0xf0) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_000000b0,*(undefined8 *)(unaff_x29 + -0xf0),1);
  }
  if ((*(ulong *)(unaff_x29 + -0xe8) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe0),*(ulong *)(unaff_x29 + -0xe8),1);
  }
  __Unwind_Resume();
  auVar1 = func_0x007a2668();
  lStack_20 = auVar1._0_8_ + 0x230;
  puStack_18 = &DAT_00507918;
  puStack_50 = &UNK_007fc120;
  uStack_48 = 1;
  uStack_38 = 1;
  uStack_30 = 0;
  plStack_40 = &lStack_20;
  func_0x0046849c(*auVar1._8_8_,auVar1._8_8_[1],&puStack_50);
  return;
}

