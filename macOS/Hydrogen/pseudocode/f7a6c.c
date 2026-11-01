
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_000f7a6c(undefined1 param_1 [16],int param_2)

{
  undefined1 *puVar1;
  int iVar2;
  int iVar3;
  char cVar4;
  short sVar5;
  undefined1 auVar6 [16];
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 *puVar18;
  uint uVar19;
  int iVar20;
  ulong uVar21;
  undefined8 *puVar22;
  ulong *puVar23;
  long lVar24;
  long lVar25;
  ulong uVar26;
  undefined1 (*pauVar27) [16];
  ulong uVar28;
  long lVar29;
  undefined4 *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  long *plVar30;
  undefined4 *unaff_x22;
  undefined8 *unaff_x23;
  char *pcVar31;
  undefined1 (*pauVar32) [16];
  long unaff_x29;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined1 uVar38;
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  float fStack0000000000000040;
  
  fStack0000000000000040 = (float)param_2;
  func_0x000f8084();
  if (*(undefined8 **)(unaff_x21 + 0x488) == (undefined8 *)0x0) {
    puRam0000000000a33a60 = &DAT_000f95bc;
    (*(code *)&DAT_000f95bc)();
    pauVar32 = *(undefined1 (**) [16])(unaff_x21 + 0x30);
    if (pauVar32 == (undefined1 (*) [16])0x0) goto code_r0x000f7ac0;
LAB_000f78f8:
    puVar15 = (ulong *)func_0x000b810c((long)*(int *)(unaff_x21 + 0x40) *
                                       (long)*(int *)(unaff_x21 + 0x44) * 4);
    *(ulong **)(unaff_x21 + 0x38) = puVar15;
    uVar33 = _UNK_0080d140;
    uVar36 = _UNK_0080d138;
    uVar34 = _UNK_0080d130;
    uVar7 = _UNK_0080d128;
    uVar17 = _UNK_0080d120;
    uVar19 = *(int *)(unaff_x21 + 0x44) * *(int *)(unaff_x21 + 0x40);
    uVar21 = (ulong)uVar19;
    if (0 < (int)uVar19) {
      if ((uVar19 < 8) ||
         (puVar15 < *pauVar32 + uVar21 &&
          pauVar32 < (undefined1 (*) [16])((long)puVar15 + (ulong)(uVar19 - 1) * 4 + 4))) {
        puVar23 = puVar15;
      }
      else {
        if (uVar19 < 0x10) {
          uVar26 = 0;
        }
        else {
          uVar26 = uVar21 & 0xfffffff0;
          uVar38 = (undefined1)_UNK_0080d148;
          uVar8 = (ulong)_UNK_0080d148 >> 8;
          uVar9 = (ulong)_UNK_0080d148 >> 0x10;
          uVar10 = (ulong)_UNK_0080d148 >> 0x18;
          uVar11 = (ulong)_UNK_0080d148 >> 0x20;
          uVar12 = (ulong)_UNK_0080d148 >> 0x28;
          uVar13 = (ulong)_UNK_0080d148 >> 0x30;
          uVar14 = (ulong)_UNK_0080d148 >> 0x38;
          auVar45._8_8_ = _UNK_0080d158;
          auVar45._0_8_ = _UNK_0080d150;
          uVar28 = uVar26;
          puVar23 = puVar15;
          pauVar27 = pauVar32;
          do {
            auVar42 = *pauVar27;
            auVar40._8_8_ = uVar7;
            auVar40._0_8_ = uVar17;
            auVar41 = a64_TBL(ZEXT816(0),auVar42,auVar40);
            auVar43._8_8_ = uVar36;
            auVar43._0_8_ = uVar34;
            auVar43 = a64_TBL(ZEXT816(0),auVar42,auVar43);
            auVar44[8] = uVar38;
            auVar44._0_8_ = uVar33;
            auVar44[9] = (char)uVar8;
            auVar44[10] = (char)uVar9;
            auVar44[0xb] = (char)uVar10;
            auVar44[0xc] = (char)uVar11;
            auVar44[0xd] = (char)uVar12;
            auVar44[0xe] = (char)uVar13;
            auVar44[0xf] = (char)uVar14;
            auVar44 = a64_TBL(ZEXT816(0),auVar42,auVar44);
            auVar40 = a64_TBL(ZEXT816(0),auVar42,auVar45);
            auVar42._0_8_ =
                 CONCAT17(auVar41[4],(uint7)(uint)(auVar41._0_4_ << 0x18)) | 0xffffff00ffffff;
            auVar42[8] = 0xff;
            auVar42[9] = 0xff;
            auVar42[10] = 0xff;
            auVar42[0xb] = auVar41[8];
            auVar42[0xc] = 0xff;
            auVar42[0xd] = 0xff;
            auVar42[0xf] = auVar41[0xc];
            auVar42[0xe] = 0xff;
            *(undefined1 *)(puVar23 + 5) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x29) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x2a) = 0xff;
            *(char *)((long)puVar23 + 0x2b) = auVar44[8];
            *(undefined1 *)((long)puVar23 + 0x2c) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x2d) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x2e) = 0xff;
            *(char *)((long)puVar23 + 0x2f) = auVar44[0xc];
            *(undefined1 *)(puVar23 + 4) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x21) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x22) = 0xff;
            *(char *)((long)puVar23 + 0x23) = auVar44[0];
            *(undefined1 *)((long)puVar23 + 0x24) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x25) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x26) = 0xff;
            *(char *)((long)puVar23 + 0x27) = auVar44[4];
            *(undefined1 *)(puVar23 + 7) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x39) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x3a) = 0xff;
            *(char *)((long)puVar23 + 0x3b) = auVar40[8];
            *(undefined1 *)((long)puVar23 + 0x3c) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x3d) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x3e) = 0xff;
            *(char *)((long)puVar23 + 0x3f) = auVar40[0xc];
            *(undefined1 *)(puVar23 + 6) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x31) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x32) = 0xff;
            *(char *)((long)puVar23 + 0x33) = auVar40[0];
            *(undefined1 *)((long)puVar23 + 0x34) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x35) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x36) = 0xff;
            *(char *)((long)puVar23 + 0x37) = auVar40[4];
            puVar23[1] = auVar42._8_8_;
            *puVar23 = auVar42._0_8_;
            *(undefined1 *)(puVar23 + 3) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x19) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x1a) = 0xff;
            *(char *)((long)puVar23 + 0x1b) = auVar43[8];
            *(undefined1 *)((long)puVar23 + 0x1c) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x1d) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x1e) = 0xff;
            *(char *)((long)puVar23 + 0x1f) = auVar43[0xc];
            *(undefined1 *)(puVar23 + 2) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x11) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x12) = 0xff;
            *(char *)((long)puVar23 + 0x13) = auVar43[0];
            *(undefined1 *)((long)puVar23 + 0x14) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x15) = 0xff;
            *(undefined1 *)((long)puVar23 + 0x16) = 0xff;
            *(char *)((long)puVar23 + 0x17) = auVar43[4];
            uVar28 = uVar28 - 0x10;
            puVar23 = puVar23 + 8;
            pauVar27 = pauVar27 + 1;
          } while (uVar28 != 0);
          if (uVar26 == uVar21) goto code_r0x000f7ac4;
          if ((uVar19 >> 3 & 1) == 0) {
            pauVar32 = (undefined1 (*) [16])(*pauVar32 + uVar26);
            uVar19 = uVar19 - (int)uVar26;
            puVar23 = (ulong *)((long)puVar15 + uVar26 * 4);
            goto code_r0x000f79c0;
          }
        }
        uVar36 = _UNK_0080d138;
        uVar34 = _UNK_0080d130;
        uVar7 = _UNK_0080d128;
        uVar17 = _UNK_0080d120;
        uVar28 = uVar21 & 0xfffffff8;
        uVar19 = uVar19 - (int)uVar28;
        lVar29 = uVar26 << 2;
        lVar16 = uVar26 - uVar28;
        puVar23 = (ulong *)(*pauVar32 + uVar26);
        do {
          puVar1 = (undefined1 *)((long)puVar15 + lVar29);
          auVar39._0_8_ = *puVar23;
          auVar39._8_8_ = 0;
          auVar41._8_8_ = uVar7;
          auVar41._0_8_ = uVar17;
          auVar40 = a64_TBL(ZEXT816(0),auVar39,auVar41);
          auVar6._8_8_ = uVar36;
          auVar6._0_8_ = uVar34;
          auVar45 = a64_TBL(ZEXT816(0),auVar39,auVar6);
          puVar1[8] = 0xff;
          puVar1[9] = 0xff;
          puVar1[10] = 0xff;
          puVar1[0xb] = auVar40[8];
          puVar1[0xc] = 0xff;
          puVar1[0xd] = 0xff;
          puVar1[0xe] = 0xff;
          puVar1[0xf] = auVar40[0xc];
          *puVar1 = 0xff;
          puVar1[1] = 0xff;
          puVar1[2] = 0xff;
          puVar1[3] = auVar40[0];
          puVar1[4] = 0xff;
          puVar1[5] = 0xff;
          puVar1[6] = 0xff;
          puVar1[7] = auVar40[4];
          puVar1[0x18] = 0xff;
          puVar1[0x19] = 0xff;
          puVar1[0x1a] = 0xff;
          puVar1[0x1b] = auVar45[8];
          puVar1[0x1c] = 0xff;
          puVar1[0x1d] = 0xff;
          puVar1[0x1e] = 0xff;
          puVar1[0x1f] = auVar45[0xc];
          puVar1[0x10] = 0xff;
          puVar1[0x11] = 0xff;
          puVar1[0x12] = 0xff;
          puVar1[0x13] = auVar45[0];
          puVar1[0x14] = 0xff;
          puVar1[0x15] = 0xff;
          puVar1[0x16] = 0xff;
          puVar1[0x17] = auVar45[4];
          lVar29 = lVar29 + 0x20;
          lVar16 = lVar16 + 8;
          puVar23 = puVar23 + 1;
        } while (lVar16 != 0);
        puVar23 = (ulong *)((long)puVar15 + uVar28 * 4);
        pauVar32 = (undefined1 (*) [16])(*pauVar32 + uVar28);
        if (uVar28 == uVar21) goto code_r0x000f7ac4;
      }
