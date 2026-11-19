/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d7534
 */

int LZ4_decompress_safe_partial(ulong *param_1,ulong *param_2,int param_3,uint param_4,uint param_5)

{
  byte *pbVar1;
  ulong *puVar2;
  size_t __n;
  uint uVar3;
  ushort uVar4;
  ulong *puVar5;
  byte bVar6;
  int iVar7;
  ulong *puVar8;
  ulong *puVar9;
  ushort *puVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  long lVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  ulong *puVar19;
  ulong uVar20;
  ulong *puVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  
  iVar7 = -1;
  if ((int)param_5 <= (int)param_4) {
    param_4 = param_5;
  }
  if ((param_1 != (ulong *)0x0) && (-1 < (int)param_4)) {
    if (param_4 == 0) {
      iVar7 = 0;
    }
    else if (param_3 != 0) {
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      puVar2 = (ulong *)((long)param_2 + (ulong)param_4);
      puVar19 = param_1;
      puVar14 = param_2;
      if (param_4 < 0x40) goto LAB_008d7ce4;
      puVar19 = (ulong *)((long)param_1 + 1);
      uVar22 = (ulong)(byte)*param_1;
      uVar20 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar12 = puVar2 + -8;
        puVar9 = param_1;
        do {
          if (uVar20 == 0xf) {
            if (pbVar1 + -0xf <= puVar19) goto LAB_008d795c;
            uVar20 = (ulong)(byte)*puVar19;
            puVar19 = (ulong *)((long)puVar9 + 2);
            puVar9 = puVar19;
            if (uVar20 == 0xff) {
              do {
                puVar19 = puVar9;
                if (pbVar1 + -0xf <= puVar9) goto LAB_008d795c;
                puVar19 = (ulong *)((long)puVar9 + 1);
                uVar11 = *puVar9;
                uVar20 = uVar20 + (byte)uVar11;
                puVar9 = puVar19;
              } while ((ulong)(byte)uVar11 == 0xff);
              if (uVar20 == 0xffffffffffffffff) goto LAB_008d795c;
            }
            uVar20 = uVar20 + 0xf;
            if (CARRY8((ulong)puVar19,uVar20)) goto LAB_008d795c;
            puVar13 = (ulong *)((long)puVar14 + uVar20);
            if (puVar12 < puVar13) goto LAB_008d7a20;
            puVar10 = (ushort *)((long)puVar19 + uVar20);
            if (pbVar1 + -0x40 < puVar10) goto LAB_008d7a20;
            do {
              uVar16 = puVar19[4];
              uVar11 = puVar19[7];
              uVar20 = puVar19[6];
              uVar24 = puVar19[1];
              uVar23 = *puVar19;
              uVar26 = puVar19[3];
              uVar25 = puVar19[2];
              puVar14[5] = puVar19[5];
              puVar14[4] = uVar16;
              puVar14[7] = uVar11;
              puVar14[6] = uVar20;
              puVar9 = puVar14 + 8;
              puVar14[1] = uVar24;
              *puVar14 = uVar23;
              puVar14[3] = uVar26;
              puVar14[2] = uVar25;
              puVar19 = puVar19 + 8;
              puVar14 = puVar9;
            } while (puVar9 < puVar13);
          }
          else {
            uVar11 = *puVar19;
            puVar10 = (ushort *)((long)puVar19 + uVar20);
            puVar13 = (ulong *)((long)puVar14 + uVar20);
            puVar14[1] = puVar19[1];
            *puVar14 = uVar11;
          }
          puVar19 = (ulong *)(puVar10 + 1);
          uVar4 = *puVar10;
          uVar20 = (ulong)uVar4;
          puVar8 = (ulong *)((long)puVar13 - uVar20);
          if ((uVar22 & 0xf) == 0xf) {
            if (pbVar1 + -6 <= puVar19) goto LAB_008d795c;
            uVar22 = (ulong)(byte)puVar10[1];
            puVar19 = (ulong *)((long)puVar10 + 3);
            puVar14 = puVar19;
            if (uVar22 == 0xff) {
              do {
                puVar19 = puVar14;
                if (pbVar1 + -6 <= puVar14) goto LAB_008d795c;
                puVar19 = (ulong *)((long)puVar14 + 1);
                uVar11 = *puVar14;
                uVar22 = uVar22 + (byte)uVar11;
                puVar14 = puVar19;
              } while ((ulong)(byte)uVar11 == 0xff);
              if (uVar22 == 0xffffffffffffffff) goto LAB_008d795c;
            }
            uVar22 = uVar22 + 0x13;
            if (CARRY8((ulong)puVar13,uVar22)) goto LAB_008d795c;
            if (puVar12 <= (ulong *)((long)puVar13 + uVar22)) goto LAB_008d7b6c;
LAB_008d76fc:
            if (puVar8 < param_2) goto LAB_008d795c;
            puVar14 = (ulong *)((long)puVar13 + uVar22);
            puVar9 = puVar19;
            if (uVar4 < 0x10) {
              if (uVar4 == 4) {
                uVar16 = (ulong)(uint)*puVar8;
                uVar20 = (ulong)((uint)*puVar8 >> 0x10);
                uVar11 = uVar16 & 0xffff;
              }
              else {
                if (uVar4 == 2) {
                  uVar4 = (ushort)*puVar8;
                  uVar3 = CONCAT22(uVar4,uVar4);
                }
                else {
                  if (uVar4 != 1) {
                    if (uVar4 < 8) {
                      *(uint *)puVar13 = 0;
                      *(short *)puVar13 = (short)*puVar8;
                      *(undefined2 *)((long)puVar13 + 2) = *(undefined2 *)((long)puVar8 + 2);
                      uVar3 = *(uint *)(&DAT_00364e30 + uVar20 * 4);
                      *(uint *)((long)puVar13 + 4) = *(uint *)((long)puVar8 + (ulong)uVar3);
                      puVar19 = (ulong *)((long)((long)puVar8 + (ulong)uVar3) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar20 * 4));
                    }
                    else {
                      puVar19 = puVar8 + 1;
                      *puVar13 = *puVar8;
                    }
                    puVar8 = (ulong *)(uVar22 + (long)puVar13);
                    if ((ulong *)(uVar22 + (long)puVar13) <= puVar13 + 2) {
                      puVar8 = puVar13 + 2;
                    }
                    uVar20 = (long)puVar8 + (-9 - (long)puVar13);
                    puVar8 = puVar13 + 1;
                    puVar21 = puVar19;
                    if (uVar20 < 0x18) {
                    }
                    else if (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar19))) {
                      puVar13 = puVar13 + 3;
                      uVar20 = (uVar20 >> 3) + 1;
                      uVar11 = uVar20 & 0x3ffffffffffffffc;
                      puVar21 = puVar19 + uVar11;
                      puVar8 = puVar8 + uVar11;
                      puVar19 = puVar19 + 2;
                      uVar22 = uVar11;
                      do {
                        puVar5 = puVar19 + -1;
                        uVar16 = puVar19[-2];
                        uVar24 = puVar19[1];
                        uVar23 = *puVar19;
                        uVar22 = uVar22 - 4;
                        puVar19 = puVar19 + 4;
                        puVar13[-1] = *puVar5;
                        puVar13[-2] = uVar16;
                        puVar13[1] = uVar24;
                        *puVar13 = uVar23;
                        puVar13 = puVar13 + 4;
                      } while (uVar22 != 0);
                      if (uVar20 == uVar11) goto LAB_008d760c;
                    }
                    do {
                      puVar19 = puVar8 + 1;
                      *puVar8 = *puVar21;
                      puVar8 = puVar19;
                      puVar21 = puVar21 + 1;
                    } while (puVar19 < puVar14);
                    goto LAB_008d760c;
                  }
                  bVar6 = (byte)*puVar8;
                  uVar4 = CONCAT11(bVar6,bVar6);
                  uVar3 = (uint)bVar6 * 0x1010101;
                }
                uVar20 = (ulong)uVar4;
                uVar16 = (ulong)uVar3;
                uVar11 = uVar20;
              }
              uVar20 = uVar11 | uVar20 << 0x10 | uVar16 << 0x20;
              *puVar13 = uVar20;
              if (8 < uVar22) {
                puVar19 = (ulong *)(uVar22 + (long)puVar13);
                if ((ulong *)(uVar22 + (long)puVar13) <= puVar13 + 2) {
                  puVar19 = puVar13 + 2;
                }
                uVar22 = (long)puVar19 + (-9 - (long)puVar13);
                puVar19 = puVar13 + 1;
                if (0x17 < uVar22) {
                  puVar19 = puVar13 + 3;
                  uVar22 = (uVar22 >> 3) + 1;
                  uVar16 = uVar22 & 0x3ffffffffffffffc;
                  uVar11 = uVar16;
                  do {
                    uVar11 = uVar11 - 4;
                    puVar19[-1] = uVar20;
                    puVar19[-2] = uVar20;
                    puVar19[1] = uVar20;
                    *puVar19 = uVar20;
                    puVar19 = puVar19 + 4;
                  } while (uVar11 != 0);
                  puVar19 = puVar13 + 1 + uVar16;
                  if (uVar22 == uVar16) goto LAB_008d760c;
                }
                do {
                  puVar13 = puVar19 + 1;
                  *puVar19 = uVar20;
                  puVar19 = puVar13;
                } while (puVar13 < puVar14);
              }
            }
            else if (uVar4 < 0x40) {
              puVar19 = (ulong *)((long)puVar13 + -uVar20 + 0x10);
              do {
                uVar20 = puVar19[-2];
                puVar13[1] = puVar19[-1];
                *puVar13 = uVar20;
                uVar20 = *puVar19;
                puVar13[3] = puVar19[1];
                puVar13[2] = uVar20;
                puVar13 = puVar13 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar13 < puVar14);
            }
            else {
              do {
                puVar19 = (ulong *)((long)puVar13 + -uVar20);
                uVar16 = puVar19[4];
                uVar11 = puVar19[7];
                uVar22 = puVar19[6];
                uVar24 = puVar19[1];
                uVar23 = *puVar19;
                uVar26 = puVar19[3];
                uVar25 = puVar19[2];
                puVar13[5] = puVar19[5];
                puVar13[4] = uVar16;
                puVar13[7] = uVar11;
                puVar13[6] = uVar22;
                puVar19 = puVar13 + 8;
                puVar13[1] = uVar24;
                *puVar13 = uVar23;
                puVar13[3] = uVar26;
                puVar13[2] = uVar25;
                puVar13 = puVar19;
              } while (puVar19 < puVar14);
            }
          }
          else {
            uVar22 = (uVar22 & 0xf) + 4;
            puVar14 = (ulong *)((long)puVar13 + uVar22);
            if (puVar12 <= puVar14) goto LAB_008d7b6c;
            if ((puVar8 < param_2) || (uVar4 < 8)) goto LAB_008d76fc;
            *puVar13 = *puVar8;
            puVar13[1] = puVar8[1];
            *(short *)(puVar13 + 2) = (short)puVar8[2];
            puVar9 = puVar19;
          }
LAB_008d760c:
          puVar19 = (ulong *)((long)puVar9 + 1);
          uVar22 = (ulong)(byte)*puVar9;
          uVar20 = (ulong)(byte)((byte)*puVar9 >> 4);
        } while (puVar19 <= pbVar1 + -0x11);
      }
      if (uVar20 == 0xf) goto LAB_008d79e8;
