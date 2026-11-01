
void FUN_00626240(void)

{
  ulong uVar1;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  func_0x00607398(&uStack0000000000000030);
  func_0x005fe4e8();
  func_0x006263c4();
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000030 = &UNK_009f5d60;
  uVar1 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar1 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return;
}

