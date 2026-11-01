undefined8 * FUN_1801ad0f0(undefined8 *param_1,undefined4 param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  byte bVar3;
  byte bVar4;
  undefined4 uVar5;
  longlong lVar6;
  ulonglong *puVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  ulonglong uVar13;
  byte *pbVar14;
  byte bVar15;
  char cVar16;
  char cVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  undefined4 *puVar20;
  byte bStack_2e8;
  byte abStack_2d8 [48];
  undefined4 uStack_2a8;
  undefined4 uStack_2a4;
  undefined4 uStack_2a0;
  undefined4 uStack_29c;
  undefined4 uStack_298;
  undefined4 uStack_294;
  undefined4 uStack_290;
  undefined4 uStack_28c;
  undefined4 uStack_288;
  undefined4 uStack_284;
  undefined4 uStack_280;
  undefined4 uStack_27c;
  undefined4 uStack_278;
  undefined1 uStack_274;
  undefined8 uStack_273;
  undefined8 uStack_26b;
  byte abStack_258 [64];
  byte abStack_218 [80];
  undefined8 *puStack_1c8;
  byte abStack_1b8 [48];
  undefined8 *puStack_188;
  undefined4 uStack_180;
  ulonglong auStack_178 [5];
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 *puStack_f8;
  undefined1 auStack_f0 [32];
  undefined1 auStack_d0 [32];
  undefined1 auStack_b0 [32];
  undefined1 auStack_90 [32];
  undefined1 auStack_70 [48];
  
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[10] = 0;
  puVar10 = param_1 + 0xb;
  uStack_180 = 0;
  *(undefined4 *)puVar10 = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  puStack_1c8 = param_1;
  puStack_188 = puVar10;
  puStack_f8 = param_1;
  lVar6 = FUN_180e152f0(0x38);
  *(longlong *)lVar6 = lVar6;
  *(longlong *)(lVar6 + 8) = lVar6;
  param_1[0xc] = lVar6;
  param_1[0xe] = 0;
  param_1[0xf] = 0;
  param_1[0x10] = 0;
  param_1[0x11] = 7;
  param_1[0x12] = 8;
  *(undefined4 *)puVar10 = 0x3f800000;
  FUN_1801bef40(param_1 + 0xe,0x10,param_1[0xc]);
  param_1[0x13] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x16] = 0;
  param_1[0x17] = 0;
  func_0x000180b09ec0(param_1 + 0x18);
  *(undefined4 *)(param_1 + 0x31) = param_2;
  *(undefined4 *)((longlong)param_1 + 0x18c) = 0;
  param_1[0x32] = 0;
  param_1[0x33] = 0;
  param_1[0x34] = 0;
  param_1[0x35] = 0;
  param_1[0x36] = 0xf;
  *(undefined1 *)(param_1 + 0x33) = 0;
  param_1[0x37] = 0;
  param_1[0x38] = 0;
  param_1[0x39] = 0;
  param_1[0x3a] = 0xf;
  *(undefined1 *)(param_1 + 0x37) = 0;
  *(undefined1 *)(param_1 + 0x3b) = 0;
  param_1[0x3c] = 0;
  param_1[0x3d] = 0;
  param_1[0x3e] = 0;
  param_1[0x3f] = 0xf;
  *(undefined1 *)(param_1 + 0x3c) = 0;
  param_1[0x40] = 0;
  param_1[0x41] = 0;
  param_1[0x42] = 0;
  param_1[0x43] = 0xf;
  *(undefined1 *)(param_1 + 0x40) = 0;
  param_1[0x47] = 0;
  param_1[0x48] = 0;
  param_1[0x49] = 0;
  param_1[0x4a] = 0;
  param_1[0x4b] = 0;
  param_1[0x4c] = 0;
  param_1[0x45] = 0;
  param_1[0x46] = 0;
  *(undefined4 *)(param_1 + 0x4d) = 0xffffffff;
  *(undefined4 *)(param_1 + 0x44) = 2;
  *(undefined4 *)((longlong)param_1 + 0x26c) = 0;
  *(undefined1 *)(param_1 + 0x4e) = 0;
  lVar6 = OpenProcess(0x1ffffe,0,*(undefined4 *)(param_1 + 0x31));
  param_1[0x15] = lVar6;
  if (lVar6 == 0) {
    abStack_218[0] = 0x83;
    abStack_218[1] = 0x6a;
    abStack_218[2] = 0x7e;
    abStack_218[3] = 0x7a;
    abStack_218[4] = 0x65;
    abStack_218[5] = 0x73;
    abStack_218[6] = 0x72;
    abStack_218[7] = 0x47;
    abStack_218[8] = 99;
    abStack_218[9] = 0x76;
    abStack_218[10] = 0x68;
    abStack_218[0xb] = 0x6c;
    abStack_218[0xc] = 0x6c;
    abStack_218[0xd] = 0x6f;
    abStack_218[0xe] = 0x6b;
    abStack_218[0xf] = 0x78;
    abStack_218[0x10] = 0x68;
    abStack_218[0x11] = 0x6e;
    abStack_218[0x12] = 100;
    abStack_218[0x13] = 0x9e;
    abStack_218[0x14] = 0x7e;
    abStack_218[0x15] = 0x51;
    abStack_218[0x16] = 0x8c;
    abStack_218[0x17] = 0x96;
    abStack_218[0x18] = 0x8d;
    abStack_218[0x19] = 0x89;
    abStack_218[0x1a] = 0xaf;
    abStack_218[0x1b] = 0xaf;
    abStack_218[0x1c] = 0x68;
    abStack_218[0x1d] = 0xbd;
    abStack_218[0x1e] = 0xbd;
    abStack_218[0x1f] = 0x6f;
    abStack_218[0x20] = 0xb7;
    abStack_218[0x21] = 0xa8;
    abStack_218[0x22] = 0xb6;
    abStack_218[0x23] = 99;
    abStack_218[0x24] = 0xb8;
    abStack_218[0x25] = 0xa0;
    abStack_218[0x26] = 0xb4;
    abStack_218[0x27] = 0xa3;
    abStack_218[0x28] = 0xb8;
    abStack_218[0x29] = 0xa0;
    abStack_218[0x2a] = 0x7a;
    abStack_218[0x2b] = 0x90;
    abStack_218[0x2c] = 0xa1;
    abStack_218[0x2d] = 0xad;
    abStack_218[0x2e] = 0xa6;
    abStack_218[0x2f] = 0x7f;
    abStack_218[0x30] = 0x5d;
    abStack_218[0x31] = 0x5c;
    abStack_218[0x32] = 0x12;
    abStack_218[0x33] = 0;
    abStack_218[0x34] = 0;
    abStack_218[0x35] = 0;
    abStack_218[0x36] = 0;
    abStack_218[0x37] = 0;
    abStack_218[0x38] = 0;
    abStack_218[0x39] = 0;
    abStack_218[0x3a] = 0;
    abStack_218[0x3b] = 0;
    abStack_218[0x3c] = 0;
    abStack_218[0x3d] = 0;
    abStack_218[0x3e] = 0;
    abStack_218[0x3f] = 0;
    abStack_218[0x40] = 0;
    abStack_218[0x41] = 0;
    abStack_218[0x42] = 0;
    abStack_218[0x43] = 0;
    abStack_218[0x44] = 0;
    abStack_218[0x45] = 0;
    abStack_218[0x46] = 0;
    abStack_218[0x47] = 0;
    abStack_218[0x48] = 0;
    abStack_218[0x49] = 0;
    abStack_218[0x4a] = 0;
    abStack_218[0x4b] = 0;
    abStack_218[0x4c] = 0;
    abStack_218[0x4d] = 0;
    pbVar14 = abStack_218;
    bVar15 = bStack_2e8;
LAB_1801ad35b:
    puVar7 = (ulonglong *)func_0x000180b36780();
    uVar13 = *puVar7;
    puVar7 = (ulonglong *)func_0x000180b36790();
    uVar11 = *puVar7;
LAB_1801ad393:
    uVar12 = uVar11;
    for (uVar18 = 0; uVar18 < 0x4e; uVar18 = uVar18 + 1) {
      bVar4 = abStack_218[uVar18];
      cVar16 = (char)uVar18;
LAB_1801ad3c3:
      if (uVar18 < uVar13) {
        pbVar14 = &stack0x0116c976;
        break;
      }
      if (uVar12 + 1 <= uVar13) {
        if (uVar13 == uVar12 + 1) {
          bVar15 = cVar16 + 0x92;
          cVar16 = cVar16 + bVar4 + -0x6c;
          goto LAB_1801add1b;
        }
        if (uVar13 == uVar12 + 3) {
          bVar15 = cVar16 + 0xaa;
          cVar17 = bVar4 + 4;
          goto LAB_1801adcb9;
        }
        if (uVar13 == uVar12 + 5) {
          bVar15 = cVar16 - 0x32;
          cVar17 = bVar4 + 0x2c;
          goto LAB_1801adc76;
        }
        if (uVar13 == uVar12 + 7) {
          bVar15 = cVar16 + bVar4 + -0x1c + (cVar16 - 0x26U & bVar4) * -2;
          uVar18 = uVar18 - 1;
        }
        else {
          if (uVar13 != uVar12 + 2) {
            if (uVar13 != uVar12 + 4) goto LAB_1801ad440;
            bVar15 = cVar16 - 0xe;
            cVar17 = bVar4 + 0x54;
            goto LAB_1801adc08;
          }
          bVar15 = cVar16 + bVar4 + -100 + (cVar16 - 0x1aU & bVar4) * -2;
          uVar12 = uVar12 + 1;
          uVar18 = uVar18 - 1;
        }
        goto LAB_1801add2f;
      }
      bVar15 = (bVar4 & cVar16 + 0x86U) * -2 + 'V' + bVar4 + cVar16 + 0x86U;
LAB_1801ad440:
      if (uVar18 < uVar12) {
        pbVar14 = &stack0x016573f0;
        break;
      }
      if (uVar13 < uVar12 + 9) {
        bVar15 = bVar4 + 0xe + (cVar16 - 2U) + (cVar16 - 2U & bVar4) * -2;
      }
      else {
        if (uVar13 == uVar12 + 1) {
          bVar15 = cVar16 + 10;
          cVar17 = bVar4 - 0x3c;
          goto LAB_1801adc08;
        }
        if (uVar13 == uVar12 + 5) {
          bVar15 = cVar16 + bVar4 + '\\' + (cVar16 + 0x46U & bVar4) * -2;
          uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
          goto LAB_1801add2f;
        }
        if (uVar13 == uVar12 + 6) {
          bVar15 = (bVar4 - 0x34) + cVar16 + (cVar16 + 0x5eU & bVar4) * -2;
          goto LAB_1801adce7;
        }
        if (uVar13 == uVar12 + 8) {
          bVar15 = cVar16 + 0x6a;
          cVar16 = cVar16 + bVar4 + -0x7c;
          goto LAB_1801add1b;
        }
      }
      while (uVar11 = uVar12, uVar18 < uVar12 + uVar13) {
        while( true ) {
          do {
            uVar12 = uVar11;
            if (uVar13 == uVar12 + 4) {
              bVar15 = cVar16 + 0x94;
              cVar17 = bVar4 + 0x88;
              goto LAB_1801adc08;
            }
            if (uVar13 == uVar12 + 10) {
              bVar15 = cVar16 + bVar4 + '@' + (cVar16 + 0xa0U & bVar4) * -2;
              uVar12 = uVar12 + 1;
              uVar18 = uVar18 - 1;
              goto LAB_1801add2f;
            }
            if (uVar13 == uVar12 + 5) {
              bVar15 = cVar16 + bVar4 + -8 + (cVar16 + 0xacU & bVar4) * -2;
              uVar18 = uVar18 - 1;
              goto LAB_1801add2f;
            }
            if (uVar13 == uVar12 + 0x10) {
              bVar15 = bVar4 & cVar16 + 0xb8U;
              cVar17 = bVar4 + 0xb0;
              goto LAB_1801adc79;
            }
            if (uVar13 == uVar12 + 100) {
              bVar15 = cVar16 + bVar4 + 'h' + (bVar4 & cVar16 - 0x3cU) * -2;
              uVar13 = uVar13 + uVar12;
              uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
              goto LAB_1801add2f;
            }
            if (uVar13 == uVar12 + 0x1000) {
              bVar15 = cVar16 + bVar4 + ' ' + (bVar4 & cVar16 - 0x30U) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
              goto LAB_1801add2f;
            }
            if (uVar13 == uVar12 + 0x2a) {
              bVar15 = cVar16 - 0x24;
              cVar17 = bVar4 - 0x28;
              goto LAB_1801adcb9;
            }
            if (uVar13 == uVar12 + 0x61) {
              bVar15 = bVar4 + 0x90 + cVar16 + (bVar4 & cVar16 - 0x18U) * -2;
              goto LAB_1801adce7;
            }
            if (uVar13 == uVar12 + 1) {
              bVar15 = cVar16 + bVar4 + 'H' + (bVar4 & cVar16 - 0xcU) * -2;
              goto LAB_1801add23;
            }
            uVar11 = uVar12;
          } while (uVar13 == uVar12 + 6);
          uVar13 = uVar12 + 0x40;
          if (uVar13 < uVar12 + 0x6a) {
            bVar15 = bVar4 + cVar16 + 0x92U + '\x02' + (bVar4 & cVar16 + 0x92U) * -2;
            goto LAB_1801ad35b;
          }
          uVar11 = uVar12 + 0x60;
          if (uVar13 < uVar12 + 0xa2) {
            bVar15 = bVar4 + cVar16 + 0x9eU + -0x52 + (bVar4 & cVar16 + 0x9eU) * -2;
            goto LAB_1801ad393;
          }
          if (uVar13 < uVar12 + 0x460) {
            bVar15 = bVar4 + 0x5a + cVar16 + 0xaaU + (cVar16 + 0xaaU & bVar4) * -2;
            uVar12 = uVar11;
            goto LAB_1801ad3c3;
          }
          if (uVar13 < uVar12 + 0xba) {
            bVar15 = bVar4 + 6 + cVar16 + 0xb6U + (cVar16 + 0xb6U & bVar4) * -2;
            uVar12 = uVar11;
            goto LAB_1801ad440;
          }
          if (uVar13 < uVar12 + 100) break;
          if (uVar13 < uVar12 + 0x8a) {
            bVar15 = cVar16 - 0x32;
            cVar17 = ',';
            uVar12 = uVar11;
            goto LAB_1801ad886;
          }
          if (uVar13 < uVar12 + 0x65) {
            bVar15 = cVar16 - 0x26;
            cVar17 = -0x1c;
            uVar12 = uVar11;
            goto LAB_1801ad84a;
          }
          if (uVar13 < uVar12 + 0x70) {
            bVar15 = cVar16 - 0x1a;
            cVar17 = -100;
            uVar12 = uVar11;
            goto LAB_1801ad806;
          }
          if (uVar13 < uVar12 + 0xc4) {
            bVar15 = cVar16 + bVar4 + 'T' + (bVar4 & cVar16 - 0xeU) * -2;
            uVar12 = uVar11;
            goto LAB_1801ad7e9;
          }
          if (uVar12 + 0x1060 <= uVar13) {
            uVar13 = uVar12 + 0x448;
            uVar11 = uVar12 + 0x4c8;
            if (uVar12 + 0x509 < uVar13) {
              bVar15 = cVar16 + bVar4 + -0x60 + (bVar4 & cVar16 + 0x90U) * -2;
              uVar12 = uVar11;
              goto LAB_1801add23;
            }
            if (uVar12 + 0x4cb < uVar13) {
              bVar15 = bVar4 + 0x58 + cVar16 + (bVar4 & cVar16 + 0x9cU) * -2;
              uVar12 = uVar11;
              goto LAB_1801adce7;
            }
            if (uVar12 + 0x4d1 < uVar13) {
              bVar15 = cVar16 + 0xa8;
              cVar17 = bVar4 + 0x10;
              uVar12 = uVar11;
              goto LAB_1801adcb9;
            }
            if (uVar12 + 0x4cc < uVar13) {
              bVar15 = cVar16 + bVar4 + -0x38 + (bVar4 & cVar16 + 0xb4U) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
              uVar12 = uVar11;
              goto LAB_1801add2f;
            }
            if (uVar12 + 0x4d2 < uVar13) {
              bVar15 = cVar16 + bVar4 + -0x80 + (bVar4 & cVar16 - 0x40U) * -2;
              uVar13 = uVar13 + uVar11;
              uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
              uVar12 = uVar11;
              goto LAB_1801add2f;
            }
            if (uVar12 + 0x50a < uVar13) {
              bVar15 = bVar4 & cVar16 - 0x34U;
              cVar17 = bVar4 + 0x38;
              uVar12 = uVar11;
              goto LAB_1801adc79;
            }
            if (uVar12 + 0x8c8 < uVar13) {
              bVar15 = cVar16 + bVar4 + -0x10 + (bVar4 & cVar16 - 0x28U) * -2;
              uVar18 = uVar18 - 1;
              uVar12 = uVar11;
              goto LAB_1801add2f;
            }
            if (uVar12 + 0x522 < uVar13) {
              bVar15 = cVar16 + bVar4 + -0x58 + (bVar4 & cVar16 - 0x1cU) * -2;
              uVar18 = uVar18 - 1;
              uVar12 = uVar12 + 0x4c9;
              goto LAB_1801add2f;
            }
            if (uVar12 + 0x14c8 < uVar13) {
              bVar15 = cVar16 - 0x10;
              cVar17 = bVar4 + 0x60;
              uVar12 = uVar11;
              goto LAB_1801adc08;
            }
            if (uVar13 <= uVar12 + 0x4f2) {
              uVar13 = uVar12 + 0x4d0;
              uVar11 = uVar12 + 0x4d5;
            }
          }
        }
        bVar15 = bVar4 + 0xb2 + (cVar16 - 0x3eU) + (cVar16 - 0x3eU & bVar4) * -2;
        uVar12 = uVar11;
      }
      if (uVar13 < uVar12 + 100) {
        bVar15 = cVar16 + 0x86;
        cVar17 = -0x24;
LAB_1801ad886:
        bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801ad88c:
        if (uVar12 + uVar13 == 100) {
          bVar15 = cVar16 + 0x7c;
          cVar17 = cVar16 + '\x18';
LAB_1801adcbc:
          bVar15 = cVar17 + (bVar15 & bVar4) * -2;
          bVar3 = (bVar4 - 0xc) + (cVar16 + 2U & bVar4) * -2 + cVar16;
          abStack_218[uVar18] = bVar3;
          uVar18 = (uVar18 - (uVar12 + 1)) - (ulonglong)bVar3;
          uVar12 = uVar12 + 1;
LAB_1801adce7:
          abStack_218[uVar18] = (char)uVar18 + -0x30 + bVar4 + ((char)uVar18 + 0x88U & bVar4) * -2;
          uVar13 = uVar13 + 1;
          uVar18 = uVar18 + ~uVar13;
          goto LAB_1801add23;
        }
        if (uVar12 + 0x7a < uVar13) {
          bVar15 = cVar16 - 0x12;
          cVar17 = 'l';
LAB_1801ad84a:
          bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801ad850:
          if (uVar13 < 4) {
            if (uVar12 + 2 < uVar13) {
              bVar15 = cVar16 - 0x14;
              cVar17 = 'x';
LAB_1801ad806:
              bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801ad80c:
              if (999 < uVar12) {
                bVar15 = (bVar4 + 100 + cVar16 + (bVar4 & cVar16 + 100U) * -2) * '\x02' + 0x88;
                goto LAB_1801adc10;
              }
LAB_1801ad7e9:
              abStack_218[uVar18] = bVar15;
            }
            else {
              if (uVar13 == uVar12 + 1) {
                bVar15 = cVar16 - 8;
                cVar16 = cVar16 + bVar4 + '0';
                goto LAB_1801add1b;
              }
              if (uVar13 == uVar12 + 3) {
                bVar15 = cVar16 + 0x10;
                cVar17 = bVar4 + 0xa0;
                goto LAB_1801adcb9;
              }
              if (uVar13 == uVar12 + 6) {
                bVar15 = cVar16 + 0x34;
                cVar17 = bVar4 - 0x38;
                goto LAB_1801adc76;
              }
              if (uVar13 == uVar12 + 4) {
                bVar15 = cVar16 + bVar4 + -0x80 + (cVar16 + 0x40U & bVar4) * -2;
                uVar18 = uVar18 - 1;
              }
              else {
                if (uVar13 != uVar12 + 2) goto LAB_1801ad80c;
                bVar15 = cVar16 + bVar4 + '8' + (cVar16 + 0x4cU & bVar4) * -2;
                uVar12 = uVar12 + 1;
                uVar18 = uVar18 - 1;
              }
            }
          }
          else {
            bVar15 = bVar4 & cVar16 + 0x70U;
            cVar17 = bVar4 * '\x02' + '`';
LAB_1801adc79:
            bVar15 = cVar17 + cVar16 + bVar15 * -2;
            abStack_218[uVar18] = bVar4 + 0x3c + (cVar16 - 10U & bVar4) * -2 + cVar16 + bVar15;
            uVar13 = uVar13 + uVar12;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
          }
        }
        else {
          if (uVar13 != uVar12 + 1) {
            if (uVar13 != uVar12 + 2) {
              if (uVar13 == uVar12 + 5) {
                bVar15 = cVar16 + bVar4 + '\x04' + (cVar16 + 0x2aU & bVar4) * -2;
                uVar13 = uVar13 + uVar12;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
                goto LAB_1801add2f;
              }
              if (uVar13 == uVar12 + 3) {
                bVar15 = cVar16 + 0x42;
                cVar17 = bVar4 + 0x74;
                goto LAB_1801adcb9;
              }
              goto LAB_1801ad850;
            }
            bVar15 = cVar16 + 0x1e;
            cVar17 = bVar4 + 0x4c;
LAB_1801adc76:
            bVar15 = bVar15 & bVar4;
            goto LAB_1801adc79;
          }
          bVar15 = cVar16 - 6;
          cVar17 = bVar4 + 0x24;
LAB_1801adc08:
          bVar15 = cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801adc10:
          abStack_218[uVar18] = bVar4 + 0x84 + (cVar16 - 0x16U & bVar4) * -2 + cVar16;
          uVar18 = uVar18 - 1;
          uVar12 = uVar12 + 1;
        }
      }
      else {
        if (uVar13 != uVar12 + 1) {
          if (uVar13 != uVar12 + 3) {
            if (uVar13 != uVar12 + 4) {
              if (uVar13 == uVar12 + 5) {
                bVar15 = cVar16 + 0x38;
                cVar17 = bVar4 + 0xb0;
                goto LAB_1801adc76;
              }
              if (uVar13 != uVar12 + 8) goto LAB_1801ad88c;
              bVar15 = cVar16 + 0x5c;
              cVar17 = bVar4 - 0x28;
              goto LAB_1801adc08;
            }
            bVar15 = cVar16 + bVar4 + '@' + (cVar16 + 0x20U & bVar4) * -2;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
            goto LAB_1801add2f;
          }
          bVar15 = cVar16 + 0x14;
          cVar17 = bVar4 + 0x88;
LAB_1801adcb9:
          cVar17 = cVar17 + cVar16;
          goto LAB_1801adcbc;
        }
        bVar15 = cVar16 - 4;
        cVar16 = cVar16 + bVar4 + '\x18';
LAB_1801add1b:
        bVar15 = cVar16 + (bVar15 & bVar4) * -2;
LAB_1801add23:
        uVar18 = uVar18 + abStack_218[uVar18] + uVar12;
      }
LAB_1801add2f:
    }
    auStack_178[0] = 0;
    auStack_178[1] = 0;
    auStack_178[2] = 0;
    auStack_178[3] = 0;
    uVar8 = FUN_180f29c00(pbVar14);
    FUN_180191ab0(auStack_178,pbVar14,uVar8);
    FUN_1801a4a90(auStack_178);
    if (0xf < auStack_178[3]) {
      if (auStack_178[3] + 1 < 0x1000) {
        lVar6 = 1;
        uVar13 = auStack_178[0];
      }
      else {
        if (0x1f < (auStack_178[0] - *(ulonglong *)(auStack_178[0] - 8)) - 8) {
          pcVar2 = (code *)swi(0x29);
          (*pcVar2)(5);
          pcVar2 = (code *)swi(3);
          puVar10 = (undefined8 *)(*pcVar2)();
          return puVar10;
        }
        lVar6 = 0x28;
        uVar13 = *(ulonglong *)(auStack_178[0] - 8);
      }
      func_0x000180e15340(uVar13,auStack_178[3] + lVar6);
    }
    puVar10 = puStack_1c8;
    auStack_178[2] = 0;
    auStack_178[3] = 0xf;
    auStack_178[0] = auStack_178[0] & 0xffffffffffffff00;
    lVar6 = OpenProcess(0x438,0,*(undefined4 *)(puStack_1c8 + 0x31));
    puVar10[0x15] = lVar6;
    if (lVar6 == 0) {
      uStack_2a8 = 0x4a4e725b;
      uStack_2a4 = 0x17424b71;
      uStack_2a0 = 0x5854566b;
      uStack_29c = 0x6c5b5f58;
      uStack_298 = 0x4e505e54;
      uStack_294 = 0x4640056e;
      uStack_290 = 0x3f3fc5c1;
      uStack_28c = 0x7fc1c97c;
      uStack_288 = 0x73c63437;
      uStack_284 = 0x33c834cc;
      uStack_280 = 0xdc6a2cd4;
      uStack_27c = 0x6fd6d9d5;
      uStack_278 = 0x3a3d3632;
      uStack_274 = 0x44;
      uStack_273 = 0;
      uStack_26b = 0;
      puVar20 = &uStack_2a8;
      bVar15 = bStack_2e8;
LAB_1801adf1b:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar13 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar11 = *puVar7;
LAB_1801adf53:
      uVar12 = uVar11;
      uVar18 = uVar13;
      for (uVar19 = 0; uVar19 < 0x45; uVar19 = uVar19 + 1) {
        bVar4 = *(byte *)((longlong)&uStack_2a8 + uVar19);
        bVar3 = (byte)uVar19;
LAB_1801adf83:
        if (uVar19 < uVar18) {
          puVar20 = (undefined4 *)&stack0x00fbb860;
          break;
        }
        if (uVar12 + 1 <= uVar18) {
          if (uVar18 != uVar12 + 1) {
            if (uVar18 == uVar12 + 3) {
              bVar15 = bVar3 + 0x18 & bVar4;
              cVar16 = bVar4 + 0x70;
              goto LAB_1801ae8f9;
            }
            if (uVar18 == uVar12 + 4) {
              bVar15 = bVar3 + 0x68;
              cVar16 = bVar3 + bVar4 + -0x70;
              goto LAB_1801ae8d7;
            }
            if (uVar18 != uVar12 + 5) {
              if (uVar18 != uVar12 + 2) goto LAB_1801adff0;
              bVar15 = bVar3 + 8;
              cVar16 = bVar4 - 0x30;
              goto LAB_1801ae86d;
            }
            bVar15 = bVar3 + bVar4 + -0x50 + (bVar3 + 0xb8 & bVar4) * -2;
            uVar18 = uVar18 + uVar12;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
            goto LAB_1801ae96f;
          }
          bVar15 = bVar3 + bVar4 + '0' + (bVar3 + 0x78 & bVar4) * -2;
          goto LAB_1801ae963;
        }
        bVar15 = (bVar4 & bVar3 + 0x28) * -2 + -0x18 + bVar4 + bVar3 + 0x28;
LAB_1801adff0:
        if (uVar19 < uVar12) {
          puVar20 = (undefined4 *)&stack0x017d9838;
          break;
        }
        if (uVar12 + 8 <= uVar18) {
          if (uVar18 == uVar12 + 1) {
            bVar15 = bVar3 + 0x98;
            cVar16 = bVar4 + 0x70;
            goto LAB_1801ae834;
          }
          if (uVar18 == uVar12 + 2) {
            bVar15 = bVar3 + bVar4 + -0x50 + (bVar3 + 0x38 & bVar4) * -2;
            uVar19 = uVar19 - 1;
          }
          else if (uVar18 == uVar12 + 5) {
            bVar15 = bVar3 + bVar4 + -0x10 + (bVar3 - 0x28 & bVar4) * -2;
            uVar18 = uVar18 + uVar12;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
          }
          else {
            if (uVar18 != uVar12 + 3) {
              if (uVar18 != uVar12 + 6) goto LAB_1801ae060;
              bVar15 = bVar4 & bVar3 + 0x78;
              cVar16 = bVar4 + 0x30;
              goto LAB_1801ae8f9;
            }
            bVar15 = bVar3 + bVar4 + '\x10' + (bVar4 & bVar3 + 0x28) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
          }
          goto LAB_1801ae96f;
        }
        bVar15 = bVar4 + 8 + bVar3 + 0x48 + (bVar3 + 0x48 & bVar4) * -2;
LAB_1801ae060:
        while (uVar11 = uVar12, uVar19 < uVar12 + uVar18) {
          while( true ) {
            do {
              uVar12 = uVar11;
              if (uVar18 == uVar12 + 100) {
                bVar15 = bVar4 & bVar3 + 0x30;
                cVar16 = bVar4 - 0x20;
                goto LAB_1801ae837;
              }
              if (uVar18 == uVar12 + 0x80) {
                bVar15 = bVar3 + bVar4 + (bVar4 & bVar3 + 0x80) * -2;
                uVar12 = uVar12 + 1;
                uVar19 = uVar19 - 1;
                goto LAB_1801ae96f;
              }
              if (uVar18 == uVar12 + 9) {
                bVar15 = bVar3 + bVar4 + ' ' + (bVar4 & bVar3 - 0x30) * -2;
                uVar19 = uVar19 - 1;
                goto LAB_1801ae96f;
              }
              uVar13 = uVar12 + 10;
              if (uVar18 == uVar13) {
                bVar15 = bVar4 & bVar3 + 0x20;
                cVar16 = bVar4 + 0x40;
                goto LAB_1801ae870;
              }
              if (uVar18 == uVar12 + 1) {
                bVar15 = bVar3 + bVar4 + '`' + (bVar4 & bVar3 + 0x70) * -2;
                uVar18 = uVar18 + uVar12;
                uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                goto LAB_1801ae96f;
              }
              if (uVar18 == uVar12 + 2) {
                bVar15 = bVar3 + bVar4 + -0x80 + (bVar4 & bVar3 - 0x40) * -2;
                uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                goto LAB_1801ae96f;
              }
              if (uVar18 == uVar12 + 0x400) {
                bVar15 = bVar4 & bVar3 + 0x10;
                cVar16 = bVar4 + 0xa0;
                goto LAB_1801ae8f9;
              }
              if (uVar18 == uVar12 + 0x1000) {
                bVar15 = (bVar4 - 0x40) + bVar3 + (bVar4 & bVar3 + 0x60) * -2;
                goto LAB_1801ae927;
              }
              if (uVar18 == uVar12 + 0x28) {
                bVar15 = bVar3 + bVar4 + -0x20 + (bVar4 & bVar3 + 0xb0) * -2;
                goto LAB_1801ae963;
              }
              uVar11 = uVar12;
            } while (uVar18 == uVar12 + 0x40);
            if (uVar13 < uVar12 + 0x10) {
              bVar15 = bVar4 + bVar3 + 0x78 + -0x48 + (bVar4 & bVar3 + 0x78) * -2;
              goto LAB_1801adf1b;
            }
            uVar11 = uVar12 + 0xf;
            if (uVar13 < uVar12 + 0x11) {
              bVar15 = bVar4 + (bVar3 - 0x38) + -0x78 + (bVar4 & bVar3 - 0x38) * -2;
              goto LAB_1801adf53;
            }
            uVar18 = uVar13;
            if (uVar13 < uVar12 + 0x40f) {
              bVar15 = bVar4 + 0x58 + bVar3 + 0x18 + (bVar3 + 0x18 & bVar4) * -2;
              uVar12 = uVar11;
              goto LAB_1801adf83;
            }
            uVar1 = uVar12 + 0x100f;
            if (uVar13 < uVar1) {
              bVar15 = bVar4 + 0x28 + bVar3 + 0x68 + (bVar3 + 0x68 & bVar4) * -2;
              uVar12 = uVar11;
              goto LAB_1801adff0;
            }
            if (uVar13 < uVar12 + 0x37) break;
            if (uVar13 < uVar12 + 0x4f) {
              bVar15 = bVar3 + 8;
              cVar16 = -0x30;
              uVar12 = uVar11;
              goto LAB_1801ae443;
            }
            if (uVar13 < uVar12 + 0x14) {
              bVar15 = bVar3 + 0x58;
              cVar16 = -0x10;
              uVar12 = uVar11;
              goto LAB_1801ae401;
            }
            if (uVar13 < uVar12 + 0x15) {
              bVar15 = bVar3 + 0xa8;
              cVar16 = '\x10';
              uVar12 = uVar11;
              goto LAB_1801ae3c0;
            }
            if (uVar13 < uVar12 + 0x50) {
              bVar15 = bVar3 + bVar4 + '0' + (bVar4 & bVar3 - 8) * -2;
              uVar12 = uVar11;
              goto LAB_1801ae3a6;
            }
            if (uVar12 + 0x69 <= uVar13) {
              uVar11 = uVar12 + 0x108f;
              uVar18 = uVar1;
              if (uVar12 + 0x10b7 < uVar1) {
                bVar15 = bVar3 + bVar4 + -0x80 + (bVar4 & bVar3 - 0x40) * -2;
                uVar12 = uVar11;
                goto LAB_1801ae963;
              }
              if (uVar12 + 0x10cf < uVar1) {
                bVar15 = bVar4 + 0xa0 + bVar3 + (bVar4 & bVar3 + 0x10) * -2;
                uVar12 = uVar11;
                goto LAB_1801ae927;
              }
              if (uVar12 + 0x1094 < uVar1) {
                bVar15 = bVar4 & bVar3 + 0x60;
                cVar16 = bVar4 - 0x40;
                uVar12 = uVar11;
                goto LAB_1801ae8f9;
              }
              if (uVar12 + 0x1095 < uVar1) {
                bVar15 = bVar3 + bVar4 + -0x20 + (bVar4 & bVar3 + 0xb0) * -2;
                uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                uVar12 = uVar11;
                goto LAB_1801ae96f;
              }
              if (uVar12 + 0x10d0 < uVar1) {
                bVar15 = bVar3 + bVar4 + (bVar4 & bVar3) * -2;
                uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                uVar12 = uVar11;
                uVar18 = uVar1 + uVar11;
                goto LAB_1801ae96f;
              }
              if (uVar12 + 0x10e9 < uVar1) {
                bVar15 = bVar4 & bVar3 + 0x50;
                cVar16 = bVar4 + 0x20;
                uVar12 = uVar11;
                goto LAB_1801ae870;
              }
              if (uVar12 + 0x110f < uVar1) {
                bVar15 = bVar3 + bVar4 + '@' + (bVar4 & bVar3 + 0xa0) * -2;
                uVar19 = uVar19 - 1;
                uVar12 = uVar11;
                goto LAB_1801ae96f;
              }
              if (uVar12 + 0x128f < uVar1) {
                bVar15 = bVar3 + bVar4 + '`' + (bVar4 & bVar3 - 0x10) * -2;
                uVar19 = uVar19 - 1;
                uVar12 = uVar12 + 0x1090;
                goto LAB_1801ae96f;
              }
              if (uVar12 + 0x1099 < uVar1) {
                bVar15 = bVar4 & bVar3 + 0x40;
                cVar16 = bVar4 + 0x80;
                uVar12 = uVar11;
                goto LAB_1801ae837;
              }
              if (uVar1 <= uVar12 + 0x109f) {
                uVar11 = uVar12 + 0x1097;
                uVar18 = uVar12 + 0x1095;
              }
            }
          }
          bVar15 = (bVar4 - 8) + bVar3 + 0xb8 + (bVar3 + 0xb8 & bVar4) * -2;
          uVar12 = uVar11;
        }
        if (uVar18 < uVar12 + 0x7a) {
          bVar15 = bVar3 + 0x28;
          cVar16 = '\x10';
LAB_1801ae443:
          bVar15 = bVar4 + cVar16 + bVar3 + (bVar4 & bVar15) * -2;
LAB_1801ae449:
          if (uVar12 + uVar18 == 0x80) {
            bVar15 = bVar4 & bVar3 + 0x90;
            cVar16 = bVar3 + 0xa0;
LAB_1801ae8fc:
            bVar15 = cVar16 + bVar15 * -2;
            bVar3 = bVar4 + 0xb0 + (bVar3 + 0xb8 & bVar4) * -2 + bVar3;
            *(byte *)((longlong)&uStack_2a8 + uVar19) = bVar3;
            uVar19 = (uVar19 - (uVar12 + 1)) - (ulonglong)bVar3;
            uVar12 = uVar12 + 1;
LAB_1801ae927:
            *(byte *)((longlong)&uStack_2a8 + uVar19) =
                 (char)uVar19 + -0x40 + bVar4 + ((char)uVar19 - 0x20U & bVar4) * -2;
            uVar19 = uVar19 + ~(uVar18 + 1);
            uVar18 = uVar18 + 1;
            goto LAB_1801ae963;
          }
          if (uVar12 + 0x28 < uVar18) {
            bVar15 = bVar3 + 0x88;
            cVar16 = -0x30;
LAB_1801ae401:
            bVar15 = bVar4 + cVar16 + bVar3 + (bVar4 & bVar15) * -2;
LAB_1801ae407:
            if (uVar18 < 2) {
              if (uVar12 + 0x41 < uVar18) {
                bVar15 = bVar3 - 0x30;
                cVar16 = ' ';
LAB_1801ae3c0:
                bVar15 = bVar4 + cVar16 + bVar3 + (bVar4 & bVar15) * -2;
LAB_1801ae3c6:
                if (3 < uVar12) {
                  bVar15 = ((bVar4 - 0x10) + bVar3 + (bVar4 & bVar3 - 0x10) * -2) * '\x02' - 0x20;
                  goto LAB_1801ae83f;
                }
LAB_1801ae3a6:
                *(byte *)((longlong)&uStack_2a8 + uVar19) = bVar15;
              }
              else {
                if (uVar18 == uVar12 + 1) {
                  bVar15 = bVar3 + bVar4 + '@' + (bVar4 & bVar3 + 0x20) * -2;
                  goto LAB_1801ae963;
                }
                if (uVar18 == uVar12 + 3) {
                  bVar15 = bVar3 + 0x10;
                  cVar16 = bVar3 + bVar4 + -0x60;
LAB_1801ae8d7:
                  bVar15 = cVar16 + (bVar15 & bVar4) * -2;
                  uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                }
                else {
                  if (uVar18 != uVar12 + 2) {
                    if (uVar18 == uVar12 + 5) {
                      bVar15 = bVar3 + 0xa0;
                      cVar16 = bVar4 + 0x40;
LAB_1801ae834:
                      bVar15 = bVar15 & bVar4;
                      goto LAB_1801ae837;
                    }
                    goto LAB_1801ae3c6;
                  }
                  bVar15 = bVar3 + bVar4 + -0x40 + (bVar3 + 0x60 & bVar4) * -2;
                  uVar18 = uVar18 + uVar12;
                  uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
                }
              }
            }
            else {
              bVar15 = bVar4 * '\x02' + bVar3 + (bVar4 & bVar3 + 0x40) * -2 + 0x80;
LAB_1801ae878:
              *(byte *)((longlong)&uStack_2a8 + uVar19) =
                   bVar4 + (bVar3 + 0x68 & bVar4) * -2 + -0x70 + bVar3 + bVar15;
              uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
              uVar18 = uVar18 + uVar12;
            }
          }
          else if (uVar18 == uVar12 + 1) {
            bVar15 = bVar4 & bVar3 - 0x28;
            cVar16 = bVar4 - 0x10;
LAB_1801ae837:
            bVar15 = cVar16 + bVar3 + bVar15 * -2;
LAB_1801ae83f:
            *(byte *)((longlong)&uStack_2a8 + uVar19) =
                 bVar4 + 0x70 + (bVar3 + 0x18 & bVar4) * -2 + bVar3;
            uVar19 = uVar19 - 1;
            uVar12 = uVar12 + 1;
          }
          else if (uVar18 == uVar12 + 2) {
            bVar15 = bVar3 + bVar4 + '\x10' + (bVar4 & bVar3 + 0x28) * -2;
            uVar12 = uVar12 + 1;
            uVar19 = uVar19 - 1;
          }
          else {
            if (uVar18 != uVar12 + 3) goto LAB_1801ae407;
            bVar15 = bVar3 + bVar4 + '0' + (bVar4 & bVar3 + 0x78) * -2;
            uVar19 = uVar19 - 1;
          }
        }
        else {
          if (uVar18 != uVar12 + 1) {
            if (uVar18 != uVar12 + 3) {
              if (uVar18 == uVar12 + 5) {
                bVar15 = bVar3 + bVar4 + ' ' + (bVar3 - 0x30 & bVar4) * -2;
                uVar18 = uVar18 + uVar12;
                uVar19 = (uVar19 - 1) - (ulonglong)bVar15;
              }
              else {
                if (uVar18 == uVar12 + 6) {
                  bVar15 = bVar3 + 0x20;
                  cVar16 = bVar4 + 0x40;
LAB_1801ae86d:
                  bVar15 = bVar15 & bVar4;
LAB_1801ae870:
                  bVar15 = cVar16 + bVar3 + bVar15 * -2;
                  goto LAB_1801ae878;
                }
                if (uVar18 == uVar12 + 4) {
                  bVar15 = bVar3 + bVar4 + '`' + (bVar3 + 0x70 & bVar4) * -2;
                  uVar19 = uVar19 - 1;
                }
                else {
                  if (uVar18 != uVar12 + 2) goto LAB_1801ae449;
                  bVar15 = bVar3 + bVar4 + -0x80 + (bVar3 - 0x40 & bVar4) * -2;
                  uVar12 = uVar12 + 1;
                  uVar19 = uVar19 - 1;
                }
              }
              goto LAB_1801ae96f;
            }
            bVar15 = bVar4 & bVar3 + 0x30;
            cVar16 = bVar4 - 0x20;
LAB_1801ae8f9:
            cVar16 = cVar16 + bVar3;
            goto LAB_1801ae8fc;
          }
          bVar15 = bVar3 + bVar4 + -0x60 + (bVar4 & bVar3 + 0x90) * -2;
LAB_1801ae963:
          uVar19 = uVar19 + *(byte *)((longlong)&uStack_2a8 + uVar19) + uVar12;
        }
LAB_1801ae96f:
      }
      uStack_138 = 0;
      uStack_130 = 0;
      uStack_128 = 0;
      uStack_120 = 0;
      uVar8 = FUN_180f29c00(puVar20);
      FUN_180191ab0(&uStack_138,puVar20,uVar8);
      FUN_1801a4a90(&uStack_138);
      FUN_180195980(&uStack_138);
      puVar10 = puStack_1c8;
      lVar6 = OpenProcess(0x1038,0,*(undefined4 *)(puStack_1c8 + 0x31));
      puVar10[0x15] = lVar6;
      if (lVar6 == 0) {
        uVar5 = GetLastError();
        uVar8 = FUN_1801dfd40(auStack_f0,uVar5);
        puVar9 = (undefined8 *)FUN_18019ac90(uVar8,0,&UNK_180f47d58,0x16);
        auStack_178[4] = *puVar9;
        uStack_150 = puVar9[1];
        uStack_148 = puVar9[2];
        uStack_140 = puVar9[3];
        puVar9[2] = 0;
        puVar9[3] = 0xf;
        *(undefined1 *)puVar9 = 0;
        FUN_1801a4a90(auStack_178 + 4);
        FUN_180195980(auStack_178 + 4);
        FUN_180195980(auStack_f0);
        *(undefined4 *)((longlong)puVar10 + 0x18c) = 0;
        return puVar10;
      }
    }
  }
  abStack_1b8[0] = 0x62;
  abStack_1b8[1] = 0x7e;
  abStack_1b8[2] = 0x74;
  abStack_1b8[3] = 0x7f;
  abStack_1b8[4] = 0x7b;
  abStack_1b8[5] = 1;
  abStack_1b8[6] = 0x56;
  abStack_1b8[7] = 0x73;
  abStack_1b8[8] = 0x65;
  abStack_1b8[9] = 0xc;
  abStack_1b8[10] = 0x7f;
  abStack_1b8[0xb] = 0xd;
  abStack_1b8[0xc] = 0x5e;
  abStack_1b8[0xd] = 0x7c;
  abStack_1b8[0xe] = 0x12;
  abStack_1b8[0xf] = 0x7e;
  abStack_1b8[0x10] = 0xae;
  abStack_1b8[0x11] = 0x61;
  abStack_1b8[0x12] = 0x6e;
  abStack_1b8[0x13] = 0x6f;
  abStack_1b8[0x14] = 0x98;
  abStack_1b8[0x15] = 0;
  abStack_1b8[0x16] = 0;
  abStack_1b8[0x17] = 0;
  abStack_1b8[0x18] = 0;
  abStack_1b8[0x19] = 0;
  abStack_1b8[0x1a] = 0;
  abStack_1b8[0x1b] = 0;
  abStack_1b8[0x1c] = 0;
  abStack_1b8[0x1d] = 0;
  abStack_1b8[0x1e] = 0;
  abStack_1b8[0x1f] = 0;
  abStack_1b8[0x20] = 0;
  abStack_1b8[0x21] = 0;
  abStack_1b8[0x22] = 0;
  abStack_1b8[0x23] = 0;
  abStack_1b8[0x24] = 0;
  abStack_1b8[0x25] = 0;
  abStack_1b8[0x26] = 0;
  abStack_1b8[0x27] = 0;
  abStack_1b8[0x28] = 0;
  abStack_1b8[0x29] = 0;
  abStack_1b8[0x2a] = 0;
  abStack_1b8[0x2b] = 0;
  pbVar14 = abStack_1b8;
  bVar15 = bStack_2e8;
