
void FUN_00643a3c(code *param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x29;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  
  (*param_1)();
  if (in_stack_00000050 <= in_stack_00000048) {
    in_stack_00000048 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (in_stack_00000048 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + in_stack_00000048 * 8) = 0;
        in_stack_00000048 = in_stack_00000048 - 1;
      } while (in_stack_00000048 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000020 <= in_stack_00000018) {
    in_stack_00000018 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x30);
  uVar2 = *(ulong *)(unaff_x29 + -0x40);
  if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x38);
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

