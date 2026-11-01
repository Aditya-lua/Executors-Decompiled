
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * thunk_FUN_000f7854(code *param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4,
                          undefined4 *param_5,undefined4 *param_6)

{
  undefined1 *puVar1;
  int iVar2;
  int iVar3;
  undefined *puVar4;
  char cVar5;
  short sVar6;
  undefined1 auVar7 [16];
  undefined8 uVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong *puVar17;
  long lVar18;
  undefined8 uVar19;
  uint uVar20;
  int iVar21;
  undefined8 *puVar22;
  ulong uVar23;
  undefined8 *puVar24;
  ulong *puVar25;
  long lVar26;
  ulong uVar27;
  long lVar28;
  undefined1 (*pauVar29) [16];
  ulong uVar30;
  long lVar31;
  long *plVar32;
  char *pcVar33;
  undefined1 (*pauVar34) [16];
  long unaff_x29;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined1 uVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined *puStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long lStack_48;
  
  puVar17 = (ulong *)(*param_1)();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return puVar17;
  }
  auVar47 = ___stack_chk_fail();
  lVar18 = auVar47._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar17 = *(ulong **)(lVar18 + 0x38);
  if (puVar17 == (ulong *)0x0) {
    pauVar34 = *(undefined1 (**) [16])(lVar18 + 0x30);
    if (pauVar34 == (undefined1 (*) [16])0x0) {
      if (*(int *)(lVar18 + 0x78) == 0) {
        uStack_98 = 0;
        uStack_e0 = 0;
        uStack_68 = 0;
        uStack_70 = 0;
        uStack_58 = 0;
        uStack_60 = 0;
        uStack_78 = 0;
        uStack_80 = 0;
        uStack_b8 = 0;
        puStack_a8 = (undefined *)0x0;
        uStack_b0 = 0;
        uStack_d8 = 0x100000000;
        uStack_a0 = 0x7f7fffff00000000;
        uStack_90 = NEON_fmov(0x3f800000,4);
        uStack_88 = 0xffff;
        uStack_c8 = 0x100000001;
        uStack_c0 = 1;
        uStack_d0 = 0x4150000000000000;
        func_0x000b875c((long)&uStack_88 + 2,0x28,"ProggyClean.ttf, %dpx");
        uStack_88 = CONCAT62(uStack_88._2_6_,0x85);
        uStack_b0 = CONCAT44(uStack_b0._4_4_,(float)(int)(uStack_d0._4_4_ / 13.0));
        puVar4 = &UNK_0080d7c0;
        if (puStack_a8 != (undefined *)0x0) {
          puVar4 = puStack_a8;
        }
        func_0x000f8084(lVar18,&UNK_00810364,&uStack_e0,puVar4);
        puVar22 = *(undefined8 **)(lVar18 + 0x488);
        if (puVar22 != (undefined8 *)0x0) goto code_r0x000f78e4;
LAB_000f7aa0:
        puRam0000000000a33a60 = &DAT_000f95bc;
        (*(code *)&DAT_000f95bc)(lVar18);
        pauVar34 = *(undefined1 (**) [16])(lVar18 + 0x30);
      }
      else {
        puVar22 = *(undefined8 **)(lVar18 + 0x488);
        if (puVar22 == (undefined8 *)0x0) goto LAB_000f7aa0;
code_r0x000f78e4:
        (*(code *)*puVar22)(lVar18);
        pauVar34 = *(undefined1 (**) [16])(lVar18 + 0x30);
      }
      if (pauVar34 == (undefined1 (*) [16])0x0) {
        puVar17 = *(ulong **)(lVar18 + 0x38);
        goto LAB_000f7ac4;
      }
    }
    puVar17 = (ulong *)func_0x000b810c((long)*(int *)(lVar18 + 0x40) * (long)*(int *)(lVar18 + 0x44)
                                       * 4);
    *(ulong **)(lVar18 + 0x38) = puVar17;
    uVar38 = _UNK_0080d140;
    uVar36 = _UNK_0080d138;
    uVar9 = _UNK_0080d130;
    uVar8 = _UNK_0080d128;
    uVar19 = _UNK_0080d120;
    uVar20 = *(int *)(lVar18 + 0x44) * *(int *)(lVar18 + 0x40);
    uVar23 = (ulong)uVar20;
    if (0 < (int)uVar20) {
      if ((uVar20 < 8) ||
         (puVar17 < *pauVar34 + uVar23 &&
          pauVar34 < (undefined1 (*) [16])((long)puVar17 + (ulong)(uVar20 - 1) * 4 + 4))) {
        puVar25 = puVar17;
      }
      else {
        if (uVar20 < 0x10) {
          uVar27 = 0;
        }
        else {
          uVar27 = uVar23 & 0xfffffff0;
          uVar39 = (undefined1)_UNK_0080d148;
          uVar10 = (ulong)_UNK_0080d148 >> 8;
          uVar11 = (ulong)_UNK_0080d148 >> 0x10;
          uVar12 = (ulong)_UNK_0080d148 >> 0x18;
          uVar13 = (ulong)_UNK_0080d148 >> 0x20;
          uVar14 = (ulong)_UNK_0080d148 >> 0x28;
          uVar15 = (ulong)_UNK_0080d148 >> 0x30;
          uVar16 = (ulong)_UNK_0080d148 >> 0x38;
          auVar41._8_8_ = _UNK_0080d158;
          auVar41._0_8_ = _UNK_0080d150;
          uVar30 = uVar27;
          puVar25 = puVar17;
          pauVar29 = pauVar34;
          do {
            auVar44 = *pauVar29;
            auVar42._8_8_ = uVar8;
            auVar42._0_8_ = uVar19;
            auVar43 = a64_TBL(ZEXT816(0),auVar44,auVar42);
            auVar45._8_8_ = uVar36;
            auVar45._0_8_ = uVar9;
            auVar45 = a64_TBL(ZEXT816(0),auVar44,auVar45);
            auVar46[8] = uVar39;
            auVar46._0_8_ = uVar38;
            auVar46[9] = (char)uVar10;
            auVar46[10] = (char)uVar11;
            auVar46[0xb] = (char)uVar12;
            auVar46[0xc] = (char)uVar13;
            auVar46[0xd] = (char)uVar14;
            auVar46[0xe] = (char)uVar15;
            auVar46[0xf] = (char)uVar16;
            auVar46 = a64_TBL(ZEXT816(0),auVar44,auVar46);
            auVar42 = a64_TBL(ZEXT816(0),auVar44,auVar41);
            auVar44._0_8_ =
                 CONCAT17(auVar43[4],(uint7)(uint)(auVar43._0_4_ << 0x18)) | 0xffffff00ffffff;
            auVar44[8] = 0xff;
            auVar44[9] = 0xff;
            auVar44[10] = 0xff;
            auVar44[0xb] = auVar43[8];
            auVar44[0xc] = 0xff;
            auVar44[0xd] = 0xff;
            auVar44[0xf] = auVar43[0xc];
            auVar44[0xe] = 0xff;
            *(undefined1 *)(puVar25 + 5) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x29) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x2a) = 0xff;
            *(char *)((long)puVar25 + 0x2b) = auVar46[8];
            *(undefined1 *)((long)puVar25 + 0x2c) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x2d) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x2e) = 0xff;
            *(char *)((long)puVar25 + 0x2f) = auVar46[0xc];
            *(undefined1 *)(puVar25 + 4) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x21) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x22) = 0xff;
            *(char *)((long)puVar25 + 0x23) = auVar46[0];
            *(undefined1 *)((long)puVar25 + 0x24) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x25) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x26) = 0xff;
            *(char *)((long)puVar25 + 0x27) = auVar46[4];
            *(undefined1 *)(puVar25 + 7) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x39) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x3a) = 0xff;
            *(char *)((long)puVar25 + 0x3b) = auVar42[8];
            *(undefined1 *)((long)puVar25 + 0x3c) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x3d) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x3e) = 0xff;
            *(char *)((long)puVar25 + 0x3f) = auVar42[0xc];
            *(undefined1 *)(puVar25 + 6) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x31) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x32) = 0xff;
            *(char *)((long)puVar25 + 0x33) = auVar42[0];
            *(undefined1 *)((long)puVar25 + 0x34) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x35) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x36) = 0xff;
            *(char *)((long)puVar25 + 0x37) = auVar42[4];
            puVar25[1] = auVar44._8_8_;
            *puVar25 = auVar44._0_8_;
            *(undefined1 *)(puVar25 + 3) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x19) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x1a) = 0xff;
            *(char *)((long)puVar25 + 0x1b) = auVar45[8];
            *(undefined1 *)((long)puVar25 + 0x1c) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x1d) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x1e) = 0xff;
            *(char *)((long)puVar25 + 0x1f) = auVar45[0xc];
            *(undefined1 *)(puVar25 + 2) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x11) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x12) = 0xff;
            *(char *)((long)puVar25 + 0x13) = auVar45[0];
            *(undefined1 *)((long)puVar25 + 0x14) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x15) = 0xff;
            *(undefined1 *)((long)puVar25 + 0x16) = 0xff;
            *(char *)((long)puVar25 + 0x17) = auVar45[4];
            uVar30 = uVar30 - 0x10;
            puVar25 = puVar25 + 8;
            pauVar29 = pauVar29 + 1;
          } while (uVar30 != 0);
          if (uVar27 == uVar23) goto LAB_000f7ac4;
          if ((uVar20 >> 3 & 1) == 0) {
            pauVar34 = (undefined1 (*) [16])(*pauVar34 + uVar27);
            uVar20 = uVar20 - (int)uVar27;
            puVar25 = (ulong *)((long)puVar17 + uVar27 * 4);
            goto LAB_000f79c0;
          }
        }
        uVar36 = _UNK_0080d138;
        uVar9 = _UNK_0080d130;
        uVar8 = _UNK_0080d128;
        uVar19 = _UNK_0080d120;
        uVar30 = uVar23 & 0xfffffff8;
        uVar20 = uVar20 - (int)uVar30;
        lVar31 = uVar27 << 2;
        lVar28 = uVar27 - uVar30;
        puVar25 = (ulong *)(*pauVar34 + uVar27);
        do {
          puVar1 = (undefined1 *)((long)puVar17 + lVar31);
          auVar40._0_8_ = *puVar25;
          auVar40._8_8_ = 0;
          auVar43._8_8_ = uVar8;
          auVar43._0_8_ = uVar19;
          auVar42 = a64_TBL(ZEXT816(0),auVar40,auVar43);
          auVar7._8_8_ = uVar36;
          auVar7._0_8_ = uVar9;
          auVar41 = a64_TBL(ZEXT816(0),auVar40,auVar7);
          puVar1[8] = 0xff;
          puVar1[9] = 0xff;
          puVar1[10] = 0xff;
          puVar1[0xb] = auVar42[8];
          puVar1[0xc] = 0xff;
          puVar1[0xd] = 0xff;
          puVar1[0xe] = 0xff;
          puVar1[0xf] = auVar42[0xc];
          *puVar1 = 0xff;
          puVar1[1] = 0xff;
          puVar1[2] = 0xff;
          puVar1[3] = auVar42[0];
          puVar1[4] = 0xff;
          puVar1[5] = 0xff;
          puVar1[6] = 0xff;
          puVar1[7] = auVar42[4];
          puVar1[0x18] = 0xff;
          puVar1[0x19] = 0xff;
          puVar1[0x1a] = 0xff;
          puVar1[0x1b] = auVar41[8];
          puVar1[0x1c] = 0xff;
          puVar1[0x1d] = 0xff;
          puVar1[0x1e] = 0xff;
          puVar1[0x1f] = auVar41[0xc];
          puVar1[0x10] = 0xff;
          puVar1[0x11] = 0xff;
          puVar1[0x12] = 0xff;
          puVar1[0x13] = auVar41[0];
          puVar1[0x14] = 0xff;
          puVar1[0x15] = 0xff;
          puVar1[0x16] = 0xff;
          puVar1[0x17] = auVar41[4];
          lVar31 = lVar31 + 0x20;
          lVar28 = lVar28 + 8;
          puVar25 = puVar25 + 1;
        } while (lVar28 != 0);
        puVar25 = (ulong *)((long)puVar17 + uVar30 * 4);
        pauVar34 = (undefined1 (*) [16])(*pauVar34 + uVar30);
        if (uVar30 == uVar23) goto LAB_000f7ac4;
      }
