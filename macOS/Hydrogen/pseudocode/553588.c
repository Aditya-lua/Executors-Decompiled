
/* WARNING: Possible PIC construction at 0x005535c4: Changing call to branch */

void FUN_00553588(void)

{
  undefined8 uVar1;
  long *plVar2;
  long *unaff_x20;
  long lVar3;
  long unaff_x23;
  long *plVar4;
  
  uVar1 = func_0x007a2668();
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x00555180();
  }
  if (*unaff_x20 == 0) {
    __Unwind_Resume(uVar1);
    plVar2 = (long *)func_0x007a2668();
    plVar4 = (long *)plVar2[1];
    for (lVar3 = plVar2[2]; lVar3 != 0; lVar3 = lVar3 + -1) {
      if (*plVar4 != 0xc) {
        func_0x00553cb8(plVar4);
      }
      func_0x00553cb8(plVar4 + 8);
      plVar4 = plVar4 + 0x10;
    }
    if (*plVar2 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

