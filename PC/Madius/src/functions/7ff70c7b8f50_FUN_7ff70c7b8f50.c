/* 7ff70c7b8f50 FUN_7ff70c7b8f50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b8f50(int *param_1,undefined8 *param_2,uint param_3,uint param_4,uint param_5,
                     float param_6)

{
  int *piVar1;
  uint uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined1 auVar5 [16];
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  int iVar11;
  ulonglong uVar12;
  undefined8 *puVar13;
  short sVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  uint uVar17;
  int iVar18;
  undefined8 *puVar19;
  byte bVar20;
  ulonglong uVar21;
  short sVar22;
  short sVar23;
  short sVar24;
  int iVar25;
  short sVar26;
  uint uVar27;
  bool bVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  float fVar35;
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  float fVar40;
  float fVar41;
  undefined1 auStack_128 [44];
  int iStack_fc;
  ulonglong uStack_f8;
  undefined8 uStack_f0;
  ulonglong uStack_e8;
  longlong lStack_e0;
  int iStack_d8;
  int iStack_d4;
  ulonglong uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  int iStack_b8;
  int iStack_b4;
  int iStack_b0;
  int iStack_ac;
  ulonglong uStack_a0;
  
  fVar31 = _DAT_7ff70cb1ba2c;
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_128;
  if (0xffffff < param_4 && 1 < (int)param_3) {
    uVar15 = (ulonglong)param_3;
    uVar12 = (ulonglong)(param_3 - 1);
    uVar3 = **(undefined8 **)(param_1 + 0xe);
    uVar27 = param_3;
    if ((param_5 & 1) == 0) {
      uVar27 = param_3 - 1;
    }
    uStack_d0 = (ulonglong)uVar27;
    uVar2 = param_1[0xc];
    uStack_f8 = uVar15;
    if ((uVar2 & 1) == 0) {
      iVar18 = uVar27 * 6;
      iVar11 = *param_1;
      if (((uVar2 & 8) != 0) && (0xffff < param_1[0xd] + uVar27 * 4)) {
        lVar7 = (longlong)iVar11;
        iVar6 = param_1[8];
        param_1[0x20] = iVar6;
        param_1[0xd] = 0;
        lVar8 = *(longlong *)(param_1 + 2);
        if (*(int *)(lVar8 + -0x20 + lVar7 * 0x48) == 0) {
          *(int *)(lVar8 + lVar7 * 0x48 + -0x28) = iVar6;
          iVar11 = *param_1;
        }
        else {
          uStack_c8 = *(undefined8 *)(param_1 + 0x18);
          uStack_c0 = *(undefined8 *)(param_1 + 0x1a);
          iStack_b8 = param_1[0x1c];
          iStack_b4 = param_1[0x1d];
          iStack_b0 = param_1[0x1e];
          iStack_ac = param_1[0x1f];
          iVar25 = param_1[4];
          if (iVar11 == param_1[1]) {
            uStack_e8 = CONCAT44(uStack_e8._4_4_,iVar6);
            uStack_f0 = CONCAT44(uStack_f0._4_4_,param_1[4]);
            if (iVar11 == 0) {
              iVar6 = 8;
            }
            else {
              iVar6 = iVar11 / 2 + iVar11;
            }
            iVar25 = iVar11 + 1;
            if (iVar11 + 1 < iVar6) {
              iVar25 = iVar6;
            }
            iStack_fc = iVar18;
            lVar8 = FUN_7ff70c802100((longlong)iVar25 * 0x48);
            if (*(longlong *)(param_1 + 2) != 0) {
              FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
              FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
            }
            *(longlong *)(param_1 + 2) = lVar8;
            param_1[1] = iVar25;
            lVar7 = (longlong)*param_1;
            iVar6 = (int)uStack_e8;
            iVar18 = iStack_fc;
            iVar25 = (int)uStack_f0;
          }
          puVar19 = (undefined8 *)(lVar8 + 0x10 + lVar7 * 0x48);
          *puVar19 = CONCAT44(iStack_b4,iStack_b8);
          puVar19[1] = CONCAT44(iStack_ac,iStack_b0);
          puVar19 = (undefined8 *)(lVar8 + lVar7 * 0x48);
          *puVar19 = uStack_c8;
          puVar19[1] = uStack_c0;
          *(int *)(lVar8 + 0x20 + lVar7 * 0x48) = iVar6;
          *(int *)(lVar8 + 0x24 + lVar7 * 0x48) = iVar25;
          puVar19 = (undefined8 *)(lVar8 + 0x28 + lVar7 * 0x48);
          *puVar19 = 0;
          puVar19[1] = 0;
          puVar19 = (undefined8 *)(lVar8 + 0x38 + lVar7 * 0x48);
          *puVar19 = 0;
          puVar19[1] = 0;
          iVar11 = *param_1 + 1;
          *param_1 = iVar11;
        }
      }
      piVar1 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)iVar11 * 0x48);
      *piVar1 = *piVar1 + iVar18;
      iVar11 = param_1[8];
      iVar25 = uVar27 * 4 + iVar11;
      iVar6 = param_1[9];
      if (iVar6 < iVar25) {
        if (iVar6 == 0) {
          iVar6 = 8;
        }
        else {
          iVar6 = iVar6 / 2 + iVar6;
        }
        if (iVar6 <= iVar25) {
          iVar6 = iVar25;
        }
        iStack_fc = iVar18;
        lVar8 = FUN_7ff70c802100((longlong)iVar6 * 0x14);
        if (*(longlong *)(param_1 + 10) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
        }
        *(longlong *)(param_1 + 10) = lVar8;
        param_1[9] = iVar6;
        uVar15 = uStack_f8;
        iVar18 = iStack_fc;
      }
      else {
        lVar8 = *(longlong *)(param_1 + 10);
      }
      param_1[8] = iVar25;
      *(longlong *)(param_1 + 0x10) = lVar8 + (longlong)iVar11 * 0x14;
      iVar11 = param_1[4];
      iVar18 = iVar18 + iVar11;
      iVar6 = param_1[5];
      if (iVar6 < iVar18) {
        if (iVar6 == 0) {
          iVar6 = 8;
        }
        else {
          iVar6 = iVar6 / 2 + iVar6;
        }
        if (iVar6 <= iVar18) {
          iVar6 = iVar18;
        }
        lVar8 = FUN_7ff70c802100((longlong)iVar6 * 2);
        if (*(longlong *)(param_1 + 6) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
        }
        *(longlong *)(param_1 + 6) = lVar8;
        param_1[5] = iVar6;
        uVar15 = uStack_f8;
      }
      else {
        lVar8 = *(longlong *)(param_1 + 6);
      }
      param_1[4] = iVar18;
      *(longlong *)(param_1 + 0x12) = lVar8 + (longlong)iVar11 * 2;
      param_6 = param_6 * _DAT_7ff70cb1ba70;
      uVar12 = 1;
      do {
        uVar10 = uVar12 & 0xffffffff;
        if ((uVar15 & 0xffffffff) == uVar12) {
          uVar10 = 0;
        }
        fVar41 = (float)param_2[uVar12 - 1];
        fVar31 = (float)param_2[uVar10] - fVar41;
        fVar32 = (float)((ulonglong)param_2[uVar10] >> 0x20) -
                 (float)((ulonglong)param_2[uVar12 - 1] >> 0x20);
        fVar38 = fVar32 * fVar32;
        auVar29._0_4_ = fVar38 + fVar31 * fVar31;
        auVar29._4_4_ = fVar38 + fVar38;
        auVar29._8_8_ = 0;
        if (0.0 < auVar29._0_4_) {
          auVar30 = rsqrtss(auVar29,auVar29);
          fVar31 = fVar31 * auVar30._0_4_;
          fVar32 = fVar32 * auVar30._0_4_;
        }
        fVar31 = param_6 * fVar31;
        fVar32 = fVar32 * param_6;
        **(float **)(param_1 + 0x10) = fVar41 + fVar32;
        *(float *)(*(longlong *)(param_1 + 0x10) + 4) =
             *(float *)((longlong)param_2 + uVar12 * 8 + -4) - fVar31;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x14) = *(float *)(param_2 + uVar10) + fVar32;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x18) =
             *(float *)((longlong)param_2 + uVar10 * 8 + 4) - fVar31;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_4;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x28) = *(float *)(param_2 + uVar10) - fVar32;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x2c) =
             *(float *)((longlong)param_2 + uVar10 * 8 + 4) + fVar31;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x38) = param_4;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x3c) =
             *(float *)(param_2 + (uVar12 - 1)) - fVar32;
        *(float *)(*(longlong *)(param_1 + 0x10) + 0x40) =
             fVar31 + *(float *)((longlong)param_2 + uVar12 * 8 + -4);
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x44) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x4c) = param_4;
        *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + 0x50;
        **(undefined2 **)(param_1 + 0x12) = (short)param_1[0xd];
        *(short *)(*(longlong *)(param_1 + 0x12) + 2) = (short)param_1[0xd] + 1;
        *(short *)(*(longlong *)(param_1 + 0x12) + 4) = (short)param_1[0xd] + 2;
        *(short *)(*(longlong *)(param_1 + 0x12) + 6) = (short)param_1[0xd];
        *(short *)(*(longlong *)(param_1 + 0x12) + 8) = (short)param_1[0xd] + 2;
        *(short *)(*(longlong *)(param_1 + 0x12) + 10) = (short)param_1[0xd] + 3;
        *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 0xc;
        param_1[0xd] = param_1[0xd] + 4;
        bVar28 = uVar12 != (uStack_d0 & 0xffffffff);
        uVar12 = uVar12 + 1;
      } while (bVar28);
    }
    else {
      fVar32 = param_6;
      if (param_6 <= _DAT_7ff70cb1ba2c) {
        fVar32 = _DAT_7ff70cb1ba2c;
      }
      iStack_d8 = (int)fVar32;
      fVar41 = (float)param_1[0x34];
      bVar20 = fVar41 == _DAT_7ff70cb1ba2c & iStack_d8 < 0x20 & (byte)uVar2 >> 1 &
               fVar32 - (float)iStack_d8 <= _DAT_7ff70cb1ba50;
      iVar11 = 0x12;
      if (param_6 <= fVar41) {
        iVar11 = 0xc;
      }
      iStack_fc = CONCAT31(iStack_fc._1_3_,bVar20);
      iVar18 = 6;
      if (bVar20 == 0) {
        iVar18 = iVar11;
      }
      if (bVar20 == 1) {
        uVar17 = param_3 * 2;
        iStack_d4 = 3;
      }
      else {
        uVar17 = param_3 * 3;
        if (fVar41 < param_6) {
          uVar17 = param_3 * 4;
        }
        iStack_d4 = (uint)(fVar41 < param_6) * 2 + 3;
      }
      iVar11 = *param_1;
      uStack_f0 = uVar12;
      if (((uVar2 & 8) != 0) && (0xffff < param_1[0xd] + uVar17)) {
        lVar7 = (longlong)iVar11;
        uStack_e8._0_4_ = param_1[8];
        param_1[0x20] = (int)uStack_e8;
        param_1[0xd] = 0;
        lVar8 = *(longlong *)(param_1 + 2);
        if (*(int *)(lVar8 + -0x20 + lVar7 * 0x48) == 0) {
          *(int *)(lVar8 + lVar7 * 0x48 + -0x28) = (int)uStack_e8;
          iVar11 = *param_1;
        }
        else {
          uStack_c8 = *(undefined8 *)(param_1 + 0x18);
          uStack_c0 = *(undefined8 *)(param_1 + 0x1a);
          iStack_b8 = param_1[0x1c];
          iStack_b4 = param_1[0x1d];
          iStack_b0 = param_1[0x1e];
          iStack_ac = param_1[0x1f];
          iVar6 = param_1[4];
          if (iVar11 == param_1[1]) {
            lStack_e0 = CONCAT44(lStack_e0._4_4_,param_1[4]);
            if (iVar11 == 0) {
              iVar6 = 8;
            }
            else {
              iVar6 = iVar11 / 2 + iVar11;
            }
            iVar25 = iVar11 + 1;
            if (iVar11 + 1 < iVar6) {
              iVar25 = iVar6;
            }
            lVar8 = FUN_7ff70c802100((longlong)iVar25 * 0x48);
            if (*(longlong *)(param_1 + 2) != 0) {
              FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
              FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
            }
            *(longlong *)(param_1 + 2) = lVar8;
            param_1[1] = iVar25;
            lVar7 = (longlong)*param_1;
            param_3 = (uint)uStack_f8;
            iVar6 = (int)lStack_e0;
          }
          puVar19 = (undefined8 *)(lVar8 + 0x10 + lVar7 * 0x48);
          *puVar19 = CONCAT44(iStack_b4,iStack_b8);
          puVar19[1] = CONCAT44(iStack_ac,iStack_b0);
          puVar19 = (undefined8 *)(lVar8 + lVar7 * 0x48);
          *puVar19 = uStack_c8;
          puVar19[1] = uStack_c0;
          *(int *)(lVar8 + 0x20 + lVar7 * 0x48) = (int)uStack_e8;
          *(int *)(lVar8 + 0x24 + lVar7 * 0x48) = iVar6;
          puVar19 = (undefined8 *)(lVar8 + 0x28 + lVar7 * 0x48);
          *puVar19 = 0;
          puVar19[1] = 0;
          puVar19 = (undefined8 *)(lVar8 + 0x38 + lVar7 * 0x48);
          *puVar19 = 0;
          puVar19[1] = 0;
          iVar11 = *param_1 + 1;
          *param_1 = iVar11;
        }
      }
      piVar1 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)iVar11 * 0x48);
      *piVar1 = *piVar1 + iVar18 * uVar27;
      lVar8 = (longlong)param_1[8];
      iVar6 = param_1[8] + uVar17;
      iVar11 = param_1[9];
      uStack_e8 = (ulonglong)uVar17;
      if (iVar11 < iVar6) {
        if (iVar11 == 0) {
          iVar11 = 8;
        }
        else {
          iVar11 = iVar11 / 2 + iVar11;
        }
        if (iVar11 <= iVar6) {
          iVar11 = iVar6;
        }
        lStack_e0 = lVar8;
        lVar7 = FUN_7ff70c802100((longlong)iVar11 * 0x14);
        if (*(longlong *)(param_1 + 10) != 0) {
          FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
        }
        *(longlong *)(param_1 + 10) = lVar7;
        param_1[9] = iVar11;
        param_3 = (uint)uStack_f8;
        lVar8 = lStack_e0;
      }
      else {
        lVar7 = *(longlong *)(param_1 + 10);
      }
      param_1[8] = iVar6;
      *(longlong *)(param_1 + 0x10) = lVar7 + lVar8 * 0x14;
      iVar11 = param_1[4];
      iVar6 = iVar18 * uVar27 + iVar11;
      iVar18 = param_1[5];
      if (iVar18 < iVar6) {
        if (iVar18 == 0) {
          iVar18 = 8;
        }
        else {
          iVar18 = iVar18 / 2 + iVar18;
        }
        if (iVar18 <= iVar6) {
          iVar18 = iVar6;
        }
        lVar8 = FUN_7ff70c802100((longlong)iVar18 * 2);
        if (*(longlong *)(param_1 + 6) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
        }
        *(longlong *)(param_1 + 6) = lVar8;
        param_1[5] = iVar18;
        param_3 = (uint)uStack_f8;
        bVar20 = (byte)iStack_fc;
      }
      else {
        lVar8 = *(longlong *)(param_1 + 6);
        bVar20 = (byte)iStack_fc;
      }
      uVar15 = uStack_f0;
      param_1[4] = iVar6;
      *(longlong *)(param_1 + 0x12) = lVar8 + (longlong)iVar11 * 2;
      lVar8 = *(longlong *)(param_1 + 0xe);
      uVar27 = iStack_d4 * param_3;
      if (*(int *)(lVar8 + 0x4c) < (int)uVar27) {
        if (*(longlong *)(lVar8 + 0x50) != 0) {
          FUN_7ff70c802510();
        }
        uVar9 = FUN_7ff70c802100((ulonglong)uVar27 << 3);
        *(undefined8 *)(lVar8 + 0x50) = uVar9;
        *(uint *)(lVar8 + 0x4c) = uVar27;
        lVar8 = *(longlong *)(param_1 + 0xe);
        bVar20 = (byte)iStack_fc;
      }
      uVar27 = _DAT_7ff70cb1ba60;
      uStack_f0 = CONCAT44(uStack_f0._4_4_,param_4) & 0xffffffff00ffffff;
      puVar13 = *(undefined8 **)(lVar8 + 0x50);
      uVar10 = (ulonglong)param_3;
      puVar19 = puVar13 + uVar10;
      uVar21 = uStack_d0 & 0xffffffff;
      uVar12 = 1;
      do {
        uVar16 = uVar12 & 0xffffffff;
        if (uVar10 == uVar12) {
          uVar16 = 0;
        }
        fVar38 = (float)param_2[uVar16] - (float)param_2[uVar12 - 1];
        fVar33 = (float)((ulonglong)param_2[uVar16] >> 0x20) -
                 (float)((ulonglong)param_2[uVar12 - 1] >> 0x20);
        fVar34 = 0.0;
        fVar35 = 0.0;
        fVar39 = fVar33 * fVar33;
        auVar30._0_4_ = fVar39 + fVar38 * fVar38;
        auVar30._4_4_ = fVar39 + fVar39;
        auVar30._8_8_ = 0;
        if (0.0 < auVar30._0_4_) {
          auVar30 = rsqrtss(auVar30,auVar30);
          fVar38 = fVar38 * auVar30._0_4_;
          fVar33 = fVar33 * auVar30._0_4_;
          fVar34 = auVar30._8_4_ * 0.0;
          fVar35 = auVar30._8_4_ * 0.0;
        }
        auVar5._4_4_ = fVar33;
        auVar5._0_4_ = fVar38;
        auVar5._8_4_ = fVar34;
        auVar5._12_4_ = fVar35;
        uVar9 = extractps(auVar5,1);
        puVar13[uVar12 - 1] = uVar9;
        *(uint *)((longlong)puVar13 + uVar12 * 8 + -4) = (uint)fVar38 ^ uVar27;
        bVar28 = uVar12 != uVar21;
        uVar12 = uVar12 + 1;
      } while (bVar28);
      if ((param_5 & 1) == 0) {
        iVar11 = (int)uVar15;
        uVar15 = uVar15 & 0xffffffff;
        puVar13[uVar15] = puVar19[-2];
        fVar34 = (float)*param_2;
        fVar35 = (float)((ulonglong)*param_2 >> 0x20);
        fVar33 = (float)*puVar13;
        fVar38 = (float)((ulonglong)*puVar13 >> 0x20);
        if (param_6 <= fVar41 || bVar20 != 0) {
          if (bVar20 != 0) {
            fVar41 = fVar32 * _DAT_7ff70cb1ba70 + _DAT_7ff70cb1ba2c;
          }
          *puVar19 = CONCAT44(fVar38 * fVar41 + fVar35,fVar33 * fVar41 + fVar34);
          puVar19[1] = CONCAT44((float)((ulonglong)*param_2 >> 0x20) -
                                (float)((ulonglong)*puVar13 >> 0x20) * fVar41,
                                (float)*param_2 - (float)*puVar13 * fVar41);
          uVar12 = (ulonglong)(uint)(iVar11 * 2);
          puVar19[uVar12] =
               CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) +
                        (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar41,
                        (float)param_2[uVar15] + (float)puVar13[uVar15] * fVar41);
          puVar19[uVar12 + 1] =
               CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) -
                        (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar41,
                        (float)param_2[uVar15] - (float)puVar13[uVar15] * fVar41);
LAB_7ff70c7b98fc:
          fVar34 = _DAT_7ff70cb1ba94;
          fVar33 = _DAT_7ff70cb1ba90;
          fVar38 = _UNK_7ff70cb1ba84;
          fVar32 = _DAT_7ff70cb1ba80;
          uVar15 = 1;
          iVar11 = param_1[0xd];
LAB_7ff70c7b996d:
          uVar12 = uVar15 & 0xffffffff;
          iVar18 = iVar11 + (bVar20 ^ 3);
          if (uVar10 == uVar15) {
            uVar12 = 0;
            iVar18 = param_1[0xd];
          }
          fVar35 = ((float)puVar13[uVar12] + (float)puVar13[uVar15 - 1]) * fVar32;
          fVar39 = ((float)((ulonglong)puVar13[uVar12] >> 0x20) +
                   (float)((ulonglong)puVar13[uVar15 - 1] >> 0x20)) * fVar38;
          fVar36 = fVar39 * fVar39 + fVar35 * fVar35;
          if (fVar33 < fVar36) {
            fVar36 = fVar31 / fVar36;
            fVar37 = fVar34;
            if (fVar36 <= fVar34) {
              fVar37 = fVar36;
            }
            fVar35 = fVar35 * fVar37;
            fVar39 = fVar39 * fVar37;
          }
          uVar16 = (ulonglong)(uint)((int)uVar12 * 2);
          *(float *)(puVar19 + uVar16) = *(float *)(param_2 + uVar12) + fVar41 * fVar35;
          *(float *)((longlong)puVar19 + uVar16 * 8 + 4) =
               *(float *)((longlong)param_2 + uVar12 * 8 + 4) + fVar39 * fVar41;
          *(float *)(puVar19 + uVar16 + 1) = *(float *)(param_2 + uVar12) - fVar41 * fVar35;
          *(float *)((longlong)puVar19 + uVar16 * 8 + 0xc) =
               *(float *)((longlong)param_2 + uVar12 * 8 + 4) - fVar39 * fVar41;
          sVar23 = (short)iVar18;
          **(short **)(param_1 + 0x12) = sVar23;
          sVar26 = (short)iVar11;
          *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar26;
          uStack_f8 = uVar21;
          if (bVar20 == 0) {
            *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar26 + 2;
            *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar26 + 2;
            *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar23 + 2;
            *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar23;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0xc) = sVar23 + 1;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0xe) = sVar26 + 1;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0x10) = sVar26;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0x12) = sVar26;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0x14) = sVar23;
            *(short *)(*(longlong *)(param_1 + 0x12) + 0x16) = sVar23 + 1;
            *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 0x18;
            if (uVar21 != uVar15) goto LAB_7ff70c7b9967;
            puVar19 = *(undefined8 **)(param_1 + 0x10);
            puVar13 = puVar13 + uVar10 + 1;
            uVar15 = 0;
            do {
              *puVar19 = param_2[uVar15];
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
              *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x14) = puVar13[-1];
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar3;
              *(int *)(*(longlong *)(param_1 + 0x10) + 0x24) = (int)uStack_f0;
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28) = *puVar13;
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = uVar3;
              *(int *)(*(longlong *)(param_1 + 0x10) + 0x38) = (int)uStack_f0;
              puVar19 = (undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x3c);
              *(undefined8 **)(param_1 + 0x10) = puVar19;
              uVar15 = uVar15 + 1;
              puVar13 = puVar13 + 2;
            } while (uVar10 != uVar15);
          }
          else {
            *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar26 + 1;
            *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar23 + 1;
            *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar26 + 1;
            *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar23;
            *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 0xc;
            if (uVar21 != uVar15) goto LAB_7ff70c7b9967;
            puVar19 = *(undefined8 **)(param_1 + 0x10);
            uVar3 = *(undefined8 *)
                     (*(longlong *)(*(longlong *)(param_1 + 0xe) + 8) + (longlong)iStack_d8 * 0x10);
            uVar9 = *(undefined8 *)
                     (*(longlong *)(*(longlong *)(param_1 + 0xe) + 8) + 8 +
                     (longlong)iStack_d8 * 0x10);
            puVar13 = puVar13 + uVar10 + 1;
            do {
              *puVar19 = puVar13[-1];
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
              *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x14) = *puVar13;
              *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar9;
              *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_4;
              puVar19 = (undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28);
              *(undefined8 **)(param_1 + 0x10) = puVar19;
              puVar13 = puVar13 + 2;
              uVar10 = uVar10 - 1;
            } while (uVar10 != 0);
          }
          goto LAB_7ff70c7b9f35;
        }
        fVar32 = (fVar32 - fVar41) * _DAT_7ff70cb1ba70;
        fVar39 = fVar41 + fVar32;
        *puVar19 = CONCAT44(fVar38 * fVar39 + fVar35,fVar33 * fVar39 + fVar34);
        fVar38 = (float)*puVar13;
        fVar33 = (float)((ulonglong)*puVar13 >> 0x20);
        fVar34 = fVar32 * fVar38;
        fVar35 = fVar32 * fVar33;
        puVar19[1] = CONCAT44((float)((ulonglong)*param_2 >> 0x20) + fVar35,(float)*param_2 + fVar34
                             );
        puVar19[2] = CONCAT44((float)((ulonglong)*param_2 >> 0x20) - fVar35,(float)*param_2 - fVar34
                             );
        puVar19[3] = CONCAT44((float)((ulonglong)*param_2 >> 0x20) - fVar33 * fVar39,
                              (float)*param_2 - fVar38 * fVar39);
        uVar12 = (ulonglong)(uint)(iVar11 << 2);
        puVar19[uVar12] =
             CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) +
                      (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar39,
                      (float)param_2[uVar15] + (float)puVar13[uVar15] * fVar39);
        puVar19[uVar12 + 1] =
             CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) +
                      (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar32,
                      (float)param_2[uVar15] + (float)puVar13[uVar15] * fVar32);
        puVar19[uVar12 + 2] =
             CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) -
                      (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar32,
                      (float)param_2[uVar15] - (float)puVar13[uVar15] * fVar32);
        puVar19[uVar12 + 3] =
             CONCAT44((float)((ulonglong)param_2[uVar15] >> 0x20) -
                      (float)((ulonglong)puVar13[uVar15] >> 0x20) * fVar39,
                      (float)param_2[uVar15] - (float)puVar13[uVar15] * fVar39);
      }
      else {
        if (param_6 <= fVar41 || bVar20 != 0) {
          if (bVar20 != 0) {
            fVar41 = fVar32 * _DAT_7ff70cb1ba70 + _DAT_7ff70cb1ba2c;
          }
          goto LAB_7ff70c7b98fc;
        }
        fVar32 = (fVar32 - fVar41) * _DAT_7ff70cb1ba70;
      }
      fVar35 = _DAT_7ff70cb1ba94;
      fVar34 = _DAT_7ff70cb1ba90;
      fVar33 = _UNK_7ff70cb1ba84;
      fVar38 = _DAT_7ff70cb1ba80;
      uStack_f8 = -uVar21;
      uVar15 = 1;
      iVar11 = param_1[0xd];
      do {
        uVar12 = uVar15 & 0xffffffff;
        iVar18 = iVar11 + 4;
        if (uVar10 == uVar15) {
          uVar12 = 0;
          iVar18 = param_1[0xd];
        }
        fVar39 = ((float)puVar13[uVar12] + (float)puVar13[uVar15 - 1]) * fVar38;
        fVar36 = ((float)((ulonglong)puVar13[uVar12] >> 0x20) +
                 (float)((ulonglong)puVar13[uVar15 - 1] >> 0x20)) * fVar33;
        fVar37 = fVar36 * fVar36 + fVar39 * fVar39;
        if (fVar34 < fVar37) {
          fVar37 = fVar31 / fVar37;
          fVar40 = fVar35;
          if (fVar37 <= fVar35) {
            fVar40 = fVar37;
          }
          fVar39 = fVar39 * fVar40;
          fVar36 = fVar36 * fVar40;
        }
        fVar40 = (fVar41 + fVar32) * fVar39;
        fVar37 = (fVar41 + fVar32) * fVar36;
        uVar16 = (ulonglong)(uint)((int)uVar12 * 4);
        *(float *)(puVar19 + uVar16) = *(float *)(param_2 + uVar12) + fVar40;
        *(float *)((longlong)puVar19 + uVar16 * 8 + 4) =
             *(float *)((longlong)param_2 + uVar12 * 8 + 4) + fVar37;
        *(float *)(puVar19 + uVar16 + 1) = *(float *)(param_2 + uVar12) + fVar39 * fVar32;
        *(float *)((longlong)puVar19 + uVar16 * 8 + 0xc) =
             *(float *)((longlong)param_2 + uVar12 * 8 + 4) + fVar36 * fVar32;
        *(float *)(puVar19 + uVar16 + 2) = *(float *)(param_2 + uVar12) - fVar39 * fVar32;
        *(float *)((longlong)puVar19 + uVar16 * 8 + 0x14) =
             *(float *)((longlong)param_2 + uVar12 * 8 + 4) - fVar36 * fVar32;
        *(float *)(puVar19 + uVar16 + 3) = *(float *)(param_2 + uVar12) - fVar40;
        *(float *)((longlong)puVar19 + uVar16 * 8 + 0x1c) =
             *(float *)((longlong)param_2 + uVar12 * 8 + 4) - fVar37;
        sVar23 = (short)iVar18;
        sVar14 = sVar23 + 1;
        **(short **)(param_1 + 0x12) = sVar14;
        sVar26 = (short)iVar11;
        *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar26 + 1;
        sVar22 = sVar26 + 2;
        *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar22;
        *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar22;
        sVar24 = sVar23 + 2;
        *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar24;
        *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar14;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0xc) = sVar14;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0xe) = sVar26 + 1;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x10) = sVar26;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x12) = sVar26;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x14) = sVar23;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x16) = sVar14;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x18) = sVar24;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x1a) = sVar22;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x1c) = sVar26 + 3;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x1e) = sVar26 + 3;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x20) = sVar23 + 3;
        *(short *)(*(longlong *)(param_1 + 0x12) + 0x22) = sVar24;
        *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 0x24;
        bVar28 = uVar15 != uVar21;
        uVar15 = uVar15 + 1;
        iVar11 = iVar18;
      } while (bVar28);
      puVar19 = *(undefined8 **)(param_1 + 0x10);
      puVar13 = puVar13 + uVar10 + 3;
      do {
        *puVar19 = puVar13[-3];
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
        *(int *)(*(longlong *)(param_1 + 0x10) + 0x10) = (int)uStack_f0;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x14) = puVar13[-2];
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_4;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28) = puVar13[-1];
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = uVar3;
        *(uint *)(*(longlong *)(param_1 + 0x10) + 0x38) = param_4;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x3c) = *puVar13;
        *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x44) = uVar3;
        *(int *)(*(longlong *)(param_1 + 0x10) + 0x4c) = (int)uStack_f0;
        puVar19 = (undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x50);
        *(undefined8 **)(param_1 + 0x10) = puVar19;
        puVar13 = puVar13 + 4;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
LAB_7ff70c7b9f35:
      param_1[0xd] = param_1[0xd] + ((uint)uStack_e8 & 0xffff);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_a0 ^ (ulonglong)auStack_128)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_128);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
LAB_7ff70c7b9967:
  uVar15 = uVar15 + 1;
  iVar11 = iVar18;
  goto LAB_7ff70c7b996d;
}


