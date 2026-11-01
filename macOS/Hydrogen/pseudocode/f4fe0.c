
void FUN_000f4fe0(int param_1)

{
  byte *pbVar1;
  short sVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  byte *pbVar6;
  ulong uVar7;
  byte bVar8;
  uint *puVar9;
  long lVar10;
  float *pfVar11;
  float *pfVar12;
  byte *pbVar13;
  float *unaff_x21;
  int *unaff_x23;
  byte *unaff_x24;
  float *unaff_x25;
  byte *pbVar14;
  byte *unaff_x26;
  byte *pbVar15;
  byte *pbVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  float unaff_s9;
  float fVar27;
  float fVar28;
  float unaff_s12;
  float fVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  int iStack0000000000000004;
  float fStack000000000000000c;
  int iStack0000000000000010;
  float fStack0000000000000014;
  int *in_stack_00000018;
  short *psStack0000000000000020;
  float fStack000000000000002c;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  
  fVar28 = (float)param_1;
  if (fVar28 <= unaff_x21[3]) {
    fStack000000000000000c = *unaff_x25;
    fStack000000000000002c = unaff_s9 / (float)unaff_x23[5];
    fVar27 = (float)unaff_x23[5] * fStack000000000000002c;
    fVar17 = fVar27 + fVar28;
    fVar26 = unaff_x21[1];
    uStack0000000000000030._0_4_ = unaff_s12;
    if (fVar17 < fVar26 && unaff_x24 < unaff_x26) {
      if (unaff_s12 <= 0.0) {
        do {
          fVar28 = fVar17;
          lVar10 = _memchr(unaff_x24,10,(long)unaff_x26 - (long)unaff_x24);
          unaff_x24 = unaff_x26;
          if (lVar10 != 0) {
            unaff_x24 = (byte *)(lVar10 + 1);
          }
          fVar17 = fVar27 + fVar28;
        } while (fVar27 + fVar28 < fVar26 && unaff_x24 < unaff_x26);
      }
      else {
        fVar26 = unaff_s12 / fStack000000000000002c;
        do {
          fVar28 = fVar17;
          pbVar6 = (byte *)_memchr(unaff_x24,10,(long)unaff_x26 - (long)unaff_x24);
          pbVar13 = (byte *)0x0;
          pbVar14 = unaff_x26;
          if (pbVar6 != (byte *)0x0) {
            pbVar14 = pbVar6;
          }
          bVar3 = true;
          fVar29 = 0.0;
          fVar18 = 0.0;
          fVar17 = 0.0;
          pbVar6 = unaff_x24;
          pbVar15 = unaff_x24;
          do {
            if (pbVar14 <= pbVar6) goto LAB_000f5258;
            while( true ) {
              pbVar16 = pbVar6;
              while( true ) {
                uStack0000000000000038._0_4_ = (uint)(char)*pbVar16;
                if ((int)(uint)uStack0000000000000038 < 0) {
                  iVar4 = func_0x000b6c50(&uStack0000000000000038,pbVar16,pbVar14);
                  pbVar6 = pbVar16 + iVar4;
                  if (0x1f < (uint)uStack0000000000000038) goto LAB_000f51a0;
                }
                else {
                  pbVar6 = pbVar16 + 1;
                  if (0x1f < *pbVar16) goto LAB_000f51a0;
                }
                if ((uint)uStack0000000000000038 != 0xd) break;
                pbVar16 = pbVar6;
                if (pbVar14 <= pbVar6) goto LAB_000f5258;
              }
              if ((uint)uStack0000000000000038 != 10) break;
              fVar17 = 0.0;
              bVar3 = true;
              fVar18 = 0.0;
              fVar29 = 0.0;
              if (pbVar14 <= pbVar6) goto LAB_000f5258;
            }
LAB_000f51a0:
            pfVar11 = (float *)(unaff_x23 + 4);
            if ((int)(uint)uStack0000000000000038 < *unaff_x23) {
              pfVar11 = (float *)(*(long *)(unaff_x23 + 2) + (ulong)(uint)uStack0000000000000038 * 4
                                 );
            }
            if ((((uint)uStack0000000000000038 == 9) || ((uint)uStack0000000000000038 == 0x3000)) ||
               ((uint)uStack0000000000000038 == 0x20)) {
              fVar30 = fVar17;
              if (!bVar3) {
                fVar30 = -0.0;
              }
              fVar29 = fVar29 + fVar30;
              pbVar1 = pbVar16;
              fVar30 = 0.0;
              if (!bVar3) {
                pbVar1 = pbVar15;
                fVar30 = fVar17;
              }
              fVar17 = fVar30 + *pfVar11;
              fVar30 = fVar29 + fVar18;
              pbVar15 = pbVar1;
              bVar3 = false;
            }
            else {
              fVar18 = fVar18 + *pfVar11;
              pbVar1 = pbVar6;
              if (!bVar3) {
                fVar29 = fVar29 + fVar17 + fVar18;
                fVar18 = 0.0;
                fVar17 = 0.0;
                pbVar1 = pbVar15;
                pbVar13 = pbVar15;
              }
              pbVar15 = pbVar1;
              if (((uint)uStack0000000000000038 < 0x40) &&
                 ((1L << ((ulong)(uint)uStack0000000000000038 & 0x3f) & 0x8800500600000000U) != 0))
              {
                fVar30 = fVar29 + fVar18;
                bVar3 = false;
              }
              else {
                bVar3 = true;
                fVar30 = fVar29 + fVar18;
              }
            }
          } while (fVar30 <= fVar26);
          if (pbVar13 != (byte *)0x0) {
            pbVar15 = pbVar13;
          }
          pbVar6 = pbVar15;
          if (fVar26 <= fVar18) {
            pbVar6 = pbVar16;
          }
LAB_000f5258:
          pbVar13 = pbVar6;
          if (unaff_x24 < pbVar14 && pbVar6 == unaff_x24) {
            pbVar13 = pbVar6 + 1;
          }
          if (pbVar13 < unaff_x26) {
            pbVar6 = pbVar6 + ((ulong)(unaff_x24 < pbVar14 && pbVar6 == unaff_x24) - (long)unaff_x26
                              );
            do {
              if (*pbVar13 != 0x20 && *pbVar13 != 9) goto LAB_000f508c;
              pbVar13 = pbVar13 + 1;
              pbVar6 = pbVar6 + 1;
            } while (pbVar6 != (byte *)0x0);
            pbVar13 = unaff_x26;
          }
LAB_000f508c:
          unaff_x24 = pbVar13;
          if (*pbVar13 == 10) {
            unaff_x24 = pbVar13 + 1;
          }
          fVar17 = fVar27 + fVar28;
        } while (fVar27 + fVar28 < unaff_x21[1] && unaff_x24 < unaff_x26);
      }
    }
    fVar17 = (float)uStack0000000000000030;
    if ((float)uStack0000000000000030 <= 0.0 && 10000 < (long)unaff_x26 - (long)unaff_x24) {
      fVar26 = unaff_x21[3];
      pbVar14 = unaff_x24;
      if (fVar28 < fVar26 && unaff_x24 < unaff_x26) {
        fVar29 = fVar28;
        do {
          lVar10 = _memchr(pbVar14,10,(long)unaff_x26 - (long)pbVar14);
          pbVar14 = unaff_x26;
          if (lVar10 != 0) {
            pbVar14 = (byte *)(lVar10 + 1);
          }
          fVar29 = fVar27 + fVar29;
        } while (fVar29 < fVar26 && pbVar14 < unaff_x26);
      }
    }
    else {
      pbVar14 = unaff_x26;
    }
    if (unaff_x24 != pbVar14) {
      fVar29 = (float)(int)fStack000000000000000c;
      iVar5 = (int)pbVar14 - (int)unaff_x24;
      iVar4 = iVar5 * 6;
      iStack0000000000000004 = in_stack_00000018[4];
      func_0x000f0c38(in_stack_00000018,iVar4,iVar5 * 4);
      pbVar13 = (byte *)0x0;
      pfVar11 = *(float **)(in_stack_00000018 + 0x12);
      psStack0000000000000020 = *(short **)(in_stack_00000018 + 0x14);
      fStack000000000000000c = (float)in_stack_00000018[0xd];
      fVar26 = fVar29;
code_r0x000f5344:
      do {
        if (pbVar14 <= unaff_x24) break;
        if (0.0 < fVar17) {
          do {
            if (pbVar13 == (byte *)0x0) {
              pbVar15 = (byte *)0x0;
              fVar20 = (fVar17 - (fVar26 - fVar29)) / fStack000000000000002c;
              bVar3 = true;
              fVar18 = 0.0;
              fVar30 = 0.0;
              fVar17 = 0.0;
              pbVar13 = unaff_x24;
              pbVar6 = unaff_x24;
              do {
                if (pbVar14 <= pbVar13) goto code_r0x000f5530;
                while( true ) {
                  pbVar16 = pbVar13;
                  while( true ) {
                    uStack0000000000000038._4_4_ = (uint)(char)*pbVar16;
                    if ((int)uStack0000000000000038._4_4_ < 0) {
                      iVar5 = func_0x000b6c50((long)&uStack0000000000000038 + 4,pbVar16,pbVar14);
                      pbVar13 = pbVar16 + iVar5;
                      if (0x1f < uStack0000000000000038._4_4_) goto code_r0x000f5478;
                    }
                    else {
                      pbVar13 = pbVar16 + 1;
                      if (0x1f < *pbVar16) goto code_r0x000f5478;
                    }
                    if (uStack0000000000000038._4_4_ != 0xd) break;
                    pbVar16 = pbVar13;
                    if (pbVar14 <= pbVar13) goto code_r0x000f5530;
                  }
                  if (uStack0000000000000038._4_4_ != 10) break;
                  fVar17 = 0.0;
                  bVar3 = true;
                  fVar30 = 0.0;
                  fVar18 = 0.0;
                  if (pbVar14 <= pbVar13) goto code_r0x000f5530;
                }
code_r0x000f5478:
                pfVar12 = (float *)(unaff_x23 + 4);
                if ((int)uStack0000000000000038._4_4_ < *unaff_x23) {
                  pfVar12 = (float *)(*(long *)(unaff_x23 + 2) +
                                     (ulong)uStack0000000000000038._4_4_ * 4);
                }
                if (((uStack0000000000000038._4_4_ == 9) || (uStack0000000000000038._4_4_ == 0x3000)
                    ) || (uStack0000000000000038._4_4_ == 0x20)) {
                  fVar31 = fVar17;
                  if (!bVar3) {
                    fVar31 = -0.0;
                  }
                  fVar18 = fVar18 + fVar31;
                  pbVar1 = pbVar16;
                  fVar31 = 0.0;
                  if (!bVar3) {
                    pbVar1 = pbVar6;
                    fVar31 = fVar17;
                  }
                  fVar17 = fVar31 + *pfVar12;
                  fVar31 = fVar18 + fVar30;
                  pbVar6 = pbVar1;
                  bVar3 = false;
                }
                else {
                  fVar30 = fVar30 + *pfVar12;
                  pbVar1 = pbVar13;
                  if (!bVar3) {
                    fVar18 = fVar18 + fVar17 + fVar30;
                    fVar30 = 0.0;
                    fVar17 = 0.0;
                    pbVar1 = pbVar6;
                    pbVar15 = pbVar6;
                  }
                  pbVar6 = pbVar1;
                  if ((uStack0000000000000038._4_4_ < 0x40) &&
                     ((1L << ((ulong)uStack0000000000000038._4_4_ & 0x3f) & 0x8800500600000000U) !=
                      0)) {
                    fVar31 = fVar18 + fVar30;
                    bVar3 = false;
                  }
                  else {
                    bVar3 = true;
                    fVar31 = fVar18 + fVar30;
                  }
                }
              } while (fVar31 <= fVar20);
              if (pbVar15 != (byte *)0x0) {
                pbVar6 = pbVar15;
              }
              pbVar13 = pbVar6;
              if (fVar20 <= fVar30) {
                pbVar13 = pbVar16;
              }
code_r0x000f5530:
              if (pbVar13 == unaff_x24) {
                pbVar13 = pbVar13 + 1;
              }
              fVar17 = (float)uStack0000000000000030;
            }
            if (unaff_x24 < pbVar13) break;
            fVar28 = fVar27 + fVar28;
            lVar10 = (long)pbVar14 - (long)unaff_x24;
            do {
              bVar8 = *unaff_x24;
              if (bVar8 != 0x20 && bVar8 != 9) goto code_r0x000f5370;
              unaff_x24 = unaff_x24 + 1;
              lVar10 = lVar10 + -1;
            } while (lVar10 != 0);
            bVar8 = *pbVar14;
            unaff_x24 = pbVar14;
code_r0x000f5370:
            pbVar13 = (byte *)0x0;
            if (bVar8 == 10) {
              unaff_x24 = unaff_x24 + 1;
            }
            fVar26 = fVar29;
            if (pbVar14 <= unaff_x24) goto code_r0x000f57a0;
          } while( true );
        }
        bVar8 = *unaff_x24;
        uStack0000000000000030._4_4_ = (uint)(char)bVar8;
        if ((int)uStack0000000000000030._4_4_ < 0) {
          iVar5 = func_0x000b6c50((long)&uStack0000000000000030 + 4,unaff_x24,pbVar14);
          unaff_x24 = unaff_x24 + iVar5;
          if (uStack0000000000000030._4_4_ < 0x20) goto code_r0x000f5594;
code_r0x000f55bc:
          if (((uStack0000000000000030._4_4_ & 0xffff) < (uint)unaff_x23[6]) &&
             (uVar7 = (ulong)*(ushort *)
                              (*(long *)(unaff_x23 + 8) +
                              (ulong)(uStack0000000000000030._4_4_ & 0xffff) * 2), uVar7 != 0xffff))
          {
            puVar9 = (uint *)(*(long *)(unaff_x23 + 0xc) + uVar7 * 0x28);
          }
          else {
            puVar9 = *(uint **)(unaff_x23 + 0xe);
          }
          if (puVar9 != (uint *)0x0) {
            fVar18 = (float)puVar9[1];
            if ((*puVar9 >> 1 & 1) != 0) {
              fVar30 = fVar26 + fStack000000000000002c * (float)puVar9[2];
              fVar20 = unaff_x21[2];
              if (fVar30 <= fVar20) {
                fVar31 = fVar26 + fStack000000000000002c * (float)puVar9[4];
                fVar19 = *unaff_x21;
                if (fVar19 <= fVar31) {
                  fVar32 = fVar28 + fStack000000000000002c * (float)puVar9[3];
                  fVar21 = (float)puVar9[6];
                  fVar23 = fVar28 + fStack000000000000002c * (float)puVar9[5];
                  fVar25 = (float)puVar9[7];
                  fVar24 = (float)puVar9[8];
                  fVar22 = (float)puVar9[9];
                  if (iStack0000000000000010 != 0) {
                    if (fVar30 < fVar19) {
                      fVar21 = fVar21 + (fVar24 - fVar21) *
                                        (1.0 - (fVar31 - fVar19) / (fVar31 - fVar30));
                      fVar30 = fVar19;
                    }
                    fVar19 = unaff_x21[1];
                    if (fVar32 < fVar19) {
                      fVar25 = fVar25 + (fVar22 - fVar25) *
                                        (1.0 - (fVar23 - fVar19) / (fVar23 - fVar32));
                      fVar32 = fVar19;
                    }
                    if (fVar20 < fVar31) {
                      fVar24 = fVar21 + (fVar24 - fVar21) * ((fVar20 - fVar30) / (fVar31 - fVar30));
                      fVar31 = fVar20;
                    }
                    fVar20 = unaff_x21[3];
                    if (fVar20 < fVar23) {
                      fVar22 = fVar25 + (fVar22 - fVar25) * ((fVar20 - fVar32) / (fVar23 - fVar32));
                      fVar23 = fVar20;
                    }
                    if (fVar23 <= fVar32) goto code_r0x000f5798;
                  }
                  fVar20 = fStack0000000000000014;
                  if ((*puVar9 & 1) != 0) {
                    fVar20 = (float)((uint)fStack0000000000000014 | 0xffffff);
                  }
                  *pfVar11 = fVar30;
                  pfVar11[1] = fVar32;
                  pfVar11[4] = fVar20;
                  pfVar11[2] = fVar21;
                  pfVar11[3] = fVar25;
                  pfVar11[5] = fVar31;
                  pfVar11[6] = fVar32;
                  pfVar11[9] = fVar20;
                  pfVar11[7] = fVar24;
                  pfVar11[8] = fVar25;
                  pfVar11[10] = fVar31;
                  pfVar11[0xb] = fVar23;
                  pfVar11[0xe] = fVar20;
                  pfVar11[0xc] = fVar24;
                  pfVar11[0xd] = fVar22;
                  pfVar11[0xf] = fVar30;
                  pfVar11[0x10] = fVar23;
                  pfVar11[0x13] = fVar20;
                  pfVar11[0x11] = fVar21;
                  pfVar11[0x12] = fVar22;
                  sVar2 = SUB42(fStack000000000000000c,0);
                  *psStack0000000000000020 = sVar2;
                  psStack0000000000000020[1] = sVar2 + 1;
                  psStack0000000000000020[2] = sVar2 + 2;
                  psStack0000000000000020[4] = sVar2 + 2;
                  psStack0000000000000020[3] = sVar2;
                  pfVar11 = pfVar11 + 0x14;
                  fStack000000000000000c = (float)((int)fStack000000000000000c + 4);
                  psStack0000000000000020[5] = sVar2 + 3;
                  psStack0000000000000020 = psStack0000000000000020 + 6;
                }
              }
            }
code_r0x000f5798:
            fVar26 = fVar26 + fStack000000000000002c * fVar18;
          }
          goto code_r0x000f5344;
        }
        unaff_x24 = unaff_x24 + 1;
        if (0x1f < bVar8) goto code_r0x000f55bc;
code_r0x000f5594:
        if (uStack0000000000000030._4_4_ != 10) {
          if (uStack0000000000000030._4_4_ != 0xd) goto code_r0x000f55bc;
          goto code_r0x000f5344;
        }
        fVar28 = fVar27 + fVar28;
        fVar26 = fVar29;
      } while (fVar28 <= unaff_x21[3]);
code_r0x000f57a0:
      in_stack_00000018[8] =
           (int)((ulong)((long)pfVar11 - *(long *)(in_stack_00000018 + 10)) >> 2) * -0x33333333;
      iVar5 = (int)((ulong)((long)psStack0000000000000020 - *(long *)(in_stack_00000018 + 6)) >> 1);
      in_stack_00000018[4] = iVar5;
      lVar10 = *(long *)(in_stack_00000018 + 2) + (long)*in_stack_00000018 * 0x38;
      *(int *)(lVar10 + -0x18) =
           (iVar5 - (iStack0000000000000004 + iVar4)) + *(int *)(lVar10 + -0x18);
      *(float **)(in_stack_00000018 + 0x12) = pfVar11;
      *(short **)(in_stack_00000018 + 0x14) = psStack0000000000000020;
      in_stack_00000018[0xd] = (int)fStack000000000000000c;
    }
  }
  return;
}

