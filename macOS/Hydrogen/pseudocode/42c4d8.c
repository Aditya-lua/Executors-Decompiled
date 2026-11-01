
long __RNvCsiwKNHetQL49_7___rustc13___rdl_realloc
               (undefined8 param_1,ulong param_2,ulong param_3,ulong param_4)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lStack_38;
  
  if ((param_3 < 0x11) && (param_3 <= param_4)) {
                    /* WARNING: Could not recover jumptable at 0x007b3c4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar3 = (*(code *)PTR__realloc_00a25378)(param_1,param_4);
    return lVar3;
  }
  if (0x80000000 < param_3) {
    return 0;
  }
  lStack_38 = 0;
  if (param_3 < 9) {
    param_3 = 8;
  }
  iVar1 = _posix_memalign(&lStack_38,param_3,param_4);
  lVar3 = lStack_38;
  lVar2 = 0;
  if ((iVar1 == 0) && (lStack_38 != 0)) {
    if (param_2 <= param_4) {
      param_4 = param_2;
    }
    _memcpy(lStack_38,param_1,param_4);
    _free(param_1);
    lVar2 = lVar3;
  }
  return lVar2;
}

