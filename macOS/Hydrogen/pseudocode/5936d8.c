
void FUN_005936d8(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  
  lVar2 = ((ulong)(param_1[3] - param_1[1]) >> 3) * 0x6db6db6db6db6db7 + 1;
  lVar1 = param_1[1];
  while (lVar2 = lVar2 + -1, lVar2 != 0) {
    func_0x00591cf8(lVar1);
    lVar1 = lVar1 + 0x38;
  }
  if (param_1[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_1,param_1[2] * 0x38,8);
  return;
}

