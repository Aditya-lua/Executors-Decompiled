
undefined8 FUN_00664238(void)

{
  ulong uVar1;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  func_0x0067a01c();
  func_0x00677180(&uStack0000000000000028,&uStack0000000000000008);
  uVar1 = in_stack_00000010;
  if (in_stack_00000018 <= in_stack_00000010) {
    uVar1 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  func_0x00675e78(&uStack0000000000000028,0,*(byte *)(unaff_x29 + -0x21) & 1);
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x80))
            (*(long **)(unaff_x19 + 0x10),&uStack0000000000000028);
  func_0x00677180();
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

