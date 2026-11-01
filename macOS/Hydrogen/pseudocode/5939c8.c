
/* WARNING: Possible PIC construction at 0x005939f0: Changing call to branch */

void FUN_005939c8(void)

{
  long *plVar1;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    func_0x00554164(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    unaff_x22 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x108;
  }
  if (*unaff_x20 == 0) {
    __Unwind_Resume();
    plVar1 = (long *)func_0x007a2668();
    func_0x00558024();
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

