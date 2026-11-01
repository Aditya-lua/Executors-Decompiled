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
  byte bVar14;
  char cVar15;
  char cVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  byte *pbVar19;
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
    pbVar19 = abStack_218;
    bVar14 = bStack_2e8;
code_r0x0001801ad35b:
    puVar7 = (ulonglong *)func_0x000180b36780();
    uVar13 = *puVar7;
    puVar7 = (ulonglong *)func_0x000180b36790();
    uVar11 = *puVar7;
code_r0x0001801ad393:
    uVar12 = uVar11;
    for (uVar17 = 0; uVar17 < 0x4e; uVar17 = uVar17 + 1) {
      bVar4 = abStack_218[uVar17];
      cVar15 = (char)uVar17;
code_r0x0001801ad3c3:
      if (uVar17 < uVar13) {
        pbVar19 = (byte *)((longlong)register0x00000020 + 0x116c976);
        break;
      }
      if (uVar12 + 1 <= uVar13) {
        if (uVar13 == uVar12 + 1) {
          bVar14 = cVar15 + 0x92;
          cVar15 = cVar15 + bVar4 + -0x6c;
          goto code_r0x0001801add1b;
        }
        if (uVar13 == uVar12 + 3) {
          bVar14 = cVar15 + 0xaa;
          cVar16 = bVar4 + 4;
          goto code_r0x0001801adcb9;
        }
        if (uVar13 == uVar12 + 5) {
          bVar14 = cVar15 - 0x32;
          cVar16 = bVar4 + 0x2c;
          goto code_r0x0001801adc76;
        }
        if (uVar13 == uVar12 + 7) {
          bVar14 = cVar15 + bVar4 + -0x1c + (cVar15 - 0x26U & bVar4) * -2;
          uVar17 = uVar17 - 1;
        }
        else {
          if (uVar13 != uVar12 + 2) {
            if (uVar13 != uVar12 + 4) goto LAB_1801ad440;
            bVar14 = cVar15 - 0xe;
            cVar16 = bVar4 + 0x54;
            goto code_r0x0001801adc08;
          }
          bVar14 = cVar15 + bVar4 + -100 + (cVar15 - 0x1aU & bVar4) * -2;
          uVar12 = uVar12 + 1;
          uVar17 = uVar17 - 1;
        }
        goto code_r0x0001801add2f;
      }
      bVar14 = (bVar4 & cVar15 + 0x86U) * -2 + 'V' + bVar4 + cVar15 + 0x86U;
LAB_1801ad440:
      if (uVar17 < uVar12) {
        pbVar19 = (byte *)((longlong)register0x00000020 + 0x16573f0);
        break;
      }
      if (uVar13 < uVar12 + 9) {
        bVar14 = bVar4 + 0xe + (cVar15 - 2U) + (cVar15 - 2U & bVar4) * -2;
      }
      else {
        if (uVar13 == uVar12 + 1) {
          bVar14 = cVar15 + 10;
          cVar16 = bVar4 - 0x3c;
          goto code_r0x0001801adc08;
        }
        if (uVar13 == uVar12 + 5) {
          bVar14 = cVar15 + bVar4 + '\\' + (cVar15 + 0x46U & bVar4) * -2;
          uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
          goto code_r0x0001801add2f;
        }
        if (uVar13 == uVar12 + 6) {
          bVar14 = (bVar4 - 0x34) + cVar15 + (cVar15 + 0x5eU & bVar4) * -2;
          goto code_r0x0001801adce7;
        }
        if (uVar13 == uVar12 + 8) {
          bVar14 = cVar15 + 0x6a;
          cVar15 = cVar15 + bVar4 + -0x7c;
          goto code_r0x0001801add1b;
        }
      }
      while (uVar11 = uVar12, uVar17 < uVar12 + uVar13) {
        while( true ) {
          do {
            uVar12 = uVar11;
            if (uVar13 == uVar12 + 4) {
              bVar14 = cVar15 + 0x94;
              cVar16 = bVar4 + 0x88;
              goto code_r0x0001801adc08;
            }
            if (uVar13 == uVar12 + 10) {
              bVar14 = cVar15 + bVar4 + '@' + (cVar15 + 0xa0U & bVar4) * -2;
              uVar12 = uVar12 + 1;
              uVar17 = uVar17 - 1;
              goto code_r0x0001801add2f;
            }
            if (uVar13 == uVar12 + 5) {
              bVar14 = cVar15 + bVar4 + -8 + (cVar15 + 0xacU & bVar4) * -2;
              uVar17 = uVar17 - 1;
              goto code_r0x0001801add2f;
            }
            if (uVar13 == uVar12 + 0x10) {
              bVar14 = bVar4 & cVar15 + 0xb8U;
              cVar16 = bVar4 + 0xb0;
              goto code_r0x0001801adc79;
            }
            if (uVar13 == uVar12 + 100) {
              bVar14 = cVar15 + bVar4 + 'h' + (bVar4 & cVar15 - 0x3cU) * -2;
              uVar13 = uVar13 + uVar12;
              uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
              goto code_r0x0001801add2f;
            }
            if (uVar13 == uVar12 + 0x1000) {
              bVar14 = cVar15 + bVar4 + ' ' + (bVar4 & cVar15 - 0x30U) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
              goto code_r0x0001801add2f;
            }
            if (uVar13 == uVar12 + 0x2a) {
              bVar14 = cVar15 - 0x24;
              cVar16 = bVar4 - 0x28;
              goto code_r0x0001801adcb9;
            }
            if (uVar13 == uVar12 + 0x61) {
              bVar14 = bVar4 + 0x90 + cVar15 + (bVar4 & cVar15 - 0x18U) * -2;
              goto code_r0x0001801adce7;
            }
            if (uVar13 == uVar12 + 1) {
              bVar14 = cVar15 + bVar4 + 'H' + (bVar4 & cVar15 - 0xcU) * -2;
              goto code_r0x0001801add23;
            }
            uVar11 = uVar12;
          } while (uVar13 == uVar12 + 6);
          uVar13 = uVar12 + 0x40;
          if (uVar13 < uVar12 + 0x6a) {
            bVar14 = bVar4 + cVar15 + 0x92U + '\x02' + (bVar4 & cVar15 + 0x92U) * -2;
            goto code_r0x0001801ad35b;
          }
          uVar11 = uVar12 + 0x60;
          if (uVar13 < uVar12 + 0xa2) {
            bVar14 = bVar4 + cVar15 + 0x9eU + -0x52 + (bVar4 & cVar15 + 0x9eU) * -2;
            goto code_r0x0001801ad393;
          }
          if (uVar13 < uVar12 + 0x460) {
            bVar14 = bVar4 + 0x5a + cVar15 + 0xaaU + (cVar15 + 0xaaU & bVar4) * -2;
            uVar12 = uVar11;
            goto code_r0x0001801ad3c3;
          }
          if (uVar13 < uVar12 + 0xba) {
            bVar14 = bVar4 + 6 + cVar15 + 0xb6U + (cVar15 + 0xb6U & bVar4) * -2;
            uVar12 = uVar11;
            goto LAB_1801ad440;
          }
          if (uVar13 < uVar12 + 100) break;
          if (uVar13 < uVar12 + 0x8a) {
            bVar14 = cVar15 - 0x32;
            cVar16 = bVar4 + 0x2c;
            uVar12 = uVar11;
            goto code_r0x0001801ad886;
          }
          if (uVar13 < uVar12 + 0x65) {
            bVar14 = cVar15 - 0x26;
            cVar16 = bVar4 - 0x1c;
            uVar12 = uVar11;
            goto code_r0x0001801ad84a;
          }
          if (uVar13 < uVar12 + 0x70) {
            bVar14 = cVar15 - 0x1a;
            cVar16 = bVar4 + 0x9c;
            uVar12 = uVar11;
            goto code_r0x0001801ad806;
          }
          if (uVar13 < uVar12 + 0xc4) {
            bVar14 = cVar15 + bVar4 + 'T' + (bVar4 & cVar15 - 0xeU) * -2;
            uVar12 = uVar11;
            goto code_r0x0001801ad7e9;
          }
          if (uVar12 + 0x1060 <= uVar13) {
            uVar13 = uVar12 + 0x448;
            uVar11 = uVar12 + 0x4c8;
            if (uVar12 + 0x509 < uVar13) {
              bVar14 = cVar15 + bVar4 + -0x60 + (bVar4 & cVar15 + 0x90U) * -2;
              uVar12 = uVar11;
              goto code_r0x0001801add23;
            }
            if (uVar12 + 0x4cb < uVar13) {
              bVar14 = bVar4 + 0x58 + cVar15 + (bVar4 & cVar15 + 0x9cU) * -2;
              uVar12 = uVar11;
              goto code_r0x0001801adce7;
            }
            if (uVar12 + 0x4d1 < uVar13) {
              bVar14 = cVar15 + 0xa8;
              cVar16 = bVar4 + 0x10;
              uVar12 = uVar11;
              goto code_r0x0001801adcb9;
            }
            if (uVar12 + 0x4cc < uVar13) {
              bVar14 = cVar15 + bVar4 + -0x38 + (bVar4 & cVar15 + 0xb4U) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
              uVar12 = uVar11;
              goto code_r0x0001801add2f;
            }
            if (uVar12 + 0x4d2 < uVar13) {
              bVar14 = cVar15 + bVar4 + -0x80 + (bVar4 & cVar15 - 0x40U) * -2;
              uVar13 = uVar13 + uVar11;
              uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
              uVar12 = uVar11;
              goto code_r0x0001801add2f;
            }
            if (uVar12 + 0x50a < uVar13) {
              bVar14 = bVar4 & cVar15 - 0x34U;
              cVar16 = bVar4 + 0x38;
              uVar12 = uVar11;
              goto code_r0x0001801adc79;
            }
            if (uVar12 + 0x8c8 < uVar13) {
              bVar14 = cVar15 + bVar4 + -0x10 + (bVar4 & cVar15 - 0x28U) * -2;
              uVar17 = uVar17 - 1;
              uVar12 = uVar11;
              goto code_r0x0001801add2f;
            }
            if (uVar12 + 0x522 < uVar13) {
              bVar14 = cVar15 + bVar4 + -0x58 + (bVar4 & cVar15 - 0x1cU) * -2;
              uVar17 = uVar17 - 1;
              uVar12 = uVar12 + 0x4c9;
              goto code_r0x0001801add2f;
            }
            if (uVar12 + 0x14c8 < uVar13) {
              bVar14 = cVar15 - 0x10;
              cVar16 = bVar4 + 0x60;
              uVar12 = uVar11;
              goto code_r0x0001801adc08;
            }
            if (uVar13 <= uVar12 + 0x4f2) {
              uVar13 = uVar12 + 0x4d0;
              uVar11 = uVar12 + 0x4d5;
            }
          }
        }
        bVar14 = bVar4 + 0xb2 + (cVar15 - 0x3eU) + (cVar15 - 0x3eU & bVar4) * -2;
        uVar12 = uVar11;
      }
      if (uVar13 < uVar12 + 100) {
        bVar14 = cVar15 + 0x86;
        cVar16 = bVar4 - 0x24;
code_r0x0001801ad886:
        bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801ad88c:
        if (uVar12 + uVar13 == 100) {
          bVar14 = cVar15 + 0x7c;
          cVar16 = cVar15 + '\x18';
code_r0x0001801adcbc:
          bVar14 = cVar16 + (bVar14 & bVar4) * -2;
          bVar3 = (bVar4 - 0xc) + (cVar15 + 2U & bVar4) * -2 + cVar15;
          abStack_218[uVar17] = bVar3;
          uVar17 = (uVar17 - (uVar12 + 1)) - (ulonglong)bVar3;
          uVar12 = uVar12 + 1;
code_r0x0001801adce7:
          abStack_218[uVar17] = (char)uVar17 + -0x30 + bVar4 + ((char)uVar17 + 0x88U & bVar4) * -2;
          uVar13 = uVar13 + 1;
          uVar17 = uVar17 + ~uVar13;
          goto code_r0x0001801add23;
        }
        if (uVar12 + 0x7a < uVar13) {
          bVar14 = cVar15 - 0x12;
          cVar16 = bVar4 + 0x6c;
code_r0x0001801ad84a:
          bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801ad850:
          if (uVar13 < 4) {
            if (uVar12 + 2 < uVar13) {
              bVar14 = cVar15 - 0x14;
              cVar16 = bVar4 + 0x78;
code_r0x0001801ad806:
              bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801ad80c:
              if (999 < uVar12) {
                bVar14 = (bVar4 + 100 + cVar15 + (bVar4 & cVar15 + 100U) * -2) * '\x02' + 0x88;
                goto code_r0x0001801adc10;
              }
code_r0x0001801ad7e9:
              abStack_218[uVar17] = bVar14;
            }
            else {
              if (uVar13 == uVar12 + 1) {
                bVar14 = cVar15 - 8;
                cVar15 = cVar15 + bVar4 + '0';
                goto code_r0x0001801add1b;
              }
              if (uVar13 == uVar12 + 3) {
                bVar14 = cVar15 + 0x10;
                cVar16 = bVar4 + 0xa0;
                goto code_r0x0001801adcb9;
              }
              if (uVar13 == uVar12 + 6) {
                bVar14 = cVar15 + 0x34;
                cVar16 = bVar4 - 0x38;
                goto code_r0x0001801adc76;
              }
              if (uVar13 == uVar12 + 4) {
                bVar14 = cVar15 + bVar4 + -0x80 + (cVar15 + 0x40U & bVar4) * -2;
                uVar17 = uVar17 - 1;
              }
              else {
                if (uVar13 != uVar12 + 2) goto code_r0x0001801ad80c;
                bVar14 = cVar15 + bVar4 + '8' + (cVar15 + 0x4cU & bVar4) * -2;
                uVar12 = uVar12 + 1;
                uVar17 = uVar17 - 1;
              }
            }
          }
          else {
            bVar14 = bVar4 & cVar15 + 0x70U;
            cVar16 = bVar4 * '\x02' + '`';
code_r0x0001801adc79:
            bVar14 = cVar16 + cVar15 + bVar14 * -2;
            abStack_218[uVar17] = bVar4 + 0x3c + (cVar15 - 10U & bVar4) * -2 + cVar15 + bVar14;
            uVar13 = uVar13 + uVar12;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
          }
        }
        else {
          if (uVar13 != uVar12 + 1) {
            if (uVar13 != uVar12 + 2) {
              if (uVar13 == uVar12 + 5) {
                bVar14 = cVar15 + bVar4 + '\x04' + (cVar15 + 0x2aU & bVar4) * -2;
                uVar13 = uVar13 + uVar12;
                uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
                goto code_r0x0001801add2f;
              }
              if (uVar13 == uVar12 + 3) {
                bVar14 = cVar15 + 0x42;
                cVar16 = bVar4 + 0x74;
                goto code_r0x0001801adcb9;
              }
              goto code_r0x0001801ad850;
            }
            bVar14 = cVar15 + 0x1e;
            cVar16 = bVar4 + 0x4c;
code_r0x0001801adc76:
            bVar14 = bVar14 & bVar4;
            goto code_r0x0001801adc79;
          }
          bVar14 = cVar15 - 6;
          cVar16 = bVar4 + 0x24;
code_r0x0001801adc08:
          bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801adc10:
          abStack_218[uVar17] = bVar4 + 0x84 + (cVar15 - 0x16U & bVar4) * -2 + cVar15;
          uVar17 = uVar17 - 1;
          uVar12 = uVar12 + 1;
        }
      }
      else {
        if (uVar13 != uVar12 + 1) {
          if (uVar13 != uVar12 + 3) {
            if (uVar13 != uVar12 + 4) {
              if (uVar13 == uVar12 + 5) {
                bVar14 = cVar15 + 0x38;
                cVar16 = bVar4 + 0xb0;
                goto code_r0x0001801adc76;
              }
              if (uVar13 != uVar12 + 8) goto code_r0x0001801ad88c;
              bVar14 = cVar15 + 0x5c;
              cVar16 = bVar4 - 0x28;
              goto code_r0x0001801adc08;
            }
            bVar14 = cVar15 + bVar4 + '@' + (cVar15 + 0x20U & bVar4) * -2;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
            goto code_r0x0001801add2f;
          }
          bVar14 = cVar15 + 0x14;
          cVar16 = bVar4 + 0x88;
code_r0x0001801adcb9:
          cVar16 = cVar16 + cVar15;
          goto code_r0x0001801adcbc;
        }
        bVar14 = cVar15 - 4;
        cVar15 = cVar15 + bVar4 + '\x18';
code_r0x0001801add1b:
        bVar14 = cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801add23:
        uVar17 = uVar17 + abStack_218[uVar17] + uVar12;
      }
code_r0x0001801add2f:
    }
    auStack_178[0] = 0;
    auStack_178[1] = 0;
    auStack_178[2] = 0;
    auStack_178[3] = 0;
    uVar8 = FUN_180f29c00(pbVar19);
    FUN_180191ab0(auStack_178,pbVar19,uVar8);
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
      bVar14 = bStack_2e8;