LAB_1801aeb5c:
  puVar7 = (ulonglong *)func_0x000180b36780();
  uVar13 = *puVar7;
  puVar7 = (ulonglong *)func_0x000180b36790();
  uVar11 = *puVar7;
LAB_1801aeba0:
  uVar18 = 0;
  uVar12 = uVar11;
  do {
    if (0x2b < uVar18) {
LAB_1801af59d:
      uStack_118 = 0;
      uStack_110 = 0;
      uStack_108 = 0;
      uStack_100 = 0;
      uVar8 = FUN_180f29c00(pbVar14);
      FUN_180191ab0(&uStack_118,pbVar14,uVar8);
      puVar10 = puStack_1c8;
      uVar8 = FUN_180af2930(puStack_1c8[0x15],&uStack_118);
      puVar10[0x16] = uVar8;
      FUN_180195980(&uStack_118);
      lVar6 = FUN_180af2060(puVar10[0x15]);
      puVar10[0x17] = lVar6;
      if (lVar6 != 0) {
        uVar13 = FUN_1801d34a0(puVar10,*(undefined4 *)(puVar10 + 0x31));
        puVar10[0x32] = uVar13;
        puStack_188 = (undefined8 *)FUN_1801dfd40(auStack_70,uVar13 & 0xffffffff);
        abStack_258[0] = 0x6b;
        abStack_258[1] = 0x52;
        abStack_258[2] = 0x5e;
        abStack_258[3] = 0x52;
        abStack_258[4] = 0x55;
        abStack_258[5] = 0x5b;
        abStack_258[6] = 0x6a;
        abStack_258[7] = 0xa7;
        abStack_258[8] = 0x5b;
        abStack_258[9] = 0x56;
        abStack_258[10] = 0x50;
        abStack_258[0xb] = 0x6c;
        abStack_258[0xc] = 0x6c;
        abStack_258[0xd] = 0x6f;
        abStack_258[0xe] = 0x73;
        abStack_258[0xf] = 0x40;
        abStack_258[0x10] = 0x70;
        abStack_258[0x11] = 0x4e;
        abStack_258[0x12] = 0x74;
        abStack_258[0x13] = 0x7e;
        abStack_258[0x14] = 0x5e;
        abStack_258[0x15] = 0xb9;
        abStack_258[0x16] = 0x66;
        abStack_258[0x17] = 0x19;
        abStack_258[0x18] = 0x67;
        abStack_258[0x19] = 0x6a;
        abStack_258[0x1a] = 0x6f;
        abStack_258[0x1b] = 0x1c;
        abStack_258[0x1c] = 0x1f;
        abStack_258[0x1d] = 0x72;
        abStack_258[0x1e] = 0x25;
        abStack_258[0x1f] = 0x56;
        abStack_258[0x20] = 0x5e;
        abStack_258[0x21] = 0x51;
        abStack_258[0x22] = 0x59;
        abStack_258[0x23] = 0x20;
        abStack_258[0x24] = 0x6e;
        abStack_258[0x25] = 0x89;
        abStack_258[0x26] = 0xa6;
        abStack_258[0x27] = 0;
        abStack_258[0x28] = 0;
        abStack_258[0x29] = 0;
        abStack_258[0x2a] = 0;
        abStack_258[0x2b] = 0;
        abStack_258[0x2c] = 0;
        abStack_258[0x2d] = 0;
        abStack_258[0x2e] = 0;
        abStack_258[0x2f] = 0;
        abStack_258[0x30] = 0;
        abStack_258[0x31] = 0;
        abStack_258[0x32] = 0;
        abStack_258[0x33] = 0;
        abStack_258[0x34] = 0;
        abStack_258[0x35] = 0;
        abStack_258[0x36] = 0;
        abStack_258[0x37] = 0;
        abStack_258[0x38] = 0;
        pbVar14 = abStack_258;
LAB_1801b012c:
        puVar7 = (ulonglong *)func_0x000180b36780();
        uVar13 = *puVar7;
        puVar7 = (ulonglong *)func_0x000180b36790();
        uVar11 = *puVar7;
LAB_1801b0170:
        uVar18 = 0;
        uVar12 = uVar11;
        do {
          if (0x38 < uVar18) {
LAB_1801b0b5f:
            uVar8 = FUN_1801a9d10(auStack_90,pbVar14,puStack_188);
            FUN_1801a4a90(uVar8);
            FUN_180195980(auStack_90);
            FUN_180195980(auStack_70);
            puVar10 = puStack_1c8;
            FUN_18019a4f0(puStack_1c8 + 0x33,&UNK_180f47d70,3);
            return puVar10;
          }
          bVar15 = abStack_258[uVar18];
          cVar16 = (char)uVar18;
LAB_1801b01a0:
          if (uVar18 < uVar13) {
            pbVar14 = &stack0x016535c2;
            goto LAB_1801b0b5f;
          }
          if (uVar12 + 1 <= uVar13) {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 != uVar12 + 2) {
                if (uVar13 == uVar12 + 3) {
                  bVar4 = cVar16 - 0x26;
                  cVar17 = bVar15 - 0x1c;
LAB_1801b0a2d:
                  bStack_2e8 = cVar17 + cVar16 + (bVar4 & bVar15) * -2;
                  goto LAB_1801b0a38;
                }
                if (uVar13 != uVar12 + 8) goto LAB_1801b0200;
                bVar4 = cVar16 + 0x66;
                cVar17 = bVar15 + 0x9c;
                goto LAB_1801b09f4;
              }
              bVar4 = cVar16 - 0x36;
              cVar17 = bVar15 + 0x44;
              goto LAB_1801b0a6a;
            }
            bVar4 = cVar16 + 0x46;
            cVar16 = cVar16 + bVar15 + '\\';
            goto LAB_1801b0aa9;
          }
          bStack_2e8 = (bVar15 & cVar16 - 0x3eU) * -2 + -0x4e + bVar15 + (cVar16 - 0x3eU);
LAB_1801b0200:
          if (uVar18 < uVar12) {
            pbVar14 = &stack0x01580c00;
            goto LAB_1801b0b5f;
          }
          if (uVar12 + 0x20 <= uVar13) {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 == uVar12 + 4) {
                bStack_2e8 = cVar16 + bVar15 + '\f' + (cVar16 + 0x7eU & bVar15) * -2;
                uVar13 = uVar13 + uVar12;
                uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
              }
              else {
                if (uVar13 != uVar12 + 3) {
                  if (uVar13 == uVar12 + 7) {
                    bVar4 = cVar16 + 0x86;
                    cVar17 = bVar15 - 0x24;
                    goto LAB_1801b0963;
                  }
                  if (uVar13 != uVar12 + 2) goto LAB_1801b0270;
                  bVar4 = cVar16 + 0x8e;
                  cVar16 = cVar16 + bVar15 + -0x54;
                  goto LAB_1801b0aa9;
                }
                bStack_2e8 = cVar16 + bVar15 + -0xc + (cVar16 + 2U & bVar15) * -2;
                uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
              }
              goto LAB_1801b0abd;
            }
            bVar4 = cVar16 + 0x6e;
            cVar17 = bVar15 + 0x6c;
            goto LAB_1801b09f4;
          }
          bStack_2e8 = bVar15 + 0x9a + (cVar16 - 0x16U) + (bVar15 & cVar16 - 0x16U) * -2;
