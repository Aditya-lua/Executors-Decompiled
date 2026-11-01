/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void Start(char *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulonglong uVar1;
  ulonglong uVar2;
  byte bVar3;
  code *pcVar4;
  byte bVar5;
  undefined8 uVar6;
  ulonglong *puVar7;
  longlong lVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  byte *pbVar12;
  byte bVar13;
  char cVar14;
  byte bVar15;
  char cVar16;
  longlong lVar17;
  undefined1 *puVar18;
  ulonglong uVar19;
  ulonglong uVar20;
  bool bVar21;
  int iStack_63c;
  undefined1 auStack_598 [32];
  undefined4 uStack_578;
  byte bStack_568;
  undefined *puStack_558;
  undefined8 uStack_550;
  char *pcStack_548;
  byte abStack_4c8 [336];
  byte abStack_378 [120];
  longlong alStack_300 [8];
  undefined1 auStack_2c0 [372];
  int iStack_14c;
  longlong lStack_148;
  undefined1 auStack_140 [128];
  longlong lStack_c0;
  undefined *apuStack_a0 [13];
  ulonglong uStack_38;
  
                    /* 0xaecac0  1  Start */
  uStack_38 = _DAT_1810c1700 ^ (ulonglong)auStack_598;
  pcStack_548 = param_1;
  SetUnhandledExceptionFilter(FUN_1802b8450);
  puStack_558 = &UNK_180f475bc;
  uStack_550 = 3;
  FUN_180191f70(auStack_2c0,&puStack_558,0);
  puStack_558 = (undefined *)0x0;
  uStack_550 = 0x1810bc020;
  FUN_180195bf0(auStack_2c0,&puStack_558);
  if ((int)puStack_558 != 0) {
    puVar18 = auStack_2c0;
    FUN_180289580(&UNK_180f4d5a8);
    FUN_180e15c30();
    if (_DAT_1810cec88 == -1) {
      _DAT_1810cec30 = 0;
      _DAT_1810cec81 = 0;
      _DAT_1810cec85 = 0;
      DAT_1810cec87 = 0;
      uRam00000001810cec40 = 0;
      _DAT_1810cec50 = 0xf;
      _DAT_1810cec38 = 0;
      uRam00000001810cec60 = 0;
      _DAT_1810cec70 = 0xf;
      _DAT_1810cec58 = 0;
      DAT_1810cec80 = 0;
      _DAT_1810cec48 = param_1;
      _DAT_1810cec68 = param_1;
      _DAT_1810cec78 = param_1;
      FUN_180e15ad0(FUN_180f42f60);
      FUN_180e15bc0();
    }
    uVar10 = uRam00000001802e07c0;
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
      iStack_63c = 0x20;
      uVar9 = uVar10;
      do {
        LOCK();
        bVar21 = *(int *)(uVar9 + 0x1fc) == 0;
        if (bVar21) {
          *(int *)(uVar9 + 0x1fc) = 1;
        }
        UNLOCK();
        if (bVar21) {
          *(undefined8 *)(uVar9 + 0x210) = 0x180000000;
          *(undefined8 *)(uVar9 + 0x220) = 0x180000000;
          *(longlong *)(uVar9 + 0x208) = *(longlong *)(uVar9 + 0x1d8) + 0x56e0f8;
                    /* WARNING: Could not recover jumptable at 0x0001803691fa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (**(code **)(~(~*(ulonglong *)(uVar9 + 0x1f0) - 0x601) - 1))
                    (0x180000000,0x56e0f8,puVar18,param_4);
          return;
        }
        uVar9 = uVar9 + 0x1000;
        iStack_63c = iStack_63c + -1;
      } while (iStack_63c != 0);
    } while( true );
  }
  FUN_1801959f0(auStack_2c0);
  FUN_180f297c0(&lStack_148,0,0x108);
  uStack_578 = 1;
  FUN_180193560(&lStack_148,&UNK_180f46b58,0x10);
  if (lStack_c0 != 0) {
    uVar6 = FUN_18019a0b0(&lStack_148,&UNK_180f4e398);
    FUN_18019b180(uVar6);
    uVar6 = FUN_18019a0b0(&lStack_148,&UNK_180f4e3b0);
    FUN_18019b180(uVar6);
    uVar6 = FUN_18019a0b0(&lStack_148,&UNK_180f4e3c8);
    FUN_18019b180(uVar6);
  }
  *(undefined **)(auStack_140 + (longlong)*(int *)(lStack_148 + 4) + -8) = &UNK_180f469e0;
  *(int *)((longlong)&iStack_14c + (longlong)*(int *)(lStack_148 + 4)) =
       *(int *)(lStack_148 + 4) + -0xa8;
  FUN_1801941e0(auStack_140);
  *(undefined **)(auStack_140 + (longlong)*(int *)(lStack_148 + 4) + -8) = &UNK_180f46898;
  *(int *)((longlong)&iStack_14c + (longlong)*(int *)(lStack_148 + 4)) =
       *(int *)(lStack_148 + 4) + -0x10;
  apuStack_a0[0] = &UNK_180f46830;
  FUN_180e12cf0(apuStack_a0);
  if (((DAT_1810cefe1 != '\0') || (param_1 == (char *)0x0)) || (*param_1 == '\0')) {
    abStack_4c8[0] = 0xab;
    abStack_4c8[1] = 0x52;
    abStack_4c8[2] = 0x56;
    abStack_4c8[3] = 0x4a;
    abStack_4c8[4] = 0x56;
    abStack_4c8[5] = 0x55;
    abStack_4c8[6] = 0xb3;
    abStack_4c8[7] = 0x77;
    abStack_4c8[8] = 0x55;
    abStack_4c8[9] = 0xa1;
    abStack_4c8[10] = 0xac;
    abStack_4c8[0xb] = 0xbe;
    abStack_4c8[0xc] = 0xb1;
    abStack_4c8[0xd] = 0xbd;
    abStack_4c8[0xe] = 0xa7;
    abStack_4c8[0xf] = 0x7f;
    abStack_4c8[0x10] = 0xa3;
    abStack_4c8[0x11] = 0xa1;
    abStack_4c8[0x12] = 0xbb;
    abStack_4c8[0x13] = 0xa5;
    abStack_4c8[0x14] = 0xa4;
    abStack_4c8[0x15] = 0xb4;
    abStack_4c8[0x16] = 0xca;
    abStack_4c8[0x17] = 7;
    abStack_4c8[0x18] = 0xd7;
    abStack_4c8[0x19] = 0xdb;
    abStack_4c8[0x1a] = 2;
    abStack_4c8[0x1b] = 0xca;
    abStack_4c8[0x1c] = 0xd2;
    abStack_4c8[0x1d] = 0xdb;
    abStack_4c8[0x1e] = 0xcf;
    abStack_4c8[0x1f] = 0xdb;
    abStack_4c8[0x20] = 0xc5;
    abStack_4c8[0x21] = 0xc1;
    abStack_4c8[0x22] = 10;
    abStack_4c8[0x23] = 0x20;
    abStack_4c8[0x24] = 0x35;
    abStack_4c8[0x25] = 0x20;
    abStack_4c8[0x26] = 0x3a;
    abStack_4c8[0x27] = 0x77;
    abStack_4c8[0x28] = 0;
    abStack_4c8[0x29] = 0;
    abStack_4c8[0x2a] = 0;
    abStack_4c8[0x2b] = 0;
    abStack_4c8[0x2c] = 0;
    abStack_4c8[0x2d] = 0;
    abStack_4c8[0x2e] = 0;
    abStack_4c8[0x2f] = 0;
    abStack_4c8[0x30] = 0;
    abStack_4c8[0x31] = 0;
    abStack_4c8[0x32] = 0;
    abStack_4c8[0x33] = 0;
    abStack_4c8[0x34] = 0;
    bVar13 = bStack_568;
LAB_180af13d8:
    puVar7 = (ulonglong *)func_0x000180b36780();
    uVar10 = *puVar7;
    puVar7 = (ulonglong *)func_0x000180b36790();
    uVar9 = *puVar7;
LAB_180af1420:
    uVar20 = 0;
    uVar19 = uVar9;
    uVar11 = uVar10;
    do {
      if (0x34 < uVar20) {
        pbVar12 = abStack_4c8;
LAB_180af1e7f:
        alStack_300[0] = 0;
        alStack_300[1] = 0;
        alStack_300[2] = 0;
        alStack_300[3] = 0;
        uVar6 = FUN_180f29c00(pbVar12);
        FUN_180191ab0(alStack_300,pbVar12,uVar6);
        FUN_1801a4a90(alStack_300);
        if (0xf < (ulonglong)alStack_300[3]) {
          if (alStack_300[3] + 1U < 0x1000) {
            lVar8 = 1;
            lVar17 = alStack_300[0];
          }
          else {
            if (0x1f < (alStack_300[0] - *(longlong *)(alStack_300[0] + -8)) - 8U) {
              pcVar4 = (code *)swi(0x29);
              (*pcVar4)(5);
              pcVar4 = (code *)swi(3);
              (*pcVar4)();
              return;
            }
            lVar8 = 0x28;
            lVar17 = *(longlong *)(alStack_300[0] + -8);
          }
          func_0x000180e15340(lVar17,alStack_300[3] + lVar8);
        }
        FUN_180e155e0(uStack_38 ^ (ulonglong)auStack_598);
        return;
      }
      bVar3 = abStack_4c8[uVar20];
      cVar14 = (char)uVar20;
LAB_180af1445:
      if (uVar20 < uVar11) {
        pbVar12 = &stack0x00904d1a;
        goto LAB_180af1e7f;
      }
      if (uVar19 + 1 <= uVar11) {
        if (uVar11 == uVar19 + 1) {
          bVar13 = cVar14 - 2;
          cVar14 = cVar14 + bVar3 + '\f';
          goto LAB_180af1d98;
        }
        if (uVar11 == uVar19 + 3) {
          bVar13 = cVar14 + 0xa6;
          cVar16 = bVar3 + 0x1c;
          goto LAB_180af1d2d;
        }
        if (uVar11 == uVar19 + 5) {
          bVar13 = cVar14 + 0x4e;
          cVar14 = cVar14 + bVar3 + ',';
          goto LAB_180af1d0b;
        }
        if (uVar11 != uVar19 + 6) goto LAB_180af14a0;
        bVar13 = cVar14 + 0x9e;
        cVar16 = bVar3 + 0x4c;
LAB_180af1ccb:
        bVar13 = bVar3 & bVar13;
        goto LAB_180af1cd1;
      }
      bVar13 = (cVar14 + 0xaaU & bVar3) * -2 + 'Z' + cVar14 + 0xaaU + bVar3;
LAB_180af14a0:
      if (uVar20 < uVar19) {
        pbVar12 = &stack0x01481170;
        goto LAB_180af1e7f;
      }
      if (uVar19 + 0x61 <= uVar11) {
        if (uVar11 != uVar19 + 1) {
          if (uVar11 == uVar19 + 3) {
            bVar13 = cVar14 + 0x42;
            cVar16 = bVar3 + 0x74;
LAB_180af1c7b:
            bVar13 = bVar3 & bVar13;
            goto LAB_180af1c81;
          }
          if (uVar11 != uVar19 + 5) {
            if (uVar11 != uVar19 + 6) {
              if (uVar11 != uVar19 + 2) goto LAB_180af1510;
              bVar13 = cVar14 + bVar3 + -100 + (bVar3 & cVar14 - 0x1aU) * -2;
              goto LAB_180af1da0;
            }
            bVar13 = bVar3 & cVar14 + 0x3eU;
            cVar16 = bVar3 + 0x8c;
            goto LAB_180af1d30;
          }
          bVar13 = cVar14 + bVar3 + -0x7c + (bVar3 & cVar14 - 0x16U) * -2;
          uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
          goto LAB_180af1daf;
        }
        bVar13 = cVar14 + 0x46;
        cVar16 = bVar3 + 0x5c;
        goto LAB_180af1ccb;
      }
      bVar13 = bVar3 + 0x62 + (cVar14 - 0xeU) + (cVar14 - 0xeU & bVar3) * -2;
LAB_180af1510:
      while (uVar9 = uVar19, uVar20 < uVar19 + uVar11) {
        while( true ) {
          do {
            uVar19 = uVar9;
            if (uVar11 == uVar19 + 0x2a) {
              bVar13 = cVar14 + 0xc;
              cVar16 = bVar3 + 0xb8;
              goto LAB_180af1ccb;
            }
            if (uVar11 == uVar19 + 0x5a) {
              bVar13 = cVar14 + bVar3 + -0x40 + (bVar3 & cVar14 + 0x60U) * -2;
              uVar19 = uVar19 + 1;
              uVar20 = uVar20 - 1;
              goto LAB_180af1daf;
            }
            if (uVar11 == uVar19 + 0x42) {
              bVar13 = cVar14 + bVar3 + -0x38 + (bVar3 & cVar14 + 0xb4U) * -2;
              uVar20 = uVar20 - 1;
              goto LAB_180af1daf;
            }
            if (uVar11 == uVar19 + 0x40) {
              bVar13 = cVar14 + 8;
              cVar16 = bVar3 - 0x30;
              goto LAB_180af1c7b;
            }
            if (uVar11 == uVar19 + 3) {
              bVar13 = cVar14 + bVar3 + -0x28 + (bVar3 & cVar14 + 0x5cU) * -2;
              uVar11 = uVar11 + uVar19;
              uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
              goto LAB_180af1daf;
            }
            if (uVar11 == uVar19 + 2) {
              bVar13 = cVar14 + bVar3 + -0x20 + (bVar3 & cVar14 + 0xb0U) * -2;
              uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
              goto LAB_180af1daf;
            }
            uVar10 = uVar19 + 0x200;
            if (uVar11 == uVar10) {
              bVar13 = bVar3 & cVar14 + 4U;
              cVar16 = bVar3 - 0x18;
              goto LAB_180af1d30;
            }
            if (uVar11 == uVar19 + 0x80) {
              bVar13 = (bVar3 - 0x10) + cVar14 + (bVar3 & cVar14 + 0x58U) * -2;
              goto LAB_180af1d61;
            }
            if (uVar11 == uVar19 + 6) {
              bVar13 = cVar14 + bVar3 + -8 + (bVar3 & cVar14 + 0xacU) * -2;
              goto LAB_180af1da0;
            }
            uVar9 = uVar19;
          } while (uVar11 == uVar19 + 5);
          if (uVar10 < uVar19 + 0x1208) {
            bVar13 = bVar3 + (cVar14 - 2U) + '\x0e' + (bVar3 & cVar14 - 2U) * -2;
            goto LAB_180af13d8;
          }
          uVar9 = uVar19 + 0x1200;
          if (uVar10 < uVar19 + 0x1206) {
            bVar13 = bVar3 + cVar14 + 0x52U + -0x3e + (bVar3 & cVar14 + 0x52U) * -2;
            goto LAB_180af1420;
          }
          uVar11 = uVar10;
          if (uVar10 < uVar19 + 0x1261) {
            bVar13 = bVar3 + 0x76 + cVar14 + 0xa6U + (cVar14 + 0xa6U & bVar3) * -2;
            uVar19 = uVar9;
            goto LAB_180af1445;
          }
          if (uVar10 < uVar19 + 0x2200) {
            bVar13 = bVar3 + 0x2a + (cVar14 - 6U) + (cVar14 - 6U & bVar3) * -2;
            uVar19 = uVar9;
            goto LAB_180af14a0;
          }
          if (uVar10 < uVar19 + 0x1210) break;
          if (uVar10 < uVar19 + 0x120a) {
            bVar13 = cVar14 + 0xa2;
            cVar16 = '4';
            uVar19 = uVar9;
            goto LAB_180af18fe;
          }
          uVar1 = uVar19 + 0x125a;
          if (uVar10 < uVar1) {
            bVar13 = cVar14 - 10;
            cVar16 = '<';
            goto LAB_180af18bf;
          }
          if (uVar10 < uVar19 + 0x1241) {
            bVar13 = cVar14 + 0x4a;
            cVar16 = 'D';
            uVar19 = uVar9;
            goto LAB_180af1883;
          }
          uVar2 = uVar19 + 0x127a;
          if (uVar10 < uVar2) {
            bVar13 = cVar14 + bVar3 + 'L' + (bVar3 & cVar14 + 0x9eU) * -2;
            uVar19 = uVar9;
            goto LAB_180af1866;
          }
          if (uVar19 + 0x1228 <= uVar10) {
            uVar11 = uVar1;
            if (uVar19 + 0x12bc < uVar1) {
              bVar13 = cVar14 + bVar3 + '`' + (bVar3 & cVar14 - 0x10U) * -2;
              uVar19 = uVar2;
              goto LAB_180af1da0;
            }
            if (uVar19 + 0x12ba < uVar1) {
              bVar13 = bVar3 + 0x68 + cVar14 + (bVar3 & cVar14 + 0x44U) * -2;
              uVar19 = uVar2;
              goto LAB_180af1d61;
            }
            if (uVar19 + 0x127d < uVar1) {
              bVar13 = bVar3 & cVar14 + 0x98U;
              cVar16 = bVar3 + 0x70;
              uVar19 = uVar2;
              goto LAB_180af1d30;
            }
            if (uVar19 + 0x127c < uVar1) {
              bVar13 = cVar14 + bVar3 + 'x' + (bVar3 & cVar14 - 0x14U) * -2;
              uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
              uVar19 = uVar2;
              goto LAB_180af1daf;
            }
            if (uVar19 + 0x147a < uVar1) {
              bVar13 = cVar14 + bVar3 + -0x80 + (bVar3 & cVar14 + 0x40U) * -2;
              uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
              uVar19 = uVar2;
              uVar11 = uVar1 + uVar2;
              goto LAB_180af1daf;
            }
            if (uVar19 + 0x12fa < uVar1) {
              bVar13 = cVar14 + 0x94;
              cVar16 = bVar3 + 0x88;
              uVar19 = uVar2;
              goto LAB_180af1c7b;
            }
            if (uVar19 + 0x12de < uVar1) {
              bVar13 = cVar14 + bVar3 + -0x70 + (bVar3 & cVar14 - 0x18U) * -2;
              uVar20 = uVar20 - 1;
              uVar19 = uVar2;
              goto LAB_180af1daf;
            }
            if (uVar19 + 0x127f < uVar1) {
              bVar13 = cVar14 + bVar3 + -0x68 + (bVar3 & cVar14 + 0x3cU) * -2;
              uVar20 = uVar20 - 1;
              uVar19 = uVar19 + 0x127b;
              goto LAB_180af1daf;
            }
            if (uVar19 + 0x127e < uVar1) {
              bVar13 = cVar14 + 0x90;
              cVar16 = bVar3 + 0xa0;
              uVar19 = uVar2;
              goto LAB_180af1ccb;
            }
            uVar9 = uVar2;
            if (uVar1 <= uVar19 + 0x167a) {
              uVar11 = uVar19 + 0x1280;
              uVar9 = uVar19 + 0x1668;
            }
          }
        }
        bVar13 = (bVar3 - 0x22) + cVar14 + 0x4eU + (cVar14 + 0x4eU & bVar3) * -2;
        uVar19 = uVar9;
      }
      if (uVar11 < uVar19 + 0x80) {
        bVar13 = cVar14 + 0xaa;
        cVar16 = '\x04';
LAB_180af18fe:
        bVar13 = bVar3 + cVar16 + cVar14 + (bVar3 & bVar13) * -2;
        uVar9 = uVar19;
        uVar10 = uVar11;
LAB_180af1904:
        if (uVar9 + uVar10 == 9) {
          bVar13 = cVar14 + -0x58 + (bVar3 & cVar14 + 100U) * -2;
LAB_180af1d38:
          bVar5 = bVar3 + 0xac + (cVar14 + 0xeU & bVar3) * -2 + cVar14;
          abStack_4c8[uVar20] = bVar5;
          uVar20 = (uVar20 - (uVar9 + 1)) - (ulonglong)bVar5;
          uVar19 = uVar9 + 1;
          uVar11 = uVar10;
LAB_180af1d61:
          abStack_4c8[uVar20] = (char)uVar20 + -0x50 + bVar3 + ((char)uVar20 + 0xb8U & bVar3) * -2;
          uVar20 = uVar20 + ~(uVar11 + 1);
          uVar11 = uVar11 + 1;
LAB_180af1da0:
          uVar20 = uVar20 + abStack_4c8[uVar20] + uVar19;
        }
        else if (uVar9 + 0x1000 < uVar10) {
          bVar13 = cVar14 + 0x82;
          cVar16 = -0xc;
LAB_180af18bf:
          bVar13 = bVar3 + cVar16 + cVar14 + (bVar3 & bVar13) * -2;
          uVar19 = uVar9;
          uVar11 = uVar10;
LAB_180af18c5:
          if (99 < uVar11) {
            bVar13 = bVar3 * '\x02' + -0x60 + cVar14 + (bVar3 & cVar14 + 0x10U) * -2;
            goto LAB_180af1c89;
          }
          if (uVar19 + 2 < uVar11) {
            bVar13 = cVar14 + 0x74;
            cVar16 = 'H';
LAB_180af1883:
            bVar13 = bVar3 + cVar16 + cVar14 + (bVar3 & bVar13) * -2;
LAB_180af1889:
            if (0x79 < uVar19) {
              bVar13 = (bVar3 + 0x98 + cVar14 + (bVar3 & cVar14 + 0xbcU) * -2) * '\x02';
              goto LAB_180af1cd9;
            }
LAB_180af1866:
            abStack_4c8[uVar20] = bVar13;
          }
          else {
            if (uVar11 == uVar19 + 1) {
              bVar13 = cVar14 - 0x38;
              cVar14 = cVar14 + bVar3 + 'P';
LAB_180af1d98:
              bVar13 = cVar14 + (bVar13 & bVar3) * -2;
              goto LAB_180af1da0;
            }
            if (uVar11 == uVar19 + 2) {
              bVar13 = cVar14 + bVar3 + 'h' + (cVar14 - 0x3cU & bVar3) * -2;
              uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
            }
            else {
              if (uVar11 == uVar19 + 5) {
                bVar13 = cVar14 + 0x6cU & bVar3;
                cVar16 = bVar3 + 0x78;
                goto LAB_180af1c81;
              }
              if (uVar11 != uVar19 + 4) {
                if (uVar11 == uVar19 + 3) {
                  bVar13 = cVar14 + 0x68U & bVar3;
                  cVar16 = bVar3 + 0x90;
                  goto LAB_180af1cd1;
                }
                goto LAB_180af1889;
              }
              bVar13 = cVar14 + bVar3 + -0x80 + (cVar14 - 0x40U & bVar3) * -2;
              uVar20 = uVar20 - 1;
            }
          }
        }
        else {
          uVar19 = uVar9;
          uVar11 = uVar10;
          if (uVar10 != uVar9 + 1) {
            if (uVar10 == uVar9 + 2) {
              bVar13 = cVar14 - 0x2eU & bVar3;
              cVar16 = bVar3 + 0x14;
              goto LAB_180af1c81;
            }
            if (uVar10 == uVar9 + 5) {
              bVar13 = cVar14 + 0x26;
              cVar14 = cVar14 + bVar3 + '\x1c';
              goto LAB_180af1d0b;
            }
            if (uVar10 == uVar9 + 3) {
              bVar13 = cVar14 - 0x32;
              cVar16 = bVar3 + 0x2c;
              goto LAB_180af1d2d;
            }
            goto LAB_180af18c5;
          }
          bVar13 = cVar14 - 0x2aU & bVar3;
          cVar16 = bVar3 - 4;
LAB_180af1cd1:
          bVar13 = cVar16 + cVar14 + bVar13 * -2;
LAB_180af1cd9:
          abStack_4c8[uVar20] = bVar3 + 0x9c + (cVar14 + 0x66U & bVar3) * -2 + cVar14;
          uVar20 = uVar20 - 1;
          uVar19 = uVar19 + 1;
        }
      }
      else {
        if (uVar11 == uVar19 + 1) {
          bVar13 = cVar14 + bVar3 + -0x58 + (bVar3 & cVar14 - 0x1cU) * -2;
          goto LAB_180af1da0;
        }
        if (uVar11 == uVar19 + 3) {
          bVar13 = cVar14 + 0x8c;
          cVar16 = bVar3 + 0xb8;
LAB_180af1d2d:
          bVar13 = bVar13 & bVar3;
LAB_180af1d30:
          bVar13 = cVar16 + cVar14 + bVar13 * -2;
          uVar9 = uVar19;
          uVar10 = uVar11;
          goto LAB_180af1d38;
        }
        if (uVar11 == uVar19 + 2) {
          bVar13 = cVar14 + 0x34;
          cVar14 = cVar14 + bVar3 + -0x38;
LAB_180af1d0b:
          bVar13 = cVar14 + (bVar13 & bVar3) * -2;
          uVar11 = uVar11 + uVar19;
          uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
          goto LAB_180af1daf;
        }
        uVar10 = uVar11;
        if (uVar11 != uVar19 + 6) goto LAB_180af1904;
        bVar13 = cVar14 + 0x88U & bVar3;
        cVar16 = bVar3 - 0x30;
LAB_180af1c81:
        bVar13 = cVar16 + cVar14 + bVar13 * -2;
LAB_180af1c89:
        abStack_4c8[uVar20] = bVar3 + (cVar14 + 0xbaU & bVar3) * -2 + -0x5c + cVar14 + bVar13;
        uVar20 = (uVar20 - 1) - (ulonglong)bVar13;
        uVar11 = uVar11 + uVar19;
      }
LAB_180af1daf:
      uVar20 = uVar20 + 1;
    } while( true );
  }
  DAT_1810cefe1 = '\x01';
  abStack_378[0] = 0x1b;
  abStack_378[1] = 0x12;
  abStack_378[2] = 0x16;
  abStack_378[3] = 0x22;
  abStack_378[4] = 0x16;
  abStack_378[5] = 0x11;
  abStack_378[6] = 0x1b;
  abStack_378[7] = 0x67;
  abStack_378[8] = 0;
  abStack_378[9] = 0;
  abStack_378[10] = 0;
  abStack_378[0xb] = 0;
  abStack_378[0xc] = 0;
  abStack_378[0xd] = 0;
  abStack_378[0xe] = 0;
  abStack_378[0xf] = 0;
  abStack_378[0x10] = 0;
  abStack_378[0x11] = 0;
  abStack_378[0x12] = 0;
  pbVar12 = abStack_378;
  bVar13 = bStack_568;
LAB_180aeccf7:
  puVar7 = (ulonglong *)func_0x000180b36780();
  uVar10 = *puVar7;
  puVar7 = (ulonglong *)func_0x000180b36790();
  uVar9 = *puVar7;
LAB_180aecd30:
  uVar19 = 0;
  uVar11 = uVar10;
  do {
    if (0x12 < uVar19) {
LAB_180aed692:
      alStack_300[4] = 0;
      alStack_300[5] = 0;
      alStack_300[6] = 0;
      alStack_300[7] = 0;
      uVar6 = FUN_180f29c00(pbVar12);
      FUN_180191ab0(alStack_300 + 4);
      FUN_1801a4a90(alStack_300 + 4);
      FUN_180195980();
      uVar10 = uRam00000001802e07c0;
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
      LOCK();
      UNLOCK();
      LOCK();
      UNLOCK();
      LOCK();
      UNLOCK();
      LOCK();
      UNLOCK();
      do {
        iStack_63c = 0x20;
        uVar9 = uVar10;
        do {
          LOCK();
          bVar21 = *(int *)(uVar9 + 0x1fc) == 0;
          if (bVar21) {
            *(int *)(uVar9 + 0x1fc) = 1;
          }
          UNLOCK();
          if (bVar21) {
            *(undefined8 *)-(~uVar9 - 0x20f) = 0x180000000;
            *(undefined8 *)((uVar9 | 0x220) + ~(~uVar9 | 0xfffffffffffffddf)) = 0x180000000;
            *(longlong *)(uVar9 + 0x208) =
                 *(longlong *)((uVar9 | 0x1d8) + (uVar9 & 0x1d8)) + 0x56d3f6;
                    /* WARNING: Could not recover jumptable at 0x0001808ab3b5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (**(code **)(*(longlong *)(uVar9 + 0x1f0) + 0x23f0))(0x180000000,0x56d3f6,uVar6,uVar19);
            return;
          }
          uVar9 = uVar9 + 0x1000;
          iStack_63c = iStack_63c + -1;
        } while (iStack_63c != 0);
      } while( true );
    }
    bVar3 = abStack_378[uVar19];
    bVar5 = (byte)uVar19;
LAB_180aecd63:
    if (uVar19 < uVar11) {
      pbVar12 = &stack0x00cfc638;
      goto LAB_180aed692;
    }
    if (uVar9 + 1 <= uVar11) {
      if (uVar11 == uVar9 + 1) {
        bVar13 = bVar5 + 0x50;
        cVar14 = bVar5 + bVar3 + ' ';
        goto LAB_180aed5d9;
      }
      if (uVar11 == uVar9 + 2) {
        bVar13 = bVar5 + 0x30;
        uVar20 = uVar9;
        uVar10 = uVar11;
        goto LAB_180aed590;
      }
      if (uVar11 == uVar9 + 3) {
        bVar13 = bVar5 + 0x10;
        cVar14 = bVar3 + 0xa0;
        goto LAB_180aed55c;
      }
      if (uVar11 != uVar9 + 5) {
        if (uVar11 != uVar9 + 6) goto LAB_180aecdd0;
        bVar13 = bVar5 + 0x50;
        bVar15 = bVar3 + 0x20;
        goto LAB_180aed4fd;
      }
      bVar13 = bVar5 - 0x30 & bVar3;
      cVar14 = bVar5 + bVar3 + ' ';
LAB_180aed537:
      bVar13 = cVar14 + bVar13 * -2;
      uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
      uVar11 = uVar11 + uVar9;
      goto LAB_180aed5f0;
    }
    bVar13 = (bVar5 + 0x70 & bVar3) * -2 + -0x10 + bVar5 + 0x70 + bVar3;
LAB_180aecdd0:
    if (uVar19 < uVar9) {
      pbVar12 = &stack0x01588fc8;
      goto LAB_180aed692;
    }
    if (uVar9 + 8 <= uVar11) {
      if (uVar11 != uVar9 + 1) {
        if (uVar11 != uVar9 + 3) {
          if (uVar11 == uVar9 + 2) {
            bVar13 = bVar5 + 0xb0;
            cVar14 = bVar3 - 0x20;
LAB_180aed48b:
            bVar13 = bVar13 & bVar3;
            goto LAB_180aed48e;
          }
          if (uVar11 != uVar9 + 6) goto LAB_180aece30;
          bVar13 = bVar5 + 0x10;
          cVar14 = bVar5 + bVar3 + -0x60;
          goto LAB_180aed5d9;
        }
        bVar13 = bVar5 + bVar3 + ' ' + (bVar5 - 0x30 & bVar3) * -2;
        uVar19 = uVar19 - 1;
        goto LAB_180aed5f0;
      }
      bVar13 = bVar5 + 0x10;
      bVar15 = bVar3 + 0xa0;
      goto LAB_180aed4fd;
    }
    bVar13 = bVar3 + 0xb0 + bVar5 + 0x30 + (bVar5 + 0x30 & bVar3) * -2;
LAB_180aece30:
    while (uVar10 = uVar11, uVar19 < uVar9 + uVar11) {
      while( true ) {
        do {
          uVar20 = uVar9;
          uVar9 = uVar20;
          uVar11 = uVar10;
          if (uVar10 == uVar20 + 1) {
            bVar13 = bVar5 + 0x20;
            bVar15 = bVar3 + 0x40;
            goto LAB_180aed4fd;
          }
          if (uVar10 == uVar20 + 3) {
            bVar13 = bVar5 + bVar3 + (bVar5 & bVar3) * -2;
            uVar9 = uVar20 + 1;
            uVar19 = uVar19 - 1;
            goto LAB_180aed5f0;
          }
          if (uVar10 == uVar20 + 0x42) {
            bVar13 = bVar5 + bVar3 + -0x40 + (bVar5 - 0x20 & bVar3) * -2;
            uVar19 = uVar19 - 1;
            goto LAB_180aed5f0;
          }
          if (uVar10 == uVar20 + 0x80) {
            bVar13 = bVar5 - 0x40;
            cVar14 = bVar3 + 0x80;
            goto LAB_180aed48b;
          }
          if (uVar10 == uVar20 + 2) {
            bVar13 = bVar5 + 0xa0 & bVar3;
            cVar14 = bVar5 + bVar3 + '@';
            goto LAB_180aed537;
          }
          if (uVar10 == uVar20 + 4) {
            bVar13 = bVar5 + bVar3 + (bVar5 + 0x80 & bVar3) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
            goto LAB_180aed5f0;
          }
          if (uVar10 == uVar20 + 100) {
            bVar13 = bVar5 + 0x60;
            cVar14 = bVar3 - 0x40;
            goto LAB_180aed55c;
          }
          if (uVar10 == uVar20 + 0x200) {
            bVar13 = bVar5 + 0x40;
            cVar14 = bVar3 + 0x80;
            goto LAB_180aed597;
          }
        } while (uVar10 == uVar20 + 5);
        uVar10 = uVar20 + 6;
        if (uVar10 < uVar20 + 0x20e) {
          bVar13 = bVar3 + bVar5 + 0x50 + -0x30 + (bVar3 & bVar5 + 0x50) * -2;
          goto LAB_180aeccf7;
        }
        uVar9 = uVar20 + 0xe;
        if (uVar10 < uVar20 + 0x40e) {
          bVar13 = bVar3 + bVar5 + 0x30 + -0x50 + (bVar3 & bVar5 + 0x30) * -2;
          goto LAB_180aecd30;
        }
        uVar11 = uVar10;
        if (uVar10 < uVar20 + 0x13) {
          bVar13 = bVar3 + 0x90 + bVar5 + 0x10 + (bVar5 + 0x10 & bVar3) * -2;
          goto LAB_180aecd63;
        }
        if (uVar10 < uVar20 + 0x16) {
          bVar13 = bVar3 + 0x70 + (bVar5 - 0x10) + (bVar5 - 0x10 & bVar3) * -2;
          goto LAB_180aecdd0;
        }
        if (uVar10 < uVar20 + 0x18) break;
        if (uVar10 < uVar20 + 0x100e) {
          bVar13 = bVar5 + 0xb0;
          cVar14 = bVar3 - 0x20;
          goto LAB_180aed19d;
        }
        uVar11 = uVar20 + 0x88;
        if (uVar10 < uVar11) {
          bVar13 = bVar5 + 0x90;
          cVar14 = bVar3 + 0xa0;
          uVar11 = uVar10;
          goto LAB_180aed158;
        }
        if (uVar10 < uVar20 + 0x17) {
          bVar13 = bVar5 + 0x70;
          cVar14 = bVar3 + 0x60;
          uVar11 = uVar10;
          goto LAB_180aed11f;
        }
        if (uVar10 < uVar20 + 0x1e) {
          bVar13 = bVar5 + bVar3 + ' ' + (bVar5 + 0x50 & bVar3) * -2;
          goto LAB_180aed105;
        }
        if (uVar20 + 0x6f <= uVar10) {
          uVar9 = uVar20 + 0xc9;
          if (uVar20 + 0x123 < uVar11) {
            bVar13 = bVar5 + 0x80;
            cVar14 = bVar5 + bVar3;
            goto LAB_180aed5d9;
          }
          uVar10 = uVar11;
          if (uVar20 + 0xd9 < uVar11) {
            bVar13 = bVar5 + 0x60;
            cVar14 = bVar3 - 0x40;
            uVar20 = uVar9;
            goto LAB_180aed597;
          }
          if (uVar20 + 0xf1 < uVar11) {
            bVar13 = bVar5 + 0x40;
            cVar14 = bVar3 + 0x80;
            goto LAB_180aed55c;
          }
          if (uVar20 + 0x10a < uVar11) {
            bVar13 = bVar5 + bVar3 + '@' + (bVar3 & bVar5 + 0x20) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
            goto LAB_180aed5f0;
          }
          if (uVar20 + 0xf3 < uVar11) {
            bVar13 = bVar3 & bVar5;
            cVar14 = bVar5 + bVar3;
            goto LAB_180aed537;
          }
          if (uVar20 + 0xe9 < uVar11) {
            bVar13 = bVar3 & bVar5 - 0x20;
            cVar14 = bVar3 - 0x40;
            goto LAB_180aed48e;
          }
          if (uVar20 + 0x109 < uVar11) {
            bVar13 = bVar5 + bVar3 + -0x80 + (bVar3 & bVar5 - 0x40) * -2;
            uVar19 = uVar19 - 1;
            goto LAB_180aed5f0;
          }
          if (uVar20 + 0xca < uVar11) {
            bVar13 = bVar5 + 0x80;
            bVar15 = bVar3;
            goto LAB_180aed4fd;
          }
          if (uVar11 <= uVar20 + 0xcc) {
            uVar9 = uVar20 + 0x14b;
            uVar10 = uVar20 + 0x109;
          }
        }
      }
      bVar13 = bVar3 + 0x50 + (bVar5 - 0x30) + (bVar5 - 0x30 & bVar3) * -2;
    }
    if (uVar11 < uVar9 + 0x40) {
      bVar13 = bVar5 + 0x70;
      cVar14 = bVar3 + 0x60;
LAB_180aed19d:
      bVar13 = cVar14 + bVar5 + (bVar13 & bVar3) * -2;
LAB_180aed1a3:
      if (uVar9 + uVar11 == 2) {
        bVar13 = bVar3 & bVar5 + 0x60;
        cVar14 = bVar5 - 0x40;
LAB_180aed55f:
        bVar13 = cVar14 + bVar13 * -2;
        bVar5 = bVar3 + 0x20 + (bVar5 - 0x30 & bVar3) * -2 + bVar5;
        abStack_378[uVar19] = bVar5;
        uVar19 = (uVar19 - (uVar9 + 1)) - (ulonglong)bVar5;
        uVar9 = uVar9 + 1;
        uVar10 = uVar11;
LAB_180aed5a2:
        abStack_378[uVar19] = (char)uVar19 + -0x80 + bVar3 + ((char)uVar19 + 0x40U & bVar3) * -2;
        uVar11 = uVar10 + 1;
        uVar19 = uVar19 + ~uVar11;
        goto LAB_180aed5e1;
      }
      if (uVar9 + 3 < uVar11) {
        bVar13 = bVar5 + 0xb0;
        cVar14 = bVar3 - 0x20;
LAB_180aed158:
        bVar13 = cVar14 + bVar5 + (bVar13 & bVar3) * -2;
LAB_180aed15e:
        if (9 < uVar11) {
          bVar13 = bVar3 & bVar5 + 0x80;
          cVar14 = bVar3 * '\x02';
          goto LAB_180aed48e;
        }
        if (uVar9 + 0x400 < uVar11) {
          bVar13 = bVar5 - 0x20;
          cVar14 = bVar3 - 0x40;
LAB_180aed11f:
          bVar13 = cVar14 + bVar5 + (bVar13 & bVar3) * -2;
          uVar10 = uVar11;
        }
        else {
          if (uVar11 == uVar9 + 1) {
            bVar13 = bVar5 + bVar3 + -0x80 + (bVar3 & bVar5 - 0x40) * -2;
            goto LAB_180aed5e1;
          }
          if (uVar11 == uVar9 + 2) {
            bVar13 = bVar3 & bVar5 + 0x80;
            cVar14 = bVar5 + bVar3;
            goto LAB_180aed55f;
          }
          uVar10 = uVar11;
          if (uVar11 == uVar9 + 3) {
            bVar13 = bVar5 + bVar3 + -0x80 + (bVar3 & bVar5 + 0x40) * -2;
            uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
            uVar11 = uVar11 + uVar9;
            goto LAB_180aed5f0;
          }
        }
        if (uVar9 < 0x2a) {
LAB_180aed105:
          abStack_378[uVar19] = bVar13;
          uVar11 = uVar10;
          goto LAB_180aed5f0;
        }
        bVar13 = (bVar3 + 0x40 + bVar5 + (bVar3 & bVar5 + 0xa0) * -2) * '\x02';
LAB_180aed502:
        abStack_378[uVar19] = bVar3 + 0xa0 + (bVar5 + 0x10 & bVar3) * -2 + bVar5;
        uVar19 = uVar19 - 1;
        uVar9 = uVar9 + 1;
        uVar11 = uVar10;
      }
      else {
        if (uVar11 == uVar9 + 1) {
          bVar13 = bVar5 + 0x90;
          bVar15 = bVar3 + 0xa0;
LAB_180aed4fd:
          bVar13 = bVar5 + bVar15 + (bVar3 & bVar13) * -2;
          uVar10 = uVar11;
          goto LAB_180aed502;
        }
        if (uVar11 == uVar9 + 2) {
          bVar13 = bVar5 + bVar3 + ' ' + (bVar3 & bVar5 + 0x50) * -2;
          uVar19 = uVar19 - 1;
        }
        else {
          if (uVar11 != uVar9 + 3) {
            if (uVar11 != uVar9 + 6) {
              if (uVar11 == uVar9 + 9) {
                bVar13 = bVar5 + 0x90;
                cVar14 = bVar5 + bVar3 + -0x60;
LAB_180aed5d9:
                bVar13 = cVar14 + (bVar13 & bVar3) * -2;
                goto LAB_180aed5e1;
              }
              goto LAB_180aed15e;
            }
            bVar13 = bVar5 + 0xb0;
            uVar20 = uVar9;
            uVar10 = uVar11;
LAB_180aed590:
            cVar14 = bVar3 - 0x20;
LAB_180aed597:
            bVar13 = cVar14 + bVar5 + (bVar13 & bVar3) * -2;
            uVar9 = uVar20;
            goto LAB_180aed5a2;
          }
          bVar13 = bVar5 + bVar3 + '`' + (bVar3 & bVar5 - 0x10) * -2;
          uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
        }
      }
    }
    else {
      if (uVar11 != uVar9 + 1) {
        if (uVar11 != uVar9 + 3) {
          if (uVar11 != uVar9 + 2) {
            if (uVar11 != uVar9 + 4) goto LAB_180aed1a3;
            bVar13 = bVar5 + bVar3 + '@' + (bVar3 & bVar5 + 0xa0) * -2;
            uVar19 = uVar19 - 1;
            goto LAB_180aed5f0;
          }
          bVar13 = bVar3 & bVar5 - 0x40;
          cVar14 = bVar3 + 0x80;
LAB_180aed48e:
          bVar13 = cVar14 + bVar5 + bVar13 * -2;
          abStack_378[uVar19] = bVar3 + 0x60 + (bVar5 - 0x10 & bVar3) * -2 + bVar5 + bVar13;
          uVar19 = (uVar19 - 1) - (ulonglong)bVar13;
          uVar11 = uVar11 + uVar9;
          goto LAB_180aed5f0;
        }
        bVar13 = bVar5 + 0x20;
        cVar14 = bVar3 + 0x40;
LAB_180aed55c:
        bVar13 = bVar13 & bVar3;
        cVar14 = cVar14 + bVar5;
        goto LAB_180aed55f;
      }
      bVar13 = bVar5 + bVar3 + -0x40 + (bVar3 & bVar5 + 0x60) * -2;
LAB_180aed5e1:
      uVar19 = uVar19 + abStack_378[uVar19] + uVar9;
    }
LAB_180aed5f0:
    uVar19 = uVar19 + 1;
  } while( true );
}


