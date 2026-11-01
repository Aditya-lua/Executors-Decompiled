
void FUN_0051da08(void)

{
  long unaff_x26;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  if (in_stack_00000038 == 0) {
    if (in_stack_00000028 != 0) {
      func_0x00187bd4(in_stack_00000030,in_stack_00000028 * 0x18,8);
    }
  }
  else {
    *(undefined8 *)(unaff_x26 + 0x10) = in_stack_00000030;
    *(long *)(unaff_x26 + 8) = in_stack_00000028;
    func_0x0051b078();
  }
  return;
}