LAB_1801b0270:
          while (uVar11 = uVar12, uVar18 < uVar12 + uVar13) {
            while( true ) {
              do {
                uVar12 = uVar11;
                if (uVar13 == uVar12 + 0x10) {
                  bVar4 = cVar16 + 0x5c;
                  cVar17 = bVar15 - 0x28;
                  goto LAB_1801b09f4;
                }
                if (uVar13 == uVar12 + 0x20) {
                  bStack_2e8 = cVar16 + bVar15 + -0x40 + (cVar16 - 0x20U & bVar15) * -2;
                  uVar12 = uVar12 + 1;
                  uVar18 = uVar18 - 1;
                  goto LAB_1801b0abd;
                }
                if (uVar13 == uVar12 + 0x28) {
                  bStack_2e8 = cVar16 + bVar15 + -0x58 + (cVar16 + 100U & bVar15) * -2;
                  uVar18 = uVar18 - 1;
                  goto LAB_1801b0abd;
                }
                if (uVar13 == uVar12 + 0x40) {
                  bVar4 = cVar16 - 0x18;
                  cVar17 = bVar15 + 0x90;
                  goto LAB_1801b0a2d;
                }
                if (uVar13 == uVar12 + 0x42) {
                  bStack_2e8 = cVar16 + bVar15 + 'x' + (cVar16 + 0x6cU & bVar15) * -2;
                  uVar13 = uVar13 + uVar12;
                  uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                  goto LAB_1801b0abd;
                }
                if (uVar13 == uVar12 + 100) {
                  bStack_2e8 = cVar16 + bVar15 + '`' + (cVar16 - 0x10U & bVar15) * -2;
                  uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                  goto LAB_1801b0abd;
                }
                if (uVar13 == uVar12 + 0x80) {
                  bVar4 = cVar16 + 0x74;
                  cVar17 = bVar15 + 0x48;
                  goto LAB_1801b0963;
                }
                if (uVar13 == uVar12 + 0x200) {
                  bVar4 = cVar16 - 8;
                  cVar17 = bVar15 + 0x30;
                  goto LAB_1801b0a6a;
                }
                if (uVar13 == uVar12 + 1000) {
                  bVar4 = cVar16 + 0x7c;
                  cVar16 = cVar16 + bVar15 + '\x18';
                  goto LAB_1801b0aa9;
                }
                uVar11 = uVar12;
              } while (uVar13 == uVar12 + 0x400);
              uVar13 = uVar12 + 0x5a;
              if (uVar13 < uVar12 + 0x1084) {
                bStack_2e8 = bVar15 + cVar16 + 0x46U + '\x16' + (cVar16 + 0x46U & bVar15) * -2;
                goto LAB_1801b012c;
              }
              uVar11 = uVar12 + 0x105a;
              if (uVar13 < uVar12 + 0x105b) {
                bStack_2e8 = bVar15 + (cVar16 - 0x36U) + 'z' + (bVar15 & cVar16 - 0x36U) * -2;
                goto LAB_1801b0170;
              }
              if (uVar13 < uVar12 + 0x105c) {
                bStack_2e8 = (bVar15 - 0x22) + cVar16 + 0x4eU + (cVar16 + 0x4eU & bVar15) * -2;
                uVar12 = uVar11;
                goto LAB_1801b01a0;
              }
              if (uVar13 < uVar12 + 0x105d) {
                bStack_2e8 = bVar15 + 0x42 + (cVar16 - 0x2eU) + (cVar16 - 0x2eU & bVar15) * -2;
                uVar12 = uVar11;
                goto LAB_1801b0200;
              }
              if (uVar13 < uVar12 + 0x105e) break;
              uVar19 = uVar12 + 0x105f;
              if (uVar13 < uVar19) {
                bVar4 = cVar16 - 0x26;
                cVar17 = -0x1c;
                uVar12 = uVar11;
                goto LAB_1801b0631;
              }
              if (uVar13 < uVar12 + 0x1060) {
                bVar4 = cVar16 + 0x5e;
                cVar17 = -0x34;
                uVar12 = uVar11;
                goto LAB_1801b05f2;
              }
              if (uVar13 < uVar12 + 0x1062) {
                bVar4 = cVar16 - 0x1e;
                cVar17 = -0x4c;
                uVar12 = uVar11;
                goto LAB_1801b05bc;
              }
              if (uVar13 < uVar12 + 0x1063) {
                bStack_2e8 = cVar16 + bVar15 + -100 + (cVar16 + 0x66U & bVar15) * -2;
                uVar12 = uVar11;
                goto LAB_1801b05a2;
              }
              if (uVar12 + 0x1064 <= uVar13) {
                uVar11 = uVar12 + 0x106f;
                uVar13 = uVar19;
                if (uVar12 + 0x1075 < uVar19) {
                  bVar4 = cVar16 + 0x30;
                  cVar16 = cVar16 + bVar15 + -0x20;
                  uVar12 = uVar11;
                  goto LAB_1801b0aa9;
                }
                if (uVar12 + 0x1077 < uVar19) {
                  bVar4 = cVar16 + 0xb4;
                  cVar17 = bVar15 - 0x38;
                  uVar12 = uVar11;
                  goto LAB_1801b0a6a;
                }
                if (uVar12 + 0x1078 < uVar19) {
                  bVar4 = cVar16 + 0x38;
                  cVar17 = bVar15 + 0xb0;
                  uVar12 = uVar11;
                  goto LAB_1801b0963;
                }
                if (uVar12 + 0x1457 < uVar19) {
                  bStack_2e8 = cVar16 + bVar15 + -0x68 + (cVar16 + 0xbcU & bVar15) * -2;
                  uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                  uVar12 = uVar11;
                  goto LAB_1801b0abd;
                }
                if (uVar12 + 0x146f < uVar19) {
                  bStack_2e8 = cVar16 + bVar15 + -0x80 + (cVar16 + 0x40U & bVar15) * -2;
                  uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                  uVar12 = uVar11;
                  uVar13 = uVar19 + uVar11;
                  goto LAB_1801b0abd;
                }
                if (uVar12 + 0x206f < uVar19) {
                  bVar4 = cVar16 - 0x3c;
                  cVar17 = bVar15 + 0x68;
                  uVar12 = uVar11;
                  goto LAB_1801b0a2d;
                }
                if (uVar12 + 0x10d0 < uVar19) {
                  bStack_2e8 = cVar16 + bVar15 + 'P' + (cVar16 + 0x48U & bVar15) * -2;
                  uVar18 = uVar18 - 1;
                  uVar12 = uVar11;
                  goto LAB_1801b0abd;
                }
                if (uVar12 + 0x10e9 < uVar19) {
                  bStack_2e8 = cVar16 + bVar15 + '8' + (cVar16 - 0x34U & bVar15) * -2;
                  uVar18 = uVar18 - 1;
                  uVar12 = uVar12 + 0x1070;
                  goto LAB_1801b0abd;
                }
                if (uVar12 + 0x10b0 < uVar19) {
                  bVar4 = cVar16 + 0x50;
                  cVar17 = bVar15 + 0x20;
                  uVar12 = uVar11;
                  goto LAB_1801b09f4;
                }
                if (uVar19 <= uVar12 + 0x10c9) {
                  uVar11 = uVar12 + 0x2099;
                  uVar13 = uVar12 + 0x206f;
                }
              }
            }
            bStack_2e8 = bVar15 + 0xa6 + cVar16 + 0x56U + (cVar16 + 0x56U & bVar15) * -2;
            uVar12 = uVar11;
          }
          if (uVar13 < uVar12 + 0x61) {
            bVar4 = cVar16 - 0x3e;
            cVar17 = 't';
LAB_1801b0631:
            bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801b0637:
            if (uVar12 + uVar13 == 0x10) {
              bVar4 = cVar16 + 0x54;
              cVar17 = cVar16 + '\b';
LAB_1801b0966:
              bStack_2e8 = cVar17 + (bVar4 & bVar15) * -2;
              bVar4 = bVar15 + 0x7c + (cVar16 + 0x16U & bVar15) * -2 + cVar16;
              abStack_258[uVar18] = bVar4;
              uVar12 = uVar12 + 1;
              uVar18 = (uVar18 - uVar12) - (ulonglong)bVar4;
LAB_1801b0a75:
              abStack_258[uVar18] =
                   (char)uVar18 + -0x10 + bVar15 + ((char)uVar18 - 0x28U & bVar15) * -2;
              uVar13 = uVar13 + 1;
              uVar18 = uVar18 + ~uVar13;
              goto LAB_1801b0ab1;
            }
            if (uVar12 + 6 < uVar13) {
              bVar4 = cVar16 + 0x3a;
              cVar17 = -0x5c;
LAB_1801b05f2:
              bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801b05f8:
              if (uVar13 < 0x80) {
                if (uVar13 <= uVar12 + 0x61) {
                  if (uVar13 == uVar12 + 1) {
                    bVar4 = cVar16 + 0xa8;
                    cVar16 = cVar16 + bVar15 + '\x10';
                    goto LAB_1801b0aa9;
                  }
                  if (uVar13 != uVar12 + 2) {
                    if (uVar13 == uVar12 + 3) {
                      bStack_2e8 = cVar16 + bVar15 + -0x38 + (cVar16 + 0x34U & bVar15) * -2;
                      uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                    }
                    else if (uVar13 == uVar12 + 4) {
                      bStack_2e8 = cVar16 + bVar15 + -0x80 + (cVar16 - 0x40U & bVar15) * -2;
                      uVar18 = uVar18 - 1;
                    }
                    else {
                      if (uVar13 != uVar12 + 5) {
                        if (uVar13 == uVar12 + 6) {
                          bVar4 = cVar16 - 0x38;
                          cVar17 = bVar15 + 0x50;
                          goto LAB_1801b09f4;
                        }
                        goto LAB_1801b05c2;
                      }
                      bStack_2e8 = cVar16 + bVar15 + 'h' + (cVar16 + 0x44U & bVar15) * -2;
                      uVar12 = uVar12 + 1;
                      uVar18 = uVar18 - 1;
                    }
                    goto LAB_1801b0abd;
                  }
                  bVar4 = cVar16 + 0x2c;
                  cVar17 = bVar15 - 8;
LAB_1801b0a6a:
                  bStack_2e8 = cVar17 + cVar16 + (bVar4 & bVar15) * -2;
                  goto LAB_1801b0a75;
                }
                bVar4 = cVar16 + 0x24;
                cVar17 = '(';
LAB_1801b05bc:
                bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801b05c2:
                if (5 < uVar12) {
                  bStack_2e8 = (bVar15 + 0x38 + cVar16 + (cVar16 + 0x4cU & bVar15) * -2) * '\x02';
                  goto LAB_1801b09ff;
                }
LAB_1801b05a2:
                abStack_258[uVar18] = bStack_2e8;
              }
              else {
                bStack_2e8 = bVar15 * '\x02' + cVar16 + (cVar16 - 0x30U & bVar15) * -2 + ' ';
LAB_1801b0a38:
                abStack_258[uVar18] =
                     bVar15 + (cVar16 + 0x92U & bVar15) * -2 + -0x6c + cVar16 + bStack_2e8;
                uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                uVar13 = uVar13 + uVar12;
              }
            }
            else if (uVar13 == uVar12 + 1) {
              bVar4 = cVar16 + 0xbe;
              cVar17 = bVar15 + 0x8c;
LAB_1801b09f4:
              bStack_2e8 = cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801b09ff:
              abStack_258[uVar18] = bVar15 + 0xac + (cVar16 + 0xeU & bVar15) * -2 + cVar16;
              uVar18 = uVar18 - 1;
              uVar12 = uVar12 + 1;
            }
            else if (uVar13 == uVar12 + 2) {
              bStack_2e8 = cVar16 + bVar15 + 't' + (cVar16 + 0x42U & bVar15) * -2;
              uVar12 = uVar12 + 1;
              uVar18 = uVar18 - 1;
            }
            else if (uVar13 == uVar12 + 3) {
              bStack_2e8 = cVar16 + bVar15 + ',' + (cVar16 - 0x32U & bVar15) * -2;
              uVar13 = uVar13 + uVar12;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
            }
            else {
              if (uVar13 != uVar12 + 5) goto LAB_1801b05f8;
              bStack_2e8 = cVar16 + bVar15 + '\x14' + (cVar16 + 0x52U & bVar15) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
            }
          }
          else {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 != uVar12 + 2) {
                if (uVar13 != uVar12 + 3) goto LAB_1801b0637;
                bStack_2e8 = cVar16 + bVar15 + -0x58 + (cVar16 - 0x1cU & bVar15) * -2;
                uVar13 = uVar13 + uVar12;
                uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                goto LAB_1801b0abd;
              }
              bVar4 = cVar16 - 0x24;
              cVar17 = bVar15 - 0x28;
