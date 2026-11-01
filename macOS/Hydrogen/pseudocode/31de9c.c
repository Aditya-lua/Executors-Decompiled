
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_0031de9c(long *param_1,ulong param_2,long *param_3,long param_4,undefined8 *param_5,
            long *param_6,long param_7,char *param_8)

{
  int iVar1;
  int iVar2;
  char cVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  uint uVar8;
  int iVar9;
  int iVar10;
  undefined8 *puVar11;
  uint uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  long *plVar16;
  ulong *puVar17;
  uint uVar18;
  long *plVar19;
  ulong uVar20;
  ulong uVar21;
  long lVar22;
  ulong *puVar23;
  ulong uVar24;
  uint uVar25;
  ulong uVar26;
  undefined8 *unaff_x27;
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
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
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
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
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
  ulong uVar80;
  ulong uVar81;
  ulong uVar82;
  ulong uVar83;
  ulong uVar84;
  ulong uVar85;
  ulong uVar86;
  undefined1 auVar87 [16];
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
  int ***pppiStack_190;
  undefined *puStack_188;
  undefined1 auStack_178 [32];
  long lStack_158;
  int **ppiStack_150;
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
  undefined8 *puStack_18;
  int *piStack_10;
  undefined *puStack_8;
  
  uVar12 = (uint)param_2;
  if ((param_2 & 0x3f) != 0) {
    uVar13 = 0x44;
    uVar14 = 0x369;
LAB_0031dfb0:
    func_0x0028f83c(4,0,uVar13,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",uVar14);
    return 0;
  }
  uVar8 = *(uint *)(param_6 + 1);
  uVar15 = (ulong)uVar8;
  uVar18 = uVar8 & (int)uVar8 >> 0x1f;
  lVar22 = uVar15 * 8;
  do {
    lVar22 = lVar22 + -8;
    uVar25 = (uint)uVar15;
    uVar15 = (ulong)(uVar25 - 1);
    if ((int)uVar25 < 1) {
      if ((int)uVar8 < 0) goto LAB_0031df2c;
      goto LAB_0031e4f0;
    }
  } while (*(long *)(*param_6 + lVar22) == 0);
  uVar18 = uVar25;
LAB_0031df2c:
  if ((int)param_6[2] == 0) {
    uVar15 = (ulong)(uVar18 - 1);
    plVar16 = (long *)*param_6;
    if (1 < (int)uVar18) {
      plVar19 = plVar16;
      do {
        if (*plVar19 != 0) goto LAB_0031e4f0;
        uVar15 = uVar15 - 1;
        plVar19 = plVar19 + 1;
      } while (uVar15 != 0);
    }
    if ((plVar16[(int)(uVar18 - 1)] & plVar16[(int)(uVar18 - 1)] - 1U) != 0) goto LAB_0031e4f0;
    if (((99 < (int)uVar12) &&
        (uVar15 = (ulong)(uVar12 - 100 >> 6), uVar15 < (ulong)(long)(int)uVar8)) &&
       (((ulong)plVar16[uVar15] >> ((ulong)(uVar12 - 100) & 0x3f) & 1) != 0)) {
      if (0x3fffffe < uVar12) {
        uVar13 = 0x80;
        uVar14 = 0x38e;
        goto LAB_0031dfb0;
      }
      uVar18 = *(uint *)(param_3 + 1);
      if (uVar18 == 0) {
LAB_0031e094:
        iVar2 = uVar12 * 5;
        cVar3 = *(char *)(param_7 + 0x28);
      }
      else {
        puVar17 = (ulong *)*param_3;
        uVar15 = *puVar17 ^ 3;
        if (1 < (int)uVar18) {
          if (uVar18 < 9) {
            uVar20 = 1;
          }
          else {
            uVar21 = (ulong)uVar18 - 1;
            uVar24 = uVar21 & 0xfffffffffffffff8;
            uVar20 = uVar24 | 1;
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
            auVar87._8_8_ = 0;
            auVar87._0_8_ = uVar15;
            uVar13 = 0;
            uVar14 = 0;
            uVar63 = 0;
            uVar72 = 0;
            puVar23 = puVar17 + 5;
            uVar15 = uVar24;
            do {
              uVar80 = puVar23[-3];
              uVar26 = puVar23[-4];
              uVar82 = puVar23[-1];
              uVar81 = puVar23[-2];
              uVar84 = puVar23[1];
              uVar83 = *puVar23;
              uVar86 = puVar23[3];
              uVar85 = puVar23[2];
              auVar43[0] = (byte)uVar26 | auVar87[0];
              auVar43[1] = (byte)(uVar26 >> 8) | auVar87[1];
              auVar43[2] = (byte)(uVar26 >> 0x10) | auVar87[2];
              auVar43[3] = (byte)(uVar26 >> 0x18) | auVar87[3];
              auVar43[4] = (byte)(uVar26 >> 0x20) | auVar87[4];
              auVar43[5] = (byte)(uVar26 >> 0x28) | auVar87[5];
              auVar43[6] = (byte)(uVar26 >> 0x30) | auVar87[6];
              auVar43[7] = (byte)(uVar26 >> 0x38) | auVar87[7];
              auVar43[8] = (byte)uVar80 | auVar87[8];
              auVar43[9] = (byte)(uVar80 >> 8) | auVar87[9];
              auVar43[10] = (byte)(uVar80 >> 0x10) | auVar87[10];
              auVar43[0xb] = (byte)(uVar80 >> 0x18) | auVar87[0xb];
              auVar43[0xc] = (byte)(uVar80 >> 0x20) | auVar87[0xc];
              auVar43[0xd] = (byte)(uVar80 >> 0x28) | auVar87[0xd];
              auVar43[0xe] = (byte)(uVar80 >> 0x30) | auVar87[0xe];
              auVar43[0xf] = (byte)(uVar80 >> 0x38) | auVar87[0xf];
              bVar27 = (byte)uVar81 | bVar27;
              bVar28 = (byte)(uVar81 >> 8) | bVar28;
              bVar29 = (byte)(uVar81 >> 0x10) | bVar29;
              bVar30 = (byte)(uVar81 >> 0x18) | bVar30;
              bVar31 = (byte)(uVar81 >> 0x20) | bVar31;
              bVar32 = (byte)(uVar81 >> 0x28) | bVar32;
              bVar33 = (byte)(uVar81 >> 0x30) | bVar33;
              bVar34 = (byte)(uVar81 >> 0x38) | bVar34;
              bVar35 = (byte)uVar82 | bVar35;
              bVar36 = (byte)(uVar82 >> 8) | bVar36;
              bVar37 = (byte)(uVar82 >> 0x10) | bVar37;
              bVar38 = (byte)(uVar82 >> 0x18) | bVar38;
              bVar39 = (byte)(uVar82 >> 0x20) | bVar39;
              bVar40 = (byte)(uVar82 >> 0x28) | bVar40;
              bVar41 = (byte)(uVar82 >> 0x30) | bVar41;
              bVar42 = (byte)(uVar82 >> 0x38) | bVar42;
              bVar46 = (byte)uVar83 | (byte)uVar13;
              bVar47 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar13 >> 8);
              bVar48 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
              bVar49 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
              bVar50 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
              bVar51 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
              bVar52 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
              bVar53 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
              uVar13 = CONCAT17(bVar53,CONCAT16(bVar52,CONCAT15(bVar51,CONCAT14(bVar50,CONCAT13(
                                                  bVar49,CONCAT12(bVar48,CONCAT11(bVar47,bVar46)))))
                                               ));
              bVar54 = (byte)uVar84 | (byte)uVar14;
              bVar55 = (byte)(uVar84 >> 8) | (byte)((ulong)uVar14 >> 8);
              bVar56 = (byte)(uVar84 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
              bVar57 = (byte)(uVar84 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
              bVar58 = (byte)(uVar84 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
              bVar59 = (byte)(uVar84 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
              bVar60 = (byte)(uVar84 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
              bVar61 = (byte)(uVar84 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
              uVar14 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(
                                                  bVar57,CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))
                                               ));
              bVar62 = (byte)uVar85 | (byte)uVar63;
              bVar64 = (byte)(uVar85 >> 8) | (byte)((ulong)uVar63 >> 8);
              bVar65 = (byte)(uVar85 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
              bVar66 = (byte)(uVar85 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
              bVar67 = (byte)(uVar85 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
              bVar68 = (byte)(uVar85 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
              bVar69 = (byte)(uVar85 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
              bVar70 = (byte)(uVar85 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
              uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(
                                                  bVar66,CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))
                                               ));
              bVar71 = (byte)uVar86 | (byte)uVar72;
              bVar73 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar72 >> 8);
              bVar74 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
              bVar75 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
              bVar76 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
              bVar77 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
              bVar78 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
              bVar79 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
              uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(
                                                  bVar75,CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))
                                               ));
              uVar15 = uVar15 - 8;
              puVar23 = puVar23 + 8;
              auVar87 = auVar43;
            } while (uVar15 != 0);
            bVar62 = bVar62 | bVar46 | bVar27 | auVar43[0];
            bVar64 = bVar64 | bVar47 | bVar28 | auVar43[1];
            bVar65 = bVar65 | bVar48 | bVar29 | auVar43[2];
            bVar66 = bVar66 | bVar49 | bVar30 | auVar43[3];
            bVar67 = bVar67 | bVar50 | bVar31 | auVar43[4];
            bVar68 = bVar68 | bVar51 | bVar32 | auVar43[5];
            bVar69 = bVar69 | bVar52 | bVar33 | auVar43[6];
            bVar70 = bVar70 | bVar53 | bVar34 | auVar43[7];
            bVar71 = bVar71 | bVar54 | bVar35 | auVar43[8];
            bVar73 = bVar73 | bVar55 | bVar36 | auVar43[9];
            bVar74 = bVar74 | bVar56 | bVar37 | auVar43[10];
            bVar75 = bVar75 | bVar57 | bVar38 | auVar43[0xb];
            bVar76 = bVar76 | bVar58 | bVar39 | auVar43[0xc];
            bVar77 = bVar77 | bVar59 | bVar40 | auVar43[0xd];
            bVar78 = bVar78 | bVar60 | bVar41 | auVar43[0xe];
            bVar79 = bVar79 | bVar61 | bVar42 | auVar43[0xf];
            auVar6[1] = bVar64;
            auVar6[0] = bVar62;
            auVar6[2] = bVar65;
            auVar6[3] = bVar66;
            auVar6[4] = bVar67;
            auVar6[5] = bVar68;
            auVar6[6] = bVar69;
            auVar6[7] = bVar70;
            auVar6[8] = bVar71;
            auVar6[9] = bVar73;
            auVar6[10] = bVar74;
            auVar6[0xb] = bVar75;
            auVar6[0xc] = bVar76;
            auVar6[0xd] = bVar77;
            auVar6[0xe] = bVar78;
            auVar6[0xf] = bVar79;
            auVar7[1] = bVar64;
            auVar7[0] = bVar62;
            auVar7[2] = bVar65;
            auVar7[3] = bVar66;
            auVar7[4] = bVar67;
            auVar7[5] = bVar68;
            auVar7[6] = bVar69;
            auVar7[7] = bVar70;
            auVar7[8] = bVar71;
            auVar7[9] = bVar73;
            auVar7[10] = bVar74;
            auVar7[0xb] = bVar75;
            auVar7[0xc] = bVar76;
            auVar7[0xd] = bVar77;
            auVar7[0xe] = bVar78;
            auVar7[0xf] = bVar79;
            auVar87 = NEON_ext(auVar6,auVar7,8,1);
            uVar15 = CONCAT17(bVar70 | auVar87[7],
                              CONCAT16(bVar69 | auVar87[6],
                                       CONCAT15(bVar68 | auVar87[5],
                                                CONCAT14(bVar67 | auVar87[4],
                                                         CONCAT13(bVar66 | auVar87[3],
                                                                  CONCAT12(bVar65 | auVar87[2],
                                                                           CONCAT11(bVar64 | auVar87
                                                  [1],bVar62 | auVar87[0])))))));
            if (uVar21 == uVar24) goto LAB_0031e088;
          }
          lVar22 = uVar18 - uVar20;
          puVar17 = puVar17 + uVar20;
          do {
            uVar15 = *puVar17 | uVar15;
            lVar22 = lVar22 + -1;
            puVar17 = puVar17 + 1;
          } while (lVar22 != 0);
        }
LAB_0031e088:
        if ((uVar15 != 0) || ((int)param_3[2] != 0)) goto LAB_0031e094;
        iVar2 = uVar12 << 3;
        cVar3 = *(char *)(param_7 + 0x28);
      }
      if (cVar3 == '\0') {
        unaff_x27 = *(undefined8 **)(param_7 + 0x20);
        uVar15 = *(ulong *)(param_7 + 0x10);
        if (uVar15 == *(ulong *)(param_7 + 0x18)) {
          uVar20 = 0x20;
          if (uVar15 != 0) {
            uVar20 = uVar15 * 3 >> 1;
          }
          if ((uVar20 <= uVar15 || uVar20 >> 0x3d != 0) ||
             (lVar22 = func_0x0036e48c(*(undefined8 *)(param_7 + 8),uVar20 << 3), lVar22 == 0)) {
            *(undefined2 *)(param_7 + 0x28) = 0x101;
            goto LAB_0031e124;
          }
          *(long *)(param_7 + 8) = lVar22;
          *(ulong *)(param_7 + 0x18) = uVar20;
          uVar15 = *(ulong *)(param_7 + 0x10);
        }
        else {
          lVar22 = *(long *)(param_7 + 8);
        }
        *(undefined8 **)(lVar22 + uVar15 * 8) = unaff_x27;
        *(long *)(param_7 + 0x10) = *(long *)(param_7 + 0x10) + 1;
      }
LAB_0031e124:
      puVar11 = (undefined8 *)func_0x0029e340(param_7);
      uVar13 = 0;
      plVar16 = param_3;
      if (puVar11 != (undefined8 *)0x0) {
        plVar16 = (long *)0x0;
        uVar12 = (uint)(param_5 != (undefined8 *)0x0);
        if (param_1 != (long *)0x0) {
          uVar12 = 0xffffffff;
        }
        if (iVar2 < 2) {
          iVar2 = 1;
        }
        iStack0000000000000014 = 0;
code_r0x0031e170:
        uVar13 = func_0x002afac4(param_1,param_2,0,1);
        unaff_x27 = puVar11;
        if ((int)uVar13 != 0) {
          do {
            if (param_8 != (char *)0x0) {
              if (*param_8 == '\x01') {
                uVar13 = (**(code **)(param_8 + 0x10))(0,plVar16,param_8);
                if ((int)uVar13 == 0) break;
              }
              else {
                if (*param_8 != '\x02') goto LAB_0031e490;
                (**(code **)(param_8 + 0x10))(0,plVar16,param_8);
              }
            }
            if (param_4 == 0) {
code_r0x0031e270:
              uVar18 = uVar12;
              if (param_5 != (undefined8 *)0x0 && param_1 != (long *)0x0) {
                iVar10 = (int)param_1[2];
                if (iVar10 != *(int *)(param_5 + 2)) {
                  if (iVar10 != 0) goto code_r0x0031e1b4;
                  goto code_r0x0031e28c;
                }
                uVar8 = func_0x0029d99c(*param_1,(long)(int)param_1[1],*param_5,
                                        (long)*(int *)(param_5 + 1));
                uVar18 = -uVar8;
                if (iVar10 == 0) {
                  uVar18 = uVar8;
                }
              }
              if (0 < (int)uVar18) goto code_r0x0031e28c;
            }
            else {
              uVar13 = func_0x002ab730(puVar11,param_1,param_4,param_7);
              if ((int)uVar13 == 0) break;
              iVar10 = *(int *)(puVar11 + 2);
              if (iVar10 == (int)param_6[2]) {
                iVar9 = func_0x0029d99c(*puVar11,(long)*(int *)(puVar11 + 1),*param_6,
                                        (long)(int)param_6[1]);
                iVar1 = -iVar9;
                if (iVar10 == 0) {
                  iVar1 = iVar9;
                }
                if (0 < iVar1) goto code_r0x0031e270;
              }
              else if (iVar10 == 0) goto code_r0x0031e270;
            }
code_r0x0031e1b4:
            uVar13 = func_0x002afac4(param_1,param_2,0,1);
            plVar16 = (long *)(ulong)((int)plVar16 + 1);
            if ((int)uVar13 == 0) break;
          } while( true );
        }
      }
LAB_0031e494:
      if (*(char *)(param_7 + 0x28) != '\0') {
        return uVar13;
      }
      if (*(long *)(param_7 + 0x10) != 0) {
        lVar22 = *(long *)(param_7 + 0x10) + -1;
        *(long *)(param_7 + 0x10) = lVar22;
        *(undefined8 *)(param_7 + 0x20) = *(undefined8 *)(*(long *)(param_7 + 8) + lVar22 * 8);
        return uVar13;
      }
      func_0x0079db4c(uVar13);
      param_3 = plVar16;
      goto LAB_0031e4f0;
    }
  }
  else {
LAB_0031e4f0:
    func_0x0079fba4();
  }
  func_0x0079fbcc();
  puStack_8 = &DAT_0031e4f8;
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
  plStack_20 = param_3;
  puStack_18 = unaff_x27;
  piStack_10 = aiStack_23c + 0xaf;
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
  ppiStack_150 = &piStack_10;
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
  pppiStack_190 = &ppiStack_150;
  func_0x00373e9c(0xa296c8,&DAT_002c21e4);
  lVar22 = func_0x002dd408(0xa3a728,&uStack_200,0xd,&uStack_1f0,0x16,auStack_1d8,aiStack_23c);
  if (lVar22 == 0) {
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
  auVar87 = ___stack_chk_fail();
                    /* WARNING: Could not recover jumptable at 0x007b2f8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar13 = (*(code *)PTR____assert_rtn_00a24af8)(auVar87._0_8_,auVar87._8_8_,0xe5);
  return uVar13;
code_r0x0031e28c:
  uVar15 = 0x400;
  if ((int)param_1[1] < 0x11) {
    uVar15 = 0x200;
  }
  iVar10 = func_0x002a18a8(param_1,3);
  if (iVar10 == 0) {
    uVar20 = 3;
code_r0x0031e2f4:
    uVar18 = *(uint *)(param_1 + 1);
    if (uVar18 != 0) {
      puVar17 = (ulong *)*param_1;
      uVar20 = *puVar17 ^ uVar20;
      if (1 < (int)uVar18) {
        if (uVar18 < 9) {
          uVar21 = 1;
        }
        else {
          uVar24 = (ulong)uVar18 - 1;
          uVar26 = uVar24 & 0xfffffffffffffff8;
          uVar21 = uVar26 | 1;
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
          auVar44._8_8_ = 0;
          auVar44._0_8_ = uVar20;
          uVar13 = 0;
          uVar14 = 0;
          uVar63 = 0;
          uVar72 = 0;
          puVar23 = puVar17 + 5;
          uVar15 = uVar26;
          do {
            uVar80 = puVar23[-3];
            uVar20 = puVar23[-4];
            uVar82 = puVar23[-1];
            uVar81 = puVar23[-2];
            uVar84 = puVar23[1];
            uVar83 = *puVar23;
            uVar86 = puVar23[3];
            uVar85 = puVar23[2];
            auVar45[0] = (byte)uVar20 | auVar44[0];
            auVar45[1] = (byte)(uVar20 >> 8) | auVar44[1];
            auVar45[2] = (byte)(uVar20 >> 0x10) | auVar44[2];
            auVar45[3] = (byte)(uVar20 >> 0x18) | auVar44[3];
            auVar45[4] = (byte)(uVar20 >> 0x20) | auVar44[4];
            auVar45[5] = (byte)(uVar20 >> 0x28) | auVar44[5];
            auVar45[6] = (byte)(uVar20 >> 0x30) | auVar44[6];
            auVar45[7] = (byte)(uVar20 >> 0x38) | auVar44[7];
            auVar45[8] = (byte)uVar80 | auVar44[8];
            auVar45[9] = (byte)(uVar80 >> 8) | auVar44[9];
            auVar45[10] = (byte)(uVar80 >> 0x10) | auVar44[10];
            auVar45[0xb] = (byte)(uVar80 >> 0x18) | auVar44[0xb];
            auVar45[0xc] = (byte)(uVar80 >> 0x20) | auVar44[0xc];
            auVar45[0xd] = (byte)(uVar80 >> 0x28) | auVar44[0xd];
            auVar45[0xe] = (byte)(uVar80 >> 0x30) | auVar44[0xe];
            auVar45[0xf] = (byte)(uVar80 >> 0x38) | auVar44[0xf];
            bVar27 = (byte)uVar81 | bVar27;
            bVar28 = (byte)(uVar81 >> 8) | bVar28;
            bVar29 = (byte)(uVar81 >> 0x10) | bVar29;
            bVar30 = (byte)(uVar81 >> 0x18) | bVar30;
            bVar31 = (byte)(uVar81 >> 0x20) | bVar31;
            bVar32 = (byte)(uVar81 >> 0x28) | bVar32;
            bVar33 = (byte)(uVar81 >> 0x30) | bVar33;
            bVar34 = (byte)(uVar81 >> 0x38) | bVar34;
            bVar35 = (byte)uVar82 | bVar35;
            bVar36 = (byte)(uVar82 >> 8) | bVar36;
            bVar37 = (byte)(uVar82 >> 0x10) | bVar37;
            bVar38 = (byte)(uVar82 >> 0x18) | bVar38;
            bVar39 = (byte)(uVar82 >> 0x20) | bVar39;
            bVar40 = (byte)(uVar82 >> 0x28) | bVar40;
            bVar41 = (byte)(uVar82 >> 0x30) | bVar41;
            bVar42 = (byte)(uVar82 >> 0x38) | bVar42;
            bVar46 = (byte)uVar83 | (byte)uVar13;
            bVar47 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar13 >> 8);
            bVar48 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
            bVar49 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
            bVar50 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
            bVar51 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
            bVar52 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
            bVar53 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
            uVar13 = CONCAT17(bVar53,CONCAT16(bVar52,CONCAT15(bVar51,CONCAT14(bVar50,CONCAT13(bVar49
                                                  ,CONCAT12(bVar48,CONCAT11(bVar47,bVar46)))))));
            bVar54 = (byte)uVar84 | (byte)uVar14;
            bVar55 = (byte)(uVar84 >> 8) | (byte)((ulong)uVar14 >> 8);
            bVar56 = (byte)(uVar84 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
            bVar57 = (byte)(uVar84 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
            bVar58 = (byte)(uVar84 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
            bVar59 = (byte)(uVar84 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
            bVar60 = (byte)(uVar84 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
            bVar61 = (byte)(uVar84 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
            uVar14 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57
                                                  ,CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
            bVar62 = (byte)uVar85 | (byte)uVar63;
            bVar64 = (byte)(uVar85 >> 8) | (byte)((ulong)uVar63 >> 8);
            bVar65 = (byte)(uVar85 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
            bVar66 = (byte)(uVar85 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
            bVar67 = (byte)(uVar85 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
            bVar68 = (byte)(uVar85 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
            bVar69 = (byte)(uVar85 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
            bVar70 = (byte)(uVar85 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
            uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66
                                                  ,CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
            bVar71 = (byte)uVar86 | (byte)uVar72;
            bVar73 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar72 >> 8);
            bVar74 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
            bVar75 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
            bVar76 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
            bVar77 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
            bVar78 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
            bVar79 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
            uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75
                                                  ,CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
            uVar15 = uVar15 - 8;
            puVar23 = puVar23 + 8;
            auVar44 = auVar45;
          } while (uVar15 != 0);
          bVar62 = bVar62 | bVar46 | bVar27 | auVar45[0];
          bVar64 = bVar64 | bVar47 | bVar28 | auVar45[1];
          bVar65 = bVar65 | bVar48 | bVar29 | auVar45[2];
          bVar66 = bVar66 | bVar49 | bVar30 | auVar45[3];
          bVar67 = bVar67 | bVar50 | bVar31 | auVar45[4];
          bVar68 = bVar68 | bVar51 | bVar32 | auVar45[5];
          bVar69 = bVar69 | bVar52 | bVar33 | auVar45[6];
          bVar70 = bVar70 | bVar53 | bVar34 | auVar45[7];
          bVar71 = bVar71 | bVar54 | bVar35 | auVar45[8];
          bVar73 = bVar73 | bVar55 | bVar36 | auVar45[9];
          bVar74 = bVar74 | bVar56 | bVar37 | auVar45[10];
          bVar75 = bVar75 | bVar57 | bVar38 | auVar45[0xb];
          bVar76 = bVar76 | bVar58 | bVar39 | auVar45[0xc];
          bVar77 = bVar77 | bVar59 | bVar40 | auVar45[0xd];
          bVar78 = bVar78 | bVar60 | bVar41 | auVar45[0xe];
          bVar79 = bVar79 | bVar61 | bVar42 | auVar45[0xf];
          auVar4[1] = bVar64;
          auVar4[0] = bVar62;
          auVar4[2] = bVar65;
          auVar4[3] = bVar66;
          auVar4[4] = bVar67;
          auVar4[5] = bVar68;
          auVar4[6] = bVar69;
          auVar4[7] = bVar70;
          auVar4[8] = bVar71;
          auVar4[9] = bVar73;
          auVar4[10] = bVar74;
          auVar4[0xb] = bVar75;
          auVar4[0xc] = bVar76;
          auVar4[0xd] = bVar77;
          auVar4[0xe] = bVar78;
          auVar4[0xf] = bVar79;
          auVar5[1] = bVar64;
          auVar5[0] = bVar62;
          auVar5[2] = bVar65;
          auVar5[3] = bVar66;
          auVar5[4] = bVar67;
          auVar5[5] = bVar68;
          auVar5[6] = bVar69;
          auVar5[7] = bVar70;
          auVar5[8] = bVar71;
          auVar5[9] = bVar73;
          auVar5[10] = bVar74;
          auVar5[0xb] = bVar75;
          auVar5[0xc] = bVar76;
          auVar5[0xd] = bVar77;
          auVar5[0xe] = bVar78;
          auVar5[0xf] = bVar79;
          auVar87 = NEON_ext(auVar4,auVar5,8,1);
          uVar20 = CONCAT17(bVar70 | auVar87[7],
                            CONCAT16(bVar69 | auVar87[6],
                                     CONCAT15(bVar68 | auVar87[5],
                                              CONCAT14(bVar67 | auVar87[4],
                                                       CONCAT13(bVar66 | auVar87[3],
                                                                CONCAT12(bVar65 | auVar87[2],
                                                                         CONCAT11(bVar64 | auVar87[1
                                                  ],bVar62 | auVar87[0])))))));
          if (uVar24 == uVar26) goto code_r0x0031e3a0;
        }
        lVar22 = uVar18 - uVar21;
        puVar17 = puVar17 + uVar21;
        do {
          uVar20 = *puVar17 | uVar20;
          lVar22 = lVar22 + -1;
          puVar17 = puVar17 + 1;
        } while (lVar22 != 0);
      }
    }
code_r0x0031e3a0:
    if ((uVar20 == 0) && ((int)param_1[2] == 0)) goto code_r0x0031e3ac;
  }
  else {
    uVar21 = 2;
    do {
      uVar24 = uVar21;
      if (uVar15 == uVar24) goto code_r0x0031e3ac;
      uVar20 = (ulong)*(ushort *)(&UNK_00831e50 + uVar24 * 2);
      iVar10 = func_0x002a18a8(param_1,uVar20);
      uVar21 = uVar24 + 1;
    } while (iVar10 != 0);
    if (uVar24 < uVar15) goto code_r0x0031e2f4;
code_r0x0031e3ac:
    func_0x00373e9c(0xa29210,&DAT_0029be70);
    iVar10 = func_0x0029b6ec(puVar11,param_1,0xa398c0);
    if ((iVar10 == 0) ||
       (iVar10 = func_0x002a7d54((long)&uStack0000000000000028 + 4,puVar11,param_3,param_7),
       iVar10 == 0)) goto LAB_0031e490;
    if (uStack0000000000000028._4_4_ != 0) {
      iVar10 = func_0x002ae678(&uStack0000000000000028,param_1,0,param_7,0,param_8);
      if (iVar10 == 0) goto LAB_0031e490;
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
  if (param_8 != (char *)0x0) {
    if (*param_8 != '\x02') {
      if (*param_8 != '\x01') {
LAB_0031e490:
        uVar13 = 0;
        goto LAB_0031e494;
      }
      iVar10 = (**(code **)(param_8 + 0x10))(2,iStack0000000000000014,param_8);
      goto code_r0x0031e480;
    }
    (**(code **)(param_8 + 0x10))(2,iStack0000000000000014,param_8);
  }
  iVar10 = 1;
code_r0x0031e480:
  uVar13 = 0;
  plVar16 = (long *)(ulong)((int)plVar16 + 1);
  if (iVar10 == 0) goto LAB_0031e494;
  goto code_r0x0031e170;
}

