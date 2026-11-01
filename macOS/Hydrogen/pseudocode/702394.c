
long FUN_00702394(long param_1)

{
  bool in_ZR;
  long lVar1;
  
  if (in_ZR) {
    return param_1;
  }
  lVar1 = ___stack_chk_fail();
  if (*(int *)(lVar1 + 0xc) != 4) {
    lVar1 = 0;
  }
  return lVar1;
}

