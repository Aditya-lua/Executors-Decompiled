
void FUN_001eb59c(void)

{
  long lVar1;
  long unaff_x23;
  ulong unaff_x24;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
  lVar1 = (unaff_x24 & 0xff) * 8;
  uStack0000000000000040 = *(undefined8 *)(&UNK_0081f6e8 + lVar1);
  uStack0000000000000038 = *(undefined8 *)(&UNK_009c4240 + lVar1);
  _uStack0000000000000018 = &UNK_0081f5b0;
  uStack0000000000000020 = 7;
  uStack0000000000000028 = in_stack_00000060;
  uStack0000000000000030 = in_stack_00000068;
  func_0x001e1508(&uStack0000000000000018,4);
  if (in_stack_00000058 != 0) {
    func_0x00187bd4(in_stack_00000060,in_stack_00000058,1);
  }
  (**(code **)(unaff_x23 + 0x48))();
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  return;
}

