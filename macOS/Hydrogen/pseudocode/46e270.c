
/* WARNING: Possible PIC construction at 0x0046e838: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0046e7cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0046e83c) */
/* WARNING: Removing unreachable block (ram,0x0046e848) */
/* WARNING: Removing unreachable block (ram,0x0046e850) */
/* WARNING: Removing unreachable block (ram,0x0046e860) */
/* WARNING: Removing unreachable block (ram,0x0046e878) */
/* WARNING: Removing unreachable block (ram,0x0046e7d0) */
/* WARNING: Removing unreachable block (ram,0x0046e6b0) */
/* WARNING: Removing unreachable block (ram,0x0046e6b8) */
/* WARNING: Removing unreachable block (ram,0x0046e6c4) */
/* WARNING: Removing unreachable block (ram,0x0046e6cc) */

undefined8
FUN_0046e270(undefined8 *param_1,ulong param_2,uint param_3,uint param_4,undefined8 param_5,
            long param_6,char *param_7)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  undefined8 **ppuVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  byte *pbVar11;
  byte *pbVar12;
  ulong uVar13;
  byte *pbVar14;
  byte *pbVar15;
  ulong uVar16;
  uint uVar17;
  char cVar18;
  bool bVar19;
  int iVar20;
  long lVar21;
  undefined8 unaff_x20;
  undefined8 uVar22;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  uint uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  byte bVar29;
  undefined1 auVar30 [16];
  undefined8 *puStack_198;
  ulong uStack_190;
  undefined8 *puStack_188;
  undefined *puStack_180;
  undefined8 ***pppuStack_178;
  undefined *puStack_170;
  undefined *puStack_168;
  undefined8 uStack_160;
  undefined8 **ppuStack_158;
  undefined *puStack_150;
  undefined8 uStack_148;
  undefined2 uStack_140;
  undefined4 uStack_13e;
  undefined2 uStack_13a;
  undefined4 uStack_136;
  undefined2 uStack_132;
  undefined *puStack_130;
  undefined8 uStack_128;
  dword *pdStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  long lStack_100;
  ulong uStack_f8;
  ulong uStack_f0;
  ulong uStack_e8;
  undefined8 uStack_e0;
  undefined8 *puStack_d8;
  undefined8 uStack_c0;
  long lStack_b8;
  char *pcStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  byte bStack_98;
  ulong uStack_90;
  undefined8 uStack_88;
  ulong uStack_80;
  ulong uStack_78;
  undefined8 *puStack_70;
  undefined1 *puStack_68;
  ulong *puStack_60;
  undefined8 *puStack_58;
  ulong *puStack_50;
  char **ppcStack_48;
  
  uStack_a8 = 1;
  bStack_98 = 0x30;
  uStack_a0 = 0x3030303030303030;
  uVar5 = *(uint *)(param_1 + 2);
  uStack_c0 = param_5;
  lStack_b8 = param_6;
  pcStack_b0 = param_7;
  if (param_3 == 0) {
    uVar7 = 0;
    uVar13 = (ulong)*(ushort *)((long)param_1 + 0x16);
    uStack_90 = 0;
    goto code_r0x0046e648;
  }
  uVar13 = (ulong)*(ushort *)((long)param_1 + 0x16);
  uVar7 = 9;
  if ((uVar5 & 0x10000000) != 0) {
    uVar7 = uVar13;
  }
  if (uVar7 == 0) {
    uStack_90 = uVar7;
    if (param_3 < param_4 * 5) {
      uVar7 = 0;
code_r0x0046e648:
      uStack_80 = param_2;
      uStack_88 = 1;
      bVar19 = true;
    }
    else {
code_r0x0046e574:
      if (param_2 != 0xffffffffffffffff) {
        param_2 = param_2 + 1;
        goto code_r0x0046e648;
      }
      uStack_88 = 0;
      bVar19 = false;
    }
    uVar24 = uVar13;
    if (8 < uVar13) {
      uVar24 = 9;
    }
    uStack_78 = uVar7;
    if ((uVar5 & 0x10000000) != 0) {
      uStack_78 = uVar24;
    }
    puStack_70 = &uStack_88;
    puStack_68 = (undefined1 *)&uStack_c0;
    puStack_60 = &uStack_78;
    puStack_58 = &uStack_a0;
    puStack_50 = &uStack_90;
    ppcStack_48 = &pcStack_b0;
    puVar10 = param_1;
    if ((uVar5 >> 0x1b & 1) != 0) {
      if (bVar19) {
        if (param_2 == 0) {
          lVar21 = 1;
        }
        else {
          uVar24 = param_2 / 10000000000;
          if (param_2 < 10000000000) {
            uVar24 = param_2;
          }
          uVar17 = 10;
          if (param_2 < 10000000000) {
            uVar17 = 0;
          }
          if (0xc34 < uVar24 >> 5) {
            uVar17 = uVar17 | 5;
            uVar24 = (uVar24 >> 5) / 0xc35;
          }
          iVar20 = (int)uVar24;
          lVar21 = (ulong)(uVar17 + ((iVar20 + 0x5fff6U & iVar20 + 0x7ff9cU ^
                                     iVar20 + 0xdfc18U & iVar20 + 0x7d8f0U) >> 0x11)) + 1;
        }
      }
      else {
        lVar21 = 0x14;
      }
      if ((uVar5 & 0x10000000) != 0) {
        uVar7 = uVar13;
      }
      lVar4 = 0;
      if (uStack_78 != 0) {
        lVar4 = uVar7 + 1;
      }
      uVar7 = lVar4 + param_6 + lVar21 + (ulong)(-0x41 < *param_7);
      if (uVar7 < *(ushort *)((long)param_1 + 0x14)) {
        unaff_x22 = 0;
        uVar17 = (uint)*(ushort *)((long)param_1 + 0x14) - (int)uVar7;
        unaff_x23 = (ulong)uVar17;
        uVar6 = uVar5 >> 0x1d & 3;
        if (uVar6 < 2) {
          if (uVar6 != 0) {
            unaff_x22 = unaff_x23;
          }
        }
        else if (uVar6 == 2) {
          unaff_x22 = (ulong)(uVar17 >> 1 & 0x7fff);
        }
        uVar17 = 0;
        unaff_x20 = *param_1;
        unaff_x24 = param_1[1];
        while ((uVar17 & 0xffff) < ((uint)unaff_x22 & 0xffff)) {
          uVar17 = uVar17 + 1;
          uVar7 = (**(code **)(unaff_x24 + 0x20))(unaff_x20,uVar5 & 0x1fffff);
          if ((uVar7 & 1) != 0) {
            return 1;
          }
        }
        ppuVar8 = &puStack_70;
        goto code_r0x0046e888;
      }
    }
    ppuVar8 = &puStack_70;
  }
  else {
    uVar17 = 0;
    if (param_4 != 0) {
      uVar17 = param_3 / param_4;
    }
    cVar18 = (char)uVar17 + '0';
    uStack_a0 = CONCAT71(0x30303030303030,cVar18);
    param_3 = param_3 - uVar17 * param_4;
    if (param_3 == 0) {
      uVar7 = 1;
      uStack_90 = 1;
      goto code_r0x0046e648;
    }
    uVar17 = param_4 / 10;
    if (uVar7 == 1) {
code_r0x0046e4ec:
      uStack_90 = uVar7;
      uVar24 = uVar13;
      if (param_3 < uVar17 * 5) {
        uVar7 = uVar13;
      }
      else {
        do {
          uVar16 = uVar24 - 1;
          bVar29 = *(byte *)((long)&uStack_a8 + uVar24 + 7);
          cVar18 = '0';
          if (bVar29 < 0x39) {
            cVar18 = bVar29 + 1;
          }
          *(char *)((long)&uStack_a8 + uVar24 + 7) = cVar18;
        } while ((0x38 < bVar29) && (uVar24 = uVar16, uVar16 != 0));
        if (0x38 < bVar29) goto code_r0x0046e574;
      }
      goto code_r0x0046e648;
    }
    if (9 < param_4) {
      uVar17 = 0;
      if (param_4 / 10 != 0) {
        uVar17 = param_3 / (param_4 / 10);
      }
      uStack_a0._0_2_ = CONCAT11((char)uVar17 + '0',cVar18);
      uStack_a0 = CONCAT62(0x303030303030,(undefined2)uStack_a0);
      param_3 = param_3 - uVar17 * (param_4 / 10);
      if (param_3 == 0) {
        uVar7 = 2;
        uStack_90 = 2;
      }
      else {
        uVar17 = param_4 / 100;
        if (uVar7 == 2) goto code_r0x0046e4ec;
        if (param_4 < 100) goto code_r0x0046e87c;
        uVar17 = 0;
        if (param_4 / 100 != 0) {
          uVar17 = param_3 / (param_4 / 100);
        }
        uStack_a0._0_3_ = CONCAT12((char)uVar17 + '0',(undefined2)uStack_a0);
        uStack_a0 = CONCAT53(0x3030303030,(undefined3)uStack_a0);
        param_3 = param_3 - uVar17 * (param_4 / 100);
        if (param_3 == 0) {
          uVar7 = 3;
          uStack_90 = 3;
        }
        else {
          uVar17 = param_4 / 1000;
          if (uVar7 == 3) goto code_r0x0046e4ec;
          if (param_4 < 1000) goto code_r0x0046e87c;
          uVar17 = 0;
          if (param_4 / 1000 != 0) {
            uVar17 = param_3 / (param_4 / 1000);
          }
          uStack_a0._0_4_ = CONCAT13((char)uVar17 + '0',(undefined3)uStack_a0);
          uStack_a0 = CONCAT44(0x30303030,(undefined4)uStack_a0);
          param_3 = param_3 - uVar17 * (param_4 / 1000);
          if (param_3 == 0) {
            uVar7 = 4;
            uStack_90 = 4;
          }
          else {
            uVar17 = param_4 / 10000;
            if (uVar7 == 4) goto code_r0x0046e4ec;
            if (param_4 >> 4 < 0x271) goto code_r0x0046e87c;
            uVar17 = 0;
            if (param_4 / 10000 != 0) {
              uVar17 = param_3 / (param_4 / 10000);
            }
            uStack_a0._0_5_ = CONCAT14((char)uVar17 + '0',(undefined4)uStack_a0);
            uStack_a0 = CONCAT35(0x303030,(undefined5)uStack_a0);
            param_3 = param_3 - uVar17 * (param_4 / 10000);
            if (param_3 == 0) {
              uVar7 = 5;
              uStack_90 = 5;
            }
            else {
              uVar6 = param_4 >> 5;
              uVar17 = uVar6 / 0xc35;
              if (uVar7 == 5) goto code_r0x0046e4ec;
              if (uVar6 < 0xc35) goto code_r0x0046e87c;
              uVar17 = 0;
              if (uVar6 / 0xc35 != 0) {
                uVar17 = (param_3 & 0xffff) / (uVar6 / 0xc35);
              }
              uStack_a0._0_6_ = CONCAT15((char)uVar17 + '0',(undefined5)uStack_a0);
              uStack_a0 = CONCAT26(0x3030,(undefined6)uStack_a0);
              param_3 = (param_3 & 0xffff) - uVar17 * (uVar6 / 0xc35);
              if (param_3 == 0) {
                uVar7 = 6;
                uStack_90 = 6;
              }
              else {
                uVar17 = param_4 / 1000000;
                if (uVar7 == 6) {
code_r0x0046e4e8:
                  param_3 = param_3 & 0xffff;
                  goto code_r0x0046e4ec;
                }
                if (param_4 < 1000000) goto code_r0x0046e87c;
                uVar17 = 0;
                if (param_4 / 1000000 != 0) {
                  uVar17 = (param_3 & 0xffff) / (param_4 / 1000000);
                }
                uStack_a0._0_7_ = CONCAT16((char)uVar17 + '0',(undefined6)uStack_a0);
                uStack_a0 = CONCAT17(0x30,(undefined7)uStack_a0);
                param_3 = (param_3 & 0xffff) - uVar17 * (param_4 / 1000000);
                if (param_3 == 0) {
                  uVar7 = 7;
                  uStack_90 = 7;
                }
                else {
                  uVar17 = param_4 / 10000000;
                  if (uVar7 == 7) goto code_r0x0046e4e8;
                  if (param_4 < 10000000) goto code_r0x0046e87c;
                  uVar17 = (uint)((ulong)param_4 / 10000000);
                  param_3 = param_3 & 0xff;
                  cVar18 = '\0';
                  if (((ulong)param_4 / 10000000 & 0xff) != 0) {
                    cVar18 = (char)(param_3 / (uVar17 & 0xff));
                  }
                  uStack_a0 = CONCAT17(cVar18 + '0',(undefined7)uStack_a0);
                  uVar6 = 0;
                  if (uVar17 != 0) {
                    uVar6 = param_3 / (param_4 / 10000000);
                  }
                  param_3 = param_3 - uVar6 * (param_4 / 10000000);
                  if (param_3 == 0) {
                    uVar7 = 8;
                    uStack_90 = 8;
                  }
                  else {
                    uVar17 = (uint)(99999999 < param_4);
                    if (uVar7 == 8) goto code_r0x0046e4ec;
                    if (param_4 < 100000000) goto code_r0x0046e87c;
                    bStack_98 = (byte)param_3 | 0x30;
                    uVar7 = 9;
                    uStack_90 = 9;
                  }
                }
              }
            }
          }
        }
      }
      goto code_r0x0046e648;
    }
code_r0x0046e87c:
    auVar30 = func_0x007a2d24(&UNK_009e09d0);
    puVar10 = auVar30._8_8_;
    ppuVar8 = auVar30._0_8_;
  }
