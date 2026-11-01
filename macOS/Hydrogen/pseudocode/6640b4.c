
undefined8 FUN_006640b4(undefined8 param_1)

{
  ulong uVar1;
  long unaff_x19;
  long unaff_x21;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  func_0x00679e30(&uStack0000000000000028,param_1,unaff_x19 + 0x38);
  func_0x00677180(unaff_x21 + 0x28,&uStack0000000000000028);
  uVar1 = in_stack_00000030;
  if (in_stack_00000038 <= in_stack_00000030) {
    uVar1 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return 1;
}

