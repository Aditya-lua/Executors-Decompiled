
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */

void FUN_00736080(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  uint uVar7;
  undefined4 uVar8;
  long unaff_x19;
  long unaff_x20;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar14 [16];
  long in_stack_00000000;
  ulong in_stack_00000008;
  long *in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong uStack_40;
  undefined8 uStack_8;
  
  func_0x0073cbdc();
  if (((*(byte *)(unaff_x20 + 100) >> 1 & 1) == 0) ||
     (uVar9 = (ulong)*(uint *)(unaff_x20 + 0x5c), *(uint *)(unaff_x20 + 0x5c) == 0)) {
    uVar9 = 7;
  }
  uVar7 = (uint)*(ulong *)(unaff_x25 + 0x398);
  if ((uVar7 >> 1 & 1) == 0) {
    if ((*(ulong *)(unaff_x25 + 0x398) & 1) == 0) {
      if ((uVar7 >> 8 & 1) == 0) {
        plVar2 = (long *)(unaff_x25 + 0x68);
      }
      else {
        plVar2 = (long *)(unaff_x25 + 0x98);
      }
    }
    else {
      plVar2 = (long *)(unaff_x25 + 0xf0);
    }
  }
  else {
    plVar2 = (long *)(unaff_x25 + 0xb8);
  }
  lVar10 = *plVar2;
  uVar13 = (ulong)*(uint *)(unaff_x25 + 0x174);
  plVar2 = (long *)func_0x00782dc4();
  in_stack_00000018 = func_0x0077e9f4(uVar9);
  in_stack_00000000 = lVar10;
  in_stack_00000008 = uVar13;
  in_stack_00000010 = plVar2;
  func_0x0073c9e4();
  uVar8 = 0x1c;
  if (*(int *)(unaff_x19 + 0xc54) != 0x3c) {
    uVar8 = (undefined4)uVar9;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  auVar14 = ___stack_chk_fail(uVar8);
  lVar6 = auVar14._8_8_;
  plVar3 = auVar14._0_8_;
  uStack_8 = &DAT_0073612c;
  lVar1 = (long)register0x00000008 + -0x10;
  lVar11 = plVar3[2];
  lVar12 = lVar11;
  uStack_40 = uVar13;
  if ((((lVar6 != 0) && (*(char *)(lVar6 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar6 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar6 + 0x18) + 8))))) && (0 < *(int *)(*plVar3 + 0xc))) {
    func_0x0073cbdc(lVar6,plVar3,"close");
    lVar12 = plVar3[2];
  }
  uVar13 = *(ulong *)(lVar12 + 0x20);
  if (uVar13 != 0) {
    plVar4 = (long *)(uVar13 + 0x28);
    if (*plVar4 != 0) {
      uStack_8 = &UNK_007361c8;
      register0x00000008 = (BADSPACEBASE *)&uStack_40;
      unaff_x19 = lVar6;
      plVar2 = plVar3;
      uVar9 = uVar13;
      lVar10 = lVar11;
      unaff_x29 = lVar1;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(uVar13);
  }
  *(undefined8 *)(lVar12 + 0x20) = 0;
  uVar13 = *(ulong *)(lVar12 + 0x28);
  if (uVar13 != 0) {
    plVar4 = (long *)(uVar13 + 0x28);
    if (*plVar4 != 0) {
      uStack_8 = &UNK_007361f4;
      register0x00000008 = (BADSPACEBASE *)&uStack_40;
      unaff_x19 = lVar6;
      plVar2 = plVar3;
      uVar9 = uVar13;
      lVar10 = lVar11;
      unaff_x29 = lVar1;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(uVar13);
  }
  *(undefined8 *)(lVar12 + 0x28) = 0;
  uVar13 = *(ulong *)(lVar12 + 0x30);
  if (uVar13 != 0) {
    plVar4 = (long *)(uVar13 + 0x28);
    if (*plVar4 != 0) {
      uStack_8 = &UNK_00736220;
      register0x00000008 = (BADSPACEBASE *)&uStack_40;
      unaff_x19 = lVar6;
      plVar2 = plVar3;
      uVar9 = uVar13;
      lVar10 = lVar11;
      unaff_x29 = lVar1;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(uVar13);
  }
  *(undefined8 *)(lVar12 + 0x30) = 0;
  plVar4 = plVar3 + 1;
  plVar5 = (long *)*plVar4;
  *(byte *)((long)plVar3 + 0x24) = *(byte *)((long)plVar3 + 0x24) & 0xfe;
  *(undefined4 *)(lVar11 + 0x18) = 0;
  if (plVar5 == (long *)0x0) {
    return;
  }
  (**(code **)(*plVar5 + 0x20))(plVar5,lVar6);
code_r0x00730b28:
  *(long *)((long)register0x00000008 + -0x30) = lVar10;
  *(ulong *)((long)register0x00000008 + -0x28) = uVar9;
  *(long **)((long)register0x00000008 + -0x20) = plVar2;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
  plVar2 = (long *)*plVar4;
  if (plVar2 != (long *)0x0) {
    *plVar4 = 0;
    do {
      plVar3 = (long *)plVar2[1];
      plVar2[1] = 0;
      (**(code **)(*plVar2 + 0x10))(plVar2,lVar6);
      (*pcRam0000000000a2b5f0)(plVar2);
      plVar2 = plVar3;
    } while (plVar3 != (long *)0x0);
  }
  return;
}