LAB_008d7a1c:
      puVar13 = (ulong *)((long)puVar14 + uVar20);
LAB_008d7a20:
      if ((puVar13 <= (ulong *)((long)puVar2 + -0xc)) &&
         (puVar10 = (ushort *)((long)puVar19 + uVar20), puVar10 <= pbVar1 + -8)) {
        puVar9 = puVar13;
        if (puVar13 <= puVar14 + 1) {
          puVar9 = puVar14 + 1;
        }
        if ((0x17 < (long)puVar9 + ~(ulong)puVar14) &&
           (0x1f < (ulong)((long)puVar14 - (long)puVar19))) {
          puVar12 = puVar14 + 2;
          puVar8 = puVar19 + 2;
          uVar20 = ((long)puVar9 + ~(ulong)puVar14 >> 3) + 1;
          uVar16 = uVar20 & 0x3ffffffffffffffc;
          uVar11 = uVar16;
          do {
            puVar9 = puVar8 + -1;
            uVar23 = puVar8[-2];
            uVar25 = puVar8[1];
            uVar24 = *puVar8;
            uVar11 = uVar11 - 4;
            puVar8 = puVar8 + 4;
            puVar12[-1] = *puVar9;
            puVar12[-2] = uVar23;
            puVar12[1] = uVar25;
            *puVar12 = uVar24;
            puVar12 = puVar12 + 4;
          } while (uVar11 != 0);
          puVar19 = puVar19 + uVar16;
          puVar14 = puVar14 + uVar16;
          if (uVar20 == uVar16) goto LAB_008d7b18;
        }
        do {
          puVar9 = puVar14 + 1;
          *puVar14 = *puVar19;
          puVar19 = puVar19 + 1;
          puVar14 = puVar9;
        } while (puVar9 < puVar13);
LAB_008d7b18:
        puVar19 = (ulong *)(puVar10 + 1);
        uVar20 = (ulong)*puVar10;
        uVar22 = uVar22 & 0xf;
        puVar8 = (ulong *)((long)puVar13 - uVar20);
        do {
          if (uVar22 == 0xf) {
            if (pbVar1 + -6 <= puVar19) goto LAB_008d795c;
            uVar11 = (ulong)(byte)*puVar19;
            uVar22 = uVar11;
            while (puVar19 = (ulong *)((long)puVar19 + 1), uVar22 == 0xff) {
              if (pbVar1 + -6 <= puVar19) goto LAB_008d795c;
              uVar22 = (ulong)*(byte *)puVar19;
              uVar11 = uVar11 + uVar22;
            }
            uVar22 = uVar11 + 0xf;
            if ((uVar11 == 0xffffffffffffffff) || (CARRY8((ulong)puVar13,uVar22)))
            goto LAB_008d795c;
          }
          uVar22 = uVar22 + 4;
LAB_008d7b6c:
          if (puVar8 < param_2) goto LAB_008d795c;
          puVar14 = (ulong *)((long)puVar13 + uVar22);
          if ((ulong *)((long)puVar2 + -0xc) < puVar14) {
            if ((ulong)((long)puVar2 - (long)puVar13) <= uVar22) {
              uVar22 = (long)puVar2 - (long)puVar13;
            }
            puVar14 = (ulong *)((long)puVar13 + uVar22);
            if (puVar13 < (ulong *)((long)puVar8 + uVar22)) {
              if (uVar22 != 0) {
                uVar22 = uVar22 + (long)puVar13;
                if (uVar22 <= (long)puVar13 + 1U) {
                  uVar22 = (long)puVar13 + 1;
                }
                uVar22 = uVar22 - (long)puVar13;
                if ((uVar22 < 8) || ((ulong)((long)puVar13 - (long)puVar8) < 0x20)) {
                  puVar9 = puVar13;
                  puVar12 = puVar8;
                }
                else {
                  uVar20 = 0;
                  if (0x1f < uVar22) {
                    uVar20 = uVar22 & 0xffffffffffffffe0;
                    puVar9 = puVar8 + 2;
                    puVar12 = puVar13 + 2;
                    uVar11 = uVar20;
                    do {
                      puVar21 = puVar9 + -1;
                      uVar16 = puVar9[-2];
                      uVar24 = puVar9[1];
                      uVar23 = *puVar9;
                      uVar11 = uVar11 - 0x20;
                      puVar9 = puVar9 + 4;
                      puVar12[-1] = *puVar21;
                      puVar12[-2] = uVar16;
                      puVar12[1] = uVar24;
                      *puVar12 = uVar23;
                      puVar12 = puVar12 + 4;
                    } while (uVar11 != 0);
                    if (uVar22 == uVar20) goto LAB_008d7cdc;
                    puVar9 = (ulong *)((long)puVar13 + uVar20);
                    puVar12 = (ulong *)((long)puVar8 + uVar20);
                    if ((uVar22 & 0x18) == 0) goto LAB_008d7ccc;
                  }
                  uVar11 = uVar22 & 0xfffffffffffffff8;
                  lVar15 = uVar20 - uVar11;
                  puVar17 = (undefined8 *)((long)puVar8 + uVar20);
                  puVar18 = (undefined8 *)((long)puVar13 + uVar20);
                  do {
                    lVar15 = lVar15 + 8;
                    *puVar18 = *puVar17;
                    puVar17 = puVar17 + 1;
                    puVar18 = puVar18 + 1;
                  } while (lVar15 != 0);
                  puVar9 = (ulong *)((long)puVar13 + uVar11);
                  puVar12 = (ulong *)((long)puVar8 + uVar11);
                  if (uVar22 == uVar11) goto LAB_008d7cdc;
                }
LAB_008d7ccc:
                do {
                  puVar13 = (ulong *)((long)puVar9 + 1);
                  *(char *)puVar9 = (char)*puVar12;
                  puVar9 = puVar13;
                  puVar12 = (ulong *)((long)puVar12 + 1);
                } while (puVar13 < puVar14);
              }
            }
            else {
              memcpy(puVar13,puVar8,uVar22);
            }
LAB_008d7cdc:
            if (puVar14 == puVar2) goto LAB_008d7d50;
          }
          else {
            if (uVar20 < 8) {
              *(uint *)puVar13 = 0;
              *(char *)puVar13 = (char)*puVar8;
              *(undefined1 *)((long)puVar13 + 1) = *(undefined1 *)((long)puVar8 + 1);
              *(undefined1 *)((long)puVar13 + 2) = *(undefined1 *)((long)puVar8 + 2);
              *(undefined1 *)((long)puVar13 + 3) = *(undefined1 *)((long)puVar8 + 3);
              uVar3 = *(uint *)(&DAT_00364e30 + uVar20 * 4);
              *(uint *)((long)puVar13 + 4) = *(uint *)((long)puVar8 + (ulong)uVar3);
              puVar9 = (ulong *)((long)((long)puVar8 + (ulong)uVar3) -
                                (long)*(int *)(&DAT_00364dd0 + uVar20 * 4));
            }
            else {
              puVar9 = puVar8 + 1;
              *puVar13 = *puVar8;
            }
            puVar13[1] = *puVar9;
            if (0x10 < uVar22) {
              puVar12 = (ulong *)(uVar22 + (long)puVar13);
              if ((ulong *)(uVar22 + (long)puVar13) <= puVar13 + 3) {
                puVar12 = puVar13 + 3;
              }
              uVar20 = (long)puVar12 + (-0x11 - (long)puVar13);
              puVar12 = puVar13 + 2;
              if ((0x27 < uVar20) && (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar9)))) {
                puVar8 = puVar9 + 3;
                uVar20 = (uVar20 >> 3) + 1;
                uVar11 = uVar20 & 0x3ffffffffffffffc;
                puVar9 = puVar9 + uVar11;
                puVar12 = puVar12 + uVar11;
                uVar22 = uVar11;
                do {
                  puVar21 = puVar8 + -1;
                  uVar16 = puVar8[-2];
                  uVar24 = puVar8[1];
                  uVar23 = *puVar8;
                  uVar22 = uVar22 - 4;
                  puVar8 = puVar8 + 4;
                  puVar13[3] = *puVar21;
                  puVar13[2] = uVar16;
                  puVar13[5] = uVar24;
                  puVar13[4] = uVar23;
                  puVar13 = puVar13 + 4;
                } while (uVar22 != 0);
                if (uVar20 == uVar11) goto LAB_008d7ce4;
              }
              do {
                puVar9 = puVar9 + 1;
                puVar13 = puVar12 + 1;
                *puVar12 = *puVar9;
                puVar12 = puVar13;
              } while (puVar13 < puVar14);
            }
          }
