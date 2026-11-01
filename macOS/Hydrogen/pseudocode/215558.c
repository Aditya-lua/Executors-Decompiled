
void FUN_00215558(void)

{
  uint uVar1;
  long unaff_x19;
  uint unaff_w22;
  uint unaff_w23;
  uint unaff_w27;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000088;
  undefined8 uStack00000000000000a0;
  undefined1 uStack0000000000000110;
  
  if ((unaff_w23 & 1) != 0) {
    func_0x00209ea8(&uStack0000000000000110);
  }
  uVar1 = 0;
  if (uStack00000000000000a0 != unaff_x19) {
    uVar1 = unaff_w22;
  }
  if ((uVar1 & 1) != 0) {
    func_0x00208e34(&uStack00000000000000a0);
  }
  if ((unaff_w27 & 1) != 0) {
    func_0x00207f98(&uStack0000000000000088);
  }
  func_0x002087e4();
  func_0x00187bd4(in_stack_00000048,0x1a8,8);
  __Unwind_Resume();
  func_0x007a2668();
  return;
}