code_r0x0001801adf1b:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar13 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar11 = *puVar7;
code_r0x0001801adf53:
      uVar12 = uVar11;
      uVar17 = uVar13;
      for (uVar18 = 0; uVar18 < 0x45; uVar18 = uVar18 + 1) {
        bVar4 = abStack_2d8[uVar18 + 0x30];
        bVar3 = (byte)uVar18;
code_r0x0001801adf83:
        if (uVar18 < uVar17) {
          puVar20 = (undefined4 *)((longlong)register0x00000020 + 0xfbb860);
          break;
        }
        if (uVar12 + 1 <= uVar17) {
          if (uVar17 != uVar12 + 1) {
            if (uVar17 == uVar12 + 3) {
              bVar14 = bVar3 + 0x18 & bVar4;
              cVar15 = bVar4 + 0x70;
              goto code_r0x0001801ae8f9;
            }
            if (uVar17 == uVar12 + 4) {
              bVar14 = bVar3 + 0x68;
              cVar15 = bVar3 + bVar4 + -0x70;
              goto code_r0x0001801ae8d7;
            }
            if (uVar17 != uVar12 + 5) {
              if (uVar17 != uVar12 + 2) goto code_r0x0001801adff0;
              bVar14 = bVar3 + 8;
              cVar15 = bVar4 - 0x30;
              goto code_r0x0001801ae86d;
            }
            bVar14 = bVar3 + bVar4 + -0x50 + (bVar3 + 0xb8 & bVar4) * -2;
            uVar17 = uVar17 + uVar12;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
            goto code_r0x0001801ae96f;
          }
          bVar14 = bVar3 + bVar4 + '0' + (bVar3 + 0x78 & bVar4) * -2;
          goto code_r0x0001801ae963;
        }
        bVar14 = (bVar4 & bVar3 + 0x28) * -2 + -0x18 + bVar4 + bVar3 + 0x28;
code_r0x0001801adff0:
        if (uVar18 < uVar12) {
          puVar20 = (undefined4 *)((longlong)register0x00000020 + 0x17d9838);
          break;
        }
        if (uVar12 + 8 <= uVar17) {
          if (uVar17 == uVar12 + 1) {
            bVar14 = bVar3 + 0x98;
            cVar15 = bVar4 + 0x70;
            goto code_r0x0001801ae834;
          }
          if (uVar17 == uVar12 + 2) {
            bVar14 = bVar3 + bVar4 + -0x50 + (bVar3 + 0x38 & bVar4) * -2;
            uVar18 = uVar18 - 1;
          }
          else if (uVar17 == uVar12 + 5) {
            bVar14 = bVar3 + bVar4 + -0x10 + (bVar3 - 0x28 & bVar4) * -2;
            uVar17 = uVar17 + uVar12;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
          }
          else {
            if (uVar17 != uVar12 + 3) {
              if (uVar17 != uVar12 + 6) goto code_r0x0001801ae060;
              bVar14 = bVar4 & bVar3 + 0x78;
              cVar15 = bVar4 + 0x30;
              goto code_r0x0001801ae8f9;
            }
            bVar14 = bVar3 + bVar4 + '\x10' + (bVar4 & bVar3 + 0x28) * -2;
            uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
          }
          goto code_r0x0001801ae96f;
        }
        bVar14 = bVar4 + 8 + bVar3 + 0x48 + (bVar3 + 0x48 & bVar4) * -2;
code_r0x0001801ae060:
        while (uVar11 = uVar12, uVar18 < uVar12 + uVar17) {
          while( true ) {
            do {
              uVar12 = uVar11;
              if (uVar17 == uVar12 + 100) {
                bVar14 = bVar4 & bVar3 + 0x30;
                cVar15 = bVar4 - 0x20;
                goto code_r0x0001801ae837;
              }
              if (uVar17 == uVar12 + 0x80) {
                bVar14 = bVar3 + bVar4 + (bVar4 & bVar3 + 0x80) * -2;
                uVar12 = uVar12 + 1;
                uVar18 = uVar18 - 1;
                goto code_r0x0001801ae96f;
              }
              if (uVar17 == uVar12 + 9) {
                bVar14 = bVar3 + bVar4 + ' ' + (bVar4 & bVar3 - 0x30) * -2;
                uVar18 = uVar18 - 1;
                goto code_r0x0001801ae96f;
              }
              uVar13 = uVar12 + 10;
              if (uVar17 == uVar13) {
                bVar14 = bVar4 & bVar3 + 0x20;
                cVar15 = bVar4 + 0x40;
                goto code_r0x0001801ae870;
              }
              if (uVar17 == uVar12 + 1) {
                bVar14 = bVar3 + bVar4 + '`' + (bVar4 & bVar3 + 0x70) * -2;
                uVar17 = uVar17 + uVar12;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                goto code_r0x0001801ae96f;
              }
              if (uVar17 == uVar12 + 2) {
                bVar14 = bVar3 + bVar4 + -0x80 + (bVar4 & bVar3 - 0x40) * -2;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                goto code_r0x0001801ae96f;
              }
              if (uVar17 == uVar12 + 0x400) {
                bVar14 = bVar4 & bVar3 + 0x10;
                cVar15 = bVar4 + 0xa0;
                goto code_r0x0001801ae8f9;
              }
              if (uVar17 == uVar12 + 0x1000) {
                bVar14 = (bVar4 - 0x40) + bVar3 + (bVar4 & bVar3 + 0x60) * -2;
                goto code_r0x0001801ae927;
              }
              if (uVar17 == uVar12 + 0x28) {
                bVar14 = bVar3 + bVar4 + -0x20 + (bVar4 & bVar3 + 0xb0) * -2;
                goto code_r0x0001801ae963;
              }
              uVar11 = uVar12;
            } while (uVar17 == uVar12 + 0x40);
            if (uVar13 < uVar12 + 0x10) {
              bVar14 = bVar4 + bVar3 + 0x78 + -0x48 + (bVar4 & bVar3 + 0x78) * -2;
              goto code_r0x0001801adf1b;
            }
            uVar11 = uVar12 + 0xf;
            if (uVar13 < uVar12 + 0x11) {
              bVar14 = bVar4 + (bVar3 - 0x38) + -0x78 + (bVar4 & bVar3 - 0x38) * -2;
              goto code_r0x0001801adf53;
            }
            uVar17 = uVar13;
            if (uVar13 < uVar12 + 0x40f) {
              bVar14 = bVar4 + 0x58 + bVar3 + 0x18 + (bVar3 + 0x18 & bVar4) * -2;
              uVar12 = uVar11;
              goto code_r0x0001801adf83;
            }
            uVar1 = uVar12 + 0x100f;
            if (uVar13 < uVar1) {
              bVar14 = bVar4 + 0x28 + bVar3 + 0x68 + (bVar3 + 0x68 & bVar4) * -2;
              uVar12 = uVar11;
              goto code_r0x0001801adff0;
            }
            if (uVar13 < uVar12 + 0x37) break;
            if (uVar13 < uVar12 + 0x4f) {
              bVar14 = bVar3 + 8;
              cVar15 = bVar4 - 0x30;
              uVar12 = uVar11;
              goto code_r0x0001801ae443;
            }
            if (uVar13 < uVar12 + 0x14) {
              bVar14 = bVar3 + 0x58;
              cVar15 = bVar4 - 0x10;
              uVar12 = uVar11;
              goto code_r0x0001801ae401;
            }
            if (uVar13 < uVar12 + 0x15) {
              bVar14 = bVar3 + 0xa8;
              cVar15 = bVar4 + 0x10;
              uVar12 = uVar11;
              goto code_r0x0001801ae3c0;
            }
            if (uVar13 < uVar12 + 0x50) {
              bVar14 = bVar3 + bVar4 + '0' + (bVar4 & bVar3 - 8) * -2;
              uVar12 = uVar11;
              goto code_r0x0001801ae3a6;
            }
            if (uVar12 + 0x69 <= uVar13) {
              uVar11 = uVar12 + 0x108f;
              uVar17 = uVar1;
              if (uVar12 + 0x10b7 < uVar1) {
                bVar14 = bVar3 + bVar4 + -0x80 + (bVar4 & bVar3 - 0x40) * -2;
                uVar12 = uVar11;
                goto code_r0x0001801ae963;
              }
              if (uVar12 + 0x10cf < uVar1) {
                bVar14 = bVar4 + 0xa0 + bVar3 + (bVar4 & bVar3 + 0x10) * -2;
                uVar12 = uVar11;
                goto code_r0x0001801ae927;
              }
              if (uVar12 + 0x1094 < uVar1) {
                bVar14 = bVar4 & bVar3 + 0x60;
                cVar15 = bVar4 - 0x40;
                uVar12 = uVar11;
                goto code_r0x0001801ae8f9;
              }
              if (uVar12 + 0x1095 < uVar1) {
                bVar14 = bVar3 + bVar4 + -0x20 + (bVar4 & bVar3 + 0xb0) * -2;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                uVar12 = uVar11;
                goto code_r0x0001801ae96f;
              }
              if (uVar12 + 0x10d0 < uVar1) {
                bVar14 = bVar3 + bVar4 + (bVar4 & bVar3) * -2;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                uVar12 = uVar11;
                uVar17 = uVar1 + uVar11;
                goto code_r0x0001801ae96f;
              }
              if (uVar12 + 0x10e9 < uVar1) {
                bVar14 = bVar4 & bVar3 + 0x50;
                cVar15 = bVar4 + 0x20;
                uVar12 = uVar11;
                goto code_r0x0001801ae870;
              }
              if (uVar12 + 0x110f < uVar1) {
                bVar14 = bVar3 + bVar4 + '@' + (bVar4 & bVar3 + 0xa0) * -2;
                uVar18 = uVar18 - 1;
                uVar12 = uVar11;
                goto code_r0x0001801ae96f;
              }
              if (uVar12 + 0x128f < uVar1) {
                bVar14 = bVar3 + bVar4 + '`' + (bVar4 & bVar3 - 0x10) * -2;
                uVar18 = uVar18 - 1;
                uVar12 = uVar12 + 0x1090;
                goto code_r0x0001801ae96f;
              }
              if (uVar12 + 0x1099 < uVar1) {
                bVar14 = bVar4 & bVar3 + 0x40;
                cVar15 = bVar4 + 0x80;
                uVar12 = uVar11;
                goto code_r0x0001801ae837;
              }
              if (uVar1 <= uVar12 + 0x109f) {
                uVar11 = uVar12 + 0x1097;
                uVar17 = uVar12 + 0x1095;
              }
            }
          }
          bVar14 = (bVar4 - 8) + bVar3 + 0xb8 + (bVar3 + 0xb8 & bVar4) * -2;
          uVar12 = uVar11;
        }
        if (uVar17 < uVar12 + 0x7a) {
          bVar14 = bVar3 + 0x28;
          cVar15 = bVar4 + 0x10;
code_r0x0001801ae443:
          bVar14 = cVar15 + bVar3 + (bVar4 & bVar14) * -2;
code_r0x0001801ae449:
          if (uVar12 + uVar17 == 0x80) {
            bVar14 = bVar4 & bVar3 + 0x90;
            cVar15 = bVar3 + 0xa0;
code_r0x0001801ae8fc:
            bVar14 = cVar15 + bVar14 * -2;
            bVar3 = bVar4 + 0xb0 + (bVar3 + 0xb8 & bVar4) * -2 + bVar3;
            abStack_2d8[uVar18 + 0x30] = bVar3;
            uVar18 = (uVar18 - (uVar12 + 1)) - (ulonglong)bVar3;
            uVar12 = uVar12 + 1;
code_r0x0001801ae927:
            abStack_2d8[uVar18 + 0x30] =
                 (char)uVar18 + -0x40 + bVar4 + ((char)uVar18 - 0x20U & bVar4) * -2;
            uVar18 = uVar18 + ~(uVar17 + 1);
            uVar17 = uVar17 + 1;
            goto code_r0x0001801ae963;
          }
          if (uVar12 + 0x28 < uVar17) {
            bVar14 = bVar3 + 0x88;
            cVar15 = bVar4 - 0x30;
code_r0x0001801ae401:
            bVar14 = cVar15 + bVar3 + (bVar4 & bVar14) * -2;
code_r0x0001801ae407:
            if (uVar17 < 2) {
              if (uVar12 + 0x41 < uVar17) {
                bVar14 = bVar3 - 0x30;
                cVar15 = bVar4 + 0x20;
code_r0x0001801ae3c0:
                bVar14 = cVar15 + bVar3 + (bVar4 & bVar14) * -2;
code_r0x0001801ae3c6:
                if (3 < uVar12) {
                  bVar14 = ((bVar4 - 0x10) + bVar3 + (bVar4 & bVar3 - 0x10) * -2) * '\x02' - 0x20;
                  goto code_r0x0001801ae83f;
                }
code_r0x0001801ae3a6:
                abStack_2d8[uVar18 + 0x30] = bVar14;
              }
              else {
                if (uVar17 == uVar12 + 1) {
                  bVar14 = bVar3 + bVar4 + '@' + (bVar4 & bVar3 + 0x20) * -2;
                  goto code_r0x0001801ae963;
                }
                if (uVar17 == uVar12 + 3) {
                  bVar14 = bVar3 + 0x10;
                  cVar15 = bVar3 + bVar4 + -0x60;
code_r0x0001801ae8d7:
                  bVar14 = cVar15 + (bVar14 & bVar4) * -2;
                  uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                }
                else {
                  if (uVar17 != uVar12 + 2) {
                    if (uVar17 == uVar12 + 5) {
                      bVar14 = bVar3 + 0xa0;
                      cVar15 = bVar4 + 0x40;
code_r0x0001801ae834:
                      bVar14 = bVar14 & bVar4;
                      goto code_r0x0001801ae837;
                    }
                    goto code_r0x0001801ae3c6;
                  }
                  bVar14 = bVar3 + bVar4 + -0x40 + (bVar3 + 0x60 & bVar4) * -2;
                  uVar17 = uVar17 + uVar12;
                  uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
                }
              }
            }
            else {
              bVar14 = bVar4 * '\x02' + bVar3 + (bVar4 & bVar3 + 0x40) * -2 + 0x80;
code_r0x0001801ae878:
              abStack_2d8[uVar18 + 0x30] =
                   bVar4 + (bVar3 + 0x68 & bVar4) * -2 + -0x70 + bVar3 + bVar14;
              uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
              uVar17 = uVar17 + uVar12;
            }
          }
          else if (uVar17 == uVar12 + 1) {
            bVar14 = bVar4 & bVar3 - 0x28;
            cVar15 = bVar4 - 0x10;
code_r0x0001801ae837:
            bVar14 = cVar15 + bVar3 + bVar14 * -2;
code_r0x0001801ae83f:
            abStack_2d8[uVar18 + 0x30] = bVar4 + 0x70 + (bVar3 + 0x18 & bVar4) * -2 + bVar3;
            uVar18 = uVar18 - 1;
            uVar12 = uVar12 + 1;
          }
          else if (uVar17 == uVar12 + 2) {
            bVar14 = bVar3 + bVar4 + '\x10' + (bVar4 & bVar3 + 0x28) * -2;
            uVar12 = uVar12 + 1;
            uVar18 = uVar18 - 1;
          }
          else {
            if (uVar17 != uVar12 + 3) goto code_r0x0001801ae407;
            bVar14 = bVar3 + bVar4 + '0' + (bVar4 & bVar3 + 0x78) * -2;
            uVar18 = uVar18 - 1;
          }
        }
        else {
          if (uVar17 != uVar12 + 1) {
            if (uVar17 != uVar12 + 3) {
              if (uVar17 == uVar12 + 5) {
                bVar14 = bVar3 + bVar4 + ' ' + (bVar3 - 0x30 & bVar4) * -2;
                uVar17 = uVar17 + uVar12;
                uVar18 = (uVar18 - 1) - (ulonglong)bVar14;
              }
              else {
                if (uVar17 == uVar12 + 6) {
                  bVar14 = bVar3 + 0x20;
                  cVar15 = bVar4 + 0x40;
code_r0x0001801ae86d:
                  bVar14 = bVar14 & bVar4;
code_r0x0001801ae870:
                  bVar14 = cVar15 + bVar3 + bVar14 * -2;
                  goto code_r0x0001801ae878;
                }
                if (uVar17 == uVar12 + 4) {
                  bVar14 = bVar3 + bVar4 + '`' + (bVar3 + 0x70 & bVar4) * -2;
                  uVar18 = uVar18 - 1;
                }
                else {
                  if (uVar17 != uVar12 + 2) goto code_r0x0001801ae449;
                  bVar14 = bVar3 + bVar4 + -0x80 + (bVar3 - 0x40 & bVar4) * -2;
                  uVar12 = uVar12 + 1;
                  uVar18 = uVar18 - 1;
                }
              }
              goto code_r0x0001801ae96f;
            }
            bVar14 = bVar4 & bVar3 + 0x30;
            cVar15 = bVar4 - 0x20;
code_r0x0001801ae8f9:
            cVar15 = cVar15 + bVar3;
            goto code_r0x0001801ae8fc;
          }
          bVar14 = bVar3 + bVar4 + -0x60 + (bVar4 & bVar3 + 0x90) * -2;
code_r0x0001801ae963:
          uVar18 = uVar18 + abStack_2d8[uVar18 + 0x30] + uVar12;
        }
code_r0x0001801ae96f:
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
  pbVar19 = abStack_1b8;
  bVar14 = bStack_2e8;
code_r0x0001801aeb5c:
  puVar7 = (ulonglong *)func_0x000180b36780();
  uVar13 = *puVar7;
  puVar7 = (ulonglong *)func_0x000180b36790();
  uVar11 = *puVar7;
code_r0x0001801aeba0:
  uVar17 = 0;
  uVar12 = uVar11;
  do {
    if (0x2b < uVar17) {
code_r0x0001801af59d:
      uStack_118 = 0;
      uStack_110 = 0;
      uStack_108 = 0;
      uStack_100 = 0;
      uVar8 = FUN_180f29c00(pbVar19);
      FUN_180191ab0(&uStack_118,pbVar19,uVar8);
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
        pbVar19 = abStack_258;
code_r0x0001801b012c:
        puVar7 = (ulonglong *)func_0x000180b36780();
        uVar13 = *puVar7;
        puVar7 = (ulonglong *)func_0x000180b36790();
        uVar11 = *puVar7;
code_r0x0001801b0170:
        uVar17 = 0;
        uVar12 = uVar11;
        do {
          if (0x38 < uVar17) {
code_r0x0001801b0b5f:
            uVar8 = FUN_1801a9d10(auStack_90,pbVar19,puStack_188);
            FUN_1801a4a90(uVar8);
            FUN_180195980(auStack_90);
            FUN_180195980(auStack_70);
            puVar10 = puStack_1c8;
            FUN_18019a4f0(puStack_1c8 + 0x33,&UNK_180f47d70,3);
            return puVar10;
          }
          bVar14 = abStack_258[uVar17];
          cVar15 = (char)uVar17;
code_r0x0001801b01a0:
          if (uVar17 < uVar13) {
            pbVar19 = (byte *)((longlong)register0x00000020 + 0x16535c2);
            goto code_r0x0001801b0b5f;
          }
          if (uVar12 + 1 <= uVar13) {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 != uVar12 + 2) {
                if (uVar13 == uVar12 + 3) {
                  bVar4 = cVar15 - 0x26;
                  cVar16 = bVar14 - 0x1c;
code_r0x0001801b0a2d:
                  bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
                  goto code_r0x0001801b0a38;
                }
                if (uVar13 != uVar12 + 8) goto code_r0x0001801b0200;
                bVar4 = cVar15 + 0x66;
                cVar16 = bVar14 + 0x9c;
                goto code_r0x0001801b09f4;
              }
              bVar4 = cVar15 - 0x36;
              cVar16 = bVar14 + 0x44;
              goto code_r0x0001801b0a6a;
            }
            bVar4 = cVar15 + 0x46;
            cVar15 = cVar15 + bVar14 + '\\';
            goto code_r0x0001801b0aa9;
          }
          bStack_2e8 = (bVar14 & cVar15 - 0x3eU) * -2 + -0x4e + bVar14 + (cVar15 - 0x3eU);
code_r0x0001801b0200:
          if (uVar17 < uVar12) {
            pbVar19 = (byte *)((longlong)register0x00000020 + 0x1580c00);
            goto code_r0x0001801b0b5f;
          }
          if (uVar12 + 0x20 <= uVar13) {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 == uVar12 + 4) {
                bStack_2e8 = cVar15 + bVar14 + '\f' + (cVar15 + 0x7eU & bVar14) * -2;
                uVar13 = uVar13 + uVar12;
                uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
              }
              else {
                if (uVar13 != uVar12 + 3) {
                  if (uVar13 == uVar12 + 7) {
                    bVar4 = cVar15 + 0x86;
                    cVar16 = bVar14 - 0x24;
                    goto code_r0x0001801b0963;
                  }
                  if (uVar13 != uVar12 + 2) goto code_r0x0001801b0270;
                  bVar4 = cVar15 + 0x8e;
                  cVar15 = cVar15 + bVar14 + -0x54;
                  goto code_r0x0001801b0aa9;
                }
                bStack_2e8 = cVar15 + bVar14 + -0xc + (cVar15 + 2U & bVar14) * -2;
                uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
              }
              goto code_r0x0001801b0abd;
            }
            bVar4 = cVar15 + 0x6e;
            cVar16 = bVar14 + 0x6c;
            goto code_r0x0001801b09f4;
          }
          bStack_2e8 = bVar14 + 0x9a + (cVar15 - 0x16U) + (bVar14 & cVar15 - 0x16U) * -2;
