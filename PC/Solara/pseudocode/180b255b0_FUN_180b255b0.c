/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180b255b0(uint *param_1,undefined4 param_2)

{
  code *pcVar1;
  byte bVar2;
  byte bVar3;
  undefined4 uVar4;
  int iVar5;
  ulonglong *puVar6;
  undefined8 uVar7;
  longlong lVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  ulonglong uVar13;
  byte bVar14;
  char cVar15;
  char cVar16;
  byte bVar17;
  longlong lVar18;
  ulonglong uVar19;
  byte *pbVar20;
  uint *puVar21;
  undefined1 auStack_358 [32];
  uint *puStack_338;
  int iStack_330;
  undefined8 uStack_328;
  undefined8 uStack_320;
  byte bStack_318;
  byte abStack_308 [35];
  uint uStack_2e5;
  undefined2 uStack_2e1;
  undefined4 uStack_2df;
  undefined2 uStack_2db;
  undefined1 uStack_2d9;
  uint uStack_2d8;
  undefined4 uStack_2d4;
  undefined4 uStack_2d0;
  undefined4 uStack_2cc;
  ulonglong uStack_2c8;
  ulonglong uStack_2c0;
  uint *puStack_2b8;
  uint *puStack_2b0;
  ulonglong uStack_2a8;
  longlong alStack_2a0 [3];
  ulonglong uStack_288;
  undefined4 auStack_280 [2];
  uint uStack_278;
  uint uStack_274;
  uint uStack_270;
  uint uStack_26c;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined2 uStack_258;
  undefined1 auStack_256 [526];
  ulonglong uStack_48;
  uint auStack_40 [2];
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_358;
  uStack_2a8 = CONCAT44(uStack_2a8._4_4_,param_2);
  puStack_2b8 = param_1;
  puStack_2b0 = param_1;
  puStack_2b0 = (uint *)FUN_1801dfd40(alStack_2a0);
  abStack_308[0] = 0xc3;
  abStack_308[1] = 0xde;
  abStack_308[2] = 0xd8;
  abStack_308[3] = 0xd4;
  abStack_308[4] = 0xd6;
  abStack_308[5] = 0xc2;
  abStack_308[6] = 0xa6;
  abStack_308[7] = 0x8f;
  abStack_308[8] = 0xde;
  abStack_308[9] = 0xc2;
  abStack_308[10] = 0xf0;
  abStack_308[0xb] = 0xc3;
  abStack_308[0xc] = 0x8a;
  abStack_308[0xd] = 0xc3;
  abStack_308[0xe] = 0xf6;
  abStack_308[0xf] = 0xc6;
  abStack_308[0x10] = 0xc5;
  abStack_308[0x11] = 0xb5;
  abStack_308[0x12] = 0xe4;
  abStack_308[0x13] = 0xe4;
  abStack_308[0x14] = 0x9e;
  abStack_308[0x15] = 0x92;
  abStack_308[0x16] = 0x50;
  abStack_308[0x17] = 0;
  abStack_308[0x18] = 0;
  abStack_308[0x19] = 0;
  abStack_308[0x1a] = 0;
  abStack_308[0x1b] = 0;
  abStack_308[0x1c] = 0;
  abStack_308[0x1d] = 0;
  abStack_308[0x1e] = 0;
  abStack_308[0x1f] = 0;
  abStack_308[0x20] = 0;
  abStack_308[0x21] = 0;
  abStack_308[0x22] = 0;
  uStack_2e5 = 0;
  uStack_2e1 = 0;
  uStack_2df = (uint)uStack_2df._3_1_ << 0x18;
  pbVar20 = abStack_308;
  bVar14 = bStack_318;
code_r0x000180b25645:
  puVar6 = (ulonglong *)func_0x000180b36780();
  uVar13 = *puVar6;
  puVar6 = (ulonglong *)func_0x000180b36790();
  uVar9 = *puVar6;
code_r0x000180b25680:
  uVar19 = 0;
  uVar10 = uVar9;
  uVar11 = uVar13;
  do {
    if (0x2b < uVar19) {
LAB_180b260df:
      uVar7 = FUN_1801a9d10(&uStack_2d8,pbVar20,puStack_2b0);
      FUN_1801a4a90(uVar7);
      lVar12 = 0x28;
      if (0xf < uStack_2c0) {
        lVar18 = CONCAT44(uStack_2d4,uStack_2d8);
        if (uStack_2c0 + 1 < 0x1000) {
          lVar8 = 1;
        }
        else {
          if (0x1f < (lVar18 - *(longlong *)(lVar18 + -8)) - 8U) {
            pcVar1 = (code *)swi(0x29);
            (*pcVar1)(5);
            goto code_r0x000180b2825c;
          }
          lVar8 = 0x28;
          lVar18 = *(longlong *)(lVar18 + -8);
        }
        func_0x000180e15340(lVar18,uStack_2c0 + lVar8);
      }
      uStack_2c8 = 0;
      uStack_2c0 = 0xf;
      uStack_2d8 = uStack_2d8 & 0xffffff00;
      if (0xf < uStack_288) {
        if (uStack_288 + 1 < 0x1000) {
          lVar12 = 1;
          lVar18 = alStack_2a0[0];
        }
        else {
          lVar18 = *(longlong *)(alStack_2a0[0] + -8);
          if (0x1f < (alStack_2a0[0] - lVar18) - 8U) {
code_r0x000180b2825c:
            pcVar1 = (code *)swi(0x29);
            (*pcVar1)(5);
            pcVar1 = (code *)swi(3);
            (*pcVar1)();
            return;
          }
        }
        func_0x000180e15340(lVar18,uStack_288 + lVar12);
      }
      lVar12 = OpenProcess(0x1000,0,uStack_2a8 & 0xffffffff);
      uStack_2a8 = lVar12;
      if (lVar12 == 0) {
        uVar4 = GetLastError();
        uVar7 = FUN_1801dfd40(&uStack_2d8,uVar4);
        abStack_308[0] = 99;
        abStack_308[1] = 0x5e;
        abStack_308[2] = 0x58;
        abStack_308[3] = 0x54;
        abStack_308[4] = 0x56;
        abStack_308[5] = 0x62;
        abStack_308[6] = 0x46;
        abStack_308[7] = 0xaf;
        abStack_308[8] = 0x5f;
        abStack_308[9] = 0x7d;
        abStack_308[10] = 0x67;
        abStack_308[0xb] = 0x79;
        abStack_308[0xc] = 0x5a;
        abStack_308[0xd] = 0x77;
        abStack_308[0xe] = 0x79;
        abStack_308[0xf] = 0x7a;
        abStack_308[0x10] = 0x7d;
        abStack_308[0x11] = 0x68;
        abStack_308[0x12] = 0x69;
        abStack_308[0x13] = 0xb3;
        abStack_308[0x14] = 0x78;
        abStack_308[0x15] = 0x7e;
        abStack_308[0x16] = 0x67;
        abStack_308[0x17] = 0x6b;
        abStack_308[0x18] = 0x75;
        abStack_308[0x19] = 0x71;
        abStack_308[0x1a] = 0xa8;
        abStack_308[0x1b] = 0xbb;
        abStack_308[0x1c] = 0x73;
        abStack_308[0x1d] = 0x6d;
        abStack_308[0x1e] = 0x73;
        abStack_308[0x1f] = 100;
        abStack_308[0x20] = 0xa6;
        abStack_308[0x21] = 0;
        abStack_308[0x22] = 0;
        uStack_2e5 = 0;
        uStack_2e1 = 0;
        uStack_2df = 0;
        uStack_2db = 0;
        uStack_2d9 = 0;
        pbVar20 = abStack_308;
code_r0x000180b26232:
        puVar6 = (ulonglong *)func_0x000180b36780();
        uVar13 = *puVar6;
        puVar6 = (ulonglong *)func_0x000180b36790();
        uVar9 = *puVar6;
code_r0x000180b26260:
        uVar11 = uVar9;
        for (uVar10 = 0; uVar10 < 0x30; uVar10 = uVar10 + 1) {
          bVar14 = abStack_308[uVar10];
          cVar15 = (char)uVar10;
code_r0x000180b262a0:
          if (uVar10 < uVar13) {
            pbVar20 = auStack_358 + 0x87cb3d;
            break;
          }
          if (uVar13 < uVar11 + 1) {
            bStack_318 = (cVar15 + 0x41U & bVar14) * -2 + '9' + cVar15 + 0x41U + bVar14;
code_r0x000180b26300:
            if (uVar10 < uVar11) {
              pbVar20 = auStack_358 + 0x170cffc;
              break;
            }
            if (uVar11 + 5 <= uVar13) {
              if (uVar13 == uVar11 + 1) {
                bVar3 = cVar15 - 0x29;
                cVar16 = bVar14 - 10;
                goto code_r0x000180b26a90;
              }
              if (uVar13 != uVar11 + 2) {
                if (uVar13 != uVar11 + 3) goto code_r0x000180b26351;
                bVar3 = cVar15 - 0x19;
                cVar15 = cVar15 + bVar14 + -0x6a;
                goto code_r0x000180b26b8a;
              }
              bStack_318 = cVar15 + bVar14 + -0x22 + (bVar14 & cVar15 - 0x25U) * -2;
              uVar10 = uVar10 - 1;
              goto code_r0x000180b26ba1;
            }
            bStack_318 = bVar14 + 0xad + cVar15 + 0x55U + (cVar15 + 0x55U & bVar14) * -2;
code_r0x000180b26351:
            while (uVar9 = uVar11, uVar10 < uVar11 + uVar13) {
              while( true ) {
                do {
                  uVar11 = uVar9;
                  if (uVar13 == uVar11 + 0x200) {
                    bVar3 = cVar15 - 0x12;
                    cVar16 = bVar14 + 0x6c;
                    goto code_r0x000180b26a90;
                  }
                  if (uVar13 == uVar11 + 0x5a) {
                    bStack_318 = cVar15 + bVar14 + '`' + (bVar14 & cVar15 + 0x70U) * -2;
                    uVar11 = uVar11 + 1;
                    uVar10 = uVar10 - 1;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar13 == uVar11 + 6) {
                    bStack_318 = cVar15 + bVar14 + 'T' + (bVar14 & cVar15 - 0xeU) * -2;
                    uVar10 = uVar10 - 1;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar13 == uVar11 + 0x40) {
                    bVar3 = cVar15 + 0x74;
                    cVar16 = bVar14 + 0x48;
                    goto code_r0x000180b26ae2;
                  }
                  if (uVar13 == uVar11 + 0x1000) {
                    bStack_318 = cVar15 + bVar14 + '<' + (bVar14 & cVar15 - 10U) * -2;
                    uVar13 = uVar13 + uVar11;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar13 == uVar11 + 2) {
                    bStack_318 = cVar15 + bVar14 + '0' + (bVar14 & cVar15 + 0x78U) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar13 == uVar11 + 1000) {
                    bVar3 = cVar15 - 6;
                    cVar16 = bVar14 + 0x24;
                    goto code_r0x000180b26b25;
                  }
                  if (uVar13 == uVar11 + 0x2a) {
                    bStack_318 = bVar14 + 0x18 + cVar15 + (bVar14 & cVar15 + 0x7cU) * -2;
                    goto code_r0x000180b26b59;
                  }
                  if (uVar13 == uVar11 + 8) {
                    bVar3 = cVar15 - 2;
                    cVar15 = cVar15 + bVar14 + '\f';
                    goto code_r0x000180b26b8a;
                  }
                  uVar9 = uVar11;
                } while (uVar13 == uVar11 + 0x42);
                uVar13 = uVar11 + 5;
                if (uVar13 < uVar11 + 0x8e) {
                  bStack_318 = bVar14 + cVar15 + 0x43U + '+' + (bVar14 & cVar15 + 0x43U) * -2;
                  goto code_r0x000180b26232;
                }
                uVar9 = uVar11 + 0x66;
                if (uVar13 < uVar11 + 0x466) {
                  bStack_318 = bVar14 + (cVar15 - 0x3bU) + -99 + (bVar14 & cVar15 - 0x3bU) * -2;
                  goto code_r0x000180b26260;
                }
                if (uVar13 < uVar11 + 0x76) {
                  bStack_318 = bVar14 + 0xf + cVar15 + 0x47U + (bVar14 & cVar15 + 0x47U) * -2;
                  uVar11 = uVar9;
                  goto code_r0x000180b262a0;
                }
                if (uVar13 < uVar11 + 0x266) {
                  bStack_318 = bVar14 + 0x81 + (cVar15 - 0x37U) + (bVar14 & cVar15 - 0x37U) * -2;
                  uVar11 = uVar9;
                  goto code_r0x000180b26300;
                }
                if (uVar13 < uVar11 + 0xc0) break;
                if (uVar13 < uVar11 + 0x6c) {
                  bVar3 = cVar15 - 0x33;
                  cVar16 = bVar14 + 0x32;
                  uVar11 = uVar9;
                  goto code_r0x000180b26721;
                }
                if (uVar13 < uVar11 + 0xa6) {
                  bVar3 = cVar15 + 0x4f;
                  cVar16 = bVar14 + 0x26;
                  uVar11 = uVar9;
                  goto code_r0x000180b266e5;
                }
                if (uVar13 < uVar11 + 0x1066) {
                  bVar3 = cVar15 - 0x2f;
                  cVar16 = bVar14 + 0x1a;
                  uVar11 = uVar9;
                  goto code_r0x000180b266ac;
                }
                if (uVar13 < uVar11 + 0x86) {
                  bStack_318 = cVar15 + bVar14 + '\x0e' + (bVar14 & cVar15 + 0x53U) * -2;
                  uVar11 = uVar9;
                  goto code_r0x000180b26692;
                }
                if (uVar11 + 0x44e <= uVar13) {
                  uVar13 = uVar11 + 0x70;
                  uVar9 = uVar11 + 0x9a;
                  if (uVar11 + 0x11a < uVar13) {
                    bVar3 = cVar15 + 0x98;
                    cVar15 = cVar15 + bVar14 + 'p';
                    uVar11 = uVar9;
                    goto code_r0x000180b26b8a;
                  }
                  if (uVar11 + 0xdb < uVar13) {
                    bStack_318 = bVar14 + 100 + cVar15 + (bVar14 & cVar15 + 0x1aU) * -2;
                    uVar11 = uVar9;
                    goto code_r0x000180b26b59;
                  }
                  if (uVar11 + 0x9f < uVar13) {
                    bVar3 = cVar15 + 0x9c;
                    cVar16 = bVar14 + 0x58;
                    uVar11 = uVar9;
                    goto code_r0x000180b26b25;
                  }
                  if (uVar11 + 0xc2 < uVar13) {
                    bStack_318 = cVar15 + bVar14 + 'L' + (bVar14 & cVar15 + 0x1eU) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    uVar11 = uVar9;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar11 + 0x49a < uVar13) {
                    bStack_318 = cVar15 + bVar14 + '@' + (bVar14 & cVar15 + 0xa0U) * -2;
                    uVar13 = uVar13 + uVar9;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    uVar11 = uVar9;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar11 + 0xaa < uVar13) {
                    bVar3 = cVar15 + 0x22;
                    cVar16 = bVar14 + 0x34;
                    uVar11 = uVar9;
                    goto code_r0x000180b26ae2;
                  }
                  if (uVar11 + 0x29a < uVar13) {
                    bStack_318 = cVar15 + bVar14 + '(' + (bVar14 & cVar15 + 0xa4U) * -2;
                    uVar10 = uVar10 - 1;
                    uVar11 = uVar9;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar11 + 0xf4 < uVar13) {
                    bStack_318 = cVar15 + bVar14 + '\x1c' + (bVar14 & cVar15 + 0x26U) * -2;
                    uVar10 = uVar10 - 1;
                    uVar11 = uVar11 + 0x9b;
                    goto code_r0x000180b26ba1;
                  }
                  if (uVar11 + 0xa0 < uVar13) {
                    bVar3 = cVar15 + 0xa8;
                    cVar16 = bVar14 + 0x10;
                    uVar11 = uVar9;
                    goto code_r0x000180b26a90;
                  }
                  if (uVar13 <= uVar11 + 0xda) {
                    uVar13 = uVar11 + 0x9e;
                    uVar9 = uVar11 + 0x109e;
                  }
                }
              }
              bStack_318 = (bVar14 - 0xd) + cVar15 + 0x4bU + (bVar14 & cVar15 + 0x4bU) * -2;
              uVar11 = uVar9;
            }
            if (uVar11 + 1000 <= uVar13) {
              if (uVar13 == uVar11 + 1) {
                bStack_318 = cVar15 + bVar14 + '\x04' + (cVar15 + 0xaaU & bVar14) * -2;
                goto code_r0x000180b26b95;
              }
              if (uVar13 != uVar11 + 3) {
                if (uVar13 == uVar11 + 2) {
                  bStack_318 = cVar15 + bVar14 + -0x20 + (cVar15 + 0x30U & bVar14) * -2;
                  uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                  goto code_r0x000180b26ba1;
                }
                if (uVar13 != uVar11 + 5) goto code_r0x000180b26727;
                bVar3 = cVar15 + 0x34U & bVar14;
                cVar16 = bVar14 - 0x38;
code_r0x000180b26ae8:
                bStack_318 = cVar16 + cVar15 + bVar3 * -2;
                goto code_r0x000180b26af0;
              }
              bVar3 = cVar15 + 0xaeU & bVar14;
              cVar16 = bVar14 - 0x14;
code_r0x000180b26b2b:
              cVar16 = cVar16 + cVar15;
code_r0x000180b26b2e:
              bStack_318 = cVar16 + bVar3 * -2;
              bVar3 = (bVar14 - 2) + (cVar15 + 0x2bU & bVar14) * -2 + cVar15;
              abStack_308[uVar10] = bVar3;
              uVar10 = (uVar10 - (uVar11 + 1)) - (ulonglong)bVar3;
              uVar11 = uVar11 + 1;
code_r0x000180b26b59:
              abStack_308[uVar10] =
                   (char)uVar10 + 'x' + bVar14 + ((char)uVar10 + 0x6cU & bVar14) * -2;
              uVar13 = uVar13 + 1;
              uVar10 = uVar10 + ~uVar13;
              goto code_r0x000180b26b95;
            }
            bVar3 = cVar15 + 0x41;
            cVar16 = bVar14 + 0x7a;
code_r0x000180b26721:
            bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b26727:
            if (uVar11 + uVar13 == 6) {
              bVar3 = bVar14 & cVar15 - 0x16U;
              cVar16 = cVar15 + -0x7c;
              goto code_r0x000180b26b2e;
            }
            if (uVar11 + 0x7a < uVar13) {
              bVar3 = cVar15 + 0x7d;
              cVar16 = bVar14 + 0x12;
code_r0x000180b266e5:
              bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
            }
            else {
              if (uVar13 == uVar11 + 1) {
                bVar3 = cVar15 - 1;
                cVar16 = bVar14 + 6;
code_r0x000180b26a90:
                bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
                goto code_r0x000180b26a98;
              }
              if (uVar13 == uVar11 + 2) {
                bStack_318 = cVar15 + bVar14 + -0x12 + (cVar15 + 3U & bVar14) * -2;
                uVar10 = uVar10 - 1;
                goto code_r0x000180b26ba1;
              }
              if (uVar13 == uVar11 + 3) {
                bVar3 = cVar15 + 0x85U & bVar14;
                cVar16 = bVar14 - 0x1e;
                goto code_r0x000180b26ae8;
              }
              if (uVar13 == uVar11 + 4) {
                bStack_318 = cVar15 + bVar14 + -0x2a + (cVar15 + 7U & bVar14) * -2;
                uVar13 = uVar13 + uVar11;
                uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                goto code_r0x000180b26ba1;
              }
              if (uVar13 == uVar11 + 6) {
                bStack_318 = cVar15 + bVar14 + -0x36 + (cVar15 + 0x89U & bVar14) * -2;
                uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                goto code_r0x000180b26ba1;
              }
              if (uVar13 == uVar11 + 8) {
                bStack_318 = cVar15 + bVar14 + -0x5a + (cVar15 + 0xfU & bVar14) * -2;
                goto code_r0x000180b26b95;
              }
            }
            if (0xf < uVar13) {
              bStack_318 = bVar14 * '\x02' + cVar15 + (bVar14 & cVar15 + 0x68U) * -2 + 0x90;
code_r0x000180b26af0:
              abStack_308[uVar10] =
                   bVar14 + 10 + (cVar15 + 0xa9U & bVar14) * -2 + cVar15 + bStack_318;
              uVar13 = uVar13 + uVar11;
              uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
              goto code_r0x000180b26ba1;
            }
            if (uVar11 + 1 < uVar13) {
              bVar3 = cVar15 - 0x2e;
              cVar16 = bVar14 + 0x14;
code_r0x000180b266ac:
              bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
            }
            else {
              if (uVar13 == uVar11 + 1) {
                bStack_318 = cVar15 + bVar14 + '\b' + (cVar15 + 0x54U & bVar14) * -2;
                goto code_r0x000180b26b95;
              }
              if (uVar13 == uVar11 + 3) {
                bVar3 = cVar15 + 0x58U & bVar14;
                cVar16 = bVar14 - 0x10;
                goto code_r0x000180b26b2b;
              }
              if (uVar13 == uVar11 + 4) {
                bStack_318 = cVar15 + bVar14 + -0x40 + (cVar15 + 0x60U & bVar14) * -2;
                uVar10 = uVar10 - 1;
                goto code_r0x000180b26ba1;
              }
            }
            if (uVar11 < 5) {
code_r0x000180b26692:
              abStack_308[uVar10] = bStack_318;
              goto code_r0x000180b26ba1;
            }
            bStack_318 = (bVar14 + 0x9c + cVar15 + (cVar15 - 0x1aU & bVar14) * -2) * '\x02';
code_r0x000180b26a98:
            abStack_308[uVar10] = bVar14 + 0x16 + (cVar15 + 0x27U & bVar14) * -2 + cVar15;
            uVar10 = uVar10 - 1;
            uVar11 = uVar11 + 1;
            goto code_r0x000180b26ba1;
          }
          if (uVar13 != uVar11 + 1) {
            if (uVar13 == uVar11 + 3) {
              bVar3 = cVar15 - 0x39;
              cVar16 = bVar14 + 0x56;
code_r0x000180b26b25:
              bVar3 = bVar14 & bVar3;
              goto code_r0x000180b26b2b;
            }
            if (uVar13 == uVar11 + 5) {
              bVar3 = cVar15 + 0x4d;
              cVar16 = bVar14 + 0x32;
code_r0x000180b26ae2:
              bVar3 = bVar14 & bVar3;
              goto code_r0x000180b26ae8;
            }
            if (uVar13 != uVar11 + 4) goto code_r0x000180b26300;
            bStack_318 = cVar15 + bVar14 + '&' + (bVar14 & cVar15 - 0x31U) * -2;
            uVar10 = uVar10 - 1;
            goto code_r0x000180b26ba1;
          }
          bVar3 = cVar15 - 0x3d;
          cVar15 = cVar15 + bVar14 + 'n';
code_r0x000180b26b8a:
          bStack_318 = cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b26b95:
          uVar10 = uVar10 + abStack_308[uVar10] + uVar11;
code_r0x000180b26ba1:
        }
        uVar7 = FUN_1801a9d10(alStack_2a0,pbVar20,uVar7);
        FUN_1801a4a90(uVar7);
        FUN_180195980(alStack_2a0);
        FUN_180195980(&uStack_2d8);
code_r0x000180b26c5b:
        puStack_2b8[0] = 0;
        puStack_2b8[1] = 0;
        puStack_2b8[2] = 0;
        puStack_2b8[3] = 0;
        puStack_2b8[4] = 0;
        puStack_2b8[5] = 0;
        puStack_2b8[6] = 0;
        puStack_2b8[7] = 0;
        FUN_180191ab0(puStack_2b8,&UNK_180f467a8,0);
      }
      else {
        uStack_258 = 0;
        FUN_180f297c0(auStack_256,0,0x206);
        auStack_280[0] = 0x104;
        iVar5 = QueryFullProcessImageNameW(lVar12,0,&uStack_258,auStack_280);
        if (iVar5 == 0) {
          uVar4 = GetLastError();
          puStack_2b0 = (uint *)FUN_1801dfd40(&uStack_2d8,uVar4);
          abStack_308[0] = 99;
          abStack_308[1] = 0x1e;
          abStack_308[2] = 0x18;
          abStack_308[3] = 0x14;
          abStack_308[4] = 0x16;
          abStack_308[5] = 0x62;
          abStack_308[6] = 6;
          abStack_308[7] = 0x2f;
          abStack_308[8] = 0x11;
          abStack_308[9] = 7;
          abStack_308[10] = 0x1c;
          abStack_308[0xb] = 0x1c;
          abStack_308[0xc] = 0x18;
          abStack_308[0xd] = 0x29;
          abStack_308[0xe] = 0x62;
          abStack_308[0xf] = 0x78;
          abStack_308[0x10] = 0x61;
          abStack_308[0x11] = 0x61;
          abStack_308[0x12] = 0x7f;
          abStack_308[0x13] = 0x7f;
          abStack_308[0x14] = 0x26;
          abStack_308[0x15] = 0x31;
          abStack_308[0x16] = 0x79;
          abStack_308[0x17] = 0x6b;
          abStack_308[0x18] = 0x75;
          abStack_308[0x19] = 0x1e;
          abStack_308[0x1a] = 0xdc;
          abStack_308[0x1b] = 0;
          abStack_308[0x1c] = 0;
          abStack_308[0x1d] = 0;
          abStack_308[0x1e] = 0;
          abStack_308[0x1f] = 0;
          abStack_308[0x20] = 0;
          abStack_308[0x21] = 0;
          abStack_308[0x22] = 0;
          uStack_2e5 = uStack_2e5 & 0xffffff00;
          pbVar20 = abStack_308;
code_r0x000180b26d23:
          puVar6 = (ulonglong *)func_0x000180b36780();
          uVar13 = *puVar6;
          puVar6 = (ulonglong *)func_0x000180b36790();
          uVar9 = *puVar6;
code_r0x000180b26d60:
          uVar10 = 0;
          uVar11 = uVar9;
          do {
            if (0x23 < uVar10) {
code_r0x000180b27754:
              uVar7 = FUN_1801a9d10(alStack_2a0,pbVar20,puStack_2b0);
              FUN_1801a4a90(uVar7);
              FUN_180195980(alStack_2a0);
              FUN_180195980(&uStack_2d8);
              CloseHandle(uStack_2a8);
              goto code_r0x000180b26c5b;
            }
            bVar14 = abStack_308[uVar10];
            cVar15 = (char)uVar10;
code_r0x000180b26d90:
            if (uVar10 < uVar13) {
              pbVar20 = auStack_358 + 0x7d8e1d;
              goto code_r0x000180b27754;
            }
            if (uVar11 + 1 <= uVar13) {
              if (uVar13 == uVar11 + 1) {
                bVar3 = cVar15 - 0x1d;
                cVar15 = cVar15 + bVar14 + -0x52;
                goto code_r0x000180b2769b;
              }
              if (uVar13 == uVar11 + 3) {
                bVar3 = cVar15 + 0x67;
                cVar16 = bVar14 + 0x96;
                goto code_r0x000180b27639;
              }
              if (uVar13 != uVar11 + 4) {
                if (uVar13 != uVar11 + 2) goto code_r0x000180b26df0;
                bVar3 = cVar15 + 0x2d;
                cVar16 = bVar14 - 0xe;
                goto code_r0x000180b275ca;
              }
              bVar3 = cVar15 - 0x15;
              cVar15 = cVar15 + bVar14 + '~';
code_r0x000180b27611:
              bStack_318 = cVar15 + (bVar14 & bVar3) * -2;
              uVar13 = uVar13 + uVar11;
              uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
              goto code_r0x000180b276b2;
            }
            bStack_318 = (cVar15 + 0xa1U & bVar14) * -2 + -0x67 + cVar15 + 0xa1U + bVar14;
code_r0x000180b26df0:
            if (uVar10 < uVar11) {
              pbVar20 = auStack_358 + 0x164c87c;
              goto code_r0x000180b27754;
            }
            if (uVar11 + 0x40 <= uVar13) {
              if (uVar13 == uVar11 + 1) {
                bVar3 = cVar15 + 0x77;
                cVar16 = bVar14 + 0x36;
                goto code_r0x000180b2758e;
              }
              if (uVar13 != uVar11 + 3) {
                if (uVar13 != uVar11 + 2) {
                  if (uVar13 != uVar11 + 5) {
                    if (uVar13 != uVar11 + 4) {
                      if (uVar13 != uVar11 + 7) goto code_r0x000180b26e70;
                      bVar3 = cVar15 + 3;
                      cVar16 = bVar14 - 0x12;
                      goto code_r0x000180b27639;
                    }
                    bStack_318 = cVar15 + bVar14 + 'z' + (bVar14 & cVar15 - 0x3fU) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    goto code_r0x000180b276b2;
                  }
                  bVar3 = cVar15 + 0x7f;
                  cVar15 = cVar15 + bVar14 + '\x06';
                  goto code_r0x000180b27611;
                }
                bVar3 = cVar15 + 0x3d;
                cVar16 = bVar14 + 0x92;
                goto code_r0x000180b275ca;
              }
              bStack_318 = cVar15 + bVar14 + '\x1e' + (bVar14 & cVar15 - 5U) * -2;
              uVar10 = uVar10 - 1;
              goto code_r0x000180b276b2;
            }
            bStack_318 = bVar14 + 0x8d + cVar15 + 0x35U + (bVar14 & cVar15 + 0x35U) * -2;
code_r0x000180b26e70:
            while (uVar9 = uVar11, uVar10 < uVar11 + uVar13) {
              while( true ) {
                uVar11 = uVar9;
                if (uVar13 == uVar11 + 0x10) {
                  bVar3 = cVar15 + 0x2e;
                  cVar16 = bVar14 - 0x14;
                  goto code_r0x000180b2758e;
                }
                if (uVar13 == uVar11 + 0x5a) {
                  bStack_318 = cVar15 + bVar14 + '`' + (bVar14 & cVar15 + 0x70U) * -2;
                  uVar11 = uVar11 + 1;
                  uVar10 = uVar10 - 1;
                  goto code_r0x000180b276b2;
                }
                if (uVar13 == uVar11 + 0x7a) {
                  bStack_318 = cVar15 + bVar14 + -0x2c + (bVar14 & cVar15 + 0xb2U) * -2;
                  uVar10 = uVar10 - 1;
                  goto code_r0x000180b276b2;
                }
                if (uVar13 == uVar11 + 0x1000) {
                  bVar3 = cVar15 - 0xc;
                  cVar16 = bVar14 + 0x48;
                  goto code_r0x000180b275ca;
                }
                if (uVar13 == uVar11 + 1000) {
                  bVar3 = cVar15 + 0x36;
                  cVar15 = cVar15 + bVar14 + -0x44;
                  goto code_r0x000180b27611;
                }
                uVar9 = uVar11 + 0x80;
                if (uVar13 == uVar9) {
                  bStack_318 = cVar15 + bVar14 + '0' + (bVar14 & cVar15 + 0x78U) * -2;
                  uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                  goto code_r0x000180b276b2;
                }
                if (uVar13 == uVar11 + 5) {
                  bVar3 = cVar15 + 0xba;
                  cVar16 = bVar14 + 0xa4;
                  goto code_r0x000180b27639;
                }
                if (uVar13 == uVar11 + 3) {
                  bStack_318 = bVar14 + 0x18 + cVar15 + (bVar14 & cVar15 - 4U) * -2;
                  goto code_r0x000180b2766a;
                }
                if (uVar13 == uVar11 + 1) {
                  bVar3 = cVar15 + 0x3e;
                  cVar15 = cVar15 + bVar14 + -0x74;
                  goto code_r0x000180b2769b;
                }
                uVar13 = uVar11 + 6;
                if (uVar13 < uVar11 + 0x84) {
                  bStack_318 = bVar14 + cVar15 + 99U + 'K' + (bVar14 & cVar15 + 99U) * -2;
                  goto code_r0x000180b26d23;
                }
                if (uVar13 < uVar11 + 0x82) {
                  bStack_318 = bVar14 + cVar15 + 0xa5U + '}' + (bVar14 & cVar15 + 0xa5U) * -2;
                  goto code_r0x000180b26d60;
                }
                if (uVar13 < uVar11 + 0xaa) {
                  bStack_318 = bVar14 + 0xaf + (cVar15 - 0x19U) + (bVar14 & cVar15 - 0x19U) * -2;
                  uVar11 = uVar9;
                  goto code_r0x000180b26d90;
                }
                if (uVar13 < uVar11 + 0xc2) {
                  bStack_318 = (bVar14 - 0x1f) + cVar15 + 0x29U + (bVar14 & cVar15 + 0x29U) * -2;
                  uVar11 = uVar9;
                  goto code_r0x000180b26df0;
                }
                if (uVar13 < uVar11 + 0xa8) break;
                if (uVar13 < uVar11 + 0x90) {
                  bVar3 = cVar15 + 0xad;
                  cVar16 = bVar14 - 0xe;
                  uVar11 = uVar9;
                  goto code_r0x000180b271f2;
                }
                if (uVar13 < uVar11 + 0x89) {
                  bVar3 = cVar15 - 0x11;
                  cVar16 = bVar14 + 0x66;
                  uVar11 = uVar9;
                  goto code_r0x000180b271b0;
                }
                if (uVar13 < uVar11 + 0x86) {
                  bVar3 = cVar15 + 0x31;
                  cVar16 = bVar14 - 0x26;
                  uVar11 = uVar9;
                  goto code_r0x000180b27173;
                }
                if (uVar11 + 0x468 <= uVar13) {
                  uVar13 = uVar11 + 0x8a;
                  uVar9 = uVar11 + 0x10a;
                  if (uVar11 + 0x112 < uVar13) {
                    bVar3 = cVar15 + 0x98;
                    cVar15 = cVar15 + bVar14 + 'p';
                    uVar11 = uVar9;
                    goto code_r0x000180b2769b;
                  }
                  if (uVar11 + 0x16b < uVar13) {
                    bStack_318 = (bVar14 - 0x1c) + cVar15 + (bVar14 & cVar15 - 0x26U) * -2;
                    uVar11 = uVar9;
                    goto code_r0x000180b2766a;
                  }
                  if (uVar11 + 0x50a < uVar13) {
                    bVar3 = cVar15 + 0x1c;
                    cVar16 = bVar14 + 0x58;
                    uVar11 = uVar9;
                    goto code_r0x000180b27639;
                  }
                  if (uVar11 + 0x30a < uVar13) {
                    bStack_318 = cVar15 + bVar14 + -0x34 + (bVar14 & cVar15 + 0x5eU) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    uVar11 = uVar9;
                    goto code_r0x000180b276b2;
                  }
                  if (uVar11 + 0x16e < uVar13) {
                    bVar3 = cVar15 + 0xa0;
                    cVar15 = cVar15 + bVar14 + '@';
                    uVar11 = uVar9;
                    goto code_r0x000180b27611;
                  }
                  if (uVar11 + 0x14a < uVar13) {
                    bVar3 = cVar15 - 0x1e;
                    cVar16 = bVar14 + 0xb4;
                    uVar11 = uVar9;
                    goto code_r0x000180b275ca;
                  }
                  if (uVar11 + 0x10c < uVar13) {
                    bStack_318 = cVar15 + bVar14 + '(' + (bVar14 & cVar15 + 0x24U) * -2;
                    uVar10 = uVar10 - 1;
                    uVar11 = uVar9;
                    goto code_r0x000180b276b2;
                  }
                  if (uVar11 + 0x134 < uVar13) {
                    bStack_318 = cVar15 + bVar14 + -100 + (bVar14 & cVar15 + 0x66U) * -2;
                    uVar10 = uVar10 - 1;
                    uVar11 = uVar11 + 0x10b;
                    goto code_r0x000180b276b2;
                  }
                  if (uVar11 + 0x14b < uVar13) {
                    bVar3 = cVar15 + 0xa8;
                    cVar16 = bVar14 + 0x10;
                    uVar11 = uVar9;
                    goto code_r0x000180b2758e;
                  }
                  uVar13 = uVar11 + 0x10d;
                  uVar9 = uVar11 + 0x50d;
                }
              }
              bStack_318 = bVar14 + 0x13 + cVar15 + 0x6bU + (bVar14 & cVar15 + 0x6bU) * -2;
              uVar11 = uVar9;
            }
            if (uVar13 < uVar11 + 0x2a) {
              bVar3 = cVar15 + 0xa1;
              cVar16 = bVar14 + 0x3a;
code_r0x000180b271f2:
              bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b271f8:
              if (uVar11 + uVar13 == 0x61) {
                bVar3 = cVar15 + 0xaa;
                cVar16 = cVar15 + '\x04';
code_r0x000180b27642:
                bStack_318 = cVar16 + (bVar14 & bVar3) * -2;
                bVar3 = bVar14 + 0x3e + (cVar15 + 0x4bU & bVar14) * -2 + cVar15;
                abStack_308[uVar10] = bVar3;
                uVar10 = (uVar10 - (uVar11 + 1)) - (ulonglong)bVar3;
                uVar11 = uVar11 + 1;
code_r0x000180b2766a:
                abStack_308[uVar10] =
                     (char)uVar10 + 'x' + bVar14 + ((char)uVar10 - 0x14U & bVar14) * -2;
                uVar13 = uVar13 + 1;
                uVar10 = uVar10 + ~uVar13;
                goto code_r0x000180b276a6;
              }
              if (uVar11 + 0x28 < uVar13) {
                bVar3 = cVar15 + 0x5d;
                cVar16 = bVar14 - 0x2e;
code_r0x000180b271b0:
                bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b271b6:
                if (0x59 < uVar13) {
                  bStack_318 = bVar14 * '\x02' + cVar15 + (cVar15 + 0x68U & bVar14) * -2 + 0x90;
                  goto code_r0x000180b275d8;
                }
                if (uVar11 + 6 < uVar13) {
                  bVar3 = cVar15 + 0x92;
                  cVar16 = bVar14 + 0x94;
code_r0x000180b27173:
                  bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b27179:
                  if (999 < uVar11) {
                    bStack_318 = (bVar14 + 0x1c + cVar15 + (cVar15 + 0x26U & bVar14) * -2) * '\x02';
                    goto code_r0x000180b2759c;
                  }
                  abStack_308[uVar10] = bStack_318;
                }
                else {
                  if (uVar13 == uVar11 + 1) {
                    bVar3 = cVar15 - 0x2c;
                    cVar15 = cVar15 + bVar14 + '\b';
                    goto code_r0x000180b2769b;
                  }
                  if (uVar13 == uVar11 + 3) {
                    bStack_318 = cVar15 + bVar14 + 'd' + (bVar14 & cVar15 + 0x9aU) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                  }
                  else {
                    if (uVar13 == uVar11 + 5) {
                      bVar3 = cVar15 + 0x1e;
                      cVar16 = bVar14 + 0x4c;
                      goto code_r0x000180b275ca;
                    }
                    if (uVar13 != uVar11 + 7) goto code_r0x000180b27179;
                    bStack_318 = cVar15 + bVar14 + '4' + (bVar14 & cVar15 + 0xa2U) * -2;
                    uVar11 = uVar11 + 1;
                    uVar10 = uVar10 - 1;
                  }
                }
              }
              else {
                if (uVar13 != uVar11 + 1) {
                  if (uVar13 != uVar11 + 3) {
                    if (uVar13 == uVar11 + 6) {
                      bVar3 = cVar15 + 0x2b;
                      cVar16 = bVar14 - 2;
code_r0x000180b27639:
                      cVar16 = cVar16 + cVar15;
                      goto code_r0x000180b27642;
                    }
                    if (uVar13 == uVar11 + 4) {
                      bStack_318 = bVar14 + 0x72 + cVar15 + (bVar14 & cVar15 + 0x6dU) * -2;
                      goto code_r0x000180b2766a;
                    }
                    if (uVar13 == uVar11 + 2) {
                      bVar3 = cVar15 + 0xaf;
                      cVar15 = cVar15 + bVar14 + -0x1a;
                      goto code_r0x000180b2769b;
                    }
                    goto code_r0x000180b271b6;
                  }
                  bStack_318 = cVar15 + bVar14 + '.' + (bVar14 & cVar15 + 0x23U) * -2;
                  uVar10 = uVar10 - 1;
                  goto code_r0x000180b276b2;
                }
                bVar3 = cVar15 + 0x9f;
                cVar16 = bVar14 + 0x46;
code_r0x000180b2758e:
                bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b2759c:
                abStack_308[uVar10] = bVar14 + 0x56 + (cVar15 - 0x39U & bVar14) * -2 + cVar15;
                uVar10 = uVar10 - 1;
                uVar11 = uVar11 + 1;
              }
            }
            else {
              if (uVar13 != uVar11 + 1) {
                if (uVar13 == uVar11 + 2) {
                  bStack_318 = (bVar14 - 8) + cVar15 + (bVar14 & cVar15 + 0xacU) * -2;
                  goto code_r0x000180b2766a;
                }
                if (uVar13 != uVar11 + 5) {
                  if (uVar13 == uVar11 + 3) {
                    bStack_318 = cVar15 + bVar14 + -0x50 + (bVar14 & cVar15 + 0x38U) * -2;
                    uVar11 = uVar11 + 1;
                    uVar10 = uVar10 - 1;
                    goto code_r0x000180b276b2;
                  }
                  if (uVar13 != uVar11 + 9) goto code_r0x000180b271f8;
                  bVar3 = cVar15 + 0x7a;
                  cVar16 = bVar14 + 0x24;
                  goto code_r0x000180b2758e;
                }
                bVar3 = cVar15 + 0xb4;
                cVar16 = bVar14 - 0x38;
code_r0x000180b275ca:
                bStack_318 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b275d8:
                abStack_308[uVar10] =
                     bVar14 + (cVar15 + 9U & bVar14) * -2 + -0x36 + cVar15 + bStack_318;
                uVar13 = uVar13 + uVar11;
                uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                goto code_r0x000180b276b2;
              }
              bVar3 = cVar15 + 0x6a;
              cVar15 = cVar15 + bVar14 + -0x7c;
code_r0x000180b2769b:
              bStack_318 = cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b276a6:
              uVar10 = uVar10 + abStack_308[uVar10] + uVar11;
            }
code_r0x000180b276b2:
            uVar10 = uVar10 + 1;
          } while( true );
        }
        CloseHandle(lVar12);
        uStack_320 = 0;
        uStack_328 = 0;
        iStack_330 = 0;
        puStack_338 = (uint *)0x0;
        iVar5 = WideCharToMultiByte(0xfde9,0,&uStack_258,0xffffffff);
        if (1 < iVar5) {
          FUN_180193870(&uStack_278,(longlong)(iVar5 + -1),0);
          puStack_338 = &uStack_278;
          if (0xf < uStack_260) {
            puStack_338 = (uint *)CONCAT44(uStack_274,uStack_278);
          }
          uStack_320 = 0;
          uStack_328 = 0;
          iStack_330 = iVar5;
          WideCharToMultiByte(0xfde9,0,&uStack_258,0xffffffff);
          uStack_2d8 = 0x8a96949b;
          uStack_2d4 = 0xa7bc9888;
          uStack_2d0 = 0x637e6898;
          uStack_2cc = 0xcdb1;
          uStack_2c8 = uStack_2c8 & 0xffffffffffffff00;
          puVar21 = &uStack_2d8;
code_r0x000180b2786b:
          puVar6 = (ulonglong *)func_0x000180b36780();
          uVar13 = *puVar6;
          puVar6 = (ulonglong *)func_0x000180b36790();
          uVar9 = *puVar6;
code_r0x000180b278a3:
          uVar10 = 0;
          uVar11 = uVar13;
          do {
            if (0x10 < uVar10) {
code_r0x000180b281d8:
              uVar7 = FUN_18019a400(alStack_2a0,puVar21,&uStack_278);
              FUN_1801a4a90(uVar7);
              FUN_180195980(alStack_2a0);
              *puStack_2b8 = uStack_278;
              puStack_2b8[1] = uStack_274;
              puStack_2b8[2] = uStack_270;
              puStack_2b8[3] = uStack_26c;
              puStack_2b8[4] = (uint)uStack_268;
              puStack_2b8[5] = uStack_268._4_4_;
              puStack_2b8[6] = (uint)uStack_260;
              puStack_2b8[7] = uStack_260._4_4_;
              uStack_268 = 0;
              uStack_260 = 0xf;
              uStack_278 = uStack_278 & 0xffffff00;
              FUN_180195980(&uStack_278);
              goto code_r0x000180b2822b;
            }
            bVar14 = *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38));
            bVar3 = (byte)uVar10;
code_r0x000180b278d3:
            if (uVar10 < uVar11) {
              puVar21 = (uint *)(auStack_358 + 0x626a60);
              goto code_r0x000180b281d8;
            }
            uVar19 = uVar9;
            if (uVar9 + 1 <= uVar11) {
              if (uVar11 == uVar9 + 1) {
                bVar2 = bVar3 + 0x20;
                goto code_r0x000180b28117;
              }
              if (uVar11 == uVar9 + 2) {
                bVar17 = bVar3 - 0x20;
                bVar2 = bVar14 - 0x40;
                goto code_r0x000180b280e0;
              }
              if (uVar11 == uVar9 + 3) {
                bVar2 = bVar3 - 0x20;
                bVar17 = bVar14 - 0x40;
code_r0x000180b2809d:
                goto code_r0x000180b280a0;
              }
              if (uVar11 != uVar9 + 5) goto code_r0x000180b27930;
code_r0x000180b28070:
              cVar15 = bVar3 + bVar14 + -0x40;
              bVar2 = bVar3 + 0x60;
code_r0x000180b2807c:
              bStack_318 = cVar15 + (bVar14 & bVar2) * -2;
              uVar10 = uVar10 - 1;
              uVar19 = uVar9 + 1;
              goto code_r0x000180b28136;
            }
            bStack_318 = (bVar14 & bVar3 + 0x60) * -2 + '`' + bVar14 + bVar3 + 0x60;
code_r0x000180b27930:
            if (uVar10 < uVar19) {
              puVar21 = (uint *)(auStack_358 + 0x1577d00);
              goto code_r0x000180b281d8;
            }
            if (uVar19 + 0x10 <= uVar11) {
              if (uVar11 == uVar19 + 1) goto code_r0x000180b28037;
              uVar9 = uVar19;
              if (uVar11 == uVar19 + 2) goto code_r0x000180b28070;
              if (uVar11 == uVar19 + 3) goto code_r0x000180b27eca;
              if (uVar11 != uVar19 + 5) {
                if (uVar11 != uVar19 + 7) goto code_r0x000180b279a0;
                goto code_r0x000180b27fd3;
              }
              bStack_318 = bVar3 + bVar14 + -0x40 + (bVar14 & bVar3 + 0x60) * -2;
              uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
              goto code_r0x000180b28136;
            }
            bStack_318 = (bVar14 - 0x20) + (bVar3 - 0x20) + (bVar14 & bVar3 - 0x20) * -2;
code_r0x000180b279a0:
            while (uVar9 = uVar19, uVar10 < uVar19 + uVar11) {
              while( true ) {
                do {
                  uVar19 = uVar9;
                  uVar9 = uVar19;
                  if (uVar11 == uVar19 + 0x42) {
                    bVar2 = bVar3 + 0x40;
                    cVar15 = bVar14 + 0x80;
                    goto code_r0x000180b2803f;
                  }
                  if (uVar11 == uVar19 + 0x80) {
                    bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3) * -2;
                    uVar19 = uVar19 + 1;
                    uVar10 = uVar10 - 1;
                    goto code_r0x000180b28136;
                  }
                  if (uVar11 == uVar19 + 10) {
                    bVar2 = bVar3 - 0x40;
                    goto code_r0x000180b27e99;
                  }
                  if (uVar11 == uVar19 + 0x20) goto code_r0x000180b27e78;
                  if (uVar11 == uVar19 + 0x40) {
                    bVar2 = bVar3 + 0x40;
                    goto code_r0x000180b27e4a;
                  }
                  uVar13 = uVar19 + 6;
                  if (uVar11 == uVar13) {
                    bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    goto code_r0x000180b28136;
                  }
                  if (uVar11 == uVar19 + 9) {
                    bVar2 = bVar3 - 0x40;
                    cVar15 = bVar14 + 0x80;
                    goto code_r0x000180b27fdb;
                  }
                  if (uVar11 == uVar19 + 0x10) {
                    bVar17 = bVar3 + 0x80;
                    bVar2 = bVar14;
                    goto code_r0x000180b280e3;
                  }
                  if (uVar11 == uVar19 + 3) {
                    bVar2 = bVar3 + 0x40;
                    cVar15 = bVar3 + bVar14 + -0x80;
                    goto code_r0x000180b2811f;
                  }
                } while (uVar11 == uVar19 + 5);
                if (uVar13 < uVar19 + 0x68) {
                  bStack_318 = bVar14 + bVar3 + 0x20 + ' ' + (bVar14 & bVar3 + 0x20) * -2;
                  goto code_r0x000180b2786b;
                }
                uVar9 = uVar19 + 0xe;
                if (uVar13 < uVar19 + 0xf) {
                  bStack_318 = bVar14 + (bVar3 - 0x20) + -0x20 + (bVar14 & bVar3 - 0x20) * -2;
                  goto code_r0x000180b278a3;
                }
                uVar11 = uVar13;
                if (uVar13 < uVar19 + 0x11) {
                  bStack_318 = bVar14 + 0xa0 + bVar3 + 0xa0 + (bVar14 & bVar3 + 0xa0) * -2;
                  goto code_r0x000180b278d3;
                }
                if (uVar13 < uVar19 + 0x6f) {
                  bStack_318 = bVar14 + 0x60 + bVar3 + 0x60 + (bVar14 & bVar3 + 0x60) * -2;
                  uVar19 = uVar9;
                  goto code_r0x000180b27930;
                }
                if (uVar13 < uVar19 + 0x4f) break;
                if (uVar13 < uVar19 + 0x38) {
                  bVar2 = bVar3 - 0x20;
                  uVar19 = uVar9;
                  goto code_r0x000180b27d42;
                }
                if (uVar13 < uVar19 + 0x3f6) {
                  bVar2 = bVar3 + 0xa0;
                  cVar15 = bVar14 + 0x40;
                  uVar19 = uVar9;
                  goto code_r0x000180b27d0c;
                }
                if (uVar13 < uVar19 + 0x100e) {
                  bVar2 = bVar3 + 0x60;
                  cVar15 = bVar14 - 0x40;
                  goto code_r0x000180b27cce;
                }
                if (uVar13 < uVar19 + 0x88) {
                  bStack_318 = bVar3 + bVar14 + '@' + (bVar14 & bVar3 + 0x20) * -2;
                  goto code_r0x000180b27cb1;
                }
                if (uVar19 + 0x72 <= uVar13) {
                  uVar11 = uVar19 + 0x8e;
                  uVar9 = uVar19 + 0x28e;
                  if (uVar19 + 0x676 < uVar11) {
                    bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3) * -2;
                    goto code_r0x000180b2812a;
                  }
                  if (uVar19 + 0x2ae < uVar11) {
                    bVar17 = bVar3 - 0x40;
                    bVar2 = bVar14 + 0x80;
                    goto code_r0x000180b280e0;
                  }
                  if (uVar19 + 0x2ce < uVar11) {
                    bVar2 = bVar3 + 0x80;
                    cVar15 = bVar3 + bVar14;
                    uVar19 = uVar9;
                    goto code_r0x000180b27fde;
                  }
                  if (uVar19 + 0x2f2 < uVar11) {
                    bStack_318 = bVar3 + bVar14 + -0x80 + (bVar14 & bVar3 + 0x40) * -2;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    uVar19 = uVar9;
                    goto code_r0x000180b28136;
                  }
                  if (uVar19 + 0x297 < uVar11) {
                    bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3) * -2;
                    uVar11 = uVar11 + uVar9;
                    uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                    uVar19 = uVar9;
                    goto code_r0x000180b28136;
                  }
                  if (uVar19 + 0x29e < uVar11) {
                    bVar2 = bVar3 - 0x40;
                    bVar17 = bVar14 + 0x80;
                    goto code_r0x000180b2809d;
                  }
                  if (uVar19 + 0x2b6 < uVar11) {
                    bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3 + 0x80) * -2;
                    uVar10 = uVar10 - 1;
                    uVar19 = uVar9;
                    goto code_r0x000180b28136;
                  }
                  if (uVar19 + 0x293 < uVar11) {
                    bVar2 = bVar3 + 0x40;
                    cVar15 = bVar3 + bVar14 + -0x80;
                    goto code_r0x000180b2807c;
                  }
                  if (uVar19 + 0x296 < uVar11) {
                    bVar2 = bVar14 & bVar3;
                    cVar15 = bVar3 + bVar14;
                    goto code_r0x000180b28048;
                  }
                  if (uVar11 <= uVar19 + 0x298) {
                    uVar9 = uVar19 + 0x2a0;
                    uVar11 = uVar19 + 0x29e;
                  }
                }
              }
              bStack_318 = bVar14 + 0x20 + bVar3 + 0x20 + (bVar14 & bVar3 + 0x20) * -2;
              uVar19 = uVar9;
            }
            if (uVar11 < uVar19 + 3) {
              bVar2 = bVar3 + 0x60;
code_r0x000180b27d42:
              bStack_318 = (bVar14 - 0x40) + bVar3 + (bVar14 & bVar2) * -2;
code_r0x000180b27d57:
              if (uVar19 + uVar11 == 0x20) {
                bVar2 = bVar3 - 0x40;
                cVar15 = bVar3 + 0x80;
code_r0x000180b27fde:
                bStack_318 = cVar15 + (bVar14 & bVar2) * -2;
                bVar3 = bVar14 + 0x40 + (bVar3 + 0x20 & bVar14) * -2 + bVar3;
                *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) = bVar3;
                uVar10 = (uVar10 - (uVar19 + 1)) - (ulonglong)bVar3;
                uVar9 = uVar19 + 1;
code_r0x000180b280ee:
                *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) =
                     bVar14 + (char)uVar10 + ((char)uVar10 + 0x80U & bVar14) * -2;
                uVar11 = uVar11 + 1;
                uVar10 = uVar10 + ~uVar11;
                goto code_r0x000180b2812a;
              }
              if (uVar19 + 0x28 < uVar11) {
                bVar2 = bVar3 - 0x20;
                cVar15 = bVar14 - 0x40;
code_r0x000180b27d0c:
                bStack_318 = cVar15 + bVar3 + (bVar14 & bVar2) * -2;
                uVar9 = uVar19;
code_r0x000180b27d12:
                if (uVar11 < 5) {
                  if (uVar9 + 6 < uVar11) {
                    bVar2 = bVar3 - 0x40;
                    cVar15 = bVar14 + 0x80;
code_r0x000180b27cce:
                    bStack_318 = cVar15 + bVar3 + (bVar14 & bVar2) * -2;
                  }
                  else {
                    if (uVar11 == uVar9 + 1) {
                      bVar2 = bVar3 + 0x80;
                      cVar15 = bVar3 + bVar14;
                      goto code_r0x000180b2811f;
                    }
                    if (uVar11 == uVar9 + 2) {
                      bVar17 = bVar3 + 0x40;
                      bVar2 = bVar14 + 0x80;
code_r0x000180b280e0:
                      uVar19 = uVar9;
code_r0x000180b280e3:
                      bStack_318 = bVar2 + bVar3 + (bVar14 & bVar17) * -2;
                      uVar9 = uVar19;
                      goto code_r0x000180b280ee;
                    }
                    if (uVar11 == uVar9 + 7) {
                      bStack_318 = bVar3 + bVar14 + (bVar14 & bVar3) * -2;
                      uVar10 = uVar10 - 1;
                      uVar19 = uVar9;
                      goto code_r0x000180b28136;
                    }
                    if (uVar11 == uVar9 + 6) {
                      bVar2 = bVar14 & bVar3 + 0x80;
                      cVar15 = bVar3 + bVar14;
                      goto code_r0x000180b28048;
                    }
                  }
                  if (99 < uVar9) {
                    bStack_318 = (bVar14 + 0x40 + bVar3 + (bVar14 & bVar3 + 0x40) * -2) * '\x02' +
                                 0x80;
                    goto code_r0x000180b2804d;
                  }
code_r0x000180b27cb1:
                  *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) = bStack_318;
                  uVar19 = uVar9;
                }
                else {
                  bVar17 = bVar14 * '\x02';
                  bVar2 = bVar3;
code_r0x000180b280a6:
                  bStack_318 = bVar17 + bVar3 + (bVar14 & bVar2) * -2;
                  *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) =
                       bVar14 + (bVar3 + 0x60 & bVar14) * -2 + -0x40 + bVar3 + bStack_318;
                  uVar11 = uVar11 + uVar9;
                  uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                  uVar19 = uVar9;
                }
              }
              else if (uVar11 == uVar19 + 1) {
code_r0x000180b28037:
                cVar15 = bVar14 + 0x40;
                bVar2 = bVar3 + 0xa0;
                uVar9 = uVar19;
code_r0x000180b2803f:
                bVar2 = bVar14 & bVar2;
                cVar15 = cVar15 + bVar3;
code_r0x000180b28048:
                bStack_318 = cVar15 + bVar2 * -2;
code_r0x000180b2804d:
                *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) =
                     bVar14 + 0x40 + (bVar3 + 0xa0 & bVar14) * -2 + bVar3;
                uVar10 = uVar10 - 1;
                uVar19 = uVar9 + 1;
              }
              else if (uVar11 == uVar19 + 2) {
code_r0x000180b27eca:
                bStack_318 = bVar3 + bVar14 + '@' + (bVar14 & bVar3 + 0x20) * -2;
                uVar10 = uVar10 - 1;
              }
              else {
                if (uVar11 != uVar19 + 5) {
                  if (uVar11 == uVar19 + 3) {
code_r0x000180b27fd3:
                    cVar15 = bVar14 + 0x40;
                    bVar2 = bVar3 + 0x20;
code_r0x000180b27fdb:
                    cVar15 = cVar15 + bVar3;
                    goto code_r0x000180b27fde;
                  }
                  uVar9 = uVar19;
                  if (uVar11 == uVar19 + 4) {
                    bVar2 = bVar3 + 0xa0;
code_r0x000180b28117:
                    cVar15 = bVar3 + bVar14 + '@';
                    goto code_r0x000180b2811f;
                  }
                  goto code_r0x000180b27d12;
                }
                bStack_318 = bVar3 + bVar14 + '@' + (bVar14 & bVar3 + 0xa0) * -2;
                uVar11 = uVar11 + uVar19;
                uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
              }
            }
            else {
              if (uVar11 != uVar19 + 1) {
                if (uVar11 == uVar19 + 5) {
                  bVar2 = bVar3 - 0x40;
code_r0x000180b27e4a:
                  bStack_318 = bVar3 + bVar14 + -0x80 + (bVar14 & bVar2) * -2;
                  uVar11 = uVar11 + uVar19;
                  uVar10 = (uVar10 - 1) - (ulonglong)bStack_318;
                }
                else {
                  if (uVar11 == uVar19 + 2) {
code_r0x000180b27e78:
                    bVar2 = bVar3 + 0x80;
                    uVar9 = uVar19;
                    bVar17 = bVar14;
code_r0x000180b280a0:
                    goto code_r0x000180b280a6;
                  }
                  if (uVar11 != uVar19 + 4) goto code_r0x000180b27d57;
                  bVar2 = bVar3 + 0x40;
code_r0x000180b27e99:
                  bStack_318 = bVar3 + bVar14 + -0x80 + (bVar14 & bVar2) * -2;
                  uVar10 = uVar10 - 1;
                }
                goto code_r0x000180b28136;
              }
              bVar2 = bVar3 - 0x40;
              cVar15 = bVar3 + bVar14 + -0x80;
code_r0x000180b2811f:
              bStack_318 = cVar15 + (bVar14 & bVar2) * -2;
code_r0x000180b2812a:
              uVar10 = uVar10 + *(byte *)((longlong)alStack_2a0 + (uVar10 - 0x38)) + uVar9;
              uVar19 = uVar9;
            }
