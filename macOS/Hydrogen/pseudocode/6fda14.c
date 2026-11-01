
/* WARNING: Possible PIC construction at 0x006e76c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e3924: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e771c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e7940: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e7854: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006e7944) */
/* WARNING: Removing unreachable block (ram,0x006e76cc) */
/* WARNING: Removing unreachable block (ram,0x006e7858) */

undefined1 * FUN_006fda14(void)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  int iVar4;
  undefined4 uVar5;
  undefined1 *puVar6;
  long lVar7;
  undefined1 *puVar8;
  dword *pdVar9;
  long lVar10;
  undefined1 *puVar11;
  undefined8 uVar12;
  char *pcVar13;
  float *pfVar14;
  undefined2 *puVar15;
  undefined1 *puVar16;
  dword *pdVar17;
  long in_x3;
  ulong in_x4;
  long lVar18;
  int *piVar19;
  long *plVar20;
  undefined1 *puVar21;
  ulong uVar22;
  uint uVar23;
  uint uVar24;
  long lVar25;
  undefined8 *unaff_x20;
  dword *unaff_x21;
  ulong uVar26;
  int iVar27;
  undefined8 *puVar28;
  long *unaff_x23;
  uint uVar29;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long *unaff_x27;
  undefined8 unaff_x28;
  undefined *puVar30;
  undefined8 uVar31;
  undefined1 auVar32 [16];
  undefined1 *in_stack_00000010;
  char *in_stack_00000018;
  dword *in_stack_00000020;
  dword *in_stack_00000028;
  undefined1 *in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  uVar5 = (undefined4)((ulong)in_x3 >> 0x20);
  uVar24 = (uint)in_x3;
  if (((in_x3 != 0) && (lVar18 = (long)(int)unaff_x20 + -1, (uint)lVar18 < *(uint *)(in_x3 + 8))) &&
     (*(int *)(*(long *)(in_x3 + 0x18) + lVar18 * 0x10 + 0xc) == 5)) {
    lVar18 = *(long *)(*(long *)(in_x3 + 0x18) + lVar18 * 0x10);
    pcVar13 = (char *)(lVar18 + 0x18);
    pdVar17 = (dword *)(ulong)*(uint *)(lVar18 + 0x14);
    puVar8 = &uStack0000000000000040;
    goto code_r0x006e7378;
  }
  iVar4 = func_0x006e3f90();
  if ((iVar4 != 3) && (iVar4 != 5)) {
    func_0x006e719c();
    auVar32 = func_0x006e644c();
    puVar8 = auVar32._0_8_;
    puVar6 = (undefined1 *)(*(long **)(puVar8 + 0x10))[(ulong)(auVar32._8_4_ - 1) * 2];
    if (puVar6[4] != '\0') {
      auVar32 = func_0x006ed124(puVar8);
      lVar18 = auVar32._0_8_;
      puVar28 = *(undefined8 **)(lVar18 + 8);
      uVar31 = *(undefined8 *)(*(long *)(lVar18 + 0x10) + 0x10);
      puVar28[1] = *(undefined8 *)(*(long *)(lVar18 + 0x10) + 0x18);
      *puVar28 = uVar31;
      lVar25 = *(long *)(lVar18 + 8);
      uVar31 = *auVar32._8_8_;
      *(undefined8 *)(lVar25 + 0x18) = auVar32._8_8_[1];
      *(undefined8 *)(lVar25 + 0x10) = uVar31;
      lVar25 = *(long *)(lVar18 + 8);
      uVar31 = *unaff_x20;
      *(undefined8 *)(lVar25 + 0x28) = unaff_x20[1];
      *(undefined8 *)(lVar25 + 0x20) = uVar31;
      lVar25 = *(long *)(lVar18 + 8);
      *(long *)(lVar18 + 8) = lVar25 + 0x30;
      func_0x006ee550(lVar18,lVar25,1);
      lVar25 = *(long *)(lVar18 + 8);
      piVar19 = (int *)(lVar25 + -0x10);
      *(int **)(lVar18 + 8) = piVar19;
      uVar24 = *(uint *)(lVar25 + -4);
      puVar8 = (undefined1 *)(ulong)uVar24;
      if (uVar24 != 0) {
        if (uVar24 != 1) {
          return (undefined1 *)((long)&MACH_HEADER.magic + 1);
        }
        puVar8 = (undefined1 *)(ulong)(*piVar19 != 0);
      }
      return puVar8;
    }
    uVar26 = CONCAT44(uVar5,uVar24);
    puVar21 = (undefined1 *)**(long **)(puVar8 + 0x10);
    iVar4 = (int)unaff_x20;
    uVar1 = uVar24 - iVar4;
    uVar29 = iVar4 - 1;
    iVar27 = (int)in_x4;
    puVar16 = puVar8;
    if ((uVar29 < *(uint *)(puVar21 + 8)) &&
       (uVar23 = iVar27 - 1,
       (uVar24 <= *(uint *)(puVar21 + 8) && uVar23 < *(uint *)(puVar6 + 8)) &&
       uVar1 + iVar27 <= *(uint *)(puVar6 + 8))) {
      lVar18 = *(long *)(puVar21 + 0x18);
      lVar25 = *(long *)(puVar6 + 0x18);
      if ((((int)uVar24 < iVar27) || (iVar27 - iVar4 == 0 || iVar27 < iVar4)) ||
         ((auVar32._8_4_ != 1 && (puVar6 != puVar21)))) {
        if (-1 < (int)uVar1) {
          uVar26 = (ulong)(uVar1 + 1);
          do {
            puVar28 = (undefined8 *)(lVar18 + (long)(int)uVar29 * 0x10);
            uVar31 = *puVar28;
            puVar3 = (undefined8 *)(lVar25 + (long)(int)uVar23 * 0x10);
            puVar3[1] = puVar28[1];
            *puVar3 = uVar31;
            uVar23 = uVar23 + 1;
            uVar29 = uVar29 + 1;
            uVar26 = uVar26 - 1;
          } while (uVar26 != 0);
        }
      }
      else if (-1 < (int)uVar1) {
        lVar7 = (ulong)uVar1 + 1;
        do {
          uVar24 = uVar24 - 1;
          puVar28 = (undefined8 *)(lVar18 + (long)(int)uVar24 * 0x10);
          uVar31 = *puVar28;
          puVar3 = (undefined8 *)(lVar25 + (long)(int)((iVar27 - iVar4) + uVar24) * 0x10);
          puVar3[1] = puVar28[1];
          *puVar3 = uVar31;
          lVar7 = lVar7 + -1;
        } while (lVar7 != 0);
      }
      if (((byte)puVar6[1] >> 2 & 1) != 0) {
        puVar28 = (undefined8 *)(puVar6 + 0x28);
code_r0x006f0ed4:
        lVar18 = *(long *)(puVar8 + 0x18);
        puVar6[1] = puVar6[1] & 0xfb;
        *puVar28 = *(undefined8 *)(lVar18 + 0x30);
        *(undefined1 **)(lVar18 + 0x30) = puVar6;
        return puVar8;
      }
    }
    else if (((int)uVar24 < iVar27) ||
            ((iVar27 - iVar4 == 0 || iVar27 < iVar4 || (puVar6 != puVar21)))) {
      if (-1 < (int)uVar1) {
        do {
          func_0x006e3f90(puVar8,1,unaff_x20);
          puVar16 = (undefined1 *)func_0x006e4860(puVar8,auVar32._8_8_,in_x4);
          uVar29 = (int)unaff_x20 + 1;
          unaff_x20 = (undefined8 *)(ulong)uVar29;
          in_x4 = (ulong)((int)in_x4 + 1);
        } while (uVar24 + 1 != uVar29);
      }
    }
    else if (-1 < (int)uVar1) {
      do {
        func_0x006e3f90(puVar8,1,uVar26);
        puVar16 = (undefined1 *)func_0x006e4860(puVar8,auVar32._8_8_,(iVar27 - iVar4) + (int)uVar26)
        ;
        uVar24 = (int)uVar26 - 1;
        uVar26 = (ulong)uVar24;
      } while (uVar29 != uVar24);
    }
    return puVar16;
  }
  puVar6 = &uStack0000000000000040;
  pdVar9 = unaff_x21;
  unaff_x21 = in_stack_00000020;
