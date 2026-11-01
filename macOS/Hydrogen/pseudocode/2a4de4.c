
undefined8 FUN_002a4de4(void)

{
  undefined8 uVar1;
  undefined8 unaff_x24;
  undefined8 *unaff_x25;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  
  func_0x0036e3d8(0);
  *unaff_x25 = unaff_x24;
  uStack0000000000000008 = unaff_x25;
  uVar1 = func_0x002a27b4();
  if ((in_stack_00000018._4_4_ >> 1 & 1) == 0) {
    func_0x0036e3d8(uStack0000000000000008);
  }
  if ((in_stack_00000018 & 0x100000000) != 0) {
    func_0x0036e3d8(&uStack0000000000000008);
  }
  return uVar1;
}

