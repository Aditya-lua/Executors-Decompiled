
/* WARNING: Possible PIC construction at 0x004bb998: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb9dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_004bb928(void)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar7;
  undefined8 uStack_20;
  undefined8 uStack_8;
  
  uVar2 = func_0x007a2668();
  lVar6 = unaff_x21 + 0x80;
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    lVar6 = lVar6 + 0x80;
    func_0x004cba68();
    unaff_x21 = lVar6;
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    __Unwind_Resume(uVar2);
    lVar4 = func_0x007a2668();
    uStack_8 = 0x4bb9a8;
    puVar1 = (undefined1 *)((long)register0x00000008 + -0x10);
    uStack_20 = uVar2;
    func_0x004bb4f4();
    plVar5 = (long *)(lVar4 + 0x40);
    lVar6 = *(long *)*plVar5;
    *(long *)*plVar5 = lVar6 + -1;
    LORelease();
    if (lVar6 == 1) {
      uStack_8 = 0x4bb9e0;
      register0x00000008 = (BADSPACEBASE *)&uStack_20;
      unaff_x19 = lVar4;
      uVar2 = 0xffffffffffffffff;
      unaff_x29 = puVar1;
    }
    else {
      plVar5 = (long *)(lVar4 + 0x48);
      lVar6 = *(long *)*plVar5;
      *(long *)*plVar5 = lVar6 + -1;
      LORelease();
      if (lVar6 != 1) {
        return;
      }
      uVar2 = uStack_20;
    }
    *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
    *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
    *(undefined8 *)((long)register0x00000008 + -0x30) = 0;
    *(long *)((long)register0x00000008 + -0x28) = unaff_x21;
    *(undefined8 *)((long)register0x00000008 + -0x20) = uVar2;
    *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    lVar3 = *plVar5;
    lVar6 = *(long *)(lVar3 + 0x20) + 1;
    lVar4 = *(long *)(lVar3 + 0x18);
    while (lVar6 = lVar6 + -1, lVar6 != 0) {
      func_0x0059d298(lVar4);
      lVar4 = lVar4 + 0x108;
    }
    plVar5 = (long *)(lVar3 + 0x10);
    if (*plVar5 == 0) {
      lVar6 = 0x28;
      unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
      puVar7 = *(undefined **)((long)register0x00000008 + -8);
    }
    else {
      lVar3 = *(long *)(lVar3 + 0x18);
      lVar6 = *plVar5 * 0x108;
      puVar7 = &UNK_005d2cc8;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
    }
  }
  else {
    lVar3 = *(long *)(unaff_x19 + 0x10);
    lVar6 = *(long *)(unaff_x19 + 8) << 7;
    puVar7 = (undefined *)0x4bb99c;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar6,8);
  return;
}

