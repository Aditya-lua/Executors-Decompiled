
/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_002b09c4(long param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  uint uVar1;
  undefined1 auVar2 [16];
  int iVar3;
  undefined8 *puVar4;
  long in_x9;
  ulong *puVar5;
  long in_x10;
  ulong uVar6;
  long in_x12;
  long in_x13;
  long lVar7;
  undefined8 *unaff_x19;
  undefined8 *unaff_x28;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
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
  undefined1 auVar25 [16];
  byte bVar41;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  undefined8 uVar42;
  byte bVar49;
  byte bVar50;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  undefined8 uVar51;
  byte bVar58;
  byte bVar59;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  undefined8 uVar60;
  byte bVar67;
  byte bVar68;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  undefined8 uVar69;
  byte bVar76;
  undefined8 uVar77;
  undefined8 uVar78;
  undefined8 uVar79;
  undefined8 uVar80;
  undefined8 uVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  
  bVar40 = param_3[0xf];
  bVar39 = param_3[0xe];
  bVar38 = param_3[0xd];
  bVar37 = param_3[0xc];
  bVar36 = param_3[0xb];
  bVar35 = param_3[10];
  bVar34 = param_3[9];
  bVar33 = param_3[8];
  bVar32 = param_3[7];
  bVar31 = param_3[6];
  bVar30 = param_3[5];
  bVar29 = param_3[4];
  bVar28 = param_3[3];
  bVar27 = param_3[2];
  bVar26 = param_3[1];
  bVar24 = param_3[0];
  bVar23 = param_2[0xf];
  bVar22 = param_2[0xe];
  bVar21 = param_2[0xd];
  bVar20 = param_2[0xc];
  bVar19 = param_2[0xb];
  bVar18 = param_2[10];
  bVar17 = param_2[9];
  bVar16 = param_2[8];
  bVar15 = param_2[7];
  bVar14 = param_2[6];
  bVar13 = param_2[5];
  bVar12 = param_2[4];
  bVar11 = param_2[3];
  bVar10 = param_2[2];
  bVar9 = param_2[1];
  bVar8 = param_2[0];
  uVar42 = 0;
  uVar51 = 0;
  uVar60 = 0;
  uVar69 = 0;
  puVar4 = (undefined8 *)(in_x9 + 0x28);
  lVar7 = in_x13;
  do {
    uVar78 = puVar4[-3];
    uVar77 = puVar4[-4];
    uVar80 = puVar4[-1];
    uVar79 = puVar4[-2];
    uVar82 = puVar4[1];
    uVar81 = *puVar4;
    uVar84 = puVar4[3];
    uVar83 = puVar4[2];
    bVar24 = (byte)uVar77 | bVar24;
    bVar26 = (byte)((ulong)uVar77 >> 8) | bVar26;
    bVar27 = (byte)((ulong)uVar77 >> 0x10) | bVar27;
    bVar28 = (byte)((ulong)uVar77 >> 0x18) | bVar28;
    bVar29 = (byte)((ulong)uVar77 >> 0x20) | bVar29;
    bVar30 = (byte)((ulong)uVar77 >> 0x28) | bVar30;
    bVar31 = (byte)((ulong)uVar77 >> 0x30) | bVar31;
    bVar32 = (byte)((ulong)uVar77 >> 0x38) | bVar32;
    bVar33 = (byte)uVar78 | bVar33;
    bVar34 = (byte)((ulong)uVar78 >> 8) | bVar34;
    bVar35 = (byte)((ulong)uVar78 >> 0x10) | bVar35;
    bVar36 = (byte)((ulong)uVar78 >> 0x18) | bVar36;
    bVar37 = (byte)((ulong)uVar78 >> 0x20) | bVar37;
    bVar38 = (byte)((ulong)uVar78 >> 0x28) | bVar38;
    bVar39 = (byte)((ulong)uVar78 >> 0x30) | bVar39;
    bVar40 = (byte)((ulong)uVar78 >> 0x38) | bVar40;
    bVar8 = (byte)uVar79 | bVar8;
    bVar9 = (byte)((ulong)uVar79 >> 8) | bVar9;
    bVar10 = (byte)((ulong)uVar79 >> 0x10) | bVar10;
    bVar11 = (byte)((ulong)uVar79 >> 0x18) | bVar11;
    bVar12 = (byte)((ulong)uVar79 >> 0x20) | bVar12;
    bVar13 = (byte)((ulong)uVar79 >> 0x28) | bVar13;
    bVar14 = (byte)((ulong)uVar79 >> 0x30) | bVar14;
    bVar15 = (byte)((ulong)uVar79 >> 0x38) | bVar15;
    bVar16 = (byte)uVar80 | bVar16;
    bVar17 = (byte)((ulong)uVar80 >> 8) | bVar17;
    bVar18 = (byte)((ulong)uVar80 >> 0x10) | bVar18;
    bVar19 = (byte)((ulong)uVar80 >> 0x18) | bVar19;
    bVar20 = (byte)((ulong)uVar80 >> 0x20) | bVar20;
    bVar21 = (byte)((ulong)uVar80 >> 0x28) | bVar21;
    bVar22 = (byte)((ulong)uVar80 >> 0x30) | bVar22;
    bVar23 = (byte)((ulong)uVar80 >> 0x38) | bVar23;
    bVar41 = (byte)uVar81 | (byte)uVar42;
    bVar43 = (byte)((ulong)uVar81 >> 8) | (byte)((ulong)uVar42 >> 8);
    bVar44 = (byte)((ulong)uVar81 >> 0x10) | (byte)((ulong)uVar42 >> 0x10);
    bVar45 = (byte)((ulong)uVar81 >> 0x18) | (byte)((ulong)uVar42 >> 0x18);
    bVar46 = (byte)((ulong)uVar81 >> 0x20) | (byte)((ulong)uVar42 >> 0x20);
    bVar47 = (byte)((ulong)uVar81 >> 0x28) | (byte)((ulong)uVar42 >> 0x28);
    bVar48 = (byte)((ulong)uVar81 >> 0x30) | (byte)((ulong)uVar42 >> 0x30);
    bVar49 = (byte)((ulong)uVar81 >> 0x38) | (byte)((ulong)uVar42 >> 0x38);
    uVar42 = CONCAT17(bVar49,CONCAT16(bVar48,CONCAT15(bVar47,CONCAT14(bVar46,CONCAT13(bVar45,
                                                  CONCAT12(bVar44,CONCAT11(bVar43,bVar41)))))));
    bVar50 = (byte)uVar82 | (byte)uVar51;
    bVar52 = (byte)((ulong)uVar82 >> 8) | (byte)((ulong)uVar51 >> 8);
    bVar53 = (byte)((ulong)uVar82 >> 0x10) | (byte)((ulong)uVar51 >> 0x10);
    bVar54 = (byte)((ulong)uVar82 >> 0x18) | (byte)((ulong)uVar51 >> 0x18);
    bVar55 = (byte)((ulong)uVar82 >> 0x20) | (byte)((ulong)uVar51 >> 0x20);
    bVar56 = (byte)((ulong)uVar82 >> 0x28) | (byte)((ulong)uVar51 >> 0x28);
    bVar57 = (byte)((ulong)uVar82 >> 0x30) | (byte)((ulong)uVar51 >> 0x30);
    bVar58 = (byte)((ulong)uVar82 >> 0x38) | (byte)((ulong)uVar51 >> 0x38);
    uVar51 = CONCAT17(bVar58,CONCAT16(bVar57,CONCAT15(bVar56,CONCAT14(bVar55,CONCAT13(bVar54,
                                                  CONCAT12(bVar53,CONCAT11(bVar52,bVar50)))))));
    bVar59 = (byte)uVar83 | (byte)uVar60;
    bVar61 = (byte)((ulong)uVar83 >> 8) | (byte)((ulong)uVar60 >> 8);
    bVar62 = (byte)((ulong)uVar83 >> 0x10) | (byte)((ulong)uVar60 >> 0x10);
    bVar63 = (byte)((ulong)uVar83 >> 0x18) | (byte)((ulong)uVar60 >> 0x18);
    bVar64 = (byte)((ulong)uVar83 >> 0x20) | (byte)((ulong)uVar60 >> 0x20);
    bVar65 = (byte)((ulong)uVar83 >> 0x28) | (byte)((ulong)uVar60 >> 0x28);
    bVar66 = (byte)((ulong)uVar83 >> 0x30) | (byte)((ulong)uVar60 >> 0x30);
    bVar67 = (byte)((ulong)uVar83 >> 0x38) | (byte)((ulong)uVar60 >> 0x38);
    uVar60 = CONCAT17(bVar67,CONCAT16(bVar66,CONCAT15(bVar65,CONCAT14(bVar64,CONCAT13(bVar63,
                                                  CONCAT12(bVar62,CONCAT11(bVar61,bVar59)))))));
    bVar68 = (byte)uVar84 | (byte)uVar69;
    bVar70 = (byte)((ulong)uVar84 >> 8) | (byte)((ulong)uVar69 >> 8);
    bVar71 = (byte)((ulong)uVar84 >> 0x10) | (byte)((ulong)uVar69 >> 0x10);
    bVar72 = (byte)((ulong)uVar84 >> 0x18) | (byte)((ulong)uVar69 >> 0x18);
    bVar73 = (byte)((ulong)uVar84 >> 0x20) | (byte)((ulong)uVar69 >> 0x20);
    bVar74 = (byte)((ulong)uVar84 >> 0x28) | (byte)((ulong)uVar69 >> 0x28);
    bVar75 = (byte)((ulong)uVar84 >> 0x30) | (byte)((ulong)uVar69 >> 0x30);
    bVar76 = (byte)((ulong)uVar84 >> 0x38) | (byte)((ulong)uVar69 >> 0x38);
    uVar69 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(bVar72,
                                                  CONCAT12(bVar71,CONCAT11(bVar70,bVar68)))))));
    lVar7 = lVar7 + -8;
    puVar4 = puVar4 + 8;
  } while (lVar7 != 0);
  bVar59 = bVar59 | bVar41 | bVar8 | bVar24;
  bVar61 = bVar61 | bVar43 | bVar9 | bVar26;
  bVar62 = bVar62 | bVar44 | bVar10 | bVar27;
  bVar63 = bVar63 | bVar45 | bVar11 | bVar28;
  bVar64 = bVar64 | bVar46 | bVar12 | bVar29;
  bVar65 = bVar65 | bVar47 | bVar13 | bVar30;
  bVar66 = bVar66 | bVar48 | bVar14 | bVar31;
  bVar67 = bVar67 | bVar49 | bVar15 | bVar32;
  bVar68 = bVar68 | bVar50 | bVar16 | bVar33;
  bVar70 = bVar70 | bVar52 | bVar17 | bVar34;
  bVar71 = bVar71 | bVar53 | bVar18 | bVar35;
  bVar72 = bVar72 | bVar54 | bVar19 | bVar36;
  bVar73 = bVar73 | bVar55 | bVar20 | bVar37;
  bVar74 = bVar74 | bVar56 | bVar21 | bVar38;
  bVar75 = bVar75 | bVar57 | bVar22 | bVar39;
  bVar76 = bVar76 | bVar58 | bVar23 | bVar40;
  auVar25[1] = bVar61;
  auVar25[0] = bVar59;
  auVar25[2] = bVar62;
  auVar25[3] = bVar63;
  auVar25[4] = bVar64;
  auVar25[5] = bVar65;
  auVar25[6] = bVar66;
  auVar25[7] = bVar67;
  auVar25[8] = bVar68;
  auVar25[9] = bVar70;
  auVar25[10] = bVar71;
  auVar25[0xb] = bVar72;
  auVar25[0xc] = bVar73;
  auVar25[0xd] = bVar74;
  auVar25[0xe] = bVar75;
  auVar25[0xf] = bVar76;
  auVar2[1] = bVar61;
  auVar2[0] = bVar59;
  auVar2[2] = bVar62;
  auVar2[3] = bVar63;
  auVar2[4] = bVar64;
  auVar2[5] = bVar65;
  auVar2[6] = bVar66;
  auVar2[7] = bVar67;
  auVar2[8] = bVar68;
  auVar2[9] = bVar70;
  auVar2[10] = bVar71;
  auVar2[0xb] = bVar72;
  auVar2[0xc] = bVar73;
  auVar2[0xd] = bVar74;
  auVar2[0xe] = bVar75;
  auVar2[0xf] = bVar76;
  auVar25 = NEON_ext(auVar25,auVar2,8,1);
  uVar6 = CONCAT17(bVar67 | auVar25[7],
                   CONCAT16(bVar66 | auVar25[6],
                            CONCAT15(bVar65 | auVar25[5],
                                     CONCAT14(bVar64 | auVar25[4],
                                              CONCAT13(bVar63 | auVar25[3],
                                                       CONCAT12(bVar62 | auVar25[2],
                                                                CONCAT11(bVar61 | auVar25[1],
                                                                         bVar59 | auVar25[0])))))));
  if (in_x12 != in_x13) {
    param_1 = param_1 - in_x10;
    puVar5 = (ulong *)(in_x9 + in_x10 * 8);
    do {
      uVar6 = *puVar5 | uVar6;
      param_1 = param_1 + -1;
      puVar5 = puVar5 + 1;
    } while (param_1 != 0);
  }
  if (uVar6 != 0) {
    func_0x0028f83c(3,0,0x72,"/aws-lc/crypto/fipsmodule/bn/sqrt.c",0x59);
    return (undefined8 *)0x0;
  }
  if (unaff_x19 == (undefined8 *)0x0) {
    puVar4 = (undefined8 *)func_0x0036e31c(0x18);
    if (puVar4 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    *(undefined4 *)((long)puVar4 + 0x14) = 1;
    iVar3 = *(int *)(unaff_x28 + 1);
  }
  else {
    iVar3 = *(int *)(unaff_x28 + 1);
    puVar4 = unaff_x19;
  }
  if (iVar3 == 0) {
    iVar3 = func_0x0029b3b0(puVar4,0);
  }
  else {
    iVar3 = func_0x0029b3b0(puVar4,*(ulong *)*unaff_x28 & 1);
  }
  if (iVar3 != 0) {
    return puVar4;
  }
  if (puVar4 != unaff_x19) {
    uVar1 = *(uint *)((long)puVar4 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*puVar4);
      uVar1 = *(uint *)((long)puVar4 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *puVar4 = 0;
    }
    else {
      func_0x0036e3d8(puVar4);
    }
  }
  return (undefined8 *)0x0;
}

