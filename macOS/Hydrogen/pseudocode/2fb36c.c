
undefined8
FUN_002fb36c(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  bool in_ZR;
  int iVar3;
  undefined8 uVar4;
  byte *in_x9;
  ulong *puVar5;
  int in_w10;
  int in_w11;
  long lVar6;
  ulong in_x12;
  ulong uVar7;
  uint in_w13;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  uint uVar12;
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
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  undefined8 uVar41;
  byte bVar48;
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
  ulong uVar67;
  ulong uVar68;
  ulong uVar69;
  ulong uVar70;
  ulong uVar71;
  ulong uVar72;
  ulong uVar73;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  uint in_stack_00000010;
  int iStack0000000000000018;
  uint uStack000000000000001c;
  
  uVar11 = in_x12 >> 0x10;
  uVar7 = uVar11;
  if (uVar11 == 0) {
    uVar7 = in_x12;
  }
  uVar8 = uVar7 >> 8;
  if (uVar7 < 0x100) {
    uVar8 = uVar7;
  }
  uVar9 = uVar8 >> 4;
  if (uVar8 < 0x10) {
    uVar9 = uVar8;
  }
  uVar10 = uVar9 >> 2;
  if (uVar9 < 4) {
    uVar10 = uVar9;
  }
  uVar12 = in_w13 | in_w11 << 6 | (uint)!in_ZR << 5 | (uint)(uVar11 != 0) << 4 |
           (uint)(0xff < uVar7) << 3 | (uint)(0xf < uVar8) << 2 | (uint)(3 < uVar9) << 1;
  if (1 < uVar10) {
    uVar12 = uVar12 + 1;
  }
  if (0x10 < uVar12) {
    lVar6 = param_1 * 8;
    uVar7 = param_1;
    do {
      lVar6 = lVar6 + -8;
      iVar3 = (int)uVar7;
      uVar7 = (ulong)(iVar3 - 1);
      if (iVar3 < 1) {
        if ((int)param_1 < 0) goto LAB_002fb404;
        goto LAB_002fb48c;
      }
    } while (*(long *)(in_x9 + lVar6) == 0);
    in_w10 = iVar3;
LAB_002fb404:
    uVar11 = *(ulong *)(in_x9 + (long)(in_w10 + -1) * 8);
    uVar8 = uVar11 >> 0x20;
    uVar7 = uVar8;
    if (uVar8 == 0) {
      uVar7 = uVar11;
    }
    uVar10 = uVar7 >> 0x10;
    uVar9 = uVar10;
    if (uVar10 == 0) {
      uVar9 = uVar7;
    }
    uVar7 = uVar9 >> 8;
    if (uVar9 < 0x100) {
      uVar7 = uVar9;
    }
    uVar67 = uVar7 >> 4;
    if (uVar7 < 0x10) {
      uVar67 = uVar7;
    }
    uVar68 = uVar67 >> 2;
    if (uVar67 < 4) {
      uVar68 = uVar67;
    }
    uVar12 = (uint)(uVar11 != 0) | (in_w10 + -1) * 0x40 | (uint)(uVar8 != 0) << 5 |
             (uint)(uVar10 != 0) << 4 | (uint)(0xff < uVar9) << 3 | (uint)(0xf < uVar7) << 2 |
             (uint)(3 < uVar67) << 1;
    if (1 < uVar68) {
      uVar12 = uVar12 + 1;
    }
    if (uVar12 < 0x101) {
LAB_002fb48c:
      puVar13 = *(undefined8 **)(unaff_x20 + 8);
      if (0 < *(int *)(puVar13 + 1)) {
        uVar4 = 0x60a;
        if ((((*(byte *)*puVar13 & 1) == 0) || ((int)param_1 < 1)) || ((*in_x9 & 1) == 0))
        goto LAB_002fb5d4;
        func_0x00373e9c(0xa29658,&DAT_0031dcd4,param_4,param_5,0x60a);
        iVar3 = func_0x002a6fdc(&uStack0000000000000008,puVar13,0xa3a560);
        uVar4 = 0x60a;
        if (((iVar3 == 0) || (iStack0000000000000018 != 0)) || (in_stack_00000010 == 0))
        goto LAB_002fb5d4;
        uVar7 = *uStack0000000000000008 ^ 1;
        if (1 < (int)in_stack_00000010) {
          if (in_stack_00000010 < 9) {
            uVar11 = 1;
          }
          else {
            uVar8 = (ulong)in_stack_00000010 - 1;
            uVar9 = uVar8 & 0xfffffffffffffff8;
            uVar11 = uVar9 | 1;
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
            auVar31._8_8_ = 0;
            auVar31._0_8_ = uVar7;
            uVar4 = 0;
            uVar41 = 0;
            uVar50 = 0;
            uVar59 = 0;
            puVar5 = uStack0000000000000008 + 5;
            uVar7 = uVar9;
            do {
              uVar67 = puVar5[-3];
              uVar10 = puVar5[-4];
              uVar69 = puVar5[-1];
              uVar68 = puVar5[-2];
              uVar71 = puVar5[1];
              uVar70 = *puVar5;
              uVar73 = puVar5[3];
              uVar72 = puVar5[2];
              auVar30[0] = (byte)uVar10 | auVar31[0];
              auVar30[1] = (byte)(uVar10 >> 8) | auVar31[1];
              auVar30[2] = (byte)(uVar10 >> 0x10) | auVar31[2];
              auVar30[3] = (byte)(uVar10 >> 0x18) | auVar31[3];
              auVar30[4] = (byte)(uVar10 >> 0x20) | auVar31[4];
              auVar30[5] = (byte)(uVar10 >> 0x28) | auVar31[5];
              auVar30[6] = (byte)(uVar10 >> 0x30) | auVar31[6];
              auVar30[7] = (byte)(uVar10 >> 0x38) | auVar31[7];
              auVar30[8] = (byte)uVar67 | auVar31[8];
              auVar30[9] = (byte)(uVar67 >> 8) | auVar31[9];
              auVar30[10] = (byte)(uVar67 >> 0x10) | auVar31[10];
              auVar30[0xb] = (byte)(uVar67 >> 0x18) | auVar31[0xb];
              auVar30[0xc] = (byte)(uVar67 >> 0x20) | auVar31[0xc];
              auVar30[0xd] = (byte)(uVar67 >> 0x28) | auVar31[0xd];
              auVar30[0xe] = (byte)(uVar67 >> 0x30) | auVar31[0xe];
              auVar30[0xf] = (byte)(uVar67 >> 0x38) | auVar31[0xf];
              bVar14 = (byte)uVar68 | bVar14;
              bVar15 = (byte)(uVar68 >> 8) | bVar15;
              bVar16 = (byte)(uVar68 >> 0x10) | bVar16;
              bVar17 = (byte)(uVar68 >> 0x18) | bVar17;
              bVar18 = (byte)(uVar68 >> 0x20) | bVar18;
              bVar19 = (byte)(uVar68 >> 0x28) | bVar19;
              bVar20 = (byte)(uVar68 >> 0x30) | bVar20;
              bVar21 = (byte)(uVar68 >> 0x38) | bVar21;
              bVar22 = (byte)uVar69 | bVar22;
              bVar23 = (byte)(uVar69 >> 8) | bVar23;
              bVar24 = (byte)(uVar69 >> 0x10) | bVar24;
              bVar25 = (byte)(uVar69 >> 0x18) | bVar25;
              bVar26 = (byte)(uVar69 >> 0x20) | bVar26;
              bVar27 = (byte)(uVar69 >> 0x28) | bVar27;
              bVar28 = (byte)(uVar69 >> 0x30) | bVar28;
              bVar29 = (byte)(uVar69 >> 0x38) | bVar29;
              bVar32 = (byte)uVar70 | (byte)uVar4;
              bVar33 = (byte)(uVar70 >> 8) | (byte)((ulong)uVar4 >> 8);
              bVar34 = (byte)(uVar70 >> 0x10) | (byte)((ulong)uVar4 >> 0x10);
              bVar35 = (byte)(uVar70 >> 0x18) | (byte)((ulong)uVar4 >> 0x18);
              bVar36 = (byte)(uVar70 >> 0x20) | (byte)((ulong)uVar4 >> 0x20);
              bVar37 = (byte)(uVar70 >> 0x28) | (byte)((ulong)uVar4 >> 0x28);
              bVar38 = (byte)(uVar70 >> 0x30) | (byte)((ulong)uVar4 >> 0x30);
              bVar39 = (byte)(uVar70 >> 0x38) | (byte)((ulong)uVar4 >> 0x38);
              uVar4 = CONCAT17(bVar39,CONCAT16(bVar38,CONCAT15(bVar37,CONCAT14(bVar36,CONCAT13(
                                                  bVar35,CONCAT12(bVar34,CONCAT11(bVar33,bVar32)))))
                                              ));
              bVar40 = (byte)uVar71 | (byte)uVar41;
              bVar42 = (byte)(uVar71 >> 8) | (byte)((ulong)uVar41 >> 8);
              bVar43 = (byte)(uVar71 >> 0x10) | (byte)((ulong)uVar41 >> 0x10);
              bVar44 = (byte)(uVar71 >> 0x18) | (byte)((ulong)uVar41 >> 0x18);
              bVar45 = (byte)(uVar71 >> 0x20) | (byte)((ulong)uVar41 >> 0x20);
              bVar46 = (byte)(uVar71 >> 0x28) | (byte)((ulong)uVar41 >> 0x28);
              bVar47 = (byte)(uVar71 >> 0x30) | (byte)((ulong)uVar41 >> 0x30);
              bVar48 = (byte)(uVar71 >> 0x38) | (byte)((ulong)uVar41 >> 0x38);
              uVar41 = CONCAT17(bVar48,CONCAT16(bVar47,CONCAT15(bVar46,CONCAT14(bVar45,CONCAT13(
                                                  bVar44,CONCAT12(bVar43,CONCAT11(bVar42,bVar40)))))
                                               ));
              bVar49 = (byte)uVar72 | (byte)uVar50;
              bVar51 = (byte)(uVar72 >> 8) | (byte)((ulong)uVar50 >> 8);
              bVar52 = (byte)(uVar72 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
              bVar53 = (byte)(uVar72 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
              bVar54 = (byte)(uVar72 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
              bVar55 = (byte)(uVar72 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
              bVar56 = (byte)(uVar72 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
              bVar57 = (byte)(uVar72 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
              uVar50 = CONCAT17(bVar57,CONCAT16(bVar56,CONCAT15(bVar55,CONCAT14(bVar54,CONCAT13(
                                                  bVar53,CONCAT12(bVar52,CONCAT11(bVar51,bVar49)))))
                                               ));
              bVar58 = (byte)uVar73 | (byte)uVar59;
              bVar60 = (byte)(uVar73 >> 8) | (byte)((ulong)uVar59 >> 8);
              bVar61 = (byte)(uVar73 >> 0x10) | (byte)((ulong)uVar59 >> 0x10);
              bVar62 = (byte)(uVar73 >> 0x18) | (byte)((ulong)uVar59 >> 0x18);
              bVar63 = (byte)(uVar73 >> 0x20) | (byte)((ulong)uVar59 >> 0x20);
              bVar64 = (byte)(uVar73 >> 0x28) | (byte)((ulong)uVar59 >> 0x28);
              bVar65 = (byte)(uVar73 >> 0x30) | (byte)((ulong)uVar59 >> 0x30);
              bVar66 = (byte)(uVar73 >> 0x38) | (byte)((ulong)uVar59 >> 0x38);
              uVar59 = CONCAT17(bVar66,CONCAT16(bVar65,CONCAT15(bVar64,CONCAT14(bVar63,CONCAT13(
                                                  bVar62,CONCAT12(bVar61,CONCAT11(bVar60,bVar58)))))
                                               ));
              uVar7 = uVar7 - 8;
              puVar5 = puVar5 + 8;
              auVar31 = auVar30;
            } while (uVar7 != 0);
            bVar49 = bVar49 | bVar32 | bVar14 | auVar30[0];
            bVar51 = bVar51 | bVar33 | bVar15 | auVar30[1];
            bVar52 = bVar52 | bVar34 | bVar16 | auVar30[2];
            bVar53 = bVar53 | bVar35 | bVar17 | auVar30[3];
            bVar54 = bVar54 | bVar36 | bVar18 | auVar30[4];
            bVar55 = bVar55 | bVar37 | bVar19 | auVar30[5];
            bVar56 = bVar56 | bVar38 | bVar20 | auVar30[6];
            bVar57 = bVar57 | bVar39 | bVar21 | auVar30[7];
            bVar58 = bVar58 | bVar40 | bVar22 | auVar30[8];
            bVar60 = bVar60 | bVar42 | bVar23 | auVar30[9];
            bVar61 = bVar61 | bVar43 | bVar24 | auVar30[10];
            bVar62 = bVar62 | bVar44 | bVar25 | auVar30[0xb];
            bVar63 = bVar63 | bVar45 | bVar26 | auVar30[0xc];
            bVar64 = bVar64 | bVar46 | bVar27 | auVar30[0xd];
            bVar65 = bVar65 | bVar47 | bVar28 | auVar30[0xe];
            bVar66 = bVar66 | bVar48 | bVar29 | auVar30[0xf];
            auVar1[1] = bVar51;
            auVar1[0] = bVar49;
            auVar1[2] = bVar52;
            auVar1[3] = bVar53;
            auVar1[4] = bVar54;
            auVar1[5] = bVar55;
            auVar1[6] = bVar56;
            auVar1[7] = bVar57;
            auVar1[8] = bVar58;
            auVar1[9] = bVar60;
            auVar1[10] = bVar61;
            auVar1[0xb] = bVar62;
            auVar1[0xc] = bVar63;
            auVar1[0xd] = bVar64;
            auVar1[0xe] = bVar65;
            auVar1[0xf] = bVar66;
            auVar2[1] = bVar51;
            auVar2[0] = bVar49;
            auVar2[2] = bVar52;
            auVar2[3] = bVar53;
            auVar2[4] = bVar54;
            auVar2[5] = bVar55;
            auVar2[6] = bVar56;
            auVar2[7] = bVar57;
            auVar2[8] = bVar58;
            auVar2[9] = bVar60;
            auVar2[10] = bVar61;
            auVar2[0xb] = bVar62;
            auVar2[0xc] = bVar63;
            auVar2[0xd] = bVar64;
            auVar2[0xe] = bVar65;
            auVar2[0xf] = bVar66;
            auVar31 = NEON_ext(auVar1,auVar2,8,1);
            uVar7 = CONCAT17(bVar57 | auVar31[7],
                             CONCAT16(bVar56 | auVar31[6],
                                      CONCAT15(bVar55 | auVar31[5],
                                               CONCAT14(bVar54 | auVar31[4],
                                                        CONCAT13(bVar53 | auVar31[3],
                                                                 CONCAT12(bVar52 | auVar31[2],
                                                                          CONCAT11(bVar51 | auVar31[
                                                  1],bVar49 | auVar31[0])))))));
            if (uVar8 == uVar9) goto LAB_002fb5a4;
          }
          lVar6 = in_stack_00000010 - uVar11;
          puVar5 = uStack0000000000000008 + uVar11;
          do {
            uVar7 = *puVar5 | uVar7;
            lVar6 = lVar6 + -1;
            puVar5 = puVar5 + 1;
          } while (lVar6 != 0);
        }
LAB_002fb5a4:
        if ((uVar7 == 0) &&
           (iVar3 = func_0x002af1b4((long)&uStack0000000000000000 + 4,*(undefined8 *)(unaff_x20 + 8)
                                    ,0), iVar3 != 0 && uStack0000000000000000._4_4_ == 2)) {
          if (unaff_w21 != 0) {
            if (unaff_w21 - 4U < 0xfffffffd) goto LAB_002fb5ec;
            iVar3 = func_0x002fb6ac();
            if (iVar3 == 0) goto LAB_002fb6a4;
          }
          uVar4 = 1;
          uVar12 = uStack000000000000001c;
          if ((uStack000000000000001c >> 1 & 1) != 0) goto LAB_002fb600;
          goto LAB_002fb5f8;
        }
      }
    }
  }
  uVar4 = 0x60a;
LAB_002fb5d4:
  while( true ) {
    func_0x0028f83c(4,0,0x92,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",uVar4);
LAB_002fb5ec:
    uVar4 = 0;
    uVar12 = uStack000000000000001c;
    if ((uStack000000000000001c >> 1 & 1) == 0) {
LAB_002fb5f8:
      uVar12 = uStack000000000000001c;
      func_0x0036e3d8(uStack0000000000000008);
    }
LAB_002fb600:
    if ((uVar12 & 1) == 0) {
      uStack0000000000000008 = (ulong *)0x0;
      lVar6 = unaff_x19[4];
    }
    else {
      func_0x0036e3d8(&uStack0000000000000008);
      lVar6 = unaff_x19[4];
    }
    if ((lVar6 == 0) || (*(char *)(unaff_x19 + 5) != '\0')) break;
    func_0x0079db28();
LAB_002fb6a4:
    uVar4 = 0x624;
  }
  func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
  func_0x0036e3d8(unaff_x19[1]);
  func_0x0036e3d8();
  func_0x0036e3d8(0);
  return uVar4;
}

