
/* WARNING: Possible PIC construction at 0x001ad01c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001ad020) */

void FUN_001acff8(void)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar1;
  undefined8 unaff_x29;
  undefined8 uVar2;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  lVar1 = unaff_x20 + 8;
  do {
    if (*(long *)(lVar1 + -8) != 0) {
      uVar2 = 0x1ad020;
      goto code_r0x00187bd4;
    }
    lVar1 = lVar1 + 0x18;
    unaff_x21 = unaff_x21 + -1;
  } while (unaff_x21 != 0);
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  unaff_x29 = in_stack_00000030;
  uVar2 = in_stack_00000038;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

