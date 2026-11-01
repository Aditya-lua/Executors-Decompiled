
/* WARNING: Possible PIC construction at 0x0079ff40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0079ff44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0079fca8(void)

{
  byte bVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  code *pcVar4;
  ulong **ppuVar5;
  long *plVar6;
  ulong *puVar7;
  ulong *puVar8;
  ulong uVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  byte *pbVar13;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  ulong uVar14;
  undefined *puVar15;
  undefined *puVar16;
  undefined *puVar17;
  undefined **ppuVar18;
  undefined *puVar19;
  long lVar20;
  undefined8 extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 extraout_x8_01;
  code *extraout_x9;
  code *extraout_x9_00;
  ulong uVar21;
  long extraout_x12;
  long extraout_x12_00;
  long *unaff_x19;
  undefined *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 ****ppppuVar22;
  undefined1 auVar23 [16];
  undefined *puStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 ****ppppuStack_220;
  undefined *puStack_218;
  undefined8 uStack_210;
  undefined *puStack_208;
  undefined8 uStack_200;
  undefined1 *puStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined1 auStack_1d8 [8];
  undefined8 ****ppppuStack_1d0;
  undefined *puStack_1c8;
  int aiStack_1c0 [2];
  ulong uStack_1b8;
  undefined8 uStack_1b0;
  ulong uStack_1a8;
  undefined **ppuStack_1a0;
  long lStack_198;
  undefined *puStack_190;
  ulong *puStack_188;
  undefined8 ****ppppuStack_180;
  undefined *puStack_178;
  undefined8 uStack_170;
  undefined *puStack_168;
  undefined8 ****ppppuStack_160;
  undefined *puStack_158;
  undefined8 uStack_150;
  undefined *puStack_148;
  undefined8 ****ppppuStack_140;
  undefined *puStack_138;
  undefined8 uStack_130;
  undefined *puStack_128;
  undefined8 ****ppppuStack_120;
  undefined *puStack_118;
  ulong *puStack_110;
  long *plStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined *puStack_e0;
  long *plStack_d8;
  undefined8 ***pppuStack_d0;
  undefined *puStack_c8;
  undefined8 **ppuStack_c0;
  undefined *puStack_b8;
  int aiStack_b0 [2];
  long lStack_a8;
  undefined8 uStack_a0;
  ulong uStack_98;
  ulong uStack_90;
  long lStack_88;
  undefined1 *puStack_70;
  undefined8 uStack_68;
  undefined1 *puStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  func_0x0036f070();
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x10f,"malloc_impl != NULL");
  uStack_18 = 0x79fcdc;
  puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x110,"free_impl != NULL");
  uStack_28 = 0x79fd04;
  puStack_30 = (undefined1 *)&puStack_20;
  func_0x003714cc("parse_integer","rsa_asn1.c");
  uStack_38 = 0x79fd28;
  puStack_40 = (undefined1 *)&puStack_30;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x13b,"lo <= mid && mid < hi");
  uStack_48 = 0x79fd50;
  puStack_50 = (undefined1 *)&puStack_40;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x151,"lo == hi");
  uStack_58 = 0x79fd78;
  uVar14 = 0x14c;
  puStack_60 = (undefined1 *)&puStack_50;
  auVar23 = ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x14c,"mid + 1 < hi");
  uVar9 = auVar23._8_8_;
  plVar10 = auVar23._0_8_;
  uStack_68 = 0x79fda0;
  plStack_d8 = unaff_x19;
  if (CARRY8(uVar9,uVar14)) {
code_r0x0079fe30:
    puStack_70 = (undefined1 *)&puStack_60;
    func_0x007a1f00(0,uVar9,&UNK_009d9028);
  }
  else {
    lVar20 = *plVar10;
    unaff_x20 = (undefined *)(uVar14 + uVar9);
    if ((undefined *)(uVar14 + uVar9) <= (undefined *)(lVar20 * 2)) {
      unaff_x20 = (undefined *)(lVar20 * 2);
    }
    if (unaff_x20 < (undefined *)0x9) {
      unaff_x20 = (undefined *)0x8;
    }
    plStack_d8 = plVar10;
    if ((long)unaff_x20 < 0) goto code_r0x0079fe30;
    if (lVar20 != 0) {
      uStack_98 = plVar10[1];
      lStack_88 = lVar20;
    }
    uStack_90 = (ulong)(lVar20 != 0);
    puStack_70 = (undefined1 *)&puStack_60;
    plVar6 = (long *)func_0x0079a108(aiStack_b0,1,unaff_x20,&uStack_98);
    if (aiStack_b0[0] != 1) {
      *plVar10 = (long)unaff_x20;
      plVar10[1] = lStack_a8;
      return plVar6;
    }
  }
  func_0x007a1f00(lStack_a8,uStack_a0,&UNK_009d9028);
  puStack_b8 = &DAT_0079fe50;
  puVar15 = &UNK_009d9120;
  ppuStack_c0 = (undefined8 **)&puStack_70;
  puVar7 = (ulong *)func_0x007a11c0();
  ppuVar5 = &puStack_110;
  puStack_c8 = &DAT_0079fe64;
  ppppuVar22 = &pppuStack_d0;
  puStack_e0 = unaff_x20;
  pppuStack_d0 = &ppuStack_c0;
  puVar8 = (ulong *)(*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)();
  uVar9 = *puVar8;
  if (uVar9 < 3) {
    if (uVar9 == 2) {
      plVar10 = (long *)(*___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E)
                                  (&__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E);
      lVar20 = *plVar10;
      if (lVar20 == 0) {
        if (lRam0000000000a3bfe0 == -1) {
          uVar9 = func_0x007a0378();
          goto code_r0x0079ff40;
        }
        lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
        plVar10 = (long *)(*extraout_x9)(extraout_x8);
        *plVar10 = extraout_x12;
        lVar20 = extraout_x12;
      }
      puStack_110 = (ulong *)0x8000000000000000;
      plStack_108 = (long *)func_0x00412b1c(lVar20,&puStack_110);
      goto code_r0x0079ff1c;
    }
code_r0x0079ff40:
    puVar15 = &UNK_0079ff44;
  }
  else {
    plStack_108 = (long *)(uVar9 - 0x10);
    lVar20 = *plStack_108;
    *plStack_108 = lVar20 + 1;
    if (lVar20 < 0) {
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x79fea8);
      (*pcVar4)();
    }
code_r0x0079ff1c:
    if (*puVar7 == 0) {
      *puVar7 = (ulong)plStack_108;
      return (long *)puVar7;
    }
    puStack_110 = puVar7;
    func_0x003f5484(&puStack_110);
    puStack_110 = (ulong *)&UNK_009d92c0;
    plStack_108 = (long *)0x1;
    uStack_f8 = 0;
    uStack_f0 = 0;
    uStack_100 = 8;
    func_0x007a2420(&puStack_110,&UNK_009d92d0);
    puStack_118 = &__ZN4core9panicking13assert_failed17h17cb0099c897a332E;
    puVar16 = &UNK_009d9438;
    uStack_130 = extraout_x1;
    puStack_128 = puVar15;
    ppppuStack_120 = ppppuVar22;
    auVar23 = func_0x0043e520();
    uStack_150 = auVar23._8_8_;
    puStack_138 = &__ZN4core9panicking13assert_failed17h941d22ca71745078E;
    puVar15 = &UNK_009d9458;
    puVar19 = &UNK_009d9478;
    ppuVar18 = &puStack_148;
    puStack_148 = puVar16;
    ppppuStack_140 = &ppppuStack_120;
    func_0x007a272c(auVar23._0_8_,&uStack_150);
    puStack_158 = &__ZN4core9panicking13assert_failed17hdefcbb4b9730ffe9E;
    puVar17 = &UNK_009d9498;
    uStack_170 = extraout_x1_00;
    puStack_168 = puVar15;
    ppppuStack_160 = &ppppuStack_140;
    auVar23 = func_0x0043e520();
    uVar9 = auVar23._8_8_;
    puVar8 = auVar23._0_8_;
    puStack_178 = &DAT_007a0000;
    puVar16 = unaff_x20;
    puStack_190 = unaff_x20;
    puStack_188 = puVar7;
    ppppuStack_180 = &ppppuStack_160;
    if (CARRY8(uVar9,(ulong)puVar17)) {
code_r0x007a00d4:
      func_0x007a1f00(0,uVar9,&UNK_009d97e8);
code_r0x007a00e0:
      auVar23._8_8_ = uStack_1b0;
      auVar23._0_8_ = puVar7;
      uVar9 = uStack_1b8;
    }
    else {
      uVar14 = *puVar8;
      puVar16 = puVar17 + uVar9;
      if (puVar17 + uVar9 <= (undefined *)(uVar14 * 2)) {
        puVar16 = (undefined *)(uVar14 * 2);
      }
      puVar15 = (undefined *)0x8;
      if (puVar19 != (undefined *)0x1) {
        puVar15 = (undefined *)0x4;
      }
      if (puVar16 <= puVar15) {
        puVar16 = puVar15;
      }
      uVar21 = (ulong)((long)ppuVar18 + (long)(puVar19 + -1)) & -(long)ppuVar18;
      auVar2._8_8_ = 0;
      auVar2._0_8_ = uVar21;
      auVar3._8_8_ = 0;
      auVar3._0_8_ = puVar16;
      puVar7 = puVar8;
      if (SUB168(auVar2 * auVar3,8) != 0) goto code_r0x007a00d4;
      uVar21 = uVar21 * (long)puVar16;
      uVar9 = 0;
      if (uVar21 <= 0x8000000000000000U - (long)ppuVar18) {
        ppuStack_1a0 = (undefined **)0x0;
        if (uVar14 != 0) {
          uStack_1a8 = puVar8[1];
          lStack_198 = uVar14 * (long)puVar19;
          ppuStack_1a0 = ppuVar18;
        }
        plVar10 = (long *)func_0x0079a108(aiStack_1c0,ppuVar18,uVar21,&uStack_1a8);
        if (aiStack_1c0[0] != 1) {
          *puVar8 = (ulong)puVar16;
          puVar8[1] = uStack_1b8;
          return plVar10;
        }
        goto code_r0x007a00e0;
      }
    }
    puVar7 = auVar23._0_8_;
    func_0x007a1f00(uVar9,auVar23._8_8_,&UNK_009d97e8);
    puStack_1c8 = &DAT_007a00f0;
    puStack_208 = &UNK_009d9ee8;
    uStack_200 = 1;
    puStack_1f8 = auStack_1d8;
    uStack_1f0 = 0;
    uStack_1e8 = 0;
    ppppuStack_1d0 = &ppppuStack_180;
    uStack_210 = func_0x0041f554(auStack_1d8,&puStack_208);
    func_0x003f77f4(&uStack_210);
    uVar11 = func_0x007a144c();
    ppuVar5 = (ulong **)&puStack_250;
    puStack_218 = &DAT_007a0134;
    ppppuVar22 = &ppppuStack_220;
    ppppuStack_220 = &ppppuStack_1d0;
    func_0x00411a78(uVar11,0);
    puStack_250 = &UNK_009d9f20;
    uStack_248 = 1;
    uStack_238 = 0;
    uStack_230 = 0;
    uStack_240 = 8;
    puVar15 = &DAT_007a0174;
    uVar9 = func_0x007a2420(&puStack_250,&UNK_009d9f30);
    unaff_x20 = puVar16;
  }
  pcVar4 = ___ZN3std6thread7current7CURRENT17h01073c2742dba4edE;
  *(undefined8 *)((long)ppuVar5 + -0x30) = unaff_x22;
  *(undefined8 *)((long)ppuVar5 + -0x28) = unaff_x21;
  *(undefined **)((long)ppuVar5 + -0x20) = unaff_x20;
  *(ulong **)((long)ppuVar5 + -0x18) = puVar7;
  *(undefined8 *****)((long)ppuVar5 + -0x10) = ppppuVar22;
  *(undefined **)((long)ppuVar5 + -8) = puVar15;
  if (uVar9 == 0) {
    puVar12 = (undefined8 *)
              (*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)
                        (&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
    *puVar12 = 1;
    plVar10 = (long *)(*___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E)
                                (&__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E);
    lVar20 = *plVar10;
    if (lVar20 == 0) {
      if (lRam0000000000a3bfe0 == -1) goto code_r0x007a02bc;
      lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
      plVar10 = (long *)(*extraout_x9_00)(extraout_x8_00);
      *plVar10 = extraout_x12_00;
      lVar20 = extraout_x12_00;
    }
    *(undefined8 *)((long)ppuVar5 + -0x68) = 0x8000000000000000;
    plVar10 = (long *)func_0x00412b1c(lVar20,(undefined1 *)((long)ppuVar5 + -0x68));
    pbVar13 = (byte *)(*pcRam0000000000a2bca0)();
    bVar1 = *pbVar13;
    *pbVar13 = 1;
    if ((bVar1 & 1) == 0) {
      __tlv_atexit(&DAT_0043837c,0);
    }
    lVar20 = *plVar10;
    *plVar10 = lVar20 + 1;
    if (-1 < lVar20) {
      puVar12 = (undefined8 *)
                (*pcVar4)(plVar10 + 2,&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
      *puVar12 = extraout_x8_01;
      return plVar10;
    }
  }
  else {
    if (uVar9 == 1) {
      *(undefined **)((long)ppuVar5 + -0x68) = &UNK_009d9fb0;
      *(undefined8 *)((long)ppuVar5 + -0x60) = 1;
      *(undefined8 *)((long)ppuVar5 + -0x50) = 0;
      *(undefined8 *)((long)ppuVar5 + -0x48) = 0;
      *(undefined1 **)((long)ppuVar5 + -0x58) = (undefined1 *)((long)ppuVar5 + -0x38);
      uVar11 = func_0x0041f554((undefined1 *)((long)ppuVar5 + -0x38),
                               (undefined1 *)((long)ppuVar5 + -0x68));
      *(undefined8 *)((long)ppuVar5 + -0x70) = uVar11;
      func_0x003f77f4((undefined1 *)((long)ppuVar5 + -0x70));
      func_0x007a144c();
code_r0x007a02bc:
      func_0x007a0378();
    }
    *(undefined **)((long)ppuVar5 + -0x68) = &UNK_009d9f88;
    *(undefined8 *)((long)ppuVar5 + -0x60) = 1;
    *(undefined8 *)((long)ppuVar5 + -0x50) = 0;
    *(undefined8 *)((long)ppuVar5 + -0x48) = 0;
    *(undefined8 *)((long)ppuVar5 + -0x58) = 8;
    func_0x007a2420((undefined1 *)((long)ppuVar5 + -0x68),&UNK_009d9f98);
  }
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x7a02f0);
  (*pcVar4)();
}

