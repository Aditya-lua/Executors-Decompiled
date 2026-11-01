
bool _aws_lc_0_24_0_ec_scalar_equal_vartime(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  if (*(int *)(param_1 + 0x108) == 0) {
    return true;
  }
  iVar1 = _memcmp(param_2,param_3,(long)*(int *)(param_1 + 0x108) << 3);
  return iVar1 == 0;
}

