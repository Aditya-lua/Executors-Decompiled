
void FUN_00625888(void)

{
  ulong unaff_x21;
  ulong in_stack_00000008;
  long in_stack_00000018;
  
  _memcpy();
  if (unaff_x21 <= in_stack_00000008) {
    in_stack_00000008 = unaff_x21;
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

