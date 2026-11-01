
void FUN_00690000(void)

{
  ulong in_stack_00000138;
  ulong in_stack_00000140;
  long in_stack_00000148;
  ulong in_stack_00000168;
  ulong in_stack_00000170;
  long in_stack_00000178;
  
  if (in_stack_00000140 <= in_stack_00000138) {
    in_stack_00000138 = in_stack_00000140;
  }
  if (in_stack_00000148 != 0) {
    if (in_stack_00000138 != 0) {
      do {
        *(undefined8 *)(in_stack_00000148 + -8 + in_stack_00000138 * 8) = 0;
        in_stack_00000138 = in_stack_00000138 - 1;
      } while (in_stack_00000138 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000170 <= in_stack_00000168) {
    in_stack_00000168 = in_stack_00000170;
  }
  if (in_stack_00000178 != 0) {
    if (in_stack_00000168 != 0) {
      do {
        *(undefined8 *)(in_stack_00000178 + -8 + in_stack_00000168 * 8) = 0;
        in_stack_00000168 = in_stack_00000168 - 1;
      } while (in_stack_00000168 != 0);
    }
    func_0x00611644();
  }
  return;
}

