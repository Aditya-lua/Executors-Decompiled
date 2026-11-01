
undefined8 FUN_00588994(void)

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
  byte *pbVar11;
  long lVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *pbVar16;
  byte *pbVar17;
  code *pcVar18;
  uint uVar19;
  code *pcVar20;
  uint uVar21;
  byte *pbVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  byte bVar30;
  undefined1 auVar31 [16];
  undefined1 uStack0000000000000020;
  char acStack_6c [4];
  undefined4 uStack_68;
  byte bStack_62;
  byte bStack_61;
  
  func_0x005d2b20(&uStack0000000000000020);
  __Unwind_Resume();
  auVar31 = func_0x007a2668();
  pbVar16 = *(byte **)(auVar31._0_8_ + 8);
  pbVar10 = *(byte **)(auVar31._0_8_ + 0x10);
  uVar8 = *auVar31._8_8_;
  lVar5 = auVar31._8_8_[1];
  pcVar20 = *(code **)(lVar5 + 0x20);
  uVar9 = (*pcVar20)(uVar8,0x22);
  if ((uVar9 & 1) == 0) {
    if (pbVar10 == (byte *)0x0) {
      pbVar13 = (byte *)0x0;
      pbVar17 = (byte *)0x0;
    }
    else {
      pbVar17 = (byte *)0x0;
      pbVar11 = pbVar16;
      pbVar14 = pbVar10;
      pbVar22 = (byte *)0x0;
      do {
        while( true ) {
          pbVar15 = (byte *)0x0;
          pbVar1 = pbVar11 + (long)pbVar14;
          while( true ) {
            bVar30 = pbVar11[(long)pbVar15];
            if (((bVar30 - 0x7f < 0xffffffa1) || (bVar30 == 0x22)) || (bVar30 == 0x5c)) break;
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
              if (pbVar17 < pbVar10) {
                if (-0x41 < (char)pbVar16[(long)pbVar17]) goto code_r0x0046abc0;
              }
              else if (pbVar17 == pbVar10) goto code_r0x0046abc0;
              goto code_r0x0046ad84;
            }
code_r0x0046abc0:
            if (pbVar13 != (byte *)0x0) {
              if (pbVar13 < pbVar10) {
                if ((char)(pbVar16 + (long)pbVar22)[(long)pbVar15] < -0x40) goto code_r0x0046ad84;
              }
              else if (pbVar13 != pbVar10) {
code_r0x0046ad84:
                func_0x007a297c(pbVar16,pbVar10,pbVar17,pbVar22 + (long)pbVar15,&UNK_009e06f8);
                goto code_r0x0046ada4;
              }
            }
            pcVar18 = *(code **)(lVar5 + 0x18);
            uVar9 = (*pcVar18)(uVar8,pbVar16 + (long)pbVar17,
                               pbVar15 + ((long)pbVar22 - (long)pbVar17));
            if ((uVar9 & 1) != 0) {
              return 1;
            }
            if (acStack_6c[0] == -0x80) {
              uVar9 = (*pcVar20)(uVar8,uStack_68);
            }
            else {
              uVar9 = (*pcVar18)(uVar8,acStack_6c + bStack_62,(ulong)bStack_61 - (ulong)bStack_62);
            }
            if ((uVar9 & 1) != 0) {
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
        uVar7 = pbVar14[1] & 0x3f;
        if (uVar19 < 0xe0) {
          uVar19 = uVar7 | (uVar19 & 0x1f) << 6;
          pbVar11 = pbVar14 + 2;
          goto code_r0x0046ab60;
        }
        pbVar2 = pbVar11 + (long)pbVar15;
        uVar7 = pbVar14[2] & 0x3f | uVar7 << 6;
        if (uVar19 < 0xf0) {
          uVar19 = uVar7 | (uVar19 & 0x1f) << 0xc;
          pbVar11 = pbVar2 + 3;
          goto code_r0x0046ab60;
        }
        pbVar11 = pbVar2 + 4;
        uVar19 = pbVar2[3] & 0x3f | uVar7 << 6 | (uVar19 & 7) << 0x12;
        if (uVar19 != 0x110000) goto code_r0x0046ab60;
        pbVar14 = pbVar1 + -(long)pbVar11;
        pbVar22 = pbVar13;
      } while (pbVar14 != (byte *)0x0);
code_r0x0046accc:
      if (pbVar13 < pbVar17) goto code_r0x0046ada4;
      if (pbVar17 != (byte *)0x0) {
        if (pbVar17 < pbVar10) {
          if ((char)pbVar16[(long)pbVar17] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar17 != pbVar10) goto code_r0x0046ada4;
      }
      if (pbVar13 != (byte *)0x0) {
        if (pbVar13 < pbVar10) {
          if ((char)pbVar16[(long)pbVar13] < -0x40) goto code_r0x0046ada4;
        }
        else if (pbVar13 != pbVar10) {
code_r0x0046ada4:
          auVar31 = func_0x007a297c(pbVar16,pbVar10,pbVar17,pbVar13,&UNK_009e0710);
          pbVar16 = auVar31._8_8_;
          pbVar10 = auVar31._0_8_;
          uVar19 = *(uint *)(pbVar17 + 0x10);
          if ((uVar19 & 0x18000000) != 0) {
            if ((uVar19 >> 0x1c & 1) == 0) {
              if (pbVar16 < (byte *)0x20) {
                if (pbVar16 == (byte *)0x0) {
                  uVar9 = 0;
                }
                else {
                  if ((byte *)0x7 < pbVar16) {
                    pbVar13 = (byte *)((ulong)pbVar16 & 0x18);
                    uVar8 = *(undefined8 *)pbVar10;
                    uVar9 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                    uVar23 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                    uVar24 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1);
                    uVar25 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1);
                    uVar26 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                    uVar27 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                    uVar28 = (ulong)(-(-0x41 < (char)uVar8) & 1);
                    uVar29 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                    if (pbVar13 != (byte *)0x8) {
                      uVar8 = *(undefined8 *)(pbVar10 + 8);
                      bVar30 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                      uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                      uVar23 = uVar23 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                      uVar24 = uVar24 + ((ulong)((uint6)CONCAT14(bVar30,(uint)CONCAT12(bVar30,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20
                                                                               )))) & 0xffff0000ffff
                                                ) & 0xffffff01);
                      uVar25 = uVar25 + ((ulong)bVar30 & 0xffffff01);
                      uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                      uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                      uVar28 = uVar28 + (-(-0x41 < (char)uVar8) & 1);
                      uVar29 = uVar29 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                      if (pbVar13 != (byte *)0x10) {
                        uVar8 = *(undefined8 *)(pbVar10 + 0x10);
                        bVar30 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                        uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                        uVar23 = uVar23 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                        uVar24 = uVar24 + ((ulong)((uint6)CONCAT14(bVar30,(uint)CONCAT12(bVar30,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20
                                                                               )))) & 0xffff0000ffff
                                                  ) & 0xffffff01);
                        uVar25 = uVar25 + ((ulong)bVar30 & 0xffffff01);
                        uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                        uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                        uVar28 = uVar28 + (-(-0x41 < (char)uVar8) & 1);
                        uVar29 = uVar29 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                      }
                    }
                    uVar9 = uVar28 + uVar24 + uVar26 + uVar9 + uVar29 + uVar25 + uVar27 + uVar23;
                    goto code_r0x00468ca4;
                  }
                  uVar9 = 0;
                  pbVar13 = (byte *)0x0;
                  do {
                    if (-0x41 < (char)pbVar10[(long)pbVar13]) {
                      uVar9 = uVar9 + 1;
                    }
                    pbVar13 = pbVar13 + 1;
code_r0x00468ca4:
                  } while (pbVar16 != pbVar13);
                }
              }
              else {
                uVar9 = func_0x0046bd58(pbVar10,pbVar16);
              }
            }
            else {
              uVar9 = (ulong)*(ushort *)(pbVar17 + 0x16);
              if (uVar9 == 0) {
                pbVar16 = (byte *)0x0;
                uVar23 = 0;
              }
              else {
                pbVar13 = pbVar10 + (long)pbVar16;
                pbVar16 = (byte *)0x0;
                uVar23 = uVar9;
                pbVar11 = pbVar10;
                do {
                  if (pbVar11 == pbVar13) break;
                  bVar30 = *pbVar11;
                  pbVar14 = pbVar11 + 3;
                  if (0xef < bVar30) {
                    pbVar14 = pbVar11 + 4;
                  }
                  pbVar22 = pbVar11 + 2;
                  if (0xdf < bVar30) {
                    pbVar22 = pbVar14;
                  }
                  pbVar14 = pbVar11 + 1;
                  if (((int)(char)bVar30 & 0x80000000U) != 0) {
                    pbVar14 = pbVar22;
                  }
                  pbVar16 = pbVar14 + ((long)pbVar16 - (long)pbVar11);
                  uVar23 = uVar23 - 1;
                  pbVar11 = pbVar14;
                } while (uVar23 != 0);
              }
              uVar9 = uVar9 - uVar23;
            }
            if (uVar9 < *(ushort *)(pbVar17 + 0x14)) {
              uVar6 = (uint)*(ushort *)(pbVar17 + 0x14) - (int)uVar9;
              uVar21 = uVar19 >> 0x1d & 3;
              uVar7 = uVar6 >> 1 & 0x7fff;
              if (uVar21 != 2) {
                uVar7 = 0;
              }
              uVar3 = 0;
              if (uVar21 != 0) {
                uVar3 = uVar6;
              }
              if (uVar21 < 2) {
                uVar7 = uVar3;
              }
              uVar21 = 0;
              uVar8 = *(undefined8 *)pbVar17;
              lVar5 = *(long *)(pbVar17 + 8);
              do {
                if ((uVar7 & 0xffff) <= (uVar21 & 0xffff)) {
                  uVar9 = (**(code **)(lVar5 + 0x18))(uVar8,pbVar10,pbVar16);
                  if ((uVar9 & 1) != 0) {
                    return 1;
                  }
                  uVar21 = 0;
                  do {
                    if ((uVar6 - uVar7 & 0xffff) <= (uVar21 & 0xffff)) {
                      return 0;
                    }
                    uVar21 = uVar21 + 1;
                    uVar9 = (**(code **)(lVar5 + 0x20))(uVar8,uVar19 & 0x1fffff);
                  } while ((uVar9 & 1) == 0);
                  return 1;
                }
                uVar21 = uVar21 + 1;
                uVar9 = (**(code **)(lVar5 + 0x20))(uVar8,uVar19 & 0x1fffff);
              } while ((uVar9 & 1) == 0);
              return 1;
            }
          }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar8 = (**(code **)(*(long *)(pbVar17 + 8) + 0x18))
                            (*(undefined8 *)pbVar17,pbVar10,pbVar16);
          return uVar8;
        }
      }
    }
    uVar9 = (**(code **)(lVar5 + 0x18))(uVar8,pbVar16 + (long)pbVar17,(long)pbVar13 - (long)pbVar17)
    ;
    if ((uVar9 & 1) == 0) {
      uVar8 = (*pcVar20)(uVar8,0x22);
      return uVar8;
    }
  }
  return 1;
}

