
void FUN_00401f08(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x27;
  undefined2 unaff_w28;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  _memcpy(param_1,unaff_x20 + unaff_x24);
  *(undefined2 *)(unaff_x27 + 0x21a) = unaff_w28;
  uVar1 = *(undefined8 *)(unaff_x25 + 8);
  unaff_x22[6] = unaff_x27;
  unaff_x22[7] = uVar1;
  *unaff_x22 = unaff_x21;
  unaff_x22[1] = in_stack_00000008;
  unaff_x22[2] = in_stack_00000010;
  unaff_x22[3] = in_stack_00000000;
  unaff_x22[4] = unaff_x23;
  unaff_x22[5] = in_stack_00000018;
  unaff_x22[8] = unaff_x19;
  unaff_x22[9] = 0;
  return;
}

