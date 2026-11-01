
/* WARNING: Possible PIC construction at 0x0047a754: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a798: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */

void FUN_0047a728(void)

{
  undefined1 *puVar1;
  undefined1 in_ZR;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar6;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  while (!(bool)in_ZR) {
    unaff_x23 = unaff_x21 + 0x40;
    func_0x00488078(unaff_x21);
    unaff_x22 = unaff_x22 + -1;
    unaff_x21 = unaff_x23;
    in_ZR = unaff_x22 == 0;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    __Unwind_Resume();
    lVar3 = func_0x007a2668();
    uStack_8 = 0x47a764;
    puVar1 = auStack_a0;
    func_0x0047a214();
    plVar4 = (long *)(lVar3 + 0x40);
    lVar5 = *(long *)*plVar4;
    *(long *)*plVar4 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      uStack_8 = 0x47a79c;
      register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
      unaff_x19 = lVar3;
      unaff_x20 = 0xffffffffffffffff;
      unaff_x29 = puVar1 + 0x90;
    }
    else {
      plVar4 = (long *)(lVar3 + 0x48);
      lVar5 = *(long *)*plVar4;
      *(long *)*plVar4 = lVar5 + -1;
      LORelease();
      if (lVar5 != 1) {
        return;
      }
    }
    *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
    *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
    *(long *)((long)register0x00000008 + -0x30) = unaff_x22;
    *(long *)((long)register0x00000008 + -0x28) = unaff_x21;
    *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
    *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    lVar2 = *plVar4;
    lVar5 = *(long *)(lVar2 + 0x20) + 1;
    lVar3 = *(long *)(lVar2 + 0x18);
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x0059d298(lVar3);
      lVar3 = lVar3 + 0x108;
    }
    plVar4 = (long *)(lVar2 + 0x10);
    if (*plVar4 == 0) {
      lVar5 = 0x28;
      unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
      puVar6 = *(undefined **)((long)register0x00000008 + -8);
    }
    else {
      lVar2 = *(long *)(lVar2 + 0x18);
      lVar5 = *plVar4 * 0x108;
      puVar6 = &UNK_005d2cc8;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
    }
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0x28);
    lVar5 = *(long *)(unaff_x19 + 0x20) << 6;
    puVar6 = (undefined *)0x47a758;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar5,8);
  return;
}

