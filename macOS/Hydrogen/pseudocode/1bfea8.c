
/* WARNING: Possible PIC construction at 0x001bfeb4: Changing call to branch */

void FUN_001bfea8(undefined8 param_1,long param_2)

{
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if (param_2 == 0) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000020;
    unaff_x29 = in_stack_00000010;
    uVar1 = in_stack_00000018;
  }
  else {
    uVar1 = 0x1bfeb8;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

