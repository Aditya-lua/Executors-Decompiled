
void FUN_0068c53c(long param_1,long param_2)

{
  long lVar1;
  bool in_CY;
  ulong uVar2;
  long in_x9;
  long unaff_x21;
  long unaff_x29;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  if (in_CY) {
    param_1 = in_x9;
  }
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
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x70) = unaff_x21 + 0x10;
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
  return;
}

