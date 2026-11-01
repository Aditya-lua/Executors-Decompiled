
bool FUN_005f2510(long *param_1,long param_2)

{
  long lVar1;
  
  lVar1 = (**(code **)(*param_1 + 0x38))();
  return lVar1 == param_2;
}

