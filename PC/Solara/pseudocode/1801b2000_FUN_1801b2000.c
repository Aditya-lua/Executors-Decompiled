/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1801b2000(undefined8 param_1,longlong param_2,ulonglong param_3,ulonglong param_4,
                  ulonglong param_5,longlong param_6,ulonglong param_7)

{
  ulonglong uVar1;
  code *pcVar2;
  uint uVar3;
  longlong lVar4;
  char cVar5;
  ulonglong uVar6;
  byte *pbVar7;
  longlong lVar8;
  ulonglong *puVar9;
  ulonglong *puVar10;
  byte bVar11;
  int iVar12;
  byte *pbVar13;
  undefined1 *puVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  longlong lVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  undefined1 uStack0000000000000000;
  undefined1 auStack_158 [8];
  undefined1 auStack_150 [24];
  longlong *plStack_138;
  byte abStack_128 [8];
  byte *pbStack_120;
  byte *pbStack_118;
  byte *pbStack_110;
  ulonglong *puStack_108;
  ulonglong *puStack_100;
  ulonglong *puStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  longlong lStack_d0;
  ulonglong uStack_c8;
  longlong lStack_c0;
  longlong lStack_b8;
  ulonglong uStack_b0;
  undefined8 uStack_a8;
  ulonglong uStack_90;
  ulonglong uStack_88;
  ulonglong uStack_80;
  undefined1 auStack_78 [7];
  char cStack_71;
  char cStack_70;
  byte bStack_6d;
  char cStack_6c;
  char cStack_6a;
  byte bStack_69;
  char cStack_68;
  int iStack_63;
  int iStack_5b;
  uint uStack_57;
  longlong lStack_50;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_158;
  lStack_d0 = param_6;
  uStack_b0 = param_3;
  uStack_a8 = param_1;
  if (&uStack0000000000000000 == (undefined1 *)0x0) {
    (*(code *)0xffffffffffffff60)();
    (*(code *)0x0)();
  }
  puVar14 = auStack_158;
  if ((param_2 == 0) || (param_3 == 0)) goto code_r0x0001801b2e3b;
  uStack_c8 = 0;
  lStack_c0 = 0;
  lStack_b8 = 0;
  if (0x7fffffffffffffff < param_3) goto LAB_1801b2e69;
  if (param_3 < 0x1000) {
    uStack_c8 = FUN_180e152f0(param_3);
LAB_1801b20c9:
    uVar16 = param_3 + param_4;
    lVar4 = param_3 + uStack_c8;
    lStack_b8 = lVar4;
    FUN_180f29110(uStack_c8,param_2);
    puStack_108 = (ulonglong *)0x0;
    puStack_100 = (ulonglong *)0x0;
    puStack_f8 = (ulonglong *)0x0;
    uVar15 = 0;
    lStack_c0 = lVar4;
    if (param_3 != 0) {
      do {
        uVar3 = FUN_1802b7b40(uStack_c8 + uVar15,auStack_78);
        uVar19 = (ulonglong)uVar3;
        if ((uVar3 == 0) || ((uStack_57 >> 0xc & 1) != 0)) goto code_r0x0001801b2da0;
        bVar11 = (byte)uVar3;
        if ((uStack_57 >> 9 & 1) == 0) {
          if (((((uStack_57 & 1) != 0) && ((uStack_57 >> 8 & 1) != 0)) && (cStack_6a == '\0')) &&
             ((cStack_68 == '\x05' && ((uStack_57 & 2) == 0)))) {
            uStack_e0 = (longlong)iStack_5b + param_4 + uVar15 + uVar19;
            if ((bStack_6d == 0x8d) && (((uStack_57 >> 0x1e & 1) != 0 && (cStack_71 != '\0')))) {
              uStack_d8._0_6_ = CONCAT15(cStack_70 << 3 | bStack_69,0x100000000);
              uStack_e8._0_2_ = CONCAT11(10,bVar11);
              uStack_e8 = (ulonglong)(ushort)uStack_e8;
              uStack_d8 = (ulonglong)CONCAT61((uint6)uStack_d8 >> 0x10,bVar11 != 10) << 8;
            }
            else {
              if ((uStack_57 & 4) == 0) {
                if ((uStack_57 & 8) == 0) {
                  if ((uStack_57 & 0x10) == 0) {
                    cVar5 = '\0';
                    if ((uStack_57 & 0x20) != 0) {
                      cVar5 = '\b';
                    }
                  }
                  else {
                    cVar5 = '\x04';
                  }
                }
                else {
                  cVar5 = '\x02';
                }
              }
              else {
                cVar5 = '\x01';
              }
              uStack_e8._0_2_ = CONCAT11(bVar11,bVar11);
              uStack_e8._0_3_ = CONCAT12((bVar11 - cVar5) + -4,(ushort)uStack_e8);
              uStack_e8 = (ulonglong)(uint3)uStack_e8;
              uStack_d8 = 0;
            }
            goto code_r0x0001801b22f0;
          }
        }
        else {
          lVar4 = (longlong)(char)iStack_63;
          if ((uStack_57 & 4) == 0) {
            lVar4 = (longlong)iStack_63;
          }
          uVar6 = lVar4 + param_4 + uVar15 + uVar19;
          if ((uVar6 < param_4) || (uVar16 <= uVar6)) {
            uStack_e0 = uVar6;
            if (uVar6 == uVar16) {
              uStack_e0 = param_5;
            }
            uStack_e8 = (ulonglong)bVar11;
            uStack_d8 = 1;
            if (bStack_6d == 0xeb) {
              uStack_d8 = 0xe90101;
              uStack_e8._0_3_ = CONCAT21(0x105,bVar11);
              uStack_e8 = (ulonglong)(uint3)uStack_e8;
            }
            else if ((byte)(bStack_6d + 0x90) < 0x10) {
              uStack_e8._0_3_ = CONCAT21(0x206,bVar11);
              uStack_e8 = (ulonglong)(uint3)uStack_e8;
              uStack_d8._0_4_ = CONCAT13(bStack_6d & 0xf | 0x80,0xf0101);
              uStack_d8 = (ulonglong)(uint)uStack_d8;
            }
            else if ((byte)(bStack_6d + 0x18) < 2) {
              uStack_d8 = (ulonglong)CONCAT12(bStack_6d,1);
              uStack_e8._0_3_ = CONCAT21(0x105,bVar11);
              uStack_e8 = (ulonglong)(uint3)uStack_e8;
            }
            else {
              uStack_f0 = uVar15;
              if ((bStack_6d != 0xf) || (0xf < (byte)(cStack_6c + 0x80U)))
              goto code_r0x0001801b2da0;
              uStack_e8._0_3_ = CONCAT21(0x206,bVar11);
              uStack_e8 = (ulonglong)(uint3)uStack_e8;
              uStack_d8._0_4_ = CONCAT13(cStack_6c,0xf0001);
              uStack_d8 = (ulonglong)(uint)uStack_d8;
            }
code_r0x0001801b22f0:
            if (puStack_100 == puStack_f8) {
              uStack_f0 = uVar15;
              FUN_1801aa020(&puStack_108);
            }
            else {
              uStack_f0._0_4_ = (undefined4)uVar15;
              uStack_f0._4_4_ = (undefined4)(uVar15 >> 0x20);
              *(undefined4 *)puStack_100 = (undefined4)uStack_f0;
              *(undefined4 *)((longlong)puStack_100 + 4) = uStack_f0._4_4_;
              *(undefined4 *)(puStack_100 + 1) = (undefined4)uStack_e8;
              *(undefined4 *)((longlong)puStack_100 + 0xc) = 0;
              *(undefined4 *)(puStack_100 + 2) = (undefined4)uStack_e0;
              *(undefined4 *)((longlong)puStack_100 + 0x14) = uStack_e0._4_4_;
              *(uint *)(puStack_100 + 3) = (uint)uStack_d8;
              *(undefined4 *)((longlong)puStack_100 + 0x1c) = uStack_d8._4_4_;
              puStack_100 = puStack_100 + 4;
              uStack_f0 = uVar15;
            }
          }
        }
        uVar15 = uVar15 + uVar19;
      } while (uVar15 < param_3);
    }
    uVar15 = 0;
    if (param_3 != 0) {
      do {
        uVar3 = FUN_1802b7b40(uStack_c8 + uVar15,auStack_78);
        uVar19 = (ulonglong)uVar3;
        if (uVar3 == 0) goto code_r0x0001801b2da0;
        if ((uStack_57 >> 9 & 1) != 0) {
          lVar4 = (longlong)(char)iStack_63;
          if ((uStack_57 & 4) == 0) {
            lVar4 = (longlong)iStack_63;
          }
          uVar6 = param_4 + lVar4 + uVar19 + uVar15;
          if ((param_4 <= uVar6) && (uVar6 < uVar16)) {
            uVar1 = uVar19 + uVar15;
            uVar6 = uVar6 - param_4;
            uVar18 = uVar6;
            if (uVar1 < uVar6) {
              uVar18 = uVar1;
            }
            if (uVar6 < uVar1) {
              uVar6 = uVar1;
            }
            lVar17 = 0;
            puVar9 = puStack_108;
            if (puStack_108 != puStack_100) {
              do {
                if (((*(char *)((longlong)puVar9 + 0x19) != '\0') && (uVar18 <= *puVar9)) &&
                   (*puVar9 < uVar6)) {
                  lVar17 = lVar17 + ((ulonglong)*(byte *)((longlong)puVar9 + 9) -
                                    (ulonglong)(byte)puVar9[1]);
                }
                puVar9 = puVar9 + 4;
              } while (puVar9 != puStack_100);
              if (lVar17 != 0) {
                if (lVar4 < 0) {
                  lVar17 = -lVar17;
                }
                lVar17 = lVar17 + lVar4;
                if ((uStack_57 & 4) == 0) {
                  if (0xffffffff < lVar17 + 0x80000000U) goto code_r0x0001801b2da0;
                  *(int *)((uVar15 - 4) + uStack_c8 + uVar19) = (int)lVar17;
                }
                else {
                  if (0xff < lVar17 + 0x80U) goto code_r0x0001801b2da0;
                  *(char *)((uVar15 - 1) + uStack_c8 + uVar19) = (char)lVar17;
                }
              }
            }
          }
        }
        uVar15 = uVar15 + uVar19;
        param_3 = uStack_b0;
      } while (uVar15 < uStack_b0);
    }
    lVar4 = 0;
    for (puVar9 = puStack_108; puVar9 != puStack_100; puVar9 = puVar9 + 4) {
      if (*(char *)((longlong)puVar9 + 0x19) != '\0') {
        param_3 = param_3 + ((ulonglong)*(byte *)((longlong)puVar9 + 9) - (ulonglong)(byte)puVar9[1]
                            );
      }
      lVar4 = (lVar4 + 1) - (ulonglong)((char)puVar9[3] == '\0');
    }
    uVar16 = param_3 + 0xe + lVar4 * 0xe;
    if ((param_7 == 0) || (uVar16 <= param_7)) {
      pbStack_120 = (byte *)0x0;
      pbStack_118 = (byte *)0x0;
      pbStack_110 = (byte *)0x0;
      if (uVar16 != 0) {
        if (0x7fffffffffffffff < uVar16) goto code_r0x0001801b2e75;
        if (uVar16 < 0x1000) {
          pbVar13 = (byte *)FUN_180e152f0(uVar16);
code_r0x0001801b251c:
          FUN_180f29110(pbVar13);
          if (pbStack_120 != (byte *)0x0) {
            if ((ulonglong)((longlong)pbStack_110 - (longlong)pbStack_120) < 0x1000) {
              pbVar7 = pbStack_120;
            }
            else {
              pbVar7 = *(byte **)(pbStack_120 + -8);
              if ((byte *)0x1f < pbStack_120 + (-8 - (longlong)pbVar7)) goto code_r0x0001801b2e87;
            }
            func_0x000180e15340(pbVar7);
          }
          pbStack_110 = pbVar13 + uVar16;
          pbStack_118 = pbVar13;
          goto code_r0x0001801b2582;
        }
        if (lVar4 * 0xe + 0x35 + param_3 <= uVar16) goto code_r0x0001801b2e81;
        lVar4 = FUN_180e152f0();
        if (lVar4 != 0) {
          pbVar13 = (byte *)(lVar4 + 0x27U & 0xffffffffffffffe0);
          *(longlong *)(pbVar13 + -8) = lVar4;
          goto code_r0x0001801b251c;
        }
code_r0x0001801b2e87:
        pcVar2 = (code *)swi(0x29);
        (*pcVar2)(5);
code_r0x0001801b2e8e:
        pcVar2 = (code *)swi(0x29);
        (*pcVar2)(5);
        goto code_r0x0001801b2e95;
      }
code_r0x0001801b2582:
      uStack_90 = 0;
      uStack_88 = 0;
      uStack_80 = 0;
      pbStack_120 = pbStack_118;
      if (0x1f < (ulonglong)((longlong)puStack_100 - (longlong)puStack_108)) {
        uVar16 = (longlong)puStack_100 - (longlong)puStack_108 >> 5;
        if (0x1fffffffffffffff < uVar16) {
code_r0x0001801b2e7b:
          FUN_1801c0c10();
          pcVar2 = (code *)swi(3);
          (*pcVar2)();
          return;
        }
        uVar15 = uVar16 * 8;
        if (uVar15 == 0) {
          uVar19 = 0;
        }
        else if (uVar15 < 0x1000) {
          uVar19 = FUN_180e152f0(uVar15);
        }
        else {
          if (uVar15 + 0x27 <= uVar15) {
code_r0x0001801b2e81:
            pbStack_120 = pbStack_118;
            FUN_1801958c0();
            pcVar2 = (code *)swi(3);
            (*pcVar2)();
            return;
          }
          lVar4 = FUN_180e152f0();
          if (lVar4 == 0) goto code_r0x0001801b2e87;
          uVar19 = lVar4 + 0x27U & 0xffffffffffffffe0;
          *(longlong *)(uVar19 - 8) = lVar4;
        }
        uVar15 = uVar19 + uVar15;
        uStack_90 = uVar19;
        uStack_80 = uVar15;
        if (uVar16 != 0) {
          FUN_180f297c0(uVar19);
          uVar19 = uVar15;
        }
        uStack_88 = uVar19;
      }
      uVar16 = uStack_b0;
      uVar15 = 0;
      lVar4 = 0;
      if ((longlong)puStack_100 - (longlong)puStack_108 >> 5 != 0) {
        do {
          lVar17 = lVar4;
          if ((char)puStack_108[uVar15 * 4 + 3] != '\0') {
            lVar17 = lVar4 + 1;
            *(longlong *)(uStack_90 + uVar15 * 8) = lVar4;
          }
          uVar15 = uVar15 + 1;
          lVar4 = lVar17;
        } while (uVar15 < (ulonglong)((longlong)puStack_100 - (longlong)puStack_108 >> 5));
      }
      uVar15 = 0;
      uVar19 = 0;
      lVar4 = lStack_d0;
      if (uStack_b0 != 0) {
        do {
          if ((uVar19 < (ulonglong)((longlong)puStack_100 - (longlong)puStack_108 >> 5)) &&
             (puVar9 = puStack_108 + uVar19 * 4, *puVar9 == uVar15)) {
            lVar17 = (longlong)pbStack_118 - (longlong)pbStack_120;
            if ((char)puVar9[3] == '\0') {
              if (*(char *)((longlong)puVar9 + 0x1c) == '\0') {
                FUN_1801aaef0(&pbStack_120,pbStack_118,uStack_c8 + uVar15,
                              ((byte)puVar9[1] + uStack_c8 + uVar15) - (uStack_c8 + uVar15));
                lVar8 = ((-(ulonglong)*(byte *)((longlong)puVar9 + 9) - lVar4) + puVar9[2]) - lVar17
                ;
                if (0xffffffff < lVar8 + 0x80000000U) goto code_r0x0001801b2d00;
                *(int *)(pbStack_120 + lVar17 + (ulonglong)*(byte *)((longlong)puVar9 + 10)) =
                     (int)lVar8;
                uVar19 = uVar19 + 1;
                uVar6 = (ulonglong)(byte)puVar9[1];
              }
              else {
                abStack_128[0] = 0x48;
                if (7 < *(byte *)((longlong)puVar9 + 0x1d)) {
                  abStack_128[0] = 0x49;
                }
                if (pbStack_118 == pbStack_110) {
                  FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
                }
                else {
                  *pbStack_118 = abStack_128[0];
                  pbStack_118 = pbStack_118 + 1;
                }
                abStack_128[0] = *(byte *)((longlong)puVar9 + 0x1d) & 7 | 0xb8;
                if (pbStack_118 == pbStack_110) {
                  FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
                }
                else {
                  *pbStack_118 = abStack_128[0];
                  pbStack_118 = pbStack_118 + 1;
                }
                iVar12 = 0;
                do {
                  abStack_128[0] = (byte)(puVar9[2] >> ((byte)iVar12 & 0x3f));
                  if (pbStack_118 == pbStack_110) {
                    FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
                  }
                  else {
                    *pbStack_118 = abStack_128[0];
                    pbStack_118 = pbStack_118 + 1;
                  }
                  iVar12 = iVar12 + 8;
                } while (iVar12 != 0x40);
                uVar19 = uVar19 + 1;
                uVar6 = (ulonglong)(byte)puVar9[1];
              }
            }
            else {
              lVar4 = ((*(longlong *)(uStack_90 + uVar19 * 8) * 0xe + param_3 + 0xe) -
                      (ulonglong)*(byte *)((longlong)puVar9 + 9)) - lVar17;
              if (0xffffffff < lVar4 + 0x80000000U) goto code_r0x0001801b2d00;
              if (*(char *)((longlong)puVar9 + 0x19) == '\0') {
                FUN_1801aaef0(&pbStack_120,pbStack_118,uStack_c8 + uVar15,
                              ((byte)puVar9[1] + uStack_c8 + uVar15) - (uStack_c8 + uVar15));
              }
              else {
                if (pbStack_118 == pbStack_110) {
                  FUN_1801a9ea0(&pbStack_120,pbStack_118);
                }
                else {
                  *pbStack_118 = *(byte *)((longlong)puVar9 + 0x1a);
                  pbStack_118 = pbStack_118 + 1;
                }
                if (*(char *)((longlong)puVar9 + 9) == '\x06') {
                  if (pbStack_118 == pbStack_110) {
                    FUN_1801a9ea0(&pbStack_120);
                  }
                  else {
                    *pbStack_118 = *(byte *)((longlong)puVar9 + 0x1b);
                    pbStack_118 = pbStack_118 + 1;
                  }
                }
                FUN_1801ab9d0(&pbStack_120,pbStack_118 + (4 - (longlong)pbStack_120),abStack_128);
              }
              *(int *)(pbStack_120 + lVar17 + (ulonglong)*(byte *)((longlong)puVar9 + 10)) =
                   (int)lVar4;
              uVar19 = uVar19 + 1;
              uVar6 = (ulonglong)(byte)puVar9[1];
              lVar4 = lStack_d0;
            }
          }
          else {
            uVar3 = FUN_1802b7b40(uStack_c8 + uVar15,auStack_78);
            if ((uVar3 == 0) || ((uStack_57 & 0x1000) != 0)) goto code_r0x0001801b2d00;
            uVar6 = (ulonglong)uVar3;
            FUN_1801aaef0(&pbStack_120,pbStack_118,uStack_c8 + uVar15,
                          (uVar6 + uStack_c8 + uVar15) - (uStack_c8 + uVar15));
          }
          uVar15 = uVar15 + uVar6;
        } while (uVar15 < uVar16);
      }
      abStack_128[0] = 0xff;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0xff;
        pbStack_118 = pbStack_118 + 1;
      }
      abStack_128[0] = 0x25;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0x25;
        pbStack_118 = pbStack_118 + 1;
      }
      abStack_128[0] = 0;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0;
        pbStack_118 = pbStack_118 + 1;
      }
      abStack_128[0] = 0;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0;
        pbStack_118 = pbStack_118 + 1;
      }
      abStack_128[0] = 0;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0;
        pbStack_118 = pbStack_118 + 1;
      }
      abStack_128[0] = 0;
      if (pbStack_118 == pbStack_110) {
        FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
      }
      else {
        *pbStack_118 = 0;
        pbStack_118 = pbStack_118 + 1;
      }
      iVar12 = 0;
      do {
        abStack_128[0] = (byte)(param_5 >> ((byte)iVar12 & 0x3f));
        if (pbStack_118 == pbStack_110) {
          FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
        }
        else {
          *pbStack_118 = abStack_128[0];
          pbStack_118 = pbStack_118 + 1;
        }
        iVar12 = iVar12 + 8;
      } while (iVar12 != 0x40);
      uVar16 = 0;
      puVar9 = puStack_108;
      puVar10 = puStack_100;
      pbVar13 = pbStack_118;
      if ((longlong)puStack_100 - (longlong)puStack_108 >> 5 != 0) {
        do {
          if ((char)puVar9[uVar16 * 4 + 3] != '\0') {
            uVar15 = puVar9[uVar16 * 4 + 2];
            abStack_128[0] = 0xff;
            if (pbVar13 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbVar13,abStack_128);
            }
            else {
              *pbVar13 = 0xff;
              pbStack_118 = pbStack_118 + 1;
            }
            abStack_128[0] = 0x25;
            if (pbStack_118 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
            }
            else {
              *pbStack_118 = 0x25;
              pbStack_118 = pbStack_118 + 1;
            }
            abStack_128[0] = 0;
            if (pbStack_118 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
            }
            else {
              *pbStack_118 = 0;
              pbStack_118 = pbStack_118 + 1;
            }
            abStack_128[0] = 0;
            if (pbStack_118 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
            }
            else {
              *pbStack_118 = 0;
              pbStack_118 = pbStack_118 + 1;
            }
            abStack_128[0] = 0;
            if (pbStack_118 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
            }
            else {
              *pbStack_118 = 0;
              pbStack_118 = pbStack_118 + 1;
            }
            abStack_128[0] = 0;
            if (pbStack_118 == pbStack_110) {
              FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
            }
            else {
              *pbStack_118 = 0;
              pbStack_118 = pbStack_118 + 1;
            }
            iVar12 = 0;
            do {
              abStack_128[0] = (byte)(uVar15 >> ((byte)iVar12 & 0x3f));
              if (pbStack_118 == pbStack_110) {
                FUN_1801a9ea0(&pbStack_120,pbStack_118,abStack_128);
              }
              else {
                *pbStack_118 = abStack_128[0];
                pbStack_118 = pbStack_118 + 1;
              }
              iVar12 = iVar12 + 8;
            } while (iVar12 != 0x40);
            puVar9 = puStack_108;
            puVar10 = puStack_100;
            pbVar13 = pbStack_118;
          }
          uVar16 = uVar16 + 1;
        } while (uVar16 < (ulonglong)((longlong)puVar10 - (longlong)puVar9 >> 5));
      }
      lStack_50 = 0;
      plStack_138 = &lStack_50;
      WriteProcessMemory(uStack_a8,lVar4,pbStack_120,(longlong)pbVar13 - (longlong)pbStack_120);