LAB_1801b0963:
              cVar17 = cVar17 + cVar16;
              goto LAB_1801b0966;
            }
            bVar4 = cVar16 - 0x2c;
            cVar16 = cVar16 + bVar15 + '\b';
LAB_1801b0aa9:
            bStack_2e8 = cVar16 + (bVar4 & bVar15) * -2;
LAB_1801b0ab1:
            uVar18 = uVar18 + abStack_258[uVar18] + uVar12;
          }
LAB_1801b0abd:
          uVar18 = uVar18 + 1;
        } while( true );
      }
      puStack_188 = (undefined8 *)FUN_1801dfe80(auStack_b0,0);
      abStack_2d8[0] = 0x8b;
      abStack_2d8[1] = 0xbc;
      abStack_2d8[2] = 0xa4;
      abStack_2d8[3] = 0xa0;
      abStack_2d8[4] = 0xbd;
      abStack_2d8[5] = 0xa3;
      abStack_2d8[6] = 0xa8;
      abStack_2d8[7] = 0x5f;
      abStack_2d8[8] = 0xbb;
      abStack_2d8[9] = 0xa0;
      abStack_2d8[10] = 0xae;
      abStack_2d8[0xb] = 0xa6;
      abStack_2d8[0xc] = 0xa6;
      abStack_2d8[0xd] = 0xa7;
      abStack_2d8[0xe] = 0xa3;
      abStack_2d8[0xf] = 0xb2;
      abStack_2d8[0x10] = 0xa2;
      abStack_2d8[0x11] = 0xd8;
      abStack_2d8[0x12] = 0xda;
      abStack_2d8[0x13] = 0xe4;
      abStack_2d8[0x14] = 0xc0;
      abStack_2d8[0x15] = 0x2d;
      abStack_2d8[0x16] = 0xce;
      abStack_2d8[0x17] = 0xcc;
      abStack_2d8[0x18] = 0xdb;
      abStack_2d8[0x19] = 0xc6;
      abStack_2d8[0x1a] = 0x20;
      abStack_2d8[0x1b] = 0xc0;
      abStack_2d8[0x1c] = 0xc6;
      abStack_2d8[0x1d] = 0xc1;
      abStack_2d8[0x1e] = 0xd6;
      abStack_2d8[0x1f] = 0xc0;
      abStack_2d8[0x20] = 0xd3;
      abStack_2d8[0x21] = 0xcc;
      abStack_2d8[0x22] = 0x38;
      abStack_2d8[0x23] = 0xc0;
      abStack_2d8[0x24] = 0xcf;
      abStack_2d8[0x25] = 0x3d;
      abStack_2d8[0x26] = 0xda;
      abStack_2d8[0x27] = 0xdc;
      abStack_2d8[0x28] = 0xc2;
      abStack_2d8[0x29] = 0xc4;
      abStack_2d8[0x2a] = 0xfb;
      abStack_2d8[0x2b] = 0xd9;
      abStack_2d8[0x2c] = 0x32;
      abStack_2d8[0x2d] = 0x15;
      abStack_2d8[0x2e] = 0;
      abStack_2d8[0x2f] = 0;
