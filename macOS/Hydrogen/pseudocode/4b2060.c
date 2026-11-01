
/* WARNING: Possible PIC construction at 0x004b216c: Changing call to branch */

void FUN_004b2060(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long *unaff_x21;
  long lVar5;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x00488078(unaff_x22);
    unaff_x22 = unaff_x22 + 0x40;
  }
  if (*unaff_x21 == 0) {
    func_0x00187bd4();
    __Unwind_Resume(param_1);
    plVar3 = (long *)func_0x007a2668();
    lVar2 = plVar3[1];
    if (plVar3[2] != 0) {
      lVar4 = 0;
      lVar5 = 1 - plVar3[2];
      do {
        lVar1 = **(long **)(lVar2 + lVar4);
        **(long **)(lVar2 + lVar4) = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4(lVar2 + lVar4);
        }
        lVar4 = lVar4 + 8;
        lVar5 = lVar5 + 1;
      } while (lVar5 != 1);
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar4 = *plVar3 << 3;
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0x28);
    lVar4 = *unaff_x21 << 6;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,8);
  return;
}

