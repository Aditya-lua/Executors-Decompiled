
void FUN_006ecfb8(undefined8 param_1,undefined8 param_2,long *param_3,undefined8 param_4)

{
  char *pcVar1;
  long ***ppplVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  ulong uVar11;
  int iVar12;
  long lVar13;
  long unaff_x20;
  long *plVar14;
  undefined8 *puVar15;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  long ***ppplVar16;
  undefined1 auVar17 [16];
  undefined1 ***pppuStack_d0;
  undefined8 uStack_c8;
  long *plStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined1 **ppuStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long *plStack_70;
  undefined8 uStack_68;
  undefined1 *puStack_60;
  undefined *puStack_58;
  undefined8 uStack_50;
  char *pcStack_48;
  undefined8 uStack_40;
  undefined1 auStack_6 [6];
  
  lVar3 = func_0x006fe8d4();
  if (unaff_x20 == lVar3) {
    func_0x006eceb0();
  }
  uVar4 = func_0x006eceb0();
  plVar14 = param_3;
  uVar5 = func_0x006fe8d4();
  uStack_40 = func_0x006fe8d4(uVar4,param_3);
  pcVar1 = "<=";
  if ((int)param_4 != 0x11) {
    pcVar1 = "==";
  }
  pcStack_48 = "<";
  if ((int)param_4 != 0x10) {
    pcStack_48 = pcVar1;
  }
  uStack_50 = uVar5;
  uVar6 = func_0x006eceb0(uVar4,"attempt to compare %s %s %s");
  puStack_58 = &DAT_006ed074;
  plVar10 = plVar14;
  uStack_80 = uVar5;
  uStack_78 = uVar4;
  plStack_70 = param_3;
  uStack_68 = param_4;
  puStack_60 = auStack_6 + -10;
  uVar4 = func_0x006fe8d4();
  lStack_88 = func_0x006fe8d4(uVar6,plVar14);
  if (((*(int *)((long)plVar14 + 0xc) == 5) && (lVar3 = *plVar14, lVar3 != 0)) &&
     (*(uint *)(lVar3 + 0x14) < 0x41)) {
    lStack_88 = lVar3 + 0x18;
    uStack_90 = uVar4;
    lStack_88 = func_0x006eceb0(uVar6,"attempt to index %s with \'%s\'");
  }
  uStack_90 = uVar4;
  uVar7 = func_0x006eceb0(uVar6,"attempt to index %s with %s");
  uStack_98 = 0x6ed0f0;
  uStack_b0 = uVar4;
  uStack_a8 = uVar6;
  ppuStack_a0 = &puStack_60;
  uStack_b8 = func_0x006fe8d4();
  plStack_c0 = plVar10 + 3;
  uVar6 = func_0x006eceb0(uVar7,"attempt to call missing method \'%s\' of %s");
  ppplVar16 = (long ***)&pppuStack_d0;
  uStack_c8 = 0x6ed124;
  uVar4 = 0x6ed138;
  pppuStack_d0 = &ppuStack_a0;
  auVar17 = func_0x006eceb0(uVar6,"attempt to modify a readonly table");
  ppplVar2 = (long ***)&pppuStack_d0;
  do {
    lVar8 = auVar17._8_8_;
    lVar3 = auVar17._0_8_;
    *(undefined8 *)((long)ppplVar2 + -0x30) = uVar5;
    *(long **)((long)ppplVar2 + -0x28) = plVar14;
    *(undefined8 *)((long)ppplVar2 + -0x20) = uVar7;
    *(long **)((long)ppplVar2 + -0x18) = plVar10;
    *(long ****)((long)ppplVar2 + -0x10) = ppplVar16;
    *(undefined8 *)((long)ppplVar2 + -8) = uVar4;
    *(undefined8 *)((long)ppplVar2 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    plVar14 = *(long **)(lVar3 + 0x20);
    if ((*(int *)(plVar14[1] + 0xc) == 7) &&
       (lVar9 = *(long *)plVar14[1], *(char *)(lVar9 + 3) == '\0')) {
      plVar10 = (long *)(*(long *)(lVar9 + 0x18) + 0x58);
      lVar9 = *plVar10 - (long)plVar10;
      uVar4 = func_0x006f4f8c((undefined1 *)((long)ppplVar2 + -0x138),0x100,lVar9 + 0x18,
                              *(undefined4 *)(lVar9 + 0x14));
      lVar13 = plVar14[3];
      lVar9 = *(long *)(*(long *)plVar14[1] + 0x18);
      iVar12 = 0;
      if (lVar13 != 0) {
        iVar12 = 0;
        if (*(long *)(lVar9 + 0x10) != lVar13) {
          iVar12 = (int)((ulong)(lVar13 - *(long *)(lVar9 + 0x10)) >> 2) + -1;
        }
      }
      lVar13 = *(long *)(lVar9 + 0x38) - (lVar9 + 0x38);
      if (lVar13 == 0) {
        uVar11 = 0;
      }
      else {
        uVar11 = (ulong)(*(int *)((*(ulong *)(lVar9 + 0x40U) ^ lVar9 + 0x40U) +
                                 (long)(iVar12 >> (*(uint *)(lVar9 + 0xa0) & 0x1f)) * 4) +
                        (uint)*(byte *)(lVar13 + iVar12));
      }
      *(ulong *)((long)ppplVar2 + -0x148) = uVar11;
      *(long *)((long)ppplVar2 + -0x140) = lVar8;
      *(undefined8 *)((long)ppplVar2 + -0x150) = uVar4;
      func_0x006f4ebc(lVar3,"%s:%d: %s");
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)ppplVar2 + -0x38)) {
        return;
      }
    }
    else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)ppplVar2 + -0x38)) {
      *(undefined8 *)((long)ppplVar2 + -0x40) = unaff_x24;
      *(undefined8 *)((long)ppplVar2 + -0x38) = unaff_x23;
      *(undefined8 *)((long)ppplVar2 + -0x30) = *(undefined8 *)((long)ppplVar2 + -0x30);
      *(undefined8 *)((long)ppplVar2 + -0x28) = *(undefined8 *)((long)ppplVar2 + -0x28);
      *(undefined8 *)((long)ppplVar2 + -0x20) = *(undefined8 *)((long)ppplVar2 + -0x20);
      *(undefined8 *)((long)ppplVar2 + -0x18) = *(undefined8 *)((long)ppplVar2 + -0x18);
      *(undefined8 *)((long)ppplVar2 + -0x10) = *(undefined8 *)((long)ppplVar2 + -0x10);
      *(undefined8 *)((long)ppplVar2 + -8) = *(undefined8 *)((long)ppplVar2 + -8);
      if (lVar8 == 0) {
        lVar8 = *(long *)(lVar3 + 8);
        *(undefined4 *)(lVar8 + 0xc) = 0;
      }
      else {
        uVar4 = _strlen(lVar8);
        if (*(ulong *)(*(long *)(lVar3 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar3 + 0x18) + 0x48)
           ) {
          func_0x006efe90(lVar3,1);
        }
        if ((*(byte *)(lVar3 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4(lVar3,lVar3,lVar3 + 0x68);
        }
        puVar15 = *(undefined8 **)(lVar3 + 8);
        uVar4 = func_0x006f6ef8(lVar3,lVar8,uVar4);
        *puVar15 = uVar4;
        *(undefined4 *)((long)puVar15 + 0xc) = 5;
        lVar8 = *(long *)(lVar3 + 8);
      }
      *(long *)(lVar3 + 8) = lVar8 + 0x10;
      return;
    }
    auVar17 = ___stack_chk_fail();
    *(long *)((long)ppplVar2 + -0x170) = lVar8;
    *(long *)((long)ppplVar2 + -0x168) = lVar3;
    *(undefined1 **)((long)ppplVar2 + -0x160) = (undefined1 *)((long)ppplVar2 + -0x10);
    *(undefined8 *)((long)ppplVar2 + -0x158) = 0x6ed280;
    func_0x006e188c(auVar17._0_8_,1);
    ppplVar16 = *(long ****)((long)ppplVar2 + -0x160);
    uVar4 = *(undefined8 *)((long)ppplVar2 + -0x158);
    uVar7 = *(undefined8 *)((long)ppplVar2 + -0x170);
    plVar10 = *(long **)((long)ppplVar2 + -0x168);
    ppplVar2 = (long ***)((long)ppplVar2 + -0x150);
  } while( true );
}

