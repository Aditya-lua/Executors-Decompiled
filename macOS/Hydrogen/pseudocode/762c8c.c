
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Removing unreachable block (ram,0x0076325c) */
/* WARNING: Removing unreachable block (ram,0x00763264) */
/* WARNING: Removing unreachable block (ram,0x00763ab4) */
/* WARNING: Removing unreachable block (ram,0x00763278) */
/* WARNING: Removing unreachable block (ram,0x00763284) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00762c8c(byte *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                  undefined1 param_4 [16],undefined *param_5,undefined8 param_6,byte *param_7,
                  byte *param_8,long param_9,undefined8 param_10,undefined8 param_11,
                  undefined1 *param_12)

{
  bool bVar1;
  int *piVar2;
  ulong uVar3;
  ulong uVar4;
  double dVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  bool bVar8;
  int iVar9;
  undefined8 uVar10;
  uint uVar11;
  uint uVar12;
  byte *pbVar13;
  uint uVar14;
  uint uVar15;
  ulong in_x9;
  ulong uVar16;
  long lVar17;
  int in_w10;
  int iVar18;
  ulong uVar19;
  double dVar20;
  ulong in_x11;
  byte bVar21;
  int in_w12;
  ulong in_x13;
  int in_w14;
  byte in_w15;
  uint uVar22;
  byte *in_x16;
  ulong unaff_x20;
  int iVar23;
  int iVar24;
  byte *pbVar25;
  byte *unaff_x21;
  byte *pbVar26;
  uint uVar27;
  long lVar28;
  char *pcVar29;
  undefined1 *puVar30;
  undefined1 *puVar31;
  int unaff_w24;
  uint unaff_w25;
  uint uVar32;
  ulong unaff_x26;
  uint uVar33;
  long unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined1 *unaff_x30;
  undefined8 uVar34;
  double dVar35;
  undefined8 uVar36;
  undefined1 uVar37;
  undefined1 uVar38;
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 uVar41;
  undefined1 uVar42;
  undefined1 uVar43;
  undefined1 uVar44;
  undefined1 uVar45;
  undefined1 uVar46;
  undefined1 uVar47;
  undefined1 uVar48;
  undefined1 uVar49;
  undefined1 uVar50;
  undefined1 uVar51;
  undefined1 uVar52;
  undefined1 auVar53 [16];
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  byte bStack0000000000000088;
  undefined1 uStack00000000000001d0;
  undefined1 auStack_7ffffffe [2147476982];
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
  
  uVar52 = param_4[0xf];
  uVar51 = param_4[0xe];
  uVar50 = param_4[0xd];
  uVar49 = param_4[0xc];
  uVar48 = param_4[0xb];
  uVar47 = param_4[10];
  uVar46 = param_4[9];
  uVar45 = param_4[8];
  uVar44 = param_4[7];
  uVar43 = param_4[6];
  uVar42 = param_4[5];
  uVar41 = param_4[4];
  uVar40 = param_4[3];
  uVar39 = param_4[2];
  uVar38 = param_4[1];
  uVar37 = param_4[0];
  uVar10 = param_3._8_8_;
  uVar36 = param_3._0_8_;
  while( true ) {
    pbVar13 = param_1 + -1;
    *param_1 = (byte)in_w12 | 0x30;
    if (in_x9 < 10) break;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = in_x11;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = in_x13;
    uVar19 = SUB168(auVar6 * auVar7,8) >> 3;
    in_w12 = (int)in_x11 - (int)uVar19 * in_w14;
    param_1 = pbVar13;
    in_x9 = in_x11;
    in_x11 = uVar19;
  }
  iVar9 = (int)in_x16 - (int)pbVar13;
  iVar18 = unaff_w28 - iVar9;
  iVar9 = in_w10 - iVar9;
  if ((0 < iVar9) && (iVar18 = iVar18 - iVar9, param_7 <= pbVar13)) {
    uVar16 = (ulong)(((in_w10 - (int)param_7) + (int)pbVar13) - 0x145);
    uVar19 = (long)pbVar13 - (long)param_7;
    if (uVar16 <= (ulong)((long)pbVar13 - (long)param_7)) {
      uVar19 = uVar16;
    }
    _memset((long)pbVar13 - uVar19,0x30,uVar19 + 1);
    uVar37 = 0x30;
    uVar38 = 0x30;
    uVar39 = 0x30;
    uVar40 = 0x30;
    uVar41 = 0x30;
    uVar42 = 0x30;
    uVar43 = 0x30;
    uVar44 = 0x30;
    uVar45 = 0x30;
    uVar46 = 0x30;
    uVar47 = 0x30;
    uVar48 = 0x30;
    uVar49 = 0x30;
    uVar50 = 0x30;
    uVar51 = 0x30;
    uVar52 = 0x30;
    uVar36 = 0x2020202020202020;
    uVar10 = 0x2020202020202020;
    in_w15 = 0x20;
    param_5 = &UNK_008cd778;
    unaff_x30 = &uStack00000000000001d0;
    param_12 = auStack_7ffffffe + 0x800009ce;
    param_7 = &bStack0000000000000088;
    pbVar13 = (byte *)(((long)pbVar13 - uVar19) + -1);
  }
  iVar9 = unaff_w24;
  if ((unaff_w25 & 3) != 0) {
    iVar9 = 1;
  }
  uVar33 = iVar18 - iVar9;
  uVar14 = uVar33;
  if ((unaff_w25 & 0x104) == 0) {
    uVar14 = uVar33 - 1;
    uVar19 = (ulong)uVar14;
    if (0 < (int)uVar33) {
      uVar16 = unaff_x26;
      if (unaff_x26 <= in_stack_00000050) {
        uVar16 = in_stack_00000050;
      }
      uVar3 = uVar19;
      if (uVar16 - unaff_x26 <= uVar19) {
        uVar3 = uVar16 - unaff_x26;
      }
      pbVar25 = unaff_x21;
      if (0xf < uVar3) {
        uVar19 = uVar3 + 1 & 0xf;
        uVar4 = 0x10;
        if (uVar19 != 0) {
          uVar4 = uVar19;
        }
        lVar17 = (uVar3 + 1) - uVar4;
        uVar19 = (ulong)(uVar14 - (int)lVar17);
        unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar17);
        pbVar25 = unaff_x21 + lVar17;
        unaff_x26 = unaff_x26 + lVar17;
        do {
          *(undefined8 *)(unaff_x21 + 8) = uVar10;
          *(undefined8 *)unaff_x21 = uVar36;
          lVar17 = lVar17 + -0x10;
          unaff_x21 = unaff_x21 + 0x10;
        } while (lVar17 != 0);
      }
      do {
        unaff_x21 = pbVar25;
        if (uVar16 == unaff_x26) goto joined_r0x00763a1c;
        unaff_x21 = pbVar25 + 1;
        *pbVar25 = in_w15;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        iVar18 = (int)uVar19;
        uVar14 = iVar18 - 1;
        uVar19 = (ulong)uVar14;
        pbVar25 = unaff_x21;
      } while (0 < iVar18);
    }
  }
  uVar16 = unaff_x26;
  if (unaff_w24 == 0) {
    if ((unaff_w25 >> 1 & 1) == 0) {
      if ((unaff_w25 & 1) == 0) goto code_r0x00763258;
      if (in_stack_00000050 <= unaff_x26) goto joined_r0x00763a1c;
      bVar21 = 0x20;
    }
    else {
      if (in_stack_00000050 <= unaff_x26) goto joined_r0x00763a1c;
      bVar21 = 0x2b;
    }
  }
  else {
    if (in_stack_00000050 <= unaff_x26) {
joined_r0x00763a1c:
      if (in_stack_00000050 != 0) {
        if (uVar16 == in_stack_00000050) {
          unaff_x21[-1] = 0;
          unaff_x20 = (ulong)((int)unaff_x20 - 1);
        }
        else {
          *unaff_x21 = 0;
        }
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return unaff_x20;
      }
      ___stack_chk_fail(param_5,param_6,param_7,param_8,param_9,param_10,param_11);
      auVar53 = (*(code *)PTR____chkstk_darwin_009b01d8)();
      auVar53._8_8_ = auVar53._8_8_;
      uVar36 = auVar53._0_8_;
      lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
      uStack_19f8 = 0;
      uVar19 = func_0x0076489c(param_7,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,&uStack_19f8
                               ,param_8);
      if (((int)uVar19 == 0) && (0 < uStack_19f8._4_4_)) {
        lVar17 = 0;
        iVar18 = 0;
        pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
        do {
          lVar28 = alStack_1070[lVar17 * 4 + 1];
          uVar14 = auStack_1080[lVar17 * 8 + 2];
          if (lVar28 != 0) {
            pbVar13 = (byte *)alStack_1070[lVar17 * 4];
            iVar9 = iVar18 + (int)lVar28;
            do {
              uVar19 = (ulong)*pbVar13;
              if (*pbVar13 == 0) goto code_r0x00763c2c;
              uVar19 = (*auVar53._8_8_)(uVar19,uVar36);
              if ((int)uVar19 != 0) goto code_r0x0076451c;
              pbVar13 = pbVar13 + 1;
              iVar18 = iVar18 + 1;
              lVar28 = lVar28 + -1;
            } while (lVar28 != 0);
            iVar18 = iVar9;
code_r0x00763c2c:
            if ((uVar14 >> 0x14 & 1) == 0) goto code_r0x00763c34;
            goto code_r0x00763bd8;
          }
code_r0x00763c34:
          uVar32 = auStack_1080[lVar17 * 8];
          uVar27 = uVar14;
          uVar33 = uVar32;
          if ((uVar14 >> 0xe & 1) == 0) {
joined_r0x00763da0:
            uVar12 = uVar14 >> 0x10;
            uVar14 = uVar27;
            if ((uVar12 & 1) != 0) goto code_r0x00763c48;
code_r0x00763c78:
            if ((uVar14 >> 0xf & 1) == 0) {
              uVar27 = 0xffffffff;
            }
            else {
              uVar27 = auStack_1080[lVar17 * 8 + 1];
            }
          }
          else {
            uVar33 = *(uint *)(adStack_1878 + (long)(int)uVar32 * 2);
            if ((int)uVar33 < 0) {
              uVar12 = 0x7fffffff;
              if (uVar33 != 0x80000000) {
                uVar12 = -uVar33;
              }
              uVar27 = uVar14 & 0xfffffeff | 4;
              uVar33 = uVar12;
              goto joined_r0x00763da0;
            }
            if ((uVar14 >> 0x10 & 1) == 0) goto code_r0x00763c78;
code_r0x00763c48:
            uVar27 = *(uint *)(adStack_1878 + (long)(int)auStack_1080[lVar17 * 8 + 1] * 2);
            if ((int)uVar27 < 0) {
              uVar27 = 0xffffffff;
            }
          }
          uVar16 = (ulong)auStack_1080[lVar17 * 8 + 3];
          iVar9 = (int)abStack_1884;
          uVar12 = uVar14;
          pbVar13 = abStack_1884;
          switch(auStack_1880[uVar16 * 4]) {
          case 0:
            pcVar29 = (char *)adStack_1878[uVar16 * 2];
            if ((byte *)pcVar29 == (byte *)0x0) {
              if (uVar27 != 0xffffffff && (int)uVar27 < 5) {
                uVar16 = 0;
                pcVar29 = "";
                goto code_r0x00764424;
              }
              uVar14 = uVar14 & 0xfffffff7;
              uVar16 = 5;
              iVar23 = 5;
              pcVar29 = "(nil)";
              iVar9 = uVar33 - 5;
joined_r0x00764308:
              bVar8 = true;
            }
            else {
              if (uVar27 == 0xffffffff) {
                if (*pcVar29 == 0) {
                  uVar16 = 0;
                }
                else {
                  uVar19 = _strlen(pcVar29);
                  uVar16 = uVar19;
                }
              }
              else {
                uVar16 = (long)(int)uVar27;
              }
code_r0x00764424:
              uVar3 = uVar16;
              if (0x7ffffffe < uVar16) {
                uVar3 = 0x7fffffff;
              }
              iVar23 = (int)uVar3;
              if ((uVar14 >> 3 & 1) == 0) {
                iVar9 = uVar33 - iVar23;
                goto joined_r0x00764308;
              }
              uVar19 = (*auVar53._8_8_)(0x22,uVar36);
              if ((int)uVar19 != 0) goto code_r0x0076451c;
              bVar8 = false;
              iVar18 = iVar18 + 1;
              iVar9 = uVar33 - iVar23;
            }
            if ((uVar14 >> 2 & 1) == 0) {
              if (iVar9 < 1) {
                iVar9 = iVar9 + -1;
              }
              else {
                iVar18 = (uVar33 + iVar18) - iVar23;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar23 = iVar9 + -1;
                  bVar1 = 0 < iVar9;
                  iVar9 = iVar23;
                } while (iVar23 != 0 && bVar1);
                iVar9 = -1;
              }
            }
            if (uVar16 != 0) {
              iVar23 = iVar18 + (int)uVar16;
              do {
                uVar19 = (ulong)(byte)*pcVar29;
                if (*pcVar29 == 0) goto code_r0x007644cc;
                uVar19 = (*auVar53._8_8_)(uVar19,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                pcVar29 = pcVar29 + 1;
                iVar18 = iVar18 + 1;
                uVar16 = uVar16 - 1;
              } while (uVar16 != 0);
              iVar18 = iVar23;
            }
code_r0x007644cc:
            if (((uVar14 >> 2 & 1) != 0) && (0 < iVar9)) {
              iVar18 = iVar9 + iVar18;
              iVar9 = iVar9 + 1;
              do {
                uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                iVar9 = iVar9 + -1;
              } while (1 < iVar9);
            }
            if (!bVar8) {
              uVar19 = (*auVar53._8_8_)(0x22,uVar36);
              if ((int)uVar19 != 0) goto code_r0x0076451c;
              iVar18 = iVar18 + 1;
            }
            break;
          case 1:
            dVar35 = adStack_1878[uVar16 * 2];
            if (dVar35 != 0.0) {
              uVar15 = 0;
              pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
              if ((uVar14 & 0x1000) != 0) {
                pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
              }
              uVar22 = 1;
              dVar20 = 7.90505033345994e-323;
              uVar32 = 1;
              goto code_r0x00763f80;
            }
            iVar23 = uVar33 - 5;
            iVar9 = iVar23;
            if (((uVar14 >> 2 & 1) != 0) && (iVar9 = uVar33 - 6, 5 < (int)uVar33)) {
              iVar18 = iVar23 + iVar18;
              do {
                uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                iVar23 = iVar23 + -1;
              } while (0 < iVar23);
              iVar9 = -1;
            }
            uVar19 = (*auVar53._8_8_)(0x28,uVar36);
            if (((((int)uVar19 == 0) && (uVar19 = (*auVar53._8_8_)(0x6e,uVar36), (int)uVar19 == 0))
                && (uVar19 = (*auVar53._8_8_)(0x69,uVar36), (int)uVar19 == 0)) &&
               ((uVar19 = (*auVar53._8_8_)(0x6c,uVar36), (int)uVar19 == 0 &&
                (uVar19 = (*auVar53._8_8_)(0x29,uVar36), (int)uVar19 == 0)))) {
              iVar18 = iVar18 + 5;
              if (((uVar14 >> 2 & 1) == 0) && (0 < iVar9)) {
                iVar18 = iVar18 + iVar9;
                iVar9 = iVar9 + 1;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar9 = iVar9 + -1;
                } while (1 < iVar9);
              }
              break;
            }
            goto code_r0x0076451c;
          case 2:
            if (((uVar14 >> 6 & 1) == 0) && ((uVar14 >> 5 & 1) == 0)) {
              if ((uVar14 >> 4 & 1) == 0) {
                *(int *)adStack_1878[uVar16 * 2] = iVar18;
              }
              else {
                *(short *)adStack_1878[uVar16 * 2] = (short)iVar18;
              }
            }
            else {
              *(long *)adStack_1878[uVar16 * 2] = (long)iVar18;
            }
            break;
          case 3:
          case 4:
          case 5:
            goto code_r0x00763cc4;
          case 6:
          case 7:
          case 8:
            uVar12 = uVar14 | 0x200;
code_r0x00763cc4:
            dVar35 = adStack_1878[uVar16 * 2];
            if ((uVar12 >> 0x11 & 1) == 0) {
              if ((uVar12 >> 10 & 1) == 0) {
                if ((uVar12 >> 0xb & 1) != 0) {
                  uVar15 = 0;
                  pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
                  if ((uVar12 & 0x1000) != 0) {
                    pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                  }
                  uVar32 = uVar14 >> 3 & 1;
                  uVar22 = 1;
                  dVar20 = 7.90505033345994e-323;
                  uVar14 = uVar12;
                  goto code_r0x00763f80;
                }
                dVar20 = (double)-(long)dVar35;
                if (-1 < (long)dVar35) {
                  dVar20 = dVar35;
                }
                uVar11 = 0;
                if (-1 >= (long)dVar35) {
                  uVar11 = (uint)((uVar12 & 0x200) == 0);
                }
                if ((uVar12 & 0x200) != 0) {
                  dVar20 = dVar35;
                }
                if (uVar27 == 0xffffffff) {
                  uVar27 = 1;
                }
                if (dVar20 != 0.0) {
                  pbVar25 = abStack_1884;
                  do {
                    pbVar13 = pbVar25 + -1;
                    *pbVar25 = SUB81(dVar20,0) + (char)((ulong)dVar20 / 10) * -10 | 0x30;
                    bVar8 = 9 < (ulong)dVar20;
                    dVar20 = (double)((ulong)dVar20 / 10);
                    pbVar25 = pbVar13;
                  } while (bVar8);
                }
                uVar22 = 0;
                uVar32 = uVar14 >> 3 & 1;
                iVar9 = iVar9 - (int)pbVar13;
                iVar23 = uVar33 - iVar9;
                iVar9 = uVar27 - iVar9;
                uVar14 = uVar12;
code_r0x00763ff0:
                pbVar25 = pbVar13;
                if (0 < iVar9) {
                  iVar23 = iVar23 - iVar9;
                  if (&bStack_19c8 <= pbVar13) {
                    uVar19 = (ulong)(((uVar27 - (int)&bStack_19c8) + (int)pbVar13) - 0x145);
                    uVar16 = (long)pbVar13 - (long)&bStack_19c8;
                    if (uVar19 <= uVar16) {
                      uVar16 = uVar19;
                    }
                    uVar19 = _memset((long)pbVar13 - uVar16,0x30,uVar16 + 1);
                    pbVar25 = (byte *)(((long)pbVar13 - uVar16) + -1);
                  }
                }
              }
              else {
                uVar22 = 0;
                uVar32 = uVar14 >> 3 & 1;
                uVar15 = 1;
                dVar20 = 3.95252516672997e-323;
                uVar14 = uVar12;
code_r0x00763f80:
                if (uVar27 == 0xffffffff) {
                  uVar27 = 1;
                }
                if (dVar35 != 0.0) {
                  pbVar25 = abStack_1884;
                  do {
                    pbVar13 = pbVar25 + -1;
                    *pbVar25 = pcStack_1a08[(ulong)dVar35 & (long)dVar20 - 1U];
                    dVar5 = 0.0;
                    if (dVar20 != 0.0) {
                      dVar5 = (double)((ulong)dVar35 / (ulong)dVar20);
                    }
                    bVar8 = (ulong)dVar20 <= (ulong)dVar35;
                    dVar35 = dVar5;
                    pbVar25 = pbVar13;
                  } while (bVar8);
                }
                uVar11 = 0;
                iVar9 = iVar9 - (int)pbVar13;
                iVar23 = uVar33 - iVar9;
                iVar9 = uVar27 - iVar9;
                if (((uVar15 & uVar32) != 1) || (0 < iVar9)) goto code_r0x00763ff0;
                uVar11 = 0;
                pbVar25 = pbVar13 + -1;
                *pbVar13 = 0x30;
                iVar23 = iVar23 + -1;
              }
              iVar9 = iVar23 + -2;
              if ((uVar22 & uVar32) == 0) {
                iVar9 = iVar23;
              }
              uVar33 = uVar11;
              if ((uVar14 & 3) != 0) {
                uVar33 = 1;
              }
              iVar23 = iVar9 - uVar33;
              iVar24 = iVar23;
              if (((uVar14 & 0x104) == 0) && (iVar24 = iVar23 + -1, 0 < iVar23)) {
                iVar18 = (iVar9 + iVar18) - uVar33;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar9 = iVar23 + -1;
                  bVar8 = 0 < iVar23;
                  iVar23 = iVar9;
                } while (iVar9 != 0 && bVar8);
                iVar24 = -1;
              }
              if (uVar11 == 0) {
                if ((uVar14 >> 1 & 1) != 0) {
                  uVar10 = 0x2b;
                  goto code_r0x007640cc;
                }
                if ((uVar14 & 1) != 0) {
                  uVar10 = 0x20;
                  goto code_r0x007640cc;
                }
              }
              else {
                uVar10 = 0x2d;
code_r0x007640cc:
                uVar19 = (*auVar53._8_8_)(uVar10,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                iVar18 = iVar18 + 1;
              }
              if ((uVar22 & uVar32) != 0) {
                uVar19 = (*auVar53._8_8_)(0x30,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                if ((uVar14 >> 0xc & 1) == 0) {
                  uVar10 = 0x78;
                }
                else {
                  uVar10 = 0x58;
                }
                uVar19 = (*auVar53._8_8_)(uVar10,uVar36);
                if ((int)uVar19 != 0) goto code_r0x0076451c;
                iVar18 = iVar18 + 2;
              }
              iVar9 = iVar24;
              if (((uVar14 & 0x104) == 0x100) && (iVar9 = iVar24 + -1, 0 < iVar24)) {
                iVar18 = iVar18 + iVar24;
                do {
                  uVar19 = (*auVar53._8_8_)(0x30,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar9 = iVar24 + -1;
                  bVar8 = 0 < iVar24;
                  iVar24 = iVar9;
                } while (iVar9 != 0 && bVar8);
                iVar9 = -1;
              }
              if (pbVar25 + 1 <= abStack_1884) {
                iVar18 = ((int)&bStack_19c8 + 0x144 + iVar18) - (int)pbVar25;
                pbVar13 = abStack_1884 + -(long)pbVar25;
                do {
                  pbVar25 = pbVar25 + 1;
                  uVar19 = (*auVar53._8_8_)(*pbVar25,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  pbVar13 = pbVar13 + -1;
                } while (pbVar13 != (byte *)0x0);
              }
              if (((uVar14 >> 2 & 1) != 0) && (0 < iVar9)) {
                iVar18 = iVar9 + iVar18;
                iVar9 = iVar9 + 1;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar9 = iVar9 + -1;
                } while (1 < iVar9);
              }
            }
            else {
              iVar9 = iVar18;
              uVar14 = uVar33;
              if (((uVar12 >> 2 & 1) == 0) && (uVar14 = uVar33 - 1, 1 < (int)uVar33)) {
                iVar9 = uVar14 + iVar18;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  uVar33 = uVar33 - 1;
                } while (1 < (int)uVar33);
                uVar14 = 0;
              }
              uVar19 = (*auVar53._8_8_)(SUB84(dVar35,0) & 0xff,uVar36);
              if ((int)uVar19 != 0) goto code_r0x0076451c;
              iVar18 = iVar9 + 1;
              if (((uVar12 >> 2 & 1) != 0) && (1 < (int)uVar14)) {
                iVar18 = uVar14 + iVar9;
                iVar9 = uVar14 + 1;
                do {
                  uVar19 = (*auVar53._8_8_)(0x20,uVar36);
                  if ((int)uVar19 != 0) goto code_r0x0076451c;
                  iVar9 = iVar9 + -1;
                } while (2 < iVar9);
              }
            }
            break;
          case 9:
            uStack_19e8 = _UNK_008cd86b;
            uStack_19f0 = _UNK_008cd863;
            uStack_19d8 = _UNK_008cd87b;
            uStack_19e0 = _UNK_008cd873;
            lVar28 = _strlen(&uStack_19f0);
            if ((uVar14 & 0x2000) != 0) {
              uVar33 = uVar32;
            }
            if ((uVar14 >> 0xf & 1) == 0) {
              if ((uVar14 >> 2 & 1) != 0) goto code_r0x00764238;
code_r0x00763e64:
              puVar31 = (undefined1 *)((long)&uStack_19f0 + 1);
              puVar30 = (undefined1 *)((long)&uStack_19f0 + 1);
              if ((uVar14 >> 1 & 1) != 0) goto code_r0x00764248;
code_r0x00763e68:
              puVar31 = puVar30;
              if ((uVar14 & 1) != 0) goto code_r0x00764254;
code_r0x00763e6c:
              if ((uVar14 >> 3 & 1) != 0) goto code_r0x00764260;
code_r0x00763e70:
              *puVar31 = 0;
            }
            else {
              uVar27 = auStack_1080[lVar17 * 8 + 1];
              if ((uVar14 >> 2 & 1) == 0) goto code_r0x00763e64;
code_r0x00764238:
              uStack_19f0._0_2_ = CONCAT11(0x2d,(undefined1)uStack_19f0);
              puVar31 = (undefined1 *)((long)&uStack_19f0 + 2);
              puVar30 = (undefined1 *)((long)&uStack_19f0 + 2);
              if ((uVar14 >> 1 & 1) == 0) goto code_r0x00763e68;
code_r0x00764248:
              puVar30 = puVar31 + 1;
              *puVar31 = 0x2b;
              puVar31 = puVar30;
              if ((uVar14 & 1) == 0) goto code_r0x00763e6c;
code_r0x00764254:
              puVar31 = puVar30 + 1;
              *puVar30 = 0x20;
              if ((uVar14 >> 3 & 1) == 0) goto code_r0x00763e70;
code_r0x00764260:
              *puVar31 = 0x23;
              puVar31[1] = 0;
              puVar31 = puVar31 + 1;
            }
            if (-1 < (int)uVar33) {
              auVar53._8_8_ = 0x20 - lVar28;
              auVar53._0_8_ = puVar31;
              goto code_r0x00764560;
            }
            if (-1 < (int)uVar27) {
              for (dVar35 = adStack_1878[uVar16 * 2]; 10.0 <= dVar35; dVar35 = dVar35 / 10.0) {
              }
              iVar9 = func_0x00764560(puVar31,0x20 - lVar28,".%d");
              puVar31 = puVar31 + iVar9;
            }
            puVar30 = puVar31;
            if ((uVar14 >> 5 & 1) != 0) {
              puVar30 = puVar31 + 1;
              *puVar31 = 0x6c;
            }
            if ((uVar14 >> 0x12 & 1) == 0) {
              uVar37 = 0x67;
              if ((uVar14 & 0x1000) != 0) {
                uVar37 = 0x47;
              }
              uVar14 = uVar14 & 0x80000;
              uVar38 = 0x66;
            }
            else {
              uVar14 = uVar14 & 0x1000;
              uVar37 = 0x45;
              uVar38 = 0x65;
            }
            if (uVar14 != 0) {
              uVar38 = uVar37;
            }
            *puVar30 = uVar38;
            puVar30[1] = 0;
            uVar19 = _snprintf(&bStack_19c8,0x146,&uStack_19f0);
            pbVar13 = abStack_19c7;
            bVar21 = bStack_19c8;
            while (bVar21 != 0) {
              uVar19 = (*auVar53._8_8_)(bVar21,uVar36);
              if ((int)uVar19 != 0) goto code_r0x0076451c;
              iVar18 = iVar18 + 1;
              bVar21 = *pbVar13;
              pbVar13 = pbVar13 + 1;
            }
          }
code_r0x00763bd8:
          lVar17 = lVar17 + 1;
        } while (lVar17 < uStack_19f8._4_4_);
      }
code_r0x0076451c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
        return uVar19;
      }
      auVar53 = ___stack_chk_fail();
code_r0x00764560:
      uVar19 = func_0x00762a38(auVar53._0_8_,auVar53._8_8_);
      return uVar19;
    }
    bVar21 = 0x2d;
  }
  *unaff_x21 = bVar21;
  unaff_x26 = unaff_x26 + 1;
  unaff_x20 = (ulong)((int)unaff_x20 + 1);
  unaff_x21 = unaff_x21 + 1;
code_r0x00763258:
  if ((unaff_w25 & 0x104) == 0x100) {
    uVar33 = uVar14 - 1;
    uVar19 = (ulong)uVar33;
    bVar8 = 0 < (int)uVar14;
    uVar14 = uVar33;
    if (bVar8) {
      uVar16 = unaff_x26;
      if (unaff_x26 <= in_stack_00000050) {
        uVar16 = in_stack_00000050;
      }
      uVar3 = uVar19;
      if (uVar16 - unaff_x26 <= uVar19) {
        uVar3 = uVar16 - unaff_x26;
      }
      pbVar25 = unaff_x21;
      if (0xf < uVar3) {
        uVar19 = uVar3 + 1 & 0xf;
        uVar4 = 0x10;
        if (uVar19 != 0) {
          uVar4 = uVar19;
        }
        lVar17 = (uVar3 + 1) - uVar4;
        uVar19 = (ulong)(uVar33 - (int)lVar17);
        unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar17);
        pbVar25 = unaff_x21 + lVar17;
        unaff_x26 = unaff_x26 + lVar17;
        do {
          *(ulong *)(unaff_x21 + 8) =
               CONCAT17(uVar52,CONCAT16(uVar51,CONCAT15(uVar50,CONCAT14(uVar49,CONCAT13(uVar48,
                                                  CONCAT12(uVar47,CONCAT11(uVar46,uVar45)))))));
          *(ulong *)unaff_x21 =
               CONCAT17(uVar44,CONCAT16(uVar43,CONCAT15(uVar42,CONCAT14(uVar41,CONCAT13(uVar40,
                                                  CONCAT12(uVar39,CONCAT11(uVar38,uVar37)))))));
          lVar17 = lVar17 + -0x10;
          unaff_x21 = unaff_x21 + 0x10;
        } while (lVar17 != 0);
      }
      do {
        unaff_x21 = pbVar25;
        if (uVar16 == unaff_x26) goto joined_r0x00763a1c;
        unaff_x21 = pbVar25 + 1;
        *pbVar25 = 0x30;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        iVar18 = (int)uVar19;
        uVar14 = iVar18 - 1;
        uVar19 = (ulong)uVar14;
        pbVar25 = unaff_x21;
      } while (0 < iVar18);
    }
  }
  if (pbVar13 + 1 <= in_x16) {
    pbVar25 = pbVar13 + 1;
    uVar16 = unaff_x26;
    if (unaff_x26 <= in_stack_00000050) {
      uVar16 = in_stack_00000050;
    }
    uVar19 = param_9 - (long)pbVar13;
    if (uVar16 - unaff_x26 <= (ulong)(param_9 - (long)pbVar13)) {
      uVar19 = uVar16 - unaff_x26;
    }
    uVar19 = uVar19 + 1;
    pbVar26 = unaff_x21;
    if (0x10 < uVar19 && (byte *)((long)&MACH_HEADER.filetype + 3) < unaff_x21 + ~(ulong)pbVar13) {
      uVar3 = 0x10;
      if ((uVar19 & 0xf) != 0) {
        uVar3 = uVar19 & 0xf;
      }
      lVar17 = uVar19 - uVar3;
      pbVar13 = pbVar25 + lVar17;
      unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar17);
      pbVar26 = unaff_x21 + lVar17;
      unaff_x26 = unaff_x26 + lVar17;
      do {
        uVar34 = *(undefined8 *)pbVar25;
        *(undefined8 *)(unaff_x21 + 8) = *(undefined8 *)(pbVar25 + 8);
        *(undefined8 *)unaff_x21 = uVar34;
        lVar17 = lVar17 + -0x10;
        pbVar25 = pbVar25 + 0x10;
        unaff_x21 = unaff_x21 + 0x10;
      } while (lVar17 != 0);
      pbVar25 = pbVar13;
    }
    do {
      unaff_x21 = pbVar26;
      if (uVar16 == unaff_x26) goto joined_r0x00763a1c;
      pbVar13 = pbVar25 + 1;
      unaff_x21 = pbVar26 + 1;
      *pbVar26 = *pbVar25;
      unaff_x26 = unaff_x26 + 1;
      unaff_x20 = (ulong)((int)unaff_x20 + 1);
      pbVar25 = pbVar13;
      pbVar26 = unaff_x21;
    } while (pbVar13 != param_8);
  }
  if (((unaff_w25 >> 2 & 1) != 0) && (0 < (int)uVar14)) {
    uVar16 = unaff_x26;
    if (unaff_x26 <= in_stack_00000050) {
      uVar16 = in_stack_00000050;
    }
    uVar19 = (ulong)(uVar14 - 1);
    if (uVar16 - unaff_x26 <= (ulong)(uVar14 - 1)) {
      uVar19 = uVar16 - unaff_x26;
    }
    pbVar13 = unaff_x21;
    if (0xf < uVar19) {
      uVar3 = uVar19 + 1 & 0xf;
      uVar4 = 0x10;
      if (uVar3 != 0) {
        uVar4 = uVar3;
      }
      lVar17 = (uVar19 + 1) - uVar4;
      uVar14 = uVar14 - (int)lVar17;
      unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar17);
      pbVar13 = unaff_x21 + lVar17;
      unaff_x26 = unaff_x26 + lVar17;
      do {
        *(undefined8 *)(unaff_x21 + 8) = uVar10;
        *(undefined8 *)unaff_x21 = uVar36;
        lVar17 = lVar17 + -0x10;
        unaff_x21 = unaff_x21 + 0x10;
      } while (lVar17 != 0);
    }
    iVar18 = uVar14 + 1;
    do {
      unaff_x21 = pbVar13;
      if (uVar16 == unaff_x26) goto joined_r0x00763a1c;
      unaff_x21 = pbVar13 + 1;
      *pbVar13 = in_w15;
      unaff_x26 = unaff_x26 + 1;
      unaff_x20 = (ulong)((int)unaff_x20 + 1);
      iVar18 = iVar18 + -1;
      pbVar13 = unaff_x21;
    } while (1 < iVar18);
  }
code_r0x00762b38:
  do {
    unaff_x27 = unaff_x27 + 1;
    uVar16 = unaff_x26;
    if (in_stack_00000058._4_4_ <= unaff_x27) goto joined_r0x00763a1c;
    piVar2 = (int *)(param_12 + unaff_x27 * 0x20);
    lVar17 = *(long *)(piVar2 + 6);
    if (lVar17 != 0) {
      pbVar13 = *(byte **)(piVar2 + 4);
      uVar19 = unaff_x26 + lVar17;
      iVar18 = (int)lVar17;
      iVar9 = (int)unaff_x20;
      if (unaff_x26 <= in_stack_00000050) {
        uVar16 = in_stack_00000050;
      }
      do {
        if (*pbVar13 == 0) goto code_r0x00762ba0;
        if (uVar16 == unaff_x26) goto joined_r0x00763a1c;
        pbVar25 = unaff_x21 + 1;
        *unaff_x21 = *pbVar13;
        unaff_x26 = unaff_x26 + 1;
        pbVar13 = pbVar13 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        lVar17 = lVar17 + -1;
        unaff_x21 = pbVar25;
      } while (lVar17 != 0);
      unaff_x20 = (ulong)(uint)(iVar9 + iVar18);
      unaff_x26 = uVar19;
code_r0x00762ba0:
      if ((*(byte *)((long)piVar2 + 10) >> 4 & 1) != 0) goto code_r0x00762b38;
    }
    if (*(uint *)(unaff_x30 + (ulong)*(uint *)(param_12 + unaff_x27 * 0x20 + 0xc) * 0x10) < 10) {
                    /* WARNING: Could not recover jumptable at 0x00762c28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar19 = (*(code *)(&UNK_00762c2c +
                         (ulong)(byte)param_5[*(uint *)(unaff_x30 +
                                                       (ulong)*(uint *)(param_12 +
                                                                       unaff_x27 * 0x20 + 0xc) *
                                                       0x10)] * 4))();
      return uVar19;
    }
  } while( true );
}