code_r0x0001801b0270:
          while (uVar11 = uVar12, uVar17 < uVar12 + uVar13) {
            while( true ) {
              do {
                uVar12 = uVar11;
                if (uVar13 == uVar12 + 0x10) {
                  bVar4 = cVar15 + 0x5c;
                  cVar16 = bVar14 - 0x28;
                  goto code_r0x0001801b09f4;
                }
                if (uVar13 == uVar12 + 0x20) {
                  bStack_2e8 = cVar15 + bVar14 + -0x40 + (cVar15 - 0x20U & bVar14) * -2;
                  uVar12 = uVar12 + 1;
                  uVar17 = uVar17 - 1;
                  goto code_r0x0001801b0abd;
                }
                if (uVar13 == uVar12 + 0x28) {
                  bStack_2e8 = cVar15 + bVar14 + -0x58 + (cVar15 + 100U & bVar14) * -2;
                  uVar17 = uVar17 - 1;
                  goto code_r0x0001801b0abd;
                }
                if (uVar13 == uVar12 + 0x40) {
                  bVar4 = cVar15 - 0x18;
                  cVar16 = bVar14 + 0x90;
                  goto code_r0x0001801b0a2d;
                }
                if (uVar13 == uVar12 + 0x42) {
                  bStack_2e8 = cVar15 + bVar14 + 'x' + (cVar15 + 0x6cU & bVar14) * -2;
                  uVar13 = uVar13 + uVar12;
                  uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                  goto code_r0x0001801b0abd;
                }
                if (uVar13 == uVar12 + 100) {
                  bStack_2e8 = cVar15 + bVar14 + '`' + (cVar15 - 0x10U & bVar14) * -2;
                  uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                  goto code_r0x0001801b0abd;
                }
                if (uVar13 == uVar12 + 0x80) {
                  bVar4 = cVar15 + 0x74;
                  cVar16 = bVar14 + 0x48;
                  goto code_r0x0001801b0963;
                }
                if (uVar13 == uVar12 + 0x200) {
                  bVar4 = cVar15 - 8;
                  cVar16 = bVar14 + 0x30;
                  goto code_r0x0001801b0a6a;
                }
                if (uVar13 == uVar12 + 1000) {
                  bVar4 = cVar15 + 0x7c;
                  cVar15 = cVar15 + bVar14 + '\x18';
                  goto code_r0x0001801b0aa9;
                }
                uVar11 = uVar12;
              } while (uVar13 == uVar12 + 0x400);
              uVar13 = uVar12 + 0x5a;
              if (uVar13 < uVar12 + 0x1084) {
                bStack_2e8 = bVar14 + cVar15 + 0x46U + '\x16' + (cVar15 + 0x46U & bVar14) * -2;
                goto code_r0x0001801b012c;
              }
              uVar11 = uVar12 + 0x105a;
              if (uVar13 < uVar12 + 0x105b) {
                bStack_2e8 = bVar14 + (cVar15 - 0x36U) + 'z' + (bVar14 & cVar15 - 0x36U) * -2;
                goto code_r0x0001801b0170;
              }
              if (uVar13 < uVar12 + 0x105c) {
                bStack_2e8 = (bVar14 - 0x22) + cVar15 + 0x4eU + (cVar15 + 0x4eU & bVar14) * -2;
                uVar12 = uVar11;
                goto code_r0x0001801b01a0;
              }
              if (uVar13 < uVar12 + 0x105d) {
                bStack_2e8 = bVar14 + 0x42 + (cVar15 - 0x2eU) + (cVar15 - 0x2eU & bVar14) * -2;
                uVar12 = uVar11;
                goto code_r0x0001801b0200;
              }
              if (uVar13 < uVar12 + 0x105e) break;
              uVar18 = uVar12 + 0x105f;
              if (uVar13 < uVar18) {
                bVar4 = cVar15 - 0x26;
                cVar16 = bVar14 - 0x1c;
                uVar12 = uVar11;
                goto code_r0x0001801b0631;
              }
              if (uVar13 < uVar12 + 0x1060) {
                bVar4 = cVar15 + 0x5e;
                cVar16 = bVar14 - 0x34;
                uVar12 = uVar11;
                goto code_r0x0001801b05f2;
              }
              if (uVar13 < uVar12 + 0x1062) {
                bVar4 = cVar15 - 0x1e;
                cVar16 = bVar14 + 0xb4;
                uVar12 = uVar11;
                goto code_r0x0001801b05bc;
              }
              if (uVar13 < uVar12 + 0x1063) {
                bStack_2e8 = cVar15 + bVar14 + -100 + (cVar15 + 0x66U & bVar14) * -2;
                uVar12 = uVar11;
                goto code_r0x0001801b05a2;
              }
              if (uVar12 + 0x1064 <= uVar13) {
                uVar11 = uVar12 + 0x106f;
                uVar13 = uVar18;
                if (uVar12 + 0x1075 < uVar18) {
                  bVar4 = cVar15 + 0x30;
                  cVar15 = cVar15 + bVar14 + -0x20;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0aa9;
                }
                if (uVar12 + 0x1077 < uVar18) {
                  bVar4 = cVar15 + 0xb4;
                  cVar16 = bVar14 - 0x38;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0a6a;
                }
                if (uVar12 + 0x1078 < uVar18) {
                  bVar4 = cVar15 + 0x38;
                  cVar16 = bVar14 + 0xb0;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0963;
                }
                if (uVar12 + 0x1457 < uVar18) {
                  bStack_2e8 = cVar15 + bVar14 + -0x68 + (cVar15 + 0xbcU & bVar14) * -2;
                  uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0abd;
                }
                if (uVar12 + 0x146f < uVar18) {
                  bStack_2e8 = cVar15 + bVar14 + -0x80 + (cVar15 + 0x40U & bVar14) * -2;
                  uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                  uVar12 = uVar11;
                  uVar13 = uVar18 + uVar11;
                  goto code_r0x0001801b0abd;
                }
                if (uVar12 + 0x206f < uVar18) {
                  bVar4 = cVar15 - 0x3c;
                  cVar16 = bVar14 + 0x68;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0a2d;
                }
                if (uVar12 + 0x10d0 < uVar18) {
                  bStack_2e8 = cVar15 + bVar14 + 'P' + (cVar15 + 0x48U & bVar14) * -2;
                  uVar17 = uVar17 - 1;
                  uVar12 = uVar11;
                  goto code_r0x0001801b0abd;
                }
                if (uVar12 + 0x10e9 < uVar18) {
                  bStack_2e8 = cVar15 + bVar14 + '8' + (cVar15 - 0x34U & bVar14) * -2;
                  uVar17 = uVar17 - 1;
                  uVar12 = uVar12 + 0x1070;
                  goto code_r0x0001801b0abd;
                }
                if (uVar12 + 0x10b0 < uVar18) {
                  bVar4 = cVar15 + 0x50;
                  cVar16 = bVar14 + 0x20;
                  uVar12 = uVar11;
                  goto code_r0x0001801b09f4;
                }
                if (uVar18 <= uVar12 + 0x10c9) {
                  uVar11 = uVar12 + 0x2099;
                  uVar13 = uVar12 + 0x206f;
                }
              }
            }
            bStack_2e8 = bVar14 + 0xa6 + cVar15 + 0x56U + (cVar15 + 0x56U & bVar14) * -2;
            uVar12 = uVar11;
          }
          if (uVar13 < uVar12 + 0x61) {
            bVar4 = cVar15 - 0x3e;
            cVar16 = bVar14 + 0x74;
code_r0x0001801b0631:
            bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801b0637:
            if (uVar12 + uVar13 == 0x10) {
              bVar4 = cVar15 + 0x54;
              cVar16 = cVar15 + '\b';
code_r0x0001801b0966:
              bStack_2e8 = cVar16 + (bVar4 & bVar14) * -2;
              bVar4 = bVar14 + 0x7c + (cVar15 + 0x16U & bVar14) * -2 + cVar15;
              abStack_258[uVar17] = bVar4;
              uVar12 = uVar12 + 1;
              uVar17 = (uVar17 - uVar12) - (ulonglong)bVar4;
code_r0x0001801b0a75:
              abStack_258[uVar17] =
                   (char)uVar17 + -0x10 + bVar14 + ((char)uVar17 - 0x28U & bVar14) * -2;
              uVar13 = uVar13 + 1;
              uVar17 = uVar17 + ~uVar13;
              goto code_r0x0001801b0ab1;
            }
            if (uVar12 + 6 < uVar13) {
              bVar4 = cVar15 + 0x3a;
              cVar16 = bVar14 + 0xa4;
code_r0x0001801b05f2:
              bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801b05f8:
              if (uVar13 < 0x80) {
                if (uVar13 <= uVar12 + 0x61) {
                  if (uVar13 == uVar12 + 1) {
                    bVar4 = cVar15 + 0xa8;
                    cVar15 = cVar15 + bVar14 + '\x10';
                    goto code_r0x0001801b0aa9;
                  }
                  if (uVar13 != uVar12 + 2) {
                    if (uVar13 == uVar12 + 3) {
                      bStack_2e8 = cVar15 + bVar14 + -0x38 + (cVar15 + 0x34U & bVar14) * -2;
                      uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                    }
                    else if (uVar13 == uVar12 + 4) {
                      bStack_2e8 = cVar15 + bVar14 + -0x80 + (cVar15 - 0x40U & bVar14) * -2;
                      uVar17 = uVar17 - 1;
                    }
                    else {
                      if (uVar13 != uVar12 + 5) {
                        if (uVar13 == uVar12 + 6) {
                          bVar4 = cVar15 - 0x38;
                          cVar16 = bVar14 + 0x50;
                          goto code_r0x0001801b09f4;
                        }
                        goto code_r0x0001801b05c2;
                      }
                      bStack_2e8 = cVar15 + bVar14 + 'h' + (cVar15 + 0x44U & bVar14) * -2;
                      uVar12 = uVar12 + 1;
                      uVar17 = uVar17 - 1;
                    }
                    goto code_r0x0001801b0abd;
                  }
                  bVar4 = cVar15 + 0x2c;
                  cVar16 = bVar14 - 8;
code_r0x0001801b0a6a:
                  bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
                  goto code_r0x0001801b0a75;
                }
                bVar4 = cVar15 + 0x24;
                cVar16 = bVar14 + 0x28;
code_r0x0001801b05bc:
                bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801b05c2:
                if (5 < uVar12) {
                  bStack_2e8 = (bVar14 + 0x38 + cVar15 + (cVar15 + 0x4cU & bVar14) * -2) * '\x02';
                  goto code_r0x0001801b09ff;
                }
code_r0x0001801b05a2:
                abStack_258[uVar17] = bStack_2e8;
              }
              else {
                bStack_2e8 = bVar14 * '\x02' + cVar15 + (cVar15 - 0x30U & bVar14) * -2 + ' ';
code_r0x0001801b0a38:
                abStack_258[uVar17] =
                     bVar14 + (cVar15 + 0x92U & bVar14) * -2 + -0x6c + cVar15 + bStack_2e8;
                uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                uVar13 = uVar13 + uVar12;
              }
            }
            else if (uVar13 == uVar12 + 1) {
              bVar4 = cVar15 + 0xbe;
              cVar16 = bVar14 + 0x8c;
code_r0x0001801b09f4:
              bStack_2e8 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801b09ff:
              abStack_258[uVar17] = bVar14 + 0xac + (cVar15 + 0xeU & bVar14) * -2 + cVar15;
              uVar17 = uVar17 - 1;
              uVar12 = uVar12 + 1;
            }
            else if (uVar13 == uVar12 + 2) {
              bStack_2e8 = cVar15 + bVar14 + 't' + (cVar15 + 0x42U & bVar14) * -2;
              uVar12 = uVar12 + 1;
              uVar17 = uVar17 - 1;
            }
            else if (uVar13 == uVar12 + 3) {
              bStack_2e8 = cVar15 + bVar14 + ',' + (cVar15 - 0x32U & bVar14) * -2;
              uVar13 = uVar13 + uVar12;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
            }
            else {
              if (uVar13 != uVar12 + 5) goto code_r0x0001801b05f8;
              bStack_2e8 = cVar15 + bVar14 + '\x14' + (cVar15 + 0x52U & bVar14) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
            }
          }
          else {
            if (uVar13 != uVar12 + 1) {
              if (uVar13 != uVar12 + 2) {
                if (uVar13 != uVar12 + 3) goto code_r0x0001801b0637;
                bStack_2e8 = cVar15 + bVar14 + -0x58 + (cVar15 - 0x1cU & bVar14) * -2;
                uVar13 = uVar13 + uVar12;
                uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                goto code_r0x0001801b0abd;
              }
              bVar4 = cVar15 - 0x24;
              cVar16 = bVar14 - 0x28;
code_r0x0001801b0963:
              cVar16 = cVar16 + cVar15;
              goto code_r0x0001801b0966;
            }
            bVar4 = cVar15 - 0x2c;
            cVar15 = cVar15 + bVar14 + '\b';
code_r0x0001801b0aa9:
            bStack_2e8 = cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801b0ab1:
            uVar17 = uVar17 + abStack_258[uVar17] + uVar12;
          }
