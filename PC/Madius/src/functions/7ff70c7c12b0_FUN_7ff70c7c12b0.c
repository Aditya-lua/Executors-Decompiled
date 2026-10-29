/* 7ff70c7c12b0 FUN_7ff70c7c12b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c12b0(longlong *param_1,int *param_2,undefined8 param_3,float *param_4,float param_5
                     ,float *param_6,char *param_7,char *param_8,float param_9,char param_10)

{
  ulonglong *puVar1;
  float *pfVar2;
  undefined8 *puVar3;
  int *piVar4;
  float fVar5;
  float fVar6;
  ushort uVar7;
  longlong lVar8;
  code *pcVar9;
  char cVar10;
  float fVar11;
  longlong *plVar12;
  char *pcVar13;
  char *pcVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  uint *puVar18;
  int iVar19;
  uint uVar20;
  uint *puVar22;
  short *psVar23;
  short sVar24;
  uint uVar25;
  longlong lVar26;
  longlong lVar27;
  longlong lVar28;
  int iVar29;
  int iVar30;
  int iVar31;
  int iVar32;
  float fVar33;
  float in_XMM2_Dc;
  float in_XMM2_Dd;
  float fVar34;
  float fVar35;
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  float fVar40;
  float fVar41;
  float fVar42;
  float fVar43;
  float fVar44;
  undefined1 auStack_1d8 [32];
  float fStack_1b8;
  float fStack_1a4;
  float fStack_1a0;
  float fStack_19c;
  short *psStack_198;
  ulonglong uStack_190;
  int iStack_184;
  float *pfStack_180;
  ulonglong uStack_178;
  longlong lStack_170;
  ulonglong uStack_168;
  float fStack_15c;
  float fStack_158;
  float fStack_154;
  float fStack_150;
  float fStack_14c;
  float *pfStack_140;
  float fStack_138;
  float fStack_134;
  float fStack_130;
  float fStack_12c;
  float fStack_128;
  float fStack_124;
  float fStack_120;
  float fStack_11c;
  undefined8 uStack_118;
  ulonglong uStack_110;
  int iStack_108;
  int iStack_104;
  int iStack_100;
  int iStack_fc;
  ulonglong uStack_f0;
  ulonglong uVar21;
  
  fVar33 = (float)param_3;
  uStack_f0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_1d8;
  fVar44 = (float)(int)param_4[1];
  if (fVar44 < param_6[3] || fVar44 == param_6[3]) {
    fVar41 = (float)(int)(fVar33 + _DAT_7ff70cb1ba70);
    fStack_154 = (float)(int)(float)((ulonglong)param_3 >> 0x20);
    fStack_150 = (float)(int)in_XMM2_Dc;
    fStack_14c = (float)(int)in_XMM2_Dd;
    fStack_128 = fVar41 + fVar41;
    fStack_138 = fVar41 * _DAT_7ff70cb1ba70;
    fStack_15c = (float)((uint)param_5 | 0xffffff);
    fStack_158 = fVar41;
    pfStack_140 = param_4;
    fStack_134 = fStack_154;
    fStack_130 = fStack_150;
    fStack_12c = fStack_14c;
    fStack_124 = fStack_154;
    fStack_120 = fStack_150;
    fStack_11c = fStack_14c;
    do {
      fVar43 = *pfStack_140;
      if (param_8 == (char *)0x0) {
        lVar15 = FUN_7ff70cb12e80(param_7);
        param_8 = param_7 + lVar15;
        lVar15 = *param_1;
        fVar40 = *(float *)((longlong)param_1 + 0x14);
        if (lVar15 != 0) goto LAB_7ff70c7c1484;
LAB_7ff70c7c14b0:
        lVar17 = param_1[1];
        uStack_190 = *(ulonglong *)(lVar17 + 0x2b0);
        uStack_118 = CONCAT44(fVar41,(int)param_1[3]);
        uStack_110 = CONCAT44(uStack_110._4_4_,fVar40);
        fVar11 = (float)FUN_7ff70c802e60(&uStack_118,0xc);
        plVar12 = (longlong *)FUN_7ff70c805430(*(longlong *)(lVar17 + 0x2b0) + 0xd8,fVar11);
        lVar15 = *plVar12;
        if (*plVar12 != 0) goto LAB_7ff70c7c151d;
        if (((*(byte *)(param_1 + 2) & 8) == 0) && (*(char *)(lVar17 + 0x50) != '\x01')) {
LAB_7ff70c7c210e:
          fStack_1b8 = fVar11;
          lVar15 = FUN_7ff70c7e7790(lVar17,param_1,fVar41,fVar40);
          *plVar12 = lVar15;
          if (lVar15 == 0) {
LAB_7ff70c7c2131:
            lVar15 = 0;
            goto LAB_7ff70c7c1534;
          }
        }
        else {
          uVar20 = *(uint *)(*(longlong *)(lVar17 + 0x2b0) + 0xc0);
          if ((int)uVar20 < 1) {
LAB_7ff70c7c2107:
            if (*(char *)(lVar17 + 0x50) == '\0') goto LAB_7ff70c7c210e;
            goto LAB_7ff70c7c2131;
          }
          lVar8 = *(longlong *)(*(longlong *)(lVar17 + 0x2b0) + 0xd0);
          uVar21 = 0;
          lVar16 = 0;
          lVar28 = 0;
          do {
            lVar26 = *(longlong *)(lVar8 + (uVar21 >> 5) * 8);
            lVar27 = (ulonglong)((uint)uVar21 & 0x1f) * 0x68;
            lVar15 = lVar28;
            if ((*(longlong **)(lVar26 + 0x58 + lVar27) == param_1) &&
               (lVar26 = lVar26 + lVar27, (*(byte *)(lVar26 + 0x4f) & 4) == 0)) {
              if ((*(float *)(lVar26 + 0x18) == fVar40) &&
                 (!NAN(*(float *)(lVar26 + 0x18)) && !NAN(fVar40))) {
                fVar39 = *(float *)(lVar26 + 0x14);
                if ((fVar41 < fVar39) && ((lVar16 == 0 || (fVar39 < *(float *)(lVar16 + 0x14))))) {
                  lVar16 = lVar26;
                }
                if (((fVar39 < fVar41) && (lVar15 = lVar26, lVar28 != 0)) &&
                   (fVar39 < *(float *)(lVar28 + 0x14) || fVar39 == *(float *)(lVar28 + 0x14))) {
                  lVar15 = lVar28;
                }
              }
            }
            uVar25 = (uint)uVar21 + 1;
            uVar21 = (ulonglong)uVar25;
            lVar28 = lVar15;
          } while (uVar20 != uVar25);
          if (lVar16 == 0) {
            if (lVar15 == 0) {
              uVar21 = 0;
              lVar16 = 0;
              lVar28 = 0;
              do {
                lVar26 = *(longlong *)(lVar8 + (uVar21 >> 5) * 8);
                lVar27 = (ulonglong)((uint)uVar21 & 0x1f) * 0x68;
                lVar15 = lVar28;
                if ((*(longlong **)(lVar26 + 0x58 + lVar27) == param_1) &&
                   (lVar26 = lVar26 + lVar27, (*(byte *)(lVar26 + 0x4f) & 4) == 0)) {
                  fVar39 = *(float *)(lVar26 + 0x14);
                  if ((fVar41 < fVar39) && ((lVar16 == 0 || (fVar39 < *(float *)(lVar16 + 0x14)))))
                  {
                    lVar16 = lVar26;
                  }
                  if (((fVar39 < fVar41) && (lVar15 = lVar26, lVar28 != 0)) &&
                     (fVar39 < *(float *)(lVar28 + 0x14) || fVar39 == *(float *)(lVar28 + 0x14))) {
                    lVar15 = lVar28;
                  }
                }
                uVar25 = (uint)uVar21 + 1;
                uVar21 = (ulonglong)uVar25;
                lVar28 = lVar15;
              } while (uVar20 != uVar25);
              if (lVar16 != 0) goto LAB_7ff70c7c1844;
              if (lVar15 == 0) goto LAB_7ff70c7c2107;
            }
          }
          else {
LAB_7ff70c7c1844:
            lVar15 = lVar16;
            if ((lVar28 != 0) &&
               ((*(float *)(lVar16 + 0x14) < fStack_128 || (*(float *)(lVar28 + 0x14) <= fStack_138)
                ))) {
              lVar15 = lVar28;
            }
          }
        }
LAB_7ff70c7c151d:
        *(undefined4 *)(lVar15 + 0x50) = *(undefined4 *)(uStack_190 + 0xa4);
        *param_1 = lVar15;
      }
      else {
        lVar15 = *param_1;
        fVar40 = *(float *)((longlong)param_1 + 0x14);
        if (lVar15 == 0) goto LAB_7ff70c7c14b0;
LAB_7ff70c7c1484:
        if ((*(float *)(lVar15 + 0x14) != fVar41) || (NAN(*(float *)(lVar15 + 0x14)) || NAN(fVar41))
           ) goto LAB_7ff70c7c14b0;
        if ((*(float *)(lVar15 + 0x18) != fVar40) || (NAN(*(float *)(lVar15 + 0x18)) || NAN(fVar40))
           ) goto LAB_7ff70c7c14b0;
      }
LAB_7ff70c7c1534:
      fVar39 = fVar33 / *(float *)(lVar15 + 0x14);
      fVar40 = param_6[1];
      fVar11 = fVar33 + fVar44;
      lStack_170 = lVar15;
      pcVar14 = param_7;
      if (fVar40 <= fVar33 + fVar44) {
        if (0.0 < param_9) goto LAB_7ff70c7c17b2;
LAB_7ff70c7c1642:
        pcVar13 = param_8;
        if (10000 < (longlong)param_8 - (longlong)pcVar14) {
          fVar40 = param_6[3];
          pcVar13 = pcVar14;
          fVar11 = fVar44;
          while ((fVar11 < fVar40 && (pcVar13 < param_8))) {
            lVar15 = FUN_7ff70cb12b40(pcVar13,10);
            pcVar13 = (char *)(lVar15 + 1);
            if (lVar15 == 0) {
              pcVar13 = param_8;
            }
            fVar11 = fVar11 + fVar33;
          }
        }
        param_8 = pcVar13;
        if (pcVar14 == pcVar13) break;
      }
      else {
        while (pcVar14 < param_8) {
          pcVar13 = (char *)FUN_7ff70cb12b40(pcVar14,10);
          fVar44 = fVar11;
          if (param_9 <= 0.0) {
            pcVar14 = pcVar13 + 1;
            if (pcVar13 == (char *)0x0) {
              pcVar14 = param_8;
            }
            if (fVar40 <= fVar33 + fVar11) break;
          }
          else {
            if (pcVar13 == (char *)0x0) {
              pcVar13 = param_8;
            }
            fStack_1b8 = param_9;
            pcVar14 = (char *)FUN_7ff70c7f9270(param_1,fVar33,pcVar14,pcVar13);
            pcVar13 = pcVar14;
            if (pcVar14 < param_8) {
              do {
                if ((*pcVar13 != ' ') && (pcVar14 = pcVar13, *pcVar13 != '\t')) break;
                pcVar13 = pcVar13 + 1;
                pcVar14 = param_8;
              } while (pcVar13 != param_8);
            }
            pcVar14 = pcVar14 + (*pcVar14 == '\n');
            fVar40 = param_6[1];
            if (fVar40 <= fVar33 + fVar11) break;
          }
          fVar11 = fVar33 + fVar11;
        }
        if (param_9 <= 0.0) goto LAB_7ff70c7c1642;
LAB_7ff70c7c17b2:
        if (pcVar14 == param_8) break;
      }
      iVar31 = (int)param_8 - (int)pcVar14;
      uVar20 = iVar31 * 4;
      uStack_168 = (ulonglong)uVar20;
      iStack_184 = param_2[4];
      if ((0xffff < param_2[0xd] + uVar20) && ((*(byte *)(param_2 + 0xc) & 8) != 0)) {
        iVar30 = param_2[8];
        param_2[0x20] = iVar30;
        param_2[0xd] = 0;
        lVar15 = *(longlong *)(param_2 + 2);
        iVar32 = *param_2;
        lVar17 = (longlong)iVar32;
        if (*(int *)(lVar15 + -0x20 + lVar17 * 0x48) == 0) {
          *(int *)(lVar15 + lVar17 * 0x48 + -0x28) = iVar30;
        }
        else {
          uStack_118 = *(ulonglong *)(param_2 + 0x18);
          uStack_110 = *(ulonglong *)(param_2 + 0x1a);
          iStack_108 = param_2[0x1c];
          iStack_104 = param_2[0x1d];
          iStack_100 = param_2[0x1e];
          iStack_fc = param_2[0x1f];
          if (iVar32 == param_2[1]) {
            if (iVar32 == 0) {
              iVar19 = 8;
            }
            else {
              iVar19 = iVar32 / 2 + iVar32;
            }
            iVar29 = iVar32 + 1;
            if (iVar32 + 1 < iVar19) {
              iVar29 = iVar19;
            }
            lVar15 = FUN_7ff70c802100((longlong)iVar29 * 0x48);
            if (*(longlong *)(param_2 + 2) != 0) {
              FUN_7ff70cb12b60(lVar15);
              FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
            }
            *(longlong *)(param_2 + 2) = lVar15;
            param_2[1] = iVar29;
            lVar17 = (longlong)*param_2;
          }
          puVar3 = (undefined8 *)(lVar15 + 0x10 + lVar17 * 0x48);
          *puVar3 = CONCAT44(iStack_104,iStack_108);
          puVar3[1] = CONCAT44(iStack_fc,iStack_100);
          puVar1 = (ulonglong *)(lVar15 + lVar17 * 0x48);
          *puVar1 = uStack_118;
          puVar1[1] = uStack_110;
          *(int *)(lVar15 + 0x20 + lVar17 * 0x48) = iVar30;
          *(int *)(lVar15 + 0x24 + lVar17 * 0x48) = iStack_184;
          puVar3 = (undefined8 *)(lVar15 + 0x28 + lVar17 * 0x48);
          *puVar3 = 0;
          puVar3[1] = 0;
          puVar3 = (undefined8 *)(lVar15 + 0x38 + lVar17 * 0x48);
          *puVar3 = 0;
          puVar3[1] = 0;
          *param_2 = *param_2 + 1;
        }
      }
      uVar20 = iVar31 * 6;
      uStack_190 = (ulonglong)uVar20;
      piVar4 = (int *)(*(longlong *)(param_2 + 2) + -0x20 + (longlong)*param_2 * 0x48);
      *piVar4 = *piVar4 + uVar20;
      iVar31 = param_2[8];
      iVar32 = iVar31 + (int)uStack_168;
      iVar30 = param_2[9];
      if (iVar30 < iVar32) {
        if (iVar30 == 0) {
          iVar30 = 8;
        }
        else {
          iVar30 = iVar30 / 2 + iVar30;
        }
        if (iVar30 <= iVar32) {
          iVar30 = iVar32;
        }
        lVar15 = FUN_7ff70c802100((longlong)iVar30 * 0x14);
        if (*(longlong *)(param_2 + 10) != 0) {
          FUN_7ff70cb12b60(lVar15);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 10));
        }
        *(longlong *)(param_2 + 10) = lVar15;
        param_2[9] = iVar30;
      }
      else {
        lVar15 = *(longlong *)(param_2 + 10);
      }
      param_2[8] = iVar32;
      pfVar2 = (float *)(lVar15 + (longlong)iVar31 * 0x14);
      *(float **)(param_2 + 0x10) = pfVar2;
      iVar31 = param_2[4];
      iVar32 = iVar31 + (int)uStack_190;
      iVar30 = param_2[5];
      if (iVar30 < iVar32) {
        if (iVar30 == 0) {
          iVar30 = 8;
        }
        else {
          iVar30 = iVar30 / 2 + iVar30;
        }
        if (iVar30 <= iVar32) {
          iVar30 = iVar32;
        }
        lVar15 = FUN_7ff70c802100((longlong)iVar30 * 2);
        if (*(longlong *)(param_2 + 6) != 0) {
          FUN_7ff70cb12b60(lVar15);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 6));
        }
        *(longlong *)(param_2 + 6) = lVar15;
        param_2[5] = iVar30;
        pfStack_180 = *(float **)(param_2 + 0x10);
      }
      else {
        lVar15 = *(longlong *)(param_2 + 6);
        pfStack_180 = pfVar2;
      }
      param_2[4] = iVar32;
      psVar23 = (short *)(lVar15 + (longlong)iVar31 * 2);
      *(short **)(param_2 + 0x12) = psVar23;
      uStack_178 = (ulonglong)(uint)param_2[0xd];
      iVar31 = *param_2;
      if (pcVar14 < param_8) {
        fVar40 = (float)(int)fVar43;
        pcVar13 = (char *)0x0;
        fVar43 = fVar40;
LAB_7ff70c7c1b1f:
        do {
          if (0.0 < param_9) {
            while( true ) {
              if (pcVar13 == (char *)0x0) {
                fStack_1b8 = (fVar40 - fVar43) + param_9;
                pcVar13 = (char *)FUN_7ff70c7f9270(param_1,fVar33,pcVar14,param_8);
              }
              if (pcVar14 < pcVar13) break;
              fVar44 = fVar44 + fVar33;
              if (param_6[3] <= fVar44 && fVar44 != param_6[3]) goto LAB_7ff70c7c2020;
              do {
                cVar10 = *pcVar14;
                if ((cVar10 != ' ') && (cVar10 != '\t')) goto LAB_7ff70c7c1b57;
                pcVar14 = pcVar14 + 1;
              } while (pcVar14 != param_8);
              cVar10 = *param_8;
              pcVar14 = param_8;
LAB_7ff70c7c1b57:
              pcVar14 = pcVar14 + (cVar10 == '\n');
              pcVar13 = (char *)0x0;
              fVar43 = fVar40;
              if (param_8 <= pcVar14) goto LAB_7ff70c7c2020;
            }
          }
          uVar20 = (uint)*pcVar14;
          uVar21 = (ulonglong)uVar20;
          uStack_118 = CONCAT44(uStack_118._4_4_,uVar20);
          if (*pcVar14 < '\0') {
            iVar30 = FUN_7ff70c7ff3d0(&uStack_118,pcVar14);
            pcVar14 = pcVar14 + iVar30;
            uVar21 = uStack_118 & 0xffffffff;
            lVar15 = lStack_170;
            uVar20 = (uint)uStack_118;
          }
          else {
            pcVar14 = pcVar14 + 1;
            lVar15 = lStack_170;
          }
          lStack_170 = lVar15;
          if (uVar20 < 0x20) {
            if ((int)uVar21 != 0xd) {
              if ((int)uVar21 != 10) goto LAB_7ff70c7c1c50;
              fVar44 = fVar44 + fVar33;
              fVar43 = fVar40;
              if (param_6[3] <= fVar44 && fVar44 != param_6[3]) break;
            }
          }
          else {
LAB_7ff70c7c1c50:
            if ((uint)(uVar21 & 0xffff) < *(uint *)(lVar15 + 0x20)) {
              uVar7 = *(ushort *)(*(longlong *)(lVar15 + 0x28) + (uVar21 & 0xffff) * 2);
              if (uVar7 == 0xffff) goto LAB_7ff70c7c1c8c;
              if (uVar7 == 0xfffe) {
                puVar22 = (uint *)((longlong)*(int *)(lVar15 + 0x40) * 0x2c +
                                  *(longlong *)(lVar15 + 0x38));
              }
              else {
                puVar22 = (uint *)((ulonglong)uVar7 * 0x2c + *(longlong *)(lVar15 + 0x38));
              }
            }
            else {
LAB_7ff70c7c1c8c:
              psStack_198 = psVar23;
              puVar18 = (uint *)FUN_7ff70c7f86d0(lVar15);
              puVar22 = (uint *)((longlong)*(int *)(lVar15 + 0x40) * 0x2c +
                                *(longlong *)(lVar15 + 0x38));
              psVar23 = psStack_198;
              if (puVar18 != (uint *)0x0) {
                puVar22 = puVar18;
              }
            }
            fVar11 = (float)puVar22[1];
            if ((*puVar22 & 2) != 0) {
              fVar37 = (float)puVar22[2] * fVar39 + fVar43;
              fVar5 = param_6[2];
              if (fVar37 <= fVar5) {
                fVar42 = (float)puVar22[4] * fVar39 + fVar43;
                fVar6 = *param_6;
                fVar41 = fStack_158;
                if (fVar6 <= fVar42) {
                  fVar34 = (float)puVar22[3] * fVar39 + fVar44;
                  fVar35 = (float)puVar22[5] * fVar39 + fVar44;
                  fVar38 = (float)puVar22[6];
                  psStack_198 = (short *)CONCAT44(psStack_198._4_4_,fVar38);
                  fStack_1a0 = (float)puVar22[7];
                  fStack_19c = (float)puVar22[8];
                  fVar36 = (float)puVar22[9];
                  if (param_10 != '\0') {
                    if (fVar6 <= fVar37) {
                      fVar38 = param_6[1];
                      if (fVar34 < fVar38) goto LAB_7ff70c7c1f4d;
LAB_7ff70c7c1dea:
                      fVar38 = fVar34;
                      if (fVar42 <= fVar5) goto LAB_7ff70c7c1df7;
LAB_7ff70c7c1f93:
                      fStack_19c = (fStack_19c - psStack_198._0_4_) *
                                   ((fVar5 - fVar37) / (fVar42 - fVar37)) + psStack_198._0_4_;
                      fVar6 = param_6[3];
                      fVar42 = fVar5;
                      fVar34 = fVar38;
                    }
                    else {
                      psStack_198 = (short *)CONCAT44(psStack_198._4_4_,
                                                      fVar38 + (fStack_19c - fVar38) *
                                                               (_DAT_7ff70cb1ba2c -
                                                               (fVar42 - fVar6) / (fVar42 - fVar37))
                                                     );
                      fVar38 = param_6[1];
                      fVar37 = fVar6;
                      if (fVar38 <= fVar34) goto LAB_7ff70c7c1dea;
LAB_7ff70c7c1f4d:
                      fStack_1a0 = fStack_1a0 +
                                   (fVar36 - fStack_1a0) *
                                   (_DAT_7ff70cb1ba2c - (fVar35 - fVar38) / (fVar35 - fVar34));
                      if (fVar5 < fVar42) goto LAB_7ff70c7c1f93;
LAB_7ff70c7c1df7:
                      fVar6 = param_6[3];
                      fVar34 = fVar38;
                    }
                    if (fVar6 < fVar35) {
                      fVar36 = (fVar36 - fStack_1a0) * ((fVar6 - fVar34) / (fVar35 - fVar34)) +
                               fStack_1a0;
                      fVar35 = fVar6;
                    }
                    fStack_1a4 = fVar36;
                    if (fVar35 <= fVar34) goto joined_r0x7ff70c7c1d2e;
                  }
                  fVar5 = fStack_15c;
                  if ((*puVar22 & 1) == 0) {
                    fVar5 = param_5;
                  }
                  *pfStack_180 = fVar37;
                  pfStack_180[1] = fVar34;
                  pfStack_180[4] = fVar5;
                  pfStack_180[2] = psStack_198._0_4_;
                  pfStack_180[3] = fStack_1a0;
                  pfStack_180[5] = fVar42;
                  pfStack_180[6] = fVar34;
                  pfStack_180[9] = fVar5;
                  pfStack_180[7] = fStack_19c;
                  pfStack_180[8] = fStack_1a0;
                  pfStack_180[10] = fVar42;
                  pfStack_180[0xb] = fVar35;
                  pfStack_180[0xe] = fVar5;
                  pfStack_180[0xc] = fStack_19c;
                  pfStack_180[0xd] = fVar36;
                  pfStack_180[0xf] = fVar37;
                  pfStack_180[0x10] = fVar35;
                  pfStack_180[0x13] = fVar5;
                  pfStack_180[0x11] = psStack_198._0_4_;
                  pfStack_180[0x12] = fVar36;
                  sVar24 = (short)uStack_178;
                  *psVar23 = sVar24;
                  psVar23[1] = sVar24 + 1;
                  psVar23[2] = sVar24 + 2;
                  psVar23[3] = sVar24;
                  psVar23[4] = sVar24 + 2;
                  psVar23[5] = sVar24 + 3;
                  pfStack_180 = pfStack_180 + 0x14;
                  uStack_178 = (ulonglong)((int)uStack_178 + 4);
                  psVar23 = psVar23 + 6;
                  fVar43 = fVar43 + fVar11 * fVar39;
                  if (param_8 <= pcVar14) break;
                  goto LAB_7ff70c7c1b1f;
                }
              }
            }
joined_r0x7ff70c7c1d2e:
            fVar43 = fVar43 + fVar11 * fVar39;
          }
        } while (pcVar14 < param_8);
      }
LAB_7ff70c7c2020:
      iVar30 = *param_2;
      if (iVar31 == iVar30) {
        param_2[8] = (int)((ulonglong)((longlong)pfStack_180 - *(longlong *)(param_2 + 10)) >> 2) *
                     -0x33333333;
        iVar30 = (int)((ulonglong)((longlong)psVar23 - *(longlong *)(param_2 + 6)) >> 1);
        param_2[4] = iVar30;
        *(int *)(*(longlong *)(param_2 + 2) + -0x20 + (longlong)iVar31 * 0x48) =
             (*(int *)(*(longlong *)(param_2 + 2) + -0x20 + (longlong)iVar31 * 0x48) -
             (iStack_184 + (int)uStack_190)) + iVar30;
        *(float **)(param_2 + 0x10) = pfStack_180;
        *(short **)(param_2 + 0x12) = psVar23;
        param_2[0xd] = (int)uStack_178;
        break;
      }
      *param_2 = iVar30 + -1;
      piVar4 = (int *)(*(longlong *)(param_2 + 2) + -0x68 + (longlong)iVar30 * 0x48);
      *piVar4 = *piVar4 - (int)uStack_190;
      param_2[8] = param_2[8] - (int)uStack_168;
      iVar32 = param_2[4] - (int)uStack_190;
      param_2[4] = iVar32;
      uStack_118 = *(ulonglong *)(param_2 + 0x18);
      uStack_110 = *(ulonglong *)(param_2 + 0x1a);
      iStack_108 = param_2[0x1c];
      iStack_104 = param_2[0x1d];
      iStack_100 = param_2[0x1e];
      iStack_fc = param_2[0x1f];
      iVar30 = *param_2;
      iVar31 = param_2[0x20];
      if (iVar30 == param_2[1]) {
        if (iVar30 == 0) {
          iVar19 = 8;
        }
        else {
          iVar19 = iVar30 / 2 + iVar30;
        }
        iVar29 = iVar30 + 1;
        if (iVar30 + 1 < iVar19) {
          iVar29 = iVar19;
        }
        lVar15 = FUN_7ff70c802100((longlong)iVar29 * 0x48);
        if (*(longlong *)(param_2 + 2) != 0) {
          FUN_7ff70cb12b60(lVar15);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
        }
        *(longlong *)(param_2 + 2) = lVar15;
        param_2[1] = iVar29;
        iVar30 = *param_2;
      }
      else {
        lVar15 = *(longlong *)(param_2 + 2);
      }
      lVar17 = (longlong)iVar30;
      piVar4 = (int *)(lVar15 + 0x10 + lVar17 * 0x48);
      *piVar4 = iStack_108;
      piVar4[1] = iStack_104;
      piVar4[2] = iStack_100;
      piVar4[3] = iStack_fc;
      puVar1 = (ulonglong *)(lVar15 + lVar17 * 0x48);
      *puVar1 = uStack_118;
      puVar1[1] = uStack_110;
      *(int *)(lVar15 + 0x20 + lVar17 * 0x48) = iVar31;
      *(int *)(lVar15 + 0x24 + lVar17 * 0x48) = iVar32;
      puVar3 = (undefined8 *)(lVar15 + 0x28 + lVar17 * 0x48);
      *puVar3 = 0;
      puVar3[1] = 0;
      puVar3 = (undefined8 *)(lVar15 + 0x38 + lVar17 * 0x48);
      *puVar3 = 0;
      puVar3[1] = 0;
      *param_2 = *param_2 + 1;
      fVar44 = (float)(int)pfStack_140[1];
    } while (fVar44 < param_6[3] || fVar44 == param_6[3]);
  }
  if (_DAT_7ff70cbebd80 == (uStack_f0 ^ (ulonglong)auStack_1d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_f0 ^ (ulonglong)auStack_1d8);
  pcVar9 = (code *)swi(3);
  (*pcVar9)();
  return;
}