code_r0x006e7490:
  puVar8 = puVar6 + -0x70;
  *(undefined8 *)(puVar6 + -0x60) = unaff_x28;
  *(long **)(puVar6 + -0x58) = unaff_x27;
  *(undefined8 *)(puVar6 + -0x50) = unaff_x26;
  *(undefined8 *)(puVar6 + -0x48) = unaff_x25;
  *(undefined8 *)(puVar6 + -0x40) = unaff_x24;
  *(long **)(puVar6 + -0x38) = unaff_x23;
  *(undefined1 **)(puVar6 + -0x30) = in_stack_00000010;
  *(char **)(puVar6 + -0x28) = in_stack_00000018;
  *(dword **)(puVar6 + -0x20) = unaff_x21;
  *(dword **)(puVar6 + -0x18) = in_stack_00000028;
  *(undefined1 **)(puVar6 + -0x10) = in_stack_00000030;
  *(undefined **)(puVar6 + -8) = in_stack_00000038;
  lVar25 = *(long *)(pdVar9 + 4);
  lVar18 = func_0x006e2ce4(lVar25,0xffffffff,puVar6 + -0x68);
  if (lVar18 == 0) {
    return (undefined1 *)0x0;
  }
  lVar7 = *(long *)pdVar9;
  puVar16 = *(undefined1 **)(puVar6 + -0x68);
  puVar21 = (undefined1 *)(*(long *)(pdVar9 + 2) - lVar7);
  lVar2 = (long)puVar16 - (long)puVar21;
  if (puVar16 < puVar21 || lVar2 == 0) {
code_r0x006e7584:
    _memcpy(lVar7,lVar18,puVar16);
    *(long *)pdVar9 = *(long *)pdVar9 + *(long *)(puVar6 + -0x68);
    puVar8 = (undefined1 *)func_0x006e1d54(lVar25,0xfffffffe);
    return puVar8;
  }
  in_stack_00000010 = *(undefined1 **)(pdVar9 + 4);
  unaff_x27 = (long *)(pdVar9 + 8);
  unaff_x23 = unaff_x27;
  if (*(long *)(pdVar9 + 6) != 0) {
    unaff_x23 = (long *)(*(long *)(pdVar9 + 6) + 0x18);
  }
  uVar22 = *(long *)(pdVar9 + 2) - (long)unaff_x23;
  uVar26 = uVar22 + lVar2;
  if (!CARRY8(uVar26,uVar22)) {
    uVar22 = uVar22 + (uVar22 >> 1);
    if (uVar22 <= uVar26) {
      uVar22 = uVar26;
    }
    lVar10 = func_0x006f6c20(in_stack_00000010,uVar22);
    lVar2 = lVar10 + 0x18;
    _memcpy(lVar2,unaff_x23,*(long *)pdVar9 - (long)unaff_x23);
    if (unaff_x23 == unaff_x27) {
      func_0x006e383c(in_stack_00000010);
      func_0x006e1ee0(in_stack_00000010,0xfffffffe);
    }
    lVar7 = *(long *)(in_stack_00000010 + 8);
    *(long *)(lVar7 + -0x20) = lVar10;
    *(undefined4 *)(lVar7 + -0x14) = 5;
    lVar7 = lVar2 + (*(long *)pdVar9 - (long)unaff_x23);
    *(long *)pdVar9 = lVar7;
    *(ulong *)(pdVar9 + 2) = lVar2 + uVar22;
    *(long *)(pdVar9 + 6) = lVar10;
    puVar16 = *(undefined1 **)(puVar6 + -0x68);
    goto code_r0x006e7584;
  }
  auVar32 = func_0x006e644c(in_stack_00000010,"buffer too large");
  in_stack_00000020 = auVar32._8_8_;
  unaff_x21 = auVar32._0_8_;
  *(undefined1 **)(puVar6 + -0xa0) = in_stack_00000010;
  *(long *)(puVar6 + -0x98) = lVar18;
  *(dword **)(puVar6 + -0x90) = pdVar9;
  *(long *)(puVar6 + -0x88) = lVar25;
  *(undefined1 **)(puVar6 + -0x80) = puVar6 + -0x10;
  *(undefined **)(puVar6 + -0x78) = &DAT_006e75d8;
  in_stack_00000030 = puVar6 + -0x80;
  *(undefined8 *)(puVar6 + -0xa8) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  in_stack_00000018 = *(char **)(unaff_x21 + 4);
  auVar32._8_8_ = in_stack_00000020;
  auVar32._0_8_ = in_stack_00000018;
  puVar21 = (undefined1 *)func_0x006e21f8(in_stack_00000018);
  switch((int)puVar21) {
  case 0:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar6 + -0xa8)) {
      pcVar13 = "nil";
      pdVar17 = (dword *)((long)&MACH_HEADER.magic + 3);
      in_stack_00000030 = *(undefined1 **)(puVar6 + -0x80);
      in_stack_00000038 = *(undefined **)(puVar6 + -0x78);
      in_stack_00000020 = *(dword **)(puVar6 + -0x90);
      in_stack_00000028 = *(dword **)(puVar6 + -0x88);
      in_stack_00000010 = *(undefined1 **)(puVar6 + -0xa0);
      in_stack_00000018 = *(char **)(puVar6 + -0x98);
      goto code_r0x006e7378;
    }
    break;
  case 1:
    iVar4 = func_0x006e2c48(in_stack_00000018,in_stack_00000020);
    if (iVar4 == 0) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar6 + -0xa8)) {
        pcVar13 = "false";
        pdVar17 = (dword *)((long)&MACH_HEADER.cputype + 1);
        in_stack_00000030 = *(undefined1 **)(puVar6 + -0x80);
        in_stack_00000038 = *(undefined **)(puVar6 + -0x78);
        in_stack_00000020 = *(dword **)(puVar6 + -0x90);
        in_stack_00000028 = *(dword **)(puVar6 + -0x88);
        in_stack_00000010 = *(undefined1 **)(puVar6 + -0xa0);
        in_stack_00000018 = *(char **)(puVar6 + -0x98);
        puVar8 = puVar6 + -0x70;
        goto code_r0x006e7378;
      }
      break;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(puVar6 + -0xa8)) break;
    pcVar13 = "true";
    pdVar17 = &MACH_HEADER.cputype;
    in_stack_00000030 = *(undefined1 **)(puVar6 + -0x80);
    in_stack_00000038 = *(undefined **)(puVar6 + -0x78);
    in_stack_00000020 = *(dword **)(puVar6 + -0x90);
    in_stack_00000028 = *(dword **)(puVar6 + -0x88);
    in_stack_00000010 = *(undefined1 **)(puVar6 + -0xa0);
    in_stack_00000018 = *(char **)(puVar6 + -0x98);
    puVar8 = puVar6 + -0x70;
    goto code_r0x006e7378;
  default:
    puVar16 = puVar6 + -0xd8;
    puVar30 = &UNK_006e76cc;
    goto code_r0x006e778c;
  case 3:
    func_0x006e29f0(in_stack_00000018,in_stack_00000020,0);
    in_stack_00000020 = (dword *)(puVar6 + -0xd8);
    lVar18 = func_0x006f45d8(puVar6 + -0xd8);
    pdVar17 = (dword *)(lVar18 - (long)in_stack_00000020);
    pcVar13 = puVar6 + -0xd8;
    goto code_r0x006e7718;
  case 5:
    pcVar13 = (char *)func_0x006e2ce4(in_stack_00000018,in_stack_00000020,puVar6 + -0xd8);
    pdVar17 = *(dword **)(puVar6 + -0xd8);