LAB_1801af693:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar11 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar13 = *puVar7;
LAB_1801af6e0:
      uVar18 = 0;
      uVar12 = uVar13;
      do {
        if (0x2f < uVar18) {
          pbVar14 = abStack_2d8;
LAB_1801b0057:
          uVar8 = FUN_1801a9d10(auStack_d0,pbVar14,puStack_188);
          FUN_1801a4a90(uVar8);
          FUN_180195980(auStack_d0);
          FUN_180195980(auStack_b0);
          *(undefined4 *)((longlong)puStack_1c8 + 0x18c) = 0;
          return puStack_1c8;
        }
        bVar15 = abStack_2d8[uVar18];
        cVar16 = (char)uVar18;
LAB_1801af702:
        if (uVar18 < uVar11) {
          pbVar14 = &stack0x008bba6b;
          goto LAB_1801b0057;
        }
        if (uVar12 + 1 <= uVar11) {
          if (uVar11 != uVar12 + 1) {
            if (uVar11 == uVar12 + 2) {
              bVar4 = cVar16 - 0x37;
              cVar17 = bVar15 + 0x4a;
LAB_1801aff1f:
              cVar17 = cVar17 + cVar16;
              goto LAB_1801aff22;
            }
            if (uVar11 == uVar12 + 5) {
              bVar4 = cVar16 + 0x85;
              cVar16 = cVar16 + bVar15 + -0x1e;
LAB_1801afeff:
              bStack_2e8 = cVar16 + (bVar15 & bVar4) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
              uVar11 = uVar11 + uVar12;
            }
            else {
              if (uVar11 != uVar12 + 7) {
                if (uVar11 != uVar12 + 9) goto LAB_1801af770;
                bVar4 = cVar16 - 3;
                cVar17 = bVar15 + 0x12;
                goto LAB_1801afea8;
              }
              bStack_2e8 = cVar16 + bVar15 + 'z' + (bVar15 & cVar16 + 0x41U) * -2;
              uVar18 = uVar18 - 1;
            }
            goto LAB_1801aff92;
          }
          bVar4 = cVar16 + 0xd;
          cVar16 = cVar16 + bVar15 + -0x4e;
          goto LAB_1801aff7c;
        }
        bStack_2e8 = (bVar15 & cVar16 + 0xafU) * -2 + '7' + bVar15 + cVar16 + 0xafU;
LAB_1801af770:
        if (uVar18 < uVar12) {
          pbVar14 = &stack0x017576bc;
          goto LAB_1801b0057;
        }
        if (uVar11 < uVar12 + 0x28) {
          bStack_2e8 = bVar15 + 0x83 + cVar16 + 0x5bU + (bVar15 & cVar16 + 0x5bU) * -2;
        }
        else {
          if (uVar11 == uVar12 + 1) {
            bVar4 = cVar16 + 0xb9;
            cVar17 = bVar15 + 0xaa;
            goto LAB_1801afea8;
          }
          if (uVar11 == uVar12 + 2) {
            bStack_2e8 = cVar16 + bVar15 + 'B' + (bVar15 & cVar16 + 0x75U) * -2;
            uVar18 = uVar18 - 1;
            goto LAB_1801aff92;
          }
          if (uVar11 == uVar12 + 5) {
            bStack_2e8 = cVar16 + bVar15 + -0x5a + (bVar15 & cVar16 + 0x8fU) * -2;
            uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
            goto LAB_1801aff92;
          }
        }
        while (uVar13 = uVar12, uVar18 < uVar12 + uVar11) {
          while( true ) {
            uVar12 = uVar13;
            if (uVar11 == uVar12 + 9) {
              bVar4 = cVar16 + 0x32;
              cVar17 = bVar15 - 0x2c;
              goto LAB_1801afea8;
            }
            if (uVar11 == uVar12 + 0x28) {
              bStack_2e8 = cVar16 + bVar15 + -0x60 + (bVar15 & cVar16 + 0x90U) * -2;
              uVar12 = uVar12 + 1;
              uVar18 = uVar18 - 1;
              goto LAB_1801aff92;
            }
            if (uVar11 == uVar12 + 8) {
              bStack_2e8 = cVar16 + bVar15 + 'l' + (bVar15 & cVar16 - 0x12U) * -2;
              uVar18 = uVar18 - 1;
              goto LAB_1801aff92;
            }
            if (uVar11 == uVar12 + 0x20) {
              bStack_2e8 = bVar15 + 0x38 + cVar16 + (bVar15 & cVar16 + 0x4cU) * -2;
              goto LAB_1801afe1b;
            }
            if (uVar11 == uVar12 + 6) {
              bVar4 = cVar16 + 0xaa;
              cVar16 = cVar16 + bVar15 + '\x04';
              goto LAB_1801afeff;
            }
            if (uVar11 == uVar12 + 0x10) {
              bStack_2e8 = cVar16 + bVar15 + -0x30 + (bVar15 & cVar16 + 8U) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
              goto LAB_1801aff92;
            }
            if (uVar11 == uVar12 + 5) {
              bVar4 = cVar16 + 0x66;
              cVar17 = bVar15 + 0x9c;
              goto LAB_1801aff1f;
            }
            if (uVar11 == uVar12 + 10) {
              bStack_2e8 = bVar15 + 0x68 + cVar16 + (bVar15 & cVar16 - 0x3cU) * -2;
              goto LAB_1801aff4d;
            }
            uVar13 = uVar12 + 4;
            if (uVar11 == uVar13) {
              bVar4 = cVar16 + 0x22;
              cVar16 = cVar16 + bVar15 + '4';
              goto LAB_1801aff7c;
            }
            uVar11 = uVar12 + 1;
            if (uVar11 < uVar12 + 9) {
              bStack_2e8 = bVar15 + cVar16 + 0x8dU + '%' + (cVar16 + 0x8dU & bVar15) * -2;
              goto LAB_1801af693;
            }
            if (uVar11 < uVar12 + 0x2e) {
              bStack_2e8 = bVar15 + (cVar16 - 0x15U) + -0x6d + (bVar15 & cVar16 - 0x15U) * -2;
              goto LAB_1801af6e0;
            }
            if (uVar11 < uVar12 + 8) {
              bStack_2e8 = bVar15 + 1 + cVar16 + 0x49U + (bVar15 & cVar16 + 0x49U) * -2;
              uVar12 = uVar13;
              goto LAB_1801af702;
            }
            if (uVar11 < uVar12 + 0x5e) {
              bStack_2e8 = bVar15 + 0x6f + cVar16 + 0xa7U + (bVar15 & cVar16 + 0xa7U) * -2;
              uVar12 = uVar13;
              goto LAB_1801af770;
            }
            if (uVar11 < uVar12 + 7) break;
            uVar19 = uVar12 + 0x45;
            if (uVar11 < uVar19) {
              bVar4 = cVar16 + 99;
              cVar17 = -0x52;
              uVar12 = uVar13;
              goto LAB_1801afb2b;
            }
            if (uVar11 < uVar12 + 6) {
              bVar4 = cVar16 - 0x3f;
              cVar17 = 'z';
              uVar12 = uVar13;
              goto LAB_1801afaea;
            }
            if (uVar11 < uVar12 + 0x7e) {
              bVar4 = cVar16 + 0x1f;
              cVar17 = 'F';
              uVar12 = uVar13;
              goto LAB_1801afab2;
            }
            if (uVar11 < uVar12 + 5) {
              bStack_2e8 = cVar16 + bVar15 + '\x12' + (bVar15 & cVar16 + 0x7dU) * -2;
              uVar12 = uVar13;
              goto LAB_1801afa9a;
            }
            if (uVar12 + 0x65 <= uVar11) {
              uVar13 = uVar12 + 0x6f;
              uVar11 = uVar19;
              if (uVar12 + 0x71 < uVar19) {
                bVar4 = cVar16 - 0x18;
                cVar16 = cVar16 + bVar15 + -0x70;
                uVar12 = uVar13;
                goto LAB_1801aff7c;
              }
              if (uVar12 + 0xe9 < uVar19) {
                bStack_2e8 = bVar15 + 0x5c + cVar16 + (bVar15 & cVar16 + 0x46U) * -2;
                uVar12 = uVar13;
                goto LAB_1801aff4d;
              }
              if (uVar12 + 0x70 < uVar19) {
                bVar4 = cVar16 + 0xa4;
                cVar17 = bVar15 + 0x28;
                uVar12 = uVar13;
                goto LAB_1801aff1f;
              }
              if (uVar12 + 0xd0 < uVar19) {
                bStack_2e8 = cVar16 + bVar15 + -0xc + (bVar15 & cVar16 + 2U) * -2;
                uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                uVar12 = uVar13;
                goto LAB_1801aff92;
              }
              if (uVar12 + 0xef < uVar19) {
                bVar4 = cVar16 + 0x60;
                cVar16 = cVar16 + bVar15 + -0x40;
                uVar12 = uVar13;
                goto LAB_1801afeff;
              }
              if (uVar12 + 0x106f < uVar19) {
                bStack_2e8 = bVar15 + 0x8c + cVar16 + (bVar15 & cVar16 + 0xbeU) * -2;
                uVar12 = uVar13;
                goto LAB_1801afe1b;
              }
              if (uVar12 + 0xd3 < uVar19) {
                bStack_2e8 = cVar16 + bVar15 + 'X' + (bVar15 & cVar16 + 0x1cU) * -2;
                uVar18 = uVar18 - 1;
                uVar12 = uVar13;
                goto LAB_1801aff92;
              }
              if (uVar12 + 0x46f < uVar19) {
                bStack_2e8 = cVar16 + bVar15 + '$' + (bVar15 & cVar16 + 0x7aU) * -2;
                uVar18 = uVar18 - 1;
                uVar12 = uVar12 + 0x70;
                goto LAB_1801aff92;
              }
              if (uVar12 + 0xb1 < uVar19) {
                bVar4 = cVar16 - 0x28;
                cVar17 = bVar15 - 0x10;
                uVar12 = uVar13;
                goto LAB_1801afea8;
              }
              if (uVar19 <= uVar12 + 0x457) {
                uVar11 = uVar12 + 0x106f;
                uVar13 = uVar12 + 0x10af;
              }
            }
          }
          bStack_2e8 = (bVar15 - 0x23) + cVar16 + 5U + (bVar15 & cVar16 + 5U) * -2;
          uVar12 = uVar13;
        }
        if (uVar11 < uVar12 + 8) {
          bVar4 = cVar16 + 0xaf;
          cVar17 = -0x1a;
LAB_1801afb2b:
          bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar15 & bVar4) * -2;
LAB_1801afb31:
          if (uVar12 + uVar11 == 0x2a) {
            bVar4 = cVar16 + 0x76;
            cVar17 = cVar16 + '<';
LAB_1801aff22:
            bStack_2e8 = cVar17 + (bVar15 & bVar4) * -2;
            bVar4 = bVar15 + 0x22 + (cVar16 + 0x25U & bVar15) * -2 + cVar16;
            abStack_2d8[uVar18] = bVar4;
            uVar18 = (uVar18 - (uVar12 + 1)) - (ulonglong)bVar4;
            uVar12 = uVar12 + 1;
LAB_1801aff4d:
            abStack_2d8[uVar18] =
                 (char)uVar18 + '\b' + bVar15 + ((char)uVar18 - 0x2cU & bVar15) * -2;
            uVar11 = uVar11 + 1;
            uVar18 = uVar18 + ~uVar11;
            goto LAB_1801aff86;
          }
          if (uVar12 + 2 < uVar11) {
            bVar4 = cVar16 + 0xb3;
            cVar17 = -0x32;
LAB_1801afaea:
            bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar15 & bVar4) * -2;
LAB_1801afaf0:
            if (uVar11 < 0x7a) {
              if (uVar12 + 0x5a < uVar11) {
                bVar4 = cVar16 + 0xe;
                cVar17 = -0x54;
LAB_1801afab2:
                bStack_2e8 = bVar15 + cVar17 + cVar16 + (bVar15 & bVar4) * -2;
              }
              else {
                if (uVar11 == uVar12 + 1) {
                  bVar4 = cVar16 + 0x6c;
                  cVar16 = cVar16 + bVar15 + 'x';
                  goto LAB_1801aff7c;
                }
                if (uVar11 == uVar12 + 2) {
                  bStack_2e8 = bVar15 + 0x44 + cVar16 + (bVar15 & cVar16 - 0x36U) * -2;
                  goto LAB_1801aff4d;
                }
                if (uVar11 == uVar12 + 3) {
                  bStack_2e8 = cVar16 + bVar15 + -0x24 + (bVar15 & cVar16 + 0x86U) * -2;
                  uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
                  goto LAB_1801aff92;
                }
              }
              if (0xf < uVar12) {
                bStack_2e8 = (bVar15 + 0xa4 + cVar16 + (bVar15 & cVar16 + 0xbaU) * -2) * '\x02';
                goto LAB_1801afeb5;
              }
LAB_1801afa9a:
              abStack_2d8[uVar18] = bStack_2e8;
            }
            else {
              bStack_2e8 = bVar15 * '\x02' + cVar16 + (bVar15 & cVar16 + 0x18U) * -2 + 0x70;
LAB_1801afe1b:
              abStack_2d8[uVar18] =
                   bVar15 + 0x56 + (cVar16 - 0x39U & bVar15) * -2 + cVar16 + bStack_2e8;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
              uVar11 = uVar11 + uVar12;
            }
          }
          else {
            if (uVar11 != uVar12 + 1) {
              if (uVar11 == uVar12 + 2) {
                bStack_2e8 = cVar16 + bVar15 + 'f' + (bVar15 & cVar16 + 0x6fU) * -2;
                uVar12 = uVar12 + 1;
                uVar18 = uVar18 - 1;
                goto LAB_1801aff92;
              }
              if (uVar11 == uVar12 + 3) {
                bStack_2e8 = (bVar15 - 2) + cVar16 + (bVar15 & cVar16 + 0x2bU) * -2;
                goto LAB_1801afe1b;
              }
              goto LAB_1801afaf0;
            }
            bVar4 = cVar16 + 0x11;
            cVar17 = bVar15 + 0x9a;
LAB_1801afea8:
            bStack_2e8 = cVar17 + cVar16 + (bVar15 & bVar4) * -2;
LAB_1801afeb5:
            abStack_2d8[uVar18] = bVar15 + 0x8a + (cVar16 + 0x69U & bVar15) * -2 + cVar16;
            uVar18 = uVar18 - 1;
            uVar12 = uVar12 + 1;
          }
        }
        else {
          if (uVar11 != uVar12 + 1) {
            if (uVar11 == uVar12 + 4) {
              bStack_2e8 = cVar16 + bVar15 + ' ' + (bVar15 & cVar16 - 0x30U) * -2;
              uVar18 = (uVar18 - 1) - (ulonglong)bStack_2e8;
            }
            else {
              if (uVar11 == uVar12 + 3) {
                bStack_2e8 = bVar15 + 0xb8 + cVar16 + (bVar15 & cVar16 + 0x8cU) * -2;
                goto LAB_1801afe1b;
              }
              if (uVar11 == uVar12 + 7) {
                bStack_2e8 = cVar16 + bVar15 + -0x7c + (bVar15 & cVar16 - 0x16U) * -2;
                uVar18 = uVar18 - 1;
              }
              else {
                if (uVar11 != uVar12 + 2) {
                  if (uVar11 != uVar12 + 6) goto LAB_1801afb31;
                  bVar4 = cVar16 + 0xa6;
                  cVar17 = bVar15 + 0x1c;
                  goto LAB_1801afea8;
                }
                bStack_2e8 = cVar16 + bVar15 + 'P' + (bVar15 & cVar16 + 0x48U) * -2;
                uVar12 = uVar12 + 1;
                uVar18 = uVar18 - 1;
              }
            }
            goto LAB_1801aff92;
          }
          bVar4 = cVar16 + 0xb6;
          cVar16 = cVar16 + bVar15 + -0x44;
LAB_1801aff7c:
          bStack_2e8 = cVar16 + (bVar15 & bVar4) * -2;
LAB_1801aff86:
          uVar18 = uVar18 + abStack_2d8[uVar18] + uVar12;
        }
