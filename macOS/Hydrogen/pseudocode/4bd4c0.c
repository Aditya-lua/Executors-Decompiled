
void FUN_004bd4c0(undefined8 param_1)

{
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  if (in_x9 == 0) {
    param_1 = 0x8000000000000000;
  }
  else {
    in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x18);
    in_stack_00000030 = *(undefined8 *)(unaff_x20 + 0x10);
  }
  unaff_x19[3] = in_stack_00000038;
  unaff_x19[2] = in_stack_00000030;
  *unaff_x19 = 6;
  unaff_x19[1] = param_1;
  return;
}

