
/* WARNING: Possible PIC construction at 0x006e76c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e771c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e7940: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e7854: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006e7944) */
/* WARNING: Removing unreachable block (ram,0x006e76cc) */
/* WARNING: Removing unreachable block (ram,0x006e7858) */

void FUN_006e7484(undefined8 param_1,char *param_2)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined4 uVar5;
  int iVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  char *pcVar11;
  float *pfVar12;
  undefined2 *puVar13;
  undefined8 uVar14;
  undefined1 *puVar15;
  long lVar16;
  ulong uVar17;
  undefined1 *puVar18;
  ulong uVar19;
  ulong unaff_x19;
  long lVar20;
  undefined1 *puVar21;
  long *unaff_x20;
  char *unaff_x21;
  undefined8 *puVar22;
  long unaff_x22;
  long *unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long *unaff_x27;
  undefined8 unaff_x28;
  undefined1 *puVar23;
  undefined1 *unaff_x29;
  undefined *puVar24;
  undefined1 auVar25 [16];
  
code_r0x006e7484:
  plVar7 = (long *)func_0x006e644c(unaff_x22,param_2 + 0xd4c);
  puVar4 = (undefined1 *)((long)register0x00000008 + -0x70);
  *(undefined8 *)((long)register0x00000008 + -0x60) = unaff_x28;
  *(long **)((long)register0x00000008 + -0x58) = unaff_x27;
  *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(undefined8 *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(long **)((long)register0x00000008 + -0x38) = unaff_x23;
  *(long *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(long **)((long)register0x00000008 + -0x20) = unaff_x20;
  *(ulong *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = 0x6e7490;
  lVar20 = plVar7[2];
  lVar8 = func_0x006e2ce4(lVar20,0xffffffff,(undefined1 *)((long)register0x00000008 + -0x68));
  if (lVar8 == 0) {
    return;
  }
  lVar16 = *plVar7;
  puVar15 = *(undefined1 **)((long)register0x00000008 + -0x68);
  puVar18 = (undefined1 *)(plVar7[1] - lVar16);
  lVar3 = (long)puVar15 - (long)puVar18;
  if (puVar15 < puVar18 || lVar3 == 0) {
LAB_006e7584:
    _memcpy(lVar16,lVar8,puVar15);
    *plVar7 = *plVar7 + *(long *)((long)register0x00000008 + -0x68);
    func_0x006e1d54(lVar20,0xfffffffe);
    return;
  }
  puVar18 = (undefined1 *)plVar7[2];
  plVar1 = plVar7 + 4;
  plVar2 = plVar1;
  if (plVar7[3] != 0) {
    plVar2 = (long *)(plVar7[3] + 0x18);
  }
  uVar19 = plVar7[1] - (long)plVar2;
  uVar17 = uVar19 + lVar3;
  if (!CARRY8(uVar17,uVar19)) {
    uVar19 = uVar19 + (uVar19 >> 1);
    if (uVar19 <= uVar17) {
      uVar19 = uVar17;
    }
    lVar9 = func_0x006f6c20(puVar18,uVar19);
    lVar3 = lVar9 + 0x18;
    _memcpy(lVar3,plVar2,*plVar7 - (long)plVar2);
    if (plVar2 == plVar1) {
      func_0x006e383c(puVar18);
      func_0x006e1ee0(puVar18,0xfffffffe);
    }
    lVar16 = *(long *)(puVar18 + 8);
    *(long *)(lVar16 + -0x20) = lVar9;
    *(undefined4 *)(lVar16 + -0x14) = 5;
    lVar16 = lVar3 + (*plVar7 - (long)plVar2);
    *plVar7 = lVar16;
    plVar7[1] = lVar3 + uVar19;
    plVar7[3] = lVar9;
    puVar15 = *(undefined1 **)((long)register0x00000008 + -0x68);
    goto LAB_006e7584;
  }
  auVar25 = func_0x006e644c(puVar18,"buffer too large");
  puVar21 = auVar25._8_8_;
  unaff_x20 = auVar25._0_8_;
  *(undefined1 **)((long)register0x00000008 + -0xa0) = puVar18;
  *(long *)((long)register0x00000008 + -0x98) = lVar8;
  *(long **)((long)register0x00000008 + -0x90) = plVar7;
  *(long *)((long)register0x00000008 + -0x88) = lVar20;
  *(undefined1 **)((long)register0x00000008 + -0x80) =
       (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x78) = &DAT_006e75d8;
  puVar23 = (undefined1 *)((long)register0x00000008 + -0x80);
  *(undefined8 *)((long)register0x00000008 + -0xa8) = *(undefined8 *)PTR____stack_chk_guard_009b01e8
  ;
  lVar8 = unaff_x20[2];
  auVar25._8_8_ = puVar21;
  auVar25._0_8_ = lVar8;
  uVar5 = func_0x006e21f8(lVar8);
  switch(uVar5) {
  case 0:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0xa8)) {
      unaff_x21 = "nil";
      unaff_x19 = 3;
      puVar23 = *(undefined1 **)((long)register0x00000008 + -0x80);
      puVar24 = *(undefined **)((long)register0x00000008 + -0x78);
      puVar21 = *(undefined1 **)((long)register0x00000008 + -0x90);
      plVar7 = *(long **)((long)register0x00000008 + -0x88);
      puVar18 = *(undefined1 **)((long)register0x00000008 + -0xa0);
      lVar8 = *(long *)((long)register0x00000008 + -0x98);
      goto code_r0x006e7378;
    }
    break;
  case 1:
    iVar6 = func_0x006e2c48(lVar8,puVar21);
    if (iVar6 == 0) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0xa8)) {
        unaff_x21 = "false";
        unaff_x19 = 5;
        puVar23 = *(undefined1 **)((long)register0x00000008 + -0x80);
        puVar24 = *(undefined **)((long)register0x00000008 + -0x78);
        puVar21 = *(undefined1 **)((long)register0x00000008 + -0x90);
        plVar7 = *(long **)((long)register0x00000008 + -0x88);
        puVar18 = *(undefined1 **)((long)register0x00000008 + -0xa0);
        lVar8 = *(long *)((long)register0x00000008 + -0x98);
        puVar4 = (undefined1 *)((long)register0x00000008 + -0x70);
        goto code_r0x006e7378;
      }
      break;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)((long)register0x00000008 + -0xa8))
    break;
    unaff_x21 = "true";
    unaff_x19 = 4;
    puVar23 = *(undefined1 **)((long)register0x00000008 + -0x80);
    puVar24 = *(undefined **)((long)register0x00000008 + -0x78);
    puVar21 = *(undefined1 **)((long)register0x00000008 + -0x90);
    plVar7 = *(long **)((long)register0x00000008 + -0x88);
    puVar18 = *(undefined1 **)((long)register0x00000008 + -0xa0);
    lVar8 = *(long *)((long)register0x00000008 + -0x98);
    puVar4 = (undefined1 *)((long)register0x00000008 + -0x70);
    goto code_r0x006e7378;
  default:
    puVar15 = (undefined1 *)((long)register0x00000008 + -0xd8);
    puVar24 = &UNK_006e76cc;
    goto code_r0x006e778c;
  case 3:
    func_0x006e29f0(lVar8,puVar21,0);
    puVar21 = (undefined1 *)((long)register0x00000008 + -0xd8);
    lVar20 = func_0x006f45d8((undefined1 *)((long)register0x00000008 + -0xd8));
    unaff_x19 = lVar20 - (long)puVar21;
    unaff_x21 = (char *)((long)register0x00000008 + -0xd8);
    goto code_r0x006e7718;
  case 5:
    unaff_x21 = (char *)func_0x006e2ce4(lVar8,puVar21,
                                        (undefined1 *)((long)register0x00000008 + -0xd8));
    unaff_x19 = *(ulong *)((long)register0x00000008 + -0xd8);
