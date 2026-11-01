
void FUN_0059c430(long param_1,long *param_2,long param_3)

{
  long in_x9;
  long lVar1;
  long in_x12;
  long in_x13;
  
  lVar1 = *(long *)(param_3 + 0x60);
  if (in_x12 != 0) {
    param_1 = param_1 + 1;
  }
  *param_2 = param_1 + in_x9;
  param_2[1] = (ulong)(in_x13 == 0 || lVar1 == in_x13);
  param_2[2] = param_1 + in_x9;
  return;
}

