
undefined1  [16] FUN_00656a0c(void)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x19;
  long *unaff_x23;
  long *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000018;
  long lStack0000000000000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  
  lStack0000000000000058 = unaff_x25 + 0xd60;
  if (in_stack_00000070 <= in_stack_00000068) {
    in_stack_00000068 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (in_stack_00000068 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + in_stack_00000068 * 8) = 0;
        in_stack_00000068 = in_stack_00000068 - 1;
      } while (in_stack_00000068 != 0);
    }
    func_0x00611644();
  }
  plVar2 = (long *)(**(code **)(*unaff_x24 + 0xa0))();
  uVar3 = (**(code **)(*unaff_x23 + 0xa0))();
  auVar5 = (**(code **)(*unaff_x24 + 0xa8))();
  auVar5 = (**(code **)(*plVar2 + 0x50))
                     (plVar2,uVar3,auVar5._0_8_,auVar5._8_8_,unaff_x23[0xc],unaff_x23[0xb],
                      unaff_x23[0x10],unaff_x23[0xf]);
  if (in_stack_000000a0 <= in_stack_00000098) {
    in_stack_00000098 = in_stack_000000a0;
  }
  if (in_stack_000000a8 != 0) {
    if (in_stack_00000098 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + in_stack_00000098 * 8) = 0;
        in_stack_00000098 = in_stack_00000098 - 1;
      } while (in_stack_00000098 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xa8) = unaff_x25 + 0xd60;
  lVar1 = *(long *)(unaff_x29 + -0x88);
  uVar4 = *(ulong *)(unaff_x29 + -0x98);
  if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
    uVar4 = *(ulong *)(unaff_x29 + -0x90);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (unaff_x26 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x26 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return auVar5;
}

