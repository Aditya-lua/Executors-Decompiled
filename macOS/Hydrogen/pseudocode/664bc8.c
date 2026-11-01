
void FUN_00664bc8(long param_1,long param_2)

{
  bool in_CY;
  long in_x9;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  
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
  return;
}

