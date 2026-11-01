
/* WARNING: Possible PIC construction at 0x004bb308: Changing call to branch */

void FUN_004bb2dc(void)

{
  long lVar1;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x004caae8(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 0x108;
  } while (unaff_x23 != 0);
  if (*(long *)(unaff_x20 + 0x10) == 0) {
    __Unwind_Resume();
    lVar1 = func_0x007a2668();
    if (*(long *)(lVar1 + 0x38) == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

