
/* WARNING: Possible PIC construction at 0x0020a46c: Changing call to branch */

void FUN_0020a460(undefined8 param_1,long param_2)

{
  code *pcVar1;
  undefined1 auVar2 [16];
  
  if (param_2 != 0) {
code_r0x00187bd4:
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)();
    return;
  }
  auVar2 = __Unwind_Resume();
  if (auVar2._0_8_ != 0) {
    pcVar1 = (code *)*auVar2._8_8_;
    if (pcVar1 != (code *)0x0) {
      (*pcVar1)(auVar2._0_8_);
    }
    if (auVar2._8_8_[1] != 0) goto code_r0x00187bd4;
  }
  return;
}

