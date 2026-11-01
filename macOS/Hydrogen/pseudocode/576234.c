
void FUN_00576234(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  
  plVar3 = (long *)__Unwind_Resume();
  lVar1 = plVar3[1];
  if (plVar3[2] != 0) {
    lVar6 = 0;
    lVar5 = 1 - plVar3[2];
    do {
      plVar4 = *(long **)(lVar1 + lVar6 + 8);
      lVar2 = *plVar4;
      *plVar4 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4();
      }
      lVar5 = lVar5 + 1;
      lVar6 = lVar6 + 0x10;
    } while (lVar5 != 1);
  }
  if (*plVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*plVar3 << 4,8);
  return;
}