LAB_1801aff92:
        uVar18 = uVar18 + 1;
      } while( true );
    }
    bVar4 = abStack_1b8[uVar18];
    cVar16 = (char)uVar18;
LAB_1801aebd7:
    if (uVar18 < uVar13) {
      pbVar14 = &stack0x0146ff62;
      goto LAB_1801af59d;
    }
    if (uVar12 + 1 <= uVar13) {
      if (uVar13 == uVar12 + 1) {
        bVar15 = cVar16 + 0x46;
        cVar16 = cVar16 + bVar4 + '\\';
        goto LAB_1801af4e7;
      }
      if (uVar13 == uVar12 + 2) {
        bVar15 = cVar16 + 0x4e;
        cVar17 = bVar4 + 0x2c;
        goto LAB_1801af488;
      }
      if (uVar13 == uVar12 + 4) {
        bVar15 = cVar16 - 0x2e;
        goto LAB_1801af461;
      }
      if (uVar13 == uVar12 + 5) {
        bVar15 = cVar16 - 0x26;
        cVar17 = bVar4 - 0x1c;
        goto LAB_1801af425;
      }
      if (uVar13 != uVar12 + 6) goto LAB_1801aec40;
      bVar15 = cVar16 + bVar4 + -0x4c + (cVar16 - 0x1eU & bVar4) * -2;
      uVar12 = uVar12 + 1;
      uVar18 = uVar18 - 1;
      goto LAB_1801af4fb;
    }
    bVar15 = (bVar4 & cVar16 - 0x3eU) * -2 + -0x4e + bVar4 + (cVar16 - 0x3eU);
