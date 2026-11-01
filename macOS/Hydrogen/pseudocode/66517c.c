
long FUN_0066517c(ulong param_1)

{
  long lVar1;
  ulong in_x9;
  long unaff_x19;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  
  *(undefined8 *)(unaff_x19 + 0x70) = in_stack_00000010;
  *(undefined8 *)(unaff_x19 + 0x68) = in_stack_00000008;
  lVar1 = *(long *)(unaff_x19 + 0x78);
  *(undefined8 *)(unaff_x19 + 0x78) = in_stack_00000018;
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  *(undefined1 *)(unaff_x19 + 0xa0) = 0;
  if (lVar1 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000030 <= in_stack_00000028) {
    in_stack_00000028 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (in_stack_00000028 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + in_stack_00000028 * 8) = 0;
        in_stack_00000028 = in_stack_00000028 - 1;
      } while (in_stack_00000028 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0x58;
}

