
void FUN_001a4e1c(undefined8 param_1,undefined8 param_2)

{
  undefined8 in_x9;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  *(undefined8 *)(unaff_x29 + -0x68) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x60) = param_1;
  *(undefined8 *)(unaff_x29 + -0x58) = param_2;
  func_0x00254430(&uStack0000000000000020,unaff_x29 + -0x68);
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

