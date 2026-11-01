
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_004aee00(long *param_1,long *param_2)

{
  long *plVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  long in_x9;
  long lVar5;
  undefined1 *unaff_x29;
  undefined *unaff_x30;
  undefined1 auStack_c0 [128];
  
  lVar3 = *param_1;
  *param_1 = lVar3 + in_x9;
  LORelease();
  if (lVar3 != 1) {
    return;
  }
  puVar2 = auStack_c0;
  lVar5 = *param_2;
  lVar3 = *(long *)(lVar5 + 0x20) + 1;
  lVar4 = *(long *)(lVar5 + 0x18);
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0059d298(lVar4);
    lVar4 = lVar4 + 0x108;
  }
  plVar1 = (long *)(lVar5 + 0x10);
  if (*plVar1 == 0) {
    lVar3 = 0x28;
  }
  else {
    lVar5 = *(long *)(lVar5 + 0x18);
    lVar3 = *plVar1 * 0x108;
    unaff_x30 = &UNK_005d2cc8;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar2 + 0xb0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lVar3,8);
  return;
}

