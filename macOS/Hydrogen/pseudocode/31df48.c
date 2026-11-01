
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0031df48(ulong param_1)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  char cVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  uint uVar9;
  int iVar10;
  int iVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  undefined8 *in_x4;
  long lVar14;
  uint uVar15;
  long in_x9;
  ulong *puVar16;
  long *in_x10;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  long in_x11;
  ulong *puVar20;
  ulong uVar21;
  ulong uVar22;
  long unaff_x19;
  char *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x23;
  uint unaff_w25;
  long *unaff_x26;
  undefined8 *unaff_x27;
  long *unaff_x28;
  long *plVar23;
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
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  undefined8 uVar52;
  byte bVar59;
  byte bVar60;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  undefined8 uVar61;
  byte bVar68;
  byte bVar69;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  undefined8 uVar70;
  byte bVar77;
  ulong uVar78;
  ulong uVar79;
  ulong uVar80;
  ulong uVar81;
  ulong uVar82;
  ulong uVar83;
  ulong uVar84;
  undefined1 auVar85 [16];
  int iStack0000000000000014;
  undefined8 uStack0000000000000028;
  int aiStack_23c [11];
  undefined8 uStack_210;
  undefined2 uStack_208;
  undefined5 uStack_200;
  undefined3 uStack_1fb;
  undefined5 uStack_1f8;
  undefined8 uStack_1f0;
  undefined6 uStack_1e8;
  undefined2 uStack_1e2;
  undefined6 uStack_1e0;
  undefined1 auStack_1d8 [64];
  long lStack_198;
  long *plStack_190;
  undefined *puStack_188;
  undefined1 auStack_178 [32];
  long lStack_158;
  long lStack_150;
  undefined *puStack_148;
  undefined1 auStack_140 [64];
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_30;
  long lStack_28;
  long *plStack_20;
  undefined8 uStack_18;
  
  lVar14 = in_x11;
  do {
    plVar23 = unaff_x28;
    if (*in_x10 != 0) goto LAB_0031e4f0;
    lVar14 = lVar14 + -1;
    in_x10 = in_x10 + 1;
  } while (lVar14 != 0);
  uVar17 = *(ulong *)(in_x9 + (long)(int)in_x11 * 8);
  if ((uVar17 & uVar17 - 1) == 0) {
    if (((99 < (int)unaff_w25) && (uVar17 = (ulong)(unaff_w25 - 100 >> 6), uVar17 < param_1)) &&
       ((*(ulong *)(in_x9 + uVar17 * 8) >> ((ulong)(unaff_w25 - 100) & 0x3f) & 1) != 0)) {
      if (0x3fffffe < unaff_w25) {
        func_0x0028f83c(4,0,0x80,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x38e);
        return 0;
      }
      uVar15 = *(uint *)(unaff_x28 + 1);
      if (uVar15 == 0) {
LAB_0031e094:
        iVar2 = unaff_w25 * 5;
        cVar4 = *(char *)(unaff_x19 + 0x28);
      }
      else {
        puVar16 = (ulong *)*unaff_x28;
        uVar17 = *puVar16 ^ 3;
        if (1 < (int)uVar15) {
          if (uVar15 < 9) {
            uVar18 = 1;
          }
          else {
            uVar19 = (ulong)uVar15 - 1;
            uVar21 = uVar19 & 0xfffffffffffffff8;
            uVar18 = uVar21 | 1;
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
            auVar85._8_8_ = 0;
            auVar85._0_8_ = uVar17;
            uVar13 = 0;
            uVar52 = 0;
            uVar61 = 0;
            uVar70 = 0;
            puVar20 = puVar16 + 5;
            uVar17 = uVar21;
            do {
              uVar78 = puVar20[-3];
              uVar22 = puVar20[-4];
              uVar80 = puVar20[-1];
              uVar79 = puVar20[-2];
              uVar82 = puVar20[1];
              uVar81 = *puVar20;
              uVar84 = puVar20[3];
              uVar83 = puVar20[2];
              auVar40[0] = (byte)uVar22 | auVar85[0];
              auVar40[1] = (byte)(uVar22 >> 8) | auVar85[1];
              auVar40[2] = (byte)(uVar22 >> 0x10) | auVar85[2];
              auVar40[3] = (byte)(uVar22 >> 0x18) | auVar85[3];
              auVar40[4] = (byte)(uVar22 >> 0x20) | auVar85[4];
              auVar40[5] = (byte)(uVar22 >> 0x28) | auVar85[5];
              auVar40[6] = (byte)(uVar22 >> 0x30) | auVar85[6];
              auVar40[7] = (byte)(uVar22 >> 0x38) | auVar85[7];
              auVar40[8] = (byte)uVar78 | auVar85[8];
              auVar40[9] = (byte)(uVar78 >> 8) | auVar85[9];
              auVar40[10] = (byte)(uVar78 >> 0x10) | auVar85[10];
              auVar40[0xb] = (byte)(uVar78 >> 0x18) | auVar85[0xb];
              auVar40[0xc] = (byte)(uVar78 >> 0x20) | auVar85[0xc];
              auVar40[0xd] = (byte)(uVar78 >> 0x28) | auVar85[0xd];
              auVar40[0xe] = (byte)(uVar78 >> 0x30) | auVar85[0xe];
              auVar40[0xf] = (byte)(uVar78 >> 0x38) | auVar85[0xf];
              bVar24 = (byte)uVar79 | bVar24;
              bVar25 = (byte)(uVar79 >> 8) | bVar25;
              bVar26 = (byte)(uVar79 >> 0x10) | bVar26;
              bVar27 = (byte)(uVar79 >> 0x18) | bVar27;
              bVar28 = (byte)(uVar79 >> 0x20) | bVar28;
              bVar29 = (byte)(uVar79 >> 0x28) | bVar29;
              bVar30 = (byte)(uVar79 >> 0x30) | bVar30;
              bVar31 = (byte)(uVar79 >> 0x38) | bVar31;
              bVar32 = (byte)uVar80 | bVar32;
              bVar33 = (byte)(uVar80 >> 8) | bVar33;
              bVar34 = (byte)(uVar80 >> 0x10) | bVar34;
              bVar35 = (byte)(uVar80 >> 0x18) | bVar35;
              bVar36 = (byte)(uVar80 >> 0x20) | bVar36;
              bVar37 = (byte)(uVar80 >> 0x28) | bVar37;
              bVar38 = (byte)(uVar80 >> 0x30) | bVar38;
              bVar39 = (byte)(uVar80 >> 0x38) | bVar39;
              bVar43 = (byte)uVar81 | (byte)uVar13;
              bVar44 = (byte)(uVar81 >> 8) | (byte)((ulong)uVar13 >> 8);
              bVar45 = (byte)(uVar81 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
              bVar46 = (byte)(uVar81 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
              bVar47 = (byte)(uVar81 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
              bVar48 = (byte)(uVar81 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
              bVar49 = (byte)(uVar81 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
              bVar50 = (byte)(uVar81 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
              uVar13 = CONCAT17(bVar50,CONCAT16(bVar49,CONCAT15(bVar48,CONCAT14(bVar47,CONCAT13(
                                                  bVar46,CONCAT12(bVar45,CONCAT11(bVar44,bVar43)))))
                                               ));
              bVar51 = (byte)uVar82 | (byte)uVar52;
              bVar53 = (byte)(uVar82 >> 8) | (byte)((ulong)uVar52 >> 8);
              bVar54 = (byte)(uVar82 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
              bVar55 = (byte)(uVar82 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
              bVar56 = (byte)(uVar82 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
              bVar57 = (byte)(uVar82 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
              bVar58 = (byte)(uVar82 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
              bVar59 = (byte)(uVar82 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
              uVar52 = CONCAT17(bVar59,CONCAT16(bVar58,CONCAT15(bVar57,CONCAT14(bVar56,CONCAT13(
                                                  bVar55,CONCAT12(bVar54,CONCAT11(bVar53,bVar51)))))
                                               ));
              bVar60 = (byte)uVar83 | (byte)uVar61;
              bVar62 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar61 >> 8);
              bVar63 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar61 >> 0x10);
              bVar64 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar61 >> 0x18);
              bVar65 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar61 >> 0x20);
              bVar66 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar61 >> 0x28);
              bVar67 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar61 >> 0x30);
              bVar68 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar61 >> 0x38);
              uVar61 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(
                                                  bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar60)))))
                                               ));
              bVar69 = (byte)uVar84 | (byte)uVar70;
              bVar71 = (byte)(uVar84 >> 8) | (byte)((ulong)uVar70 >> 8);
              bVar72 = (byte)(uVar84 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
              bVar73 = (byte)(uVar84 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
              bVar74 = (byte)(uVar84 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
              bVar75 = (byte)(uVar84 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
              bVar76 = (byte)(uVar84 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
              bVar77 = (byte)(uVar84 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
              uVar70 = CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(
                                                  bVar73,CONCAT12(bVar72,CONCAT11(bVar71,bVar69)))))
                                               ));
              uVar17 = uVar17 - 8;
              puVar20 = puVar20 + 8;
              auVar85 = auVar40;
            } while (uVar17 != 0);
            bVar60 = bVar60 | bVar43 | bVar24 | auVar40[0];
            bVar62 = bVar62 | bVar44 | bVar25 | auVar40[1];
            bVar63 = bVar63 | bVar45 | bVar26 | auVar40[2];
            bVar64 = bVar64 | bVar46 | bVar27 | auVar40[3];
            bVar65 = bVar65 | bVar47 | bVar28 | auVar40[4];
            bVar66 = bVar66 | bVar48 | bVar29 | auVar40[5];
            bVar67 = bVar67 | bVar49 | bVar30 | auVar40[6];
            bVar68 = bVar68 | bVar50 | bVar31 | auVar40[7];
            bVar69 = bVar69 | bVar51 | bVar32 | auVar40[8];
            bVar71 = bVar71 | bVar53 | bVar33 | auVar40[9];
            bVar72 = bVar72 | bVar54 | bVar34 | auVar40[10];
            bVar73 = bVar73 | bVar55 | bVar35 | auVar40[0xb];
            bVar74 = bVar74 | bVar56 | bVar36 | auVar40[0xc];
            bVar75 = bVar75 | bVar57 | bVar37 | auVar40[0xd];
            bVar76 = bVar76 | bVar58 | bVar38 | auVar40[0xe];
            bVar77 = bVar77 | bVar59 | bVar39 | auVar40[0xf];
            auVar7[1] = bVar62;
            auVar7[0] = bVar60;
            auVar7[2] = bVar63;
            auVar7[3] = bVar64;
            auVar7[4] = bVar65;
            auVar7[5] = bVar66;
            auVar7[6] = bVar67;
            auVar7[7] = bVar68;
            auVar7[8] = bVar69;
            auVar7[9] = bVar71;
            auVar7[10] = bVar72;
            auVar7[0xb] = bVar73;
            auVar7[0xc] = bVar74;
            auVar7[0xd] = bVar75;
            auVar7[0xe] = bVar76;
            auVar7[0xf] = bVar77;
            auVar8[1] = bVar62;
            auVar8[0] = bVar60;
            auVar8[2] = bVar63;
            auVar8[3] = bVar64;
            auVar8[4] = bVar65;
            auVar8[5] = bVar66;
            auVar8[6] = bVar67;
            auVar8[7] = bVar68;
            auVar8[8] = bVar69;
            auVar8[9] = bVar71;
            auVar8[10] = bVar72;
            auVar8[0xb] = bVar73;
            auVar8[0xc] = bVar74;
            auVar8[0xd] = bVar75;
            auVar8[0xe] = bVar76;
            auVar8[0xf] = bVar77;
            auVar85 = NEON_ext(auVar7,auVar8,8,1);
            uVar17 = CONCAT17(bVar68 | auVar85[7],
                              CONCAT16(bVar67 | auVar85[6],
                                       CONCAT15(bVar66 | auVar85[5],
                                                CONCAT14(bVar65 | auVar85[4],
                                                         CONCAT13(bVar64 | auVar85[3],
                                                                  CONCAT12(bVar63 | auVar85[2],
                                                                           CONCAT11(bVar62 | auVar85
                                                  [1],bVar60 | auVar85[0])))))));
            if (uVar19 == uVar21) goto LAB_0031e088;
          }
          lVar14 = uVar15 - uVar18;
          puVar16 = puVar16 + uVar18;
          do {
            uVar17 = *puVar16 | uVar17;
            lVar14 = lVar14 + -1;
            puVar16 = puVar16 + 1;
          } while (lVar14 != 0);
        }
LAB_0031e088:
        if ((uVar17 != 0) || ((int)unaff_x28[2] != 0)) goto LAB_0031e094;
        iVar2 = unaff_w25 << 3;
        cVar4 = *(char *)(unaff_x19 + 0x28);
      }
      if (cVar4 == '\0') {
        unaff_x27 = *(undefined8 **)(unaff_x19 + 0x20);
        uVar17 = *(ulong *)(unaff_x19 + 0x10);
        if (uVar17 == *(ulong *)(unaff_x19 + 0x18)) {
          uVar18 = 0x20;
          if (uVar17 != 0) {
            uVar18 = uVar17 * 3 >> 1;
          }
          if ((uVar18 <= uVar17 || uVar18 >> 0x3d != 0) ||
             (lVar14 = func_0x0036e48c(*(undefined8 *)(unaff_x19 + 8),uVar18 << 3), lVar14 == 0)) {
            *(undefined2 *)(unaff_x19 + 0x28) = 0x101;
            goto LAB_0031e124;
          }
          *(long *)(unaff_x19 + 8) = lVar14;
          *(ulong *)(unaff_x19 + 0x18) = uVar18;
          uVar17 = *(ulong *)(unaff_x19 + 0x10);
        }
        else {
          lVar14 = *(long *)(unaff_x19 + 8);
        }
        *(undefined8 **)(lVar14 + uVar17 * 8) = unaff_x27;
        *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
      }
LAB_0031e124:
      puVar12 = (undefined8 *)func_0x0029e340();
      uVar13 = 0;
      if (puVar12 != (undefined8 *)0x0) {
        plVar23 = (long *)0x0;
        uVar15 = (uint)(in_x4 != (undefined8 *)0x0);
        if (unaff_x26 != (long *)0x0) {
          uVar15 = 0xffffffff;
        }
        if (iVar2 < 2) {
          iVar2 = 1;
        }
        iStack0000000000000014 = 0;
code_r0x0031e170:
        uVar13 = func_0x002afac4();
        unaff_x27 = puVar12;
        if ((int)uVar13 != 0) {
          do {
            if (unaff_x20 != (char *)0x0) {
              if (*unaff_x20 == '\x01') {
                uVar13 = (**(code **)(unaff_x20 + 0x10))(0,plVar23);
                if ((int)uVar13 == 0) break;
              }
              else {
                if (*unaff_x20 != '\x02') goto LAB_0031e490;
                (**(code **)(unaff_x20 + 0x10))(0,plVar23);
              }
            }
            if (unaff_x23 == 0) {
code_r0x0031e270:
              uVar3 = uVar15;
              if (in_x4 != (undefined8 *)0x0 && unaff_x26 != (long *)0x0) {
                iVar11 = (int)unaff_x26[2];
                if (iVar11 != *(int *)(in_x4 + 2)) {
                  if (iVar11 != 0) goto code_r0x0031e1b4;
                  goto code_r0x0031e28c;
                }
                uVar9 = func_0x0029d99c(*unaff_x26,(long)(int)unaff_x26[1],*in_x4,
                                        (long)*(int *)(in_x4 + 1));
                uVar3 = -uVar9;
                if (iVar11 == 0) {
                  uVar3 = uVar9;
                }
              }
              if (0 < (int)uVar3) goto code_r0x0031e28c;
            }
            else {
              uVar13 = func_0x002ab730(puVar12);
              if ((int)uVar13 == 0) break;
              iVar11 = *(int *)(puVar12 + 2);
              if (iVar11 == *(int *)(unaff_x21 + 2)) {
                iVar10 = func_0x0029d99c(*puVar12,(long)*(int *)(puVar12 + 1),*unaff_x21,
                                         (long)*(int *)(unaff_x21 + 1));
                iVar1 = -iVar10;
                if (iVar11 == 0) {
                  iVar1 = iVar10;
                }
                if (0 < iVar1) goto code_r0x0031e270;
              }
              else if (iVar11 == 0) goto code_r0x0031e270;
            }
code_r0x0031e1b4:
            uVar13 = func_0x002afac4();
            plVar23 = (long *)(ulong)((int)plVar23 + 1);
            if ((int)uVar13 == 0) break;
          } while( true );
        }
      }
LAB_0031e494:
      if (*(char *)(unaff_x19 + 0x28) != '\0') {
        return uVar13;
      }
      if (*(long *)(unaff_x19 + 0x10) != 0) {
        lVar14 = *(long *)(unaff_x19 + 0x10) + -1;
        *(long *)(unaff_x19 + 0x10) = lVar14;
        *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar14 * 8);
        return uVar13;
      }
      func_0x0079db4c(uVar13);
      goto LAB_0031e4f0;
    }
  }
  else {
LAB_0031e4f0:
    func_0x0079fba4();
  }
  func_0x0079fbcc();
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_f8 = _UNK_0082fad8;
  uStack_100 = _UNK_0082fad0;
  uStack_e8 = _UNK_0082fae8;
  uStack_f0 = _UNK_0082fae0;
  uStack_d8 = _UNK_0082faf8;
  uStack_e0 = _UNK_0082faf0;
  uStack_c8 = _UNK_0082fb08;
  uStack_d0 = _UNK_0082fb00;
  uStack_c0 = 0;
  uStack_b8 = 0;
  uStack_30 = _UNK_0080be58;
  plStack_20 = plVar23;
  uStack_18 = unaff_x27;
  func_0x002b603c(&uStack_100,&UNK_00878171,0x10);
  func_0x00300ef8(auStack_140,uStack_30._4_4_,&uStack_100);
  func_0x0036e464(&uStack_100,0xd8);
  uVar13 = func_0x002fd75c(&UNK_00878181,auStack_140,0x40,"SHA-512 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return uVar13;
  }
  ___stack_chk_fail();
  puStack_148 = &DAT_0031e5c8;
  lStack_158 = *(long *)PTR____stack_chk_guard_009b01e8;
  lStack_150 = (long)register0x00000008 + -0x10;
  func_0x002eafd4(&UNK_008781c1,0x10,auStack_178);
  uVar13 = func_0x002fd75c(&UNK_008781d1,auStack_178,0x20,"SHA3-256 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_158) {
    return uVar13;
  }
  ___stack_chk_fail();
  puStack_188 = &DAT_0031e63c;
  lStack_198 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_1e0 = 0xb0b0b0b0b0b;
  uStack_1f0 = 0xb0b0b0b0b0b0b0b;
  uStack_1e8 = 0xb0b0b0b0b0b;
  uStack_1e2 = 0xb0b;
  uStack_200 = _UNK_008781f1;
  uStack_1fb = _UNK_008781f6;
  uStack_1f8 = _UNK_008781f9;
  uStack_210 = _UNK_008781fe;
  uStack_208 = 0xf9f8;
  plStack_190 = &lStack_150;
  func_0x00373e9c(0xa296c8,&DAT_002c21e4);
  lVar14 = func_0x002dd408(0xa3a728,&uStack_200,0xd,&uStack_1f0,0x16,auStack_1d8,aiStack_23c);
  if (lVar14 == 0) {
    func_0x0028f83c(0x1f,0,0x1c,"/aws-lc/crypto/fipsmodule/hkdf/hkdf.c",0x49);
  }
  else {
    if (iRam0000000000a3a72c != aiStack_23c[0]) {
      func_0x0079eb04();
      goto code_r0x0031e76c;
    }
    func_0x002dd0c0(aiStack_23c,0x2a,0xa3a728,auStack_1d8,aiStack_23c[0],&uStack_210,10);
  }
  uVar13 = func_0x002fd75c(&UNK_00878208,aiStack_23c,0x2a,"HKDF-SHA-256 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_198) {
    return uVar13;
  }
