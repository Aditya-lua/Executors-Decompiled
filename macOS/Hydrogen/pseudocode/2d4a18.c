
void FUN_002d4a18(undefined8 param_1,undefined8 param_2,long param_3)

{
  bool bVar1;
  undefined1 auVar2 [16];
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  uint uVar13;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x29;
  byte bVar14;
  byte bVar15;
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
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  undefined8 uVar47;
  byte bVar54;
  byte bVar55;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  undefined8 uVar56;
  byte bVar63;
  byte bVar64;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  undefined8 uVar65;
  byte bVar72;
  byte bVar73;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  undefined8 uVar74;
  byte bVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined1 auVar90 [16];
  ulong in_stack_00000000;
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
  undefined8 uStack_50;
  undefined8 uStack_48;
  long lStack_38;
  undefined8 uStack_30;
  
  uVar13 = (uint)unaff_x21;
  if (uVar13 < 10) {
    if ((uVar13 != 0) && (___memcpy_chk(), uVar13 != 1 && in_stack_00000000 < 2)) {
      lVar7 = unaff_x21 + -2;
      plVar5 = (long *)register0x00000008;
      do {
        plVar5 = plVar5 + 1;
        lVar10 = *plVar5;
        *plVar5 = lVar10 + -1;
        if (lVar10 != 0) break;
        bVar1 = lVar7 != 0;
        lVar7 = lVar7 + -1;
      } while (bVar1);
    }
    func_0x002a356c(param_2,param_3);
    param_3 = unaff_x21;
    unaff_x22 = param_1;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return;
    }
  }
  else {
    _abort();
  }
  auVar90 = ___stack_chk_fail();
  uVar4 = auVar90._8_8_;
  plVar5 = auVar90._0_8_;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar13 = *(uint *)(plVar5 + 0x21);
  uVar6 = (ulong)uVar13;
  uStack_30 = unaff_x22;
  if ((int)uVar13 < 1) goto LAB_002d4c3c;
  if (uVar13 < 8) {
    uVar8 = 0;
    uVar11 = 0;
  }
  else {
    uVar8 = uVar6 & 0xfffffff8;
    bVar14 = 0;
    bVar15 = 0;
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
    uVar47 = 0;
    uVar56 = 0;
    uVar65 = 0;
    uVar74 = 0;
    puVar12 = (undefined8 *)(param_3 + 0x20);
    uVar11 = uVar8;
    do {
      uVar83 = puVar12[-3];
      uVar82 = puVar12[-4];
      uVar85 = puVar12[-1];
      uVar84 = puVar12[-2];
      uVar87 = puVar12[1];
      uVar86 = *puVar12;
      uVar89 = puVar12[3];
      uVar88 = puVar12[2];
      bVar14 = (byte)uVar82 | bVar14;
      bVar15 = (byte)((ulong)uVar82 >> 8) | bVar15;
      bVar16 = (byte)((ulong)uVar82 >> 0x10) | bVar16;
      bVar17 = (byte)((ulong)uVar82 >> 0x18) | bVar17;
      bVar18 = (byte)((ulong)uVar82 >> 0x20) | bVar18;
      bVar19 = (byte)((ulong)uVar82 >> 0x28) | bVar19;
      bVar20 = (byte)((ulong)uVar82 >> 0x30) | bVar20;
      bVar21 = (byte)((ulong)uVar82 >> 0x38) | bVar21;
      bVar22 = (byte)uVar83 | bVar22;
      bVar23 = (byte)((ulong)uVar83 >> 8) | bVar23;
      bVar24 = (byte)((ulong)uVar83 >> 0x10) | bVar24;
      bVar25 = (byte)((ulong)uVar83 >> 0x18) | bVar25;
      bVar26 = (byte)((ulong)uVar83 >> 0x20) | bVar26;
      bVar27 = (byte)((ulong)uVar83 >> 0x28) | bVar27;
      bVar28 = (byte)((ulong)uVar83 >> 0x30) | bVar28;
      bVar29 = (byte)((ulong)uVar83 >> 0x38) | bVar29;
      bVar30 = (byte)uVar84 | bVar30;
      bVar31 = (byte)((ulong)uVar84 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar84 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar84 >> 0x18) | bVar33;
      bVar34 = (byte)((ulong)uVar84 >> 0x20) | bVar34;
      bVar35 = (byte)((ulong)uVar84 >> 0x28) | bVar35;
      bVar36 = (byte)((ulong)uVar84 >> 0x30) | bVar36;
      bVar37 = (byte)((ulong)uVar84 >> 0x38) | bVar37;
      bVar38 = (byte)uVar85 | bVar38;
      bVar39 = (byte)((ulong)uVar85 >> 8) | bVar39;
      bVar40 = (byte)((ulong)uVar85 >> 0x10) | bVar40;
      bVar41 = (byte)((ulong)uVar85 >> 0x18) | bVar41;
      bVar42 = (byte)((ulong)uVar85 >> 0x20) | bVar42;
      bVar43 = (byte)((ulong)uVar85 >> 0x28) | bVar43;
      bVar44 = (byte)((ulong)uVar85 >> 0x30) | bVar44;
      bVar45 = (byte)((ulong)uVar85 >> 0x38) | bVar45;
      bVar46 = (byte)uVar86 | (byte)uVar47;
      bVar48 = (byte)((ulong)uVar86 >> 8) | (byte)((ulong)uVar47 >> 8);
      bVar49 = (byte)((ulong)uVar86 >> 0x10) | (byte)((ulong)uVar47 >> 0x10);
      bVar50 = (byte)((ulong)uVar86 >> 0x18) | (byte)((ulong)uVar47 >> 0x18);
      bVar51 = (byte)((ulong)uVar86 >> 0x20) | (byte)((ulong)uVar47 >> 0x20);
      bVar52 = (byte)((ulong)uVar86 >> 0x28) | (byte)((ulong)uVar47 >> 0x28);
      bVar53 = (byte)((ulong)uVar86 >> 0x30) | (byte)((ulong)uVar47 >> 0x30);
      bVar54 = (byte)((ulong)uVar86 >> 0x38) | (byte)((ulong)uVar47 >> 0x38);
      uVar47 = CONCAT17(bVar54,CONCAT16(bVar53,CONCAT15(bVar52,CONCAT14(bVar51,CONCAT13(bVar50,
                                                  CONCAT12(bVar49,CONCAT11(bVar48,bVar46)))))));
      bVar55 = (byte)uVar87 | (byte)uVar56;
      bVar57 = (byte)((ulong)uVar87 >> 8) | (byte)((ulong)uVar56 >> 8);
      bVar58 = (byte)((ulong)uVar87 >> 0x10) | (byte)((ulong)uVar56 >> 0x10);
      bVar59 = (byte)((ulong)uVar87 >> 0x18) | (byte)((ulong)uVar56 >> 0x18);
      bVar60 = (byte)((ulong)uVar87 >> 0x20) | (byte)((ulong)uVar56 >> 0x20);
      bVar61 = (byte)((ulong)uVar87 >> 0x28) | (byte)((ulong)uVar56 >> 0x28);
      bVar62 = (byte)((ulong)uVar87 >> 0x30) | (byte)((ulong)uVar56 >> 0x30);
      bVar63 = (byte)((ulong)uVar87 >> 0x38) | (byte)((ulong)uVar56 >> 0x38);
      uVar56 = CONCAT17(bVar63,CONCAT16(bVar62,CONCAT15(bVar61,CONCAT14(bVar60,CONCAT13(bVar59,
                                                  CONCAT12(bVar58,CONCAT11(bVar57,bVar55)))))));
      bVar64 = (byte)uVar88 | (byte)uVar65;
      bVar66 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar65 >> 8);
      bVar67 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar65 >> 0x10);
      bVar68 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar65 >> 0x18);
      bVar69 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar65 >> 0x20);
      bVar70 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar65 >> 0x28);
      bVar71 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar65 >> 0x30);
      bVar72 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar65 >> 0x38);
      uVar65 = CONCAT17(bVar72,CONCAT16(bVar71,CONCAT15(bVar70,CONCAT14(bVar69,CONCAT13(bVar68,
                                                  CONCAT12(bVar67,CONCAT11(bVar66,bVar64)))))));
      bVar73 = (byte)uVar89 | (byte)uVar74;
      bVar75 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar74 >> 8);
      bVar76 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar74 >> 0x10);
      bVar77 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar74 >> 0x18);
      bVar78 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar74 >> 0x20);
      bVar79 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar74 >> 0x28);
      bVar80 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar74 >> 0x30);
      bVar81 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar74 >> 0x38);
      uVar74 = CONCAT17(bVar81,CONCAT16(bVar80,CONCAT15(bVar79,CONCAT14(bVar78,CONCAT13(bVar77,
                                                  CONCAT12(bVar76,CONCAT11(bVar75,bVar73)))))));
      uVar11 = uVar11 - 8;
      puVar12 = puVar12 + 8;
    } while (uVar11 != 0);
    bVar64 = bVar64 | bVar46 | bVar30 | bVar14;
    bVar66 = bVar66 | bVar48 | bVar31 | bVar15;
    bVar67 = bVar67 | bVar49 | bVar32 | bVar16;
    bVar68 = bVar68 | bVar50 | bVar33 | bVar17;
    bVar69 = bVar69 | bVar51 | bVar34 | bVar18;
    bVar70 = bVar70 | bVar52 | bVar35 | bVar19;
    bVar71 = bVar71 | bVar53 | bVar36 | bVar20;
    bVar72 = bVar72 | bVar54 | bVar37 | bVar21;
    bVar73 = bVar73 | bVar55 | bVar38 | bVar22;
    bVar75 = bVar75 | bVar57 | bVar39 | bVar23;
    bVar76 = bVar76 | bVar58 | bVar40 | bVar24;
    bVar77 = bVar77 | bVar59 | bVar41 | bVar25;
    bVar78 = bVar78 | bVar60 | bVar42 | bVar26;
    bVar79 = bVar79 | bVar61 | bVar43 | bVar27;
    bVar80 = bVar80 | bVar62 | bVar44 | bVar28;
    bVar81 = bVar81 | bVar63 | bVar45 | bVar29;
    auVar90[1] = bVar66;
    auVar90[0] = bVar64;
    auVar90[2] = bVar67;
    auVar90[3] = bVar68;
    auVar90[4] = bVar69;
    auVar90[5] = bVar70;
    auVar90[6] = bVar71;
    auVar90[7] = bVar72;
    auVar90[8] = bVar73;
    auVar90[9] = bVar75;
    auVar90[10] = bVar76;
    auVar90[0xb] = bVar77;
    auVar90[0xc] = bVar78;
    auVar90[0xd] = bVar79;
    auVar90[0xe] = bVar80;
    auVar90[0xf] = bVar81;
    auVar2[1] = bVar66;
    auVar2[0] = bVar64;
    auVar2[2] = bVar67;
    auVar2[3] = bVar68;
    auVar2[4] = bVar69;
    auVar2[5] = bVar70;
    auVar2[6] = bVar71;
    auVar2[7] = bVar72;
    auVar2[8] = bVar73;
    auVar2[9] = bVar75;
    auVar2[10] = bVar76;
    auVar2[0xb] = bVar77;
    auVar2[0xc] = bVar78;
    auVar2[0xd] = bVar79;
    auVar2[0xe] = bVar80;
    auVar2[0xf] = bVar81;
    auVar90 = NEON_ext(auVar90,auVar2,8,1);
    uVar11 = CONCAT17(bVar72 | auVar90[7],
                      CONCAT16(bVar71 | auVar90[6],
                               CONCAT15(bVar70 | auVar90[5],
                                        CONCAT14(bVar69 | auVar90[4],
                                                 CONCAT13(bVar68 | auVar90[3],
                                                          CONCAT12(bVar67 | auVar90[2],
                                                                   CONCAT11(bVar66 | auVar90[1],
                                                                            bVar64 | auVar90[0])))))
                              ));
    if (uVar8 == uVar6) goto LAB_002d4b98;
  }
  lVar7 = uVar6 - uVar8;
  puVar9 = (ulong *)(param_3 + uVar8 * 8);
  do {
    uVar11 = *puVar9 | uVar11;
    lVar7 = lVar7 + -1;
    puVar9 = puVar9 + 1;
  } while (lVar7 != 0);
