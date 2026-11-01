
void FUN_001fbc70(long param_1)

{
  long *unaff_x19;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  *(undefined8 *)(param_1 + 0x28) = in_stack_00000028;
  *(undefined8 *)(param_1 + 0x20) = in_stack_00000020;
  *(undefined8 *)(param_1 + 0x38) = in_stack_00000038;
  *(undefined8 *)(param_1 + 0x30) = in_stack_00000030;
  *unaff_x19 = param_1;
  unaff_x19[1] = (long)&UNK_009c5ad0;
  *(undefined1 *)(unaff_x19 + 2) = 2;
  return;
}