code_r0x0001801b0abd:
          uVar17 = uVar17 + 1;
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
code_r0x0001801af693:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar11 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar13 = *puVar7;
code_r0x0001801af6e0:
      uVar17 = 0;
      uVar12 = uVar13;
      do {
        if (0x2f < uVar17) {
          pbVar19 = abStack_2d8;
code_r0x0001801b0057:
          uVar8 = FUN_1801a9d10(auStack_d0,pbVar19,puStack_188);
          FUN_1801a4a90(uVar8);
          FUN_180195980(auStack_d0);
          FUN_180195980(auStack_b0);
          *(undefined4 *)((longlong)puStack_1c8 + 0x18c) = 0;
          return puStack_1c8;
        }
        bVar14 = abStack_2d8[uVar17];
        cVar15 = (char)uVar17;
code_r0x0001801af702:
        if (uVar17 < uVar11) {
          pbVar19 = (byte *)((longlong)register0x00000020 + 0x8bba6b);
          goto code_r0x0001801b0057;
        }
        if (uVar12 + 1 <= uVar11) {
          if (uVar11 != uVar12 + 1) {
            if (uVar11 == uVar12 + 2) {
              bVar4 = cVar15 - 0x37;
              cVar16 = bVar14 + 0x4a;
code_r0x0001801aff1f:
              cVar16 = cVar16 + cVar15;
              goto code_r0x0001801aff22;
            }
            if (uVar11 == uVar12 + 5) {
              bVar4 = cVar15 + 0x85;
              cVar15 = cVar15 + bVar14 + -0x1e;
code_r0x0001801afeff:
              bStack_2e8 = cVar15 + (bVar14 & bVar4) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
              uVar11 = uVar11 + uVar12;
            }
            else {
              if (uVar11 != uVar12 + 7) {
                if (uVar11 != uVar12 + 9) goto code_r0x0001801af770;
                bVar4 = cVar15 - 3;
                cVar16 = bVar14 + 0x12;
                goto code_r0x0001801afea8;
              }
              bStack_2e8 = cVar15 + bVar14 + 'z' + (bVar14 & cVar15 + 0x41U) * -2;
              uVar17 = uVar17 - 1;
            }
            goto code_r0x0001801aff92;
          }
          bVar4 = cVar15 + 0xd;
          cVar15 = cVar15 + bVar14 + -0x4e;
          goto code_r0x0001801aff7c;
        }
        bStack_2e8 = (bVar14 & cVar15 + 0xafU) * -2 + '7' + bVar14 + cVar15 + 0xafU;
code_r0x0001801af770:
        if (uVar17 < uVar12) {
          pbVar19 = (byte *)((longlong)register0x00000020 + 0x17576bc);
          goto code_r0x0001801b0057;
        }
        if (uVar11 < uVar12 + 0x28) {
          bStack_2e8 = bVar14 + 0x83 + cVar15 + 0x5bU + (bVar14 & cVar15 + 0x5bU) * -2;
        }
        else {
          if (uVar11 == uVar12 + 1) {
            bVar4 = cVar15 + 0xb9;
            cVar16 = bVar14 + 0xaa;
            goto code_r0x0001801afea8;
          }
          if (uVar11 == uVar12 + 2) {
            bStack_2e8 = cVar15 + bVar14 + 'B' + (bVar14 & cVar15 + 0x75U) * -2;
            uVar17 = uVar17 - 1;
            goto code_r0x0001801aff92;
          }
          if (uVar11 == uVar12 + 5) {
            bStack_2e8 = cVar15 + bVar14 + -0x5a + (bVar14 & cVar15 + 0x8fU) * -2;
            uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
            goto code_r0x0001801aff92;
          }
        }
        while (uVar13 = uVar12, uVar17 < uVar12 + uVar11) {
          while( true ) {
            uVar12 = uVar13;
            if (uVar11 == uVar12 + 9) {
              bVar4 = cVar15 + 0x32;
              cVar16 = bVar14 - 0x2c;
              goto code_r0x0001801afea8;
            }
            if (uVar11 == uVar12 + 0x28) {
              bStack_2e8 = cVar15 + bVar14 + -0x60 + (bVar14 & cVar15 + 0x90U) * -2;
              uVar12 = uVar12 + 1;
              uVar17 = uVar17 - 1;
              goto code_r0x0001801aff92;
            }
            if (uVar11 == uVar12 + 8) {
              bStack_2e8 = cVar15 + bVar14 + 'l' + (bVar14 & cVar15 - 0x12U) * -2;
              uVar17 = uVar17 - 1;
              goto code_r0x0001801aff92;
            }
            if (uVar11 == uVar12 + 0x20) {
              bStack_2e8 = bVar14 + 0x38 + cVar15 + (bVar14 & cVar15 + 0x4cU) * -2;
              goto code_r0x0001801afe1b;
            }
            if (uVar11 == uVar12 + 6) {
              bVar4 = cVar15 + 0xaa;
              cVar15 = cVar15 + bVar14 + '\x04';
              goto code_r0x0001801afeff;
            }
            if (uVar11 == uVar12 + 0x10) {
              bStack_2e8 = cVar15 + bVar14 + -0x30 + (bVar14 & cVar15 + 8U) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
              goto code_r0x0001801aff92;
            }
            if (uVar11 == uVar12 + 5) {
              bVar4 = cVar15 + 0x66;
              cVar16 = bVar14 + 0x9c;
              goto code_r0x0001801aff1f;
            }
            if (uVar11 == uVar12 + 10) {
              bStack_2e8 = bVar14 + 0x68 + cVar15 + (bVar14 & cVar15 - 0x3cU) * -2;
              goto code_r0x0001801aff4d;
            }
            uVar13 = uVar12 + 4;
            if (uVar11 == uVar13) {
              bVar4 = cVar15 + 0x22;
              cVar15 = cVar15 + bVar14 + '4';
              goto code_r0x0001801aff7c;
            }
            uVar11 = uVar12 + 1;
            if (uVar11 < uVar12 + 9) {
              bStack_2e8 = bVar14 + cVar15 + 0x8dU + '%' + (cVar15 + 0x8dU & bVar14) * -2;
              goto code_r0x0001801af693;
            }
            if (uVar11 < uVar12 + 0x2e) {
              bStack_2e8 = bVar14 + (cVar15 - 0x15U) + -0x6d + (bVar14 & cVar15 - 0x15U) * -2;
              goto code_r0x0001801af6e0;
            }
            if (uVar11 < uVar12 + 8) {
              bStack_2e8 = bVar14 + 1 + cVar15 + 0x49U + (bVar14 & cVar15 + 0x49U) * -2;
              uVar12 = uVar13;
              goto code_r0x0001801af702;
            }
            if (uVar11 < uVar12 + 0x5e) {
              bStack_2e8 = bVar14 + 0x6f + cVar15 + 0xa7U + (bVar14 & cVar15 + 0xa7U) * -2;
              uVar12 = uVar13;
              goto code_r0x0001801af770;
            }
            if (uVar11 < uVar12 + 7) break;
            uVar18 = uVar12 + 0x45;
            if (uVar11 < uVar18) {
              bVar4 = cVar15 + 99;
              cVar16 = bVar14 + 0xae;
              uVar12 = uVar13;
              goto code_r0x0001801afb2b;
            }
            if (uVar11 < uVar12 + 6) {
              bVar4 = cVar15 - 0x3f;
              cVar16 = bVar14 + 0x7a;
              uVar12 = uVar13;
              goto code_r0x0001801afaea;
            }
            if (uVar11 < uVar12 + 0x7e) {
              bVar4 = cVar15 + 0x1f;
              cVar16 = bVar14 + 0x46;
              uVar12 = uVar13;
              goto code_r0x0001801afab2;
            }
            if (uVar11 < uVar12 + 5) {
              bStack_2e8 = cVar15 + bVar14 + '\x12' + (bVar14 & cVar15 + 0x7dU) * -2;
              uVar12 = uVar13;
              goto code_r0x0001801afa9a;
            }
            if (uVar12 + 0x65 <= uVar11) {
              uVar13 = uVar12 + 0x6f;
              uVar11 = uVar18;
              if (uVar12 + 0x71 < uVar18) {
                bVar4 = cVar15 - 0x18;
                cVar15 = cVar15 + bVar14 + -0x70;
                uVar12 = uVar13;
                goto code_r0x0001801aff7c;
              }
              if (uVar12 + 0xe9 < uVar18) {
                bStack_2e8 = bVar14 + 0x5c + cVar15 + (bVar14 & cVar15 + 0x46U) * -2;
                uVar12 = uVar13;
                goto code_r0x0001801aff4d;
              }
              if (uVar12 + 0x70 < uVar18) {
                bVar4 = cVar15 + 0xa4;
                cVar16 = bVar14 + 0x28;
                uVar12 = uVar13;
                goto code_r0x0001801aff1f;
              }
              if (uVar12 + 0xd0 < uVar18) {
                bStack_2e8 = cVar15 + bVar14 + -0xc + (bVar14 & cVar15 + 2U) * -2;
                uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                uVar12 = uVar13;
                goto code_r0x0001801aff92;
              }
              if (uVar12 + 0xef < uVar18) {
                bVar4 = cVar15 + 0x60;
                cVar15 = cVar15 + bVar14 + -0x40;
                uVar12 = uVar13;
                goto code_r0x0001801afeff;
              }
              if (uVar12 + 0x106f < uVar18) {
                bStack_2e8 = bVar14 + 0x8c + cVar15 + (bVar14 & cVar15 + 0xbeU) * -2;
                uVar12 = uVar13;
                goto code_r0x0001801afe1b;
              }
              if (uVar12 + 0xd3 < uVar18) {
                bStack_2e8 = cVar15 + bVar14 + 'X' + (bVar14 & cVar15 + 0x1cU) * -2;
                uVar17 = uVar17 - 1;
                uVar12 = uVar13;
                goto code_r0x0001801aff92;
              }
              if (uVar12 + 0x46f < uVar18) {
                bStack_2e8 = cVar15 + bVar14 + '$' + (bVar14 & cVar15 + 0x7aU) * -2;
                uVar17 = uVar17 - 1;
                uVar12 = uVar12 + 0x70;
                goto code_r0x0001801aff92;
              }
              if (uVar12 + 0xb1 < uVar18) {
                bVar4 = cVar15 - 0x28;
                cVar16 = bVar14 - 0x10;
                uVar12 = uVar13;
                goto code_r0x0001801afea8;
              }
              if (uVar18 <= uVar12 + 0x457) {
                uVar11 = uVar12 + 0x106f;
                uVar13 = uVar12 + 0x10af;
              }
            }
          }
          bStack_2e8 = (bVar14 - 0x23) + cVar15 + 5U + (bVar14 & cVar15 + 5U) * -2;
          uVar12 = uVar13;
        }
        if (uVar11 < uVar12 + 8) {
          bVar4 = cVar15 + 0xaf;
          cVar16 = bVar14 - 0x1a;
code_r0x0001801afb2b:
          bStack_2e8 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801afb31:
          if (uVar12 + uVar11 == 0x2a) {
            bVar4 = cVar15 + 0x76;
            cVar16 = cVar15 + '<';
code_r0x0001801aff22:
            bStack_2e8 = cVar16 + (bVar14 & bVar4) * -2;
            bVar4 = bVar14 + 0x22 + (cVar15 + 0x25U & bVar14) * -2 + cVar15;
            abStack_2d8[uVar17] = bVar4;
            uVar17 = (uVar17 - (uVar12 + 1)) - (ulonglong)bVar4;
            uVar12 = uVar12 + 1;
code_r0x0001801aff4d:
            abStack_2d8[uVar17] =
                 (char)uVar17 + '\b' + bVar14 + ((char)uVar17 - 0x2cU & bVar14) * -2;
            uVar11 = uVar11 + 1;
            uVar17 = uVar17 + ~uVar11;
            goto code_r0x0001801aff86;
          }
          if (uVar12 + 2 < uVar11) {
            bVar4 = cVar15 + 0xb3;
            cVar16 = bVar14 - 0x32;
code_r0x0001801afaea:
            bStack_2e8 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801afaf0:
            if (uVar11 < 0x7a) {
              if (uVar12 + 0x5a < uVar11) {
                bVar4 = cVar15 + 0xe;
                cVar16 = bVar14 + 0xac;
code_r0x0001801afab2:
                bStack_2e8 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
              }
              else {
                if (uVar11 == uVar12 + 1) {
                  bVar4 = cVar15 + 0x6c;
                  cVar15 = cVar15 + bVar14 + 'x';
                  goto code_r0x0001801aff7c;
                }
                if (uVar11 == uVar12 + 2) {
                  bStack_2e8 = bVar14 + 0x44 + cVar15 + (bVar14 & cVar15 - 0x36U) * -2;
                  goto code_r0x0001801aff4d;
                }
                if (uVar11 == uVar12 + 3) {
                  bStack_2e8 = cVar15 + bVar14 + -0x24 + (bVar14 & cVar15 + 0x86U) * -2;
                  uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
                  goto code_r0x0001801aff92;
                }
              }
              if (0xf < uVar12) {
                bStack_2e8 = (bVar14 + 0xa4 + cVar15 + (bVar14 & cVar15 + 0xbaU) * -2) * '\x02';
                goto code_r0x0001801afeb5;
              }
code_r0x0001801afa9a:
              abStack_2d8[uVar17] = bStack_2e8;
            }
            else {
              bStack_2e8 = bVar14 * '\x02' + cVar15 + (bVar14 & cVar15 + 0x18U) * -2 + 0x70;
code_r0x0001801afe1b:
              abStack_2d8[uVar17] =
                   bVar14 + 0x56 + (cVar15 - 0x39U & bVar14) * -2 + cVar15 + bStack_2e8;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
              uVar11 = uVar11 + uVar12;
            }
          }
          else {
            if (uVar11 != uVar12 + 1) {
              if (uVar11 == uVar12 + 2) {
                bStack_2e8 = cVar15 + bVar14 + 'f' + (bVar14 & cVar15 + 0x6fU) * -2;
                uVar12 = uVar12 + 1;
                uVar17 = uVar17 - 1;
                goto code_r0x0001801aff92;
              }
              if (uVar11 == uVar12 + 3) {
                bStack_2e8 = (bVar14 - 2) + cVar15 + (bVar14 & cVar15 + 0x2bU) * -2;
                goto code_r0x0001801afe1b;
              }
              goto code_r0x0001801afaf0;
            }
            bVar4 = cVar15 + 0x11;
            cVar16 = bVar14 + 0x9a;
code_r0x0001801afea8:
            bStack_2e8 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801afeb5:
            abStack_2d8[uVar17] = bVar14 + 0x8a + (cVar15 + 0x69U & bVar14) * -2 + cVar15;
            uVar17 = uVar17 - 1;
            uVar12 = uVar12 + 1;
          }
        }
        else {
          if (uVar11 != uVar12 + 1) {
            if (uVar11 == uVar12 + 4) {
              bStack_2e8 = cVar15 + bVar14 + ' ' + (bVar14 & cVar15 - 0x30U) * -2;
              uVar17 = (uVar17 - 1) - (ulonglong)bStack_2e8;
            }
            else {
              if (uVar11 == uVar12 + 3) {
                bStack_2e8 = bVar14 + 0xb8 + cVar15 + (bVar14 & cVar15 + 0x8cU) * -2;
                goto code_r0x0001801afe1b;
              }
              if (uVar11 == uVar12 + 7) {
                bStack_2e8 = cVar15 + bVar14 + -0x7c + (bVar14 & cVar15 - 0x16U) * -2;
                uVar17 = uVar17 - 1;
              }
              else {
                if (uVar11 != uVar12 + 2) {
                  if (uVar11 != uVar12 + 6) goto code_r0x0001801afb31;
                  bVar4 = cVar15 + 0xa6;
                  cVar16 = bVar14 + 0x1c;
                  goto code_r0x0001801afea8;
                }
                bStack_2e8 = cVar15 + bVar14 + 'P' + (bVar14 & cVar15 + 0x48U) * -2;
                uVar12 = uVar12 + 1;
                uVar17 = uVar17 - 1;
              }
            }
            goto code_r0x0001801aff92;
          }
          bVar4 = cVar15 + 0xb6;
          cVar15 = cVar15 + bVar14 + -0x44;
code_r0x0001801aff7c:
          bStack_2e8 = cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801aff86:
          uVar17 = uVar17 + abStack_2d8[uVar17] + uVar12;
        }
code_r0x0001801aff92:
        uVar17 = uVar17 + 1;
      } while( true );
    }
    bVar4 = abStack_1b8[uVar17];
    cVar15 = (char)uVar17;
