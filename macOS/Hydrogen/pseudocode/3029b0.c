
void FUN_003029b0(void)

{
  undefined1 auVar1 [16];
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  uint extraout_w8;
  undefined4 uVar5;
  ulong uVar6;
  ulong *puVar7;
  uint extraout_w9;
  uint uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long lVar12;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  long lVar13;
  uint uVar14;
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
  undefined1 auVar32 [16];
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  undefined8 uVar57;
  byte bVar64;
  byte bVar65;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  undefined8 uVar66;
  byte bVar73;
  byte bVar74;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  undefined8 uVar75;
  byte bVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  
  uVar3 = func_0x0029afb8();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  func_0x002b04b8(*unaff_x23,*unaff_x24);
  uVar8 = *(uint *)(unaff_x24 + 1);
  uVar9 = (ulong)uVar8;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    uVar4 = (uint)uVar9;
    uVar9 = (ulong)(uVar4 - 1);
    uVar14 = uVar8 & (int)uVar8 >> 0x1f;
    if ((int)uVar4 < 1) goto LAB_003029fc;
  } while (*(long *)(*unaff_x23 + lVar12) == 0);
  uVar14 = uVar4;
LAB_003029fc:
  *(uint *)(unaff_x23 + 1) = uVar14;
  *(undefined4 *)(unaff_x23 + 2) = 0;
  uVar3 = func_0x002ab9dc();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  uVar8 = *(uint *)(unaff_x24 + 1);
  uVar9 = (ulong)uVar8;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    iVar2 = (int)uVar9;
    uVar9 = (ulong)(iVar2 - 1);
    if (iVar2 < 1) {
      *(uint *)(unaff_x24 + 1) = uVar8 & (int)uVar8 >> 0x1f;
      if (-1 < (int)uVar8) {
        *(undefined4 *)(unaff_x24 + 2) = 0;
      }
      goto LAB_00302af8;
    }
  } while (*(long *)(*unaff_x24 + lVar12) == 0);
  *(int *)(unaff_x24 + 1) = iVar2;
LAB_00302af8:
  uVar3 = func_0x0029b864();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  uVar8 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)uVar8;
  lVar13 = *unaff_x20;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    uVar4 = (uint)uVar9;
    uVar9 = (ulong)(uVar4 - 1);
    uVar14 = uVar8 & (int)uVar8 >> 0x1f;
    if ((int)uVar4 < 1) goto LAB_00302b38;
  } while (*(long *)(lVar13 + lVar12) == 0);
  uVar14 = uVar4;
LAB_00302b38:
  *(uint *)(unaff_x20 + 1) = uVar14;
  *(undefined4 *)(unaff_x20 + 2) = 0;
  uVar9 = (ulong)(int)uVar14;
  iVar2 = func_0x0029d99c(lVar13,uVar9,*unaff_x21,(long)*(int *)(unaff_x21 + 1));
  if (iVar2 < 0) goto LAB_00302d2c;
  uVar3 = func_0x0029b864();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  uVar8 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)uVar8;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    iVar2 = (int)uVar9;
    uVar9 = (ulong)(iVar2 - 1);
    if (iVar2 < 1) {
      *(uint *)(unaff_x20 + 1) = uVar8 & (int)uVar8 >> 0x1f;
      if (-1 < (int)uVar8) {
        *(undefined4 *)(unaff_x20 + 2) = 0;
      }
      goto code_r0x00302bb4;
    }
  } while (*(long *)(*unaff_x20 + lVar12) == 0);
  *(int *)(unaff_x20 + 1) = iVar2;
code_r0x00302bb4:
  uVar3 = func_0x0029b0e4();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  lVar13 = *unaff_x20;
  uVar14 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)(int)uVar14;
  iVar2 = func_0x0029d99c(lVar13,uVar9,*unaff_x21,(long)*(int *)(unaff_x21 + 1));
  if (iVar2 < 0) goto LAB_00302d2c;
  uVar3 = func_0x0029b864();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  uVar8 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)uVar8;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    iVar2 = (int)uVar9;
    if (iVar2 < 1) {
      *(uint *)(unaff_x20 + 1) = uVar8 & (int)uVar8 >> 0x1f;
      if (-1 < (int)uVar8) {
        *(undefined4 *)(unaff_x20 + 2) = 0;
      }
      goto code_r0x00302c44;
    }
    uVar9 = (ulong)(iVar2 - 1);
  } while (*(long *)(*unaff_x20 + lVar12) == 0);
  *(int *)(unaff_x20 + 1) = iVar2;
