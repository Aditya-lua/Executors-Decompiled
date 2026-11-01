
/* WARNING: Removing unreachable block (ram,0x002acc6c) */

uint FUN_002ad26c(ulong param_1)

{
  undefined2 uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  ulong *puVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong uVar18;
  long *plVar19;
  ulong in_x9;
  ulong uVar20;
  ulong in_x10;
  ulong *puVar21;
  long lVar22;
  ulong uVar23;
  ulong uVar24;
  undefined8 *puVar25;
  ulong *unaff_x19;
  uint uVar26;
  ulong *unaff_x20;
  long lVar27;
  long unaff_x22;
  ulong *unaff_x24;
  ulong *unaff_x25;
  ulong *unaff_x26;
  ulong *unaff_x27;
  ulong *unaff_x28;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
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
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  ulong uVar48;
  undefined1 auVar47 [16];
  byte bVar49;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  undefined8 uVar50;
  byte bVar59;
  ulong uVar51;
  ulong uVar52;
  byte bVar60;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  undefined8 uVar61;
  byte bVar70;
  ulong uVar62;
  ulong uVar63;
  byte bVar71;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  undefined8 uVar72;
  byte bVar80;
  ulong uVar73;
  byte bVar81;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  undefined8 uVar82;
  byte bVar90;
  ulong uVar83;
  ulong uVar91;
  ulong uVar92;
  ulong uVar93;
  ulong uVar94;
  ulong uVar95;
  undefined1 auVar96 [16];
  ulong *in_stack_00000020;
  undefined4 uStack0000000000000028;
  ulong *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  uint uStack_14;
  
  uVar18 = uStack0000000000000040;
  puVar4 = (ulong *)(_uStack0000000000000028 >> 0x20);
code_r0x002ad26c:
  lVar22 = (long)(int)(uint)param_1;
  uVar16 = lVar22 - 1;
  if (uVar16 != 0) {
    if (((uint)param_1 < 9) ||
       ((in_x9 < in_x10 + lVar22 * 8 && (in_x10 < (in_x9 + lVar22 * 8) - 8)))) {
      uVar24 = 0;
    }
    else {
      uVar24 = uVar16 & 0xfffffffffffffff8;
      puVar13 = (ulong *)(in_x10 + 0x20);
      puVar25 = (undefined8 *)(in_x9 + 0x20);
      uVar9 = uVar24;
      do {
        uVar20 = puVar13[-4];
        auVar96 = *(undefined1 (*) [16])(puVar13 + -2);
        uVar63 = puVar13[1];
        uVar52 = *puVar13;
        uVar51 = puVar13[3];
        uVar48 = puVar13[2];
        uVar62 = puVar13[-3];
        uVar83 = puVar13[2];
        uVar73 = puVar13[1];
        uVar92 = puVar13[4];
        uVar91 = puVar13[3];
        uVar23 = auVar96._8_8_ >> 1;
        auVar46._0_8_ =
             CONCAT17((byte)((puVar13[-1] << 0x3f) >> 0x38) | auVar96[7] >> 1,
                      (int7)(auVar96._0_8_ >> 1));
        auVar46[8] = (undefined1)uVar23;
        auVar46[9] = (undefined1)(uVar23 >> 8);
        auVar46[10] = (undefined1)((auVar96._9_7_ >> 1) >> 8);
        auVar46[0xb] = (undefined1)((auVar96._10_6_ >> 1) >> 8);
        auVar46[0xc] = (undefined1)((auVar96._11_5_ >> 1) >> 8);
        auVar46[0xd] = (undefined1)((auVar96._12_4_ >> 1) >> 8);
        auVar46[0xe] = (undefined1)((uint3)(auVar96._13_3_ >> 1) >> 8);
        auVar46[0xf] = (byte)((*puVar13 << 0x3f) >> 0x38) | auVar96[0xf] >> 1;
        puVar25[-3] = CONCAT17((byte)((puVar13[-2] << 0x3f) >> 0x38) | (byte)(puVar13[-3] >> 0x39),
                               (int7)(puVar13[-3] >> 1));
        puVar25[-4] = CONCAT17((byte)((uVar62 << 0x3f) >> 0x38) | (byte)(uVar20 >> 0x39),
                               (int7)(uVar20 >> 1));
        puVar25[-1] = auVar46._8_8_;
        puVar25[-2] = auVar46._0_8_;
        puVar25[1] = CONCAT17((byte)((uVar83 << 0x3f) >> 0x38) | (byte)(uVar63 >> 0x39),
                              CONCAT16((char)(uVar63 >> 0x31),
                                       CONCAT15((char)(uVar63 >> 0x29),
                                                CONCAT14((char)(uVar63 >> 0x21),
                                                         CONCAT13((char)(uVar63 >> 0x19),
                                                                  CONCAT12((char)(uVar63 >> 0x11),
                                                                           CONCAT11((char)(uVar63 >>
                                                                                          9),(char)(
                                                  uVar63 >> 1))))))));
        *puVar25 = CONCAT17((byte)((uVar73 << 0x3f) >> 0x38) | (byte)(uVar52 >> 0x39),
                            CONCAT16((char)(uVar52 >> 0x31),
                                     CONCAT15((char)(uVar52 >> 0x29),
                                              CONCAT14((char)(uVar52 >> 0x21),
                                                       CONCAT13((char)(uVar52 >> 0x19),
                                                                CONCAT12((char)(uVar52 >> 0x11),
                                                                         CONCAT11((char)(uVar52 >> 9
                                                                                        ),(char)(
                                                  uVar52 >> 1))))))));
        puVar25[3] = CONCAT17((byte)((uVar92 << 0x3f) >> 0x38) | (byte)(uVar51 >> 0x39),
                              CONCAT16((char)(uVar51 >> 0x31),
                                       CONCAT15((char)(uVar51 >> 0x29),
                                                CONCAT14((char)(uVar51 >> 0x21),
                                                         CONCAT13((char)(uVar51 >> 0x19),
                                                                  CONCAT12((char)(uVar51 >> 0x11),
                                                                           CONCAT11((char)(uVar51 >>
                                                                                          9),(char)(
                                                  uVar51 >> 1))))))));
        puVar25[2] = CONCAT17((byte)((uVar91 << 0x3f) >> 0x38) | (byte)(uVar48 >> 0x39),
                              CONCAT16((char)(uVar48 >> 0x31),
                                       CONCAT15((char)(uVar48 >> 0x29),
                                                CONCAT14((char)(uVar48 >> 0x21),
                                                         CONCAT13((char)(uVar48 >> 0x19),
                                                                  CONCAT12((char)(uVar48 >> 0x11),
                                                                           CONCAT11((char)(uVar48 >>
                                                                                          9),(char)(
                                                  uVar48 >> 1))))))));
        puVar13 = puVar13 + 8;
        uVar9 = uVar9 - 8;
        puVar25 = puVar25 + 8;
      } while (uVar9 != 0);
      if (uVar16 == uVar24) goto LAB_002ad2d4;
    }
    lVar22 = ~uVar24 + lVar22;
    puVar14 = (ulong *)(in_x9 + uVar24 * 8);
    puVar13 = (ulong *)(in_x10 + uVar24 * 8);
    do {
      *puVar14 = *puVar13 >> 1 | puVar13[1] << 0x3f;
      lVar22 = lVar22 + -1;
      puVar14 = puVar14 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar22 != 0);
  }
LAB_002ad2d4:
  *(ulong *)(in_x9 + uVar16 * 8) = *(ulong *)(in_x10 + uVar16 * 8) >> 1;
code_r0x002ad2e4:
  *(int *)(unaff_x26 + 2) = (int)unaff_x24[2];
  uVar26 = (uint)param_1;
  plVar19 = (long *)(in_x9 + param_1 * 8);
  do {
    plVar19 = plVar19 + -1;
    iVar8 = (int)param_1;
    param_1 = (ulong)(iVar8 - 1);
    if (iVar8 < 1) {
      *(uint *)(unaff_x26 + 1) = uVar26 & (int)uVar26 >> 0x1f;
      if (-1 < (int)uVar26) {
        *(undefined4 *)(unaff_x26 + 2) = 0;
      }
      goto LAB_002ad324;
    }
  } while (*plVar19 == 0);
  *(int *)(unaff_x26 + 1) = iVar8;
LAB_002ad324:
  iVar8 = 0;
  while( true ) {
    puVar13 = (ulong *)((long)&MACH_HEADER.magic + 1);
    puVar15 = (ulong *)0x0;
    puVar14 = unaff_x19;
    iVar7 = func_0x002ae678(&uStack0000000000000048);
    iVar6 = (int)uStack0000000000000048;
    if (iVar7 == 0) {
      iVar6 = -1;
    }
    if (iVar6 == -1) goto LAB_002ad540;
    if (iVar6 == 0) break;
    puVar13 = (ulong *)((long)&MACH_HEADER.magic + 1);
    puVar15 = (ulong *)0x0;
    puVar14 = unaff_x19;
    iVar7 = func_0x002ae678((long)&uStack0000000000000048 + 4);
    iVar6 = uStack0000000000000048._4_4_;
    if (iVar7 == 0) {
      iVar6 = -1;
    }
    if (iVar6 == -1) goto LAB_002ad540;
    if (iVar6 == 0) break;
    if (unaff_x20 != (ulong *)0x0) {
      if ((char)*unaff_x20 == '\x01') {
        puVar13 = unaff_x20;
        iVar6 = (*(code *)unaff_x20[2])(1,iVar8);
        if (iVar6 == 0) goto LAB_002ad540;
      }
      else {
        if ((char)*unaff_x20 != '\x02') goto LAB_002ad540;
        puVar13 = unaff_x20;
        (*(code *)unaff_x20[2])(1,iVar8);
      }
    }
    iVar8 = iVar8 + 1;
    if ((int)unaff_x28 == iVar8) {
      uVar26 = 1;
      goto LAB_002ad544;
    }
  }
  do {
    if (unaff_x25 == (ulong *)0x0) {
      do {
        puVar13 = (ulong *)((long)&MACH_HEADER.magic + 1);
        puVar14 = (ulong *)((long)&MACH_HEADER.magic + 1);
        iVar8 = func_0x002afac4();
        if (iVar8 == 0) goto LAB_002ad540;
        uVar16 = 0x400;
        if ((int)unaff_x24[1] < 0x11) {
          uVar16 = 0x200;
        }
        iVar8 = func_0x002a18a8();
        if (iVar8 == 0) {
          uVar24 = 3;
          uVar26 = (uint)unaff_x24[1];
        }
        else {
          uVar9 = 2;
          do {
            uVar20 = uVar9;
            if (uVar16 == uVar20) goto code_r0x002ad1e8;
            uVar24 = (ulong)*(ushort *)(unaff_x22 + uVar20 * 2);
            iVar8 = func_0x002a18a8();
            uVar9 = uVar20 + 1;
          } while (iVar8 != 0);
          if (uVar16 <= uVar20) break;
          uVar26 = (uint)unaff_x24[1];
        }
        if (uVar26 != 0) {
          puVar10 = (ulong *)*unaff_x24;
          uVar24 = *puVar10 ^ uVar24;
          if (1 < (int)uVar26) {
            if (uVar26 < 9) {
              uVar9 = 1;
            }
            else {
              uVar20 = (ulong)uVar26 - 1;
              uVar23 = uVar20 & 0xfffffffffffffff8;
              uVar9 = uVar23 | 1;
              bVar28 = 0;
              bVar29 = 0;
              bVar30 = 0;
              bVar31 = 0;
              bVar32 = 0;
              bVar33 = 0;
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
              auVar96._8_8_ = 0;
              auVar96._0_8_ = uVar24;
              uVar50 = 0;
              uVar61 = 0;
              uVar72 = 0;
              uVar82 = 0;
              puVar11 = puVar10 + 5;
              uVar16 = uVar23;
              do {
                uVar52 = puVar11[-3];
                uVar24 = puVar11[-4];
                uVar48 = puVar11[-1];
                uVar63 = puVar11[-2];
                uVar62 = puVar11[1];
                uVar51 = *puVar11;
                uVar83 = puVar11[3];
                uVar73 = puVar11[2];
                auVar44[0] = (byte)uVar24 | auVar96[0];
                auVar44[1] = (byte)(uVar24 >> 8) | auVar96[1];
                auVar44[2] = (byte)(uVar24 >> 0x10) | auVar96[2];
                auVar44[3] = (byte)(uVar24 >> 0x18) | auVar96[3];
                auVar44[4] = (byte)(uVar24 >> 0x20) | auVar96[4];
                auVar44[5] = (byte)(uVar24 >> 0x28) | auVar96[5];
                auVar44[6] = (byte)(uVar24 >> 0x30) | auVar96[6];
                auVar44[7] = (byte)(uVar24 >> 0x38) | auVar96[7];
                auVar44[8] = (byte)uVar52 | auVar96[8];
                auVar44[9] = (byte)(uVar52 >> 8) | auVar96[9];
                auVar44[10] = (byte)(uVar52 >> 0x10) | auVar96[10];
                auVar44[0xb] = (byte)(uVar52 >> 0x18) | auVar96[0xb];
                auVar44[0xc] = (byte)(uVar52 >> 0x20) | auVar96[0xc];
                auVar44[0xd] = (byte)(uVar52 >> 0x28) | auVar96[0xd];
                auVar44[0xe] = (byte)(uVar52 >> 0x30) | auVar96[0xe];
                auVar44[0xf] = (byte)(uVar52 >> 0x38) | auVar96[0xf];
                bVar28 = (byte)uVar63 | bVar28;
                bVar29 = (byte)(uVar63 >> 8) | bVar29;
                bVar30 = (byte)(uVar63 >> 0x10) | bVar30;
                bVar31 = (byte)(uVar63 >> 0x18) | bVar31;
                bVar32 = (byte)(uVar63 >> 0x20) | bVar32;
                bVar33 = (byte)(uVar63 >> 0x28) | bVar33;
                bVar34 = (byte)(uVar63 >> 0x30) | bVar34;
                bVar35 = (byte)(uVar63 >> 0x38) | bVar35;
                bVar36 = (byte)uVar48 | bVar36;
                bVar37 = (byte)(uVar48 >> 8) | bVar37;
                bVar38 = (byte)(uVar48 >> 0x10) | bVar38;
                bVar39 = (byte)(uVar48 >> 0x18) | bVar39;
                bVar40 = (byte)(uVar48 >> 0x20) | bVar40;
                bVar41 = (byte)(uVar48 >> 0x28) | bVar41;
                bVar42 = (byte)(uVar48 >> 0x30) | bVar42;
                bVar43 = (byte)(uVar48 >> 0x38) | bVar43;
                bVar49 = (byte)uVar51 | (byte)uVar50;
                bVar53 = (byte)(uVar51 >> 8) | (byte)((ulong)uVar50 >> 8);
                bVar54 = (byte)(uVar51 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
                bVar55 = (byte)(uVar51 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
                bVar56 = (byte)(uVar51 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
                bVar57 = (byte)(uVar51 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
                bVar58 = (byte)(uVar51 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
                bVar59 = (byte)(uVar51 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
                uVar50 = CONCAT17(bVar59,CONCAT16(bVar58,CONCAT15(bVar57,CONCAT14(bVar56,CONCAT13(
                                                  bVar55,CONCAT12(bVar54,CONCAT11(bVar53,bVar49)))))
                                                 ));
                bVar60 = (byte)uVar62 | (byte)uVar61;
                bVar64 = (byte)(uVar62 >> 8) | (byte)((ulong)uVar61 >> 8);
                bVar65 = (byte)(uVar62 >> 0x10) | (byte)((ulong)uVar61 >> 0x10);
                bVar66 = (byte)(uVar62 >> 0x18) | (byte)((ulong)uVar61 >> 0x18);
                bVar67 = (byte)(uVar62 >> 0x20) | (byte)((ulong)uVar61 >> 0x20);
                bVar68 = (byte)(uVar62 >> 0x28) | (byte)((ulong)uVar61 >> 0x28);
                bVar69 = (byte)(uVar62 >> 0x30) | (byte)((ulong)uVar61 >> 0x30);
                bVar70 = (byte)(uVar62 >> 0x38) | (byte)((ulong)uVar61 >> 0x38);
                uVar61 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(
                                                  bVar66,CONCAT12(bVar65,CONCAT11(bVar64,bVar60)))))
                                                 ));
                bVar71 = (byte)uVar73 | (byte)uVar72;
                bVar74 = (byte)(uVar73 >> 8) | (byte)((ulong)uVar72 >> 8);
                bVar75 = (byte)(uVar73 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
                bVar76 = (byte)(uVar73 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
                bVar77 = (byte)(uVar73 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
                bVar78 = (byte)(uVar73 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
                bVar79 = (byte)(uVar73 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
                bVar80 = (byte)(uVar73 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
                uVar72 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(
                                                  bVar76,CONCAT12(bVar75,CONCAT11(bVar74,bVar71)))))
                                                 ));
                bVar81 = (byte)uVar83 | (byte)uVar82;
                bVar84 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar82 >> 8);
                bVar85 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
                bVar86 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
                bVar87 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
                bVar88 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
                bVar89 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
                bVar90 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
                uVar82 = CONCAT17(bVar90,CONCAT16(bVar89,CONCAT15(bVar88,CONCAT14(bVar87,CONCAT13(
                                                  bVar86,CONCAT12(bVar85,CONCAT11(bVar84,bVar81)))))
                                                 ));
                uVar16 = uVar16 - 8;
                puVar11 = puVar11 + 8;
                auVar96 = auVar44;
              } while (uVar16 != 0);
              bVar71 = bVar71 | bVar49 | bVar28 | auVar44[0];
              bVar74 = bVar74 | bVar53 | bVar29 | auVar44[1];
              bVar75 = bVar75 | bVar54 | bVar30 | auVar44[2];
              bVar76 = bVar76 | bVar55 | bVar31 | auVar44[3];
              bVar77 = bVar77 | bVar56 | bVar32 | auVar44[4];
              bVar78 = bVar78 | bVar57 | bVar33 | auVar44[5];
              bVar79 = bVar79 | bVar58 | bVar34 | auVar44[6];
              bVar80 = bVar80 | bVar59 | bVar35 | auVar44[7];
              bVar81 = bVar81 | bVar60 | bVar36 | auVar44[8];
              bVar84 = bVar84 | bVar64 | bVar37 | auVar44[9];
              bVar85 = bVar85 | bVar65 | bVar38 | auVar44[10];
              bVar86 = bVar86 | bVar66 | bVar39 | auVar44[0xb];
              bVar87 = bVar87 | bVar67 | bVar40 | auVar44[0xc];
              bVar88 = bVar88 | bVar68 | bVar41 | auVar44[0xd];
              bVar89 = bVar89 | bVar69 | bVar42 | auVar44[0xe];
              bVar90 = bVar90 | bVar70 | bVar43 | auVar44[0xf];
              auVar2[1] = bVar74;
              auVar2[0] = bVar71;
              auVar2[2] = bVar75;
              auVar2[3] = bVar76;
              auVar2[4] = bVar77;
              auVar2[5] = bVar78;
              auVar2[6] = bVar79;
              auVar2[7] = bVar80;
              auVar2[8] = bVar81;
              auVar2[9] = bVar84;
              auVar2[10] = bVar85;
              auVar2[0xb] = bVar86;
              auVar2[0xc] = bVar87;
              auVar2[0xd] = bVar88;
              auVar2[0xe] = bVar89;
              auVar2[0xf] = bVar90;
              auVar3[1] = bVar74;
              auVar3[0] = bVar71;
              auVar3[2] = bVar75;
              auVar3[3] = bVar76;
              auVar3[4] = bVar77;
              auVar3[5] = bVar78;
              auVar3[6] = bVar79;
              auVar3[7] = bVar80;
              auVar3[8] = bVar81;
              auVar3[9] = bVar84;
              auVar3[10] = bVar85;
              auVar3[0xb] = bVar86;
              auVar3[0xc] = bVar87;
              auVar3[0xd] = bVar88;
              auVar3[0xe] = bVar89;
              auVar3[0xf] = bVar90;
              auVar96 = NEON_ext(auVar2,auVar3,8,1);
              uVar24 = CONCAT17(bVar80 | auVar96[7],
                                CONCAT16(bVar79 | auVar96[6],
                                         CONCAT15(bVar78 | auVar96[5],
                                                  CONCAT14(bVar77 | auVar96[4],
                                                           CONCAT13(bVar76 | auVar96[3],
                                                                    CONCAT12(bVar75 | auVar96[2],
                                                                             CONCAT11(bVar74 | 
                                                  auVar96[1],bVar71 | auVar96[0])))))));
              if (uVar20 == uVar23) goto code_r0x002acc60;
            }
            lVar22 = uVar26 - uVar9;
            puVar10 = puVar10 + uVar9;
            do {
              uVar24 = *puVar10 | uVar24;
              lVar22 = lVar22 + -1;
              puVar10 = puVar10 + 1;
            } while (lVar22 != 0);
          }
        }
code_r0x002acc60:
      } while ((uVar24 != 0) || ((int)unaff_x24[2] != 0));
    }
    else {
      if ((int)uStack0000000000000040 == 0) {
        if ((char)unaff_x19[5] == '\0') {
          uVar16 = unaff_x19[4];
          uVar24 = unaff_x19[2];
          if (uVar24 == unaff_x19[3]) {
            uVar20 = 0x20;
            if (uVar24 != 0) {
              uVar20 = uVar24 * 3 >> 1;
            }
            if ((uVar24 < uVar20 && uVar20 >> 0x3d == 0) &&
               (uVar9 = func_0x0036e48c(*unaff_x27,uVar20 << 3), uVar9 != 0)) {
              unaff_x19[1] = uVar9;
              unaff_x19[3] = uVar20;
              uVar24 = unaff_x19[2];
              unaff_x25 = in_stack_00000030;
              goto code_r0x002acce4;
            }
            *(undefined2 *)(unaff_x19 + 5) = 0x101;
            puVar10 = (ulong *)func_0x0029e340();
            puVar11 = puVar14;
            unaff_x25 = in_stack_00000030;
          }
          else {
            uVar9 = *unaff_x27;
code_r0x002acce4:
            *(ulong *)(uVar9 + uVar24 * 8) = uVar16;
            unaff_x19[2] = unaff_x19[2] + 1;
            puVar10 = (ulong *)func_0x0029e340();
            puVar11 = puVar14;
          }
          if (puVar10 != (ulong *)0x0) goto code_r0x002acabc;
code_r0x002acf54:
          bVar5 = true;
          puVar14 = puVar11;
        }
        else {
          puVar10 = (ulong *)func_0x0029e340();
          puVar11 = puVar14;
          if (puVar10 == (ulong *)0x0) goto code_r0x002acf54;
code_r0x002acabc:
          puVar11 = unaff_x25;
          bVar5 = true;
          puVar13 = (ulong *)0x0;
          puVar14 = (ulong *)((long)&MACH_HEADER.magic + 1);
          iVar8 = func_0x002afac4();
          if (iVar8 != 0) {
            puVar13 = unaff_x24;
            puVar15 = unaff_x19;
            iVar8 = func_0x0029e4fc(0,puVar10);
            if ((iVar8 == 0) || (iVar8 = func_0x0029b6ec(), puVar13 = puVar10, iVar8 == 0))
            goto code_r0x002acf54;
            puVar13 = in_stack_00000020;
            if (in_stack_00000020 == (ulong *)0x0) {
              bVar5 = true;
              iVar8 = func_0x0029b0e4();
              puVar14 = puVar11;
              if (iVar8 == 0) goto code_r0x002acf58;
            }
            else {
              iVar8 = func_0x0029ac7c();
              puVar14 = puVar11;
              if (iVar8 == 0) goto code_r0x002acf54;
            }
            lVar22 = 0x400;
            if ((int)unaff_x24[1] < 0x11) {
              lVar22 = 0x200;
            }
            lVar27 = 1;
            do {
              while( true ) {
                uVar26 = func_0x002a18a8();
                bVar5 = uVar26 < 2;
                if (1 < uVar26) break;
                puVar13 = in_stack_00000030;
                iVar8 = func_0x0029ac7c();
                lVar27 = 1;
                if (iVar8 == 0) goto code_r0x002acf58;
              }
              lVar27 = lVar27 + 1;
            } while (lVar27 != lVar22);
          }
        }
code_r0x002acf58:
        if ((char)unaff_x19[5] == '\0') {
          uVar16 = unaff_x19[2];
          if (uVar16 == 0) goto code_r0x002ad644;
code_r0x002ad1d0:
          unaff_x19[2] = uVar16 - 1;
          unaff_x19[4] = *(ulong *)(unaff_x19[1] + (uVar16 - 1) * 8);
        }
      }
      else {
        if ((char)unaff_x19[5] == '\0') {
          uVar16 = unaff_x19[4];
          uVar24 = unaff_x19[2];
          if (uVar24 == unaff_x19[3]) {
            uVar20 = 0x20;
            if (uVar24 != 0) {
              uVar20 = uVar24 * 3 >> 1;
            }
            if ((uVar20 <= uVar24 || uVar20 >> 0x3d != 0) ||
               (uVar9 = func_0x0036e48c(*unaff_x27,uVar20 << 3), uVar9 == 0)) {
              *(undefined2 *)(unaff_x19 + 5) = 0x101;
              unaff_x25 = in_stack_00000030;
              goto code_r0x002acd10;
            }
            unaff_x19[1] = uVar9;
            unaff_x19[3] = uVar20;
            uVar24 = unaff_x19[2];
            unaff_x25 = in_stack_00000030;
          }
          else {
            uVar9 = *unaff_x27;
          }
          *(ulong *)(uVar9 + uVar24 * 8) = uVar16;
          unaff_x19[2] = unaff_x19[2] + 1;
        }
code_r0x002acd10:
        puVar10 = (ulong *)func_0x0029e340();
        puVar11 = (ulong *)func_0x0029e340();
        puVar12 = (ulong *)func_0x0029e340();
        if ((puVar12 == (ulong *)0x0) ||
           (iVar8 = func_0x0029afb8(puVar12,(long)(int)unaff_x25[1]), iVar8 == 0))
        goto code_r0x002ad1bc;
        uVar24 = *puVar12;
        uVar26 = (uint)unaff_x25[1];
        uVar16 = (ulong)uVar26;
        if (uVar26 != 0) {
          uVar20 = *unaff_x25;
          lVar22 = (long)(int)uVar26;
          uVar9 = lVar22 - 1;
          if (uVar9 != 0) {
            if ((uVar26 < 9) ||
               ((uVar24 < uVar20 + lVar22 * 8 && (uVar20 < (uVar24 + lVar22 * 8) - 8)))) {
              uVar23 = 0;
            }
            else {
              uVar23 = uVar9 & 0xfffffffffffffff8;
              puVar13 = (ulong *)(uVar20 + 0x20);
              puVar25 = (undefined8 *)(uVar24 + 0x20);
              uVar52 = uVar23;
              do {
                uVar63 = puVar13[-4];
                auVar96 = *(undefined1 (*) [16])(puVar13 + -2);
                uVar62 = puVar13[1];
                uVar51 = *puVar13;
                uVar83 = puVar13[3];
                uVar73 = puVar13[2];
                uVar91 = puVar13[-3];
                uVar93 = puVar13[2];
                uVar92 = puVar13[1];
                uVar95 = puVar13[4];
                uVar94 = puVar13[3];
                uVar48 = auVar96._8_8_ >> 1;
                auVar45._0_8_ =
                     CONCAT17((byte)((puVar13[-1] << 0x3f) >> 0x38) | auVar96[7] >> 1,
                              (int7)(auVar96._0_8_ >> 1));
                auVar45[8] = (undefined1)uVar48;
                auVar45[9] = (undefined1)(uVar48 >> 8);
                auVar45[10] = (undefined1)((auVar96._9_7_ >> 1) >> 8);
                auVar45[0xb] = (undefined1)((auVar96._10_6_ >> 1) >> 8);
                auVar45[0xc] = (undefined1)((auVar96._11_5_ >> 1) >> 8);
                auVar45[0xd] = (undefined1)((auVar96._12_4_ >> 1) >> 8);
                auVar45[0xe] = (undefined1)((uint3)(auVar96._13_3_ >> 1) >> 8);
                auVar45[0xf] = (byte)((*puVar13 << 0x3f) >> 0x38) | auVar96[0xf] >> 1;
                puVar25[-3] = CONCAT17((byte)((puVar13[-2] << 0x3f) >> 0x38) |
                                       (byte)(puVar13[-3] >> 0x39),(int7)(puVar13[-3] >> 1));
                puVar25[-4] = CONCAT17((byte)((uVar91 << 0x3f) >> 0x38) | (byte)(uVar63 >> 0x39),
                                       (int7)(uVar63 >> 1));
                puVar25[-1] = auVar45._8_8_;
                puVar25[-2] = auVar45._0_8_;
                puVar25[1] = CONCAT17((byte)((uVar93 << 0x3f) >> 0x38) | (byte)(uVar62 >> 0x39),
                                      CONCAT16((char)(uVar62 >> 0x31),
                                               CONCAT15((char)(uVar62 >> 0x29),
                                                        CONCAT14((char)(uVar62 >> 0x21),
                                                                 CONCAT13((char)(uVar62 >> 0x19),
                                                                          CONCAT12((char)(uVar62 >>
                                                                                         0x11),
                                                                                   CONCAT11((char)(
                                                  uVar62 >> 9),(char)(uVar62 >> 1))))))));
                *puVar25 = CONCAT17((byte)((uVar92 << 0x3f) >> 0x38) | (byte)(uVar51 >> 0x39),
                                    CONCAT16((char)(uVar51 >> 0x31),
                                             CONCAT15((char)(uVar51 >> 0x29),
                                                      CONCAT14((char)(uVar51 >> 0x21),
                                                               CONCAT13((char)(uVar51 >> 0x19),
                                                                        CONCAT12((char)(uVar51 >>
                                                                                       0x11),
                                                                                 CONCAT11((char)(
                                                  uVar51 >> 9),(char)(uVar51 >> 1))))))));
                puVar25[3] = CONCAT17((byte)((uVar95 << 0x3f) >> 0x38) | (byte)(uVar83 >> 0x39),
                                      CONCAT16((char)(uVar83 >> 0x31),
                                               CONCAT15((char)(uVar83 >> 0x29),
                                                        CONCAT14((char)(uVar83 >> 0x21),
                                                                 CONCAT13((char)(uVar83 >> 0x19),
                                                                          CONCAT12((char)(uVar83 >>
                                                                                         0x11),
                                                                                   CONCAT11((char)(
                                                  uVar83 >> 9),(char)(uVar83 >> 1))))))));
                puVar25[2] = CONCAT17((byte)((uVar94 << 0x3f) >> 0x38) | (byte)(uVar73 >> 0x39),
                                      CONCAT16((char)(uVar73 >> 0x31),
                                               CONCAT15((char)(uVar73 >> 0x29),
                                                        CONCAT14((char)(uVar73 >> 0x21),
                                                                 CONCAT13((char)(uVar73 >> 0x19),
                                                                          CONCAT12((char)(uVar73 >>
                                                                                         0x11),
                                                                                   CONCAT11((char)(
                                                  uVar73 >> 9),(char)(uVar73 >> 1))))))));
                puVar13 = puVar13 + 8;
                uVar52 = uVar52 - 8;
                puVar25 = puVar25 + 8;
              } while (uVar52 != 0);
              if (uVar9 == uVar23) goto code_r0x002acdbc;
            }
            lVar22 = ~uVar23 + lVar22;
            puVar14 = (ulong *)(uVar24 + uVar23 * 8);
            puVar13 = (ulong *)(uVar20 + uVar23 * 8);
            do {
              *puVar14 = *puVar13 >> 1 | puVar13[1] << 0x3f;
              lVar22 = lVar22 + -1;
              puVar14 = puVar14 + 1;
              puVar13 = puVar13 + 1;
            } while (lVar22 != 0);
          }
code_r0x002acdbc:
          *(ulong *)(uVar24 + uVar9 * 8) = *(ulong *)(uVar20 + uVar9 * 8) >> 1;
        }
        *(int *)(puVar12 + 2) = (int)unaff_x25[2];
        plVar19 = (long *)(uVar24 + uVar16 * 8);
        do {
          plVar19 = plVar19 + -1;
          iVar8 = (int)uVar16;
          uVar16 = (ulong)(iVar8 - 1);
          if (iVar8 < 1) {
            *(uint *)(puVar12 + 1) = uVar26 & (int)uVar26 >> 0x1f;
            if (-1 < (int)uVar26) {
              *(undefined4 *)(puVar12 + 2) = 0;
            }
            goto code_r0x002ace0c;
          }
        } while (*plVar19 == 0);
        *(int *)(puVar12 + 1) = iVar8;
code_r0x002ace0c:
        bVar5 = true;
        puVar13 = (ulong *)0x0;
        puVar14 = (ulong *)((long)&MACH_HEADER.magic + 1);
        iVar8 = func_0x002afac4(puVar11,uStack0000000000000028,0,1);
        if (iVar8 == 0) {
code_r0x002ad1c0:
          if ((char)unaff_x19[5] != '\0') goto code_r0x002ad1e4;
code_r0x002ad1c8:
          uVar16 = unaff_x19[2];
          if (uVar16 != 0) goto code_r0x002ad1d0;
          goto code_r0x002ad648;
        }
        puVar13 = puVar11;
        puVar14 = puVar12;
        puVar15 = unaff_x19;
        iVar8 = func_0x0029e4fc(0,puVar10,puVar11,puVar12);
        if ((iVar8 == 0) ||
           (puVar13 = puVar10, iVar8 = func_0x0029b6ec(puVar11,puVar11,puVar10), iVar8 == 0)) {
code_r0x002ad1bc:
          bVar5 = true;
          goto code_r0x002ad1c0;
        }
        if (in_stack_00000020 != (ulong *)0x0) {
          iVar8 = func_0x0029afb8(puVar10,(long)(int)in_stack_00000020[1]);
          if (iVar8 != 0) {
            uVar24 = *puVar10;
            uVar26 = (uint)in_stack_00000020[1];
            uVar16 = (ulong)uVar26;
            if (uVar26 != 0) {
              uVar20 = *in_stack_00000020;
              lVar22 = (long)(int)uVar26;
              uVar9 = lVar22 - 1;
              if (uVar9 != 0) {
                if ((uVar26 < 9) ||
                   ((uVar24 < uVar20 + lVar22 * 8 && (uVar20 < (uVar24 + lVar22 * 8) - 8)))) {
                  uVar23 = 0;
                }
                else {
                  uVar23 = uVar9 & 0xfffffffffffffff8;
                  puVar13 = (ulong *)(uVar20 + 0x20);
                  puVar25 = (undefined8 *)(uVar24 + 0x20);
                  uVar52 = uVar23;
                  do {
                    uVar63 = puVar13[-4];
                    auVar96 = *(undefined1 (*) [16])(puVar13 + -2);
                    uVar62 = puVar13[1];
                    uVar51 = *puVar13;
                    uVar83 = puVar13[3];
                    uVar73 = puVar13[2];
                    uVar91 = puVar13[-3];
                    uVar93 = puVar13[2];
                    uVar92 = puVar13[1];
                    uVar95 = puVar13[4];
                    uVar94 = puVar13[3];
                    uVar48 = auVar96._8_8_ >> 1;
                    auVar47._0_8_ =
                         CONCAT17((byte)((puVar13[-1] << 0x3f) >> 0x38) | auVar96[7] >> 1,
                                  (int7)(auVar96._0_8_ >> 1));
                    auVar47[8] = (undefined1)uVar48;
                    auVar47[9] = (undefined1)(uVar48 >> 8);
                    auVar47[10] = (undefined1)((auVar96._9_7_ >> 1) >> 8);
                    auVar47[0xb] = (undefined1)((auVar96._10_6_ >> 1) >> 8);
                    auVar47[0xc] = (undefined1)((auVar96._11_5_ >> 1) >> 8);
                    auVar47[0xd] = (undefined1)((auVar96._12_4_ >> 1) >> 8);
                    auVar47[0xe] = (undefined1)((uint3)(auVar96._13_3_ >> 1) >> 8);
                    auVar47[0xf] = (byte)((*puVar13 << 0x3f) >> 0x38) | auVar96[0xf] >> 1;
                    puVar25[-3] = CONCAT17((byte)((puVar13[-2] << 0x3f) >> 0x38) |
                                           (byte)(puVar13[-3] >> 0x39),(int7)(puVar13[-3] >> 1));
                    puVar25[-4] = CONCAT17((byte)((uVar91 << 0x3f) >> 0x38) | (byte)(uVar63 >> 0x39)
                                           ,(int7)(uVar63 >> 1));
                    puVar25[-1] = auVar47._8_8_;
                    puVar25[-2] = auVar47._0_8_;
                    puVar25[1] = CONCAT17((byte)((uVar93 << 0x3f) >> 0x38) | (byte)(uVar62 >> 0x39),
                                          CONCAT16((char)(uVar62 >> 0x31),
                                                   CONCAT15((char)(uVar62 >> 0x29),
                                                            CONCAT14((char)(uVar62 >> 0x21),
                                                                     CONCAT13((char)(uVar62 >> 0x19)
                                                                              ,CONCAT12((char)(
                                                  uVar62 >> 0x11),
                                                  CONCAT11((char)(uVar62 >> 9),(char)(uVar62 >> 1)))
                                                  )))));
                    *puVar25 = CONCAT17((byte)((uVar92 << 0x3f) >> 0x38) | (byte)(uVar51 >> 0x39),
                                        CONCAT16((char)(uVar51 >> 0x31),
                                                 CONCAT15((char)(uVar51 >> 0x29),
                                                          CONCAT14((char)(uVar51 >> 0x21),
                                                                   CONCAT13((char)(uVar51 >> 0x19),
                                                                            CONCAT12((char)(uVar51 
                                                  >> 0x11),CONCAT11((char)(uVar51 >> 9),
                                                                    (char)(uVar51 >> 1))))))));
                    puVar25[3] = CONCAT17((byte)((uVar95 << 0x3f) >> 0x38) | (byte)(uVar83 >> 0x39),
                                          CONCAT16((char)(uVar83 >> 0x31),
                                                   CONCAT15((char)(uVar83 >> 0x29),
                                                            CONCAT14((char)(uVar83 >> 0x21),
                                                                     CONCAT13((char)(uVar83 >> 0x19)
                                                                              ,CONCAT12((char)(
                                                  uVar83 >> 0x11),
                                                  CONCAT11((char)(uVar83 >> 9),(char)(uVar83 >> 1)))
                                                  )))));
                    puVar25[2] = CONCAT17((byte)((uVar94 << 0x3f) >> 0x38) | (byte)(uVar73 >> 0x39),
                                          CONCAT16((char)(uVar73 >> 0x31),
                                                   CONCAT15((char)(uVar73 >> 0x29),
                                                            CONCAT14((char)(uVar73 >> 0x21),
                                                                     CONCAT13((char)(uVar73 >> 0x19)
                                                                              ,CONCAT12((char)(
                                                  uVar73 >> 0x11),
                                                  CONCAT11((char)(uVar73 >> 9),(char)(uVar73 >> 1)))
                                                  )))));
                    puVar13 = puVar13 + 8;
                    uVar52 = uVar52 - 8;
                    puVar25 = puVar25 + 8;
                  } while (uVar52 != 0);
                  if (uVar9 == uVar23) goto code_r0x002acef0;
                }
                lVar22 = ~uVar23 + lVar22;
                puVar21 = (ulong *)(uVar24 + uVar23 * 8);
                puVar13 = (ulong *)(uVar20 + uVar23 * 8);
                do {
                  *puVar21 = *puVar13 >> 1 | puVar13[1] << 0x3f;
                  lVar22 = lVar22 + -1;
                  puVar21 = puVar21 + 1;
                  puVar13 = puVar13 + 1;
                } while (lVar22 != 0);
              }
code_r0x002acef0:
              *(ulong *)(uVar24 + uVar9 * 8) = *(ulong *)(uVar20 + uVar9 * 8) >> 1;
            }
            *(int *)(puVar10 + 2) = (int)in_stack_00000020[2];
            plVar19 = (long *)(uVar24 + uVar16 * 8);
            do {
              plVar19 = plVar19 + -1;
              iVar8 = (int)uVar16;
              uVar16 = (ulong)(iVar8 - 1);
              if (iVar8 < 1) {
                *(uint *)(puVar10 + 1) = uVar26 & (int)uVar26 >> 0x1f;
                if (-1 < (int)uVar26) {
                  *(undefined4 *)(puVar10 + 2) = 0;
                }
                goto code_r0x002ad080;
              }
            } while (*plVar19 == 0);
            *(int *)(puVar10 + 1) = iVar8;
code_r0x002ad080:
            iVar8 = func_0x0029ac7c(puVar11,puVar11,puVar10);
            puVar13 = puVar10;
            if (iVar8 != 0) goto code_r0x002ad094;
          }
          goto code_r0x002ad1bc;
        }
        bVar5 = true;
        iVar8 = func_0x0029b0e4(puVar11,1);
        if (iVar8 == 0) goto code_r0x002ad1c0;
code_r0x002ad094:
        if (puVar11 == unaff_x24) {
          iVar8 = func_0x0029afb8();
          if (iVar8 != 0) goto code_r0x002ad0d8;
          goto code_r0x002ad1bc;
        }
        *(int *)(unaff_x24 + 2) = (int)puVar11[2];
        iVar8 = func_0x0029afb8();
        if (iVar8 == 0) goto code_r0x002ad1bc;
        *(int *)(unaff_x24 + 1) = (int)puVar11[1];
code_r0x002ad0d8:
        iVar8 = (int)puVar11[1];
        if (0 < iVar8) {
          uVar16 = 0;
          puVar10 = (ulong *)*unaff_x24;
          puVar21 = (ulong *)*puVar11;
          do {
            uVar24 = *puVar21;
            puVar17 = puVar10 + 1;
            *puVar10 = uVar16 | uVar24 << 1;
            uVar16 = uVar24 >> 0x3f;
            iVar8 = iVar8 + -1;
            puVar10 = puVar17;
            puVar21 = puVar21 + 1;
          } while (iVar8 != 0);
          if ((long)uVar24 < 0) {
            *puVar17 = 1;
            *(int *)(unaff_x24 + 1) = (int)unaff_x24[1] + 1;
          }
        }
        bVar5 = true;
        iVar8 = func_0x0029b0e4();
        if (iVar8 != 0) {
          lVar22 = 0x400;
          if ((int)unaff_x24[1] < 0x11) {
            lVar22 = 0x200;
          }
          lVar27 = 1;
          do {
            while( true ) {
              uVar1 = *(undefined2 *)(unaff_x22 + lVar27 * 2);
              iVar8 = func_0x002a18a8();
              if ((iVar8 != 0) && (iVar8 = func_0x002a18a8(puVar11,uVar1), iVar8 != 0)) break;
              puVar13 = unaff_x25;
              iVar8 = func_0x0029ac7c();
              if (iVar8 == 0) goto code_r0x002ad1bc;
              puVar13 = puVar12;
              iVar8 = func_0x0029ac7c(puVar11,puVar11,puVar12);
              lVar27 = 1;
              bVar5 = true;
              if (iVar8 == 0) goto code_r0x002ad1c0;
            }
            bVar5 = false;
            lVar27 = lVar27 + 1;
          } while (lVar27 != lVar22);
          goto code_r0x002ad1c0;
        }
        if ((char)unaff_x19[5] == '\0') goto code_r0x002ad1c8;
      }
code_r0x002ad1e4:
      if (bVar5) goto LAB_002ad540;
    }
code_r0x002ad1e8:
    if (unaff_x20 != (ulong *)0x0) {
      if ((char)*unaff_x20 == '\x01') {
        puVar13 = unaff_x20;
        iVar8 = (*(code *)unaff_x20[2])(0,in_stack_00000038._4_4_);
        if (iVar8 == 0) goto LAB_002ad540;
      }
      else {
        if ((char)*unaff_x20 != '\x02') goto LAB_002ad540;
        puVar13 = unaff_x20;
        (*(code *)unaff_x20[2])(0,in_stack_00000038._4_4_);
      }
    }
    in_stack_00000038._4_4_ = in_stack_00000038._4_4_ + 1;
    if ((uVar18 & 1) != 0) goto code_r0x002ad248;
    puVar15 = (ulong *)0x0;
    puVar13 = puVar4;
    puVar14 = unaff_x19;
    iVar6 = func_0x002ae678((long)&uStack0000000000000040 + 4);
    iVar8 = uStack0000000000000040._4_4_;
    if (iVar6 == 0) {
      iVar8 = -1;
    }
    unaff_x25 = in_stack_00000030;
    if (iVar8 != 0) {
      uVar26 = (uint)(iVar8 != -1);
      goto LAB_002ad544;
    }
  } while( true );
code_r0x002ad268:
  in_x10 = *unaff_x24;
  goto code_r0x002ad26c;
code_r0x002ad248:
  iVar8 = func_0x0029afb8();
  if (iVar8 != 0) {
    in_x9 = *unaff_x26;
    param_1 = (ulong)(uint)unaff_x24[1];
    unaff_x25 = in_stack_00000030;
    unaff_x28 = puVar4;
    if ((uint)unaff_x24[1] != 0) goto code_r0x002ad268;
    goto code_r0x002ad2e4;
  }
LAB_002ad540:
  uVar26 = 0;
LAB_002ad544:
  if ((char)unaff_x19[5] != '\0') {
LAB_002ad56c:
    func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
    func_0x0036e3d8(unaff_x19[1]);
    func_0x0036e3d8();
    return uVar26;
  }
  if (unaff_x19[2] == 0) {
    func_0x0079db4c();
code_r0x002ad644:
    func_0x0079db4c();
code_r0x002ad648:
    func_0x0079db4c();
  }
  else {
    uVar18 = unaff_x19[2] - 1;
    unaff_x19[2] = uVar18;
    uVar18 = *(ulong *)(unaff_x19[1] + uVar18 * 8);
    unaff_x19[4] = uVar18;
    if (uVar18 == 0) goto LAB_002ad56c;
  }
  auVar96 = func_0x0079db28();
  iVar8 = func_0x002ae678(&uStack_14,auVar96._0_8_,auVar96._8_8_,puVar13,puVar14,puVar15);
  if (iVar8 == 0) {
    uStack_14 = 0xffffffff;
  }
  return uStack_14;
}