code_r0x0001801aebd7:
    if (uVar17 < uVar13) {
      pbVar19 = (byte *)((longlong)register0x00000020 + 0x146ff62);
      goto code_r0x0001801af59d;
    }
    if (uVar12 + 1 <= uVar13) {
      if (uVar13 == uVar12 + 1) {
        bVar14 = cVar15 + 0x46;
        cVar15 = cVar15 + bVar4 + '\\';
        goto code_r0x0001801af4e7;
      }
      if (uVar13 == uVar12 + 2) {
        bVar14 = cVar15 + 0x4e;
        cVar16 = bVar4 + 0x2c;
        goto code_r0x0001801af488;
      }
      if (uVar13 == uVar12 + 4) {
        bVar14 = cVar15 - 0x2e;
        goto code_r0x0001801af461;
      }
      if (uVar13 == uVar12 + 5) {
        bVar14 = cVar15 - 0x26;
        cVar16 = bVar4 - 0x1c;
        goto code_r0x0001801af425;
      }
      if (uVar13 != uVar12 + 6) goto code_r0x0001801aec40;
      bVar14 = cVar15 + bVar4 + -0x4c + (cVar15 - 0x1eU & bVar4) * -2;
      uVar12 = uVar12 + 1;
      uVar17 = uVar17 - 1;
      goto code_r0x0001801af4fb;
    }
    bVar14 = (bVar4 & cVar15 - 0x3eU) * -2 + -0x4e + bVar4 + (cVar15 - 0x3eU);
