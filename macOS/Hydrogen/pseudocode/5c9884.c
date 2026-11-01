
/* WARNING: Possible PIC construction at 0x005c98cc: Changing call to branch */

void FUN_005c9884(void)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  long *plVar4;
  
  if (*(long *)(unaff_x19 + 8) == 0) {
    __Unwind_Resume();
    plVar2 = (long *)func_0x007a2668();
    plVar1 = (long *)plVar2[1];
    plVar4 = plVar1;
    for (lVar3 = plVar2[2]; lVar3 != 0; lVar3 = lVar3 + -1) {
      if (*plVar4 != 0xc) {
        func_0x0059ce88(plVar4);
      }
      func_0x0059ce88(plVar4 + 8);
      plVar4 = plVar4 + 0x10;
    }
    if (*plVar2 == 0) {
      return;
    }
    lVar3 = *plVar2 << 7;
  }
  else {
    plVar1 = *(long **)(unaff_x19 + 0x10);
    lVar3 = *(long *)(unaff_x19 + 8) << 6;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar1,lVar3,8);
  return;
}

