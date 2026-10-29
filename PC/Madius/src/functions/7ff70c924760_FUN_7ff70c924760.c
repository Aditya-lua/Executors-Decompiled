/* 7ff70c924760 FUN_7ff70c924760 */

/* WARNING: Instruction at (ram,0x7ff70c9247da) overlaps instruction at (ram,0x7ff70c9247d9)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c924760(longlong param_1)

{
  char *pcVar1;
  int iVar2;
  code *pcVar3;
  longlong lVar4;
  longlong lVar5;
  undefined1 *puVar6;
  longlong unaff_RBX;
  longlong *plVar7;
  ulonglong *unaff_RDI;
  ulonglong *puVar8;
  longlong lVar9;
  ulonglong uVar10;
  longlong lStack_78;
  undefined1 auStack_70 [60];
  undefined1 auStack_34 [4];
  undefined8 uStack_30;
  
  uStack_30 = 0xfffffffffffffffe;
  puVar6 = auStack_34;
  func_0x7ff70d990037();
  lVar4 = func_0x7ff68fafd2d2();
  lVar5 = lStack_78;
  pcVar1 = (char *)(lVar4 + -0x77);
  *pcVar1 = *pcVar1 + (char)puVar6;
  plVar7 = (longlong *)auStack_70;
  if (puVar6 == (undefined1 *)0x1 || *pcVar1 == '\0') {
    puVar8 = (ulonglong *)(ulonglong)_DAT_7ff70cb95d78;
    uVar10 = *puVar8;
    if (uVar10 == 0) {
      lVar4 = lStack_78 + -0x24;
      lStack_78 = 0;
      func_0x7ff70d67d70f(lVar4);
      plVar7 = &lStack_78;
      if (*puVar8 == 0) {
        iVar2 = *_DAT_7ff70cb95c28;
        *_DAT_7ff70cb95c28 = (int)((longlong)iVar2 + 1U);
        *puVar8 = (longlong)iVar2 + 1U;
        plVar7 = &lStack_78;
      }
      goto LAB_7ff70c9247d0;
    }
    lVar4 = *(longlong *)(param_1 + 8);
    plVar7 = (longlong *)auStack_70;
    puVar6 = auStack_70;
    if (uVar10 < *(ulonglong *)(lVar4 + 0x18)) goto LAB_7ff70c9247e7;
  }
  else {
    uVar10 = *unaff_RDI;
LAB_7ff70c9247d0:
    lVar4 = lVar5 + -0x24;
    *(undefined **)((longlong)plVar7 + -8) = &UNK_7ff70c9247d9;
    func_0x7ff70d82d93e();
    pcVar1 = (char *)(unaff_RBX + 0x37 + lVar4 * 4);
    *pcVar1 = *pcVar1 + -1;
    lVar4 = *(longlong *)(param_1 + 8);
    puVar6 = (undefined1 *)plVar7;
    if (uVar10 < *(ulonglong *)(lVar4 + 0x18)) {
LAB_7ff70c9247e7:
      lVar9 = *(longlong *)(*(longlong *)(lVar4 + 0x10) + uVar10 * 8);
      puVar6 = (undefined1 *)plVar7;
      if (lVar9 != 0) goto LAB_7ff70c924851;
    }
  }
  plVar7 = (longlong *)puVar6;
  if (*(char *)(lVar4 + 0x24) == '\x01') {
    *(undefined8 *)((longlong)plVar7 + -8) = 0x7ff70c9247ff;
    lVar4 = FUN_7ff70cb124a0();
    if (uVar10 < *(ulonglong *)(lVar4 + 0x18)) {
      lVar4 = *(longlong *)(lVar4 + 0x10);
      lVar9 = *(longlong *)(lVar4 + uVar10 * 8);
      if (lVar9 != 0) goto LAB_7ff70c924851;
    }
  }
  lVar9 = unaff_RBX;
  if (unaff_RBX == 0) {
    *(undefined8 *)((longlong)plVar7 + -8) = 0x7ff70c924827;
    lVar4 = FUN_7ff70c924a70(lVar5 + -0x20,param_1);
    if (lVar4 == -1) {
      *(undefined8 *)((longlong)plVar7 + -8) = 0x7ff70c92486e;
      FUN_7ff70ca320b0();
      pcVar3 = (code *)swi(3);
      lVar5 = (*pcVar3)();
      return lVar5;
    }
    *(undefined8 *)(lVar5 + -0x18) = *(undefined8 *)(lVar5 + -0x20);
    *(undefined8 *)((longlong)plVar7 + -8) = 0x7ff70c92483b;
    FUN_7ff70caa5220();
    pcVar3 = *(code **)(**(longlong **)(lVar5 + -0x18) + 8);
    *(undefined8 *)((longlong)plVar7 + -8) = 0x7ff70c924846;
    lVar4 = (*pcVar3)();
    lVar9 = *(longlong *)(lVar5 + -0x20);
    _DAT_7ff70cc1ab10 = lVar9;
  }
LAB_7ff70c924851:
  *(longlong *)((longlong)plVar7 + -8) = lVar4;
  *(undefined8 *)((longlong)plVar7 + -0x10) = 0x7ff70c92485b;
  func_0x7ff70d58ca64(lVar5 + -0xc);
  return lVar9;
}


