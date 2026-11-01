
/* WARNING: Possible PIC construction at 0x0047b658: Changing call to branch */

void FUN_0047b630(void)

{
  undefined8 *puVar1;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x00488078(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 0x40;
  } while (unaff_x23 != 0);
  if (*unaff_x20 == 0) {
    __Unwind_Resume();
    puVar1 = (undefined8 *)func_0x007a2668();
    func_0x0047a214(*puVar1);
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

