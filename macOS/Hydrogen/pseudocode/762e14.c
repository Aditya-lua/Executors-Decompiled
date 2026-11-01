
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00762e14(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  bool bVar1;
  ulong uVar2;
  byte bVar3;
  double dVar4;
  bool bVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  long in_x7;
  undefined1 uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  undefined1 uVar13;
  int iVar14;
  long lVar15;
  double dVar16;
  char *pcVar17;
  uint uVar18;
  long unaff_x19;
  ulong unaff_x20;
  int iVar19;
  int iVar20;
  char *pcVar21;
  char *unaff_x21;
  ulong uVar22;
  uint unaff_w22;
  uint uVar23;
  ulong unaff_x23;
  byte *pbVar24;
  undefined1 *puVar25;
  byte *pbVar26;
  undefined1 *puVar27;
  long lVar28;
  uint uVar29;
  uint uVar30;
  ulong unaff_x26;
  uint uVar31;
  long unaff_x27;
  long unaff_x29;
  long unaff_x30;
  double dVar32;
  undefined1 auVar33 [16];
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  char *pcStack_1a08;
  undefined8 uStack_19f8;
  undefined8 uStack_19f0;
  undefined8 uStack_19e8;
  undefined8 uStack_19e0;
  undefined8 uStack_19d8;
  byte bStack_19c8;
  byte abStack_19c7 [323];
  byte abStack_1884 [4];
  uint auStack_1880 [2];
  double adStack_1878 [255];
  uint auStack_1080 [4];
  long alStack_1070 [510];
  long lStack_80;
  
  if ((unaff_w22 >> 5 & 1) == 0) {
    lVar28 = unaff_x30 + unaff_x19 * 0x10;
    if ((unaff_w22 >> 4 & 1) == 0) {
      **(int **)(lVar28 + 8) = (int)unaff_x20;
    }
    else {
      **(undefined2 **)(lVar28 + 8) = (short)unaff_x20;
    }
  }
  else {
    **(long **)(unaff_x30 + unaff_x19 * 0x10 + 8) = (long)(int)unaff_x20;
  }
LAB_00762b38:
  unaff_x27 = unaff_x27 + 1;
  if (unaff_x27 < in_stack_00000058._4_4_) {
    lVar28 = in_x7 + unaff_x27 * 0x20;
    lVar15 = *(long *)(lVar28 + 0x18);
    if (lVar15 != 0) goto code_r0x00762b5c;
    goto code_r0x00762bac;
  }
  if (unaff_x23 != 0) {
code_r0x00763a4c:
    if (unaff_x26 == unaff_x23) {
      unaff_x21[-1] = '\0';
      unaff_x20 = (ulong)((int)unaff_x20 - 1);
    }
    else {
      *unaff_x21 = '\0';
    }
  }
LAB_00763a64:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return unaff_x20;
  }
  ___stack_chk_fail();
  auVar33 = (*(code *)PTR____chkstk_darwin_009b01d8)();
  auVar33._8_8_ = auVar33._8_8_;
  auVar33._0_8_ = auVar33._0_8_;
  lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_19f8 = 0;
  uVar7 = func_0x0076489c(param_3,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,&uStack_19f8,
                          param_4);
  if (((int)uVar7 == 0) && (0 < uStack_19f8._4_4_)) {
    lVar28 = 0;
    iVar14 = 0;
    pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
    do {
      lVar15 = alStack_1070[lVar28 * 4 + 1];
      uVar29 = auStack_1080[lVar28 * 8 + 2];
      if (lVar15 != 0) {
        pbVar24 = (byte *)alStack_1070[lVar28 * 4];
        iVar6 = iVar14 + (int)lVar15;
        do {
          uVar7 = (ulong)*pbVar24;
          if (*pbVar24 == 0) goto LAB_00763c2c;
          uVar7 = (*auVar33._8_8_)(uVar7,auVar33._0_8_);
          if ((int)uVar7 != 0) goto LAB_0076451c;
          pbVar24 = pbVar24 + 1;
          iVar14 = iVar14 + 1;
          lVar15 = lVar15 + -1;
        } while (lVar15 != 0);
        iVar14 = iVar6;
LAB_00763c2c:
        if ((uVar29 >> 0x14 & 1) == 0) goto LAB_00763c34;
        goto LAB_00763bd8;
      }
LAB_00763c34:
      uVar30 = auStack_1080[lVar28 * 8];
      uVar23 = uVar29;
      uVar31 = uVar30;
      if ((uVar29 >> 0xe & 1) == 0) {
joined_r0x00763da0:
        uVar11 = uVar29 >> 0x10;
        uVar29 = uVar23;
        if ((uVar11 & 1) == 0) goto LAB_00763c78;
LAB_00763c48:
        uVar23 = *(uint *)(adStack_1878 + (long)(int)auStack_1080[lVar28 * 8 + 1] * 2);
        if ((int)uVar23 < 0) {
          uVar23 = 0xffffffff;
        }
      }
      else {
        uVar31 = *(uint *)(adStack_1878 + (long)(int)uVar30 * 2);
        if ((int)uVar31 < 0) {
          uVar11 = 0x7fffffff;
          if (uVar31 != 0x80000000) {
            uVar11 = -uVar31;
          }
          uVar23 = uVar29 & 0xfffffeff | 4;
          uVar31 = uVar11;
          goto joined_r0x00763da0;
        }
        if ((uVar29 >> 0x10 & 1) != 0) goto LAB_00763c48;
LAB_00763c78:
        if ((uVar29 >> 0xf & 1) == 0) {
          uVar23 = 0xffffffff;
        }
        else {
          uVar23 = auStack_1080[lVar28 * 8 + 1];
        }
      }
      uVar22 = (ulong)auStack_1080[lVar28 * 8 + 3];
      iVar6 = (int)abStack_1884;
      uVar11 = uVar29;
      pbVar24 = abStack_1884;
      switch(auStack_1880[uVar22 * 4]) {
      case 0:
        pcVar17 = (char *)adStack_1878[uVar22 * 2];
        if ((byte *)pcVar17 == (byte *)0x0) {
          if (uVar23 != 0xffffffff && (int)uVar23 < 5) {
            uVar22 = 0;
            pcVar17 = "";
            goto code_r0x00764424;
          }
          uVar29 = uVar29 & 0xfffffff7;
          uVar22 = 5;
          iVar19 = 5;
          pcVar17 = "(nil)";
          iVar6 = uVar31 - 5;
joined_r0x00764308:
          bVar5 = true;
        }
        else {
          if (uVar23 == 0xffffffff) {
            if (*pcVar17 == 0) {
              uVar22 = 0;
            }
            else {
              uVar7 = _strlen(pcVar17);
              uVar22 = uVar7;
            }
          }
          else {
            uVar22 = (long)(int)uVar23;
          }
code_r0x00764424:
          uVar2 = uVar22;
          if (0x7ffffffe < uVar22) {
            uVar2 = 0x7fffffff;
          }
          iVar19 = (int)uVar2;
          if ((uVar29 >> 3 & 1) == 0) {
            iVar6 = uVar31 - iVar19;
            goto joined_r0x00764308;
          }
          uVar7 = (*auVar33._8_8_)(0x22,auVar33._0_8_);
          if ((int)uVar7 != 0) goto LAB_0076451c;
          bVar5 = false;
          iVar14 = iVar14 + 1;
          iVar6 = uVar31 - iVar19;
        }
        if ((uVar29 >> 2 & 1) == 0) {
          if (iVar6 < 1) {
            iVar6 = iVar6 + -1;
          }
          else {
            iVar14 = (uVar31 + iVar14) - iVar19;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar19 = iVar6 + -1;
              bVar1 = 0 < iVar6;
              iVar6 = iVar19;
            } while (iVar19 != 0 && bVar1);
            iVar6 = -1;
          }
        }
        if (uVar22 != 0) {
          iVar19 = iVar14 + (int)uVar22;
          do {
            uVar7 = (ulong)(byte)*pcVar17;
            if (*pcVar17 == 0) goto code_r0x007644cc;
            uVar7 = (*auVar33._8_8_)(uVar7,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            pcVar17 = pcVar17 + 1;
            iVar14 = iVar14 + 1;
            uVar22 = uVar22 - 1;
          } while (uVar22 != 0);
          iVar14 = iVar19;
        }
code_r0x007644cc:
        if (((uVar29 >> 2 & 1) != 0) && (0 < iVar6)) {
          iVar14 = iVar6 + iVar14;
          iVar6 = iVar6 + 1;
          do {
            uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            iVar6 = iVar6 + -1;
          } while (1 < iVar6);
        }
        if (!bVar5) {
          uVar7 = (*auVar33._8_8_)(0x22,auVar33._0_8_);
          if ((int)uVar7 != 0) goto LAB_0076451c;
          iVar14 = iVar14 + 1;
        }
        break;
      case 1:
        dVar32 = adStack_1878[uVar22 * 2];
        if (dVar32 != 0.0) {
          uVar12 = 0;
          pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
          if ((uVar29 & 0x1000) != 0) {
            pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          }
          uVar18 = 1;
          dVar16 = 7.90505033345994e-323;
          uVar30 = 1;
          goto LAB_00763f80;
        }
        iVar19 = uVar31 - 5;
        iVar6 = iVar19;
        if (((uVar29 >> 2 & 1) != 0) && (iVar6 = uVar31 - 6, 5 < (int)uVar31)) {
          iVar14 = iVar19 + iVar14;
          do {
            uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            iVar19 = iVar19 + -1;
          } while (0 < iVar19);
          iVar6 = -1;
        }
        uVar7 = (*auVar33._8_8_)(0x28,auVar33._0_8_);
        if (((((int)uVar7 == 0) && (uVar7 = (*auVar33._8_8_)(0x6e,auVar33._0_8_), (int)uVar7 == 0))
            && (uVar7 = (*auVar33._8_8_)(0x69,auVar33._0_8_), (int)uVar7 == 0)) &&
           ((uVar7 = (*auVar33._8_8_)(0x6c,auVar33._0_8_), (int)uVar7 == 0 &&
            (uVar7 = (*auVar33._8_8_)(0x29,auVar33._0_8_), (int)uVar7 == 0)))) {
          iVar14 = iVar14 + 5;
          if (((uVar29 >> 2 & 1) == 0) && (0 < iVar6)) {
            iVar14 = iVar14 + iVar6;
            iVar6 = iVar6 + 1;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar6 = iVar6 + -1;
            } while (1 < iVar6);
          }
          break;
        }
        goto LAB_0076451c;
      case 2:
        if (((uVar29 >> 6 & 1) == 0) && ((uVar29 >> 5 & 1) == 0)) {
          if ((uVar29 >> 4 & 1) == 0) {
            *(int *)adStack_1878[uVar22 * 2] = iVar14;
          }
          else {
            *(short *)adStack_1878[uVar22 * 2] = (short)iVar14;
          }
        }
        else {
          *(long *)adStack_1878[uVar22 * 2] = (long)iVar14;
        }
        break;
      case 3:
      case 4:
      case 5:
        goto code_r0x00763cc4;
      case 6:
      case 7:
      case 8:
        uVar11 = uVar29 | 0x200;
code_r0x00763cc4:
        dVar32 = adStack_1878[uVar22 * 2];
        if ((uVar11 >> 0x11 & 1) == 0) {
          if ((uVar11 >> 10 & 1) == 0) {
            if ((uVar11 >> 0xb & 1) != 0) {
              uVar12 = 0;
              pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
              if ((uVar11 & 0x1000) != 0) {
                pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
              }
              uVar30 = uVar29 >> 3 & 1;
              uVar18 = 1;
              dVar16 = 7.90505033345994e-323;
              uVar29 = uVar11;
              goto LAB_00763f80;
            }
            dVar16 = (double)-(long)dVar32;
            if (-1 < (long)dVar32) {
              dVar16 = dVar32;
            }
            uVar10 = 0;
            if (-1 >= (long)dVar32) {
              uVar10 = (uint)((uVar11 & 0x200) == 0);
            }
            if ((uVar11 & 0x200) != 0) {
              dVar16 = dVar32;
            }
            if (uVar23 == 0xffffffff) {
              uVar23 = 1;
            }
            if (dVar16 != 0.0) {
              pbVar26 = abStack_1884;
              do {
                pbVar24 = pbVar26 + -1;
                *pbVar26 = SUB81(dVar16,0) + (char)((ulong)dVar16 / 10) * -10 | 0x30;
                bVar5 = 9 < (ulong)dVar16;
                dVar16 = (double)((ulong)dVar16 / 10);
                pbVar26 = pbVar24;
              } while (bVar5);
            }
            uVar18 = 0;
            uVar30 = uVar29 >> 3 & 1;
            iVar6 = iVar6 - (int)pbVar24;
            iVar19 = uVar31 - iVar6;
            iVar6 = uVar23 - iVar6;
            uVar29 = uVar11;
code_r0x00763ff0:
            pbVar26 = pbVar24;
            if (0 < iVar6) {
              iVar19 = iVar19 - iVar6;
              if (&bStack_19c8 <= pbVar24) {
                uVar7 = (ulong)(((uVar23 - (int)&bStack_19c8) + (int)pbVar24) - 0x145);
                uVar22 = (long)pbVar24 - (long)&bStack_19c8;
                if (uVar7 <= uVar22) {
                  uVar22 = uVar7;
                }
                uVar7 = _memset((long)pbVar24 - uVar22,0x30,uVar22 + 1);
                pbVar26 = (byte *)(((long)pbVar24 - uVar22) + -1);
              }
            }
          }
          else {
            uVar18 = 0;
            uVar30 = uVar29 >> 3 & 1;
            uVar12 = 1;
            dVar16 = 3.95252516672997e-323;
            uVar29 = uVar11;
LAB_00763f80:
            if (uVar23 == 0xffffffff) {
              uVar23 = 1;
            }
            if (dVar32 != 0.0) {
              pbVar26 = abStack_1884;
              do {
                pbVar24 = pbVar26 + -1;
                *pbVar26 = pcStack_1a08[(ulong)dVar32 & (long)dVar16 - 1U];
                dVar4 = 0.0;
                if (dVar16 != 0.0) {
                  dVar4 = (double)((ulong)dVar32 / (ulong)dVar16);
                }
                bVar5 = (ulong)dVar16 <= (ulong)dVar32;
                dVar32 = dVar4;
                pbVar26 = pbVar24;
              } while (bVar5);
            }
            uVar10 = 0;
            iVar6 = iVar6 - (int)pbVar24;
            iVar19 = uVar31 - iVar6;
            iVar6 = uVar23 - iVar6;
            if (((uVar12 & uVar30) != 1) || (0 < iVar6)) goto code_r0x00763ff0;
            uVar10 = 0;
            pbVar26 = pbVar24 + -1;
            *pbVar24 = 0x30;
            iVar19 = iVar19 + -1;
          }
          iVar6 = iVar19 + -2;
          if ((uVar18 & uVar30) == 0) {
            iVar6 = iVar19;
          }
          uVar31 = uVar10;
          if ((uVar29 & 3) != 0) {
            uVar31 = 1;
          }
          iVar19 = iVar6 - uVar31;
          iVar20 = iVar19;
          if (((uVar29 & 0x104) == 0) && (iVar20 = iVar19 + -1, 0 < iVar19)) {
            iVar14 = (iVar6 + iVar14) - uVar31;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar6 = iVar19 + -1;
              bVar5 = 0 < iVar19;
              iVar19 = iVar6;
            } while (iVar6 != 0 && bVar5);
            iVar20 = -1;
          }
          if (uVar10 == 0) {
            if ((uVar29 >> 1 & 1) != 0) {
              uVar8 = 0x2b;
              goto code_r0x007640cc;
            }
            if ((uVar29 & 1) != 0) {
              uVar8 = 0x20;
              goto code_r0x007640cc;
            }
          }
          else {
            uVar8 = 0x2d;
code_r0x007640cc:
            uVar7 = (*auVar33._8_8_)(uVar8,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            iVar14 = iVar14 + 1;
          }
          if ((uVar18 & uVar30) != 0) {
            uVar7 = (*auVar33._8_8_)(0x30,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            if ((uVar29 >> 0xc & 1) == 0) {
              uVar8 = 0x78;
            }
            else {
              uVar8 = 0x58;
            }
            uVar7 = (*auVar33._8_8_)(uVar8,auVar33._0_8_);
            if ((int)uVar7 != 0) goto LAB_0076451c;
            iVar14 = iVar14 + 2;
          }
          iVar6 = iVar20;
          if (((uVar29 & 0x104) == 0x100) && (iVar6 = iVar20 + -1, 0 < iVar20)) {
            iVar14 = iVar14 + iVar20;
            do {
              uVar7 = (*auVar33._8_8_)(0x30,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar6 = iVar20 + -1;
              bVar5 = 0 < iVar20;
              iVar20 = iVar6;
            } while (iVar6 != 0 && bVar5);
            iVar6 = -1;
          }
          if (pbVar26 + 1 <= abStack_1884) {
            iVar14 = ((int)&bStack_19c8 + 0x144 + iVar14) - (int)pbVar26;
            pbVar24 = abStack_1884 + -(long)pbVar26;
            do {
              pbVar26 = pbVar26 + 1;
              uVar7 = (*auVar33._8_8_)(*pbVar26,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              pbVar24 = pbVar24 + -1;
            } while (pbVar24 != (byte *)0x0);
          }
          if (((uVar29 >> 2 & 1) != 0) && (0 < iVar6)) {
            iVar14 = iVar6 + iVar14;
            iVar6 = iVar6 + 1;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar6 = iVar6 + -1;
            } while (1 < iVar6);
          }
        }
        else {
          iVar6 = iVar14;
          uVar29 = uVar31;
          if (((uVar11 >> 2 & 1) == 0) && (uVar29 = uVar31 - 1, 1 < (int)uVar31)) {
            iVar6 = uVar29 + iVar14;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              uVar31 = uVar31 - 1;
            } while (1 < (int)uVar31);
            uVar29 = 0;
          }
          uVar7 = (*auVar33._8_8_)(SUB84(dVar32,0) & 0xff,auVar33._0_8_);
          if ((int)uVar7 != 0) goto LAB_0076451c;
          iVar14 = iVar6 + 1;
          if (((uVar11 >> 2 & 1) != 0) && (1 < (int)uVar29)) {
            iVar14 = uVar29 + iVar6;
            iVar6 = uVar29 + 1;
            do {
              uVar7 = (*auVar33._8_8_)(0x20,auVar33._0_8_);
              if ((int)uVar7 != 0) goto LAB_0076451c;
              iVar6 = iVar6 + -1;
            } while (2 < iVar6);
          }
        }
        break;
      case 9:
        uStack_19e8 = _UNK_008cd86b;
        uStack_19f0 = _UNK_008cd863;
        uStack_19d8 = _UNK_008cd87b;
        uStack_19e0 = _UNK_008cd873;
        lVar15 = _strlen(&uStack_19f0);
        if ((uVar29 & 0x2000) != 0) {
          uVar31 = uVar30;
        }
        if ((uVar29 >> 0xf & 1) == 0) {
          if ((uVar29 >> 2 & 1) == 0) goto code_r0x00763e64;
code_r0x00764238:
          uStack_19f0._0_2_ = CONCAT11(0x2d,(undefined1)uStack_19f0);
          puVar27 = (undefined1 *)((long)&uStack_19f0 + 2);
          puVar25 = (undefined1 *)((long)&uStack_19f0 + 2);
          if ((uVar29 >> 1 & 1) != 0) goto code_r0x00764248;
code_r0x00763e68:
          puVar27 = puVar25;
          if ((uVar29 & 1) == 0) goto code_r0x00763e6c;
code_r0x00764254:
          puVar27 = puVar25 + 1;
          *puVar25 = 0x20;
          if ((uVar29 >> 3 & 1) != 0) goto code_r0x00764260;
code_r0x00763e70:
          *puVar27 = 0;
        }
        else {
          uVar23 = auStack_1080[lVar28 * 8 + 1];
          if ((uVar29 >> 2 & 1) != 0) goto code_r0x00764238;
code_r0x00763e64:
          puVar27 = (undefined1 *)((long)&uStack_19f0 + 1);
          puVar25 = (undefined1 *)((long)&uStack_19f0 + 1);
          if ((uVar29 >> 1 & 1) == 0) goto code_r0x00763e68;
code_r0x00764248:
          puVar25 = puVar27 + 1;
          *puVar27 = 0x2b;
          puVar27 = puVar25;
          if ((uVar29 & 1) != 0) goto code_r0x00764254;
code_r0x00763e6c:
          if ((uVar29 >> 3 & 1) == 0) goto code_r0x00763e70;
code_r0x00764260:
          *puVar27 = 0x23;
          puVar27[1] = 0;
          puVar27 = puVar27 + 1;
        }
        if (-1 < (int)uVar31) {
          auVar33._8_8_ = 0x20 - lVar15;
          auVar33._0_8_ = puVar27;
          goto code_r0x00764560;
        }
        if (-1 < (int)uVar23) {
          for (dVar32 = adStack_1878[uVar22 * 2]; 10.0 <= dVar32; dVar32 = dVar32 / 10.0) {
          }
          iVar6 = func_0x00764560(puVar27,0x20 - lVar15,".%d");
          puVar27 = puVar27 + iVar6;
        }
        puVar25 = puVar27;
        if ((uVar29 >> 5 & 1) != 0) {
          puVar25 = puVar27 + 1;
          *puVar27 = 0x6c;
        }
        if ((uVar29 >> 0x12 & 1) == 0) {
          uVar9 = 0x67;
          if ((uVar29 & 0x1000) != 0) {
            uVar9 = 0x47;
          }
          uVar29 = uVar29 & 0x80000;
          uVar13 = 0x66;
        }
        else {
          uVar29 = uVar29 & 0x1000;
          uVar9 = 0x45;
          uVar13 = 0x65;
        }
        if (uVar29 != 0) {
          uVar13 = uVar9;
        }
        *puVar25 = uVar13;
        puVar25[1] = 0;
        uVar7 = _snprintf(&bStack_19c8,0x146,&uStack_19f0);
        pbVar24 = abStack_19c7;
        bVar3 = bStack_19c8;
        while (bVar3 != 0) {
          uVar7 = (*auVar33._8_8_)(bVar3,auVar33._0_8_);
          if ((int)uVar7 != 0) goto LAB_0076451c;
          iVar14 = iVar14 + 1;
          bVar3 = *pbVar24;
          pbVar24 = pbVar24 + 1;
        }
      }
LAB_00763bd8:
      lVar28 = lVar28 + 1;
    } while (lVar28 < uStack_19f8._4_4_);
  }
