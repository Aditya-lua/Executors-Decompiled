
/* WARNING: Possible PIC construction at 0x00275b34: Changing call to branch */

void FUN_002312ec(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined1 *puVar6;
  undefined1 *unaff_x29;
  undefined *puVar7;
  undefined1 auStack_a0 [128];
  undefined1 auStack_6 [6];
  
  __Unwind_Resume();
  lVar3 = func_0x007a2668();
  plVar5 = *(long **)(lVar3 + 0x10);
  if (plVar5 == (long *)0x0) {
    return;
  }
  lVar2 = *plVar5;
  *plVar5 = lVar2 + -1;
  LORelease();
  if (lVar2 != 1) {
    return;
  }
  DataMemoryBarrier(2,1);
  puVar1 = auStack_6;
  lVar2 = *(long *)(lVar3 + 0x10);
  lVar3 = *(long *)(lVar2 + 0x18);
  if (lVar3 != 0) {
    puVar6 = *(undefined1 **)(lVar2 + 0x10);
    do {
      *puVar6 = 0;
      lVar3 = lVar3 + -1;
      puVar6 = puVar6 + 1;
    } while (lVar3 != 0);
    lVar3 = *(long *)(lVar2 + 0x18);
    if (lVar3 != 0) {
      lVar2 = *(long *)(lVar2 + 0x10);
      uVar4 = 1;
      puVar7 = &UNK_00275b38;
      register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
      unaff_x29 = puVar1 + -10;
      goto code_r0x00187bd4;
    }
  }
  if (lVar2 != -1) {
    lVar3 = *(long *)(lVar2 + 8);
    *(long *)(lVar2 + 8) = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      lVar3 = 0x20;
      uVar4 = 8;
      puVar7 = (undefined *)0x2312f4;
code_r0x00187bd4:
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar2,lVar3,uVar4);
      return;
    }
  }
  return;
}

