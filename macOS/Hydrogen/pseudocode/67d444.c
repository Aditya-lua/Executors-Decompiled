
void FUN_0067d444(long param_1)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x29;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  }
  func_0x00611644();
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  (**(code **)(*unaff_x19 + 0xa8))();
  func_0x005ffccc(unaff_x19 + 3,unaff_x29 + -0x90);
  *(undefined4 *)(unaff_x19 + 2) = 0;
  if (in_stack_000000b8 <= in_stack_000000b0) {
    in_stack_000000b0 = in_stack_000000b8;
  }
  if (in_stack_000000c0 != 0) {
    if (in_stack_000000b0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000c0 + -8 + in_stack_000000b0 * 8) = 0;
        in_stack_000000b0 = in_stack_000000b0 - 1;
      } while (in_stack_000000b0 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x90) = unaff_x22 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x70);
  uVar2 = *(ulong *)(unaff_x29 + -0x80);
  if (*(ulong *)(unaff_x29 + -0x78) <= *(ulong *)(unaff_x29 + -0x80)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x78);
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
  *(long *)(unaff_x29 + -0x60) = unaff_x22 + 0x10;
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

