
long FUN_0060ea84(long param_1)

{
  ulong uVar1;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  func_0x006001b4();
  func_0x005ffad4();
  func_0x0060986c(&uStack0000000000000030);
  func_0x005ffccc(param_1 + 0x78,&uStack0000000000000030);
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
  return param_1 + 0x78;
}

