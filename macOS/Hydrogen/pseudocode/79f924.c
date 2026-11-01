
/* WARNING: Possible PIC construction at 0x0079ff40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0079ff44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0079f924(undefined8 param_1,undefined8 param_2)

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
  undefined8 *puVar11;
  byte *pbVar12;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 uVar13;
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
  uint uVar21;
  code *extraout_x9;
  code *extraout_x9_00;
  uint uVar22;
  ulong uVar23;
  long extraout_x12;
  long extraout_x12_00;
  long *unaff_x19;
  undefined *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 ****ppppuVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [12];
  undefined *puStack_3a0;
  undefined8 uStack_398;
  undefined8 uStack_390;
  undefined8 uStack_388;
  undefined8 uStack_380;
  undefined8 ****ppppuStack_370;
  undefined *puStack_368;
  undefined8 uStack_360;
  undefined *puStack_358;
  undefined8 uStack_350;
  undefined1 *puStack_348;
  undefined8 uStack_340;
  undefined8 uStack_338;
  undefined1 auStack_328 [8];
  undefined8 ****ppppuStack_320;
  undefined *puStack_318;
  int aiStack_310 [2];
  ulong uStack_308;
  undefined8 uStack_300;
  ulong uStack_2f8;
  undefined **ppuStack_2f0;
  long lStack_2e8;
  undefined *puStack_2e0;
  ulong *puStack_2d8;
  undefined8 ****ppppuStack_2d0;
  undefined *puStack_2c8;
  undefined8 uStack_2c0;
  undefined *puStack_2b8;
  undefined8 ****ppppuStack_2b0;
  undefined *puStack_2a8;
  undefined8 uStack_2a0;
  undefined *puStack_298;
  undefined8 ****ppppuStack_290;
  undefined *puStack_288;
  undefined8 uStack_280;
  undefined *puStack_278;
  undefined8 ****ppppuStack_270;
  undefined *puStack_268;
  ulong *puStack_260;
  long *plStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined *puStack_230;
  long *plStack_228;
  undefined8 ***pppuStack_220;
  undefined *puStack_218;
  undefined8 **ppuStack_210;
  undefined *puStack_208;
  int aiStack_200 [2];
  long lStack_1f8;
  undefined8 uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  long lStack_1d8;
  undefined1 *puStack_1c0;
  undefined8 uStack_1b8;
  undefined1 *puStack_1b0;
  undefined8 uStack_1a8;
  undefined1 *puStack_1a0;
  undefined8 uStack_198;
  undefined1 *puStack_190;
  undefined8 uStack_188;
  undefined1 *puStack_180;
  undefined8 uStack_178;
  undefined1 *puStack_170;
  undefined8 uStack_168;
  undefined1 *puStack_160;
  undefined8 uStack_158;
  undefined1 *puStack_150;
  undefined8 uStack_148;
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
  code *pcStack_e8;
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
  code *pcStack_88;
  undefined1 *puStack_80;
  undefined *puStack_78;
  undefined1 *puStack_70;
  undefined *puStack_68;
  undefined1 *puStack_60;
  undefined *puStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  undefined1 *puStack_40;
  undefined *puStack_38;
  undefined1 *puStack_30;
  undefined *puStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  ___assert_rtn(param_1,param_2,0x1e2);
  ___assert_rtn("ecp_nistz256_get_affine","p256-nistz.c",0x1bf,"group->field.N.width == P256_LIMBS")
  ;
  uStack_18 = &DAT_0079f954;
  puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
  ___assert_rtn("ecp_nistz256_point_mul","p256-nistz.c",0x137,"group->field.N.width == P256_LIMBS");
  puStack_28 = &DAT_0079f97c;
  uVar13 = 0x168;
  puStack_30 = (undefined1 *)&puStack_20;
  auVar26 = ___assert_rtn("ecp_nistz256_point_mul_base","p256-nistz.c",0x168,
                          "group->field.N.width == P256_LIMBS");
  puStack_38 = &DAT_0079f9a4;
  uVar22 = auVar26._8_4_ | (uint)*(byte *)(auVar26._0_8_ + 1) << 8;
  uVar21 = uVar22 >> 6 & 0xff;
  uVar22 = uVar22 >> 0xd & 1;
  uVar22 = uVar22 - 1 & uVar21 | (uVar21 ^ 0xff) & -uVar22;
  puStack_40 = (undefined1 *)&puStack_30;
  func_0x00386270(uVar13,&UNK_0083d000,(uVar22 & 1) * 2 + uVar22 >> 1);
  func_0x0031e7c4("align_pointer","internal.h");
  puStack_48 = &DAT_0079fa14;
  puStack_50 = (undefined1 *)&puStack_40;
  ___assert_rtn("ecp_nistz256_points_mul_public","p256-nistz.c",0x173,
                "p_ != NULL && p_scalar != NULL && g_scalar != NULL");
  puStack_58 = &DAT_0079fa3c;
  puStack_60 = (undefined1 *)&puStack_50;
  ___assert_rtn("ecp_nistz256_points_mul_public","p256-nistz.c",0x1af,
                "group->field.N.width == P256_LIMBS");
  puStack_68 = &DAT_0079fa64;
  puStack_70 = (undefined1 *)&puStack_60;
  ___assert_rtn("ecp_nistz256_scalar_to_montgomery_inv_vartime","p256-nistz.c",0x24a,
                "group->order.N.width == P256_LIMBS");
  puStack_78 = &DAT_0079fa8c;
  puStack_80 = (undefined1 *)&puStack_70;
  ___assert_rtn("ecp_nistz256_cmp_x_coordinate","p256-nistz.c",0x25e,
                "group->field.N.width == P256_LIMBS");
  pcStack_88 = FUN_0079fab4;
  puStack_90 = (undefined1 *)&puStack_80;
  ___assert_rtn("ecp_nistz256_cmp_x_coordinate","p256-nistz.c",0x25d,
                "group->order.N.width == P256_LIMBS");
  uStack_98 = 0x79fadc;
  puStack_a0 = (undefined1 *)&puStack_90;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc0,"p != NULL");
  uStack_a8 = 0x79fb04;
  puStack_b0 = (undefined1 *)&puStack_a0;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc1,"p_scalar != NULL");
  uStack_b8 = 0x79fb2c;
  puStack_c0 = (undefined1 *)&puStack_b0;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc2,"group->field.N.width == P256_LIMBS"
               );
  uStack_c8 = 0x79fb54;
  puStack_d0 = (undefined1 *)&puStack_c0;
  ___assert_rtn("ec_GFp_nistp384_cmp_x_coordinate","p384.c",0x1a9,
                "group->field.N.width == group->order.N.width");
  uStack_d8 = 0x79fb7c;
  puStack_e0 = (undefined1 *)&puStack_d0;
  ___assert_rtn("hmac_update","digestsign.c",0x57,
                "aws_lc_0_24_0_HMAC_Update(&hctx->ctx, data, count)");
  pcStack_e8 = FUN_0079fba4;
  puStack_f0 = (undefined1 *)&puStack_e0;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36c,"BN_is_pow2(pow2_bits_100)");
  uStack_f8 = 0x79fbcc;
  puStack_100 = (undefined1 *)&puStack_f0;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36d,"BN_is_bit_set(pow2_bits_100, bits - 100)");
  uStack_108 = 0x79fbf4;
  puStack_110 = (undefined1 *)&puStack_100;
  ___assert_rtn("lh_maybe_resize","lhash.c",0xf4,"lh->num_buckets >= kMinNumBuckets");
  uStack_118 = 0x79fc1c;
  puStack_120 = (undefined1 *)&puStack_110;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xab,"realloc_impl != NULL");
  uStack_128 = 0x79fc44;
  puStack_130 = (undefined1 *)&puStack_120;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xac,"free_impl != NULL");
  uStack_138 = 0x79fc6c;
  puStack_140 = (undefined1 *)&puStack_130;
  func_0x0036f078("aws_lc_0_24_0_OPENSSL_free","mem.c");
  uStack_148 = 0x79fc90;
  puStack_150 = (undefined1 *)&puStack_140;
  func_0x0036f070("aws_lc_0_24_0_OPENSSL_free","mem.c");
  uStack_158 = 0x79fcb4;
  puStack_160 = (undefined1 *)&puStack_150;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x10f,"malloc_impl != NULL");
  uStack_168 = 0x79fcdc;
  puStack_170 = (undefined1 *)&puStack_160;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x110,"free_impl != NULL");
  uStack_178 = 0x79fd04;
  puStack_180 = (undefined1 *)&puStack_170;
  func_0x003714cc("parse_integer","rsa_asn1.c");
  uStack_188 = 0x79fd28;
  puStack_190 = (undefined1 *)&puStack_180;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x13b,"lo <= mid && mid < hi");
  uStack_198 = 0x79fd50;
  puStack_1a0 = (undefined1 *)&puStack_190;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x151,"lo == hi");
  uStack_1a8 = 0x79fd78;
  uVar14 = 0x14c;
  puStack_1b0 = (undefined1 *)&puStack_1a0;
  auVar25 = ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x14c,"mid + 1 < hi");
  uVar9 = auVar25._8_8_;
  plVar10 = auVar25._0_8_;
  uStack_1b8 = 0x79fda0;
  plStack_228 = unaff_x19;
  if (CARRY8(uVar9,uVar14)) {
code_r0x0079fe30:
    puStack_1c0 = (undefined1 *)&puStack_1b0;
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
    plStack_228 = plVar10;
    if ((long)unaff_x20 < 0) goto code_r0x0079fe30;
    if (lVar20 != 0) {
      uStack_1e8 = plVar10[1];
      lStack_1d8 = lVar20;
    }
    uStack_1e0 = (ulong)(lVar20 != 0);
    puStack_1c0 = (undefined1 *)&puStack_1b0;
    plVar6 = (long *)func_0x0079a108(aiStack_200,1,unaff_x20,&uStack_1e8);
    if (aiStack_200[0] != 1) {
      *plVar10 = (long)unaff_x20;
      plVar10[1] = lStack_1f8;
      return plVar6;
    }
  }
  func_0x007a1f00(lStack_1f8,uStack_1f0,&UNK_009d9028);
  puStack_208 = &DAT_0079fe50;
  puVar15 = &UNK_009d9120;
  ppuStack_210 = (undefined8 **)&puStack_1c0;
  puVar7 = (ulong *)func_0x007a11c0();
  ppuVar5 = &puStack_260;
  puStack_218 = &DAT_0079fe64;
  ppppuVar24 = &pppuStack_220;
  puStack_230 = unaff_x20;
  pppuStack_220 = &ppuStack_210;
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
      puStack_260 = (ulong *)0x8000000000000000;
      plStack_258 = (long *)func_0x00412b1c(lVar20,&puStack_260);
      goto code_r0x0079ff1c;
    }
code_r0x0079ff40:
    puVar15 = &UNK_0079ff44;
  }
  else {
    plStack_258 = (long *)(uVar9 - 0x10);
    lVar20 = *plStack_258;
    *plStack_258 = lVar20 + 1;
    if (lVar20 < 0) {
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x79fea8);
      (*pcVar4)();
    }
code_r0x0079ff1c:
    if (*puVar7 == 0) {
      *puVar7 = (ulong)plStack_258;
      return (long *)puVar7;
    }
    puStack_260 = puVar7;
    func_0x003f5484(&puStack_260);
    puStack_260 = (ulong *)&UNK_009d92c0;
    plStack_258 = (long *)0x1;
    uStack_248 = 0;
    uStack_240 = 0;
    uStack_250 = 8;
    func_0x007a2420(&puStack_260,&UNK_009d92d0);
    puStack_268 = &__ZN4core9panicking13assert_failed17h17cb0099c897a332E;
    puVar16 = &UNK_009d9438;
    uStack_280 = extraout_x1;
    puStack_278 = puVar15;
    ppppuStack_270 = ppppuVar24;
    auVar25 = func_0x0043e520();
    uStack_2a0 = auVar25._8_8_;
    puStack_288 = &__ZN4core9panicking13assert_failed17h941d22ca71745078E;
    puVar15 = &UNK_009d9458;
    puVar19 = &UNK_009d9478;
    ppuVar18 = &puStack_298;
    puStack_298 = puVar16;
    ppppuStack_290 = &ppppuStack_270;
    func_0x007a272c(auVar25._0_8_,&uStack_2a0);
    puStack_2a8 = &__ZN4core9panicking13assert_failed17hdefcbb4b9730ffe9E;
    puVar17 = &UNK_009d9498;
    uStack_2c0 = extraout_x1_00;
    puStack_2b8 = puVar15;
    ppppuStack_2b0 = &ppppuStack_290;
    auVar25 = func_0x0043e520();
    uVar9 = auVar25._8_8_;
    puVar8 = auVar25._0_8_;
    puStack_2c8 = &DAT_007a0000;
    puVar16 = unaff_x20;
    puStack_2e0 = unaff_x20;
    puStack_2d8 = puVar7;
    ppppuStack_2d0 = &ppppuStack_2b0;
    if (CARRY8(uVar9,(ulong)puVar17)) {
code_r0x007a00d4:
      func_0x007a1f00(0,uVar9,&UNK_009d97e8);
code_r0x007a00e0:
      auVar25._8_8_ = uStack_300;
      auVar25._0_8_ = puVar7;
      uVar9 = uStack_308;
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
      uVar23 = (ulong)((long)ppuVar18 + (long)(puVar19 + -1)) & -(long)ppuVar18;
      auVar2._8_8_ = 0;
      auVar2._0_8_ = uVar23;
      auVar3._8_8_ = 0;
      auVar3._0_8_ = puVar16;
      puVar7 = puVar8;
      if (SUB168(auVar2 * auVar3,8) != 0) goto code_r0x007a00d4;
      uVar23 = uVar23 * (long)puVar16;
      uVar9 = 0;
      if (uVar23 <= 0x8000000000000000U - (long)ppuVar18) {
        ppuStack_2f0 = (undefined **)0x0;
        if (uVar14 != 0) {
          uStack_2f8 = puVar8[1];
          lStack_2e8 = uVar14 * (long)puVar19;
          ppuStack_2f0 = ppuVar18;
        }
        plVar10 = (long *)func_0x0079a108(aiStack_310,ppuVar18,uVar23,&uStack_2f8);
        if (aiStack_310[0] != 1) {
          *puVar8 = (ulong)puVar16;
          puVar8[1] = uStack_308;
          return plVar10;
        }
        goto code_r0x007a00e0;
      }
    }
    puVar7 = auVar25._0_8_;
    func_0x007a1f00(uVar9,auVar25._8_8_,&UNK_009d97e8);
    puStack_318 = &DAT_007a00f0;
    puStack_358 = &UNK_009d9ee8;
    uStack_350 = 1;
    puStack_348 = auStack_328;
    uStack_340 = 0;
    uStack_338 = 0;
    ppppuStack_320 = &ppppuStack_2d0;
    uStack_360 = func_0x0041f554(auStack_328,&puStack_358);
    func_0x003f77f4(&uStack_360);
    uVar13 = func_0x007a144c();
    ppuVar5 = (ulong **)&puStack_3a0;
    puStack_368 = &DAT_007a0134;
    ppppuVar24 = &ppppuStack_370;
    ppppuStack_370 = &ppppuStack_320;
    func_0x00411a78(uVar13,0);
    puStack_3a0 = &UNK_009d9f20;
    uStack_398 = 1;
    uStack_388 = 0;
    uStack_380 = 0;
    uStack_390 = 8;
    puVar15 = &DAT_007a0174;
    uVar9 = func_0x007a2420(&puStack_3a0,&UNK_009d9f30);
    unaff_x20 = puVar16;
  }
  pcVar4 = ___ZN3std6thread7current7CURRENT17h01073c2742dba4edE;
  *(undefined8 *)((long)ppuVar5 + -0x30) = unaff_x22;
  *(undefined8 *)((long)ppuVar5 + -0x28) = unaff_x21;
  *(undefined **)((long)ppuVar5 + -0x20) = unaff_x20;
  *(ulong **)((long)ppuVar5 + -0x18) = puVar7;
  *(undefined8 *****)((long)ppuVar5 + -0x10) = ppppuVar24;
  *(undefined **)((long)ppuVar5 + -8) = puVar15;
  if (uVar9 == 0) {
    puVar11 = (undefined8 *)
              (*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)
                        (&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
    *puVar11 = 1;
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
    pbVar12 = (byte *)(*pcRam0000000000a2bca0)();
    bVar1 = *pbVar12;
    *pbVar12 = 1;
    if ((bVar1 & 1) == 0) {
      __tlv_atexit(&DAT_0043837c,0);
    }
    lVar20 = *plVar10;
    *plVar10 = lVar20 + 1;
    if (-1 < lVar20) {
      puVar11 = (undefined8 *)
                (*pcVar4)(plVar10 + 2,&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
      *puVar11 = extraout_x8_01;
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
      uVar13 = func_0x0041f554((undefined1 *)((long)ppuVar5 + -0x38),
                               (undefined1 *)((long)ppuVar5 + -0x68));
      *(undefined8 *)((long)ppuVar5 + -0x70) = uVar13;
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

