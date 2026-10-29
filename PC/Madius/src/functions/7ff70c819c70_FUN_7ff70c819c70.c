/* 7ff70c819c70 FUN_7ff70c819c70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c819c70(longlong param_1,ulonglong param_2)

{
  int *piVar1;
  short *psVar2;
  code *pcVar3;
  bool bVar4;
  bool bVar5;
  undefined1 uVar6;
  longlong lVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  short sVar10;
  longlong *plVar11;
  longlong lVar12;
  undefined *puVar13;
  longlong *plVar14;
  uint uVar15;
  ulonglong uVar16;
  int iVar17;
  longlong lVar18;
  longlong lVar19;
  longlong *plVar20;
  ulonglong uVar21;
  longlong lVar22;
  int iVar23;
  longlong lVar24;
  longlong lVar25;
  undefined1 auStack_68 [32];
  undefined *puStack_48;
  ulonglong uStack_40;
  
  lVar25 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  if ((((param_2 & 2) != 0) && (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) != param_1)) &&
     (0 < (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f50))) {
    lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58);
    lVar18 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f50) * 0x38;
    if (param_1 == 0) {
      lVar22 = 0;
      do {
        lVar12 = *(longlong *)(lVar7 + 8 + lVar22);
        if (((lVar12 != 0) && ((*(byte *)(lVar12 + 0x17) & 8) != 0)) &&
           ((*(char *)(lVar12 + 0xcc) != '\0' || (*(char *)(lVar12 + 0xcd) != '\0'))))
        goto LAB_7ff70c819d21;
        lVar22 = lVar22 + 0x38;
      } while (lVar18 - lVar22 != 0);
    }
    else {
      lVar18 = lVar18 + lVar7;
      do {
        lVar12 = *(longlong *)(lVar7 + 8);
        if (((lVar12 != 0) && ((*(byte *)(lVar12 + 0x17) & 8) != 0)) &&
           (((*(char *)(lVar12 + 0xcc) != '\0' || (*(char *)(lVar12 + 0xcd) == '\x01')) &&
            (lVar22 = param_1, *(longlong *)(param_1 + 0x3c0) != lVar12)))) {
          while (lVar22 != lVar12) {
            plVar20 = (longlong *)(lVar22 + 0x3b8);
            lVar22 = *plVar20;
            if (*plVar20 == 0) goto LAB_7ff70c819d21;
          }
        }
        lVar7 = lVar7 + 0x38;
      } while (lVar7 != lVar18);
    }
  }
  if (((param_1 == 0 || (param_2 & 1) == 0) || (lVar7 = *(longlong *)(param_1 + 1000), lVar7 == 0))
     || (*(char *)(lVar7 + 0xcd) == '\0')) {
    lVar7 = param_1;
  }
  if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == lVar7) {
joined_r0x7ff70c81a5a0:
    if (lVar7 == 0) goto LAB_7ff70c81a8ce;
LAB_7ff70c81a5a6:
    lVar18 = *(longlong *)(lVar7 + 0x3c0);
    bVar5 = false;
    bVar4 = false;
    iVar17 = *(int *)(lVar25 + 0x14b4);
    lVar22 = _DAT_7ff70cc1a3c0;
  }
  else {
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 4) != 0) {
      if (lVar7 == 0) {
        puVar13 = &UNK_7ff70cb8ae59;
      }
      else {
        puVar13 = *(undefined **)(lVar7 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb91b12,puVar13);
    }
    lVar18 = _DAT_7ff70cc1a3c0;
    *(longlong *)(lVar25 + 0x1f98) = lVar7;
    *(undefined8 *)(lVar25 + 0x1fe0) = 0xffffffffffffffff;
    *(undefined2 *)(lVar25 + 0x2028) = 0;
    *(undefined1 *)(lVar25 + 0x1fea) = 0;
    uVar6 = 1;
    if (*(char *)(lVar18 + 0x2029) == '\0') {
      uVar6 = *(undefined1 *)(lVar18 + 0x1fea);
    }
    *(undefined1 *)(lVar18 + 0x1fe9) = uVar6;
    if (lVar7 != 0) {
      if (*(char *)(lVar25 + 0x1f91) == '\x01') {
        *(undefined1 *)(lVar25 + 0x1f92) = 1;
      }
      *(undefined4 *)(lVar25 + 0x1f94) = *(undefined4 *)(lVar7 + 0x3f0);
      *(undefined4 *)(lVar25 + 0x1fa4) = 0;
      FUN_7ff70c83e1d0(*(undefined4 *)(lVar7 + 0x428));
      *(undefined1 *)(lVar25 + 0x1f93) = 0;
      *(undefined8 *)(lVar25 + 0x1fe0) = 0xffffffffffffffff;
      uVar15 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1f50);
      uVar8 = (ulonglong)uVar15;
      if (uVar8 != 0) {
        if ((int)uVar15 < 1) {
          uVar16 = 0;
LAB_7ff70c819f82:
          iVar17 = (int)uVar16;
          if (iVar17 < (int)uVar15) {
            lVar18 = _DAT_7ff70cc1a3c0;
            if (((((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0) &&
                 (FUN_7ff70c800cf0(&UNK_7ff70cb91b5a,*(undefined8 *)(lVar7 + 8)),
                 lVar18 = _DAT_7ff70cc1a3c0, (*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0)) &&
                (FUN_7ff70c800cf0(&UNK_7ff70cb912ce,uVar16 & 0xffffffff,0),
                (*(byte *)(lVar18 + 0x27b4) & 8) != 0)) &&
               (iVar23 = *(int *)(lVar18 + 0x1f50), iVar17 < iVar23)) {
              lVar22 = (uVar16 & 0xffffffff) * 0x38 + 8;
              uVar8 = uVar16 & 0xffffffff;
              do {
                if ((*(byte *)(lVar18 + 0x27b4) & 8) != 0) {
                  lVar12 = *(longlong *)(*(longlong *)(lVar18 + 0x1f58) + lVar22);
                  if (lVar12 == 0) {
                    uVar9 = 0;
                  }
                  else {
                    uVar9 = *(undefined8 *)(lVar12 + 8);
                  }
                  FUN_7ff70c800cf0(&UNK_7ff70cb91e00,
                                   *(undefined4 *)(*(longlong *)(lVar18 + 0x1f58) + -8 + lVar22),
                                   uVar9);
                  iVar23 = *(int *)(lVar18 + 0x1f50);
                }
                lVar22 = lVar22 + 0x38;
                uVar15 = (int)uVar8 + 1;
                uVar8 = (ulonglong)uVar15;
              } while ((int)uVar15 < iVar23);
            }
            iVar23 = *(int *)(lVar18 + 0x1f54);
            if (iVar23 < iVar17) {
              if (iVar23 == 0) {
                uVar15 = 8;
              }
              else {
                uVar15 = iVar23 / 2 + iVar23;
              }
              uVar8 = (ulonglong)uVar15;
              if ((int)uVar15 <= iVar17) {
                uVar8 = uVar16 & 0xffffffff;
              }
              uVar9 = (*_DAT_7ff70cbe9460)(uVar8 * 0x38,_DAT_7ff70cc1a3d0);
              lVar22 = _DAT_7ff70cc1a3c0;
              if (_DAT_7ff70cc1a3c0 != 0) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
                  sVar10 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
                }
                else {
                  iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
                  lVar12 = (longlong)iVar23;
                  *(int *)(lVar22 + 0x2874 + lVar12 * 8) = *piVar1;
                  *(undefined4 *)(lVar22 + 0x2878 + lVar12 * 8) = 0;
                  sVar10 = 1;
                }
                *(short *)(lVar22 + 0x2878 + lVar12 * 8) = sVar10;
                *(int *)(lVar22 + 0x2868) = *(int *)(lVar22 + 0x2868) + 1;
              }
              if (*(longlong *)(lVar18 + 0x1f58) != 0) {
                FUN_7ff70cb12b60(uVar9,*(longlong *)(lVar18 + 0x1f58),
                                 (longlong)*(int *)(lVar18 + 0x1f50) * 0x38);
                lVar12 = _DAT_7ff70cc1a3c0;
                lVar22 = *(longlong *)(lVar18 + 0x1f58);
                if ((lVar22 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                  piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                  lVar19 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar19 * 8) == *piVar1) {
                    sVar10 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar19 * 8) + 1;
                  }
                  else {
                    iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                    *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
                    lVar19 = (longlong)iVar23;
                    *(int *)(lVar12 + 0x2874 + lVar19 * 8) = *piVar1;
                    *(undefined4 *)(lVar12 + 0x2878 + lVar19 * 8) = 0;
                    sVar10 = 1;
                  }
                  *(short *)(lVar12 + 0x287a + lVar19 * 8) = sVar10;
                  *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
                }
                (*_DAT_7ff70cbe9468)(lVar22,_DAT_7ff70cc1a3d0);
              }
              *(undefined8 *)(lVar18 + 0x1f58) = uVar9;
              *(int *)(lVar18 + 0x1f54) = (int)uVar8;
            }
            *(int *)(lVar18 + 0x1f50) = iVar17;
          }
        }
        else {
          uVar16 = 0;
          do {
            uVar21 = uVar16;
            if (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + 8 + uVar16 * 0x38) != 0) {
              do {
                lVar18 = *(longlong *)
                          (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + 8 + uVar21 * 0x38);
                if (lVar18 != 0) {
                  lVar22 = lVar7;
                  if (*(longlong *)(lVar7 + 0x3c0) == lVar18) break;
                  do {
                    if (lVar22 == lVar18) goto LAB_7ff70c819ea0;
                    plVar20 = (longlong *)(lVar22 + 0x3b8);
                    lVar22 = *plVar20;
                  } while (*plVar20 != 0);
                }
                uVar21 = uVar21 + 1;
                if (uVar21 == uVar8) goto LAB_7ff70c819f82;
              } while( true );
            }
LAB_7ff70c819ea0:
            uVar16 = uVar16 + 1;
          } while (uVar16 != uVar8);
        }
        goto joined_r0x7ff70c81a5a0;
      }
      goto LAB_7ff70c81a5a6;
    }
    *(undefined4 *)(lVar25 + 0x1f94) = 0;
    *(undefined4 *)(lVar25 + 0x1fa4) = 0;
    *(undefined4 *)(lVar18 + 0x1fa0) = 0;
    lVar22 = lVar18;
    if (*(int *)(lVar18 + 0x1fbc) < 0) {
      uVar9 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
      lVar22 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
          sVar10 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
        }
        else {
          iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
          lVar12 = (longlong)iVar17;
          *(int *)(lVar22 + 0x2874 + lVar12 * 8) = *piVar1;
          *(undefined4 *)(lVar22 + 0x2878 + lVar12 * 8) = 0;
          sVar10 = 1;
        }
        *(short *)(lVar22 + 0x2878 + lVar12 * 8) = sVar10;
        *(int *)(lVar22 + 0x2868) = *(int *)(lVar22 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar18 + 0x1fc0) != 0) {
        FUN_7ff70cb12b60(uVar9,*(longlong *)(lVar18 + 0x1fc0),
                         (longlong)*(int *)(lVar18 + 0x1fb8) << 3);
        lVar12 = _DAT_7ff70cc1a3c0;
        lVar22 = *(longlong *)(lVar18 + 0x1fc0);
        if ((lVar22 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar19 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar19 * 8) == *piVar1) {
            sVar10 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar19 * 8) + 1;
          }
          else {
            iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
            lVar19 = (longlong)iVar17;
            *(int *)(lVar12 + 0x2874 + lVar19 * 8) = *piVar1;
            *(undefined4 *)(lVar12 + 0x2878 + lVar19 * 8) = 0;
            sVar10 = 1;
          }
          *(short *)(lVar12 + 0x287a + lVar19 * 8) = sVar10;
          *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar22,_DAT_7ff70cc1a3d0);
      }
      *(undefined8 *)(lVar18 + 0x1fc0) = uVar9;
      *(undefined4 *)(lVar18 + 0x1fbc) = 0;
      lVar22 = _DAT_7ff70cc1a3c0;
    }
    *(undefined4 *)(lVar18 + 0x1fb8) = 0;
    *(undefined1 *)(lVar25 + 0x1f93) = 0;
    *(undefined8 *)(lVar25 + 0x1fe0) = 0xffffffffffffffff;
    if (0 < *(int *)(lVar22 + 0x1f50)) {
      if (((((*(byte *)(lVar22 + 0x27b4) & 8) != 0) &&
           (FUN_7ff70c800cf0(&UNK_7ff70cb91b5a,&UNK_7ff70cb8ae59), lVar22 = _DAT_7ff70cc1a3c0,
           (*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0)) &&
          (FUN_7ff70c800cf0(&UNK_7ff70cb912ce,0,0), (*(byte *)(lVar22 + 0x27b4) & 8) != 0)) &&
         (iVar17 = *(int *)(lVar22 + 0x1f50), 0 < iVar17)) {
        lVar12 = 8;
        lVar18 = 0;
        do {
          if ((*(byte *)(lVar22 + 0x27b4) & 8) != 0) {
            lVar19 = *(longlong *)(*(longlong *)(lVar22 + 0x1f58) + lVar12);
            if (lVar19 == 0) {
              uVar9 = 0;
            }
            else {
              uVar9 = *(undefined8 *)(lVar19 + 8);
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb91e00,
                             *(undefined4 *)(*(longlong *)(lVar22 + 0x1f58) + -8 + lVar12),uVar9);
            iVar17 = *(int *)(lVar22 + 0x1f50);
          }
          lVar18 = lVar18 + 1;
          lVar12 = lVar12 + 0x38;
        } while (lVar18 < iVar17);
      }
      if (*(int *)(lVar22 + 0x1f54) < 0) {
        uVar9 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
        lVar18 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
            sVar10 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
          }
          else {
            iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
            lVar12 = (longlong)iVar17;
            *(int *)(lVar18 + 0x2874 + lVar12 * 8) = *piVar1;
            *(undefined4 *)(lVar18 + 0x2878 + lVar12 * 8) = 0;
            sVar10 = 1;
          }
          *(short *)(lVar18 + 0x2878 + lVar12 * 8) = sVar10;
          *(int *)(lVar18 + 0x2868) = *(int *)(lVar18 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar22 + 0x1f58) != 0) {
          FUN_7ff70cb12b60(uVar9,*(longlong *)(lVar22 + 0x1f58),
                           (longlong)*(int *)(lVar22 + 0x1f50) * 0x38);
          lVar12 = _DAT_7ff70cc1a3c0;
          lVar18 = *(longlong *)(lVar22 + 0x1f58);
          if ((lVar18 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar19 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar19 * 8) == *piVar1) {
              sVar10 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar19 * 8) + 1;
            }
            else {
              iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
              lVar19 = (longlong)iVar17;
              *(int *)(lVar12 + 0x2874 + lVar19 * 8) = *piVar1;
              *(undefined4 *)(lVar12 + 0x2878 + lVar19 * 8) = 0;
              sVar10 = 1;
            }
            *(short *)(lVar12 + 0x287a + lVar19 * 8) = sVar10;
            *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar18,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(lVar22 + 0x1f58) = uVar9;
        *(undefined4 *)(lVar22 + 0x1f54) = 0;
      }
      *(undefined4 *)(lVar22 + 0x1f50) = 0;
      goto joined_r0x7ff70c81a5a0;
    }
LAB_7ff70c81a8ce:
    bVar5 = true;
    bVar4 = true;
    lVar18 = 0;
    iVar17 = *(int *)(lVar25 + 0x14b4);
    lVar22 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar22;
  if (((iVar17 != 0) && (bVar4 = bVar5, *(longlong *)(lVar25 + 0x14d8) != 0)) &&
     ((*(longlong *)(*(longlong *)(lVar25 + 0x14d8) + 0x3c0) != lVar18 &&
      (*(char *)(lVar25 + 0x14c2) == '\0')))) {
    iVar17 = *(int *)(lVar22 + 0x14b4);
    if (iVar17 == 0) {
      *(undefined1 *)(lVar22 + 0x14c0) = 0;
    }
    else {
      if ((*(longlong *)(lVar22 + 0x1460) != 0) &&
         (iVar17 == *(int *)(*(longlong *)(lVar22 + 0x1460) + 0x8c))) {
        if ((*(byte *)(lVar22 + 0x27b4) & 2) != 0) {
          FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
          iVar17 = *(int *)(lVar22 + 0x14b4);
        }
        *(undefined8 *)(lVar22 + 0x1460) = 0;
      }
      *(int *)(lVar22 + 0x14e8) = iVar17;
      *(uint *)(lVar22 + 0x14ec) =
           (uint)(*(int *)(lVar22 + 0x1e20) != iVar17) + *(int *)(lVar22 + 5000);
      *(undefined1 *)(lVar22 + 0x14f0) = *(undefined1 *)(lVar22 + 0x14c4);
      *(bool *)(lVar22 + 0x14f1) = *(int *)(lVar22 + 0x14b8) == iVar17;
      if (*(int *)(lVar22 + 0x241c) == iVar17) {
        FUN_7ff70c8934e0(iVar17);
        iVar17 = *(int *)(lVar22 + 0x14b4);
      }
      *(bool *)(lVar22 + 0x14c0) = iVar17 != 0;
      if (iVar17 != 0) {
        if ((*(byte *)(lVar22 + 0x27b4) & 2) != 0) {
          puVar13 = &UNK_7ff70cb923a7;
          if (*(longlong *)(lVar22 + 0x14d8) != 0) {
            puVar13 = *(undefined **)(*(longlong *)(lVar22 + 0x14d8) + 8);
          }
          puStack_48 = &UNK_7ff70cb923a7;
          FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar17,puVar13,0);
        }
        *(undefined4 *)(lVar22 + 0x14bc) = 0;
        *(undefined2 *)(lVar22 + 0x14c3) = 0;
        *(undefined1 *)(lVar22 + 0x14c8) = 0xff;
      }
    }
    *(undefined4 *)(lVar22 + 0x14b4) = 0;
    *(undefined2 *)(lVar22 + 0x14c1) = 0;
    *(undefined8 *)(lVar22 + 0x14d8) = 0;
    *(undefined2 *)(lVar22 + 0x14c5) = 0;
    *(undefined4 *)(lVar22 + 0x1dd0) = 0;
    *(undefined1 *)(lVar22 + 0x1dd4) = 0;
  }
  lVar25 = _DAT_7ff70cc1a3c0;
  if (!bVar4) {
    lVar22 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
    if (*(longlong *)(lVar22 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar18) {
      iVar23 = (int)*(short *)(lVar18 + 0xe2);
      lVar19 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
      iVar17 = (int)lVar19;
      lVar12 = lVar19;
      if (iVar17 - iVar23 != 0 && iVar23 <= iVar17) {
        lVar24 = (longlong)iVar23;
        lVar12 = (longlong)iVar17;
        lVar22 = lVar24;
        if ((iVar17 - iVar23 & 1U) != 0) {
          lVar22 = lVar24 + 1;
          *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar24 * 8) =
               *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar24 * 8);
          psVar2 = (short *)(*(longlong *)(*(longlong *)(lVar25 + 0x13f8) + lVar24 * 8) + 0xe2);
          *psVar2 = *psVar2 + -1;
        }
        if (lVar12 + -1 != lVar24) {
          do {
            *(undefined8 *)(*(longlong *)(lVar25 + 0x13f8) + lVar22 * 8) =
                 *(undefined8 *)(*(longlong *)(lVar25 + 0x13f8) + 8 + lVar22 * 8);
            psVar2 = (short *)(*(longlong *)(*(longlong *)(lVar25 + 0x13f8) + lVar22 * 8) + 0xe2);
            *psVar2 = *psVar2 + -1;
            *(undefined8 *)(*(longlong *)(lVar25 + 0x13f8) + 8 + lVar22 * 8) =
                 *(undefined8 *)(*(longlong *)(lVar25 + 0x13f8) + 0x10 + lVar22 * 8);
            psVar2 = (short *)(*(longlong *)(*(longlong *)(lVar25 + 0x13f8) + 8 + lVar22 * 8) + 0xe2
                              );
            *psVar2 = *psVar2 + -1;
            lVar22 = lVar22 + 2;
          } while (lVar12 != lVar22);
        }
        lVar22 = *(longlong *)(lVar25 + 0x13f8);
      }
      *(longlong *)(lVar22 + lVar12 * 8) = lVar18;
      *(short *)(lVar18 + 0xe2) = (short)lVar19;
    }
    lVar25 = _DAT_7ff70cc1a3c0;
    if (((*(uint *)(lVar18 + 0x14) | *(uint *)(lVar7 + 0x14)) & 0x2000) == 0) {
      lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar17 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar22 = *(longlong *)(lVar7 + -8 + (longlong)iVar17 * 8);
      if (((lVar22 != lVar18) && (1 < iVar17)) && (*(longlong *)(lVar22 + 0x3c0) != lVar18)) {
        uVar8 = (ulonglong)(iVar17 - 1);
        iVar17 = 1;
        do {
          uVar15 = (int)uVar8 - 1;
          uVar8 = (ulonglong)uVar15;
          if (*(longlong *)(lVar7 + uVar8 * 8) == lVar18) {
            FUN_7ff70cb12b70(lVar7 + uVar8 * 8,lVar7 + uVar8 * 8 + 8,(longlong)iVar17 << 3);
            *(longlong *)
             (*(longlong *)(lVar25 + 0x13e8) + -8 + (longlong)*(int *)(lVar25 + 0x13e0) * 8) =
                 lVar18;
            break;
          }
          iVar17 = iVar17 + 1;
        } while (0 < (int)uVar15);
      }
    }
  }
LAB_7ff70c81ad12:
  if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
LAB_7ff70c819d21:
  if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 4) != 0) {
    if (param_1 == 0) {
      puVar13 = &UNK_7ff70cb8ae59;
    }
    else {
      puVar13 = *(undefined **)(param_1 + 8);
    }
    FUN_7ff70c800cf0(&UNK_7ff70cb917fb,puVar13,*(undefined8 *)(lVar12 + 8));
  }
  lVar25 = _DAT_7ff70cc1a3c0;
  if (((param_1 != 0) && (lVar7 = *(longlong *)(param_1 + 0x3c0), param_1 == lVar7)) &&
     ((*(byte *)(param_1 + 0x15) & 0x20) == 0)) {
    plVar20 = *(longlong **)(_DAT_7ff70cc1a3c0 + 0x13e8);
    plVar14 = plVar20;
    if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13e0) < 1) {
      uVar15 = 0;
    }
    else {
      plVar11 = plVar20;
      do {
        if (*plVar11 == param_1) break;
        plVar11 = plVar11 + 1;
      } while (plVar11 < plVar20 + *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0));
      uVar15 = (uint)((ulonglong)((longlong)plVar11 - (longlong)plVar20) >> 3);
      do {
        if (*plVar14 == *(longlong *)(lVar12 + 0x3c0)) break;
        plVar14 = plVar14 + 1;
      } while (plVar14 < plVar20 + *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0));
    }
    iVar17 = (int)((ulonglong)((longlong)plVar14 - (longlong)plVar20) >> 3);
    if ((int)uVar15 < iVar17) {
      FUN_7ff70cb12b70(plVar20 + (int)uVar15,plVar20 + (longlong)(int)uVar15 + 1,
                       (longlong)(int)(~uVar15 + iVar17) << 3);
      *(longlong *)
       (*(longlong *)(lVar25 + 0x13e8) +
       (((longlong)plVar14 - (longlong)plVar20) * 0x20000000 + -0x100000000 >> 0x20) * 8) = lVar7;
    }
    else {
      lVar18 = (longlong)iVar17;
      FUN_7ff70cb12b70(plVar20 + lVar18 + 1,plVar20 + lVar18,(ulonglong)(uVar15 - iVar17) << 3);
      *(longlong *)(*(longlong *)(lVar25 + 0x13e8) + lVar18 * 8) = lVar7;
    }
  }
  iVar17 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f50);
  uVar8 = (ulonglong)iVar17;
  if (0 < (longlong)uVar8) {
    uVar16 = uVar8 + 1;
    plVar20 = (longlong *)(uVar8 * 0x38 + *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + -0x30);
    do {
      lVar25 = *plVar20;
      if ((lVar25 != 0) && ((*(byte *)(lVar25 + 0x17) & 8) != 0)) goto LAB_7ff70c81a68f;
      uVar16 = uVar16 - 1;
      plVar20 = plVar20 + -7;
    } while (1 < uVar16);
  }
  lVar25 = 0;
LAB_7ff70c81a68f:
  if (iVar17 != 0) {
    uVar16 = 0;
    if ((lVar25 == 0) || (iVar17 < 1)) {
LAB_7ff70c81a713:
      iVar23 = (int)uVar16;
      if (iVar23 < iVar17) {
        lVar7 = _DAT_7ff70cc1a3c0;
        if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0) {
          if (lVar25 == 0) {
            puVar13 = &UNK_7ff70cb8ae59;
          }
          else {
            puVar13 = *(undefined **)(lVar25 + 8);
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb91b5a,puVar13);
          lVar7 = _DAT_7ff70cc1a3c0;
          if ((((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0) &&
              (FUN_7ff70c800cf0(&UNK_7ff70cb912ce,uVar16 & 0xffffffff,0),
              (*(byte *)(lVar7 + 0x27b4) & 8) != 0)) &&
             (iVar17 = *(int *)(lVar7 + 0x1f50), iVar23 < iVar17)) {
            lVar25 = (uVar16 & 0xffffffff) * 0x38 + 8;
            uVar8 = uVar16 & 0xffffffff;
            do {
              if ((*(byte *)(lVar7 + 0x27b4) & 8) != 0) {
                lVar18 = *(longlong *)(*(longlong *)(lVar7 + 0x1f58) + lVar25);
                if (lVar18 == 0) {
                  uVar9 = 0;
                }
                else {
                  uVar9 = *(undefined8 *)(lVar18 + 8);
                }
                FUN_7ff70c800cf0(&UNK_7ff70cb91e00,
                                 *(undefined4 *)(*(longlong *)(lVar7 + 0x1f58) + -8 + lVar25),uVar9)
                ;
                iVar17 = *(int *)(lVar7 + 0x1f50);
              }
              lVar25 = lVar25 + 0x38;
              uVar15 = (int)uVar8 + 1;
              uVar8 = (ulonglong)uVar15;
            } while ((int)uVar15 < iVar17);
          }
        }
        iVar17 = *(int *)(lVar7 + 0x1f54);
        if (iVar17 < iVar23) {
          if (iVar17 == 0) {
            uVar15 = 8;
          }
          else {
            uVar15 = iVar17 / 2 + iVar17;
          }
          uVar8 = (ulonglong)uVar15;
          if ((int)uVar15 <= iVar23) {
            uVar8 = uVar16 & 0xffffffff;
          }
          uVar9 = (*_DAT_7ff70cbe9460)(uVar8 * 0x38,_DAT_7ff70cc1a3d0);
          lVar25 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar18 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar18 * 8) == *piVar1) {
              sVar10 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar18 * 8) + 1;
            }
            else {
              iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
              lVar18 = (longlong)iVar17;
              *(int *)(lVar25 + 0x2874 + lVar18 * 8) = *piVar1;
              *(undefined4 *)(lVar25 + 0x2878 + lVar18 * 8) = 0;
              sVar10 = 1;
            }
            *(short *)(lVar25 + 0x2878 + lVar18 * 8) = sVar10;
            *(int *)(lVar25 + 0x2868) = *(int *)(lVar25 + 0x2868) + 1;
          }
          if (*(longlong *)(lVar7 + 0x1f58) != 0) {
            FUN_7ff70cb12b60(uVar9,*(longlong *)(lVar7 + 0x1f58),
                             (longlong)*(int *)(lVar7 + 0x1f50) * 0x38);
            lVar18 = _DAT_7ff70cc1a3c0;
            lVar25 = *(longlong *)(lVar7 + 0x1f58);
            if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar1) {
                sVar10 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar22 * 8) + 1;
              }
              else {
                iVar17 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar17;
                lVar22 = (longlong)iVar17;
                *(int *)(lVar18 + 0x2874 + lVar22 * 8) = *piVar1;
                *(undefined4 *)(lVar18 + 0x2878 + lVar22 * 8) = 0;
                sVar10 = 1;
              }
              *(short *)(lVar18 + 0x287a + lVar22 * 8) = sVar10;
              *(int *)(lVar18 + 0x286c) = *(int *)(lVar18 + 0x286c) + 1;
            }
            (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
          }
          *(undefined8 *)(lVar7 + 0x1f58) = uVar9;
          *(int *)(lVar7 + 0x1f54) = (int)uVar8;
        }
        *(int *)(lVar7 + 0x1f50) = iVar23;
      }
    }
    else {
      uVar16 = 0;
      do {
        uVar21 = uVar16;
        if (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + 8 + uVar16 * 0x38) != 0) {
          do {
            lVar7 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + 8 + uVar21 * 0x38);
            if (lVar7 != 0) {
              lVar18 = lVar25;
              if (*(longlong *)(lVar25 + 0x3c0) == lVar7) break;
              do {
                if (lVar18 == lVar7) goto LAB_7ff70c81a6b0;
                plVar20 = (longlong *)(lVar18 + 0x3b8);
                lVar18 = *plVar20;
              } while (*plVar20 != 0);
            }
            uVar21 = uVar21 + 1;
            if (uVar21 == uVar8) goto LAB_7ff70c81a713;
          } while( true );
        }
LAB_7ff70c81a6b0:
        uVar16 = uVar16 + 1;
      } while (uVar16 != uVar8);
    }
  }
  goto LAB_7ff70c81ad12;
}


