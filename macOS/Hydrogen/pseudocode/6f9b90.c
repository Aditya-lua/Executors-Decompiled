
/* WARNING: Possible PIC construction at 0x006f981c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006f9ebc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006f9ee4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006f9dd8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006f9b08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006f9ddc) */
/* WARNING: Removing unreachable block (ram,0x006f9ee8) */
/* WARNING: Removing unreachable block (ram,0x006f9ec0) */
/* WARNING: Removing unreachable block (ram,0x006f9820) */
/* WARNING: Removing unreachable block (ram,0x006f9b0c) */
/* WARNING: Removing unreachable block (ram,0x006f9b78) */

byte * FUN_006f9b90(void)

{
  long *plVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  undefined4 uVar7;
  ulong uVar8;
  ulong uVar9;
  byte *pbVar10;
  undefined8 uVar11;
  int *unaff_x19;
  byte *unaff_x20;
  byte *unaff_x21;
  byte *pbVar12;
  byte bVar13;
  byte unaff_w23;
  byte *pbVar14;
  long lVar15;
  long unaff_x26;
  byte *pbVar16;
  bool bVar17;
  byte *pbVar18;
  byte *pbVar19;
  undefined1 auVar20 [16];
  
code_r0x006f9b90:
  if ((unaff_w23 & 1) != 0) {
LAB_006f97a4:
    pbVar10 = *(byte **)(unaff_x19 + 6);
    if (unaff_x21 == pbVar10) {
      pbVar10 = unaff_x20;
      goto code_r0x006f9fb4;
    }
    bVar3 = *unaff_x21;
    bVar13 = bVar3;
    switch(bVar3) {
    case 0x24:
      pbVar16 = unaff_x21 + 1;
      if (pbVar16 == pbVar10) {
        if (unaff_x20 != *(byte **)(unaff_x19 + 4)) {
          unaff_x20 = (byte *)0x0;
        }
        pbVar10 = unaff_x20;
        goto code_r0x006f9fb4;
      }
      pbVar10 = *(byte **)(unaff_x19 + 4);
      break;
    case 0x25:
      bVar2 = unaff_x21[1];
      if ((char)bVar2 != 0x66) {
        if ((int)(char)bVar2 - 0x30U < 10) {
          uVar6 = bVar2 - 0x31;
          if (((0x30 < bVar2) && ((int)uVar6 < unaff_x19[10])) &&
             (uVar9 = *(ulong *)(unaff_x19 + (ulong)uVar6 * 4 + 0xe), uVar9 != 0xffffffffffffffff))
          {
            if ((uVar9 <= (ulong)(*(long *)(unaff_x19 + 4) - (long)unaff_x20)) &&
               (iVar5 = _memcmp(*(undefined8 *)(unaff_x19 + (ulong)uVar6 * 4 + 0xc),unaff_x20,uVar9)
               , iVar5 == 0 && unaff_x20 != (byte *)0x0)) goto code_r0x006f9bf0;
            goto LAB_006f9f74;
          }
          goto code_r0x006fa048;
        }
        if (bVar2 != 0x62) {
          if (unaff_x21 + 1 != pbVar10) {
            pbVar16 = unaff_x21 + 2;
            pbVar10 = *(byte **)(unaff_x19 + 4);
            break;
          }
          goto code_r0x006fa028;
        }
        if (unaff_x21 + 2 < pbVar10 + -1) {
          bVar3 = *unaff_x20;
          if ((bVar3 == unaff_x21[2]) && (unaff_x20 + 1 < *(byte **)(unaff_x19 + 4))) {
            uVar9 = ~(ulong)unaff_x20;
            unaff_x20 = unaff_x20 + 2;
            pbVar16 = *(byte **)(unaff_x19 + 4) + uVar9;
            iVar5 = 1;
            do {
              if (unaff_x20[-1] == unaff_x21[3]) {
                iVar5 = iVar5 + -1;
                if (iVar5 == 0) goto code_r0x006f9c90;
              }
              else if (unaff_x20[-1] == bVar3) {
                iVar5 = iVar5 + 1;
              }
              unaff_x20 = unaff_x20 + 1;
              pbVar16 = pbVar16 + -1;
              pbVar10 = (byte *)0x0;
              if (pbVar16 == (byte *)0x0) goto code_r0x006f9fb4;
            } while( true );
          }
          goto LAB_006f9f74;
        }
        goto code_r0x006fa080;
      }
      pbVar14 = unaff_x21 + 2;
      if (*pbVar14 != 0x5b) goto code_r0x006fa038;
      pbVar16 = unaff_x21 + 3;
      bVar3 = *pbVar16;
      pbVar18 = pbVar16;
      if (bVar3 == 0x5e) {
        pbVar18 = unaff_x21 + 4;
      }
      do {
        if (pbVar18 == pbVar10) goto code_r0x006fa008;
        pbVar19 = pbVar18 + 2;
        if (*pbVar18 == 0x25 && pbVar18 + 1 < pbVar10) {
          lVar15 = unaff_x26 + 1;
        }
        else {
          pbVar19 = pbVar18 + 1;
          lVar15 = unaff_x26;
        }
        pbVar12 = pbVar18 + lVar15;
        pbVar18 = pbVar19;
      } while (*pbVar12 != 0x5d);
      if (unaff_x20 == *(byte **)(unaff_x19 + 2)) {
        bVar13 = 0;
      }
      else {
        bVar13 = unaff_x20[-1];
      }
      bVar4 = bVar3 != 0x5e;
      pbVar10 = pbVar16;
      if (bVar4) {
        pbVar10 = pbVar14;
      }
      do {
        while( true ) {
          bVar17 = bVar3 == 0x5e;
          if (pbVar19 <= pbVar10 + 1) goto code_r0x006f9ad8;
          bVar2 = pbVar10[1];
          bVar17 = bVar4;
          if (bVar2 == 0x25) break;
          pbVar18 = pbVar10 + 3;
          if (pbVar10[2] == 0x2d && pbVar18 < pbVar19) {
            pbVar10 = pbVar18;
            if ((bVar2 <= bVar13) && (bVar13 <= *pbVar18)) goto code_r0x006f9ad8;
          }
          else {
            pbVar10 = pbVar10 + 1;
            if (bVar2 == bVar13) goto code_r0x006f9ad8;
          }
        }
        iVar5 = func_0x006fa090(bVar13);
        pbVar10 = pbVar10 + 2;
      } while (iVar5 == 0);
code_r0x006f9ad8:
      if (bVar17) goto LAB_006f9f74;
      unaff_w23 = *pbVar16 != 0x5e;
      if ((bool)unaff_w23) {
        pbVar16 = pbVar14;
      }
      pbVar10 = pbVar16 + 1;
      if (pbVar10 < pbVar19) {
        bVar3 = *unaff_x20;
        auVar20._1_7_ = 0;
        auVar20[0] = bVar3;
        do {
          pbVar14 = pbVar16 + 2;
          auVar20[8] = *pbVar14;
          auVar20._9_7_ = 0;
          bVar13 = pbVar16[1];
          if (bVar13 == 0x25) goto code_r0x006fa090;
          pbVar16 = pbVar16 + 3;
          if (*pbVar14 == 0x2d && pbVar16 < pbVar19) {
            if ((bVar13 <= bVar3) && (bVar3 <= *pbVar16)) {
              unaff_x21 = pbVar19 + 1;
              if (!(bool)unaff_w23) goto LAB_006f9f74;
              goto LAB_006f97a4;
            }
          }
          else {
            pbVar16 = pbVar10;
            if (bVar13 == bVar3) {
              unaff_x21 = pbVar19 + 1;
              goto code_r0x006f9b90;
            }
          }
          pbVar10 = pbVar16 + 1;
        } while (pbVar10 < pbVar19);
      }
      unaff_x21 = pbVar19 + 1;
      if ((bool)unaff_w23) goto LAB_006f9f74;
      goto LAB_006f97a4;
    default:
      pbVar16 = unaff_x21 + 1;
      if (bVar3 == 0x5b) {
        pbVar14 = unaff_x21 + 2;
        if (unaff_x21[1] != 0x5e) {
          pbVar14 = pbVar16;
        }
        do {
          pbVar16 = unaff_x21;
          if (pbVar14 == pbVar10) goto code_r0x006fa008;
          pbVar16 = pbVar14 + 2;
          if (*pbVar14 == 0x25 && pbVar14 + 1 < pbVar10) {
            lVar15 = unaff_x26 + 1;
          }
          else {
            pbVar16 = pbVar14 + 1;
            lVar15 = unaff_x26;
          }
          pbVar18 = pbVar14 + lVar15;
          pbVar14 = pbVar16;
        } while (*pbVar18 != 0x5d);
        pbVar16 = pbVar16 + 1;
        pbVar10 = *(byte **)(unaff_x19 + 4);
        bVar13 = 0x5b;
      }
      else {
        pbVar10 = *(byte **)(unaff_x19 + 4);
      }
      break;
    case 0x28:
      iVar5 = unaff_x19[10];
      if (unaff_x21[1] == 0x29) {
        if (0x1f < iVar5) goto code_r0x006fa070;
        uVar11 = 0xfffffffffffffffe;
      }
      else {
        if (0x1f < iVar5) goto code_r0x006fa070;
        uVar11 = 0xffffffffffffffff;
      }
      *(byte **)(unaff_x19 + (long)iVar5 * 4 + 0xc) = unaff_x20;
      *(undefined8 *)(unaff_x19 + (long)iVar5 * 4 + 0xe) = uVar11;
      unaff_x19[10] = iVar5 + 1;
      pbVar10 = (byte *)func_0x006f9748();
      if (pbVar10 == (byte *)0x0) {
        unaff_x19[10] = unaff_x19[10] + -1;
      }
      goto code_r0x006f9fb4;
    case 0x29:
      uVar9 = (ulong)(uint)unaff_x19[10];
      lVar15 = uVar9 * 0x10 + 0x28;
      goto code_r0x006f9cdc;
    }
    if (pbVar10 <= unaff_x20) {
code_r0x006f9a30:
      pbVar10 = (byte *)0x0;
      if ((0x3f < *pbVar16) || ((unaff_x26 << ((ulong)*pbVar16 & 0x3f) & 0x8000240000000000U) == 0))
      goto code_r0x006f9fb4;
      unaff_x21 = pbVar16 + 1;
      goto LAB_006f97a4;
    }
    pbVar14 = unaff_x21 + 1;
    bVar2 = *unaff_x20;
    if (bVar3 == 0x5b) {
      pbVar18 = pbVar16 + -1;
      bVar4 = unaff_x21[1] == 0x5e;
      pbVar10 = pbVar14;
      if (!bVar4) {
        pbVar10 = unaff_x21;
      }
      pbVar19 = pbVar10 + 1;
      if (pbVar19 < pbVar18) {
        do {
          pbVar12 = pbVar10 + 2;
          bVar3 = *pbVar12;
          bVar13 = pbVar10[1];
          if (bVar13 == 0x25) {
            iVar5 = func_0x006fa090(CONCAT71(0,bVar2));
            if (iVar5 != 0) goto code_r0x006f99f4;
          }
          else {
            pbVar12 = pbVar10 + 3;
            if (bVar3 == 0x2d && pbVar12 < pbVar18) {
              if ((bVar13 <= bVar2) && (bVar2 <= *pbVar12)) goto code_r0x006f99f4;
            }
            else {
              pbVar12 = pbVar19;
              if (bVar13 == bVar2) {
code_r0x006f99f4:
                bVar4 = !bVar4;
                break;
              }
            }
          }
          pbVar19 = pbVar12 + 1;
          pbVar10 = pbVar12;
        } while (pbVar19 < pbVar18);
      }
code_r0x006f9a04:
      if (!bVar4) goto code_r0x006f9a30;
    }
    else if (bVar3 != 0x2e) {
      if (bVar3 != 0x25) {
        bVar4 = bVar13 == bVar2;
        goto code_r0x006f9a04;
      }
      auVar20[8] = *pbVar14;
      auVar20._0_8_ = CONCAT71(0,bVar2);
      auVar20._9_7_ = 0;
      goto code_r0x006fa090;
    }
    bVar3 = *pbVar16;
    if (bVar3 == 0x3f) {
      unaff_x21 = pbVar16 + 1;
      pbVar10 = (byte *)func_0x006f9748();
      if (pbVar10 != (byte *)0x0) goto code_r0x006f9fb4;
      goto LAB_006f97a4;
    }
    if (bVar3 != 0x2a) {
      if (bVar3 != 0x2b) {
        if (bVar3 == 0x2d) {
          pbVar10 = (byte *)func_0x006f9748();
          if (pbVar10 != (byte *)0x0) goto code_r0x006f9fb4;
          goto code_r0x006f9e88;
        }
        unaff_x20 = unaff_x20 + 1;
        unaff_x21 = pbVar16;
        goto LAB_006f97a4;
      }
      unaff_x20 = unaff_x20 + 1;
    }
    if (unaff_x20 < *(byte **)(unaff_x19 + 4)) {
      lVar15 = 0;
      pbVar16 = pbVar16 + -1;
      pbVar10 = unaff_x20;
      goto code_r0x006f9d78;
    }
    lVar15 = 0;
    goto code_r0x006f9f54;
  }
LAB_006f9f74:
  pbVar10 = (byte *)0x0;
  goto code_r0x006f9fb4;
  while( true ) {
    uVar9 = uVar9 - 1;
    plVar1 = (long *)((long)unaff_x19 + lVar15);
    lVar15 = lVar15 + -0x10;
    if (*plVar1 == -1) break;
code_r0x006f9cdc:
    if ((int)uVar9 < 1) goto code_r0x006fa018;
  }
  *(long *)(unaff_x19 + (uVar9 & 0xffffffff) * 4 + 0xe) =
       (long)unaff_x20 - *(long *)(unaff_x19 + (uVar9 & 0xffffffff) * 4 + 0xc);
  pbVar10 = (byte *)func_0x006f9748();
  if (pbVar10 == (byte *)0x0) {
    *(long *)(unaff_x19 + (uVar9 & 0xffffffff) * 4 + 0xe) = -1;
  }
  goto code_r0x006f9fb4;
code_r0x006f9bf0:
  unaff_x20 = unaff_x20 + uVar9;
  unaff_x21 = unaff_x21 + 2;
  goto LAB_006f97a4;
code_r0x006f9c90:
  unaff_x21 = unaff_x21 + 4;
  goto LAB_006f97a4;
code_r0x006fa008:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"malformed pattern (missing \']\')");
  unaff_x21 = pbVar16;
  goto code_r0x006fa018;
