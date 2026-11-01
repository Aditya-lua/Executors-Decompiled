
/* WARNING: Possible PIC construction at 0x002227d8: Changing call to branch */

void FUN_002227dc(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x29;
  code *pcVar5;
  undefined8 in_stack_00000040;
  code *in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  do {
    puVar1 = unaff_x21 + 4;
    unaff_x20 = unaff_x20 + -1;
    if (unaff_x20 == 0) {
      if (*(long *)(unaff_x19 + 0x20) == 0) {
        return;
      }
      uVar2 = *(undefined8 *)(unaff_x19 + 0x28);
      lVar3 = *(long *)(unaff_x19 + 0x20) << 5;
      uVar4 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
      unaff_x29 = in_stack_00000040;
      pcVar5 = in_stack_00000048;
      goto code_r0x00187bd4;
    }
    lVar3 = unaff_x21[3];
    unaff_x21 = puVar1;
  } while (lVar3 < unaff_x22 || lVar3 == 0);
  uVar2 = *puVar1;
  uVar4 = 1;
  pcVar5 = FUN_002227dc;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = pcVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar3,uVar4);
  return;
}