code_r0x00302c44:
  uVar3 = func_0x0029b0e4();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  lVar13 = *unaff_x20;
  uVar14 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)(int)uVar14;
  iVar2 = func_0x0029d99c(lVar13,uVar9,*unaff_x21,(long)*(int *)(unaff_x21 + 1));
  if (iVar2 < 0) goto LAB_00302d2c;
  uVar3 = func_0x0029b864();
  if ((int)uVar3 == 0) goto LAB_00302a74;
  uVar14 = *(uint *)(unaff_x20 + 1);
  uVar9 = (ulong)uVar14;
  uVar8 = uVar14 & (int)uVar14 >> 0x1f;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    iVar2 = (int)uVar9;
    if (iVar2 < 1) goto code_r0x00302cd0;
    uVar9 = (ulong)(iVar2 - 1);
  } while (*(long *)(*unaff_x20 + lVar12) == 0);
  *(int *)(unaff_x20 + 1) = iVar2;
  do {
    uVar3 = func_0x0029b0e4();
    if ((int)uVar3 != 0) {
      lVar13 = *unaff_x20;
      uVar14 = *(uint *)(unaff_x20 + 1);
      uVar9 = (ulong)(int)uVar14;
      iVar2 = func_0x0029d99c(lVar13,uVar9,*unaff_x21,(long)*(int *)(unaff_x21 + 1));
      if (iVar2 < 0) {
LAB_00302d2c:
        if (uVar14 == 0) {
LAB_00302dc4:
          uVar5 = 0;
        }
        else {
          if (uVar9 < 8) {
            uVar6 = 0;
            uVar10 = 0;
LAB_00302da0:
            lVar12 = uVar9 - uVar6;
            puVar7 = (ulong *)(lVar13 + uVar6 * 8);
            do {
              uVar10 = *puVar7 | uVar10;
              lVar12 = lVar12 + -1;
              puVar7 = puVar7 + 1;
            } while (lVar12 != 0);
          }
          else {
            uVar6 = uVar9 & 0xfffffffffffffff8;
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
            uVar3 = 0;
            uVar57 = 0;
            uVar66 = 0;
            uVar75 = 0;
            puVar11 = (undefined8 *)(lVar13 + 0x20);
            uVar10 = uVar6;
            do {
              uVar84 = puVar11[-3];
              uVar83 = puVar11[-4];
              uVar86 = puVar11[-1];
              uVar85 = puVar11[-2];
              uVar88 = puVar11[1];
              uVar87 = *puVar11;
              uVar90 = puVar11[3];
              uVar89 = puVar11[2];
              bVar15 = (byte)uVar83 | bVar15;
              bVar16 = (byte)((ulong)uVar83 >> 8) | bVar16;
              bVar17 = (byte)((ulong)uVar83 >> 0x10) | bVar17;
              bVar18 = (byte)((ulong)uVar83 >> 0x18) | bVar18;
              bVar19 = (byte)((ulong)uVar83 >> 0x20) | bVar19;
              bVar20 = (byte)((ulong)uVar83 >> 0x28) | bVar20;
              bVar21 = (byte)((ulong)uVar83 >> 0x30) | bVar21;
              bVar22 = (byte)((ulong)uVar83 >> 0x38) | bVar22;
              bVar23 = (byte)uVar84 | bVar23;
              bVar24 = (byte)((ulong)uVar84 >> 8) | bVar24;
              bVar25 = (byte)((ulong)uVar84 >> 0x10) | bVar25;
              bVar26 = (byte)((ulong)uVar84 >> 0x18) | bVar26;
              bVar27 = (byte)((ulong)uVar84 >> 0x20) | bVar27;
              bVar28 = (byte)((ulong)uVar84 >> 0x28) | bVar28;
              bVar29 = (byte)((ulong)uVar84 >> 0x30) | bVar29;
              bVar30 = (byte)((ulong)uVar84 >> 0x38) | bVar30;
              bVar31 = (byte)uVar85 | bVar31;
              bVar33 = (byte)((ulong)uVar85 >> 8) | bVar33;
              bVar34 = (byte)((ulong)uVar85 >> 0x10) | bVar34;
              bVar35 = (byte)((ulong)uVar85 >> 0x18) | bVar35;
              bVar36 = (byte)((ulong)uVar85 >> 0x20) | bVar36;
              bVar37 = (byte)((ulong)uVar85 >> 0x28) | bVar37;
              bVar38 = (byte)((ulong)uVar85 >> 0x30) | bVar38;
              bVar39 = (byte)((ulong)uVar85 >> 0x38) | bVar39;
              bVar40 = (byte)uVar86 | bVar40;
              bVar41 = (byte)((ulong)uVar86 >> 8) | bVar41;
              bVar42 = (byte)((ulong)uVar86 >> 0x10) | bVar42;
              bVar43 = (byte)((ulong)uVar86 >> 0x18) | bVar43;
              bVar44 = (byte)((ulong)uVar86 >> 0x20) | bVar44;
              bVar45 = (byte)((ulong)uVar86 >> 0x28) | bVar45;
              bVar46 = (byte)((ulong)uVar86 >> 0x30) | bVar46;
              bVar47 = (byte)((ulong)uVar86 >> 0x38) | bVar47;
              bVar48 = (byte)uVar87 | (byte)uVar3;
              bVar49 = (byte)((ulong)uVar87 >> 8) | (byte)((ulong)uVar3 >> 8);
              bVar50 = (byte)((ulong)uVar87 >> 0x10) | (byte)((ulong)uVar3 >> 0x10);
              bVar51 = (byte)((ulong)uVar87 >> 0x18) | (byte)((ulong)uVar3 >> 0x18);
              bVar52 = (byte)((ulong)uVar87 >> 0x20) | (byte)((ulong)uVar3 >> 0x20);
              bVar53 = (byte)((ulong)uVar87 >> 0x28) | (byte)((ulong)uVar3 >> 0x28);
              bVar54 = (byte)((ulong)uVar87 >> 0x30) | (byte)((ulong)uVar3 >> 0x30);
              bVar55 = (byte)((ulong)uVar87 >> 0x38) | (byte)((ulong)uVar3 >> 0x38);
              uVar3 = CONCAT17(bVar55,CONCAT16(bVar54,CONCAT15(bVar53,CONCAT14(bVar52,CONCAT13(
                                                  bVar51,CONCAT12(bVar50,CONCAT11(bVar49,bVar48)))))
                                              ));
              bVar56 = (byte)uVar88 | (byte)uVar57;
              bVar58 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar57 >> 8);
              bVar59 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar57 >> 0x10);
              bVar60 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar57 >> 0x18);
              bVar61 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar57 >> 0x20);
              bVar62 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar57 >> 0x28);
              bVar63 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar57 >> 0x30);
              bVar64 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar57 >> 0x38);
              uVar57 = CONCAT17(bVar64,CONCAT16(bVar63,CONCAT15(bVar62,CONCAT14(bVar61,CONCAT13(
                                                  bVar60,CONCAT12(bVar59,CONCAT11(bVar58,bVar56)))))
                                               ));
              bVar65 = (byte)uVar89 | (byte)uVar66;
              bVar67 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar66 >> 8);
              bVar68 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar66 >> 0x10);
              bVar69 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar66 >> 0x18);
              bVar70 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar66 >> 0x20);
              bVar71 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar66 >> 0x28);
              bVar72 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar66 >> 0x30);
              bVar73 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar66 >> 0x38);
              uVar66 = CONCAT17(bVar73,CONCAT16(bVar72,CONCAT15(bVar71,CONCAT14(bVar70,CONCAT13(
                                                  bVar69,CONCAT12(bVar68,CONCAT11(bVar67,bVar65)))))
                                               ));
              bVar74 = (byte)uVar90 | (byte)uVar75;
              bVar76 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar75 >> 8);
              bVar77 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar75 >> 0x10);
              bVar78 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar75 >> 0x18);
              bVar79 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar75 >> 0x20);
              bVar80 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar75 >> 0x28);
              bVar81 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar75 >> 0x30);
              bVar82 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar75 >> 0x38);
              uVar75 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(
                                                  bVar78,CONCAT12(bVar77,CONCAT11(bVar76,bVar74)))))
                                               ));
              uVar10 = uVar10 - 8;
              puVar11 = puVar11 + 8;
            } while (uVar10 != 0);
            bVar65 = bVar65 | bVar48 | bVar31 | bVar15;
            bVar67 = bVar67 | bVar49 | bVar33 | bVar16;
            bVar68 = bVar68 | bVar50 | bVar34 | bVar17;
            bVar69 = bVar69 | bVar51 | bVar35 | bVar18;
            bVar70 = bVar70 | bVar52 | bVar36 | bVar19;
            bVar71 = bVar71 | bVar53 | bVar37 | bVar20;
            bVar72 = bVar72 | bVar54 | bVar38 | bVar21;
            bVar73 = bVar73 | bVar55 | bVar39 | bVar22;
            bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
            bVar76 = bVar76 | bVar58 | bVar41 | bVar24;
            bVar77 = bVar77 | bVar59 | bVar42 | bVar25;
            bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
            bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
            bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
            bVar81 = bVar81 | bVar63 | bVar46 | bVar29;
            bVar82 = bVar82 | bVar64 | bVar47 | bVar30;
            auVar32[1] = bVar67;
            auVar32[0] = bVar65;
            auVar32[2] = bVar68;
            auVar32[3] = bVar69;
            auVar32[4] = bVar70;
            auVar32[5] = bVar71;
            auVar32[6] = bVar72;
            auVar32[7] = bVar73;
            auVar32[8] = bVar74;
            auVar32[9] = bVar76;
            auVar32[10] = bVar77;
            auVar32[0xb] = bVar78;
            auVar32[0xc] = bVar79;
            auVar32[0xd] = bVar80;
            auVar32[0xe] = bVar81;
            auVar32[0xf] = bVar82;
            auVar1[1] = bVar67;
            auVar1[0] = bVar65;
            auVar1[2] = bVar68;
            auVar1[3] = bVar69;
            auVar1[4] = bVar70;
            auVar1[5] = bVar71;
            auVar1[6] = bVar72;
            auVar1[7] = bVar73;
            auVar1[8] = bVar74;
            auVar1[9] = bVar76;
            auVar1[10] = bVar77;
            auVar1[0xb] = bVar78;
            auVar1[0xc] = bVar79;
            auVar1[0xd] = bVar80;
            auVar1[0xe] = bVar81;
            auVar1[0xf] = bVar82;
            auVar32 = NEON_ext(auVar32,auVar1,8,1);
            uVar10 = CONCAT17(bVar73 | auVar32[7],
                              CONCAT16(bVar72 | auVar32[6],
                                       CONCAT15(bVar71 | auVar32[5],
                                                CONCAT14(bVar70 | auVar32[4],
                                                         CONCAT13(bVar69 | auVar32[3],
                                                                  CONCAT12(bVar68 | auVar32[2],
                                                                           CONCAT11(bVar67 | auVar32
                                                  [1],bVar65 | auVar32[0])))))));
            if (uVar9 != uVar6) goto LAB_00302da0;
          }
          if (uVar10 == 0) goto LAB_00302dc4;
          uVar5 = *(undefined4 *)(unaff_x22 + 0x10);
        }
        *(undefined4 *)(unaff_x20 + 2) = uVar5;
        *(uint *)(unaff_x23 + 2) = *(uint *)(unaff_x21 + 2) ^ *(uint *)(unaff_x22 + 0x10);
        uVar3 = 1;
      }
      else {
        func_0x0028f83c(3,0,0x65,"/aws-lc/crypto/fipsmodule/bn/exponentiation.c",0x172);
        uVar3 = 0;
      }
    }
LAB_00302a74:
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar12 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar12;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar12 * 8);
      if (*(char *)(unaff_x19 + 0x28) != '\0') {
        return;
      }
      if (*(long *)(unaff_x19 + 0x10) != 0) {
        lVar12 = *(long *)(unaff_x19 + 0x10) + -1;
        *(long *)(unaff_x19 + 0x10) = lVar12;
        *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar12 * 8);
        return;
      }
      uVar3 = func_0x0079db4c(uVar3);
    }
    func_0x0079db4c(uVar3);
    uVar8 = extraout_w9;
    uVar14 = extraout_w8;
code_r0x00302cd0:
    *(uint *)(unaff_x20 + 1) = uVar8;
    if (-1 < (int)uVar14) {
      *(undefined4 *)(unaff_x20 + 2) = 0;
    }
  } while( true );
}