code_r0x006e7718:
    in_stack_00000038 = &UNK_006e7720;
    puVar8 = puVar6 + -0xe0;
    in_stack_00000028 = unaff_x21;
code_r0x006e7378:
    puVar6 = puVar8 + -0x60;
    *(undefined8 *)(puVar8 + -0x60) = unaff_x28;
    *(long **)(puVar8 + -0x58) = unaff_x27;
    *(undefined8 *)(puVar8 + -0x50) = unaff_x26;
    *(undefined8 *)(puVar8 + -0x48) = unaff_x25;
    *(undefined8 *)(puVar8 + -0x40) = unaff_x24;
    *(long **)(puVar8 + -0x38) = unaff_x23;
    *(undefined1 **)(puVar8 + -0x30) = in_stack_00000010;
    *(char **)(puVar8 + -0x28) = in_stack_00000018;
    *(dword **)(puVar8 + -0x20) = in_stack_00000020;
    *(dword **)(puVar8 + -0x18) = in_stack_00000028;
    *(undefined1 **)(puVar8 + -0x10) = in_stack_00000030;
    *(undefined **)(puVar8 + -8) = in_stack_00000038;
    in_stack_00000030 = puVar8 + -0x10;
    lVar18 = *(long *)unaff_x21;
    plVar20 = (long *)(*(long *)(unaff_x21 + 2) - lVar18);
    lVar25 = (long)pdVar17 - (long)plVar20;
    if (pdVar17 < plVar20 || lVar25 == 0) {
code_r0x006e744c:
      puVar8 = (undefined1 *)_memcpy(lVar18,pcVar13,pdVar17);
      *(long *)unaff_x21 = *(long *)unaff_x21 + (long)pdVar17;
      return puVar8;
    }
    in_stack_00000010 = *(undefined1 **)(unaff_x21 + 4);
    unaff_x27 = (long *)(unaff_x21 + 8);
    unaff_x23 = unaff_x27;
    if (*(long *)(unaff_x21 + 6) != 0) {
      unaff_x23 = (long *)(*(long *)(unaff_x21 + 6) + 0x18);
    }
    uVar22 = *(long *)(unaff_x21 + 2) - (long)unaff_x23;
    uVar26 = uVar22 + lVar25;
    if (!CARRY8(uVar26,uVar22)) {
      uVar22 = uVar22 + (uVar22 >> 1);
      if (uVar22 <= uVar26) {
        uVar22 = uVar26;
      }
      lVar7 = func_0x006f6c20(in_stack_00000010,uVar22);
      lVar25 = lVar7 + 0x18;
      _memcpy(lVar25,unaff_x23,*(long *)unaff_x21 - (long)unaff_x23);
      if (unaff_x23 == unaff_x27) {
        func_0x006e383c(in_stack_00000010);
        func_0x006e1ee0(in_stack_00000010,0xffffffff);
      }
      lVar18 = *(long *)(in_stack_00000010 + 8);
      *(long *)(lVar18 + -0x10) = lVar7;
      *(undefined4 *)(lVar18 + -4) = 5;
      lVar18 = lVar25 + (*(long *)unaff_x21 - (long)unaff_x23);
      *(long *)unaff_x21 = lVar18;
      *(ulong *)(unaff_x21 + 2) = lVar25 + uVar22;
      *(long *)(unaff_x21 + 6) = lVar7;
      goto code_r0x006e744c;
    }
    in_stack_00000038 = &LAB_006e7490;
    pdVar9 = (dword *)func_0x006e644c(in_stack_00000010,"buffer too large");
    in_stack_00000028 = pdVar17;
    in_stack_00000018 = pcVar13;
    goto code_r0x006e7490;
  case -1:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar6 + -0xa8)) {
      return puVar21;
    }
  }
  puVar30 = &DAT_006e778c;
  auVar32 = ___stack_chk_fail();
