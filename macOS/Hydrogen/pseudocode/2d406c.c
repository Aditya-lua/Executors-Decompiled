
/* WARNING: Possible PIC construction at 0x002d43b8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002d43bc) */
/* WARNING: Removing unreachable block (ram,0x002d43d4) */

ulong FUN_002d406c(long param_1,ulong param_2,long param_3,undefined1 *param_4,ulong param_5)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  unkbyte9 Var3;
  unkbyte9 Var4;
  bool bVar5;
  int iVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  int in_w9;
  long lVar12;
  ulong in_x10;
  byte *pbVar13;
  ulong uVar14;
  uint in_w11;
  uint uVar15;
  undefined8 *puVar16;
  int in_w12;
  unkbyte9 *pVar17;
  int in_w13;
  ulong uVar18;
  ulong uVar19;
  int in_w14;
  ulong in_x15;
  ulong *unaff_x19;
  ulong uVar20;
  long lVar21;
  byte bVar22;
  undefined8 uVar23;
  byte bVar25;
  byte bVar26;
  byte bVar27;
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
  undefined1 auVar24 [16];
  byte bVar40;
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
  byte bVar55;
  byte bVar56;
  undefined1 auVar41 [16];
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
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined1 auStack_248 [144];
  undefined1 auStack_1b8 [144];
  long lStack_128;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
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
  undefined8 uStack_48;
  
  if (in_x10 < 0x10) {
    in_x15 = in_x10;
  }
  uVar9 = in_x15 >> 2;
  if (in_x15 < 4) {
    uVar9 = in_x15;
  }
  uVar15 = in_w11 | in_w9 << 6 | in_w12 << 5 | in_w13 << 4 | in_w14 << 3 | (uint)(0xf < in_x10) << 2
           | (uint)(3 < in_x15) << 1;
  if (1 < uVar9) {
    uVar15 = uVar15 + 1;
  }
  uVar20 = (ulong)(uVar15 + 7 >> 3);
  uVar11 = param_1 * 8;
  uVar9 = uVar11 - uVar20;
  if (uVar20 <= uVar11 && uVar9 != 0) {
    if (uVar9 < 8) {
      uVar15 = 0;
      uVar14 = uVar20;
LAB_002d41ac:
      lVar12 = uVar14 + param_1 * -8;
      pbVar13 = (byte *)(param_5 + uVar14);
      do {
        uVar15 = *pbVar13 | uVar15;
        bVar5 = lVar12 != -1;
        lVar12 = lVar12 + 1;
        pbVar13 = pbVar13 + 1;
      } while (bVar5);
    }
    else if (uVar9 < 0x40) {
      bVar22 = 0;
      uVar19 = 0;
LAB_002d415c:
      uVar18 = uVar9 & 0xfffffffffffffff8;
      uVar14 = uVar20 + uVar18;
      auVar41 = ZEXT116(bVar22);
      lVar12 = uVar19 - uVar18;
      puVar16 = (undefined8 *)(param_5 + uVar20 + uVar19);
      do {
        uVar23 = *puVar16;
        auVar41._0_8_ =
             CONCAT17((byte)((ulong)uVar23 >> 0x38) | auVar41[7],
                      CONCAT16((byte)((ulong)uVar23 >> 0x30) | auVar41[6],
                               CONCAT15((byte)((ulong)uVar23 >> 0x28) | auVar41[5],
                                        CONCAT14((byte)((ulong)uVar23 >> 0x20) | auVar41[4],
                                                 CONCAT13((byte)((ulong)uVar23 >> 0x18) | auVar41[3]
                                                          ,CONCAT12((byte)((ulong)uVar23 >> 0x10) |
                                                                    auVar41[2],
                                                                    CONCAT11((byte)((ulong)uVar23 >>
                                                                                   8) | auVar41[1],
                                                                             (byte)uVar23 |
                                                                             auVar41[0])))))));
        auVar41._8_8_ = 0;
        lVar12 = lVar12 + 8;
        puVar16 = puVar16 + 1;
      } while (lVar12 != 0);
      uVar19 = auVar41._0_8_ | auVar41._0_8_ >> 0x20;
      uVar19 = uVar19 | uVar19 >> 0x10;
      uVar15 = (uint)uVar19 | (uint)(uVar19 >> 8);
      if (uVar9 != uVar18) goto LAB_002d41ac;
    }
    else {
      uVar19 = uVar9 & 0xffffffffffffffc0;
      bVar22 = 0;
      bVar25 = 0;
      bVar26 = 0;
      bVar27 = 0;
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
      puVar16 = (undefined8 *)(uVar20 + param_5 + 0x20);
      uVar14 = uVar19;
      do {
        uVar89 = puVar16[-3];
        uVar23 = puVar16[-4];
        uVar91 = puVar16[-1];
        uVar90 = puVar16[-2];
        uVar93 = puVar16[1];
        uVar92 = *puVar16;
        uVar95 = puVar16[3];
        uVar94 = puVar16[2];
        bVar22 = (byte)uVar23 | bVar22;
        bVar25 = (byte)((ulong)uVar23 >> 8) | bVar25;
        bVar26 = (byte)((ulong)uVar23 >> 0x10) | bVar26;
        bVar27 = (byte)((ulong)uVar23 >> 0x18) | bVar27;
        bVar28 = (byte)((ulong)uVar23 >> 0x20) | bVar28;
        bVar29 = (byte)((ulong)uVar23 >> 0x28) | bVar29;
        bVar30 = (byte)((ulong)uVar23 >> 0x30) | bVar30;
        bVar31 = (byte)((ulong)uVar23 >> 0x38) | bVar31;
        bVar32 = (byte)uVar89 | bVar32;
        bVar33 = (byte)((ulong)uVar89 >> 8) | bVar33;
        bVar34 = (byte)((ulong)uVar89 >> 0x10) | bVar34;
        bVar35 = (byte)((ulong)uVar89 >> 0x18) | bVar35;
        bVar36 = (byte)((ulong)uVar89 >> 0x20) | bVar36;
        bVar37 = (byte)((ulong)uVar89 >> 0x28) | bVar37;
        bVar38 = (byte)((ulong)uVar89 >> 0x30) | bVar38;
        bVar39 = (byte)((ulong)uVar89 >> 0x38) | bVar39;
        bVar40 = (byte)uVar90 | bVar40;
        bVar42 = (byte)((ulong)uVar90 >> 8) | bVar42;
        bVar43 = (byte)((ulong)uVar90 >> 0x10) | bVar43;
        bVar44 = (byte)((ulong)uVar90 >> 0x18) | bVar44;
        bVar45 = (byte)((ulong)uVar90 >> 0x20) | bVar45;
        bVar46 = (byte)((ulong)uVar90 >> 0x28) | bVar46;
        bVar47 = (byte)((ulong)uVar90 >> 0x30) | bVar47;
        bVar48 = (byte)((ulong)uVar90 >> 0x38) | bVar48;
        bVar49 = (byte)uVar91 | bVar49;
        bVar50 = (byte)((ulong)uVar91 >> 8) | bVar50;
        bVar51 = (byte)((ulong)uVar91 >> 0x10) | bVar51;
        bVar52 = (byte)((ulong)uVar91 >> 0x18) | bVar52;
        bVar53 = (byte)((ulong)uVar91 >> 0x20) | bVar53;
        bVar54 = (byte)((ulong)uVar91 >> 0x28) | bVar54;
        bVar55 = (byte)((ulong)uVar91 >> 0x30) | bVar55;
        bVar56 = (byte)((ulong)uVar91 >> 0x38) | bVar56;
        bVar57 = (byte)uVar92 | bVar57;
        bVar58 = (byte)((ulong)uVar92 >> 8) | bVar58;
        bVar59 = (byte)((ulong)uVar92 >> 0x10) | bVar59;
        bVar60 = (byte)((ulong)uVar92 >> 0x18) | bVar60;
        bVar61 = (byte)((ulong)uVar92 >> 0x20) | bVar61;
        bVar62 = (byte)((ulong)uVar92 >> 0x28) | bVar62;
        bVar63 = (byte)((ulong)uVar92 >> 0x30) | bVar63;
        bVar64 = (byte)((ulong)uVar92 >> 0x38) | bVar64;
        bVar65 = (byte)uVar93 | bVar65;
        bVar66 = (byte)((ulong)uVar93 >> 8) | bVar66;
        bVar67 = (byte)((ulong)uVar93 >> 0x10) | bVar67;
        bVar68 = (byte)((ulong)uVar93 >> 0x18) | bVar68;
        bVar69 = (byte)((ulong)uVar93 >> 0x20) | bVar69;
        bVar70 = (byte)((ulong)uVar93 >> 0x28) | bVar70;
        bVar71 = (byte)((ulong)uVar93 >> 0x30) | bVar71;
        bVar72 = (byte)((ulong)uVar93 >> 0x38) | bVar72;
        bVar73 = (byte)uVar94 | bVar73;
        bVar74 = (byte)((ulong)uVar94 >> 8) | bVar74;
        bVar75 = (byte)((ulong)uVar94 >> 0x10) | bVar75;
        bVar76 = (byte)((ulong)uVar94 >> 0x18) | bVar76;
        bVar77 = (byte)((ulong)uVar94 >> 0x20) | bVar77;
        bVar78 = (byte)((ulong)uVar94 >> 0x28) | bVar78;
        bVar79 = (byte)((ulong)uVar94 >> 0x30) | bVar79;
        bVar80 = (byte)((ulong)uVar94 >> 0x38) | bVar80;
        bVar81 = (byte)uVar95 | bVar81;
        bVar82 = (byte)((ulong)uVar95 >> 8) | bVar82;
        bVar83 = (byte)((ulong)uVar95 >> 0x10) | bVar83;
        bVar84 = (byte)((ulong)uVar95 >> 0x18) | bVar84;
        bVar85 = (byte)((ulong)uVar95 >> 0x20) | bVar85;
        bVar86 = (byte)((ulong)uVar95 >> 0x28) | bVar86;
        bVar87 = (byte)((ulong)uVar95 >> 0x30) | bVar87;
        bVar88 = (byte)((ulong)uVar95 >> 0x38) | bVar88;
        uVar14 = uVar14 - 0x40;
        puVar16 = puVar16 + 8;
      } while (uVar14 != 0);
      auVar24[0] = bVar73 | bVar57 | bVar40 | bVar22;
      auVar24[1] = bVar74 | bVar58 | bVar42 | bVar25;
      auVar24[2] = bVar75 | bVar59 | bVar43 | bVar26;
      auVar24[3] = bVar76 | bVar60 | bVar44 | bVar27;
      auVar24[4] = bVar77 | bVar61 | bVar45 | bVar28;
      auVar24[5] = bVar78 | bVar62 | bVar46 | bVar29;
      auVar24[6] = bVar79 | bVar63 | bVar47 | bVar30;
      auVar24[7] = bVar80 | bVar64 | bVar48 | bVar31;
      auVar24[8] = bVar81 | bVar65 | bVar49 | bVar32;
      auVar24[9] = bVar82 | bVar66 | bVar50 | bVar33;
      auVar24[10] = bVar83 | bVar67 | bVar51 | bVar34;
      auVar24[0xb] = bVar84 | bVar68 | bVar52 | bVar35;
      auVar24[0xc] = bVar85 | bVar69 | bVar53 | bVar36;
      auVar24[0xd] = bVar86 | bVar70 | bVar54 | bVar37;
      auVar24[0xe] = bVar87 | bVar71 | bVar55 | bVar38;
      auVar24[0xf] = bVar88 | bVar72 | bVar56 | bVar39;
      auVar41 = NEON_ext(auVar24,auVar24,8,1);
      uVar14 = CONCAT17(auVar24[7] | auVar41[7],
                        CONCAT16(auVar24[6] | auVar41[6],
                                 CONCAT15(auVar24[5] | auVar41[5],
                                          CONCAT14(auVar24[4] | auVar41[4],
                                                   CONCAT13(auVar24[3] | auVar41[3],
                                                            CONCAT12(auVar24[2] | auVar41[2],
                                                                     CONCAT11(auVar24[1] |
                                                                              auVar41[1],
                                                                              auVar24[0] |
                                                                              auVar41[0])))))));
      uVar14 = uVar14 | uVar14 >> 0x20;
      uVar14 = uVar14 | uVar14 >> 0x10;
      uVar15 = (uint)uVar14 | (uint)(uVar14 >> 8);
      bVar22 = (byte)uVar15;
      if (uVar9 != uVar19) {
        if ((uVar9 & 0x38) == 0) {
          uVar14 = uVar20 + uVar19;
          goto LAB_002d41ac;
        }
        goto LAB_002d415c;
      }
    }
    if ((uVar15 & 0xff) != 0) {
      auVar24 = func_0x0079dae0();
      puVar7 = auVar24._8_8_;
      lVar12 = auVar24._0_8_;
      puVar16 = &uStack_e0;
      uStack_48 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
      lVar21 = (long)(int)*(uint *)(lVar12 + 0x108);
      if (*(uint *)(lVar12 + 0x108) < 10 && param_5 <= (ulong)(lVar21 << 1)) {
        uStack_68 = 0;
        uStack_70 = 0;
        uStack_58 = 0;
        uStack_60 = 0;
        puVar10 = (undefined8 *)(lVar12 + 0xe8);
        uStack_88 = 0;
        uStack_90 = 0;
        uStack_78 = 0;
        uStack_80 = 0;
        uStack_a8 = 0;
        uStack_b0 = 0;
        uStack_98 = 0;
        uStack_a0 = 0;
        uStack_c8 = 0;
        uStack_d0 = 0;
        uStack_b8 = 0;
        uStack_c0 = 0;
        uStack_d8 = 0;
        uStack_e0 = 0;
        if (param_5 != 0) {
          ___memcpy_chk(&uStack_e0,param_4,param_5 << 3,0x90);
        }
        iVar6 = func_0x002ab2b0(puVar7,lVar21,&uStack_e0,lVar21 << 1,puVar10);
        param_4 = (undefined1 *)puVar16;
        if (iVar6 == 0) goto code_r0x002d43ec;
        func_0x0036e464(&uStack_e0,lVar21 << 4);
        iVar6 = *(int *)(lVar12 + 0x108);
        puVar8 = *(undefined1 **)(lVar12 + 0xe8);
        param_4 = puVar7;
      }
      else {
code_r0x002d43ec:
        _abort();
        auVar24 = ___stack_chk_fail();
        puVar7 = auVar24._8_8_;
        puVar10 = (undefined8 *)(auVar24._0_8_ + 0xe8);
        puVar8 = (undefined1 *)*puVar10;
        iVar6 = *(int *)(auVar24._0_8_ + 0x108);
      }
      uVar9 = (ulong)iVar6;
      lStack_128 = *(long *)PTR____stack_chk_guard_009b01e8;
      if ((uVar9 < 10) && ((long)*(int *)(puVar10 + 4) == uVar9)) {
        if (uVar9 < 2) {
          if (param_4 == puVar8) {
            func_0x002ac3fc(auStack_248,param_4,uVar9,auStack_1b8);
            func_0x0036e464(auStack_1b8,uVar9 << 4);
          }
          else {
            func_0x002abe4c(auStack_248,param_4,uVar9,puVar8,uVar9);
          }
          puVar8 = auStack_248;
          iVar6 = func_0x002ab2b0(puVar7,uVar9,puVar8,uVar9 << 1,puVar10);
          if (iVar6 != 0) {
            uVar9 = func_0x0036e464(auStack_248,uVar9 << 4);
            goto code_r0x002a4150;
          }
        }
        else {
          uVar9 = func_0x00381a00(puVar7,param_4,puVar8,puVar10[3],puVar10 + 6,uVar9);
          if ((int)uVar9 != 0) {
code_r0x002a4150:
            if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_128) {
              return uVar9;
            }
            goto code_r0x002a4184;
          }
        }
      }
      _abort();
code_r0x002a4184:
      auVar24 = ___stack_chk_fail();
      if ((ulong)puVar8 >> 6 < auVar24._8_8_) {
        return (ulong)((uint)(*(ulong *)(auVar24._0_8_ + ((ulong)puVar8 >> 6) * 8) >>
                             ((ulong)puVar8 & 0x3f)) & 1);
      }
      return 0;
    }
  }
  uVar9 = uVar11;
  if (uVar20 <= uVar11) {
    uVar9 = uVar20;
  }
  if (uVar9 == 0) goto LAB_002d4228;
  if ((uVar9 < 8) ||
     ((param_3 + (uVar20 - uVar9) < param_5 + uVar9 && (param_5 < param_3 + uVar20)))) {
    uVar14 = 0;
  }
  else {
    if (uVar9 < 0x40) {
      uVar19 = 0;
    }
    else {
      uVar14 = uVar9 & 0xffffffc0;
      puVar16 = (undefined8 *)(uVar20 + param_3 + -0x20);
      pVar17 = (unkbyte9 *)(param_5 + 0x20);
      uVar19 = uVar14;
      do {
        uVar23 = *(undefined8 *)((long)pVar17 + 8);
        Var3 = *pVar17;
        uVar89 = *(undefined8 *)((long)pVar17 + 0x18);
        Var4 = pVar17[1];
        auVar24 = NEON_rev64(*(undefined1 (*) [16])(pVar17 + -2),1);
        auVar24 = NEON_ext(auVar24,auVar24,8,1);
        auVar41 = NEON_rev64(*(undefined1 (*) [16])(pVar17 + -1),1);
        auVar41 = NEON_ext(auVar41,auVar41,8,1);
        puVar16[1] = auVar41._8_8_;
        *puVar16 = auVar41._0_8_;
        puVar16[3] = auVar24._8_8_;
        puVar16[2] = auVar24._0_8_;
        auVar1[9] = (char)((ulong)uVar23 >> 8);
        auVar1._0_9_ = Var3;
        auVar1[10] = (char)((ulong)uVar23 >> 0x10);
        auVar1[0xb] = (char)((ulong)uVar23 >> 0x18);
        auVar1[0xc] = (char)((ulong)uVar23 >> 0x20);
        auVar1[0xd] = (char)((ulong)uVar23 >> 0x28);
        auVar1[0xe] = (char)((ulong)uVar23 >> 0x30);
        auVar1[0xf] = (char)((ulong)uVar23 >> 0x38);
        auVar24 = NEON_rev64(auVar1,1);
        auVar24 = NEON_ext(auVar24,auVar24,8,1);
        auVar2[9] = (char)((ulong)uVar89 >> 8);
        auVar2._0_9_ = Var4;
        auVar2[10] = (char)((ulong)uVar89 >> 0x10);
        auVar2[0xb] = (char)((ulong)uVar89 >> 0x18);
        auVar2[0xc] = (char)((ulong)uVar89 >> 0x20);
        auVar2[0xd] = (char)((ulong)uVar89 >> 0x28);
        auVar2[0xe] = (char)((ulong)uVar89 >> 0x30);
        auVar2[0xf] = (char)((ulong)uVar89 >> 0x38);
        auVar41 = NEON_rev64(auVar2,1);
        auVar41 = NEON_ext(auVar41,auVar41,8,1);
        puVar16[-3] = auVar41._8_8_;
        puVar16[-4] = auVar41._0_8_;
        puVar16[-1] = auVar24._8_8_;
        puVar16[-2] = auVar24._0_8_;
        puVar16 = puVar16 + -8;
        uVar19 = uVar19 - 0x40;
        pVar17 = pVar17 + 4;
      } while (uVar19 != 0);
      if (uVar9 == uVar14) goto LAB_002d4228;
      uVar19 = uVar14;
      if ((uVar9 & 0x38) == 0) goto code_r0x002d4204;
    }
    uVar14 = uVar9 & 0xfffffff8;
    puVar16 = (undefined8 *)((uVar20 - uVar19) + param_3);
    lVar12 = uVar19 - uVar14;
    puVar10 = (undefined8 *)(param_5 + uVar19);
    do {
      puVar16 = puVar16 + -1;
      uVar23 = NEON_rev64(*puVar10,1);
      *puVar16 = uVar23;
      lVar12 = lVar12 + 8;
      puVar10 = puVar10 + 1;
    } while (lVar12 != 0);
    if (uVar9 == uVar14) goto LAB_002d4228;
  }
code_r0x002d4204:
  lVar12 = uVar9 - uVar14;
  puVar7 = (undefined1 *)(param_5 + uVar14);
  puVar8 = (undefined1 *)(param_3 + uVar20 + ~uVar14);
  do {
    *puVar8 = *puVar7;
    lVar12 = lVar12 + -1;
    puVar7 = puVar7 + 1;
    puVar8 = puVar8 + -1;
  } while (lVar12 != 0);
LAB_002d4228:
  if (uVar11 < uVar20) {
    param_2 = _bzero(param_3,uVar20 - uVar9);
  }
  *unaff_x19 = uVar20;
  return param_2;
}

