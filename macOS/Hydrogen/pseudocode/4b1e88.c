
/* WARNING: Possible PIC construction at 0x004b1f14: Changing call to branch */

void FUN_004b1e88(long param_1)

{
  long *unaff_x21;
  long unaff_x23;
  undefined8 unaff_x29;
  undefined *puVar1;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  do {
    func_0x00488078(param_1);
    unaff_x23 = unaff_x23 + -1;
    param_1 = param_1 + 0x40;
  } while (unaff_x23 != 0);
  if (*unaff_x21 == 0) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    puVar1 = in_stack_00000038;
  }
  else {
    puVar1 = &UNK_004b1f18;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