LAB_0076451c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
    return uVar7;
  }
  auVar33 = ___stack_chk_fail();
code_r0x00764560:
  uVar7 = func_0x00762a38(auVar33._0_8_,auVar33._8_8_);
  return uVar7;
code_r0x00762b5c:
  pcVar17 = *(char **)(lVar28 + 0x10);
  uVar7 = unaff_x26 + lVar15;
  iVar14 = (int)lVar15;
  iVar6 = (int)unaff_x20;
  uVar22 = unaff_x26;
  if (unaff_x26 <= unaff_x23) {
    unaff_x26 = unaff_x23;
  }
  do {
    pcVar21 = unaff_x21;
    if (*pcVar17 == '\0') goto code_r0x00762ba0;
    if (unaff_x26 == uVar22) {
      if (unaff_x23 != 0) goto code_r0x00763a4c;
      goto LAB_00763a64;
    }
    pcVar21 = unaff_x21 + 1;
    *unaff_x21 = *pcVar17;
    pcVar17 = pcVar17 + 1;
    unaff_x20 = (ulong)((int)unaff_x20 + 1);
    lVar15 = lVar15 + -1;
    unaff_x21 = pcVar21;
    uVar22 = uVar22 + 1;
  } while (lVar15 != 0);
  unaff_x20 = (ulong)(uint)(iVar6 + iVar14);
  uVar22 = uVar7;
code_r0x00762ba0:
  unaff_x21 = pcVar21;
  unaff_x26 = uVar22;
  if ((*(byte *)(lVar28 + 10) >> 4 & 1) == 0) {
code_r0x00762bac:
    uVar29 = *(uint *)(unaff_x30 + (ulong)*(uint *)(in_x7 + unaff_x27 * 0x20 + 0xc) * 0x10);
    if (uVar29 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00762c28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar7 = (*(code *)(&UNK_00762c2c + (ulong)*(byte *)(param_1 + (ulong)uVar29) * 4))();
      return uVar7;
    }
    unaff_x23 = in_stack_00000050;
  }
  goto LAB_00762b38;
}

