
/* WARNING: Possible PIC construction at 0x004fd3f4: Changing call to branch */

void FUN_004fd3dc(code *param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x22;
  undefined8 unaff_x29;
  undefined *puVar2;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  (*param_1)();
  if (*(long *)(unaff_x22 + 8) == 0) {
    lVar1 = *(long *)(unaff_x19 + 0x50);
    if ((-0x7fffffffffffffff < lVar1) && (lVar1 != 0)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x58),lVar1,1);
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    puVar2 = in_stack_00000038;
  }
  else {
    puVar2 = &LAB_004fd3f8;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

