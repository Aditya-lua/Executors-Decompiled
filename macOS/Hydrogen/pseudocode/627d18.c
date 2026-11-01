
void FUN_00627d18(void)

{
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  
  if (in_stack_00000010 <= in_stack_00000008) {
    in_stack_00000008 = in_stack_00000010;
  }
  if (in_stack_00000018 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined1 *)(in_stack_00000018 + -1 + in_stack_00000008) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644(in_stack_00000018);
  }
  return;
}

