
undefined8 _aws_lc_0_24_0_EC_KEY_check_key(long *param_1)

{
  uint uVar1;
  undefined1 auVar2 [16];
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  long *plVar12;
  undefined8 *puVar13;
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
  undefined1 auVar31 [16];
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
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  undefined8 uVar64;
  byte bVar71;
  byte bVar72;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  undefined8 uVar73;
  byte bVar80;
  undefined8 uVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined1 auStack_108 [216];
  
  if (((param_1 == (long *)0x0) || (lVar11 = *param_1, lVar11 == 0)) ||
     (puVar13 = (undefined8 *)param_1[1], puVar13 == (undefined8 *)0x0)) {
    uVar4 = 0x43;
    uVar5 = 0x126;
    goto code_r0x002cb0e0;
  }
  iVar3 = func_0x002c2908(lVar11,*puVar13);
  if (iVar3 == 0) {
    uVar1 = *(uint *)(lVar11 + 0x148);
    uVar6 = (ulong)uVar1;
    if (0 < (int)uVar1) {
      if (uVar1 < 8) {
        uVar7 = 0;
        uVar9 = 0;
code_r0x002cb1ec:
        lVar11 = uVar6 - uVar7;
        puVar8 = puVar13 + uVar7 + 0x13;
        do {
          uVar9 = *puVar8 | uVar9;
          lVar11 = lVar11 + -1;
          puVar8 = puVar8 + 1;
        } while (lVar11 != 0);
      }
      else {
        uVar7 = uVar6 & 0xfffffff8;
        puVar10 = puVar13 + 0x19;
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
        uVar4 = 0;
        uVar5 = 0;
        uVar64 = 0;
        uVar73 = 0;
        uVar9 = uVar7;
        do {
          uVar82 = puVar10[-5];
          uVar81 = puVar10[-6];
          uVar84 = puVar10[-3];
          uVar83 = puVar10[-4];
          uVar86 = puVar10[-1];
          uVar85 = puVar10[-2];
          uVar88 = puVar10[1];
          uVar87 = *puVar10;
          bVar14 = (byte)uVar81 | bVar14;
          bVar15 = (byte)((ulong)uVar81 >> 8) | bVar15;
          bVar16 = (byte)((ulong)uVar81 >> 0x10) | bVar16;
          bVar17 = (byte)((ulong)uVar81 >> 0x18) | bVar17;
          bVar18 = (byte)((ulong)uVar81 >> 0x20) | bVar18;
          bVar19 = (byte)((ulong)uVar81 >> 0x28) | bVar19;
          bVar20 = (byte)((ulong)uVar81 >> 0x30) | bVar20;
          bVar21 = (byte)((ulong)uVar81 >> 0x38) | bVar21;
          bVar22 = (byte)uVar82 | bVar22;
          bVar23 = (byte)((ulong)uVar82 >> 8) | bVar23;
          bVar24 = (byte)((ulong)uVar82 >> 0x10) | bVar24;
          bVar25 = (byte)((ulong)uVar82 >> 0x18) | bVar25;
          bVar26 = (byte)((ulong)uVar82 >> 0x20) | bVar26;
          bVar27 = (byte)((ulong)uVar82 >> 0x28) | bVar27;
          bVar28 = (byte)((ulong)uVar82 >> 0x30) | bVar28;
          bVar29 = (byte)((ulong)uVar82 >> 0x38) | bVar29;
          bVar30 = (byte)uVar83 | bVar30;
          bVar32 = (byte)((ulong)uVar83 >> 8) | bVar32;
          bVar33 = (byte)((ulong)uVar83 >> 0x10) | bVar33;
          bVar34 = (byte)((ulong)uVar83 >> 0x18) | bVar34;
          bVar35 = (byte)((ulong)uVar83 >> 0x20) | bVar35;
          bVar36 = (byte)((ulong)uVar83 >> 0x28) | bVar36;
          bVar37 = (byte)((ulong)uVar83 >> 0x30) | bVar37;
          bVar38 = (byte)((ulong)uVar83 >> 0x38) | bVar38;
          bVar39 = (byte)uVar84 | bVar39;
          bVar40 = (byte)((ulong)uVar84 >> 8) | bVar40;
          bVar41 = (byte)((ulong)uVar84 >> 0x10) | bVar41;
          bVar42 = (byte)((ulong)uVar84 >> 0x18) | bVar42;
          bVar43 = (byte)((ulong)uVar84 >> 0x20) | bVar43;
          bVar44 = (byte)((ulong)uVar84 >> 0x28) | bVar44;
          bVar45 = (byte)((ulong)uVar84 >> 0x30) | bVar45;
          bVar46 = (byte)((ulong)uVar84 >> 0x38) | bVar46;
          bVar47 = (byte)uVar85 | (byte)uVar4;
          bVar48 = (byte)((ulong)uVar85 >> 8) | (byte)((ulong)uVar4 >> 8);
          bVar49 = (byte)((ulong)uVar85 >> 0x10) | (byte)((ulong)uVar4 >> 0x10);
          bVar50 = (byte)((ulong)uVar85 >> 0x18) | (byte)((ulong)uVar4 >> 0x18);
          bVar51 = (byte)((ulong)uVar85 >> 0x20) | (byte)((ulong)uVar4 >> 0x20);
          bVar52 = (byte)((ulong)uVar85 >> 0x28) | (byte)((ulong)uVar4 >> 0x28);
          bVar53 = (byte)((ulong)uVar85 >> 0x30) | (byte)((ulong)uVar4 >> 0x30);
          bVar54 = (byte)((ulong)uVar85 >> 0x38) | (byte)((ulong)uVar4 >> 0x38);
          uVar4 = CONCAT17(bVar54,CONCAT16(bVar53,CONCAT15(bVar52,CONCAT14(bVar51,CONCAT13(bVar50,
                                                  CONCAT12(bVar49,CONCAT11(bVar48,bVar47)))))));
          bVar55 = (byte)uVar86 | (byte)uVar5;
          bVar56 = (byte)((ulong)uVar86 >> 8) | (byte)((ulong)uVar5 >> 8);
          bVar57 = (byte)((ulong)uVar86 >> 0x10) | (byte)((ulong)uVar5 >> 0x10);
          bVar58 = (byte)((ulong)uVar86 >> 0x18) | (byte)((ulong)uVar5 >> 0x18);
          bVar59 = (byte)((ulong)uVar86 >> 0x20) | (byte)((ulong)uVar5 >> 0x20);
          bVar60 = (byte)((ulong)uVar86 >> 0x28) | (byte)((ulong)uVar5 >> 0x28);
          bVar61 = (byte)((ulong)uVar86 >> 0x30) | (byte)((ulong)uVar5 >> 0x30);
          bVar62 = (byte)((ulong)uVar86 >> 0x38) | (byte)((ulong)uVar5 >> 0x38);
          uVar5 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(bVar58,
                                                  CONCAT12(bVar57,CONCAT11(bVar56,bVar55)))))));
          bVar63 = (byte)uVar87 | (byte)uVar64;
          bVar65 = (byte)((ulong)uVar87 >> 8) | (byte)((ulong)uVar64 >> 8);
          bVar66 = (byte)((ulong)uVar87 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
          bVar67 = (byte)((ulong)uVar87 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
          bVar68 = (byte)((ulong)uVar87 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
          bVar69 = (byte)((ulong)uVar87 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
          bVar70 = (byte)((ulong)uVar87 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
          bVar71 = (byte)((ulong)uVar87 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
          uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,CONCAT13(bVar67,
                                                  CONCAT12(bVar66,CONCAT11(bVar65,bVar63)))))));
          bVar72 = (byte)uVar88 | (byte)uVar73;
          bVar74 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar73 >> 8);
          bVar75 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
          bVar76 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
          bVar77 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
          bVar78 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
          bVar79 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
          bVar80 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
          uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar72)))))));
          puVar10 = puVar10 + 8;
          uVar9 = uVar9 - 8;
        } while (uVar9 != 0);
        bVar63 = bVar63 | bVar47 | bVar30 | bVar14;
        bVar65 = bVar65 | bVar48 | bVar32 | bVar15;
        bVar66 = bVar66 | bVar49 | bVar33 | bVar16;
        bVar67 = bVar67 | bVar50 | bVar34 | bVar17;
        bVar68 = bVar68 | bVar51 | bVar35 | bVar18;
        bVar69 = bVar69 | bVar52 | bVar36 | bVar19;
        bVar70 = bVar70 | bVar53 | bVar37 | bVar20;
        bVar71 = bVar71 | bVar54 | bVar38 | bVar21;
        bVar72 = bVar72 | bVar55 | bVar39 | bVar22;
        bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
        bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
        bVar76 = bVar76 | bVar58 | bVar42 | bVar25;
        bVar77 = bVar77 | bVar59 | bVar43 | bVar26;
        bVar78 = bVar78 | bVar60 | bVar44 | bVar27;
        bVar79 = bVar79 | bVar61 | bVar45 | bVar28;
        bVar80 = bVar80 | bVar62 | bVar46 | bVar29;
        auVar31[1] = bVar65;
        auVar31[0] = bVar63;
        auVar31[2] = bVar66;
        auVar31[3] = bVar67;
        auVar31[4] = bVar68;
        auVar31[5] = bVar69;
        auVar31[6] = bVar70;
        auVar31[7] = bVar71;
        auVar31[8] = bVar72;
        auVar31[9] = bVar74;
        auVar31[10] = bVar75;
        auVar31[0xb] = bVar76;
        auVar31[0xc] = bVar77;
        auVar31[0xd] = bVar78;
        auVar31[0xe] = bVar79;
        auVar31[0xf] = bVar80;
        auVar2[1] = bVar65;
        auVar2[0] = bVar63;
        auVar2[2] = bVar66;
        auVar2[3] = bVar67;
        auVar2[4] = bVar68;
        auVar2[5] = bVar69;
        auVar2[6] = bVar70;
        auVar2[7] = bVar71;
        auVar2[8] = bVar72;
        auVar2[9] = bVar74;
        auVar2[10] = bVar75;
        auVar2[0xb] = bVar76;
        auVar2[0xc] = bVar77;
        auVar2[0xd] = bVar78;
        auVar2[0xe] = bVar79;
        auVar2[0xf] = bVar80;
        auVar31 = NEON_ext(auVar31,auVar2,8,1);
        uVar9 = CONCAT17(bVar71 | auVar31[7],
                         CONCAT16(bVar70 | auVar31[6],
                                  CONCAT15(bVar69 | auVar31[5],
                                           CONCAT14(bVar68 | auVar31[4],
                                                    CONCAT13(bVar67 | auVar31[3],
                                                             CONCAT12(bVar66 | auVar31[2],
                                                                      CONCAT11(bVar65 | auVar31[1],
                                                                               bVar63 | auVar31[0]))
                                                            )))));
        if (uVar7 != uVar6) goto code_r0x002cb1ec;
      }
      if (uVar9 != 0) goto code_r0x002cb07c;
    }
    uVar4 = 0x77;
    uVar5 = 299;
  }
  else {
    func_0x0028f83c(0xf,0,0x6a,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x287);
code_r0x002cb07c:
    lVar11 = *param_1;
    puVar13 = (undefined8 *)param_1[1];
    iVar3 = func_0x002c2908(lVar11,*puVar13);
    if (iVar3 == 0) {
      iVar3 = func_0x002c7cd4(lVar11,puVar13 + 1);
      if (iVar3 != 0) {
        if (param_1[2] == 0) {
          return 1;
        }
        plVar12 = (long *)*param_1;
        (**(code **)(*plVar12 + 0x28))(plVar12,auStack_108,param_1[2] + 0x18);
        iVar3 = func_0x002c7cd4(plVar12,auStack_108);
        if (iVar3 == 0) {
          func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
          uVar4 = 0xf;
          uVar5 = 0x13d;
        }
        else {
          iVar3 = func_0x002c6bf4(*param_1,auStack_108,param_1[1] + 8);
          if (iVar3 != 0) {
            return 1;
          }
          uVar4 = 0x71;
          uVar5 = 0x144;
        }
        goto code_r0x002cb0e0;
      }
    }
    else {
      func_0x0028f83c(0xf,0,0x6a,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x290);
    }
    uVar4 = 0x78;
    uVar5 = 0x131;
  }
code_r0x002cb0e0:
  func_0x0028f83c(0xf,0,uVar4,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",uVar5);
  return 0;
}

