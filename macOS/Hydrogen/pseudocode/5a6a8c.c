
void FUN_005a6a8c(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  plVar3 = (long *)func_0x007a2668();
  lVar1 = plVar3[1];
  if (plVar3[2] != 0) {
    lVar5 = 0;
    lVar4 = 1 - plVar3[2];
    do {
      lVar2 = **(long **)(lVar1 + lVar5);
      **(long **)(lVar1 + lVar5) = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(lVar1 + lVar5);
      }
      lVar5 = lVar5 + 0x10;
      lVar4 = lVar4 + 1;
    } while (lVar4 != 1);
  }
  if (*plVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*plVar3 << 4,8);
  return;
}

