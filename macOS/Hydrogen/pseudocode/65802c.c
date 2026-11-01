
void FUN_0065802c(long param_1,long param_2)

{
  long unaff_x19;
  long unaff_x21;
  undefined8 in_stack_00000018;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000090 <= in_stack_00000088) {
    in_stack_00000088 = in_stack_00000090;
  }
  if (in_stack_00000098 != 0) {
    if (in_stack_00000088 != 0) {
      do {
        *(undefined8 *)(in_stack_00000098 + -8 + in_stack_00000088 * 8) = 0;
        in_stack_00000088 = in_stack_00000088 - 1;
      } while (in_stack_00000088 != 0);
    }
    func_0x00611644();
  }
  if (unaff_x21 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x21 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return;
}

