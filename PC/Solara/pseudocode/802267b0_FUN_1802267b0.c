/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1802267b0(longlong *param_1,longlong param_2)

{
  int *piVar1;
  ulonglong uVar2;
  byte bVar3;
  code *pcVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  byte bVar8;
  ulonglong *puVar9;
  undefined8 uVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  int iVar16;
  ulonglong uVar17;
  byte bVar18;
  char cVar19;
  char cVar20;
  ulonglong uVar21;
  longlong *plVar22;
  undefined1 uStack0000000000000000;
  undefined1 auStack_1c8 [32];
  undefined8 uStack_1a8;
  longlong lStack_198;
  longlong lStack_190;
  undefined4 uStack_188;
  undefined4 uStack_184;
  undefined8 uStack_180;
  ulonglong uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  ulonglong uStack_160;
  longlong lStack_158;
  longlong lStack_150;
  longlong lStack_148;
  longlong lStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined4 uStack_128;
  undefined4 uStack_124;
  undefined4 uStack_120;
  undefined4 uStack_11c;
  undefined8 uStack_118;
  longlong lStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  uint uStack_f8;
  undefined4 uStack_f4;
  undefined4 uStack_f0;
  undefined4 uStack_ec;
  byte abStack_e8 [8];
  undefined8 auStack_e0 [3];
  undefined1 uStack_c8;
  undefined1 uStack_c7;
  undefined2 uStack_c6;
  undefined4 uStack_c4;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  longlong lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  uint uStack_88;
  undefined4 uStack_84;
  undefined8 uStack_80;
  longlong alStack_78 [2];
  undefined8 uStack_68;
  ulonglong uStack_60;
  ulonglong uStack_58;
  
  uStack_58 = _DAT_1810c1700 ^ (ulonglong)auStack_1c8;
  lStack_158 = param_2;
  if (&uStack0000000000000000 == (undefined1 *)0x0) {
    (*(code *)0xffffffffffffff20)();
    (*(code *)0x0)();
  }
  if ((char)param_1[9] == '\0') {
    lStack_198 = -0x6f7f7d606377610d;
    lStack_190 = 0xf1eff9919881b9f9;
    uStack_188 = 0xf2eec1ef;
    uStack_184 = 0xe2f1cdf0;
    uStack_180 = 0x2be4e6e6;
    plVar22 = &lStack_198;
    bVar18 = abStack_e8[0];
code_r0x000180226857:
    puVar9 = (ulonglong *)func_0x000180b36780();
    uVar17 = *puVar9;
    puVar9 = (ulonglong *)func_0x000180b36790();
    uVar14 = *puVar9;
code_r0x000180226890:
    uVar15 = uVar14;
    for (uVar21 = 0; uVar21 < 0x20; uVar21 = uVar21 + 1) {
      bVar3 = *(byte *)((longlong)&lStack_198 + uVar21);
      cVar20 = (char)uVar21;
code_r0x0001802268d0:
      if (uVar21 < uVar17) {
        plVar22 = (longlong *)(auStack_1c8 + 0xc93fa7);
        break;
      }
      if (uVar17 < uVar15 + 1) {
        bVar18 = (bVar3 & cVar20 + 0x33U) * -2 + -0x65 + bVar3 + cVar20 + 0x33U;
      }
      else {
        if (uVar17 == uVar15 + 1) {
          bVar18 = cVar20 + bVar3 + 'j' + (cVar20 + 0x99U & bVar3) * -2;
          goto code_r0x000180227221;
        }
        if (uVar17 == uVar15 + 3) {
          bVar18 = cVar20 + bVar3 + '\x12' + (bVar3 & cVar20 - 3U) * -2;
          uVar21 = uVar21 - 1;
          goto code_r0x00018022722d;
        }
      }
LAB_180226911:
      if (uVar21 < uVar15) {
        plVar22 = (longlong *)(auStack_1c8 + 0x1410e74);
        break;
      }
      if (uVar15 + 10 <= uVar17) {
        if (uVar17 == uVar15 + 1) {
          bVar18 = cVar20 + 0x95;
          cVar19 = bVar3 + 0x82;
          goto code_r0x0001802271c3;
        }
        if (uVar17 != uVar15 + 3) {
          if (uVar17 != uVar15 + 5) {
            if (uVar17 != uVar15 + 7) goto code_r0x000180226970;
            bVar18 = cVar20 - 7;
            cVar19 = bVar3 + 0x2a;
            goto code_r0x000180227117;
          }
          bVar18 = cVar20 + 0x2d;
          cVar20 = cVar20 + bVar3 + -0xe;
          goto code_r0x00018022717f;
        }
        bVar18 = cVar20 + bVar3 + -0x46 + (bVar3 & cVar20 + 0x61U) * -2;
        uVar21 = uVar21 - 1;
        goto code_r0x00018022722d;
      }
      bVar18 = bVar3 + 0xb7 + cVar20 + 0x2fU + (cVar20 + 0x2fU & bVar3) * -2;
code_r0x000180226970:
      while (uVar14 = uVar15, uVar21 < uVar15 + uVar17) {
        while( true ) {
          do {
            uVar15 = uVar14;
            if (uVar17 == uVar15 + 0x400) {
              bVar18 = cVar20 - 0x16;
              cVar19 = bVar3 + 0x84;
              goto code_r0x0001802271c3;
            }
            if (uVar17 == uVar15 + 0x28) {
              bVar18 = cVar20 + bVar3 + ' ' + (bVar3 & cVar20 + 0x50U) * -2;
              uVar15 = uVar15 + 1;
              uVar21 = uVar21 - 1;
              goto code_r0x00018022722d;
            }
            if (uVar17 == uVar15 + 0x61) {
              bVar18 = cVar20 + bVar3 + -0x44 + (bVar3 & cVar20 + 0xb6U) * -2;
              uVar21 = uVar21 - 1;
              goto code_r0x00018022722d;
            }
            if (uVar17 == uVar15 + 5) {
              bVar18 = cVar20 + 0x1c;
              cVar19 = bVar3 + 0x58;
              goto code_r0x0001802270c4;
            }
            if (uVar17 == uVar15 + 0x42) {
              bVar18 = cVar20 + 0x82;
              cVar20 = cVar20 + bVar3 + -0xc;
              goto code_r0x00018022717f;
            }
            if (uVar17 == uVar15 + 0x41) {
              bVar18 = cVar20 + bVar3 + -0x70 + (bVar3 & cVar20 - 0x18U) * -2;
              uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
              goto code_r0x00018022722d;
            }
            if (uVar17 == uVar15 + 0x80) {
              bVar18 = cVar20 + 0x4e;
              cVar19 = bVar3 + 0x2c;
              goto code_r0x000180227117;
            }
            if (uVar17 == uVar15 + 0x2a) {
              bVar18 = (bVar3 - 0x38) + cVar20 + (bVar3 & cVar20 + 0xb4U) * -2;
              goto code_r0x000180227148;
            }
            if (uVar17 == uVar15 + 10) {
              bVar18 = cVar20 + bVar3 + 'd' + (bVar3 & cVar20 + 0x1aU) * -2;
              goto code_r0x000180227221;
            }
            uVar14 = uVar15;
          } while (uVar17 == uVar15 + 1000);
          uVar17 = uVar15 + 0x10;
          if (uVar17 < uVar15 + 0x33) {
            bVar18 = bVar3 + cVar20 + 0x19U + 'Q' + (bVar3 & cVar20 + 0x19U) * -2;
            goto code_r0x000180226857;
          }
          uVar14 = uVar15 + 0x30;
          if (uVar17 < uVar15 + 0x58) {
            bVar18 = bVar3 + cVar20 + 0x7fU + -0x79 + (bVar3 & cVar20 + 0x7fU) * -2;
            goto code_r0x000180226890;
          }
          if (uVar17 < uVar15 + 0x91) {
            bVar18 = bVar3 + 0xbd + (cVar20 - 0x1bU) + (cVar20 - 0x1bU & bVar3) * -2;
            uVar15 = uVar14;
            goto code_r0x0001802268d0;
          }
          if (uVar17 < uVar15 + 0x35) {
            bVar18 = (bVar3 - 0xd) + cVar20 + 0x4bU + (cVar20 + 0x4bU & bVar3) * -2;
            uVar15 = uVar14;
            goto LAB_180226911;
          }
          if (uVar17 < uVar15 + 0x72) break;
          if (uVar17 < uVar15 + 0x38) {
            bVar18 = cVar20 + 0x17;
            cVar19 = bVar3 + 0x76;
            uVar15 = uVar14;
            goto code_r0x000180226d37;
          }
          if (uVar17 < uVar15 + 0xb0) {
            bVar18 = cVar20 + 0x7d;
            cVar19 = bVar3 + 0x12;
            uVar15 = uVar14;
            goto code_r0x000180226cf5;
          }
          if (uVar17 < uVar15 + 0x5a) {
            bVar18 = cVar20 - 0x1d;
            cVar19 = bVar3 + 0xae;
            uVar15 = uVar14;
            goto code_r0x000180226cbc;
          }
          if (uVar17 < uVar15 + 0x3a) {
            bVar18 = cVar20 + bVar3 + 'J' + (bVar3 & cVar20 + 0x49U) * -2;
            uVar15 = uVar14;
            goto code_r0x000180226c9f;
          }
          if (uVar15 + 0x418 <= uVar17) {
            uVar17 = uVar15 + 0x430;
            uVar14 = uVar15 + 0x450;
            if (uVar15 + 0x453 < uVar17) {
              bVar18 = cVar20 + bVar3 + 'P' + (bVar3 & cVar20 + 0x48U) * -2;
              uVar15 = uVar14;
              goto code_r0x000180227221;
            }
            if (uVar15 + 0x478 < uVar17) {
              bVar18 = (bVar3 - 0x14) + cVar20 + (bVar3 & cVar20 + 0xaeU) * -2;
              uVar15 = uVar14;
              goto code_r0x000180227148;
            }
            if (uVar15 + 0x4b1 < uVar17) {
              bVar18 = cVar20 + 0x14;
              cVar19 = bVar3 + 0x88;
              uVar15 = uVar14;
              goto code_r0x000180227117;
            }
            if (uVar15 + 0x455 < uVar17) {
              bVar18 = cVar20 + bVar3 + '$' + (bVar3 & cVar20 + 0x7aU) * -2;
              uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
              uVar15 = uVar14;
              goto code_r0x00018022722d;
            }
            if (uVar15 + 0x491 < uVar17) {
              bVar18 = cVar20 - 0x20;
              cVar20 = cVar20 + bVar3 + -0x40;
              uVar15 = uVar14;
              goto code_r0x00018022717f;
            }
            if (uVar15 + 0x458 < uVar17) {
              bVar18 = cVar20 + 0x46;
              cVar19 = bVar3 + 0x5c;
              uVar15 = uVar14;
              goto code_r0x0001802270c4;
            }
            if (uVar15 + 0x4d0 < uVar17) {
              bVar18 = cVar20 + bVar3 + -8 + (bVar3 & cVar20 + 0xacU) * -2;
              uVar21 = uVar21 - 1;
              uVar15 = uVar14;
              goto code_r0x00018022722d;
            }
            if (uVar15 + 0x47a < uVar17) {
              bVar18 = cVar20 + bVar3 + -0x6c + (bVar3 & cVar20 + 0x12U) * -2;
              uVar21 = uVar21 - 1;
              uVar15 = uVar15 + 0x451;
              goto code_r0x00018022722d;
            }
            if (uVar15 + 0x45a < uVar17) {
              bVar18 = cVar20 + 0x78;
              cVar19 = bVar3 + 0x30;
              uVar15 = uVar14;
              goto code_r0x0001802271c3;
            }
            if (uVar17 <= uVar15 + 0x452) {
              uVar17 = uVar15 + 0x850;
              uVar14 = uVar15 + 0x870;
            }
          }
        }
        bVar18 = bVar3 + 0x29 + cVar20 + 0xb1U + (cVar20 + 0xb1U & bVar3) * -2;
        uVar15 = uVar14;
      }
      if (uVar17 < uVar15 + 0x200) {
        bVar18 = cVar20 + 0x33;
        cVar19 = bVar3 - 0x32;
code_r0x000180226d37:
        bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180226d3d:
        if (uVar15 + uVar17 == 0x5a) {
          bVar18 = bVar3 & cVar20 + 0x1eU;
          cVar19 = cVar20 + 'L';
          goto code_r0x000180227120;
        }
        if (uVar17 <= uVar15 + 0x2a) {
          if (uVar17 == uVar15 + 1) {
            bVar18 = cVar20 + 0x8d;
            cVar19 = bVar3 + 0xb2;
code_r0x0001802271c3:
            bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
            goto code_r0x0001802271d1;
          }
          if (uVar17 == uVar15 + 3) {
            bVar18 = cVar20 + bVar3 + -0x16 + (cVar20 + 0x59U & bVar3) * -2;
            uVar21 = uVar21 - 1;
            goto code_r0x00018022722d;
          }
          if (uVar17 == uVar15 + 5) {
            bVar18 = cVar20 + 0x25;
            cVar20 = cVar20 + bVar3 + '\"';
            goto code_r0x00018022717f;
          }
          if (uVar17 == uVar15 + 4) {
            bVar18 = cVar20 - 0xf;
            cVar19 = bVar3 + 0x5a;
code_r0x000180227117:
            bVar18 = bVar3 & bVar18;
            goto code_r0x00018022711d;
          }
          if (uVar17 == uVar15 + 7) {
            bVar18 = (bVar3 - 10) + cVar20 + (bVar3 & cVar20 + 0x57U) * -2;
            goto code_r0x000180227148;
          }
          if (uVar17 != uVar15 + 2) goto code_r0x000180226cfb;
          bVar18 = cVar20 + bVar3 + -0x6e + (bVar3 & cVar20 + 0xbdU) * -2;
          goto code_r0x000180227221;
        }
        bVar18 = cVar20 + 0x27;
        cVar19 = bVar3 + 0x16;
code_r0x000180226cf5:
        bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180226cfb:
        if (8 < uVar17) {
          bVar18 = cVar20 + 0xb8;
          cVar19 = bVar3 * '\x02' + -0x50;
          goto code_r0x0001802270c4;
        }
        if (uVar15 + 0x2a < uVar17) {
          bVar18 = cVar20 + 0x56;
          cVar19 = bVar3 - 4;
code_r0x000180226cbc:
          bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180226cc2:
          if (uVar15 < 9) {
code_r0x000180226c9f:
            *(byte *)((longlong)&lStack_198 + uVar21) = bVar18;
          }
          else {
            bVar18 = (bVar3 + 0x14 + cVar20 + (bVar3 & cVar20 + 0x52U) * -2) * '\x02';
code_r0x0001802271d1:
            *(byte *)((longlong)&lStack_198 + uVar21) =
                 (bVar3 - 0x1e) + (cVar20 + 0x85U & bVar3) * -2 + cVar20;
            uVar21 = uVar21 - 1;
            uVar15 = uVar15 + 1;
          }
        }
        else {
          if (uVar17 == uVar15 + 1) {
            bVar18 = cVar20 + bVar3 + -0x68 + (bVar3 & cVar20 + 0xbcU) * -2;
            goto code_r0x000180227221;
          }
          if (uVar17 == uVar15 + 3) {
            bVar18 = cVar20 + 0x88U & bVar3;
            cVar19 = bVar3 - 0x30;
            goto code_r0x00018022711d;
          }
          if (uVar17 == uVar15 + 5) {
            bVar18 = cVar20 + 0x54;
            cVar20 = cVar20 + bVar3 + '\b';
            goto code_r0x00018022717f;
          }
          if (uVar17 == uVar15 + 4) {
            bVar18 = cVar20 + bVar3 + '@' + (bVar3 & cVar20 + 0x20U) * -2;
            uVar21 = uVar21 - 1;
          }
          else {
            if (uVar17 != uVar15 + 7) {
              if (uVar17 == uVar15 + 2) {
                bVar18 = cVar20 - 0x14;
                cVar19 = bVar3 + 0x78;
                goto code_r0x0001802271c3;
              }
              goto code_r0x000180226cc2;
            }
            bVar18 = cVar20 + bVar3 + -0x24 + (bVar3 & cVar20 + 0x86U) * -2;
            uVar15 = uVar15 + 1;
            uVar21 = uVar21 - 1;
          }
        }
      }
      else {
        if (uVar17 == uVar15 + 1) {
          bVar18 = cVar20 + bVar3 + -0x34 + (bVar3 & cVar20 + 0x5eU) * -2;
        }
        else {
          if (uVar17 != uVar15 + 3) {
            if (uVar17 == uVar15 + 2) {
              bVar18 = cVar20 - 10;
              cVar20 = cVar20 + bVar3 + '<';
code_r0x00018022717f:
              bVar18 = cVar20 + (bVar3 & bVar18) * -2;
              uVar17 = uVar17 + uVar15;
              uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
            }
            else if (uVar17 == uVar15 + 5) {
              bVar18 = cVar20 + 0x5c;
              cVar19 = bVar3 - 0x28;
code_r0x0001802270c4:
              bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
              *(byte *)((longlong)&lStack_198 + uVar21) =
                   bVar3 + 0x7e + (cVar20 - 0x15U & bVar3) * -2 + cVar20 + bVar18;
              uVar17 = uVar17 + uVar15;
              uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
            }
            else if (uVar17 == uVar15 + 4) {
              bVar18 = cVar20 + bVar3 + 't' + (bVar3 & cVar20 - 0x3eU) * -2;
              uVar21 = uVar21 - 1;
            }
            else {
              if (uVar17 != uVar15 + 7) goto code_r0x000180226d3d;
              bVar18 = cVar20 + bVar3 + '\x10' + (bVar3 & cVar20 + 0x28U) * -2;
              uVar15 = uVar15 + 1;
              uVar21 = uVar21 - 1;
            }
            goto code_r0x00018022722d;
          }
          bVar18 = cVar20 + 0x2aU & bVar3;
          cVar19 = bVar3 + 4;
code_r0x00018022711d:
          cVar19 = cVar19 + cVar20;
code_r0x000180227120:
          bVar18 = cVar19 + bVar18 * -2;
          bVar8 = bVar3 + 0x1a + (cVar20 + 0x51U & bVar3) * -2 + cVar20;
          *(byte *)((longlong)&lStack_198 + uVar21) = bVar8;
          uVar21 = (uVar21 - (uVar15 + 1)) - (ulonglong)bVar8;
          uVar15 = uVar15 + 1;
code_r0x000180227148:
          *(byte *)((longlong)&lStack_198 + uVar21) =
               (char)uVar21 + -0x18 + bVar3 + ((char)uVar21 + 0x84U & bVar3) * -2;
          uVar17 = uVar17 + 1;
          uVar21 = uVar21 + ~uVar17;
        }
code_r0x000180227221:
        uVar21 = uVar21 + *(byte *)((longlong)&lStack_198 + uVar21) + uVar15;
      }
code_r0x00018022722d:
    }
    uStack_178 = 0;
    uStack_170 = 0;
    uStack_168 = 0;
    uStack_160 = 0;
    uVar10 = FUN_180f29c00(plVar22);
    FUN_180191ab0(&uStack_178,plVar22,uVar10);
    FUN_1801a4a90(&uStack_178);
    FUN_180195980(&uStack_178);
    cVar20 = (char)param_1[9];
    param_2 = lStack_158;
    while (lStack_158 = param_2, cVar20 == '\0') {
      auStack_e0[0] = 1;
      FUN_1801ac590(auStack_e0);
      param_2 = lStack_158;
      cVar20 = (char)param_1[9];
    }
  }
  if (*(char *)(*param_1 + 0x270) != '\0') {
    cVar20 = *(char *)(*param_1 + 0x270);
    while (cVar20 != '\0') {
      auStack_e0[0] = 1;
      FUN_1801ac590(auStack_e0);
      cVar20 = *(char *)(*param_1 + 0x270);
    }
  }
  uVar10 = FUN_1801d5120(*param_1);
  if (param_1[1] != 0) {
    LOCK();
    piVar1 = (int *)(param_1[1] + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_158 = *param_1;
  lStack_150 = param_1[1];
  FUN_18026ecd0(alStack_78,&lStack_158,param_2);
  if (param_1[1] != 0) {
    LOCK();
    piVar1 = (int *)(param_1[1] + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_148 = *param_1;
  lStack_140 = param_1[1];
  lVar11 = FUN_1801d0cf0(&lStack_148,alStack_78,10);
  uStack_178 = 0;
  uStack_170 = 0;
  uStack_168 = 0;
  uStack_160 = 0;
  FUN_180191ab0(&uStack_178,&UNK_180f485d4,1);
  if (param_1[1] != 0) {
    LOCK();
    piVar1 = (int *)(param_1[1] + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
  }
  lStack_198 = *param_1;
  lStack_190 = param_1[1];
  lVar12 = FUN_1801d0cf0(&lStack_198,&uStack_178,10);
  if (0xf < uStack_160) {
    if (uStack_160 + 1 < 0x1000) {
      lVar13 = 1;
      uVar17 = uStack_178;
code_r0x0001802274a6:
      func_0x000180e15340(uVar17,lVar13 + uStack_160);
      goto code_r0x0001802274af;
    }
    if ((uStack_178 - *(ulonglong *)(uStack_178 - 8)) - 8 < 0x20) {
      lVar13 = 0x28;
      uVar17 = *(ulonglong *)(uStack_178 - 8);
      goto code_r0x0001802274a6;
    }
code_r0x0001802281a5:
    pcVar4 = (code *)swi(0x29);
    (*pcVar4)(5);
code_r0x0001802281ac:
    pcVar4 = (code *)swi(0x29);
    (*pcVar4)(5);
    pcVar4 = (code *)swi(3);
    (*pcVar4)();
    return;
  }
code_r0x0001802274af:
  uStack_168 = 0;
  uStack_160 = 0xf;
  uStack_178 = uStack_178 & 0xffffffffffffff00;
  uStack_c8 = 0;
  uStack_c7 = 0;
  uStack_c0 = 0;
  uStack_b8 = 0;
  uStack_b0 = 0;
  uStack_a8 = 0;
  lStack_a0 = 0;
  uStack_98 = 0;
  uStack_90 = 0;
  uStack_88 = uStack_88 & 0xffffff00;
  uStack_84 = 0;
  uStack_80 = 0;
  uStack_1a8 = 0;
  ReadProcessMemory(uVar10,param_1[2],&uStack_c8,0x50);
  uVar7 = uStack_90;
  uVar6 = uStack_98;
  uStack_1a8 = 0;
  ReadProcessMemory(uVar10,lVar11 + 0x10,auStack_e0,8);
  uStack_b8 = auStack_e0[0];
  uStack_a8 = uStack_68;
  uStack_1a8 = 0;
  ReadProcessMemory(uVar10,lVar12 + 0x10,auStack_e0,8);
  uStack_b0 = auStack_e0[0];
  uVar5 = uStack_b0;
  lStack_110 = param_1[4];
  uStack_84 = 0;
  uStack_c8 = 1;
  uStack_138 = CONCAT44(uStack_c4,CONCAT22(uStack_c6,CONCAT11(uStack_c7,1)));
  uStack_130 = uStack_c0;
  uStack_b0._0_4_ = (undefined4)auStack_e0[0];
  uStack_b0._4_4_ = (undefined4)((ulonglong)auStack_e0[0] >> 0x20);
  uStack_128 = (undefined4)uStack_b8;
  uStack_124 = uStack_b8._4_4_;
  uStack_120 = (undefined4)uStack_b0;
  uStack_11c = uStack_b0._4_4_;
  uStack_118 = uStack_a8;
  uStack_108 = uVar6;
  uStack_100 = uVar7;
  uStack_f8 = uStack_88;
  uStack_f4 = 0;
  uStack_f0 = (undefined4)uStack_80;
  uStack_ec = uStack_80._4_4_;
  uStack_1a8 = 0;
  uStack_b0 = uVar5;
  lStack_a0 = lStack_110;
  WriteProcessMemory(uVar10,param_1[2],&uStack_138,0x50);
  iVar16 = 0;
  do {
    uStack_1a8 = 0;
    ReadProcessMemory(uVar10,param_1[2],abStack_e8);
    if (abStack_e8[0] == 2) {
      uStack_1a8 = 0;
      ReadProcessMemory(uVar10,param_1[2] + 0x44,auStack_e0,8);
      abStack_e8[0] = 0;
      uStack_1a8 = 0;
      WriteProcessMemory(uVar10,param_1[2],abStack_e8,1);
      goto code_r0x000180228133;
    }
    auStack_e0[0] = 1;
    FUN_1801ac590(auStack_e0);
    iVar16 = iVar16 + 1;
  } while (iVar16 < 5000);
  lStack_198 = -0x5d5c2a629c58895d;
  lStack_190 = -0x53278a53555c2a2f;
  uStack_188 = 0x73acaea1;
  uStack_184 = 0x6fe0e2a3;
  uStack_180 = 0;
  plVar22 = &lStack_198;
  bVar18 = abStack_e8[0];
code_r0x000180227662:
  puVar9 = (ulonglong *)func_0x000180b36780();
  uVar17 = *puVar9;
  puVar9 = (ulonglong *)func_0x000180b36790();
  uVar14 = *puVar9;
code_r0x0001802276a0:
  uVar15 = uVar14;
  for (uVar21 = 0; uVar21 < 0x20; uVar21 = uVar21 + 1) {
    bVar3 = *(byte *)((longlong)&lStack_198 + uVar21);
    cVar20 = (char)uVar21;
code_r0x0001802276d0:
    if (uVar21 < uVar17) {
      plVar22 = (longlong *)(auStack_1c8 + 0x40709f);
      break;
    }
    if (uVar17 < uVar15 + 1) {
      bVar18 = (cVar20 + 0xbU & bVar3) * -2 + -0x4d + cVar20 + 0xbU + bVar3;
    }
    else {
      if (uVar17 == uVar15 + 1) {
        bVar18 = cVar20 + 0x21;
        cVar20 = cVar20 + bVar3 + ':';
        goto code_r0x000180227f87;
      }
      if (uVar17 == uVar15 + 5) {
        bVar18 = cVar20 + 0x79;
        cVar20 = cVar20 + bVar3 + '*';
code_r0x000180227f61:
        bVar18 = cVar20 + (bVar3 & bVar18) * -2;
        uVar17 = uVar17 + uVar15;
        uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
        goto code_r0x000180227f9e;
      }
      if (uVar17 == uVar15 + 3) {
        bVar18 = cVar20 + bVar3 + '\"' + (bVar3 & cVar20 + 0xa5U) * -2;
        uVar21 = uVar21 - 1;
        goto code_r0x000180227f9e;
      }
      if (uVar17 == uVar15 + 2) {
        bVar18 = cVar20 + bVar3 + -0x62 + (bVar3 & cVar20 + 0xbbU) * -2;
        uVar15 = uVar15 + 1;
        uVar21 = uVar21 - 1;
        goto code_r0x000180227f9e;
      }
    }
code_r0x000180227730:
    if (uVar21 < uVar15) {
      plVar22 = (longlong *)(auStack_1c8 + 0x1564394);
      break;
    }
    if (uVar15 + 10 <= uVar17) {
      if (uVar17 == uVar15 + 1) {
        bVar18 = cVar20 - 3;
        cVar19 = bVar3 + 0x12;
        goto code_r0x000180227ee9;
      }
      if (uVar17 != uVar15 + 3) {
        if (uVar17 == uVar15 + 7) {
          bVar18 = cVar20 + 0x81;
          cVar19 = bVar3 - 6;
          goto code_r0x000180227e68;
        }
        if (uVar17 == uVar15 + 5) {
          bVar18 = bVar3 + 0x76 + cVar20 + (bVar3 & cVar20 + 0x97U) * -2;
          goto code_r0x000180227e93;
        }
        if (uVar17 != uVar15 + 2) goto code_r0x0001802277a0;
        bVar18 = cVar20 + 0xad;
        cVar20 = cVar20 + bVar3 + -0xe;
        goto code_r0x000180227f87;
      }
      bVar18 = cVar20 + bVar3 + '~' + (bVar3 & cVar20 + 0x6bU) * -2;
      uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
      goto code_r0x000180227f9e;
    }
    bVar18 = bVar3 + 0xaf + (cVar20 - 0x19U) + (bVar3 & cVar20 - 0x19U) * -2;
code_r0x0001802277a0:
    while (uVar14 = uVar15, uVar21 < uVar15 + uVar17) {
      while( true ) {
        do {
          uVar15 = uVar14;
          if (uVar17 == uVar15 + 4) {
            bVar18 = cVar20 + 0xba;
            cVar19 = bVar3 + 0xa4;
            goto code_r0x000180227ee9;
          }
          if (uVar17 == uVar15 + 100) {
            bVar18 = cVar20 + bVar3 + ' ' + (bVar3 & cVar20 - 0x30U) * -2;
            uVar15 = uVar15 + 1;
            uVar21 = uVar21 - 1;
            goto code_r0x000180227f9e;
          }
          if (uVar17 == uVar15 + 0x200) {
            bVar18 = cVar20 + bVar3 + -100 + (bVar3 & cVar20 - 0x1aU) * -2;
            uVar21 = uVar21 - 1;
            goto code_r0x000180227f9e;
          }
          if (uVar17 == uVar15 + 3) {
            bVar18 = cVar20 - 4;
            cVar19 = bVar3 + 0x18;
            goto code_r0x000180227de6;
          }
          if (uVar17 == uVar15 + 0x42) {
            bVar18 = cVar20 + 0x12;
            cVar20 = cVar20 + bVar3 + -0x6c;
            goto code_r0x000180227f61;
          }
          if (uVar17 == uVar15 + 0x2a) {
            bVar18 = cVar20 + bVar3 + '\x10' + (bVar3 & cVar20 + 0x28U) * -2;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
            goto code_r0x000180227f9e;
          }
          if (uVar17 == uVar15 + 2) {
            bVar18 = cVar20 + 0x3e;
            cVar19 = bVar3 + 0x8c;
            goto code_r0x000180227e68;
          }
          if (uVar17 == uVar15 + 0x40) {
            bVar18 = bVar3 + 8 + cVar20 + (bVar3 & cVar20 + 0x54U) * -2;
            goto code_r0x000180227e93;
          }
          if (uVar17 == uVar15 + 0x5a) {
            bVar18 = cVar20 + 0x6a;
            cVar20 = cVar20 + bVar3 + -0x7c;
            goto code_r0x000180227f87;
          }
          uVar14 = uVar15;
        } while (uVar17 == uVar15 + 0x10);
        uVar17 = uVar15 + 0x20;
        if (uVar17 < uVar15 + 0xc2) {
          bVar18 = bVar3 + cVar20 + 0xa1U + -0x67 + (bVar3 & cVar20 + 0xa1U) * -2;
          goto code_r0x000180227662;
        }
        uVar14 = uVar15 + 0x48;
        uVar2 = uVar15 + 0x51;
        if (uVar17 < uVar2) {
          bVar18 = bVar3 + cVar20 + 0xb7U + -1 + (bVar3 & cVar20 + 0xb7U) * -2;
          goto code_r0x0001802276a0;
        }
        if (uVar17 < uVar15 + 0x58) {
          bVar18 = bVar3 + 0x65 + (cVar20 - 0x33U) + (bVar3 & cVar20 - 0x33U) * -2;
          uVar15 = uVar14;
          goto code_r0x0001802276d0;
        }
        if (uVar17 < uVar15 + 0xa9) {
          bVar18 = (bVar3 - 0x35) + (cVar20 - 0x1dU) + (bVar3 & cVar20 - 0x1dU) * -2;
          uVar15 = uVar14;
          goto code_r0x000180227730;
        }
        if (uVar17 < uVar15 + 0x50) break;
        if (uVar17 < uVar15 + 0x430) {
          bVar18 = cVar20 + 0xf;
          cVar19 = bVar3 + 0xa6;
          uVar15 = uVar14;
          goto code_r0x000180227b4a;
        }
        if (uVar17 < uVar15 + 0x1048) {
          bVar18 = cVar20 + 0x25;
          cVar19 = bVar3 + 0x22;
          uVar15 = uVar14;
          goto code_r0x000180227b09;
        }
        if (uVar17 < uVar15 + 0x4e) {
          bVar18 = bVar3 + 0x9e + cVar20 + (bVar3 & cVar20 + 0x3bU) * -2;
          uVar15 = uVar14;
          goto code_r0x000180227ace;
        }
        if (uVar17 < uVar15 + 0x248) {
          bVar18 = cVar20 + bVar3 + '\x1a' + (bVar3 & cVar20 + 0x51U) * -2;
          uVar15 = uVar14;
          goto code_r0x000180227aab;
        }
        if (uVar15 + 0x4b <= uVar17) {
          uVar17 = uVar15 + 0x4c;
          if (uVar15 + 0xb5 < uVar17) {
            bVar18 = cVar20 + 0x88;
            cVar20 = cVar20 + bVar3 + -0x30;
            uVar15 = uVar2;
            goto code_r0x000180227f87;
          }
          if (uVar15 + 0x52 < uVar17) {
            bVar18 = bVar3 + 0x4c + cVar20 + (bVar3 & cVar20 + 0x9eU) * -2;
            uVar15 = uVar2;
            goto code_r0x000180227e93;
          }
          if (uVar15 + 0x54 < uVar17) {
            bVar18 = cVar20 + 0xb4;
            cVar19 = bVar3 - 0x38;
            uVar15 = uVar2;
            goto code_r0x000180227e68;
          }
          if (uVar15 + 0x93 < uVar17) {
            bVar18 = cVar20 + bVar3 + 'D' + (bVar3 & cVar20 - 0x36U) * -2;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
            uVar15 = uVar2;
            goto code_r0x000180227f9e;
          }
          if (uVar15 + 0x7b < uVar17) {
            bVar18 = cVar20 - 0x20;
            cVar20 = cVar20 + bVar3 + -0x40;
            uVar15 = uVar2;
            goto code_r0x000180227f61;
          }
          if (uVar15 + 0x71 < uVar17) {
            bVar18 = cVar20 - 10;
            cVar19 = bVar3 + 0x3c;
            uVar15 = uVar2;
            goto code_r0x000180227de6;
          }
          if (uVar15 + 0x91 < uVar17) {
            bVar18 = cVar20 + bVar3 + -0x48 + (bVar3 & cVar20 + 0xcU) * -2;
            uVar21 = uVar21 - 1;
            uVar15 = uVar2;
            goto code_r0x000180227f9e;
          }
          if (uVar15 + 0xab < uVar17) {
            bVar18 = cVar20 + bVar3 + '4' + (bVar3 & cVar20 + 0x22U) * -2;
            uVar21 = uVar21 - 1;
            uVar15 = uVar15 + 0x52;
            goto code_r0x000180227f9e;
          }
          if (uVar15 + 0x61 < uVar17) {
            bVar18 = cVar20 + 0x38;
            cVar19 = bVar3 + 0xb0;
            uVar15 = uVar2;
            goto code_r0x000180227ee9;
          }
          uVar14 = uVar2;
          if (uVar17 <= uVar15 + 0xb2) {
            uVar17 = uVar15 + 0xcb;
            uVar14 = uVar15 + 0x10c;
          }
        }
      }
      bVar18 = bVar3 + 0x31 + (cVar20 - 7U) + (bVar3 & cVar20 - 7U) * -2;
      uVar15 = uVar14;
    }
    if (uVar17 < uVar15 + 1) {
      bVar18 = cVar20 + 0xb;
      cVar19 = bVar3 + 0xbe;
code_r0x000180227b4a:
      bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180227b50:
      if (uVar15 + uVar17 == 9) {
        bVar18 = cVar20 + 0x8e;
        cVar19 = cVar20 + -0x54;
code_r0x000180227e6b:
        bVar18 = cVar19 + (bVar3 & bVar18) * -2;
        bVar8 = bVar3 + 0x6a + (cVar20 + 0x99U & bVar3) * -2 + cVar20;
        *(byte *)((longlong)&lStack_198 + uVar21) = bVar8;
        uVar21 = (uVar21 - (uVar15 + 1)) - (ulonglong)bVar8;
        uVar15 = uVar15 + 1;
code_r0x000180227e93:
        *(byte *)((longlong)&lStack_198 + uVar21) =
             (char)uVar21 + '(' + bVar3 + ((char)uVar21 + 0xa4U & bVar3) * -2;
        uVar17 = uVar17 + 1;
        uVar21 = uVar21 + ~uVar17;
        goto code_r0x000180227f92;
      }
      if (uVar15 + 10 < uVar17) {
        bVar18 = cVar20 + 0x9f;
        cVar19 = bVar3 + 0x46;
code_r0x000180227b09:
        bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180227b0f:
        if (uVar17 != 0) {
          bVar18 = cVar20 + 0x78;
          cVar19 = bVar3 * '\x02' + '0';
          goto code_r0x000180227de6;
        }
        if (uVar15 == 0xffffffffffffffff) {
          bVar18 = cVar20 + 0x9c;
          cVar20 = cVar20 + bVar3 + 'X';
          goto code_r0x000180227f87;
        }
        if (uVar15 == 0xfffffffffffffffe) {
          bVar18 = cVar20 - 0x38;
          cVar19 = bVar3 + 0x50;
          uVar17 = 0;
code_r0x000180227e68:
          cVar19 = cVar19 + cVar20;
          goto code_r0x000180227e6b;
        }
        if (uVar15 == 0xfffffffffffffffb) {
          bVar18 = cVar20 + 10;
          cVar19 = bVar3 - 0x3c;
          goto code_r0x000180227de6;
        }
        if (uVar15 == 0xfffffffffffffffd) {
          bVar18 = cVar20 + bVar3 + -0x44 + (bVar3 & cVar20 + 0x36U) * -2;
          uVar15 = 0xfffffffffffffffe;
          uVar21 = uVar21 - 1;
        }
        else {
code_r0x000180227ace:
          if (0x3ff < uVar15) {
            bVar18 = (bVar3 + 0x62 + cVar20 + (bVar3 & cVar20 + 0x62U) * -2) * '\x02' + 0xa4;
            goto code_r0x000180227ef7;
          }
code_r0x000180227aab:
          *(byte *)((longlong)&lStack_198 + uVar21) = bVar18;
        }
      }
      else if (uVar17 == uVar15 + 1) {
        bVar18 = cVar20 + 0xb5;
        cVar19 = bVar3 - 0x3e;
code_r0x000180227ee9:
        bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180227ef7:
        *(byte *)((longlong)&lStack_198 + uVar21) =
             bVar3 + 0x72 + (cVar20 + 0x6dU & bVar3) * -2 + cVar20;
        uVar21 = uVar21 - 1;
        uVar15 = uVar15 + 1;
      }
      else {
        if (uVar17 != uVar15 + 3) {
          if (uVar17 != uVar15 + 5) {
            if (uVar17 != uVar15 + 2) goto code_r0x000180227b0f;
            bVar18 = cVar20 + 0x65;
            cVar20 = cVar20 + bVar3 + -0x5e;
            goto code_r0x000180227f87;
          }
          bVar18 = bVar3 + 0x26 + cVar20 + (bVar3 & cVar20 + 0x4fU) * -2;
          goto code_r0x000180227e93;
        }
        bVar18 = cVar20 + bVar3 + -0x46 + (cVar20 - 0x1fU & bVar3) * -2;
        uVar21 = uVar21 - 1;
      }
    }
    else if (uVar17 == uVar15 + 1) {
      bVar18 = cVar20 - 0x32;
      cVar20 = cVar20 + bVar3 + ',';
code_r0x000180227f87:
      bVar18 = cVar20 + (bVar3 & bVar18) * -2;
code_r0x000180227f92:
      uVar21 = uVar21 + *(byte *)((longlong)&lStack_198 + uVar21) + uVar15;
    }
    else if (uVar17 == uVar15 + 2) {
      bVar18 = cVar20 + bVar3 + -0x60 + (cVar20 + 0x10U & bVar3) * -2;
      uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
    }
    else if (uVar17 == uVar15 + 6) {
      bVar18 = cVar20 + 0x3c;
      cVar19 = bVar3 + 0x98;
code_r0x000180227de6:
      bVar18 = cVar19 + cVar20 + (bVar3 & bVar18) * -2;
      *(byte *)((longlong)&lStack_198 + uVar21) =
           bVar3 + (cVar20 + 0x83U & bVar3) * -2 + -0x12 + cVar20 + bVar18;
      uVar17 = uVar17 + uVar15;
      uVar21 = (uVar21 - 1) - (ulonglong)bVar18;
    }
    else {
      if (uVar17 != uVar15 + 4) goto code_r0x000180227b50;
      bVar18 = cVar20 + bVar3 + '\x14' + (bVar3 & cVar20 + 0x52U) * -2;
      uVar21 = uVar21 - 1;
    }
code_r0x000180227f9e:
  }
  uStack_178 = 0;
  uStack_170 = 0;
  uStack_168 = 0;
  uStack_160 = 0;
  uVar10 = FUN_180f29c00(plVar22);
  FUN_180191ab0(&uStack_178,plVar22,uVar10);
  FUN_1801a4a90(&uStack_178);
  if (0xf < uStack_160) {
    if (uStack_160 + 1 < 0x1000) {
      func_0x000180e15340(uStack_178,uStack_160 + 1,uStack_178);
    }
    else {
      if (0x1f < (uStack_178 - *(longlong *)(uStack_178 - 8)) - 8) goto code_r0x0001802281a5;
      func_0x000180e15340(*(longlong *)(uStack_178 - 8),uStack_160 + 0x28);
    }
  }
code_r0x000180228133:
  lVar11 = 0x28;
  if (0xf < uStack_60) {
    if (uStack_60 + 1 < 0x1000) {
      lVar11 = 1;
      lVar12 = alStack_78[0];
    }
    else {
      lVar12 = *(longlong *)(alStack_78[0] + -8);
      if (0x1f < (alStack_78[0] - lVar12) - 8U) goto code_r0x0001802281ac;
    }
    func_0x000180e15340(lVar12,uStack_60 + lVar11);
  }
  FUN_180e155e0(uStack_58 ^ (ulonglong)auStack_1c8);
  return;
}

