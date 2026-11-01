
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00763944(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],long param_4,
                  undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  bool bVar1;
  byte bVar2;
  double dVar3;
  bool in_ZR;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  undefined8 uVar7;
  long in_x7;
  undefined1 uVar8;
  uint uVar9;
  uint uVar10;
  int in_w9;
  uint uVar11;
  undefined1 uVar12;
  int iVar13;
  long lVar14;
  ulong in_x10;
  double dVar15;
  char *pcVar16;
  long in_x11;
  long lVar17;
  long in_x12;
  long in_x13;
  char in_w15;
  uint uVar18;
  int unaff_w20;
  ulong uVar19;
  int iVar20;
  int iVar21;
  char *pcVar22;
  undefined8 *unaff_x21;
  char *pcVar23;
  uint uVar24;
  ulong unaff_x23;
  byte *pbVar25;
  undefined1 *puVar26;
  byte *pbVar27;
  undefined1 *puVar28;
  uint uVar29;
  uint uVar30;
  long unaff_x26;
  ulong uVar31;
  uint uVar32;
  long unaff_x27;
  long unaff_x29;
  long unaff_x30;
  double dVar33;
  undefined1 auVar34 [16];
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
  
  if (!in_ZR) {
    in_x13 = in_x12;
  }
  lVar17 = in_x11 - in_x13;
  iVar13 = (int)lVar17;
  uVar19 = (ulong)(uint)(unaff_w20 + iVar13);
  pcVar23 = (char *)((long)unaff_x21 + lVar17);
  uVar6 = unaff_x26 + lVar17;
  do {
    unaff_x21[1] = param_3._8_8_;
    *unaff_x21 = param_3._0_8_;
    lVar17 = lVar17 + -0x10;
    unaff_x21 = unaff_x21 + 2;
  } while (lVar17 != 0);
  iVar13 = (in_w9 - iVar13) + 1;
  do {
    uVar31 = uVar6;
    pcVar16 = pcVar23;
    if (in_x10 == uVar31) {
      pcVar23 = pcVar16;
      goto LAB_00763a48;
    }
    pcVar23 = pcVar16 + 1;
    *pcVar16 = in_w15;
    uVar6 = uVar31 + 1;
    iVar5 = (int)uVar19;
    uVar19 = (ulong)(iVar5 + 1);
    iVar13 = iVar13 + -1;
  } while (1 < iVar13);
  if ((param_1 & 1) == 0) {
    in_x10 = uVar6;
    if (unaff_x23 <= uVar6) {
LAB_00763a48:
      if (unaff_x23 != 0) {
code_r0x00763a4c:
        if (in_x10 == unaff_x23) {
          pcVar23[-1] = '\0';
          uVar19 = (ulong)((int)uVar19 - 1);
        }
        else {
          *pcVar23 = '\0';
        }
      }
LAB_00763a64:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return uVar19;
      }
      ___stack_chk_fail();
      auVar34 = (*(code *)PTR____chkstk_darwin_009b01d8)();
      auVar34._8_8_ = auVar34._8_8_;
      auVar34._0_8_ = auVar34._0_8_;
      lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
      uStack_19f8 = 0;
      uVar6 = func_0x0076489c(param_6,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,&uStack_19f8,
                              param_7);
      if (((int)uVar6 == 0) && (0 < uStack_19f8._4_4_)) {
        lVar17 = 0;
        iVar13 = 0;
        pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
        do {
          lVar14 = alStack_1070[lVar17 * 4 + 1];
          uVar29 = auStack_1080[lVar17 * 8 + 2];
          if (lVar14 != 0) {
            pbVar25 = (byte *)alStack_1070[lVar17 * 4];
            iVar5 = iVar13 + (int)lVar14;
            do {
              uVar6 = (ulong)*pbVar25;
              if (*pbVar25 == 0) goto LAB_00763c2c;
              uVar6 = (*auVar34._8_8_)(uVar6,auVar34._0_8_);
              if ((int)uVar6 != 0) goto LAB_0076451c;
              pbVar25 = pbVar25 + 1;
              iVar13 = iVar13 + 1;
              lVar14 = lVar14 + -1;
            } while (lVar14 != 0);
            iVar13 = iVar5;
LAB_00763c2c:
            if ((uVar29 >> 0x14 & 1) == 0) goto LAB_00763c34;
            goto LAB_00763bd8;
          }
LAB_00763c34:
          uVar30 = auStack_1080[lVar17 * 8];
          uVar24 = uVar29;
          uVar32 = uVar30;
          if ((uVar29 >> 0xe & 1) == 0) {
joined_r0x00763da0:
            uVar10 = uVar29 >> 0x10;
            uVar29 = uVar24;
            if ((uVar10 & 1) == 0) goto LAB_00763c78;
LAB_00763c48:
            uVar24 = *(uint *)(adStack_1878 + (long)(int)auStack_1080[lVar17 * 8 + 1] * 2);
            if ((int)uVar24 < 0) {
              uVar24 = 0xffffffff;
            }
          }
          else {
            uVar32 = *(uint *)(adStack_1878 + (long)(int)uVar30 * 2);
            if ((int)uVar32 < 0) {
              uVar10 = 0x7fffffff;
              if (uVar32 != 0x80000000) {
                uVar10 = -uVar32;
              }
              uVar24 = uVar29 & 0xfffffeff | 4;
              uVar32 = uVar10;
              goto joined_r0x00763da0;
            }
            if ((uVar29 >> 0x10 & 1) != 0) goto LAB_00763c48;
LAB_00763c78:
            if ((uVar29 >> 0xf & 1) == 0) {
              uVar24 = 0xffffffff;
            }
            else {
              uVar24 = auStack_1080[lVar17 * 8 + 1];
            }
          }
          uVar19 = (ulong)auStack_1080[lVar17 * 8 + 3];
          iVar5 = (int)abStack_1884;
          uVar10 = uVar29;
          pbVar25 = abStack_1884;
          switch(auStack_1880[uVar19 * 4]) {
          case 0:
            pcVar23 = (char *)adStack_1878[uVar19 * 2];
            if ((byte *)pcVar23 == (byte *)0x0) {
              if (uVar24 != 0xffffffff && (int)uVar24 < 5) {
                uVar19 = 0;
                pcVar23 = "";
                goto code_r0x00764424;
              }
              uVar29 = uVar29 & 0xfffffff7;
              uVar19 = 5;
              iVar20 = 5;
              pcVar23 = "(nil)";
              iVar5 = uVar32 - 5;
joined_r0x00764308:
              bVar4 = true;
            }
            else {
              if (uVar24 == 0xffffffff) {
                if (*pcVar23 == 0) {
                  uVar19 = 0;
                }
                else {
                  uVar6 = _strlen(pcVar23);
                  uVar19 = uVar6;
                }
              }
              else {
                uVar19 = (long)(int)uVar24;
              }
code_r0x00764424:
              uVar31 = uVar19;
              if (0x7ffffffe < uVar19) {
                uVar31 = 0x7fffffff;
              }
              iVar20 = (int)uVar31;
              if ((uVar29 >> 3 & 1) == 0) {
                iVar5 = uVar32 - iVar20;
                goto joined_r0x00764308;
              }
              uVar6 = (*auVar34._8_8_)(0x22,auVar34._0_8_);
              if ((int)uVar6 != 0) goto LAB_0076451c;
              bVar4 = false;
              iVar13 = iVar13 + 1;
              iVar5 = uVar32 - iVar20;
            }
            if ((uVar29 >> 2 & 1) == 0) {
              if (iVar5 < 1) {
                iVar5 = iVar5 + -1;
              }
              else {
                iVar13 = (uVar32 + iVar13) - iVar20;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar20 = iVar5 + -1;
                  bVar1 = 0 < iVar5;
                  iVar5 = iVar20;
                } while (iVar20 != 0 && bVar1);
                iVar5 = -1;
              }
            }
            if (uVar19 != 0) {
              iVar20 = iVar13 + (int)uVar19;
              do {
                uVar6 = (ulong)(byte)*pcVar23;
                if (*pcVar23 == 0) goto code_r0x007644cc;
                uVar6 = (*auVar34._8_8_)(uVar6,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                pcVar23 = pcVar23 + 1;
                iVar13 = iVar13 + 1;
                uVar19 = uVar19 - 1;
              } while (uVar19 != 0);
              iVar13 = iVar20;
            }
code_r0x007644cc:
            if (((uVar29 >> 2 & 1) != 0) && (0 < iVar5)) {
              iVar13 = iVar5 + iVar13;
              iVar5 = iVar5 + 1;
              do {
                uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                iVar5 = iVar5 + -1;
              } while (1 < iVar5);
            }
            if (!bVar4) {
              uVar6 = (*auVar34._8_8_)(0x22,auVar34._0_8_);
              if ((int)uVar6 != 0) goto LAB_0076451c;
              iVar13 = iVar13 + 1;
            }
            break;
          case 1:
            dVar33 = adStack_1878[uVar19 * 2];
            if (dVar33 != 0.0) {
              uVar11 = 0;
              pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
              if ((uVar29 & 0x1000) != 0) {
                pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
              }
              uVar18 = 1;
              dVar15 = 7.90505033345994e-323;
              uVar30 = 1;
              goto LAB_00763f80;
            }
            iVar20 = uVar32 - 5;
            iVar5 = iVar20;
            if (((uVar29 >> 2 & 1) != 0) && (iVar5 = uVar32 - 6, 5 < (int)uVar32)) {
              iVar13 = iVar20 + iVar13;
              do {
                uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                iVar20 = iVar20 + -1;
              } while (0 < iVar20);
              iVar5 = -1;
            }
            uVar6 = (*auVar34._8_8_)(0x28,auVar34._0_8_);
            if (((((int)uVar6 == 0) &&
                 (uVar6 = (*auVar34._8_8_)(0x6e,auVar34._0_8_), (int)uVar6 == 0)) &&
                (uVar6 = (*auVar34._8_8_)(0x69,auVar34._0_8_), (int)uVar6 == 0)) &&
               ((uVar6 = (*auVar34._8_8_)(0x6c,auVar34._0_8_), (int)uVar6 == 0 &&
                (uVar6 = (*auVar34._8_8_)(0x29,auVar34._0_8_), (int)uVar6 == 0)))) {
              iVar13 = iVar13 + 5;
              if (((uVar29 >> 2 & 1) == 0) && (0 < iVar5)) {
                iVar13 = iVar13 + iVar5;
                iVar5 = iVar5 + 1;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar5 = iVar5 + -1;
                } while (1 < iVar5);
              }
              break;
            }
            goto LAB_0076451c;
          case 2:
            if (((uVar29 >> 6 & 1) == 0) && ((uVar29 >> 5 & 1) == 0)) {
              if ((uVar29 >> 4 & 1) == 0) {
                *(int *)adStack_1878[uVar19 * 2] = iVar13;
              }
              else {
                *(short *)adStack_1878[uVar19 * 2] = (short)iVar13;
              }
            }
            else {
              *(long *)adStack_1878[uVar19 * 2] = (long)iVar13;
            }
            break;
          case 3:
          case 4:
          case 5:
            goto code_r0x00763cc4;
          case 6:
          case 7:
          case 8:
            uVar10 = uVar29 | 0x200;
code_r0x00763cc4:
            dVar33 = adStack_1878[uVar19 * 2];
            if ((uVar10 >> 0x11 & 1) == 0) {
              if ((uVar10 >> 10 & 1) == 0) {
                if ((uVar10 >> 0xb & 1) != 0) {
                  uVar11 = 0;
                  pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
                  if ((uVar10 & 0x1000) != 0) {
                    pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                  }
                  uVar30 = uVar29 >> 3 & 1;
                  uVar18 = 1;
                  dVar15 = 7.90505033345994e-323;
                  uVar29 = uVar10;
                  goto LAB_00763f80;
                }
                dVar15 = (double)-(long)dVar33;
                if (-1 < (long)dVar33) {
                  dVar15 = dVar33;
                }
                uVar9 = 0;
                if (-1 >= (long)dVar33) {
                  uVar9 = (uint)((uVar10 & 0x200) == 0);
                }
                if ((uVar10 & 0x200) != 0) {
                  dVar15 = dVar33;
                }
                if (uVar24 == 0xffffffff) {
                  uVar24 = 1;
                }
                if (dVar15 != 0.0) {
                  pbVar27 = abStack_1884;
                  do {
                    pbVar25 = pbVar27 + -1;
                    *pbVar27 = SUB81(dVar15,0) + (char)((ulong)dVar15 / 10) * -10 | 0x30;
                    bVar4 = 9 < (ulong)dVar15;
                    dVar15 = (double)((ulong)dVar15 / 10);
                    pbVar27 = pbVar25;
                  } while (bVar4);
                }
                uVar18 = 0;
                uVar30 = uVar29 >> 3 & 1;
                iVar5 = iVar5 - (int)pbVar25;
                iVar20 = uVar32 - iVar5;
                iVar5 = uVar24 - iVar5;
                uVar29 = uVar10;
code_r0x00763ff0:
                pbVar27 = pbVar25;
                if (0 < iVar5) {
                  iVar20 = iVar20 - iVar5;
                  if (&bStack_19c8 <= pbVar25) {
                    uVar6 = (ulong)(((uVar24 - (int)&bStack_19c8) + (int)pbVar25) - 0x145);
                    uVar19 = (long)pbVar25 - (long)&bStack_19c8;
                    if (uVar6 <= uVar19) {
                      uVar19 = uVar6;
                    }
                    uVar6 = _memset((long)pbVar25 - uVar19,0x30,uVar19 + 1);
                    pbVar27 = (byte *)(((long)pbVar25 - uVar19) + -1);
                  }
                }
              }
              else {
                uVar18 = 0;
                uVar30 = uVar29 >> 3 & 1;
                uVar11 = 1;
                dVar15 = 3.95252516672997e-323;
                uVar29 = uVar10;
LAB_00763f80:
                if (uVar24 == 0xffffffff) {
                  uVar24 = 1;
                }
                if (dVar33 != 0.0) {
                  pbVar27 = abStack_1884;
                  do {
                    pbVar25 = pbVar27 + -1;
                    *pbVar27 = pcStack_1a08[(ulong)dVar33 & (long)dVar15 - 1U];
                    dVar3 = 0.0;
                    if (dVar15 != 0.0) {
                      dVar3 = (double)((ulong)dVar33 / (ulong)dVar15);
                    }
                    bVar4 = (ulong)dVar15 <= (ulong)dVar33;
                    dVar33 = dVar3;
                    pbVar27 = pbVar25;
                  } while (bVar4);
                }
                uVar9 = 0;
                iVar5 = iVar5 - (int)pbVar25;
                iVar20 = uVar32 - iVar5;
                iVar5 = uVar24 - iVar5;
                if (((uVar11 & uVar30) != 1) || (0 < iVar5)) goto code_r0x00763ff0;
                uVar9 = 0;
                pbVar27 = pbVar25 + -1;
                *pbVar25 = 0x30;
                iVar20 = iVar20 + -1;
              }
              iVar5 = iVar20 + -2;
              if ((uVar18 & uVar30) == 0) {
                iVar5 = iVar20;
              }
              uVar32 = uVar9;
              if ((uVar29 & 3) != 0) {
                uVar32 = 1;
              }
              iVar20 = iVar5 - uVar32;
              iVar21 = iVar20;
              if (((uVar29 & 0x104) == 0) && (iVar21 = iVar20 + -1, 0 < iVar20)) {
                iVar13 = (iVar5 + iVar13) - uVar32;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar5 = iVar20 + -1;
                  bVar4 = 0 < iVar20;
                  iVar20 = iVar5;
                } while (iVar5 != 0 && bVar4);
                iVar21 = -1;
              }
              if (uVar9 == 0) {
                if ((uVar29 >> 1 & 1) != 0) {
                  uVar7 = 0x2b;
                  goto code_r0x007640cc;
                }
                if ((uVar29 & 1) != 0) {
                  uVar7 = 0x20;
                  goto code_r0x007640cc;
                }
              }
              else {
                uVar7 = 0x2d;
code_r0x007640cc:
                uVar6 = (*auVar34._8_8_)(uVar7,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                iVar13 = iVar13 + 1;
              }
              if ((uVar18 & uVar30) != 0) {
                uVar6 = (*auVar34._8_8_)(0x30,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                if ((uVar29 >> 0xc & 1) == 0) {
                  uVar7 = 0x78;
                }
                else {
                  uVar7 = 0x58;
                }
                uVar6 = (*auVar34._8_8_)(uVar7,auVar34._0_8_);
                if ((int)uVar6 != 0) goto LAB_0076451c;
                iVar13 = iVar13 + 2;
              }
              iVar5 = iVar21;
              if (((uVar29 & 0x104) == 0x100) && (iVar5 = iVar21 + -1, 0 < iVar21)) {
                iVar13 = iVar13 + iVar21;
                do {
                  uVar6 = (*auVar34._8_8_)(0x30,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar5 = iVar21 + -1;
                  bVar4 = 0 < iVar21;
                  iVar21 = iVar5;
                } while (iVar5 != 0 && bVar4);
                iVar5 = -1;
              }
              if (pbVar27 + 1 <= abStack_1884) {
                iVar13 = ((int)&bStack_19c8 + 0x144 + iVar13) - (int)pbVar27;
                pbVar25 = abStack_1884 + -(long)pbVar27;
                do {
                  pbVar27 = pbVar27 + 1;
                  uVar6 = (*auVar34._8_8_)(*pbVar27,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  pbVar25 = pbVar25 + -1;
                } while (pbVar25 != (byte *)0x0);
              }
              if (((uVar29 >> 2 & 1) != 0) && (0 < iVar5)) {
                iVar13 = iVar5 + iVar13;
                iVar5 = iVar5 + 1;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar5 = iVar5 + -1;
                } while (1 < iVar5);
              }
            }
            else {
              iVar5 = iVar13;
              uVar29 = uVar32;
              if (((uVar10 >> 2 & 1) == 0) && (uVar29 = uVar32 - 1, 1 < (int)uVar32)) {
                iVar5 = uVar29 + iVar13;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  uVar32 = uVar32 - 1;
                } while (1 < (int)uVar32);
                uVar29 = 0;
              }
              uVar6 = (*auVar34._8_8_)(SUB84(dVar33,0) & 0xff,auVar34._0_8_);
              if ((int)uVar6 != 0) goto LAB_0076451c;
              iVar13 = iVar5 + 1;
              if (((uVar10 >> 2 & 1) != 0) && (1 < (int)uVar29)) {
                iVar13 = uVar29 + iVar5;
                iVar5 = uVar29 + 1;
                do {
                  uVar6 = (*auVar34._8_8_)(0x20,auVar34._0_8_);
                  if ((int)uVar6 != 0) goto LAB_0076451c;
                  iVar5 = iVar5 + -1;
                } while (2 < iVar5);
              }
            }
            break;
          case 9:
            uStack_19e8 = _UNK_008cd86b;
            uStack_19f0 = _UNK_008cd863;
            uStack_19d8 = _UNK_008cd87b;
            uStack_19e0 = _UNK_008cd873;
            lVar14 = _strlen(&uStack_19f0);
            if ((uVar29 & 0x2000) != 0) {
              uVar32 = uVar30;
            }
            if ((uVar29 >> 0xf & 1) == 0) {
              if ((uVar29 >> 2 & 1) == 0) goto code_r0x00763e64;
code_r0x00764238:
              uStack_19f0._0_2_ = CONCAT11(0x2d,(undefined1)uStack_19f0);
              puVar28 = (undefined1 *)((long)&uStack_19f0 + 2);
              puVar26 = (undefined1 *)((long)&uStack_19f0 + 2);
              if ((uVar29 >> 1 & 1) != 0) goto code_r0x00764248;
code_r0x00763e68:
              puVar28 = puVar26;
              if ((uVar29 & 1) == 0) goto code_r0x00763e6c;
code_r0x00764254:
              puVar28 = puVar26 + 1;
              *puVar26 = 0x20;
              if ((uVar29 >> 3 & 1) != 0) goto code_r0x00764260;
code_r0x00763e70:
              *puVar28 = 0;
            }
            else {
              uVar24 = auStack_1080[lVar17 * 8 + 1];
              if ((uVar29 >> 2 & 1) != 0) goto code_r0x00764238;
code_r0x00763e64:
              puVar28 = (undefined1 *)((long)&uStack_19f0 + 1);
              puVar26 = (undefined1 *)((long)&uStack_19f0 + 1);
              if ((uVar29 >> 1 & 1) == 0) goto code_r0x00763e68;
code_r0x00764248:
              puVar26 = puVar28 + 1;
              *puVar28 = 0x2b;
              puVar28 = puVar26;
              if ((uVar29 & 1) != 0) goto code_r0x00764254;
code_r0x00763e6c:
              if ((uVar29 >> 3 & 1) == 0) goto code_r0x00763e70;
code_r0x00764260:
              *puVar28 = 0x23;
              puVar28[1] = 0;
              puVar28 = puVar28 + 1;
            }
            if (-1 < (int)uVar32) {
              auVar34._8_8_ = 0x20 - lVar14;
              auVar34._0_8_ = puVar28;
              goto code_r0x00764560;
            }
            if (-1 < (int)uVar24) {
              for (dVar33 = adStack_1878[uVar19 * 2]; 10.0 <= dVar33; dVar33 = dVar33 / 10.0) {
              }
              iVar5 = func_0x00764560(puVar28,0x20 - lVar14,".%d");
              puVar28 = puVar28 + iVar5;
            }
            puVar26 = puVar28;
            if ((uVar29 >> 5 & 1) != 0) {
              puVar26 = puVar28 + 1;
              *puVar28 = 0x6c;
            }
            if ((uVar29 >> 0x12 & 1) == 0) {
              uVar8 = 0x67;
              if ((uVar29 & 0x1000) != 0) {
                uVar8 = 0x47;
              }
              uVar29 = uVar29 & 0x80000;
              uVar12 = 0x66;
            }
            else {
              uVar29 = uVar29 & 0x1000;
              uVar8 = 0x45;
              uVar12 = 0x65;
            }
            if (uVar29 != 0) {
              uVar12 = uVar8;
            }
            *puVar26 = uVar12;
            puVar26[1] = 0;
            uVar6 = _snprintf(&bStack_19c8,0x146,&uStack_19f0);
            pbVar25 = abStack_19c7;
            bVar2 = bStack_19c8;
            while (bVar2 != 0) {
              uVar6 = (*auVar34._8_8_)(bVar2,auVar34._0_8_);
              if ((int)uVar6 != 0) goto LAB_0076451c;
              iVar13 = iVar13 + 1;
              bVar2 = *pbVar25;
              pbVar25 = pbVar25 + 1;
            }
          }
LAB_00763bd8:
          lVar17 = lVar17 + 1;
        } while (lVar17 < uStack_19f8._4_4_);
      }
LAB_0076451c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
        return uVar6;
      }
      auVar34 = ___stack_chk_fail();
