/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3e3a8
 */

undefined8
ossl_ed25519_sign(void *param_1,void *param_2,size_t param_3,void *param_4,void *param_5,
                 undefined8 param_6,undefined8 param_7)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  uint uVar21;
  uint3 uVar22;
  int iVar23;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  ulong uVar24;
  long lVar25;
  ulong uVar26;
  long lVar27;
  ulong uVar28;
  long lVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  ulong uVar36;
  ulong uVar37;
  long lVar38;
  long lVar39;
  ulong uVar40;
  long lVar41;
  ulong uVar42;
  long lVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  ulong uVar47;
  ulong uVar48;
  ulong uVar49;
  long lVar50;
  long lVar51;
  ulong uVar52;
  ulong uVar53;
  long lVar54;
  ulong uVar55;
  long lVar56;
  ulong uVar57;
  ulong uVar58;
  ulong uVar59;
  long lVar60;
  long lVar61;
  long lVar62;
  long lVar63;
  undefined8 uVar64;
  ulong uVar65;
  ulong uVar66;
  ulong uVar67;
  long lVar68;
  ulong uVar69;
  long lVar70;
  uint uStack_23c;
  ushort local_238;
  byte local_236;
  undefined1 local_235;
  undefined1 local_234;
  undefined1 local_233;
  undefined1 local_232;
  undefined1 local_231;
  undefined1 local_230;
  undefined1 local_22f;
  undefined3 local_22e;
  undefined4 local_22b;
  undefined1 local_227;
  byte local_226;
  byte local_225;
  byte local_224;
  ushort local_223;
  byte local_221;
  undefined1 local_220;
  undefined1 local_21f;
  undefined2 local_21e;
  undefined1 local_21c;
  undefined1 local_21b;
  undefined1 local_21a;
  undefined1 local_219;
  undefined1 auStack_1f8 [40];
  undefined1 auStack_1d0 [40];
  undefined1 auStack_1a8 [80];
  ushort local_158;
  byte local_156;
  undefined1 local_155;
  undefined1 local_154;
  undefined2 local_153;
  undefined2 local_151;
  undefined1 local_14f;
  undefined3 local_14e;
  undefined2 local_14b;
  undefined3 local_149;
  byte local_146;
  byte local_145;
  byte local_144;
  ushort local_143;
  undefined2 local_141;
  undefined1 local_13f;
  undefined2 local_13e;
  undefined2 local_13c;
  undefined1 local_13a;
  undefined1 local_139;
  ushort local_118;
  undefined2 local_116;
  undefined1 local_114;
  undefined2 local_113;
  undefined2 local_111;
  undefined1 local_10f;
  undefined3 local_10e;
  undefined2 local_10b;
  undefined2 local_109;
  undefined1 local_107;
  byte local_106;
  byte local_105;
  byte local_104;
  ushort local_103;
  undefined2 local_101;
  undefined1 local_ff;
  undefined2 local_fe;
  undefined2 local_fc;
  undefined1 local_fa;
  byte local_f9;
  undefined1 auStack_f8 [32];
  undefined1 auStack_d8 [40];
  undefined1 auStack_b0 [40];
  char local_88 [40];
  
  type = (EVP_MD *)EVP_MD_fetch(param_6,"SHA512",param_7);
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  uVar64 = 0;
  if ((type != (EVP_MD *)0x0) && (ctx != (EVP_MD_CTX *)0x0)) {
    iVar23 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
    if ((iVar23 != 0) &&
       ((iVar23 = EVP_DigestUpdate(ctx,param_5,0x20), iVar23 != 0 &&
        (iVar23 = EVP_DigestFinal_ex(ctx,(uchar *)&local_118,&uStack_23c), iVar23 != 0)))) {
      local_118 = local_118 & 0xfff8;
      local_f9 = local_f9 & 0x3f | 0x40;
      iVar23 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
      if ((iVar23 != 0) &&
         (((iVar23 = EVP_DigestUpdate(ctx,auStack_f8,0x20), iVar23 != 0 &&
           (iVar23 = EVP_DigestUpdate(ctx,param_2,param_3), iVar23 != 0)) &&
          (iVar23 = EVP_DigestFinal_ex(ctx,(uchar *)&local_158,&uStack_23c), iVar23 != 0)))) {
        FUN_00a3f5ac(&local_158);
        FUN_00a3fd34(auStack_1f8,&local_158);
        FUN_00a44a70(&local_238,auStack_1a8);
        FUN_00a44e38(auStack_b0,auStack_1f8,&local_238);
        FUN_00a44e38(auStack_d8,auStack_1d0,&local_238);
        FUN_00a45158(param_1,auStack_d8);
        FUN_00a45158(local_88,auStack_b0);
        *(byte *)((long)param_1 + 0x1f) = *(byte *)((long)param_1 + 0x1f) ^ local_88[0] << 7;
        iVar23 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
        if (((iVar23 != 0) && (iVar23 = EVP_DigestUpdate(ctx,param_1,0x20), iVar23 != 0)) &&
           ((iVar23 = EVP_DigestUpdate(ctx,param_4,0x20), iVar23 != 0 &&
            ((iVar23 = EVP_DigestUpdate(ctx,param_2,param_3), iVar23 != 0 &&
             (iVar23 = EVP_DigestFinal_ex(ctx,(uchar *)&local_238,&uStack_23c), iVar23 != 0)))))) {
          FUN_00a3f5ac(&local_238);
          uVar46 = (ulong)local_238 | ((ulong)local_236 & 0x1f) << 0x10;
          uVar44 = (ulong)local_223 | ((ulong)local_221 & 0x1f) << 0x10;
          uVar65 = (ulong)local_118 | ((ulong)(byte)local_116 & 0x1f) << 0x10;
          uVar45 = (ulong)local_103 | ((ulong)(byte)local_101 & 0x1f) << 0x10;
          uVar47 = (ulong)(CONCAT13(local_233,CONCAT12(local_234,CONCAT11(local_235,local_236))) >>
                          5) & 0x1fffff;
          uVar53 = (ulong)(CONCAT13((undefined1)local_113,CONCAT12(local_114,local_116)) >> 5) &
                   0x1fffff;
          lVar39 = ((ulong)local_158 | ((ulong)local_156 & 0x1f) << 0x10) + uVar65 * uVar46;
          uVar1 = lVar39 + 0x100000;
          uVar21 = CONCAT13((undefined1)local_22b,local_22e);
          uVar22 = (uint3)local_22b;
          uVar49 = ((ulong)local_226 & 0xf8 | (ulong)local_225 << 8 | (ulong)local_224 << 0x10) >> 3
          ;
          uVar30 = (ulong)(uint3)(CONCAT12(local_231,CONCAT11(local_232,local_233)) >> 2) & 0x1fffff
          ;
          uVar42 = (ulong)(CONCAT13((undefined1)local_21e,
                                    CONCAT12(local_21f,CONCAT11(local_220,local_221))) >> 5) &
                   0x1fffff;
          uVar59 = (ulong)(CONCAT13((undefined1)local_fe,CONCAT12(local_ff,local_101)) >> 5) &
                   0x1fffff;
          uVar69 = ((ulong)local_106 & 0xf8 | (ulong)local_105 << 8 | (ulong)local_104 << 0x10) >> 3
          ;
          uVar32 = (ulong)(uint3)(CONCAT12(local_21c,local_21e) >> 2) & 0x1fffff;
          uVar26 = (ulong)(uint3)(CONCAT12((undefined1)local_111,local_113) >> 2) & 0x1fffff;
          uVar58 = (ulong)(uint3)(CONCAT12((undefined1)local_fc,local_fe) >> 2) & 0x1fffff;
          uVar55 = (ulong)(CONCAT13((undefined1)local_22e,
                                    CONCAT12(local_22f,CONCAT11(local_230,local_231))) >> 7) &
                   0x1fffff;
          uVar57 = (ulong)(CONCAT13(local_219,CONCAT12(local_21a,CONCAT11(local_21b,local_21c))) >>
                          7);
          uVar52 = (ulong)(uVar21 >> 4) & 0x1fffff;
          uVar67 = (ulong)(uVar22 >> 1) & 0x1fffff;
          uVar48 = (ulong)(CONCAT13(local_226,CONCAT12(local_227,local_22b._2_2_)) >> 6) & 0x1fffff;
          uVar24 = (ulong)(CONCAT13(local_f9,CONCAT12(local_fa,local_fc)) >> 7);
          uVar66 = (ulong)(CONCAT13((undefined1)local_10e,CONCAT12(local_10f,local_111)) >> 7) &
                   0x1fffff;
          uVar36 = (ulong)(CONCAT13((undefined1)local_10b,local_10e) >> 4) & 0x1fffff;
          uVar28 = (ulong)(uint3)(CONCAT12((undefined1)local_109,local_10b) >> 1) & 0x1fffff;
          uVar40 = (ulong)(CONCAT13(local_106,CONCAT12(local_107,local_109)) >> 6) & 0x1fffff;
          lVar27 = uVar59 * uVar57 + uVar58 * uVar32 + uVar24 * uVar42;
          lVar54 = uVar28 * uVar57 + uVar40 * uVar32 + uVar69 * uVar42 + uVar45 * uVar44 +
                   uVar59 * uVar49 + uVar58 * uVar48 + uVar24 * uVar67;
          lVar61 = uVar69 * uVar57 + uVar45 * uVar32 + uVar59 * uVar42 + uVar58 * uVar44 +
                   uVar24 * uVar49;
          lVar68 = uVar66 * uVar57 + uVar36 * uVar32 + uVar28 * uVar42 + uVar40 * uVar44 +
                   uVar69 * uVar49 + uVar45 * uVar48 + uVar59 * uVar67 + uVar58 * uVar52 +
                   uVar24 * uVar55;
          lVar62 = uVar53 * uVar57 + uVar26 * uVar32 + uVar66 * uVar42 + uVar36 * uVar44 +
                   uVar28 * uVar49 + uVar40 * uVar48 + uVar69 * uVar67 + uVar45 * uVar52 +
                   uVar59 * uVar55 + uVar58 * uVar30 + uVar24 * uVar47;
          lVar25 = uVar65 * uVar47 + uVar53 * uVar46 + (uVar1 >> 0x15) +
                   ((ulong)(CONCAT13((undefined1)local_153,
                                     CONCAT12(local_154,CONCAT11(local_155,local_156))) >> 5) &
                   0x1fffff);
          uVar2 = uVar24 * uVar57 + 0x100000;
          uVar3 = lVar25 + 0x100000;
          lVar56 = uVar65 * uVar30 + uVar53 * uVar47 + uVar26 * uVar46 +
                   ((ulong)(uint3)(CONCAT12((undefined1)local_151,local_153) >> 2) & 0x1fffff);
          uVar4 = lVar56 + 0x100000;
          lVar15 = uVar65 * uVar55 + uVar53 * uVar30 + uVar26 * uVar47 + uVar66 * uVar46 +
                   ((ulong)(CONCAT13((undefined1)local_14e,CONCAT12(local_14f,local_151)) >> 7) &
                   0x1fffff) + (uVar4 >> 0x15);
          uVar5 = lVar27 + 0x100000;
          lVar70 = uVar58 * uVar57 + uVar24 * uVar32 + (uVar5 >> 0x15);
          uVar37 = uVar2 >> 0x15;
          lVar16 = uVar65 * uVar52 + uVar53 * uVar55 + uVar26 * uVar30 + uVar66 * uVar47 +
                   uVar36 * uVar46 +
                   ((ulong)(CONCAT13((undefined1)local_14b,local_14e) >> 4) & 0x1fffff);
          uVar6 = lVar61 + 0x100000;
          lVar33 = uVar45 * uVar57 + uVar59 * uVar32 + uVar58 * uVar42 + uVar24 * uVar44 +
                   ((long)uVar6 >> 0x15);
          uVar7 = lVar70 + 0x100000;
          lVar17 = (uVar24 * uVar57 - (uVar2 & 0x7fffffffffe00000)) + (uVar7 >> 0x15);
          lVar70 = lVar70 - (uVar7 & 0x7fffffffffe00000);
          uVar2 = lVar15 + 0x100000;
          uVar7 = lVar33 + 0x100000;
          lVar27 = (lVar27 - (uVar5 & 0x7fffffffffe00000)) + ((long)uVar7 >> 0x15);
          lVar18 = uVar65 * uVar48 + uVar53 * uVar67 + uVar26 * uVar52 + uVar66 * uVar55 +
                   uVar36 * uVar30 + uVar28 * uVar47 + uVar40 * uVar46 +
                   ((ulong)(CONCAT13(local_146,local_149) >> 6) & 0x1fffff);
          lVar33 = lVar33 - (uVar7 & 0xffffffffffe00000);
          uVar5 = lVar16 + 0x100000;
          lVar38 = uVar65 * uVar44 + uVar53 * uVar49 + uVar26 * uVar48 + uVar66 * uVar67 +
                   uVar36 * uVar52 + uVar28 * uVar55 + uVar40 * uVar30 + uVar69 * uVar47 +
                   uVar45 * uVar46 + ((ulong)local_143 | ((ulong)(byte)local_141 & 0x1f) << 0x10);
          lVar19 = uVar65 * uVar67 + uVar53 * uVar52 + uVar26 * uVar55 + uVar66 * uVar30 +
                   uVar36 * uVar47 + uVar28 * uVar46 +
                   ((ulong)(uint3)(CONCAT12((undefined1)local_149,local_14b) >> 1) & 0x1fffff) +
                   ((long)uVar5 >> 0x15);
          lVar34 = uVar65 * uVar32 + uVar53 * uVar42 + uVar26 * uVar44 + uVar66 * uVar49 +
                   uVar36 * uVar48 + uVar28 * uVar67 + uVar40 * uVar52 + uVar69 * uVar55 +
                   uVar45 * uVar30 + uVar59 * uVar47 + uVar58 * uVar46 +
                   ((ulong)(uint3)(CONCAT12((undefined1)local_13c,local_13e) >> 2) & 0x1fffff);
          uVar7 = lVar54 + 0x100000;
          lVar41 = uVar40 * uVar57 + uVar69 * uVar32 + uVar45 * uVar42 + uVar59 * uVar44 +
                   uVar58 * uVar49 + uVar24 * uVar48 + ((long)uVar7 >> 0x15);
          uVar8 = lVar68 + 0x100000;
          lVar20 = uVar36 * uVar57 + uVar28 * uVar32 + uVar40 * uVar42 + uVar69 * uVar44 +
                   uVar45 * uVar49 + uVar59 * uVar48 + uVar58 * uVar67 + uVar24 * uVar52 +
                   ((long)uVar8 >> 0x15);
          uVar9 = lVar62 + 0x100000;
          lVar29 = uVar26 * uVar57 + uVar66 * uVar32 + uVar36 * uVar42 + uVar28 * uVar44 +
                   uVar40 * uVar49 + uVar69 * uVar48 + uVar45 * uVar67 + uVar59 * uVar52 +
                   uVar58 * uVar55 + uVar24 * uVar30 + ((long)uVar9 >> 0x15);
          uVar10 = lVar38 + 0x100000;
          lVar35 = uVar65 * uVar42 + uVar53 * uVar44 + uVar26 * uVar49 + uVar66 * uVar48 +
                   uVar36 * uVar67 + uVar28 * uVar52 + uVar40 * uVar55 + uVar69 * uVar30 +
                   uVar45 * uVar47 + uVar59 * uVar46 + ((long)uVar10 >> 0x15) +
                   ((ulong)(CONCAT13((undefined1)local_13e,CONCAT12(local_13f,local_141)) >> 5) &
                   0x1fffff);
          uVar11 = lVar41 + 0x100000;
          lVar61 = (lVar61 - (uVar6 & 0xffffffffffe00000)) + ((long)uVar11 >> 0x15);
          uVar6 = lVar29 + 0x100000;
          uVar12 = lVar20 + 0x100000;
          lVar54 = ((lVar54 + uVar37 * -0xa6f7d) - (uVar7 & 0xffffffffffe00000)) +
                   ((long)uVar12 >> 0x15);
          uVar7 = lVar19 + 0x100000;
          uVar31 = lVar18 + 0x100000;
          lVar51 = uVar65 * uVar49 + uVar53 * uVar48 + uVar26 * uVar67 + uVar66 * uVar52 +
                   uVar36 * uVar55 + uVar28 * uVar30 + uVar40 * uVar47 + uVar69 * uVar46 +
                   (((ulong)local_146 & 0xf8 | (ulong)local_145 << 8 | (ulong)local_144 << 0x10) >>
                   3) + ((long)uVar31 >> 0x15);
          uVar13 = lVar51 + 0x100000;
          uVar14 = lVar34 + 0x100000;
          lVar60 = uVar65 * uVar57 + uVar53 * uVar32 + uVar26 * uVar42 + uVar66 * uVar44 +
                   uVar36 * uVar49 + uVar28 * uVar48 + uVar40 * uVar67 + uVar69 * uVar52 +
                   uVar45 * uVar55 + uVar59 * uVar30 + uVar58 * uVar47 + uVar24 * uVar46 +
                   (ulong)(CONCAT13(local_139,CONCAT12(local_13a,local_13c)) >> 7) +
                   ((long)uVar14 >> 0x15);
          uVar24 = lVar60 + 0x100000;
          lVar43 = ((lVar68 + uVar37 * -0xf39ad) - (uVar8 & 0xffffffffffe00000)) +
                   ((long)uVar6 >> 0x15) + lVar17 * 0x215d1 + lVar70 * -0xa6f7d;
          lVar62 = ((lVar62 + uVar37 * 0x72d18) - (uVar9 & 0xffffffffffe00000)) + lVar17 * 0x9fb67 +
                   lVar70 * -0xf39ad + lVar27 * 0x215d1 + lVar33 * -0xa6f7d + ((long)uVar24 >> 0x15)
          ;
          lVar68 = (lVar27 * 0xa2c13 + lVar33 * 0x72d18 + lVar61 * 0x9fb67 + lVar38 +
                   ((long)uVar13 >> 0x15)) - (uVar10 & 0xffffffffffe00000);
          uVar8 = lVar43 + 0x100000;
          lVar38 = ((lVar20 + uVar37 * 0x215d1) - (uVar12 & 0xffffffffffe00000)) + lVar17 * -0xa6f7d
                   + ((long)uVar8 >> 0x15);
          lVar50 = (lVar61 * 0xa2c13 + ((long)uVar7 >> 0x15) + lVar18) -
                   (uVar31 & 0xffffffffffe00000);
          uVar9 = lVar35 + 0x100000;
          uVar10 = lVar68 + 0x100000;
          uVar12 = lVar54 + 0x100000;
          lVar18 = (lVar41 - (uVar11 & 0xffffffffffe00000)) + ((long)uVar12 >> 0x15);
          lVar63 = (lVar70 * 0xa2c13 + lVar27 * 0x72d18 + lVar33 * 0x9fb67 + lVar61 * -0xf39ad +
                    lVar35 + ((long)uVar10 >> 0x15)) - (uVar9 & 0xffffffffffe00000);
          uVar11 = lVar62 + 0x100000;
          lVar41 = ((lVar29 + uVar37 * 0x9fb67) - (uVar6 & 0xffffffffffe00000)) + lVar17 * -0xf39ad
                   + lVar70 * 0x215d1 + lVar27 * -0xa6f7d + ((long)uVar11 >> 0x15);
          uVar6 = lVar38 + 0x100000;
          lVar20 = (lVar54 - (uVar12 & 0xffffffffffe00000)) + ((long)uVar6 >> 0x15);
          lVar34 = (lVar17 * 0xa2c13 + lVar70 * 0x72d18 + lVar27 * 0x9fb67 + lVar33 * -0xf39ad +
                    lVar61 * 0x215d1 + lVar34 + ((long)uVar9 >> 0x15)) -
                   (uVar14 & 0xffffffffffe00000);
          lVar38 = lVar38 - (uVar6 & 0xffffffffffe00000);
          uVar6 = lVar34 + 0x100000;
          lVar70 = ((uVar37 * 0xa2c13 + lVar17 * 0x72d18 + lVar70 * 0x9fb67 + lVar27 * -0xf39ad +
                     lVar33 * 0x215d1 + lVar61 * -0xa6f7d + lVar60) - (uVar24 & 0xffffffffffe00000))
                   + ((long)uVar6 >> 0x15);
          uVar9 = lVar70 + 0x100000;
          lVar17 = (lVar62 - (uVar11 & 0xffffffffffe00000)) + ((long)uVar9 >> 0x15);
          uVar11 = lVar41 + 0x100000;
          lVar27 = (lVar43 - (uVar8 & 0xffffffffffe00000)) + ((long)uVar11 >> 0x15);
          lVar41 = lVar41 - (uVar11 & 0xffffffffffe00000);
          uVar8 = lVar63 + 0x100000;
          lVar29 = (lVar34 + lVar18 * -0xa6f7d + ((long)uVar8 >> 0x15)) -
                   (uVar6 & 0xffffffffffe00000);
          uVar6 = lVar50 + 0x100000;
          lVar33 = ((lVar33 * 0xa2c13 + lVar61 * 0x72d18 + lVar51) - (uVar13 & 0xffffffffffe00000))
                   + ((long)uVar6 >> 0x15);
          uVar11 = lVar33 + 0x100000;
          lVar35 = (lVar39 - (uVar1 & 0xfffffe00000)) + lVar17 * 0xa2c13;
          uVar1 = lVar35 + 0x100000;
          lVar34 = (lVar18 * -0xf39ad + lVar20 * 0x215d1 + lVar38 * -0xa6f7d + lVar68 +
                   ((long)uVar11 >> 0x15)) - (uVar10 & 0xffffffffffe00000);
          lVar61 = ((lVar56 + (uVar3 >> 0x15)) - (uVar4 & 0xffffffffffe00000)) + lVar17 * 0x9fb67 +
                   lVar27 * 0xa2c13 + lVar41 * 0x72d18;
          lVar60 = ((lVar16 + ((long)uVar2 >> 0x15)) - (uVar5 & 0xffffffffffe00000)) +
                   lVar20 * 0xa2c13 + lVar38 * 0x72d18 + lVar17 * 0x215d1 + lVar27 * 0x9fb67 +
                   lVar41 * -0xf39ad;
          lVar25 = (lVar25 - (uVar3 & 0xffffffffffe00000)) + lVar17 * 0x72d18 + lVar41 * 0xa2c13 +
                   ((long)uVar1 >> 0x15);
          lVar51 = ((lVar18 * 0x72d18 + lVar20 * 0x9fb67 + lVar38 * -0xf39ad + lVar50) -
                   (uVar6 & 0xffffffffffe00000)) + lVar27 * 0x215d1 + lVar41 * -0xa6f7d;
          uVar3 = lVar34 + 0x100000;
          uVar4 = lVar29 + 0x100000;
          lVar56 = (lVar70 - (uVar9 & 0xffffffffffe00000)) + ((long)uVar4 >> 0x15);
          lVar54 = (lVar18 * 0x215d1 + lVar20 * -0xa6f7d + lVar63 + ((long)uVar3 >> 0x15)) -
                   (uVar8 & 0xffffffffffe00000);
          uVar5 = lVar51 + 0x100000;
          uVar6 = lVar56 + 0x100000;
          lVar70 = ((lVar18 * 0x9fb67 + lVar20 * -0xf39ad + lVar38 * 0x215d1 + lVar33) -
                   (uVar11 & 0xffffffffffe00000)) + lVar27 * -0xa6f7d + ((long)uVar5 >> 0x15);
          uVar8 = lVar61 + 0x100000;
          uVar9 = lVar25 + 0x100000;
          lVar33 = (long)uVar6 >> 0x15;
          lVar15 = (lVar15 - (uVar2 & 0xffffffffffe00000)) + lVar38 * 0xa2c13 + lVar17 * -0xf39ad +
                   lVar27 * 0x72d18 + lVar41 * 0x9fb67 + ((long)uVar8 >> 0x15);
          uVar2 = lVar15 + 0x100000;
          uVar10 = lVar60 + 0x100000;
          lVar16 = ((lVar19 + lVar18 * 0xa2c13 + lVar20 * 0x72d18 + lVar38 * 0x9fb67) -
                   (uVar7 & 0xffffffffffe00000)) + lVar17 * -0xa6f7d + lVar27 * -0xf39ad +
                   lVar41 * 0x215d1 + ((long)uVar10 >> 0x15);
          uVar31 = (lVar35 - (uVar1 & 0xffffffffffe00000)) + lVar33 * 0xa2c13;
          uVar1 = lVar16 + 0x100000;
          uVar7 = lVar70 + 0x100000;
          uVar11 = lVar54 + 0x100000;
          uVar12 = ((lVar25 + lVar33 * 0x72d18) - (uVar9 & 0xffffffffffe00000)) +
                   ((long)uVar31 >> 0x15);
          uVar8 = ((lVar61 + lVar33 * 0x9fb67) - (uVar8 & 0xffffffffffe00000)) +
                  ((long)uVar9 >> 0x15) + ((long)uVar12 >> 0x15);
          uVar9 = ((lVar15 + lVar33 * -0xf39ad) - (uVar2 & 0xffffffffffe00000)) +
                  ((long)uVar8 >> 0x15);
          uVar2 = ((lVar60 + lVar33 * 0x215d1) - (uVar10 & 0xffffffffffe00000)) +
                  ((long)uVar2 >> 0x15) + ((long)uVar9 >> 0x15);
          uVar10 = ((lVar16 + lVar33 * -0xa6f7d) - (uVar1 & 0xffffffffffe00000)) +
                   ((long)uVar2 >> 0x15);
          uVar1 = (lVar51 - (uVar5 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15) +
                  ((long)uVar10 >> 0x15);
          uVar5 = (lVar70 - (uVar7 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15);
          uVar3 = (lVar34 - (uVar3 & 0xffffffffffe00000)) + ((long)uVar7 >> 0x15) +
                  ((long)uVar5 >> 0x15);
          uVar7 = (lVar54 - (uVar11 & 0xffffffffffe00000)) + ((long)uVar3 >> 0x15);
          uVar4 = ((lVar29 + ((long)uVar11 >> 0x15)) - (uVar4 & 0xffffffffffe00000)) +
                  ((long)uVar7 >> 0x15);
          uVar6 = (lVar56 - (uVar6 & 0xffffffffffe00000)) + ((long)uVar4 >> 0x15);
          lVar25 = (long)uVar6 >> 0x15;
          lVar56 = (uVar31 & 0x1fffff) + lVar25 * 0xa2c13;
          uVar11 = (uVar12 & 0x1fffff) + lVar25 * 0x72d18 + (lVar56 >> 0x15);
          *(char *)((long)param_1 + 0x20) = (char)lVar56;
          *(char *)((long)param_1 + 0x21) = (char)((ulong)lVar56 >> 8);
          uVar8 = (uVar8 & 0x1fffff) + lVar25 * 0x9fb67 + ((long)uVar11 >> 0x15);
          *(char *)((long)param_1 + 0x23) = (char)(uVar11 >> 3);
          *(byte *)((long)param_1 + 0x22) =
               (byte)((ulong)lVar56 >> 0x10) & 0x1f | (byte)(((uint)uVar11 & 0x1fffff) << 5);
          *(char *)((long)param_1 + 0x26) = (char)(uVar8 >> 6);
          uVar9 = (uVar9 & 0x1fffff) + lVar25 * -0xf39ad + ((long)uVar8 >> 0x15);
          *(byte *)((long)param_1 + 0x25) =
               (byte)((uint)uVar11 >> 0x13) & 3 | (byte)(((uint)uVar8 & 0x1fffff) << 2);
          *(char *)((long)param_1 + 0x28) = (char)(uVar9 >> 1);
          *(char *)((long)param_1 + 0x29) = (char)(uVar9 >> 9);
          uVar2 = (uVar2 & 0x1fffff) + lVar25 * 0x215d1 + ((long)uVar9 >> 0x15);
          *(byte *)((long)param_1 + 0x27) =
               (byte)((uint)uVar8 >> 0xe) & 0x7f | (byte)(((uint)uVar9 & 0x1fffff) << 7);
          *(char *)((long)param_1 + 0x2b) = (char)(uVar2 >> 4);
          *(char *)((long)param_1 + 0x2c) = (char)(uVar2 >> 0xc);
          uVar8 = (uVar10 & 0x1fffff) + lVar25 * -0xa6f7d + ((long)uVar2 >> 0x15);
          *(byte *)((long)param_1 + 0x2a) =
               (byte)((uint)uVar9 >> 0x11) & 0xf | (byte)(((uint)uVar2 & 0x1fffff) << 4);
          *(char *)((long)param_1 + 0x2e) = (char)(uVar8 >> 7);
          uVar1 = (uVar1 & 0x1fffff) + ((long)uVar8 >> 0x15);
          *(byte *)((long)param_1 + 0x2d) =
               (byte)((uint)uVar2 >> 0x14) & 1 | (byte)(((uint)uVar8 & 0x1fffff) << 1);
          *(byte *)((long)param_1 + 0x2f) =
               (byte)((uint)uVar8 >> 0xf) & 0x3f | (byte)(((uint)uVar1 & 0x1fffff) << 6);
          uVar2 = (uVar5 & 0x1fffff) + ((long)uVar1 >> 0x15);
          *(byte *)((long)param_1 + 0x32) =
               (byte)((uint)uVar1 >> 0x12) & 7 | (byte)((int)uVar2 << 3);
          *(char *)((long)param_1 + 0x33) = (char)(uVar2 >> 5);
          lVar25 = (uVar3 & 0x1fffff) + ((long)uVar2 >> 0x15);
          uVar3 = (uVar7 & 0x1fffff) + (lVar25 >> 0x15);
          *(char *)((long)param_1 + 0x34) = (char)(uVar2 >> 0xd);
          *(char *)((long)param_1 + 0x35) = (char)lVar25;
          *(char *)((long)param_1 + 0x36) = (char)((ulong)lVar25 >> 8);
          *(char *)((long)param_1 + 0x38) = (char)(uVar3 >> 3);
          uVar2 = (uVar4 & 0x1fffff) + ((long)uVar3 >> 0x15);
          *(char *)((long)param_1 + 0x39) = (char)(uVar3 >> 0xb);
          *(byte *)((long)param_1 + 0x3a) =
               (byte)((uint)uVar3 >> 0x13) & 3 | (byte)(((uint)uVar2 & 0x1fffff) << 2);
          uVar4 = (uVar6 & 0x1fffff) + ((long)uVar2 >> 0x15);
          *(byte *)((long)param_1 + 0x3c) =
               (byte)((uint)uVar2 >> 0xe) & 0x7f | (byte)((int)uVar4 << 7);
          *(char *)((long)param_1 + 0x30) = (char)(uVar1 >> 2);
          *(char *)((long)param_1 + 0x3d) = (char)(uVar4 >> 1);
          uVar64 = 1;
          *(char *)((long)param_1 + 0x24) = (char)(uVar11 >> 0xb);
          *(char *)((long)param_1 + 0x31) = (char)(uVar1 >> 10);
          *(byte *)((long)param_1 + 0x37) =
               (byte)((ulong)lVar25 >> 0x10) & 0x1f | (byte)(((uint)uVar3 & 0x1fffff) << 5);
          *(char *)((long)param_1 + 0x3b) = (char)(uVar2 >> 6);
          *(char *)((long)param_1 + 0x3e) = (char)(uVar4 >> 9);
          *(char *)((long)param_1 + 0x3f) = (char)(uVar4 >> 0x11);
          goto LAB_00a3f560;
        }
      }
    }
    uVar64 = 0;
  }
LAB_00a3f560:
  OPENSSL_cleanse(&local_158,0x40);
  OPENSSL_cleanse(&local_118,0x40);
  EVP_MD_free(type);
  EVP_MD_CTX_free(ctx);
  return uVar64;
}

