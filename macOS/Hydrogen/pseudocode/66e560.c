
void FUN_0066e560(long param_1,long *param_2)

{
  undefined4 *unaff_x21;
  long unaff_x22;
  long in_stack_00000010;
  
  *param_2 = param_1 + 0x80;
  param_2[1] = unaff_x22;
  *(undefined4 *)(param_2 + 4) = *unaff_x21;
  param_2[3] = in_stack_00000010;
  func_0x00611428();
  if (param_2 != (long *)0x0) {
    (**(code **)(*param_2 + 8))();
  }
  return;
}