code_r0x006e7718:
    puVar24 = &UNK_006e7720;
    puVar4 = (undefined1 *)((long)register0x00000008 + -0xe0);
    plVar7 = unaff_x20;
code_r0x006e7378:
    register0x00000008 = (BADSPACEBASE *)(puVar4 + -0x60);
    *(undefined8 *)(puVar4 + -0x60) = unaff_x28;
    *(long **)(puVar4 + -0x58) = plVar1;
    *(undefined8 *)(puVar4 + -0x50) = unaff_x26;
    *(undefined8 *)(puVar4 + -0x48) = unaff_x25;
    *(undefined8 *)(puVar4 + -0x40) = unaff_x24;
    *(long **)(puVar4 + -0x38) = plVar2;
    *(undefined1 **)(puVar4 + -0x30) = puVar18;
    *(long *)(puVar4 + -0x28) = lVar8;
    *(undefined1 **)(puVar4 + -0x20) = puVar21;
    *(long **)(puVar4 + -0x18) = plVar7;
    *(undefined1 **)(puVar4 + -0x10) = puVar23;
    *(undefined **)(puVar4 + -8) = puVar24;
    unaff_x29 = puVar4 + -0x10;
    lVar8 = *unaff_x20;
    uVar17 = unaff_x20[1] - lVar8;
    lVar20 = unaff_x19 - uVar17;
    if (unaff_x19 < uVar17 || lVar20 == 0) {
code_r0x006e744c:
      _memcpy(lVar8,unaff_x21,unaff_x19);
      *unaff_x20 = *unaff_x20 + unaff_x19;
      return;
    }
    unaff_x22 = unaff_x20[2];
    unaff_x27 = unaff_x20 + 4;
    unaff_x23 = unaff_x27;
    if (unaff_x20[3] != 0) {
      unaff_x23 = (long *)(unaff_x20[3] + 0x18);
    }
    uVar19 = unaff_x20[1] - (long)unaff_x23;
    uVar17 = uVar19 + lVar20;
    if (!CARRY8(uVar17,uVar19)) {
      uVar19 = uVar19 + (uVar19 >> 1);
      if (uVar19 <= uVar17) {
        uVar19 = uVar17;
      }
      lVar16 = func_0x006f6c20(unaff_x22,uVar19);
      lVar20 = lVar16 + 0x18;
      _memcpy(lVar20,unaff_x23,*unaff_x20 - (long)unaff_x23);
      if (unaff_x23 == unaff_x27) {
        func_0x006e383c(unaff_x22);
        func_0x006e1ee0(unaff_x22,0xffffffff);
      }
      lVar8 = *(long *)(unaff_x22 + 8);
      *(long *)(lVar8 + -0x10) = lVar16;
      *(undefined4 *)(lVar8 + -4) = 5;
      lVar8 = lVar20 + (*unaff_x20 - (long)unaff_x23);
      *unaff_x20 = lVar8;
      unaff_x20[1] = lVar20 + uVar19;
      unaff_x20[3] = lVar16;
      goto code_r0x006e744c;
    }
    param_2 = "[inext]";
    goto code_r0x006e7484;
  case 0xffffffff:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0xa8)) {
      return;
    }
  }
  puVar24 = &DAT_006e778c;
  auVar25 = ___stack_chk_fail();
