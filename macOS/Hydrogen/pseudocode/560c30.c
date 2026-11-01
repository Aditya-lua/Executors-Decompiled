
/* WARNING: Possible PIC construction at 0x00560c88: Changing call to branch */

void FUN_00560c30(void)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    func_0x00553cb8(unaff_x21);
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    unaff_x21 = unaff_x23;
    unaff_x23 = unaff_x23 + 0x40;
  }
  lVar4 = *(long *)(unaff_x19 + 8);
  if (lVar4 == 0) {
    __Unwind_Resume();
    plVar2 = (long *)func_0x007a2668();
    lVar1 = plVar2[1];
    lVar4 = plVar2[2] + 1;
    lVar3 = lVar1;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x00553cb8(lVar3);
      lVar3 = lVar3 + 0x40;
    }
    lVar4 = *plVar2;
    if (lVar4 == 0) {
      return;
    }
  }
  else {
    lVar1 = *(long *)(unaff_x19 + 0x10);
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar4 << 6,8);
  return;
}