code_r0x006f9e88:
  do {
    if (*(byte **)(unaff_x19 + 4) <= unaff_x20) goto LAB_006f9f74;
    bVar3 = *unaff_x20;
    bVar13 = *unaff_x21;
    if (bVar13 == 0x5b) {
      bVar4 = unaff_x21[1] == 0x5e;
      pbVar10 = pbVar14;
      if (!bVar4) {
        pbVar10 = unaff_x21;
      }
      do {
        while( true ) {
          pbVar18 = pbVar10 + 1;
          if (pbVar16 + -1 <= pbVar18) goto code_r0x006f9e6c;
          pbVar19 = pbVar10 + 2;
          auVar20[8] = *pbVar19;
          auVar20._0_8_ = CONCAT71(0,bVar3);
          auVar20._9_7_ = 0;
          bVar13 = pbVar10[1];
          if (bVar13 == 0x25) goto code_r0x006fa090;
          pbVar10 = pbVar10 + 3;
          if (*pbVar19 == 0x2d && pbVar10 < pbVar16 + -1) break;
          pbVar10 = pbVar18;
          if (bVar13 == bVar3) goto code_r0x006f9f44;
        }
      } while ((bVar3 < bVar13) || (*pbVar10 < bVar3));
code_r0x006f9f44:
      bVar4 = !bVar4;
code_r0x006f9e6c:
      if (!bVar4) goto LAB_006f9f74;
    }
    else if (bVar13 != 0x2e) {
      if (bVar13 != 0x25) {
        bVar4 = bVar13 == bVar3;
        goto code_r0x006f9e6c;
      }
      auVar20[8] = *pbVar14;
      auVar20._0_8_ = CONCAT71(0,bVar3);
      auVar20._9_7_ = 0;
      goto code_r0x006fa090;
    }
    unaff_x20 = unaff_x20 + 1;
    pbVar10 = (byte *)func_0x006f9748();
  } while (pbVar10 == (byte *)0x0);
  goto code_r0x006f9fb4;
