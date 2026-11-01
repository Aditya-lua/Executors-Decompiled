
void FUN_006c7f7c(void)

{
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  while( true ) {
    if ((ulong)(in_stack_00000030 - in_stack_00000028 >> 3) <= unaff_x20) break;
    func_0x006c6028();
    unaff_x20 = unaff_x20 + 1;
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (in_stack_00000028 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

