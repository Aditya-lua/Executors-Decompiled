/* 7ff70c7d93b0 FUN_7ff70c7d93b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c7d93b0(longlong param_1,ulonglong param_2,ulonglong param_3,uint *param_4)

{
  int *piVar1;
  int *piVar2;
  undefined8 *puVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  code *pcVar7;
  int *piVar8;
  float fVar9;
  int iVar10;
  int iVar11;
  uint *puVar12;
  longlong lVar13;
  ulonglong uVar14;
  int iVar15;
  longlong lVar16;
  int *piVar17;
  uint *puVar18;
  int *piVar19;
  int iVar20;
  int iVar21;
  uint uVar22;
  int iVar23;
  ushort uVar24;
  uint *puVar25;
  uint *puVar26;
  longlong lVar27;
  longlong lVar28;
  undefined *puVar29;
  uint uVar30;
  int iVar31;
  uint uVar32;
  uint uVar34;
  int iVar35;
  uint *puVar36;
  undefined8 *puVar37;
  int iVar38;
  uint uVar39;
  undefined1 auStack_118 [40];
  undefined8 *puStack_f0;
  int iStack_e4;
  uint *puStack_e0;
  longlong lStack_d8;
  uint uStack_cc;
  ulonglong uStack_c8;
  ulonglong uStack_c0;
  longlong lStack_b8;
  int iStack_ac;
  ulonglong uStack_a8;
  uint *puStack_a0;
  int *piStack_98;
  ulonglong uStack_90;
  int iStack_84;
  ulonglong uStack_80;
  ulonglong uStack_78;
  uint *puStack_70;
  ulonglong uStack_68;
  ulonglong uStack_60;
  ulonglong uVar33;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_118;
  piStack_98 = *(int **)(param_1 + 0x2b0);
  uVar32 = *(uint *)(param_1 + 8);
  iVar11 = (int)param_2;
  iVar15 = (int)*(undefined8 *)(piStack_98 + 0x2a);
  iVar23 = (int)((ulonglong)*(undefined8 *)(piStack_98 + 0x2a) >> 0x20);
  uVar39 = (uint)param_3;
  *(ulonglong *)(piStack_98 + 0x2a) =
       CONCAT44((uint)((int)uVar39 < iVar23) * iVar23 | ((int)uVar39 >= iVar23) * uVar39,
                (uint)(iVar11 < iVar15) * iVar15 | (uint)(iVar11 >= iVar15) * iVar11);
  fVar9 = _DAT_7ff70cb1c5dc;
  uVar30 = uVar32 + iVar11;
  uStack_68 = (ulonglong)(uVar30 - 1);
  uVar34 = uVar32 + uVar39;
  uVar22 = 0;
  uVar24 = 0;
  puStack_70 = param_4;
  if (uVar34 != 0 && uVar30 != 0) {
    puStack_a0 = (uint *)(piStack_98 + 6);
    iStack_ac = 3;
    piVar17 = piStack_98;
    lStack_d8 = param_1;
    uStack_cc = uVar39;
    uStack_c0 = (ulonglong)uVar34;
    uStack_a8 = (ulonglong)uVar30;
    uStack_90 = param_2;
    uStack_80 = (ulonglong)uVar32;
    do {
      iVar15 = *piVar17;
      iVar23 = (int)uStack_68 + piVar17[2];
      iVar23 = iVar23 - iVar23 % piVar17[2];
      uStack_c8 = CONCAT44(uStack_c8._4_4_,iVar15);
      if (iVar23 <= iVar15) {
        iVar11 = piVar17[1];
        lStack_b8 = CONCAT44(lStack_b8._4_4_,iVar11);
        if ((int)(uint)uStack_c0 <= iVar11) {
          puVar18 = *(uint **)puStack_a0;
          uVar32 = *puVar18;
          iVar38 = uVar32 + iVar23;
          if (iVar15 < iVar38) {
            iVar31 = piVar17[4];
            puStack_e0 = (uint *)0x0;
            iStack_e4 = 0x40000000;
            puStack_f0 = (undefined8 *)0x40000000;
            uStack_c8 = 0;
          }
          else {
            iVar31 = piVar17[4];
            if (iVar23 < 1) {
              iStack_e4 = (uint)(iVar31 == 0) << 0x1e;
              puStack_f0 = (undefined8 *)0x0;
              puStack_e0 = puStack_a0;
            }
            else {
              iStack_e4 = 0x40000000;
              puStack_e0 = (uint *)0x0;
              puStack_f0 = (undefined8 *)0x40000000;
              puVar26 = puVar18;
              puVar36 = puStack_a0;
              uVar22 = uVar32;
              do {
                iVar21 = 0;
                iVar35 = 0;
                puVar37 = (undefined8 *)0x0;
                puVar25 = puVar26;
                uVar34 = uVar22;
                do {
                  uVar30 = puVar25[1];
                  iVar20 = (int)puVar37;
                  if (uVar30 - iVar20 == 0 || (int)uVar30 < iVar20) {
                    puVar25 = *(uint **)(puVar25 + 2);
                    uVar39 = *puVar25;
                    iVar10 = iVar23 - iVar35;
                    if ((int)((uVar39 - uVar34) + iVar35) <= iVar23) {
                      iVar10 = uVar39 - uVar34;
                    }
                    iVar20 = (iVar20 - uVar30) * iVar10;
                  }
                  else {
                    iVar20 = (uVar30 - iVar20) * iVar35;
                    puVar25 = *(uint **)(puVar25 + 2);
                    uVar39 = *puVar25;
                    if ((int)uVar34 < (int)uVar22) {
                      uVar34 = uVar22;
                    }
                    iVar10 = uVar39 - uVar34;
                    puVar37 = (undefined8 *)(ulonglong)uVar30;
                  }
                  iVar21 = iVar21 + iVar20;
                  iVar35 = iVar35 + iVar10;
                  uVar34 = uVar39;
                } while ((int)uVar39 < iVar38);
                iVar38 = (int)puVar37;
                puVar3 = puStack_f0;
                if (iVar31 == 0) {
                  if (iVar38 < (int)puStack_f0) {
                    puVar3 = puVar37;
                    puStack_e0 = puVar36;
                  }
                }
                else if (((int)((uint)uStack_c0 + iVar38) <= iVar11) &&
                        ((iVar38 < (int)puStack_f0 ||
                         ((iVar38 == (int)puStack_f0 && (iVar21 < iStack_e4)))))) {
                  puVar3 = puVar37;
                  iStack_e4 = iVar21;
                  puStack_e0 = puVar36;
                }
                puStack_f0 = puVar3;
                puVar36 = puVar26 + 2;
                uVar22 = **(uint **)(puVar26 + 2);
                iVar38 = iVar23 + uVar22;
                puVar26 = *(uint **)(puVar26 + 2);
              } while (iVar38 <= iVar15);
              param_1 = lStack_d8;
              iStack_84 = iVar31;
              uStack_78 = (ulonglong)uVar32;
              if (puStack_e0 == (uint *)0x0) {
                puStack_e0 = (uint *)0x0;
                uStack_c8 = 0;
                goto LAB_7ff70c7d9760;
              }
            }
            uStack_c8 = (ulonglong)**(uint **)puStack_e0;
          }
LAB_7ff70c7d9760:
          puVar26 = puVar18;
          if (iVar31 == 1) {
            while (puVar36 = puStack_a0, (int)uVar32 < iVar23) {
              uVar32 = **(uint **)(puVar26 + 2);
              puVar26 = *(uint **)(puVar26 + 2);
            }
            do {
              uVar32 = *puVar26;
              uVar22 = uVar32 - iVar23;
              uVar14 = (ulonglong)uVar22;
              puVar25 = puVar18;
              do {
                puVar18 = puVar25;
                puVar12 = puVar36;
                puVar36 = puVar18 + 2;
                puVar25 = *(uint **)(puVar18 + 2);
              } while ((int)**(uint **)(puVar18 + 2) <= (int)uVar22);
              uVar34 = *puVar18;
              puVar37 = (undefined8 *)0x0;
              iVar15 = 0;
              if ((int)uVar34 < (int)uVar32) {
                iVar15 = 0;
                iVar38 = 0;
                uVar30 = 0;
                puVar36 = puVar18;
                do {
                  uVar39 = puVar36[1];
                  puVar37 = (undefined8 *)(ulonglong)uVar39;
                  if (uVar39 - uVar30 == 0 || (int)uVar39 < (int)uVar30) {
                    puVar36 = *(uint **)(puVar36 + 2);
                    iVar21 = *puVar36 - uVar34;
                    iVar31 = iVar23 - iVar38;
                    if (iVar21 + iVar38 <= iVar23) {
                      iVar31 = iVar21;
                    }
                    iVar21 = (uVar30 - uVar39) * iVar31;
                    puVar37 = (undefined8 *)(ulonglong)uVar30;
                    uVar34 = *puVar36;
                  }
                  else {
                    iVar21 = (uVar39 - uVar30) * iVar38;
                    puVar36 = *(uint **)(puVar36 + 2);
                    uVar30 = *puVar36;
                    if ((int)uVar34 < (int)uVar22) {
                      iVar31 = uVar30 - uVar22;
                      uVar34 = uVar30;
                    }
                    else {
                      iVar31 = uVar30 - uVar34;
                      uVar34 = uVar30;
                    }
                  }
                  iVar15 = iVar15 + iVar21;
                  iVar38 = iVar38 + iVar31;
                  uVar30 = (uint)puVar37;
                } while ((int)uVar34 < (int)uVar32);
              }
              iVar31 = (int)puVar37;
              puVar3 = puStack_f0;
              iVar38 = iStack_e4;
              puVar36 = puStack_e0;
              uVar33 = uStack_c8;
              if ((((((int)((uint)uStack_c0 + iVar31) <= iVar11) && (iVar31 <= (int)puStack_f0)) &&
                   (puVar3 = puVar37, iVar38 = iVar15, puVar36 = puVar12, uVar33 = uVar14,
                   (int)puStack_f0 <= iVar31)) &&
                  ((iStack_e4 <= iVar15 &&
                   (puVar3 = puStack_f0, iVar38 = iStack_e4, puVar36 = puStack_e0,
                   uVar33 = uStack_c8, iVar15 == iStack_e4)))) &&
                 (puVar3 = puVar37, iVar38 = iVar15, puVar36 = puVar12, uVar33 = uVar14,
                 (int)uStack_c8 <= (int)uVar22)) {
                puVar3 = puStack_f0;
                iVar38 = iStack_e4;
                puVar36 = puStack_e0;
                uVar33 = uStack_c8;
              }
              uStack_c8 = uVar33;
              puStack_e0 = puVar36;
              iStack_e4 = iVar38;
              puStack_f0 = puVar3;
              puVar26 = *(uint **)(puVar26 + 2);
              puVar36 = puVar12;
              param_1 = lStack_d8;
            } while (puVar26 != (uint *)0x0);
          }
          uVar22 = (uint)puStack_f0;
          piVar17 = piStack_98;
          if (((puStack_e0 != (uint *)0x0) && ((int)(uVar22 + (uint)uStack_c0) <= iVar11)) &&
             (piVar1 = *(int **)(piStack_98 + 8), piVar1 != (int *)0x0)) {
            iVar15 = (int)uStack_c8;
            *piVar1 = iVar15;
            piVar1[1] = uVar22 + (uint)uStack_c0;
            *(undefined8 *)(piStack_98 + 8) = *(undefined8 *)(piVar1 + 2);
            piVar19 = *(int **)puStack_e0;
            if (*piVar19 < iVar15) {
              piVar2 = *(int **)(piVar19 + 2);
              *(int **)(piVar19 + 2) = piVar1;
              piVar19 = piVar2;
            }
            else {
              *(int **)puStack_e0 = piVar1;
            }
            uVar30 = (uint)uStack_a8;
            iVar23 = uVar30 + iVar15;
            piVar2 = *(int **)(piVar19 + 2);
            while (piVar8 = piVar2, piVar8 != (int *)0x0) {
              if (iVar23 < *piVar8) {
                *(int **)(piVar1 + 2) = piVar19;
                iVar11 = *piVar19;
                goto joined_r0x7ff70c7d9e1f;
              }
              *(undefined8 *)(piVar19 + 2) = *(undefined8 *)(piStack_98 + 8);
              *(int **)(piStack_98 + 8) = piVar19;
              piVar19 = piVar8;
              piVar2 = *(int **)(piVar8 + 2);
            }
            *(int **)(piVar1 + 2) = piVar19;
            iVar11 = *piVar19;
joined_r0x7ff70c7d9e1f:
            if (iVar11 < iVar23) {
              *piVar19 = iVar23;
            }
            uVar14 = uStack_c8;
            if (iVar15 == 0x7fffffff) {
              if (uVar22 == 0x7fffffff) goto LAB_7ff70c7d99c0;
              uVar14 = 0xffff;
            }
            uVar24 = (ushort)uVar14;
            param_3 = (ulonglong)uStack_cc;
            uVar32 = (uint)uStack_80;
            param_2 = uStack_90;
            uVar34 = (uint)uStack_c0;
            break;
          }
        }
      }
LAB_7ff70c7d99c0:
      iVar15 = iStack_ac + -1;
      if ((iStack_ac == 0) || ((char)piVar17[0x2e] == '\x01')) goto LAB_7ff70c7d9e2a;
      puVar18 = *(uint **)(param_1 + 0x2b0);
      uVar32 = puVar18[0x30];
      iStack_ac = iVar15;
      if (0 < (int)uVar32) {
        uVar14 = 0;
        puStack_e0 = puVar18;
        do {
          lVar13 = *(longlong *)(*(longlong *)(puVar18 + 0x34) + (uVar14 >> 5) * 8);
          lVar16 = (ulonglong)((uint)uVar14 & 0x1f) * 0x68;
          lVar28 = *(longlong *)(param_1 + 0x2b0);
          if (((*(int *)(lVar13 + 0x50 + lVar16) + 2 <= *(int *)(lVar28 + 0xa4)) &&
              (puVar37 = (undefined8 *)(lVar13 + lVar16),
              (*(byte *)((longlong)puVar37 + 0x4f) & 4) == 0)) &&
             (puVar3 = (undefined8 *)puVar37[0xb], (*(byte *)(puVar3 + 2) & 8) == 0)) {
            puStack_f0 = puVar3;
            if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
              puVar29 = &UNK_7ff70cb8adf6;
              if (*(int *)(puVar3 + 4) != 0) {
                puVar29 = *(undefined **)puVar3[5];
              }
              FUN_7ff70c800cf0(&UNK_7ff70cb91e39,(double)*(float *)((longlong)puVar37 + 0x14),
                               puVar29);
            }
            iVar15 = *(int *)(puVar37 + 6);
            if ((longlong)iVar15 != 0) {
              lVar13 = puVar37[7];
              lVar16 = 0;
              do {
                uVar32 = *(uint *)(lVar13 + 0x28 + lVar16);
                if (uVar32 != 0xffffffff) {
                  uVar32 = uVar32 & 0xfffff;
                  uVar33 = (ulonglong)uVar32;
                  lVar4 = *(longlong *)(param_1 + 0x2b0);
                  lVar5 = *(longlong *)(lVar4 + 0x68);
                  lVar6 = *(longlong *)(lVar4 + 0x78);
                  uVar22 = *(uint *)(lVar6 + uVar33 * 4);
                  lVar27 = (longlong)((ulonglong)uVar22 << 0x2c) >> 0x2c;
                  *(uint *)(lVar6 + uVar33 * 4) = uVar22 & 0xbfffffff;
                  *(uint *)(lVar6 + uVar33 * 4) =
                       uVar22 + 0x100000 & 0x3ff00000 | uVar22 & 0x80000000 |
                       *(uint *)(lVar4 + 0x90) & 0xfffff;
                  iVar23 = *(int *)(param_1 + 8);
                  *(uint *)(lVar4 + 0x90) = uVar32;
                  *(int *)(lVar4 + 0x9c) = *(int *)(lVar4 + 0x9c) + 1;
                  *(int *)(lVar4 + 0xa0) =
                       *(int *)(lVar4 + 0xa0) +
                       ((uint)*(ushort *)(lVar5 + 6 + lVar27 * 8) + iVar23) *
                       ((uint)*(ushort *)(lVar5 + 4 + lVar27 * 8) + iVar23);
                  *(undefined4 *)(lVar5 + 4 + lVar27 * 8) = 0;
                }
                lVar16 = lVar16 + 0x2c;
              } while ((longlong)iVar15 * 0x2c - lVar16 != 0);
            }
            iVar15 = *(int *)(puStack_f0 + 4);
            lVar13 = puVar37[0xc];
            lStack_b8 = lVar28;
            if ((longlong)iVar15 != 0) {
              lVar28 = puStack_f0[5];
              lVar16 = 0;
              do {
                lVar4 = *(longlong *)(*(longlong *)(lVar28 + lVar16) + 0x80);
                if (lVar4 == 0) {
                  lVar4 = *(longlong *)(lStack_d8 + 0x2b8);
                  pcVar7 = *(code **)(lVar4 + 0x38);
                }
                else {
                  pcVar7 = *(code **)(lVar4 + 0x38);
                }
                if (pcVar7 != (code *)0x0) {
                  (*pcVar7)(lStack_d8,*(longlong *)(lVar28 + lVar16),puVar37,lVar13);
                }
                lVar13 = lVar13 + *(longlong *)(lVar4 + 0x48);
                lVar16 = lVar16 + 8;
              } while ((longlong)iVar15 * 8 != lVar16);
              lVar13 = puVar37[0xc];
            }
            lVar28 = lStack_b8;
            if (lVar13 != 0) {
              FUN_7ff70c802510(lVar13);
              puVar37[0xc] = 0;
            }
            FUN_7ff70c805e60(lVar28 + 0xd8,*(undefined4 *)((longlong)puVar37 + 0x54),0);
            piVar17 = (int *)(lVar28 + 0xe8);
            *piVar17 = *piVar17 + 1;
            *(undefined4 *)(puVar37 + 2) = 0;
            if (puVar37[7] != 0) {
              puVar37[6] = 0;
              FUN_7ff70c802510();
              puVar37[7] = 0;
            }
            param_1 = lStack_d8;
            if (puVar37[1] != 0) {
              *puVar37 = 0;
              FUN_7ff70c802510();
              puVar37[1] = 0;
            }
            if (puVar37[5] != 0) {
              puVar37[4] = 0;
              FUN_7ff70c802510();
              puVar37[5] = 0;
            }
            *(undefined4 *)(puVar37 + 8) = 0xffffffff;
            *(undefined8 *)((longlong)puVar37 + 0x44) = 0;
            *(uint *)((longlong)puVar37 + 0x4c) =
                 *(uint *)((longlong)puVar37 + 0x4c) & 0xf8000000 | 0x4000000;
            *puStack_f0 = 0;
            uVar32 = puStack_e0[0x30];
            puVar18 = puStack_e0;
          }
          uVar22 = (uint)uVar14 + 1;
          uVar14 = (ulonglong)uVar22;
        } while ((int)uVar22 < (int)uVar32);
      }
      piVar17 = piStack_98;
      if ((float)(int)puVar18[0x26] * fVar9 <= (float)(int)puVar18[0x28]) {
        FUN_7ff70c7e97a0(param_1,*(undefined4 *)(*(longlong *)(param_1 + 0x38) + 0x1c),
                         *(undefined4 *)(*(longlong *)(param_1 + 0x38) + 0x20));
        piVar17 = piStack_98;
      }
      else {
        iVar15 = *(int *)(*(longlong *)(param_1 + 0x38) + 0x1c);
        iVar23 = *(int *)(*(longlong *)(param_1 + 0x38) + 0x20);
        iVar21 = iVar15 << (iVar15 < iVar23);
        iVar31 = iVar23 << (iVar23 <= iVar15);
        iVar38 = *(int *)(param_1 + 8) + -1;
        uVar32 = *(int *)(*(longlong *)(param_1 + 0x2b0) + 0xa8) + iVar38;
        uVar32 = (int)uVar32 >> 1 | uVar32;
        uVar32 = (int)uVar32 >> 2 | uVar32;
        uVar32 = (int)uVar32 >> 4 | uVar32;
        uVar32 = (int)uVar32 >> 8 | uVar32;
        iVar11 = ((int)uVar32 >> 0x10 | uVar32) + 1;
        if (iVar11 < iVar21) {
          iVar11 = iVar21;
        }
        uVar32 = iVar38 + *(int *)(*(longlong *)(param_1 + 0x2b0) + 0xac);
        uVar32 = (int)uVar32 >> 1 | uVar32;
        uVar32 = (int)uVar32 >> 2 | uVar32;
        uVar32 = (int)uVar32 >> 4 | uVar32;
        uVar32 = (int)uVar32 >> 8 | uVar32;
        iVar38 = ((int)uVar32 >> 0x10 | uVar32) + 1;
        if (iVar38 < iVar31) {
          iVar38 = iVar31;
        }
        iVar31 = *(int *)(param_1 + 0x14);
        if (iVar11 < *(int *)(param_1 + 0x14)) {
          iVar31 = iVar11;
        }
        if (iVar11 < *(int *)(param_1 + 0xc)) {
          iVar31 = *(int *)(param_1 + 0xc);
        }
        iVar11 = *(int *)(param_1 + 0x18);
        if (iVar38 < *(int *)(param_1 + 0x18)) {
          iVar11 = iVar38;
        }
        if (iVar38 < *(int *)(param_1 + 0x10)) {
          iVar11 = *(int *)(param_1 + 0x10);
        }
        if ((iVar31 != iVar15) || (iVar11 != iVar23)) {
          FUN_7ff70c7e97a0(param_1);
        }
      }
    } while( true );
  }
  iVar15 = (int)(param_2 & 0xffff) + (uint)uVar24 + uVar32;
  if (iVar15 < piStack_98[0x2c]) {
    iVar15 = piStack_98[0x2c];
  }
  iVar23 = piStack_98[0x18];
  piStack_98[0x2c] = iVar15;
  iVar15 = (uVar22 & 0xffff) + ((uint)param_3 & 0xffff) + uVar32;
  if (iVar15 < piStack_98[0x2d]) {
    iVar15 = piStack_98[0x2d];
  }
  piStack_98[0x2d] = iVar15;
  *(ulonglong *)(piStack_98 + 0x25) =
       CONCAT44(uVar30 * uVar34 + (int)((ulonglong)*(undefined8 *)(piStack_98 + 0x25) >> 0x20),
                (int)_DAT_7ff70cb1c5e0 + (int)*(undefined8 *)(piStack_98 + 0x25));
  if (iVar23 == piStack_98[0x19]) {
    if (iVar23 == 0) {
      iVar15 = 8;
    }
    else {
      iVar15 = iVar23 / 2 + iVar23;
    }
    iVar11 = iVar23 + 1;
    if (iVar23 + 1 < iVar15) {
      iVar11 = iVar15;
    }
    lVar13 = FUN_7ff70c802100((longlong)iVar11 << 3);
    piVar17 = piStack_98;
    if (*(longlong *)(piStack_98 + 0x1a) != 0) {
      FUN_7ff70cb12b60(lVar13,*(longlong *)(piStack_98 + 0x1a),(longlong)piStack_98[0x18] << 3);
      FUN_7ff70c802510(*(undefined8 *)(piVar17 + 0x1a));
    }
    *(longlong *)(piVar17 + 0x1a) = lVar13;
    piVar17[0x19] = iVar11;
    iVar23 = piVar17[0x18];
  }
  else {
    lVar13 = *(longlong *)(piStack_98 + 0x1a);
    piVar17 = piStack_98;
  }
  *(ulonglong *)(lVar13 + (longlong)iVar23 * 8) =
       (ulonglong)uVar24 |
       (ulonglong)(uVar22 << 0x10) | (param_2 & 0xffff) << 0x20 | param_3 << 0x30;
  uVar32 = piVar17[0x18];
  piVar17[0x18] = uVar32 + 1;
  lVar13 = *(longlong *)(param_1 + 0x2b0);
  if (puStack_70 == (uint *)0x0) {
    uVar22 = *(uint *)(lVar13 + 0x90);
    lVar28 = (longlong)(int)uVar22;
    if (lVar28 < 0) {
      uVar22 = *(uint *)(lVar13 + 0x70);
      iVar15 = *(int *)(lVar13 + 0x74);
      iVar23 = uVar22 + 1;
      if ((int)uVar22 < iVar15) {
        lVar28 = *(longlong *)(lVar13 + 0x78);
      }
      else {
        if (iVar15 == 0) {
          iVar15 = 8;
        }
        else {
          iVar15 = iVar15 / 2 + iVar15;
        }
        if (iVar15 <= iVar23) {
          iVar15 = iVar23;
        }
        lVar28 = FUN_7ff70c802100((longlong)iVar15 << 2);
        if (*(longlong *)(lVar13 + 0x78) != 0) {
          FUN_7ff70cb12b60(lVar28,*(longlong *)(lVar13 + 0x78),
                           (longlong)*(int *)(lVar13 + 0x70) << 2);
          FUN_7ff70c802510(*(undefined8 *)(lVar13 + 0x78));
        }
        *(longlong *)(lVar13 + 0x78) = lVar28;
        *(int *)(lVar13 + 0x74) = iVar15;
      }
      *(int *)(lVar13 + 0x70) = iVar23;
      piVar17 = (int *)(lVar28 + (longlong)(int)uVar22 * 4);
      *(undefined4 *)(lVar28 + (longlong)(int)uVar22 * 4) = 0;
      uVar34 = 0;
    }
    else {
      lVar16 = *(longlong *)(lVar13 + 0x78);
      piVar17 = (int *)(lVar16 + lVar28 * 4);
      *(int *)(lVar13 + 0x90) = (*(int *)(lVar16 + lVar28 * 4) << 0xc) >> 0xc;
      uVar34 = *(uint *)(lVar16 + lVar28 * 4);
    }
    *piVar17 = (uVar34 & 0xbff00000) + (uVar32 & 0xfffff) + 0x40000000;
    uVar14 = (ulonglong)((int)(uVar34 << 2) >> 2 & 0xfff00000U | uVar22);
  }
  else {
    uVar32 = *puStack_70;
    *puStack_70 = uVar32 & 0xfff00000 | *(int *)(lVar13 + 0x60) - 1U & 0xfffff;
    uVar14 = (ulonglong)
             ((int)(uVar32 << 2) >> 2 & 0xfff00000U |
             (uint)((ulonglong)
                    ((longlong)puStack_70 - *(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x78)) >>
                   2));
  }
LAB_7ff70c7da011:
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_118)) {
    return uVar14;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_118);
  pcVar7 = (code *)swi(3);
  uVar14 = (*pcVar7)();
  return uVar14;
LAB_7ff70c7d9e2a:
  uVar14 = 0xffffffff;
  if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
    FUN_7ff70c800cf0(&UNK_7ff70cb91711,uStack_90,uStack_cc);
    uVar14 = 0xffffffff;
  }
  goto LAB_7ff70c7da011;
}


