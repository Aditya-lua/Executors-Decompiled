
void FUN_00651b74(long param_1)

{
  long *plVar1;
  int in_w8;
  ulong uVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  if (in_w8 != 0) {
    *unaff_x19 = &UNK_00a09a40;
    func_0x005fe0b4(unaff_x19 + 1,unaff_x20 + 8);
    func_0x005fe0b4(unaff_x19 + 7,unaff_x20 + 0x38);
    *(undefined1 *)(unaff_x19 + 0xd) = *(undefined1 *)(unaff_x20 + 0x68);
    return;
  }
  plVar1 = *(long **)(*(long *)(param_1 + 8) + 0x10);
  (**(code **)(*plVar1 + 0xd8))(&uStack0000000000000030,plVar1,unaff_x20 + 8);
  plVar1 = *(long **)(*(long *)(param_1 + 8) + 0x10);
  (**(code **)(*plVar1 + 0xd8))(plVar1,unaff_x20 + 0x38);
  *unaff_x19 = &UNK_00a09a40;
  func_0x005fe0b4(unaff_x19 + 1,&uStack0000000000000030);
  func_0x005fe0b4(unaff_x19 + 7);
  *(undefined1 *)(unaff_x19 + 0xd) = 0;
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

