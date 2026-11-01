
long FUN_0045ca3c(long param_1,long *param_2,long param_3)

{
  long in_x9;
  int in_stack_00000000;
  long in_stack_00000008;
  ulong uStack0000000000000020;
  
  if (in_x9 + param_3 < 0) {
    in_stack_00000008 = 0;
  }
  else {
    uStack0000000000000020 = (ulong)(param_1 != 0);
    func_0x0079a108();
    if (in_stack_00000000 != 1) {
      *param_2 = in_x9 + param_3;
      param_2[1] = in_stack_00000008;
      in_stack_00000008 = -0x7fffffffffffffff;
    }
  }
  return in_stack_00000008;
}

