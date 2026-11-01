
void FUN_0068dc1c(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 unaff_x20;
  undefined4 uVar3;
  long unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  long *in_stack_00000068;
  undefined1 in_stack_00000070;
  undefined8 uStack0000000000000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  uVar3 = (undefined4)((ulong)unaff_x20 >> 0x20);
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  uStack0000000000000030._4_4_ = uVar3;
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000030 = CONCAT44(uStack0000000000000030._4_4_,1);
  func_0x0068ded0(&uStack0000000000000060,"RandomNumberType",&uStack0000000000000030,1);
  lVar1 = func_0x00610954(&uStack0000000000000060,"Min",unaff_x29 + -0x60,in_stack_00000070);
  func_0x00610954(lVar1,"Max",&uStack0000000000000090,*(undefined1 *)(lVar1 + 0x10));
  func_0x00611428();
  uStack0000000000000060 = &UNK_009f6820;
  if (in_stack_00000068 != (long *)0x0) {
    (**(code **)(*in_stack_00000068 + 8))();
  }
  lVar1 = unaff_x21 + 0x10;
  uVar2 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar2 = in_stack_000000a8;
  }
  uStack0000000000000090 = lVar1;
  if (in_stack_000000b0 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x60) = lVar1;
  lVar1 = *(long *)(unaff_x29 + -0x40);
  uVar2 = *(ulong *)(unaff_x29 + -0x50);
  if (*(ulong *)(unaff_x29 + -0x48) <= *(ulong *)(unaff_x29 + -0x50)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x48);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

