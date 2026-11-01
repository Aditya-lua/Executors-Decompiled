
void FUN_006c7f88(void)

{
  ulong in_x9;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  for (; unaff_x20 < in_x9; unaff_x20 = unaff_x20 + 1) {
    func_0x006c6028();
    in_x9 = in_stack_00000030 - in_stack_00000028 >> 3;
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (in_stack_00000028 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

