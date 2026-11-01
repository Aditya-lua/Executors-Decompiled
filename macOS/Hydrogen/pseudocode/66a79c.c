
long FUN_0066a79c(long *param_1)

{
  long lVar1;
  
  if (param_1[3] != 0) {
    return param_1[3];
  }
  lVar1 = (**(code **)(*param_1 + 0x180))();
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
  param_1[3] = lVar1;
  return lVar1;
}

