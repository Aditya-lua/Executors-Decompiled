/* 7ff70c909a10 FUN_7ff70c909a10 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c909a10(longlong param_1)

{
  uint *puVar1;
  uint *puVar2;
  uint *puVar3;
  undefined4 *puVar4;
  float fVar5;
  float fVar6;
  ushort uVar7;
  longlong lVar8;
  float *pfVar9;
  longlong lVar10;
  undefined8 *puVar11;
  code *pcVar12;
  byte bVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined8 uVar17;
  longlong lVar18;
  undefined1 (*pauVar19) [16];
  sbyte sVar20;
  ulonglong uVar21;
  ulonglong uVar22;
  ulonglong uVar23;
  ulonglong uVar24;
  float *pfVar25;
  ulonglong uVar26;
  bool bVar27;
  ulonglong uVar28;
  float fVar29;
  int *piVar30;
  longlong lVar31;
  uint uVar32;
  int iVar33;
  uint uVar34;
  int iVar35;
  int iVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  float fVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auStack_168 [36];
  short sStack_144;
  short sStack_142;
  longlong lStack_140;
  longlong lStack_138;
  ulonglong uStack_130;
  longlong lStack_128;
  ulonglong uStack_120;
  ulonglong uStack_118;
  ulonglong uStack_110;
  float afStack_108 [6];
  ulonglong auStack_f0 [3];
  undefined4 uStack_d8;
  longlong lStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined4 uStack_b8;
  longlong lStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined4 uStack_98;
  longlong lStack_90;
  ulonglong uStack_80;
  float fVar42;
  
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_168;
  lVar8 = *(longlong *)(param_1 + 0x1a0);
  sStack_144 = *(short *)(param_1 + 0x228);
  sStack_142 = *(short *)(param_1 + 0x22c);
  afStack_108[0] = 0.0;
  afStack_108[1] = 0.0;
  afStack_108[2] = 0.0;
  afStack_108[3] = 0.0;
  afStack_108[4] = 0.0;
  auStack_f0[1] = 0;
  auStack_f0[2] = 0;
  uStack_d8 = 0;
  uStack_c8 = 0;
  uStack_c0 = 0;
  uStack_b8 = 0;
  uStack_a8 = 0;
  uStack_a0 = 0;
  uStack_98 = 0;
  iVar36 = *(int *)(param_1 + 0x6c) * 2 + 0x23;
  uVar32 = iVar36 >> 3 & 0xfffffffc;
  iVar33 = uVar32 * 5;
  lStack_140 = _DAT_7ff70cc1a3c0;
  lStack_138 = param_1;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x29b4) < iVar33) {
    uVar17 = FUN_7ff70c802100((longlong)iVar33);
    if (*(longlong *)(lStack_140 + 0x29b8) != 0) {
      FUN_7ff70cb12b60(uVar17,*(longlong *)(lStack_140 + 0x29b8),
                       (longlong)*(int *)(lStack_140 + 0x29b0));
      FUN_7ff70c802510(*(undefined8 *)(lStack_140 + 0x29b8));
    }
    *(undefined8 *)(lStack_140 + 0x29b8) = uVar17;
    *(int *)(lStack_140 + 0x29b4) = iVar33;
  }
  else {
    uVar17 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x29b8);
  }
  lVar18 = lStack_140;
  uVar34 = 0;
  FUN_7ff70cb12b80(uVar17,0);
  uVar16 = _UNK_7ff70cb1d75c;
  uVar15 = _UNK_7ff70cb1d758;
  uVar14 = _UNK_7ff70cb1d754;
  fVar6 = _DAT_7ff70cb1d750;
  fVar5 = _DAT_7ff70cb1c5d8;
  uVar23 = *(ulonglong *)(lVar18 + 0x29b8);
  lVar18 = (longlong)(int)uVar32;
  auStack_f0[0] = uVar23;
  lStack_d0 = uVar23 + lVar18;
  lStack_b0 = uVar23 + lVar18 * 2;
  lStack_90 = lVar18 * 3 + uVar23;
  iVar33 = *(int *)(lStack_138 + 0x6c);
  uVar22 = uVar23;
  if (0 < iVar33) {
    lStack_128 = (longlong)(int)(uVar32 << 2);
    uStack_130 = lStack_128 + uVar23;
    uVar22 = 100;
    uVar26 = 0;
    do {
      if ((*(uint *)(*(longlong *)(lStack_138 + 0x58) + (uVar26 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar26 & 0x1f) & 1) != 0) {
        lVar18 = *(longlong *)(lStack_138 + 0x18);
        uVar7 = *(ushort *)(lVar18 + -2 + uVar22);
        iVar33 = *(int *)(*(longlong *)(lVar8 + 0x10) + (ulonglong)uVar7 * 0x20);
        lVar31 = (longlong)iVar33;
        if (0 < lVar31) {
          piVar30 = (int *)(*(longlong *)(lVar8 + 0x10) + (ulonglong)uVar7 * 0x20);
          if ((*(int *)(*(longlong *)(piVar30 + 2) + -0x20 + lVar31 * 0x48) == 0) &&
             (*(longlong *)(*(longlong *)(piVar30 + 2) + lVar31 * 0x48 + -0x18) == 0)) {
            iVar33 = iVar33 + -1;
            *piVar30 = iVar33;
          }
          if (iVar33 == 1) {
            if ((*(byte *)(lVar18 + -99 + uVar22) & 1) == 0) {
              if (sStack_144 < 1) {
                fVar29 = *(float *)(lVar18 + -0x1c + uVar22);
              }
              else {
                fVar29 = *(float *)(lVar18 + -0x20 + uVar22);
              }
              fVar39 = *(float *)(lVar18 + -0x18 + uVar22);
              auVar38 = blendvps(ZEXT416((uint)fVar39),ZEXT416((uint)fVar29),
                                 ZEXT416(-(uint)(fVar39 <= fVar29)));
              pfVar25 = (float *)(lVar18 + -0x38 + uVar22);
              if (*pfVar25 <= auVar38._0_4_ && auVar38._0_4_ != *pfVar25) goto LAB_7ff70c909d7f;
            }
            if (sStack_142 < 1) {
              uVar32 = 1;
            }
            else {
              uVar32 = (uint)((longlong)*(short *)(lStack_138 + 0x22c) <= (longlong)uVar26);
            }
            uVar32 = uVar32 | (uint)(sStack_144 < 1) * 2;
            uVar24 = (ulonglong)(uVar32 << 5);
            pfVar25 = (float *)((longlong)afStack_108 + uVar24);
            iVar33 = *(int *)((longlong)afStack_108 + uVar24 + 0x10);
            if (iVar33 == 0) {
              *pfVar25 = fVar6;
              *(undefined4 *)((longlong)afStack_108 + uVar24 + 4) = uVar14;
              *(undefined4 *)((longlong)afStack_108 + uVar24 + 8) = uVar15;
              *(undefined4 *)((longlong)afStack_108 + uVar24 + 0xc) = uVar16;
              fVar29 = fVar5;
            }
            else {
              fVar29 = *pfVar25;
            }
            puVar1 = (uint *)(*(longlong *)((longlong)auStack_f0 + uVar24) +
                             (ulonglong)(uVar7 >> 5) * 4);
            *puVar1 = *puVar1 | 1 << ((byte)uVar7 & 0x1f);
            *(int *)((longlong)afStack_108 + uVar24 + 0x10) = iVar33 + 1;
            pfVar9 = *(float **)(piVar30 + 2);
            if (*pfVar9 < fVar29) {
              *pfVar25 = *pfVar9;
            }
            fVar29 = pfVar9[3];
            fVar39 = pfVar9[2];
            if (*(float *)((longlong)afStack_108 + uVar24 + 4) <= pfVar9[1]) {
              pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 8);
              if (fVar39 < *pfVar25 || fVar39 == *pfVar25) goto LAB_7ff70c909d70;
LAB_7ff70c909e0f:
              *(float *)((longlong)afStack_108 + uVar24 + 8) = fVar39;
              pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 0xc);
              if (*pfVar25 <= fVar29 && fVar29 != *pfVar25) {
LAB_7ff70c909d76:
                *(float *)((longlong)afStack_108 + uVar24 + 0xc) = fVar29;
              }
            }
            else {
              *(float *)((longlong)afStack_108 + uVar24 + 4) = pfVar9[1];
              pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 8);
              if (*pfVar25 <= fVar39 && fVar39 != *pfVar25) goto LAB_7ff70c909e0f;
LAB_7ff70c909d70:
              pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 0xc);
              if (*pfVar25 <= fVar29 && fVar29 != *pfVar25) goto LAB_7ff70c909d76;
            }
            uVar34 = uVar34 | 1 << uVar32;
          }
        }
LAB_7ff70c909d7f:
        if (0 < sStack_144) {
          uVar7 = *(ushort *)(lVar18 + uVar22);
          iVar33 = *(int *)(*(longlong *)(lVar8 + 0x10) + (ulonglong)uVar7 * 0x20);
          lVar31 = (longlong)iVar33;
          if (0 < lVar31) {
            piVar30 = (int *)(*(longlong *)(lVar8 + 0x10) + (ulonglong)uVar7 * 0x20);
            if ((*(int *)(*(longlong *)(piVar30 + 2) + -0x20 + lVar31 * 0x48) == 0) &&
               (*(longlong *)(*(longlong *)(piVar30 + 2) + lVar31 * 0x48 + -0x18) == 0)) {
              iVar33 = iVar33 + -1;
              *piVar30 = iVar33;
            }
            if ((iVar33 == 1) &&
               (((*(byte *)(lVar18 + -99 + uVar22) & 1) != 0 ||
                (fVar29 = *(float *)(lVar18 + -0x1c + uVar22),
                pfVar25 = (float *)(lVar18 + -0x38 + uVar22),
                fVar29 < *pfVar25 || fVar29 == *pfVar25)))) {
              if (sStack_142 < 1) {
                uVar32 = 3;
              }
              else {
                uVar32 = (longlong)*(short *)(lStack_138 + 0x22c) <= (longlong)uVar26 | 2;
              }
              uVar24 = (ulonglong)(uVar32 << 5);
              pfVar25 = (float *)((longlong)afStack_108 + uVar24);
              iVar33 = *(int *)((longlong)afStack_108 + uVar24 + 0x10);
              if (iVar33 == 0) {
                *pfVar25 = fVar6;
                *(undefined4 *)((longlong)afStack_108 + uVar24 + 4) = uVar14;
                *(undefined4 *)((longlong)afStack_108 + uVar24 + 8) = uVar15;
                *(undefined4 *)((longlong)afStack_108 + uVar24 + 0xc) = uVar16;
                fVar29 = fVar5;
              }
              else {
                fVar29 = *pfVar25;
              }
              puVar1 = (uint *)(*(longlong *)((longlong)auStack_f0 + uVar24) +
                               (ulonglong)(uVar7 >> 5) * 4);
              *puVar1 = *puVar1 | 1 << ((byte)uVar7 & 0x1f);
              *(int *)((longlong)afStack_108 + uVar24 + 0x10) = iVar33 + 1;
              pfVar9 = *(float **)(piVar30 + 2);
              if (*pfVar9 < fVar29) {
                *pfVar25 = *pfVar9;
              }
              fVar29 = pfVar9[3];
              fVar39 = pfVar9[2];
              if (*(float *)((longlong)afStack_108 + uVar24 + 4) <= pfVar9[1]) {
                pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 8);
                if (fVar39 < *pfVar25 || fVar39 == *pfVar25) goto LAB_7ff70c909eb6;
LAB_7ff70c909ec8:
                *(float *)((longlong)afStack_108 + uVar24 + 8) = fVar39;
                pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 0xc);
                if (*pfVar25 <= fVar29 && fVar29 != *pfVar25) {
LAB_7ff70c909ed7:
                  *(float *)((longlong)afStack_108 + uVar24 + 0xc) = fVar29;
                }
              }
              else {
                *(float *)((longlong)afStack_108 + uVar24 + 4) = pfVar9[1];
                pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 8);
                if (*pfVar25 <= fVar39 && fVar39 != *pfVar25) goto LAB_7ff70c909ec8;
LAB_7ff70c909eb6:
                pfVar25 = (float *)((longlong)afStack_108 + uVar24 + 0xc);
                if (*pfVar25 <= fVar29 && fVar29 != *pfVar25) goto LAB_7ff70c909ed7;
              }
              uVar34 = uVar34 | 1 << uVar32;
            }
          }
        }
        *(undefined2 *)(lVar18 + -4 + uVar22) = 0xffff;
        iVar33 = *(int *)(lStack_138 + 0x6c);
      }
      uVar26 = uVar26 + 1;
      uVar22 = uVar22 + 0x74;
    } while ((longlong)uVar26 < (longlong)iVar33);
    uStack_120 = uVar23;
    if (uVar34 != 0) {
      iVar35 = *(int *)(lVar8 + 4) + -2;
      iVar33 = *(int *)(lStack_140 + 0x22d4);
      if (iVar33 < iVar35) {
        if (iVar33 == 0) {
          iVar33 = 8;
        }
        else {
          iVar33 = iVar33 / 2 + iVar33;
        }
        if (iVar33 <= iVar35) {
          iVar33 = iVar35;
        }
        pauVar19 = (undefined1 (*) [16])FUN_7ff70c802100((longlong)iVar33 << 5);
        if (*(longlong *)(lStack_140 + 0x22d8) != 0) {
          FUN_7ff70cb12b60(pauVar19,*(longlong *)(lStack_140 + 0x22d8),
                           (longlong)*(int *)(lStack_140 + 0x22d0) << 5);
          FUN_7ff70c802510(*(undefined8 *)(lStack_140 + 0x22d8));
        }
        *(undefined1 (**) [16])(lStack_140 + 0x22d8) = pauVar19;
        *(int *)(lStack_140 + 0x22d4) = iVar33;
      }
      else {
        pauVar19 = *(undefined1 (**) [16])(lStack_140 + 0x22d8);
      }
      *(int *)(lStack_140 + 0x22d0) = iVar35;
      iVar33 = *(int *)(lVar8 + 4);
      if (2 < iVar33) {
        uVar32 = 2;
        do {
          sVar20 = ((byte)(iVar33 + -1) & 0x1f) + 1;
          if ((int)(uVar32 | 0x1f) < iVar33 + -1) {
            sVar20 = 0x20;
          }
          puVar1 = (uint *)(uVar23 + lStack_128 + (longlong)((int)uVar32 >> 5) * 4);
          *puVar1 = *puVar1 | (~(uint)(-1L << sVar20) >> ((byte)uVar32 & 0x1f)) <<
                              ((byte)uVar32 & 0x1f);
          uVar32 = (uVar32 & 0xffffffe0) + 0x20;
        } while ((int)uVar32 < iVar33);
      }
      bVar13 = (byte)*(ushort *)(lStack_138 + 0x234) & 0x1f;
      puVar1 = (uint *)(uVar23 + lStack_128 + (ulonglong)(*(ushort *)(lStack_138 + 0x234) >> 5) * 4)
      ;
      *puVar1 = *puVar1 & (-2 << bVar13 | 0xfffffffeU >> 0x20 - bVar13);
      iVar33 = (*(int *)(lVar8 + 4) - (uint)(0 < sStack_144)) + -2;
      uVar22 = *(ulonglong *)(lStack_138 + 0x160);
      fVar5 = *(float *)(lStack_138 + 0x168);
      fVar6 = *(float *)(lStack_138 + 0x16c);
      uVar32 = iVar36 >> 5;
      uVar26 = (ulonglong)uVar32;
      uStack_110 = uVar26 * 4 + uVar23 + lStack_128;
      uStack_118 = (ulonglong)(uVar32 & 0x7ffffff8);
      lVar18 = lStack_128 + uVar23;
      uVar23 = 0;
      do {
        fVar29 = afStack_108[uVar23 * 8 + 4];
        if (fVar29 != 0.0) {
          fVar39 = afStack_108[uVar23 * 8 + 2];
          auVar38 = blendvps(ZEXT416((uint)fVar5),ZEXT416((uint)fVar39),
                             ZEXT416(-(uint)(fVar5 <= fVar39)));
          if ((uVar23 & 1) != 0) {
            fVar39 = auVar38._0_4_;
          }
          bVar27 = 1 < uVar23 && 0 < sStack_144;
          fVar42 = afStack_108[uVar23 * 8 + 3];
          uVar24 = *(ulonglong *)(afStack_108 + uVar23 * 8);
          auVar43._8_8_ = 0;
          auVar43._0_8_ = uVar24;
          iVar36 = -(uint)((float)(uVar24 >> 0x20) < (float)(uVar22 >> 0x20));
          auVar40._1_3_ = 0;
          auVar40[0] = 0 < sStack_142 & (byte)uVar23;
          auVar40[4] = bVar27;
          auVar40._5_3_ = 0;
          auVar40[8] = bVar27;
          auVar40._9_7_ = 0;
          auVar38._4_4_ = iVar36;
          auVar38._0_4_ = -(uint)((float)uVar24 < (float)uVar22);
          auVar38._8_4_ = iVar36;
          auVar38._12_4_ = iVar36;
          auVar38 = auVar38 | auVar40;
          auVar44._0_4_ = auVar38._0_4_ << 0x1f;
          auVar44._4_4_ = auVar38._4_4_ << 0x1f;
          auVar44._8_4_ = auVar38._8_4_ << 0x1f;
          auVar44._12_4_ = auVar38._12_4_ << 0x1f;
          auVar41._8_8_ = 0;
          auVar41._0_8_ = uVar22;
          auVar38 = blendvps(auVar41,auVar43,auVar44);
          if ((1 < uVar23) && ((*(byte *)(lStack_138 + 6) & 2) == 0)) {
            auVar44 = blendvps(ZEXT416((uint)fVar6),ZEXT416((uint)fVar42),
                               ZEXT416(-(uint)(fVar6 <= fVar42)));
            fVar42 = auVar44._0_4_;
          }
          if (0 < (int)uVar32) {
            uVar24 = auStack_f0[uVar23 * 4];
            if ((uVar32 < 8) || ((uStack_130 < uVar26 * 4 + uVar24 && (uVar24 < uStack_110)))) {
              uVar21 = 0;
            }
            else {
              lVar31 = 0;
              do {
                puVar1 = (uint *)(uVar24 + lVar31);
                puVar2 = (uint *)(uVar24 + 0x10 + lVar31);
                puVar3 = (uint *)(lVar18 + lVar31);
                auVar37._0_4_ = ~*puVar1 & *puVar3;
                auVar37._4_4_ = ~puVar1[1] & puVar3[1];
                auVar37._8_4_ = ~puVar1[2] & puVar3[2];
                auVar37._12_4_ = ~puVar1[3] & puVar3[3];
                puVar1 = (uint *)(lVar18 + 0x10 + lVar31);
                auVar45._0_4_ = ~*puVar2 & *puVar1;
                auVar45._4_4_ = ~puVar2[1] & puVar1[1];
                auVar45._8_4_ = ~puVar2[2] & puVar1[2];
                auVar45._12_4_ = ~puVar2[3] & puVar1[3];
                *(undefined1 (*) [16])(lVar18 + lVar31) = auVar37;
                *(undefined1 (*) [16])(lVar18 + 0x10 + lVar31) = auVar45;
                lVar31 = lVar31 + 0x20;
              } while ((ulonglong)(uVar32 >> 3 & 0xfffffff) << 5 != lVar31);
              uVar21 = uStack_118;
              if ((uVar32 & 0x7ffffff8) == uVar32) goto LAB_7ff70c90a280;
            }
            uVar28 = uVar21;
            if ((uVar32 & 1) != 0) {
              puVar1 = (uint *)(uStack_130 + uVar21 * 4);
              *puVar1 = *puVar1 & ~*(uint *)(uVar24 + uVar21 * 4);
              uVar28 = uVar21 | 1;
            }
            if (uVar21 != uVar26 - 1) {
              do {
                puVar1 = (uint *)(lVar18 + uVar28 * 4);
                *puVar1 = *puVar1 & ~*(uint *)(uVar24 + uVar28 * 4);
                puVar1 = (uint *)(lVar18 + 4 + uVar28 * 4);
                *puVar1 = *puVar1 & ~*(uint *)(uVar24 + 4 + uVar28 * 4);
                uVar28 = uVar28 + 2;
              } while (uVar26 != uVar28);
            }
          }
LAB_7ff70c90a280:
          iVar33 = iVar33 - (int)fVar29;
          iVar36 = *(int *)(lVar8 + 4);
          if (0 < iVar36) {
            uVar24 = auStack_f0[uVar23 * 4];
            lVar31 = 8;
            uVar21 = 0;
            do {
              uVar28 = uVar21 >> 5 & 0x7ffffff;
              uVar34 = *(uint *)(uVar24 + uVar28 * 4);
              if ((uVar34 >> ((uint)uVar21 & 0x1f) & 1) != 0) {
                *(uint *)(uVar24 + uVar28 * 4) = uVar34 & ~(1 << ((byte)uVar21 & 0x1f));
                fVar29 = (float)((int)fVar29 + -1);
                lVar10 = *(longlong *)(lVar8 + 0x10);
                puVar11 = *(undefined8 **)(lVar10 + lVar31);
                *puVar11 = auVar38._0_8_;
                *(float *)(puVar11 + 1) = fVar39;
                *(float *)((longlong)puVar11 + 0xc) = fVar42;
                auVar44 = *(undefined1 (*) [16])(lVar10 + -8 + lVar31);
                pauVar19[1] = *(undefined1 (*) [16])(lVar10 + 8 + lVar31);
                *pauVar19 = auVar44;
                pauVar19 = pauVar19 + 2;
                iVar36 = *(int *)(lVar8 + 4);
              }
              uVar21 = uVar21 + 1;
            } while (((longlong)uVar21 < (longlong)iVar36) &&
                    (lVar31 = lVar31 + 0x20, fVar29 != 0.0));
          }
        }
        if (uVar23 == 1 && 0 < sStack_144) {
          lVar31 = (ulonglong)*(ushort *)(lStack_138 + 0x234) * 0x20;
          auVar38 = *(undefined1 (*) [16])(*(longlong *)(lVar8 + 0x10) + lVar31);
          puVar11 = (undefined8 *)(*(longlong *)(lVar8 + 0x10) + 0x10 + lVar31);
          uVar17 = puVar11[1];
          *(undefined8 *)pauVar19[1] = *puVar11;
          *(undefined8 *)(pauVar19[1] + 8) = uVar17;
          *pauVar19 = auVar38;
          pauVar19 = pauVar19 + 2;
        }
        uVar23 = uVar23 + 1;
      } while (uVar23 != 4);
      iVar36 = *(int *)(lVar8 + 4);
      if ((0 < iVar36) && (iVar33 != 0)) {
        uVar23 = 0;
        lVar18 = 0;
        do {
          if ((*(uint *)(uStack_130 + (uVar23 >> 5 & 0x7ffffff) * 4) >> ((uint)uVar23 & 0x1f) & 1)
              != 0) {
            auVar38 = *(undefined1 (*) [16])(*(longlong *)(lVar8 + 0x10) + lVar18);
            puVar4 = (undefined4 *)(*(longlong *)(lVar8 + 0x10) + 0x10 + lVar18);
            uVar14 = puVar4[1];
            uVar15 = puVar4[2];
            uVar16 = puVar4[3];
            *(undefined4 *)pauVar19[1] = *puVar4;
            *(undefined4 *)(pauVar19[1] + 4) = uVar14;
            *(undefined4 *)(pauVar19[1] + 8) = uVar15;
            *(undefined4 *)(pauVar19[1] + 0xc) = uVar16;
            *pauVar19 = auVar38;
            pauVar19 = pauVar19 + 2;
            iVar33 = iVar33 + -1;
            iVar36 = *(int *)(lVar8 + 4);
          }
          uVar23 = uVar23 + 1;
        } while (((longlong)uVar23 < (longlong)iVar36) && (lVar18 = lVar18 + 0x20, iVar33 != 0));
      }
      uVar22 = *(ulonglong *)(lStack_140 + 0x22d8);
      if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_168)) {
        FUN_7ff70cb12b60(*(longlong *)(lVar8 + 0x10) + 0x40,uVar22,(longlong)iVar36 * 0x20 + -0x40);
        return;
      }
      goto LAB_7ff70c90a41b;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_168)) {
    return;
  }
LAB_7ff70c90a41b:
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_168,uVar22);
  pcVar12 = (code *)swi(3);
  (*pcVar12)();
  return;
}


