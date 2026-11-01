
long FUN_002cb5e4(long param_1,undefined1 param_2 [16])

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  int iVar6;
  long lVar7;
  uint uVar8;
  long in_x9;
  ulong *puVar9;
  ulong uVar10;
  undefined8 *in_x10;
  ulong uVar11;
  long lVar12;
  uint uVar13;
  long in_x11;
  ulong uVar14;
  ulong uVar15;
  undefined1 *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  undefined8 *unaff_x22;
  long unaff_x23;
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
  undefined1 auVar33 [16];
  byte bVar49;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  undefined8 uVar50;
  byte bVar57;
  byte bVar58;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  undefined8 uVar59;
  byte bVar66;
  byte bVar67;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  undefined8 uVar68;
  byte bVar75;
  byte bVar76;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  undefined8 uVar77;
  byte bVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  
  bVar31 = param_2[0xf];
  bVar30 = param_2[0xe];
  bVar29 = param_2[0xd];
  bVar28 = param_2[0xc];
  bVar27 = param_2[0xb];
  bVar26 = param_2[10];
  bVar25 = param_2[9];
  bVar24 = param_2[8];
  bVar23 = param_2[7];
  bVar22 = param_2[6];
  bVar21 = param_2[5];
  bVar20 = param_2[4];
  bVar19 = param_2[3];
  bVar18 = param_2[2];
  bVar17 = param_2[1];
  bVar16 = param_2[0];
  bVar32 = 0;
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
  uVar50 = 0;
  uVar59 = 0;
  uVar68 = 0;
  uVar77 = 0;
  do {
    uVar86 = in_x10[-5];
    uVar85 = in_x10[-6];
    uVar88 = in_x10[-3];
    uVar87 = in_x10[-4];
    uVar90 = in_x10[-1];
    uVar89 = in_x10[-2];
    uVar92 = in_x10[1];
    uVar91 = *in_x10;
    bVar16 = (byte)uVar85 | bVar16;
    bVar17 = (byte)((ulong)uVar85 >> 8) | bVar17;
    bVar18 = (byte)((ulong)uVar85 >> 0x10) | bVar18;
    bVar19 = (byte)((ulong)uVar85 >> 0x18) | bVar19;
    bVar20 = (byte)((ulong)uVar85 >> 0x20) | bVar20;
    bVar21 = (byte)((ulong)uVar85 >> 0x28) | bVar21;
    bVar22 = (byte)((ulong)uVar85 >> 0x30) | bVar22;
    bVar23 = (byte)((ulong)uVar85 >> 0x38) | bVar23;
    bVar24 = (byte)uVar86 | bVar24;
    bVar25 = (byte)((ulong)uVar86 >> 8) | bVar25;
    bVar26 = (byte)((ulong)uVar86 >> 0x10) | bVar26;
    bVar27 = (byte)((ulong)uVar86 >> 0x18) | bVar27;
    bVar28 = (byte)((ulong)uVar86 >> 0x20) | bVar28;
    bVar29 = (byte)((ulong)uVar86 >> 0x28) | bVar29;
    bVar30 = (byte)((ulong)uVar86 >> 0x30) | bVar30;
    bVar31 = (byte)((ulong)uVar86 >> 0x38) | bVar31;
    bVar32 = (byte)uVar87 | bVar32;
    bVar34 = (byte)((ulong)uVar87 >> 8) | bVar34;
    bVar35 = (byte)((ulong)uVar87 >> 0x10) | bVar35;
    bVar36 = (byte)((ulong)uVar87 >> 0x18) | bVar36;
    bVar37 = (byte)((ulong)uVar87 >> 0x20) | bVar37;
    bVar38 = (byte)((ulong)uVar87 >> 0x28) | bVar38;
    bVar39 = (byte)((ulong)uVar87 >> 0x30) | bVar39;
    bVar40 = (byte)((ulong)uVar87 >> 0x38) | bVar40;
    bVar41 = (byte)uVar88 | bVar41;
    bVar42 = (byte)((ulong)uVar88 >> 8) | bVar42;
    bVar43 = (byte)((ulong)uVar88 >> 0x10) | bVar43;
    bVar44 = (byte)((ulong)uVar88 >> 0x18) | bVar44;
    bVar45 = (byte)((ulong)uVar88 >> 0x20) | bVar45;
    bVar46 = (byte)((ulong)uVar88 >> 0x28) | bVar46;
    bVar47 = (byte)((ulong)uVar88 >> 0x30) | bVar47;
    bVar48 = (byte)((ulong)uVar88 >> 0x38) | bVar48;
    bVar49 = (byte)uVar89 | (byte)uVar50;
    bVar51 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar50 >> 8);
    bVar52 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
    bVar53 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
    bVar54 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
    bVar55 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
    bVar56 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
    bVar57 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
    uVar50 = CONCAT17(bVar57,CONCAT16(bVar56,CONCAT15(bVar55,CONCAT14(bVar54,CONCAT13(bVar53,
                                                  CONCAT12(bVar52,CONCAT11(bVar51,bVar49)))))));
    bVar58 = (byte)uVar90 | (byte)uVar59;
    bVar60 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar59 >> 8);
    bVar61 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar59 >> 0x10);
    bVar62 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar59 >> 0x18);
    bVar63 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar59 >> 0x20);
    bVar64 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar59 >> 0x28);
    bVar65 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar59 >> 0x30);
    bVar66 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar59 >> 0x38);
    uVar59 = CONCAT17(bVar66,CONCAT16(bVar65,CONCAT15(bVar64,CONCAT14(bVar63,CONCAT13(bVar62,
                                                  CONCAT12(bVar61,CONCAT11(bVar60,bVar58)))))));
    bVar67 = (byte)uVar91 | (byte)uVar68;
    bVar69 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar68 >> 8);
    bVar70 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar68 >> 0x10);
    bVar71 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar68 >> 0x18);
    bVar72 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar68 >> 0x20);
    bVar73 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar68 >> 0x28);
    bVar74 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar68 >> 0x30);
    bVar75 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar68 >> 0x38);
    uVar68 = CONCAT17(bVar75,CONCAT16(bVar74,CONCAT15(bVar73,CONCAT14(bVar72,CONCAT13(bVar71,
                                                  CONCAT12(bVar70,CONCAT11(bVar69,bVar67)))))));
    bVar76 = (byte)uVar92 | (byte)uVar77;
    bVar78 = (byte)((ulong)uVar92 >> 8) | (byte)((ulong)uVar77 >> 8);
    bVar79 = (byte)((ulong)uVar92 >> 0x10) | (byte)((ulong)uVar77 >> 0x10);
    bVar80 = (byte)((ulong)uVar92 >> 0x18) | (byte)((ulong)uVar77 >> 0x18);
    bVar81 = (byte)((ulong)uVar92 >> 0x20) | (byte)((ulong)uVar77 >> 0x20);
    bVar82 = (byte)((ulong)uVar92 >> 0x28) | (byte)((ulong)uVar77 >> 0x28);
    bVar83 = (byte)((ulong)uVar92 >> 0x30) | (byte)((ulong)uVar77 >> 0x30);
    bVar84 = (byte)((ulong)uVar92 >> 0x38) | (byte)((ulong)uVar77 >> 0x38);
    uVar77 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(bVar80,
                                                  CONCAT12(bVar79,CONCAT11(bVar78,bVar76)))))));
    in_x10 = in_x10 + 8;
    in_x11 = in_x11 + -8;
  } while (in_x11 != 0);
  bVar67 = bVar67 | bVar49 | bVar32 | bVar16;
  bVar69 = bVar69 | bVar51 | bVar34 | bVar17;
  bVar70 = bVar70 | bVar52 | bVar35 | bVar18;
  bVar71 = bVar71 | bVar53 | bVar36 | bVar19;
  bVar72 = bVar72 | bVar54 | bVar37 | bVar20;
  bVar73 = bVar73 | bVar55 | bVar38 | bVar21;
  bVar74 = bVar74 | bVar56 | bVar39 | bVar22;
  bVar75 = bVar75 | bVar57 | bVar40 | bVar23;
  bVar76 = bVar76 | bVar58 | bVar41 | bVar24;
  bVar78 = bVar78 | bVar60 | bVar42 | bVar25;
  bVar79 = bVar79 | bVar61 | bVar43 | bVar26;
  bVar80 = bVar80 | bVar62 | bVar44 | bVar27;
  bVar81 = bVar81 | bVar63 | bVar45 | bVar28;
  bVar82 = bVar82 | bVar64 | bVar46 | bVar29;
  bVar83 = bVar83 | bVar65 | bVar47 | bVar30;
  bVar84 = bVar84 | bVar66 | bVar48 | bVar31;
  auVar33[1] = bVar69;
  auVar33[0] = bVar67;
  auVar33[2] = bVar70;
  auVar33[3] = bVar71;
  auVar33[4] = bVar72;
  auVar33[5] = bVar73;
  auVar33[6] = bVar74;
  auVar33[7] = bVar75;
  auVar33[8] = bVar76;
  auVar33[9] = bVar78;
  auVar33[10] = bVar79;
  auVar33[0xb] = bVar80;
  auVar33[0xc] = bVar81;
  auVar33[0xd] = bVar82;
  auVar33[0xe] = bVar83;
  auVar33[0xf] = bVar84;
  auVar5[1] = bVar69;
  auVar5[0] = bVar67;
  auVar5[2] = bVar70;
  auVar5[3] = bVar71;
  auVar5[4] = bVar72;
  auVar5[5] = bVar73;
  auVar5[6] = bVar74;
  auVar5[7] = bVar75;
  auVar5[8] = bVar76;
  auVar5[9] = bVar78;
  auVar5[10] = bVar79;
  auVar5[0xb] = bVar80;
  auVar5[0xc] = bVar81;
  auVar5[0xd] = bVar82;
  auVar5[0xe] = bVar83;
  auVar5[0xf] = bVar84;
  auVar33 = NEON_ext(auVar33,auVar5,8,1);
  uVar11 = CONCAT17(bVar75 | auVar33[7],
                    CONCAT16(bVar74 | auVar33[6],
                             CONCAT15(bVar73 | auVar33[5],
                                      CONCAT14(bVar72 | auVar33[4],
                                               CONCAT13(bVar71 | auVar33[3],
                                                        CONCAT12(bVar70 | auVar33[2],
                                                                 CONCAT11(bVar69 | auVar33[1],
                                                                          bVar67 | auVar33[0])))))))
  ;
  if (in_x9 != param_1) {
    param_1 = param_1 - in_x9;
    puVar9 = (ulong *)(unaff_x23 + in_x9 * 8 + 0x98);
    do {
      uVar11 = *puVar9 | uVar11;
      param_1 = param_1 + -1;
      puVar9 = puVar9 + 1;
    } while (param_1 != 0);
  }
  if (uVar11 == 0) {
    if (unaff_x19 != (undefined1 *)0x0) {
      if (unaff_x20 == 0) {
        func_0x0028f83c(0xf,0,100,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x11a);
        return 0;
      }
      *unaff_x19 = 0;
    }
    return 1;
  }
  if (unaff_x19 != (undefined1 *)0x0) {
    iVar6 = (**(code **)*unaff_x22)();
    if (iVar6 == 0) {
      return 0;
    }
    lVar7 = func_0x002d290c();
    return lVar7;
  }
  if ((6 < unaff_w21) || ((1 << (ulong)(unaff_w21 & 0x1f) & 0x54U) == 0)) {
    func_0x0028f83c(0xf,0,0x6f,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x59);
    return 0;
  }
  uVar4 = *(uint *)(unaff_x22 + 0x29);
  uVar11 = (ulong)uVar4;
  uVar8 = uVar4 & (int)uVar4 >> 0x1f;
  lVar7 = uVar11 * 8;
  do {
    lVar7 = lVar7 + -8;
    uVar13 = (uint)uVar11;
    uVar11 = (ulong)(uVar13 - 1);
    if ((int)uVar13 < 1) {
      if ((int)uVar4 < 0) {
        lVar12 = unaff_x22[0x28];
        goto code_r0x002d2868;
      }
      uVar11 = 0;
      goto code_r0x002d28f0;
    }
    lVar12 = unaff_x22[0x28];
  } while (*(long *)(lVar12 + lVar7) == 0);
  uVar8 = uVar13;
code_r0x002d2868:
  uVar10 = *(ulong *)(lVar12 + (long)(int)(uVar8 - 1) * 8);
  uVar14 = uVar10 >> 0x20;
  uVar11 = uVar14;
  if (uVar14 == 0) {
    uVar11 = uVar10;
  }
  uVar15 = uVar11 >> 0x10;
  uVar1 = uVar15;
  if (uVar15 == 0) {
    uVar1 = uVar11;
  }
  uVar11 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar11 = uVar1;
  }
  uVar2 = uVar11 >> 4;
  if (uVar11 < 0x10) {
    uVar2 = uVar11;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar8 = (uint)(uVar10 != 0) | (uVar8 - 1) * 0x40 | (uint)(uVar14 != 0) << 5 |
          (uint)(uVar15 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar11) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar8 = uVar8 + 1;
  }
  uVar11 = (ulong)(uVar8 + 7 >> 3);
code_r0x002d28f0:
  uVar10 = uVar11;
  if ((unaff_w21 & 0xfffffffd) != 4) {
    uVar10 = 0;
  }
  return uVar11 + uVar10 + 1;
}