code_r0x0046e888:
  lStack_100 = unaff_x24;
  uStack_f8 = unaff_x23;
  uStack_f0 = unaff_x22;
  uStack_e8 = (ulong)uVar5;
  uStack_e0 = unaff_x20;
  puStack_d8 = param_1;
  if (*(int *)*ppuVar8 == 1) {
    ppuStack_158 = *(undefined8 ***)((long)*ppuVar8 + 8);
    puStack_188 = ppuVar8[1];
    puStack_180 = &DAT_00477a40;
    pppuStack_178 = &ppuStack_158;
    puStack_170 = &
                  __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
    ;
    puStack_130 = &UNK_008944e0;
    uStack_128 = 2;
    uStack_118 = 2;
    uStack_110 = 0;
    pdStack_120 = (dword *)&puStack_188;
    uVar9 = *puVar10;
    uVar22 = puVar10[1];
    uVar7 = func_0x0046849c(uVar9,uVar22,&puStack_130);
    if ((uVar7 & 1) != 0) {
      return 1;
    }
  }
  else {
    puStack_188 = ppuVar8[1];
    puStack_180 = &DAT_00477a40;
    puStack_130 = &UNK_009e09e8;
    uStack_128 = 2;
    pdStack_120 = (dword *)&puStack_188;
    uStack_118 = 1;
    uStack_110 = 0;
    uVar9 = *puVar10;
    uVar22 = puVar10[1];
    uVar7 = func_0x0046849c(uVar9,uVar22,&puStack_130);
    if ((uVar7 & 1) != 0) {
      return 1;
    }
  }
  uVar7 = *ppuVar8[2];
  if (uVar7 == 0) goto code_r0x0046ea2c;
  if (9 < uVar7) {
    auVar30 = func_0x007a28b0(uVar7,9,&UNK_009e0a08);
    puVar10 = auVar30._8_8_;
    if (*auVar30._0_8_ == '\x01') {
      pbVar11 = &UNK_008945a3;
      pbVar12 = (byte *)0x48;
    }
    else {
      pbVar11 = &UNK_00894568;
      pbVar12 = (byte *)0x3b;
    }
    uVar5 = *(uint *)(puVar10 + 2);
    if ((uVar5 & 0x18000000) != 0) {
      if ((uVar5 >> 0x1c & 1) == 0) {
        if (pbVar12 < (byte *)0x20) {
          if (pbVar12 == (byte *)0x0) {
            uVar7 = 0;
          }
          else {
            if ((byte *)0x7 < pbVar12) {
              pbVar14 = (byte *)((ulong)pbVar12 & 0x18);
              uVar9 = *(undefined8 *)pbVar11;
              uVar7 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
              uVar13 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
              uVar24 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x20)) & 1);
              uVar16 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x28)) & 1);
              uVar25 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
              uVar26 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
              uVar27 = (ulong)(-(-0x41 < (char)uVar9) & 1);
              uVar28 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
              if (pbVar14 != (byte *)0x8) {
                uVar9 = *(undefined8 *)(pbVar11 + 8);
                bVar29 = -(-0x41 < (char)((ulong)uVar9 >> 0x28));
                uVar7 = uVar7 + (-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
                uVar13 = uVar13 + (-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
                uVar24 = uVar24 + ((ulong)((uint6)CONCAT14(bVar29,(uint)CONCAT12(bVar29,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar9 >> 0x20)))) &
                                          0xffff0000ffff) & 0xffffff01);
                uVar16 = uVar16 + ((ulong)bVar29 & 0xffffff01);
                uVar25 = uVar25 + (-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
                uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
                uVar27 = uVar27 + (-(-0x41 < (char)uVar9) & 1);
                uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
                if (pbVar14 != (byte *)0x10) {
                  uVar9 = *(undefined8 *)(pbVar11 + 0x10);
                  bVar29 = -(-0x41 < (char)((ulong)uVar9 >> 0x28));
                  uVar7 = uVar7 + (-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
                  uVar13 = uVar13 + (-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
                  uVar24 = uVar24 + ((ulong)((uint6)CONCAT14(bVar29,(uint)CONCAT12(bVar29,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar9 >> 0x20)))) &
                                            0xffff0000ffff) & 0xffffff01);
                  uVar16 = uVar16 + ((ulong)bVar29 & 0xffffff01);
                  uVar25 = uVar25 + (-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
                  uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
                  uVar27 = uVar27 + (-(-0x41 < (char)uVar9) & 1);
                  uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
                }
              }
              uVar7 = uVar27 + uVar24 + uVar25 + uVar7 + uVar28 + uVar16 + uVar26 + uVar13;
              goto code_r0x00468ca4;
            }
            uVar7 = 0;
            pbVar14 = (byte *)0x0;
            do {
              if (-0x41 < (char)pbVar11[(long)pbVar14]) {
                uVar7 = uVar7 + 1;
              }
              pbVar14 = pbVar14 + 1;
code_r0x00468ca4:
            } while (pbVar12 != pbVar14);
          }
        }
        else {
          uVar7 = func_0x0046bd58(pbVar11,pbVar12);
        }
      }
      else {
        uVar7 = (ulong)*(ushort *)((long)puVar10 + 0x16);
        if (uVar7 == 0) {
          pbVar12 = (byte *)0x0;
          uVar13 = 0;
        }
        else {
          pbVar14 = pbVar11 + (long)pbVar12;
          pbVar12 = (byte *)0x0;
          uVar13 = uVar7;
          pbVar15 = pbVar11;
          do {
            if (pbVar15 == pbVar14) break;
            bVar29 = *pbVar15;
            pbVar3 = pbVar15 + 3;
            if (0xef < bVar29) {
              pbVar3 = pbVar15 + 4;
            }
            pbVar2 = pbVar15 + 2;
            if (0xdf < bVar29) {
              pbVar2 = pbVar3;
            }
            pbVar3 = pbVar15 + 1;
            if (((int)(char)bVar29 & 0x80000000U) != 0) {
              pbVar3 = pbVar2;
            }
            pbVar12 = pbVar3 + ((long)pbVar12 - (long)pbVar15);
            uVar13 = uVar13 - 1;
            pbVar15 = pbVar3;
          } while (uVar13 != 0);
        }
        uVar7 = uVar7 - uVar13;
      }
      if (uVar7 < *(ushort *)((long)puVar10 + 0x14)) {
        uVar6 = (uint)*(ushort *)((long)puVar10 + 0x14) - (int)uVar7;
        uVar23 = uVar5 >> 0x1d & 3;
        uVar17 = uVar6 >> 1 & 0x7fff;
        if (uVar23 != 2) {
          uVar17 = 0;
        }
        uVar1 = 0;
        if (uVar23 != 0) {
          uVar1 = uVar6;
        }
        if (uVar23 < 2) {
          uVar17 = uVar1;
        }
        uVar23 = 0;
        uVar9 = *puVar10;
        lVar21 = puVar10[1];
        do {
          if ((uVar17 & 0xffff) <= (uVar23 & 0xffff)) {
            uVar7 = (**(code **)(lVar21 + 0x18))(uVar9,pbVar11,pbVar12);
            if ((uVar7 & 1) != 0) {
              return 1;
            }
            uVar23 = 0;
            do {
              if ((uVar6 - uVar17 & 0xffff) <= (uVar23 & 0xffff)) {
                return 0;
              }
              uVar23 = uVar23 + 1;
              uVar7 = (**(code **)(lVar21 + 0x20))(uVar9,uVar5 & 0x1fffff);
            } while ((uVar7 & 1) == 0);
            return 1;
          }
          uVar23 = uVar23 + 1;
          uVar7 = (**(code **)(lVar21 + 0x20))(uVar9,uVar5 & 0x1fffff);
        } while ((uVar7 & 1) == 0);
        return 1;
      }
    }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar9 = (**(code **)(puVar10[1] + 0x18))(*puVar10,pbVar11,pbVar12);
    return uVar9;
  }
  puStack_198 = ppuVar8[3];
  uStack_190 = uVar7;
  if ((*(byte *)((long)puVar10 + 0x13) >> 4 & 1) == 0) {
    uVar7 = *ppuVar8[4];
    if (uVar7 >> 0x10 != 0) {
      puStack_130 = &UNK_009e0a30;
      uStack_128 = 1;
      uStack_118 = 0;
      uStack_110 = 0;
      pdStack_120 = &MACH_HEADER.cpusubtype;
      func_0x007a2420(&puStack_130,&UNK_009e0a40);
      goto code_r0x0046e9c4;
    }
  }
  else {
code_r0x0046e9c4:
    uVar7 = (ulong)*(ushort *)((long)puVar10 + 0x16);
  }
  ppuStack_158 = &puStack_198;
  puStack_150 = &DAT_00477a40;
  uStack_148 = 0;
  uStack_140 = (undefined2)uVar7;
  uStack_13e = uStack_136;
  uStack_13a = uStack_132;
  puStack_188 = (undefined8 *)&UNK_009e0a20;
  puStack_180 = (undefined *)0x1;
  puStack_168 = &UNK_00894518;
  uStack_160 = 1;
  pppuStack_178 = &ppuStack_158;
  puStack_170 = (undefined *)0x2;
  uVar7 = func_0x0046849c(uVar9,uVar22,&puStack_188);
  if ((uVar7 & 1) != 0) {
    return 1;
  }
code_r0x0046ea2c:
  puStack_188 = ppuVar8[5];
  puStack_180 = &DAT_00477a40;
  puStack_130 = &UNK_007fc120;
  uStack_128 = 1;
  uStack_118 = 1;
  uStack_110 = 0;
  pdStack_120 = (dword *)&puStack_188;
  uVar9 = func_0x0046849c(uVar9,uVar22,&puStack_130);
  return uVar9;
}

