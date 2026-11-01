
void FUN_00524648(void)

{
  long in_x9;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (in_x9 == -0x8000000000000000) {
    *unaff_x19 = 0x8000000000000000;
  }
  else {
    unaff_x19[1] = in_stack_00000010;
    *unaff_x19 = in_stack_00000008;
    unaff_x19[2] = in_stack_00000018;
  }
  return;
}

