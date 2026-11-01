
void FUN_007142b8(long param_1)

{
  long lVar1;
  long in_x9;
  long in_x10;
  long *in_stack_00000048;
  long in_stack_00000050;
  
  if (in_x9 != in_x10) {
    *(long *)(param_1 + 8) = in_x9;
  }
  lVar1 = *in_stack_00000048 + in_stack_00000050 * 8;
  if (lVar1 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar1;
  }
  return;
}

