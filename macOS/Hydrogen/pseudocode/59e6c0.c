
/* WARNING: Possible PIC construction at 0x0059e6ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0059e6f0) */

void FUN_0059e6c0(void)

{
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long lVar1;
  undefined8 unaff_x29;
  undefined8 uVar2;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (unaff_x21 != 0) {
    lVar1 = unaff_x19 + 8;
    do {
      if (*(long *)(lVar1 + -8) != 0) {
        uVar2 = 0x59e6f0;
        goto code_r0x00187bd4;
      }
      lVar1 = lVar1 + 0x18;
      unaff_x21 = unaff_x21 + -1;
    } while (unaff_x21 != 0);
  }
  if (*unaff_x20 == 0) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
  unaff_x29 = in_stack_00000020;
  uVar2 = in_stack_00000028;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