code_r0x00764560:
      uVar6 = func_0x00762a38(auVar34._0_8_,auVar34._8_8_);
      return uVar6;
    }
    *pcVar23 = '\"';
    uVar6 = uVar31 + 2;
    uVar19 = (ulong)(iVar5 + 2);
    pcVar23 = pcVar16 + 2;
  }
LAB_00762b38:
  unaff_x27 = unaff_x27 + 1;
  in_x10 = uVar6;
  if (unaff_x27 < in_stack_00000058._4_4_) {
    lVar17 = in_x7 + unaff_x27 * 0x20;
    lVar14 = *(long *)(lVar17 + 0x18);
    if (lVar14 != 0) goto code_r0x00762b5c;
    goto code_r0x00762bac;
  }
  goto LAB_00763a48;
code_r0x00762b5c:
  pcVar16 = *(char **)(lVar17 + 0x10);
  uVar31 = uVar6 + lVar14;
  iVar13 = (int)lVar14;
  iVar5 = (int)uVar19;
  if (uVar6 <= unaff_x23) {
    in_x10 = unaff_x23;
  }
  do {
    pcVar22 = pcVar23;
    if (*pcVar16 == '\0') goto code_r0x00762ba0;
    if (in_x10 == uVar6) {
      if (unaff_x23 != 0) goto code_r0x00763a4c;
      goto LAB_00763a64;
    }
    pcVar22 = pcVar23 + 1;
    *pcVar23 = *pcVar16;
    uVar6 = uVar6 + 1;
    pcVar16 = pcVar16 + 1;
    uVar19 = (ulong)((int)uVar19 + 1);
    lVar14 = lVar14 + -1;
    pcVar23 = pcVar22;
  } while (lVar14 != 0);
  uVar19 = (ulong)(uint)(iVar5 + iVar13);
  uVar6 = uVar31;
code_r0x00762ba0:
  pcVar23 = pcVar22;
  if ((*(byte *)(lVar17 + 10) >> 4 & 1) == 0) {
code_r0x00762bac:
    uVar29 = *(uint *)(unaff_x30 + (ulong)*(uint *)(in_x7 + unaff_x27 * 0x20 + 0xc) * 0x10);
    if (uVar29 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00762c28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar6 = (*(code *)(&UNK_00762c2c + (ulong)*(byte *)(param_4 + (ulong)uVar29) * 4))();
      return uVar6;
    }
    unaff_x23 = in_stack_00000050;
  }
  goto LAB_00762b38;
}