LAB_002d4b98:
  if (uVar11 == 0) goto LAB_002d4c3c;
  (**(code **)(*plVar5 + 0x88))(plVar5,uVar4);
  uVar13 = *(uint *)(plVar5 + 0x21);
  lVar7 = (long)(int)uVar13;
  if (uVar13 < 10) {
    uStack_58 = 0;
    uStack_60 = 0;
    uStack_48 = 0;
    uStack_50 = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_68 = 0;
    uStack_70 = 0;
    uStack_98 = 0;
    uStack_a0 = 0;
    uStack_88 = 0;
    uStack_90 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    uStack_c8 = 0;
    uStack_d0 = 0;
    if (uVar13 != 0) {
      ___memcpy_chk(&uStack_d0,uVar4,lVar7 << 3,0x90);
    }
    iVar3 = func_0x002ab2b0(uVar4,lVar7,&uStack_d0,lVar7 << 1,plVar5 + 0x1d);
    if (iVar3 != 0) {
      func_0x0036e464(&uStack_d0,lVar7 << 4);
      uVar4 = 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_38) {
        do {
          ___stack_chk_fail(uVar4);
LAB_002d4c3c:
          uVar4 = 0;
        } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_38);
      }
      return;
    }
  }
  plVar5 = (long *)_abort();
                    /* WARNING: Could not recover jumptable at 0x002d4c78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar5 + 0x88))();
  return;
}

