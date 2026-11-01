
bool FUN_00524800(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  bool in_ZR;
  int iVar1;
  
  if (in_ZR) {
    iVar1 = _memcmp(param_3,*param_1);
    return iVar1 == 0;
  }
  return false;
}