code_r0x0001801b2d00:
      if (uStack_90 != 0) {
        uVar16 = uStack_80 - uStack_90 & 0xfffffffffffffff8;
        if (uVar16 < 0x1000) {
          uVar15 = uStack_90;
        }
        else {
          if (0x1f < (uStack_90 - *(ulonglong *)(uStack_90 - 8)) - 8) goto code_r0x0001801b2e87;
          uVar16 = uVar16 + 0x27;
          uVar15 = *(ulonglong *)(uStack_90 - 8);
        }
        func_0x000180e15340(uVar15,uVar16);
        uStack_90 = 0;
        uStack_88 = 0;
        uStack_80 = 0;
      }
      if (pbStack_120 != (byte *)0x0) {
        uVar16 = (longlong)pbStack_110 - (longlong)pbStack_120;
        if (uVar16 < 0x1000) {
          pbVar13 = pbStack_120;
        }
        else {
          if ((byte *)0x1f < pbStack_120 + (-8 - (longlong)*(byte **)(pbStack_120 + -8)))
          goto code_r0x0001801b2e8e;
          uVar16 = uVar16 + 0x27;
          pbVar13 = *(byte **)(pbStack_120 + -8);
        }
        func_0x000180e15340(pbVar13,uVar16);
        pbStack_120 = (byte *)0x0;
        pbStack_118 = (byte *)0x0;
        pbStack_110 = (byte *)0x0;
      }
    }
