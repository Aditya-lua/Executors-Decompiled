
void FUN_0067e06c(void)

{
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x25;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  _bzero();
  (**(code **)(*unaff_x21 + 0x80))();
  if (unaff_x25 < (unaff_x22 & 0xffffffff) << 3) {
    func_0x005fef78();
    func_0x006078e0();
    func_0x00602560();
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
  }
  return;
}

