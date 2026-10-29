/* 7ff70c8a5e80 FUN_7ff70c8a5e80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8a5e80(longlong param_1)

{
  undefined8 *puVar1;
  bool bVar2;
  code *pcVar3;
  undefined1 auVar4 [16];
  undefined8 uVar5;
  undefined8 uVar6;
  int *piVar7;
  char cVar8;
  bool bVar9;
  undefined1 uVar10;
  int iVar11;
  undefined4 uVar12;
  longlong lVar13;
  undefined8 uVar14;
  int *piVar15;
  longlong lVar16;
  undefined *puVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  ulonglong uVar20;
  longlong lVar21;
  float *pfVar22;
  ulonglong uVar23;
  int *piVar24;
  uint uVar25;
  ulonglong uVar26;
  float *pfVar27;
  int *piVar28;
  float *pfVar29;
  longlong *plVar30;
  uint uVar31;
  int iVar32;
  uint uVar33;
  longlong lVar34;
  uint *puVar35;
  byte bVar36;
  ulonglong uVar37;
  longlong lVar38;
  longlong lVar39;
  undefined8 uVar40;
  int iVar41;
  float fVar42;
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  float fVar47;
  float fVar48;
  float fVar49;
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  float fVar53;
  float fVar54;
  float fVar55;
  float fVar56;
  undefined1 auVar57 [16];
  float fVar58;
  float fVar60;
  undefined1 auVar59 [16];
  longlong lStack_200;
  undefined1 auStack_1f8 [32];
  undefined4 uStack_1d8;
  int iStack_1cc;
  longlong lStack_1c8;
  int *piStack_1c0;
  ulonglong uStack_1b8;
  ulonglong uStack_1b0;
  undefined4 uStack_1a8;
  undefined4 uStack_1a4;
  longlong lStack_1a0;
  ulonglong uStack_198;
  uint uStack_18c;
  undefined8 uStack_188;
  longlong lStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined4 uStack_160;
  undefined4 uStack_15c;
  int iStack_158;
  int iStack_154;
  int iStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  byte bStack_132;
  char cStack_131;
  undefined8 uStack_130;
  int aiStack_124 [2];
  float fStack_11c;
  int iStack_118;
  float afStack_114 [2];
  uint uStack_10c;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined4 uStack_f8;
  ulonglong uStack_f0;
  
  uStack_f0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_1f8;
  lStack_1c8 = _DAT_7ff70cc1a3c0;
  *(undefined1 *)(param_1 + 0x7b) = 0;
  uStack_108 = 0;
  uStack_100 = 0;
  _iStack_118 = 0;
  stack0xfffffffffffffef0 = 0;
  uStack_f8 = 0;
  uVar31 = *(uint *)(param_1 + 8);
  if ((int)uVar31 < 1) {
    bVar36 = 0;
    uVar33 = 0;
  }
  else {
    uVar33 = 0;
    lVar13 = 0;
    uVar20 = 0;
    bVar36 = 0;
    do {
      lVar34 = *(longlong *)(param_1 + 0x10);
      piVar28 = (int *)(lVar34 + lVar13);
      if ((*(int *)(lVar34 + 8 + lVar13) < *(int *)(param_1 + 0x30)) ||
         (*(char *)(lVar34 + 0x28 + lVar13) == '\x01')) {
        iVar41 = *piVar28;
        if (*(int *)(param_1 + 0x28) == iVar41) {
          *(undefined4 *)(param_1 + 0x28) = 0;
          iVar41 = *piVar28;
          if (*(int *)(param_1 + 0x20) != iVar41) goto LAB_7ff70c8a5fa7;
LAB_7ff70c8a5fb6:
          *(undefined4 *)(param_1 + 0x20) = 0;
          if (*(int *)(param_1 + 0x24) != *piVar28) goto LAB_7ff70c8a5f60;
        }
        else {
          if (*(int *)(param_1 + 0x20) == iVar41) goto LAB_7ff70c8a5fb6;
LAB_7ff70c8a5fa7:
          if (*(int *)(param_1 + 0x24) != iVar41) goto LAB_7ff70c8a5f60;
        }
        *(undefined4 *)(param_1 + 0x24) = 0;
      }
      else {
        if (uVar20 != uVar33) {
          lVar39 = (longlong)(int)uVar33 * 0x2c;
          uVar14 = *(undefined8 *)piVar28;
          uVar40 = *(undefined8 *)(piVar28 + 2);
          uVar5 = *(undefined8 *)(piVar28 + 4);
          uVar6 = *(undefined8 *)(piVar28 + 6);
          iVar41 = piVar28[8];
          iVar11 = piVar28[9];
          iVar32 = piVar28[10];
          piVar15 = (int *)(lVar34 + 0x1c + lVar39);
          *piVar15 = piVar28[7];
          piVar15[1] = iVar41;
          piVar15[2] = iVar11;
          piVar15[3] = iVar32;
          puVar1 = (undefined8 *)(lVar34 + 0x10 + lVar39);
          *puVar1 = uVar5;
          puVar1[1] = uVar6;
          *(undefined8 *)(lVar34 + lVar39) = uVar14;
          ((undefined8 *)(lVar34 + lVar39))[1] = uVar40;
          lVar34 = *(longlong *)(param_1 + 0x10);
        }
        lVar39 = (longlong)(int)uVar33 * 0x2c;
        *(short *)(lVar34 + 0x26 + lVar39) = (short)uVar33;
        uVar31 = *(uint *)(lVar34 + 4 + lVar39);
        lVar34 = 0;
        if ((uVar31 & 0x40) == 0) {
          lVar34 = (ulonglong)((char)(byte)uVar31 < '\0') + 1;
        }
        if (0 < (int)uVar33) {
          uVar25 = *(uint *)(*(longlong *)(param_1 + 0x10) + -0x28 + (ulonglong)uVar33 * 0x2c);
          bVar36 = (uVar25 & 0x40) == 0 & (byte)uVar31 >> 6 | bVar36 |
                   ((uVar31 & 0xc0) != 0x80 && (uVar25 & 0xc0) == 0x80);
        }
        (&iStack_118)[lVar34 * 3] = (&iStack_118)[lVar34 * 3] + 1;
        uVar33 = uVar33 + 1;
        uVar31 = *(uint *)(param_1 + 8);
      }
LAB_7ff70c8a5f60:
      uVar20 = uVar20 + 1;
      lVar13 = lVar13 + 0x2c;
    } while ((longlong)uVar20 < (longlong)(int)uVar31);
  }
  if (uVar31 != uVar33) {
    iVar41 = *(int *)(param_1 + 0xc);
    if (iVar41 < (int)uVar33) {
      if (iVar41 == 0) {
        uVar31 = 8;
      }
      else {
        uVar31 = iVar41 / 2 + iVar41;
      }
      if ((int)uVar31 <= (int)uVar33) {
        uVar31 = uVar33;
      }
      lStack_200 = 0x7ff70c8a60bb;
      uVar14 = FUN_7ff70c802100((longlong)(int)uVar31 * 0x2c);
      if (*(longlong *)(param_1 + 0x10) != 0) {
        lStack_200 = 0x7ff70c8a60d7;
        FUN_7ff70cb12b60(uVar14,*(longlong *)(param_1 + 0x10),(longlong)*(int *)(param_1 + 8) * 0x2c
                        );
        lStack_200 = 0x7ff70c8a60e0;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x10));
      }
      *(undefined8 *)(param_1 + 0x10) = uVar14;
      *(uint *)(param_1 + 0xc) = uVar31;
    }
    *(uint *)(param_1 + 8) = uVar33;
  }
  if ((~bVar36 & 1) == 0 && 1 < uVar33) {
    lStack_200 = 0x7ff70c8a6115;
    func_0x7ff70d5f91e5(*(undefined8 *)(param_1 + 0x10),(longlong)(int)uVar33,0x2c);
  }
  lVar13 = lStack_1c8;
  uVar20 = (ulonglong)iStack_118;
  uVar18 = uStack_100 & 0xffffffff;
  uStack_198 = (ulonglong)uStack_10c;
  fVar54 = 0.0;
  fVar55 = 0.0;
  if (0 < (int)(uStack_10c + (int)uStack_100) && 0 < (longlong)uVar20) {
    fVar55 = *(float *)(lStack_1c8 + 0xca4);
  }
  stack0xfffffffffffffef0 = CONCAT44(uStack_10c,fVar55);
  if (0 < (int)uStack_100 && 0 < (int)uStack_10c) {
    fVar54 = *(float *)(lStack_1c8 + 0xca4);
  }
  uStack_108 = CONCAT44(fVar54,(float)uStack_108);
  iVar41 = *(int *)(param_1 + 0x24);
  if (iVar41 != 0) {
    *(int *)(param_1 + 0x20) = iVar41;
    *(undefined4 *)(param_1 + 0x24) = 0;
  }
  if (*(int *)(param_1 + 0x74) != 0) {
    uVar31 = *(uint *)(param_1 + 8);
    if (0 < (longlong)(int)uVar31) {
      piVar28 = *(int **)(param_1 + 0x10);
      lVar34 = 0;
      piVar15 = piVar28;
      do {
        if (*piVar15 == *(int *)(param_1 + 0x74)) {
          if ((piVar15[1] & 0x20U) == 0) {
            uVar33 = (uint)*(short *)(param_1 + 0x78);
            if ((uint)((ulonglong)uVar33 - lVar34) < uVar31) {
              uVar26 = (ulonglong)uVar33 - lVar34 & 0xffffffff;
              if (((piVar28[uVar26 * 0xb + 1] & 0x20U) == 0) &&
                 (((piVar28[uVar26 * 0xb + 1] ^ piVar15[1]) & 0xc0U) == 0)) {
                piVar28 = piVar28 + uVar26 * 0xb;
                uStack_178 = *(undefined8 *)piVar15;
                uStack_170 = *(undefined8 *)(piVar15 + 2);
                uStack_168 = *(undefined8 *)(piVar15 + 4);
                iStack_158 = piVar15[8];
                iStack_154 = piVar15[9];
                iStack_150 = piVar15[10];
                uStack_160 = (undefined4)*(undefined8 *)(piVar15 + 6);
                uStack_15c = (undefined4)((ulonglong)*(undefined8 *)(piVar15 + 6) >> 0x20);
                piVar24 = piVar28 + 0xb;
                piVar7 = piVar28;
                if (0 < *(short *)(param_1 + 0x78)) {
                  piVar24 = piVar15;
                  piVar7 = piVar15 + 0xb;
                }
                uVar31 = -uVar33;
                if ((int)-uVar33 < 0) {
                  uVar31 = uVar33;
                }
                lStack_200 = 0x7ff70c8a7a2a;
                FUN_7ff70cb12b70(piVar24,piVar7,(ulonglong)uVar31 * 0x2c);
                *(ulonglong *)(piVar28 + 7) = CONCAT44(iStack_158,uStack_15c);
                *(ulonglong *)(piVar28 + 9) = CONCAT44(iStack_150,iStack_154);
                *(undefined8 *)(piVar28 + 4) = uStack_168;
                *(ulonglong *)(piVar28 + 6) = CONCAT44(uStack_15c,uStack_160);
                *(undefined8 *)piVar28 = uStack_178;
                *(undefined8 *)(piVar28 + 2) = uStack_170;
                if ((*(byte *)(param_1 + 0x1a) & 0x40) != 0) {
                  lStack_200 = 0x7ff70c8a7a58;
                  FUN_7ff70c8582b0();
                }
                if (*(int *)(param_1 + 0x74) == *(int *)(param_1 + 0x20)) {
                  iVar41 = *(int *)(param_1 + 0x74);
                }
              }
            }
          }
          break;
        }
        lVar34 = lVar34 + -1;
        piVar15 = piVar15 + 0xb;
      } while (-lVar34 != (longlong)(int)uVar31);
    }
    *(undefined4 *)(param_1 + 0x74) = 0;
  }
  lVar34 = _DAT_7ff70cc1a3c0;
  if ((*(byte *)(param_1 + 0x18) & 4) != 0) {
    lVar13 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    fVar56 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc90);
    fVar42 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
    uVar14 = *(undefined8 *)(lVar13 + 0x118);
    uVar12 = *(undefined4 *)(param_1 + 0x38);
    *(float *)(lVar13 + 0x118) = *(float *)(param_1 + 0x34) - fVar56;
    *(undefined4 *)(lVar13 + 0x11c) = uVar12;
    *(float *)(param_1 + 0x34) = fVar42 + fVar56 + *(float *)(param_1 + 0x34);
    uStack_178 = *(undefined8 *)(lVar34 + 0xd54);
    uVar40 = *(undefined8 *)(lVar34 + 0xd5c);
    uStack_170._4_4_ = (float)((ulonglong)uVar40 >> 0x20);
    uStack_170 = CONCAT44(uStack_170._4_4_ * _DAT_7ff70cb1ba70,(int)uVar40);
    lStack_200 = 0x7ff70c8a62b9;
    iStack_1cc = iVar41;
    FUN_7ff70c80a550(0,&uStack_178);
    uStack_148 = 0;
    uStack_140 = 0;
    lStack_200 = 0x7ff70c8a62d6;
    FUN_7ff70c80a550(0x15);
    lStack_200 = 0x7ff70c8a62ea;
    cVar8 = FUN_7ff70c87e8c0(&UNK_7ff70cb80642,0,0x50);
    lStack_200 = 0x7ff70c8a62f6;
    FUN_7ff70c80a7b0(2);
    if (cVar8 == '\0') {
      *(undefined8 *)(lVar13 + 0x118) = uVar14;
      lVar13 = lStack_1c8;
      iVar41 = iStack_1cc;
    }
    else {
      iVar41 = *(int *)(param_1 + 8);
      piVar28 = (int *)0x0;
      piStack_1c0 = (int *)uVar14;
      uStack_1b8 = uVar20;
      uStack_1b0 = uVar18;
      if (0 < iVar41) {
        lVar39 = 0;
        lVar34 = 0;
        do {
          lVar38 = *(longlong *)(param_1 + 0x10);
          if ((*(byte *)(lVar38 + 6 + lVar39) & 0x20) == 0) {
            lVar16 = (longlong)*(int *)(lVar38 + 0x20 + lVar39);
            puVar17 = &UNK_7ff70cb8acd3;
            if (lVar16 != -1) {
              puVar17 = (undefined *)(lVar16 + *(longlong *)(param_1 + 0xa0));
            }
            uStack_148 = 0;
            lStack_200 = 0x7ff70c8a6353;
            cVar8 = FUN_7ff70c87f8e0(puVar17,*(int *)(param_1 + 0x20) == *(int *)(lVar38 + lVar39),0
                                    );
            if (cVar8 != '\0') {
              piVar28 = (int *)(lVar38 + lVar39);
            }
            iVar41 = *(int *)(param_1 + 8);
          }
          lVar34 = lVar34 + 1;
          lVar39 = lVar39 + 0x2c;
        } while (lVar34 < iVar41);
      }
      lVar34 = _DAT_7ff70cc1a3c0;
      lStack_200 = 0x7ff70c8a63b0;
      FUN_7ff70c850910();
      *(int *)(lVar34 + 0x2514) = *(int *)(lVar34 + 0x2514) + -1;
      *(int **)(lVar13 + 0x118) = piStack_1c0;
      uVar20 = uStack_1b8;
      uVar18 = uStack_1b0;
      lVar13 = lStack_1c8;
      iVar41 = iStack_1cc;
      if (piVar28 != (int *)0x0) {
        iVar41 = *piVar28;
        *(int *)(param_1 + 0x20) = iVar41;
      }
    }
  }
  aiStack_124[0] = 0;
  uStack_18c = (int)uVar18 + (int)uVar20;
  aiStack_124[1] = uStack_18c;
  fStack_11c = (float)(int)uVar20;
  iVar11 = *(int *)(param_1 + 8);
  iVar32 = *(int *)(lVar13 + 0x2324);
  if (iVar32 < iVar11) {
    if (iVar32 == 0) {
      iVar32 = 8;
    }
    else {
      iVar32 = iVar32 / 2 + iVar32;
    }
    if (iVar32 <= iVar11) {
      iVar32 = iVar11;
    }
    lStack_200 = 0x7ff70c8a6442;
    uVar14 = FUN_7ff70c802100((longlong)iVar32 * 0xc);
    if (*(longlong *)(lVar13 + 9000) != 0) {
      lStack_200 = 0x7ff70c8a6468;
      FUN_7ff70cb12b60(uVar14,*(longlong *)(lVar13 + 9000),(longlong)*(int *)(lVar13 + 0x2320) * 0xc
                      );
      lStack_200 = 0x7ff70c8a6474;
      FUN_7ff70c802510(*(undefined8 *)(lVar13 + 9000));
    }
    *(undefined8 *)(lVar13 + 9000) = uVar14;
    *(int *)(lVar13 + 0x2324) = iVar32;
  }
  *(int *)(lVar13 + 0x2320) = iVar11;
  fVar42 = _DAT_7ff70cb1da20;
  fVar56 = _DAT_7ff70cb1ba2c;
  bVar2 = false;
  if (*(int *)(param_1 + 8) < 1) {
    bVar9 = true;
    fVar56 = 0.0;
    fVar42 = 0.0;
    fVar47 = 0.0;
    piStack_1c0 = (int *)0x0;
    iStack_1cc = iVar41;
  }
  else {
    uStack_1b8 = uVar20;
    uStack_1b0 = uVar18;
    lVar39 = 0;
    lVar34 = 0;
    piStack_1c0 = (int *)0x0;
    bVar9 = false;
    uVar20 = 0xffffffff;
    lStack_180 = param_1;
    do {
      lVar16 = _DAT_7ff70cc1a3c0;
      lVar38 = *(longlong *)(param_1 + 0x10);
      if (((piStack_1c0 == (int *)0x0) || (piStack_1c0[3] < *(int *)(lVar38 + 0xc + lVar39))) &&
         ((*(byte *)(lVar38 + 6 + lVar39) & 0x20) == 0)) {
        piStack_1c0 = (int *)(lVar38 + lVar39);
      }
      iVar11 = *(int *)(lVar38 + lVar39);
      if (iVar11 == *(int *)(param_1 + 0x20)) {
        bVar9 = true;
      }
      if (iVar41 == 0) {
        if (*(int *)(lVar13 + 0x2154) != iVar11) {
          iVar11 = 0;
        }
        iVar32 = *(int *)(lVar38 + 0x20 + lVar39);
        iVar41 = iVar11;
      }
      else {
        iVar32 = *(int *)(lVar38 + 0x20 + lVar39);
      }
      puVar17 = &UNK_7ff70cb8acd3;
      if ((longlong)iVar32 != -1) {
        puVar17 = (undefined *)((longlong)iVar32 + *(longlong *)(param_1 + 0xa0));
      }
      fVar47 = *(float *)(lVar38 + 0x1c + lVar39);
      uVar31 = *(uint *)(lVar38 + 4 + lVar39);
      if (fVar47 < 0.0) {
        uStack_1d8 = 0xbf800000;
        lStack_200 = 0x7ff70c8a65ef;
        FUN_7ff70c80cf40(&uStack_178,puVar17,0,1);
        fVar47 = fVar56;
        if ((uVar31 & 0x100001) != 0x100000) {
          fVar47 = *(float *)(lVar16 + 0xca4) + *(float *)(lVar16 + 0x1130);
        }
        fVar47 = *(float *)(lVar16 + 0xc8c) + (float)uStack_178 +
                 fVar47 + *(float *)(lVar16 + 0xc8c);
        fVar48 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130) * fVar42;
        if (fVar48 <= fVar47) {
          fVar47 = fVar48;
        }
        uVar31 = *(uint *)(lVar38 + 4 + lVar39);
        param_1 = lStack_180;
        lVar13 = lStack_1c8;
      }
      *(float *)(lVar38 + 0x18 + lVar39) = fVar47;
      uVar18 = (ulonglong)(((char)uVar31 < '\0') + 1);
      if ((uVar31 & 0x40) != 0) {
        uVar18 = 0;
      }
      fVar48 = 0.0;
      if ((int)uVar18 == (int)uVar20) {
        fVar48 = *(float *)(lVar13 + 0xca4);
      }
      afStack_114[uVar18 * 3] = fVar47 + fVar48 + afStack_114[uVar18 * 3];
      lVar21 = (longlong)aiStack_124[uVar18];
      aiStack_124[uVar18] = aiStack_124[uVar18] + 1;
      lVar16 = *(longlong *)(lVar13 + 9000);
      *(int *)(lVar16 + lVar21 * 0xc) = (int)lVar34;
      uVar12 = *(undefined4 *)(lVar38 + 0x18 + lVar39);
      *(undefined4 *)(lVar16 + 8 + lVar21 * 0xc) = uVar12;
      *(undefined4 *)(lVar16 + 4 + lVar21 * 0xc) = uVar12;
      fVar47 = *(float *)(lVar38 + 0x18 + lVar39);
      if (fVar47 <= fVar56) {
        fVar47 = fVar56;
      }
      *(float *)(lVar38 + 0x14 + lVar39) = fVar47;
      lVar34 = lVar34 + 1;
      lVar39 = lVar39 + 0x2c;
      uVar20 = uVar18;
    } while (lVar34 < *(int *)(param_1 + 8));
    fVar56 = uStack_100._4_4_ + 0.0;
    bVar2 = 1 < *(int *)(param_1 + 8);
    bVar9 = !bVar9;
    uVar20 = uStack_1b8;
    uVar18 = uStack_1b0;
    fVar42 = (float)uStack_108;
    fVar47 = afStack_114[0];
    iStack_1cc = iVar41;
  }
  fVar47 = fVar47 + fVar55;
  fVar53 = fVar47 + 0.0 + fVar42 + fVar54 + fVar56;
  *(float *)(param_1 + 0x50) = fVar53;
  lVar13 = _DAT_7ff70cc1a3c0;
  fVar48 = *(float *)(param_1 + 0x3c);
  uStack_1b0 = CONCAT71(uStack_1b0._1_7_,bVar9);
  if (((bVar2) && (fVar48 - *(float *)(param_1 + 0x34) < fVar53)) &&
     ((*(uint *)(param_1 + 0x18) & 0x110) == 0x100)) {
    uVar26 = *(ulonglong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    auVar59 = insertps(_DAT_7ff70cb1eaf0,
                       ZEXT416((uint)(*(float *)(_DAT_7ff70cc1a3c0 + 0xc90) +
                                     *(float *)(_DAT_7ff70cc1a3c0 + 0xc90))),0x10);
    fVar58 = auVar59._0_4_ + *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
    fVar60 = auVar59._4_4_ + *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
    fVar48 = fVar58 + fVar58;
    uStack_188 = *(undefined8 *)(uVar26 + 0x118);
    uStack_148 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd54);
    uStack_140._4_4_ = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd5c) >> 0x20);
    uStack_140 = CONCAT44(uStack_140._4_4_ * _DAT_7ff70cb1ba70,
                          (int)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd5c));
    iVar41 = 0;
    lStack_200 = 0x7ff70c8a6805;
    FUN_7ff70c80a550(0,&uStack_148);
    uStack_178 = 0;
    uStack_170 = 0;
    lStack_200 = 0x7ff70c8a6822;
    FUN_7ff70c80a550(0x15,&uStack_178);
    lStack_200 = 0x7ff70c8a682e;
    FUN_7ff70c83c390(8);
    uVar14 = *(undefined8 *)(lVar13 + 0x74);
    *(undefined8 *)(lVar13 + 0x74) = _DAT_7ff70cb1eb00;
    fVar53 = *(float *)(param_1 + 0x3c) - fVar48;
    auVar59 = blendvps(ZEXT416((uint)fVar53),ZEXT416((uint)*(float *)(param_1 + 0x34)),
                       ZEXT416(-(uint)(fVar53 <= *(float *)(param_1 + 0x34))));
    uVar12 = *(undefined4 *)(param_1 + 0x38);
    *(float *)(uVar26 + 0x118) = auVar59._0_4_;
    *(undefined4 *)(uVar26 + 0x11c) = uVar12;
    lVar39 = _DAT_7ff70cc1a3c0;
    uVar40 = CONCAT44(fVar60,fVar58);
    *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
    lVar34 = *(longlong *)(lVar39 + 0x1440);
    uStack_1b8 = uVar26;
    if (*(char *)(lVar34 + 0xd1) != '\x01') {
      lStack_1a0 = lVar13;
      lStack_200 = 0x7ff70c8a68d0;
      uStack_130 = uVar40;
      uVar12 = FUN_7ff70c8165d0(lVar34,&UNK_7ff70cb8af29,0);
      uStack_178 = *(undefined8 *)(lVar34 + 0x118);
      uStack_170 = CONCAT44((float)((ulonglong)uStack_178 >> 0x20) + fVar60,
                            (float)uStack_178 + fVar58);
      lStack_200 = 0x7ff70c8a68f7;
      FUN_7ff70c84c130();
      lStack_200 = 0x7ff70c8a691c;
      FUN_7ff70c8375f0(&uStack_130);
      iVar41 = 0;
      lStack_200 = 0x7ff70c8a6934;
      cVar8 = FUN_7ff70c837800(&uStack_178,uVar12,0);
      lVar13 = lStack_1a0;
      if (cVar8 != '\0') {
        uStack_1d8 = 0x10;
        lStack_200 = 0x7ff70c8a6963;
        uVar31 = FUN_7ff70c8782e0(&uStack_178,uVar12,&cStack_131,&bStack_132);
        bVar36 = 0x15;
        if (cStack_131 != '\0') {
          bVar36 = bStack_132 | 0x16;
        }
        lStack_200 = 0x7ff70c8a698e;
        uStack_1a8 = FUN_7ff70c80a070(bVar36);
        lStack_200 = 0x7ff70c8a69a1;
        uStack_1a4 = FUN_7ff70c80a070(0);
        lStack_200 = 0x7ff70c8a69b7;
        FUN_7ff70c80dff0(&uStack_178,uVar12,0);
        uStack_1d8 = *(undefined4 *)(lVar39 + 0xc94);
        lStack_200 = 0x7ff70c8a69e2;
        FUN_7ff70c80db10(uStack_178,uStack_170,uStack_1a8);
        fVar49 = (uStack_130._4_4_ - *(float *)(lVar39 + 0x1130)) * _DAT_7ff70cb1ba70;
        fVar53 = ((float)uStack_130 - *(float *)(lVar39 + 0x1130)) * _DAT_7ff70cb1ba70;
        uStack_1d8 = 0x3f800000;
        lStack_200 = 0x7ff70c8a6a6a;
        FUN_7ff70c7fa600(*(undefined8 *)(lVar34 + 0x2c8),
                         CONCAT44((float)(~-(uint)(fVar49 <= 0.0) & (uint)fVar49) + uStack_178._4_4_
                                  ,(float)(~-(uint)(fVar53 <= 0.0) & (uint)fVar53) +
                                   (float)uStack_178),uStack_1a4);
        iVar41 = -(uVar31 & 0xff);
        lVar13 = lStack_1a0;
      }
    }
    uVar12 = *(undefined4 *)(param_1 + 0x38);
    *(float *)(uStack_1b8 + 0x118) = auVar59._0_4_ + fVar58;
    *(undefined4 *)(uStack_1b8 + 0x11c) = uVar12;
    lVar39 = _DAT_7ff70cc1a3c0;
    *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
    lVar34 = *(longlong *)(lVar39 + 0x1440);
    uStack_130 = uVar40;
    if (*(char *)(lVar34 + 0xd1) == '\0') {
      lStack_200 = 0x7ff70c8a6ad6;
      uVar12 = FUN_7ff70c8165d0(lVar34,&UNK_7ff70cb8ae85,0);
      uStack_178 = *(undefined8 *)(lVar34 + 0x118);
      uStack_170 = CONCAT44(fVar60 + (float)((ulonglong)uStack_178 >> 0x20),
                            fVar58 + (float)uStack_178);
      lStack_200 = 0x7ff70c8a6aff;
      FUN_7ff70c84c130();
      lStack_200 = 0x7ff70c8a6b24;
      FUN_7ff70c8375f0(&uStack_130);
      lStack_200 = 0x7ff70c8a6b3a;
      cVar8 = FUN_7ff70c837800(&uStack_178,uVar12,0);
      if (cVar8 != '\0') {
        uStack_1d8 = 0x10;
        lStack_200 = 0x7ff70c8a6b6a;
        uVar10 = FUN_7ff70c8782e0(&uStack_178,uVar12,&cStack_131,&bStack_132);
        lStack_1a0 = CONCAT71(lStack_1a0._1_7_,uVar10);
        bVar36 = 0x15;
        if (cStack_131 != '\0') {
          bVar36 = bStack_132 | 0x16;
        }
        lStack_200 = 0x7ff70c8a6ba0;
        uStack_1a8 = FUN_7ff70c80a070(bVar36);
        lStack_200 = 0x7ff70c8a6bb5;
        uStack_1a4 = FUN_7ff70c80a070(0);
        lStack_200 = 0x7ff70c8a6bcc;
        FUN_7ff70c80dff0(&uStack_178,uVar12,0);
        uStack_1d8 = *(undefined4 *)(lVar39 + 0xc94);
        lStack_200 = 0x7ff70c8a6bf7;
        FUN_7ff70c80db10(uStack_178,uStack_170,uStack_1a8,1);
        fVar58 = (uStack_130._4_4_ - *(float *)(lVar39 + 0x1130)) * _DAT_7ff70cb1ba70;
        fVar53 = ((float)uStack_130 - *(float *)(lVar39 + 0x1130)) * _DAT_7ff70cb1ba70;
        uStack_1d8 = 0x3f800000;
        lStack_200 = 0x7ff70c8a6c87;
        FUN_7ff70c7fa600(*(undefined8 *)(lVar34 + 0x2c8),
                         CONCAT44((float)(~-(uint)(fVar58 <= 0.0) & (uint)fVar58) + uStack_178._4_4_
                                  ,(float)(~-(uint)(fVar53 <= 0.0) & (uint)fVar53) +
                                   (float)uStack_178),uStack_1a4);
        if ((char)lStack_1a0 != '\0') {
          iVar41 = 1;
        }
      }
    }
    lStack_200 = 0x7ff70c8a6c95;
    FUN_7ff70c83c5b0();
    lStack_200 = 0x7ff70c8a6c9f;
    FUN_7ff70c80a7b0(2);
    *(undefined8 *)(lVar13 + 0x74) = uVar14;
    if ((iVar41 != 0) && (*(int *)(param_1 + 0x20) != 0)) {
      uVar31 = *(uint *)(param_1 + 8);
      if (0 < (int)uVar31) {
        piVar28 = *(int **)(param_1 + 0x10);
        uVar26 = 0;
        piVar15 = piVar28;
        do {
          if (*piVar15 == *(int *)(param_1 + 0x20)) goto LAB_7ff70c8a6e09;
          uVar26 = uVar26 + 1;
          piVar15 = piVar15 + 0xb;
        } while (uVar31 != uVar26);
      }
    }
    fVar48 = fVar48 + _DAT_7ff70cb1ba2c;
    *(undefined8 *)(uStack_1b8 + 0x118) = uStack_188;
    fVar48 = *(float *)(param_1 + 0x3c) - fVar48;
    *(float *)(param_1 + 0x3c) = fVar48;
  }
LAB_7ff70c8a6d19:
  pfVar27 = (float *)(param_1 + 0x34);
  fVar53 = fVar47 + fVar56;
  fVar48 = fVar48 - *pfVar27;
  if (fVar48 <= fVar53) {
    fVar56 = fVar53 - fVar48;
joined_r0x7ff70c8a6d72:
    plVar30 = (longlong *)auStack_1f8;
    if ((_DAT_7ff70cb1ba2c <= fVar56) &&
       ((fVar48 <= fVar53 ||
        (plVar30 = (longlong *)auStack_1f8, (*(uint *)(param_1 + 0x18) & 0x80) != 0)))) {
      uVar33 = 0;
      uVar31 = uStack_18c;
      if (fVar53 < fVar48) {
        uVar33 = uStack_18c;
        uVar31 = (uint)uStack_198;
      }
      plVar30 = (longlong *)auStack_1f8;
      if (uVar31 != 0) {
        lVar34 = *(longlong *)(lStack_1c8 + 9000);
        lVar39 = (longlong)(int)uVar33;
        lVar13 = lVar34 + lVar39 * 0xc;
        if (uVar31 == 1) {
          plVar30 = (longlong *)auStack_1f8;
          if (0.0 <= *(float *)(lVar13 + 4)) {
            fVar56 = *(float *)(lVar13 + 4) - fVar56;
            if (fVar56 <= _DAT_7ff70cb1ba2c) {
              fVar56 = _DAT_7ff70cb1ba2c;
            }
            *(float *)(lVar13 + 4) = fVar56;
            plVar30 = (longlong *)auStack_1f8;
          }
LAB_7ff70c8a70c8:
          fVar56 = _DAT_7ff70cb1ba2c;
          lVar13 = lVar39 * 0xc + 4;
          do {
            iVar41 = (int)*(float *)(*(longlong *)(*(longlong *)((longlong)plVar30 + 0x30) + 9000) +
                                    lVar13);
            if (-1 < iVar41) {
              lVar34 = *(longlong *)(param_1 + 0x10);
              lVar16 = (longlong)
                       *(int *)(*(longlong *)(*(longlong *)((longlong)plVar30 + 0x30) + 9000) + -4 +
                               lVar13) * 0x2c;
              fVar42 = (float)iVar41;
              uVar25 = *(uint *)(lVar34 + 4 + lVar16);
              lVar38 = (ulonglong)((char)uVar25 < '\0') + 1;
              if ((uVar25 & 0x40) != 0) {
                lVar38 = 0;
              }
              fVar47 = fVar56;
              if (fVar56 <= fVar42) {
                fVar47 = fVar42;
              }
              *(float *)((longlong)plVar30 + lVar38 * 0xc + 0xe4) =
                   *(float *)((longlong)plVar30 + lVar38 * 0xc + 0xe4) -
                   (*(float *)(lVar34 + 0x14 + lVar16) - fVar47);
              *(float *)(lVar34 + 0x14 + lVar16) = fVar47;
            }
            lVar39 = lVar39 + 1;
            lVar13 = lVar13 + 0xc;
          } while (lVar39 < (int)(uVar33 + uVar31));
        }
        else {
          uStack_1b8 = CONCAT44(uStack_1b8._4_4_,uVar33);
          plVar30 = &lStack_200;
          lStack_200 = lVar39 * 3;
          func_0x7ff70d9ebc4f(lVar13,(longlong)(int)uVar31);
          fVar42 = _DAT_7ff70cb1bae8;
          if (1 < (int)uVar31) {
            uVar19 = (ulonglong)uVar31;
            pfVar22 = (float *)(lVar34 + lVar39 * 0xc + 4);
            uVar26 = 1;
            do {
              fVar47 = *(float *)(lVar13 + 4);
              uVar26 = (ulonglong)(int)uVar26;
              uVar37 = uVar26 + 1;
              if ((longlong)(uVar26 + 1) <= (longlong)uVar19) {
                uVar37 = uVar19;
              }
              pfVar29 = pfVar22 + uVar26 * 3;
              do {
                fVar48 = *pfVar29;
                if (fVar48 < fVar47) {
                  if (0.0 <= fVar48) {
                    fVar47 = fVar47 - fVar48;
                  }
                  else {
                    fVar47 = fVar47 + fVar42;
                  }
                  goto joined_r0x7ff70c8a6f1c;
                }
                uVar26 = uVar26 + 1;
                pfVar29 = pfVar29 + 3;
              } while ((longlong)uVar26 < (longlong)uVar19);
              uVar26 = uVar37 & 0xffffffff;
              fVar47 = fVar47 + fVar42;
joined_r0x7ff70c8a6f1c:
              if (fVar47 <= 0.0) goto LAB_7ff70c8a7001;
              uVar33 = (uint)uVar26;
              fVar48 = fVar56 / (float)(int)uVar33;
              if (fVar47 <= fVar48) {
                fVar48 = fVar47;
              }
              if (0 < (int)uVar33) {
                if (uVar33 < 4) {
                  uVar37 = 0;
                }
                else {
                  uVar37 = 0;
                  pfVar29 = (float *)(lVar34 + lVar39 * 0xc + 0x28);
                  do {
                    pfVar29[-9] = pfVar29[-9] - fVar48;
                    pfVar29[-6] = pfVar29[-6] - fVar48;
                    pfVar29[-3] = pfVar29[-3] - fVar48;
                    *pfVar29 = *pfVar29 - fVar48;
                    uVar37 = uVar37 + 4;
                    pfVar29 = pfVar29 + 0xc;
                  } while ((uVar33 & 0x7ffffffc) != uVar37);
                  if ((uVar26 & 3) == 0) goto LAB_7ff70c8a6fe9;
                }
                lVar38 = 0;
                do {
                  *(float *)((longlong)pfVar22 + lVar38 + uVar37 * 0xc) =
                       *(float *)((longlong)pfVar22 + lVar38 + uVar37 * 0xc) - fVar48;
                  lVar38 = lVar38 + 0xc;
                } while ((ulonglong)((uVar33 & 3) << 2) * 3 != lVar38);
              }
LAB_7ff70c8a6fe9:
              if (((int)uVar31 <= (int)uVar33) ||
                 (fVar56 = fVar56 - fVar48 * (float)(int)uVar33, fVar56 <= 0.0))
              goto LAB_7ff70c8a7001;
            } while( true );
          }
        }
      }
    }
  }
  else {
    fVar56 = (fVar42 + fVar54) - ((fVar48 - fVar47) - fVar56);
    plVar30 = (longlong *)auStack_1f8;
    if (0.0 <= fVar56) goto joined_r0x7ff70c8a6d72;
  }
  *(undefined4 *)(param_1 + 0x4c) = 0;
  fVar56 = 0.0;
  fVar42 = 0.0;
  uVar31 = (uint)uVar20;
  uVar26 = *(ulonglong *)((longlong)plVar30 + 0x60);
  if (0 < (int)uVar31) {
    uVar19 = (ulonglong)(uVar31 - 1);
    if (uVar31 - 1 == 0) {
      uVar23 = 0;
      lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
LAB_7ff70c8a7253:
      lVar34 = *(longlong *)(param_1 + 0x10);
      lVar39 = uVar23 * 0x2c;
      *(float *)(lVar34 + 0x10 + lVar39) = fVar42;
      *(undefined4 *)(lVar34 + 0x20 + lVar39) = 0xffffffff;
      if (uVar23 < uVar19) {
        fVar56 = *(float *)(lVar13 + 0xca4);
      }
      fVar42 = fVar42 + *(float *)(lVar34 + 0x14 + lVar39) + fVar56;
    }
    else {
      lVar34 = 0;
      lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
      uVar37 = 0;
      do {
        uVar23 = uVar37;
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x10 + lVar34) = fVar42;
        *(undefined4 *)(lVar39 + 0x20 + lVar34) = 0xffffffff;
        fVar47 = 0.0;
        if (uVar23 < uVar19) {
          fVar47 = *(float *)(lVar13 + 0xca4);
        }
        fVar42 = fVar42 + fVar47 + *(float *)(lVar39 + 0x14 + lVar34);
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x3c + lVar34) = fVar42;
        *(undefined4 *)(lVar39 + 0x4c + lVar34) = 0xffffffff;
        fVar47 = 0.0;
        if (uVar23 + 1 < uVar19) {
          fVar47 = *(float *)(lVar13 + 0xca4);
        }
        fVar42 = fVar42 + *(float *)(lVar39 + 0x40 + lVar34) + fVar47;
        lVar34 = lVar34 + 0x58;
        uVar37 = uVar23 + 2;
      } while (uVar23 + 2 != (ulonglong)(uVar31 & 0x7ffffffe));
      if ((uVar20 & 1) != 0) {
        uVar23 = uVar23 + 2;
        goto LAB_7ff70c8a7253;
      }
    }
    fVar56 = *(float *)(param_1 + 0x4c);
  }
  fVar47 = *(float *)((longlong)plVar30 + 0xe4);
  fVar56 = (float)(-(uint)(0.0 <= fVar47 + fVar55) & (uint)(fVar47 + fVar55)) + fVar56;
  *(float *)(param_1 + 0x4c) = fVar56;
  fVar42 = fVar42 + fVar55;
  uVar33 = (uint)uVar26;
  if ((int)uVar33 < 1) {
    lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
    uVar25 = *(uint *)((longlong)plVar30 + 0x2c);
    puVar35 = *(uint **)((longlong)plVar30 + 0x38);
    cVar8 = *(char *)((longlong)plVar30 + 0x48);
  }
  else {
    uVar19 = (ulonglong)(uVar33 - 1);
    if (uVar26 == 1) {
      uVar23 = 0;
      lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
      puVar35 = *(uint **)((longlong)plVar30 + 0x38);
      cVar8 = *(char *)((longlong)plVar30 + 0x48);
LAB_7ff70c8a73b2:
      lVar34 = uVar23 * 0x2c + *(longlong *)(param_1 + 0x10);
      lVar39 = uVar20 * 0x2c;
      *(float *)(lVar39 + 0x10 + lVar34) = fVar42;
      *(undefined4 *)(lVar39 + 0x20 + lVar34) = 0xffffffff;
      fVar56 = 0.0;
      if (uVar23 < uVar19) {
        fVar56 = *(float *)(lVar13 + 0xca4);
      }
      fVar42 = fVar42 + *(float *)(lVar39 + 0x14 + lVar34) + fVar56;
      uVar25 = *(uint *)((longlong)plVar30 + 0x2c);
    }
    else {
      lVar34 = uVar20 * 0x2c;
      lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
      cVar8 = *(char *)((longlong)plVar30 + 0x48);
      uVar37 = 0;
      do {
        uVar23 = uVar37;
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x10 + lVar34) = fVar42;
        *(undefined4 *)(lVar39 + 0x20 + lVar34) = 0xffffffff;
        fVar48 = 0.0;
        fVar56 = 0.0;
        if (uVar23 < uVar19) {
          fVar56 = *(float *)(lVar13 + 0xca4);
        }
        fVar42 = fVar42 + fVar56 + *(float *)(lVar39 + 0x14 + lVar34);
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x3c + lVar34) = fVar42;
        *(undefined4 *)(lVar39 + 0x4c + lVar34) = 0xffffffff;
        if (uVar23 + 1 < uVar19) {
          fVar48 = *(float *)(lVar13 + 0xca4);
        }
        fVar42 = fVar42 + *(float *)(lVar39 + 0x40 + lVar34) + fVar48;
        lVar34 = lVar34 + 0x58;
        uVar37 = uVar23 + 2;
      } while (uVar23 + 2 != (ulonglong)(uVar33 & 0x7ffffffe));
      if ((uVar26 & 1) != 0) {
        uVar23 = uVar23 + 2;
        puVar35 = *(uint **)((longlong)plVar30 + 0x38);
        goto LAB_7ff70c8a73b2;
      }
      uVar25 = *(uint *)((longlong)plVar30 + 0x2c);
      puVar35 = *(uint **)((longlong)plVar30 + 0x38);
    }
    fVar56 = *(float *)(param_1 + 0x4c);
  }
  uVar20 = (ulonglong)uVar25;
  fVar56 = (float)(-(uint)(0.0 <= *(float *)((longlong)plVar30 + 0xf0) + fVar54) &
                  (uint)(*(float *)((longlong)plVar30 + 0xf0) + fVar54)) + fVar56;
  *(float *)(param_1 + 0x4c) = fVar56;
  uVar25 = (uint)uVar18;
  if (0 < (int)uVar25) {
    fVar56 = (*(float *)(param_1 + 0x3c) - *pfVar27) - *(float *)((longlong)plVar30 + 0xfc);
    fVar56 = (float)(~-(uint)(fVar56 <= 0.0) & (uint)fVar56);
    if (fVar42 + fVar54 <= fVar56) {
      fVar56 = fVar42 + fVar54;
    }
    if (uVar18 == 1) {
      lVar34 = 0;
LAB_7ff70c8a750b:
      lVar39 = lVar34 * 0x2c + *(longlong *)(param_1 + 0x10);
      lVar34 = (longlong)(int)(uVar33 + uVar31) * 0x2c;
      *(float *)(lVar34 + 0x10 + lVar39) = fVar56;
      *(undefined4 *)(lVar34 + 0x20 + lVar39) = 0xffffffff;
    }
    else {
      lVar34 = (longlong)(int)(uVar33 + uVar31) * 0x2c;
      uVar20 = 0;
      do {
        uVar26 = uVar20;
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x10 + lVar34) = fVar56;
        *(undefined4 *)(lVar39 + 0x20 + lVar34) = 0xffffffff;
        fVar48 = 0.0;
        fVar42 = 0.0;
        if (uVar26 < uVar25 - 1) {
          fVar42 = *(float *)(lVar13 + 0xca4);
        }
        fVar56 = fVar56 + fVar42 + *(float *)(lVar39 + 0x14 + lVar34);
        lVar39 = *(longlong *)(param_1 + 0x10);
        *(float *)(lVar39 + 0x3c + lVar34) = fVar56;
        *(undefined4 *)(lVar39 + 0x4c + lVar34) = 0xffffffff;
        if (uVar26 + 1 < (ulonglong)(uVar25 - 1)) {
          fVar48 = *(float *)(lVar13 + 0xca4);
        }
        fVar56 = fVar56 + *(float *)(lVar39 + 0x40 + lVar34) + fVar48;
        lVar34 = lVar34 + 0x58;
        uVar20 = uVar26 + 2;
      } while (uVar26 + 2 != (ulonglong)(uVar25 & 0x7ffffffe));
      uVar20 = (ulonglong)*(uint *)((longlong)plVar30 + 0x2c);
      puVar35 = *(uint **)((longlong)plVar30 + 0x38);
      if ((uVar18 & 1) != 0) {
        lVar34 = uVar26 + 2;
        goto LAB_7ff70c8a750b;
      }
    }
    fVar56 = *(float *)(param_1 + 0x4c);
  }
  fVar42 = *(float *)((longlong)plVar30 + 0xfc);
  *(float *)(param_1 + 0x4c) = (float)(-(uint)(0.0 <= fVar42) & (uint)(fVar42 + 0.0)) + fVar56;
  if (*(int *)(param_1 + 0x9c) < 0) {
    *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a7576;
    uVar14 = FUN_7ff70c802100();
    lVar13 = *(longlong *)(param_1 + 0xa0);
    if (lVar13 != 0) {
      iVar41 = *(int *)(param_1 + 0x98);
      *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a7594;
      FUN_7ff70cb12b60(uVar14,lVar13,(longlong)iVar41);
      *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a75a0;
      FUN_7ff70c802510();
    }
    *(undefined8 *)(param_1 + 0xa0) = uVar14;
    *(undefined4 *)(param_1 + 0x9c) = 0;
    lVar13 = *(longlong *)((longlong)plVar30 + 0x30);
    uVar20 = (ulonglong)*(uint *)((longlong)plVar30 + 0x2c);
    puVar35 = *(uint **)((longlong)plVar30 + 0x38);
    *(undefined4 *)(param_1 + 0x98) = 0;
    if (cVar8 == '\0') goto LAB_7ff70c8a75cf;
LAB_7ff70c8a7566:
    *(undefined4 *)(param_1 + 0x20) = 0;
LAB_7ff70c8a75d6:
    uVar33 = 0;
    if ((*(int *)(param_1 + 0x24) == 0) && (uVar33 = 0, puVar35 != (uint *)0x0)) {
      uVar33 = *puVar35;
      *(uint *)(param_1 + 0x20) = uVar33;
      uVar20 = (ulonglong)uVar33;
    }
  }
  else {
    *(undefined4 *)(param_1 + 0x98) = 0;
    if (cVar8 != '\0') goto LAB_7ff70c8a7566;
LAB_7ff70c8a75cf:
    uVar33 = *(uint *)(param_1 + 0x20);
    if (uVar33 == 0) goto LAB_7ff70c8a75d6;
  }
  *(uint *)(param_1 + 0x28) = uVar33;
  *(undefined1 *)(param_1 + 0x7c) = 0;
  if ((float)uVar20 == 0.0) {
    if ((*(byte *)(param_1 + 0x19) & 1) != 0) {
      *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a7644;
      cVar8 = FUN_7ff70c818b50(pfVar27,param_1 + 0x3c,CONCAT71((int7)(uVar20 >> 8),1));
      if (cVar8 != '\0') {
        uVar14 = *(undefined8 *)(lVar13 + 0x1440);
        *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a765a;
        cVar8 = FUN_7ff70c8182b0(uVar14,0);
        if (cVar8 != '\0') {
          fVar56 = *(float *)(lVar13 + 0xf0 + (ulonglong)(*(byte *)(lVar13 + 0xb6a) ^ 1) * 4);
          iVar41 = *(byte *)(lVar13 + 0xb6a) + 0x295;
          uVar12 = *(undefined4 *)(param_1 + 0x1c);
          *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a768a;
          cVar8 = FUN_7ff70c846c80(iVar41,uVar12);
          if ((cVar8 != '\0') && ((fVar56 != 0.0 || (NAN(fVar56))))) {
            fVar48 = *(float *)(param_1 + 0x3c) - *(float *)(param_1 + 0x34);
            fVar56 = (fVar56 * (((fVar48 - fVar47) - fVar42) - fVar54)) / _DAT_7ff70cb1eb10;
            fVar48 = *(float *)(param_1 + 0x4c) - fVar48;
            *(undefined4 *)(param_1 + 0x5c) = 0;
            fVar56 = fVar56 + *(float *)(param_1 + 0x58);
            if (fVar48 <= fVar56) {
              fVar56 = fVar48;
            }
            *(uint *)(param_1 + 0x58) = -(uint)(0.0 <= fVar56) & (uint)fVar56;
          }
          uVar12 = *(undefined4 *)(param_1 + 0x1c);
          *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a76f8;
          FUN_7ff70c848280(iVar41,uVar12,0);
        }
      }
    }
  }
  else {
    iVar41 = *(int *)(param_1 + 8);
    if (0 < (longlong)iVar41) {
      pfVar27 = (float *)(*(longlong *)(param_1 + 0x10) + 0x14);
      lVar34 = 0;
      do {
        if (pfVar27[-5] == (float)uVar20) {
          if (((uint)pfVar27[-4] & 0xc0) != 0) break;
          fVar56 = _DAT_7ff70cb1b760;
          if ((int)uVar31 <= (int)lVar34) {
            fVar56 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
          }
          fVar56 = (pfVar27[-1] - fVar47) - fVar56;
          fVar48 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
          if ((int)(iVar41 - uVar25) <= (int)lVar34 + 1) {
            fVar48 = _DAT_7ff70cb1ba2c;
          }
          fVar48 = (pfVar27[-1] - fVar47) + *pfVar27 + fVar48;
          *(undefined4 *)(param_1 + 0x5c) = 0;
          if ((fVar56 < *(float *)(param_1 + 0x58)) ||
             (fVar53 = (((*(float *)(param_1 + 0x3c) - *(float *)(param_1 + 0x34)) - fVar47) -
                       fVar42) - fVar54, fVar53 <= fVar48 - fVar56)) {
            fVar58 = *(float *)(param_1 + 0x54) - fVar48;
          }
          else {
            if (fVar48 - fVar53 <= *(float *)(param_1 + 0x58)) break;
            fVar58 = (fVar56 - fVar53) - *(float *)(param_1 + 0x54);
            fVar56 = fVar48 - fVar53;
          }
          *(uint *)(param_1 + 0x5c) = -(uint)(0.0 <= fVar58) & (uint)fVar58;
          *(float *)(param_1 + 0x58) = fVar56;
          break;
        }
        lVar34 = lVar34 + 1;
        pfVar27 = pfVar27 + 0xb;
      } while (iVar41 != lVar34);
    }
  }
  auVar59._0_4_ =
       *(float *)(param_1 + 0x4c) - (*(float *)(param_1 + 0x3c) - *(float *)(param_1 + 0x34));
  auVar57._8_8_ = 0;
  auVar57._0_8_ = *(ulonglong *)(param_1 + 0x54);
  auVar59._4_4_ = auVar59._0_4_;
  auVar59._8_8_ = 0;
  auVar59 = minps(auVar57,auVar59);
  fVar56 = (float)(-(uint)(0.0 <= auVar59._0_4_) & (uint)auVar59._0_4_);
  fVar48 = (float)(-(uint)(0.0 <= auVar59._4_4_) & (uint)auVar59._4_4_);
  uVar31 = -(uint)(0.0 <= auVar59._12_4_) & (uint)auVar59._12_4_;
  *(ulonglong *)(param_1 + 0x54) = CONCAT44(fVar48,fVar56);
  auVar50._0_8_ = CONCAT44(fVar48,fVar48);
  auVar50._8_4_ = uVar31;
  auVar50._12_4_ = uVar31;
  if ((fVar56 == fVar48) && (!NAN(fVar56) && !NAN(fVar48))) {
    *(undefined4 *)(param_1 + 0x60) = 0;
    goto LAB_7ff70c8a7890;
  }
  fVar53 = *(float *)(lVar13 + 0x1130) * _DAT_7ff70cb1eb14;
  auVar57 = blendvps(ZEXT416((uint)fVar53),ZEXT416((uint)*(float *)(param_1 + 0x60)),
                     ZEXT416(-(uint)(fVar53 <= *(float *)(param_1 + 0x60))));
  auVar51._0_4_ = (float)((uint)(fVar48 - fVar56) & _DAT_7ff70cb1bac0);
  auVar51._4_4_ = (uint)fVar48 & _UNK_7ff70cb1bac4;
  auVar51._8_4_ = uVar31 & _UNK_7ff70cb1bac8;
  auVar51._12_4_ = uVar31 & _UNK_7ff70cb1bacc;
  auVar52._4_12_ = auVar51._4_12_;
  auVar52._0_4_ = auVar51._0_4_ / _DAT_7ff70cb1d964;
  auVar43._4_4_ = auVar51._4_4_;
  auVar43._0_4_ = auVar52._0_4_;
  auVar43._8_4_ = auVar51._8_4_;
  auVar43._12_4_ = auVar51._12_4_;
  auVar44._4_12_ = auVar43._4_12_;
  auVar44._0_4_ = -(uint)(auVar52._0_4_ <= auVar57._0_4_);
  auVar57 = blendvps(auVar52,auVar57,auVar44);
  *(float *)(param_1 + 0x60) = auVar57._0_4_;
  if ((*(int *)(param_1 + 0x30) + 1 < *(int *)(lVar13 + 5000)) ||
     (*(float *)(lVar13 + 0x1130) * _DAT_7ff70cb1d720 < *(float *)(param_1 + 0x5c))) {
LAB_7ff70c8a787f:
    fVar56 = auVar50._0_4_;
  }
  else {
    fVar53 = auVar57._0_4_ * *(float *)(lVar13 + 0x20);
    if (fVar56 < fVar48) {
      fVar53 = fVar53 + fVar56;
      if (fVar48 <= fVar53) {
        fVar53 = fVar48;
      }
      *(float *)(param_1 + 0x54) = fVar53;
      goto LAB_7ff70c8a7890;
    }
    if (fVar48 < fVar56) {
      fVar56 = fVar56 - fVar53;
      auVar45._8_4_ = uVar31;
      auVar45._0_8_ = auVar50._0_8_;
      auVar45._12_4_ = uVar31;
      auVar46._4_12_ = auVar45._4_12_;
      auVar46._0_4_ = -(uint)(fVar48 <= fVar56);
      auVar4._4_4_ = fVar48;
      auVar4._0_4_ = fVar56;
      auVar4._8_4_ = -(uint)(0.0 <= auVar59._8_4_) & (uint)auVar59._8_4_;
      auVar4._12_4_ = uVar31;
      auVar50 = blendvps(auVar50,auVar4,auVar46);
      goto LAB_7ff70c8a787f;
    }
  }
  *(float *)(param_1 + 0x54) = fVar56;
LAB_7ff70c8a7890:
  *(float *)(param_1 + 100) = fVar55 + *(float *)(param_1 + 0x34) + fVar47;
  *(float *)(param_1 + 0x68) = (*(float *)(param_1 + 0x3c) - fVar42) - fVar54;
  lVar13 = *(longlong *)(lVar13 + 0x1440);
  *(undefined8 *)(lVar13 + 0x118) = *(undefined8 *)(param_1 + 0x34);
  fVar55 = *(float *)(param_1 + 0x40);
  fVar54 = *(float *)(param_1 + 0x38);
  *(undefined4 *)((longlong)plVar30 + 0x80) = *(undefined4 *)(param_1 + 0x4c);
  *(float *)((longlong)plVar30 + 0x84) = fVar55 - fVar54;
  *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a78f5;
  FUN_7ff70c8375f0((undefined1 *)((longlong)plVar30 + 0x80));
  fVar55 = *(float *)(param_1 + 0x34) + *(float *)(param_1 + 0x50);
  auVar59 = blendvps(ZEXT416((uint)fVar55),ZEXT416((uint)*(float *)(lVar13 + 0x138)),
                     ZEXT416(-(uint)(fVar55 <= *(float *)(lVar13 + 0x138))));
  *(int *)(lVar13 + 0x138) = auVar59._0_4_;
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)plVar30 + 0x108) ^ (ulonglong)plVar30)) {
    return;
  }
  *(undefined8 *)((longlong)plVar30 + -8) = 0x7ff70c8a7a7a;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar30 + 0x108) ^ (ulonglong)plVar30);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
LAB_7ff70c8a6e09:
  do {
    uVar25 = (uint)uVar26;
    uVar33 = iVar41 + uVar25;
    uVar26 = (ulonglong)uVar33;
    if (uVar33 < uVar31) {
      uVar25 = uVar33;
    }
  } while (((*(byte *)((longlong)piVar28 + (longlong)(int)uVar25 * 0x2c + 6) & 0x20) != 0) &&
          (iVar41 + uVar33 < uVar31));
  *(undefined8 *)(uStack_1b8 + 0x118) = uStack_188;
  fVar48 = *(float *)(param_1 + 0x3c) - (fVar48 + _DAT_7ff70cb1ba2c);
  *(float *)(param_1 + 0x3c) = fVar48;
  iStack_1cc = piVar28[(longlong)(int)uVar25 * 0xb];
  if ((*(byte *)((longlong)(piVar28 + (longlong)(int)uVar25 * 0xb) + 6) & 0x20) == 0) {
    *(int *)(param_1 + 0x20) = iStack_1cc;
  }
  goto LAB_7ff70c8a6d19;
LAB_7ff70c8a7001:
  uVar26 = (ulonglong)(uVar31 & 0x7ffffffe);
  fVar56 = 0.0;
  do {
    fVar42 = *pfVar22;
    fVar47 = (float)(int)fVar42;
    *pfVar22 = fVar47;
    fVar48 = (float)(int)pfVar22[3];
    fVar56 = (pfVar22[3] - fVar48) + (fVar42 - fVar47) + fVar56;
    pfVar22[3] = fVar48;
    pfVar22 = pfVar22 + 6;
    uVar26 = uVar26 - 2;
  } while (uVar26 != 0);
  if ((uVar31 & 1) != 0) {
    fVar42 = (float)(int)*pfVar22;
    fVar56 = fVar56 + (*pfVar22 - fVar42);
    *pfVar22 = fVar42;
  }
  fVar42 = _DAT_7ff70cb1ba2c;
  plVar30 = &lStack_200;
  uVar33 = (uint)piStack_1c0;
  if (0.0 < fVar56) {
    uVar26 = 0;
    do {
      fVar47 = *(float *)(lVar13 + 4 + uVar26 * 0xc);
      fVar48 = *(float *)(lVar13 + 8 + uVar26 * 0xc) - fVar47;
      if (fVar42 <= fVar48) {
        fVar48 = fVar42;
      }
      fVar56 = fVar56 - fVar48;
      uVar37 = uVar26 + 1;
      if (fVar56 <= 0.0) {
        uVar37 = 0;
      }
      if (uVar19 <= uVar26 + 1) {
        uVar37 = 0;
      }
      *(float *)(lVar13 + 4 + uVar26 * 0xc) = fVar47 + fVar48;
      uVar26 = uVar37;
      plVar30 = &lStack_200;
    } while (0.0 < fVar56);
  }
  goto LAB_7ff70c8a70c8;
}


