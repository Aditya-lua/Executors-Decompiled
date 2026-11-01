
undefined8 FUN_0022fde8(byte *param_1,byte *param_2,undefined8 *param_3)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  ulong uVar9;
  byte *pbVar10;
  long lVar11;
  byte *pbVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *pbVar16;
  code *pcVar17;
  uint uVar18;
  code *pcVar19;
  uint uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  byte bVar28;
  undefined1 auVar29 [16];
  char acStack_6c [4];
  undefined4 uStack_68;
  byte bStack_62;
  byte bStack_61;
  
  uVar8 = *param_3;
  lVar5 = param_3[1];
  pcVar19 = *(code **)(lVar5 + 0x20);
  uVar9 = (*pcVar19)(uVar8,0x22);
  if ((uVar9 & 1) == 0) {
    if (param_2 == (byte *)0x0) {
      pbVar15 = (byte *)0x0;
      pbVar16 = (byte *)0x0;
    }
    else {
      pbVar16 = (byte *)0x0;
      pbVar10 = param_1;
      pbVar12 = param_2;
      pbVar13 = (byte *)0x0;
      do {
        while( true ) {
          pbVar14 = (byte *)0x0;
          pbVar1 = pbVar10 + (long)pbVar12;
          while( true ) {
            bVar28 = pbVar10[(long)pbVar14];
            if (((bVar28 - 0x7f < 0xffffffa1) || (bVar28 == 0x22)) || (bVar28 == 0x5c)) break;
            pbVar14 = pbVar14 + 1;
            if (pbVar12 == pbVar14) {
              pbVar15 = pbVar12 + (long)pbVar13;
              goto code_r0x0046accc;
            }
          }
          pbVar15 = pbVar13 + (long)pbVar14;
          pbVar12 = pbVar10 + (long)pbVar14;
          uVar18 = (uint)*pbVar12;
          if ((char)*pbVar12 < '\0') break;
          pbVar10 = pbVar12 + 1;
code_r0x0046ab60:
          func_0x004623d8(acStack_6c,uVar18,&UNK_00010001);
          if ((acStack_6c[0] != -0x80) && ((byte)(bStack_61 - bStack_62) != '\x01')) {
            if (pbVar15 < pbVar16) goto code_r0x0046ad84;
            if (pbVar16 != (byte *)0x0) {
              if (pbVar16 < param_2) {
                if (-0x41 < (char)param_1[(long)pbVar16]) goto code_r0x0046abc0;
              }
              else if (pbVar16 == param_2) goto code_r0x0046abc0;
              goto code_r0x0046ad84;
            }
code_r0x0046abc0:
            if (pbVar15 != (byte *)0x0) {
              if (pbVar15 < param_2) {
                if ((char)(param_1 + (long)pbVar13)[(long)pbVar14] < -0x40) goto code_r0x0046ad84;
              }
              else if (pbVar15 != param_2) {
code_r0x0046ad84:
                func_0x007a297c(param_1,param_2,pbVar16,pbVar13 + (long)pbVar14,&UNK_009e06f8);
                goto code_r0x0046ada4;
              }
            }
            pcVar17 = *(code **)(lVar5 + 0x18);
            uVar9 = (*pcVar17)(uVar8,param_1 + (long)pbVar16,
                               pbVar14 + ((long)pbVar13 - (long)pbVar16));
            if ((uVar9 & 1) != 0) {
              return 1;
            }
            if (acStack_6c[0] == -0x80) {
              uVar9 = (*pcVar19)(uVar8,uStack_68);
            }
            else {
              uVar9 = (*pcVar17)(uVar8,acStack_6c + bStack_62,(ulong)bStack_61 - (ulong)bStack_62);
            }
            if ((uVar9 & 1) != 0) {
              return 1;
            }
            if (uVar18 < 0x80) {
              lVar11 = 1;
            }
            else if (uVar18 < 0x800) {
              lVar11 = 2;
            }
            else {
              lVar11 = 3;
              if (0xffff < uVar18) {
                lVar11 = 4;
              }
            }
            pbVar16 = pbVar13 + (long)pbVar14 + lVar11;
          }
          lVar11 = 3;
          if (0xffff < uVar18) {
            lVar11 = 4;
          }
          lVar4 = 2;
          if (0x7ff < uVar18) {
            lVar4 = lVar11;
          }
          lVar11 = 1;
          if (0x7f < uVar18) {
            lVar11 = lVar4;
          }
          pbVar15 = pbVar13 + (long)pbVar14 + lVar11;
          pbVar12 = pbVar1 + -(long)pbVar10;
          pbVar13 = pbVar15;
          if (pbVar12 == (byte *)0x0) goto code_r0x0046accc;
        }
        uVar7 = pbVar12[1] & 0x3f;
        if (uVar18 < 0xe0) {
          uVar18 = uVar7 | (uVar18 & 0x1f) << 6;
          pbVar10 = pbVar12 + 2;
          goto code_r0x0046ab60;
        }
        pbVar2 = pbVar10 + (long)pbVar14;
        uVar7 = pbVar12[2] & 0x3f | uVar7 << 6;
        if (uVar18 < 0xf0) {
          uVar18 = uVar7 | (uVar18 & 0x1f) << 0xc;
          pbVar10 = pbVar2 + 3;
          goto code_r0x0046ab60;
        }
        pbVar10 = pbVar2 + 4;
        uVar18 = pbVar2[3] & 0x3f | uVar7 << 6 | (uVar18 & 7) << 0x12;
        if (uVar18 != 0x110000) goto code_r0x0046ab60;
        pbVar12 = pbVar1 + -(long)pbVar10;
        pbVar13 = pbVar15;
      } while (pbVar12 != (byte *)0x0);
code_r0x0046accc:
      if (pbVar15 < pbVar16) goto code_r0x0046ada4;
      if (pbVar16 != (byte *)0x0) {
        if (pbVar16 < param_2) {
          if ((char)param_1[(long)pbVar16] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar16 != param_2) goto code_r0x0046ada4;
      }
      if (pbVar15 != (byte *)0x0) {
        if (pbVar15 < param_2) {
          if ((char)param_1[(long)pbVar15] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar15 != param_2) {
code_r0x0046ada4:
          auVar29 = func_0x007a297c(param_1,param_2,pbVar16,pbVar15,&UNK_009e0710);
          pbVar15 = auVar29._8_8_;
          pbVar10 = auVar29._0_8_;
          uVar18 = *(uint *)(pbVar16 + 0x10);
          if ((uVar18 & 0x18000000) != 0) {
            if ((uVar18 >> 0x1c & 1) == 0) {
              if (pbVar15 < (byte *)0x20) {
                if (pbVar15 == (byte *)0x0) {
                  uVar9 = 0;
                }
                else {
                  if ((byte *)0x7 < pbVar15) {
                    pbVar12 = (byte *)((ulong)pbVar15 & 0x18);
                    uVar8 = *(undefined8 *)pbVar10;
                    uVar9 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                    uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                    uVar22 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1);
                    uVar23 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1);
                    uVar24 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                    uVar25 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                    uVar26 = (ulong)(-(-0x41 < (char)uVar8) & 1);
                    uVar27 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                    if (pbVar12 != (byte *)0x8) {
                      uVar8 = *(undefined8 *)(pbVar10 + 8);
                      bVar28 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                      uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                      uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                      uVar22 = uVar22 + ((ulong)((uint6)CONCAT14(bVar28,(uint)CONCAT12(bVar28,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20
                                                                               )))) & 0xffff0000ffff
                                                ) & 0xffffff01);
                      uVar23 = uVar23 + ((ulong)bVar28 & 0xffffff01);
                      uVar24 = uVar24 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                      uVar25 = uVar25 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                      uVar26 = uVar26 + (-(-0x41 < (char)uVar8) & 1);
                      uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                      if (pbVar12 != (byte *)0x10) {
                        uVar8 = *(undefined8 *)(pbVar10 + 0x10);
                        bVar28 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                        uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                        uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                        uVar22 = uVar22 + ((ulong)((uint6)CONCAT14(bVar28,(uint)CONCAT12(bVar28,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20
                                                                               )))) & 0xffff0000ffff
                                                  ) & 0xffffff01);
                        uVar23 = uVar23 + ((ulong)bVar28 & 0xffffff01);
                        uVar24 = uVar24 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                        uVar25 = uVar25 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                        uVar26 = uVar26 + (-(-0x41 < (char)uVar8) & 1);
                        uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                      }
                    }
                    uVar9 = uVar26 + uVar22 + uVar24 + uVar9 + uVar27 + uVar23 + uVar25 + uVar21;
                    goto code_r0x00468ca4;
                  }
                  uVar9 = 0;
                  pbVar12 = (byte *)0x0;
                  do {
                    if (-0x41 < (char)pbVar10[(long)pbVar12]) {
                      uVar9 = uVar9 + 1;
                    }
                    pbVar12 = pbVar12 + 1;
code_r0x00468ca4:
                  } while (pbVar15 != pbVar12);
                }
              }
              else {
                uVar9 = func_0x0046bd58(pbVar10,pbVar15);
              }
            }
            else {
              uVar9 = (ulong)*(ushort *)(pbVar16 + 0x16);
              if (uVar9 == 0) {
                pbVar15 = (byte *)0x0;
                uVar21 = 0;
              }
              else {
                pbVar12 = pbVar10 + (long)pbVar15;
                pbVar15 = (byte *)0x0;
                uVar21 = uVar9;
                pbVar13 = pbVar10;
                do {
                  if (pbVar13 == pbVar12) break;
                  bVar28 = *pbVar13;
                  pbVar14 = pbVar13 + 3;
                  if (0xef < bVar28) {
                    pbVar14 = pbVar13 + 4;
                  }
                  pbVar1 = pbVar13 + 2;
                  if (0xdf < bVar28) {
                    pbVar1 = pbVar14;
                  }
                  pbVar14 = pbVar13 + 1;
                  if (((int)(char)bVar28 & 0x80000000U) != 0) {
                    pbVar14 = pbVar1;
                  }
                  pbVar15 = pbVar14 + ((long)pbVar15 - (long)pbVar13);
                  uVar21 = uVar21 - 1;
                  pbVar13 = pbVar14;
                } while (uVar21 != 0);
              }
              uVar9 = uVar9 - uVar21;
            }
            if (uVar9 < *(ushort *)(pbVar16 + 0x14)) {
              uVar6 = (uint)*(ushort *)(pbVar16 + 0x14) - (int)uVar9;
              uVar20 = uVar18 >> 0x1d & 3;
              uVar7 = uVar6 >> 1 & 0x7fff;
              if (uVar20 != 2) {
                uVar7 = 0;
              }
              uVar3 = 0;
              if (uVar20 != 0) {
                uVar3 = uVar6;
              }
              if (uVar20 < 2) {
                uVar7 = uVar3;
              }
              uVar20 = 0;
              uVar8 = *(undefined8 *)pbVar16;
              lVar5 = *(long *)(pbVar16 + 8);
              do {
                if ((uVar7 & 0xffff) <= (uVar20 & 0xffff)) {
                  uVar9 = (**(code **)(lVar5 + 0x18))(uVar8,pbVar10,pbVar15);
                  if ((uVar9 & 1) != 0) {
                    return 1;
                  }
                  uVar20 = 0;
                  do {
                    if ((uVar6 - uVar7 & 0xffff) <= (uVar20 & 0xffff)) {
                      return 0;
                    }
                    uVar20 = uVar20 + 1;
                    uVar9 = (**(code **)(lVar5 + 0x20))(uVar8,uVar18 & 0x1fffff);
                  } while ((uVar9 & 1) == 0);
                  return 1;
                }
                uVar20 = uVar20 + 1;
                uVar9 = (**(code **)(lVar5 + 0x20))(uVar8,uVar18 & 0x1fffff);
              } while ((uVar9 & 1) == 0);
              return 1;
            }
          }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar8 = (**(code **)(*(long *)(pbVar16 + 8) + 0x18))
                            (*(undefined8 *)pbVar16,pbVar10,pbVar15);
          return uVar8;
        }
      }
    }
    uVar9 = (**(code **)(lVar5 + 0x18))(uVar8,param_1 + (long)pbVar16,(long)pbVar15 - (long)pbVar16)
    ;
    if ((uVar9 & 1) == 0) {
      uVar8 = (*pcVar19)(uVar8,0x22);
      return uVar8;
    }
  }
  return 1;
}