code_r0x000f79c0:
      uVar19 = uVar19 + 1;
      do {
        *(uint *)puVar23 = (uint)(byte)(*pauVar32)[0] << 0x18 | 0xffffff;
        uVar19 = uVar19 - 1;
        puVar23 = (ulong *)((long)puVar23 + 4);
        pauVar32 = (undefined1 (*) [16])(*pauVar32 + 1);
      } while (1 < uVar19);
    }
  }
  else {
    (*(code *)**(undefined8 **)(unaff_x21 + 0x488))();
    pauVar32 = *(undefined1 (**) [16])(unaff_x21 + 0x30);
    if (pauVar32 != (undefined1 (*) [16])0x0) goto LAB_000f78f8;
code_r0x000f7ac0:
    puVar15 = *(ulong **)(unaff_x21 + 0x38);
  }
code_r0x000f7ac4:
  *unaff_x23 = puVar15;
  if (unaff_x22 != (undefined4 *)0x0) {
    *unaff_x22 = *(undefined4 *)(unaff_x21 + 0x40);
  }
  if (unaff_x20 != (undefined4 *)0x0) {
    *unaff_x20 = *(undefined4 *)(unaff_x21 + 0x44);
  }
  if (unaff_x19 != (undefined4 *)0x0) {
    *unaff_x19 = 4;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return puVar15;
  }
  auVar45 = ___stack_chk_fail();
  puVar18 = auVar45._8_8_;
  lVar29 = auVar45._0_8_;
  if (*(char *)(puVar18 + 9) == '\0') {
    puVar22 = (undefined8 *)func_0x000b810c(0x78);
    puVar22[1] = 0;
    *puVar22 = 0;
    puVar22[3] = 0;
    puVar22[2] = 0;
    puVar22[5] = 0;
    puVar22[4] = 0;
    puVar22[6] = 0;
    puVar22[7] = 0;
    *(undefined2 *)((long)puVar22 + 0x54) = 0xffff;
    puVar22[8] = 0;
    puVar22[9] = 0;
    *(undefined4 *)(puVar22 + 10) = 0xffff0000;
    *(undefined4 *)((long)puVar22 + 0x5d) = 0;
    *(undefined8 *)((long)puVar22 + 0x56) = 0;
    *(undefined4 *)((long)puVar22 + 100) = 0x3f800000;
    puVar22[0xd] = 0;
    *(undefined8 *)((long)puVar22 + 0x6e) = 0;
    iVar20 = *(int *)(lVar29 + 0x58);
    if (iVar20 == *(int *)(lVar29 + 0x5c)) {
      if (iVar20 == 0) {
        uVar19 = 8;
      }
      else {
        iVar2 = iVar20;
        if (iVar20 < 0) {
          iVar2 = iVar20 + 1;
        }
        uVar19 = iVar20 + (iVar2 >> 1);
      }
      if ((int)uVar19 <= (int)(iVar20 + 1U)) {
        uVar19 = iVar20 + 1U;
      }
      lVar16 = func_0x000b810c(-(ulong)(uVar19 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar19 << 3);
      if (*(long *)(lVar29 + 0x60) != 0) {
        _memcpy(lVar16,*(long *)(lVar29 + 0x60),(long)*(int *)(lVar29 + 0x58) << 3);
        func_0x000b83d4(*(undefined8 *)(lVar29 + 0x60));
      }
      *(long *)(lVar29 + 0x60) = lVar16;
      *(uint *)(lVar29 + 0x5c) = uVar19;
      iVar20 = *(int *)(lVar29 + 0x58);
    }
    else {
      lVar16 = *(long *)(lVar29 + 0x60);
    }
    *(undefined8 **)(lVar16 + (long)iVar20 * 8) = puVar22;
    *(int *)(lVar29 + 0x58) = *(int *)(lVar29 + 0x58) + 1;
    iVar20 = *(int *)(lVar29 + 0x78);
    if (iVar20 != *(int *)(lVar29 + 0x7c)) goto LAB_000f7d18;
  }
  else {
    iVar20 = *(int *)(lVar29 + 0x78);
    if (iVar20 != *(int *)(lVar29 + 0x7c)) {
LAB_000f7d18:
      lVar16 = *(long *)(lVar29 + 0x80);
      goto LAB_000f7d1c;
    }
  }
  iVar2 = iVar20;
  if (iVar20 < 0) {
    iVar2 = iVar20 + 1;
  }
  iVar3 = 8;
  if (iVar20 != 0) {
    iVar3 = iVar20 + (iVar2 >> 1);
  }
  if (iVar3 <= iVar20 + 1) {
    iVar3 = iVar20 + 1;
  }
  lVar16 = func_0x000b810c((long)iVar3 * 0x90);
  if (*(long *)(lVar29 + 0x80) != 0) {
    _memcpy(lVar16,*(long *)(lVar29 + 0x80),(long)*(int *)(lVar29 + 0x78) * 0x90);
    func_0x000b83d4(*(undefined8 *)(lVar29 + 0x80));
  }
  *(long *)(lVar29 + 0x80) = lVar16;
  *(int *)(lVar29 + 0x7c) = iVar3;
  iVar20 = *(int *)(lVar29 + 0x78);
LAB_000f7d1c:
  puVar22 = (undefined8 *)(lVar16 + (long)iVar20 * 0x90);
  uVar17 = *puVar18;
  puVar22[1] = puVar18[1];
  *puVar22 = uVar17;
  uVar35 = puVar18[3];
  uVar33 = puVar18[2];
  uVar37 = puVar18[5];
  uVar17 = puVar18[4];
  uVar7 = puVar18[6];
  uVar34 = puVar18[8];
  uVar36 = puVar18[9];
  puVar22[7] = puVar18[7];
  puVar22[6] = uVar7;
  puVar22[9] = uVar36;
  puVar22[8] = uVar34;
  puVar22[3] = uVar35;
  puVar22[2] = uVar33;
  puVar22[5] = uVar37;
  puVar22[4] = uVar17;
  uVar36 = puVar18[0xb];
  uVar34 = puVar18[10];
  uVar33 = puVar18[0xd];
  uVar17 = puVar18[0xc];
  uVar7 = puVar18[0xe];
  auVar45 = *(undefined1 (*) [16])(puVar18 + 0x10);
  puVar22[0xf] = puVar18[0xf];
  puVar22[0xe] = uVar7;
  puVar22[0x11] = auVar45._8_8_;
  puVar22[0x10] = auVar45._0_8_;
  puVar22[0xb] = uVar36;
  puVar22[10] = uVar34;
  puVar22[0xd] = uVar33;
  puVar22[0xc] = uVar17;
  iVar20 = *(int *)(lVar29 + 0x78);
  *(int *)(lVar29 + 0x78) = iVar20 + 1;
  lVar24 = *(long *)(lVar29 + 0x80);
  puVar22 = (undefined8 *)(lVar24 + (long)iVar20 * 0x90);
  plVar30 = puVar22 + 0x11;
  lVar16 = *plVar30;
  if (lVar16 == 0) {
    lVar16 = *(long *)(*(long *)(lVar29 + 0x60) + (long)*(int *)(lVar29 + 0x58) * 8 + -8);
    *plVar30 = lVar16;
    pcVar31 = (char *)(lVar24 + (long)iVar20 * 0x90 + 0xc);
    cVar4 = *pcVar31;
  }
  else {
    pcVar31 = (char *)(lVar24 + (long)iVar20 * 0x90 + 0xc);
    cVar4 = *pcVar31;
  }
  if (cVar4 == '\0') {
    lVar24 = lVar24 + (long)iVar20 * 0x90;
    uVar17 = func_0x000b810c((long)*(int *)(lVar24 + 8));
    *puVar22 = uVar17;
    *pcVar31 = '\x01';
    _memcpy(uVar17,*puVar18,(long)*(int *)(lVar24 + 8));
    lVar16 = *plVar30;
    sVar5 = *(short *)(lVar16 + 0x54);
  }
  else {
    sVar5 = *(short *)(lVar16 + 0x54);
  }
  if (sVar5 == -1) {
    *(undefined2 *)(lVar16 + 0x54) = *(undefined2 *)(puVar18 + 0xb);
    iVar20 = *(int *)(lVar29 + 0x78);
  }
  else {
    iVar20 = *(int *)(lVar29 + 0x78);
  }
  if (iVar20 != 0) {
    lVar16 = *(long *)(lVar29 + 0x80);
    lVar24 = (long)iVar20 * 0x90;
    do {
      while (lVar25 = *(long *)(lVar16 + 0x88), *(char *)(lVar16 + 0x48) != '\0') {
        *(short *)(lVar25 + 0x50) = *(short *)(lVar25 + 0x50) + 1;
        lVar16 = lVar16 + 0x90;
        lVar24 = lVar24 + -0x90;
        if (lVar24 == 0) goto LAB_000f7e4c;
      }
      *(long *)(lVar25 + 0x48) = lVar16;
      *(undefined2 *)(lVar25 + 0x50) = 1;
      lVar16 = lVar16 + 0x90;
      lVar24 = lVar24 + -0x90;
    } while (lVar24 != 0);
  }
LAB_000f7e4c:
  *(undefined1 *)(lVar29 + 0x28) = 0;
  if (*(long *)(lVar29 + 0x30) != 0) {
    func_0x000b83d4();
  }
  if (*(long *)(lVar29 + 0x38) != 0) {
    func_0x000b83d4();
  }
  *(undefined1 *)(lVar29 + 0x29) = 0;
  *(long *)(lVar29 + 0x30) = 0;
  *(undefined8 *)(lVar29 + 0x38) = 0;
  return (ulong *)*plVar30;
}

