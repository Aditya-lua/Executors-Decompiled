
void FUN_00624b20(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x25;
  long unaff_x29;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  do {
    *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
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
  *(long *)(unaff_x29 + -0xb0) = unaff_x25 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x90);
  uVar2 = *(ulong *)(unaff_x29 + -0xa0);
  if (*(ulong *)(unaff_x29 + -0x98) <= *(ulong *)(unaff_x29 + -0xa0)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x98);
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
  *(long *)(unaff_x29 + -0x80) = unaff_x25 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x60);
  uVar2 = *(ulong *)(unaff_x29 + -0x70);
  if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x68);
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