LAB_1801aec40:
    if (uVar18 < uVar12) {
      pbVar14 = &stack0x015cc8a0;
      goto LAB_1801af59d;
    }
    if (uVar12 + 6 <= uVar13) {
      if (uVar13 == uVar12 + 1) {
        bVar15 = cVar16 + 0x6e;
        cVar17 = bVar4 + 0x6c;
        goto LAB_1801af3cd;
      }
      if (uVar13 == uVar12 + 2) {
        bVar15 = cVar16 + bVar4 + '<' + (cVar16 + 0x76U & bVar4) * -2;
        uVar18 = uVar18 - 1;
      }
      else {
        if (uVar13 != uVar12 + 3) {
          if (uVar13 != uVar12 + 5) {
            if (uVar13 != uVar12 + 4) goto LAB_1801aecb0;
            bVar15 = cVar16 + 0x86;
            cVar17 = bVar4 - 0x24;
            goto LAB_1801af488;
          }
          bVar15 = cVar16 + 2;
          cVar16 = cVar16 + bVar4 + -0xc;
          goto LAB_1801af469;
        }
        bVar15 = cVar16 + bVar4 + '\f' + (cVar16 + 0x7eU & bVar4) * -2;
        uVar13 = uVar13 + uVar12;
        uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
      }
      goto LAB_1801af4fb;
    }
    bVar15 = bVar4 + 0x9a + (cVar16 - 0x16U) + (cVar16 - 0x16U & bVar4) * -2;
