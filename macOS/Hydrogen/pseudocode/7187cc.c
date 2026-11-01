
void FUN_007187cc(undefined8 param_1)

{
  long lVar1;
  long unaff_x19;
  undefined8 unaff_x23;
  long *in_stack_00000000;
  long in_stack_00000008;
  
  *(undefined8 *)(unaff_x19 + 0x20) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x28) = param_1;
  lVar1 = *in_stack_00000000 + in_stack_00000008 * 8;
  if (lVar1 != in_stack_00000000[1]) {
    in_stack_00000000[1] = lVar1;
  }
  return;
}

