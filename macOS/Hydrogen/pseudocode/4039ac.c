
/* WARNING: Possible PIC construction at 0x004039dc: Changing call to branch */

void FUN_004039ac(long *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  long unaff_x29;
  undefined8 unaff_x30;
  undefined1 uStack0000000000000030;
  
  lVar6 = *param_1;
  lVar2 = *(long *)(lVar6 + 0x10);
  puVar1 = *(undefined8 **)(lVar6 + 0x18);
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(lVar2);
  }
  lVar3 = puVar1[1];
  if (lVar3 != 0) {
    uVar4 = puVar1[2];
    unaff_x30 = 0x4039e0;
    lVar6 = lVar2;
    unaff_x29 = (long)register0x00000008 + 0x20;
code_r0x00187bd4:
    *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(lVar6,lVar3,uVar4);
    return;
  }
  plVar5 = *(long **)(lVar6 + 0x20);
  if (plVar5 != (long *)0x0) {
    lVar2 = *plVar5;
    *plVar5 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004039a4();
    }
  }
  if (lVar6 != -1) {
    lVar2 = *(long *)(lVar6 + 8);
    *(long *)(lVar6 + 8) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      lVar3 = 0x28;
      uVar4 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      goto code_r0x00187bd4;
    }
  }
  return;
}

