
void FUN_0064c534(code *param_1)

{
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  (*param_1)();
  func_0x005fe1e8();
  func_0x00607398();
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

