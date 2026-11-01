
void FUN_00626ef0(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x22;
  ulong unaff_x23;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  func_0x005fef78();
  uVar2 = *(long *)(unaff_x22 + 0x10) * 8;
  lVar1 = uVar2 - unaff_x23;
  if (unaff_x23 <= uVar2 && lVar1 != 0) {
    func_0x006078e0(&uStack0000000000000030,lVar1);
  }
  func_0x00607398(&uStack0000000000000030);
  func_0x005fe4e8();
  func_0x00627090();
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
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

