
void FUN_004db2c0(long *param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  lVar1 = param_1[1];
  if (param_1[2] != 0) {
    lVar5 = 0;
    lVar4 = 1 - param_1[2];
    do {
      plVar3 = *(long **)(lVar1 + lVar5 + 8);
      lVar2 = *plVar3;
      *plVar3 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4();
      }
      lVar4 = lVar4 + 1;
      lVar5 = lVar5 + 0x10;
    } while (lVar4 != 1);
  }
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*param_1 << 4,8);
  return;
}

