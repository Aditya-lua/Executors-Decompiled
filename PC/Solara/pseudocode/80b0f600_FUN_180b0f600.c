/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180b0f600(longlong param_1,undefined8 param_2)

{
  code *pcVar1;
  byte bVar2;
  byte bVar3;
  int iVar4;
  ulonglong *puVar5;
  undefined8 uVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  undefined1 *puVar12;
  byte bVar13;
  char cVar14;
  char cVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  longlong lVar18;
  ulonglong uVar19;
  byte *pbVar20;
  longlong *plVar21;
  undefined1 auStack_158 [8];
  undefined1 auStack_150 [24];
  longlong *plStack_138;
  byte abStack_128 [16];
  byte abStack_118 [80];
  undefined4 uStack_c8;
  longlong alStack_c0 [5];
  longlong alStack_98 [2];
  undefined4 uStack_88;
  undefined2 uStack_84;
  undefined2 uStack_82;
  undefined6 uStack_80;
  undefined2 uStack_7a;
  undefined6 uStack_78;
  undefined2 uStack_72;
  undefined8 uStack_70;
  longlong lStack_68;
  longlong lStack_60;
  longlong lStack_58;
  undefined8 uStack_50;
  ulonglong uStack_40;
  
  puVar12 = auStack_158;
  uStack_40 = _DAT_1810c1700 ^ (ulonglong)auStack_158;
  uStack_c8 = 0;
  alStack_98[0] = -0x29372d321f392b09;
  alStack_98[1] = 0x31372c3835350a34;
  uStack_88 = 0x37123325;
  uStack_84 = 0xc536;
  uStack_82 = 0;
  uStack_80 = 0;
  uStack_7a = 0;
  uStack_78 = 0;
  plVar21 = alStack_98;
  bVar13 = abStack_128[0];
  alStack_c0[4] = param_1;
code_r0x000180b0f680:
  puVar5 = (ulonglong *)func_0x000180b36780();
  uVar11 = *puVar5;
  puVar5 = (ulonglong *)func_0x000180b36790();
  uVar16 = *puVar5;
code_r0x000180b0f690:
  uVar19 = 0;
  uVar17 = uVar16;
code_r0x000180b0f693:
  if (uVar19 < 0x26) {
    if (uVar19 < uVar11) {
      plVar21 = (longlong *)(auStack_158 + 0x131c5d8);
      goto LAB_180b0fe93;
    }
    bVar3 = *(byte *)((longlong)alStack_98 + uVar19);
    bVar2 = (byte)uVar19;
    if (uVar11 < uVar17 + 1) {
      bVar13 = (bVar3 & bVar2 + 0x78) * -2 + '0' + bVar2 + bVar3;
LAB_180b0f723:
code_r0x000180b0f734:
      if (uVar19 < uVar17) {
        plVar21 = (longlong *)(auStack_158 + 0x1700160);
        goto LAB_180b0fe93;
      }
      if (uVar11 < uVar17 + 0x61) {
        bVar13 = bVar3 + 0x18 + (bVar2 - 0x28) + (bVar2 - 0x28 & bVar3) * -2;
      }
      else {
        if (uVar11 == uVar17 + 1) {
          bVar13 = bVar2 - 0x38;
          cVar14 = bVar3 + 0x50;
          goto code_r0x000180b0fcec;
        }
        if (uVar11 == uVar17 + 2) {
          bVar13 = bVar2 + 0x98;
          goto code_r0x000180b0fd40;
        }
        if (uVar11 == uVar17 + 3) {
          bVar13 = bVar2 + bVar3 + '0' + (bVar3 & bVar2 + 0x78) * -2;
          uVar19 = uVar19 - bVar13;
          goto code_r0x000180b0f693;
        }
        if (uVar11 == uVar17 + 7) {
          bVar13 = bVar2 + 0x48;
          cVar14 = bVar2 + bVar3 + 'P';
          goto code_r0x000180b0fe2a;
        }
      }
      if (uVar19 < uVar17 + uVar11) goto code_r0x000180b0f7a0;
      if (uVar17 + 0x2a <= uVar11) {
        if (uVar11 == uVar17 + 1) {
          bVar13 = bVar2 + 0xb0;
          cVar14 = bVar2 + bVar3 + -0x20;
          goto code_r0x000180b0fe2a;
        }
        if (uVar11 == uVar17 + 2) {
          bVar13 = bVar2 + 0xa0;
code_r0x000180b0fb01:
          bVar13 = bVar3 + 0x40 + bVar2 + (bVar3 & bVar13) * -2;
          goto code_r0x000180b0fde7;
        }
        if (uVar11 == uVar17 + 5) {
          bVar13 = bVar2 + 0x70;
          cVar14 = bVar2 + bVar3 + '`';
          goto code_r0x000180b0fd8e;
        }
        if (uVar11 != uVar17 + 4) goto code_r0x000180b0fa14;
        bVar13 = bVar2 + bVar3 + ' ' + (bVar3 & bVar2 + 0x50) * -2;
        goto code_r0x000180b0f693;
      }
      bVar13 = bVar2 + 0x78;
      cVar14 = bVar3 + 0x30;
code_r0x000180b0fa0e:
      bVar13 = cVar14 + bVar2 + (bVar3 & bVar13) * -2;
code_r0x000180b0fa14:
      if (uVar17 + uVar11 == 0x61) {
        bVar13 = bVar2 + 0xb0;
        cVar14 = bVar2 - 0x20;
        goto code_r0x000180b0fdbf;
      }
      if (uVar17 + 4 < uVar11) {
        bVar13 = bVar2 + 0x98;
        cVar14 = bVar3 + 0x70;
code_r0x000180b0f9a6:
        bVar13 = cVar14 + bVar2 + (bVar3 & bVar13) * -2;
      }
      else {
        if (uVar11 == uVar17 + 1) {
          bVar13 = bVar2 + 0x88;
          cVar14 = bVar3 - 0x30;
          goto code_r0x000180b0fcec;
        }
        if (uVar11 == uVar17 + 3) {
          bVar13 = bVar2 + bVar3 + -0x70 + (bVar3 & bVar2 + 0x68) * -2;
          goto code_r0x000180b0f693;
        }
        if (uVar11 == uVar17 + 2) {
          bVar13 = bVar2 + 0x48;
          cVar14 = bVar2 + bVar3 + 'P';
          goto code_r0x000180b0fd8e;
        }
        if (uVar11 == uVar17 + 5) {
          bVar13 = bVar2 + bVar3 + -0x50 + (bVar3 & bVar2 + 0x38) * -2;
          uVar19 = uVar19 - bVar13;
          goto code_r0x000180b0f693;
        }
      }
      if (8 < uVar11) {
        bVar13 = bVar2 - 0x40 & bVar3;
        cVar14 = bVar3 * '\x02' + -0x80;
        goto code_r0x000180b0fd4a;
      }
      if (uVar17 + 0x2a < uVar11) {
        bVar13 = bVar3 + 0x60 + bVar2 + (bVar3 & bVar2 + 0x70) * -2;
      }
      else {
        if (uVar11 == uVar17 + 1) {
          bVar13 = bVar2 + 0x60;
          cVar14 = bVar2 + bVar3 + -0x40;
          goto code_r0x000180b0fe2a;
        }
        if (uVar11 == uVar17 + 2) {
          bVar13 = bVar2 + 0x40;
          cVar14 = bVar3 + 0x80;
          goto code_r0x000180b0fdb6;
        }
        if (uVar11 == uVar17 + 3) {
          bVar13 = bVar2 + 0x20;
          cVar14 = bVar2 + bVar3 + '@';
          goto code_r0x000180b0fd8e;
        }
        if (uVar11 == uVar17 + 5) {
          bVar13 = bVar2 + bVar3 + (bVar3 & bVar2) * -2;
          goto code_r0x000180b0f693;
        }
      }
      if (3 < uVar17) {
        bVar13 = ((bVar3 - 0x30) + bVar2 + (bVar2 - 0x30 & bVar3) * -2) * '\x02' + 0xa0;
        goto code_r0x000180b0fcf4;
      }
code_r0x000180b0f986:
      *(byte *)((longlong)alStack_98 + uVar19) = bVar13;
      uVar19 = uVar19 + 1;
      goto code_r0x000180b0f693;
    }
    if (uVar11 == uVar17 + 1) {
      bVar13 = bVar2 + 0x68;
      cVar14 = bVar2 + bVar3 + -0x70;
code_r0x000180b0fe2a:
      bVar13 = cVar14 + (bVar3 & bVar13) * -2;
      uVar19 = uVar19 + *(byte *)((longlong)alStack_98 + uVar19) + uVar17 + 1;
    }
    else if (uVar11 == uVar17 + 2) {
      bVar13 = bVar2 + 0x48;
      cVar14 = bVar3 + 0x50;
code_r0x000180b0fdb6:
      cVar14 = cVar14 + bVar2;
code_r0x000180b0fdbf:
      bVar13 = cVar14 + (bVar3 & bVar13) * -2;
      bVar2 = bVar3 + 0x10 + (bVar2 + 0x28 & bVar3) * -2 + bVar2;
      *(byte *)((longlong)alStack_98 + uVar19) = bVar2;
      uVar17 = uVar17 + 1;
      uVar19 = (uVar19 - uVar17) - (ulonglong)bVar2;
code_r0x000180b0fde7:
      *(byte *)((longlong)alStack_98 + uVar19) =
           (char)uVar19 + '@' + bVar3 + ((char)uVar19 + 0xa0U & bVar3) * -2;
      uVar11 = uVar11 + 1;
      uVar19 = uVar19 + ~uVar11 + *(byte *)((longlong)alStack_98 + uVar19 + ~uVar11) + uVar17 + 1;
    }
    else if (uVar11 == uVar17 + 5) {
      bVar13 = bVar2 + 0x28;
      cVar14 = bVar2 + bVar3 + '\x10';
code_r0x000180b0fd8e:
      bVar13 = cVar14 + (bVar3 & bVar13) * -2;
      uVar11 = uVar11 + uVar17;
      uVar19 = uVar19 - bVar13;
    }
    else if (uVar11 == uVar17 + 4) {
      bVar13 = bVar2 + 0x18;
code_r0x000180b0fd40:
      cVar14 = bVar3 + 0x70;
      bVar13 = bVar3 & bVar13;
code_r0x000180b0fd4a:
      bVar13 = cVar14 + bVar2 + bVar13 * -2;
      *(byte *)((longlong)alStack_98 + uVar19) =
           bVar3 + (bVar2 + 0x38 & bVar3) * -2 + -0x50 + bVar2 + bVar13;
      uVar11 = uVar11 + uVar17;
      uVar19 = uVar19 - bVar13;
    }
    else if (uVar11 == uVar17 + 6) {
      bVar13 = bVar2 + bVar3 + -0x30 + (bVar3 & bVar2 + 8) * -2;
    }
    else {
      if (uVar11 != uVar17 + 8) goto LAB_180b0f723;
      bVar13 = bVar2 - 0x18;
      cVar14 = bVar3 + 0x90;
code_r0x000180b0fcec:
      bVar13 = cVar14 + bVar2 + (bVar13 & bVar3) * -2;
code_r0x000180b0fcf4:
      *(byte *)((longlong)alStack_98 + uVar19) = bVar3 + 0x50 + (bVar2 + 0x48 & bVar3) * -2 + bVar2;
      uVar17 = uVar17 + 1;
    }
    goto code_r0x000180b0f693;
  }
LAB_180b0fe93:
  alStack_c0[0] = 0;
  alStack_c0[1] = 0;
  alStack_c0[2] = 0;
  alStack_c0[3] = 0;
  uVar6 = FUN_180f29c00(plVar21);
  FUN_180191ab0(alStack_c0,plVar21,uVar6);
  if (*(longlong *)(param_1 + 0xb8) == 0) {
code_r0x000180b10a76:
    *(undefined8 *)(puVar12 + -8) = 0x180b10a8a;
    uVar6 = FUN_18019a400(&lStack_60,&UNK_180f4e870,alStack_c0);
    *(undefined8 *)(puVar12 + -8) = 0x180b10a93;
    FUN_1801a4a90(uVar6);
    *(undefined8 *)(puVar12 + -8) = 0x180b10a9d;
    func_0x000180194370(&lStack_60);
    *(undefined8 *)(puVar12 + -8) = 0x180b10ab1;
    uVar6 = FUN_18019a400(alStack_98,&UNK_180f4e8b0,alStack_c0);
    *(undefined8 *)(puVar12 + -8) = 0x180b10abe;
    FUN_180193f80(&lStack_60,uVar6);
    *(undefined8 *)(puVar12 + -8) = 0x180b10ace;
    FUN_180e16970(&lStack_60,&UNK_1810b7de8);
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  if (0xf < (ulonglong)alStack_c0[3]) {
    if (alStack_c0[3] + 1U < 0x1000) {
      lVar7 = 1;
      lVar18 = alStack_c0[0];
    }
    else {
      if (0x1f < (alStack_c0[0] - *(longlong *)(alStack_c0[0] + -8)) - 8U) {
        pcVar1 = (code *)swi(0x29);
        (*pcVar1)(5);
        puVar12 = auStack_150;
        goto code_r0x000180b10a76;
      }
      lVar7 = 0x28;
      lVar18 = *(longlong *)(alStack_c0[0] + -8);
    }
    func_0x000180e15340(lVar18,alStack_c0[3] + lVar7);
  }
  lStack_68 = FUN_180b0dc90(param_1,param_2);
  uVar6 = FUN_1801ac0d0((longlong)&uStack_50 + 5,lStack_68);
  FUN_180199c30(alStack_c0,uVar6,(longlong)&uStack_50 + 5,abStack_128);
  abStack_118[0] = 0xe3;
  abStack_118[1] = 0xf6;
  abStack_118[2] = 0xe7;
  abStack_118[3] = 0xd7;
  abStack_118[4] = 0xf7;
  abStack_118[5] = 0xd8;
  abStack_118[6] = 0xdd;
  abStack_118[7] = 0xd5;
  abStack_118[8] = 0xe5;
  abStack_118[9] = 0xd9;
  abStack_118[10] = 0xfd;
  abStack_118[0xb] = 0x28;
  abStack_118[0xc] = 0x2a;
  abStack_118[0xd] = 0x2d;
  abStack_118[0xe] = 0x1f;
  abStack_118[0xf] = 0x26;
  abStack_118[0x10] = 0x2e;
  abStack_118[0x11] = 0x18;
  abStack_118[0x12] = 0x24;
  abStack_118[0x13] = 3;
  abStack_118[0x14] = 0x24;
  abStack_118[0x15] = 0x27;
  abStack_118[0x16] = 0x1b;
  abStack_118[0x17] = 0xd7;
  abStack_118[0x18] = 0xf1;
  abStack_118[0x19] = 0x3f;
  abStack_118[0x1a] = 0xf;
  abStack_118[0x1b] = 0x39;
  abStack_118[0x1c] = 0x3c;
  abStack_118[0x1d] = 0xc9;
  abStack_118[0x1e] = 0xea;
  abStack_118[0x1f] = 10;
  abStack_118[0x20] = 0x3b;
  abStack_118[0x21] = 10;
  abStack_118[0x22] = 0x34;
  abStack_118[0x23] = 0x3a;
  abStack_118[0x24] = 0x30;
  abStack_118[0x25] = 0x35;
  abStack_118[0x26] = 0x35;
  abStack_118[0x27] = 0x31;
  abStack_118[0x28] = 0xc4;
  abStack_118[0x29] = 0xe4;
  abStack_118[0x2a] = 0x3e;
  abStack_118[0x2b] = 0x3f;
  abStack_118[0x2c] = 0xe;
  abStack_118[0x2d] = 0x3c;
  abStack_118[0x2e] = 9;
  abStack_118[0x2f] = 8;
  abStack_118[0x30] = 0xd2;
  abStack_118[0x31] = 0xfd;
  abStack_118[0x32] = 0xc2;
  abStack_118[0x33] = 0x1b;
  abStack_118[0x34] = 0x90;
  abStack_118[0x35] = 0;
  abStack_118[0x36] = 0;
  abStack_118[0x37] = 0;
  abStack_118[0x38] = 0;
  abStack_118[0x39] = 0;
  abStack_118[0x3a] = 0;
  abStack_118[0x3b] = 0;
  abStack_118[0x3c] = 0;
  abStack_118[0x3d] = 0;
  abStack_118[0x3e] = 0;
  abStack_118[0x3f] = 0;
  abStack_118[0x40] = 0;
  abStack_118[0x41] = 0;
  abStack_118[0x42] = 0;
  abStack_118[0x43] = 0;
  abStack_118[0x44] = 0;
  abStack_118[0x45] = 0;
  abStack_118[0x46] = 0;
  abStack_118[0x47] = 0;
  pbVar20 = abStack_118;
code_r0x000180b0ffcb:
  puVar5 = (ulonglong *)func_0x000180b36780();
  uVar11 = *puVar5;
  puVar5 = (ulonglong *)func_0x000180b36790();
  uVar16 = *puVar5;
code_r0x000180b10003:
  uVar17 = uVar11;
  for (uVar19 = 0; uVar19 < 0x48; uVar19 = uVar19 + 1) {
    bVar13 = abStack_118[uVar19];
    cVar14 = (char)uVar19;
code_r0x000180b10033:
    if (uVar19 < uVar17) {
      pbVar20 = auStack_158 + 0xc5467e;
      break;
    }
    if (uVar16 + 1 <= uVar17) {
      if (uVar17 == uVar16 + 1) {
        bVar3 = cVar14 - 0x1e;
        cVar14 = cVar14 + bVar13 + -0x4c;
        goto code_r0x000180b10792;
      }
      if (uVar17 == uVar16 + 3) {
        bVar3 = cVar14 + 0xba;
        cVar15 = bVar13 + 0xa4;
        goto code_r0x000180b10733;
      }
      if (uVar17 != uVar16 + 5) goto code_r0x000180b10081;
      bVar3 = cVar14 + 0x42;
      cVar15 = bVar13 + 0x74;
      goto code_r0x000180b106fd;
    }
    abStack_128[0] = (bVar13 & cVar14 - 10U) * -2 + 'F' + bVar13 + (cVar14 - 10U);
code_r0x000180b10081:
    if (uVar19 < uVar16) {
      pbVar20 = auStack_158 + 0x17a2588;
      break;
    }
    if (uVar16 + 9 <= uVar17) {
      if (uVar17 != uVar16 + 1) {
        if (uVar17 == uVar16 + 3) {
          abStack_128[0] = cVar14 + bVar13 + 'T' + (cVar14 - 0xeU & bVar13) * -2;
          uVar19 = uVar19 - 1;
        }
        else {
          if (uVar17 == uVar16 + 4) {
            bVar3 = cVar14 - 0x22;
            cVar15 = bVar13 - 0x34;
code_r0x000180b10694:
            abStack_128[0] = cVar15 + cVar14 + (bVar3 & bVar13) * -2;
            goto code_r0x000180b1069f;
          }
          if (uVar17 != uVar16 + 5) {
            if (uVar17 != uVar16 + 7) {
              if (uVar17 != uVar16 + 2) {
                if (uVar17 != uVar16 + 8) goto code_r0x000180b10110;
                bVar3 = cVar14 + 0x7a;
                cVar14 = cVar14 + bVar13 + '$';
                goto code_r0x000180b10792;
              }
              abStack_128[0] = bVar13 + 0xac + cVar14 + (cVar14 + 0x8eU & bVar13) * -2;
              goto code_r0x000180b10761;
            }
            bVar3 = cVar14 + 0xa2;
            cVar15 = bVar13 + 0x34;
            goto code_r0x000180b10733;
          }
          abStack_128[0] = cVar14 + bVar13 + 'D' + (cVar14 - 0x36U & bVar13) * -2;
          uVar17 = uVar17 + uVar16;
          uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
        }
        goto code_r0x000180b107a6;
      }
      bVar3 = cVar14 + 0x1a;
      cVar15 = bVar13 + 100;
      goto code_r0x000180b106fd;
    }
    abStack_128[0] = bVar13 + 0xbe + cVar14 + 0x2eU + (bVar13 & cVar14 + 0x2eU) * -2;
code_r0x000180b10110:
    while (uVar19 < uVar16 + uVar17) {
      while( true ) {
        uVar10 = uVar16;
        uVar16 = uVar10;
        if (uVar17 == uVar10 + 8) {
          bVar3 = cVar14 + 0xb4;
          cVar15 = bVar13 - 0x38;
          goto code_r0x000180b106fd;
        }
        if (uVar17 == uVar10 + 3) {
          abStack_128[0] = cVar14 + bVar13 + '@' + (cVar14 + 0xa0U & bVar13) * -2;
          uVar16 = uVar10 + 1;
          uVar19 = uVar19 - 1;
          goto code_r0x000180b107a6;
        }
        uVar11 = uVar10 + 9;
        if (uVar17 == uVar11) {
          abStack_128[0] = cVar14 + bVar13 + -0x48 + (cVar14 + 0x8cU & bVar13) * -2;
          uVar19 = uVar19 - 1;
          goto code_r0x000180b107a6;
        }
        if (uVar17 == uVar10 + 0x40) {
          bVar3 = cVar14 + 0x78;
          cVar15 = bVar13 + 0x30;
          goto code_r0x000180b10694;
        }
        if (uVar17 == uVar10 + 1000) {
          abStack_128[0] = cVar14 + bVar13 + -0x58 + (bVar13 & cVar14 + 100U) * -2;
          uVar17 = uVar17 + uVar10;
          uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
          goto code_r0x000180b107a6;
        }
        if (uVar17 == uVar10 + 0x41) {
          abStack_128[0] = cVar14 + bVar13 + ' ' + (bVar13 & cVar14 + 0x50U) * -2;
          uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
          goto code_r0x000180b107a6;
        }
        if (uVar11 < uVar10 + 0x4e) {
          abStack_128[0] = bVar13 + (cVar14 - 0x1eU) + -0x2e + (bVar13 & cVar14 - 0x1eU) * -2;
          goto code_r0x000180b0ffcb;
        }
        uVar16 = uVar10 + 0x4a;
        if (uVar11 < uVar10 + 0x54) {
          abStack_128[0] = bVar13 + (cVar14 - 0x32U) + '^' + (bVar13 & cVar14 - 0x32U) * -2;
          goto code_r0x000180b10003;
        }
        uVar17 = uVar11;
        if (uVar11 < uVar10 + 0x8c) {
          abStack_128[0] = (bVar13 - 0x16) + cVar14 + 0xbaU + (cVar14 + 0xbaU & bVar13) * -2;
          goto code_r0x000180b10033;
        }
        if (uVar11 < uVar10 + 0x44a) {
          abStack_128[0] = bVar13 + 0x76 + cVar14 + 0xa6U + (cVar14 + 0xa6U & bVar13) * -2;
          goto code_r0x000180b10081;
        }
        if (uVar11 < uVar10 + 0xa4) break;
        if (uVar10 + 0xae <= uVar11) {
          uVar17 = uVar10 + 0x4f;
          uVar16 = uVar10 + 0x104f;
          if (uVar10 + 0x105f < uVar17) {
            bVar3 = cVar14 + 0x10;
            cVar14 = cVar14 + bVar13 + -0x60;
            goto code_r0x000180b10792;
          }
          if (uVar10 + 0x10b3 < uVar17) {
            abStack_128[0] = bVar13 + 0x18 + cVar14 + (bVar13 & cVar14 - 4U) * -2;
            goto code_r0x000180b10761;
          }
          if (uVar10 + 0x204f < uVar17) {
            bVar3 = cVar14 - 0x18;
            cVar15 = bVar13 + 0x90;
            goto code_r0x000180b10733;
          }
          if (uVar10 + 0x1079 < uVar17) {
            abStack_128[0] = cVar14 + bVar13 + '\b' + (bVar13 & cVar14 - 0x2cU) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
            goto code_r0x000180b107a6;
          }
          if (uVar10 + 0x1054 < uVar17) {
            abStack_128[0] = cVar14 + bVar13 + -0x80 + (bVar13 & cVar14 - 0x40U) * -2;
            uVar17 = uVar17 + uVar16;
            uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
            goto code_r0x000180b107a6;
          }
          if (uVar10 + 0x10cf < uVar17) {
            bVar3 = cVar14 + 0x70;
            cVar15 = bVar13 + 0x60;
            goto code_r0x000180b106fd;
          }
          if (uVar17 <= uVar10 + 0x10b0) {
            uVar17 = uVar10 + 0x106f;
            uVar16 = uVar10 + 0x1070;
          }
        }
      }
      abStack_128[0] = bVar13 + 2 + cVar14 + 0x92U + (cVar14 + 0x92U & bVar13) * -2;
    }
    if (uVar17 < uVar16 + 0x5a) {
      abStack_128[0] = bVar13 + 0x3c + cVar14 + (cVar14 - 10U & bVar13) * -2;
code_r0x000180b1040f:
      if (uVar16 + uVar17 == 0x2a) {
        abStack_128[0] = cVar14 + -0x28 + (cVar14 - 0x24U & bVar13) * -2;
code_r0x000180b1073e:
        bVar3 = bVar13 + 0x14 + (cVar14 - 0x2eU & bVar13) * -2 + cVar14;
        abStack_118[uVar19] = bVar3;
        uVar16 = uVar16 + 1;
        uVar19 = (uVar19 - uVar16) - (ulonglong)bVar3;
code_r0x000180b10761:
        abStack_118[uVar19] = (char)uVar19 + 'P' + bVar13 + ((char)uVar19 - 0x38U & bVar13) * -2;
        uVar17 = uVar17 + 1;
        uVar19 = uVar19 + ~uVar17;
code_r0x000180b1079a:
        uVar19 = uVar19 + abStack_118[uVar19] + uVar16;
      }
      else if (uVar16 + 100 < uVar17) {
        abStack_128[0] = bVar13 + 0x4c + cVar14 + (cVar14 + 0x9eU & bVar13) * -2;
code_r0x000180b10441:
        if (uVar17 < 6) {
          if (uVar16 + 0x61 < uVar17) {
            abStack_128[0] = bVar13 + 0x38 + cVar14 + (cVar14 - 0x34U & bVar13) * -2;
          }
          else {
            if (uVar17 == uVar16 + 1) {
              bVar3 = cVar14 + 0xb8;
              cVar14 = cVar14 + bVar13 + -0x50;
              goto code_r0x000180b10792;
            }
            if (uVar17 == uVar16 + 3) {
              bVar3 = cVar14 + 0x90;
              cVar15 = bVar13 + 0xa0;
code_r0x000180b10733:
              abStack_128[0] = cVar15 + cVar14 + (bVar3 & bVar13) * -2;
              goto code_r0x000180b1073e;
            }
            if (uVar17 == uVar16 + 4) {
              abStack_128[0] = cVar14 + bVar13 + -0x80 + (cVar14 + 0x40U & bVar13) * -2;
              uVar19 = uVar19 - 1;
              goto code_r0x000180b107a6;
            }
            if (uVar17 == uVar16 + 9) {
              bVar3 = cVar14 + 0x18;
              cVar15 = bVar13 + 0x70;
              goto code_r0x000180b106fd;
            }
          }
          if (0x27 < uVar16) {
            abStack_128[0] = ((bVar13 - 0x18) + cVar14 + (cVar14 + 4U & bVar13) * -2) * '\x02';
            goto code_r0x000180b10705;
          }
          abStack_118[uVar19] = abStack_128[0];
        }
        else {
          abStack_128[0] = bVar13 * '\x02' + cVar14 + (cVar14 - 0x10U & bVar13) * -2 + '`';
code_r0x000180b1069f:
          abStack_118[uVar19] =
               bVar13 + (cVar14 - 0x1aU & bVar13) * -2 + -100 + cVar14 + abStack_128[0];
          uVar17 = uVar17 + uVar16;
          uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
        }
      }
      else {
        if (uVar17 == uVar16 + 1) {
          bVar3 = cVar14 + 0x8a;
          cVar15 = bVar13 - 0x3c;
          goto code_r0x000180b106fd;
        }
        if (uVar17 == uVar16 + 3) {
          abStack_128[0] = cVar14 + bVar13 + -0x4c + (cVar14 + 0x62U & bVar13) * -2;
          uVar19 = uVar19 - 1;
        }
        else {
          if (uVar17 != uVar16 + 5) {
            if (uVar17 != uVar16 + 2) goto code_r0x000180b10441;
            abStack_128[0] = bVar13 + 0xc + cVar14 + (cVar14 - 2U & bVar13) * -2;
            goto code_r0x000180b10761;
          }
          abStack_128[0] = cVar14 + bVar13 + '\x1c' + (cVar14 + 0x26U & bVar13) * -2;
          uVar19 = (uVar19 - 1) - (ulonglong)abStack_128[0];
        }
      }
    }
    else {
      if (uVar17 == uVar16 + 1) {
        bVar3 = cVar14 + 0x5c;
        cVar14 = cVar14 + bVar13 + -0x28;
code_r0x000180b10792:
        abStack_128[0] = cVar14 + (bVar3 & bVar13) * -2;
        goto code_r0x000180b1079a;
      }
      if (uVar17 == uVar16 + 3) {
        abStack_128[0] = cVar14 + bVar13 + -0x58 + (cVar14 - 0x1cU & bVar13) * -2;
        uVar19 = uVar19 - 1;
        goto code_r0x000180b107a6;
      }
      if (uVar17 != uVar16 + 2) goto code_r0x000180b1040f;
      bVar3 = cVar14 + 0xbc;
      cVar15 = bVar13 + 0x98;
code_r0x000180b106fd:
      abStack_128[0] = cVar15 + cVar14 + (bVar13 & bVar3) * -2;
code_r0x000180b10705:
      abStack_118[uVar19] = bVar13 + 0x24 + (cVar14 - 6U & bVar13) * -2 + cVar14;
      uVar19 = uVar19 - 1;
      uVar16 = uVar16 + 1;
    }
code_r0x000180b107a6:
  }
  uVar6 = FUN_1801a9d10(alStack_98,pbVar20,alStack_c0);
  FUN_1801a4a90(uVar6);
  func_0x000180194370(alStack_98);
  func_0x000180194370(alStack_c0);
  lVar7 = lStack_68;
  lVar18 = alStack_c0[4];
  if (lStack_68 != 0) {
    uVar6 = FUN_1801d5120(*(undefined8 *)(alStack_c0[4] + 0xb8));
    uVar11 = FUN_1801ac540(uVar6,lVar7 + 0x70);
    if (0x7ff700000000 < uVar11) {
      lStack_60 = 0;
      lStack_58 = 0;
      uStack_50 = 0;
      lVar7 = FUN_1801d5120(*(undefined8 *)(lVar18 + 0xb8));
      lStack_60 = 0;
      lStack_58 = 0;
      uStack_50 = 0;
      uStack_c8 = 7;
      if (lVar7 != 0) {
        alStack_98[0] = 0;
        alStack_98[1] = 0;
        uStack_88 = 0;
        uStack_84 = 0;
        uStack_82 = 0;
        uStack_80 = 0;
        uStack_7a = 0;
        uStack_78 = 0;
        uStack_72 = 0;
        uStack_70 = 0;
        lVar8 = VirtualQueryEx(lVar7,uVar11,alStack_98,0x30);
        if (lVar8 != 0) {
          uVar16 = (CONCAT26(uStack_7a,uStack_80) + alStack_98[0]) - uVar11;
          if (0x4000 < uVar16) {
            uVar16 = 0x4000;
          }
          if (uVar16 != 0) {
            FUN_1801ab9d0(&lStack_60,uVar16,abStack_128);
            lStack_68 = 0;
            plStack_138 = &lStack_68;
            iVar4 = ReadProcessMemory(lVar7,uVar11,lStack_60,lStack_58 - lStack_60);
            if ((iVar4 == 0) || (lStack_68 == 0)) {
              if (lStack_60 != lStack_58) {
                lStack_58 = lStack_60;
              }
            }
            else {
              FUN_1801ab9d0(&lStack_60,lStack_68,abStack_128);
              uVar11 = 0;
              if (lStack_58 != lStack_60) {
                do {
                  if (*(char *)(lStack_60 + uVar11) == -0x34) {
                    FUN_1801ab9d0(&lStack_60,uVar11,abStack_128);
                    break;
                  }
                  uVar11 = uVar11 + 1;
                } while (uVar11 < (ulonglong)(lStack_58 - lStack_60));
              }
            }
          }
        }
      }
      lVar8 = lStack_58;
      lVar7 = lStack_60;
      if (lStack_60 != lStack_58) {
        uVar6 = *(undefined8 *)(lVar18 + 0xa0);
        uVar9 = FUN_1801d5120(*(undefined8 *)(lVar18 + 0xb8));
        FUN_180b15b10(uVar9,lVar7,lVar8 - lVar7,uVar6);
      }
      func_0x0001801b1500(&lStack_60);
    }
  }
  FUN_180e155e0(uStack_40 ^ (ulonglong)auStack_158);
  return;
code_r0x000180b0f7a0:
  while( true ) {
    do {
      if (uVar11 == uVar17 + 0x7a) {
        bVar13 = bVar2 + 0x90;
        cVar14 = bVar3 + 0xa0;
        goto code_r0x000180b0fcec;
      }
      if (uVar11 == uVar17 + 6) {
        bVar13 = bVar2 + bVar3 + (bVar3 & bVar2 + 0x80) * -2;
        uVar17 = uVar17 + 1;
        goto code_r0x000180b0f693;
      }
      if (uVar11 == uVar17 + 100) {
        bVar13 = bVar2 + bVar3 + '`' + (bVar3 & bVar2 + 0x70) * -2;
        goto code_r0x000180b0f693;
      }
      if (uVar11 == uVar17 + 0x5a) {
        bVar13 = bVar2 + 0x50;
        cVar14 = bVar2 + bVar3 + ' ';
        goto code_r0x000180b0fd8e;
      }
      if (uVar11 == uVar17 + 9) {
        bVar13 = bVar2 + 0x30;
        cVar14 = bVar3 - 0x20;
        goto code_r0x000180b0fdb6;
      }
      if (uVar11 == uVar17 + 0x200) {
        bVar13 = bVar2 + 0x20;
        goto code_r0x000180b0fb01;
      }
    } while (uVar11 == uVar17 + 1);
    uVar11 = uVar17 + 10;
    if (uVar11 < uVar17 + 0x3f3) {
      bVar13 = bVar3 + bVar2 + 0x68 + '(' + (bVar3 & bVar2 + 0x68) * -2;
      goto code_r0x000180b0f680;
    }
    uVar16 = uVar17 + 0xb;
    if (uVar11 < uVar17 + 0xd) {
      bVar13 = bVar3 + bVar2 + 0x58 + -0x68 + (bVar3 & bVar2 + 0x58) * -2;
      goto code_r0x000180b0f690;
    }
    if (uVar11 < uVar17 + 0x2b) break;
    if (uVar11 < uVar17 + 0x100b) {
      bVar13 = bVar2 + 0x18;
      cVar14 = bVar3 + 0x70;
      uVar17 = uVar16;
      goto code_r0x000180b0fa0e;
    }
    if (uVar11 < uVar17 + 0xf) {
      bVar13 = bVar2 + 8;
      cVar14 = bVar3 - 0x30;
      uVar17 = uVar16;
      goto code_r0x000180b0f9a6;
    }
    if (uVar11 < uVar17 + 0x4b) {
      bVar13 = bVar2 + bVar3 + -0x70 + (bVar3 & bVar2 - 0x18) * -2;
      uVar17 = uVar16;
      goto code_r0x000180b0f986;
    }
    uVar11 = uVar17 + 0x10;
    uVar16 = uVar17 + 0x8a;
    if (uVar17 + 0xcc < uVar11) {
      bVar13 = bVar2 + 0x40;
      cVar14 = bVar2 + bVar3 + -0x80;
      uVar17 = uVar16;
      goto code_r0x000180b0fe2a;
    }
    if (uVar17 + 0xcb < uVar11) {
      bVar13 = bVar2 + 0x20;
      cVar14 = bVar3 + 0x40;
      uVar17 = uVar16;
      goto code_r0x000180b0fdb6;
    }
    if (uVar17 + 0x92 < uVar11) {
      bVar13 = bVar2 + bVar3 + -0x60 + (bVar3 & bVar2 + 0x10) * -2;
      uVar19 = uVar19 - bVar13;
      uVar17 = uVar16;
      goto code_r0x000180b0f693;
    }
    if (uVar17 + 0x10a < uVar11) {
      bVar13 = bVar2 - 0x10 & bVar3;
      cVar14 = bVar3 + 0x60;
      uVar17 = uVar16;
      goto code_r0x000180b0fd4a;
    }
    if (uVar17 + 0xb4 < uVar11) {
      bVar13 = bVar2 + bVar3 + ' ' + (bVar2 - 0x30 & bVar3) * -2;
      uVar17 = uVar17 + 0x8b;
      goto code_r0x000180b0f693;
    }
    if (uVar17 + 0x94 < uVar11) {
      bVar13 = bVar2 - 0x40;
      cVar14 = bVar3 + 0x80;
      uVar17 = uVar16;
      goto code_r0x000180b0fcec;
    }
    uVar11 = uVar17 + 0x8b;
    uVar17 = uVar17 + 0x473;
  }
  bVar13 = bVar3 + 0x78 + bVar2 + 0x38 + (bVar3 & bVar2 + 0x38) * -2;
  uVar17 = uVar16;
  goto code_r0x000180b0f734;
}

