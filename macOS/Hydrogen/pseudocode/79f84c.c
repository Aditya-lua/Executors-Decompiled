
/* WARNING: Possible PIC construction at 0x0079ff40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0079ff44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0079f84c(long param_1,undefined8 param_2,undefined8 param_3)

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
  undefined *puStack_3f0;
  undefined8 uStack_3e8;
  undefined8 uStack_3e0;
  undefined8 uStack_3d8;
  undefined8 uStack_3d0;
  undefined8 ****ppppuStack_3c0;
  undefined *puStack_3b8;
  undefined8 uStack_3b0;
  undefined *puStack_3a8;
  undefined8 uStack_3a0;
  undefined1 *puStack_398;
  undefined8 uStack_390;
  undefined8 uStack_388;
  undefined1 auStack_378 [8];
  undefined8 ****ppppuStack_370;
  undefined *puStack_368;
  int aiStack_360 [2];
  ulong uStack_358;
  undefined8 uStack_350;
  ulong uStack_348;
  undefined **ppuStack_340;
  long lStack_338;
  undefined *puStack_330;
  ulong *puStack_328;
  undefined8 ****ppppuStack_320;
  undefined *puStack_318;
  undefined8 uStack_310;
  undefined *puStack_308;
  undefined8 ****ppppuStack_300;
  undefined *puStack_2f8;
  undefined8 uStack_2f0;
  undefined *puStack_2e8;
  undefined8 ****ppppuStack_2e0;
  undefined *puStack_2d8;
  undefined8 uStack_2d0;
  undefined *puStack_2c8;
  undefined8 ****ppppuStack_2c0;
  undefined *puStack_2b8;
  ulong *puStack_2b0;
  long *plStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined *puStack_280;
  long *plStack_278;
  undefined8 ***pppuStack_270;
  undefined *puStack_268;
  undefined8 **ppuStack_260;
  undefined *puStack_258;
  int aiStack_250 [2];
  long lStack_248;
  undefined8 uStack_240;
  ulong uStack_238;
  ulong uStack_230;
  long lStack_228;
  undefined1 *puStack_210;
  undefined *puStack_208;
  undefined1 *puStack_200;
  undefined *puStack_1f8;
  undefined1 *puStack_1f0;
  undefined *puStack_1e8;
  undefined1 *puStack_1e0;
  undefined *puStack_1d8;
  undefined1 *puStack_1d0;
  undefined *puStack_1c8;
  undefined1 *puStack_1c0;
  undefined *puStack_1b8;
  undefined1 *puStack_1b0;
  undefined *puStack_1a8;
  undefined1 *puStack_1a0;
  undefined *puStack_198;
  undefined1 *puStack_190;
  undefined *puStack_188;
  undefined1 *puStack_180;
  undefined *puStack_178;
  undefined1 *puStack_170;
  undefined *puStack_168;
  undefined1 *puStack_160;
  undefined *puStack_158;
  undefined1 *puStack_150;
  undefined *puStack_148;
  undefined1 *puStack_140;
  undefined *puStack_138;
  undefined1 *puStack_130;
  undefined *puStack_128;
  undefined1 *puStack_120;
  undefined *puStack_118;
  undefined1 *puStack_110;
  undefined *puStack_108;
  undefined1 *puStack_100;
  undefined *puStack_f8;
  undefined1 *puStack_f0;
  undefined *puStack_e8;
  undefined1 *puStack_e0;
  undefined *puStack_d8;
  undefined1 *puStack_d0;
  undefined *puStack_c8;
  undefined1 *puStack_c0;
  undefined *puStack_b8;
  undefined1 *puStack_b0;
  undefined *puStack_a8;
  undefined1 *puStack_a0;
  undefined *puStack_98;
  undefined1 *puStack_90;
  undefined *puStack_88;
  undefined1 *puStack_80;
  undefined *puStack_78;
  undefined1 *puStack_70;
  undefined *puStack_68;
  undefined1 *puStack_60;
  undefined *puStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  func_0x0031e778(param_1 + 0xe1d,"digests.c",param_3,
                  "aws_lc_0_24_0_SHAKE_Final(md, ctx->md_data, len)");
  ___assert_rtn("shake256_update","digests.c",0x1ca,
                "aws_lc_0_24_0_SHA3_Update(ctx->md_data, data, count)");
  uStack_18 = 0x79f88c;
  puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
  ___assert_rtn("shake256_finalXOF","digests.c",0x1ce,
                "aws_lc_0_24_0_SHAKE_Final(md, ctx->md_data, len)");
  uStack_28 = 0x79f8b4;
  puStack_30 = (undefined1 *)&puStack_20;
  ___assert_rtn("ec_GFp_nistp224_point_mul_public","p224-64.c",0x436,"!skip");
  uStack_38 = 0x79f8dc;
  puStack_40 = (undefined1 *)&puStack_30;
  ___assert_rtn("ec_GFp_nistp256_point_mul_public","p256.c",0x1ab,"digit & 1");
  uStack_48 = 0x79f904;
  puStack_50 = (undefined1 *)&puStack_40;
  ___assert_rtn("ec_GFp_nistp256_cmp_x_coordinate","p256.c",0x1e2,
                "group->field.N.width == group->order.N.width");
  puStack_58 = &DAT_0079f92c;
  puStack_60 = (undefined1 *)&puStack_50;
  ___assert_rtn("ecp_nistz256_get_affine","p256-nistz.c",0x1bf,"group->field.N.width == P256_LIMBS")
  ;
  puStack_68 = &DAT_0079f954;
  puStack_70 = (undefined1 *)&puStack_60;
  ___assert_rtn("ecp_nistz256_point_mul","p256-nistz.c",0x137,"group->field.N.width == P256_LIMBS");
  puStack_78 = &DAT_0079f97c;
  uVar13 = 0x168;
  puStack_80 = (undefined1 *)&puStack_70;
  auVar26 = ___assert_rtn("ecp_nistz256_point_mul_base","p256-nistz.c",0x168,
                          "group->field.N.width == P256_LIMBS");
  puStack_88 = &DAT_0079f9a4;
  uVar22 = auVar26._8_4_ | (uint)*(byte *)(auVar26._0_8_ + 1) << 8;
  uVar21 = uVar22 >> 6 & 0xff;
  uVar22 = uVar22 >> 0xd & 1;
  uVar22 = uVar22 - 1 & uVar21 | (uVar21 ^ 0xff) & -uVar22;
  puStack_90 = (undefined1 *)&puStack_80;
  func_0x00386270(uVar13,&UNK_0083d000,(uVar22 & 1) * 2 + uVar22 >> 1);
  func_0x0031e7c4("align_pointer","internal.h");
  puStack_98 = &DAT_0079fa14;
  puStack_a0 = (undefined1 *)&puStack_90;
  ___assert_rtn("ecp_nistz256_points_mul_public","p256-nistz.c",0x173,
                "p_ != NULL && p_scalar != NULL && g_scalar != NULL");
  puStack_a8 = &DAT_0079fa3c;
  puStack_b0 = (undefined1 *)&puStack_a0;
  ___assert_rtn("ecp_nistz256_points_mul_public","p256-nistz.c",0x1af,
                "group->field.N.width == P256_LIMBS");
  puStack_b8 = &DAT_0079fa64;
  puStack_c0 = (undefined1 *)&puStack_b0;
  ___assert_rtn("ecp_nistz256_scalar_to_montgomery_inv_vartime","p256-nistz.c",0x24a,
                "group->order.N.width == P256_LIMBS");
  puStack_c8 = &DAT_0079fa8c;
  puStack_d0 = (undefined1 *)&puStack_c0;
  ___assert_rtn("ecp_nistz256_cmp_x_coordinate","p256-nistz.c",0x25e,
                "group->field.N.width == P256_LIMBS");
  puStack_d8 = &DAT_0079fab4;
  puStack_e0 = (undefined1 *)&puStack_d0;
  ___assert_rtn("ecp_nistz256_cmp_x_coordinate","p256-nistz.c",0x25d,
                "group->order.N.width == P256_LIMBS");
  puStack_e8 = &DAT_0079fadc;
  puStack_f0 = (undefined1 *)&puStack_e0;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc0,"p != NULL");
  puStack_f8 = &DAT_0079fb04;
  puStack_100 = (undefined1 *)&puStack_f0;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc1,"p_scalar != NULL");
  puStack_108 = &DAT_0079fb2c;
  puStack_110 = (undefined1 *)&puStack_100;
  ___assert_rtn("ecp_nistz256_windowed_mul","p256-nistz.c",0xc2,"group->field.N.width == P256_LIMBS"
               );
  puStack_118 = &DAT_0079fb54;
  puStack_120 = (undefined1 *)&puStack_110;
  ___assert_rtn("ec_GFp_nistp384_cmp_x_coordinate","p384.c",0x1a9,
                "group->field.N.width == group->order.N.width");
  puStack_128 = &DAT_0079fb7c;
  puStack_130 = (undefined1 *)&puStack_120;
  ___assert_rtn("hmac_update","digestsign.c",0x57,
                "aws_lc_0_24_0_HMAC_Update(&hctx->ctx, data, count)");
  puStack_138 = &DAT_0079fba4;
  puStack_140 = (undefined1 *)&puStack_130;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36c,"BN_is_pow2(pow2_bits_100)");
  puStack_148 = &DAT_0079fbcc;
  puStack_150 = (undefined1 *)&puStack_140;
  ___assert_rtn("generate_prime","rsa_impl.c",0x36d,"BN_is_bit_set(pow2_bits_100, bits - 100)");
  puStack_158 = &DAT_0079fbf4;
  puStack_160 = (undefined1 *)&puStack_150;
  ___assert_rtn("lh_maybe_resize","lhash.c",0xf4,"lh->num_buckets >= kMinNumBuckets");
  puStack_168 = &DAT_0079fc1c;
  puStack_170 = (undefined1 *)&puStack_160;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xab,"realloc_impl != NULL");
  puStack_178 = &DAT_0079fc44;
  puStack_180 = (undefined1 *)&puStack_170;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_malloc","mem.c",0xac,"free_impl != NULL");
  puStack_188 = &DAT_0079fc6c;
  puStack_190 = (undefined1 *)&puStack_180;
  func_0x0036f078("aws_lc_0_24_0_OPENSSL_free","mem.c");
  puStack_198 = &DAT_0079fc90;
  puStack_1a0 = (undefined1 *)&puStack_190;
  func_0x0036f070("aws_lc_0_24_0_OPENSSL_free","mem.c");
  puStack_1a8 = &DAT_0079fcb4;
  puStack_1b0 = (undefined1 *)&puStack_1a0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x10f,"malloc_impl != NULL");
  puStack_1b8 = &DAT_0079fcdc;
  puStack_1c0 = (undefined1 *)&puStack_1b0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_realloc","mem.c",0x110,"free_impl != NULL");
  puStack_1c8 = &DAT_0079fd04;
  puStack_1d0 = (undefined1 *)&puStack_1c0;
  func_0x003714cc("parse_integer","rsa_asn1.c");
  puStack_1d8 = &DAT_0079fd28;
  puStack_1e0 = (undefined1 *)&puStack_1d0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x13b,"lo <= mid && mid < hi");
  puStack_1e8 = &DAT_0079fd50;
  puStack_1f0 = (undefined1 *)&puStack_1e0;
  ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x151,"lo == hi");
  puStack_1f8 = &DAT_0079fd78;
  uVar14 = 0x14c;
  puStack_200 = (undefined1 *)&puStack_1f0;
  auVar25 = ___assert_rtn("aws_lc_0_24_0_OPENSSL_sk_find","stack.c",0x14c,"mid + 1 < hi");
  uVar9 = auVar25._8_8_;
  plVar10 = auVar25._0_8_;
  puStack_208 = &DAT_0079fda0;
  plStack_278 = unaff_x19;
  if (CARRY8(uVar9,uVar14)) {
code_r0x0079fe30:
    puStack_210 = (undefined1 *)&puStack_200;
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
    plStack_278 = plVar10;
    if ((long)unaff_x20 < 0) goto code_r0x0079fe30;
    if (lVar20 != 0) {
      uStack_238 = plVar10[1];
      lStack_228 = lVar20;
    }
    uStack_230 = (ulong)(lVar20 != 0);
    puStack_210 = (undefined1 *)&puStack_200;
    plVar6 = (long *)func_0x0079a108(aiStack_250,1,unaff_x20,&uStack_238);
    if (aiStack_250[0] != 1) {
      *plVar10 = (long)unaff_x20;
      plVar10[1] = lStack_248;
      return plVar6;
    }
  }
  func_0x007a1f00(lStack_248,uStack_240,&UNK_009d9028);
  puStack_258 = &DAT_0079fe50;
  puVar15 = &UNK_009d9120;
  ppuStack_260 = (undefined8 **)&puStack_210;
  puVar7 = (ulong *)func_0x007a11c0();
  ppuVar5 = &puStack_2b0;
  puStack_268 = &DAT_0079fe64;
  ppppuVar24 = &pppuStack_270;
  puStack_280 = unaff_x20;
  pppuStack_270 = &ppuStack_260;
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
      puStack_2b0 = (ulong *)0x8000000000000000;
      plStack_2a8 = (long *)func_0x00412b1c(lVar20,&puStack_2b0);
      goto code_r0x0079ff1c;
    }
code_r0x0079ff40:
    puVar15 = &UNK_0079ff44;
  }
  else {
    plStack_2a8 = (long *)(uVar9 - 0x10);
    lVar20 = *plStack_2a8;
    *plStack_2a8 = lVar20 + 1;
    if (lVar20 < 0) {
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x79fea8);
      (*pcVar4)();
    }
code_r0x0079ff1c:
    if (*puVar7 == 0) {
      *puVar7 = (ulong)plStack_2a8;
      return (long *)puVar7;
    }
    puStack_2b0 = puVar7;
    func_0x003f5484(&puStack_2b0);
    puStack_2b0 = (ulong *)&UNK_009d92c0;
    plStack_2a8 = (long *)0x1;
    uStack_298 = 0;
    uStack_290 = 0;
    uStack_2a0 = 8;
    func_0x007a2420(&puStack_2b0,&UNK_009d92d0);
    puStack_2b8 = &__ZN4core9panicking13assert_failed17h17cb0099c897a332E;
    puVar16 = &UNK_009d9438;
    uStack_2d0 = extraout_x1;
    puStack_2c8 = puVar15;
    ppppuStack_2c0 = ppppuVar24;
    auVar25 = func_0x0043e520();
    uStack_2f0 = auVar25._8_8_;
    puStack_2d8 = &__ZN4core9panicking13assert_failed17h941d22ca71745078E;
    puVar15 = &UNK_009d9458;
    puVar19 = &UNK_009d9478;
    ppuVar18 = &puStack_2e8;
    puStack_2e8 = puVar16;
    ppppuStack_2e0 = &ppppuStack_2c0;
    func_0x007a272c(auVar25._0_8_,&uStack_2f0);
    puStack_2f8 = &__ZN4core9panicking13assert_failed17hdefcbb4b9730ffe9E;
    puVar17 = &UNK_009d9498;
    uStack_310 = extraout_x1_00;
    puStack_308 = puVar15;
    ppppuStack_300 = &ppppuStack_2e0;
    auVar25 = func_0x0043e520();
    uVar9 = auVar25._8_8_;
    puVar8 = auVar25._0_8_;
    puStack_318 = &DAT_007a0000;
    puVar16 = unaff_x20;
    puStack_330 = unaff_x20;
    puStack_328 = puVar7;
    ppppuStack_320 = &ppppuStack_300;
    if (CARRY8(uVar9,(ulong)puVar17)) {
code_r0x007a00d4:
      func_0x007a1f00(0,uVar9,&UNK_009d97e8);
code_r0x007a00e0:
      auVar25._8_8_ = uStack_350;
      auVar25._0_8_ = puVar7;
      uVar9 = uStack_358;
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
        ppuStack_340 = (undefined **)0x0;
        if (uVar14 != 0) {
          uStack_348 = puVar8[1];
          lStack_338 = uVar14 * (long)puVar19;
          ppuStack_340 = ppuVar18;
        }
        plVar10 = (long *)func_0x0079a108(aiStack_360,ppuVar18,uVar23,&uStack_348);
        if (aiStack_360[0] != 1) {
          *puVar8 = (ulong)puVar16;
          puVar8[1] = uStack_358;
          return plVar10;
        }
        goto code_r0x007a00e0;
      }
    }
    puVar7 = auVar25._0_8_;
    func_0x007a1f00(uVar9,auVar25._8_8_,&UNK_009d97e8);
    puStack_368 = &DAT_007a00f0;
    puStack_3a8 = &UNK_009d9ee8;
    uStack_3a0 = 1;
    puStack_398 = auStack_378;
    uStack_390 = 0;
    uStack_388 = 0;
    ppppuStack_370 = &ppppuStack_320;
    uStack_3b0 = func_0x0041f554(auStack_378,&puStack_3a8);
    func_0x003f77f4(&uStack_3b0);
    uVar13 = func_0x007a144c();
    ppuVar5 = (ulong **)&puStack_3f0;
    puStack_3b8 = &DAT_007a0134;
    ppppuVar24 = &ppppuStack_3c0;
    ppppuStack_3c0 = &ppppuStack_370;
    func_0x00411a78(uVar13,0);
    puStack_3f0 = &UNK_009d9f20;
    uStack_3e8 = 1;
    uStack_3d8 = 0;
    uStack_3d0 = 0;
    uStack_3e0 = 8;
    puVar15 = &DAT_007a0174;
    uVar9 = func_0x007a2420(&puStack_3f0,&UNK_009d9f30);
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