code_r0x006e778c:
  uVar14 = auVar25._8_8_;
  lVar20 = auVar25._0_8_;
  *(undefined8 *)((long)register0x00000008 + -0x120) = unaff_x24;
  *(long **)((long)register0x00000008 + -0x118) = plVar2;
  *(undefined1 **)((long)register0x00000008 + -0x110) = puVar18;
  *(long *)((long)register0x00000008 + -0x108) = lVar8;
  *(undefined1 **)((long)register0x00000008 + -0x100) = puVar21;
  *(long **)((long)register0x00000008 + -0xf8) = unaff_x20;
  *(undefined1 **)((long)register0x00000008 + -0xf0) = puVar23;
  *(undefined **)((long)register0x00000008 + -0xe8) = puVar24;
  puVar4 = (undefined1 *)((long)register0x00000008 + -0xf0);
  *(undefined8 *)((long)register0x00000008 + -0x128) =
       *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  iVar6 = func_0x006e6e44(lVar20,uVar14,"__tostring");
  if (iVar6 != 0) {
    lVar8 = func_0x006e2ce4(lVar20,0xffffffff,puVar15);
    if (lVar8 != 0) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x128))
      {
        return;
      }
      goto code_r0x006e799c;
    }
    goto code_r0x006e79a0;
  }
  uVar5 = func_0x006e21f8(lVar20,uVar14);
  switch(uVar5) {
  case 0:
    pcVar11 = "nil";
    lVar8 = 3;
    puVar24 = &UNK_006e7858;
    goto code_r0x006e38d8;
  case 1:
    iVar6 = func_0x006e2c48(lVar20,uVar14);
    pcVar11 = "false";
    if (iVar6 != 0) {
      pcVar11 = "true";
    }
    func_0x006e3964(lVar20,pcVar11);
    break;
  default:
    uVar10 = func_0x006e3790(lVar20,uVar14);
    puVar18 = (undefined1 *)func_0x006e5bac(lVar20,uVar10);
    lVar8 = func_0x006e1710(lVar20,uVar14);
    if (lVar8 == 0) {
      pcVar11 = "no value";
    }
    else {
      pcVar11 = (char *)func_0x006fe8d4(lVar20,lVar8);
    }
    *(char **)((long)register0x00000008 + -0x1d0) = pcVar11;
    *(undefined1 **)((long)register0x00000008 + -0x1c8) = puVar18;
    func_0x006e3a84(lVar20,"%s: 0x%016llx");
    break;
  case 3:
    func_0x006e29f0(lVar20,uVar14,0);
    pfVar12 = (float *)((long)register0x00000008 + -0x1b8);
    lVar8 = func_0x006f45d8((undefined1 *)((long)register0x00000008 + -0x1b8));
    lVar8 = lVar8 - (long)pfVar12;
    goto code_r0x006e7938;
  case 4:
    pfVar12 = (float *)func_0x006e30bc(lVar20,uVar14);
    puVar18 = (undefined1 *)((long)register0x00000008 + -0x1b8);
    puVar13 = (undefined2 *)
              func_0x006f45d8((double)*pfVar12,(undefined1 *)((long)register0x00000008 + -0x1b8));
    *puVar13 = 0x202c;
    puVar13 = (undefined2 *)func_0x006f45d8((double)pfVar12[1],puVar13 + 1);
    *puVar13 = 0x202c;
    lVar8 = func_0x006f45d8((double)pfVar12[2],puVar13 + 1);
    lVar8 = lVar8 - (long)puVar18;
code_r0x006e7938:
    auVar25._8_8_ = pfVar12;
    auVar25._0_8_ = lVar20;
    pcVar11 = (char *)((long)register0x00000008 + -0x1b8);
    puVar24 = &UNK_006e7944;
    goto code_r0x006e38d8;
  case 5:
    func_0x006e2154(lVar20,uVar14);
  }
  func_0x006e2ce4(lVar20,0xffffffff,puVar15);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x128)) {
    return;
  }