LAB_008d7ce4:
          bVar6 = (byte)*puVar19;
          puVar19 = (ulong *)((long)puVar19 + 1);
          while( true ) {
            uVar20 = (ulong)(bVar6 >> 4);
            uVar22 = (ulong)bVar6;
            if (uVar20 == 0xf) goto LAB_008d79e8;
            if ((pbVar1 + -0x10 <= puVar19) || (puVar2 + -4 < puVar14)) goto LAB_008d7a1c;
            uVar11 = *puVar19;
            puVar10 = (ushort *)((long)puVar19 + uVar20);
            uVar22 = uVar22 & 0xf;
            puVar13 = (ulong *)((long)puVar14 + uVar20);
            puVar14[1] = puVar19[1];
            *puVar14 = uVar11;
            puVar19 = (ulong *)(puVar10 + 1);
            uVar20 = (ulong)*puVar10;
            puVar8 = (ulong *)((long)puVar13 - uVar20);
            if ((uVar22 == 0xf) || ((*puVar10 < 8 || (puVar8 < param_2)))) break;
            puVar19 = (ulong *)((long)puVar10 + 3);
            puVar14 = (ulong *)((long)puVar13 + uVar22 + 4);
            *puVar13 = *puVar8;
            puVar13[1] = puVar8[1];
            *(short *)(puVar13 + 2) = (short)puVar8[2];
            bVar6 = (byte)puVar10[1];
          }
        } while( true );
      }
      puVar9 = (ulong *)((long)puVar14 + ((long)pbVar1 - (long)puVar19));
      if ((byte *)((long)puVar19 + uVar20) <= pbVar1) {
        puVar9 = puVar13;
      }
      if (puVar2 < puVar9) {
        memmove(puVar14,puVar19,(long)puVar2 - (long)puVar14);
LAB_008d7d50:
        puVar13 = puVar2;
      }
      else {
        __n = (long)pbVar1 - (long)puVar19;
        if ((byte *)((long)puVar19 + uVar20) <= pbVar1) {
          __n = uVar20;
        }
        memmove(puVar14,puVar19,__n);
        puVar13 = (ulong *)((long)puVar14 + __n);
        if ((puVar9 != puVar2) && (puVar10 = (ushort *)((long)puVar19 + __n), puVar10 < pbVar1 + -2)
           ) goto LAB_008d7b18;
      }
      iVar7 = (int)puVar13 - (int)param_2;
    }
  }
  return iVar7;
LAB_008d79e8:
  if (pbVar1 + -0xf <= puVar19) {
LAB_008d795c:
    return ~(uint)puVar19 + (int)param_1;
  }
  uVar20 = (ulong)(byte)*puVar19;
  puVar9 = (ulong *)((long)puVar19 + 1);
  puVar19 = (ulong *)((long)puVar19 + 1);
  if (uVar20 == 0xff) {
    do {
      puVar19 = puVar9;
      if (pbVar1 + -0xf <= puVar9) goto LAB_008d795c;
      puVar19 = (ulong *)((long)puVar9 + 1);
      uVar11 = *puVar9;
      uVar20 = uVar20 + (byte)uVar11;
      puVar9 = puVar19;
    } while ((ulong)(byte)uVar11 == 0xff);
    if (uVar20 == 0xffffffffffffffff) goto LAB_008d795c;
  }
  uVar20 = uVar20 + 0xf;
  if ((CARRY8((ulong)puVar14,uVar20)) || (CARRY8((ulong)puVar19,uVar20))) goto LAB_008d795c;
  goto LAB_008d7a1c;
}

