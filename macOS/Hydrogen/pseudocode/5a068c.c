
void FUN_005a068c(long param_1,long param_2)

{
  undefined8 *unaff_x19;
  long unaff_x21;
  byte unaff_w23;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  if ((unaff_w23 & unaff_x21 != 0) == 1) {
    *(long *)(param_2 + param_1 * 8) = unaff_x21;
    param_1 = param_1 + 1;
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = param_1;
  return;
}

