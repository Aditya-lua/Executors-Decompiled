
void FUN_00666d60(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x23;
  long unaff_x29;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  if (in_stack_000000a8 <= in_stack_000000a0) {
    in_stack_000000a0 = in_stack_000000a8;
  }
  if (in_stack_000000b0 != 0) {
    if (in_stack_000000a0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + in_stack_000000a0 * 8) = 0;
        in_stack_000000a0 = in_stack_000000a0 - 1;
      } while (in_stack_000000a0 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000078 <= in_stack_00000070) {
    in_stack_00000070 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (in_stack_00000070 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + in_stack_00000070 * 8) = 0;
        in_stack_00000070 = in_stack_00000070 - 1;
      } while (in_stack_00000070 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x60) = unaff_x23 + 0x10;
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

