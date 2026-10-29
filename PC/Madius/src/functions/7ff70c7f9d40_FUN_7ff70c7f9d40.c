/* 7ff70c7f9d40 FUN_7ff70c7f9d40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f9d40(longlong *param_1,int *param_2,float param_3,float *param_4,uint param_5,
                     ushort param_6,float *param_7)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  int *piVar3;
  float fVar4;
  ushort uVar5;
  uint uVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  float *pfVar10;
  code *pcVar11;
  uint *puVar12;
  short sVar13;
  undefined4 uVar14;
  longlong *plVar15;
  ulonglong uVar16;
  uint *puVar17;
  longlong lVar18;
  longlong lVar19;
  int iVar20;
  ulonglong uVar21;
  int iVar22;
  uint uVar23;
  longlong lVar24;
  longlong lVar25;
  int iVar26;
  int iVar27;
  longlong lVar28;
  longlong lVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  float fVar35;
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  undefined1 auStack_128 [32];
  undefined4 uStack_108;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulonglong uStack_d0;
  
  uVar21 = (ulonglong)param_6;
  uStack_d0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_128;
  lVar19 = *param_1;
  fVar33 = (float)(int)(_DAT_7ff70cb1ba70 + param_3);
  fVar34 = *(float *)((longlong)param_1 + 0x14);
  if (((lVar19 == 0) || (*(float *)(lVar19 + 0x14) != fVar33)) ||
     (NAN(*(float *)(lVar19 + 0x14)) || NAN(fVar33))) {
LAB_7ff70c7f9df2:
    lVar18 = param_1[1];
    lVar8 = *(longlong *)(lVar18 + 0x2b0);
    uStack_f8 = CONCAT44(fVar33,(int)param_1[3]);
    uStack_f0 = CONCAT44(uStack_f0._4_4_,fVar34);
    uVar14 = FUN_7ff70c802e60(&uStack_f8,0xc,0);
    plVar15 = (longlong *)FUN_7ff70c805430(*(longlong *)(lVar18 + 0x2b0) + 0xd8,uVar14,0);
    lVar19 = *plVar15;
    if (*plVar15 != 0) goto LAB_7ff70c7f9e46;
    if (((*(byte *)(param_1 + 2) & 8) == 0) && (*(char *)(lVar18 + 0x50) != '\x01')) {
LAB_7ff70c7fa031:
      uStack_108 = uVar14;
      lVar19 = FUN_7ff70c7e7790(lVar18,param_1,fVar33,fVar34);
      *plVar15 = lVar19;
      if (lVar19 != 0) {
LAB_7ff70c7f9e46:
        *(undefined4 *)(lVar19 + 0x50) = *(undefined4 *)(lVar8 + 0xa4);
        *param_1 = lVar19;
        goto LAB_7ff70c7f9e54;
      }
    }
    else {
      uVar6 = *(uint *)(*(longlong *)(lVar18 + 0x2b0) + 0xc0);
      if (0 < (int)uVar6) {
        lVar9 = *(longlong *)(*(longlong *)(lVar18 + 0x2b0) + 0xd0);
        uVar23 = 0;
        lVar19 = 0;
        lVar29 = 0;
        do {
          lVar24 = *(longlong *)(lVar9 + (ulonglong)(uVar23 >> 5) * 8);
          lVar25 = (ulonglong)(uVar23 & 0x1f) * 0x68;
          lVar28 = lVar29;
          if ((*(longlong **)(lVar24 + 0x58 + lVar25) == param_1) &&
             (lVar24 = lVar24 + lVar25, (*(byte *)(lVar24 + 0x4f) & 4) == 0)) {
            if ((*(float *)(lVar24 + 0x18) == fVar34) &&
               (!NAN(*(float *)(lVar24 + 0x18)) && !NAN(fVar34))) {
              fVar30 = *(float *)(lVar24 + 0x14);
              if ((fVar33 < fVar30) && ((lVar19 == 0 || (fVar30 < *(float *)(lVar19 + 0x14))))) {
                lVar19 = lVar24;
              }
              if (((fVar30 < fVar33) && (lVar28 = lVar24, lVar29 != 0)) &&
                 (fVar30 < *(float *)(lVar29 + 0x14) || fVar30 == *(float *)(lVar29 + 0x14))) {
                lVar28 = lVar29;
              }
            }
          }
          uVar23 = uVar23 + 1;
          lVar29 = lVar28;
        } while (uVar6 != uVar23);
        if (lVar19 == 0) {
          lVar19 = lVar28;
          if (lVar28 == 0) {
            uVar23 = 0;
            lVar19 = 0;
            lVar29 = 0;
            do {
              lVar24 = *(longlong *)(lVar9 + (ulonglong)(uVar23 >> 5) * 8);
              lVar25 = (ulonglong)(uVar23 & 0x1f) * 0x68;
              lVar28 = lVar29;
              if ((*(longlong **)(lVar24 + 0x58 + lVar25) == param_1) &&
                 (lVar24 = lVar24 + lVar25, (*(byte *)(lVar24 + 0x4f) & 4) == 0)) {
                fVar30 = *(float *)(lVar24 + 0x14);
                if ((fVar33 < fVar30) && ((lVar19 == 0 || (fVar30 < *(float *)(lVar19 + 0x14))))) {
                  lVar19 = lVar24;
                }
                if (((fVar30 < fVar33) && (lVar28 = lVar24, lVar29 != 0)) &&
                   (fVar30 < *(float *)(lVar29 + 0x14) || fVar30 == *(float *)(lVar29 + 0x14))) {
                  lVar28 = lVar29;
                }
              }
              uVar23 = uVar23 + 1;
              lVar29 = lVar28;
            } while (uVar6 != uVar23);
            if (lVar19 != 0) goto LAB_7ff70c7f9f52;
            lVar19 = lVar28;
            if (lVar28 == 0) goto LAB_7ff70c7fa029;
          }
        }
        else {
LAB_7ff70c7f9f52:
          if ((lVar28 != 0) &&
             ((*(float *)(lVar19 + 0x14) < fVar33 + fVar33 ||
              (*(float *)(lVar28 + 0x14) <= _DAT_7ff70cb1ba70 * fVar33)))) {
            lVar19 = lVar28;
          }
        }
        goto LAB_7ff70c7f9e46;
      }
LAB_7ff70c7fa029:
      if (*(char *)(lVar18 + 0x50) == '\0') goto LAB_7ff70c7fa031;
    }
    lVar19 = 0;
    if (uVar21 < (ulonglong)(longlong)iRam0000000000000020) goto LAB_7ff70c7f9e64;
LAB_7ff70c7fa06d:
    puVar17 = (uint *)FUN_7ff70c7f86d0(lVar19,uVar21,0);
    puVar12 = (uint *)((longlong)*(int *)(lVar19 + 0x40) * 0x2c + *(longlong *)(lVar19 + 0x38));
    if (puVar17 != (uint *)0x0) {
      puVar12 = puVar17;
    }
  }
  else {
    if ((*(float *)(lVar19 + 0x18) != fVar34) || (NAN(*(float *)(lVar19 + 0x18)) || NAN(fVar34)))
    goto LAB_7ff70c7f9df2;
LAB_7ff70c7f9e54:
    if ((ulonglong)(longlong)*(int *)(lVar19 + 0x20) <= uVar21) goto LAB_7ff70c7fa06d;
LAB_7ff70c7f9e64:
    uVar5 = *(ushort *)(*(longlong *)(lVar19 + 0x28) + uVar21 * 2);
    uVar16 = (ulonglong)uVar5;
    if (uVar5 == 0xffff) goto LAB_7ff70c7fa06d;
    if (uVar5 == 0xfffe) {
      uVar16 = (ulonglong)*(int *)(lVar19 + 0x40);
    }
    puVar12 = (uint *)(uVar16 * 0x2c + *(longlong *)(lVar19 + 0x38));
  }
  if ((puVar12 == (uint *)0x0) || ((*puVar12 & 2) == 0)) goto LAB_7ff70c7fa585;
  uVar6 = param_5 | 0xffffff;
  if ((*puVar12 & 1) == 0) {
    uVar6 = param_5;
  }
  fVar34 = _DAT_7ff70cb1ba2c;
  if (0.0 <= param_3) {
    fVar34 = param_3 / *(float *)(lVar19 + 0x14);
  }
  fVar33 = (float)puVar12[2] * fVar34 + (float)(int)*param_4;
  fVar30 = (float)puVar12[4] * fVar34 + (float)(int)*param_4;
  if ((param_7 != (float *)0x0) &&
     ((param_7[2] <= fVar33 && fVar33 != param_7[2] || (fVar30 < *param_7)))) goto LAB_7ff70c7fa585;
  fVar31 = (float)puVar12[3] * fVar34 + (float)(int)param_4[1];
  fVar32 = fVar34 * (float)puVar12[5] + (float)(int)param_4[1];
  fVar34 = (float)puVar12[6];
  fVar37 = (float)puVar12[7];
  fVar36 = (float)puVar12[8];
  fVar35 = (float)puVar12[9];
  if (param_7 != (float *)0x0) {
    fVar39 = *param_7;
    if (fVar39 <= fVar33) {
      fVar38 = param_7[1];
      if (fVar31 < fVar38) goto LAB_7ff70c7fa1fa;
LAB_7ff70c7fa1a1:
      fVar39 = param_7[2];
      fVar38 = fVar31;
      if (fVar30 <= fVar39) goto LAB_7ff70c7fa1b5;
LAB_7ff70c7fa23b:
      fVar36 = (fVar36 - fVar34) * ((fVar39 - fVar33) / (fVar30 - fVar33)) + fVar34;
      fVar4 = param_7[3];
      fVar31 = fVar38;
      fVar30 = fVar39;
    }
    else {
      fVar34 = fVar34 + (fVar36 - fVar34) *
                        (_DAT_7ff70cb1ba2c - (fVar30 - fVar39) / (fVar30 - fVar33));
      fVar38 = param_7[1];
      fVar33 = fVar39;
      if (fVar38 <= fVar31) goto LAB_7ff70c7fa1a1;
LAB_7ff70c7fa1fa:
      fVar37 = fVar37 + (fVar35 - fVar37) *
                        (_DAT_7ff70cb1ba2c - (fVar32 - fVar38) / (fVar32 - fVar31));
      fVar39 = param_7[2];
      if (fVar39 < fVar30) goto LAB_7ff70c7fa23b;
LAB_7ff70c7fa1b5:
      fVar4 = param_7[3];
      fVar31 = fVar38;
    }
    if (fVar4 < fVar32) {
      fVar35 = (fVar35 - fVar37) * ((fVar4 - fVar31) / (fVar32 - fVar31)) + fVar37;
      fVar32 = fVar4;
    }
    if (fVar32 <= fVar31) goto LAB_7ff70c7fa585;
  }
  if ((param_2[0xd] - 0xfffcU < 0xffff0000) && ((*(byte *)(param_2 + 0xc) & 8) != 0)) {
    iVar7 = param_2[8];
    param_2[0x20] = iVar7;
    param_2[0xd] = 0;
    lVar19 = *(longlong *)(param_2 + 2);
    iVar27 = *param_2;
    lVar18 = (longlong)iVar27;
    if (*(int *)(lVar19 + -0x20 + lVar18 * 0x48) == 0) {
      *(int *)(lVar19 + lVar18 * 0x48 + -0x28) = iVar7;
    }
    else {
      uStack_f8 = *(undefined8 *)(param_2 + 0x18);
      uStack_f0 = *(undefined8 *)(param_2 + 0x1a);
      uStack_e8 = *(undefined8 *)(param_2 + 0x1c);
      uStack_e0 = *(undefined8 *)(param_2 + 0x1e);
      iVar22 = param_2[4];
      if (iVar27 == param_2[1]) {
        if (iVar27 == 0) {
          iVar20 = 8;
        }
        else {
          iVar20 = iVar27 / 2 + iVar27;
        }
        iVar26 = iVar27 + 1;
        if (iVar27 + 1 < iVar20) {
          iVar26 = iVar20;
        }
        lVar19 = FUN_7ff70c802100((longlong)iVar26 * 0x48);
        if (*(longlong *)(param_2 + 2) != 0) {
          FUN_7ff70cb12b60(lVar19,*(longlong *)(param_2 + 2),(longlong)*param_2 * 0x48);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
        }
        *(longlong *)(param_2 + 2) = lVar19;
        param_2[1] = iVar26;
        lVar18 = (longlong)*param_2;
      }
      puVar2 = (undefined4 *)(lVar19 + 0x10 + lVar18 * 0x48);
      *puVar2 = (undefined4)uStack_e8;
      puVar2[1] = uStack_e8._4_4_;
      puVar2[2] = (undefined4)uStack_e0;
      puVar2[3] = uStack_e0._4_4_;
      puVar1 = (undefined8 *)(lVar19 + lVar18 * 0x48);
      *puVar1 = uStack_f8;
      puVar1[1] = uStack_f0;
      *(int *)(lVar19 + 0x20 + lVar18 * 0x48) = iVar7;
      *(int *)(lVar19 + 0x24 + lVar18 * 0x48) = iVar22;
      puVar1 = (undefined8 *)(lVar19 + 0x28 + lVar18 * 0x48);
      *puVar1 = 0;
      puVar1[1] = 0;
      puVar1 = (undefined8 *)(lVar19 + 0x38 + lVar18 * 0x48);
      *puVar1 = 0;
      puVar1[1] = 0;
      *param_2 = *param_2 + 1;
    }
  }
  piVar3 = (int *)(*(longlong *)(param_2 + 2) + -0x20 + (longlong)*param_2 * 0x48);
  *piVar3 = *piVar3 + 6;
  iVar7 = param_2[8];
  iVar22 = iVar7 + 4;
  iVar27 = param_2[9];
  if (iVar27 < iVar22) {
    if (iVar27 == 0) {
      iVar27 = 8;
    }
    else {
      iVar27 = iVar27 / 2 + iVar27;
    }
    if (iVar27 <= iVar22) {
      iVar27 = iVar22;
    }
    lVar19 = FUN_7ff70c802100((longlong)iVar27 * 0x14);
    if (*(longlong *)(param_2 + 10) != 0) {
      FUN_7ff70cb12b60(lVar19,*(longlong *)(param_2 + 10),(longlong)param_2[8] * 0x14);
      FUN_7ff70c802510(*(undefined8 *)(param_2 + 10));
    }
    *(longlong *)(param_2 + 10) = lVar19;
    param_2[9] = iVar27;
  }
  else {
    lVar19 = *(longlong *)(param_2 + 10);
  }
  param_2[8] = iVar22;
  *(longlong *)(param_2 + 0x10) = lVar19 + (longlong)iVar7 * 0x14;
  iVar7 = param_2[4];
  iVar22 = iVar7 + 6;
  iVar27 = param_2[5];
  if (iVar27 < iVar22) {
    if (iVar27 == 0) {
      iVar27 = 8;
    }
    else {
      iVar27 = iVar27 / 2 + iVar27;
    }
    if (iVar27 <= iVar22) {
      iVar27 = iVar22;
    }
    lVar19 = FUN_7ff70c802100((longlong)iVar27 * 2);
    if (*(longlong *)(param_2 + 6) != 0) {
      FUN_7ff70cb12b60(lVar19,*(longlong *)(param_2 + 6),(longlong)param_2[4] * 2);
      FUN_7ff70c802510(*(undefined8 *)(param_2 + 6));
    }
    *(longlong *)(param_2 + 6) = lVar19;
    param_2[5] = iVar27;
  }
  else {
    lVar19 = *(longlong *)(param_2 + 6);
  }
  param_2[4] = iVar22;
  *(longlong *)(param_2 + 0x12) = lVar19 + (longlong)iVar7 * 2;
  sVar13 = (short)param_2[0xd];
  *(short *)(lVar19 + (longlong)iVar7 * 2) = sVar13;
  *(short *)(*(longlong *)(param_2 + 0x12) + 2) = sVar13 + 1;
  *(short *)(*(longlong *)(param_2 + 0x12) + 4) = sVar13 + 2;
  *(short *)(*(longlong *)(param_2 + 0x12) + 6) = sVar13;
  *(short *)(*(longlong *)(param_2 + 0x12) + 8) = sVar13 + 2;
  *(short *)(*(longlong *)(param_2 + 0x12) + 10) = sVar13 + 3;
  pfVar10 = *(float **)(param_2 + 0x10);
  *pfVar10 = fVar33;
  pfVar10[1] = fVar31;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 8) = fVar34;
  *(float *)(lVar19 + 0xc) = fVar37;
  *(uint *)(*(longlong *)(param_2 + 0x10) + 0x10) = uVar6;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x14) = fVar30;
  *(float *)(lVar19 + 0x18) = fVar31;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x1c) = fVar36;
  *(float *)(lVar19 + 0x20) = fVar37;
  *(uint *)(*(longlong *)(param_2 + 0x10) + 0x24) = uVar6;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x28) = fVar30;
  *(float *)(lVar19 + 0x2c) = fVar32;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x30) = fVar36;
  *(float *)(lVar19 + 0x34) = fVar35;
  *(uint *)(*(longlong *)(param_2 + 0x10) + 0x38) = uVar6;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x3c) = fVar33;
  *(float *)(lVar19 + 0x40) = fVar32;
  lVar19 = *(longlong *)(param_2 + 0x10);
  *(float *)(lVar19 + 0x44) = fVar34;
  *(float *)(lVar19 + 0x48) = fVar35;
  *(uint *)(*(longlong *)(param_2 + 0x10) + 0x4c) = uVar6;
  param_2[0xd] = param_2[0xd] + 4;
  lVar19 = *(longlong *)(param_2 + 0x12) + _UNK_7ff70cb1ba48;
  *(longlong *)(param_2 + 0x10) = *(longlong *)(param_2 + 0x10) + _DAT_7ff70cb1ba40;
  *(longlong *)(param_2 + 0x12) = lVar19;
LAB_7ff70c7fa585:
  if (_DAT_7ff70cbebd80 == (uStack_d0 ^ (ulonglong)auStack_128)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_d0 ^ (ulonglong)auStack_128);
  pcVar11 = (code *)swi(3);
  (*pcVar11)();
  return;
}


