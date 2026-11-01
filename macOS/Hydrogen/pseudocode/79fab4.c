
/* WARNING: Possible PIC construction at 0x0079ff40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0079ff44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0079fab4(void)

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
  undefined *puStack_320;
  undefined8 uStack_318;
  undefined8 uStack_310;
  undefined8 uStack_308;
  undefined8 uStack_300;
  undefined8 ****ppppuStack_2f0;
  undefined *puStack_2e8;
  undefined8 uStack_2e0;
  undefined *puStack_2d8;
  undefined8 uStack_2d0;
  undefined1 *puStack_2c8;
  undefined8 uStack_2c0;
  undefined8 uStack_2b8;
  undefined1 auStack_2a8 [8];
  undefined8 ****ppppuStack_2a0;
  undefined *puStack_298;
  int aiStack_290 [2];
  ulong uStack_288;
  undefined8 uStack_280;
  ulong uStack_278;
  undefined **ppuStack_270;
  long lStack_268;
  undefined *puStack_260;
  ulong *puStack_258;
  undefined8 ****ppppuStack_250;
  undefined *puStack_248;
  undefined8 uStack_240;
  undefined *puStack_238;
  undefined8 ****ppppuStack_230;
  undefined *puStack_228;
  undefined8 uStack_220;
  undefined *puStack_218;
  undefined8 ****ppppuStack_210;
  undefined *puStack_208;
  undefined8 uStack_200;
  undefined *puStack_1f8;
  undefined8 ****ppppuStack_1f0;
  undefined *puStack_1e8;
  ulong *puStack_1e0;
  long *plStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined *puStack_1b0;
  long *plStack_1a8;
  undefined8 ***pppuStack_1a0;
  undefined *puStack_198;
  undefined8 **ppuStack_190;
  undefined *puStack_188;
  int aiStack_180 [2];
  long lStack_178;
  undefined8 uStack_170;
  ulong uStack_168;
  ulong uStack_160;
  long lStack_158;
  undefined1 *puStack_140;
  undefined8 uStack_138;
  undefined1 *puStack_130;
  undefined8 uStack_128;
  undefined1 *puStack_120;
  undefined8 uStack_118;
  undefined1 *puStack_110;
  undefined8 uStack_108;
  undefined1 *puStack_100;
  undefined8 uStack_f8;
  undefined1 *puStack_f0;
  undefined8 uStack_e8;
  undefined1 *puStack_e0;
  undefined8 uStack_d8;
  undefined1 *puStack_d0;
  undefined8 uStack_c8;
  undefined1 *puStack_c0;
  undefined8 uStack_b8;
  undefined1 *puStack_b0;
  undefined8 uStack_a8;
  undefined1 *puStack_a0;
  undefined8 uStack_98;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  undefined1 *puStack_80;
  undefined8 uStack_78;
  undefined1 *puStack_70;
  code *pcStack_68;
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
  
  ___assert_rtn("ecp_nistz256_cmp_x_coordinate","p256-nistz.c",0x25d,
                "group->order.N.width == P256_LIMBS");
  uStack_18 = 0x79fadc;
  puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc0,"p != NULL");
  uStack_28 = 0x79fb04;
  puStack_30 = (undefined1 *)&puStack_20;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc1,"p_scalar != NULL");
  uStack_38 = 0x79fb2c;
  puStack_40 = (undefined1 *)&puStack_30;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc2,"group->field.N.width == P256_LIMBS"
               );
  uStack_48 = 0x79fb54;
  puStack_50 = (undefined1 *)&puStack_40;
  ___assert_rtn("ec_GFp_nistp384_cmp_x_coordinate","p384.c",0x1a9,
                "group->field.N.width == group->order.N.width");
  uStack_58 = 0x79fb7c;
  puStack_60 = (undefined1 *)&puStack_50;
  ___assert_rtn("hmac_update","digestsign.c",0x57,
                "aws_lc_0_24_0_HMAC_Update(&hctx->ctx, data, count)");
  pcStack_68 = FUN_0079fba4;
  puStack_70 = (undefined1 *)&puStack_60;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36c,"BN_is_pow2(pow2_bits_100)");
  uStack_78 = 0x79fbcc;
  puStack_80 = (undefined1 *)&puStack_70;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36d,"BN_is_bit_set(pow2_bits_100, bits - 100)");
  uStack_88 = 0x79fbf4;
  puStack_90 = (undefined1 *)&puStack_80;
  ___assert_rtn("lh_maybe_resize","lhash.c",0xf4,"lh->num_buckets >= kMinNumBuckets");
  uStack_98 = 0x79fc1c;
  puStack_a0 = (undefined1 *)&puStack_90;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xab,"realloc_impl != NULL");
  uStack_a8 = 0x79fc44;
  puStack_b0 = (undefined1 *)&puStack_a0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xac,"free_impl != NULL");
  uStack_b8 = 0x79fc6c;
  puStack_c0 = (undefined1 *)&puStack_b0;
  func_0x0036f078("aws_lc_0_24_0_OPENSSL_free","mem.c");
  uStack_c8 = 0x79fc90;
  puStack_d0 = (undefined1 *)&puStack_c0;
  func_0x0036f070("aws_lc_0_24_0_OPENSSL_free","mem.c");
  uStack_d8 = 0x79fcb4;
  puStack_e0 = (undefined1 *)&puStack_d0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x10f,"malloc_impl != NULL");
  uStack_e8 = 0x79fcdc;
  puStack_f0 = (undefined1 *)&puStack_e0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x110,"free_impl != NULL");
  uStack_f8 = 0x79fd04;
  puStack_100 = (undefined1 *)&puStack_f0;
  func_0x003714cc("parse_integer","rsa_asn1.c");
  uStack_108 = 0x79fd28;
  puStack_110 = (undefined1 *)&puStack_100;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x13b,"lo <= mid && mid < hi");
  uStack_118 = 0x79fd50;
  puStack_120 = (undefined1 *)&puStack_110;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x151,"lo == hi");
  uStack_128 = 0x79fd78;
  uVar14 = 0x14c;
  puStack_130 = (undefined1 *)&puStack_120;
  auVar23 = ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x14c,"mid + 1 < hi");
  uVar9 = auVar23._8_8_;
  plVar10 = auVar23._0_8_;
  uStack_138 = 0x79fda0;
  plStack_1a8 = unaff_x19;
  if (CARRY8(uVar9,uVar14)) {
code_r0x0079fe30:
    puStack_140 = (undefined1 *)&puStack_130;
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
    plStack_1a8 = plVar10;
    if ((long)unaff_x20 < 0) goto code_r0x0079fe30;
    if (lVar20 != 0) {
      uStack_168 = plVar10[1];
      lStack_158 = lVar20;
    }
    uStack_160 = (ulong)(lVar20 != 0);
    puStack_140 = (undefined1 *)&puStack_130;
    plVar6 = (long *)func_0x0079a108(aiStack_180,1,unaff_x20,&uStack_168);
    if (aiStack_180[0] != 1) {
      *plVar10 = (long)unaff_x20;
      plVar10[1] = lStack_178;
      return plVar6;
    }
  }
  func_0x007a1f00(lStack_178,uStack_170,&UNK_009d9028);
  puStack_188 = &DAT_0079fe50;
  puVar15 = &UNK_009d9120;
  ppuStack_190 = (undefined8 **)&puStack_140;
  puVar7 = (ulong *)func_0x007a11c0();
  ppuVar5 = &puStack_1e0;
  puStack_198 = &DAT_0079fe64;
  ppppuVar22 = &pppuStack_1a0;
  puStack_1b0 = unaff_x20;
  pppuStack_1a0 = &ppuStack_190;
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
      puStack_1e0 = (ulong *)0x8000000000000000;
      plStack_1d8 = (long *)func_0x00412b1c(lVar20,&puStack_1e0);
      goto code_r0x0079ff1c;
    }
code_r0x0079ff40:
    puVar15 = &UNK_0079ff44;
  }
  else {
    plStack_1d8 = (long *)(uVar9 - 0x10);
    lVar20 = *plStack_1d8;
    *plStack_1d8 = lVar20 + 1;
    if (lVar20 < 0) {
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x79fea8);
      (*pcVar4)();
    }
code_r0x0079ff1c:
    if (*puVar7 == 0) {
      *puVar7 = (ulong)plStack_1d8;
      return (long *)puVar7;
    }
    puStack_1e0 = puVar7;
    func_0x003f5484(&puStack_1e0);
    puStack_1e0 = (ulong *)&UNK_009d92c0;
    plStack_1d8 = (long *)0x1;
    uStack_1c8 = 0;
    uStack_1c0 = 0;
    uStack_1d0 = 8;
    func_0x007a2420(&puStack_1e0,&UNK_009d92d0);
    puStack_1e8 = &__ZN4core9panicking13assert_failed17h17cb0099c897a332E;
    puVar16 = &UNK_009d9438;
    uStack_200 = extraout_x1;
    puStack_1f8 = puVar15;
    ppppuStack_1f0 = ppppuVar22;
    auVar23 = func_0x0043e520();
    uStack_220 = auVar23._8_8_;
    puStack_208 = &__ZN4core9panicking13assert_failed17h941d22ca71745078E;
    puVar15 = &UNK_009d9458;
    puVar19 = &UNK_009d9478;
    ppuVar18 = &puStack_218;
    puStack_218 = puVar16;
    ppppuStack_210 = &ppppuStack_1f0;
    func_0x007a272c(auVar23._0_8_,&uStack_220);
    puStack_228 = &__ZN4core9panicking13assert_failed17hdefcbb4b9730ffe9E;
    puVar17 = &UNK_009d9498;
    uStack_240 = extraout_x1_00;
    puStack_238 = puVar15;
    ppppuStack_230 = &ppppuStack_210;
    auVar23 = func_0x0043e520();
    uVar9 = auVar23._8_8_;
    puVar8 = auVar23._0_8_;
    puStack_248 = &DAT_007a0000;
    puVar16 = unaff_x20;
    puStack_260 = unaff_x20;
    puStack_258 = puVar7;
    ppppuStack_250 = &ppppuStack_230;
    if (CARRY8(uVar9,(ulong)puVar17)) {
code_r0x007a00d4:
      func_0x007a1f00(0,uVar9,&UNK_009d97e8);
code_r0x007a00e0:
      auVar23._8_8_ = uStack_280;
      auVar23._0_8_ = puVar7;
      uVar9 = uStack_288;
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
        ppuStack_270 = (undefined **)0x0;
        if (uVar14 != 0) {
          uStack_278 = puVar8[1];
          lStack_268 = uVar14 * (long)puVar19;
          ppuStack_270 = ppuVar18;
        }
        plVar10 = (long *)func_0x0079a108(aiStack_290,ppuVar18,uVar21,&uStack_278);
        if (aiStack_290[0] != 1) {
          *puVar8 = (ulong)puVar16;
          puVar8[1] = uStack_288;
          return plVar10;
        }
        goto code_r0x007a00e0;
      }
    }
    puVar7 = auVar23._0_8_;
    func_0x007a1f00(uVar9,auVar23._8_8_,&UNK_009d97e8);
    puStack_298 = &DAT_007a00f0;
    puStack_2d8 = &UNK_009d9ee8;
    uStack_2d0 = 1;
    puStack_2c8 = auStack_2a8;
    uStack_2c0 = 0;
    uStack_2b8 = 0;
    ppppuStack_2a0 = &ppppuStack_250;
    uStack_2e0 = func_0x0041f554(auStack_2a8,&puStack_2d8);
    func_0x003f77f4(&uStack_2e0);
    uVar11 = func_0x007a144c();
    ppuVar5 = (ulong **)&puStack_320;
    puStack_2e8 = &DAT_007a0134;
    ppppuVar22 = &ppppuStack_2f0;
    ppppuStack_2f0 = &ppppuStack_2a0;
    func_0x00411a78(uVar11,0);
    puStack_320 = &UNK_009d9f20;
    uStack_318 = 1;
    uStack_308 = 0;
    uStack_300 = 0;
    uStack_310 = 8;
    puVar15 = &DAT_007a0174;
    uVar9 = func_0x007a2420(&puStack_320,&UNK_009d9f30);
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

