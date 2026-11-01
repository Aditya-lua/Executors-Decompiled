
/* WARNING: Possible PIC construction at 0x0049c51c: Changing call to branch */

void FUN_0049c508(code *param_1)

{
  long unaff_x19;
  long unaff_x22;
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  (*param_1)();
  if (*(long *)(unaff_x22 + 8) == 0) {
    if ((*(long *)(unaff_x19 + 0x50) < -0x7ffffffffffffffe) || (*(long *)(unaff_x19 + 0x50) == 0)) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar1 = in_stack_00000038;
  }
  else {
    uVar1 = 0x49c520;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

