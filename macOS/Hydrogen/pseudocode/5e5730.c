
/* WARNING: Possible PIC construction at 0x005e5740: Changing call to branch */

void FUN_005e5730(void)

{
  long unaff_x21;
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (*(long *)(unaff_x21 + 8) == 0) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    unaff_x29 = in_stack_00000020;
    uVar1 = in_stack_00000028;
  }
  else {
    uVar1 = 0x5e5744;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