code_r0x006e778c:
  uVar31 = auVar32._8_8_;
  puVar8 = auVar32._0_8_;
  *(undefined8 *)(puVar6 + -0x120) = unaff_x24;
  *(long **)(puVar6 + -0x118) = unaff_x23;
  *(undefined1 **)(puVar6 + -0x110) = in_stack_00000010;
  *(char **)(puVar6 + -0x108) = in_stack_00000018;
  *(dword **)(puVar6 + -0x100) = in_stack_00000020;
  *(dword **)(puVar6 + -0xf8) = unaff_x21;
  *(undefined1 **)(puVar6 + -0xf0) = in_stack_00000030;
  *(undefined **)(puVar6 + -0xe8) = puVar30;
  puVar21 = puVar6 + -0xf0;
  *(undefined8 *)(puVar6 + -0x128) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  iVar4 = func_0x006e6e44(puVar8,uVar31,"__tostring");
  if (iVar4 != 0) {
    puVar11 = (undefined1 *)func_0x006e2ce4(puVar8,0xffffffff,puVar16);
    if (puVar11 != (undefined1 *)0x0) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar6 + -0x128)) {
        return puVar11;
      }
      goto code_r0x006e799c;
    }
    goto code_r0x006e79a0;
  }
  uVar5 = func_0x006e21f8(puVar8,uVar31);
  switch(uVar5) {
  case 0:
    pcVar13 = "nil";
    lVar18 = 3;
    puVar30 = &UNK_006e7858;
    goto code_r0x006e38d8;
  case 1:
    iVar4 = func_0x006e2c48(puVar8,uVar31);
    pcVar13 = "false";
    if (iVar4 != 0) {
      pcVar13 = "true";
    }
    func_0x006e3964(puVar8,pcVar13);
    break;
  default:
    uVar12 = func_0x006e3790(puVar8,uVar31);
    in_stack_00000010 = (undefined1 *)func_0x006e5bac(puVar8,uVar12);
    lVar18 = func_0x006e1710(puVar8,uVar31);
    if (lVar18 == 0) {
      pcVar13 = "no value";
    }
    else {
      pcVar13 = (char *)func_0x006fe8d4(puVar8,lVar18);
    }
    *(char **)(puVar6 + -0x1d0) = pcVar13;
    *(undefined1 **)(puVar6 + -0x1c8) = in_stack_00000010;
    func_0x006e3a84(puVar8,"%s: 0x%016llx");
    break;
  case 3:
    func_0x006e29f0(puVar8,uVar31,0);
    pfVar14 = (float *)(puVar6 + -0x1b8);
    lVar18 = func_0x006f45d8(puVar6 + -0x1b8);
    lVar18 = lVar18 - (long)pfVar14;
    goto code_r0x006e7938;
  case 4:
    pfVar14 = (float *)func_0x006e30bc(puVar8,uVar31);
    in_stack_00000010 = puVar6 + -0x1b8;
    puVar15 = (undefined2 *)func_0x006f45d8((double)*pfVar14,puVar6 + -0x1b8);
    *puVar15 = 0x202c;
    puVar15 = (undefined2 *)func_0x006f45d8((double)pfVar14[1],puVar15 + 1);
    *puVar15 = 0x202c;
    lVar18 = func_0x006f45d8((double)pfVar14[2],puVar15 + 1);
    lVar18 = lVar18 - (long)in_stack_00000010;
code_r0x006e7938:
    auVar32._8_8_ = pfVar14;
    auVar32._0_8_ = puVar8;
    pcVar13 = puVar6 + -0x1b8;
    puVar30 = &UNK_006e7944;
    goto code_r0x006e38d8;
  case 5:
    func_0x006e2154(puVar8,uVar31);
  }
  puVar11 = (undefined1 *)func_0x006e2ce4(puVar8,0xffffffff,puVar16);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar6 + -0x128)) {
    return puVar11;
  }