code_r0x006e799c:
  ___stack_chk_fail();
code_r0x006e79a0:
  plVar7 = (long *)func_0x006e644c(lVar20,"\'__tostring\' must return a string");
  *(undefined1 **)((long)register0x00000008 + -0x200) = puVar18;
  *(undefined8 *)((long)register0x00000008 + -0x1f8) = uVar14;
  *(undefined1 **)((long)register0x00000008 + -0x1f0) = puVar15;
  *(long *)((long)register0x00000008 + -0x1e8) = lVar20;
  *(undefined1 **)((long)register0x00000008 + -0x1e0) = puVar4;
  *(undefined **)((long)register0x00000008 + -0x1d8) = &DAT_006e79b0;
  lVar20 = plVar7[2];
  lVar8 = plVar7[3];
  if (lVar8 != 0) {
    if (*(ulong *)(*(long *)(lVar20 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar20 + 0x18) + 0x48))
    {
      func_0x006efe90(lVar20,1);
    }
    lVar16 = *(long *)(lVar20 + 8);
    if (*plVar7 == plVar7[1]) {
      uVar14 = func_0x006f6ca0(lVar20,lVar8);
    }
    else {
      uVar14 = func_0x006f6ef8(lVar20,lVar8 + 0x18,*plVar7 - (lVar8 + 0x18));
    }
    *(undefined8 *)(lVar16 + -0x10) = uVar14;
    *(undefined4 *)(lVar16 + -4) = 5;
    return;
  }
  pcVar11 = (char *)(plVar7 + 4);
  lVar8 = *plVar7 - (long)pcVar11;
  puVar4 = *(undefined1 **)((long)register0x00000008 + -0x1e0);
  puVar24 = *(undefined **)((long)register0x00000008 + -0x1d8);
  puVar15 = *(undefined1 **)((long)register0x00000008 + -0x1f0);
  puVar18 = *(undefined1 **)((long)register0x00000008 + -0x200);
  auVar25._8_8_ = *(undefined8 *)((long)register0x00000008 + -0x1f8);
  auVar25._0_8_ = *(undefined8 *)((long)register0x00000008 + -0x1e8);
code_r0x006e38d8:
  *(undefined1 **)((long)register0x00000008 + -0x200) = puVar18;
  *(long *)((long)register0x00000008 + -0x1f8) = auVar25._8_8_;
  *(undefined1 **)((long)register0x00000008 + -0x1f0) = puVar15;
  *(long *)((long)register0x00000008 + -0x1e8) = auVar25._0_8_;
  *(undefined1 **)((long)register0x00000008 + -0x1e0) = puVar4;
  *(undefined **)((long)register0x00000008 + -0x1d8) = puVar24;
  if (*(ulong *)(*(long *)(lVar20 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar20 + 0x18) + 0x48)) {
    func_0x006efe90(lVar20,1);
  }
  if ((*(byte *)(lVar20 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(lVar20,lVar20,lVar20 + 0x68);
  }
  puVar22 = *(undefined8 **)(lVar20 + 8);
  uVar14 = func_0x006f6ef8(lVar20,pcVar11,lVar8);
  *puVar22 = uVar14;
  *(undefined4 *)((long)puVar22 + 0xc) = 5;
  *(long *)(lVar20 + 8) = *(long *)(lVar20 + 8) + 0x10;
  return;
}

