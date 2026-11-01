
/* WARNING: Possible PIC construction at 0x00519fc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00519ff8: Changing call to branch */

void FUN_00519fac(void)

{
  long *plVar1;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x00489dec(unaff_x22);
    unaff_x22 = unaff_x22 + 0x20;
  }
  if (*(long *)(unaff_x19 + 0x38) == 0) {
    func_0x0049c600();
    func_0x00519ce0(*(undefined8 *)(unaff_x19 + 0x68),*(undefined8 *)(unaff_x19 + 0x70));
    if ((*(long *)(unaff_x19 + 0x50) < -0x7ffffffffffffffe) || (*(long *)(unaff_x19 + 0x50) == 0)) {
      __Unwind_Resume();
      func_0x007a2668();
      plVar1 = (long *)func_0x007a2668();
      if (*plVar1 == 0) {
        return;
      }
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

