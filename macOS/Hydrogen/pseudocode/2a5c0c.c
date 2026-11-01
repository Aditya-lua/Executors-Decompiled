
/* WARNING: Removing unreachable block (ram,0x002a6b74) */

ulong thunk_FUN_002a5c6c(long param_1,undefined8 param_2,undefined8 param_3,char *param_4,
                        char *param_5,char *param_6)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  int iVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong *puVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  undefined4 uVar17;
  ulong uVar18;
  char *pcVar19;
  ulong in_x9;
  ulong uVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  ulong uVar24;
  undefined1 *puVar25;
  ulong *puVar26;
  undefined8 *puVar27;
  ulong uVar28;
  ulong *puVar29;
  qword *pqVar30;
  char *pcVar31;
  long unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  uint uVar32;
  ulong unaff_x23;
  ulong *unaff_x24;
  ulong *unaff_x25;
  uint uVar33;
  long unaff_x26;
  char *pcVar34;
  ulong uVar35;
  byte *unaff_x27;
  undefined8 *puVar36;
  uint uVar37;
  long unaff_x28;
  long unaff_x29;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  undefined1 auVar55 [16];
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  byte bVar94;
  undefined8 uVar88;
  byte bVar95;
  byte bVar96;
  byte bVar99;
  byte bVar100;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  qword qVar97;
  undefined8 uVar98;
  byte bVar105;
  undefined8 uVar106;
  qword qVar107;
  undefined8 uVar108;
  undefined8 uVar109;
  undefined8 uVar110;
  undefined8 uVar111;
  undefined8 uVar112;
  ulong uVar113;
  undefined8 uVar114;
  ulong uVar115;
  undefined8 uVar116;
  undefined8 uVar117;
  undefined8 uVar118;
  undefined8 uVar119;
  undefined8 uVar120;
  undefined1 auVar121 [16];
  ulong uStack0000000000000030;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  lVar22 = unaff_x26 - param_1;
  puVar6 = (ulong *)(unaff_x27 + param_1 * 8);
  do {
    in_x9 = *puVar6 | in_x9;
    lVar22 = lVar22 + -1;
    puVar6 = puVar6 + 1;
  } while (lVar22 != 0);
  uVar37 = (uint)unaff_x28;
  uVar32 = (uint)unaff_x23;
  if (in_x9 == 0) {
    if ((uVar37 != 0) && (*(int *)(unaff_x22 + 2) == 0)) {
      uVar18 = *unaff_x25 ^ 1;
      if (1 < (int)uVar32) {
        if (uVar32 < 9) {
          uVar20 = 1;
        }
        else {
          uVar12 = unaff_x28 - 1U & 0xfffffffffffffff8;
          uVar20 = uVar12 | 1;
          bVar38 = 0;
          bVar39 = 0;
          bVar40 = 0;
          bVar41 = 0;
          bVar42 = 0;
          bVar43 = 0;
          bVar44 = 0;
          bVar45 = 0;
          bVar46 = 0;
          bVar47 = 0;
          bVar48 = 0;
          bVar49 = 0;
          bVar50 = 0;
          bVar51 = 0;
          bVar52 = 0;
          bVar53 = 0;
          auVar121._8_8_ = 0;
          auVar121._0_8_ = uVar18;
          uVar16 = 0;
          uVar14 = 0;
          uVar88 = 0;
          uVar98 = 0;
          puVar6 = unaff_x25 + 5;
          uVar18 = uVar12;
          do {
            uVar35 = puVar6[-3];
            uVar15 = puVar6[-4];
            uVar23 = puVar6[-1];
            uVar21 = puVar6[-2];
            uVar28 = puVar6[1];
            uVar24 = *puVar6;
            uVar115 = puVar6[3];
            uVar113 = puVar6[2];
            auVar55[0] = (byte)uVar15 | auVar121[0];
            auVar55[1] = (byte)(uVar15 >> 8) | auVar121[1];
            auVar55[2] = (byte)(uVar15 >> 0x10) | auVar121[2];
            auVar55[3] = (byte)(uVar15 >> 0x18) | auVar121[3];
            auVar55[4] = (byte)(uVar15 >> 0x20) | auVar121[4];
            auVar55[5] = (byte)(uVar15 >> 0x28) | auVar121[5];
            auVar55[6] = (byte)(uVar15 >> 0x30) | auVar121[6];
            auVar55[7] = (byte)(uVar15 >> 0x38) | auVar121[7];
            auVar55[8] = (byte)uVar35 | auVar121[8];
            auVar55[9] = (byte)(uVar35 >> 8) | auVar121[9];
            auVar55[10] = (byte)(uVar35 >> 0x10) | auVar121[10];
            auVar55[0xb] = (byte)(uVar35 >> 0x18) | auVar121[0xb];
            auVar55[0xc] = (byte)(uVar35 >> 0x20) | auVar121[0xc];
            auVar55[0xd] = (byte)(uVar35 >> 0x28) | auVar121[0xd];
            auVar55[0xe] = (byte)(uVar35 >> 0x30) | auVar121[0xe];
            auVar55[0xf] = (byte)(uVar35 >> 0x38) | auVar121[0xf];
            bVar38 = (byte)uVar21 | bVar38;
            bVar39 = (byte)(uVar21 >> 8) | bVar39;
            bVar40 = (byte)(uVar21 >> 0x10) | bVar40;
            bVar41 = (byte)(uVar21 >> 0x18) | bVar41;
            bVar42 = (byte)(uVar21 >> 0x20) | bVar42;
            bVar43 = (byte)(uVar21 >> 0x28) | bVar43;
            bVar44 = (byte)(uVar21 >> 0x30) | bVar44;
            bVar45 = (byte)(uVar21 >> 0x38) | bVar45;
            bVar46 = (byte)uVar23 | bVar46;
            bVar47 = (byte)(uVar23 >> 8) | bVar47;
            bVar48 = (byte)(uVar23 >> 0x10) | bVar48;
            bVar49 = (byte)(uVar23 >> 0x18) | bVar49;
            bVar50 = (byte)(uVar23 >> 0x20) | bVar50;
            bVar51 = (byte)(uVar23 >> 0x28) | bVar51;
            bVar52 = (byte)(uVar23 >> 0x30) | bVar52;
            bVar53 = (byte)(uVar23 >> 0x38) | bVar53;
            bVar87 = (byte)uVar24 | (byte)uVar16;
            bVar89 = (byte)(uVar24 >> 8) | (byte)((ulong)uVar16 >> 8);
            bVar90 = (byte)(uVar24 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
            bVar91 = (byte)(uVar24 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
            bVar92 = (byte)(uVar24 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
            bVar93 = (byte)(uVar24 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
            bVar94 = (byte)(uVar24 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
            bVar95 = (byte)(uVar24 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
            uVar16 = CONCAT17(bVar95,CONCAT16(bVar94,CONCAT15(bVar93,CONCAT14(bVar92,CONCAT13(bVar91
                                                  ,CONCAT12(bVar90,CONCAT11(bVar89,bVar87)))))));
            bVar96 = (byte)uVar28 | (byte)uVar14;
            bVar99 = (byte)(uVar28 >> 8) | (byte)((ulong)uVar14 >> 8);
            bVar100 = (byte)(uVar28 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
            bVar101 = (byte)(uVar28 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
            bVar102 = (byte)(uVar28 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
            bVar103 = (byte)(uVar28 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
            bVar104 = (byte)(uVar28 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
            bVar105 = (byte)(uVar28 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
            uVar14 = CONCAT17(bVar105,CONCAT16(bVar104,CONCAT15(bVar103,CONCAT14(bVar102,CONCAT13(
                                                  bVar101,CONCAT12(bVar100,CONCAT11(bVar99,bVar96)))
                                                  ))));
            bVar54 = (byte)uVar113 | (byte)uVar88;
            bVar56 = (byte)(uVar113 >> 8) | (byte)((ulong)uVar88 >> 8);
            bVar57 = (byte)(uVar113 >> 0x10) | (byte)((ulong)uVar88 >> 0x10);
            bVar58 = (byte)(uVar113 >> 0x18) | (byte)((ulong)uVar88 >> 0x18);
            bVar59 = (byte)(uVar113 >> 0x20) | (byte)((ulong)uVar88 >> 0x20);
            bVar60 = (byte)(uVar113 >> 0x28) | (byte)((ulong)uVar88 >> 0x28);
            bVar61 = (byte)(uVar113 >> 0x30) | (byte)((ulong)uVar88 >> 0x30);
            bVar62 = (byte)(uVar113 >> 0x38) | (byte)((ulong)uVar88 >> 0x38);
            uVar88 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(bVar58
                                                  ,CONCAT12(bVar57,CONCAT11(bVar56,bVar54)))))));
            bVar63 = (byte)uVar115 | (byte)uVar98;
            bVar64 = (byte)(uVar115 >> 8) | (byte)((ulong)uVar98 >> 8);
            bVar65 = (byte)(uVar115 >> 0x10) | (byte)((ulong)uVar98 >> 0x10);
            bVar66 = (byte)(uVar115 >> 0x18) | (byte)((ulong)uVar98 >> 0x18);
            bVar67 = (byte)(uVar115 >> 0x20) | (byte)((ulong)uVar98 >> 0x20);
            bVar68 = (byte)(uVar115 >> 0x28) | (byte)((ulong)uVar98 >> 0x28);
            bVar69 = (byte)(uVar115 >> 0x30) | (byte)((ulong)uVar98 >> 0x30);
            bVar70 = (byte)(uVar115 >> 0x38) | (byte)((ulong)uVar98 >> 0x38);
            uVar98 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66
                                                  ,CONCAT12(bVar65,CONCAT11(bVar64,bVar63)))))));
            uVar18 = uVar18 - 8;
            puVar6 = puVar6 + 8;
            auVar121 = auVar55;
          } while (uVar18 != 0);
          bVar54 = bVar54 | bVar87 | bVar38 | auVar55[0];
          bVar56 = bVar56 | bVar89 | bVar39 | auVar55[1];
          bVar57 = bVar57 | bVar90 | bVar40 | auVar55[2];
          bVar58 = bVar58 | bVar91 | bVar41 | auVar55[3];
          bVar59 = bVar59 | bVar92 | bVar42 | auVar55[4];
          bVar60 = bVar60 | bVar93 | bVar43 | auVar55[5];
          bVar61 = bVar61 | bVar94 | bVar44 | auVar55[6];
          bVar62 = bVar62 | bVar95 | bVar45 | auVar55[7];
          bVar63 = bVar63 | bVar96 | bVar46 | auVar55[8];
          bVar64 = bVar64 | bVar99 | bVar47 | auVar55[9];
          bVar65 = bVar65 | bVar100 | bVar48 | auVar55[10];
          bVar66 = bVar66 | bVar101 | bVar49 | auVar55[0xb];
          bVar67 = bVar67 | bVar102 | bVar50 | auVar55[0xc];
          bVar68 = bVar68 | bVar103 | bVar51 | auVar55[0xd];
          bVar69 = bVar69 | bVar104 | bVar52 | auVar55[0xe];
          bVar70 = bVar70 | bVar105 | bVar53 | auVar55[0xf];
          auVar3[1] = bVar56;
          auVar3[0] = bVar54;
          auVar3[2] = bVar57;
          auVar3[3] = bVar58;
          auVar3[4] = bVar59;
          auVar3[5] = bVar60;
          auVar3[6] = bVar61;
          auVar3[7] = bVar62;
          auVar3[8] = bVar63;
          auVar3[9] = bVar64;
          auVar3[10] = bVar65;
          auVar3[0xb] = bVar66;
          auVar3[0xc] = bVar67;
          auVar3[0xd] = bVar68;
          auVar3[0xe] = bVar69;
          auVar3[0xf] = bVar70;
          auVar4[1] = bVar56;
          auVar4[0] = bVar54;
          auVar4[2] = bVar57;
          auVar4[3] = bVar58;
          auVar4[4] = bVar59;
          auVar4[5] = bVar60;
          auVar4[6] = bVar61;
          auVar4[7] = bVar62;
          auVar4[8] = bVar63;
          auVar4[9] = bVar64;
          auVar4[10] = bVar65;
          auVar4[0xb] = bVar66;
          auVar4[0xc] = bVar67;
          auVar4[0xd] = bVar68;
          auVar4[0xe] = bVar69;
          auVar4[0xf] = bVar70;
          auVar121 = NEON_ext(auVar3,auVar4,8,1);
          uVar18 = CONCAT17(bVar62 | auVar121[7],
                            CONCAT16(bVar61 | auVar121[6],
                                     CONCAT15(bVar60 | auVar121[5],
                                              CONCAT14(bVar59 | auVar121[4],
                                                       CONCAT13(bVar58 | auVar121[3],
                                                                CONCAT12(bVar57 | auVar121[2],
                                                                         CONCAT11(bVar56 | auVar121[
                                                  1],bVar54 | auVar121[0])))))));
          if (unaff_x28 - 1U == uVar12) goto LAB_002a5ddc;
        }
        lVar22 = unaff_x28 - uVar20;
        puVar6 = unaff_x25 + uVar20;
        do {
          uVar18 = *puVar6 | uVar18;
          lVar22 = lVar22 + -1;
          puVar6 = puVar6 + 1;
        } while (lVar22 != 0);
      }
LAB_002a5ddc:
      if (uVar18 == 0) {
        *(undefined4 *)(unaff_x21 + 0x10) = 0;
        *(undefined4 *)(unaff_x21 + 8) = 0;
        return 1;
      }
    }
    *unaff_x20 = 1;
    uVar16 = 0xb7;
LAB_002a5bcc:
    func_0x0028f83c(3,0,0x70,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",uVar16);
    return 0;
  }
  uVar33 = (uint)unaff_x26;
  if ((((int)uVar33 < 1) || ((*unaff_x27 & 1) == 0)) &&
     (((int)uVar37 < 1 || ((*unaff_x25 & 1) == 0)))) {
    *unaff_x20 = 1;
    uVar16 = 199;
    goto LAB_002a5bcc;
  }
  if (uVar32 <= uVar33) {
    uVar33 = uVar32;
  }
  if (*(char *)(unaff_x19 + 0x28) == '\0') {
    uVar16 = *(undefined8 *)(unaff_x19 + 0x20);
    uVar18 = *(ulong *)(unaff_x19 + 0x10);
    if (uVar18 == *(ulong *)(unaff_x19 + 0x18)) {
      uVar20 = 0x20;
      if (uVar18 != 0) {
        uVar20 = uVar18 * 3 >> 1;
      }
      if ((uVar20 <= uVar18 || uVar20 >> 0x3d != 0) ||
         (lVar22 = func_0x0036e48c(*(undefined8 *)(unaff_x19 + 8),uVar20 << 3), lVar22 == 0)) {
        *(undefined2 *)(unaff_x19 + 0x28) = 0x101;
        goto code_r0x002a5e34;
      }
      *(long *)(unaff_x19 + 8) = lVar22;
      *(ulong *)(unaff_x19 + 0x18) = uVar20;
      uVar18 = *(ulong *)(unaff_x19 + 0x10);
    }
    else {
      lVar22 = *(long *)(unaff_x19 + 8);
    }
    *(undefined8 *)(lVar22 + uVar18 * 8) = uVar16;
    *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  }
code_r0x002a5e34:
  puVar6 = (ulong *)func_0x0029e340();
  puVar7 = (ulong *)func_0x0029e340();
  uVar16 = func_0x0029e340();
  *(undefined8 *)(unaff_x29 + -0x58) = uVar16;
  uVar16 = func_0x0029e340();
  *(undefined8 *)(unaff_x29 + -0x68) = uVar16;
  puVar8 = (ulong *)func_0x0029e340();
  uVar16 = func_0x0029e340();
  *(undefined8 *)(unaff_x29 + -0x60) = uVar16;
  puVar9 = (ulong *)func_0x0029e340();
  puVar10 = (ulong *)func_0x0029e340();
  uVar18 = 0;
  if ((((puVar6 == (ulong *)0x0) || (puVar7 == (ulong *)0x0)) || (*(long *)(unaff_x29 + -0x58) == 0)
      ) || (((*(long *)(unaff_x29 + -0x68) == 0 || (puVar8 == (ulong *)0x0)) ||
            ((*(long *)(unaff_x29 + -0x60) == 0 ||
             ((puVar9 == (ulong *)0x0 || (puVar10 == (ulong *)0x0)))))))) {
LAB_002a6abc:
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return uVar18;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar22 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar22;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar22 * 8);
      return uVar18;
    }
    func_0x0079db4c(uVar18);
code_r0x002a6ae8:
    func_0x0079dea4();
  }
  else {
    if (puVar6 != unaff_x24) {
      uVar18 = func_0x0029afb8(puVar6,(long)(int)unaff_x24[1]);
      if ((int)uVar18 == 0) goto LAB_002a6abc;
      uVar17 = 0;
      if ((int)unaff_x24[1] != 0) {
        param_4 = (char *)((long)(int)unaff_x24[1] << 3);
        _memcpy(*puVar6,*unaff_x24);
        uVar17 = (undefined4)unaff_x24[1];
      }
      *(undefined4 *)(puVar6 + 1) = uVar17;
      *(int *)(puVar6 + 2) = (int)unaff_x24[2];
    }
    lVar22 = func_0x0029bd80(puVar7);
    uVar18 = 0;
    if (((((lVar22 == 0) ||
          (uVar18 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x58)), (int)uVar18 == 0)) ||
         (uVar18 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x60)), (int)uVar18 == 0)) ||
        ((uVar18 = func_0x0029c3cc(puVar6), (int)uVar18 == 0 ||
         (uVar18 = func_0x0029c3cc(puVar7), (int)uVar18 == 0)))) ||
       ((uVar18 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x58)), (int)uVar18 == 0 ||
        (uVar18 = func_0x0029c3cc(puVar8), (int)uVar18 == 0)))) goto LAB_002a6abc;
    pcVar34 = (char *)(long)(int)uVar33;
    uVar18 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x68),pcVar34);
    if ((((int)uVar18 == 0) ||
        (uVar18 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x60),pcVar34), (int)uVar18 == 0)) ||
       ((uVar18 = func_0x0029c3cc(puVar9), (int)uVar18 == 0 ||
        (uVar18 = func_0x0029c3cc(puVar10), (int)uVar18 == 0)))) goto LAB_002a6abc;
    uVar18 = (long)(pcVar34 + unaff_x23) * 0x40;
    if (uVar18 < (ulong)((long)pcVar34 << 6)) {
      param_4 = (char *)((long)&segment_command_00000020.flags + 2);
      param_6 = "\b\x04";
LAB_002a6ab4:
      param_5 = "/aws-lc/crypto/fipsmodule/bn/gcd_extra.c";
      func_0x0028f83c(3,0,param_4,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",param_6);
      uVar18 = 0;
      goto LAB_002a6abc;
    }
    if (pcVar34 + unaff_x23 != (char *)0x0) {
      if (uVar18 < 2) {
        uVar18 = 1;
      }
      lVar22 = unaff_x23 * 8;
      uStack0000000000000030 = 0;
      uVar20 = unaff_x23 & 0xfffffffffffffff8;
      pcVar19 = (char *)((ulong)pcVar34 & 0xfffffffffffffff8);
      do {
        uVar35 = -(*(ulong *)*puVar6 & 1) & -(*(ulong *)*puVar7 & 1);
        lVar11 = func_0x00382cc0(*puVar9);
        uVar15 = *puVar7;
        uVar21 = lVar11 - 1U & uVar35;
        uVar12 = *puVar9;
        bVar38 = (byte)uVar21;
        bVar39 = (byte)(uVar21 >> 8);
        bVar40 = (byte)(uVar21 >> 0x10);
        bVar41 = (byte)(uVar21 >> 0x18);
        bVar42 = (byte)(uVar21 >> 0x20);
        bVar43 = (byte)(uVar21 >> 0x28);
        bVar44 = (byte)(uVar21 >> 0x30);
        bVar45 = (byte)(uVar21 >> 0x38);
        if (uVar37 != 0) {
          uVar23 = ~uVar21;
          if ((uVar37 < 8) || (uVar15 < uVar12 + lVar22 && uVar12 < uVar15 + lVar22)) {
            uVar24 = 0;
          }
          else {
            puVar36 = (undefined8 *)(uVar15 + 0x20);
            puVar27 = (undefined8 *)(uVar12 + 0x20);
            uVar24 = uVar20;
            do {
              uVar14 = puVar27[-3];
              uVar16 = puVar27[-4];
              uVar98 = puVar27[-1];
              uVar88 = puVar27[-2];
              uVar108 = puVar27[1];
              uVar106 = *puVar27;
              uVar110 = puVar27[3];
              uVar109 = puVar27[2];
              uVar112 = puVar36[-3];
              uVar111 = puVar36[-4];
              uVar116 = puVar36[-1];
              uVar114 = puVar36[-2];
              uVar118 = puVar36[1];
              uVar117 = *puVar36;
              uVar120 = puVar36[3];
              uVar119 = puVar36[2];
              bVar46 = (byte)uVar23;
              bVar47 = (byte)(uVar23 >> 8);
              bVar48 = (byte)(uVar23 >> 0x10);
              bVar49 = (byte)(uVar23 >> 0x18);
              bVar50 = (byte)(uVar23 >> 0x20);
              bVar51 = (byte)(uVar23 >> 0x28);
              bVar52 = (byte)(uVar23 >> 0x30);
              bVar53 = (byte)(uVar23 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar112 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar39,
                                                           (byte)uVar112 & bVar46 |
                                                           (byte)uVar14 & bVar38)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar39,
                                                           (byte)uVar111 & bVar46 |
                                                           (byte)uVar16 & bVar38)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar98 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar98 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar98 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar98 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar116 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar98 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar39,
                                                           (byte)uVar116 & bVar46 |
                                                           (byte)uVar98 & bVar38)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar114 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar39,
                                                           (byte)uVar114 & bVar46 |
                                                           (byte)uVar88 & bVar38)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar39,
                                                           (byte)uVar118 & bVar46 |
                                                           (byte)uVar108 & bVar38)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar53 |
                                  (byte)((ulong)uVar106 >> 0x38) & bVar45,
                                  CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar52 |
                                           (byte)((ulong)uVar106 >> 0x30) & bVar44,
                                           CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar51 |
                                                    (byte)((ulong)uVar106 >> 0x28) & bVar43,
                                                    CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar50
                                                             | (byte)((ulong)uVar106 >> 0x20) &
                                                               bVar42,CONCAT13((byte)((ulong)uVar117
                                                                                     >> 0x18) &
                                                                               bVar49 | (byte)((
                                                  ulong)uVar106 >> 0x18) & bVar41,
                                                  CONCAT12((byte)((ulong)uVar117 >> 0x10) & bVar48 |
                                                           (byte)((ulong)uVar106 >> 0x10) & bVar40,
                                                           CONCAT11((byte)((ulong)uVar117 >> 8) &
                                                                    bVar47 | (byte)((ulong)uVar106
                                                                                   >> 8) & bVar39,
                                                                    (byte)uVar117 & bVar46 |
                                                                    (byte)uVar106 & bVar38)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar110 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar110 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar110 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar110 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar120 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar110 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar110 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar110 >> 8) & bVar39,
                                                           (byte)uVar120 & bVar46 |
                                                           (byte)uVar110 & bVar38)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar109 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar109 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar109 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar109 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar119 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar109 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar109 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar109 >> 8) & bVar39,
                                                           (byte)uVar119 & bVar46 |
                                                           (byte)uVar109 & bVar38)))))));
              uVar24 = uVar24 - 8;
              puVar36 = puVar36 + 8;
              puVar27 = puVar27 + 8;
            } while (uVar24 != 0);
            uVar24 = uVar20;
            if (uVar20 == unaff_x23) goto LAB_002a6148;
          }
          lVar13 = unaff_x23 - uVar24;
          puVar26 = (ulong *)(uVar15 + uVar24 * 8);
          puVar29 = (ulong *)(uVar12 + uVar24 * 8);
          do {
            *puVar26 = *puVar26 & uVar23 | *puVar29 & uVar21;
            lVar13 = lVar13 + -1;
            puVar26 = puVar26 + 1;
            puVar29 = puVar29 + 1;
          } while (lVar13 != 0);
        }
