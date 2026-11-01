
/* WARNING: Possible PIC construction at 0x0053e3ac: Changing call to branch */

void FUN_0053e37c(void)

{
  undefined1 in_ZR;
  long *plVar1;
  long lVar2;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long lVar3;
  
  while (!(bool)in_ZR) {
    func_0x00553bbc(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 0x18;
    in_ZR = unaff_x23 == 0;
  }
  if (*unaff_x20 == 0) {
    __Unwind_Resume();
    plVar1 = (long *)func_0x007a2668();
    lVar3 = plVar1[2] + 1;
    lVar2 = plVar1[1];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553cb8(lVar2);
      lVar2 = lVar2 + 0x40;
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

