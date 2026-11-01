
void thunk_FUN_004605c8(ulong param_1,long param_2,undefined8 param_3)

{
  ulong in_x13;
  uint in_w15;
  long in_x16;
  long in_x17;
  long unaff_x20;
  long unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000060;
  
  if ((((in_x13 < param_1) && ((in_w15 & 1) == 0)) &&
      ((in_x13 + in_x16 < param_1 || ((in_x13 + in_x16) - param_1 <= param_1 - in_x13)))) ||
     ((in_x13 < (ulong)(unaff_x20 * 4) || ((ulong)(unaff_x28 + in_x17 * -0x28) < in_x13)))) {
    *in_stack_00000060 = 0;
  }
  else {
    *in_stack_00000060 = param_3;
    in_stack_00000060[1] = param_2 + 1;
    *(undefined2 *)(in_stack_00000060 + 2) = in_stack_00000000._4_2_;
  }
  return;
}