code_r0x006e799c:
  ___stack_chk_fail();
code_r0x006e79a0:
  plVar20 = (long *)func_0x006e644c(puVar8,"\'__tostring\' must return a string");
  *(undefined1 **)(puVar6 + -0x200) = in_stack_00000010;
  *(undefined8 *)(puVar6 + -0x1f8) = uVar31;
  *(undefined1 **)(puVar6 + -0x1f0) = puVar16;
  *(undefined1 **)(puVar6 + -0x1e8) = puVar8;
  *(undefined1 **)(puVar6 + -0x1e0) = puVar21;
  *(undefined **)(puVar6 + -0x1d8) = &DAT_006e79b0;
  puVar8 = (undefined1 *)plVar20[2];
  lVar18 = plVar20[3];
  if (lVar18 != 0) {
    if (*(ulong *)(*(long *)(puVar8 + 0x18) + 0x40) <= *(ulong *)(*(long *)(puVar8 + 0x18) + 0x48))
    {
      func_0x006efe90(puVar8,1);
    }
    lVar25 = *(long *)(puVar8 + 8);
    if (*plVar20 == plVar20[1]) {
      puVar8 = (undefined1 *)func_0x006f6ca0(puVar8,lVar18);
    }
    else {
      puVar8 = (undefined1 *)func_0x006f6ef8(puVar8,lVar18 + 0x18,*plVar20 - (lVar18 + 0x18));
    }
    *(undefined1 **)(lVar25 + -0x10) = puVar8;
    *(undefined4 *)(lVar25 + -4) = 5;
    return puVar8;
  }
  pcVar13 = (char *)(plVar20 + 4);
  lVar18 = *plVar20 - (long)pcVar13;
  puVar21 = *(undefined1 **)(puVar6 + -0x1e0);
  puVar30 = *(undefined **)(puVar6 + -0x1d8);
  puVar16 = *(undefined1 **)(puVar6 + -0x1f0);
  in_stack_00000010 = *(undefined1 **)(puVar6 + -0x200);
  auVar32._8_8_ = *(undefined8 *)(puVar6 + -0x1f8);
  auVar32._0_8_ = *(undefined8 *)(puVar6 + -0x1e8);
