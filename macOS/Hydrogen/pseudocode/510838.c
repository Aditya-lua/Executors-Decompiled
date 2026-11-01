
long FUN_00510838(undefined8 param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  long lVar8;
  byte *pbVar9;
  ulong uVar10;
  byte *pbVar11;
  long lVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *pbVar16;
  long unaff_x20;
  byte *pbVar17;
  long unaff_x22;
  code *pcVar18;
  int *unaff_x23;
  uint uVar19;
  code *pcVar20;
  long unaff_x24;
  int *unaff_x25;
  uint uVar21;
  byte *pbVar22;
  undefined8 uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  byte bVar31;
  undefined1 auVar32 [16];
  char acStack_6c [4];
  undefined4 uStack_68;
  byte bStack_62;
  byte bStack_61;
  
  while( true ) {
    iVar7 = _memcmp(param_1);
    if (iVar7 == 0) break;
    do {
      unaff_x23 = unaff_x25;
      unaff_x24 = unaff_x24 + -0x20;
      if (unaff_x24 == 0) {
        auVar32 = func_0x007a23d8(&UNK_008a4fb3,99);
        goto __ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE;
      }
      unaff_x25 = unaff_x23 + 8;
    } while ((*unaff_x23 != 1) || (*(long *)(unaff_x23 + 4) != unaff_x22));
    param_1 = *(undefined8 *)(unaff_x23 + 2);
  }
  uVar10 = *(ulong *)(unaff_x23 + 6);
  auVar32._8_8_ = *(ulong *)(unaff_x20 + 0x10);
  auVar32._0_8_ = uVar10;
  if (uVar10 < *(ulong *)(unaff_x20 + 0x10)) {
    return *(long *)(unaff_x20 + 8) + uVar10 * 600;
  }
__ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE:
  auVar32 = func_0x007a2570(auVar32._0_8_,auVar32._8_8_,&UNK_009e93b8);
  pbVar16 = (byte *)*auVar32._0_8_;
  pbVar9 = (byte *)auVar32._0_8_[1];
  uVar23 = *auVar32._8_8_;
  lVar8 = auVar32._8_8_[1];
  pcVar20 = *(code **)(lVar8 + 0x20);
  uVar10 = (*pcVar20)(uVar23,0x22);
  if ((uVar10 & 1) == 0) {
    if (pbVar9 == (byte *)0x0) {
      pbVar13 = (byte *)0x0;
      pbVar17 = (byte *)0x0;
    }
    else {
      pbVar17 = (byte *)0x0;
      pbVar11 = pbVar16;
      pbVar14 = pbVar9;
      pbVar22 = (byte *)0x0;
      do {
        while( true ) {
          pbVar15 = (byte *)0x0;
          pbVar1 = pbVar11 + (long)pbVar14;
          while( true ) {
            bVar31 = pbVar11[(long)pbVar15];
            if (((bVar31 - 0x7f < 0xffffffa1) || (bVar31 == 0x22)) || (bVar31 == 0x5c)) break;
            pbVar15 = pbVar15 + 1;
            if (pbVar14 == pbVar15) {
              pbVar13 = pbVar14 + (long)pbVar22;
              goto code_r0x0046accc;
            }
          }
          pbVar13 = pbVar22 + (long)pbVar15;
          pbVar14 = pbVar11 + (long)pbVar15;
          uVar19 = (uint)*pbVar14;
          if ((char)*pbVar14 < '\0') break;
          pbVar11 = pbVar14 + 1;
code_r0x0046ab60:
          func_0x004623d8(acStack_6c,uVar19,&UNK_00010001);
          if ((acStack_6c[0] != -0x80) && ((byte)(bStack_61 - bStack_62) != '\x01')) {
            if (pbVar13 < pbVar17) goto code_r0x0046ad84;
            if (pbVar17 != (byte *)0x0) {
              if (pbVar17 < pbVar9) {
                if (-0x41 < (char)pbVar16[(long)pbVar17]) goto code_r0x0046abc0;
              }
              else if (pbVar17 == pbVar9) goto code_r0x0046abc0;
              goto code_r0x0046ad84;
            }
code_r0x0046abc0:
            if (pbVar13 != (byte *)0x0) {
              if (pbVar13 < pbVar9) {
                if ((char)(pbVar16 + (long)pbVar22)[(long)pbVar15] < -0x40) goto code_r0x0046ad84;
              }
              else if (pbVar13 != pbVar9) {
code_r0x0046ad84:
                func_0x007a297c(pbVar16,pbVar9,pbVar17,pbVar22 + (long)pbVar15,&UNK_009e06f8);
                goto code_r0x0046ada4;
              }
            }
            pcVar18 = *(code **)(lVar8 + 0x18);
            uVar10 = (*pcVar18)(uVar23,pbVar16 + (long)pbVar17,
                                pbVar15 + ((long)pbVar22 - (long)pbVar17));
            if ((uVar10 & 1) != 0) {
              return 1;
            }
            if (acStack_6c[0] == -0x80) {
              uVar10 = (*pcVar20)(uVar23,uStack_68);
            }
            else {
              uVar10 = (*pcVar18)(uVar23,acStack_6c + bStack_62,(ulong)bStack_61 - (ulong)bStack_62)
              ;
            }
            if ((uVar10 & 1) != 0) {
              return 1;
            }
            if (uVar19 < 0x80) {
              lVar12 = 1;
            }
            else if (uVar19 < 0x800) {
              lVar12 = 2;
            }
            else {
              lVar12 = 3;
              if (0xffff < uVar19) {
                lVar12 = 4;
              }
            }
            pbVar17 = pbVar22 + (long)pbVar15 + lVar12;
          }
          lVar12 = 3;
          if (0xffff < uVar19) {
            lVar12 = 4;
          }
          lVar4 = 2;
          if (0x7ff < uVar19) {
            lVar4 = lVar12;
          }
          lVar12 = 1;
          if (0x7f < uVar19) {
            lVar12 = lVar4;
          }
          pbVar13 = pbVar22 + (long)pbVar15 + lVar12;
          pbVar14 = pbVar1 + -(long)pbVar11;
          pbVar22 = pbVar13;
          if (pbVar14 == (byte *)0x0) goto code_r0x0046accc;
        }
        uVar6 = pbVar14[1] & 0x3f;
        if (uVar19 < 0xe0) {
          uVar19 = uVar6 | (uVar19 & 0x1f) << 6;
          pbVar11 = pbVar14 + 2;
          goto code_r0x0046ab60;
        }
        pbVar2 = pbVar11 + (long)pbVar15;
        uVar6 = pbVar14[2] & 0x3f | uVar6 << 6;
        if (uVar19 < 0xf0) {
          uVar19 = uVar6 | (uVar19 & 0x1f) << 0xc;
          pbVar11 = pbVar2 + 3;
          goto code_r0x0046ab60;
        }
        pbVar11 = pbVar2 + 4;
        uVar19 = pbVar2[3] & 0x3f | uVar6 << 6 | (uVar19 & 7) << 0x12;
        if (uVar19 != 0x110000) goto code_r0x0046ab60;
        pbVar14 = pbVar1 + -(long)pbVar11;
        pbVar22 = pbVar13;
      } while (pbVar14 != (byte *)0x0);
code_r0x0046accc:
      if (pbVar13 < pbVar17) goto code_r0x0046ada4;
      if (pbVar17 != (byte *)0x0) {
        if (pbVar17 < pbVar9) {
          if ((char)pbVar16[(long)pbVar17] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar17 != pbVar9) goto code_r0x0046ada4;
      }
      if (pbVar13 != (byte *)0x0) {
        if (pbVar13 < pbVar9) {
          if ((char)pbVar16[(long)pbVar13] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar13 != pbVar9) {
code_r0x0046ada4:
          auVar32 = func_0x007a297c(pbVar16,pbVar9,pbVar17,pbVar13,&UNK_009e0710);
          pbVar16 = auVar32._8_8_;
          pbVar9 = auVar32._0_8_;
          uVar19 = *(uint *)(pbVar17 + 0x10);
          if ((uVar19 & 0x18000000) != 0) {
            if ((uVar19 >> 0x1c & 1) == 0) {
              if (pbVar16 < (byte *)0x20) {
                if (pbVar16 == (byte *)0x0) {
                  uVar10 = 0;
                }
                else {
                  if ((byte *)0x7 < pbVar16) {
                    pbVar13 = (byte *)((ulong)pbVar16 & 0x18);
                    uVar23 = *(undefined8 *)pbVar9;
                    uVar10 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x30)) & 1);
                    uVar24 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x38)) & 1);
                    uVar25 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x20)) & 1);
                    uVar26 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x28)) & 1);
                    uVar27 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x10)) & 1);
                    uVar28 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 0x18)) & 1);
                    uVar29 = (ulong)(-(-0x41 < (char)uVar23) & 1);
                    uVar30 = (ulong)(-(-0x41 < (char)((ulong)uVar23 >> 8)) & 1);
                    if (pbVar13 != (byte *)0x8) {
                      uVar23 = *(undefined8 *)(pbVar9 + 8);
                      bVar31 = -(-0x41 < (char)((ulong)uVar23 >> 0x28));
                      uVar10 = uVar10 + (-(-0x41 < (char)((ulong)uVar23 >> 0x30)) & 1);
                      uVar24 = uVar24 + (-(-0x41 < (char)((ulong)uVar23 >> 0x38)) & 1);
                      uVar25 = uVar25 + ((ulong)((uint6)CONCAT14(bVar31,(uint)CONCAT12(bVar31,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar23 >>
                                                                               0x20)))) &
                                                0xffff0000ffff) & 0xffffff01);
                      uVar26 = uVar26 + ((ulong)bVar31 & 0xffffff01);
                      uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar23 >> 0x10)) & 1);
                      uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar23 >> 0x18)) & 1);
                      uVar29 = uVar29 + (-(-0x41 < (char)uVar23) & 1);
                      uVar30 = uVar30 + (-(-0x41 < (char)((ulong)uVar23 >> 8)) & 1);
                      if (pbVar13 != (byte *)0x10) {
                        uVar23 = *(undefined8 *)(pbVar9 + 0x10);
                        bVar31 = -(-0x41 < (char)((ulong)uVar23 >> 0x28));
                        uVar10 = uVar10 + (-(-0x41 < (char)((ulong)uVar23 >> 0x30)) & 1);
                        uVar24 = uVar24 + (-(-0x41 < (char)((ulong)uVar23 >> 0x38)) & 1);
                        uVar25 = uVar25 + ((ulong)((uint6)CONCAT14(bVar31,(uint)CONCAT12(bVar31,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar23 >>
                                                                               0x20)))) &
                                                  0xffff0000ffff) & 0xffffff01);
                        uVar26 = uVar26 + ((ulong)bVar31 & 0xffffff01);
                        uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar23 >> 0x10)) & 1);
                        uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar23 >> 0x18)) & 1);
                        uVar29 = uVar29 + (-(-0x41 < (char)uVar23) & 1);
                        uVar30 = uVar30 + (-(-0x41 < (char)((ulong)uVar23 >> 8)) & 1);
                      }
                    }
                    uVar10 = uVar29 + uVar25 + uVar27 + uVar10 + uVar30 + uVar26 + uVar28 + uVar24;
                    goto code_r0x00468ca4;
                  }
                  uVar10 = 0;
                  pbVar13 = (byte *)0x0;
                  do {
                    if (-0x41 < (char)pbVar9[(long)pbVar13]) {
                      uVar10 = uVar10 + 1;
                    }
                    pbVar13 = pbVar13 + 1;
code_r0x00468ca4:
                  } while (pbVar16 != pbVar13);
                }
              }
              else {
                uVar10 = func_0x0046bd58(pbVar9,pbVar16);
              }
            }
            else {
              uVar10 = (ulong)*(ushort *)(pbVar17 + 0x16);
              if (uVar10 == 0) {
                pbVar16 = (byte *)0x0;
                uVar24 = 0;
              }
              else {
                pbVar13 = pbVar9 + (long)pbVar16;
                pbVar16 = (byte *)0x0;
                uVar24 = uVar10;
                pbVar11 = pbVar9;
                do {
                  if (pbVar11 == pbVar13) break;
                  bVar31 = *pbVar11;
                  pbVar14 = pbVar11 + 3;
                  if (0xef < bVar31) {
                    pbVar14 = pbVar11 + 4;
                  }
                  pbVar22 = pbVar11 + 2;
                  if (0xdf < bVar31) {
                    pbVar22 = pbVar14;
                  }
                  pbVar14 = pbVar11 + 1;
                  if (((int)(char)bVar31 & 0x80000000U) != 0) {
                    pbVar14 = pbVar22;
                  }
                  pbVar16 = pbVar14 + ((long)pbVar16 - (long)pbVar11);
                  uVar24 = uVar24 - 1;
                  pbVar11 = pbVar14;
                } while (uVar24 != 0);
              }
              uVar10 = uVar10 - uVar24;
            }
            if (uVar10 < *(ushort *)(pbVar17 + 0x14)) {
              uVar5 = (uint)*(ushort *)(pbVar17 + 0x14) - (int)uVar10;
              uVar21 = uVar19 >> 0x1d & 3;
              uVar6 = uVar5 >> 1 & 0x7fff;
              if (uVar21 != 2) {
                uVar6 = 0;
              }
              uVar3 = 0;
              if (uVar21 != 0) {
                uVar3 = uVar5;
              }
              if (uVar21 < 2) {
                uVar6 = uVar3;
              }
              uVar21 = 0;
              uVar23 = *(undefined8 *)pbVar17;
              lVar8 = *(long *)(pbVar17 + 8);
              do {
                if ((uVar6 & 0xffff) <= (uVar21 & 0xffff)) {
                  uVar10 = (**(code **)(lVar8 + 0x18))(uVar23,pbVar9,pbVar16);
                  if ((uVar10 & 1) != 0) {
                    return 1;
                  }
                  uVar21 = 0;
                  do {
                    if ((uVar5 - uVar6 & 0xffff) <= (uVar21 & 0xffff)) {
                      return 0;
                    }
                    uVar21 = uVar21 + 1;
                    uVar10 = (**(code **)(lVar8 + 0x20))(uVar23,uVar19 & 0x1fffff);
                  } while ((uVar10 & 1) == 0);
                  return 1;
                }
                uVar21 = uVar21 + 1;
                uVar10 = (**(code **)(lVar8 + 0x20))(uVar23,uVar19 & 0x1fffff);
              } while ((uVar10 & 1) == 0);
              return 1;
            }
          }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          lVar8 = (**(code **)(*(long *)(pbVar17 + 8) + 0x18))
                            (*(undefined8 *)pbVar17,pbVar9,pbVar16);
          return lVar8;
        }
      }
    }
    uVar10 = (**(code **)(lVar8 + 0x18))
                       (uVar23,pbVar16 + (long)pbVar17,(long)pbVar13 - (long)pbVar17);
    if ((uVar10 & 1) == 0) {
      lVar8 = (*pcVar20)(uVar23,0x22);
      return lVar8;
    }
  }
  return 1;
}

