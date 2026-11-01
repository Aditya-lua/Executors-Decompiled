
void FUN_005a6844(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long lVar3;
  long lVar4;
  
  lVar1 = unaff_x19[1];
  if (unaff_x19[2] != 0) {
    lVar4 = 0;
    lVar3 = 1 - unaff_x19[2];
    do {
      lVar2 = **(long **)(lVar1 + lVar4);
      **(long **)(lVar1 + lVar4) = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(lVar1 + lVar4);
      }
      lVar4 = lVar4 + 0x10;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  }
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*unaff_x19 << 4,8);
  return;
}

