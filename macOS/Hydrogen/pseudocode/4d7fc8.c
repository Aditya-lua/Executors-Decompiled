
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_004d7fc8(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  long lVar4;
  undefined8 *puVar5;
  undefined *puVar6;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  func_0x004d7924();
  plVar3 = *(long **)(unaff_x19 + 0x60);
  lVar1 = *plVar3;
  *plVar3 = lVar1 + -1;
  LORelease();
  if (lVar1 != 1) {
    return;
  }
  lVar4 = *(long *)(unaff_x19 + 0x60);
  lVar1 = *(long *)(lVar4 + 0x20) + 1;
  lVar2 = *(long *)(lVar4 + 0x18);
  while (lVar1 = lVar1 + -1, lVar1 != 0) {
    func_0x0059d298(lVar2);
    lVar2 = lVar2 + 0x108;
  }
  plVar3 = (long *)(lVar4 + 0x10);
  if (*plVar3 == 0) {
    lVar1 = 0x28;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    puVar5 = uStack0000000000000030;
    puVar6 = in_stack_00000038;
  }
  else {
    lVar4 = *(long *)(lVar4 + 0x18);
    lVar1 = *plVar3 * 0x108;
    puVar5 = &uStack0000000000000030;
    puVar6 = &UNK_005d2cc8;
  }
  *(undefined8 **)((long)register0x00000008 + -0x10) = puVar5;
  *(undefined **)((long)register0x00000008 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar4,lVar1,8);
  return;
}

