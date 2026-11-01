
void FUN_00553794(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  lVar1 = param_1[1];
  if (param_1[2] != 0) {
    lVar4 = 0;
    lVar3 = 1 - param_1[2];
    do {
      lVar2 = **(long **)(lVar1 + lVar4);
      **(long **)(lVar1 + lVar4) = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(lVar1 + lVar4);
      }
      lVar4 = lVar4 + 0x18;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  }
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*param_1 * 0x18,8);
  return;
}

