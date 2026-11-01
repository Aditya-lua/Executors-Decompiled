
ulong FUN_002c0924(undefined8 param_1,undefined8 param_2,long *param_3)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  unkbyte9 Var4;
  unkbyte9 Var5;
  bool bVar6;
  int iVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong *puVar10;
  ulong uVar11;
  uint uVar12;
  undefined4 uVar13;
  long lVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  undefined1 *puVar18;
  long lVar19;
  ulong uVar20;
  uint uVar21;
  ulong uVar22;
  byte *pbVar23;
  undefined8 *puVar24;
  undefined8 *puVar25;
  undefined1 *puVar26;
  unkbyte9 *pVar27;
  ulong uVar28;
  ulong uVar29;
  long unaff_x19;
  undefined8 uVar30;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  byte bVar31;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
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
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  byte bVar49;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
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
  undefined1 auVar50 [16];
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
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
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined1 auVar105 [16];
  
  if (unaff_x21 == unaff_x23) {
LAB_002c0964:
    iVar7 = func_0x0029b490();
    if (iVar7 == 0) goto LAB_002c09a0;
    iVar7 = func_0x0029dce0();
    if ((iVar7 < 1) || (iVar7 = func_0x0029db84(), iVar7 == 0)) {
      param_3 = (long *)((long)&segment_command_00000020.flags + 1);
      uVar30 = 0x17c;
      goto code_r0x002c09d4;
    }
    uVar11 = 1;
  }
  else {
    iVar7 = func_0x0029afb8();
    if (iVar7 != 0) {
      uVar13 = 0;
      if (*(int *)(unaff_x21 + 1) != 0) {
        param_3 = (long *)((long)*(int *)(unaff_x21 + 1) << 3);
        _memcpy(*unaff_x23,*unaff_x21);
        uVar13 = *(undefined4 *)(unaff_x21 + 1);
      }
      *(undefined4 *)(unaff_x23 + 1) = uVar13;
      *(undefined4 *)(unaff_x23 + 2) = *(undefined4 *)(unaff_x21 + 2);
      goto LAB_002c0964;
    }
LAB_002c09a0:
    param_3 = (long *)((long)&MACH_HEADER.magic + 3);
    uVar30 = 0x175;
code_r0x002c09d4:
    func_0x0028f83c(5,0,param_3,"/aws-lc/crypto/fipsmodule/dh/dh.c",uVar30);
    uVar11 = 0;
  }
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return uVar11;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar14 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar14;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar14 * 8);
    return uVar11;
  }
  auVar105 = func_0x0079db4c(uVar11);
  lVar14 = auVar105._0_8_;
  puVar8 = (undefined8 *)func_0x0036e31c(0x30);
  if (puVar8 == (undefined8 *)0x0) {
    return 0xffffffff;
  }
  puVar8[1] = 0;
  puVar8[2] = 0;
  puVar8[3] = 0;
  if (*(char *)(puVar8 + 5) == '\0') {
    uVar30 = puVar8[4];
    lVar9 = func_0x0036e48c(0,0x100);
    if (lVar9 == 0) {
      *(undefined2 *)(puVar8 + 5) = 0x101;
    }
    else {
      puVar8[3] = 0x20;
      *(undefined8 *)(lVar9 + puVar8[2] * 8) = uVar30;
      puVar8[1] = lVar9;
      puVar8[2] = puVar8[2] + 1;
    }
  }
  plVar15 = (long *)*param_3;
  uVar1 = *(uint *)(plVar15 + 1);
  uVar11 = (ulong)uVar1;
  uVar12 = uVar1 & (int)uVar1 >> 0x1f;
  lVar9 = uVar11 * 8;
  do {
    lVar9 = lVar9 + -8;
    uVar21 = (uint)uVar11;
    uVar11 = (ulong)(uVar21 - 1);
    if ((int)uVar21 < 1) {
      if (-1 < (int)uVar1) {
        uVar11 = 0;
        puVar10 = (ulong *)func_0x0029e340(puVar8);
        goto joined_r0x002c0214;
      }
      lVar19 = *plVar15;
      goto code_r0x002c0220;
    }
    lVar19 = *plVar15;
  } while (*(long *)(lVar19 + lVar9) == 0);
  uVar12 = uVar21;
