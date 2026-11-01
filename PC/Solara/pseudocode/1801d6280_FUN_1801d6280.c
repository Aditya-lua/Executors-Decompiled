/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_1801d6280(byte *param_1,undefined8 param_2,undefined8 param_3,byte *param_4)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  code *pcVar9;
  byte bVar10;
  byte bVar11;
  uint uVar12;
  byte *pbVar13;
  byte *pbVar14;
  longlong lVar15;
  ulonglong *puVar16;
  undefined8 uVar17;
  byte *pbVar18;
  undefined8 uVar19;
  undefined8 *puVar20;
  byte *pbVar21;
  byte *pbVar22;
  ulonglong uVar23;
  ulonglong uVar24;
  byte *pbVar25;
  ulonglong uVar26;
  ulonglong *puVar27;
  longlong lVar28;
  byte bVar29;
  char cVar30;
  char cVar31;
  int iVar32;
  int iVar33;
  uint uVar34;
  ulonglong unaff_RDI;
  undefined8 uVar35;
  undefined8 uVar36;
  ulonglong uVar37;
  byte *in_R10;
  undefined7 uVar39;
  undefined8 uVar38;
  byte *in_R11;
  byte *unaff_R12;
  byte *unaff_R13;
  undefined8 uVar40;
  byte in_AF;
  bool bVar41;
  byte in_TF;
  byte in_IF;
  byte in_NT;
  byte in_AC;
  byte in_VIF;
  byte in_VIP;
  byte in_ID;
  undefined1 uStack0000000000000000;
  int iStack_4ac;
  undefined1 auStack_408 [8];
  undefined1 auStack_400 [24];
  undefined8 uStack_3e8;
  byte abStack_3d8 [32];
  byte abStack_3b8 [48];
  byte abStack_388 [32];
  byte *pbStack_368;
  byte abStack_358 [32];
  longlong lStack_338;
  byte abStack_328 [32];
  byte abStack_308 [32];
  byte abStack_2e8 [32];
  byte *pbStack_2c8;
  byte *pbStack_2c0;
  longlong lStack_2b8;
  longlong lStack_2b0;
  longlong lStack_2a8;
  longlong lStack_2a0;
  longlong lStack_298;
  longlong lStack_290;
  longlong lStack_288;
  longlong lStack_280;
  longlong lStack_278;
  ulonglong auStack_270 [9];
  undefined2 uStack_228;
  undefined6 uStack_226;
  undefined8 uStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  uint uStack_1e8;
  undefined4 uStack_1e4;
  undefined8 uStack_1e0;
  undefined1 uStack_1d8;
  undefined7 uStack_1d7;
  undefined8 uStack_1c8;
  ulonglong uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined1 auStack_188 [32];
  undefined1 auStack_168 [32];
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined4 uStack_118;
  undefined4 uStack_114;
  undefined4 uStack_110;
  undefined4 uStack_10c;
  uint uStack_108;
  undefined4 uStack_104;
  undefined4 uStack_100;
  undefined4 uStack_fc;
  undefined1 auStack_f8 [32];
  undefined1 auStack_d8 [32];
  undefined1 auStack_b8 [32];
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  ulonglong auStack_80 [2];
  undefined8 uStack_70;
  ulonglong uStack_68;
  undefined1 auStack_4b [3];
  ulonglong uStack_48;
  byte abStack_40 [8];
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_408;
  pbVar18 = (byte *)0x0;
  pbStack_368 = param_1;
  auStack_270[8] = param_2;
  if (&uStack0000000000000000 == (undefined1 *)0x0) {
    (*(code *)0xfffffffffffffe68)();
    (*(code *)0x0)();
  }
  param_1[0x48] = 0;
  pbVar13 = (byte *)FUN_1801d5120(*(longlong *)param_1);
  pbStack_2c8 = pbVar13;
  pbVar14 = (byte *)FUN_1801d4460(*(longlong *)param_1);
  pbStack_2c0 = pbVar14;
  if (*(longlong *)(param_1 + 0x10) == 0) {
    uStack_3e8 = CONCAT44(uStack_3e8._4_4_,4);
    param_4 = (byte *)0x3000;
    lVar15 = VirtualAllocEx(pbVar13,0,0x50);
    *(longlong *)(param_1 + 0x10) = lVar15;
    if (lVar15 == 0) {
LAB_1801da948:
      FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_408);
      return;
    }
  }
  if (*(longlong *)(param_1 + 0x28) == 0) {
    lVar15 = FUN_1801c0c40(param_1,pbVar13,pbVar14);
    *(longlong *)(param_1 + 0x28) = lVar15;
  }
  auStack_270[0] = 0;
  auStack_270[1] = 0;
  auStack_270[2] = 0;
  auStack_270[3] = 0;
  FUN_180191ab0(auStack_270,&UNK_180f47cc0,8);
  if (*(longlong *)(param_1 + 8) != 0) {
    LOCK();
    piVar1 = (int *)(*(longlong *)(param_1 + 8) + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_2b0 = *(longlong *)param_1;
  lStack_2a8 = *(longlong *)(param_1 + 8);
  FUN_18026ecd0(auStack_80,&lStack_2b0,auStack_270);
  puVar27 = (ulonglong *)auStack_408;
  if (0xf < auStack_270[3]) {
    if (auStack_270[3] + 1 < 0x1000) {
      lVar15 = 1;
      uVar26 = auStack_270[0];
    }
    else {
      uVar26 = *(ulonglong *)(auStack_270[0] - 8);
      uVar23 = auStack_270[3];
      if (0x1f < (auStack_270[0] - uVar26) - 8) goto LAB_1801da979;
      lVar15 = 0x28;
    }
    func_0x000180e15340(uVar26,auStack_270[3] + lVar15);
  }
  auStack_270[2] = 0;
  auStack_270[3] = 0xf;
  auStack_270[0] = auStack_270[0] & 0xffffffffffffff00;
  if (*(longlong *)(param_1 + 8) != 0) {
    LOCK();
    piVar1 = (int *)(*(longlong *)(param_1 + 8) + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_2a0 = *(longlong *)param_1;
  lStack_298 = *(longlong *)(param_1 + 8);
  lStack_338 = FUN_1801d0cf0(&lStack_2a0,auStack_80,10);
  if (*(longlong *)(param_1 + 8) != 0) {
    LOCK();
    piVar1 = (int *)(*(longlong *)(param_1 + 8) + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_290 = *(longlong *)param_1;
  lStack_288 = *(longlong *)(param_1 + 8);
  lStack_2b8 = FUN_1801d0cf0(&lStack_290,0x1810bc6e8,10);
  abStack_308[0] = 0x81;
  abStack_308[1] = 0xba;
  abStack_308[2] = 0xb6;
  abStack_308[3] = 0xb8;
  abStack_308[4] = 0xce;
  abStack_308[5] = 0x5d;
  abStack_308[6] = 0;
  abStack_308[7] = 0;
  abStack_308[8] = 0;
  abStack_308[9] = 0;
  abStack_308[10] = 0;
  abStack_308[0xb] = 0;
  abStack_308[0xc] = 0;
  abStack_308[0xd] = 0;
  abStack_308[0xe] = 0;
  abStack_308[0xf] = 0;
  abStack_308[0x10] = 0;
  abStack_308[0x11] = 0;
  abStack_308[0x12] = 0;
  abStack_308[0x13] = 0;
  abStack_308[0x14] = 0;
  abStack_308[0x15] = 0;
  bVar29 = abStack_3d8[0];
code_r0x0001801d64b7:
  puVar27 = (ulonglong *)auStack_408;
  puVar16 = (ulonglong *)func_0x000180b36780();
  pbVar18 = (byte *)*puVar16;
  puVar16 = (ulonglong *)func_0x000180b36790();
  pbVar21 = (byte *)*puVar16;
code_r0x0001801d64f0:
  in_R10 = (byte *)0x0;
  pbVar22 = pbVar21;
  pbVar25 = pbVar18;
  while( true ) {
    pbVar14 = (byte *)0x4142d201bd2733e3;
    unaff_R12 = (byte *)0xa4ea107b57563e0b;
    pbVar13 = (byte *)0x8b16f2f86bd3aff9;
    unaff_R13 = abStack_308;
    if ((byte *)0x15 < in_R10) break;
    bVar11 = abStack_308[(longlong)in_R10];
    in_R11 = in_R10 + -0x74e90d07942c5007;
    pbVar13 = in_R10 + -0x78cca5e1d5ece919;
    cVar30 = (char)in_R10;
    pbVar14 = in_R10 + -0x5b15ef84a8a9c1f5;
    unaff_R12 = in_R10 + -0x8914ef4f1854833;
code_r0x0001801d6520:
    if (in_R10 < pbVar25) {
      unaff_R13 = (byte *)((longlong)register0x00000020 + 0xc7ea67);
      break;
    }
    if (pbVar22 + 1 <= pbVar25) {
      if (pbVar25 == pbVar22 + 1) {
        bVar29 = cVar30 + 0x21;
        cVar30 = cVar30 + bVar11 + ':';
        goto code_r0x0001801d6e37;
      }
      if (pbVar25 == pbVar22 + 2) {
        bVar29 = cVar30 + 0x4d;
        cVar31 = bVar11 + 0x32;
        goto code_r0x0001801d6ddb;
      }
      if (pbVar25 == pbVar22 + 7) {
        bVar29 = cVar30 + bVar11 + '\"' + (bVar11 & cVar30 + 0xa5U) * -2;
        in_R10 = in_R10 + -1;
      }
      else {
        if (pbVar25 != pbVar22 + 3) {
          if (pbVar25 != pbVar22 + 5) goto code_r0x0001801d6590;
          bVar29 = cVar30 - 0x2f;
          cVar31 = bVar11 + 0x1a;
          goto code_r0x0001801d6d5b;
        }
        bVar29 = cVar30 + bVar11 + -0x62 + (bVar11 & cVar30 + 0xbbU) * -2;
        pbVar22 = pbVar22 + 1;
        in_R10 = in_R10 + -1;
      }
      goto code_r0x0001801d6e4e;
    }
    bVar29 = (bVar11 & (byte)pbVar14) * -2 + -0x4d + bVar11 + (byte)pbVar14;
code_r0x0001801d6590:
    if (in_R10 < pbVar22) {
      unaff_R13 = (byte *)((longlong)register0x00000020 + 0x171ac5c);
      break;
    }
    if (pbVar25 < pbVar22 + 0x400) {
      bVar29 = bVar11 + 0xaf + (byte)pbVar13 + (bVar11 & (byte)pbVar13) * -2;
    }
    else {
      if (pbVar25 == pbVar22 + 1) {
        bVar29 = cVar30 - 3;
        cVar31 = bVar11 + 0x12;
        goto code_r0x0001801d6d5b;
      }
      if (pbVar25 == pbVar22 + 2) {
        bVar29 = cVar30 + bVar11 + -0x72 + (bVar11 & cVar30 + 0x13U) * -2;
        pbVar22 = pbVar22 + 1;
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d6e4e;
      }
      if (pbVar25 == pbVar22 + 3) {
        bVar29 = cVar30 + bVar11 + '\n' + (bVar11 & cVar30 + 0x29U) * -2;
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d6e4e;
      }
      if (pbVar25 == pbVar22 + 7) {
        bVar29 = cVar30 + 0xad;
        cVar30 = cVar30 + bVar11 + -0xe;
        goto code_r0x0001801d6e37;
      }
    }
    while( true ) {
      pbVar21 = pbVar22;
      if (pbVar22 + (longlong)pbVar25 <= in_R10) break;
      while( true ) {
        do {
          pbVar22 = pbVar21;
          if (pbVar25 == pbVar22 + 9) {
            bVar29 = cVar30 + 0xba;
            cVar31 = bVar11 + 0xa4;
            goto code_r0x0001801d6d5b;
          }
          pbVar18 = pbVar22 + 0x41;
          if (pbVar25 == pbVar18) {
            bVar29 = cVar30 + bVar11 + ' ' + (bVar11 & cVar30 - 0x30U) * -2;
            pbVar22 = pbVar22 + 1;
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar25 == pbVar22 + 0x40) {
            bVar29 = cVar30 + bVar11 + -100 + (bVar11 & cVar30 - 0x1aU) * -2;
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar25 == pbVar22 + 0x28) {
            bVar29 = cVar30 - 4;
            cVar31 = bVar11 + 0x18;
            goto code_r0x0001801d6cac;
          }
          if (pbVar25 == pbVar22 + 2) {
            bVar29 = cVar30 + bVar11 + -0x6c + (cVar30 + 0x12U & bVar11) * -2;
            pbVar25 = pbVar25 + (longlong)pbVar22;
            in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
            goto code_r0x0001801d6e4e;
          }
          if (pbVar25 == pbVar22 + 0x200) {
            bVar29 = cVar30 + bVar11 + '\x10' + (cVar30 + 0x28U & bVar11) * -2;
            in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
            goto code_r0x0001801d6e4e;
          }
          if (pbVar25 == pbVar22 + 8) {
            bVar29 = cVar30 + 0x3e;
            cVar31 = bVar11 + 0x8c;
            goto code_r0x0001801d6ddb;
          }
          if (pbVar25 == pbVar22 + 6) {
            bVar29 = bVar11 + 8 + cVar30 + (cVar30 + 0x54U & bVar11) * -2;
            goto code_r0x0001801d6e06;
          }
          param_4 = pbVar22 + 0x61;
          if (pbVar25 == param_4) {
            bVar29 = cVar30 + bVar11 + -0x7c + (cVar30 + 0x6aU & bVar11) * -2;
            goto code_r0x0001801d6e42;
          }
          pbVar21 = pbVar22;
        } while (pbVar25 == pbVar22 + 0x20);
        if (pbVar18 < pbVar22 + 0x91) {
          bVar29 = bVar11 + cVar30 + 0xa1U + -0x67 + (bVar11 & cVar30 + 0xa1U) * -2;
          goto code_r0x0001801d64b7;
        }
        pbVar21 = pbVar22 + 0x51;
        if (pbVar18 < pbVar22 + 0x79) {
          bVar29 = bVar11 + cVar30 + 0xb7U + -1 + (bVar11 & cVar30 + 0xb7U) * -2;
          goto code_r0x0001801d64f0;
        }
        pbVar25 = pbVar18;
        if (pbVar18 < pbVar22 + 0x53) {
          bVar29 = bVar11 + 0x65 + (byte)unaff_R12 + (bVar11 & (byte)unaff_R12) * -2;
          pbVar22 = pbVar21;
          goto code_r0x0001801d6520;
        }
        if (pbVar18 < pbVar22 + 0x251) {
          bVar29 = (bVar11 - 0x35) + (cVar30 - 0x1dU) + (bVar11 & cVar30 - 0x1dU) * -2;
          pbVar22 = pbVar21;
          goto code_r0x0001801d6590;
        }
        if (pbVar18 < pbVar22 + 0x59) break;
        if (pbVar18 < pbVar22 + 0x57) {
          bVar29 = cVar30 + 0xf;
          cVar31 = bVar11 + 0xa6;
          pbVar22 = pbVar21;
          goto code_r0x0001801d69aa;
        }
        if (pbVar18 < pbVar22 + 0xb2) {
          bVar29 = cVar30 + 0x25;
          cVar31 = bVar11 + 0x22;
          pbVar22 = pbVar21;
          goto code_r0x0001801d6968;
        }
        if (pbVar18 < pbVar22 + 0x71) {
          bVar29 = cVar30 + 0x3b;
          cVar31 = bVar11 + 0x9e;
          pbVar22 = pbVar21;
          goto code_r0x0001801d692d;
        }
        if (pbVar18 < param_4) {
          bVar29 = cVar30 + bVar11 + '\x1a' + (cVar30 + 0x51U & bVar11) * -2;
          pbVar22 = pbVar21;
          goto code_r0x0001801d6913;
        }
        if (pbVar22 + 0x7b <= pbVar18) {
          pbVar25 = pbVar22 + 0x54;
          pbVar21 = pbVar22 + 0xb8;
          if (pbVar22 + 0xba < pbVar25) {
            bVar29 = cVar30 + bVar11 + -0x30 + (cVar30 + 0x88U & bVar11) * -2;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6e42;
          }
          param_4 = pbVar22 + 0x2b8;
          if (param_4 < pbVar25) {
            bVar29 = bVar11 + 0x4c + cVar30 + (cVar30 + 0x9eU & bVar11) * -2;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6e06;
          }
          if (pbVar22 + 0xc0 < pbVar25) {
            bVar29 = cVar30 + 0xb4;
            cVar31 = bVar11 - 0x38;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6ddb;
          }
          if (pbVar22 + 0xbe < pbVar25) {
            bVar29 = cVar30 + bVar11 + 'D' + (cVar30 - 0x36U & bVar11) * -2;
            in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
            pbVar22 = pbVar21;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar22 + 0x119 < pbVar25) {
            bVar29 = cVar30 + bVar11 + -0x40 + (cVar30 - 0x20U & bVar11) * -2;
            pbVar25 = pbVar25 + (longlong)pbVar21;
            in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
            pbVar22 = pbVar21;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar22 + 0xd8 < pbVar25) {
            bVar29 = cVar30 - 10;
            cVar31 = bVar11 + 0x3c;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6cac;
          }
          if (pbVar22 + 200 < pbVar25) {
            bVar29 = cVar30 + bVar11 + -0x48 + (bVar11 & cVar30 + 0xcU) * -2;
            in_R10 = in_R10 + -1;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar22 + 0xe2 < pbVar25) {
            bVar29 = cVar30 + bVar11 + '4' + (bVar11 & cVar30 + 0x22U) * -2;
            in_R10 = in_R10 + -1;
            pbVar22 = pbVar22 + 0xb9;
            goto code_r0x0001801d6e4e;
          }
          if (pbVar22 + 0x11c < pbVar25) {
            bVar29 = cVar30 + 0x38;
            cVar31 = bVar11 + 0xb0;
            pbVar22 = pbVar21;
            goto code_r0x0001801d6d5b;
          }
          if (pbVar25 <= pbVar22 + 0xbd) {
            pbVar21 = pbVar22 + 700;
            pbVar25 = param_4;
          }
        }
      }
      bVar29 = bVar11 + 0x31 + (byte)in_R11 + (bVar11 & (byte)in_R11) * -2;
      pbVar22 = pbVar21;
    }
    if (pbVar25 < pbVar22 + 0x61) {
      bVar29 = cVar30 + 0xb;
      cVar31 = bVar11 + 0xbe;
code_r0x0001801d69aa:
      bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
code_r0x0001801d69b0:
      if (pbVar22 + (longlong)pbVar25 == (byte *)0x1000) {
        bVar29 = cVar30 + 0x8e;
        cVar31 = cVar30 + -0x54;
code_r0x0001801d6dde:
        bVar29 = cVar31 + (bVar11 & bVar29) * -2;
        bVar10 = bVar11 + 0x6a + (cVar30 + 0x99U & bVar11) * -2 + cVar30;
        abStack_308[(longlong)in_R10] = bVar10;
        in_R10 = in_R10 + (-(ulonglong)bVar10 - (longlong)(pbVar22 + 1));
        pbVar22 = pbVar22 + 1;
code_r0x0001801d6e06:
        abStack_308[(longlong)in_R10] =
             (char)in_R10 + '(' + bVar11 + ((char)in_R10 + 0xa4U & bVar11) * -2;
        pbVar25 = pbVar25 + 1;
        in_R10 = in_R10 + ~(ulonglong)pbVar25;
        goto code_r0x0001801d6e42;
      }
      if (pbVar22 + 0x41 < pbVar25) {
        bVar29 = cVar30 + 0x9f;
        cVar31 = bVar11 + 0x46;
code_r0x0001801d6968:
        bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
code_r0x0001801d696e:
        if (pbVar25 < (byte *)0x2a) {
          if (pbVar22 + 0x28 < pbVar25) {
            bVar29 = cVar30 + 0x86;
            cVar31 = bVar11 - 0x24;
code_r0x0001801d692d:
            bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
          }
          else {
            if (pbVar25 == pbVar22 + 1) {
              bVar29 = cVar30 + 0x9c;
              cVar30 = cVar30 + bVar11 + 'X';
              goto code_r0x0001801d6e37;
            }
            if (pbVar25 == pbVar22 + 3) {
              bVar29 = cVar30 - 0x38;
              cVar31 = bVar11 + 0x50;
              goto code_r0x0001801d6ddb;
            }
            if (pbVar25 == pbVar22 + 2) {
              bVar29 = cVar30 + 0x4c;
              cVar31 = bVar11 + 0x38;
              goto code_r0x0001801d6d5b;
            }
          }
          if ((byte *)0x41 < pbVar22) {
            bVar29 = (bVar11 + 0x62 + cVar30 + (bVar11 & cVar30 + 0x62U) * -2) * '\x02' + 0xa4;
            goto code_r0x0001801d6d69;
          }
code_r0x0001801d6913:
          abStack_308[(longlong)in_R10] = bVar29;
        }
        else {
          bVar29 = cVar30 + 0x78;
          cVar31 = bVar11 * '\x02' + '0';
code_r0x0001801d6cac:
          bVar29 = cVar31 + cVar30 + (bVar11 & bVar29) * -2;
          abStack_308[(longlong)in_R10] =
               bVar11 + (cVar30 + 0x83U & bVar11) * -2 + -0x12 + cVar30 + bVar29;
          pbVar25 = pbVar25 + (longlong)pbVar22;
          in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
        }
      }
      else if (pbVar25 == pbVar22 + 1) {
        bVar29 = cVar30 + 0xb5;
        cVar31 = bVar11 - 0x3e;
code_r0x0001801d6d5b:
        bVar29 = cVar31 + cVar30 + (bVar11 & bVar29) * -2;
code_r0x0001801d6d69:
        abStack_308[(longlong)in_R10] = bVar11 + 0x72 + (cVar30 + 0x6dU & bVar11) * -2 + cVar30;
        in_R10 = in_R10 + -1;
        pbVar22 = pbVar22 + 1;
      }
      else if (pbVar25 == pbVar22 + 3) {
        bVar29 = cVar30 + bVar11 + -0x46 + (bVar11 & cVar30 - 0x1fU) * -2;
        in_R10 = in_R10 + -1;
      }
      else {
        if (pbVar25 != pbVar22 + 4) {
          if (pbVar25 != pbVar22 + 7) {
            if (pbVar25 == pbVar22 + 8) {
              bVar29 = cVar30 + 0x65;
              cVar30 = cVar30 + bVar11 + -0x5e;
              goto code_r0x0001801d6e37;
            }
            goto code_r0x0001801d696e;
          }
          bVar29 = cVar30 + 0x39;
          cVar31 = bVar11 + 0xaa;
code_r0x0001801d6ddb:
          cVar31 = cVar31 + cVar30;
          goto code_r0x0001801d6dde;
        }
        bVar29 = cVar30 + bVar11 + -0x4e + (bVar11 & cVar30 + 0xdU) * -2;
        pbVar25 = pbVar25 + (longlong)pbVar22;
        in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
      }
    }
    else {
      if (pbVar25 != pbVar22 + 1) {
        if (pbVar25 != pbVar22 + 2) {
          if (pbVar25 == pbVar22 + 3) {
            bVar29 = cVar30 + bVar11 + '\x1c' + (bVar11 & cVar30 + 0x26U) * -2;
            pbVar25 = pbVar25 + (longlong)pbVar22;
            in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
          }
          else {
            if (pbVar25 != pbVar22 + 7) {
              if (pbVar25 != pbVar22 + 8) goto code_r0x0001801d69b0;
              bVar29 = cVar30 + 0x7e;
              cVar31 = bVar11 + 0xc;
              goto code_r0x0001801d6d5b;
            }
            bVar29 = cVar30 + bVar11 + -0x70 + (bVar11 & cVar30 + 0x68U) * -2;
            pbVar22 = pbVar22 + 1;
            in_R10 = in_R10 + -1;
          }
          goto code_r0x0001801d6e4e;
        }
        bVar29 = bVar11 + 0xa8 + cVar30 + (bVar11 & cVar30 - 0x1cU) * -2;
        goto code_r0x0001801d6e06;
      }
      bVar29 = cVar30 - 0x32;
      cVar30 = cVar30 + bVar11 + ',';
code_r0x0001801d6e37:
      bVar29 = cVar30 + (bVar11 & bVar29) * -2;
code_r0x0001801d6e42:
      in_R10 = in_R10 + (longlong)(pbVar22 + abStack_308[(longlong)in_R10]);
    }
code_r0x0001801d6e4e:
    in_R10 = in_R10 + 1;
  }
  auStack_270[4] = 0;
  auStack_270[5] = 0;
  unaff_RDI = 0;
  auStack_270[6] = 0;
  auStack_270[7] = 0;
  uVar17 = FUN_180f29c00(unaff_R13);
  FUN_180191ab0(auStack_270 + 4,unaff_R13,uVar17);
  param_1 = pbStack_368;
  if (*(longlong *)(pbStack_368 + 8) != 0) {
    LOCK();
    piVar1 = (int *)(*(longlong *)(pbStack_368 + 8) + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_280 = *(longlong *)pbStack_368;
  lStack_278 = *(longlong *)(pbStack_368 + 8);
  pbVar18 = (byte *)FUN_1801d0cf0(&lStack_280,auStack_270 + 4,10);
  if (0xf < auStack_270[7]) {
    if (auStack_270[7] + 1 < 0x1000) {
      lVar15 = 1;
      uVar26 = auStack_270[4];
    }
    else {
      uVar23 = auStack_270[4] - *(ulonglong *)(auStack_270[4] - 8);
      uVar26 = auStack_270[7];
      if (0x1f < uVar23 - 8) {
LAB_1801da979:
        puVar20 = (undefined8 *)0x5;
        pcVar9 = (code *)swi(0x29);
        (*pcVar9)();
        puVar27[3] = (ulonglong)pbVar18;
        puVar27[4] = (ulonglong)pbVar13;
        *puVar27 = unaff_RDI;
        if (puVar27 == (ulonglong *)0xfffffffffffffff8) {
          uRamffffffffffffff90 = 0x1801da9a3;
          (*(code *)0xffffffffffffffe0)();
          uRamffffffffffffff90 = 0x1801da9a7;
          (*(code *)0x0)();
        }
        uVar17 = *puVar20;
        puVar27[-0xd] = 0x1801da9af;
        uVar19 = FUN_1801d5120();
        if (puVar20[3] != 0) {
          uVar17 = puVar20[3];
          puVar27[-0xd] = 0x1801dab07;
          FUN_180b18700(puVar20 + 0xd,uVar17);
          *(undefined1 *)(puVar20 + 9) = 1;
          return;
        }
        puVar27[-0xd] = 0;
        puVar27[-0xe] =
             (ulonglong)(in_NT & 1) * 0x4000 | (ulonglong)(in_IF & 1) * 0x200 |
             (ulonglong)(in_TF & 1) * 0x100 | 0x40 | (ulonglong)(in_AF & 1) * 0x10 | 4 |
             (ulonglong)(in_ID & 1) * 0x200000 | (ulonglong)(in_VIP & 1) * 0x100000 |
             (ulonglong)(in_VIF & 1) * 0x80000 | (ulonglong)(in_AC & 1) * 0x40000;
        puVar27[-0xf] = (ulonglong)in_R11;
        puVar27[-0x10] = 0x1435a5e7;
        puVar27[-0x10] = uVar26;
        puVar27[-0x11] = 0x47e;
        uVar35 = puVar27[-0x10];
        LOCK();
        uVar3 = puVar27[-0xf];
        puVar27[-0xf] = puVar27[-0x11];
        UNLOCK();
        puVar27[-0x10] = 0x4ce430af;
        puVar27[-0x10] = 0x37ee6fb5;
        puVar27[-0x10] = 0xc07d400;
        puVar27[-0x10] = 0x32f82;
        puVar27[-0x11] = (ulonglong)puVar20;
        LOCK();
        uVar36 = puVar27[-0x11];
        puVar27[-0x11] = 0x7b0e133f;
        UNLOCK();
        puVar27[-0x11] = uVar17;
        puVar27[-0x11] = uVar19;
        puVar27[-0x12] = (ulonglong)param_1;
        LOCK();
        uVar2 = puVar27[-0x12];
        puVar27[-0x12] = 0x117059a1;
        UNLOCK();
        puVar27[-0x12] = (ulonglong)param_4;
        puVar27[-0x12] = (ulonglong)pbVar18;
        puVar27[-0x13] = 0x3bda737c;
        puVar27[-0x13] = 0x3464e4a5;
        puVar27[-0x13] = uVar2;
        uVar7 = puVar27[-0x13];
        puVar27[-0x13] = 0x66042930;
        puVar27[-0x13] = uVar7;
        puVar27[-0x13] = uVar19;
        uVar8 = puVar27[-0x13];
        puVar27[-0x13] = uVar7;
        puVar27[-0x13] = puVar27[-0x10];
        puVar27[-0x14] = uVar17;
        uVar38 = puVar27[-0x14];
        puVar27[-0x10] = puVar27[-0xe];
        uVar17 = puVar27[-0x13];
        puVar27[-0x13] = (ulonglong)unaff_R13;
        puVar27[-0x14] = 0xd8cb439;
        puVar27[-0x14] = 0x28;
        *(undefined8 *)((longlong)puVar27 + puVar27[-0x14] + -0x98) = uVar17;
        uVar40 = puVar27[-0x13];
        uVar19 = puVar27[-0x12];
        uVar17 = puVar27[-0x11];
        puVar27[-0x11] = 0x4d458a2;
        puVar27[-0x11] = 0x67c9f6fc;
        puVar27[-0x11] = (ulonglong)unaff_R12;
        puVar27[-0x11] = uVar17;
        puVar27[-0x12] = (ulonglong)pbVar14;
        LOCK();
        uVar2 = puVar27[-0x12];
        puVar27[-0x12] = 0x2bcbcd86;
        UNLOCK();
        puVar27[-0x12] = 0x4dc161e9;
        puVar27[-0x12] = uVar38;
        puVar27[-0x13] = uVar8;
        puVar27[-0x13] = (ulonglong)unaff_R12;
        puVar27[-0x13] = uVar23;
        puVar27[-0x14] = uVar35;
        puVar27[-0x14] = (ulonglong)unaff_R12;
        LOCK();
        uVar17 = puVar27[-0x14];
        puVar27[-0x14] = 0x578dbb65;
        UNLOCK();
        puVar27[-0x14] = uVar19;
        puVar27[-0x15] = 0x15203e3f;
        puVar27[-0x15] = 0x3b8f3275;
        puVar27[-0x15] = uVar19;
        puVar27[-0x16] = 0x7db5758;
        puVar27[-0x16] = (ulonglong)in_R10;
        puVar27[-0x16] = uVar19;
        puVar27[-0x16] = (ulonglong)param_4;
        puVar27[-0x16] = (ulonglong)abStack_308;
        puVar27[-0x17] = 0x4e2b5acd;
        puVar27[-0x17] = 0x59621dd6;
        puVar27[-0x17] = uVar23;
        puVar27[-0x17] = uVar8;
        puVar27[-0x18] = uVar40;
        puVar27[-0x18] = uVar3;
        puVar27[-0x18] = uVar2;
        puVar27[-0x18] = uVar36;
        puVar27[-0x19] = (ulonglong)abStack_308;
        puVar27[-0x1a] = (ulonglong)param_4;
        puVar27[-0x1b] = 0x8cf5f9e;
        LOCK();
        puVar27[-0x19] = puVar27[-0x1b];
        UNLOCK();
        puVar27[-0x19] = uVar2;
        puVar27[-0x1a] = puVar27[-0x1a];
        puVar27[-0x1b] = uVar35;
        uVar35 = puVar27[-0x1b];
        LOCK();
        uVar19 = puVar27[-0x1a];
        puVar27[-0x1a] = 0x56573176;
        UNLOCK();
        puVar27[-0x1a] = uVar38;
        puVar27[-0x1a] = uVar7;
        puVar27[-0x1b] = 0x5f9f83b3;
        puVar27[-0x1b] = uVar17;
        LOCK();
        uVar17 = puVar27[-0x1b];
        puVar27[-0x1b] = 0xed935a7;
        UNLOCK();
        puVar27[-0x1b] = (ulonglong)in_R10;
        puVar27[-0x1b] = uVar40;
        puVar27[-0x1c] = 0x1f1e71ab;
        puVar27[-0x1c] = uVar38;
        puVar27[-0x1d] = (ulonglong)in_R10;
        uVar38 = puVar27[-0x1d];
        LOCK();
        puVar27[-0x1c] = 0x433a1fee;
        UNLOCK();
        puVar27[-0x1c] = uVar17;
        puVar27[-0x1d] = 0x4ea8640d;
        puVar27[-0x1d] = uVar3;
        puVar27[-0x1e] = 0x5e4651a5;
        puVar27[-0x1e] = 0x2fbaeb5b;
        puVar27[-0x1e] = 0x2220dfaa;
        puVar27[-0x1e] = uVar38;
        puVar27[-0x1f] = 0x41ce75cb;
        puVar27[-0x1f] = uVar2;
        puVar27[-0x1f] = uVar17;
        puVar27[-0x1f] = uVar7;
        puVar27[-0x1f] = uVar19;
        puVar27[-0x20] = 0x387bdd2b;
        puVar27[-0x20] = 0x551b2458;
        puVar27[-0x20] = uVar35;
        puVar27[-0x21] = 0x1808ab06f;
        lVar15 = puVar27[-0x21];
        uVar12 = 0x2e07c0;
        puVar27[-0x21] = uVar3;
        puVar27[-0x22] = uVar8;
        puVar27[-0x22] = 0x2e07c0;
        puVar27[-0x22] = *(undefined8 *)(puVar27[-0x22] + lVar15 + -0x8ab06f);
        lVar28 = puVar27[-0x22];
        uVar2 = puVar27[-0x21];
        puVar27[-0x21] = 0x522c209e;
        puVar27[-0x21] = uVar35;
        puVar27[-0x21] = lVar28;
        uVar36 = puVar27[-0x21];
        *(undefined4 *)((longlong)puVar27 + -0x104) = 0x1000;
        uVar26 = (ulonglong)*(uint *)((longlong)puVar27 + -0x104);
        *(undefined4 *)((longlong)puVar27 + -0x104) = 0x1fc;
        uVar4 = *(uint *)((longlong)puVar27 + -0x104);
        *(undefined4 *)((longlong)puVar27 + -0x104) = 1;
        uVar5 = *(uint *)((longlong)puVar27 + -0x104);
        do {
          *(undefined4 *)((longlong)puVar27 + -0x104) = 0x20;
          uVar34 = *(uint *)((longlong)puVar27 + -0x104);
          do {
            puVar27[-0x21] = uVar35;
            puVar27[-0x22] = (ulonglong)uVar34;
            puVar27[-0x22] = uVar19;
            *(uint *)((longlong)puVar27 + -0x114) = uVar12;
            *(uint *)((longlong)puVar27 + -0x114) =
                 ~uVar12 & *(uint *)((longlong)puVar27 + -0x114) |
                 ~*(uint *)((longlong)puVar27 + -0x114) & uVar12;
            uVar6 = *(uint *)((longlong)puVar27 + -0x114);
            uVar19 = puVar27[-0x22];
            uVar35 = puVar27[-0x21];
            LOCK();
            uVar12 = *(uint *)((ulonglong)uVar4 + lVar28);
            bVar41 = uVar6 == uVar12;
            if (bVar41) {
              *(uint *)((ulonglong)uVar4 + lVar28) = uVar5;
              uVar12 = uVar6;
            }
            UNLOCK();
            if (bVar41) {
              puVar27[-0x21] = lVar15 + -0x8ab06f;
              uVar17 = puVar27[-0x21];
              *(undefined4 *)((longlong)puVar27 + -0x104) = 0x210;
              puVar27[-0x21] = uVar36;
              puVar27[-0x22] = lVar28;
              uVar26 = puVar27[-0x22];
              puVar27[-0x22] = uVar19;
              puVar27[-0x23] = (ulonglong)*(uint *)((longlong)puVar27 + -0x104);
              uVar19 = puVar27[-0x22];
              *(undefined8 *)-((~uVar26 + 1) - puVar27[-0x23]) = uVar17;
              *(undefined4 *)((longlong)puVar27 + -0x104) = 0x220;
              puVar27[-0x21] = lVar28;
              puVar27[-0x22] = uVar19;
              puVar27[-0x23] = (ulonglong)*(uint *)((longlong)puVar27 + -0x104);
              puVar27[-0x24] = 0x180000000;
              uVar26 = puVar27[-0x23];
              uVar3 = puVar27[-0x22];
              uVar23 = puVar27[-0x21];
              puVar27[-0x21] = uVar40;
              puVar27[-0x22] = uVar35;
              puVar27[-0x23] = uVar23;
              uVar37 = puVar27[-0x23];
              puVar27[-0x23] = uVar7;
              uVar19 = puVar27[-0x22];
              *(ulonglong *)((uVar23 | uVar26) + ~(~uVar37 | ~uVar26)) = puVar27[-0x24];
              uVar36 = puVar27[-0x21];
              *(undefined4 *)((longlong)puVar27 + -0x104) = 0x1d8;
              puVar27[-0x21] = (ulonglong)uVar34;
              puVar27[-0x22] = uVar23;
              uVar26 = puVar27[-0x22];
              puVar27[-0x22] = 0x2054099c;
              puVar27[-0x22] = uVar36;
              puVar27[-0x23] = uVar26;
              lVar15 = *(longlong *)
                        ((uVar26 | *(uint *)((longlong)puVar27 + -0x104)) +
                        (puVar27[-0x23] & (ulonglong)*(uint *)((longlong)puVar27 + -0x104)));
              puVar27[-0x21] = uVar2;
              puVar27[-0x22] = 0x421db5b4;
              puVar27[-0x22] = 0x98;
              lVar28 = *(longlong *)((longlong)puVar27 + puVar27[-0x22] + -0x108);
              *(longlong *)(uVar23 + 0x208) = lVar15 + lVar28;
              lVar15 = *(longlong *)(uVar23 + 0x1f0);
              puVar27[-0x21] = lVar28;
              puVar27[-0x22] = 0x8a3bfe7;
              puVar27[-0x22] = puVar27[-0xf] << 3;
              lVar28 = puVar27[-0x22];
              uVar36 = puVar27[-0x21];
              puVar27[-0x21] = uVar17;
              puVar27[-0x22] = lVar28;
                    /* WARNING: Could not recover jumptable at 0x0001808ab3b5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (**(code **)((lVar15 - lVar28) + puVar27[-0x22] * 2))
                        (puVar27[-0x21],uVar36,uVar19,uVar3);
              return;
            }
            puVar27[-0x21] = uVar38;
            puVar27[-0x22] = uVar40;
            puVar27[-0x23] = 0x715b6d22;
            puVar27[-0x23] = uVar17;
            uVar17 = puVar27[-0x23];
            uVar40 = puVar27[-0x22];
            lVar28 = (lVar28 - uVar26) + (~(~uVar26 + ~uVar26) - 1);
            uVar38 = puVar27[-0x21];
            uVar34 = uVar34 - 1;
          } while (uVar34 != 0);
          puVar27[-0x21] = uVar38;
          puVar27[-0x21] = uVar36;
          lVar28 = puVar27[-0x21];
        } while( true );
      }
      lVar15 = 0x28;
      uVar26 = *(ulonglong *)(auStack_270[4] - 8);
    }
    func_0x000180e15340(uVar26,lVar15 + auStack_270[7]);
  }
  pbVar13 = pbStack_2c8;
  auStack_270[6] = 0;
  auStack_270[7] = 0xf;
  auStack_270[4] = auStack_270[4] & 0xffffffffffffff00;
  uStack_228 = 0;
  uStack_200 = 0;
  uStack_1e4 = 0;
  uStack_1e0 = pbStack_2c0;
  uStack_220 = auStack_270[8];
  uStack_1e8 = uStack_1e8 & 0xffffff00;
  uStack_3e8 = 0;
  ReadProcessMemory(pbStack_2c8,lStack_2b8 + 0x10,&uStack_98,8);
  uStack_218 = uStack_98;
  uStack_208 = uRam00000001810bc6f8;
  uStack_3e8 = 0;
  ReadProcessMemory(pbVar13,pbVar18 + 0x10,&uStack_90,8);
  uStack_210 = uStack_90;
  uStack_3e8 = 0;
  ReadProcessMemory(pbVar13,lStack_338 + 0x10,&uStack_88,8);
  uStack_1f8 = uStack_88;
  uVar17 = uStack_1f8;
  uStack_1f0 = uStack_70;
  uVar19 = uStack_1f0;
  uStack_148 = CONCAT62(uStack_226,uStack_228);
  uStack_140 = uStack_220;
  uStack_138 = uStack_218;
  uStack_130 = uStack_210;
  uStack_128 = uStack_208;
  uStack_120 = uStack_200;
  uStack_1f8._0_4_ = (undefined4)uStack_88;
  uStack_1f8._4_4_ = (undefined4)((ulonglong)uStack_88 >> 0x20);
  uStack_1f0._0_4_ = (undefined4)uStack_70;
  uStack_1f0._4_4_ = (undefined4)((ulonglong)uStack_70 >> 0x20);
  uStack_118 = (undefined4)uStack_1f8;
  uStack_114 = uStack_1f8._4_4_;
  uStack_110 = (undefined4)uStack_1f0;
  uStack_10c = uStack_1f0._4_4_;
  uStack_108 = uStack_1e8;
  uStack_104 = uStack_1e4;
  uStack_100 = (undefined4)uStack_1e0;
  uStack_fc = uStack_1e0._4_4_;
  uStack_3e8 = 0;
  uVar36 = 0x50;
  puVar20 = &uStack_148;
  uStack_1f8 = uVar17;
  uStack_1f0 = uVar19;
  WriteProcessMemory();
  lVar15 = lRam00000001802e07c0;
  if (*(longlong *)(param_1 + 0x30) == 0) {
    LOCK();
    UNLOCK();
    LOCK();
    UNLOCK();
    LOCK();
    UNLOCK();
    LOCK();
    UNLOCK();
    LOCK();
    UNLOCK();
    LOCK();
    UNLOCK();
    do {
      iStack_4ac = 0x20;
      lVar28 = lVar15;
      do {
        LOCK();
        bVar41 = *(int *)(lVar28 + 0x1fc) == 0;
        if (bVar41) {
          *(int *)(lVar28 + 0x1fc) = 1;
        }
        UNLOCK();
        if (bVar41) {
          *(undefined8 *)(lVar28 + 0x210) = 0x180000000;
          *(undefined8 *)(lVar28 + 0x220) = 0x180000000;
          *(longlong *)(lVar28 + 0x208) = *(longlong *)(lVar28 + 0x1d8) + 0xe5ac;
                    /* WARNING: Could not recover jumptable at 0x0001803691fa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (**(code **)(~(~*(ulonglong *)(lVar28 + 0x1f0) - 0x23f1) - 1))
                    (0x180000000,0xe5ac,puVar20,uVar36);
          return;
        }
        lVar28 = lVar28 + 0x1000;
        iStack_4ac = iStack_4ac + -1;
      } while (iStack_4ac != 0);
    } while( true );
  }
  uVar17 = FUN_1801ac0d0(auStack_4b,*(longlong *)(param_1 + 0x30));
  param_4 = abStack_3d8;
  FUN_180199c30(&uStack_1d8,uVar17,auStack_4b);
  abStack_358[0] = 0x5d;
  abStack_358[1] = 0x87;
  abStack_358[2] = 0x7b;
  abStack_358[3] = 0x8f;
  abStack_358[4] = 0x6f;
  abStack_358[5] = 0x50;
  abStack_358[6] = 0x46;
  abStack_358[7] = 0x3f;
  abStack_358[8] = 0x1e;
  abStack_358[9] = 0;
  abStack_358[10] = 0;
  abStack_358[0xb] = 0;
  abStack_358[0xc] = 0;
  abStack_358[0xd] = 0;
  abStack_358[0xe] = 0;
  abStack_358[0xf] = 0;
  abStack_358[0x10] = 0;
  abStack_358[0x11] = 0;
  abStack_358[0x12] = 0;
  abStack_358[0x13] = 0;
  abStack_358[0x14] = 0;
  abStack_358[0x15] = 0;
  abStack_358[0x16] = 0;
  unaff_R13 = abStack_358;
  unaff_RDI = (ulonglong)abStack_3d8[0];
code_r0x0001801d731b:
  puVar27 = (ulonglong *)auStack_408;
  puVar16 = (ulonglong *)func_0x000180b36780();
  pbVar18 = (byte *)*puVar16;
  puVar16 = (ulonglong *)func_0x000180b36790();
  pbVar21 = (byte *)*puVar16;
code_r0x0001801d7353:
  in_R10 = (byte *)0x0;
  pbVar25 = pbVar21;
  while( true ) {
    pbVar14 = (byte *)0xaf48557647f6a9b;
    param_1 = (byte *)0x127f2cbb2d4d753f;
    unaff_R12 = (byte *)0x2573c52d7c0fe103;
    pbVar13 = (byte *)0x55dc0fb25c9f2ca1;
    if ((byte *)0x16 < in_R10) break;
    bVar29 = abStack_358[(longlong)in_R10];
    in_R11 = in_R10 + 0x55dc0fb25c9f2ca1;
    pbVar13 = in_R10 + 0x127f2cbb2d4d753f;
    param_1 = in_R10 + 0xaf48557647f6a9b;
    pbVar14 = in_R10 + 0x2573c52d7c0fe103;
    unaff_R12 = in_R10 + -0x3ff3050393a0576b;
code_r0x0001801d7383:
    if (in_R10 < pbVar18) {
      unaff_R13 = (byte *)((longlong)register0x00000020 + 0x13b0baf);
      break;
    }
    cVar30 = (char)in_R10;
    iVar33 = (int)in_R10;
    if (pbVar25 + 1 <= pbVar18) {
      if (pbVar18 != pbVar25 + 1) {
        if (pbVar18 == pbVar25 + 3) {
          bVar11 = cVar30 + 0x15;
          uVar26 = (ulonglong)(bVar29 + 0x82);
          goto code_r0x0001801d7c2b;
        }
        if (pbVar18 == pbVar25 + 2) {
          bVar11 = cVar30 + 0x21;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + ':');
          goto code_r0x0001801d7c03;
        }
        if (pbVar18 != pbVar25 + 7) {
          if (pbVar18 != pbVar25 + 9) goto code_r0x0001801d73f0;
          bVar11 = cVar30 + 0x39;
          uVar26 = (ulonglong)(bVar29 + 0xaa);
          goto code_r0x0001801d7ba7;
        }
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0xe + (bVar29 & cVar30 + 0x2dU) * -2);
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d7ca4;
      }
      bVar11 = cVar30 + 9;
      uVar26 = (ulonglong)
               CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + -0x36);
      goto code_r0x0001801d7c8d;
    }
    iVar32 = (uint)(bVar29 & (byte)pbVar14) * 0xfe;
    unaff_RDI = (ulonglong)
                CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + -0x15 + bVar29 + (byte)pbVar14);
code_r0x0001801d73f0:
    if (in_R10 < pbVar25) {
      unaff_R13 = (byte *)((longlong)register0x00000020 + 0x16b2aac);
      break;
    }
    if (pbVar18 < pbVar25 + 0x42) {
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(bVar29 + 0x47 >> 8),
                           (char)(bVar29 + 0x47) + (byte)pbVar13 + (bVar29 & (byte)pbVar13) * -2);
    }
    else {
      if (pbVar18 == pbVar25 + 1) {
        bVar11 = cVar30 + 0x45;
        uVar26 = (ulonglong)(bVar29 + 0x62);
        goto code_r0x0001801d7ba7;
      }
      if (pbVar18 == pbVar25 + 2) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + '\x1a' + (bVar29 & cVar30 + 0x51U) * -2
                            );
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d7ca4;
      }
      if (pbVar18 == pbVar25 + 3) {
        bVar11 = cVar30 + 0x5d;
        uVar26 = (ulonglong)
                 CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + -0x2e);
        goto code_r0x0001801d7c03;
      }
      if (pbVar18 == pbVar25 + 7) {
        bVar11 = cVar30 + 0x69;
        uVar26 = (ulonglong)(bVar29 + 0x8a);
        goto code_r0x0001801d7c2b;
      }
      if (pbVar18 == pbVar25 + 5) {
        bVar11 = cVar30 + 0x75;
        uVar26 = (ulonglong)
                 CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'B');
        goto code_r0x0001801d7c8d;
      }
    }
    while (pbVar21 = pbVar25, in_R10 < pbVar25 + (longlong)pbVar18) {
      while( true ) {
        do {
          pbVar25 = pbVar21;
          if (pbVar18 == pbVar25 + 5) {
            bVar11 = cVar30 + 0x4a;
            uVar26 = (ulonglong)(bVar29 + 0x44);
            goto code_r0x0001801d7ba7;
          }
          if (pbVar18 == pbVar25 + 0x61) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + ' ' +
                                 (bVar29 & cVar30 + 0x50U) * -2);
            pbVar25 = pbVar25 + 1;
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar18 == pbVar25 + 3) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + -4 + (bVar29 & cVar30 + 0x56U) * -2
                                );
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar18 == pbVar25 + 0x10) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(bVar29 + 0xd8 >> 8),
                                 (char)(bVar29 + 0xd8) + cVar30 + (bVar29 & cVar30 + 0x5cU) * -2);
            goto code_r0x0001801d7b04;
          }
          if (pbVar18 == pbVar25 + 1) {
            bVar11 = cVar30 + 0x62;
            uVar26 = (ulonglong)
                     CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                              (char)(iVar33 + (uint)bVar29) + -0x4c);
            goto code_r0x0001801d7c03;
          }
          if (pbVar18 == pbVar25 + 9) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + -0x70 +
                                 (bVar29 & cVar30 + 0x68U) * -2);
            in_R10 = in_R10 + (-1 - (unaff_RDI & 0xff));
            goto code_r0x0001801d7ca4;
          }
          param_4 = pbVar25 + 100;
          if (pbVar18 == param_4) {
            bVar11 = cVar30 + 0x6e;
            uVar26 = (ulonglong)(bVar29 + 0x6c);
            goto code_r0x0001801d7c2b;
          }
          if (pbVar18 == pbVar25 + 0x7a) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(bVar29 + 0x48 >> 8),
                                 (char)(bVar29 + 0x48) + cVar30 + (bVar29 & cVar30 + 0x74U) * -2);
            goto code_r0x0001801d7c5c;
          }
          if (pbVar18 == pbVar25 + 0x40) {
            bVar11 = cVar30 + 0x7a;
            uVar26 = (ulonglong)
                     CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + '$'
                             );
            goto code_r0x0001801d7c8d;
          }
          pbVar21 = pbVar25;
        } while (pbVar18 == pbVar25 + 0x1000);
        pbVar18 = pbVar25 + 0x20;
        uVar39 = (undefined7)((ulonglong)in_R10 >> 8);
        if (pbVar18 < pbVar25 + 0x24) {
          iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 + 0x89U);
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)((uint)iVar33 >> 8),
                               (char)iVar33 + 'A' + (bVar29 & cVar30 + 0x89U) * -2);
          goto code_r0x0001801d731b;
        }
        pbVar21 = pbVar25 + 0x22;
        if (pbVar18 < pbVar25 + 0x2c) {
          iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 + 0x8fU);
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)((uint)iVar33 >> 8),
                               (char)iVar33 + '\x17' + (bVar29 & cVar30 + 0x8fU) * -2);
          goto code_r0x0001801d7353;
        }
        if (pbVar18 < pbVar25 + 0xa2) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(bVar29 + 0xed >> 8),
                               (char)(bVar29 + 0xed) + (byte)unaff_R12 +
                               (bVar29 & (byte)unaff_R12) * -2);
          pbVar25 = pbVar21;
          goto code_r0x0001801d7383;
        }
        if (pbVar18 < pbVar25 + 99) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(bVar29 + 0xc3 >> 8),
                               (char)(bVar29 + 0xc3) + (byte)param_1 + (bVar29 & (byte)param_1) * -2
                              );
          pbVar25 = pbVar21;
          goto code_r0x0001801d73f0;
        }
        if (pbVar18 < param_4) break;
        if (pbVar18 < pbVar25 + 0x83) {
          bVar11 = cVar30 + 0xa7;
          iVar32 = bVar29 + 0x16;
          pbVar25 = pbVar21;
          goto code_r0x0001801d7823;
        }
        if (pbVar18 < pbVar25 + 0x25) {
          bVar11 = cVar30 + 0xad;
          iVar32 = bVar29 + 0xf2;
          pbVar25 = pbVar21;
          goto code_r0x0001801d77e4;
        }
        if (pbVar18 < pbVar25 + 0x422) {
          bVar11 = cVar30 + 0xb3;
          iVar33 = bVar29 + 0xce;
          pbVar25 = pbVar21;
          goto code_r0x0001801d77a2;
        }
        if (pbVar18 < pbVar25 + 0x23) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + -0x56 +
                               (bVar29 & cVar30 + 0xb9U) * -2);
          pbVar25 = pbVar21;
          goto code_r0x0001801d7785;
        }
        if (pbVar25 + 0x2b <= pbVar18) {
          pbVar18 = pbVar25 + 0x7c;
          pbVar21 = pbVar25 + 0xe0;
          if (pbVar25 + 0x144 < pbVar18) {
            bVar11 = cVar30 - 0x38;
            uVar26 = (ulonglong)
                     CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'P'
                             );
            pbVar25 = pbVar21;
            goto code_r0x0001801d7c8d;
          }
          if (pbVar25 + 0x15a < pbVar18) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(bVar29 + 0x2c >> 8),
                                 (char)(bVar29 + 0x2c) + cVar30 + (bVar29 & cVar30 - 0x32U) * -2);
            pbVar25 = pbVar21;
            goto code_r0x0001801d7c5c;
          }
          if (pbVar25 + 0xe4 < pbVar18) {
            bVar11 = cVar30 - 0x2c;
            uVar26 = (ulonglong)(bVar29 + 8);
            pbVar25 = pbVar21;
            goto code_r0x0001801d7c2b;
          }
          if (pbVar25 + 0x100 < pbVar18) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + -0x1c +
                                 (bVar29 & cVar30 - 0x26U) * -2);
            in_R10 = in_R10 + (-1 - (unaff_RDI & 0xff));
            pbVar25 = pbVar21;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar25 + 0xe2 < pbVar18) {
            bVar11 = cVar30 - 0x20;
            uVar26 = (ulonglong)
                     CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                              (char)(iVar33 + (uint)bVar29) + -0x40);
            pbVar25 = pbVar21;
            goto code_r0x0001801d7c03;
          }
          if (pbVar25 + 0xea < pbVar18) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(bVar29 + 0x9c >> 8),
                                 (char)(bVar29 + 0x9c) + cVar30 + (bVar29 & cVar30 - 0x1aU) * -2);
            pbVar25 = pbVar21;
            goto code_r0x0001801d7b04;
          }
          if (pbVar25 + 0x160 < pbVar18) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + 'x' +
                                 (bVar29 & cVar30 - 0x14U) * -2);
            in_R10 = in_R10 + -1;
            pbVar25 = pbVar21;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar25 + 0xe8 < pbVar18) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + 'T' + (bVar29 & cVar30 - 0xeU) * -2
                                );
            in_R10 = in_R10 + -1;
            pbVar25 = pbVar25 + 0xe1;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar25 + 0x122 < pbVar18) {
            bVar11 = cVar30 - 8;
            uVar26 = (ulonglong)(bVar29 + 0x30);
            pbVar25 = pbVar21;
            goto code_r0x0001801d7ba7;
          }
          if (pbVar18 <= pbVar25 + 0x141) {
            pbVar18 = pbVar25 + 0x108;
            pbVar21 = pbVar25 + 0x130;
          }
        }
      }
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(bVar29 + 0x99 >> 8),
                           (char)(bVar29 + 0x99) + (byte)in_R11 + (bVar29 & (byte)in_R11) * -2);
      pbVar25 = pbVar21;
    }
    if (pbVar18 < pbVar25 + 0x20) {
      bVar11 = cVar30 + 3;
      iVar32 = bVar29 + 0xee;
code_r0x0001801d7823:
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + cVar30 + (bVar29 & bVar11) * -2)
      ;
code_r0x0001801d7829:
      if (pbVar25 + (longlong)pbVar18 == (byte *)0x200) {
        bVar11 = cVar30 + 0x3e;
        uVar26 = (ulonglong)(iVar33 + 0x8c);
code_r0x0001801d7c2e:
        unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + (bVar29 & bVar11) * -2);
        bVar11 = bVar29 + 0x7a + (cVar30 + 0x41U & bVar29) * -2 + cVar30;
        abStack_358[(longlong)in_R10] = bVar11;
        in_R10 = in_R10 + (-(ulonglong)bVar11 - (longlong)(pbVar25 + 1));
        pbVar25 = pbVar25 + 1;
code_r0x0001801d7c5c:
        abStack_358[(longlong)in_R10] =
             (char)in_R10 + 'h' + bVar29 + ((char)in_R10 + 0x44U & bVar29) * -2;
        pbVar18 = pbVar18 + 1;
        in_R10 = in_R10 + ~(ulonglong)pbVar18;
        goto code_r0x0001801d7c98;
      }
      if (pbVar25 + 9 < pbVar18) {
        bVar11 = cVar30 + 0xb7;
        iVar32 = bVar29 + 0xb6;
code_r0x0001801d77e4:
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)((uint)iVar32 >> 8),
                             (char)iVar32 + cVar30 + (bVar29 & bVar11) * -2);
code_r0x0001801d77ea:
        if ((byte *)0x4 < pbVar18) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)((uint)bVar29 * 2 >> 8),
                               (char)((uint)bVar29 * 2) + cVar30 + (bVar29 & cVar30 + 0x38U) * -2 +
                               -0x50);
          goto code_r0x0001801d7b04;
        }
        if (pbVar25 + 0x61 < pbVar18) {
          bVar11 = cVar30 - 10;
          iVar33 = bVar29 + 0x3c;
code_r0x0001801d77a2:
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)((uint)iVar33 >> 8),
                               (char)iVar33 + cVar30 + (bVar29 & bVar11) * -2);
        }
        else {
          if (pbVar18 == pbVar25 + 1) {
            bVar11 = cVar30 - 4;
            uVar26 = (ulonglong)
                     CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                              (char)(iVar33 + (uint)bVar29) + '\x18');
            goto code_r0x0001801d7c8d;
          }
          if (pbVar18 == pbVar25 + 2) {
            bVar11 = cVar30 + 8;
            uVar26 = (ulonglong)(bVar29 + 0xd0);
code_r0x0001801d7c2b:
            uVar26 = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30);
            goto code_r0x0001801d7c2e;
          }
          if (pbVar18 == pbVar25 + 5) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + '\x1c' +
                                 (bVar29 & cVar30 + 0x26U) * -2);
            pbVar25 = pbVar25 + 1;
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d7ca4;
          }
          if (pbVar18 == pbVar25 + 6) {
            bVar11 = cVar30 + 0x2c;
            uVar26 = (ulonglong)(bVar29 + 0xf8);
            goto code_r0x0001801d7ba7;
          }
        }
        if ((byte *)0x3e7 < pbVar25) {
          unaff_RDI = (ulonglong)
                      (uint)(CONCAT31((int3)(bVar29 + 0xd4 >> 8),
                                      (char)(bVar29 + 0xd4) + cVar30 +
                                      (bVar29 & cVar30 + 0x32U) * -2) * 2);
          goto code_r0x0001801d7bb5;
        }
code_r0x0001801d7785:
        abStack_358[(longlong)in_R10] = (byte)unaff_RDI;
      }
      else {
        if (pbVar18 == pbVar25 + 1) {
          bVar11 = cVar30 + 0xbd;
          uVar26 = (ulonglong)(bVar29 + 0x92);
          goto code_r0x0001801d7ba7;
        }
        if (pbVar18 == pbVar25 + 2) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + 'J' + (bVar29 & cVar30 - 0x37U) * -2)
          ;
          in_R10 = in_R10 + -1;
        }
        else if (pbVar18 == pbVar25 + 3) {
          bVar11 = cVar30 - 0x2b;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                            (char)(iVar33 + (uint)bVar29) + '\x02');
code_r0x0001801d7c03:
          bVar29 = (char)uVar26 + (bVar29 & bVar11) * -2;
          unaff_RDI = CONCAT71((int7)(uVar26 >> 8),bVar29);
          pbVar18 = pbVar18 + (longlong)pbVar25;
          in_R10 = in_R10 + (-1 - (ulonglong)bVar29);
        }
        else {
          if (pbVar18 != pbVar25 + 5) goto code_r0x0001801d77ea;
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + -0x22 +
                               (bVar29 & cVar30 - 0x25U) * -2);
          in_R10 = in_R10 + (-1 - (unaff_RDI & 0xff));
        }
      }
    }
    else if (pbVar18 == pbVar25 + 1) {
      bVar11 = cVar30 + 0x7e;
      uVar26 = (ulonglong)
               CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + '\f');
code_r0x0001801d7c8d:
      unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + (bVar29 & bVar11) * -2);
code_r0x0001801d7c98:
      in_R10 = in_R10 + (longlong)(pbVar25 + abStack_358[(longlong)in_R10]);
    }
    else if (pbVar18 == pbVar25 + 6) {
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(bVar29 + 0x58 >> 8),
                           (char)(bVar29 + 0x58) + cVar30 + (bVar29 & cVar30 + 0x9cU) * -2);
code_r0x0001801d7b04:
      abStack_358[(longlong)in_R10] =
           bVar29 + (cVar30 + 0x3bU & bVar29) * -2 + -0x62 + cVar30 + (char)unaff_RDI;
      pbVar18 = pbVar18 + (longlong)pbVar25;
      in_R10 = in_R10 + (-1 - (unaff_RDI & 0xff));
    }
    else {
      if (pbVar18 == pbVar25 + 4) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + '\x10' + (bVar29 & cVar30 + 0xa8U) * -2
                            );
        pbVar25 = pbVar25 + 1;
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d7ca4;
      }
      if (pbVar18 != pbVar25 + 8) goto code_r0x0001801d7829;
      bVar11 = cVar30 + 0xae;
      uVar26 = (ulonglong)(bVar29 + 0xec);
code_r0x0001801d7ba7:
      unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30 + (bVar29 & bVar11) * -2);
code_r0x0001801d7bb5:
      abStack_358[(longlong)in_R10] = (bVar29 - 0x3e) + (cVar30 + 0x35U & bVar29) * -2 + cVar30;
      in_R10 = in_R10 + -1;
      pbVar25 = pbVar25 + 1;
    }
code_r0x0001801d7ca4:
    in_R10 = in_R10 + 1;
  }
  uVar17 = FUN_1801a9d10(auStack_f8,unaff_R13,&uStack_1d8);
  FUN_1801a4a90(uVar17);
  FUN_180195980(auStack_f8);
  if (0xf < uStack_1c0) {
    uVar37 = CONCAT71(uStack_1d7,uStack_1d8);
    if (uStack_1c0 + 1 < 0x1000) {
      lVar15 = 1;
    }
    else {
      uVar26 = *(ulonglong *)(uVar37 - 8);
      uVar23 = uStack_1c0;
      if (0x1f < (uVar37 - uVar26) - 8) goto LAB_1801da979;
      lVar15 = 0x28;
      uVar37 = uVar26;
    }
    func_0x000180e15340(uVar37,uStack_1c0 + lVar15);
  }
  pbVar18 = pbStack_368;
  uStack_1c8 = 0;
  uStack_1c0 = 0xf;
  uStack_1d8 = 0;
  FUN_180b1b170(pbStack_368 + 0x68,*(longlong *)(pbStack_368 + 0x30));
  cVar30 = FUN_1801dff80(pbVar18,5000);
  unaff_RDI = (ulonglong)abStack_3d8[0];
  if (cVar30 == '\0') {
    abStack_388[0] = 0xd5;
    abStack_388[1] = 0xff;
    abStack_388[2] = 0xf3;
    abStack_388[3] = 0xe7;
    abStack_388[4] = 0x88;
    abStack_388[5] = 0xf3;
    abStack_388[6] = 199;
    abStack_388[7] = 0xfe;
    abStack_388[8] = 0xf0;
    abStack_388[9] = 0xf8;
    abStack_388[10] = 0xfe;
    abStack_388[0xb] = 99;
    abStack_388[0xc] = 0;
    abStack_388[0xd] = 0;
    abStack_388[0xe] = 0;
    abStack_388[0xf] = 0;
    abStack_388[0x10] = 0;
    abStack_388[0x11] = 0;
    abStack_388[0x12] = 0;
    abStack_388[0x13] = 0;
    unaff_R13 = abStack_388;
code_r0x0001801d7e29:
    puVar16 = (ulonglong *)func_0x000180b36780();
    pbVar21 = (byte *)*puVar16;
    puVar16 = (ulonglong *)func_0x000180b36790();
    pbVar25 = (byte *)*puVar16;
code_r0x0001801d7e61:
    param_4 = (byte *)0x0;
    pbVar22 = pbVar25;
    pbVar18 = pbVar21;
    do {
      pbVar14 = (byte *)0x6ffe43fa8864f2a2;
      param_1 = (byte *)0x2797178018a4f67a;
      unaff_R12 = (byte *)0xdd505673d0696112;
      pbVar13 = (byte *)0x2a9ef0e22937b4c6;
      if ((byte *)0x13 < param_4) {
code_r0x0001801d8803:
        uStack_1b8 = 0;
        uStack_1b0 = 0;
        uStack_1a8 = 0;
        uStack_1a0 = 0;
        uVar17 = FUN_180f29c00(unaff_R13);
        FUN_180191ab0(&uStack_1b8,unaff_R13,uVar17);
        FUN_1801a4a90(&uStack_1b8);
        FUN_180195980(&uStack_1b8);
        pbVar18 = (byte *)((ulonglong)pbVar18 & 0xffffffffffffff00);
code_r0x0001801da8fa:
        if (0xf < uStack_68) {
          if (uStack_68 + 1 < 0x1000) {
            lVar15 = 1;
          }
          else {
            uVar26 = *(ulonglong *)(auStack_80[0] - 8);
            if (0x1f < (auStack_80[0] - uVar26) - 8) {
              pcVar9 = (code *)swi(0x29);
              (*pcVar9)(5);
              puVar27 = (ulonglong *)auStack_400;
              uVar23 = uStack_68;
              goto LAB_1801da979;
            }
            lVar15 = 0x28;
            auStack_80[0] = uVar26;
          }
          func_0x000180e15340(auStack_80[0],uStack_68 + lVar15);
        }
        goto LAB_1801da948;
      }
      bVar29 = abStack_388[(longlong)param_4];
      in_R11 = param_4 + 0x2a9ef0e22937b4c6;
      pbVar13 = param_4 + 0x2797178018a4f67a;
      param_1 = param_4 + 0x6ffe43fa8864f2a2;
      pbVar14 = param_4 + -0x22afa98c2f969eee;
      unaff_R12 = param_4 + -0x4aa268ed186dcf82;
code_r0x0001801d7e91:
      if (param_4 < pbVar18) {
        unaff_R13 = (byte *)((longlong)register0x00000020 + 0x13695a2);
        goto code_r0x0001801d8803;
      }
      cVar30 = (char)param_4;
      iVar33 = (int)param_4;
      if (pbVar18 < pbVar22 + 1) {
        iVar32 = (uint)(bVar29 & (byte)pbVar14) * 0xfe;
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + -0x7e + bVar29 + (byte)pbVar14
                            );
code_r0x0001801d7f00:
        if (param_4 < pbVar22) {
          unaff_R13 = (byte *)((longlong)register0x00000020 + 0x14d3490);
          goto code_r0x0001801d8803;
        }
        if (pbVar22 + 4 <= pbVar18) {
          if (pbVar18 != pbVar22 + 1) {
            if (pbVar18 == pbVar22 + 2) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                   (char)(iVar33 + (uint)bVar29) + -100 +
                                   (cVar30 - 0x1aU & bVar29) * -2);
              param_4 = param_4 + -1;
            }
            else {
              if (pbVar18 == pbVar22 + 3) {
                bVar11 = cVar30 + 10;
                uVar26 = (ulonglong)(bVar29 + 0xc4);
                goto code_r0x0001801d8618;
              }
              if (pbVar18 != pbVar22 + 5) goto code_r0x0001801d7f60;
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                   (char)(iVar33 + (uint)bVar29) + '\x14' +
                                   (cVar30 + 0x52U & bVar29) * -2);
              param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
            }
            goto code_r0x0001801d8761;
          }
          bVar11 = cVar30 + 0x9e;
          uVar26 = (ulonglong)(bVar29 + 0x4c);
          goto code_r0x0001801d8684;
        }
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(bVar29 + 0xaa >> 8),
                             (char)(bVar29 + 0xaa) + (byte)pbVar13 + (bVar29 & (byte)pbVar13) * -2);
code_r0x0001801d7f60:
        while( true ) {
          pbVar25 = pbVar22;
          if (pbVar22 + (longlong)pbVar18 <= param_4) break;
          while( true ) {
            do {
              pbVar22 = pbVar25;
              if (pbVar18 == pbVar22 + 2) {
                bVar11 = cVar30 + 0xbc;
                uVar26 = (ulonglong)(bVar29 + 0x98);
                goto code_r0x0001801d8684;
              }
              pbVar21 = pbVar22 + 1;
              if (pbVar18 == pbVar21) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + -0x40 +
                                     (cVar30 - 0x20U & bVar29) * -2);
                pbVar22 = pbVar22 + 1;
                param_4 = param_4 + -1;
                goto code_r0x0001801d8761;
              }
              in_R10 = pbVar22 + 10;
              if (pbVar18 == in_R10) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + -0x18 +
                                     (cVar30 + 4U & bVar29) * -2);
                param_4 = param_4 + -1;
                goto code_r0x0001801d8761;
              }
              if (pbVar18 == pbVar22 + 0x200) {
                bVar11 = cVar30 + 0x28;
                uVar26 = (ulonglong)(bVar29 + 0x10);
                goto code_r0x0001801d8618;
              }
              if (pbVar18 == pbVar22 + 0x2a) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + '8' +
                                     (cVar30 + 0x4cU & bVar29) * -2);
                pbVar18 = pbVar18 + (longlong)pbVar22;
                param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
                goto code_r0x0001801d8761;
              }
              if (pbVar18 == pbVar22 + 0x5a) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + '`' +
                                     (cVar30 + 0x70U & bVar29) * -2);
                param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
                goto code_r0x0001801d8761;
              }
              if (pbVar18 == pbVar22 + 8) {
                bVar11 = cVar30 + 0x94;
                uVar26 = (ulonglong)(bVar29 + 0x88);
                goto code_r0x0001801d86d3;
              }
              if (pbVar18 == pbVar22 + 100) {
                bVar11 = cVar30 + 0xb8;
                uVar26 = (ulonglong)(bVar29 + 0xb0);
                goto code_r0x0001801d8714;
              }
              if (pbVar18 == pbVar22 + 0x41) {
                bVar11 = cVar30 - 0x24;
                uVar26 = (ulonglong)
                         CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                  (char)(iVar33 + (uint)bVar29) + -0x28);
                goto code_r0x0001801d874d;
              }
              pbVar25 = pbVar22;
            } while (pbVar18 == pbVar22 + 0x7a);
            uVar39 = (undefined7)((ulonglong)param_4 >> 8);
            if (pbVar21 < pbVar22 + 0x10) {
              iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 + 0x36U);
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)((uint)iVar33 >> 8),
                                   (char)iVar33 + -0x7a + (bVar29 & cVar30 + 0x36U) * -2);
              goto code_r0x0001801d7e29;
            }
            pbVar25 = pbVar22 + 6;
            if (pbVar21 < pbVar22 + 0x206) {
              iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 + 0x5aU);
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)((uint)iVar33 >> 8),
                                   (char)iVar33 + -0x76 + (bVar29 & cVar30 + 0x5aU) * -2);
              goto code_r0x0001801d7e61;
            }
            pbVar18 = pbVar21;
            if (pbVar21 < pbVar22 + 0x86) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(bVar29 + 0x8e >> 8),
                                   (char)(bVar29 + 0x8e) + (byte)unaff_R12 +
                                   ((byte)unaff_R12 & bVar29) * -2);
              pbVar22 = pbVar25;
              goto code_r0x0001801d7e91;
            }
            if (pbVar21 < pbVar22 + 0x60) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(bVar29 + 0x92 >> 8),
                                   (char)(bVar29 + 0x92) + (byte)param_1 +
                                   ((byte)param_1 & bVar29) * -2);
              pbVar22 = pbVar25;
              goto code_r0x0001801d7f00;
            }
            if (pbVar21 < pbVar22 + 0xe) break;
            if (pbVar21 < pbVar22 + 0x6a) {
              bVar11 = cVar30 - 0x16;
              iVar32 = bVar29 + 0x84;
              pbVar22 = pbVar25;
              goto code_r0x0001801d82ee;
            }
            if (pbVar21 < pbVar22 + 0x48) {
              bVar11 = cVar30 + 0xe;
              iVar32 = bVar29 + 0xac;
              pbVar22 = pbVar25;
              goto code_r0x0001801d82b2;
            }
            if (pbVar21 < pbVar22 + 0x80) {
              bVar11 = cVar30 + 0x32;
              iVar33 = bVar29 + 0xd4;
              pbVar22 = pbVar25;
              goto code_r0x0001801d8279;
            }
            if (pbVar21 < pbVar22 + 0xb) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                   (char)(iVar33 + (uint)bVar29) + -4 +
                                   (cVar30 + 0x56U & bVar29) * -2);
              pbVar22 = pbVar25;
              goto code_r0x0001801d825f;
            }
            if (in_R10 <= pbVar21) {
              pbVar18 = pbVar22 + 0xf;
              pbVar25 = pbVar22 + 0x37;
              if (pbVar22 + 0xb7 < pbVar18) {
                bVar11 = cVar30 + 0xb0;
                uVar26 = (ulonglong)
                         CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                  (char)(iVar33 + (uint)bVar29) + -0x20);
                pbVar22 = pbVar25;
                goto code_r0x0001801d874d;
              }
              if (pbVar22 + 0x91 < pbVar18) {
                bVar11 = cVar30 - 0x2c;
                uVar26 = (ulonglong)(bVar29 + 8);
                pbVar22 = pbVar25;
                goto code_r0x0001801d8714;
              }
              if (pbVar22 + 0x78 < pbVar18) {
                bVar11 = cVar30 - 8;
                uVar26 = (ulonglong)(bVar29 + 0x30);
                pbVar22 = pbVar25;
                goto code_r0x0001801d86d3;
              }
              if (pbVar22 + 0x3d < pbVar18) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + 'X' +
                                     (cVar30 + 0x1cU & bVar29) * -2);
                param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
                pbVar22 = pbVar25;
                goto code_r0x0001801d8761;
              }
              if (pbVar22 + 0x79 < pbVar18) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + -0x80 +
                                     (cVar30 + 0x40U & bVar29) * -2);
                pbVar18 = pbVar18 + (longlong)pbVar25;
                param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
                pbVar22 = pbVar25;
                goto code_r0x0001801d8761;
              }
              if (pbVar22 + 0xb1 < pbVar18) {
                bVar11 = cVar30 + 100;
                uVar26 = (ulonglong)(bVar29 + 0xa8);
                pbVar22 = pbVar25;
                goto code_r0x0001801d8618;
              }
              if (pbVar22 + 0x98 < pbVar18) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + -0x30 +
                                     (cVar30 + 0x88U & bVar29) * -2);
                param_4 = param_4 + -1;
                pbVar22 = pbVar25;
                goto code_r0x0001801d8761;
              }
              if (pbVar22 + 0x3b < pbVar18) {
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                     (char)(iVar33 + (uint)bVar29) + -8 +
                                     (cVar30 + 0xacU & bVar29) * -2);
                param_4 = param_4 + -1;
                pbVar22 = pbVar22 + 0x38;
                goto code_r0x0001801d8761;
              }
              if (pbVar22 + 0x5f < pbVar18) {
                bVar11 = cVar30 - 0x30;
                uVar26 = (ulonglong)(bVar29 + 0x20);
                pbVar22 = pbVar25;
                goto code_r0x0001801d8684;
              }
              if (pbVar18 <= pbVar22 + 0x1037) {
                pbVar18 = pbVar22 + 0x9b;
                pbVar25 = pbVar22 + 0x49b;
              }
            }
          }
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(bVar29 + 0x96 >> 8),
                               (char)(bVar29 + 0x96) + (byte)in_R11 + ((byte)in_R11 & bVar29) * -2);
          pbVar22 = pbVar25;
        }
        if (pbVar18 < pbVar22 + 8) {
          bVar11 = cVar30 + 0x12;
          iVar32 = bVar29 + 0x94;
code_r0x0001801d82ee:
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)((uint)iVar32 >> 8),
                               (char)iVar32 + cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d82f4:
          if (pbVar22 + (longlong)pbVar18 != (byte *)0x64) {
            if (pbVar22 + 0x10 < pbVar18) {
              bVar11 = cVar30 + 0x4a;
              iVar32 = bVar29 + 0x44;
code_r0x0001801d82b2:
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)((uint)iVar32 >> 8),
                                   (char)iVar32 + cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d82b8:
              if ((byte *)0x79 < pbVar18) {
                bVar11 = cVar30 + 0x50;
                uVar26 = (ulonglong)((uint)bVar29 * 2 + 0x20);
code_r0x0001801d8618:
                bVar11 = (char)uVar26 + cVar30 + (bVar11 & bVar29) * -2;
                unaff_RDI = CONCAT71((int7)(uVar26 >> 8),bVar11);
                abStack_388[(longlong)param_4] =
                     bVar29 + (cVar30 + 0x62U & bVar29) * -2 + -0x4c + cVar30 + bVar11;
                pbVar18 = pbVar18 + (longlong)pbVar22;
                param_4 = param_4 + (-1 - (ulonglong)bVar11);
                goto code_r0x0001801d8761;
              }
              if (pbVar22 + 1 < pbVar18) {
                bVar11 = cVar30 - 0x3c;
                iVar33 = bVar29 + 0x68;
code_r0x0001801d8279:
                unaff_RDI = (ulonglong)
                            CONCAT31((int3)((uint)iVar33 >> 8),
                                     (char)iVar33 + cVar30 + (bVar11 & bVar29) * -2);
              }
              else {
                if (pbVar18 == pbVar22 + 1) {
                  unaff_RDI = (ulonglong)
                              CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                       (char)(iVar33 + (uint)bVar29) + -0x70 +
                                       (bVar29 & cVar30 - 0x18U) * -2);
                  goto code_r0x0001801d8755;
                }
                if (pbVar18 == pbVar22 + 2) {
                  bVar11 = cVar30 + 0xc;
                  uVar26 = (ulonglong)(bVar29 + 0xb8);
                  goto code_r0x0001801d8714;
                }
                if (pbVar18 == pbVar22 + 3) {
                  bVar11 = bVar29 & cVar30 + 0x30U;
                  uVar26 = (ulonglong)(bVar29 + 0xe0);
                  goto code_r0x0001801d86d6;
                }
                if (pbVar18 == pbVar22 + 4) {
                  unaff_RDI = (ulonglong)
                              CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                       (char)(iVar33 + (uint)bVar29) + -0x80 +
                                       (cVar30 - 0x40U & bVar29) * -2);
                  param_4 = param_4 + -1;
                  goto code_r0x0001801d8761;
                }
                if (pbVar18 == pbVar22 + 8) {
                  bVar11 = cVar30 + 8;
                  uVar26 = (ulonglong)(bVar29 + 0xd0);
                  goto code_r0x0001801d8684;
                }
              }
              if (pbVar22 < (byte *)0x4) {
code_r0x0001801d825f:
                abStack_388[(longlong)param_4] = (byte)unaff_RDI;
                goto code_r0x0001801d8761;
              }
              unaff_RDI = (ulonglong)
                          (uint)(CONCAT31((int3)(bVar29 + 0xf8 >> 8),
                                          (char)(bVar29 + 0xf8) + cVar30 +
                                          (cVar30 + 0x2cU & bVar29) * -2) * 2);
code_r0x0001801d868c:
              abStack_388[(longlong)param_4] =
                   bVar29 + 0x8c + (cVar30 + 0x3eU & bVar29) * -2 + cVar30;
              param_4 = param_4 + -1;
              pbVar22 = pbVar22 + 1;
              goto code_r0x0001801d8761;
            }
            if (pbVar18 == pbVar22 + 1) {
              bVar11 = cVar30 + 0x6e;
              uVar26 = (ulonglong)(bVar29 + 0x6c);
              goto code_r0x0001801d8684;
            }
            if (pbVar18 == pbVar22 + 2) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                   (char)(iVar33 + (uint)bVar29) + -0x6c +
                                   (bVar29 & cVar30 + 0x92U) * -2);
              pbVar22 = pbVar22 + 1;
              param_4 = param_4 + -1;
              goto code_r0x0001801d8761;
            }
            if (pbVar18 == pbVar22 + 4) {
              unaff_RDI = (ulonglong)
                          CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                   (char)(iVar33 + (uint)bVar29) + '\f' +
                                   (cVar30 - 2U & bVar29) * -2);
              pbVar18 = pbVar18 + (longlong)pbVar22;
              param_4 = param_4 + (-1 - (unaff_RDI & 0xff));
              goto code_r0x0001801d8761;
            }
            if (pbVar18 == pbVar22 + 3) {
              bVar11 = cVar30 + 0x46;
              uVar26 = (ulonglong)(bVar29 + 0x5c);
code_r0x0001801d86d3:
              bVar11 = bVar11 & bVar29;
              goto code_r0x0001801d86d6;
            }
            if (pbVar18 != pbVar22 + 7) goto code_r0x0001801d82b8;
            bVar11 = cVar30 + 0x6a;
            uVar26 = (ulonglong)(bVar29 + 0x84);
code_r0x0001801d8714:
            unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30 + (bVar11 & bVar29) * -2)
            ;
            goto code_r0x0001801d871c;
          }
          bVar11 = cVar30 + 0x74U & bVar29;
          uVar26 = (ulonglong)(iVar33 + 0x48);
        }
        else {
          if (pbVar18 == pbVar22 + 1) {
            unaff_RDI = (ulonglong)
                        CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                                 (char)(iVar33 + (uint)bVar29) + 'H' + (bVar29 & cVar30 - 0xcU) * -2
                                );
            goto code_r0x0001801d8755;
          }
          if (pbVar18 != pbVar22 + 2) {
            if (pbVar18 == pbVar22 + 3) {
              bVar11 = cVar30 + 0xa8;
              uVar26 = (ulonglong)(bVar29 + 0x10);
              goto code_r0x0001801d8618;
            }
            if (pbVar18 != pbVar22 + 9) goto code_r0x0001801d82f4;
            bVar11 = cVar30 + 0x14;
            uVar26 = (ulonglong)(bVar29 + 0x88);
code_r0x0001801d8684:
            unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30 + (bVar11 & bVar29) * -2)
            ;
            goto code_r0x0001801d868c;
          }
          bVar11 = bVar29 & cVar30 + 0x3cU;
          uVar26 = (ulonglong)(bVar29 + 0x98);
code_r0x0001801d86d6:
          uVar26 = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30);
        }
        unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + bVar11 * -2);
        bVar11 = (bVar29 - 0x24) + (cVar30 + 0x86U & bVar29) * -2 + cVar30;
        abStack_388[(longlong)param_4] = bVar11;
        pbVar22 = pbVar22 + 1;
        param_4 = param_4 + (-(ulonglong)bVar11 - (longlong)pbVar22);
code_r0x0001801d871c:
        abStack_388[(longlong)param_4] =
             (char)param_4 + 'p' + bVar29 + ((char)param_4 + 0x98U & bVar29) * -2;
        pbVar18 = pbVar18 + 1;
        param_4 = param_4 + ~(ulonglong)pbVar18;
        goto code_r0x0001801d8755;
      }
      if (pbVar18 != pbVar22 + 1) {
        if (pbVar18 == pbVar22 + 2) {
          bVar11 = cVar30 + 0x5a;
          uVar26 = (ulonglong)(bVar29 + 0xe4);
          goto code_r0x0001801d8714;
        }
        if (pbVar18 == pbVar22 + 3) {
          bVar11 = cVar30 + 0x7e;
          uVar26 = (ulonglong)(bVar29 + 0xc);
          goto code_r0x0001801d86d3;
        }
        if (pbVar18 != pbVar22 + 4) {
          if (pbVar18 != pbVar22 + 8) goto code_r0x0001801d7f00;
          bVar11 = cVar30 + 0x56;
          uVar26 = (ulonglong)(bVar29 + 0xfc);
          goto code_r0x0001801d8684;
        }
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x54 + (cVar30 + 0xeU & bVar29) * -2);
        param_4 = param_4 + -1;
        goto code_r0x0001801d8761;
      }
      bVar11 = cVar30 + 0x36;
      uVar26 = (ulonglong)
               CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + -0x44);
code_r0x0001801d874d:
      unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + (bVar11 & bVar29) * -2);
code_r0x0001801d8755:
      param_4 = param_4 + (longlong)(pbVar22 + abStack_388[(longlong)param_4]);
code_r0x0001801d8761:
      param_4 = param_4 + 1;
    } while( true );
  }
  abStack_328[0] = 0x6f;
  abStack_328[1] = 0x94;
  abStack_328[2] = 0x96;
  abStack_328[3] = 0x1b;
  abStack_328[4] = 0;
  abStack_328[5] = 0;
  abStack_328[6] = 0;
  abStack_328[7] = 0;
  abStack_328[8] = 0;
  abStack_328[9] = 0;
  abStack_328[10] = 0;
  abStack_328[0xb] = 0;
  abStack_328[0xc] = 0;
  abStack_328[0xd] = 0;
  abStack_328[0xe] = 0;
  abStack_328[0xf] = 0;
  abStack_328[0x10] = 0;
  abStack_328[0x11] = 0;
  abStack_328[0x12] = 0;
  abStack_328[0x13] = 0;
  abStack_328[0x14] = 0;
  abStack_328[0x15] = 0;
  abStack_328[0x16] = 0;
  abStack_328[0x17] = 0;
  abStack_328[0x18] = 0;
  abStack_328[0x19] = 0;
code_r0x0001801d886c:
  puVar16 = (ulonglong *)func_0x000180b36780();
  pbVar18 = (byte *)*puVar16;
  puVar16 = (ulonglong *)func_0x000180b36790();
  pbVar13 = (byte *)*puVar16;
code_r0x0001801d88b0:
  pbVar14 = pbVar13;
  for (in_R10 = (byte *)0x0; in_R10 < (byte *)0x1a; in_R10 = in_R10 + 1) {
    bVar29 = abStack_328[(longlong)in_R10];
    cVar30 = (char)in_R10;
code_r0x0001801d88d2:
    if (in_R10 < pbVar18) {
      pbVar18 = (byte *)((longlong)register0x00000020 + 0x5a930c);
      goto code_r0x0001801d92b2;
    }
    if (pbVar14 + 1 <= pbVar18) {
      if (pbVar18 != pbVar14 + 1) {
        if (pbVar18 == pbVar14 + 3) {
          bVar11 = cVar30 + 0x9c;
          cVar31 = bVar29 + 0x58;
          goto code_r0x0001801d9175;
        }
        if (pbVar18 == pbVar14 + 4) {
          bVar11 = cVar30 + 0xb4;
          cVar31 = bVar29 - 0x38;
          goto code_r0x0001801d9135;
        }
        if (pbVar18 != pbVar14 + 2) {
          if (pbVar18 != pbVar14 + 5) goto code_r0x0001801d8940;
          bVar11 = cVar30 - 0x34;
          cVar31 = bVar29 + 0x38;
          goto code_r0x0001801d90e0;
        }
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x68 + (cVar30 + 0xbcU & bVar29) * -2);
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d91ee;
      }
      bVar11 = cVar30 + 0x8c;
      cVar30 = cVar30 + bVar29 + -0x48;
      goto code_r0x0001801d91da;
    }
    unaff_RDI = (ulonglong)(byte)((bVar29 & cVar30 + 0x84U) * -2 + 'd' + bVar29 + cVar30 + 0x84U);
code_r0x0001801d8940:
    if (in_R10 < pbVar14) {
      pbVar18 = (byte *)((longlong)register0x00000020 + 0x178c188);
      goto code_r0x0001801d92b2;
    }
    if (pbVar18 < pbVar14 + 0x61) {
      unaff_RDI = (ulonglong)
                  (byte)(bVar29 + 0x34 + (cVar30 - 0x2cU) + (cVar30 - 0x2cU & bVar29) * -2);
    }
    else {
      if (pbVar18 == pbVar14 + 1) {
        bVar11 = cVar30 - 0x24;
        cVar31 = bVar29 - 0x28;
        goto code_r0x0001801d90e0;
      }
      if (pbVar18 == pbVar14 + 2) {
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x58 + (cVar30 - 0x1cU & bVar29) * -2);
        pbVar14 = pbVar14 + 1;
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d91ee;
      }
      if (pbVar18 == pbVar14 + 3) {
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + 'x' + (cVar30 - 0x14U & bVar29) * -2);
        in_R10 = in_R10 + -1;
        goto code_r0x0001801d91ee;
      }
      if (pbVar18 == pbVar14 + 6) {
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x18 + (cVar30 + 4U & bVar29) * -2);
        in_R10 = in_R10 + (-1 - unaff_RDI);
        goto code_r0x0001801d91ee;
      }
    }
    while (pbVar13 = pbVar14, in_R10 < pbVar14 + (longlong)pbVar18) {
      while( true ) {
        do {
          pbVar14 = pbVar13;
          if (pbVar18 == pbVar14 + 100) {
            bVar11 = cVar30 + 0xb8;
            cVar31 = bVar29 + 0xb0;
            goto code_r0x0001801d90e0;
          }
          if (pbVar18 == pbVar14 + 8) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x80 + (cVar30 - 0x40U & bVar29) * -2);
            pbVar14 = pbVar14 + 1;
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d91ee;
          }
          if (pbVar18 == pbVar14 + 0x5a) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + 'P' + (cVar30 - 0x38U & bVar29) * -2);
            in_R10 = in_R10 + -1;
            goto code_r0x0001801d91ee;
          }
          if (pbVar18 == pbVar14 + 0x80) {
            bVar11 = cVar30 - 0x30;
            cVar31 = bVar29 + 0x20;
            goto code_r0x0001801d9135;
          }
          if (pbVar18 == pbVar14 + 9) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x10 + (cVar30 - 0x28U & bVar29) * -2);
            pbVar18 = pbVar18 + (longlong)pbVar14;
            in_R10 = in_R10 + (-1 - unaff_RDI);
            goto code_r0x0001801d91ee;
          }
          if (pbVar18 == pbVar14 + 0x2a) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x40 + (cVar30 - 0x20U & bVar29) * -2);
            in_R10 = in_R10 + (-1 - unaff_RDI);
            goto code_r0x0001801d91ee;
          }
          if (pbVar18 == pbVar14 + 0x200) {
            bVar11 = cVar30 - 0x18;
            cVar31 = bVar29 + 0x90;
            goto code_r0x0001801d9175;
          }
          if (pbVar18 == pbVar14 + 10) {
            unaff_RDI = (ulonglong)(byte)(bVar29 + 0x60 + cVar30 + (cVar30 - 0x10U & bVar29) * -2);
            goto code_r0x0001801d91a6;
          }
          if (pbVar18 == pbVar14 + 1) {
            bVar11 = cVar30 - 8;
            cVar30 = cVar30 + bVar29 + '0';
            goto code_r0x0001801d91da;
          }
          pbVar13 = pbVar14;
        } while (pbVar18 == pbVar14 + 1000);
        pbVar18 = pbVar14 + 0x42;
        in_R11 = pbVar14 + 0x58;
        if (pbVar18 < in_R11) {
          unaff_RDI = (ulonglong)
                      (byte)(bVar29 + cVar30 + 0x8cU + ',' + (bVar29 & cVar30 + 0x8cU) * -2);
          goto code_r0x0001801d886c;
        }
        pbVar13 = pbVar14 + 0x52;
        if (pbVar18 < pbVar14 + 0x93) {
          unaff_RDI = (ulonglong)
                      (byte)(bVar29 + cVar30 + 0x94U + -0xc + (bVar29 & cVar30 + 0x94U) * -2);
          goto code_r0x0001801d88b0;
        }
        if (pbVar18 < pbVar14 + 0xb6) {
          unaff_RDI = (ulonglong)
                      (byte)(bVar29 + 0xbc + cVar30 + 0x9cU + (cVar30 + 0x9cU & bVar29) * -2);
          pbVar14 = pbVar13;
          goto code_r0x0001801d88d2;
        }
        if (pbVar18 < pbVar14 + 0x5a) {
          unaff_RDI = (ulonglong)
                      (byte)(bVar29 + 0x84 + cVar30 + 0xa4U + (cVar30 + 0xa4U & bVar29) * -2);
          pbVar14 = pbVar13;
          goto code_r0x0001801d8940;
        }
        if (pbVar18 < pbVar14 + 0xac) break;
        if (pbVar18 < pbVar14 + 0xd2) {
          bVar11 = cVar30 + 0xb4;
          cVar31 = bVar29 - 0x38;
          pbVar14 = pbVar13;
          goto code_r0x0001801d8d3d;
        }
        if (pbVar18 < pbVar14 + 0x5b) {
          bVar11 = cVar30 + 0xbc;
          cVar31 = bVar29 + 0x98;
          pbVar14 = pbVar13;
          goto code_r0x0001801d8d01;
        }
        if (pbVar18 < pbVar14 + 0x7c) {
          bVar11 = cVar30 - 0x3c;
          cVar31 = bVar29 + 0x68;
          pbVar14 = pbVar13;
          goto code_r0x0001801d8ccb;
        }
        if (pbVar18 < pbVar14 + 0x252) {
          unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + '8' + (cVar30 - 0x34U & bVar29) * -2);
          pbVar14 = pbVar13;
          goto code_r0x0001801d8cb4;
        }
        if (pbVar14 + 0x5c <= pbVar18) {
          pbVar18 = pbVar14 + 0x57;
          if (pbVar14 + 0xd2 < pbVar18) {
            bVar11 = cVar30 + 0x60;
            cVar30 = cVar30 + bVar29 + -0x40;
            pbVar14 = in_R11;
            goto code_r0x0001801d91da;
          }
          if (pbVar14 + 0x9a < pbVar18) {
            unaff_RDI = (ulonglong)(byte)(bVar29 + 0x90 + cVar30 + (cVar30 + 0x68U & bVar29) * -2);
            pbVar14 = in_R11;
            goto code_r0x0001801d91a6;
          }
          if (pbVar14 + 0x5e < pbVar18) {
            bVar11 = cVar30 + 0x70;
            cVar31 = bVar29 + 0x60;
            pbVar14 = in_R11;
            goto code_r0x0001801d9175;
          }
          if (pbVar14 + 0x99 < pbVar18) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + '0' + (cVar30 + 0x78U & bVar29) * -2);
            in_R10 = in_R10 + (-1 - unaff_RDI);
            pbVar14 = in_R11;
            goto code_r0x0001801d91ee;
          }
          if (pbVar14 + 0xbc < pbVar18) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + (cVar30 + 0x80U & bVar29) * -2);
            pbVar18 = pbVar18 + (longlong)in_R11;
            in_R10 = in_R10 + (-1 - unaff_RDI);
            pbVar14 = in_R11;
            goto code_r0x0001801d91ee;
          }
          if (pbVar14 + 0x60 < pbVar18) {
            bVar11 = cVar30 + 0x88;
            cVar31 = bVar29 - 0x30;
            pbVar14 = in_R11;
            goto code_r0x0001801d9135;
          }
          if (pbVar14 + 0xb2 < pbVar18) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x60 + (cVar30 + 0x90U & bVar29) * -2);
            in_R10 = in_R10 + -1;
            pbVar14 = in_R11;
            goto code_r0x0001801d91ee;
          }
          if (pbVar14 + 0xd8 < pbVar18) {
            unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + 'p' + (cVar30 + 0x98U & bVar29) * -2);
            in_R10 = in_R10 + -1;
            pbVar14 = pbVar14 + 0x59;
            goto code_r0x0001801d91ee;
          }
          if (pbVar14 + 0x61 < pbVar18) {
            bVar11 = cVar30 + 0xa0;
            cVar31 = bVar29 + 0x40;
            pbVar14 = in_R11;
            goto code_r0x0001801d90e0;
          }
          pbVar13 = in_R11;
          if (pbVar18 <= pbVar14 + 0x82) {
            pbVar18 = pbVar14 + 0xb9;
            pbVar13 = pbVar14 + 0x2b9;
          }
        }
      }
      unaff_RDI = (ulonglong)(byte)(bVar29 + 0x4c + cVar30 + 0xacU + (cVar30 + 0xacU & bVar29) * -2)
      ;
      pbVar14 = pbVar13;
    }
    if (pbVar18 < pbVar14 + 0x80) {
      bVar11 = cVar30 + 0x84;
      cVar31 = bVar29 - 0x18;
code_r0x0001801d8d3d:
      unaff_RDI = (ulonglong)(byte)(cVar31 + cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d8d43:
      if (pbVar14 + (longlong)pbVar18 == (byte *)0x64) {
        bVar11 = cVar30 + 0xa8;
        cVar31 = cVar30 + '\x10';
code_r0x0001801d9178:
        unaff_RDI = (ulonglong)(byte)(cVar31 + (bVar11 & bVar29) * -2);
        bVar11 = (bVar29 - 8) + (cVar30 + 0x2cU & bVar29) * -2 + cVar30;
        abStack_328[(longlong)in_R10] = bVar11;
        in_R10 = in_R10 + (-(ulonglong)bVar11 - (longlong)(pbVar14 + 1));
        pbVar14 = pbVar14 + 1;
code_r0x0001801d91a6:
        abStack_328[(longlong)in_R10] =
             (char)in_R10 + -0x20 + bVar29 + ((char)in_R10 + 0xb0U & bVar29) * -2;
        pbVar18 = pbVar18 + 1;
        in_R10 = in_R10 + ~(ulonglong)pbVar18;
        goto code_r0x0001801d91e2;
      }
      if (pbVar14 + 0x20 < pbVar18) {
        bVar11 = cVar30 + 0x74;
        cVar31 = bVar29 + 0x48;
code_r0x0001801d8d01:
        unaff_RDI = (ulonglong)(byte)(cVar31 + cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d8d07:
        if (pbVar18 < (byte *)0x6) {
          if (pbVar14 + 2 < pbVar18) {
            bVar11 = cVar30 + 0x48;
            cVar31 = bVar29 + 0x50;
code_r0x0001801d8ccb:
            unaff_RDI = (ulonglong)(byte)(cVar31 + cVar30 + (bVar11 & bVar29) * -2);
          }
          else {
            if (pbVar18 == pbVar14 + 1) {
              bVar11 = cVar30 + 0x50;
              cVar30 = cVar30 + bVar29 + ' ';
              goto code_r0x0001801d91da;
            }
            if (pbVar18 == pbVar14 + 5) {
              bVar11 = bVar29 & cVar30 + 0x78U;
              cVar31 = bVar29 + 0x30;
              goto code_r0x0001801d9138;
            }
            if (pbVar18 == pbVar14 + 7) {
              unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + (cVar30 + 0x80U & bVar29) * -2);
              in_R10 = in_R10 + -1;
              goto code_r0x0001801d91ee;
            }
            if (pbVar18 == pbVar14 + 6) {
              bVar11 = cVar30 + 0x90;
              cVar31 = bVar29 + 0xa0;
              goto code_r0x0001801d90e0;
            }
          }
          if ((byte *)0x79 < pbVar14) {
            unaff_RDI = (ulonglong)
                        ((uint)(byte)(bVar29 + 0x70 + cVar30 + (cVar30 + 0x98U & bVar29) * -2) * 2);
            goto code_r0x0001801d90eb;
          }
code_r0x0001801d8cb4:
          abStack_328[(longlong)in_R10] = (byte)unaff_RDI;
        }
        else {
          bVar11 = cVar30 + 0xa0;
          cVar31 = bVar29 * '\x02' + '@';
code_r0x0001801d9135:
          bVar11 = bVar11 & bVar29;
code_r0x0001801d9138:
          bVar11 = cVar31 + cVar30 + bVar11 * -2;
          unaff_RDI = (ulonglong)bVar11;
          abStack_328[(longlong)in_R10] =
               bVar29 + 0x28 + (cVar30 + 0x24U & bVar29) * -2 + cVar30 + bVar11;
          pbVar18 = pbVar18 + (longlong)pbVar14;
          in_R10 = in_R10 + (-1 - (ulonglong)bVar11);
        }
      }
      else if (pbVar18 == pbVar14 + 1) {
        bVar11 = cVar30 + 0x7c;
        cVar31 = bVar29 + 0x18;
code_r0x0001801d90e0:
        unaff_RDI = (ulonglong)(byte)(cVar31 + cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d90eb:
        abStack_328[(longlong)in_R10] = bVar29 + 0x58 + (cVar30 + 0x1cU & bVar29) * -2 + cVar30;
        in_R10 = in_R10 + -1;
        pbVar14 = pbVar14 + 1;
      }
      else if (pbVar18 == pbVar14 + 2) {
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + -0x48 + (cVar30 + 0x8cU & bVar29) * -2);
        in_R10 = in_R10 + -1;
      }
      else if (pbVar18 == pbVar14 + 3) {
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + 'X' + (cVar30 + 0x9cU & bVar29) * -2);
        pbVar18 = pbVar18 + (longlong)pbVar14;
        in_R10 = in_R10 + (-1 - unaff_RDI);
      }
      else {
        if (pbVar18 != pbVar14 + 5) {
          if (pbVar18 == pbVar14 + 6) {
            bVar11 = cVar30 + 0xac;
            cVar31 = bVar29 - 8;
            goto code_r0x0001801d9175;
          }
          if (pbVar18 == pbVar14 + 4) {
            bVar11 = cVar30 + 0xbc;
            cVar30 = cVar30 + bVar29 + -0x68;
            goto code_r0x0001801d91da;
          }
          goto code_r0x0001801d8d07;
        }
        unaff_RDI = (ulonglong)(byte)(cVar30 + bVar29 + '(' + (bVar29 & cVar30 + 0xa4U) * -2);
        in_R10 = in_R10 + (-1 - unaff_RDI);
      }
    }
    else {
      if (pbVar18 != pbVar14 + 1) {
        if (pbVar18 != pbVar14 + 2) {
          if (pbVar18 != pbVar14 + 3) {
            if (pbVar18 == pbVar14 + 4) {
              unaff_RDI = (ulonglong)
                          (byte)(cVar30 + bVar29 + -0x10 + (cVar30 - 0x28U & bVar29) * -2);
              in_R10 = in_R10 + -1;
            }
            else {
              if (pbVar18 != pbVar14 + 7) goto code_r0x0001801d8d43;
              unaff_RDI = (ulonglong)
                          (byte)(cVar30 + bVar29 + -0x40 + (cVar30 - 0x20U & bVar29) * -2);
              pbVar14 = pbVar14 + 1;
              in_R10 = in_R10 + -1;
            }
            goto code_r0x0001801d91ee;
          }
          bVar11 = bVar29 & cVar30 - 0x30U;
          cVar31 = bVar29 + 0x20;
          goto code_r0x0001801d9138;
        }
        bVar11 = cVar30 + 0xb8;
        cVar31 = bVar29 + 0xb0;
code_r0x0001801d9175:
        cVar31 = cVar31 + cVar30;
        goto code_r0x0001801d9178;
      }
      bVar11 = cVar30 + 0xa8;
      cVar30 = cVar30 + bVar29 + '\x10';
code_r0x0001801d91da:
      unaff_RDI = (ulonglong)(byte)(cVar30 + (bVar11 & bVar29) * -2);
code_r0x0001801d91e2:
      in_R10 = in_R10 + (longlong)(pbVar14 + abStack_328[(longlong)in_R10]);
    }
code_r0x0001801d91ee:
  }
  pbVar18 = abStack_328;
code_r0x0001801d92b2:
  FUN_1801aca80(auStack_188,pbVar18);
  FUN_1801a4a90(auStack_188);
  FUN_180195980(auStack_188);
  pbVar18 = pbStack_368;
  lVar15 = FUN_1801ac540(pbStack_2c8,*(longlong *)(pbStack_368 + 0x10) + 0x28);
  *(longlong *)(pbVar18 + 0x20) = lVar15;
  *(longlong *)(*(longlong *)pbVar18 + 0x98) = lVar15;
  unaff_R12 = (byte *)FUN_1801dfe80(auStack_b8,*(longlong *)(pbVar18 + 0x20));
  abStack_3b8[0] = 0x83;
  abStack_3b8[1] = 0xf2;
  abStack_3b8[2] = 0xbf;
  abStack_3b8[3] = 0xfb;
  abStack_3b8[4] = 0xa9;
  abStack_3b8[5] = 0x9d;
  abStack_3b8[6] = 0x8b;
  abStack_3b8[7] = 0x84;
  abStack_3b8[8] = 0x9d;
  abStack_3b8[9] = 0x9d;
  abStack_3b8[10] = 0x8b;
  abStack_3b8[0xb] = 0x94;
  abStack_3b8[0xc] = 0x9a;
  abStack_3b8[0xd] = 0xcd;
  abStack_3b8[0xe] = 0x92;
  abStack_3b8[0xf] = 0x87;
  abStack_3b8[0x10] = 0x9a;
  abStack_3b8[0x11] = 0x84;
  abStack_3b8[0x12] = 0x8b;
  abStack_3b8[0x13] = 0x87;
  abStack_3b8[0x14] = 0xce;
  abStack_3b8[0x15] = 0xd5;
  abStack_3b8[0x16] = 0xf6;
  abStack_3b8[0x17] = 0;
  abStack_3b8[0x18] = 0;
  abStack_3b8[0x19] = 0;
  abStack_3b8[0x1a] = 0;
  abStack_3b8[0x1b] = 0;
  abStack_3b8[0x1c] = 0;
  abStack_3b8[0x1d] = 0;
  abStack_3b8[0x1e] = 0;
  abStack_3b8[0x1f] = 0;
  abStack_3b8[0x20] = 0;
  abStack_3b8[0x21] = 0;
  abStack_3b8[0x22] = 0;
  abStack_3b8[0x23] = 0;
  abStack_3b8[0x24] = 0;
  pbVar18 = abStack_3b8;
  bVar29 = abStack_3d8[0];
code_r0x0001801d935f:
  puVar16 = (ulonglong *)func_0x000180b36780();
  uVar26 = *puVar16;
  puVar16 = (ulonglong *)func_0x000180b36790();
  uVar23 = *puVar16;
code_r0x0001801d9390:
  uVar37 = 0;
  while( true ) {
    pbVar14 = (byte *)0xa54b942654d1313c;
    param_1 = (byte *)0x1d130f3c10bd078c;
    pbVar13 = (byte *)0x468a58a5f4e331f4;
    if (0x24 < uVar37) break;
    bVar11 = abStack_3b8[uVar37];
    in_R10 = (byte *)(uVar37 + 0x468a58a5f4e331f4);
    in_R11 = (byte *)(uVar37 + 0x1d130f3c10bd078c);
    pbVar13 = (byte *)(uVar37 + 0xa54b942654d1313c);
    param_1 = (byte *)(uVar37 + 0xd09f623fd009005c);
    pbVar14 = (byte *)(uVar37 + 0x40ccfa6b4bf3084);
code_r0x0001801d93d0:
    if (uVar37 < uVar26) {
      pbVar18 = (byte *)((longlong)register0x00000020 + 0x953a74);
      break;
    }
    cVar30 = (char)uVar37;
    uVar24 = uVar23;
    if (uVar23 + 1 <= uVar26) {
      if (uVar26 != uVar23 + 1) {
        if (uVar26 == uVar23 + 2) {
          bVar29 = cVar30 + 0x84;
          cVar31 = bVar11 - 0x18;
code_r0x0001801d9d05:
          bVar29 = bVar29 & bVar11;
          uVar24 = uVar23;
          goto code_r0x0001801d9d08;
        }
        if (uVar26 == uVar23 + 3) {
          bVar29 = cVar30 + 0xac;
          cVar31 = bVar11 - 8;
code_r0x0001801d9cc5:
          bVar29 = bVar29 & bVar11;
          goto code_r0x0001801d9cc8;
        }
        if (uVar26 != uVar23 + 6) {
          if (uVar26 != uVar23 + 4) goto code_r0x0001801d9440;
          bVar29 = cVar30 - 0x2c;
          cVar31 = bVar11 + 8;
code_r0x0001801d9c6d:
          bVar29 = bVar29 & bVar11;
          goto code_r0x0001801d9c70;
        }
        bVar29 = cVar30 + bVar11 + 'X' + (cVar30 + 0x1cU & bVar11) * -2;
        uVar24 = uVar23 + 1;
        uVar37 = uVar37 - 1;
        goto code_r0x0001801d9d78;
      }
      bVar29 = cVar30 + 0x14;
      cVar30 = cVar30 + bVar11 + -0x78;
code_r0x0001801d9d64:
      bVar29 = cVar30 + (bVar29 & bVar11) * -2;
      uVar24 = uVar23;
      goto code_r0x0001801d9d6c;
    }
    bVar29 = (bVar11 & (byte)param_1) * -2 + '|' + bVar11 + (byte)param_1;
code_r0x0001801d9440:
    if (uVar37 < uVar24) {
      pbVar18 = (byte *)((longlong)register0x00000020 + 0x14c3a18);
      break;
    }
    if (uVar26 < uVar24 + 0x10) {
      bVar29 = bVar11 + 0x2c + (byte)in_R11 + ((byte)in_R11 & bVar11) * -2;
    }
    else {
      if (uVar26 == uVar24 + 1) {
        bVar29 = cVar30 + 0x44;
        cVar31 = bVar11 + 0x68;
        goto code_r0x0001801d9c6d;
      }
      if (uVar26 == uVar24 + 3) {
        bVar29 = cVar30 + bVar11 + -0x38 + (cVar30 + 0xb4U & bVar11) * -2;
        uVar37 = uVar37 - 1;
        goto code_r0x0001801d9d78;
      }
      if (uVar26 == uVar24 + 5) {
        bVar29 = cVar30 + bVar11 + -0x28 + (cVar30 - 0x24U & bVar11) * -2;
        uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
        goto code_r0x0001801d9d78;
      }
      if (uVar26 == uVar24 + 2) {
        bVar29 = cVar30 + 0x94;
        cVar31 = bVar11 + 0x88;
        uVar23 = uVar24;
        goto code_r0x0001801d9d05;
      }
    }
    while (uVar23 = uVar24, uVar37 < uVar24 + uVar26) {
      while( true ) {
        do {
          uVar24 = uVar23;
          if (uVar26 == uVar24 + 6) {
            bVar29 = cVar30 + 0x88;
            cVar31 = bVar11 - 0x30;
            goto code_r0x0001801d9c6d;
          }
          if (uVar26 == uVar24 + 0x40) {
            bVar29 = cVar30 + bVar11 + -0x80 + (cVar30 + 0x40U & bVar11) * -2;
            uVar24 = uVar24 + 1;
            uVar37 = uVar37 - 1;
            goto code_r0x0001801d9d78;
          }
          if (uVar26 == uVar24 + 0x1000) {
            bVar29 = cVar30 + bVar11 + '0' + (cVar30 - 8U & bVar11) * -2;
            uVar37 = uVar37 - 1;
            goto code_r0x0001801d9d78;
          }
          if (uVar26 == uVar24 + 1000) {
            bVar29 = cVar30 + 0xb0;
            cVar31 = bVar11 - 0x20;
            goto code_r0x0001801d9cc5;
          }
          if (uVar26 == uVar24 + 0x2a) {
            bVar29 = cVar30 + bVar11 + -0x70 + (cVar30 + 0x68U & bVar11) * -2;
            uVar26 = uVar26 + uVar24;
            uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            goto code_r0x0001801d9d78;
          }
          if (uVar26 == uVar24 + 0x41) {
            bVar29 = cVar30 + bVar11 + '@' + (cVar30 + 0x20U & bVar11) * -2;
            uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            goto code_r0x0001801d9d78;
          }
          uVar23 = uVar24;
          if (uVar26 == uVar24 + 5) {
            bVar29 = cVar30 - 0x28;
            cVar31 = bVar11 - 0x10;
            goto code_r0x0001801d9d05;
          }
          if (uVar26 == uVar24 + 0x28) {
            bVar29 = bVar11 + 0xa0 + cVar30 + (cVar30 + 0x90U & bVar11) * -2;
            goto code_r0x0001801d9d33;
          }
          if (uVar26 == uVar24 + 0x10) {
            bVar29 = cVar30 + bVar11 + 'P' + (bVar11 & cVar30 + 0x48U) * -2;
            goto code_r0x0001801d9d6c;
          }
        } while (uVar26 == uVar24 + 0x200);
        uVar26 = uVar24 + 9;
        if (uVar26 < uVar24 + 0x69) {
          bVar29 = bVar11 + cVar30 + 0x14U + 't' + (bVar11 & cVar30 + 0x14U) * -2;
          goto code_r0x0001801d935f;
        }
        uVar23 = uVar24 + 99;
        if (uVar26 < uVar24 + 0xa3) {
          bVar29 = bVar11 + (cVar30 - 0x34U) + 'l' + (bVar11 & cVar30 - 0x34U) * -2;
          goto code_r0x0001801d9390;
        }
        if (uVar26 < uVar24 + 0x1063) {
          bVar29 = bVar11 + 100 + (byte)pbVar14 + ((byte)pbVar14 & bVar11) * -2;
          goto code_r0x0001801d93d0;
        }
        if (uVar26 < uVar24 + 1099) {
          bVar29 = bVar11 + 0x5c + (byte)pbVar13 + ((byte)pbVar13 & bVar11) * -2;
          uVar24 = uVar23;
          goto code_r0x0001801d9440;
        }
        if (uVar26 < uVar24 + 0x8d) break;
        if (uVar26 < uVar24 + 0x6b) {
          bVar29 = cVar30 + 0xac;
          cVar31 = bVar11 - 8;
          uVar24 = uVar23;
          goto code_r0x0001801d987b;
        }
        if (uVar26 < uVar24 + 0x68) {
          bVar29 = cVar30 + 100;
          cVar31 = bVar11 + 0xa8;
          uVar24 = uVar23;
          goto code_r0x0001801d983c;
        }
        if (uVar26 < uVar24 + 0x8b) {
          bVar29 = cVar30 + 0x1c;
          cVar31 = bVar11 + 0x58;
          uVar24 = uVar23;
          goto code_r0x0001801d97fe;
        }
        if (uVar26 < uVar24 + 0x73) {
          bVar29 = cVar30 + bVar11 + '\b' + (cVar30 - 0x2cU & bVar11) * -2;
          uVar24 = uVar23;
          goto code_r0x0001801d97e7;
        }
        if (uVar24 + 0x263 <= uVar26) {
          uVar26 = uVar24 + 0x6c;
          uVar23 = uVar24 + 0xc6;
          if (uVar24 + 0x12a < uVar26) {
            bVar29 = cVar30 + 0xa0;
            cVar30 = cVar30 + bVar11 + '@';
            goto code_r0x0001801d9d64;
          }
          if (uVar24 + 0x106 < uVar26) {
            bVar29 = (bVar11 - 0x10) + cVar30 + (cVar30 + 0x58U & bVar11) * -2;
            uVar24 = uVar23;
            goto code_r0x0001801d9d33;
          }
          if (uVar24 + 0x10c6 < uVar26) {
            bVar29 = cVar30 + 0x10;
            cVar31 = bVar11 + 0xa0;
            goto code_r0x0001801d9d05;
          }
          if (uVar24 + 0x4ae < uVar26) {
            bVar29 = cVar30 + bVar11 + 'P' + (bVar11 & cVar30 - 0x38U) * -2;
            uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            uVar24 = uVar23;
            goto code_r0x0001801d9d78;
          }
          if (uVar24 + 0xf0 < uVar26) {
            bVar29 = cVar30 + bVar11 + (bVar11 & cVar30 + 0x80U) * -2;
            uVar26 = uVar26 + uVar23;
            uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            uVar24 = uVar23;
            goto code_r0x0001801d9d78;
          }
          if (uVar24 + 0xce < uVar26) {
            bVar29 = bVar11 & cVar30 + 0x38U;
            cVar31 = bVar11 + 0xb0;
            uVar24 = uVar23;
            goto code_r0x0001801d9cc8;
          }
          if (uVar24 + 0xcb < uVar26) {
            bVar29 = cVar30 + bVar11 + '`' + (bVar11 & cVar30 - 0x10U) * -2;
            uVar37 = uVar37 - 1;
            uVar24 = uVar23;
            goto code_r0x0001801d9d78;
          }
          if (uVar24 + 0xee < uVar26) {
            bVar29 = cVar30 + bVar11 + '\x10' + (bVar11 & cVar30 + 0xa8U) * -2;
            uVar37 = uVar37 - 1;
            uVar24 = uVar24 + 199;
            goto code_r0x0001801d9d78;
          }
          if (uVar24 + 0x4c6 < uVar26) {
            bVar29 = bVar11 & cVar30 + 0x60U;
            cVar31 = bVar11 - 0x40;
            uVar24 = uVar23;
            goto code_r0x0001801d9c70;
          }
          if (uVar26 <= uVar24 + 0x2c6) {
            uVar26 = uVar24 + 0xcf;
            uVar23 = uVar24 + 0x129;
          }
        }
      }
      bVar29 = bVar11 + 0x54 + (byte)in_R10 + ((byte)in_R10 & bVar11) * -2;
      uVar24 = uVar23;
    }
    if (uVar26 < uVar24 + 0x400) {
      bVar29 = cVar30 + 0x5c;
      cVar31 = bVar11 - 0x28;
code_r0x0001801d987b:
      bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
code_r0x0001801d9881:
      if (uVar24 + uVar26 == 0x61) {
        bVar29 = bVar11 & cVar30 + 0x18U;
        cVar31 = cVar30 + 'p';
code_r0x0001801d9d0b:
        bVar29 = cVar31 + bVar29 * -2;
        bVar10 = bVar11 + 0x48 + (cVar30 + 0x74U & bVar11) * -2 + cVar30;
        abStack_3b8[uVar37] = bVar10;
        uVar37 = (uVar37 - (uVar24 + 1)) - (ulonglong)bVar10;
        uVar24 = uVar24 + 1;
code_r0x0001801d9d33:
        abStack_3b8[uVar37] = (char)uVar37 + ' ' + bVar11 + ((char)uVar37 - 0x30U & bVar11) * -2;
        uVar26 = uVar26 + 1;
        uVar37 = uVar37 + ~uVar26;
        goto code_r0x0001801d9d6c;
      }
      if (uVar24 + 3 < uVar26) {
        bVar29 = cVar30 - 0x14;
        cVar31 = bVar11 + 0x78;
code_r0x0001801d983c:
        bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
code_r0x0001801d9842:
        if (uVar26 < 0x61) {
          if (uVar24 + 0x28 < uVar26) {
            bVar29 = cVar30 + 0x78;
            cVar31 = bVar11 + 0x30;
code_r0x0001801d97fe:
            bVar29 = cVar31 + cVar30 + (bVar29 & bVar11) * -2;
code_r0x0001801d9804:
            if (0x60 < uVar24) {
              bVar29 = (bVar11 + 0xa8 + cVar30 + (bVar11 & cVar30 + 0xa8U) * -2) * '\x02' - 0x30;
              goto code_r0x0001801d9c78;
            }
code_r0x0001801d97e7:
            abStack_3b8[uVar37] = bVar29;
          }
          else {
            if (uVar26 == uVar24 + 1) {
              bVar29 = cVar30 + bVar11 + -0x20 + (bVar11 & cVar30 + 0x30U) * -2;
              goto code_r0x0001801d9d6c;
            }
            if (uVar26 == uVar24 + 2) {
              bVar29 = bVar11 & cVar30 + 0xa0U;
              cVar31 = bVar11 + 0x40;
              goto code_r0x0001801d9d08;
            }
            if (uVar26 == uVar24 + 3) {
              bVar29 = cVar30 + bVar11 + -0x10 + (bVar11 & cVar30 + 0x58U) * -2;
              uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            }
            else if (uVar26 == uVar24 + 5) {
              bVar29 = cVar30 + bVar11 + -0x60 + (bVar11 & cVar30 + 0x10U) * -2;
              uVar26 = uVar26 + uVar24;
              uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
            }
            else {
              if (uVar26 != uVar24 + 4) goto code_r0x0001801d9804;
              bVar29 = cVar30 + bVar11 + (bVar11 & cVar30 + 0x80U) * -2;
              uVar37 = uVar37 - 1;
            }
          }
        }
        else {
          bVar29 = (bVar11 * '\x02' + cVar30 + (bVar11 & cVar30 + 0x60U) * -2) - 0x40;
code_r0x0001801d9cd0:
          abStack_3b8[uVar37] = bVar11 + (cVar30 + 0xbcU & bVar11) * -2 + -0x68 + cVar30 + bVar29;
          uVar26 = uVar26 + uVar24;
          uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
        }
      }
      else if (uVar26 == uVar24 + 1) {
        bVar29 = bVar11 & cVar30 + 0xa4U;
        cVar31 = bVar11 + 0x28;
code_r0x0001801d9c70:
        bVar29 = cVar31 + cVar30 + bVar29 * -2;
code_r0x0001801d9c78:
        abStack_3b8[uVar37] = (bVar11 - 0x18) + (cVar30 + 4U & bVar11) * -2 + cVar30;
        uVar37 = uVar37 - 1;
        uVar24 = uVar24 + 1;
      }
      else if (uVar26 == uVar24 + 2) {
        bVar29 = cVar30 + bVar11 + -0x78 + (bVar11 & cVar30 + 0x14U) * -2;
        uVar37 = uVar37 - 1;
      }
      else {
        if (uVar26 == uVar24 + 3) {
          bVar29 = bVar11 & cVar30 - 0x34U;
          cVar31 = bVar11 + 0x38;
code_r0x0001801d9cc8:
          bVar29 = cVar31 + cVar30 + bVar29 * -2;
          goto code_r0x0001801d9cd0;
        }
        if (uVar26 != uVar24 + 5) {
          if (uVar26 == uVar24 + 4) {
            bVar29 = bVar11 & cVar30 - 0xcU;
            cVar31 = bVar11 + 0x48;
            goto code_r0x0001801d9d08;
          }
          goto code_r0x0001801d9842;
        }
        bVar29 = cVar30 + bVar11 + -0x18 + (bVar11 & cVar30 + 0x84U) * -2;
        uVar26 = uVar26 + uVar24;
        uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
      }
    }
    else {
      if (uVar26 != uVar24 + 1) {
        if (uVar26 != uVar24 + 2) {
          if (uVar26 == uVar24 + 3) {
            bVar29 = cVar30 + bVar11 + -0x80 + (bVar11 & cVar30 + 0x40U) * -2;
            uVar37 = (uVar37 - 1) - (ulonglong)bVar29;
          }
          else {
            if (uVar26 != uVar24 + 4) goto code_r0x0001801d9881;
            bVar29 = cVar30 + bVar11 + -0x70 + (bVar11 & cVar30 + 0x68U) * -2;
            uVar37 = uVar37 - 1;
          }
          goto code_r0x0001801d9d78;
        }
        bVar29 = bVar11 & cVar30 + 0x88U;
        cVar31 = bVar11 - 0x30;
code_r0x0001801d9d08:
        cVar31 = cVar31 + cVar30;
        goto code_r0x0001801d9d0b;
      }
      bVar29 = cVar30 + bVar11 + 'p' + (bVar11 & cVar30 + 0x18U) * -2;
code_r0x0001801d9d6c:
      uVar37 = uVar37 + abStack_3b8[uVar37] + uVar24;
    }
code_r0x0001801d9d78:
    uVar37 = uVar37 + 1;
    uVar23 = uVar24;
  }
  uVar17 = FUN_1801a9d10(auStack_d8,pbVar18,unaff_R12);
  FUN_1801a4a90(uVar17);
  FUN_180195980(auStack_d8);
  FUN_180195980(auStack_b8);
  abStack_2e8[0] = 0x51;
  abStack_2e8[1] = 0x77;
  abStack_2e8[2] = 0x73;
  abStack_2e8[3] = 0x7f;
  abStack_2e8[4] = 0x82;
  abStack_2e8[5] = 0;
  abStack_2e8[6] = 0;
  abStack_2e8[7] = 0;
  abStack_2e8[8] = 0;
  abStack_2e8[9] = 0;
  abStack_2e8[10] = 0;
  abStack_2e8[0xb] = 0;
  abStack_2e8[0xc] = 0;
  abStack_2e8[0xd] = 0;
  abStack_2e8[0xe] = 0;
  abStack_2e8[0xf] = 0;
  abStack_2e8[0x10] = 0;
  abStack_2e8[0x11] = 0;
  abStack_2e8[0x12] = 0;
  abStack_2e8[0x13] = 0;
  abStack_2e8[0x14] = 0;
  abStack_2e8[0x15] = 0;
  abStack_2e8[0x16] = 0;
  abStack_2e8[0x17] = 0;
  abStack_2e8[0x18] = 0;
  abStack_2e8[0x19] = 0;
  abStack_2e8[0x1a] = 0;
  unaff_R13 = abStack_2e8;
  unaff_RDI = (ulonglong)abStack_3d8[0];
code_r0x0001801d9e60:
  puVar16 = (ulonglong *)func_0x000180b36780();
  pbVar18 = (byte *)*puVar16;
  puVar16 = (ulonglong *)func_0x000180b36790();
  pbVar21 = (byte *)*puVar16;
code_r0x0001801d9e70:
  param_4 = (byte *)0x0;
  pbVar25 = pbVar21;
code_r0x0001801d9e73:
  if ((byte *)0x1a < param_4) {
code_r0x0001801da8c2:
    FUN_1801aca80(auStack_168,unaff_R13);
    FUN_1801a4a90(auStack_168);
    FUN_180195980(auStack_168);
    FUN_1801da980(pbStack_368,pbStack_2c0);
    pbVar18 = (byte *)CONCAT71((int7)((ulonglong)pbVar18 >> 8),1);
    goto code_r0x0001801da8fa;
  }
  bVar29 = abStack_2e8[(longlong)param_4];
  in_R10 = param_4 + 0xafc9cb;
  in_R11 = param_4 + 0x1a8ed5;
  pbVar13 = param_4 + 0xad4249;
  param_1 = param_4 + 0x143c1;
  pbVar14 = param_4 + 0xaabac7;
code_r0x0001801d9ea6:
  if (param_4 < pbVar18) {
    unaff_R13 = (byte *)((longlong)register0x00000020 + 0x11ac685);
    goto code_r0x0001801da8c2;
  }
  cVar30 = (char)param_4;
  iVar33 = (int)param_4;
  if (pbVar25 + 1 <= pbVar18) {
    if (pbVar18 == pbVar25 + 1) {
      bVar11 = cVar30 + 0x43;
      uVar26 = (ulonglong)
               CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'n');
code_r0x0001801da859:
      unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + (bVar29 & bVar11) * -2);
      param_4 = param_4 + (longlong)(pbVar25 + abStack_2e8[(longlong)param_4]) + 1;
    }
    else {
      if (pbVar18 == pbVar25 + 2) {
        bVar11 = cVar30 + 0x47;
        uVar26 = (ulonglong)(bVar29 + 0x56);
code_r0x0001801da7e2:
        bVar11 = bVar29 & bVar11;
        goto code_r0x0001801da7e8;
      }
      if (pbVar18 != pbVar25 + 3) {
        if (pbVar18 != pbVar25 + 6) goto code_r0x0001801d9f01;
        bVar11 = cVar30 - 0x33;
        uVar26 = (ulonglong)(bVar29 + 0x32);
code_r0x0001801da773:
        bVar11 = bVar29 & bVar11;
        goto code_r0x0001801da779;
      }
      bVar11 = cVar30 - 0x37;
      uVar26 = (ulonglong)
               CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'J');
code_r0x0001801da7bd:
      bVar29 = (char)uVar26 + (bVar29 & bVar11) * -2;
      unaff_RDI = CONCAT71((int7)(uVar26 >> 8),bVar29);
      param_4 = param_4 + -(ulonglong)bVar29;
    }
    goto code_r0x0001801d9e73;
  }
  iVar32 = (uint)(bVar29 & (byte)param_1) * 0xfe;
  unaff_RDI = (ulonglong)
              CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + -0x47 + bVar29 + (byte)param_1);
code_r0x0001801d9f01:
  if (param_4 < pbVar25) {
    unaff_R13 = (byte *)((longlong)register0x00000020 + 0x15982c4);
    goto code_r0x0001801da8c2;
  }
  if (pbVar25 + 0x61 <= pbVar18) {
    if (pbVar18 == pbVar25 + 1) {
      bVar11 = cVar30 + 0x57;
      uVar26 = (ulonglong)(bVar29 + 0xf6);
      goto code_r0x0001801da73d;
    }
    if (pbVar18 == pbVar25 + 3) {
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                           (char)(iVar33 + (uint)bVar29) + -0x22 + (bVar29 & cVar30 + 0x5bU) * -2);
    }
    else {
      if (pbVar18 != pbVar25 + 2) {
        if (pbVar18 != pbVar25 + 5) {
          if (pbVar18 != pbVar25 + 6) goto code_r0x0001801d9f70;
          bVar11 = cVar30 + 99;
          uVar26 = (ulonglong)(bVar29 + 0xae);
          goto code_r0x0001801da7e2;
        }
        bVar11 = cVar30 - 0x1f;
        uVar26 = (ulonglong)
                 CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + -0x46);
        goto code_r0x0001801da7bd;
      }
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                           (char)(iVar33 + (uint)bVar29) + -0x3a + (bVar29 & cVar30 + 0x5fU) * -2);
      pbVar18 = pbVar18 + (longlong)pbVar25;
      param_4 = param_4 + -(unaff_RDI & 0xff);
    }
    goto code_r0x0001801d9e73;
  }
  unaff_RDI = (ulonglong)
              CONCAT31((int3)(bVar29 + 0x2d >> 8),
                       (char)(bVar29 + 0x2d) + (byte)in_R11 + (bVar29 & (byte)in_R11) * -2);
code_r0x0001801d9f70:
  while (pbVar21 = pbVar25, param_4 < pbVar25 + (longlong)pbVar18) {
    while( true ) {
      do {
        pbVar25 = pbVar21;
        if (pbVar18 == pbVar25 + 5) {
          bVar11 = cVar30 - 0x12;
          uVar26 = (ulonglong)(bVar29 + 0x6c);
          goto code_r0x0001801da73d;
        }
        if (pbVar18 == pbVar25 + 0x200) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + '`' + (bVar29 & cVar30 + 0x70U) * -2)
          ;
          pbVar25 = pbVar25 + 1;
          goto code_r0x0001801d9e73;
        }
        if (pbVar18 == pbVar25 + 4) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + 'T' + (bVar29 & cVar30 - 0xeU) * -2);
          goto code_r0x0001801d9e73;
        }
        if (pbVar18 == pbVar25 + 0x80) {
          bVar11 = cVar30 + 0x74;
          uVar26 = (ulonglong)(bVar29 + 0x48);
          goto code_r0x0001801da773;
        }
        if (pbVar18 == pbVar25 + 3) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + '<' + (bVar29 & cVar30 - 10U) * -2);
          pbVar18 = pbVar18 + (longlong)pbVar25;
          param_4 = param_4 + -(unaff_RDI & 0xff);
          goto code_r0x0001801d9e73;
        }
        if (pbVar18 == pbVar25 + 100) {
          bVar11 = cVar30 + 0x78;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + '0');
          goto code_r0x0001801da7bd;
        }
        if (pbVar18 == pbVar25 + 2) {
          bVar11 = cVar30 - 6;
          uVar26 = (ulonglong)(bVar29 + 0x24);
          goto code_r0x0001801da7e2;
        }
        if (pbVar18 == pbVar25 + 0x42) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(bVar29 + 0x18 >> 8),
                               (char)(bVar29 + 0x18) + cVar30 + (bVar29 & cVar30 + 0x7cU) * -2);
          goto code_r0x0001801da816;
        }
        if (pbVar18 == pbVar25 + 1) {
          bVar11 = cVar30 - 2;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + '\f')
          ;
          goto code_r0x0001801da859;
        }
        pbVar21 = pbVar25;
      } while (pbVar18 == pbVar25 + 0x40);
      pbVar18 = pbVar25 + 0x400;
      uVar39 = (undefined7)((ulonglong)param_4 >> 8);
      if (pbVar18 < pbVar25 + 0x430) {
        iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 - 0x3dU);
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)((uint)iVar33 >> 8),
                             (char)iVar33 + -0x55 + (bVar29 & cVar30 - 0x3dU) * -2);
        goto code_r0x0001801d9e60;
      }
      pbVar21 = pbVar25 + 0x42a;
      if (pbVar18 < pbVar25 + 0x812) {
        iVar33 = (uint)bVar29 + (int)CONCAT71(uVar39,cVar30 + 0x45U);
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)((uint)iVar33 >> 8),
                             (char)iVar33 + '\x1d' + (bVar29 & cVar30 + 0x45U) * -2);
        goto code_r0x0001801d9e70;
      }
      if (pbVar18 < pbVar25 + 0x42f) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(bVar29 + 0x8f >> 8),
                             (char)(bVar29 + 0x8f) + (byte)pbVar14 + (bVar29 & (byte)pbVar14) * -2);
        pbVar25 = pbVar21;
        goto code_r0x0001801d9ea6;
      }
      if (pbVar18 < pbVar25 + 0x62a) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(bVar29 + 1 >> 8),
                             (char)(bVar29 + 1) + (byte)pbVar13 + (bVar29 & (byte)pbVar13) * -2);
        pbVar25 = pbVar21;
        goto code_r0x0001801d9f01;
      }
      if (pbVar18 < pbVar25 + 0x42e) break;
      if (pbVar18 < pbVar25 + 0x4aa) {
        bVar11 = cVar30 + 0x4d;
        iVar32 = bVar29 + 0x32;
        pbVar25 = pbVar21;
        goto code_r0x0001801da344;
      }
      if (pbVar18 < pbVar25 + 0x42d) {
        bVar11 = cVar30 - 0x31;
        iVar32 = bVar29 + 0x26;
        pbVar25 = pbVar21;
        goto code_r0x0001801da308;
      }
      if (pbVar18 < pbVar25 + 0x48e) {
        bVar11 = cVar30 + 0x51;
        iVar33 = bVar29 + 0x1a;
        pbVar25 = pbVar21;
        goto code_r0x0001801da2cc;
      }
      if (pbVar18 < pbVar25 + 0x42c) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + '\x0e' + (bVar29 & cVar30 - 0x2dU) * -2
                            );
        pbVar25 = pbVar21;
        goto code_r0x0001801da2af;
      }
      if (pbVar25 + 0x46c <= pbVar18) {
        pbVar18 = pbVar25 + 0x142a;
        pbVar21 = pbVar25 + 0x142b;
        if (pbVar25 + 0x1433 < pbVar18) {
          bVar11 = cVar30 + 0x98;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'p');
          pbVar25 = pbVar21;
          goto code_r0x0001801da859;
        }
        if (pbVar25 + 0x182b < pbVar18) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(bVar29 + 100 >> 8),
                               (char)(bVar29 + 100) + cVar30 + (bVar29 & cVar30 + 0x1aU) * -2);
          pbVar25 = pbVar21;
          goto code_r0x0001801da816;
        }
        if (pbVar25 + 0x1431 < pbVar18) {
          bVar11 = cVar30 + 0x9c;
          uVar26 = (ulonglong)(bVar29 + 0x58);
          pbVar25 = pbVar21;
          goto code_r0x0001801da7e2;
        }
        if (pbVar25 + 0x1813 < pbVar18) {
          bVar11 = cVar30 + 0x1e;
          uVar26 = (ulonglong)
                   CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),(char)(iVar33 + (uint)bVar29) + 'L');
          pbVar25 = pbVar21;
          goto code_r0x0001801da7bd;
        }
        if (pbVar25 + 0x1430 < pbVar18) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + '@' + (bVar29 & cVar30 + 0xa0U) * -2)
          ;
          pbVar18 = pbVar18 + (longlong)pbVar21;
          param_4 = param_4 + -(unaff_RDI & 0xff);
          pbVar25 = pbVar21;
          goto code_r0x0001801d9e73;
        }
        if (pbVar25 + 0x162b < pbVar18) {
          bVar11 = cVar30 + 0x22;
          uVar26 = (ulonglong)(bVar29 + 0x34);
          pbVar25 = pbVar21;
          goto code_r0x0001801da773;
        }
        if (pbVar25 + 0x142f < pbVar18) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + '(' + (bVar29 & cVar30 + 0xa4U) * -2)
          ;
          pbVar25 = pbVar21;
          goto code_r0x0001801d9e73;
        }
        if (pbVar25 + 0x14ab < pbVar18) {
          unaff_RDI = (ulonglong)
                      CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                               (char)(iVar33 + (uint)bVar29) + '\x1c' +
                               (bVar29 & cVar30 + 0x26U) * -2);
          pbVar25 = pbVar25 + 0x142c;
          goto code_r0x0001801d9e73;
        }
        if (pbVar25 + 0x142e < pbVar18) {
          bVar11 = cVar30 + 0xa8;
          uVar26 = (ulonglong)(bVar29 + 0x10);
          pbVar25 = pbVar21;
          goto code_r0x0001801da73d;
        }
        if (pbVar18 <= pbVar25 + 0x148f) {
          pbVar18 = pbVar25 + 0x148c;
          pbVar21 = pbVar25 + 0x148e;
        }
      }
    }
    unaff_RDI = (ulonglong)
                CONCAT31((int3)(bVar29 + 0x73 >> 8),
                         (char)(bVar29 + 0x73) + (byte)in_R10 + (bVar29 & (byte)in_R10) * -2);
    pbVar25 = pbVar21;
  }
  if (pbVar25 + 0x80 <= pbVar18) {
    if (pbVar18 == pbVar25 + 1) {
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                           (char)(iVar33 + (uint)bVar29) + '\x04' + (cVar30 + 0xaaU & bVar29) * -2);
      param_4 = param_4 + (longlong)(pbVar25 + abStack_2e8[(longlong)param_4]) + 1;
    }
    else {
      if (pbVar18 == pbVar25 + 2) {
        bVar11 = cVar30 + 0xaeU & bVar29;
        uVar26 = (ulonglong)(bVar29 + 0xec);
code_r0x0001801da7e8:
        uVar26 = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30);
        goto code_r0x0001801da7eb;
      }
      if (pbVar18 == pbVar25 + 3) {
        bVar11 = cVar30 + 0x34U & bVar29;
        uVar26 = (ulonglong)(bVar29 + 200);
code_r0x0001801da779:
        unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30 + bVar11 * -2);
code_r0x0001801da781:
        abStack_2e8[(longlong)param_4] =
             bVar29 + 10 + (cVar30 + 0x29U & bVar29) * -2 + cVar30 + (char)unaff_RDI;
        pbVar18 = pbVar18 + (longlong)pbVar25;
        param_4 = param_4 + -(unaff_RDI & 0xff);
      }
      else {
        if (pbVar18 != pbVar25 + 7) goto code_r0x0001801da34a;
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x50 + (cVar30 + 0x38U & bVar29) * -2)
        ;
        pbVar25 = pbVar25 + 1;
      }
    }
    goto code_r0x0001801d9e73;
  }
  bVar11 = cVar30 - 0x3f;
  iVar32 = bVar29 + 0x7a;
code_r0x0001801da344:
  unaff_RDI = (ulonglong)
              CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + cVar30 + (bVar29 & bVar11) * -2);
code_r0x0001801da34a:
  if (pbVar25 + (longlong)pbVar18 == (byte *)0x5) {
    bVar11 = bVar29 & cVar30 - 0x16U;
    uVar26 = (ulonglong)(iVar33 + 0x84);
code_r0x0001801da7eb:
    unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + bVar11 * -2);
    bVar11 = (bVar29 - 2) + (cVar30 + 0xabU & bVar29) * -2 + cVar30;
    abStack_2e8[(longlong)param_4] = bVar11;
    param_4 = param_4 + (-(ulonglong)bVar11 - (longlong)(pbVar25 + 1));
    pbVar25 = pbVar25 + 1;
code_r0x0001801da816:
    abStack_2e8[(longlong)param_4] =
         (char)param_4 + 'x' + bVar29 + ((char)param_4 + 0x6cU & bVar29) * -2;
    pbVar18 = pbVar18 + 1;
    param_4 = param_4 + ~(ulonglong)pbVar18 +
              (longlong)(pbVar25 + abStack_2e8[(longlong)(param_4 + ~(ulonglong)pbVar18)]) + 1;
    goto code_r0x0001801d9e73;
  }
  if (pbVar25 + 0x20 < pbVar18) {
    bVar11 = cVar30 - 3;
    iVar32 = bVar29 + 0x12;
code_r0x0001801da308:
    unaff_RDI = (ulonglong)
                CONCAT31((int3)((uint)iVar32 >> 8),(char)iVar32 + cVar30 + (bVar29 & bVar11) * -2);
code_r0x0001801da30e:
    if ((byte *)0x5 < pbVar18) {
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)((uint)bVar29 * 2 >> 8),
                           (char)((uint)bVar29 * 2) + cVar30 + (bVar29 & cVar30 + 0x68U) * -2 +
                           -0x70);
      goto code_r0x0001801da781;
    }
    if (pbVar25 + 0x28 < pbVar18) {
      bVar11 = cVar30 - 0x2e;
      iVar33 = bVar29 + 0x14;
code_r0x0001801da2cc:
      unaff_RDI = (ulonglong)
                  CONCAT31((int3)((uint)iVar33 >> 8),(char)iVar33 + cVar30 + (bVar29 & bVar11) * -2)
      ;
    }
    else {
      if (pbVar18 == pbVar25 + 1) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + '\b' + (cVar30 + 0x54U & bVar29) * -2);
        param_4 = param_4 + (longlong)(pbVar25 + abStack_2e8[(longlong)param_4]) + 1;
        goto code_r0x0001801d9e73;
      }
      if (pbVar18 == pbVar25 + 3) {
        bVar11 = cVar30 + 0x58U & bVar29;
        uVar26 = (ulonglong)(bVar29 + 0xf0);
        goto code_r0x0001801da7e8;
      }
      if (pbVar18 == pbVar25 + 5) {
        bVar11 = cVar30 - 0x22U & bVar29;
        uVar26 = (ulonglong)(bVar29 + 0xcc);
        goto code_r0x0001801da779;
      }
      if (pbVar18 == pbVar25 + 7) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x40 + (cVar30 + 0x60U & bVar29) * -2)
        ;
        goto code_r0x0001801d9e73;
      }
      if (pbVar18 == pbVar25 + 2) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x4c + (cVar30 - 0x1eU & bVar29) * -2)
        ;
        pbVar25 = pbVar25 + 1;
        goto code_r0x0001801d9e73;
      }
    }
    if (pbVar25 < (byte *)0x8) {
code_r0x0001801da2af:
      abStack_2e8[(longlong)param_4] = (byte)unaff_RDI;
      param_4 = param_4 + 1;
      goto code_r0x0001801d9e73;
    }
    unaff_RDI = (ulonglong)
                (uint)(CONCAT31((int3)(bVar29 + 0x9c >> 8),
                                (char)(bVar29 + 0x9c) + cVar30 + (bVar29 & cVar30 - 0x1aU) * -2) * 2
                      );
  }
  else {
    if (pbVar18 != pbVar25 + 1) {
      if (pbVar18 == pbVar25 + 3) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x12 + (cVar30 + 0x83U & bVar29) * -2)
        ;
      }
      else if (pbVar18 == pbVar25 + 4) {
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x36 + (cVar30 + 9U & bVar29) * -2);
        param_4 = param_4 + -(unaff_RDI & 0xff);
      }
      else {
        if (pbVar18 == pbVar25 + 2) {
          bVar11 = cVar30 + 0x8bU & bVar29;
          uVar26 = (ulonglong)(bVar29 + 0xbe);
          goto code_r0x0001801da7e8;
        }
        if (pbVar18 != pbVar25 + 8) goto code_r0x0001801da30e;
        unaff_RDI = (ulonglong)
                    CONCAT31((int3)(iVar33 + (uint)bVar29 >> 8),
                             (char)(iVar33 + (uint)bVar29) + -0x5a + (cVar30 + 0x8fU & bVar29) * -2)
        ;
        param_4 = param_4 + (longlong)(pbVar25 + abStack_2e8[(longlong)param_4]) + 1;
      }
      goto code_r0x0001801d9e73;
    }
    bVar11 = cVar30 + 0x7f;
    uVar26 = (ulonglong)(bVar29 + 6);
code_r0x0001801da73d:
    unaff_RDI = CONCAT71((int7)(uVar26 >> 8),(char)uVar26 + cVar30 + (bVar29 & bVar11) * -2);
  }
  abStack_2e8[(longlong)param_4] = bVar29 + 0x16 + (cVar30 + 0xa7U & bVar29) * -2 + cVar30;
  pbVar25 = pbVar25 + 1;
  goto code_r0x0001801d9e73;
}