code_r0x0001801aec40:
    if (uVar17 < uVar12) {
      pbVar19 = (byte *)((longlong)register0x00000020 + 0x15cc8a0);
      goto code_r0x0001801af59d;
    }
    if (uVar12 + 6 <= uVar13) {
      if (uVar13 == uVar12 + 1) {
        bVar14 = cVar15 + 0x6e;
        cVar16 = bVar4 + 0x6c;
        goto code_r0x0001801af3cd;
      }
      if (uVar13 == uVar12 + 2) {
        bVar14 = cVar15 + bVar4 + '<' + (cVar15 + 0x76U & bVar4) * -2;
        uVar17 = uVar17 - 1;
      }
      else {
        if (uVar13 != uVar12 + 3) {
          if (uVar13 != uVar12 + 5) {
            if (uVar13 != uVar12 + 4) goto code_r0x0001801aecb0;
            bVar14 = cVar15 + 0x86;
            cVar16 = bVar4 - 0x24;
            goto code_r0x0001801af488;
          }
          bVar14 = cVar15 + 2;
          cVar15 = cVar15 + bVar4 + -0xc;
          goto code_r0x0001801af469;
        }
        bVar14 = cVar15 + bVar4 + '\f' + (cVar15 + 0x7eU & bVar4) * -2;
        uVar13 = uVar13 + uVar12;
        uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
      }
      goto code_r0x0001801af4fb;
    }
    bVar14 = bVar4 + 0x9a + (cVar15 - 0x16U) + (cVar15 - 0x16U & bVar4) * -2;