code_r0x002c0220:
  uVar16 = *(ulong *)(lVar19 + (long)(int)(uVar12 - 1) * 8);
  uVar20 = uVar16 >> 0x20;
  uVar11 = uVar20;
  if (uVar20 == 0) {
    uVar11 = uVar16;
  }
  uVar22 = uVar11 >> 0x10;
  uVar17 = uVar22;
  if (uVar22 == 0) {
    uVar17 = uVar11;
  }
  uVar11 = uVar17 >> 8;
  if (uVar17 < 0x100) {
    uVar11 = uVar17;
  }
  uVar29 = uVar11 >> 4;
  if (uVar11 < 0x10) {
    uVar29 = uVar11;
  }
  uVar28 = uVar29 >> 2;
  if (uVar29 < 4) {
    uVar28 = uVar29;
  }
  uVar12 = (uint)(uVar16 != 0) | (uVar12 - 1) * 0x40 | (uint)(uVar20 != 0) << 5 |
           (uint)(uVar22 != 0) << 4 | (uint)(0xff < uVar17) << 3 | (uint)(0xf < uVar11) << 2 |
           (uint)(3 < uVar29) << 1;
  if (1 < uVar28) {
    uVar12 = uVar12 + 1;
  }
  uVar11 = (ulong)(uVar12 + 7 >> 3);
  puVar10 = (ulong *)func_0x0029e340(puVar8);