code_r0x000180b28136:
            uVar10 = uVar10 + 1;
            uVar9 = uVar19;
          } while( true );
        }
        puStack_2b8[0] = 0;
        puStack_2b8[1] = 0;
        puStack_2b8[2] = 0;
        puStack_2b8[3] = 0;
        puStack_2b8[4] = 0;
        puStack_2b8[5] = 0;
        puStack_2b8[6] = 0;
        puStack_2b8[7] = 0;
        FUN_180191ab0(puStack_2b8,&UNK_180f467a8,0);
      }
code_r0x000180b2822b:
      FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_358);
      return;
    }
    bVar3 = abStack_308[uVar19];
    cVar15 = (char)uVar19;
code_r0x000180b256b0:
    if (uVar19 < uVar11) {
      pbVar20 = auStack_358 + 0x97a04d;
      goto LAB_180b260df;
    }
    if (uVar10 + 1 <= uVar11) {
      if (uVar11 != uVar10 + 1) {
        if (uVar11 == uVar10 + 2) {
          bVar14 = cVar15 - 9;
          cVar16 = bVar3 + 0x36;
          goto code_r0x000180b25fc7;
        }
        if (uVar11 == uVar10 + 3) {
          bVar14 = cVar15 + 0x19;
          cVar15 = cVar15 + bVar3 + 'j';
          goto code_r0x000180b25fa8;
        }
        if (uVar11 == uVar10 + 5) {
          bVar14 = cVar15 + 0x5d;
          cVar16 = bVar3 - 0x2e;
          goto code_r0x000180b25f67;
        }
        if (uVar11 != uVar10 + 7) {
          if (uVar11 != uVar10 + 4) goto LAB_180b25725;
          bVar14 = cVar15 - 0x3d;
          cVar16 = bVar3 + 0x6e;
code_r0x000180b25f09:
          bVar14 = bVar3 & bVar14;
          goto code_r0x000180b25f0f;
        }
        bVar14 = cVar15 + bVar3 + '\x06' + (bVar3 & cVar15 + 0x7fU) * -2;
        uVar19 = uVar19 - 1;
        goto code_r0x000180b2603d;
      }
      bVar14 = cVar15 + 0xb3;
      cVar15 = cVar15 + bVar3 + -0x32;
      goto code_r0x000180b26029;
    }
    bVar14 = (cVar15 + 0x91U & bVar3) * -2 + '\t' + cVar15 + 0x91U + bVar3;
