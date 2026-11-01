
void FUN_0066e558(long *param_1)

{
  undefined4 *unaff_x21;
  long unaff_x22;
  long in_stack_00000010;
  
  *(undefined1 *)((long)param_1 + 0x11) = 0;
  *param_1 = (long)&UNK_00a0f080;
  param_1[1] = unaff_x22;
  *(undefined4 *)(param_1 + 4) = *unaff_x21;
  param_1[3] = in_stack_00000010;
  func_0x00611428();
  if (param_1 != (long *)0x0) {
    (**(code **)(*param_1 + 8))();
  }
  return;
}

