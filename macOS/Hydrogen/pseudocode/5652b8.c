
/* WARNING: Possible PIC construction at 0x005652cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_005652b8(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long unaff_x19;
  undefined8 *unaff_x29;
  undefined *puVar5;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (*(long *)(unaff_x19 + 0x38) == 0) {
    plVar4 = *(long **)(unaff_x19 + 0x50);
    lVar3 = *plVar4;
    *plVar4 = lVar3 + -1;
    LORelease();
    if (lVar3 != 1) {
      return;
    }
    unaff_x29 = &uStack0000000000000030;
    lVar1 = *(long *)(unaff_x19 + 0x50);
    lVar3 = *(long *)(lVar1 + 0x20) + 1;
    lVar2 = *(long *)(lVar1 + 0x18);
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059d298(lVar2);
      lVar2 = lVar2 + 0x108;
    }
    plVar4 = (long *)(lVar1 + 0x10);
    if (*plVar4 == 0) {
      lVar3 = 0x28;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
      unaff_x29 = uStack0000000000000030;
      puVar5 = in_stack_00000038;
    }
    else {
      lVar1 = *(long *)(lVar1 + 0x18);
      lVar3 = *plVar4 * 0x108;
      puVar5 = &UNK_005d2cc8;
    }
  }
  else {
    lVar1 = *(long *)(unaff_x19 + 0x40);
    lVar3 = *(long *)(unaff_x19 + 0x38) << 6;
    puVar5 = (undefined *)0x5652d0;
  }
  *(undefined8 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3,8);
  return;
}

