
/* WARNING: Possible PIC construction at 0x00519c14: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00519c18) */

void FUN_00519c08(undefined8 param_1,long param_2)

{
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  do {
    if (param_2 != 0) {
      uVar1 = 0x519c18;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) {
      if (*(long *)(unaff_x19 + 0x10) == 0) {
        return;
      }
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      unaff_x29 = in_stack_00000020;
      uVar1 = in_stack_00000028;
      goto code_r0x00187bd4;
    }
    param_2 = *(long *)(unaff_x22 + 0x10);
    unaff_x22 = unaff_x22 + 0x18;
  } while( true );
}

