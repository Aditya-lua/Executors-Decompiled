
/* WARNING: Possible PIC construction at 0x005bcc28: Changing call to branch */

void FUN_005bcb1c(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long *plVar5;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long lVar6;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0059ce88(unaff_x21);
    unaff_x21 = unaff_x21 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    func_0x00187bd4();
    __Unwind_Resume(param_1);
    plVar3 = (long *)func_0x007a2668();
    lVar2 = plVar3[1];
    if (plVar3[2] != 0) {
      lVar6 = 0;
      lVar4 = 1 - plVar3[2];
      do {
        plVar5 = *(long **)(lVar2 + lVar6 + 8);
        lVar1 = *plVar5;
        *plVar5 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4();
        }
        lVar4 = lVar4 + 1;
        lVar6 = lVar6 + 0x10;
      } while (lVar4 != 1);
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar4 = *plVar3 << 4;
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0x28);
    lVar4 = *(long *)(unaff_x19 + 0x20) << 6;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,8);
  return;
}