code_r0x006e38d8:
  *(undefined1 **)(puVar6 + -0x200) = in_stack_00000010;
  *(long *)(puVar6 + -0x1f8) = auVar32._8_8_;
  *(undefined1 **)(puVar6 + -0x1f0) = puVar16;
  *(long *)(puVar6 + -0x1e8) = auVar32._0_8_;
  *(undefined1 **)(puVar6 + -0x1e0) = puVar21;
  *(undefined **)(puVar6 + -0x1d8) = puVar30;
  if (*(ulong *)(*(long *)(puVar8 + 0x18) + 0x40) <= *(ulong *)(*(long *)(puVar8 + 0x18) + 0x48)) {
    func_0x006efe90(puVar8,1);
  }
  if (((byte)puVar8[1] >> 2 & 1) == 0) {
    puVar28 = *(undefined8 **)(puVar8 + 8);
    puVar6 = (undefined1 *)func_0x006f6ef8(puVar8,pcVar13,lVar18);
    *puVar28 = puVar6;
    *(undefined4 *)((long)puVar28 + 0xc) = 5;
    *(long *)(puVar8 + 8) = *(long *)(puVar8 + 8) + 0x10;
    return puVar6;
  }
  puVar28 = (undefined8 *)(puVar8 + 0x68);
  puVar6 = puVar8;
  goto code_r0x006f0ed4;
}

