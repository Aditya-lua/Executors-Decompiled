
/* WARNING: Possible PIC construction at 0x004b70ec: Changing call to branch */

void FUN_004b70c8(long param_1)

{
  long *plVar1;
  long *unaff_x19;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    func_0x00487f7c(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x18;
  }
  if (*unaff_x19 == 0) {
    func_0x004b7494(unaff_x19 + 3);
    __Unwind_Resume();
    func_0x007a2668();
    plVar1 = (long *)func_0x007a2668();
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