LAB_002a6148:
        func_0x00382cc0(uVar12,*puVar6);
        uVar35 = uVar35 & -lVar11;
        uVar12 = *puVar9;
        bVar46 = (byte)uVar35;
        bVar47 = (byte)(uVar35 >> 8);
        bVar48 = (byte)(uVar35 >> 0x10);
        bVar49 = (byte)(uVar35 >> 0x18);
        bVar50 = (byte)(uVar35 >> 0x20);
        bVar51 = (byte)(uVar35 >> 0x28);
        bVar52 = (byte)(uVar35 >> 0x30);
        bVar53 = (byte)(uVar35 >> 0x38);
        if (uVar32 != 0) {
          uVar23 = *puVar6;
          uVar15 = ~uVar35;
          if ((uVar37 < 8) || ((uVar23 < uVar12 + lVar22 && (uVar12 < uVar23 + lVar22)))) {
            uVar24 = 0;
          }
          else {
            puVar36 = (undefined8 *)(uVar23 + 0x20);
            puVar27 = (undefined8 *)(uVar12 + 0x20);
            uVar24 = uVar20;
            do {
              uVar14 = puVar27[-3];
              uVar16 = puVar27[-4];
              uVar98 = puVar27[-1];
              uVar88 = puVar27[-2];
              uVar108 = puVar27[1];
              uVar106 = *puVar27;
              uVar110 = puVar27[3];
              uVar109 = puVar27[2];
              uVar112 = puVar36[-3];
              uVar111 = puVar36[-4];
              uVar116 = puVar36[-1];
              uVar114 = puVar36[-2];
              uVar118 = puVar36[1];
              uVar117 = *puVar36;
              uVar120 = puVar36[3];
              uVar119 = puVar36[2];
              bVar54 = (byte)uVar15;
              bVar56 = (byte)(uVar15 >> 8);
              bVar57 = (byte)(uVar15 >> 0x10);
              bVar58 = (byte)(uVar15 >> 0x18);
              bVar59 = (byte)(uVar15 >> 0x20);
              bVar60 = (byte)(uVar15 >> 0x28);
              bVar61 = (byte)(uVar15 >> 0x30);
              bVar62 = (byte)(uVar15 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar112 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar47,
                                                           (byte)uVar112 & bVar54 |
                                                           (byte)uVar14 & bVar46)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar47,
                                                           (byte)uVar111 & bVar54 |
                                                           (byte)uVar16 & bVar46)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar98 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar98 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar98 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar98 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar116 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar98 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar47,
                                                           (byte)uVar116 & bVar54 |
                                                           (byte)uVar98 & bVar46)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar114 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar47,
                                                           (byte)uVar114 & bVar54 |
                                                           (byte)uVar88 & bVar46)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar47,
                                                           (byte)uVar118 & bVar54 |
                                                           (byte)uVar108 & bVar46)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar62 |
                                  (byte)((ulong)uVar106 >> 0x38) & bVar53,
                                  CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar61 |
                                           (byte)((ulong)uVar106 >> 0x30) & bVar52,
                                           CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar60 |
                                                    (byte)((ulong)uVar106 >> 0x28) & bVar51,
                                                    CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar59
                                                             | (byte)((ulong)uVar106 >> 0x20) &
                                                               bVar50,CONCAT13((byte)((ulong)uVar117
                                                                                     >> 0x18) &
                                                                               bVar58 | (byte)((
                                                  ulong)uVar106 >> 0x18) & bVar49,
                                                  CONCAT12((byte)((ulong)uVar117 >> 0x10) & bVar57 |
                                                           (byte)((ulong)uVar106 >> 0x10) & bVar48,
                                                           CONCAT11((byte)((ulong)uVar117 >> 8) &
                                                                    bVar56 | (byte)((ulong)uVar106
                                                                                   >> 8) & bVar47,
                                                                    (byte)uVar117 & bVar54 |
                                                                    (byte)uVar106 & bVar46)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar110 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar110 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar110 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar110 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar120 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar110 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar110 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar110 >> 8) & bVar47,
                                                           (byte)uVar120 & bVar54 |
                                                           (byte)uVar110 & bVar46)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar109 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar109 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar109 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar109 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar119 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar109 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar109 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar109 >> 8) & bVar47,
                                                           (byte)uVar119 & bVar54 |
                                                           (byte)uVar109 & bVar46)))))));
              uVar24 = uVar24 - 8;
              puVar36 = puVar36 + 8;
              puVar27 = puVar27 + 8;
            } while (uVar24 != 0);
            uVar24 = uVar20;
            if (uVar20 == unaff_x23) goto code_r0x002a61dc;
          }
          lVar11 = unaff_x23 - uVar24;
          puVar26 = (ulong *)(uVar23 + uVar24 * 8);
          puVar29 = (ulong *)(uVar12 + uVar24 * 8);
          do {
            *puVar26 = *puVar26 & uVar15 | *puVar29 & uVar35;
            lVar11 = lVar11 + -1;
            puVar26 = puVar26 + 1;
            puVar29 = puVar29 + 1;
          } while (lVar11 != 0);
        }
