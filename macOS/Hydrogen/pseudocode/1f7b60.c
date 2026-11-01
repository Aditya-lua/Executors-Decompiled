
/* WARNING: Possible PIC construction at 0x001f7bf8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f7bb8: Changing call to branch */

void FUN_001f7b60(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  bool in_ZR;
  long lVar3;
  long lVar4;
  long *plVar5;
  long unaff_x19;
  long *plVar6;
  undefined8 unaff_x20;
  long unaff_x21;
  ulong uVar7;
  undefined8 unaff_x22;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  if (in_ZR) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08();
    lVar3 = **(long **)(unaff_x19 + 0xa8);
    **(long **)(unaff_x19 + 0xa8) = lVar3 + unaff_x21;
    LORelease();
  }
  else {
    lVar3 = **(long **)(unaff_x19 + 0xa8);
    **(long **)(unaff_x19 + 0xa8) = lVar3 + unaff_x21;
    LORelease();
  }
  if (lVar3 == 1) {
    plVar5 = (long *)(unaff_x19 + 0xa8);
    DataMemoryBarrier(2,1);
    uStack_8 = 0x1f7bbc;
    plVar6 = plVar5;
  }
  else {
    __Unwind_Resume();
    plVar5 = (long *)func_0x007a2668();
    uStack_8 = 0x1f7bc8;
    puVar2 = auStack_b0;
    lVar3 = *(long *)*plVar5;
    *(long *)*plVar5 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      uStack_8 = 0x1f7bfc;
      register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
      plVar6 = plVar5;
      unaff_x20 = 0xffffffffffffffff;
      unaff_x29 = puVar2 + 0xa0;
    }
    else {
      lVar3 = *(long *)plVar5[4];
      *(long *)plVar5[4] = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f08();
      }
      plVar5 = plVar5 + 5;
      lVar3 = *(long *)*plVar5;
      *(long *)*plVar5 = lVar3 + -1;
      LORelease();
      if (lVar3 != 1) {
        return;
      }
      DataMemoryBarrier(2,1);
      plVar6 = (long *)(unaff_x19 + 0xa8);
    }
  }
  *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(long *)((long)register0x00000008 + -0x28) = unaff_x21;
  *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long **)((long)register0x00000008 + -0x18) = plVar6;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
  lVar3 = *plVar5;
  puVar1 = (undefined8 *)plVar5[1];
  uVar7 = puVar1[2];
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(lVar3 + (uVar7 - 1 & 0xfffffffffffffff0) + 0x10);
  }
  if (lVar3 != -1) {
    lVar4 = *(long *)(lVar3 + 8);
    *(long *)(lVar3 + 8) = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      if (uVar7 < 9) {
        uVar7 = 8;
      }
      uVar7 = uVar7 + puVar1[1] + 0xf & -uVar7;
      if (uVar7 != 0) {
        *(undefined8 *)((long)register0x00000008 + -0x10) =
             *(undefined8 *)((long)register0x00000008 + -0x10);
        *(undefined8 *)((long)register0x00000008 + -8) =
             *(undefined8 *)((long)register0x00000008 + -8);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar3,uVar7);
        return;
      }
    }
  }
  return;
}

