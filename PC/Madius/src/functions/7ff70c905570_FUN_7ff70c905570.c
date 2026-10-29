/* 7ff70c905570 FUN_7ff70c905570 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c905570(undefined4 *param_1)

{
  uint *puVar1;
  float fVar2;
  code *pcVar3;
  undefined1 auVar4 [16];
  undefined8 uVar5;
  bool bVar6;
  bool bVar7;
  float fVar8;
  float fVar9;
  char cVar10;
  short sVar11;
  int iVar12;
  int iVar13;
  int *piVar14;
  undefined8 *puVar15;
  ulonglong uVar16;
  longlong lVar17;
  undefined4 *puVar18;
  byte *pbVar19;
  undefined *puVar20;
  char *pcVar21;
  char *pcVar22;
  uint uVar23;
  float *pfVar24;
  bool bVar25;
  ulonglong uVar26;
  longlong lVar27;
  short sVar28;
  undefined1 uVar29;
  uint uVar30;
  longlong lVar31;
  short sVar32;
  undefined4 *puVar33;
  longlong lVar34;
  uint *puVar35;
  byte bVar36;
  byte bVar37;
  char cVar38;
  bool bVar39;
  bool bVar40;
  bool bVar41;
  float fVar42;
  float fVar43;
  float fVar44;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  float fVar47;
  undefined1 auVar48 [16];
  float fVar49;
  undefined4 uVar50;
  undefined4 uVar51;
  undefined4 uVar52;
  float fVar53;
  undefined1 auVar54 [16];
  float fVar55;
  float fVar56;
  float fVar57;
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  float fVar61;
  float fVar62;
  undefined1 auVar63 [16];
  undefined1 auStack_148 [32];
  undefined4 uStack_128;
  longlong lStack_120;
  undefined8 uStack_118;
  undefined4 uStack_110;
  undefined4 uStack_10c;
  char cStack_102;
  char cStack_101;
  float fStack_100;
  float fStack_fc;
  float fStack_f8;
  float fStack_f4;
  ulonglong uStack_f0;
  
  lVar17 = _DAT_7ff70cc1a3c0;
  uStack_f0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_148;
  uVar23 = param_1[1] & 0xe000;
  *(undefined1 *)(param_1 + 0x90) = 1;
  *(undefined2 *)((longlong)param_1 + 0x202) = 0;
  bVar41 = false;
  FUN_7ff70cb12b80(*(undefined8 *)(param_1 + 0x14),0,(longlong)(param_1[0x1b] + 0x1f >> 5) << 2);
  FUN_7ff70cb12b80(*(undefined8 *)(param_1 + 0x12));
  *(undefined2 *)(param_1 + 0x87) = 0xffff;
  fVar47 = _DAT_7ff70cb1ba2c;
  lStack_120 = lVar17;
  fVar49 = _DAT_7ff70cb1ba2c;
  if (_DAT_7ff70cb1ba2c <= *(float *)(lVar17 + 0xc8c)) {
    fVar49 = *(float *)(lVar17 + 0xc8c);
  }
  param_1[0x2e] = fVar49;
  uVar16 = (ulonglong)(uint)param_1[0x1b];
  if ((int)param_1[0x1b] < 1) {
    iVar12 = 0xffff;
    fVar49 = 0.0;
    fVar44 = 0.0;
    bVar25 = false;
    fVar55 = 0.0;
    sVar11 = 0;
    uVar30 = param_1[1];
  }
  else {
    iVar13 = 0;
    iVar12 = -1;
    lVar31 = 0;
    sVar11 = 0;
    bVar25 = false;
    bVar6 = false;
    bVar41 = false;
    fVar44 = 0.0;
    fVar49 = 0.0;
    uVar50 = 0;
    uVar51 = 0;
    uVar52 = 0;
    do {
      sVar28 = *(short *)(*(longlong *)(param_1 + 10) + lVar31 * 2);
      lVar34 = (longlong)sVar28;
      if (lVar31 == lVar34) {
        puVar35 = (uint *)(lVar34 * 0x74 + *(longlong *)(param_1 + 6));
        if (sVar28 < *(short *)((longlong)param_1 + 0x206)) goto LAB_7ff70c9056da;
LAB_7ff70c905708:
        *puVar35 = (*puVar35 & 0xf000000 | (uint)(sVar28 != 0) << 0x10 | (param_1[1] & 1) << 5) +
                   (uint)((param_1[1] - 0x2000 & 0xffff) < 0x4000) * 8 + 0x10008 ^ 0x20;
        *(byte *)((longlong)puVar35 + 0x72) = 0;
        bVar37 = *(byte *)((longlong)puVar35 + 0x71) & 3;
        *(byte *)((longlong)puVar35 + 0x71) = bVar37;
        uVar30 = param_1[1];
        if ((uVar30 & 8) != 0) {
          bVar36 = (byte)(uVar30 >> 0x18);
          *(byte *)((longlong)puVar35 + 0x72) = 9;
          bVar36 = bVar36 >> 1 & 4 | (bVar36 >> 3 & 1 | 6) << 4;
          *(byte *)((longlong)puVar35 + 0x71) = bVar37 + bVar36 | 8;
          if ((*(short *)((longlong)puVar35 + 0x5e) != -1) &&
             (((uVar30 >> 0x1b & 1 | 6) >> bVar37 & 1) == 0)) {
            *(byte *)((longlong)puVar35 + 0x71) = bVar36 | 9;
            *(undefined1 *)((longlong)param_1 + 0x23a) = 1;
          }
        }
        *(undefined2 *)(puVar35 + 0x15) = 0xffff;
        puVar35[0xd] = 0;
        puVar35[8] = 0xbf800000;
        if ((*(byte *)(param_1 + 1) & 4) != 0) goto LAB_7ff70c9057ed;
LAB_7ff70c905800:
        *(byte *)(puVar35 + 0x1a) = 1;
        bVar37 = 1;
        if (*(byte *)((longlong)puVar35 + 0x67) != 1) {
LAB_7ff70c90580e:
          *(byte *)((longlong)puVar35 + 0x67) = bVar37;
          *(undefined1 *)((longlong)param_1 + 0x23f) = 1;
          bVar37 = *(byte *)((longlong)puVar35 + 0x67);
        }
      }
      else {
        *(undefined1 *)(param_1 + 0x90) = 0;
        puVar35 = (uint *)(lVar34 * 0x74 + *(longlong *)(param_1 + 6));
        if (*(short *)((longlong)param_1 + 0x206) <= sVar28) goto LAB_7ff70c905708;
LAB_7ff70c9056da:
        if ((*(byte *)(param_1 + 1) & 4) == 0) goto LAB_7ff70c905800;
LAB_7ff70c9057ed:
        if ((*puVar35 & 0x80) != 0) goto LAB_7ff70c905800;
        bVar37 = (byte)puVar35[0x1a];
        if (*(byte *)((longlong)puVar35 + 0x67) != bVar37) goto LAB_7ff70c90580e;
      }
      if (bVar37 == 0) {
        bVar39 = false;
      }
      else {
        bVar39 = (*puVar35 & 1) == 0;
      }
      *(bool *)((longlong)puVar35 + 0x66) = bVar39;
      sVar32 = *(short *)((longlong)puVar35 + 0x5e);
      if (sVar32 != -1 && bVar39 == false) {
        *(undefined1 *)((longlong)param_1 + 0x23a) = 1;
        sVar32 = *(short *)((longlong)puVar35 + 0x5e);
      }
      if ((0 < sVar32) && ((*(byte *)((longlong)param_1 + 7) & 4) == 0)) {
        *(undefined1 *)((longlong)param_1 + 0x23a) = 1;
      }
      pfVar24 = (float *)(puVar35 + 4);
      if ((*puVar35 & 0x10) == 0) {
        pfVar24 = (float *)(puVar35 + 7);
      }
      if (*pfVar24 <= 0.0 && *pfVar24 != 0.0) {
        ((byte *)((longlong)puVar35 + 0x6f))[0] = 7;
        ((byte *)((longlong)puVar35 + 0x6f))[1] = 7;
      }
      if (*(byte *)((longlong)puVar35 + 0x66) == 0) {
        *(undefined2 *)(puVar35 + 0x16) = 0xffff;
      }
      else {
        *(short *)((longlong)puVar35 + 0x5a) = (short)iVar12;
        *(undefined2 *)(puVar35 + 0x17) = 0xffff;
        if (iVar12 == -1) {
          *(short *)(param_1 + 0x87) = sVar28;
        }
        else {
          *(short *)(*(longlong *)(param_1 + 6) + 0x5c + (longlong)iVar12 * 0x74) = sVar28;
        }
        iVar12 = (int)sVar28;
        sVar32 = *(short *)((longlong)param_1 + 0x202);
        *(short *)((longlong)param_1 + 0x202) = sVar32 + 1;
        *(short *)(puVar35 + 0x16) = sVar32;
        puVar1 = (uint *)(*(longlong *)(param_1 + 0x14) + (longlong)(iVar12 >> 5) * 4);
        *puVar1 = *puVar1 | 1 << ((byte)sVar28 & 0x1f);
        puVar1 = (uint *)(*(longlong *)(param_1 + 0x12) +
                         (longlong)((int)*(short *)((longlong)puVar35 + 0x56) >> 5) * 4);
        *puVar1 = *puVar1 | 1 << ((byte)*(short *)((longlong)puVar35 + 0x56) & 0x1f);
        if (*(byte *)((longlong)puVar35 + 0x6d) == 1) {
          uVar30 = *puVar35;
        }
        else {
          uVar30 = *puVar35;
          if (*(short *)(param_1 + 0x1e) == 0) {
            auVar54 = blendvps(ZEXT416(puVar35[0x12]),ZEXT416(puVar35[0x11]),
                               ZEXT416(-(uint)((float)puVar35[0x12] <= (float)puVar35[0x11])));
            auVar54._0_4_ = auVar54._0_4_ - (float)puVar35[0xe];
            if ((uVar30 & 0x2000) == 0) {
              fVar55 = (float)puVar35[0x14] - (float)puVar35[0xe];
              auVar54 = blendvps(ZEXT416((uint)fVar55),auVar54,
                                 ZEXT416(-(uint)(fVar55 <= auVar54._0_4_)));
            }
            if (((uVar30 & 0x10) != 0) && (fVar55 = (float)puVar35[8], 0.0 < fVar55)) {
              if ((*(byte *)(param_1 + 1) & 1) == 0) {
                auVar54 = ZEXT416((uint)fVar55);
              }
              if ((uVar30 & 0x20) != 0) {
                auVar54 = ZEXT416((uint)fVar55);
              }
            }
            auVar54 = blendvps(ZEXT416((uint)param_1[0x2e]),auVar54,
                               ZEXT416(-(uint)((float)param_1[0x2e] <= auVar54._0_4_)));
            puVar35[5] = auVar54._0_4_;
          }
        }
        bVar41 = bVar6;
        if ((uVar30 & 0x20) == 0) {
          bVar41 = true;
        }
        if ((((uVar30 & 0x10) != 0) && ((uVar30 & 0x20) != 0)) && (0.0 < (float)puVar35[8])) {
          puVar35[5] = puVar35[8];
        }
        bVar25 = (bool)(bVar25 | *(byte *)((longlong)puVar35 + 0x6f) != 0);
        fVar55 = (float)puVar35[5];
        bVar6 = bVar41;
        if ((uVar30 & 8) == 0) {
          auVar63._4_4_ = uVar50;
          auVar63._0_4_ = fVar49;
          auVar63._8_4_ = uVar51;
          auVar63._12_4_ = uVar52;
          auVar54 = blendvps(ZEXT416((uint)fVar55),auVar63,ZEXT416(-(uint)(fVar55 <= fVar49)));
          sVar11 = sVar11 + 1;
          fVar49 = auVar54._0_4_;
          uVar50 = auVar54._4_4_;
          uVar51 = auVar54._8_4_;
          uVar52 = auVar54._12_4_;
        }
        else {
          fVar44 = fVar44 + fVar55;
          iVar13 = iVar13 + 1;
        }
      }
      lVar31 = lVar31 + 1;
      uVar16 = (ulonglong)(int)param_1[0x1b];
    } while (lVar31 < (longlong)uVar16);
    fVar55 = (float)iVar13;
    uVar30 = param_1[1];
  }
  if ((((uVar30 & 8) != 0) && ((uVar30 & 0x8000000) == 0)) && (*(short *)(param_1 + 0x80) == 0)) {
    *(undefined1 *)((longlong)param_1 + 0x23a) = 1;
  }
  *(short *)((longlong)param_1 + 0x21e) = (short)iVar12;
  if (bVar25) {
    if (*(longlong *)(param_1 + 0x60) != *(longlong *)(param_1 + 0x62)) {
      *(undefined1 *)(*(longlong *)(param_1 + 0x62) + 0xd1) = 0;
      uVar16 = (ulonglong)(uint)param_1[0x1b];
    }
    *(undefined1 *)((longlong)param_1 + 0x23f) = 1;
  }
  param_1[0x88] = 0xffffffff;
  fVar57 = _DAT_7ff70cb1bae4;
  fVar56 = 0.0;
  if ((int)uVar16 < 1) {
    fVar53 = 0.0;
    fVar61 = 0.0;
  }
  else {
    lVar31 = 0x6f;
    uVar26 = 0;
    fVar61 = 0.0;
    fVar53 = 0.0;
    do {
      if ((*(uint *)(*(longlong *)(param_1 + 0x14) + (uVar26 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar26 & 0x1f) & 1) != 0) {
        lVar34 = *(longlong *)(param_1 + 6);
        uVar30 = *(uint *)(lVar34 + -0x6f + lVar31);
        if ((uVar30 & 0x10) == 0) {
          if (((*(char *)(lVar34 + lVar31) != '\0') || ((uVar30 & 0x20) != 0)) ||
             (fVar42 = *(float *)(lVar34 + -0x53 + lVar31), fVar42 < 0.0)) {
            fVar43 = *(float *)(lVar34 + -0x4f + lVar31);
            fVar42 = fVar43;
            if (fVar43 <= 0.0) {
              fVar42 = fVar47;
            }
            if (fVar43 <= 0.0 && uVar23 == 0x6000) {
              fVar42 = (*(float *)(lVar34 + -0x5b + lVar31) / fVar44) * fVar55;
            }
            *(float *)(lVar34 + -0x53 + lVar31) = fVar42;
          }
          if (((longlong)*(short *)(param_1 + 0x88) == -1) ||
             (*(short *)(lVar34 + -0x19 + lVar31) <
              *(short *)(*(longlong *)(param_1 + 6) + 0x56 +
                        (longlong)*(short *)(param_1 + 0x88) * 0x74))) {
            *(short *)(param_1 + 0x88) = (short)uVar26;
          }
          fVar53 = fVar53 + fVar42;
          if (((longlong)*(short *)((longlong)param_1 + 0x222) == -1) ||
             (*(short *)(*(longlong *)(param_1 + 6) + 0x56 +
                        (longlong)*(short *)((longlong)param_1 + 0x222) * 0x74) <
              *(short *)(lVar34 + -0x19 + lVar31))) {
            *(short *)((longlong)param_1 + 0x222) = (short)uVar26;
          }
        }
        else {
          fVar42 = *(float *)(lVar34 + -0x5b + lVar31);
          cVar10 = *(char *)(lVar34 + lVar31);
          if (cVar10 == '\0') {
            fVar43 = fVar42;
            if ((uVar30 & 0x20) != 0) goto LAB_7ff70c905c26;
LAB_7ff70c905bec:
            if (uVar23 != 0x4000) goto LAB_7ff70c905bf4;
LAB_7ff70c905c31:
            if (cVar10 != '\0') goto LAB_7ff70c905c36;
LAB_7ff70c905bfc:
            if (((uVar30 & 0x20) != 0) && (*(char *)(lVar34 + -4 + lVar31) == '\x01')) {
              *(float *)(lVar34 + -0x5f + lVar31) = fVar43;
            }
          }
          else {
            fVar43 = fVar49;
            if ((uVar30 & 0x20) == 0) goto LAB_7ff70c905bec;
LAB_7ff70c905c26:
            fVar43 = fVar49;
            if (uVar23 == 0x4000) goto LAB_7ff70c905c31;
LAB_7ff70c905bf4:
            fVar43 = fVar42;
            if (cVar10 == '\0') goto LAB_7ff70c905bfc;
LAB_7ff70c905c36:
            *(float *)(lVar34 + -0x5f + lVar31) = fVar43;
            if (((cVar10 != '\x01') && (*(char *)((longlong)param_1 + 0x239) == '\x01')) &&
               (*(char *)(lVar34 + -2 + lVar31) == '\0')) {
              fVar42 = *(float *)(lVar34 + -0x5f + lVar31);
              auVar54 = blendvps(ZEXT416((uint)((float)param_1[0x2e] * fVar57)),
                                 ZEXT416((uint)fVar42),
                                 ZEXT416(-(uint)((float)param_1[0x2e] * fVar57 <= fVar42)));
              *(int *)(lVar34 + -0x5f + lVar31) = auVar54._0_4_;
            }
          }
          fVar61 = fVar61 + *(float *)(lVar34 + -0x5f + lVar31);
        }
        *(undefined1 *)(lVar34 + -2 + lVar31) = 0;
        fVar61 = fVar61 + (float)param_1[0x30] + (float)param_1[0x30];
        uVar16 = (ulonglong)(uint)param_1[0x1b];
      }
      uVar26 = uVar26 + 1;
      lVar31 = lVar31 + 0x74;
    } while ((longlong)uVar26 < (longlong)(int)uVar16);
  }
  iVar12 = (int)uVar16;
  *(short *)(param_1 + 0x81) = sVar11;
  param_1[0x36] = fVar53;
  if ((*(char *)(param_1 + 0x92) != '\0') &&
     (*(char *)(*(longlong *)(param_1 + 0x62) + 0xc9) == '\0')) {
    fVar56 = *(float *)(lVar17 + 0xcc4);
  }
  fVar49 = (float)param_1[0x44];
  fVar44 = (float)param_1[0x2f] + (float)param_1[0x2f] +
           (float)(*(short *)((longlong)param_1 + 0x202) + -1) *
           ((float)param_1[0x31] + (float)param_1[0x32]);
  if ((((*(byte *)((longlong)param_1 + 7) & 1) == 0) || ((float)param_1[0x33] != 0.0)) ||
     (NAN((float)param_1[0x33]))) {
    fVar55 = (float)param_1[0x46] - fVar49;
  }
  else {
    fVar55 = (float)param_1[0x4a] - (float)param_1[0x48];
  }
  fVar57 = (float)param_1[0x45];
  fVar42 = fVar47;
  if (fVar47 <= fVar55 - fVar56) {
    fVar42 = fVar55 - fVar56;
  }
  fVar61 = (fVar42 - fVar44) - fVar61;
  param_1[0x34] =
       (float)(int)*(short *)((longlong)param_1 + 0x202) *
       ((float)param_1[0x30] + (float)param_1[0x30]) + fVar44;
  fVar44 = _DAT_7ff70cb1e928;
  fVar55 = fVar61;
  if (0 < iVar12) {
    uVar26 = 0;
    lVar31 = 0;
    do {
      if ((*(uint *)(*(longlong *)(param_1 + 0x14) + (uVar26 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar26 & 0x1f) & 1) != 0) {
        lVar34 = *(longlong *)(param_1 + 6);
        if ((*(uint *)(lVar34 + lVar31) & 8) != 0) {
          fVar56 = (*(float *)(lVar34 + 0x1c + lVar31) / fVar53) * fVar61;
          auVar54 = blendvps(ZEXT416((uint)param_1[0x2e]),ZEXT416((uint)fVar56),
                             ZEXT416(-(uint)((float)param_1[0x2e] <= fVar56)));
          fVar56 = (float)(int)(auVar54._0_4_ + fVar44);
          *(float *)(lVar34 + 0x10 + lVar31) = fVar56;
          fVar55 = fVar55 - fVar56;
        }
        if ((*(short *)(lVar34 + 0x5c + lVar31) == -1) && (*(short *)(param_1 + 0x88) != -1)) {
          *(uint *)(lVar34 + lVar31) = *(uint *)(lVar34 + lVar31) | 0x40000000;
        }
        fVar56 = *(float *)(lVar34 + 0x10 + lVar31);
        auVar54 = blendvps(ZEXT416((uint)param_1[0x2e]),ZEXT416((uint)fVar56),
                           ZEXT416(-(uint)((float)param_1[0x2e] <= fVar56)));
        *(float *)(lVar34 + 4 + lVar31) = (float)(int)auVar54._0_4_;
        param_1[0x34] = (float)(int)auVar54._0_4_ + (float)param_1[0x34];
        uVar16 = (ulonglong)(uint)param_1[0x1b];
      }
      uVar26 = uVar26 + 1;
      iVar12 = (int)uVar16;
      lVar31 = lVar31 + 0x74;
    } while ((longlong)uVar26 < (longlong)iVar12);
  }
  fVar44 = _DAT_7ff70cb1bae8;
  if (((_DAT_7ff70cb1ba2c <= fVar55) && ((*(byte *)((longlong)param_1 + 6) & 8) == 0)) &&
     ((0 < iVar12 && (0.0 < fVar53)))) {
    uVar16 = (ulonglong)(iVar12 - 1);
    do {
      if ((*(uint *)(*(longlong *)(param_1 + 0x12) + (uVar16 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar16 & 0x1f) & 1) != 0) {
        lVar31 = (longlong)*(short *)(*(longlong *)(param_1 + 10) + uVar16 * 2) * 0x74;
        if ((*(byte *)(*(longlong *)(param_1 + 6) + lVar31) & 8) != 0) {
          lVar31 = *(longlong *)(param_1 + 6) + lVar31;
          *(float *)(lVar31 + 0x10) = *(float *)(lVar31 + 0x10) + fVar47;
          *(float *)(lVar31 + 4) = *(float *)(lVar31 + 4) + fVar47;
          fVar55 = fVar55 + fVar44;
        }
      }
    } while ((fVar47 <= fVar55) && (bVar25 = 0 < (longlong)uVar16, uVar16 = uVar16 - 1, bVar25));
  }
  if ((longlong)*(short *)(param_1 + 0x1e) == 0) {
    puVar33 = param_1 + 0x6a;
  }
  else {
    puVar33 = (undefined4 *)
              (*(longlong *)(param_1 + 0x72) + (longlong)*(short *)(param_1 + 0x1e) * 0x18 + -0x18);
  }
  puVar33[4] = puVar33[5];
  puVar33[5] = 0xffffffff;
  *(undefined4 *)((longlong)param_1 + 0x20a) = 0xffffffff;
  uStack_110 = param_1[0x3e];
  uStack_118 = *(undefined8 *)(param_1 + 0x3c);
  auVar54 = blendvps(ZEXT416((uint)((float)param_1[0x3d] + (float)puVar33[1])),
                     ZEXT416((uint)param_1[0x3f]),
                     ZEXT416(-(uint)((float)param_1[0x3d] + (float)puVar33[1] <=
                                    (float)param_1[0x3f])));
  uStack_10c = auVar54._0_4_;
  uVar50 = *(undefined4 *)(lVar17 + 0x14b4);
  *(undefined4 *)(lVar17 + 0x14b4) = 0;
  cVar10 = FUN_7ff70c8187a0(&uStack_118,0,0);
  *(undefined4 *)(lVar17 + 0x14b4) = uVar50;
  fVar47 = *(float *)(lVar17 + 0xe0);
  if (0.0 < (float)param_1[0x3a]) {
    fVar44 = *(float *)(lVar17 + 0xe4);
    if (((float)param_1[0x3d] <= fVar44) &&
       (fVar55 = (float)param_1[0x3a] + (float)param_1[0x3d], fVar44 <= fVar55)) {
      fVar47 = fVar47 + (float)(int)((fVar55 - fVar44) * (float)param_1[0x3b]);
    }
  }
  bVar25 = 0 < *(short *)(param_1 + 0x8b);
  fVar44 = fVar49;
  if (0 < *(short *)(param_1 + 0x8b)) {
    fVar44 = (float)param_1[0x3c];
  }
  fVar55 = (float)param_1[0x2f];
  fVar56 = (float)param_1[0x31];
  fVar61 = (float)param_1[0x48];
  uVar50 = 0;
  fVar62 = 0.0;
  uVar51 = 0;
  fVar53 = (float)param_1[0x49];
  fVar42 = (float)param_1[0x4a];
  fVar43 = (float)param_1[0x4b];
  iVar12 = 0;
  FUN_7ff70cb12b80(*(undefined8 *)(param_1 + 0x16),0);
  fVar9 = _DAT_7ff70cb1d868;
  fVar8 = _DAT_7ff70cb1c5d8;
  if ((int)param_1[0x1b] < 1) {
LAB_7ff70c906526:
    *(undefined1 *)(*(longlong *)(param_1 + 6) + 0x6b + (longlong)*(short *)(param_1 + 0x87) * 0x74)
         = 1;
    *(undefined1 *)(*(longlong *)(param_1 + 6) + 0x6c + (longlong)*(short *)(param_1 + 0x87) * 0x74)
         = 0;
  }
  else {
    fVar2 = fVar43;
    if (fVar57 <= fVar43) {
      fVar2 = fVar57;
    }
    auVar54 = blendvps(ZEXT416((uint)fVar2),ZEXT416((uint)fVar53),ZEXT416(-(uint)(fVar57 < fVar53)))
    ;
    fVar56 = (fVar44 + fVar55) - fVar56;
    if (_DAT_7ff70cb1c5d8 <= fVar43) {
      fVar43 = _DAT_7ff70cb1c5d8;
    }
    auVar63 = blendvps(ZEXT416((uint)fVar43),ZEXT416((uint)fVar53),
                       ZEXT416(-(uint)(_DAT_7ff70cb1c5d8 < fVar53)));
    uVar16 = 0;
    bVar6 = false;
    bVar39 = false;
LAB_7ff70c906135:
    do {
      uVar29 = 1;
      if (*(short *)(param_1 + 0x8a) < 1) {
        uVar29 = *(undefined1 *)((longlong)param_1 + 0x236);
      }
      sVar11 = *(short *)(*(longlong *)(param_1 + 10) + uVar16 * 2);
      puVar35 = (uint *)(*(longlong *)(param_1 + 6) + (longlong)sVar11 * 0x74);
      *(undefined1 *)((longlong)puVar35 + 0x6e) = uVar29;
      if (bVar25) {
        bVar25 = true;
        if (iVar12 == *(short *)(param_1 + 0x8b)) {
          fVar56 = fVar56 + (fVar49 - (float)param_1[0x3c]);
          goto LAB_7ff70c90618d;
        }
      }
      else {
LAB_7ff70c90618d:
        bVar25 = false;
      }
      *(byte *)((longlong)puVar35 + 3) = *(byte *)((longlong)puVar35 + 3) & 0xf0;
      if ((*(uint *)(*(longlong *)(param_1 + 0x12) + (uVar16 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar16 & 0x1f) & 1) != 0) {
        puVar35[2] = (uint)fVar56;
        lVar17 = (longlong)sVar11 * 0x74 + *(longlong *)(param_1 + 6);
        fVar44 = (float)param_1[0x30];
        fVar55 = (float)param_1[0x32];
        fVar53 = (float)param_1[0x2e] + fVar44 + fVar44 + (float)param_1[0x31] + fVar55;
        fVar57 = fVar8;
        if ((param_1[1] & 0x1000000) == 0) {
          if ((param_1[1] & 0x40000) == 0) {
            fVar57 = (((((float)param_1[0x46] -
                        fVar53 * (float)(~(int)*(short *)(lVar17 + 0x58) +
                                        (int)*(short *)((longlong)param_1 + 0x202))) -
                       *(float *)(lVar17 + 8)) - fVar55) - (fVar44 + fVar44)) - (float)param_1[0x2f]
            ;
          }
        }
        else if (*(short *)(lVar17 + 0x56) < *(short *)((longlong)param_1 + 0x22a)) {
          fVar57 = (((((float)param_1[0x4a] -
                      fVar53 * (float)((int)*(short *)((longlong)param_1 + 0x22a) -
                                      (int)*(short *)(lVar17 + 0x56))) - *(float *)(lVar17 + 8)) -
                    (float)param_1[0x2f]) - fVar44) - fVar55;
        }
        puVar35[6] = (uint)fVar57;
        fVar44 = (float)puVar35[1];
        if (fVar57 <= (float)puVar35[1]) {
          fVar44 = fVar57;
        }
        puVar35[1] = (uint)fVar44;
        fVar55 = (float)puVar35[4];
        if ((float)param_1[0x2e] <= (float)puVar35[4]) {
          fVar55 = (float)param_1[0x2e];
        }
        auVar58 = blendvps(ZEXT416((uint)fVar55),ZEXT416((uint)fVar44),
                           ZEXT416(-(uint)(fVar55 <= fVar44)));
        fVar57 = auVar58._0_4_;
        puVar35[1] = (uint)fVar57;
        fVar55 = (float)param_1[0x30] + (float)param_1[0x30] +
                 fVar57 + fVar56 + (float)param_1[0x31] + (float)param_1[0x32];
        puVar35[3] = (uint)fVar55;
        fVar44 = (float)puVar35[0xe];
        puVar35[0xe] = (uint)((float)param_1[0x30] + fVar56 + (float)param_1[0x31]);
        puVar35[0xf] = (uint)((fVar55 - (float)param_1[0x30]) - (float)param_1[0x32]);
        puVar35[0x10] = (uint)(float)(int)(fVar57 * fVar9);
        puVar35[10] = auVar54._0_4_;
        auVar58 = insertps(ZEXT416((uint)fVar55),ZEXT416((uint)fVar56),0x10);
        auVar60._4_4_ = fVar61;
        auVar60._0_4_ = fVar61;
        auVar60._8_4_ = fVar62;
        auVar60._12_4_ = fVar62;
        auVar59._4_4_ = fVar42;
        auVar59._0_4_ = fVar42;
        auVar59._8_8_ = 0;
        auVar59 = minps(auVar59,auVar58);
        auVar45._4_4_ = -(uint)(auVar58._4_4_ < fVar61);
        auVar45._0_4_ = -(uint)(auVar58._0_4_ < fVar61);
        auVar45._8_4_ = -(uint)(auVar58._8_4_ < fVar62);
        auVar45._12_4_ = -(uint)(auVar58._12_4_ < fVar62);
        auVar58 = blendvps(auVar59,auVar60,auVar45);
        fVar57 = auVar58._4_4_;
        puVar35[9] = (uint)fVar57;
        fVar55 = auVar58._0_4_;
        puVar35[0xb] = (uint)fVar55;
        puVar35[0xc] = auVar63._0_4_;
        *(bool *)((longlong)puVar35 + 0x69) = fVar57 < fVar55;
        *(undefined1 *)((longlong)puVar35 + 0x6a) = 1;
        if (fVar55 <= fVar57) {
          bVar40 = true;
          if (*(char *)((longlong)puVar35 + 0x6f) == '\0') {
            bVar40 = (char)puVar35[0x1c] != '\0';
          }
        }
        else {
          puVar1 = (uint *)(*(longlong *)(param_1 + 0x16) + (longlong)((int)sVar11 >> 5) * 4);
          *puVar1 = *puVar1 | 1 << ((byte)sVar11 & 0x1f);
          bVar40 = true;
        }
        *(bool *)((longlong)puVar35 + 0x6b) = bVar40;
        cVar38 = '\x01';
        bVar7 = bVar6;
        if (*(char *)((longlong)puVar35 + 0x66) == '\x01') {
          cVar38 = *(char *)((longlong)param_1 + 0x24a);
          bVar7 = true;
          if (cVar38 != '\0') {
            bVar7 = bVar39;
          }
        }
        bVar6 = bVar39;
        if (bVar40 != false) {
          bVar6 = bVar7;
        }
        *(char *)(puVar35 + 0x1b) = cVar38;
        uVar23 = (uint)(fVar57 < fVar55) << 0x19 | *puVar35;
        uVar30 = uVar23 | 0x1000000;
        *puVar35 = uVar30;
        if (*(short *)((longlong)puVar35 + 0x5e) != -1) {
          uVar30 = uVar23 | 0x5000000;
          *puVar35 = uVar30;
        }
        if (((cVar10 != '\0') && ((float)puVar35[9] <= fVar47)) && (fVar47 < (float)puVar35[0xb])) {
          *puVar35 = uVar30 | 0x8000000;
          *(short *)((longlong)param_1 + 0x20a) = sVar11;
        }
        fVar55 = (float)puVar35[0xe];
        if (*(short *)(param_1 + 0x1e) == 0) {
          puVar35[0x11] = (uint)fVar55;
          puVar35[0x12] = (uint)fVar55;
          puVar35[0x13] = (uint)fVar55;
          puVar35[0x14] = (uint)fVar55;
          if (*(char *)((longlong)param_1 + 0x24a) == '\0') goto LAB_7ff70c906491;
LAB_7ff70c906498:
          sVar11 = *(short *)(param_1 + 0x8b);
        }
        else {
          fVar55 = fVar55 - fVar44;
          puVar35[0x11] = (uint)(fVar55 + (float)puVar35[0x11]);
          puVar35[0x12] = (uint)(fVar55 + (float)puVar35[0x12]);
          puVar35[0x13] = (uint)(fVar55 + (float)puVar35[0x13]);
          puVar35[0x14] = (uint)(fVar55 + (float)puVar35[0x14]);
          if (*(char *)((longlong)param_1 + 0x24a) != '\0') goto LAB_7ff70c906498;
LAB_7ff70c906491:
          if (*(short *)(param_1 + 0x1e) != 0) goto LAB_7ff70c906498;
          *(byte *)((longlong)puVar35 + 0x6f) = *(byte *)((longlong)puVar35 + 0x6f) >> 1;
          *(byte *)(puVar35 + 0x1c) = (byte)puVar35[0x1c] >> 1;
          sVar11 = *(short *)(param_1 + 0x8b);
        }
        if (iVar12 < sVar11) {
          fVar55 = (float)puVar35[3] + _DAT_7ff70cb1ba2c;
          fVar44 = fVar42;
          if (fVar55 <= fVar42) {
            fVar44 = fVar55;
          }
          auVar4._4_4_ = uVar50;
          auVar4._0_4_ = fVar61;
          auVar4._8_4_ = fVar62;
          auVar4._12_4_ = uVar51;
          auVar58 = blendvps(ZEXT416((uint)fVar44),auVar4,ZEXT416(-(uint)(fVar55 < fVar61)));
          fVar61 = auVar58._0_4_;
          uVar50 = auVar58._4_4_;
          fVar62 = auVar58._8_4_;
          uVar51 = auVar58._12_4_;
        }
        fVar56 = fVar56 + (float)param_1[0x30] + (float)param_1[0x30] +
                          (float)puVar35[1] + (float)param_1[0x31] + (float)param_1[0x32];
        iVar12 = iVar12 + 1;
        uVar16 = uVar16 + 1;
        bVar39 = bVar6;
        if ((longlong)(int)param_1[0x1b] <= (longlong)uVar16) break;
        goto LAB_7ff70c906135;
      }
      puVar35[0xe] = (uint)fVar56;
      puVar35[3] = (uint)fVar56;
      puVar35[2] = (uint)fVar56;
      puVar35[1] = 0;
      fVar44 = fVar42;
      if (fVar56 <= fVar42) {
        fVar44 = fVar56;
      }
      auVar58._4_4_ = uVar50;
      auVar58._0_4_ = fVar61;
      auVar58._8_4_ = fVar62;
      auVar58._12_4_ = uVar51;
      auVar58 = blendvps(ZEXT416((uint)fVar44),auVar58,ZEXT416(-(uint)(fVar56 < fVar61)));
      puVar35[9] = auVar58._0_4_;
      puVar35[10] = auVar54._0_4_;
      puVar35[0xb] = auVar58._0_4_;
      puVar35[0xc] = auVar63._0_4_;
      *(undefined4 *)((longlong)puVar35 + 0x69) = 0x1000000;
      puVar35[0x10] = 0x3f800000;
      uVar16 = uVar16 + 1;
    } while ((longlong)uVar16 < (longlong)(int)param_1[0x1b]);
    if (!bVar6) goto LAB_7ff70c906526;
  }
  fVar49 = *(float *)(*(longlong *)(param_1 + 6) + 0x2c +
                     (longlong)*(short *)((longlong)param_1 + 0x21e) * 0x74);
  auVar54 = blendvps(ZEXT416((uint)fVar49),ZEXT416((uint)param_1[0x44]),
                     ZEXT416(-(uint)(fVar49 <= (float)param_1[0x44])));
  fVar49 = auVar54._0_4_;
  if (((cVar10 != '\0') && (*(short *)((longlong)param_1 + 0x20a) == -1)) && (fVar49 <= fVar47)) {
    *(undefined2 *)((longlong)param_1 + 0x20a) = *(undefined2 *)(param_1 + 0x1b);
  }
  uVar23 = param_1[1];
  if (!bVar41 && (uVar23 & 1) != 0) {
    uVar23 = uVar23 & 0xfffffffe;
    param_1[1] = uVar23;
  }
  *(bool *)((longlong)param_1 + 0x245) = *(int *)(lStack_120 + 0x14b8) != 0;
  if (*(short *)((longlong)param_1 + 0x222) != -1) {
    uVar23 = uVar23 & 0xfffeffff;
    param_1[1] = uVar23;
  }
  if ((uVar23 & 0x10000) != 0) {
    param_1[0x46] = fVar49;
    param_1[0x3e] = fVar49;
    fVar47 = (float)param_1[0x4a];
    if (fVar49 <= (float)param_1[0x4a]) {
      fVar47 = fVar49;
    }
    param_1[0x4a] = fVar47;
  }
  lVar17 = *(longlong *)(param_1 + 0x62);
  uVar5 = *(undefined8 *)(param_1 + 0x46);
  *(undefined8 *)(lVar17 + 0x250) = *(undefined8 *)(param_1 + 0x44);
  *(undefined8 *)(lVar17 + 600) = uVar5;
  param_1[0x2b] = param_1[0x48];
  param_1[0x2c] = param_1[0x4a];
  if ((param_1[1] & 0x20000) == 0) {
    uVar16 = 0;
    if ((param_1[1] & 0x2000000) == 0) {
      uVar16 = (ulonglong)(uint)param_1[0x3f];
    }
    auVar48._8_8_ = 0;
    auVar48._0_8_ = uVar16;
    lVar17 = *(longlong *)(param_1 + 0x62);
    auVar54 = blendvps(auVar48,ZEXT416((uint)*(float *)(lVar17 + 0x27c)),
                       ZEXT416(-(uint)((float)uVar16 <= *(float *)(lVar17 + 0x27c))));
  }
  else {
    auVar54 = ZEXT416((uint)param_1[0x3f]);
    lVar17 = *(longlong *)(param_1 + 0x62);
  }
  fVar47 = auVar54._0_4_ - *(float *)(lStack_120 + 0xcb0);
  fVar49 = *(float *)(lVar17 + 0x24c);
  if (fVar47 <= *(float *)(lVar17 + 0x24c)) {
    fVar49 = fVar47;
  }
  auVar46._4_4_ = auVar54._4_4_;
  auVar46._0_4_ = -(uint)(fVar47 < *(float *)(lVar17 + 0x244));
  auVar46._8_4_ = auVar54._8_4_;
  auVar46._12_4_ = auVar54._12_4_;
  auVar54 = blendvps(ZEXT416((uint)fVar49),ZEXT416((uint)*(float *)(lVar17 + 0x244)),auVar46);
  *(int *)(lVar17 + 0x24c) = auVar54._0_4_;
  sVar11 = *(short *)(param_1 + 0x8a);
  iVar12 = 1;
  if ((*(byte *)((longlong)param_1 + 6) & 0x10) == 0) {
    iVar12 = (int)*(short *)((longlong)param_1 + 0x202);
  }
  bVar41 = true;
  if ((int)param_1[0x1b] <= (int)*(short *)((longlong)param_1 + 0x202)) {
    iVar13 = FUN_7ff70cb12b50(*(undefined8 *)(param_1 + 0x16),*(undefined8 *)(param_1 + 0x14),
                              (longlong)(param_1[0x1b] + 0x1f >> 5) << 2);
    bVar41 = iVar13 != 0;
  }
  iVar13 = (iVar12 << (0 < sVar11)) + (0 < sVar11 | 2);
  FUN_7ff70c7c65a0(*(undefined8 *)(param_1 + 0x68),
                   *(undefined8 *)(*(longlong *)(param_1 + 0x62) + 0x2c8),(uint)bVar41 + iVar13);
  sVar11 = -1;
  if (bVar41 != false) {
    sVar11 = (ushort)bVar41 + (short)iVar13 + -1;
  }
  *(short *)(param_1 + 0x8c) = sVar11;
  *(undefined2 *)((longlong)param_1 + 0x232) = 1;
  sVar11 = (short)iVar12 + 2;
  if (*(short *)(param_1 + 0x8a) < 1) {
    sVar11 = 1;
  }
  *(short *)(param_1 + 0x8d) = sVar11;
  uVar16 = (ulonglong)(uint)param_1[0x1b];
  if (0 < (int)param_1[0x1b]) {
    sVar11 = 2;
    lVar17 = 0x6a;
    lVar31 = 0;
    do {
      lVar34 = *(longlong *)(param_1 + 6);
      if ((*(char *)(lVar34 + -1 + lVar17) == '\x01') && (*(char *)(lVar34 + lVar17) == '\x01')) {
        *(short *)(lVar34 + -8 + lVar17) = sVar11;
        sVar28 = 0;
        if (0 < *(short *)(param_1 + 0x8a)) {
          sVar28 = (short)iVar12 + 1;
        }
        *(short *)(lVar34 + -6 + lVar17) = sVar28 + sVar11;
        sVar28 = sVar11;
        sVar11 = sVar11 + (ushort)((*(byte *)((longlong)param_1 + 6) & 0x10) == 0);
      }
      else {
        sVar28 = *(short *)(param_1 + 0x8c);
        *(short *)(lVar34 + -6 + lVar17) = sVar28;
        *(short *)(lVar34 + -8 + lVar17) = sVar28;
      }
      *(short *)(lVar34 + -10 + lVar17) = sVar28;
      lVar31 = lVar31 + 1;
      uVar16 = (ulonglong)(int)param_1[0x1b];
      lVar17 = lVar17 + 0x74;
    } while (lVar31 < (longlong)uVar16);
  }
  *(undefined8 *)(param_1 + 0x4c) = *(undefined8 *)(param_1 + 0x48);
  *(undefined8 *)(param_1 + 0x4e) = *(undefined8 *)(param_1 + 0x4a);
  uVar5 = *(undefined8 *)(*(longlong *)(param_1 + 0x60) + 0x268);
  *(undefined8 *)(param_1 + 0x50) = *(undefined8 *)(*(longlong *)(param_1 + 0x60) + 0x260);
  *(undefined8 *)(param_1 + 0x52) = uVar5;
  *(undefined8 *)(param_1 + 0x54) = *(undefined8 *)(param_1 + 0x58);
  *(undefined8 *)(param_1 + 0x56) = *(undefined8 *)(param_1 + 0x5a);
  lVar17 = _DAT_7ff70cc1a3c0;
  fVar49 = _DAT_7ff70cb44c90;
  uVar50 = _DAT_7ff70cb1d570;
  if ((*(byte *)(param_1 + 1) & 1) != 0) {
    if ((longlong)*(short *)(param_1 + 0x1e) == 0) {
      puVar18 = param_1 + 0x6a;
    }
    else {
      puVar18 = (undefined4 *)
                (*(longlong *)(param_1 + 0x72) + (longlong)*(short *)(param_1 + 0x1e) * 0x18 + -0x18
                );
    }
    fVar47 = (float)param_1[(ulonglong)(*(short *)(param_1 + 0x8a) < 1) * 8 + 0x3d] +
             (float)param_1[0x3a];
    fVar44 = ((float)puVar18[1] + fVar47) - (float)param_1[0x3a];
    auVar54 = blendvps(ZEXT416((uint)fVar44),ZEXT416((uint)param_1[0x3f]),
                       ZEXT416(-(uint)(fVar44 <= (float)param_1[0x3f])));
    if (0 < (int)uVar16) {
      fVar55 = (float)(int)(*(float *)(_DAT_7ff70cc1a3c0 + 0x1140) * _DAT_7ff70cb1bae4);
      fVar44 = (float)puVar18[2];
      uVar26 = 0;
      do {
        if ((*(uint *)(*(longlong *)(param_1 + 0x12) + (uVar26 >> 5 & 0x7ffffff) * 4) >>
             ((uint)uVar26 & 0x1f) & 1) != 0) {
          sVar11 = *(short *)(*(longlong *)(param_1 + 10) + uVar26 * 2);
          lVar31 = (longlong)sVar11 * 0x74;
          if ((((*(uint *)(*(longlong *)(param_1 + 6) + lVar31) & 0x40000020) == 0) &&
              ((lVar34 = *(longlong *)(param_1 + 6) + lVar31, fVar56 = auVar54._0_4_,
               (*(byte *)((longlong)param_1 + 5) & 8) == 0 ||
               (fVar56 = fVar44 + fVar47, *(char *)((longlong)param_1 + 0x23b) != '\0')))) &&
             ((*(char *)(lVar34 + 0x69) != '\0' || (*(short *)(param_1 + 0x85) == sVar11)))) {
            piVar14 = param_1 + 0x6a;
            if ((longlong)*(short *)(param_1 + 0x1e) != 0) {
              piVar14 = (int *)(*(longlong *)(param_1 + 0x72) +
                                (longlong)*(short *)(param_1 + 0x1e) * 0x18 + -0x18);
            }
            iVar12 = (int)sVar11 + *piVar14 + 1;
            fStack_100 = *(float *)(lVar34 + 0xc);
            fStack_f8 = fStack_100 + fVar55;
            fStack_100 = fStack_100 - fVar55;
            fStack_fc = fVar47;
            fStack_f4 = fVar56;
            FUN_7ff70c837800(&fStack_100,iVar12,0,2);
            cStack_101 = '\0';
            cStack_102 = '\0';
            uStack_128 = 0x40910;
            cVar10 = FUN_7ff70c8782e0(&fStack_100,iVar12,&cStack_101,&cStack_102);
            if ((cVar10 != '\0') && (cVar10 = FUN_7ff70c847b20(0), cVar10 != '\0')) {
              if (*(char *)(*(longlong *)(param_1 + 6) + 0x66 + lVar31) == '\x01') {
                *(undefined1 *)(*(longlong *)(param_1 + 6) + lVar31 + 0x70) = 1;
                *(short *)(param_1 + 0x84) = sVar11;
              }
              FUN_7ff70c817fe0();
              cStack_102 = '\0';
            }
            if (cStack_102 == '\x01') {
              if (*(short *)(param_1 + 0x85) == -1) {
                uVar51 = uVar50;
                if ((longlong)*(short *)((longlong)param_1 + 0x21e) != -1) {
                  uVar51 = *(undefined4 *)
                            (*(longlong *)(param_1 + 6) + 0xc +
                            (longlong)*(short *)((longlong)param_1 + 0x21e) * 0x74);
                }
                param_1[0x38] = uVar51;
              }
              *(short *)((longlong)param_1 + 0x212) = sVar11;
              *(undefined2 *)((longlong)param_1 + 0x7a) = *(undefined2 *)(param_1 + 0x1e);
LAB_7ff70c90694f:
              *(short *)(param_1 + 0x83) = sVar11;
              FUN_7ff70c848190(4);
            }
            else if ((cStack_101 == '\x01') && (fVar49 < *(float *)(lVar17 + 0x14a8)))
            goto LAB_7ff70c90694f;
            uVar16 = (ulonglong)(uint)param_1[0x1b];
          }
        }
        uVar26 = uVar26 + 1;
      } while ((longlong)uVar26 < (longlong)(int)uVar16);
    }
  }
  puVar33[2] = 0;
  *(undefined1 *)((longlong)param_1 + 0x237) = 1;
  *(undefined1 *)((longlong)param_1 + 0x23b) = 0;
  *(undefined2 *)((longlong)param_1 + 0x20e) = 0xffff;
  if (((*(byte *)(param_1 + 0x8f) == 1) && (*(short *)(param_1 + 0x89) != -1)) &&
     (*(short *)((longlong)param_1 + 0x7a) == *(short *)(param_1 + 0x1e))) {
    *(short *)((longlong)param_1 + 0x20e) = *(short *)(param_1 + 0x89);
    if (*(char *)((longlong)param_1 + 0x23d) == '\0') {
LAB_7ff70c906bbb:
      uVar50 = FUN_7ff70c802f50(&UNK_7ff70cb8066f,0,*param_1);
      cVar10 = FUN_7ff70c8507c0(uVar50);
      if (cVar10 != '\0') {
        if (*(char *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xd1) == '\0') {
          uVar23 = param_1[1];
          sVar11 = *(short *)(param_1 + 0x89);
          uVar30 = (uint)sVar11;
          if (((int)uVar30 < 0) || ((int)param_1[0x1b] <= (int)uVar30)) {
            if ((uVar23 & 1) == 0) goto LAB_7ff70c906c63;
LAB_7ff70c906caa:
            if ((*(short *)(param_1 + 0x81) == *(short *)((longlong)param_1 + 0x202)) &&
               ((param_1[1] & 0xe000) != 0x4000)) {
              puVar15 = (undefined8 *)(_DAT_7ff70cc1a3c0 + 0x26e0);
            }
            else {
              puVar15 = (undefined8 *)(_DAT_7ff70cc1a3c0 + 0x26e8);
            }
            puVar20 = &UNK_7ff70cb8e0aa;
            if ((undefined *)*puVar15 != (undefined *)0x0) {
              puVar20 = (undefined *)*puVar15;
            }
            bVar41 = true;
            cVar10 = FUN_7ff70c87d0f0(puVar20,0,0,1);
            if ((cVar10 != '\0') && (iVar12 = param_1[0x1b], 0 < iVar12)) {
              lVar17 = 0x70;
              lVar31 = 0;
              do {
                lVar34 = *(longlong *)(param_1 + 6);
                if ((*(char *)(lVar34 + -10 + lVar17) != '\0') ||
                   ((*(byte *)(lVar34 + -0x70 + lVar17) & 8) != 0)) {
                  *(undefined2 *)(lVar34 + -1 + lVar17) = 0x102;
                  iVar12 = param_1[0x1b];
                }
                lVar31 = lVar31 + 1;
                lVar17 = lVar17 + 0x74;
              } while (lVar31 < iVar12);
            }
          }
          else {
            if ((uVar23 & 1) != 0) {
              if (*(longlong *)(param_1 + 6) != 0) {
                lVar17 = (ulonglong)uVar30 * 0x74;
                pbVar19 = (byte *)(*(longlong *)(param_1 + 6) + lVar17);
                if ((*pbVar19 & 0x20) == 0) {
                  bVar37 = pbVar19[0x66];
                }
                else {
                  bVar37 = 0;
                }
                puVar20 = &UNK_7ff70cb8e0aa;
                if (*(undefined **)(_DAT_7ff70cc1a3c0 + 0x26d8) != (undefined *)0x0) {
                  puVar20 = *(undefined **)(_DAT_7ff70cc1a3c0 + 0x26d8);
                }
                cVar10 = FUN_7ff70c87d0f0(puVar20,0,0,bVar37);
                if ((cVar10 != '\0') &&
                   (*(char *)(*(longlong *)(param_1 + 6) + 0x66 + lVar17) == '\x01')) {
                  *(undefined1 *)(*(longlong *)(param_1 + 6) + lVar17 + 0x70) = 1;
                  *(short *)(param_1 + 0x84) = sVar11;
                }
              }
              goto LAB_7ff70c906caa;
            }
LAB_7ff70c906c63:
            bVar41 = false;
          }
          if ((uVar23 & 2) != 0) {
            puVar20 = &UNK_7ff70cb8e0aa;
            if (*(undefined **)(_DAT_7ff70cc1a3c0 + 0x26f0) != (undefined *)0x0) {
              puVar20 = *(undefined **)(_DAT_7ff70cc1a3c0 + 0x26f0);
            }
            cVar10 = FUN_7ff70c87d0f0(puVar20,0,0,*(byte *)(param_1 + 0x90) ^ 1);
            bVar41 = true;
            if (cVar10 != '\0') {
              *(undefined1 *)((longlong)param_1 + 0x242) = 1;
            }
          }
          if ((uVar23 & 4) != 0) {
            if (bVar41) {
              FUN_7ff70c87d690();
            }
            FUN_7ff70c83c390(0x10,0);
            if (0 < (int)param_1[0x1b]) {
              lVar31 = 0x68;
              lVar17 = 0;
              do {
                lVar34 = *(longlong *)(param_1 + 6);
                uVar23 = *(uint *)(lVar34 + -0x68 + lVar31);
                cVar10 = (char)uVar23;
                if ((uVar23 & 1) == 0) {
                  if ((*(char *)((longlong)param_1 + 0x237) == '\0') &&
                     (pcVar22 = "", *(short *)((longlong)param_1 + 0x206) <= lVar17)) {
LAB_7ff70c906e3b:
                    pcVar21 = "<Unknown>";
                    if (*pcVar22 != '\0') {
                      pcVar21 = pcVar22;
                    }
                  }
                  else {
                    lVar27 = (longlong)*(short *)(lVar34 + -0x14 + lVar31);
                    pcVar22 = "";
                    if (lVar27 == -1) goto LAB_7ff70c906e3b;
                    pcVar21 = "<Unknown>";
                    if (*(longlong *)(param_1 + 0x66) != 0) {
                      pcVar22 = (char *)(*(longlong *)(param_1 + 0x66) + lVar27);
                      goto LAB_7ff70c906e3b;
                    }
                  }
                  bVar41 = -1 < cVar10;
                  cVar38 = *(char *)(lVar34 + -1 + lVar31);
                  if (cVar38 == '\x01') {
                    bVar41 = 1 < *(short *)((longlong)param_1 + 0x202) && -1 < cVar10;
                  }
                  cVar10 = FUN_7ff70c87d0f0(pcVar21,0,cVar38,bVar41);
                  if (cVar10 != '\0') {
                    *(byte *)(lVar34 + lVar31) = *(byte *)(lVar34 + -1 + lVar31) ^ 1;
                  }
                }
                lVar17 = lVar17 + 1;
                lVar31 = lVar31 + 0x74;
              } while (lVar17 < (int)param_1[0x1b]);
            }
            FUN_7ff70c83c5b0();
          }
        }
        FUN_7ff70c850910();
        cVar10 = *(char *)((longlong)param_1 + 0x23a);
        goto joined_r0x7ff70c906c40;
      }
      *(undefined1 *)(param_1 + 0x8f) = 0;
    }
  }
  else {
    if ((*(byte *)((longlong)param_1 + 7) & 0x10) != 0) {
      sVar11 = *(short *)((longlong)param_1 + 0x20a);
      if ((((sVar11 != -1) && (param_1[0x1b] != (int)sVar11)) && (*(short *)(param_1 + 0x83) == -1))
         && (((*(int *)(lStack_120 + 0x14b4) == 0 || (*(char *)((longlong)param_1 + 0x246) != '\0'))
             || (*(char *)(lStack_120 + 0x21b0) == '\x01')))) {
        *(short *)((longlong)param_1 + 0x20e) = sVar11;
      }
    }
    if (((*(char *)((longlong)param_1 + 0x23d) == '\0' & *(byte *)(param_1 + 0x8f)) != 0) &&
       (*(short *)(param_1 + 0x1e) == *(short *)((longlong)param_1 + 0x7a))) goto LAB_7ff70c906bbb;
  }
  cVar10 = *(char *)((longlong)param_1 + 0x23a);
joined_r0x7ff70c906c40:
  if ((cVar10 == '\x01') && ((*(byte *)(param_1 + 1) & 8) != 0)) {
    FUN_7ff70c907a50(param_1);
  }
  if (0 < *(short *)((longlong)param_1 + 0x22a)) {
    *(float *)(*(longlong *)(param_1 + 0x62) + 0x80) =
         *(float *)(*(longlong *)(param_1 + 6) + 0xc +
                   (longlong)
                   *(short *)(*(longlong *)(param_1 + 10) +
                             (ulonglong)((int)*(short *)((longlong)param_1 + 0x22a) - 1) * 2) * 0x74
                   ) - (float)param_1[0x3c];
  }
  if (0 < *(short *)((longlong)param_1 + 0x226)) {
    *(undefined4 *)(*(longlong *)(param_1 + 0x62) + 0x84) = puVar33[3];
  }
  puVar33[3] = 0;
  lVar17 = *(longlong *)(param_1 + 0x62);
  if ((*(byte *)((longlong)param_1 + 6) & 0x10) == 0) {
    FUN_7ff70c7b7c50(*(undefined8 *)(lVar17 + 0x2c8),lVar17 + 0x230,lVar17 + 0x238,0);
  }
  else {
    FUN_7ff70c7c6750(*(undefined8 *)(param_1 + 0x68),*(undefined8 *)(lVar17 + 0x2c8),2);
  }
  if (_DAT_7ff70cbebd80 == (uStack_f0 ^ (ulonglong)auStack_148)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_f0 ^ (ulonglong)auStack_148);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