code_r0x002a61dc:
        lVar11 = func_0x00382c70(uVar12,**(undefined8 **)(unaff_x29 + -0x58),*puVar8);
        lVar13 = func_0x00382cc0(*puVar10,*puVar9,*unaff_x22);
        uVar15 = lVar11 - lVar13;
        uVar12 = *puVar9;
        bVar54 = (byte)uVar15;
        bVar56 = (byte)(uVar15 >> 8);
        bVar57 = (byte)(uVar15 >> 0x10);
        bVar58 = (byte)(uVar15 >> 0x18);
        bVar59 = (byte)(uVar15 >> 0x20);
        bVar60 = (byte)(uVar15 >> 0x28);
        bVar61 = (byte)(uVar15 >> 0x30);
        bVar62 = (byte)(uVar15 >> 0x38);
        if (uVar37 != 0) {
          uVar24 = *puVar10;
          uVar23 = ~uVar15;
          if ((uVar37 < 8) || ((uVar12 < uVar24 + lVar22 && (uVar24 < uVar12 + lVar22)))) {
            uVar28 = 0;
code_r0x002a6260:
            lVar11 = unaff_x23 - uVar28;
            puVar26 = (ulong *)(uVar24 + uVar28 * 8);
            puVar29 = (ulong *)(uVar12 + uVar28 * 8);
            do {
              *puVar29 = *puVar26 & uVar23 | *puVar29 & uVar15;
              lVar11 = lVar11 + -1;
              puVar26 = puVar26 + 1;
              puVar29 = puVar29 + 1;
            } while (lVar11 != 0);
          }
          else {
            puVar36 = (undefined8 *)(uVar24 + 0x20);
            puVar27 = (undefined8 *)(uVar12 + 0x20);
            uVar28 = uVar20;
            do {
              uVar14 = puVar27[-3];
              uVar16 = puVar27[-4];
              uVar98 = puVar27[-1];
              uVar88 = puVar27[-2];
              uVar108 = puVar27[1];
              uVar106 = *puVar27;
              uVar110 = puVar27[3];
              uVar109 = puVar27[2];
              uVar112 = puVar36[-3];
              uVar111 = puVar36[-4];
              uVar116 = puVar36[-1];
              uVar114 = puVar36[-2];
              uVar118 = puVar36[1];
              uVar117 = *puVar36;
              uVar120 = puVar36[3];
              uVar119 = puVar36[2];
              bVar63 = (byte)uVar23;
              bVar64 = (byte)(uVar23 >> 8);
              bVar65 = (byte)(uVar23 >> 0x10);
              bVar66 = (byte)(uVar23 >> 0x18);
              bVar67 = (byte)(uVar23 >> 0x20);
              bVar68 = (byte)(uVar23 >> 0x28);
              bVar69 = (byte)(uVar23 >> 0x30);
              bVar70 = (byte)(uVar23 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar112 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar56,
                                                           (byte)uVar112 & bVar63 |
                                                           (byte)uVar14 & bVar54)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar56,
                                                           (byte)uVar111 & bVar63 |
                                                           (byte)uVar16 & bVar54)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar98 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar98 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar98 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar98 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar116 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar98 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar56,
                                                           (byte)uVar116 & bVar63 |
                                                           (byte)uVar98 & bVar54)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar114 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar56,
                                                           (byte)uVar114 & bVar63 |
                                                           (byte)uVar88 & bVar54)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar56,
                                                           (byte)uVar118 & bVar63 |
                                                           (byte)uVar108 & bVar54)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar70 |
                                  (byte)((ulong)uVar106 >> 0x38) & bVar62,
                                  CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar69 |
                                           (byte)((ulong)uVar106 >> 0x30) & bVar61,
                                           CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar68 |
                                                    (byte)((ulong)uVar106 >> 0x28) & bVar60,
                                                    CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar67
                                                             | (byte)((ulong)uVar106 >> 0x20) &
                                                               bVar59,CONCAT13((byte)((ulong)uVar117
                                                                                     >> 0x18) &
                                                                               bVar66 | (byte)((
                                                  ulong)uVar106 >> 0x18) & bVar58,
                                                  CONCAT12((byte)((ulong)uVar117 >> 0x10) & bVar65 |
                                                           (byte)((ulong)uVar106 >> 0x10) & bVar57,
                                                           CONCAT11((byte)((ulong)uVar117 >> 8) &
                                                                    bVar64 | (byte)((ulong)uVar106
                                                                                   >> 8) & bVar56,
                                                                    (byte)uVar117 & bVar63 |
                                                                    (byte)uVar106 & bVar54)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar110 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar110 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar110 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar110 >>
                                                                              0x20) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar120 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar110 >>
                                                                              0x18) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar110 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar110 >> 8) & bVar56,
                                                           (byte)uVar120 & bVar63 |
                                                           (byte)uVar110 & bVar54)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar109 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar109 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar109 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar109 >>
                                                                              0x20) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar119 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar109 >>
                                                                              0x18) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar109 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar109 >> 8) & bVar56,
                                                           (byte)uVar119 & bVar63 |
                                                           (byte)uVar109 & bVar54)))))));
              uVar28 = uVar28 - 8;
              puVar36 = puVar36 + 8;
              puVar27 = puVar27 + 8;
            } while (uVar28 != 0);
            uVar28 = uVar20;
            if (uVar20 != unaff_x23) goto code_r0x002a6260;
          }
          uVar24 = **(ulong **)(unaff_x29 + -0x58);
          uVar23 = ~uVar35;
          if ((uVar37 < 8) || (uVar24 < uVar12 + lVar22 && uVar12 < uVar24 + lVar22)) {
            uVar28 = 0;
code_r0x002a6340:
            lVar11 = unaff_x23 - uVar28;
            puVar26 = (ulong *)(uVar24 + uVar28 * 8);
            puVar29 = (ulong *)(uVar12 + uVar28 * 8);
            do {
              *puVar26 = *puVar26 & uVar23 | *puVar29 & uVar35;
              lVar11 = lVar11 + -1;
              puVar26 = puVar26 + 1;
              puVar29 = puVar29 + 1;
            } while (lVar11 != 0);
          }
          else {
            puVar36 = (undefined8 *)(uVar24 + 0x20);
            puVar27 = (undefined8 *)(uVar12 + 0x20);
            uVar28 = uVar20;
            do {
              uVar14 = puVar27[-3];
              uVar16 = puVar27[-4];
              uVar98 = puVar27[-1];
              uVar88 = puVar27[-2];
              uVar108 = puVar27[1];
              uVar106 = *puVar27;
              uVar110 = puVar27[3];
              uVar109 = puVar27[2];
              uVar112 = puVar36[-3];
              uVar111 = puVar36[-4];
              uVar116 = puVar36[-1];
              uVar114 = puVar36[-2];
              uVar118 = puVar36[1];
              uVar117 = *puVar36;
              uVar120 = puVar36[3];
              uVar119 = puVar36[2];
              bVar63 = (byte)uVar23;
              bVar64 = (byte)(uVar23 >> 8);
              bVar65 = (byte)(uVar23 >> 0x10);
              bVar66 = (byte)(uVar23 >> 0x18);
              bVar67 = (byte)(uVar23 >> 0x20);
              bVar68 = (byte)(uVar23 >> 0x28);
              bVar69 = (byte)(uVar23 >> 0x30);
              bVar70 = (byte)(uVar23 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar112 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar47,
                                                           (byte)uVar112 & bVar63 |
                                                           (byte)uVar14 & bVar46)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar47,
                                                           (byte)uVar111 & bVar63 |
                                                           (byte)uVar16 & bVar46)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar98 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar98 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar98 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar98 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar116 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar98 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar47,
                                                           (byte)uVar116 & bVar63 |
                                                           (byte)uVar98 & bVar46)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar114 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar47,
                                                           (byte)uVar114 & bVar63 |
                                                           (byte)uVar88 & bVar46)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar47,
                                                           (byte)uVar118 & bVar63 |
                                                           (byte)uVar108 & bVar46)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar70 |
                                  (byte)((ulong)uVar106 >> 0x38) & bVar53,
                                  CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar69 |
                                           (byte)((ulong)uVar106 >> 0x30) & bVar52,
                                           CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar68 |
                                                    (byte)((ulong)uVar106 >> 0x28) & bVar51,
                                                    CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar67
                                                             | (byte)((ulong)uVar106 >> 0x20) &
                                                               bVar50,CONCAT13((byte)((ulong)uVar117
                                                                                     >> 0x18) &
                                                                               bVar66 | (byte)((
                                                  ulong)uVar106 >> 0x18) & bVar49,
                                                  CONCAT12((byte)((ulong)uVar117 >> 0x10) & bVar65 |
                                                           (byte)((ulong)uVar106 >> 0x10) & bVar48,
                                                           CONCAT11((byte)((ulong)uVar117 >> 8) &
                                                                    bVar64 | (byte)((ulong)uVar106
                                                                                   >> 8) & bVar47,
                                                                    (byte)uVar117 & bVar63 |
                                                                    (byte)uVar106 & bVar46)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar110 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar110 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar110 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar110 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar120 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar110 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar110 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar110 >> 8) & bVar47,
                                                           (byte)uVar120 & bVar63 |
                                                           (byte)uVar110 & bVar46)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar109 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar109 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar109 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar109 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar119 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar109 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar109 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar109 >> 8) & bVar47,
                                                           (byte)uVar119 & bVar63 |
                                                           (byte)uVar109 & bVar46)))))));
              uVar28 = uVar28 - 8;
              puVar36 = puVar36 + 8;
              puVar27 = puVar27 + 8;
            } while (uVar28 != 0);
            uVar28 = uVar20;
            if (uVar20 != unaff_x23) goto code_r0x002a6340;
          }
          uVar24 = *puVar8;
          uVar23 = ~uVar21;
          if ((uVar37 < 8) || (uVar24 < uVar12 + lVar22 && uVar12 < uVar24 + lVar22)) {
            uVar28 = 0;
          }
          else {
            puVar36 = (undefined8 *)(uVar24 + 0x20);
            puVar27 = (undefined8 *)(uVar12 + 0x20);
            uVar28 = uVar20;
            do {
              uVar14 = puVar27[-3];
              uVar16 = puVar27[-4];
              uVar98 = puVar27[-1];
              uVar88 = puVar27[-2];
              uVar108 = puVar27[1];
              uVar106 = *puVar27;
              uVar110 = puVar27[3];
              uVar109 = puVar27[2];
              uVar112 = puVar36[-3];
              uVar111 = puVar36[-4];
              uVar116 = puVar36[-1];
              uVar114 = puVar36[-2];
              uVar118 = puVar36[1];
              uVar117 = *puVar36;
              uVar120 = puVar36[3];
              uVar119 = puVar36[2];
              bVar63 = (byte)uVar23;
              bVar64 = (byte)(uVar23 >> 8);
              bVar65 = (byte)(uVar23 >> 0x10);
              bVar66 = (byte)(uVar23 >> 0x18);
              bVar67 = (byte)(uVar23 >> 0x20);
              bVar68 = (byte)(uVar23 >> 0x28);
              bVar69 = (byte)(uVar23 >> 0x30);
              bVar70 = (byte)(uVar23 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar112 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar39,
                                                           (byte)uVar112 & bVar63 |
                                                           (byte)uVar14 & bVar38)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar39,
                                                           (byte)uVar111 & bVar63 |
                                                           (byte)uVar16 & bVar38)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar98 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar98 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar98 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar98 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar116 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar98 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar39,
                                                           (byte)uVar116 & bVar63 |
                                                           (byte)uVar98 & bVar38)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar114 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar39,
                                                           (byte)uVar114 & bVar63 |
                                                           (byte)uVar88 & bVar38)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar39,
                                                           (byte)uVar118 & bVar63 |
                                                           (byte)uVar108 & bVar38)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar70 |
                                  (byte)((ulong)uVar106 >> 0x38) & bVar45,
                                  CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar69 |
                                           (byte)((ulong)uVar106 >> 0x30) & bVar44,
                                           CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar68 |
                                                    (byte)((ulong)uVar106 >> 0x28) & bVar43,
                                                    CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar67
                                                             | (byte)((ulong)uVar106 >> 0x20) &
                                                               bVar42,CONCAT13((byte)((ulong)uVar117
                                                                                     >> 0x18) &
                                                                               bVar66 | (byte)((
                                                  ulong)uVar106 >> 0x18) & bVar41,
                                                  CONCAT12((byte)((ulong)uVar117 >> 0x10) & bVar65 |
                                                           (byte)((ulong)uVar106 >> 0x10) & bVar40,
                                                           CONCAT11((byte)((ulong)uVar117 >> 8) &
                                                                    bVar64 | (byte)((ulong)uVar106
                                                                                   >> 8) & bVar39,
                                                                    (byte)uVar117 & bVar63 |
                                                                    (byte)uVar106 & bVar38)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar110 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar110 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar110 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar110 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar120 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar110 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar110 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar110 >> 8) & bVar39,
                                                           (byte)uVar120 & bVar63 |
                                                           (byte)uVar110 & bVar38)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar109 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar109 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar109 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar109 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar119 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar109 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar109 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar109 >> 8) & bVar39,
                                                           (byte)uVar119 & bVar63 |
                                                           (byte)uVar109 & bVar38)))))));
              uVar28 = uVar28 - 8;
              puVar36 = puVar36 + 8;
              puVar27 = puVar27 + 8;
            } while (uVar28 != 0);
            uVar28 = uVar20;
            if (uVar20 == unaff_x23) goto code_r0x002a6450;
          }
          lVar11 = unaff_x23 - uVar28;
          puVar26 = (ulong *)(uVar24 + uVar28 * 8);
          puVar29 = (ulong *)(uVar12 + uVar28 * 8);
          do {
            *puVar26 = *puVar26 & uVar23 | *puVar29 & uVar21;
            lVar11 = lVar11 + -1;
            puVar26 = puVar26 + 1;
            puVar29 = puVar29 + 1;
          } while (lVar11 != 0);
        }
