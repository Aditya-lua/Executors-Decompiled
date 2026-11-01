
void FUN_005c63d0(long param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong uStack0000000000000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000060;
  
  if (param_1 == 9) {
    lVar1 = *(long *)(unaff_x19 + 8);
    if (lVar1 == 0) {
      uStack0000000000000048 = 0;
    }
    else {
      in_stack_00000020 = *(undefined8 *)(unaff_x19 + 0x10);
      uStack0000000000000048 = *(undefined8 *)(unaff_x19 + 0x18);
      in_stack_00000010 = 0;
      in_stack_00000030 = 0;
      in_stack_00000018 = lVar1;
      in_stack_00000038 = lVar1;
      in_stack_00000040 = in_stack_00000020;
    }
    _uStack0000000000000008 = (ulong)(lVar1 != 0);
    uStack0000000000000028 = _uStack0000000000000008;
    func_0x005c7190(&uStack0000000000000050,&uStack0000000000000008);
    while (uStack0000000000000050 != 0) {
      *(undefined1 **)(unaff_x29 + -0x48) = &uStack0000000000000008;
      func_0x005c6384(uStack0000000000000050 + in_stack_00000060 * 0x30);
      func_0x005c7190(&uStack0000000000000050,&uStack0000000000000008);
    }
  }
  return;
}

