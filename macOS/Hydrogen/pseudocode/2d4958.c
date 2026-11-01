
void FUN_002d4958(undefined8 param_1)

{
  bool bVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined1 *unaff_x19;
  undefined8 unaff_x20;
  undefined1 *puVar14;
  long lVar15;
  long unaff_x29;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
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
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  undefined8 uVar49;
  byte bVar56;
  byte bVar57;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  undefined8 uVar58;
  byte bVar65;
  byte bVar66;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  undefined8 uVar67;
  byte bVar74;
  byte bVar75;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  undefined8 uVar76;
  byte bVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined1 auVar92 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000080;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_c8;
  long lStack_c0;
  undefined1 *puStack_b8;
  undefined8 uStack_b0;
  undefined1 *puStack_a8;
  undefined1 *puStack_a0;
  undefined8 uStack_98;
  ulong uStack_90;
  long alStack_88 [8];
  long lStack_48;
  undefined1 auStack_6 [6];
  
  lVar15 = (long)unaff_x19 << 1;
  uStack0000000000000000 = param_1;
  uStack0000000000000010 = param_1;
  uStack0000000000000020 = param_1;
  uStack0000000000000030 = param_1;
  uStack0000000000000040 = param_1;
  uStack0000000000000050 = param_1;
  uStack0000000000000060 = param_1;
  uStack0000000000000070 = param_1;
  uStack0000000000000080 = param_1;
  if ((int)unaff_x19 != 0) {
    ___memcpy_chk();
  }
  puVar7 = (undefined1 *)register0x00000008;
  iVar4 = func_0x002ab2b0();
  if (iVar4 == 0) {
    _abort();
  }
  else {
    func_0x0036e464();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return;
    }
  }
  auVar92 = ___stack_chk_fail();
  auVar92._0_8_ = auVar92._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar2 = *(uint *)(auVar92._0_8_ + 0x108);
  puVar14 = (undefined1 *)(long)(int)uVar2;
  if (uVar2 < 10) {
    if (uVar2 != 0) {
      ___memcpy_chk(&uStack_90,*(undefined8 *)(auVar92._0_8_ + 0x100),(long)puVar14 << 3,0x48);
      uVar9 = uStack_90;
      uStack_90 = uStack_90 - 2;
      if (uVar2 != 1 && uVar9 < 2) {
        plVar6 = alStack_88;
        puVar8 = puVar14 + -2;
        do {
          lVar15 = *plVar6;
          *plVar6 = lVar15 + -1;
          if (lVar15 != 0) break;
          bVar1 = puVar8 != (undefined1 *)0x0;
          plVar6 = plVar6 + 1;
          puVar8 = puVar8 + -1;
        } while (bVar1);
      }
    }
    puVar8 = puVar14;
    func_0x002a356c(auVar92._8_8_,puVar7,puVar14,&uStack_90,puVar14,auVar92._0_8_ + 0xe8);
    unaff_x19 = puVar7;
    unaff_x20 = auVar92._8_8_;
    lVar15 = auVar92._0_8_;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
      return;
    }
  }
  else {
    _abort();
    puVar8 = puVar7;
  }
  auVar92 = ___stack_chk_fail();
  uVar5 = auVar92._8_8_;
  plVar6 = auVar92._0_8_;
  lStack_c0 = lVar15;
  puStack_b8 = puVar14;
  uStack_b0 = unaff_x20;
  puStack_a8 = unaff_x19;
  puStack_a0 = auStack_6 + -10;
  uStack_98 = 0x2d4ad8;
  lStack_c8 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar2 = *(uint *)(plVar6 + 0x21);
  uVar9 = (ulong)uVar2;
  if ((int)uVar2 < 1) goto LAB_002d4c3c;
  if (uVar2 < 8) {
    uVar10 = 0;
    uVar12 = 0;
  }
  else {
    uVar10 = uVar9 & 0xfffffff8;
    bVar16 = 0;
    bVar17 = 0;
    bVar18 = 0;
    bVar19 = 0;
    bVar20 = 0;
    bVar21 = 0;
    bVar22 = 0;
    bVar23 = 0;
    bVar24 = 0;
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
    bVar41 = 0;
    bVar42 = 0;
    bVar43 = 0;
    bVar44 = 0;
    bVar45 = 0;
    bVar46 = 0;
    bVar47 = 0;
    uVar49 = 0;
    uVar58 = 0;
    uVar67 = 0;
    uVar76 = 0;
    puVar13 = (undefined8 *)(puVar8 + 0x20);
    uVar12 = uVar10;
    do {
      uVar85 = puVar13[-3];
      uVar84 = puVar13[-4];
      uVar87 = puVar13[-1];
      uVar86 = puVar13[-2];
      uVar89 = puVar13[1];
      uVar88 = *puVar13;
      uVar91 = puVar13[3];
      uVar90 = puVar13[2];
      bVar16 = (byte)uVar84 | bVar16;
      bVar17 = (byte)((ulong)uVar84 >> 8) | bVar17;
      bVar18 = (byte)((ulong)uVar84 >> 0x10) | bVar18;
      bVar19 = (byte)((ulong)uVar84 >> 0x18) | bVar19;
      bVar20 = (byte)((ulong)uVar84 >> 0x20) | bVar20;
      bVar21 = (byte)((ulong)uVar84 >> 0x28) | bVar21;
      bVar22 = (byte)((ulong)uVar84 >> 0x30) | bVar22;
      bVar23 = (byte)((ulong)uVar84 >> 0x38) | bVar23;
      bVar24 = (byte)uVar85 | bVar24;
      bVar25 = (byte)((ulong)uVar85 >> 8) | bVar25;
      bVar26 = (byte)((ulong)uVar85 >> 0x10) | bVar26;
      bVar27 = (byte)((ulong)uVar85 >> 0x18) | bVar27;
      bVar28 = (byte)((ulong)uVar85 >> 0x20) | bVar28;
      bVar29 = (byte)((ulong)uVar85 >> 0x28) | bVar29;
      bVar30 = (byte)((ulong)uVar85 >> 0x30) | bVar30;
      bVar31 = (byte)((ulong)uVar85 >> 0x38) | bVar31;
      bVar32 = (byte)uVar86 | bVar32;
      bVar33 = (byte)((ulong)uVar86 >> 8) | bVar33;
      bVar34 = (byte)((ulong)uVar86 >> 0x10) | bVar34;
      bVar35 = (byte)((ulong)uVar86 >> 0x18) | bVar35;
      bVar36 = (byte)((ulong)uVar86 >> 0x20) | bVar36;
      bVar37 = (byte)((ulong)uVar86 >> 0x28) | bVar37;
      bVar38 = (byte)((ulong)uVar86 >> 0x30) | bVar38;
      bVar39 = (byte)((ulong)uVar86 >> 0x38) | bVar39;
      bVar40 = (byte)uVar87 | bVar40;
      bVar41 = (byte)((ulong)uVar87 >> 8) | bVar41;
      bVar42 = (byte)((ulong)uVar87 >> 0x10) | bVar42;
      bVar43 = (byte)((ulong)uVar87 >> 0x18) | bVar43;
      bVar44 = (byte)((ulong)uVar87 >> 0x20) | bVar44;
      bVar45 = (byte)((ulong)uVar87 >> 0x28) | bVar45;
      bVar46 = (byte)((ulong)uVar87 >> 0x30) | bVar46;
      bVar47 = (byte)((ulong)uVar87 >> 0x38) | bVar47;
      bVar48 = (byte)uVar88 | (byte)uVar49;
      bVar50 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar49 >> 8);
      bVar51 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar49 >> 0x10);
      bVar52 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar49 >> 0x18);
      bVar53 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar49 >> 0x20);
      bVar54 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar49 >> 0x28);
      bVar55 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar49 >> 0x30);
      bVar56 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar49 >> 0x38);
      uVar49 = CONCAT17(bVar56,CONCAT16(bVar55,CONCAT15(bVar54,CONCAT14(bVar53,CONCAT13(bVar52,
                                                  CONCAT12(bVar51,CONCAT11(bVar50,bVar48)))))));
      bVar57 = (byte)uVar89 | (byte)uVar58;
      bVar59 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar58 >> 8);
      bVar60 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar58 >> 0x10);
      bVar61 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar58 >> 0x18);
      bVar62 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar58 >> 0x20);
      bVar63 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar58 >> 0x28);
      bVar64 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar58 >> 0x30);
      bVar65 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar58 >> 0x38);
      uVar58 = CONCAT17(bVar65,CONCAT16(bVar64,CONCAT15(bVar63,CONCAT14(bVar62,CONCAT13(bVar61,
                                                  CONCAT12(bVar60,CONCAT11(bVar59,bVar57)))))));
      bVar66 = (byte)uVar90 | (byte)uVar67;
      bVar68 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar67 >> 8);
      bVar69 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar67 >> 0x10);
      bVar70 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar67 >> 0x18);
      bVar71 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar67 >> 0x20);
      bVar72 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar67 >> 0x28);
      bVar73 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar67 >> 0x30);
      bVar74 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar67 >> 0x38);
      uVar67 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar66)))))));
      bVar75 = (byte)uVar91 | (byte)uVar76;
      bVar77 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar76 >> 8);
      bVar78 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
      bVar79 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
      bVar80 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
      bVar81 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
      bVar82 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
      bVar83 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
      uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
      uVar12 = uVar12 - 8;
      puVar13 = puVar13 + 8;
    } while (uVar12 != 0);
    bVar66 = bVar66 | bVar48 | bVar32 | bVar16;
    bVar68 = bVar68 | bVar50 | bVar33 | bVar17;
    bVar69 = bVar69 | bVar51 | bVar34 | bVar18;
    bVar70 = bVar70 | bVar52 | bVar35 | bVar19;
    bVar71 = bVar71 | bVar53 | bVar36 | bVar20;
    bVar72 = bVar72 | bVar54 | bVar37 | bVar21;
    bVar73 = bVar73 | bVar55 | bVar38 | bVar22;
    bVar74 = bVar74 | bVar56 | bVar39 | bVar23;
    bVar75 = bVar75 | bVar57 | bVar40 | bVar24;
    bVar77 = bVar77 | bVar59 | bVar41 | bVar25;
    bVar78 = bVar78 | bVar60 | bVar42 | bVar26;
    bVar79 = bVar79 | bVar61 | bVar43 | bVar27;
    bVar80 = bVar80 | bVar62 | bVar44 | bVar28;
    bVar81 = bVar81 | bVar63 | bVar45 | bVar29;
    bVar82 = bVar82 | bVar64 | bVar46 | bVar30;
    bVar83 = bVar83 | bVar65 | bVar47 | bVar31;
    auVar92[1] = bVar68;
    auVar92[0] = bVar66;
    auVar92[2] = bVar69;
    auVar92[3] = bVar70;
    auVar92[4] = bVar71;
    auVar92[5] = bVar72;
    auVar92[6] = bVar73;
    auVar92[7] = bVar74;
    auVar92[8] = bVar75;
    auVar92[9] = bVar77;
    auVar92[10] = bVar78;
    auVar92[0xb] = bVar79;
    auVar92[0xc] = bVar80;
    auVar92[0xd] = bVar81;
    auVar92[0xe] = bVar82;
    auVar92[0xf] = bVar83;
    auVar3[1] = bVar68;
    auVar3[0] = bVar66;
    auVar3[2] = bVar69;
    auVar3[3] = bVar70;
    auVar3[4] = bVar71;
    auVar3[5] = bVar72;
    auVar3[6] = bVar73;
    auVar3[7] = bVar74;
    auVar3[8] = bVar75;
    auVar3[9] = bVar77;
    auVar3[10] = bVar78;
    auVar3[0xb] = bVar79;
    auVar3[0xc] = bVar80;
    auVar3[0xd] = bVar81;
    auVar3[0xe] = bVar82;
    auVar3[0xf] = bVar83;
    auVar92 = NEON_ext(auVar92,auVar3,8,1);
    uVar12 = CONCAT17(bVar74 | auVar92[7],
                      CONCAT16(bVar73 | auVar92[6],
                               CONCAT15(bVar72 | auVar92[5],
                                        CONCAT14(bVar71 | auVar92[4],
                                                 CONCAT13(bVar70 | auVar92[3],
                                                          CONCAT12(bVar69 | auVar92[2],
                                                                   CONCAT11(bVar68 | auVar92[1],
                                                                            bVar66 | auVar92[0])))))
                              ));
    if (uVar10 == uVar9) goto LAB_002d4b98;
  }
  lVar15 = uVar9 - uVar10;
  puVar11 = (ulong *)(puVar8 + uVar10 * 8);
  do {
    uVar12 = *puVar11 | uVar12;
    lVar15 = lVar15 + -1;
    puVar11 = puVar11 + 1;
  } while (lVar15 != 0);
