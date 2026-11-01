
void FUN_002718c0(void)

{
  long *unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long in_stack_00000048;
  
  *(undefined8 *)(unaff_x29 + -0x18) = in_stack_00000030;
  *(undefined8 *)(unaff_x29 + -0x20) = in_stack_00000028;
  func_0x00276f24(&uStack0000000000000038,unaff_x29 + -0x40);
  if (uStack0000000000000038 == -0x7fffffffffffffff) {
    *unaff_x19 = -0x7fffffffffffffff;
  }
  else {
    unaff_x19[1] = in_stack_00000040;
    *unaff_x19 = uStack0000000000000038;
    unaff_x19[2] = in_stack_00000048;
  }
  return;
}

