
void FUN_006097d0(undefined8 *param_1)

{
  undefined8 uStack0000000000000010;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  
  *param_1 = 0;
  param_1[1] = 0;
  func_0x00608f38(&uStack0000000000000010);
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
  return;
}