LAB_002d4b98:
  if (uVar12 == 0) goto LAB_002d4c3c;
  (**(code **)(*plVar6 + 0x88))(plVar6,uVar5);
  uVar2 = *(uint *)(plVar6 + 0x21);
  lVar15 = (long)(int)uVar2;
  if (uVar2 < 10) {
    uStack_e8 = 0;
    uStack_f0 = 0;
    uStack_d8 = 0;
    uStack_e0 = 0;
    uStack_108 = 0;
    uStack_110 = 0;
    uStack_f8 = 0;
    uStack_100 = 0;
    uStack_128 = 0;
    uStack_130 = 0;
    uStack_118 = 0;
    uStack_120 = 0;
    uStack_148 = 0;
    uStack_150 = 0;
    uStack_138 = 0;
    uStack_140 = 0;
    uStack_158 = 0;
    uStack_160 = 0;
    if (uVar2 != 0) {
      ___memcpy_chk(&uStack_160,uVar5,lVar15 << 3,0x90);
    }
    iVar4 = func_0x002ab2b0(uVar5,lVar15,&uStack_160,lVar15 << 1,plVar6 + 0x1d);
    if (iVar4 != 0) {
      func_0x0036e464(&uStack_160,lVar15 << 4);
      uVar5 = 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_c8) {
        do {
          ___stack_chk_fail(uVar5);
LAB_002d4c3c:
          uVar5 = 0;
        } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_c8);
      }
      return;
    }
  }
  plVar6 = (long *)_abort();
                    /* WARNING: Could not recover jumptable at 0x002d4c78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar6 + 0x88))();
  return;
}