LAB_1801aecb0:
    while (uVar11 = uVar12, uVar18 < uVar12 + uVar13) {
      while( true ) {
        do {
          uVar12 = uVar11;
          if (uVar13 == uVar12 + 6) {
            bVar15 = cVar16 + 0x5c;
            cVar17 = bVar4 - 0x28;
            goto LAB_1801af3cd;
          }
          if (uVar13 == uVar12 + 0x400) {
            bVar15 = cVar16 + bVar4 + -0x40 + (cVar16 - 0x20U & bVar4) * -2;
            uVar12 = uVar12 + 1;
            uVar18 = uVar18 - 1;
            goto LAB_1801af4fb;
          }
          if (uVar13 == uVar12 + 8) {
            bVar15 = cVar16 + bVar4 + -0x58 + (cVar16 + 100U & bVar4) * -2;
            uVar18 = uVar18 - 1;
            goto LAB_1801af4fb;
          }
          if (uVar13 == uVar12 + 0x1000) {
            bVar15 = cVar16 - 0x18;
            cVar17 = bVar4 + 0x90;
            goto LAB_1801af425;
          }
          if (uVar13 == uVar12 + 9) {
            bVar15 = cVar16 + bVar4 + 'x' + (bVar4 & cVar16 + 0x6cU) * -2;
            uVar13 = uVar13 + uVar12;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
            goto LAB_1801af4fb;
          }
          if (uVar13 == uVar12 + 0x61) {
            bVar15 = cVar16 + bVar4 + '`' + (bVar4 & cVar16 - 0x10U) * -2;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
            goto LAB_1801af4fb;
          }
          if (uVar13 == uVar12 + 10) {
            bVar15 = cVar16 + 0x74;
            cVar17 = bVar4 + 0x48;
            goto LAB_1801af488;
          }
          if (uVar13 == uVar12 + 0x7a) {
            bVar15 = bVar4 + 0x30 + cVar16 + (bVar4 & cVar16 - 8U) * -2;
            goto LAB_1801af4b3;
          }
          if (uVar13 == uVar12 + 0x10) {
            bVar15 = cVar16 + bVar4 + '\x18' + (bVar4 & cVar16 + 0x7cU) * -2;
            goto LAB_1801af4ef;
          }
          uVar11 = uVar12;
        } while (uVar13 == uVar12 + 0x41);
        uVar13 = uVar12 + 0x200;
        if (uVar13 < uVar12 + 0x225) {
          bVar15 = bVar4 + cVar16 + 0x46U + '\x16' + (bVar4 & cVar16 + 0x46U) * -2;
          goto LAB_1801aeb5c;
        }
        uVar11 = uVar12 + 0x220;
        if (uVar13 < uVar12 + 0x608) {
          bVar15 = bVar4 + (cVar16 - 0x36U) + 'z' + (bVar4 & cVar16 - 0x36U) * -2;
          goto LAB_1801aeba0;
        }
        if (uVar13 < uVar12 + 0x226) {
          bVar15 = cVar16 + 0x4eU + (bVar4 - 0x22) + (cVar16 + 0x4eU & bVar4) * -2;
          uVar12 = uVar11;
          goto LAB_1801aebd7;
        }
        if (uVar13 < uVar12 + 0x620) {
          bVar15 = bVar4 + 0x42 + (cVar16 - 0x2eU) + (cVar16 - 0x2eU & bVar4) * -2;
          uVar12 = uVar11;
          goto LAB_1801aec40;
        }
        if (uVar13 < uVar12 + 0x228) break;
        if (uVar13 < uVar12 + 0x1220) {
          bVar15 = cVar16 - 0x26;
          cVar17 = -0x1c;
          uVar12 = uVar11;
          goto LAB_1801af03c;
        }
        if (uVar13 < uVar12 + 0x229) {
          bVar15 = cVar16 + 0x5e;
          cVar17 = -0x34;
          uVar12 = uVar11;
          goto LAB_1801aeffd;
        }
        if (uVar13 < uVar12 + 0x281) {
          bVar15 = cVar16 - 0x1e;
          cVar17 = -0x4c;
          uVar12 = uVar11;
          goto LAB_1801aefc4;
        }
        if (uVar13 < uVar12 + 0x22a) {
          bVar15 = cVar16 + bVar4 + -100 + (bVar4 & cVar16 + 0x66U) * -2;
          uVar12 = uVar11;
          goto LAB_1801aefa7;
        }
        if (uVar12 + 0x29a <= uVar13) {
          uVar13 = uVar12 + 0x2a0;
          uVar11 = uVar12 + 0x2b0;
          if (uVar12 + 0x2b4 < uVar13) {
            bVar15 = cVar16 + bVar4 + -0x20 + (bVar4 & cVar16 + 0x30U) * -2;
            uVar12 = uVar11;
            goto LAB_1801af4ef;
          }
          if (uVar12 + 0x4b0 < uVar13) {
            bVar15 = (bVar4 - 0x38) + cVar16 + (bVar4 & cVar16 + 0xb4U) * -2;
            uVar12 = uVar11;
            goto LAB_1801af4b3;
          }
          if (uVar12 + 0x2b5 < uVar13) {
            bVar15 = cVar16 + 0x38;
            cVar17 = bVar4 + 0xb0;
            uVar12 = uVar11;
            goto LAB_1801af488;
          }
          if (uVar12 + 0x698 < uVar13) {
            bVar15 = cVar16 + bVar4 + -0x68 + (bVar4 & cVar16 + 0xbcU) * -2;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
            uVar12 = uVar11;
            goto LAB_1801af4fb;
          }
          if (uVar12 + 0x2b6 < uVar13) {
            bVar15 = cVar16 + bVar4 + -0x80 + (bVar4 & cVar16 + 0x40U) * -2;
            uVar13 = uVar13 + uVar11;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
            uVar12 = uVar11;
            goto LAB_1801af4fb;
          }
          if (uVar12 + 0x6b0 < uVar13) {
            bVar15 = cVar16 - 0x3c;
            cVar17 = bVar4 + 0x68;
            uVar12 = uVar11;
            goto LAB_1801af425;
          }
          if (uVar12 + 0x2b8 < uVar13) {
            bVar15 = cVar16 + bVar4 + 'P' + (cVar16 + 0x48U & bVar4) * -2;
            uVar18 = uVar18 - 1;
            uVar12 = uVar11;
            goto LAB_1801af4fb;
          }
          uVar13 = uVar12 + 0x30a;
          uVar11 = uVar12 + 0x6f2;
        }
      }
      bVar15 = bVar4 + 0xa6 + cVar16 + 0x56U + (cVar16 + 0x56U & bVar4) * -2;
      uVar12 = uVar11;
    }
    if (uVar13 < uVar12 + 0x20) {
      bVar15 = cVar16 - 0x3e;
      cVar17 = 't';
LAB_1801af03c:
      bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801af042:
      if (uVar12 + uVar13 == 0x7a) {
        bVar15 = cVar16 + 0x54;
        cVar17 = cVar16 + '\b';
LAB_1801af48b:
        bVar15 = cVar17 + (bVar15 & bVar4) * -2;
        bVar3 = bVar4 + 0x7c + (cVar16 + 0x16U & bVar4) * -2 + cVar16;
        abStack_1b8[uVar18] = bVar3;
        uVar18 = (uVar18 - (uVar12 + 1)) - (ulonglong)bVar3;
        uVar12 = uVar12 + 1;
LAB_1801af4b3:
        abStack_1b8[uVar18] = (char)uVar18 + -0x10 + bVar4 + ((char)uVar18 - 0x28U & bVar4) * -2;
        uVar13 = uVar13 + 1;
        uVar18 = uVar18 + ~uVar13;
        goto LAB_1801af4ef;
      }
      if (uVar12 + 0x80 < uVar13) {
        bVar15 = cVar16 + 0x3a;
        cVar17 = -0x5c;
LAB_1801aeffd:
        bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
LAB_1801af003:
        if (uVar13 < 0x61) {
          if (uVar12 + 100 < uVar13) {
            bVar15 = cVar16 + 0x24;
            cVar17 = '(';
LAB_1801aefc4:
            bVar15 = bVar4 + cVar17 + cVar16 + (bVar4 & bVar15) * -2;
          }
          else {
            if (uVar13 == uVar12 + 1) {
              bVar15 = cVar16 + 0xa8;
              cVar16 = cVar16 + bVar4 + '\x10';
              goto LAB_1801af4e7;
            }
            if (uVar13 == uVar12 + 2) {
              bVar15 = cVar16 + 0xb0;
              cVar17 = bVar4 - 0x20;
LAB_1801af488:
              cVar17 = cVar17 + cVar16;
              goto LAB_1801af48b;
            }
            if (uVar13 == uVar12 + 3) {
              bVar15 = cVar16 + 0x3c;
              cVar17 = bVar4 + 0x98;
              goto LAB_1801af425;
            }
            if (uVar13 == uVar12 + 4) {
              bVar15 = cVar16 + bVar4 + 'h' + (cVar16 + 0x44U & bVar4) * -2;
              uVar12 = uVar12 + 1;
              uVar18 = uVar18 - 1;
              goto LAB_1801af4fb;
            }
          }
          if (3 < uVar12) {
            bVar15 = (bVar4 + 0x38 + cVar16 + (cVar16 + 0x4cU & bVar4) * -2) * '\x02';
            goto LAB_1801af3d8;
          }
LAB_1801aefa7:
          abStack_1b8[uVar18] = bVar15;
        }
        else {
          bVar15 = bVar4 * '\x02' + cVar16 + (cVar16 - 0x30U & bVar4) * -2 + ' ';
LAB_1801af430:
          abStack_1b8[uVar18] = bVar4 + (cVar16 + 0x92U & bVar4) * -2 + -0x6c + cVar16 + bVar15;
          uVar13 = uVar13 + uVar12;
          uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
        }
      }
      else if (uVar13 == uVar12 + 1) {
        bVar15 = cVar16 + 0xbe;
        cVar17 = bVar4 + 0x8c;
LAB_1801af3cd:
        bVar15 = cVar17 + cVar16 + (bVar15 & bVar4) * -2;
LAB_1801af3d8:
        abStack_1b8[uVar18] = bVar4 + 0xac + (cVar16 + 0xeU & bVar4) * -2 + cVar16;
        uVar12 = uVar12 + 1;
        uVar18 = uVar18 - 1;
      }
      else if (uVar13 == uVar12 + 3) {
        bVar15 = cVar16 + bVar4 + '\\' + (cVar16 - 0x3aU & bVar4) * -2;
        uVar18 = uVar18 - 1;
      }
      else if (uVar13 == uVar12 + 2) {
        bVar15 = cVar16 + bVar4 + ',' + (cVar16 - 0x32U & bVar4) * -2;
        uVar13 = uVar13 + uVar12;
        uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
      }
      else {
        if (uVar13 != uVar12 + 5) goto LAB_1801af003;
        bVar15 = cVar16 + 0x52;
LAB_1801af461:
        cVar16 = cVar16 + bVar4 + '\x14';
LAB_1801af469:
        bVar15 = cVar16 + (bVar15 & bVar4) * -2;
        uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
      }
    }
    else {
      if (uVar13 != uVar12 + 1) {
        if (uVar13 == uVar12 + 4) {
          bVar15 = cVar16 + bVar4 + -0x58 + (cVar16 - 0x1cU & bVar4) * -2;
          uVar13 = uVar13 + uVar12;
          uVar18 = (uVar18 - 1) - (ulonglong)bVar15;
        }
        else {
          if (uVar13 == uVar12 + 5) {
            bVar15 = cVar16 + 0x68;
            cVar17 = bVar4 + 0x90;
LAB_1801af425:
            bVar15 = cVar17 + cVar16 + (bVar15 & bVar4) * -2;
            goto LAB_1801af430;
          }
          if (uVar13 == uVar12 + 3) {
            bVar15 = cVar16 + bVar4 + 'x' + (cVar16 - 0x14U & bVar4) * -2;
            uVar18 = uVar18 - 1;
          }
          else {
            if (uVar13 != uVar12 + 2) goto LAB_1801af042;
            bVar15 = cVar16 + bVar4 + '`' + (cVar16 + 0x70U & bVar4) * -2;
            uVar12 = uVar12 + 1;
            uVar18 = uVar18 - 1;
          }
        }
        goto LAB_1801af4fb;
      }
      bVar15 = cVar16 - 0x2c;
      cVar16 = cVar16 + bVar4 + '\b';
LAB_1801af4e7:
      bVar15 = cVar16 + (bVar15 & bVar4) * -2;
LAB_1801af4ef:
      uVar18 = uVar18 + abStack_1b8[uVar18] + uVar12;
    }
LAB_1801af4fb:
    uVar18 = uVar18 + 1;
  } while( true );
}


