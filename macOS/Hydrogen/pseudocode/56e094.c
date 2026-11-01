
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_0056e094(long *param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long unaff_x29;
  undefined *unaff_x30;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000040;
  
  lVar4 = *param_1;
  lVar3 = *(long *)(lVar4 + 0x20) + 1;
  lVar2 = *(long *)(lVar4 + 0x18);
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0059d298(lVar2);
    lVar2 = lVar2 + 0x108;
  }
  plVar1 = (long *)(lVar4 + 0x10);
  if (*plVar1 == 0) {
    lVar3 = 0x28;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  }
  else {
    lVar4 = *(long *)(lVar4 + 0x18);
    lVar3 = *plVar1 * 0x108;
    unaff_x30 = &UNK_005d2cc8;
    unaff_x29 = (long)register0x00000008 + 0x30;
  }
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar4,lVar3,8);
  return;
}

