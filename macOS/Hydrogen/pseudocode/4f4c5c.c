
void FUN_004f4c5c(long param_1)

{
  undefined2 in_w8;
  long in_x9;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000030;
  
  *(long *)(param_1 + 0x1d0) = in_x9;
  *(long *)(in_x9 + 0x160) = param_1;
  *(undefined2 *)(in_x9 + 0x1c0) = in_w8;
  *in_stack_00000030 = unaff_x27;
  in_stack_00000030[1] = in_stack_00000010;
  in_stack_00000030[2] = unaff_x28;
  return;
}

