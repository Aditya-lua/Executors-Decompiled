
/* WARNING: Possible PIC construction at 0x004b5e1c: Changing call to branch */

void FUN_004b5de8(undefined8 param_1)

{
  long *plVar1;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x0048a928(unaff_x22);
    unaff_x22 = unaff_x22 + 0x20;
  }
  if (*unaff_x19 == 0) {
    func_0x004b5e38(unaff_x19 + 3);
    __Unwind_Resume(param_1);
    func_0x007a2668();
    plVar1 = (long *)func_0x007a2668();
    func_0x0048e9ec();
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

