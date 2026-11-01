
/* WARNING: Possible PIC construction at 0x005ce290: Changing call to branch */

void FUN_005ce260(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0059ce88(unaff_x21);
    unaff_x21 = unaff_x21 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    __Unwind_Resume();
    plVar3 = (long *)func_0x007a2668();
    lVar2 = *(long *)plVar3[3];
    *(long *)plVar3[3] = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2b20();
    }
    lVar2 = plVar3[2];
    if (lVar2 != 0) {
      lVar4 = plVar3[1] + 0x18;
      do {
        lVar2 = lVar2 + -1;
        lVar1 = **(long **)(lVar4 + -0x10);
        **(long **)(lVar4 + -0x10) = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4();
        }
        lVar4 = lVar4 + 0x10;
      } while (lVar2 != 0);
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar2 = plVar3[1];
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

