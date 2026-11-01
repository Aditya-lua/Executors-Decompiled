
/* WARNING: Possible PIC construction at 0x0021691c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00216920) */

void FUN_00216904(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  do {
    unaff_x20 = unaff_x20 + -1;
    if (unaff_x20 == 0) {
      if (*(long *)(unaff_x19 + 0x438) == 0) {
        return;
      }
      uVar1 = *(undefined8 *)(unaff_x19 + 0x440);
      lVar2 = *(long *)(unaff_x19 + 0x438) * 0x18;
      uVar3 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
      unaff_x29 = in_stack_00000040;
      uVar4 = in_stack_00000048;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(uVar1,lVar2,uVar3);
      return;
    }
    lVar2 = unaff_x21[-1];
    if (lVar2 != 0) {
      uVar1 = *unaff_x21;
      uVar3 = 1;
      uVar4 = 0x216920;
      goto code_r0x00187bd4;
    }
    unaff_x21 = unaff_x21 + 3;
  } while( true );
}