LAB_000f79c0:
      uVar20 = uVar20 + 1;
      do {
        *(uint *)puVar25 = (uint)(byte)(*pauVar34)[0] << 0x18 | 0xffffff;
        uVar20 = uVar20 - 1;
        puVar25 = (ulong *)((long)puVar25 + 4);
        pauVar34 = (undefined1 (*) [16])(*pauVar34 + 1);
      } while (1 < uVar20);
    }
  }
LAB_000f7ac4:
  *auVar47._8_8_ = puVar17;
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = *(undefined4 *)(lVar18 + 0x40);
  }
  if (param_5 != (undefined4 *)0x0) {
    *param_5 = *(undefined4 *)(lVar18 + 0x44);
  }
  if (param_6 != (undefined4 *)0x0) {
    *param_6 = 4;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return puVar17;
  }
  auVar47 = ___stack_chk_fail();
  puVar22 = auVar47._8_8_;
  lVar18 = auVar47._0_8_;
  if (*(char *)(puVar22 + 9) == '\0') {
    puVar24 = (undefined8 *)func_0x000b810c(0x78);
    puVar24[1] = 0;
    *puVar24 = 0;
    puVar24[3] = 0;
    puVar24[2] = 0;
    puVar24[5] = 0;
    puVar24[4] = 0;
    puVar24[6] = 0;
    puVar24[7] = 0;
    *(undefined2 *)((long)puVar24 + 0x54) = 0xffff;
    puVar24[8] = 0;
    puVar24[9] = 0;
    *(undefined4 *)(puVar24 + 10) = 0xffff0000;
    *(undefined4 *)((long)puVar24 + 0x5d) = 0;
    *(undefined8 *)((long)puVar24 + 0x56) = 0;
    *(undefined4 *)((long)puVar24 + 100) = 0x3f800000;
    puVar24[0xd] = 0;
    *(undefined8 *)((long)puVar24 + 0x6e) = 0;
    iVar21 = *(int *)(lVar18 + 0x58);
    if (iVar21 == *(int *)(lVar18 + 0x5c)) {
      if (iVar21 == 0) {
        uVar20 = 8;
      }
      else {
        iVar2 = iVar21;
        if (iVar21 < 0) {
          iVar2 = iVar21 + 1;
        }
        uVar20 = iVar21 + (iVar2 >> 1);
      }
      if ((int)uVar20 <= (int)(iVar21 + 1U)) {
        uVar20 = iVar21 + 1U;
      }
      lVar31 = func_0x000b810c(-(ulong)(uVar20 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar20 << 3);
      if (*(long *)(lVar18 + 0x60) != 0) {
        _memcpy(lVar31,*(long *)(lVar18 + 0x60),(long)*(int *)(lVar18 + 0x58) << 3);
        func_0x000b83d4(*(undefined8 *)(lVar18 + 0x60));
      }
      *(long *)(lVar18 + 0x60) = lVar31;
      *(uint *)(lVar18 + 0x5c) = uVar20;
      iVar21 = *(int *)(lVar18 + 0x58);
    }
    else {
      lVar31 = *(long *)(lVar18 + 0x60);
    }
    *(undefined8 **)(lVar31 + (long)iVar21 * 8) = puVar24;
    *(int *)(lVar18 + 0x58) = *(int *)(lVar18 + 0x58) + 1;
    iVar21 = *(int *)(lVar18 + 0x78);
    if (iVar21 == *(int *)(lVar18 + 0x7c)) goto code_r0x000f7bdc;
  }
  else {
    iVar21 = *(int *)(lVar18 + 0x78);
    if (iVar21 == *(int *)(lVar18 + 0x7c)) {
code_r0x000f7bdc:
      iVar2 = iVar21;
      if (iVar21 < 0) {
        iVar2 = iVar21 + 1;
      }
      iVar3 = 8;
      if (iVar21 != 0) {
        iVar3 = iVar21 + (iVar2 >> 1);
      }
      if (iVar3 <= iVar21 + 1) {
        iVar3 = iVar21 + 1;
      }
      lVar31 = func_0x000b810c((long)iVar3 * 0x90);
      if (*(long *)(lVar18 + 0x80) != 0) {
        _memcpy(lVar31,*(long *)(lVar18 + 0x80),(long)*(int *)(lVar18 + 0x78) * 0x90);
        func_0x000b83d4(*(undefined8 *)(lVar18 + 0x80));
      }
      *(long *)(lVar18 + 0x80) = lVar31;
      *(int *)(lVar18 + 0x7c) = iVar3;
      iVar21 = *(int *)(lVar18 + 0x78);
      goto code_r0x000f7d1c;
    }
  }
  lVar31 = *(long *)(lVar18 + 0x80);
code_r0x000f7d1c:
  puVar24 = (undefined8 *)(lVar31 + (long)iVar21 * 0x90);
  uVar19 = *puVar22;
  puVar24[1] = puVar22[1];
  *puVar24 = uVar19;
  uVar35 = puVar22[3];
  uVar19 = puVar22[2];
  uVar37 = puVar22[5];
  uVar8 = puVar22[4];
  uVar9 = puVar22[6];
  uVar36 = puVar22[8];
  uVar38 = puVar22[9];
  puVar24[7] = puVar22[7];
  puVar24[6] = uVar9;
  puVar24[9] = uVar38;
  puVar24[8] = uVar36;
  puVar24[3] = uVar35;
  puVar24[2] = uVar19;
  puVar24[5] = uVar37;
  puVar24[4] = uVar8;
  uVar36 = puVar22[0xb];
  uVar19 = puVar22[10];
  uVar38 = puVar22[0xd];
  uVar8 = puVar22[0xc];
  uVar9 = puVar22[0xe];
  auVar47 = *(undefined1 (*) [16])(puVar22 + 0x10);
  puVar24[0xf] = puVar22[0xf];
  puVar24[0xe] = uVar9;
  puVar24[0x11] = auVar47._8_8_;
  puVar24[0x10] = auVar47._0_8_;
  puVar24[0xb] = uVar36;
  puVar24[10] = uVar19;
  puVar24[0xd] = uVar38;
  puVar24[0xc] = uVar8;
  iVar21 = *(int *)(lVar18 + 0x78);
  *(int *)(lVar18 + 0x78) = iVar21 + 1;
  lVar28 = *(long *)(lVar18 + 0x80);
  puVar24 = (undefined8 *)(lVar28 + (long)iVar21 * 0x90);
  plVar32 = puVar24 + 0x11;
  lVar31 = *plVar32;
  if (lVar31 == 0) {
    lVar31 = *(long *)(*(long *)(lVar18 + 0x60) + (long)*(int *)(lVar18 + 0x58) * 8 + -8);
    *plVar32 = lVar31;
    pcVar33 = (char *)(lVar28 + (long)iVar21 * 0x90 + 0xc);
    cVar5 = *pcVar33;
  }
  else {
    pcVar33 = (char *)(lVar28 + (long)iVar21 * 0x90 + 0xc);
    cVar5 = *pcVar33;
  }
  if (cVar5 == '\0') {
    lVar28 = lVar28 + (long)iVar21 * 0x90;
    uVar19 = func_0x000b810c((long)*(int *)(lVar28 + 8));
    *puVar24 = uVar19;
    *pcVar33 = '\x01';
    _memcpy(uVar19,*puVar22,(long)*(int *)(lVar28 + 8));
    lVar31 = *plVar32;
    sVar6 = *(short *)(lVar31 + 0x54);
  }
  else {
    sVar6 = *(short *)(lVar31 + 0x54);
  }
  if (sVar6 == -1) {
    *(undefined2 *)(lVar31 + 0x54) = *(undefined2 *)(puVar22 + 0xb);
    iVar21 = *(int *)(lVar18 + 0x78);
  }
  else {
    iVar21 = *(int *)(lVar18 + 0x78);
  }
  if (iVar21 != 0) {
    lVar31 = *(long *)(lVar18 + 0x80);
    lVar28 = (long)iVar21 * 0x90;
    do {
      while (lVar26 = *(long *)(lVar31 + 0x88), *(char *)(lVar31 + 0x48) == '\0') {
        *(long *)(lVar26 + 0x48) = lVar31;
        *(undefined2 *)(lVar26 + 0x50) = 1;
        lVar31 = lVar31 + 0x90;
        lVar28 = lVar28 + -0x90;
        if (lVar28 == 0) goto code_r0x000f7e4c;
      }
      *(short *)(lVar26 + 0x50) = *(short *)(lVar26 + 0x50) + 1;
      lVar31 = lVar31 + 0x90;
      lVar28 = lVar28 + -0x90;
    } while (lVar28 != 0);
  }
code_r0x000f7e4c:
  *(undefined1 *)(lVar18 + 0x28) = 0;
  if (*(long *)(lVar18 + 0x30) != 0) {
    func_0x000b83d4();
  }
  if (*(long *)(lVar18 + 0x38) != 0) {
    func_0x000b83d4();
  }
  *(undefined1 *)(lVar18 + 0x29) = 0;
  *(long *)(lVar18 + 0x30) = 0;
  *(undefined8 *)(lVar18 + 0x38) = 0;
  return (ulong *)*plVar32;
}