code_r0x002a6450:
        func_0x00382c70(uVar12,**(undefined8 **)(unaff_x29 + -0x68),
                        **(undefined8 **)(unaff_x29 + -0x60),pcVar34);
        param_5 = pcVar34;
        func_0x00382cc0(*puVar10,*puVar9,*unaff_x24);
        param_4 = (char *)*puVar9;
        if (uVar33 != 0) {
          puVar25 = (undefined1 *)*puVar10;
          uVar12 = ~uVar15;
          if ((uVar33 < 8) ||
             (param_4 < puVar25 + (long)pcVar34 * 8 && puVar25 < param_4 + (long)pcVar34 * 8)) {
            pcVar31 = (char *)0x0;
code_r0x002a653c:
            lVar11 = (long)pcVar34 - (long)pcVar31;
            puVar26 = (ulong *)(puVar25 + (long)pcVar31 * 8);
            pcVar31 = param_4 + (long)pcVar31 * 8;
            do {
              *(ulong *)pcVar31 = *puVar26 & uVar12 | *(ulong *)pcVar31 & uVar15;
              lVar11 = lVar11 + -1;
              puVar26 = puVar26 + 1;
              pcVar31 = pcVar31 + 8;
            } while (lVar11 != 0);
          }
          else {
            puVar36 = (undefined8 *)(puVar25 + 0x20);
            pqVar30 = (qword *)(param_4 + 0x20);
            pcVar31 = pcVar19;
            do {
              uVar14 = pqVar30[-3];
              uVar16 = pqVar30[-4];
              qVar97 = pqVar30[-1];
              uVar88 = pqVar30[-2];
              uVar98 = pqVar30[1];
              qVar107 = *pqVar30;
              uVar108 = pqVar30[3];
              uVar106 = pqVar30[2];
              uVar110 = puVar36[-3];
              uVar109 = puVar36[-4];
              uVar112 = puVar36[-1];
              uVar111 = puVar36[-2];
              uVar116 = puVar36[1];
              uVar114 = *puVar36;
              uVar118 = puVar36[3];
              uVar117 = puVar36[2];
              bVar63 = (byte)uVar12;
              bVar64 = (byte)(uVar12 >> 8);
              bVar65 = (byte)(uVar12 >> 0x10);
              bVar66 = (byte)(uVar12 >> 0x18);
              bVar67 = (byte)(uVar12 >> 0x20);
              bVar68 = (byte)(uVar12 >> 0x28);
              bVar69 = (byte)(uVar12 >> 0x30);
              bVar70 = (byte)(uVar12 >> 0x38);
              pqVar30[-3] = CONCAT17((byte)((ulong)uVar110 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar110 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar110 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar110 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar110 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar110 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar110 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar56,
                                                           (byte)uVar110 & bVar63 |
                                                           (byte)uVar14 & bVar54)))))));
              pqVar30[-4] = CONCAT17((byte)((ulong)uVar109 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar109 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar109 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar109 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar109 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar109 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar109 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar56,
                                                           (byte)uVar109 & bVar63 |
                                                           (byte)uVar16 & bVar54)))))));
              pqVar30[-1] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar70 |
                                     (byte)(qVar97 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar69 |
                                              (byte)(qVar97 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar68 |
                                                       (byte)(qVar97 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar67 | (byte)(qVar97 >> 0x20) &
                                                                         bVar59,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)(qVar97 >> 0x18) &
                                                                         bVar58,CONCAT12((byte)((
                                                  ulong)uVar112 >> 0x10) & bVar65 |
                                                  (byte)(qVar97 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar64 |
                                                           (byte)(qVar97 >> 8) & bVar56,
                                                           (byte)uVar112 & bVar63 |
                                                           (byte)qVar97 & bVar54)))))));
              pqVar30[-2] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar70 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar62,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar69 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar61,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar68 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar60,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar67 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar59,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar66 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar58,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar56,
                                                           (byte)uVar111 & bVar63 |
                                                           (byte)uVar88 & bVar54)))))));
              pqVar30[1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar116 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar56,
                                                           (byte)uVar116 & bVar63 |
                                                           (byte)uVar98 & bVar54)))))));
              *pqVar30 = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar70 |
                                  (byte)(qVar107 >> 0x38) & bVar62,
                                  CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar69 |
                                           (byte)(qVar107 >> 0x30) & bVar61,
                                           CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar68 |
                                                    (byte)(qVar107 >> 0x28) & bVar60,
                                                    CONCAT14((byte)((ulong)uVar114 >> 0x20) & bVar67
                                                             | (byte)(qVar107 >> 0x20) & bVar59,
                                                             CONCAT13((byte)((ulong)uVar114 >> 0x18)
                                                                      & bVar66 |
                                                                      (byte)(qVar107 >> 0x18) &
                                                                      bVar58,CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar65 |
                                                  (byte)(qVar107 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar64 |
                                                           (byte)(qVar107 >> 8) & bVar56,
                                                           (byte)uVar114 & bVar63 |
                                                           (byte)qVar107 & bVar54)))))));
              pqVar30[3] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar56,
                                                           (byte)uVar118 & bVar63 |
                                                           (byte)uVar108 & bVar54)))))));
              pqVar30[2] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar70 |
                                    (byte)((ulong)uVar106 >> 0x38) & bVar62,
                                    CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar69 |
                                             (byte)((ulong)uVar106 >> 0x30) & bVar61,
                                             CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar68 |
                                                      (byte)((ulong)uVar106 >> 0x28) & bVar60,
                                                      CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                               bVar67 | (byte)((ulong)uVar106 >>
                                                                              0x20) & bVar59,
                                                               CONCAT13((byte)((ulong)uVar117 >>
                                                                              0x18) & bVar66 |
                                                                        (byte)((ulong)uVar106 >>
                                                                              0x18) & bVar58,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar117 >> 0x10) & bVar65 |
                                                  (byte)((ulong)uVar106 >> 0x10) & bVar57,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar64 |
                                                           (byte)((ulong)uVar106 >> 8) & bVar56,
                                                           (byte)uVar117 & bVar63 |
                                                           (byte)uVar106 & bVar54)))))));
              pcVar31 = pcVar31 + -8;
              puVar36 = puVar36 + 8;
              pqVar30 = pqVar30 + 8;
            } while (pcVar31 != (char *)0x0);
            pcVar31 = pcVar19;
            if (pcVar19 != pcVar34) goto code_r0x002a653c;
          }
          puVar25 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x68);
          uVar12 = ~uVar35;
          if ((uVar33 < 8) ||
             (puVar25 < param_4 + (long)pcVar34 * 8 && param_4 < puVar25 + (long)pcVar34 * 8)) {
            pcVar31 = (char *)0x0;
code_r0x002a661c:
            lVar11 = (long)pcVar34 - (long)pcVar31;
            puVar26 = (ulong *)(puVar25 + (long)pcVar31 * 8);
            pcVar31 = param_4 + (long)pcVar31 * 8;
            do {
              *puVar26 = *puVar26 & uVar12 | *(ulong *)pcVar31 & uVar35;
              lVar11 = lVar11 + -1;
              puVar26 = puVar26 + 1;
              pcVar31 = pcVar31 + 8;
            } while (lVar11 != 0);
          }
          else {
            puVar36 = (undefined8 *)(puVar25 + 0x20);
            pqVar30 = (qword *)(param_4 + 0x20);
            pcVar31 = pcVar19;
            do {
              uVar14 = pqVar30[-3];
              uVar16 = pqVar30[-4];
              qVar97 = pqVar30[-1];
              uVar88 = pqVar30[-2];
              uVar98 = pqVar30[1];
              qVar107 = *pqVar30;
              uVar108 = pqVar30[3];
              uVar106 = pqVar30[2];
              uVar110 = puVar36[-3];
              uVar109 = puVar36[-4];
              uVar112 = puVar36[-1];
              uVar111 = puVar36[-2];
              uVar116 = puVar36[1];
              uVar114 = *puVar36;
              uVar118 = puVar36[3];
              uVar117 = puVar36[2];
              bVar54 = (byte)uVar12;
              bVar56 = (byte)(uVar12 >> 8);
              bVar57 = (byte)(uVar12 >> 0x10);
              bVar58 = (byte)(uVar12 >> 0x18);
              bVar59 = (byte)(uVar12 >> 0x20);
              bVar60 = (byte)(uVar12 >> 0x28);
              bVar61 = (byte)(uVar12 >> 0x30);
              bVar62 = (byte)(uVar12 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar110 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar110 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar110 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar110 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar110 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar110 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar110 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar47,
                                                           (byte)uVar110 & bVar54 |
                                                           (byte)uVar14 & bVar46)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar109 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar109 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar109 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar109 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar109 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar109 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar109 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar47,
                                                           (byte)uVar109 & bVar54 |
                                                           (byte)uVar16 & bVar46)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar62 |
                                     (byte)(qVar97 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar61 |
                                              (byte)(qVar97 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar60 |
                                                       (byte)(qVar97 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar59 | (byte)(qVar97 >> 0x20) &
                                                                         bVar50,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)(qVar97 >> 0x18) &
                                                                         bVar49,CONCAT12((byte)((
                                                  ulong)uVar112 >> 0x10) & bVar57 |
                                                  (byte)(qVar97 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar56 |
                                                           (byte)(qVar97 >> 8) & bVar47,
                                                           (byte)uVar112 & bVar54 |
                                                           (byte)qVar97 & bVar46)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar62 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar53,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar61 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar52,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar60 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar51,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar59 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar50,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar58 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar49,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar47,
                                                           (byte)uVar111 & bVar54 |
                                                           (byte)uVar88 & bVar46)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar116 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar47,
                                                           (byte)uVar116 & bVar54 |
                                                           (byte)uVar98 & bVar46)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar62 |
                                  (byte)(qVar107 >> 0x38) & bVar53,
                                  CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar61 |
                                           (byte)(qVar107 >> 0x30) & bVar52,
                                           CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar60 |
                                                    (byte)(qVar107 >> 0x28) & bVar51,
                                                    CONCAT14((byte)((ulong)uVar114 >> 0x20) & bVar59
                                                             | (byte)(qVar107 >> 0x20) & bVar50,
                                                             CONCAT13((byte)((ulong)uVar114 >> 0x18)
                                                                      & bVar58 |
                                                                      (byte)(qVar107 >> 0x18) &
                                                                      bVar49,CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar57 |
                                                  (byte)(qVar107 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar56 |
                                                           (byte)(qVar107 >> 8) & bVar47,
                                                           (byte)uVar114 & bVar54 |
                                                           (byte)qVar107 & bVar46)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar47,
                                                           (byte)uVar118 & bVar54 |
                                                           (byte)uVar108 & bVar46)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar62 |
                                    (byte)((ulong)uVar106 >> 0x38) & bVar53,
                                    CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar61 |
                                             (byte)((ulong)uVar106 >> 0x30) & bVar52,
                                             CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar60 |
                                                      (byte)((ulong)uVar106 >> 0x28) & bVar51,
                                                      CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                               bVar59 | (byte)((ulong)uVar106 >>
                                                                              0x20) & bVar50,
                                                               CONCAT13((byte)((ulong)uVar117 >>
                                                                              0x18) & bVar58 |
                                                                        (byte)((ulong)uVar106 >>
                                                                              0x18) & bVar49,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar117 >> 0x10) & bVar57 |
                                                  (byte)((ulong)uVar106 >> 0x10) & bVar48,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar56 |
                                                           (byte)((ulong)uVar106 >> 8) & bVar47,
                                                           (byte)uVar117 & bVar54 |
                                                           (byte)uVar106 & bVar46)))))));
              pcVar31 = pcVar31 + -8;
              puVar36 = puVar36 + 8;
              pqVar30 = pqVar30 + 8;
            } while (pcVar31 != (char *)0x0);
            pcVar31 = pcVar19;
            if (pcVar19 != pcVar34) goto code_r0x002a661c;
          }
          puVar25 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x60);
          uVar12 = ~uVar21;
          if ((uVar33 < 8) ||
             (puVar25 < param_4 + (long)pcVar34 * 8 && param_4 < puVar25 + (long)pcVar34 * 8)) {
            pcVar31 = (char *)0x0;
          }
          else {
            puVar36 = (undefined8 *)(puVar25 + 0x20);
            pqVar30 = (qword *)(param_4 + 0x20);
            pcVar31 = pcVar19;
            do {
              uVar14 = pqVar30[-3];
              uVar16 = pqVar30[-4];
              qVar97 = pqVar30[-1];
              uVar88 = pqVar30[-2];
              uVar98 = pqVar30[1];
              qVar107 = *pqVar30;
              uVar108 = pqVar30[3];
              uVar106 = pqVar30[2];
              uVar110 = puVar36[-3];
              uVar109 = puVar36[-4];
              uVar112 = puVar36[-1];
              uVar111 = puVar36[-2];
              uVar116 = puVar36[1];
              uVar114 = *puVar36;
              uVar118 = puVar36[3];
              uVar117 = puVar36[2];
              bVar46 = (byte)uVar12;
              bVar47 = (byte)(uVar12 >> 8);
              bVar48 = (byte)(uVar12 >> 0x10);
              bVar49 = (byte)(uVar12 >> 0x18);
              bVar50 = (byte)(uVar12 >> 0x20);
              bVar51 = (byte)(uVar12 >> 0x28);
              bVar52 = (byte)(uVar12 >> 0x30);
              bVar53 = (byte)(uVar12 >> 0x38);
              puVar36[-3] = CONCAT17((byte)((ulong)uVar110 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar14 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar110 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar14 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar110 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar14 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar110 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar14 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar110 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar110 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar14 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar110 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar14 >> 8) & bVar39,
                                                           (byte)uVar110 & bVar46 |
                                                           (byte)uVar14 & bVar38)))))));
              puVar36[-4] = CONCAT17((byte)((ulong)uVar109 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar16 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar109 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar16 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar109 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar16 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar109 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar16 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar109 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar109 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar16 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar109 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar16 >> 8) & bVar39,
                                                           (byte)uVar109 & bVar46 |
                                                           (byte)uVar16 & bVar38)))))));
              puVar36[-1] = CONCAT17((byte)((ulong)uVar112 >> 0x38) & bVar53 |
                                     (byte)(qVar97 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar112 >> 0x30) & bVar52 |
                                              (byte)(qVar97 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar112 >> 0x28) & bVar51 |
                                                       (byte)(qVar97 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar112 >> 0x20) &
                                                                bVar50 | (byte)(qVar97 >> 0x20) &
                                                                         bVar42,
                                                                CONCAT13((byte)((ulong)uVar112 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)(qVar97 >> 0x18) &
                                                                         bVar41,CONCAT12((byte)((
                                                  ulong)uVar112 >> 0x10) & bVar48 |
                                                  (byte)(qVar97 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar112 >> 8) & bVar47 |
                                                           (byte)(qVar97 >> 8) & bVar39,
                                                           (byte)uVar112 & bVar46 |
                                                           (byte)qVar97 & bVar38)))))));
              puVar36[-2] = CONCAT17((byte)((ulong)uVar111 >> 0x38) & bVar53 |
                                     (byte)((ulong)uVar88 >> 0x38) & bVar45,
                                     CONCAT16((byte)((ulong)uVar111 >> 0x30) & bVar52 |
                                              (byte)((ulong)uVar88 >> 0x30) & bVar44,
                                              CONCAT15((byte)((ulong)uVar111 >> 0x28) & bVar51 |
                                                       (byte)((ulong)uVar88 >> 0x28) & bVar43,
                                                       CONCAT14((byte)((ulong)uVar111 >> 0x20) &
                                                                bVar50 | (byte)((ulong)uVar88 >>
                                                                               0x20) & bVar42,
                                                                CONCAT13((byte)((ulong)uVar111 >>
                                                                               0x18) & bVar49 |
                                                                         (byte)((ulong)uVar88 >>
                                                                               0x18) & bVar41,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar111 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar88 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar111 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar88 >> 8) & bVar39,
                                                           (byte)uVar111 & bVar46 |
                                                           (byte)uVar88 & bVar38)))))));
              puVar36[1] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar116 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar116 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar39,
                                                           (byte)uVar116 & bVar46 |
                                                           (byte)uVar98 & bVar38)))))));
              *puVar36 = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar53 |
                                  (byte)(qVar107 >> 0x38) & bVar45,
                                  CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar52 |
                                           (byte)(qVar107 >> 0x30) & bVar44,
                                           CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar51 |
                                                    (byte)(qVar107 >> 0x28) & bVar43,
                                                    CONCAT14((byte)((ulong)uVar114 >> 0x20) & bVar50
                                                             | (byte)(qVar107 >> 0x20) & bVar42,
                                                             CONCAT13((byte)((ulong)uVar114 >> 0x18)
                                                                      & bVar49 |
                                                                      (byte)(qVar107 >> 0x18) &
                                                                      bVar41,CONCAT12((byte)((ulong)
                                                  uVar114 >> 0x10) & bVar48 |
                                                  (byte)(qVar107 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar47 |
                                                           (byte)(qVar107 >> 8) & bVar39,
                                                           (byte)uVar114 & bVar46 |
                                                           (byte)qVar107 & bVar38)))))));
              puVar36[3] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar108 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar108 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar108 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar108 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar118 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar108 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar118 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar108 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar108 >> 8) & bVar39,
                                                           (byte)uVar118 & bVar46 |
                                                           (byte)uVar108 & bVar38)))))));
              puVar36[2] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar53 |
                                    (byte)((ulong)uVar106 >> 0x38) & bVar45,
                                    CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar52 |
                                             (byte)((ulong)uVar106 >> 0x30) & bVar44,
                                             CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar51 |
                                                      (byte)((ulong)uVar106 >> 0x28) & bVar43,
                                                      CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                               bVar50 | (byte)((ulong)uVar106 >>
                                                                              0x20) & bVar42,
                                                               CONCAT13((byte)((ulong)uVar117 >>
                                                                              0x18) & bVar49 |
                                                                        (byte)((ulong)uVar106 >>
                                                                              0x18) & bVar41,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar117 >> 0x10) & bVar48 |
                                                  (byte)((ulong)uVar106 >> 0x10) & bVar40,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar47 |
                                                           (byte)((ulong)uVar106 >> 8) & bVar39,
                                                           (byte)uVar117 & bVar46 |
                                                           (byte)uVar106 & bVar38)))))));
              pcVar31 = pcVar31 + -8;
              puVar36 = puVar36 + 8;
              pqVar30 = pqVar30 + 8;
            } while (pcVar31 != (char *)0x0);
            pcVar31 = pcVar19;
            if (pcVar19 == pcVar34) goto code_r0x002a672c;
          }
          lVar11 = (long)pcVar34 - (long)pcVar31;
          puVar26 = (ulong *)(puVar25 + (long)pcVar31 * 8);
          pcVar31 = param_4 + (long)pcVar31 * 8;
          do {
            *puVar26 = *puVar26 & uVar12 | *(ulong *)pcVar31 & uVar21;
            lVar11 = lVar11 + -1;
            puVar26 = puVar26 + 1;
            pcVar31 = pcVar31 + 8;
          } while (lVar11 != 0);
        }
