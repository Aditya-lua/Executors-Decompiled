
void FUN_006ecf20(undefined8 param_1,undefined8 param_2,long *param_3,ulong param_4)

{
  char *pcVar1;
  undefined8 ***pppuVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long *plVar8;
  long lVar9;
  long extraout_x8;
  long lVar10;
  long *plVar11;
  ulong uVar12;
  int iVar13;
  long lVar14;
  long *plVar15;
  undefined8 *puVar16;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 ***pppuVar17;
  undefined1 auVar18 [16];
  undefined1 uStack0000000000000020;
  undefined8 ***pppuStack_160;
  undefined8 uStack_158;
  long *plStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 ***pppuStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  long lStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  long *plStack_100;
  ulong uStack_f8;
  undefined8 ***pppuStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  char *pcStack_d8;
  undefined8 uStack_d0;
  long *plStack_c0;
  ulong uStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  undefined1 ***pppuStack_a0;
  undefined8 uStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  undefined1 **ppuStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined1 *puStack_10;
  undefined8 uStack_8;
  
  func_0x006fe8d4();
  uVar3 = func_0x006eceb0(param_1,"invalid \'for\' %s (number expected, got %s)");
  uStack_8 = 0x6ecf44;
  plVar11 = param_3;
  puStack_10 = &uStack0000000000000020;
  uVar4 = func_0x006fe8d4();
  uStack_38 = func_0x006fe8d4(uVar3,param_3);
  uStack_40 = uVar4;
  uVar3 = func_0x006eceb0(uVar3,"attempt to concatenate %s with %s");
  uStack_48 = 0x6ecf88;
  plVar8 = plVar11;
  uVar12 = param_4;
  ppuStack_50 = &puStack_10;
  lVar5 = func_0x006fe8d4();
  lStack_80 = func_0x006fe8d4(uVar3,plVar11);
  lStack_90 = *(long *)(&UNK_00a1c9c0 + (param_4 & 0xffffffff) * 8) + 2;
  if (lVar5 == lStack_80) {
    lStack_88 = lVar5;
    lStack_80 = func_0x006eceb0(uVar3,"attempt to perform arithmetic (%s) on %s");
    lStack_90 = extraout_x8;
  }
  lStack_88 = lVar5;
  uVar4 = func_0x006eceb0(uVar3,"attempt to perform arithmetic (%s) on %s and %s");
  uStack_98 = 0x6ed000;
  plVar15 = plVar8;
  plStack_c0 = plVar11;
  uStack_b8 = param_4;
  lStack_b0 = lVar5;
  uStack_a8 = uVar3;
  pppuStack_a0 = &ppuStack_50;
  uVar3 = func_0x006fe8d4();
  uStack_d0 = func_0x006fe8d4(uVar4,plVar8);
  pcVar1 = "<=";
  if ((int)uVar12 != 0x11) {
    pcVar1 = "==";
  }
  pcStack_d8 = "<";
  if ((int)uVar12 != 0x10) {
    pcStack_d8 = pcVar1;
  }
  uStack_e0 = uVar3;
  uVar6 = func_0x006eceb0(uVar4,"attempt to compare %s %s %s");
  puStack_e8 = &DAT_006ed074;
  plVar11 = plVar15;
  uStack_110 = uVar3;
  uStack_108 = uVar4;
  plStack_100 = plVar8;
  uStack_f8 = uVar12;
  pppuStack_f0 = &pppuStack_a0;
  uVar4 = func_0x006fe8d4();
  lStack_118 = func_0x006fe8d4(uVar6,plVar15);
  if (((*(int *)((long)plVar15 + 0xc) == 5) && (lVar5 = *plVar15, lVar5 != 0)) &&
     (*(uint *)(lVar5 + 0x14) < 0x41)) {
    lStack_118 = lVar5 + 0x18;
    uStack_120 = uVar4;
    lStack_118 = func_0x006eceb0(uVar6,"attempt to index %s with \'%s\'");
  }
  uStack_120 = uVar4;
  uVar7 = func_0x006eceb0(uVar6,"attempt to index %s with %s");
  uStack_128 = 0x6ed0f0;
  uStack_140 = uVar4;
  uStack_138 = uVar6;
  pppuStack_130 = &pppuStack_f0;
  uStack_148 = func_0x006fe8d4();
  plStack_150 = plVar11 + 3;
  uVar6 = func_0x006eceb0(uVar7,"attempt to call missing method \'%s\' of %s");
  pppuVar17 = &pppuStack_160;
  uStack_158 = 0x6ed124;
  uVar4 = 0x6ed138;
  pppuStack_160 = &pppuStack_130;
  auVar18 = func_0x006eceb0(uVar6,"attempt to modify a readonly table");
  pppuVar2 = &pppuStack_160;
  do {
    lVar9 = auVar18._8_8_;
    lVar5 = auVar18._0_8_;
    *(undefined8 *)((long)pppuVar2 + -0x30) = uVar3;
    *(long **)((long)pppuVar2 + -0x28) = plVar15;
    *(undefined8 *)((long)pppuVar2 + -0x20) = uVar7;
    *(long **)((long)pppuVar2 + -0x18) = plVar11;
    *(undefined8 ****)((long)pppuVar2 + -0x10) = pppuVar17;
    *(undefined8 *)((long)pppuVar2 + -8) = uVar4;
    *(undefined8 *)((long)pppuVar2 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    plVar15 = *(long **)(lVar5 + 0x20);
    if ((*(int *)(plVar15[1] + 0xc) == 7) &&
       (lVar10 = *(long *)plVar15[1], *(char *)(lVar10 + 3) == '\0')) {
      plVar11 = (long *)(*(long *)(lVar10 + 0x18) + 0x58);
      lVar10 = *plVar11 - (long)plVar11;
      uVar4 = func_0x006f4f8c((undefined1 *)((long)pppuVar2 + -0x138),0x100,lVar10 + 0x18,
                              *(undefined4 *)(lVar10 + 0x14));
      lVar14 = plVar15[3];
      lVar10 = *(long *)(*(long *)plVar15[1] + 0x18);
      iVar13 = 0;
      if (lVar14 != 0) {
        iVar13 = 0;
        if (*(long *)(lVar10 + 0x10) != lVar14) {
          iVar13 = (int)((ulong)(lVar14 - *(long *)(lVar10 + 0x10)) >> 2) + -1;
        }
      }
      lVar14 = *(long *)(lVar10 + 0x38) - (lVar10 + 0x38);
      if (lVar14 == 0) {
        uVar12 = 0;
      }
      else {
        uVar12 = (ulong)(*(int *)((*(ulong *)(lVar10 + 0x40U) ^ lVar10 + 0x40U) +
                                 (long)(iVar13 >> (*(uint *)(lVar10 + 0xa0) & 0x1f)) * 4) +
                        (uint)*(byte *)(lVar14 + iVar13));
      }
      *(ulong *)((long)pppuVar2 + -0x148) = uVar12;
      *(long *)((long)pppuVar2 + -0x140) = lVar9;
      *(undefined8 *)((long)pppuVar2 + -0x150) = uVar4;
      func_0x006f4ebc(lVar5,"%s:%d: %s");
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)pppuVar2 + -0x38)) {
        return;
      }
    }
    else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)pppuVar2 + -0x38)) {
      *(undefined8 *)((long)pppuVar2 + -0x40) = unaff_x24;
      *(undefined8 *)((long)pppuVar2 + -0x38) = unaff_x23;
      *(undefined8 *)((long)pppuVar2 + -0x30) = *(undefined8 *)((long)pppuVar2 + -0x30);
      *(undefined8 *)((long)pppuVar2 + -0x28) = *(undefined8 *)((long)pppuVar2 + -0x28);
      *(undefined8 *)((long)pppuVar2 + -0x20) = *(undefined8 *)((long)pppuVar2 + -0x20);
      *(undefined8 *)((long)pppuVar2 + -0x18) = *(undefined8 *)((long)pppuVar2 + -0x18);
      *(undefined8 *)((long)pppuVar2 + -0x10) = *(undefined8 *)((long)pppuVar2 + -0x10);
      *(undefined8 *)((long)pppuVar2 + -8) = *(undefined8 *)((long)pppuVar2 + -8);
      if (lVar9 == 0) {
        lVar9 = *(long *)(lVar5 + 8);
        *(undefined4 *)(lVar9 + 0xc) = 0;
      }
      else {
        uVar3 = _strlen(lVar9);
        if (*(ulong *)(*(long *)(lVar5 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar5 + 0x18) + 0x48)
           ) {
          func_0x006efe90(lVar5,1);
        }
        if ((*(byte *)(lVar5 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4(lVar5,lVar5,lVar5 + 0x68);
        }
        puVar16 = *(undefined8 **)(lVar5 + 8);
        uVar3 = func_0x006f6ef8(lVar5,lVar9,uVar3);
        *puVar16 = uVar3;
        *(undefined4 *)((long)puVar16 + 0xc) = 5;
        lVar9 = *(long *)(lVar5 + 8);
      }
      *(long *)(lVar5 + 8) = lVar9 + 0x10;
      return;
    }
    auVar18 = ___stack_chk_fail();
    *(long *)((long)pppuVar2 + -0x170) = lVar9;
    *(long *)((long)pppuVar2 + -0x168) = lVar5;
    *(undefined1 **)((long)pppuVar2 + -0x160) = (undefined1 *)((long)pppuVar2 + -0x10);
    *(undefined8 *)((long)pppuVar2 + -0x158) = 0x6ed280;
    func_0x006e188c(auVar18._0_8_,1);
    pppuVar17 = *(undefined8 ****)((long)pppuVar2 + -0x160);
    uVar4 = *(undefined8 *)((long)pppuVar2 + -0x158);
    uVar7 = *(undefined8 *)((long)pppuVar2 + -0x170);
    plVar11 = *(long **)((long)pppuVar2 + -0x168);
    pppuVar2 = (undefined8 ***)((long)pppuVar2 + -0x150);
  } while( true );
}

