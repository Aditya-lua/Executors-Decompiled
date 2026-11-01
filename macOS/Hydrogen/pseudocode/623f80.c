
void FUN_00623f80(undefined8 param_1,long *param_2)

{
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  (**(code **)(*param_2 + 0xb0))();
  (**(code **)(*param_2 + 0xa0))(param_2);
  func_0x006095dc(param_1);
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  return;
}