code_r0x002a672c:
        if ((*(ulong *)*puVar6 & 1) == (*(ulong *)*puVar7 & 1)) goto code_r0x002a6ae8;
        param_4 = (char *)((*(ulong *)*puVar7 & 1) - 1);
        uVar12 = (*(ulong *)*puVar6 & 1) - 1;
        func_0x002a8410();
        puVar36 = *(undefined8 **)(unaff_x29 + -0x68);
        uVar15 = (-(*(ulong *)*puVar36 & 1) | -(*(ulong *)**(undefined8 **)(unaff_x29 + -0x58) & 1))
                 & uVar12;
        uVar16 = func_0x002a85f8((ulong *)**(undefined8 **)(unaff_x29 + -0x58),uVar15,*unaff_x22,
                                 *puVar9);
        uVar14 = func_0x002a85f8(*puVar36,uVar15,*unaff_x24,*puVar9,pcVar34);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x58),uVar16,uVar12,*puVar9);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x68),uVar14,uVar12,*puVar9,pcVar34);
        func_0x002a8410(*puVar7,param_4,*puVar9);
        uVar12 = (-(*(ulong *)**(undefined8 **)(unaff_x29 + -0x60) & 1) | -(*(ulong *)*puVar8 & 1))
                 & (ulong)param_4;
        uVar16 = func_0x002a85f8((ulong *)*puVar8,uVar12,*unaff_x22,*puVar9);
        uVar14 = func_0x002a85f8(**(undefined8 **)(unaff_x29 + -0x60),uVar12,*unaff_x24,*puVar9,
                                 pcVar34);
        func_0x002a8714(*puVar8,uVar16,param_4,*puVar9);
        param_5 = (char *)*puVar9;
        param_6 = pcVar34;
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x60),uVar14,param_4,param_5,pcVar34);
        uStack0000000000000030 = uStack0000000000000030 + 1;
      } while (uStack0000000000000030 != uVar18);
    }
    uVar32 = (uint)puVar7[1];
    uVar18 = (ulong)(int)uVar32;
    if (uVar32 == 0) {
LAB_002a6a70:
      iVar5 = func_0x0029dd44(puVar6);
      if (iVar5 != 0) {
        lVar22 = func_0x0029bd80();
        uVar18 = (ulong)(lVar22 != 0);
        goto LAB_002a6abc;
      }
      *unaff_x20 = 1;
      param_4 = section_00000068.sectname + 8;
      param_6 = "";
      goto LAB_002a6ab4;
    }
    if (uVar32 < 8) {
      uVar12 = 0;
      uVar20 = 0;
LAB_002a6a54:
      lVar22 = uVar18 - uVar12;
      puVar7 = (ulong *)(*puVar7 + uVar12 * 8);
      do {
        uVar20 = *puVar7 | uVar20;
        lVar22 = lVar22 + -1;
        puVar7 = puVar7 + 1;
      } while (lVar22 != 0);
    }
    else {
      uVar12 = uVar18 & 0xfffffffffffffff8;
      bVar38 = 0;
      bVar39 = 0;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar56 = 0;
      bVar57 = 0;
      bVar58 = 0;
      bVar59 = 0;
      bVar60 = 0;
      bVar61 = 0;
      bVar62 = 0;
      bVar63 = 0;
      bVar64 = 0;
      bVar65 = 0;
      bVar66 = 0;
      bVar67 = 0;
      bVar68 = 0;
      bVar69 = 0;
      bVar70 = 0;
      uVar16 = 0;
      uVar14 = 0;
      uVar88 = 0;
      uVar98 = 0;
      puVar36 = (undefined8 *)(*puVar7 + 0x20);
      uVar20 = uVar12;
      do {
        uVar108 = puVar36[-3];
        uVar106 = puVar36[-4];
        uVar110 = puVar36[-1];
        uVar109 = puVar36[-2];
        uVar112 = puVar36[1];
        uVar111 = *puVar36;
        uVar116 = puVar36[3];
        uVar114 = puVar36[2];
        bVar38 = (byte)uVar106 | bVar38;
        bVar39 = (byte)((ulong)uVar106 >> 8) | bVar39;
        bVar40 = (byte)((ulong)uVar106 >> 0x10) | bVar40;
        bVar41 = (byte)((ulong)uVar106 >> 0x18) | bVar41;
        bVar42 = (byte)((ulong)uVar106 >> 0x20) | bVar42;
        bVar43 = (byte)((ulong)uVar106 >> 0x28) | bVar43;
        bVar44 = (byte)((ulong)uVar106 >> 0x30) | bVar44;
        bVar45 = (byte)((ulong)uVar106 >> 0x38) | bVar45;
        bVar46 = (byte)uVar108 | bVar46;
        bVar47 = (byte)((ulong)uVar108 >> 8) | bVar47;
        bVar48 = (byte)((ulong)uVar108 >> 0x10) | bVar48;
        bVar49 = (byte)((ulong)uVar108 >> 0x18) | bVar49;
        bVar50 = (byte)((ulong)uVar108 >> 0x20) | bVar50;
        bVar51 = (byte)((ulong)uVar108 >> 0x28) | bVar51;
        bVar52 = (byte)((ulong)uVar108 >> 0x30) | bVar52;
        bVar53 = (byte)((ulong)uVar108 >> 0x38) | bVar53;
        bVar54 = (byte)uVar109 | bVar54;
        bVar56 = (byte)((ulong)uVar109 >> 8) | bVar56;
        bVar57 = (byte)((ulong)uVar109 >> 0x10) | bVar57;
        bVar58 = (byte)((ulong)uVar109 >> 0x18) | bVar58;
        bVar59 = (byte)((ulong)uVar109 >> 0x20) | bVar59;
        bVar60 = (byte)((ulong)uVar109 >> 0x28) | bVar60;
        bVar61 = (byte)((ulong)uVar109 >> 0x30) | bVar61;
        bVar62 = (byte)((ulong)uVar109 >> 0x38) | bVar62;
        bVar63 = (byte)uVar110 | bVar63;
        bVar64 = (byte)((ulong)uVar110 >> 8) | bVar64;
        bVar65 = (byte)((ulong)uVar110 >> 0x10) | bVar65;
        bVar66 = (byte)((ulong)uVar110 >> 0x18) | bVar66;
        bVar67 = (byte)((ulong)uVar110 >> 0x20) | bVar67;
        bVar68 = (byte)((ulong)uVar110 >> 0x28) | bVar68;
        bVar69 = (byte)((ulong)uVar110 >> 0x30) | bVar69;
        bVar70 = (byte)((ulong)uVar110 >> 0x38) | bVar70;
        bVar71 = (byte)uVar111 | (byte)uVar16;
        bVar72 = (byte)((ulong)uVar111 >> 8) | (byte)((ulong)uVar16 >> 8);
        bVar73 = (byte)((ulong)uVar111 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
        bVar74 = (byte)((ulong)uVar111 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
        bVar75 = (byte)((ulong)uVar111 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
        bVar76 = (byte)((ulong)uVar111 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
        bVar77 = (byte)((ulong)uVar111 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
        bVar78 = (byte)((ulong)uVar111 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
        uVar16 = CONCAT17(bVar78,CONCAT16(bVar77,CONCAT15(bVar76,CONCAT14(bVar75,CONCAT13(bVar74,
                                                  CONCAT12(bVar73,CONCAT11(bVar72,bVar71)))))));
        bVar79 = (byte)uVar112 | (byte)uVar14;
        bVar80 = (byte)((ulong)uVar112 >> 8) | (byte)((ulong)uVar14 >> 8);
        bVar81 = (byte)((ulong)uVar112 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
        bVar82 = (byte)((ulong)uVar112 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
        bVar83 = (byte)((ulong)uVar112 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
        bVar84 = (byte)((ulong)uVar112 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
        bVar85 = (byte)((ulong)uVar112 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
        bVar86 = (byte)((ulong)uVar112 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
        uVar14 = CONCAT17(bVar86,CONCAT16(bVar85,CONCAT15(bVar84,CONCAT14(bVar83,CONCAT13(bVar82,
                                                  CONCAT12(bVar81,CONCAT11(bVar80,bVar79)))))));
        bVar87 = (byte)uVar114 | (byte)uVar88;
        bVar89 = (byte)((ulong)uVar114 >> 8) | (byte)((ulong)uVar88 >> 8);
        bVar90 = (byte)((ulong)uVar114 >> 0x10) | (byte)((ulong)uVar88 >> 0x10);
        bVar91 = (byte)((ulong)uVar114 >> 0x18) | (byte)((ulong)uVar88 >> 0x18);
        bVar92 = (byte)((ulong)uVar114 >> 0x20) | (byte)((ulong)uVar88 >> 0x20);
        bVar93 = (byte)((ulong)uVar114 >> 0x28) | (byte)((ulong)uVar88 >> 0x28);
        bVar94 = (byte)((ulong)uVar114 >> 0x30) | (byte)((ulong)uVar88 >> 0x30);
        bVar95 = (byte)((ulong)uVar114 >> 0x38) | (byte)((ulong)uVar88 >> 0x38);
        uVar88 = CONCAT17(bVar95,CONCAT16(bVar94,CONCAT15(bVar93,CONCAT14(bVar92,CONCAT13(bVar91,
                                                  CONCAT12(bVar90,CONCAT11(bVar89,bVar87)))))));
        bVar96 = (byte)uVar116 | (byte)uVar98;
        bVar99 = (byte)((ulong)uVar116 >> 8) | (byte)((ulong)uVar98 >> 8);
        bVar100 = (byte)((ulong)uVar116 >> 0x10) | (byte)((ulong)uVar98 >> 0x10);
        bVar101 = (byte)((ulong)uVar116 >> 0x18) | (byte)((ulong)uVar98 >> 0x18);
        bVar102 = (byte)((ulong)uVar116 >> 0x20) | (byte)((ulong)uVar98 >> 0x20);
        bVar103 = (byte)((ulong)uVar116 >> 0x28) | (byte)((ulong)uVar98 >> 0x28);
        bVar104 = (byte)((ulong)uVar116 >> 0x30) | (byte)((ulong)uVar98 >> 0x30);
        bVar105 = (byte)((ulong)uVar116 >> 0x38) | (byte)((ulong)uVar98 >> 0x38);
        uVar98 = CONCAT17(bVar105,CONCAT16(bVar104,CONCAT15(bVar103,CONCAT14(bVar102,CONCAT13(
                                                  bVar101,CONCAT12(bVar100,CONCAT11(bVar99,bVar96)))
                                                  ))));
        uVar20 = uVar20 - 8;
        puVar36 = puVar36 + 8;
      } while (uVar20 != 0);
      bVar87 = bVar87 | bVar71 | bVar54 | bVar38;
      bVar89 = bVar89 | bVar72 | bVar56 | bVar39;
      bVar90 = bVar90 | bVar73 | bVar57 | bVar40;
      bVar91 = bVar91 | bVar74 | bVar58 | bVar41;
      bVar92 = bVar92 | bVar75 | bVar59 | bVar42;
      bVar93 = bVar93 | bVar76 | bVar60 | bVar43;
      bVar94 = bVar94 | bVar77 | bVar61 | bVar44;
      bVar95 = bVar95 | bVar78 | bVar62 | bVar45;
      bVar96 = bVar96 | bVar79 | bVar63 | bVar46;
      bVar99 = bVar99 | bVar80 | bVar64 | bVar47;
      bVar100 = bVar100 | bVar81 | bVar65 | bVar48;
      bVar101 = bVar101 | bVar82 | bVar66 | bVar49;
      bVar102 = bVar102 | bVar83 | bVar67 | bVar50;
      bVar103 = bVar103 | bVar84 | bVar68 | bVar51;
      bVar104 = bVar104 | bVar85 | bVar69 | bVar52;
      bVar105 = bVar105 | bVar86 | bVar70 | bVar53;
      auVar1[1] = bVar89;
      auVar1[0] = bVar87;
      auVar1[2] = bVar90;
      auVar1[3] = bVar91;
      auVar1[4] = bVar92;
      auVar1[5] = bVar93;
      auVar1[6] = bVar94;
      auVar1[7] = bVar95;
      auVar1[8] = bVar96;
      auVar1[9] = bVar99;
      auVar1[10] = bVar100;
      auVar1[0xb] = bVar101;
      auVar1[0xc] = bVar102;
      auVar1[0xd] = bVar103;
      auVar1[0xe] = bVar104;
      auVar1[0xf] = bVar105;
      auVar2[1] = bVar89;
      auVar2[0] = bVar87;
      auVar2[2] = bVar90;
      auVar2[3] = bVar91;
      auVar2[4] = bVar92;
      auVar2[5] = bVar93;
      auVar2[6] = bVar94;
      auVar2[7] = bVar95;
      auVar2[8] = bVar96;
      auVar2[9] = bVar99;
      auVar2[10] = bVar100;
      auVar2[0xb] = bVar101;
      auVar2[0xc] = bVar102;
      auVar2[0xd] = bVar103;
      auVar2[0xe] = bVar104;
      auVar2[0xf] = bVar105;
      auVar121 = NEON_ext(auVar1,auVar2,8,1);
      uVar20 = CONCAT17(bVar95 | auVar121[7],
                        CONCAT16(bVar94 | auVar121[6],
                                 CONCAT15(bVar93 | auVar121[5],
                                          CONCAT14(bVar92 | auVar121[4],
                                                   CONCAT13(bVar91 | auVar121[3],
                                                            CONCAT12(bVar90 | auVar121[2],
                                                                     CONCAT11(bVar89 | auVar121[1],
                                                                              bVar87 | auVar121[0]))
                                                           )))));
      if (uVar12 != uVar18) goto LAB_002a6a54;
    }
    if (uVar20 == 0) goto LAB_002a6a70;
  }
  auVar121 = func_0x0079de7c();
  uVar16 = auVar121._0_8_;
  *auVar121._8_8_ = 0;
  if (((*(int *)(param_4 + 0x10) != 0) || (*(int *)(param_5 + 0x28) != 0)) ||
     (iVar5 = func_0x0029d99c(*(undefined8 *)param_4,(long)*(int *)(param_4 + 8),
                              *(undefined8 *)(param_5 + 0x18),(long)*(int *)(param_5 + 0x20)),
     -1 < iVar5)) {
    func_0x0028f83c(3,0,0x6b,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0x14e);
    return 0;
  }
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  iVar5 = func_0x0029afb8(&uStack_58,(long)*(int *)(param_5 + 0x20));
  if ((iVar5 != 0) &&
     (iVar5 = func_0x002afddc(uStack_58,1,*(undefined8 *)(param_5 + 0x18),
                              (long)*(int *)(param_5 + 0x20),&UNK_008310d0), iVar5 != 0)) {
    uStack_48 = uStack_48 & 0xffffffff00000000;
    uStack_50 = CONCAT44(uStack_50._4_4_,*(undefined4 *)(param_5 + 0x20));
    iVar5 = func_0x002a3110(uVar16,&uStack_58,param_4,param_5,param_6);
    if ((iVar5 != 0) &&
       (iVar5 = func_0x002a50c8(uVar16,auVar121._8_8_,uVar16,param_5 + 0x18,param_6), iVar5 != 0)) {
      uVar18 = func_0x002a3110(uVar16,&uStack_58,uVar16,param_5,param_6);
      goto code_r0x002a6c38;
    }
  }
  uVar18 = 0;
code_r0x002a6c38:
  if ((uStack_48._4_4_ >> 1 & 1) == 0) {
    func_0x0036e3d8(uStack_58);
  }
  if ((uStack_48._4_4_ & 1) != 0) {
    func_0x0036e3d8(&uStack_58);
  }
  return uVar18;
}