LAB_180b25725:
    if (uVar19 < uVar10) {
      pbVar20 = auStack_358 + 0x141a9bc;
      goto LAB_180b260df;
    }
    if (uVar11 < uVar10 + 0x1000) {
      bVar14 = bVar3 + 0xbd + (cVar15 - 0x1bU) + (cVar15 - 0x1bU & bVar3) * -2;
    }
    else {
      if (uVar11 == uVar10 + 1) {
        bVar14 = cVar15 + 7;
        cVar16 = bVar3 - 0x2a;
        goto code_r0x000180b25f09;
      }
      if (uVar11 == uVar10 + 2) {
        bVar14 = cVar15 + bVar3 + '>' + (bVar3 & cVar15 + 0x4bU) * -2;
        uVar19 = uVar19 - 1;
        goto code_r0x000180b2603d;
      }
      if (uVar11 == uVar10 + 3) {
        bVar14 = cVar15 + bVar3 + -0x5a + (bVar3 & cVar15 + 0x8fU) * -2;
        uVar11 = uVar11 + uVar10;
        uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
        goto code_r0x000180b2603d;
      }
      if (uVar11 == uVar10 + 5) {
        bVar14 = cVar15 + bVar3 + -0x26 + (bVar3 & cVar15 + 0xb1U) * -2;
        uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
        goto code_r0x000180b2603d;
      }
      if (uVar11 == uVar10 + 7) {
        bVar14 = bVar3 & cVar15 - 0x2dU;
        cVar16 = bVar3 + 0xe;
        goto code_r0x000180b25fca;
      }
    }
    while (uVar9 = uVar10, uVar19 < uVar10 + uVar11) {
      while( true ) {
        do {
          uVar10 = uVar9;
          uVar13 = uVar10 + 8;
          if (uVar11 == uVar13) {
            bVar14 = cVar15 + 0x4e;
            cVar16 = bVar3 + 0x2c;
            goto code_r0x000180b25f09;
          }
          if (uVar11 == uVar10 + 0x7a) {
            bVar14 = cVar15 + bVar3 + '`' + (bVar3 & cVar15 + 0x70U) * -2;
            uVar10 = uVar10 + 1;
            uVar19 = uVar19 - 1;
            goto code_r0x000180b2603d;
          }
          if (uVar11 == uVar10 + 3) {
            bVar14 = cVar15 + bVar3 + -0x6c + (bVar3 & cVar15 + 0x92U) * -2;
            uVar19 = uVar19 - 1;
            goto code_r0x000180b2603d;
          }
          if (uVar11 == uVar10 + 10) {
            bVar14 = cVar15 + 0xb4;
            cVar16 = bVar3 - 0x38;
            goto code_r0x000180b25f67;
          }
          if (uVar11 == uVar10 + 100) {
            bVar14 = cVar15 + bVar3 + -4 + (bVar3 & cVar15 - 0x2aU) * -2;
            uVar11 = uVar11 + uVar10;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
            goto code_r0x000180b2603d;
          }
          if (uVar11 == uVar10 + 0x61) {
            bVar14 = cVar15 + bVar3 + '0' + (bVar3 & cVar15 - 8U) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
            goto code_r0x000180b2603d;
          }
          if (uVar11 == uVar10 + 2) {
            bVar14 = bVar3 & cVar15 + 0x1aU;
            cVar16 = bVar3 + 100;
            goto code_r0x000180b25fca;
          }
          if (uVar11 == uVar10 + 9) {
            bVar14 = bVar3 + 0x98 + cVar15 + (bVar3 & cVar15 + 0x3cU) * -2;
            goto code_r0x000180b25ff5;
          }
          if (uVar11 == uVar10 + 0x42) {
            bVar14 = cVar15 + 0x5e;
            cVar15 = cVar15 + bVar3 + -0x34;
            goto code_r0x000180b26029;
          }
          uVar9 = uVar10;
        } while (uVar11 == uVar10 + 4);
        if (uVar13 < uVar10 + 0x58) {
          bVar14 = bVar3 + cVar15 + 0x33U + -0x65 + (bVar3 & cVar15 + 0x33U) * -2;
          goto code_r0x000180b25645;
        }
        uVar9 = uVar10 + 0x18;
        if (uVar13 < uVar10 + 0x418) {
          bVar14 = bVar3 + cVar15 + 0x55U + -0x53 + (bVar3 & cVar15 + 0x55U) * -2;
          goto code_r0x000180b25680;
        }
        uVar11 = uVar13;
        if (uVar13 < uVar10 + 0x42) {
          bVar14 = bVar3 + 0xbf + cVar15 + 0x77U + (cVar15 + 0x77U & bVar3) * -2;
          uVar10 = uVar9;
          goto code_r0x000180b256b0;
        }
        if (uVar13 < uVar10 + 0x1e) {
          bVar14 = (bVar3 - 0x2f) + cVar15 + 0x99U + (cVar15 + 0x99U & bVar3) * -2;
          uVar10 = uVar9;
          goto LAB_180b25725;
        }
        if (uVar13 < uVar10 + 0x40) break;
        if (uVar13 < uVar10 + 0x400) {
          bVar14 = cVar15 - 0x23;
          cVar16 = bVar3 - 0x2e;
          uVar10 = uVar9;
          goto code_r0x000180b25b23;
        }
        if (uVar13 < uVar10 + 0x72) {
          bVar14 = cVar15 - 1;
          cVar16 = bVar3 + 6;
          uVar10 = uVar9;
          goto code_r0x000180b25ae4;
        }
        if (uVar13 < uVar10 + 0x5a) {
          bVar14 = cVar15 + 0x21;
          cVar16 = bVar3 + 0x3a;
          uVar10 = uVar9;
          goto code_r0x000180b25aae;
        }
        if (uVar13 < uVar10 + 0x1018) {
          bVar14 = cVar15 + bVar3 + 'n' + (bVar3 & cVar15 + 0x43U) * -2;
          uVar10 = uVar9;
          goto code_r0x000180b25a94;
        }
        if (uVar10 + 0x19 <= uVar13) {
          uVar11 = uVar10 + 0x1c;
          uVar9 = uVar10 + 0x24;
          if (uVar10 + 0x34 < uVar11) {
            bVar14 = cVar15 + bVar3 + 'p' + (bVar3 & cVar15 + 0x18U) * -2;
            uVar10 = uVar9;
            goto code_r0x000180b26031;
          }
          if (uVar10 + 0xa4 < uVar11) {
            bVar14 = bVar3 + 0xa4 + cVar15 + (bVar3 & cVar15 + 0x3aU) * -2;
            uVar10 = uVar9;
            goto code_r0x000180b25ff5;
          }
          if (uVar10 + 0x9e < uVar11) {
            bVar14 = bVar3 & cVar15 + 0x5cU;
            cVar16 = bVar3 - 0x28;
            uVar10 = uVar9;
            goto code_r0x000180b25fca;
          }
          if (uVar10 + 0x27 < uVar11) {
            bVar14 = cVar15 + 0x7e;
            cVar15 = cVar15 + bVar3 + '\f';
            uVar10 = uVar9;
            goto code_r0x000180b25fa8;
          }
          if (uVar10 + 0x40c < uVar11) {
            bVar14 = cVar15 + bVar3 + '@' + (cVar15 + 0xa0U & bVar3) * -2;
            uVar11 = uVar11 + uVar9;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
            uVar10 = uVar9;
            goto code_r0x000180b2603d;
          }
          if (uVar10 + 0x7e < uVar11) {
            bVar14 = cVar15 - 0x3e;
            cVar16 = bVar3 + 0x74;
            uVar10 = uVar9;
            goto code_r0x000180b25f67;
          }
          if (uVar10 + 0x29 < uVar11) {
            bVar14 = cVar15 + bVar3 + -0x58 + (cVar15 - 0x1cU & bVar3) * -2;
            uVar19 = uVar19 - 1;
            uVar10 = uVar9;
            goto code_r0x000180b2603d;
          }
          if (uVar10 + 0x44 < uVar11) {
            bVar14 = cVar15 + bVar3 + -0x24 + (cVar15 + 6U & bVar3) * -2;
            uVar19 = uVar19 - 1;
            uVar10 = uVar10 + 0x25;
            goto code_r0x000180b2603d;
          }
          if (uVar10 + 0x224 < uVar11) {
            bVar14 = cVar15 + 0x28U & bVar3;
            cVar16 = bVar3 + 0x10;
            uVar10 = uVar9;
            goto code_r0x000180b25f0f;
          }
          if (uVar11 <= uVar10 + 0x65) {
            uVar11 = uVar10 + 0x25;
            uVar9 = uVar10 + 0x29;
          }
        }
      }
      bVar14 = (bVar3 - 0x1d) + cVar15 + 0xbbU + (cVar15 + 0xbbU & bVar3) * -2;
      uVar10 = uVar9;
    }
    if (uVar11 < uVar10 + 0x42) {
      bVar14 = cVar15 + 0x91;
      cVar16 = bVar3 + 0x9a;
code_r0x000180b25b23:
      bVar14 = cVar16 + cVar15 + (bVar3 & bVar14) * -2;
code_r0x000180b25b29:
      if (uVar10 + uVar11 == 5) {
        bVar14 = cVar15 + 10U & bVar3;
        cVar16 = cVar15 + -0x3c;
code_r0x000180b25fcd:
        bVar14 = cVar16 + bVar14 * -2;
        bVar2 = bVar3 + 0x5e + (cVar15 + 0x9bU & bVar3) * -2 + cVar15;
        abStack_308[uVar19] = bVar2;
        uVar19 = (uVar19 - (uVar10 + 1)) - (ulonglong)bVar2;
        uVar10 = uVar10 + 1;
code_r0x000180b25ff5:
        abStack_308[uVar19] = (char)uVar19 + -8 + bVar3 + ((char)uVar19 + 0x2cU & bVar3) * -2;
        uVar11 = uVar11 + 1;
        uVar19 = uVar19 + ~uVar11;
        goto code_r0x000180b26031;
      }
      if (uVar10 + 9 < uVar11) {
        bVar14 = cVar15 + 0x8d;
        cVar16 = bVar3 + 0xb2;
code_r0x000180b25ae4:
        bVar14 = cVar16 + cVar15 + (bVar3 & bVar14) * -2;
code_r0x000180b25aea:
        if (uVar11 < 0x20) {
          if (uVar10 + 0x42 < uVar11) {
            bVar14 = cVar15 + 0x72;
            cVar16 = bVar3 + 0x54;
code_r0x000180b25aae:
            bVar14 = cVar16 + cVar15 + (bVar3 & bVar14) * -2;
          }
          else {
            if (uVar11 == uVar10 + 1) {
              bVar14 = cVar15 + 0x94;
              cVar15 = cVar15 + bVar3 + -0x78;
              goto code_r0x000180b26029;
            }
            if (uVar11 == uVar10 + 2) {
              bVar14 = bVar3 + 0xbc + cVar15 + (cVar15 + 0xb6U & bVar3) * -2;
              goto code_r0x000180b25ff5;
            }
            if (uVar11 == uVar10 + 3) {
              bVar14 = cVar15 - 0x28;
              cVar16 = bVar3 - 0x10;
code_r0x000180b25fc7:
              bVar14 = bVar14 & bVar3;
code_r0x000180b25fca:
              cVar16 = cVar16 + cVar15;
              goto code_r0x000180b25fcd;
            }
            if (uVar11 == uVar10 + 5) {
              bVar14 = cVar15 + bVar3 + 'X' + (cVar15 + 0x1cU & bVar3) * -2;
              uVar11 = uVar11 + uVar10;
              uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
              goto code_r0x000180b2603d;
            }
          }
          if (8 < uVar10) {
            bVar14 = (bVar3 + 0x5c + cVar15 + (cVar15 - 0x3aU & bVar3) * -2) * '\x02';
            goto code_r0x000180b25f17;
          }
code_r0x000180b25a94:
          abStack_308[uVar19] = bVar14;
        }
        else {
          bVar14 = cVar15 - 0x18;
          cVar16 = bVar3 * '\x02' + -0x70;
code_r0x000180b25f67:
          bVar14 = cVar16 + cVar15 + (bVar14 & bVar3) * -2;
          abStack_308[uVar19] = bVar3 + 0x2a + (cVar15 + 0x79U & bVar3) * -2 + cVar15 + bVar14;
          uVar11 = uVar11 + uVar10;
          uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
        }
      }
      else if (uVar11 == uVar10 + 1) {
        bVar14 = cVar15 + 0xafU & bVar3;
        cVar16 = bVar3 - 0x1a;
code_r0x000180b25f0f:
        bVar14 = cVar16 + cVar15 + bVar14 * -2;
code_r0x000180b25f17:
        abStack_308[uVar19] = (bVar3 - 10) + (cVar15 + 0x57U & bVar3) * -2 + cVar15;
        uVar19 = uVar19 - 1;
        uVar10 = uVar10 + 1;
      }
      else if (uVar11 == uVar10 + 2) {
        bVar14 = cVar15 + bVar3 + 'N' + (cVar15 - 0xdU & bVar3) * -2;
        uVar19 = uVar19 - 1;
      }
      else if (uVar11 == uVar10 + 3) {
        bVar14 = cVar15 + bVar3 + -0x4a + (cVar15 + 0x37U & bVar3) * -2;
        uVar11 = uVar11 + uVar10;
        uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
      }
      else {
        if (uVar11 != uVar10 + 4) {
          if (uVar11 == uVar10 + 5) {
            bVar14 = bVar3 + 0x52 + cVar15 + (cVar15 + 0x9dU & bVar3) * -2;
            goto code_r0x000180b25ff5;
          }
          if (uVar11 == uVar10 + 8) {
            bVar14 = cVar15 + 0xbf;
            cVar15 = cVar15 + bVar3 + -0x7a;
            goto code_r0x000180b26029;
          }
          goto code_r0x000180b25aea;
        }
        bVar14 = cVar15 + 0x59;
        cVar15 = cVar15 + bVar3 + -0x16;
code_r0x000180b25fa8:
        bVar14 = cVar15 + (bVar14 & bVar3) * -2;
        uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
      }
    }
    else {
      if (uVar11 != uVar10 + 1) {
        if (uVar11 != uVar10 + 2) {
          if (uVar11 == uVar10 + 3) {
            bVar14 = cVar15 + bVar3 + '\x14' + (cVar15 + 0x52U & bVar3) * -2;
            uVar11 = uVar11 + uVar10;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar14;
          }
          else {
            if (uVar11 != uVar10 + 6) goto code_r0x000180b25b29;
            bVar14 = cVar15 + bVar3 + '|' + (cVar15 + 0x96U & bVar3) * -2;
            uVar19 = uVar19 - 1;
          }
          goto code_r0x000180b2603d;
        }
        bVar14 = bVar3 + 0x78 + cVar15 + (cVar15 - 0x14U & bVar3) * -2;
        goto code_r0x000180b25ff5;
      }
      bVar14 = cVar15 - 0x36;
      cVar15 = cVar15 + bVar3 + 'D';
code_r0x000180b26029:
      bVar14 = cVar15 + (bVar14 & bVar3) * -2;
code_r0x000180b26031:
      uVar19 = uVar19 + abStack_308[uVar19] + uVar10;
    }
code_r0x000180b2603d:
    uVar19 = uVar19 + 1;
  } while( true );
}

