
/* WARNING: Possible PIC construction at 0x005bc9c0: Changing call to branch */

void FUN_005bc9e8(long param_1)

{
  undefined8 unaff_x29;
  undefined *puVar1;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (param_1 == 0) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    puVar1 = in_stack_00000038;
  }
  else {
    puVar1 = &LAB_005bc9c4;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

