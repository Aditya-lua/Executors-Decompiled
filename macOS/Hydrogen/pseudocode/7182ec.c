
void FUN_007182ec(void)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  long unaff_x20;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  undefined4 uStack0000000000000034;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  undefined8 in_stack_00000060;
  
  _uStack0000000000000030 = (undefined4)unaff_x22;
  uVar1 = _uStack0000000000000030;
  uStack0000000000000034 = (undefined4)((ulong)unaff_x22 >> 0x20);
  uVar2 = uStack0000000000000034;
  uStack0000000000000038 = (undefined4)*(undefined8 *)(unaff_x20 + 0x8c);
  uStack000000000000003c = (undefined4)((ulong)*(undefined8 *)(unaff_x20 + 0x8c) >> 0x20);
  uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
  in_stack_00000060 =
       func_0x007058b4(uVar3,&uStack0000000000000030,3,*(undefined8 *)(unaff_x29 + -0x60),
                       *(undefined8 *)(unaff_x29 + -0x58),*(undefined8 *)(unaff_x20 + 0x128));
  func_0x00711dac();
  uStack0000000000000034 = uVar1;
  uStack0000000000000038 = uVar2;
  if (*(int *)(unaff_x20 + 0x80) == 0x5d) {
    func_0x00710d48();
  }
  else {
    func_0x00721808();
    func_0x007244d4();
  }
  return;
}

