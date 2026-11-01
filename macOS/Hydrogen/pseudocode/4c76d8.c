
undefined8 FUN_004c76d8(void)

{
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  
  func_0x00584c34();
  func_0x004ce364(&uStack0000000000000060);
  if (uStack0000000000000060 != 0) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060 * 0x28,8);
  }
  func_0x004bea24();
  if (in_stack_00000048 != 0) {
    func_0x00187bd4(in_stack_00000050,in_stack_00000048 << 2,4);
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 2,4);
  }
  return 1;
}

