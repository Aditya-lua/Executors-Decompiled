
/* WARNING: Possible PIC construction at 0x00183f44: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00183f48) */

void FUN_00183f28(void)

{
  undefined1 in_ZR;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  do {
    if ((bool)in_ZR) {
      if (*unaff_x20 == 0) {
        return;
      }
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
      unaff_x29 = in_stack_00000030;
      uVar1 = in_stack_00000038;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
    if (unaff_x23 <= *(long *)(unaff_x22 + -8) && *(long *)(unaff_x22 + -8) != 0) {
      uVar1 = 0x183f48;
      goto code_r0x00187bd4;
    }
    unaff_x22 = unaff_x22 + 0x20;
    unaff_x21 = unaff_x21 + -1;
    in_ZR = unaff_x21 == 0;
  } while( true );
}

