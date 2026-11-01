
/* WARNING: Possible PIC construction at 0x005251d4: Changing call to branch */

void FUN_005251a8(void)

{
  long *plVar1;
  long lVar2;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long lVar3;
  
  do {
    func_0x004df40c(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 600;
  } while (unaff_x23 != 0);
  if (*unaff_x20 == 0) {
    __Unwind_Resume();
    plVar1 = (long *)func_0x007a2668();
    lVar3 = plVar1[2] + 1;
    lVar2 = plVar1[1];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x004df870(lVar2);
      lVar2 = lVar2 + 0x2c8;
    }
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