code_r0x0001801aecb0:
    while (uVar11 = uVar12, uVar17 < uVar12 + uVar13) {
      while( true ) {
        do {
          uVar12 = uVar11;
          if (uVar13 == uVar12 + 6) {
            bVar14 = cVar15 + 0x5c;
            cVar16 = bVar4 - 0x28;
            goto code_r0x0001801af3cd;
          }
          if (uVar13 == uVar12 + 0x400) {
            bVar14 = cVar15 + bVar4 + -0x40 + (cVar15 - 0x20U & bVar4) * -2;
            uVar12 = uVar12 + 1;
            uVar17 = uVar17 - 1;
            goto code_r0x0001801af4fb;
          }
          if (uVar13 == uVar12 + 8) {
            bVar14 = cVar15 + bVar4 + -0x58 + (cVar15 + 100U & bVar4) * -2;
            uVar17 = uVar17 - 1;
            goto code_r0x0001801af4fb;
          }
          if (uVar13 == uVar12 + 0x1000) {
            bVar14 = cVar15 - 0x18;
            cVar16 = bVar4 + 0x90;
            goto code_r0x0001801af425;
          }
          if (uVar13 == uVar12 + 9) {
            bVar14 = cVar15 + bVar4 + 'x' + (bVar4 & cVar15 + 0x6cU) * -2;
            uVar13 = uVar13 + uVar12;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
            goto code_r0x0001801af4fb;
          }
          if (uVar13 == uVar12 + 0x61) {
            bVar14 = cVar15 + bVar4 + '`' + (bVar4 & cVar15 - 0x10U) * -2;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
            goto code_r0x0001801af4fb;
          }
          if (uVar13 == uVar12 + 10) {
            bVar14 = cVar15 + 0x74;
            cVar16 = bVar4 + 0x48;
            goto code_r0x0001801af488;
          }
          if (uVar13 == uVar12 + 0x7a) {
            bVar14 = bVar4 + 0x30 + cVar15 + (bVar4 & cVar15 - 8U) * -2;
            goto code_r0x0001801af4b3;
          }
          if (uVar13 == uVar12 + 0x10) {
            bVar14 = cVar15 + bVar4 + '\x18' + (bVar4 & cVar15 + 0x7cU) * -2;
            goto code_r0x0001801af4ef;
          }
          uVar11 = uVar12;
        } while (uVar13 == uVar12 + 0x41);
        uVar13 = uVar12 + 0x200;
        if (uVar13 < uVar12 + 0x225) {
          bVar14 = bVar4 + cVar15 + 0x46U + '\x16' + (bVar4 & cVar15 + 0x46U) * -2;
          goto code_r0x0001801aeb5c;
        }
        uVar11 = uVar12 + 0x220;
        if (uVar13 < uVar12 + 0x608) {
          bVar14 = bVar4 + (cVar15 - 0x36U) + 'z' + (bVar4 & cVar15 - 0x36U) * -2;
          goto code_r0x0001801aeba0;
        }
        if (uVar13 < uVar12 + 0x226) {
          bVar14 = cVar15 + 0x4eU + (bVar4 - 0x22) + (cVar15 + 0x4eU & bVar4) * -2;
          uVar12 = uVar11;
          goto code_r0x0001801aebd7;
        }
        if (uVar13 < uVar12 + 0x620) {
          bVar14 = bVar4 + 0x42 + (cVar15 - 0x2eU) + (cVar15 - 0x2eU & bVar4) * -2;
          uVar12 = uVar11;
          goto code_r0x0001801aec40;
        }
        if (uVar13 < uVar12 + 0x228) break;
        if (uVar13 < uVar12 + 0x1220) {
          bVar14 = cVar15 - 0x26;
          cVar16 = bVar4 - 0x1c;
          uVar12 = uVar11;
          goto code_r0x0001801af03c;
        }
        if (uVar13 < uVar12 + 0x229) {
          bVar14 = cVar15 + 0x5e;
          cVar16 = bVar4 - 0x34;
          uVar12 = uVar11;
          goto code_r0x0001801aeffd;
        }
        if (uVar13 < uVar12 + 0x281) {
          bVar14 = cVar15 - 0x1e;
          cVar16 = bVar4 + 0xb4;
          uVar12 = uVar11;
          goto code_r0x0001801aefc4;
        }
        if (uVar13 < uVar12 + 0x22a) {
          bVar14 = cVar15 + bVar4 + -100 + (bVar4 & cVar15 + 0x66U) * -2;
          uVar12 = uVar11;
          goto code_r0x0001801aefa7;
        }
        if (uVar12 + 0x29a <= uVar13) {
          uVar13 = uVar12 + 0x2a0;
          uVar11 = uVar12 + 0x2b0;
          if (uVar12 + 0x2b4 < uVar13) {
            bVar14 = cVar15 + bVar4 + -0x20 + (bVar4 & cVar15 + 0x30U) * -2;
            uVar12 = uVar11;
            goto code_r0x0001801af4ef;
          }
          if (uVar12 + 0x4b0 < uVar13) {
            bVar14 = (bVar4 - 0x38) + cVar15 + (bVar4 & cVar15 + 0xb4U) * -2;
            uVar12 = uVar11;
            goto code_r0x0001801af4b3;
          }
          if (uVar12 + 0x2b5 < uVar13) {
            bVar14 = cVar15 + 0x38;
            cVar16 = bVar4 + 0xb0;
            uVar12 = uVar11;
            goto code_r0x0001801af488;
          }
          if (uVar12 + 0x698 < uVar13) {
            bVar14 = cVar15 + bVar4 + -0x68 + (bVar4 & cVar15 + 0xbcU) * -2;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
            uVar12 = uVar11;
            goto code_r0x0001801af4fb;
          }
          if (uVar12 + 0x2b6 < uVar13) {
            bVar14 = cVar15 + bVar4 + -0x80 + (bVar4 & cVar15 + 0x40U) * -2;
            uVar13 = uVar13 + uVar11;
            uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
            uVar12 = uVar11;
            goto code_r0x0001801af4fb;
          }
          if (uVar12 + 0x6b0 < uVar13) {
            bVar14 = cVar15 - 0x3c;
            cVar16 = bVar4 + 0x68;
            uVar12 = uVar11;
            goto code_r0x0001801af425;
          }
          if (uVar12 + 0x2b8 < uVar13) {
            bVar14 = cVar15 + bVar4 + 'P' + (cVar15 + 0x48U & bVar4) * -2;
            uVar17 = uVar17 - 1;
            uVar12 = uVar11;
            goto code_r0x0001801af4fb;
          }
          uVar13 = uVar12 + 0x30a;
          uVar11 = uVar12 + 0x6f2;
        }
      }
      bVar14 = bVar4 + 0xa6 + cVar15 + 0x56U + (cVar15 + 0x56U & bVar4) * -2;
      uVar12 = uVar11;
    }
    if (uVar13 < uVar12 + 0x20) {
      bVar14 = cVar15 - 0x3e;
      cVar16 = bVar4 + 0x74;
code_r0x0001801af03c:
      bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801af042:
      if (uVar12 + uVar13 == 0x7a) {
        bVar14 = cVar15 + 0x54;
        cVar16 = cVar15 + '\b';
code_r0x0001801af48b:
        bVar14 = cVar16 + (bVar14 & bVar4) * -2;
        bVar3 = bVar4 + 0x7c + (cVar15 + 0x16U & bVar4) * -2 + cVar15;
        abStack_1b8[uVar17] = bVar3;
        uVar17 = (uVar17 - (uVar12 + 1)) - (ulonglong)bVar3;
        uVar12 = uVar12 + 1;
code_r0x0001801af4b3:
        abStack_1b8[uVar17] = (char)uVar17 + -0x10 + bVar4 + ((char)uVar17 - 0x28U & bVar4) * -2;
        uVar13 = uVar13 + 1;
        uVar17 = uVar17 + ~uVar13;
        goto code_r0x0001801af4ef;
      }
      if (uVar12 + 0x80 < uVar13) {
        bVar14 = cVar15 + 0x3a;
        cVar16 = bVar4 + 0xa4;
code_r0x0001801aeffd:
        bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
code_r0x0001801af003:
        if (uVar13 < 0x61) {
          if (uVar12 + 100 < uVar13) {
            bVar14 = cVar15 + 0x24;
            cVar16 = bVar4 + 0x28;
code_r0x0001801aefc4:
            bVar14 = cVar16 + cVar15 + (bVar4 & bVar14) * -2;
          }
          else {
            if (uVar13 == uVar12 + 1) {
              bVar14 = cVar15 + 0xa8;
              cVar15 = cVar15 + bVar4 + '\x10';
              goto code_r0x0001801af4e7;
            }
            if (uVar13 == uVar12 + 2) {
              bVar14 = cVar15 + 0xb0;
              cVar16 = bVar4 - 0x20;
code_r0x0001801af488:
              cVar16 = cVar16 + cVar15;
              goto code_r0x0001801af48b;
            }
            if (uVar13 == uVar12 + 3) {
              bVar14 = cVar15 + 0x3c;
              cVar16 = bVar4 + 0x98;
              goto code_r0x0001801af425;
            }
            if (uVar13 == uVar12 + 4) {
              bVar14 = cVar15 + bVar4 + 'h' + (cVar15 + 0x44U & bVar4) * -2;
              uVar12 = uVar12 + 1;
              uVar17 = uVar17 - 1;
              goto code_r0x0001801af4fb;
            }
          }
          if (3 < uVar12) {
            bVar14 = (bVar4 + 0x38 + cVar15 + (cVar15 + 0x4cU & bVar4) * -2) * '\x02';
            goto code_r0x0001801af3d8;
          }
code_r0x0001801aefa7:
          abStack_1b8[uVar17] = bVar14;
        }
        else {
          bVar14 = bVar4 * '\x02' + cVar15 + (cVar15 - 0x30U & bVar4) * -2 + ' ';
code_r0x0001801af430:
          abStack_1b8[uVar17] = bVar4 + (cVar15 + 0x92U & bVar4) * -2 + -0x6c + cVar15 + bVar14;
          uVar13 = uVar13 + uVar12;
          uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
        }
      }
      else if (uVar13 == uVar12 + 1) {
        bVar14 = cVar15 + 0xbe;
        cVar16 = bVar4 + 0x8c;
code_r0x0001801af3cd:
        bVar14 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801af3d8:
        abStack_1b8[uVar17] = bVar4 + 0xac + (cVar15 + 0xeU & bVar4) * -2 + cVar15;
        uVar12 = uVar12 + 1;
        uVar17 = uVar17 - 1;
      }
      else if (uVar13 == uVar12 + 3) {
        bVar14 = cVar15 + bVar4 + '\\' + (cVar15 - 0x3aU & bVar4) * -2;
        uVar17 = uVar17 - 1;
      }
      else if (uVar13 == uVar12 + 2) {
        bVar14 = cVar15 + bVar4 + ',' + (cVar15 - 0x32U & bVar4) * -2;
        uVar13 = uVar13 + uVar12;
        uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
      }
      else {
        if (uVar13 != uVar12 + 5) goto code_r0x0001801af003;
        bVar14 = cVar15 + 0x52;
code_r0x0001801af461:
        cVar15 = cVar15 + bVar4 + '\x14';
code_r0x0001801af469:
        bVar14 = cVar15 + (bVar14 & bVar4) * -2;
        uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
      }
    }
    else {
      if (uVar13 != uVar12 + 1) {
        if (uVar13 == uVar12 + 4) {
          bVar14 = cVar15 + bVar4 + -0x58 + (cVar15 - 0x1cU & bVar4) * -2;
          uVar13 = uVar13 + uVar12;
          uVar17 = (uVar17 - 1) - (ulonglong)bVar14;
        }
        else {
          if (uVar13 == uVar12 + 5) {
            bVar14 = cVar15 + 0x68;
            cVar16 = bVar4 + 0x90;
code_r0x0001801af425:
            bVar14 = cVar16 + cVar15 + (bVar14 & bVar4) * -2;
            goto code_r0x0001801af430;
          }
          if (uVar13 == uVar12 + 3) {
            bVar14 = cVar15 + bVar4 + 'x' + (cVar15 - 0x14U & bVar4) * -2;
            uVar17 = uVar17 - 1;
          }
          else {
            if (uVar13 != uVar12 + 2) goto code_r0x0001801af042;
            bVar14 = cVar15 + bVar4 + '`' + (cVar15 + 0x70U & bVar4) * -2;
            uVar12 = uVar12 + 1;
            uVar17 = uVar17 - 1;
          }
        }
        goto code_r0x0001801af4fb;
      }
      bVar14 = cVar15 - 0x2c;
      cVar15 = cVar15 + bVar4 + '\b';
code_r0x0001801af4e7:
      bVar14 = cVar15 + (bVar14 & bVar4) * -2;
code_r0x0001801af4ef:
      uVar17 = uVar17 + abStack_1b8[uVar17] + uVar12;
    }
code_r0x0001801af4fb:
    uVar17 = uVar17 + 1;
  } while( true );
}