code_r0x006fa018:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"invalid pattern capture");
code_r0x006fa028:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"malformed pattern (ends with \'%%\')");
code_r0x006fa038:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"missing \'[\' after \'%%f\' in pattern");
code_r0x006fa048:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"invalid capture index %%%d");
  func_0x006e644c(unaff_x21,"pattern too complex");
code_r0x006fa070:
  func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),"too many captures");
code_r0x006fa080:
  auVar20 = func_0x006e644c(*(undefined8 *)(unaff_x19 + 8),
                            "malformed pattern (missing arguments to \'%%b\')");
code_r0x006fa090:
  uVar8 = auVar20._8_8_;
  uVar9 = auVar20._0_8_;
  uVar7 = ___tolower(uVar8);
  uVar6 = auVar20._0_4_;
  switch(uVar7) {
  case 0x61:
    if (uVar6 < 0x80) {
      uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x100;
    }
    else {
      uVar11 = 0x100;
code_r0x006fa18c:
      uVar6 = ___maskrune(uVar9,uVar11);
    }
    break;
  default:
    return (byte *)(ulong)(auVar20._8_4_ == uVar6);
  case 99:
    if (0x7f < uVar6) {
      uVar11 = 0x200;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x200;
    break;
  case 100:
    if (uVar6 < 0x100) {
      uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) >> 10 &
              1;
      goto code_r0x006fa198;
    }
    goto code_r0x006fa1f8;
  case 0x67:
    if (0x7f < uVar6) {
      uVar11 = 0x800;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x800;
    break;
  case 0x6c:
    if (0x7f < uVar6) {
      uVar11 = 0x1000;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x1000;
    break;
  case 0x70:
    if (0x7f < uVar6) {
      uVar11 = 0x2000;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x2000;
    break;
  case 0x73:
    if (0x7f < uVar6) {
      uVar11 = 0x4000;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x4000;
    break;
  case 0x75:
    if (0x7f < uVar6) {
      uVar11 = 0x8000;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x8000;
    break;
  case 0x77:
    if (0x7f < uVar6) {
      uVar11 = 0x500;
      goto code_r0x006fa18c;
    }
    uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) & 0x500;
    break;
  case 0x78:
    if (uVar6 < 0x100) {
      uVar6 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (uVar9 & 0xffffffff) * 4 + 0x3c) >> 0x10
              & 1;
      goto code_r0x006fa198;
    }
code_r0x006fa1f8:
    uVar6 = 0;
    goto code_r0x006fa198;
  case 0x7a:
    uVar6 = (uint)(uVar6 == 0);
    goto code_r0x006fa198;
  }
  uVar6 = (uint)(uVar6 != 0);
code_r0x006fa198:
  if (auVar20._8_4_ < 0x80) {
    return (byte *)(ulong)(uVar6 ^ (*(uint *)(PTR___DefaultRuneLocale_009b0028 +
                                             (uVar8 & 0xffffffff) * 4 + 0x3c) & 0x1000) == 0);
  }
  iVar5 = ___maskrune(uVar8,0x1000);
  return (byte *)(ulong)(uVar6 ^ iVar5 == 0);
  while( true ) {
    lVar15 = lVar15 + 1;
    pbVar10 = unaff_x20 + lVar15;
    if (*(byte **)(unaff_x19 + 4) <= pbVar10) break;
code_r0x006f9d78:
    bVar3 = *pbVar10;
    bVar13 = *unaff_x21;
    if (bVar13 == 0x5b) {
      bVar4 = unaff_x21[1] == 0x5e;
      uVar6 = (uint)bVar4;
      pbVar10 = pbVar14;
      if (!bVar4) {
        pbVar10 = unaff_x21;
      }
      pbVar18 = pbVar10 + 1;
      if (pbVar18 < pbVar16) {
        do {
          pbVar19 = pbVar10 + 2;
          auVar20[8] = *pbVar19;
          auVar20._0_8_ = CONCAT71(0,bVar3);
          auVar20._9_7_ = 0;
          bVar13 = pbVar10[1];
          if (bVar13 == 0x25) goto code_r0x006fa090;
          pbVar10 = pbVar10 + 3;
          if (*pbVar19 == 0x2d && pbVar10 < pbVar16) {
            if ((bVar13 <= bVar3) && (bVar3 <= *pbVar10)) goto code_r0x006f9e38;
          }
          else {
            pbVar10 = pbVar18;
            if (bVar13 == bVar3) {
code_r0x006f9e38:
              uVar6 = (uint)!bVar4;
              break;
            }
          }
          pbVar18 = pbVar10 + 1;
        } while (pbVar18 < pbVar16);
      }
code_r0x006f9d60:
      if (uVar6 == 0) break;
    }
    else if (bVar13 != 0x2e) {
      if (bVar13 == 0x25) {
        uVar6 = func_0x006fa090(CONCAT71(0,bVar3),*pbVar14);
      }
      else {
        uVar6 = (uint)(bVar13 == bVar3);
      }
      goto code_r0x006f9d60;
    }
  }
code_r0x006f9f54:
  do {
    if (lVar15 < 0) goto LAB_006f9f74;
    pbVar10 = (byte *)func_0x006f9748();
    lVar15 = lVar15 + -1;
  } while (pbVar10 == (byte *)0x0);
code_r0x006f9fb4:
  *unaff_x19 = *unaff_x19 + 1;
  return pbVar10;
}