joined_r0x002c0214:
  if ((puVar10 == (ulong *)0x0) ||
     (iVar7 = func_0x002c0774(param_3,puVar10,auVar105._8_8_,puVar8), iVar7 == 0)) {
code_r0x002c03f8:
    uVar11 = 0xffffffff;
code_r0x002c03fc:
    if (*(char *)(puVar8 + 5) != '\0') {
code_r0x002c0424:
      func_0x00373520(*puVar8,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(puVar8[1]);
      func_0x0036e3d8(puVar8);
      return uVar11;
    }
    if (puVar8[2] != 0) {
      lVar14 = puVar8[2] + -1;
      puVar8[2] = lVar14;
      lVar14 = *(long *)(puVar8[1] + lVar14 * 8);
      puVar8[4] = lVar14;
      if (lVar14 == 0) goto code_r0x002c0424;
      goto code_r0x002c069c;
    }
    func_0x0079db4c();
  }
  else {
    uVar17 = *puVar10;
    lVar9 = (long)(int)puVar10[1];
    uVar20 = lVar9 * 8;
    uVar16 = uVar20 - uVar11;
    if (uVar20 < uVar11 || uVar16 == 0) {
code_r0x002c0574:
      uVar16 = uVar20;
      if (uVar11 <= uVar20) {
        uVar16 = uVar11;
      }
      if (uVar16 != 0) {
        if ((uVar16 < 8) ||
           ((lVar14 + (uVar11 - uVar16) < uVar17 + uVar16 && (uVar17 < lVar14 + uVar11)))) {
          uVar22 = 0;
        }
        else {
          if (uVar16 < 0x40) {
            uVar29 = 0;
          }
          else {
            uVar22 = uVar16 & 0x1fffffc0;
            puVar24 = (undefined8 *)(uVar11 + lVar14 + -0x20);
            pVar27 = (unkbyte9 *)(uVar17 + 0x20);
            uVar29 = uVar22;
            do {
              uVar30 = *(undefined8 *)((long)pVar27 + 8);
              Var4 = *pVar27;
              uVar98 = *(undefined8 *)((long)pVar27 + 0x18);
              Var5 = pVar27[1];
              auVar105 = NEON_rev64(*(undefined1 (*) [16])(pVar27 + -2),1);
              auVar105 = NEON_ext(auVar105,auVar105,8,1);
              auVar50 = NEON_rev64(*(undefined1 (*) [16])(pVar27 + -1),1);
              auVar50 = NEON_ext(auVar50,auVar50,8,1);
              puVar24[1] = auVar50._8_8_;
              *puVar24 = auVar50._0_8_;
              puVar24[3] = auVar105._8_8_;
              puVar24[2] = auVar105._0_8_;
              auVar2[9] = (char)((ulong)uVar30 >> 8);
              auVar2._0_9_ = Var4;
              auVar2[10] = (char)((ulong)uVar30 >> 0x10);
              auVar2[0xb] = (char)((ulong)uVar30 >> 0x18);
              auVar2[0xc] = (char)((ulong)uVar30 >> 0x20);
              auVar2[0xd] = (char)((ulong)uVar30 >> 0x28);
              auVar2[0xe] = (char)((ulong)uVar30 >> 0x30);
              auVar2[0xf] = (char)((ulong)uVar30 >> 0x38);
              auVar105 = NEON_rev64(auVar2,1);
              auVar105 = NEON_ext(auVar105,auVar105,8,1);
              auVar3[9] = (char)((ulong)uVar98 >> 8);
              auVar3._0_9_ = Var5;
              auVar3[10] = (char)((ulong)uVar98 >> 0x10);
              auVar3[0xb] = (char)((ulong)uVar98 >> 0x18);
              auVar3[0xc] = (char)((ulong)uVar98 >> 0x20);
              auVar3[0xd] = (char)((ulong)uVar98 >> 0x28);
              auVar3[0xe] = (char)((ulong)uVar98 >> 0x30);
              auVar3[0xf] = (char)((ulong)uVar98 >> 0x38);
              auVar50 = NEON_rev64(auVar3,1);
              auVar50 = NEON_ext(auVar50,auVar50,8,1);
              puVar24[-3] = auVar50._8_8_;
              puVar24[-4] = auVar50._0_8_;
              puVar24[-1] = auVar105._8_8_;
              puVar24[-2] = auVar105._0_8_;
              puVar24 = puVar24 + -8;
              uVar29 = uVar29 - 0x40;
              pVar27 = pVar27 + 4;
            } while (uVar29 != 0);
            if (uVar16 == uVar22) goto code_r0x002c05d0;
            uVar29 = uVar22;
            if ((uVar16 & 0x38) == 0) goto code_r0x002c05ac;
          }
          uVar22 = uVar16 & 0x1ffffff8;
          puVar24 = (undefined8 *)((uVar11 - uVar29) + lVar14);
          lVar9 = uVar29 - uVar22;
          puVar25 = (undefined8 *)(uVar17 + uVar29);
          do {
            puVar24 = puVar24 + -1;
            uVar30 = NEON_rev64(*puVar25,1);
            *puVar24 = uVar30;
            lVar9 = lVar9 + 8;
            puVar25 = puVar25 + 1;
          } while (lVar9 != 0);
          if (uVar16 == uVar22) goto code_r0x002c05d0;
        }
code_r0x002c05ac:
        lVar9 = uVar16 - uVar22;
        puVar18 = (undefined1 *)(uVar17 + uVar22);
        puVar26 = (undefined1 *)(lVar14 + uVar11 + ~uVar22);
        do {
          *puVar26 = *puVar18;
          lVar9 = lVar9 + -1;
          puVar18 = puVar18 + 1;
          puVar26 = puVar26 + -1;
        } while (lVar9 != 0);
      }
code_r0x002c05d0:
      if (uVar20 < uVar11) {
        _bzero(lVar14,uVar11 - uVar16);
      }
      goto code_r0x002c03fc;
    }
    if (uVar16 < 8) {
      uVar12 = 0;
      uVar22 = uVar11;
code_r0x002c03d8:
      lVar19 = uVar22 + lVar9 * -8;
      pbVar23 = (byte *)(uVar17 + uVar22);
      do {
        uVar12 = *pbVar23 | uVar12;
        bVar6 = lVar19 != -1;
        lVar19 = lVar19 + 1;
        pbVar23 = pbVar23 + 1;
      } while (bVar6);
    }
    else if (uVar16 < 0x40) {
      bVar31 = 0;
      uVar29 = 0;
code_r0x002c0388:
      uVar28 = uVar16 & 0xfffffffffffffff8;
      uVar22 = uVar28 + uVar11;
      auVar50 = ZEXT116(bVar31);
      lVar19 = uVar29 - uVar28;
      puVar24 = (undefined8 *)(uVar17 + uVar29 + uVar11);
      do {
        uVar30 = *puVar24;
        auVar50._0_8_ =
             CONCAT17((byte)((ulong)uVar30 >> 0x38) | auVar50[7],
                      CONCAT16((byte)((ulong)uVar30 >> 0x30) | auVar50[6],
                               CONCAT15((byte)((ulong)uVar30 >> 0x28) | auVar50[5],
                                        CONCAT14((byte)((ulong)uVar30 >> 0x20) | auVar50[4],
                                                 CONCAT13((byte)((ulong)uVar30 >> 0x18) | auVar50[3]
                                                          ,CONCAT12((byte)((ulong)uVar30 >> 0x10) |
                                                                    auVar50[2],
                                                                    CONCAT11((byte)((ulong)uVar30 >>
                                                                                   8) | auVar50[1],
                                                                             (byte)uVar30 |
                                                                             auVar50[0])))))));
        auVar50._8_8_ = 0;
        lVar19 = lVar19 + 8;
        puVar24 = puVar24 + 1;
      } while (lVar19 != 0);
      uVar29 = auVar50._0_8_ | auVar50._0_8_ >> 0x20;
      uVar29 = uVar29 | uVar29 >> 0x10;
      uVar12 = (uint)uVar29 | (uint)(uVar29 >> 8);
      if (uVar16 != uVar28) goto code_r0x002c03d8;
    }
    else {
      uVar29 = uVar16 & 0xffffffffffffffc0;
      bVar31 = 0;
      bVar34 = 0;
      bVar35 = 0;
      bVar36 = 0;
      bVar37 = 0;
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
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
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
      bVar71 = 0;
      bVar72 = 0;
      bVar73 = 0;
      bVar74 = 0;
      bVar75 = 0;
      bVar76 = 0;
      bVar77 = 0;
      bVar78 = 0;
      bVar79 = 0;
      bVar80 = 0;
      bVar81 = 0;
      bVar82 = 0;
      bVar83 = 0;
      bVar84 = 0;
      bVar85 = 0;
      bVar86 = 0;
      bVar87 = 0;
      bVar88 = 0;
      bVar89 = 0;
      bVar90 = 0;
      bVar91 = 0;
      bVar92 = 0;
      bVar93 = 0;
      bVar94 = 0;
      bVar95 = 0;
      bVar96 = 0;
      bVar97 = 0;
      puVar24 = (undefined8 *)(uVar11 + uVar17 + 0x20);
      uVar22 = uVar29;
      do {
        uVar98 = puVar24[-3];
        uVar30 = puVar24[-4];
        uVar100 = puVar24[-1];
        uVar99 = puVar24[-2];
        uVar102 = puVar24[1];
        uVar101 = *puVar24;
        uVar104 = puVar24[3];
        uVar103 = puVar24[2];
        bVar31 = (byte)uVar30 | bVar31;
        bVar34 = (byte)((ulong)uVar30 >> 8) | bVar34;
        bVar35 = (byte)((ulong)uVar30 >> 0x10) | bVar35;
        bVar36 = (byte)((ulong)uVar30 >> 0x18) | bVar36;
        bVar37 = (byte)((ulong)uVar30 >> 0x20) | bVar37;
        bVar38 = (byte)((ulong)uVar30 >> 0x28) | bVar38;
        bVar39 = (byte)((ulong)uVar30 >> 0x30) | bVar39;
        bVar40 = (byte)((ulong)uVar30 >> 0x38) | bVar40;
        bVar41 = (byte)uVar98 | bVar41;
        bVar42 = (byte)((ulong)uVar98 >> 8) | bVar42;
        bVar43 = (byte)((ulong)uVar98 >> 0x10) | bVar43;
        bVar44 = (byte)((ulong)uVar98 >> 0x18) | bVar44;
        bVar45 = (byte)((ulong)uVar98 >> 0x20) | bVar45;
        bVar46 = (byte)((ulong)uVar98 >> 0x28) | bVar46;
        bVar47 = (byte)((ulong)uVar98 >> 0x30) | bVar47;
        bVar48 = (byte)((ulong)uVar98 >> 0x38) | bVar48;
        bVar49 = (byte)uVar99 | bVar49;
        bVar51 = (byte)((ulong)uVar99 >> 8) | bVar51;
        bVar52 = (byte)((ulong)uVar99 >> 0x10) | bVar52;
        bVar53 = (byte)((ulong)uVar99 >> 0x18) | bVar53;
        bVar54 = (byte)((ulong)uVar99 >> 0x20) | bVar54;
        bVar55 = (byte)((ulong)uVar99 >> 0x28) | bVar55;
        bVar56 = (byte)((ulong)uVar99 >> 0x30) | bVar56;
        bVar57 = (byte)((ulong)uVar99 >> 0x38) | bVar57;
        bVar58 = (byte)uVar100 | bVar58;
        bVar59 = (byte)((ulong)uVar100 >> 8) | bVar59;
        bVar60 = (byte)((ulong)uVar100 >> 0x10) | bVar60;
        bVar61 = (byte)((ulong)uVar100 >> 0x18) | bVar61;
        bVar62 = (byte)((ulong)uVar100 >> 0x20) | bVar62;
        bVar63 = (byte)((ulong)uVar100 >> 0x28) | bVar63;
        bVar64 = (byte)((ulong)uVar100 >> 0x30) | bVar64;
        bVar65 = (byte)((ulong)uVar100 >> 0x38) | bVar65;
        bVar66 = (byte)uVar101 | bVar66;
        bVar67 = (byte)((ulong)uVar101 >> 8) | bVar67;
        bVar68 = (byte)((ulong)uVar101 >> 0x10) | bVar68;
        bVar69 = (byte)((ulong)uVar101 >> 0x18) | bVar69;
        bVar70 = (byte)((ulong)uVar101 >> 0x20) | bVar70;
        bVar71 = (byte)((ulong)uVar101 >> 0x28) | bVar71;
        bVar72 = (byte)((ulong)uVar101 >> 0x30) | bVar72;
        bVar73 = (byte)((ulong)uVar101 >> 0x38) | bVar73;
        bVar74 = (byte)uVar102 | bVar74;
        bVar75 = (byte)((ulong)uVar102 >> 8) | bVar75;
        bVar76 = (byte)((ulong)uVar102 >> 0x10) | bVar76;
        bVar77 = (byte)((ulong)uVar102 >> 0x18) | bVar77;
        bVar78 = (byte)((ulong)uVar102 >> 0x20) | bVar78;
        bVar79 = (byte)((ulong)uVar102 >> 0x28) | bVar79;
        bVar80 = (byte)((ulong)uVar102 >> 0x30) | bVar80;
        bVar81 = (byte)((ulong)uVar102 >> 0x38) | bVar81;
        bVar82 = (byte)uVar103 | bVar82;
        bVar83 = (byte)((ulong)uVar103 >> 8) | bVar83;
        bVar84 = (byte)((ulong)uVar103 >> 0x10) | bVar84;
        bVar85 = (byte)((ulong)uVar103 >> 0x18) | bVar85;
        bVar86 = (byte)((ulong)uVar103 >> 0x20) | bVar86;
        bVar87 = (byte)((ulong)uVar103 >> 0x28) | bVar87;
        bVar88 = (byte)((ulong)uVar103 >> 0x30) | bVar88;
        bVar89 = (byte)((ulong)uVar103 >> 0x38) | bVar89;
        bVar90 = (byte)uVar104 | bVar90;
        bVar91 = (byte)((ulong)uVar104 >> 8) | bVar91;
        bVar92 = (byte)((ulong)uVar104 >> 0x10) | bVar92;
        bVar93 = (byte)((ulong)uVar104 >> 0x18) | bVar93;
        bVar94 = (byte)((ulong)uVar104 >> 0x20) | bVar94;
        bVar95 = (byte)((ulong)uVar104 >> 0x28) | bVar95;
        bVar96 = (byte)((ulong)uVar104 >> 0x30) | bVar96;
        bVar97 = (byte)((ulong)uVar104 >> 0x38) | bVar97;
        uVar22 = uVar22 - 0x40;
        puVar24 = puVar24 + 8;
      } while (uVar22 != 0);
      auVar105[0] = bVar82 | bVar66 | bVar49 | bVar31;
      auVar105[1] = bVar83 | bVar67 | bVar51 | bVar34;
      auVar105[2] = bVar84 | bVar68 | bVar52 | bVar35;
      auVar105[3] = bVar85 | bVar69 | bVar53 | bVar36;
      auVar105[4] = bVar86 | bVar70 | bVar54 | bVar37;
      auVar105[5] = bVar87 | bVar71 | bVar55 | bVar38;
      auVar105[6] = bVar88 | bVar72 | bVar56 | bVar39;
      auVar105[7] = bVar89 | bVar73 | bVar57 | bVar40;
      auVar105[8] = bVar90 | bVar74 | bVar58 | bVar41;
      auVar105[9] = bVar91 | bVar75 | bVar59 | bVar42;
      auVar105[10] = bVar92 | bVar76 | bVar60 | bVar43;
      auVar105[0xb] = bVar93 | bVar77 | bVar61 | bVar44;
      auVar105[0xc] = bVar94 | bVar78 | bVar62 | bVar45;
      auVar105[0xd] = bVar95 | bVar79 | bVar63 | bVar46;
      auVar105[0xe] = bVar96 | bVar80 | bVar64 | bVar47;
      auVar105[0xf] = bVar97 | bVar81 | bVar65 | bVar48;
      auVar50 = NEON_ext(auVar105,auVar105,8,1);
      uVar22 = CONCAT17(auVar105[7] | auVar50[7],
                        CONCAT16(auVar105[6] | auVar50[6],
                                 CONCAT15(auVar105[5] | auVar50[5],
                                          CONCAT14(auVar105[4] | auVar50[4],
                                                   CONCAT13(auVar105[3] | auVar50[3],
                                                            CONCAT12(auVar105[2] | auVar50[2],
                                                                     CONCAT11(auVar105[1] |
                                                                              auVar50[1],
                                                                              auVar105[0] |
                                                                              auVar50[0])))))));
      uVar22 = uVar22 | uVar22 >> 0x20;
      uVar22 = uVar22 | uVar22 >> 0x10;
      uVar12 = (uint)uVar22 | (uint)(uVar22 >> 8);
      bVar31 = (byte)uVar12;
      if (uVar16 != uVar29) {
        if ((uVar16 & 0x38) == 0) {
          uVar22 = uVar29 + uVar11;
          goto code_r0x002c03d8;
        }
        goto code_r0x002c0388;
      }
    }
    if ((uVar12 & 0xff) != 0) goto code_r0x002c03f8;
    if (uVar16 < 8) {
      uVar12 = 0;
      uVar22 = uVar11;
code_r0x002c0554:
      lVar9 = uVar22 + lVar9 * -8;
      pbVar23 = (byte *)(uVar17 + uVar22);
      do {
        uVar12 = *pbVar23 | uVar12;
        bVar6 = lVar9 != -1;
        lVar9 = lVar9 + 1;
        pbVar23 = pbVar23 + 1;
      } while (bVar6);
    }
    else if (uVar16 < 0x40) {
      bVar31 = 0;
      uVar29 = 0;
code_r0x002c0504:
      uVar28 = uVar16 & 0xfffffffffffffff8;
      uVar22 = uVar28 + uVar11;
      auVar33 = ZEXT116(bVar31);
      lVar19 = uVar29 - uVar28;
      puVar24 = (undefined8 *)(uVar17 + uVar29 + uVar11);
      do {
        uVar30 = *puVar24;
        auVar33._0_8_ =
             CONCAT17((byte)((ulong)uVar30 >> 0x38) | auVar33[7],
                      CONCAT16((byte)((ulong)uVar30 >> 0x30) | auVar33[6],
                               CONCAT15((byte)((ulong)uVar30 >> 0x28) | auVar33[5],
                                        CONCAT14((byte)((ulong)uVar30 >> 0x20) | auVar33[4],
                                                 CONCAT13((byte)((ulong)uVar30 >> 0x18) | auVar33[3]
                                                          ,CONCAT12((byte)((ulong)uVar30 >> 0x10) |
                                                                    auVar33[2],
                                                                    CONCAT11((byte)((ulong)uVar30 >>
                                                                                   8) | auVar33[1],
                                                                             (byte)uVar30 |
                                                                             auVar33[0])))))));
        auVar33._8_8_ = 0;
        lVar19 = lVar19 + 8;
        puVar24 = puVar24 + 1;
      } while (lVar19 != 0);
      uVar29 = auVar33._0_8_ | auVar33._0_8_ >> 0x20;
      uVar29 = uVar29 | uVar29 >> 0x10;
      uVar12 = (uint)uVar29 | (uint)(uVar29 >> 8);
      if (uVar16 != uVar28) goto code_r0x002c0554;
    }
    else {
      uVar29 = uVar16 & 0xffffffffffffffc0;
      bVar31 = 0;
      bVar34 = 0;
      bVar35 = 0;
      bVar36 = 0;
      bVar37 = 0;
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
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
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
      bVar71 = 0;
      bVar72 = 0;
      bVar73 = 0;
      bVar74 = 0;
      bVar75 = 0;
      bVar76 = 0;
      bVar77 = 0;
      bVar78 = 0;
      bVar79 = 0;
      bVar80 = 0;
      bVar81 = 0;
      bVar82 = 0;
      bVar83 = 0;
      bVar84 = 0;
      bVar85 = 0;
      bVar86 = 0;
      bVar87 = 0;
      bVar88 = 0;
      bVar89 = 0;
      bVar90 = 0;
      bVar91 = 0;
      bVar92 = 0;
      bVar93 = 0;
      bVar94 = 0;
      bVar95 = 0;
      bVar96 = 0;
      bVar97 = 0;
      puVar24 = (undefined8 *)(uVar11 + uVar17 + 0x20);
      uVar22 = uVar29;
      do {
        uVar98 = puVar24[-3];
        uVar30 = puVar24[-4];
        uVar100 = puVar24[-1];
        uVar99 = puVar24[-2];
        uVar102 = puVar24[1];
        uVar101 = *puVar24;
        uVar104 = puVar24[3];
        uVar103 = puVar24[2];
        bVar31 = (byte)uVar30 | bVar31;
        bVar34 = (byte)((ulong)uVar30 >> 8) | bVar34;
        bVar35 = (byte)((ulong)uVar30 >> 0x10) | bVar35;
        bVar36 = (byte)((ulong)uVar30 >> 0x18) | bVar36;
        bVar37 = (byte)((ulong)uVar30 >> 0x20) | bVar37;
        bVar38 = (byte)((ulong)uVar30 >> 0x28) | bVar38;
        bVar39 = (byte)((ulong)uVar30 >> 0x30) | bVar39;
        bVar40 = (byte)((ulong)uVar30 >> 0x38) | bVar40;
        bVar41 = (byte)uVar98 | bVar41;
        bVar42 = (byte)((ulong)uVar98 >> 8) | bVar42;
        bVar43 = (byte)((ulong)uVar98 >> 0x10) | bVar43;
        bVar44 = (byte)((ulong)uVar98 >> 0x18) | bVar44;
        bVar45 = (byte)((ulong)uVar98 >> 0x20) | bVar45;
        bVar46 = (byte)((ulong)uVar98 >> 0x28) | bVar46;
        bVar47 = (byte)((ulong)uVar98 >> 0x30) | bVar47;
        bVar48 = (byte)((ulong)uVar98 >> 0x38) | bVar48;
        bVar49 = (byte)uVar99 | bVar49;
        bVar51 = (byte)((ulong)uVar99 >> 8) | bVar51;
        bVar52 = (byte)((ulong)uVar99 >> 0x10) | bVar52;
        bVar53 = (byte)((ulong)uVar99 >> 0x18) | bVar53;
        bVar54 = (byte)((ulong)uVar99 >> 0x20) | bVar54;
        bVar55 = (byte)((ulong)uVar99 >> 0x28) | bVar55;
        bVar56 = (byte)((ulong)uVar99 >> 0x30) | bVar56;
        bVar57 = (byte)((ulong)uVar99 >> 0x38) | bVar57;
        bVar58 = (byte)uVar100 | bVar58;
        bVar59 = (byte)((ulong)uVar100 >> 8) | bVar59;
        bVar60 = (byte)((ulong)uVar100 >> 0x10) | bVar60;
        bVar61 = (byte)((ulong)uVar100 >> 0x18) | bVar61;
        bVar62 = (byte)((ulong)uVar100 >> 0x20) | bVar62;
        bVar63 = (byte)((ulong)uVar100 >> 0x28) | bVar63;
        bVar64 = (byte)((ulong)uVar100 >> 0x30) | bVar64;
        bVar65 = (byte)((ulong)uVar100 >> 0x38) | bVar65;
        bVar66 = (byte)uVar101 | bVar66;
        bVar67 = (byte)((ulong)uVar101 >> 8) | bVar67;
        bVar68 = (byte)((ulong)uVar101 >> 0x10) | bVar68;
        bVar69 = (byte)((ulong)uVar101 >> 0x18) | bVar69;
        bVar70 = (byte)((ulong)uVar101 >> 0x20) | bVar70;
        bVar71 = (byte)((ulong)uVar101 >> 0x28) | bVar71;
        bVar72 = (byte)((ulong)uVar101 >> 0x30) | bVar72;
        bVar73 = (byte)((ulong)uVar101 >> 0x38) | bVar73;
        bVar74 = (byte)uVar102 | bVar74;
        bVar75 = (byte)((ulong)uVar102 >> 8) | bVar75;
        bVar76 = (byte)((ulong)uVar102 >> 0x10) | bVar76;
        bVar77 = (byte)((ulong)uVar102 >> 0x18) | bVar77;
        bVar78 = (byte)((ulong)uVar102 >> 0x20) | bVar78;
        bVar79 = (byte)((ulong)uVar102 >> 0x28) | bVar79;
        bVar80 = (byte)((ulong)uVar102 >> 0x30) | bVar80;
        bVar81 = (byte)((ulong)uVar102 >> 0x38) | bVar81;
        bVar82 = (byte)uVar103 | bVar82;
        bVar83 = (byte)((ulong)uVar103 >> 8) | bVar83;
        bVar84 = (byte)((ulong)uVar103 >> 0x10) | bVar84;
        bVar85 = (byte)((ulong)uVar103 >> 0x18) | bVar85;
        bVar86 = (byte)((ulong)uVar103 >> 0x20) | bVar86;
        bVar87 = (byte)((ulong)uVar103 >> 0x28) | bVar87;
        bVar88 = (byte)((ulong)uVar103 >> 0x30) | bVar88;
        bVar89 = (byte)((ulong)uVar103 >> 0x38) | bVar89;
        bVar90 = (byte)uVar104 | bVar90;
        bVar91 = (byte)((ulong)uVar104 >> 8) | bVar91;
        bVar92 = (byte)((ulong)uVar104 >> 0x10) | bVar92;
        bVar93 = (byte)((ulong)uVar104 >> 0x18) | bVar93;
        bVar94 = (byte)((ulong)uVar104 >> 0x20) | bVar94;
        bVar95 = (byte)((ulong)uVar104 >> 0x28) | bVar95;
        bVar96 = (byte)((ulong)uVar104 >> 0x30) | bVar96;
        bVar97 = (byte)((ulong)uVar104 >> 0x38) | bVar97;
        uVar22 = uVar22 - 0x40;
        puVar24 = puVar24 + 8;
      } while (uVar22 != 0);
      auVar32[0] = bVar82 | bVar66 | bVar49 | bVar31;
      auVar32[1] = bVar83 | bVar67 | bVar51 | bVar34;
      auVar32[2] = bVar84 | bVar68 | bVar52 | bVar35;
      auVar32[3] = bVar85 | bVar69 | bVar53 | bVar36;
      auVar32[4] = bVar86 | bVar70 | bVar54 | bVar37;
      auVar32[5] = bVar87 | bVar71 | bVar55 | bVar38;
      auVar32[6] = bVar88 | bVar72 | bVar56 | bVar39;
      auVar32[7] = bVar89 | bVar73 | bVar57 | bVar40;
      auVar32[8] = bVar90 | bVar74 | bVar58 | bVar41;
      auVar32[9] = bVar91 | bVar75 | bVar59 | bVar42;
      auVar32[10] = bVar92 | bVar76 | bVar60 | bVar43;
      auVar32[0xb] = bVar93 | bVar77 | bVar61 | bVar44;
      auVar32[0xc] = bVar94 | bVar78 | bVar62 | bVar45;
      auVar32[0xd] = bVar95 | bVar79 | bVar63 | bVar46;
      auVar32[0xe] = bVar96 | bVar80 | bVar64 | bVar47;
      auVar32[0xf] = bVar97 | bVar81 | bVar65 | bVar48;
      auVar105 = NEON_ext(auVar32,auVar32,8,1);
      uVar22 = CONCAT17(auVar32[7] | auVar105[7],
                        CONCAT16(auVar32[6] | auVar105[6],
                                 CONCAT15(auVar32[5] | auVar105[5],
                                          CONCAT14(auVar32[4] | auVar105[4],
                                                   CONCAT13(auVar32[3] | auVar105[3],
                                                            CONCAT12(auVar32[2] | auVar105[2],
                                                                     CONCAT11(auVar32[1] |
                                                                              auVar105[1],
                                                                              auVar32[0] |
                                                                              auVar105[0])))))));
      uVar22 = uVar22 | uVar22 >> 0x20;
      uVar22 = uVar22 | uVar22 >> 0x10;
      uVar12 = (uint)uVar22 | (uint)(uVar22 >> 8);
      bVar31 = (byte)uVar12;
      if (uVar16 != uVar29) {
        if ((uVar16 & 0x38) == 0) {
          uVar22 = uVar29 + uVar11;
          goto code_r0x002c0554;
        }
        goto code_r0x002c0504;
      }
    }
    if ((uVar12 & 0xff) == 0) goto code_r0x002c0574;
  }
  func_0x0079dae0();
code_r0x002c069c:
  plVar15 = (long *)func_0x0079db28();
  plVar15 = (long *)*plVar15;
  uVar1 = *(uint *)(plVar15 + 1);
  uVar11 = (ulong)uVar1;
  uVar12 = uVar1 & (int)uVar1 >> 0x1f;
  lVar14 = uVar11 * 8;
  do {
    lVar14 = lVar14 + -8;
    uVar21 = (uint)uVar11;
    uVar11 = (ulong)(uVar21 - 1);
    if ((int)uVar21 < 1) {
      if (-1 < (int)uVar1) {
        return 0;
      }
      lVar9 = *plVar15;
      goto code_r0x002c06e8;
    }
    lVar9 = *plVar15;
  } while (*(long *)(lVar9 + lVar14) == 0);
  uVar12 = uVar21;
code_r0x002c06e8:
  uVar16 = *(ulong *)(lVar9 + (long)(int)(uVar12 - 1) * 8);
  uVar20 = uVar16 >> 0x20;
  uVar11 = uVar20;
  if (uVar20 == 0) {
    uVar11 = uVar16;
  }
  uVar22 = uVar11 >> 0x10;
  uVar17 = uVar22;
  if (uVar22 == 0) {
    uVar17 = uVar11;
  }
  uVar11 = uVar17 >> 8;
  if (uVar17 < 0x100) {
    uVar11 = uVar17;
  }
  uVar29 = uVar11 >> 4;
  if (uVar11 < 0x10) {
    uVar29 = uVar11;
  }
  uVar28 = uVar29 >> 2;
  if (uVar29 < 4) {
    uVar28 = uVar29;
  }
  uVar12 = (uint)(uVar16 != 0) | (uVar12 - 1) * 0x40 | (uint)(uVar20 != 0) << 5 |
           (uint)(uVar22 != 0) << 4 | (uint)(0xff < uVar17) << 3 | (uint)(0xf < uVar11) << 2 |
           (uint)(3 < uVar29) << 1;
  if (1 < uVar28) {
    uVar12 = uVar12 + 1;
  }
  return (ulong)(uVar12 + 7 >> 3);
}

