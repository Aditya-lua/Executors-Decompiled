
void FUN_00302ccc(undefined8 param_1)

{
  undefined1 auVar1 [16];
  int iVar2;
  int extraout_w8;
  undefined4 uVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined4 extraout_w9;
  ulong uVar7;
  undefined8 *puVar8;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lVar9;
  ulong uVar10;
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
  byte bVar25;
  byte bVar26;
  byte bVar27;
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
  undefined1 auVar28 [16];
  byte bVar44;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  undefined8 uVar45;
  byte bVar52;
  byte bVar53;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  undefined8 uVar54;
  byte bVar61;
  byte bVar62;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  undefined8 uVar63;
  byte bVar70;
  byte bVar71;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  undefined8 uVar72;
  byte bVar79;
  undefined8 uVar80;
  undefined8 uVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  
  do {
    func_0x0079db4c(param_1);
    *(undefined4 *)(unaff_x20 + 1) = extraout_w9;
    if (-1 < extraout_w8) {
      *(undefined4 *)(unaff_x20 + 2) = 0;
    }
    param_1 = func_0x0029b0e4();
    if ((int)param_1 != 0) {
      lVar9 = *unaff_x20;
      lVar4 = unaff_x20[1];
      uVar10 = (ulong)(int)lVar4;
      iVar2 = func_0x0029d99c(lVar9,uVar10,*unaff_x21,(long)*(int *)(unaff_x21 + 1));
      if (iVar2 < 0) {
        if ((int)lVar4 == 0) {
LAB_00302dc4:
          uVar3 = 0;
        }
        else {
          if (uVar10 < 8) {
            uVar5 = 0;
            uVar7 = 0;
LAB_00302da0:
            lVar4 = uVar10 - uVar5;
            puVar6 = (ulong *)(lVar9 + uVar5 * 8);
            do {
              uVar7 = *puVar6 | uVar7;
              lVar4 = lVar4 + -1;
              puVar6 = puVar6 + 1;
            } while (lVar4 != 0);
          }
          else {
            uVar5 = uVar10 & 0xfffffffffffffff8;
            bVar11 = 0;
            bVar12 = 0;
            bVar13 = 0;
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
            uVar45 = 0;
            uVar54 = 0;
            uVar63 = 0;
            uVar72 = 0;
            puVar8 = (undefined8 *)(lVar9 + 0x20);
            uVar7 = uVar5;
            do {
              uVar81 = puVar8[-3];
              uVar80 = puVar8[-4];
              uVar83 = puVar8[-1];
              uVar82 = puVar8[-2];
              uVar85 = puVar8[1];
              uVar84 = *puVar8;
              uVar87 = puVar8[3];
              uVar86 = puVar8[2];
              bVar11 = (byte)uVar80 | bVar11;
              bVar12 = (byte)((ulong)uVar80 >> 8) | bVar12;
              bVar13 = (byte)((ulong)uVar80 >> 0x10) | bVar13;
              bVar14 = (byte)((ulong)uVar80 >> 0x18) | bVar14;
              bVar15 = (byte)((ulong)uVar80 >> 0x20) | bVar15;
              bVar16 = (byte)((ulong)uVar80 >> 0x28) | bVar16;
              bVar17 = (byte)((ulong)uVar80 >> 0x30) | bVar17;
              bVar18 = (byte)((ulong)uVar80 >> 0x38) | bVar18;
              bVar19 = (byte)uVar81 | bVar19;
              bVar20 = (byte)((ulong)uVar81 >> 8) | bVar20;
              bVar21 = (byte)((ulong)uVar81 >> 0x10) | bVar21;
              bVar22 = (byte)((ulong)uVar81 >> 0x18) | bVar22;
              bVar23 = (byte)((ulong)uVar81 >> 0x20) | bVar23;
              bVar24 = (byte)((ulong)uVar81 >> 0x28) | bVar24;
              bVar25 = (byte)((ulong)uVar81 >> 0x30) | bVar25;
              bVar26 = (byte)((ulong)uVar81 >> 0x38) | bVar26;
              bVar27 = (byte)uVar82 | bVar27;
              bVar29 = (byte)((ulong)uVar82 >> 8) | bVar29;
              bVar30 = (byte)((ulong)uVar82 >> 0x10) | bVar30;
              bVar31 = (byte)((ulong)uVar82 >> 0x18) | bVar31;
              bVar32 = (byte)((ulong)uVar82 >> 0x20) | bVar32;
              bVar33 = (byte)((ulong)uVar82 >> 0x28) | bVar33;
              bVar34 = (byte)((ulong)uVar82 >> 0x30) | bVar34;
              bVar35 = (byte)((ulong)uVar82 >> 0x38) | bVar35;
              bVar36 = (byte)uVar83 | bVar36;
              bVar37 = (byte)((ulong)uVar83 >> 8) | bVar37;
              bVar38 = (byte)((ulong)uVar83 >> 0x10) | bVar38;
              bVar39 = (byte)((ulong)uVar83 >> 0x18) | bVar39;
              bVar40 = (byte)((ulong)uVar83 >> 0x20) | bVar40;
              bVar41 = (byte)((ulong)uVar83 >> 0x28) | bVar41;
              bVar42 = (byte)((ulong)uVar83 >> 0x30) | bVar42;
              bVar43 = (byte)((ulong)uVar83 >> 0x38) | bVar43;
              bVar44 = (byte)uVar84 | (byte)uVar45;
              bVar46 = (byte)((ulong)uVar84 >> 8) | (byte)((ulong)uVar45 >> 8);
              bVar47 = (byte)((ulong)uVar84 >> 0x10) | (byte)((ulong)uVar45 >> 0x10);
              bVar48 = (byte)((ulong)uVar84 >> 0x18) | (byte)((ulong)uVar45 >> 0x18);
              bVar49 = (byte)((ulong)uVar84 >> 0x20) | (byte)((ulong)uVar45 >> 0x20);
              bVar50 = (byte)((ulong)uVar84 >> 0x28) | (byte)((ulong)uVar45 >> 0x28);
              bVar51 = (byte)((ulong)uVar84 >> 0x30) | (byte)((ulong)uVar45 >> 0x30);
              bVar52 = (byte)((ulong)uVar84 >> 0x38) | (byte)((ulong)uVar45 >> 0x38);
              uVar45 = CONCAT17(bVar52,CONCAT16(bVar51,CONCAT15(bVar50,CONCAT14(bVar49,CONCAT13(
                                                  bVar48,CONCAT12(bVar47,CONCAT11(bVar46,bVar44)))))
                                               ));
              bVar53 = (byte)uVar85 | (byte)uVar54;
              bVar55 = (byte)((ulong)uVar85 >> 8) | (byte)((ulong)uVar54 >> 8);
              bVar56 = (byte)((ulong)uVar85 >> 0x10) | (byte)((ulong)uVar54 >> 0x10);
              bVar57 = (byte)((ulong)uVar85 >> 0x18) | (byte)((ulong)uVar54 >> 0x18);
              bVar58 = (byte)((ulong)uVar85 >> 0x20) | (byte)((ulong)uVar54 >> 0x20);
              bVar59 = (byte)((ulong)uVar85 >> 0x28) | (byte)((ulong)uVar54 >> 0x28);
              bVar60 = (byte)((ulong)uVar85 >> 0x30) | (byte)((ulong)uVar54 >> 0x30);
              bVar61 = (byte)((ulong)uVar85 >> 0x38) | (byte)((ulong)uVar54 >> 0x38);
              uVar54 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(
                                                  bVar57,CONCAT12(bVar56,CONCAT11(bVar55,bVar53)))))
                                               ));
              bVar62 = (byte)uVar86 | (byte)uVar63;
              bVar64 = (byte)((ulong)uVar86 >> 8) | (byte)((ulong)uVar63 >> 8);
              bVar65 = (byte)((ulong)uVar86 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
              bVar66 = (byte)((ulong)uVar86 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
              bVar67 = (byte)((ulong)uVar86 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
              bVar68 = (byte)((ulong)uVar86 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
              bVar69 = (byte)((ulong)uVar86 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
              bVar70 = (byte)((ulong)uVar86 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
              uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(
                                                  bVar66,CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))
                                               ));
              bVar71 = (byte)uVar87 | (byte)uVar72;
              bVar73 = (byte)((ulong)uVar87 >> 8) | (byte)((ulong)uVar72 >> 8);
              bVar74 = (byte)((ulong)uVar87 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
              bVar75 = (byte)((ulong)uVar87 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
              bVar76 = (byte)((ulong)uVar87 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
              bVar77 = (byte)((ulong)uVar87 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
              bVar78 = (byte)((ulong)uVar87 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
              bVar79 = (byte)((ulong)uVar87 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
              uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(
                                                  bVar75,CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))
                                               ));
              uVar7 = uVar7 - 8;
              puVar8 = puVar8 + 8;
            } while (uVar7 != 0);
            bVar62 = bVar62 | bVar44 | bVar27 | bVar11;
            bVar64 = bVar64 | bVar46 | bVar29 | bVar12;
            bVar65 = bVar65 | bVar47 | bVar30 | bVar13;
            bVar66 = bVar66 | bVar48 | bVar31 | bVar14;
            bVar67 = bVar67 | bVar49 | bVar32 | bVar15;
            bVar68 = bVar68 | bVar50 | bVar33 | bVar16;
            bVar69 = bVar69 | bVar51 | bVar34 | bVar17;
            bVar70 = bVar70 | bVar52 | bVar35 | bVar18;
            bVar71 = bVar71 | bVar53 | bVar36 | bVar19;
            bVar73 = bVar73 | bVar55 | bVar37 | bVar20;
            bVar74 = bVar74 | bVar56 | bVar38 | bVar21;
            bVar75 = bVar75 | bVar57 | bVar39 | bVar22;
            bVar76 = bVar76 | bVar58 | bVar40 | bVar23;
            bVar77 = bVar77 | bVar59 | bVar41 | bVar24;
            bVar78 = bVar78 | bVar60 | bVar42 | bVar25;
            bVar79 = bVar79 | bVar61 | bVar43 | bVar26;
            auVar28[1] = bVar64;
            auVar28[0] = bVar62;
            auVar28[2] = bVar65;
            auVar28[3] = bVar66;
            auVar28[4] = bVar67;
            auVar28[5] = bVar68;
            auVar28[6] = bVar69;
            auVar28[7] = bVar70;
            auVar28[8] = bVar71;
            auVar28[9] = bVar73;
            auVar28[10] = bVar74;
            auVar28[0xb] = bVar75;
            auVar28[0xc] = bVar76;
            auVar28[0xd] = bVar77;
            auVar28[0xe] = bVar78;
            auVar28[0xf] = bVar79;
            auVar1[1] = bVar64;
            auVar1[0] = bVar62;
            auVar1[2] = bVar65;
            auVar1[3] = bVar66;
            auVar1[4] = bVar67;
            auVar1[5] = bVar68;
            auVar1[6] = bVar69;
            auVar1[7] = bVar70;
            auVar1[8] = bVar71;
            auVar1[9] = bVar73;
            auVar1[10] = bVar74;
            auVar1[0xb] = bVar75;
            auVar1[0xc] = bVar76;
            auVar1[0xd] = bVar77;
            auVar1[0xe] = bVar78;
            auVar1[0xf] = bVar79;
            auVar28 = NEON_ext(auVar28,auVar1,8,1);
            uVar7 = CONCAT17(bVar70 | auVar28[7],
                             CONCAT16(bVar69 | auVar28[6],
                                      CONCAT15(bVar68 | auVar28[5],
                                               CONCAT14(bVar67 | auVar28[4],
                                                        CONCAT13(bVar66 | auVar28[3],
                                                                 CONCAT12(bVar65 | auVar28[2],
                                                                          CONCAT11(bVar64 | auVar28[
                                                  1],bVar62 | auVar28[0])))))));
            if (uVar10 != uVar5) goto LAB_00302da0;
          }
          if (uVar7 == 0) goto LAB_00302dc4;
          uVar3 = *(undefined4 *)(unaff_x22 + 0x10);
        }
        *(undefined4 *)(unaff_x20 + 2) = uVar3;
        *(uint *)(unaff_x23 + 0x10) = *(uint *)(unaff_x21 + 2) ^ *(uint *)(unaff_x22 + 0x10);
        param_1 = 1;
      }
      else {
        func_0x0028f83c(3,0,0x65,"/aws-lc/crypto/fipsmodule/bn/exponentiation.c",0x172);
        param_1 = 0;
      }
    }
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar4;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
      if (*(char *)(unaff_x19 + 0x28) != '\0') {
        return;
      }
      if (*(long *)(unaff_x19 + 0x10) != 0) {
        lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
        *(long *)(unaff_x19 + 0x10) = lVar4;
        *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
        return;
      }
      param_1 = func_0x0079db4c(param_1);
    }
  } while( true );
}

