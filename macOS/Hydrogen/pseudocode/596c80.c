
/* WARNING: Possible PIC construction at 0x00596cdc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00596ce0) */

void FUN_00596c80(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long lVar3;
  long lVar4;
  undefined8 unaff_x29;
  undefined *puVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000070;
  undefined *in_stack_00000078;
  undefined1 uStack0000000000000080;
  
  do {
    func_0x0056f330(&uStack0000000000000008,unaff_x22 + unaff_x23 * unaff_x25 + 8);
    lVar2 = in_stack_00000010;
    lVar1 = uStack0000000000000008;
    lVar4 = in_stack_00000018 * 8;
    for (lVar3 = 0; lVar4 != lVar3; lVar3 = lVar3 + 8) {
      func_0x00563b2c();
    }
    if (lVar1 != 0) {
      puVar5 = &UNK_00596ce0;
      goto code_r0x00187bd4;
    }
    unaff_x23 = unaff_x23 + 1;
  } while (unaff_x23 != unaff_x24);
  lVar2 = *(long *)(unaff_x19 + 0x20);
  if (lVar2 != 0) {
    lVar1 = *(long *)(unaff_x19 + 0x30);
    lVar4 = *(long *)(unaff_x19 + 0x38);
    for (lVar3 = *(long *)(unaff_x19 + 0x28); lVar3 != lVar4; lVar3 = lVar3 + 8) {
      func_0x00563b2c();
    }
    if (lVar1 != 0) {
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000080;
      unaff_x29 = in_stack_00000070;
      puVar5 = in_stack_00000078;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar2,lVar1 << 3,8);
      return;
    }
  }
  return;
}

