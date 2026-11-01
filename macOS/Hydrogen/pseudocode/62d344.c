
undefined8 FUN_0062d344(code *param_1)

{
  undefined8 uVar1;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  
  uVar1 = (*param_1)();
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
  return uVar1;
}