code_r0x0001801b2da0:
    if (puStack_108 != (ulonglong *)0x0) {
      uVar16 = (longlong)puStack_f8 - (longlong)puStack_108 & 0xffffffffffffffe0;
      if (uVar16 < 0x1000) {
        puVar9 = puStack_108;
      }
      else {
        if (0x1f < (ulonglong)((longlong)puStack_108 + (-8 - (longlong)puStack_108[-1]))) {
code_r0x0001801b2e95:
          pcVar2 = (code *)swi(0x29);
          (*pcVar2)(5);
          pcVar2 = (code *)swi(3);
          (*pcVar2)();
          return;
        }
        uVar16 = uVar16 + 0x27;
        puVar9 = (ulonglong *)puStack_108[-1];
      }
      func_0x000180e15340(puVar9,uVar16);
      puStack_108 = (ulonglong *)0x0;
      puStack_100 = (ulonglong *)0x0;
      puStack_f8 = (ulonglong *)0x0;
    }
    if (uStack_c8 == 0) {
code_r0x0001801b2e3b:
      FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_158);
      return;
    }
    if (lStack_b8 - uStack_c8 < 0x1000) {
      func_0x000180e15340(uStack_c8);
      goto code_r0x0001801b2e3b;
    }
    if ((uStack_c8 - *(longlong *)(uStack_c8 - 8)) - 8 < 0x20) {
      func_0x000180e15340(*(longlong *)(uStack_c8 - 8),(lStack_b8 - uStack_c8) + 0x27);
      goto code_r0x0001801b2e3b;
    }
  }
  else {
    if (param_3 + 0x27 <= param_3) {
      FUN_1801958c0();
code_r0x0001801b2e75:
      FUN_1801c0c10();
      goto code_r0x0001801b2e7b;
    }
    lVar4 = FUN_180e152f0();
    if (lVar4 != 0) {
      uStack_c8 = lVar4 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uStack_c8 - 8) = lVar4;
      goto LAB_1801b20c9;
    }
  }
  pcVar2 = (code *)swi(0x29);
  (*pcVar2)(5);
  puVar14 = auStack_150;
LAB_1801b2e69:
  *(undefined8 *)(puVar14 + -8) = 0x1801b2e6e;
  FUN_1801c0c10();
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}

