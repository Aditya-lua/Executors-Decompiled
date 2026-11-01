
undefined8 FUN_0076d800(void)

{
  int iVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  int *piVar6;
  undefined4 *puVar7;
  ulong uVar8;
  byte bVar9;
  byte bVar10;
  uint uVar11;
  byte *pbVar12;
  uint uVar13;
  uint unaff_w19;
  byte *pbVar14;
  byte *unaff_x20;
  undefined *unaff_x21;
  undefined8 *puVar15;
  long lVar16;
  uint unaff_w22;
  int unaff_w23;
  int unaff_w24;
  int unaff_w25;
  undefined8 uVar17;
  ulong unaff_x27;
  long unaff_x28;
  byte *in_stack_00000000;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  int iStack0000000000000018;
  uint uStack000000000000001c;
  int iStack0000000000000020;
  int iStack0000000000000024;
  undefined8 uStack0000000000000028;
  
  do {
    puVar15 = (undefined8 *)(unaff_x21 + 0x188);
    if (unaff_x27 < 4) {
      puVar15 = (undefined8 *)&UNK_00a1f0f0;
      if (unaff_x27 != 3) goto LAB_0076d668;
    }
    uVar17 = *puVar15;
    uVar8 = _strlen(uVar17);
    if ((uVar8 == unaff_x27) && (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0)) {
      iStack0000000000000020 = 0;
      pbVar14 = unaff_x20 + unaff_x27;
    }
    else {
      uVar17 = puVar15[1];
      uVar8 = _strlen(uVar17);
      if ((uVar8 == unaff_x27) && (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0))
      {
        iStack0000000000000020 = 1;
        pbVar14 = unaff_x20 + unaff_x27;
      }
      else {
        uVar17 = puVar15[2];
        uVar8 = _strlen(uVar17);
        if ((uVar8 == unaff_x27) &&
           (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0)) {
          iStack0000000000000020 = 2;
          pbVar14 = unaff_x20 + unaff_x27;
        }
        else {
          uVar17 = puVar15[3];
          uVar8 = _strlen(uVar17);
          if ((uVar8 == unaff_x27) &&
             (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0)) {
            iStack0000000000000020 = 3;
            pbVar14 = unaff_x20 + unaff_x27;
          }
          else {
            uVar17 = puVar15[4];
            uVar8 = _strlen(uVar17);
            if ((uVar8 == unaff_x27) &&
               (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0)) {
              iStack0000000000000020 = 4;
              pbVar14 = unaff_x20 + unaff_x27;
            }
            else {
              uVar17 = puVar15[5];
              uVar8 = _strlen(uVar17);
              if ((uVar8 == unaff_x27) &&
                 (iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27), iVar5 != 0)) {
                iStack0000000000000020 = 5;
                pbVar14 = unaff_x20 + unaff_x27;
              }
              else {
                uVar17 = puVar15[6];
                uVar8 = _strlen(uVar17);
                if (uVar8 != unaff_x27) goto LAB_0076d668;
                iVar5 = func_0x0077e76c(unaff_x20,uVar17,unaff_x27);
                if (iVar5 == 0) goto LAB_0076d668;
                iStack0000000000000020 = 6;
                pbVar14 = unaff_x20 + unaff_x27;
              }
            }
          }
        }
      }
    }
LAB_0076db3c:
    bVar9 = *pbVar14;
    if ((bVar9 == 0) || (uVar11 = unaff_w22 + 1, 4 < unaff_w22)) {
      bVar4 = uStack000000000000001c != 0xffffffff;
      iVar5 = 0;
      if (bVar4) {
        iVar5 = iStack0000000000000018;
      }
      uVar11 = 0;
      if (bVar4) {
        uVar11 = in_stack_00000010._4_4_;
      }
      uVar13 = 0;
      if (bVar4) {
        uVar13 = uStack000000000000001c;
      }
      if (unaff_w25 == -1) {
        return 0xffffffff;
      }
      if (unaff_w24 == -1) {
        return 0xffffffff;
      }
      if (unaff_w23 == -1) {
        return 0xffffffff;
      }
      if (unaff_w23 < 0x62f) {
        return 0xffffffff;
      }
      if (0x1f < unaff_w25) {
        return 0xffffffff;
      }
      if (0xb < unaff_w24) {
        return 0xffffffff;
      }
      if (0x17 < iVar5) {
        return 0xffffffff;
      }
      if (0x3b < (int)uVar11) {
        return 0xffffffff;
      }
      if (0x3c < (int)uVar13) {
        return 0xffffffff;
      }
      uVar2 = unaff_w23 - (uint)(unaff_w24 < 2);
      iVar1 = 0;
      if (iStack0000000000000024 != -1) {
        iVar1 = iStack0000000000000024;
      }
      *in_stack_00000008 =
           (long)iVar1 + (long)(int)uVar13 +
           ((((long)unaff_w25 + (long)(unaff_w23 + -0x7b2) * 0x16d +
              (long)(int)((uVar2 / 400 - uVar2 / 100) + (uVar2 >> 2) + -0x1dd) +
             (long)*(int *)(&UNK_008cdc54 + (long)unaff_w24 * 4)) * 0x18 + (long)iVar5) * 0x3c +
            (long)(int)uVar11 + -0x5a0) * 0x3c;
      return 0;
    }
    bVar10 = (bVar9 & 0xdf) + 0xbf;
    unaff_x20 = pbVar14;
    if (9 < (byte)(bVar9 - 0x30) && 0x19 < bVar10) {
      do {
        pbVar14 = pbVar14 + 1;
        bVar9 = *pbVar14;
        bVar10 = (bVar9 & 0xdf) + 0xbf;
        unaff_x20 = pbVar14;
      } while (((bVar10 >= 0x1a && bVar9 != 0) && 8 < (byte)(bVar9 - 0x30)) &&
               ((bVar10 < 0x1a || bVar9 == 0) || (byte)(bVar9 - 0x30) != 9));
    }
    unaff_w22 = uVar11;
    if (0x19 < bVar10) {
      pbVar14 = unaff_x20;
      if ((bVar9 - 0x30 & 0xff) < 10) {
        if (uStack000000000000001c == 0xffffffff) {
          iVar1 = bVar9 - 0x30;
          pbVar12 = unaff_x20 + 1;
          iVar5 = (*pbVar12 - 0x30) + iVar1 * 10;
          if (*pbVar12 - 0x30 < 10) {
            pbVar12 = unaff_x20 + 2;
          }
          else {
            iVar5 = iVar1;
          }
          if (((iVar5 < 0x18) && (*pbVar12 == 0x3a)) && (uVar11 = pbVar12[1] - 0x30, uVar11 < 10)) {
            pbVar14 = pbVar12 + 2;
            bVar9 = *pbVar14;
            if (bVar9 - 0x30 < 10) {
              uVar11 = ((uint)bVar9 + uVar11 * 10) - 0x30;
              if (0x3b < uVar11) goto code_r0x0076d77c;
              pbVar14 = pbVar12 + 3;
              bVar9 = *pbVar14;
            }
            if ((bVar9 == 0x3a) && (uVar13 = pbVar14[1] - 0x30, uVar13 < 10)) {
              pbVar12 = pbVar14 + 2;
              if (*pbVar12 - 0x30 < 10) {
                uVar13 = ((uint)*pbVar12 + uVar13 * 10) - 0x30;
                if (0x3c < uVar13) goto code_r0x0076d77c;
                pbVar12 = pbVar14 + 3;
              }
              pbVar14 = pbVar12;
              in_stack_00000010._4_4_ = uVar11;
              iStack0000000000000018 = iVar5;
              uStack000000000000001c = uVar13;
            }
            else {
              uStack000000000000001c = 0;
              in_stack_00000010._4_4_ = uVar11;
              iStack0000000000000018 = iVar5;
            }
            goto LAB_0076db3c;
          }
        }
code_r0x0076d77c:
        piVar6 = (int *)___error();
        iVar5 = *piVar6;
        puVar7 = (undefined4 *)___error();
        *puVar7 = 0;
        lVar16 = _strtol(unaff_x20,&uStack0000000000000028,10);
        piVar6 = (int *)___error();
        iVar1 = *piVar6;
        piVar6 = (int *)___error();
        if (*piVar6 != iVar5) {
          piVar6 = (int *)___error();
          *piVar6 = iVar5;
        }
        if ((iVar1 != 0) || (lVar16 - 0x80000000U < 0xffffffff00000000)) {
          return 0xffffffff;
        }
        iVar5 = func_0x0078bbd8(lVar16);
        lVar16 = (long)uStack0000000000000028 - (long)unaff_x20;
        if (iStack0000000000000024 == -1) {
          bVar9 = 0;
          iStack0000000000000024 = -1;
          if (((in_stack_00000000 < unaff_x20) && (lVar16 == 4)) && (iVar5 < 0x579)) {
            bVar9 = unaff_x20[-1];
            if ((bVar9 == 0x2d) || (bVar9 == 0x2b)) {
              iVar1 = iVar5 + (iVar5 / 100) * -0x28;
              iStack0000000000000024 = iVar1 * -0x3c;
              if (bVar9 != 0x2b) {
                iStack0000000000000024 = iVar1 * 0x3c;
              }
              bVar9 = 1;
            }
            else {
              bVar9 = 0;
              iStack0000000000000024 = -1;
            }
            lVar16 = 4;
          }
        }
        else {
          bVar9 = 0;
        }
        if (((lVar16 == 8) && (unaff_w23 == -1)) && ((unaff_w24 == -1 && (unaff_w25 == -1)))) {
          unaff_w23 = iVar5 / 10000;
          unaff_w24 = (int)(short)((short)iVar5 + (short)unaff_w23 * -10000) / 100 + -1;
          unaff_w25 = iVar5 % 100;
          bVar9 = 1;
        }
        bVar4 = iVar5 - 1U < 0x1f;
        iVar1 = iVar5;
        if (!bVar4) {
          iVar1 = -1;
        }
        bVar3 = (bool)(unaff_w19 == 0 & (bVar9 ^ 1) & unaff_w25 == -1);
        if (bVar3) {
          unaff_w19 = 1;
          unaff_w25 = iVar1;
        }
        bVar4 = (bool)(bVar9 | bVar3 & bVar4);
        pbVar14 = uStack0000000000000028;
        if (((bVar4) || (unaff_w19 != 1)) || (unaff_w23 != -1)) {
          if (!bVar4) {
            return 0xffffffff;
          }
        }
        else {
          if (iVar5 < 100) {
            if (iVar5 < 0x47) {
              iVar5 = iVar5 + 2000;
            }
            else {
              iVar5 = iVar5 + 0x76c;
            }
          }
          unaff_w19 = (uint)(unaff_w25 != -1);
          unaff_w23 = iVar5;
        }
      }
      goto LAB_0076db3c;
    }
    for (unaff_x27 = 0;
        (((byte)(bVar9 + 0x9f) < 0x1a || (('@' < (char)bVar9 && (bVar9 < 0x5b)))) &&
        (unaff_x27 < 0xc)); unaff_x27 = unaff_x27 + 1) {
      bVar9 = unaff_x20[unaff_x27 + 1];
    }
    if (unaff_x27 == 0xc) {
      return 0xffffffff;
    }
    if (iStack0000000000000020 != -1) {
LAB_0076d668:
      if ((unaff_w24 == -1) && (unaff_x27 == 3)) {
        iVar5 = func_0x0077e76c(unaff_x20,"Jan",3);
        if (iVar5 == 0) {
          iVar5 = func_0x0077e76c(unaff_x20,"Feb",3);
          if (iVar5 == 0) {
            iVar5 = func_0x0077e76c(unaff_x20,"Mar",3);
            if (iVar5 == 0) {
              iVar5 = func_0x0077e76c(unaff_x20,"Apr",3);
              if (iVar5 == 0) {
                iVar5 = func_0x0077e76c(unaff_x20,"May",3);
                if (iVar5 == 0) {
                  iVar5 = func_0x0077e76c(unaff_x20,"Jun",3);
                  if (iVar5 == 0) {
                    iVar5 = func_0x0077e76c(unaff_x20,"Jul",3);
                    if (iVar5 == 0) {
                      iVar5 = func_0x0077e76c(unaff_x20,"Aug",3);
                      if (iVar5 == 0) {
                        iVar5 = func_0x0077e76c(unaff_x20,"Sep",3);
                        if (iVar5 == 0) {
                          iVar5 = func_0x0077e76c(unaff_x20,"Oct",3);
                          if (iVar5 == 0) {
                            iVar5 = func_0x0077e76c(unaff_x20,"Nov",3);
                            if (iVar5 == 0) {
                              iVar5 = func_0x0077e76c(unaff_x20,"Dec",3);
                              if (iVar5 == 0) goto code_r0x0076dcf0;
                              unaff_w24 = 0xb;
                              pbVar14 = unaff_x20 + 3;
                            }
                            else {
                              unaff_w24 = 10;
                              pbVar14 = unaff_x20 + 3;
                            }
                          }
                          else {
                            unaff_w24 = 9;
                            pbVar14 = unaff_x20 + 3;
                          }
                        }
                        else {
                          unaff_w24 = 8;
                          pbVar14 = unaff_x20 + 3;
                        }
                      }
                      else {
                        unaff_w24 = 7;
                        pbVar14 = unaff_x20 + 3;
                      }
                    }
                    else {
                      unaff_w24 = 6;
                      pbVar14 = unaff_x20 + 3;
                    }
                  }
                  else {
                    unaff_w24 = 5;
                    pbVar14 = unaff_x20 + 3;
                  }
                }
                else {
                  unaff_w24 = 4;
                  pbVar14 = unaff_x20 + 3;
                }
              }
              else {
                unaff_w24 = 3;
                pbVar14 = unaff_x20 + 3;
              }
            }
            else {
              unaff_w24 = 2;
              pbVar14 = unaff_x20 + 3;
            }
          }
          else {
            unaff_w24 = 1;
            pbVar14 = unaff_x20 + 3;
          }
        }
        else {
          unaff_w24 = 0;
          pbVar14 = unaff_x20 + 3;
        }
      }
      else {
code_r0x0076dcf0:
        if (iStack0000000000000024 != -1) {
          return 0xffffffff;
        }
        if (4 < unaff_x27) {
          return 0xffffffff;
        }
        lVar16 = 0;
        while( true ) {
          uVar8 = _strlen(unaff_x28 + lVar16);
          if ((uVar8 == unaff_x27) &&
             (iVar5 = func_0x0077e76c(unaff_x20,unaff_x28 + lVar16,unaff_x27), iVar5 != 0)) break;
          lVar16 = lVar16 + 0xc;
          if ((int)lVar16 == 0x33c) {
            return 0xffffffff;
          }
        }
        iStack0000000000000024 = *(int *)(unaff_x28 + lVar16 + 8) * 0x3c;
        pbVar14 = unaff_x20 + unaff_x27;
      }
      goto LAB_0076db3c;
    }
    unaff_x21 = &UNK_00a1f000;
  } while( true );
}

