/* 7ff70c7e67b0 FUN_7ff70c7e67b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7e67b0(longlong param_1)

{
  ushort *puVar1;
  longlong *plVar2;
  float fVar3;
  float fVar4;
  int iVar5;
  uint uVar6;
  longlong *plVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  code *pcVar11;
  float fVar12;
  ushort uVar13;
  undefined4 uVar14;
  longlong *plVar15;
  longlong lVar16;
  ushort uVar17;
  longlong lVar18;
  longlong lVar19;
  ushort *puVar20;
  ulonglong uVar21;
  uint uVar22;
  longlong lVar23;
  longlong lVar24;
  longlong *plVar25;
  bool bVar26;
  float fVar27;
  undefined1 auStack_b8 [32];
  undefined4 uStack_98;
  undefined4 uStack_8c;
  float fStack_88;
  float fStack_84;
  ulonglong uStack_80;
  
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_b8;
  *(undefined1 *)(*(longlong *)(param_1 + 0x2b0) + 0xb9) = 1;
  fVar12 = _DAT_7ff70cb1ba70;
  if ((longlong)*(int *)(param_1 + 0x68) != 0) {
    plVar25 = *(longlong **)(param_1 + 0x70);
    plVar2 = plVar25 + *(int *)(param_1 + 0x68);
    do {
      plVar7 = (longlong *)*plVar25;
      lVar16 = *plVar7;
      fVar27 = (float)(int)(*(float *)((longlong)plVar7 + 0x1c) + fVar12);
      fVar3 = *(float *)((longlong)plVar7 + 0x14);
      if (((lVar16 == 0) || (*(float *)(lVar16 + 0x14) != fVar27)) ||
         (NAN(*(float *)(lVar16 + 0x14)) || NAN(fVar27))) {
LAB_7ff70c7e6870:
        lVar8 = plVar7[1];
        lVar9 = *(longlong *)(lVar8 + 0x2b0);
        uStack_8c = (undefined4)plVar7[3];
        fStack_88 = fVar27;
        fStack_84 = fVar3;
        uVar14 = FUN_7ff70c802e60(&uStack_8c,0xc,0);
        plVar15 = (longlong *)FUN_7ff70c805430(*(longlong *)(lVar8 + 0x2b0) + 0xd8,uVar14);
        lVar16 = *plVar15;
        if (*plVar15 != 0) goto LAB_7ff70c7e68c7;
        if (((*(byte *)(plVar7 + 2) & 8) == 0) && (*(char *)(lVar8 + 0x50) != '\x01')) {
LAB_7ff70c7e6b5f:
          uStack_98 = uVar14;
          lVar16 = FUN_7ff70c7e7790(lVar8,plVar7,fVar27,fVar3);
          *plVar15 = lVar16;
          if (lVar16 != 0) {
LAB_7ff70c7e68c7:
            *(undefined4 *)(lVar16 + 0x50) = *(undefined4 *)(lVar9 + 0xa4);
            *plVar7 = lVar16;
            goto LAB_7ff70c7e68d3;
          }
        }
        else {
          uVar6 = *(uint *)(*(longlong *)(lVar8 + 0x2b0) + 0xc0);
          if (0 < (int)uVar6) {
            lVar10 = *(longlong *)(*(longlong *)(lVar8 + 0x2b0) + 0xd0);
            uVar21 = 0;
            lVar16 = 0;
            lVar19 = 0;
            do {
              lVar23 = *(longlong *)(lVar10 + (uVar21 >> 5) * 8);
              lVar24 = (ulonglong)((uint)uVar21 & 0x1f) * 0x68;
              lVar18 = lVar19;
              if ((*(longlong **)(lVar23 + 0x58 + lVar24) == plVar7) &&
                 (lVar23 = lVar23 + lVar24, (*(byte *)(lVar23 + 0x4f) & 4) == 0)) {
                if ((*(float *)(lVar23 + 0x18) == fVar3) &&
                   (!NAN(*(float *)(lVar23 + 0x18)) && !NAN(fVar3))) {
                  fVar4 = *(float *)(lVar23 + 0x14);
                  if ((fVar27 < fVar4) && ((lVar16 == 0 || (fVar4 < *(float *)(lVar16 + 0x14))))) {
                    lVar16 = lVar23;
                  }
                  if (((fVar4 < fVar27) && (lVar18 = lVar23, lVar19 != 0)) &&
                     (fVar4 < *(float *)(lVar19 + 0x14) || fVar4 == *(float *)(lVar19 + 0x14))) {
                    lVar18 = lVar19;
                  }
                }
              }
              uVar22 = (uint)uVar21 + 1;
              uVar21 = (ulonglong)uVar22;
              lVar19 = lVar18;
            } while (uVar6 != uVar22);
            if (lVar16 == 0) {
              lVar16 = lVar18;
              if (lVar18 == 0) {
                uVar21 = 0;
                lVar16 = 0;
                lVar19 = 0;
                do {
                  lVar23 = *(longlong *)(lVar10 + (uVar21 >> 5) * 8);
                  lVar24 = (ulonglong)((uint)uVar21 & 0x1f) * 0x68;
                  lVar18 = lVar19;
                  if ((*(longlong **)(lVar23 + 0x58 + lVar24) == plVar7) &&
                     (lVar23 = lVar23 + lVar24, (*(byte *)(lVar23 + 0x4f) & 4) == 0)) {
                    fVar4 = *(float *)(lVar23 + 0x14);
                    if ((fVar27 < fVar4) && ((lVar16 == 0 || (fVar4 < *(float *)(lVar16 + 0x14)))))
                    {
                      lVar16 = lVar23;
                    }
                    if (((fVar4 < fVar27) && (lVar18 = lVar23, lVar19 != 0)) &&
                       (fVar4 < *(float *)(lVar19 + 0x14) || fVar4 == *(float *)(lVar19 + 0x14))) {
                      lVar18 = lVar19;
                    }
                  }
                  uVar22 = (uint)uVar21 + 1;
                  uVar21 = (ulonglong)uVar22;
                  lVar19 = lVar18;
                } while (uVar6 != uVar22);
                if (lVar16 != 0) goto LAB_7ff70c7e6a90;
                lVar16 = lVar18;
                if (lVar18 == 0) goto LAB_7ff70c7e6b58;
              }
            }
            else {
LAB_7ff70c7e6a90:
              if ((lVar18 != 0) &&
                 ((*(float *)(lVar16 + 0x14) < fVar27 + fVar27 ||
                  (*(float *)(lVar18 + 0x14) <= fVar27 * fVar12)))) {
                lVar16 = lVar18;
              }
            }
            goto LAB_7ff70c7e68c7;
          }
LAB_7ff70c7e6b58:
          if (*(char *)(lVar8 + 0x50) == '\0') goto LAB_7ff70c7e6b5f;
        }
        lVar16 = 0;
        uVar17 = *(ushort *)((longlong)plVar7 + 0x32);
      }
      else {
        if ((*(float *)(lVar16 + 0x18) != fVar3) || (NAN(*(float *)(lVar16 + 0x18)) || NAN(fVar3)))
        goto LAB_7ff70c7e6870;
LAB_7ff70c7e68d3:
        uVar17 = *(ushort *)((longlong)plVar7 + 0x32);
      }
      if (((ulonglong)uVar17 != 0) &&
         ((*(uint *)(lVar16 + 0x20) <= (uint)uVar17 ||
          (*(short *)(*(longlong *)(lVar16 + 0x28) + (ulonglong)uVar17 * 2) == -1)))) {
        FUN_7ff70c7f86d0(lVar16);
      }
      uVar17 = *(ushort *)(plVar7 + 6);
      if (((ulonglong)uVar17 == 0) ||
         (((uint)uVar17 < *(uint *)(lVar16 + 0x20) &&
          (*(short *)(*(longlong *)(lVar16 + 0x28) + (ulonglong)uVar17 * 2) != -1)))) {
        iVar5 = (int)plVar7[4];
      }
      else {
        FUN_7ff70c7f86d0(lVar16);
        iVar5 = (int)plVar7[4];
      }
      if ((longlong)iVar5 != 0) {
        plVar15 = (longlong *)plVar7[5];
        plVar7 = plVar15 + iVar5;
        do {
          puVar20 = *(ushort **)(*plVar15 + 0x40);
          if (puVar20 == (ushort *)0x0) {
            puVar20 = (ushort *)&UNK_7ff70cb15438;
          }
          uVar17 = *puVar20;
          while (uVar17 != 0) {
            uVar13 = puVar20[1];
            if (uVar17 <= uVar13) {
              uVar21 = (ulonglong)uVar17;
              do {
                if ((*(uint *)(lVar16 + 0x20) <= uVar21) ||
                   (*(short *)(*(longlong *)(lVar16 + 0x28) + uVar21 * 2) == -1)) {
                  FUN_7ff70c7f86d0(lVar16,uVar21 & 0xffffffff);
                  uVar13 = puVar20[1];
                }
              } while ((uVar21 < uVar13) && (bVar26 = uVar21 < 0xffff, uVar21 = uVar21 + 1, bVar26))
              ;
            }
            puVar1 = puVar20 + 2;
            puVar20 = puVar20 + 2;
            uVar17 = *puVar1;
          }
          plVar15 = plVar15 + 1;
        } while (plVar15 != plVar7);
      }
      plVar25 = plVar25 + 1;
    } while (plVar25 != plVar2);
  }
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_b8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_b8);
  pcVar11 = (code *)swi(3);
  (*pcVar11)();
  return;
}


