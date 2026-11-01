
undefined8 FUN_00691ef0(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x24;
  long unaff_x29;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e0;
  
  if (param_1 != 0) {
    do {
      *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  if (in_stack_000000d8 <= in_stack_000000d0) {
    in_stack_000000d0 = in_stack_000000d8;
  }
  if (in_stack_000000e0 != 0) {
    if (in_stack_000000d0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e0 + -8 + in_stack_000000d0 * 8) = 0;
        in_stack_000000d0 = in_stack_000000d0 - 1;
      } while (in_stack_000000d0 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xa0) = unaff_x24 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x80);
  uVar2 = *(ulong *)(unaff_x29 + -0x90);
  if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x88);
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
  *(long *)(unaff_x29 + -0x70) = unaff_x24 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x50);
  uVar2 = *(ulong *)(unaff_x29 + -0x60);
  if (*(ulong *)(unaff_x29 + -0x58) <= *(ulong *)(unaff_x29 + -0x60)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x58);
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
  return 1;
}