code_r0x0031e76c:
  auVar85 = ___stack_chk_fail();
                    /* WARNING: Could not recover jumptable at 0x007b2f8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar13 = (*(code *)PTR____assert_rtn_00a24af8)(auVar85._0_8_,auVar85._8_8_,0xe5);
  return uVar13;
code_r0x0031e28c:
  uVar17 = 0x400;
  if ((int)unaff_x26[1] < 0x11) {
    uVar17 = 0x200;
  }
  iVar11 = func_0x002a18a8();
  if (iVar11 == 0) {
    uVar18 = 3;
code_r0x0031e2f4:
    uVar3 = *(uint *)(unaff_x26 + 1);
    if (uVar3 != 0) {
      puVar16 = (ulong *)*unaff_x26;
      uVar18 = *puVar16 ^ uVar18;
      if (1 < (int)uVar3) {
        if (uVar3 < 9) {
          uVar19 = 1;
        }
        else {
          uVar21 = (ulong)uVar3 - 1;
          uVar22 = uVar21 & 0xfffffffffffffff8;
          uVar19 = uVar22 | 1;
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
          auVar41._8_8_ = 0;
          auVar41._0_8_ = uVar18;
          uVar13 = 0;
          uVar52 = 0;
          uVar61 = 0;
          uVar70 = 0;
          puVar20 = puVar16 + 5;
          uVar17 = uVar22;
          do {
            uVar78 = puVar20[-3];
            uVar18 = puVar20[-4];
            uVar80 = puVar20[-1];
            uVar79 = puVar20[-2];
            uVar82 = puVar20[1];
            uVar81 = *puVar20;
            uVar84 = puVar20[3];
            uVar83 = puVar20[2];
            auVar42[0] = (byte)uVar18 | auVar41[0];
            auVar42[1] = (byte)(uVar18 >> 8) | auVar41[1];
            auVar42[2] = (byte)(uVar18 >> 0x10) | auVar41[2];
            auVar42[3] = (byte)(uVar18 >> 0x18) | auVar41[3];
            auVar42[4] = (byte)(uVar18 >> 0x20) | auVar41[4];
            auVar42[5] = (byte)(uVar18 >> 0x28) | auVar41[5];
            auVar42[6] = (byte)(uVar18 >> 0x30) | auVar41[6];
            auVar42[7] = (byte)(uVar18 >> 0x38) | auVar41[7];
            auVar42[8] = (byte)uVar78 | auVar41[8];
            auVar42[9] = (byte)(uVar78 >> 8) | auVar41[9];
            auVar42[10] = (byte)(uVar78 >> 0x10) | auVar41[10];
            auVar42[0xb] = (byte)(uVar78 >> 0x18) | auVar41[0xb];
            auVar42[0xc] = (byte)(uVar78 >> 0x20) | auVar41[0xc];
            auVar42[0xd] = (byte)(uVar78 >> 0x28) | auVar41[0xd];
            auVar42[0xe] = (byte)(uVar78 >> 0x30) | auVar41[0xe];
            auVar42[0xf] = (byte)(uVar78 >> 0x38) | auVar41[0xf];
            bVar24 = (byte)uVar79 | bVar24;
            bVar25 = (byte)(uVar79 >> 8) | bVar25;
            bVar26 = (byte)(uVar79 >> 0x10) | bVar26;
            bVar27 = (byte)(uVar79 >> 0x18) | bVar27;
            bVar28 = (byte)(uVar79 >> 0x20) | bVar28;
            bVar29 = (byte)(uVar79 >> 0x28) | bVar29;
            bVar30 = (byte)(uVar79 >> 0x30) | bVar30;
            bVar31 = (byte)(uVar79 >> 0x38) | bVar31;
            bVar32 = (byte)uVar80 | bVar32;
            bVar33 = (byte)(uVar80 >> 8) | bVar33;
            bVar34 = (byte)(uVar80 >> 0x10) | bVar34;
            bVar35 = (byte)(uVar80 >> 0x18) | bVar35;
            bVar36 = (byte)(uVar80 >> 0x20) | bVar36;
            bVar37 = (byte)(uVar80 >> 0x28) | bVar37;
            bVar38 = (byte)(uVar80 >> 0x30) | bVar38;
            bVar39 = (byte)(uVar80 >> 0x38) | bVar39;
            bVar43 = (byte)uVar81 | (byte)uVar13;
            bVar44 = (byte)(uVar81 >> 8) | (byte)((ulong)uVar13 >> 8);
            bVar45 = (byte)(uVar81 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
            bVar46 = (byte)(uVar81 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
            bVar47 = (byte)(uVar81 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
            bVar48 = (byte)(uVar81 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
            bVar49 = (byte)(uVar81 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
            bVar50 = (byte)(uVar81 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
            uVar13 = CONCAT17(bVar50,CONCAT16(bVar49,CONCAT15(bVar48,CONCAT14(bVar47,CONCAT13(bVar46
                                                  ,CONCAT12(bVar45,CONCAT11(bVar44,bVar43)))))));
            bVar51 = (byte)uVar82 | (byte)uVar52;
            bVar53 = (byte)(uVar82 >> 8) | (byte)((ulong)uVar52 >> 8);
            bVar54 = (byte)(uVar82 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
            bVar55 = (byte)(uVar82 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
            bVar56 = (byte)(uVar82 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
            bVar57 = (byte)(uVar82 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
            bVar58 = (byte)(uVar82 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
            bVar59 = (byte)(uVar82 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
            uVar52 = CONCAT17(bVar59,CONCAT16(bVar58,CONCAT15(bVar57,CONCAT14(bVar56,CONCAT13(bVar55
                                                  ,CONCAT12(bVar54,CONCAT11(bVar53,bVar51)))))));
            bVar60 = (byte)uVar83 | (byte)uVar61;
            bVar62 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar61 >> 8);
            bVar63 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar61 >> 0x10);
            bVar64 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar61 >> 0x18);
            bVar65 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar61 >> 0x20);
            bVar66 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar61 >> 0x28);
            bVar67 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar61 >> 0x30);
            bVar68 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar61 >> 0x38);
            uVar61 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64
                                                  ,CONCAT12(bVar63,CONCAT11(bVar62,bVar60)))))));
            bVar69 = (byte)uVar84 | (byte)uVar70;
            bVar71 = (byte)(uVar84 >> 8) | (byte)((ulong)uVar70 >> 8);
            bVar72 = (byte)(uVar84 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
            bVar73 = (byte)(uVar84 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
            bVar74 = (byte)(uVar84 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
            bVar75 = (byte)(uVar84 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
            bVar76 = (byte)(uVar84 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
            bVar77 = (byte)(uVar84 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
            uVar70 = CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73
                                                  ,CONCAT12(bVar72,CONCAT11(bVar71,bVar69)))))));
            uVar17 = uVar17 - 8;
            puVar20 = puVar20 + 8;
            auVar41 = auVar42;
          } while (uVar17 != 0);
          bVar60 = bVar60 | bVar43 | bVar24 | auVar42[0];
          bVar62 = bVar62 | bVar44 | bVar25 | auVar42[1];
          bVar63 = bVar63 | bVar45 | bVar26 | auVar42[2];
          bVar64 = bVar64 | bVar46 | bVar27 | auVar42[3];
          bVar65 = bVar65 | bVar47 | bVar28 | auVar42[4];
          bVar66 = bVar66 | bVar48 | bVar29 | auVar42[5];
          bVar67 = bVar67 | bVar49 | bVar30 | auVar42[6];
          bVar68 = bVar68 | bVar50 | bVar31 | auVar42[7];
          bVar69 = bVar69 | bVar51 | bVar32 | auVar42[8];
          bVar71 = bVar71 | bVar53 | bVar33 | auVar42[9];
          bVar72 = bVar72 | bVar54 | bVar34 | auVar42[10];
          bVar73 = bVar73 | bVar55 | bVar35 | auVar42[0xb];
          bVar74 = bVar74 | bVar56 | bVar36 | auVar42[0xc];
          bVar75 = bVar75 | bVar57 | bVar37 | auVar42[0xd];
          bVar76 = bVar76 | bVar58 | bVar38 | auVar42[0xe];
          bVar77 = bVar77 | bVar59 | bVar39 | auVar42[0xf];
          auVar5[1] = bVar62;
          auVar5[0] = bVar60;
          auVar5[2] = bVar63;
          auVar5[3] = bVar64;
          auVar5[4] = bVar65;
          auVar5[5] = bVar66;
          auVar5[6] = bVar67;
          auVar5[7] = bVar68;
          auVar5[8] = bVar69;
          auVar5[9] = bVar71;
          auVar5[10] = bVar72;
          auVar5[0xb] = bVar73;
          auVar5[0xc] = bVar74;
          auVar5[0xd] = bVar75;
          auVar5[0xe] = bVar76;
          auVar5[0xf] = bVar77;
          auVar6[1] = bVar62;
          auVar6[0] = bVar60;
          auVar6[2] = bVar63;
          auVar6[3] = bVar64;
          auVar6[4] = bVar65;
          auVar6[5] = bVar66;
          auVar6[6] = bVar67;
          auVar6[7] = bVar68;
          auVar6[8] = bVar69;
          auVar6[9] = bVar71;
          auVar6[10] = bVar72;
          auVar6[0xb] = bVar73;
          auVar6[0xc] = bVar74;
          auVar6[0xd] = bVar75;
          auVar6[0xe] = bVar76;
          auVar6[0xf] = bVar77;
          auVar85 = NEON_ext(auVar5,auVar6,8,1);
          uVar18 = CONCAT17(bVar68 | auVar85[7],
                            CONCAT16(bVar67 | auVar85[6],
                                     CONCAT15(bVar66 | auVar85[5],
                                              CONCAT14(bVar65 | auVar85[4],
                                                       CONCAT13(bVar64 | auVar85[3],
                                                                CONCAT12(bVar63 | auVar85[2],
                                                                         CONCAT11(bVar62 | auVar85[1
                                                  ],bVar60 | auVar85[0])))))));
          if (uVar21 == uVar22) goto code_r0x0031e3a0;
        }
        lVar14 = uVar3 - uVar19;
        puVar16 = puVar16 + uVar19;
        do {
          uVar18 = *puVar16 | uVar18;
          lVar14 = lVar14 + -1;
          puVar16 = puVar16 + 1;
        } while (lVar14 != 0);
      }
    }
code_r0x0031e3a0:
    if ((uVar18 == 0) && ((int)unaff_x26[2] == 0)) goto code_r0x0031e3ac;
  }
  else {
    uVar19 = 2;
    do {
      uVar21 = uVar19;
      if (uVar17 == uVar21) goto code_r0x0031e3ac;
      uVar18 = (ulong)*(ushort *)(&UNK_00831e50 + uVar21 * 2);
      iVar11 = func_0x002a18a8();
      uVar19 = uVar21 + 1;
    } while (iVar11 != 0);
    if (uVar21 < uVar17) goto code_r0x0031e2f4;
code_r0x0031e3ac:
    func_0x00373e9c(0xa29210,&DAT_0029be70);
    iVar11 = func_0x0029b6ec(puVar12);
    if ((iVar11 == 0) ||
       (iVar11 = func_0x002a7d54((long)&uStack0000000000000028 + 4,puVar12,unaff_x28,unaff_x19),
       iVar11 == 0)) goto LAB_0031e490;
    if (uStack0000000000000028._4_4_ != 0) {
      iVar11 = func_0x002ae678(&uStack0000000000000028);
      if (iVar11 == 0) goto LAB_0031e490;
      if ((int)uStack0000000000000028 != 0) {
        uVar13 = 1;
        goto LAB_0031e494;
      }
    }
  }
  if (iStack0000000000000014 == iVar2 + -1) {
    func_0x0028f83c(4,0,0x8d,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3d3);
    uVar13 = 0;
    goto LAB_0031e494;
  }
  iStack0000000000000014 = iStack0000000000000014 + 1;
  if (unaff_x20 != (char *)0x0) {
    if (*unaff_x20 != '\x02') {
      if (*unaff_x20 != '\x01') {
LAB_0031e490:
        uVar13 = 0;
        goto LAB_0031e494;
      }
      iVar11 = (**(code **)(unaff_x20 + 0x10))(2);
      goto code_r0x0031e480;
    }
    (**(code **)(unaff_x20 + 0x10))(2);
  }
  iVar11 = 1;
code_r0x0031e480:
  uVar13 = 0;
  plVar23 = (long *)(ulong)((int)plVar23 + 1);
  if (iVar11 == 0) goto LAB_0031e494;
  goto code_r0x0031e170;
}

