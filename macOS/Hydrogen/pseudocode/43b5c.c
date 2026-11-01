
void FUN_00043b5c(undefined8 param_1,undefined8 *param_2)

{
  long unaff_x19;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  
  *(undefined8 *)(unaff_x19 + 0x10) = param_1;
  param_2[1] = 0;
  param_2[2] = 0;
  *param_2 = 0;
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return;
  }
  return;
}

