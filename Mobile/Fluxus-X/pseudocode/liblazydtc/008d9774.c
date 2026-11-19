/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d9774
 */

int LZ4_decompress_safe_partial_forceExtDict
              (ulong *param_1,ulong *param_2,int param_3,uint param_4,uint param_5,long param_6,
              ulong param_7)

{
  ulong *puVar1;
  byte *pbVar2;
  long lVar3;
  uint uVar4;
  ushort uVar5;
  size_t sVar6;
  ulong *puVar7;
  byte bVar8;
  int iVar9;
  ulong uVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ushort *puVar14;
  ulong *puVar15;
  ulong *puVar16;
  long lVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  ulong *puVar21;
  ulong *puVar22;
  ulong *puVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  
  iVar9 = -1;
  if ((int)param_5 <= (int)param_4) {
    param_4 = param_5;
  }
  if ((param_1 != (ulong *)0x0) && (-1 < (int)param_4)) {
    lVar3 = 0;
    if (param_6 != 0) {
      lVar3 = param_6 + param_7;
    }
    if (param_4 == 0) {
      iVar9 = 0;
    }
    else if (param_3 != 0) {
      puVar1 = (ulong *)((long)param_2 + (ulong)param_4);
      pbVar2 = (byte *)((long)param_1 + (long)param_3);
      puVar13 = param_1;
      puVar21 = param_2;
      if (param_4 < 0x40) goto LAB_008da204;
      puVar13 = (ulong *)((long)param_1 + 1);
      uVar24 = (ulong)(byte)*param_1;
      uVar10 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar12 = puVar1 + -8;
        puVar23 = param_1;
        do {
          if (uVar10 == 0xf) {
            if (pbVar2 + -0xf <= puVar13) goto LAB_008d9d40;
            uVar10 = (ulong)(byte)*puVar13;
            puVar13 = (ulong *)((long)puVar23 + 2);
            puVar23 = puVar13;
            if (uVar10 == 0xff) {
              do {
                puVar13 = puVar23;
                if (pbVar2 + -0xf <= puVar23) goto LAB_008d9d40;
                puVar13 = (ulong *)((long)puVar23 + 1);
                uVar11 = *puVar23;
                uVar10 = uVar10 + (byte)uVar11;
                puVar23 = puVar13;
              } while ((ulong)(byte)uVar11 == 0xff);
              if (uVar10 == 0xffffffffffffffff) goto LAB_008d9d40;
            }
            uVar10 = uVar10 + 0xf;
            if (CARRY8((ulong)puVar13,uVar10)) goto LAB_008d9d40;
            puVar15 = (ulong *)((long)puVar21 + uVar10);
            if (puVar12 < puVar15) goto LAB_008d9e04;
            puVar14 = (ushort *)((long)puVar13 + uVar10);
            if (pbVar2 + -0x40 < puVar14) goto LAB_008d9e04;
            do {
              uVar18 = puVar13[4];
              uVar11 = puVar13[7];
              uVar10 = puVar13[6];
              uVar26 = puVar13[1];
              uVar25 = *puVar13;
              uVar28 = puVar13[3];
              uVar27 = puVar13[2];
              puVar21[5] = puVar13[5];
              puVar21[4] = uVar18;
              puVar21[7] = uVar11;
              puVar21[6] = uVar10;
              puVar23 = puVar21 + 8;
              puVar21[1] = uVar26;
              *puVar21 = uVar25;
              puVar21[3] = uVar28;
              puVar21[2] = uVar27;
              puVar13 = puVar13 + 8;
              puVar21 = puVar23;
            } while (puVar23 < puVar15);
          }
          else {
            uVar11 = *puVar13;
            puVar14 = (ushort *)((long)puVar13 + uVar10);
            puVar15 = (ulong *)((long)puVar21 + uVar10);
            puVar21[1] = puVar13[1];
            *puVar21 = uVar11;
          }
          puVar13 = (ulong *)(puVar14 + 1);
          uVar5 = *puVar14;
          uVar10 = (ulong)uVar5;
          puVar22 = (ulong *)((long)puVar15 - uVar10);
          if ((uVar24 & 0xf) == 0xf) {
            if (pbVar2 + -6 <= puVar13) goto LAB_008d9d40;
            uVar24 = (ulong)(byte)puVar14[1];
            puVar13 = (ulong *)((long)puVar14 + 3);
            puVar21 = puVar13;
            if (uVar24 == 0xff) {
              do {
                puVar13 = puVar21;
                if (pbVar2 + -6 <= puVar21) goto LAB_008d9d40;
                puVar13 = (ulong *)((long)puVar21 + 1);
                uVar11 = *puVar21;
                uVar24 = uVar24 + (byte)uVar11;
                puVar21 = puVar13;
              } while ((ulong)(byte)uVar11 == 0xff);
              if (uVar24 == 0xffffffffffffffff) goto LAB_008d9d40;
            }
            uVar24 = uVar24 + 0x13;
            if (CARRY8((ulong)puVar15,uVar24)) goto LAB_008d9d40;
            if (puVar12 <= (ulong *)((long)puVar15 + uVar24)) goto LAB_008d9f54;
LAB_008d9980:
            if ((param_7 >> 0x10 == 0) && ((ulong *)((long)puVar22 + param_7) < param_2))
            goto LAB_008d9d40;
            puVar21 = (ulong *)((long)puVar15 + uVar24);
            puVar23 = puVar13;
            if (puVar22 < param_2) {
              if ((ulong *)((long)puVar1 + -5) < puVar21) {
                if ((ulong)((long)puVar1 - (long)puVar15) <= uVar24) {
                  uVar24 = (long)puVar1 - (long)puVar15;
                }
              }
              uVar11 = (long)param_2 - (long)puVar22;
              sVar6 = uVar24 - uVar11;
              if (uVar24 < uVar11 || sVar6 == 0) {
                memmove(puVar15,(void *)(lVar3 - uVar11),uVar24);
              }
              else {
                memcpy(puVar15,(void *)(lVar3 - uVar11),uVar11);
                puVar13 = (ulong *)((long)puVar15 + uVar11);
                if ((ulong)((long)puVar13 - (long)param_2) < sVar6) {
                  puVar15 = (ulong *)((long)puVar15 + uVar24);
                  puVar21 = (ulong *)((long)param_2 + uVar10 + 1);
                  if (puVar21 <= puVar15) {
                    puVar21 = puVar15;
                  }
                  uVar24 = (long)puVar21 - ((long)param_2 + uVar10);
                  puVar22 = param_2;
                  if ((0x1f < uVar24) && (0x1f < uVar5)) {
                    uVar11 = uVar24 & 0xffffffffffffffe0;
                    puVar21 = (ulong *)((long)puVar13 + uVar11);
                    puVar22 = (ulong *)((long)(param_2 + 2) + uVar10);
                    puVar13 = param_2 + 2;
                    uVar10 = uVar11;
                    do {
                      puVar16 = puVar13 + -1;
                      uVar18 = puVar13[-2];
                      uVar26 = puVar13[1];
                      uVar25 = *puVar13;
                      uVar10 = uVar10 - 0x20;
                      puVar13 = puVar13 + 4;
                      puVar22[-1] = *puVar16;
                      puVar22[-2] = uVar18;
                      puVar22[1] = uVar26;
                      *puVar22 = uVar25;
                      puVar22 = puVar22 + 4;
                    } while (uVar10 != 0);
                    puVar22 = (ulong *)((long)param_2 + uVar11);
                    puVar13 = puVar21;
                    if (uVar24 == uVar11) goto LAB_008d9884;
                  }
                  do {
                    puVar21 = (ulong *)((long)puVar13 + 1);
                    *(char *)puVar13 = (char)*puVar22;
                    puVar22 = (ulong *)((long)puVar22 + 1);
                    puVar13 = puVar21;
                  } while (puVar21 < puVar15);
                  goto LAB_008d9884;
                }
                memcpy(puVar13,param_2,sVar6);
              }
              puVar21 = (ulong *)((long)puVar15 + uVar24);
            }
            else if (uVar5 < 0x10) {
              if (uVar5 == 4) {
                uVar18 = (ulong)(uint)*puVar22;
                uVar10 = (ulong)((uint)*puVar22 >> 0x10);
                uVar11 = uVar18 & 0xffff;
              }
              else {
                if (uVar5 == 2) {
                  uVar5 = (ushort)*puVar22;
                  uVar4 = CONCAT22(uVar5,uVar5);
                }
                else {
                  if (uVar5 != 1) {
                    if (uVar5 < 8) {
                      *(uint *)puVar15 = 0;
                      *(short *)puVar15 = (short)*puVar22;
                      *(undefined2 *)((long)puVar15 + 2) = *(undefined2 *)((long)puVar22 + 2);
                      uVar4 = *(uint *)(&DAT_00364e30 + uVar10 * 4);
                      *(uint *)((long)puVar15 + 4) = *(uint *)((long)puVar22 + (ulong)uVar4);
                      puVar13 = (ulong *)((long)((long)puVar22 + (ulong)uVar4) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar10 * 4));
                    }
                    else {
                      puVar13 = puVar22 + 1;
                      *puVar15 = *puVar22;
                    }
                    puVar22 = (ulong *)(uVar24 + (long)puVar15);
                    if ((ulong *)(uVar24 + (long)puVar15) <= puVar15 + 2) {
                      puVar22 = puVar15 + 2;
                    }
                    uVar10 = (long)puVar22 + (-9 - (long)puVar15);
                    if ((uVar10 < 0x18) || ((ulong)((long)puVar15 + (8 - (long)puVar13)) < 0x20)) {
                      puVar22 = puVar15 + 1;
                    }
                    else {
                      puVar16 = puVar13 + 2;
                      uVar10 = (uVar10 >> 3) + 1;
                      uVar11 = uVar10 & 0x3ffffffffffffffc;
                      puVar13 = puVar13 + uVar11;
                      puVar22 = puVar15 + 1 + uVar11;
                      puVar15 = puVar15 + 3;
                      uVar24 = uVar11;
                      do {
                        puVar7 = puVar16 + -1;
                        uVar18 = puVar16[-2];
                        uVar26 = puVar16[1];
                        uVar25 = *puVar16;
                        uVar24 = uVar24 - 4;
                        puVar16 = puVar16 + 4;
                        puVar15[-1] = *puVar7;
                        puVar15[-2] = uVar18;
                        puVar15[1] = uVar26;
                        *puVar15 = uVar25;
                        puVar15 = puVar15 + 4;
                      } while (uVar24 != 0);
                      if (uVar10 == uVar11) goto LAB_008d9884;
                    }
                    do {
                      puVar15 = puVar22 + 1;
                      *puVar22 = *puVar13;
                      puVar22 = puVar15;
                      puVar13 = puVar13 + 1;
                    } while (puVar15 < puVar21);
                    goto LAB_008d9884;
                  }
                  bVar8 = (byte)*puVar22;
                  uVar5 = CONCAT11(bVar8,bVar8);
                  uVar4 = (uint)bVar8 * 0x1010101;
                }
                uVar18 = (ulong)uVar4;
                uVar11 = (ulong)uVar5;
                uVar10 = uVar11;
              }
              uVar10 = uVar11 | uVar10 << 0x10 | uVar18 << 0x20;
              *puVar15 = uVar10;
              if (8 < uVar24) {
                puVar13 = (ulong *)(uVar24 + (long)puVar15);
                if ((ulong *)(uVar24 + (long)puVar15) <= puVar15 + 2) {
                  puVar13 = puVar15 + 2;
                }
                uVar24 = (long)puVar13 + (-9 - (long)puVar15);
                puVar13 = puVar15 + 1;
                if (0x17 < uVar24) {
                  puVar13 = puVar15 + 3;
                  uVar24 = (uVar24 >> 3) + 1;
                  uVar18 = uVar24 & 0x3ffffffffffffffc;
                  uVar11 = uVar18;
                  do {
                    uVar11 = uVar11 - 4;
                    puVar13[-1] = uVar10;
                    puVar13[-2] = uVar10;
                    puVar13[1] = uVar10;
                    *puVar13 = uVar10;
                    puVar13 = puVar13 + 4;
                  } while (uVar11 != 0);
                  puVar13 = puVar15 + 1 + uVar18;
                  if (uVar24 == uVar18) goto LAB_008d9884;
                }
                do {
                  puVar15 = puVar13 + 1;
                  *puVar13 = uVar10;
                  puVar13 = puVar15;
                } while (puVar15 < puVar21);
              }
            }
            else if (uVar5 < 0x40) {
              puVar13 = (ulong *)((long)puVar15 + -uVar10 + 0x10);
              do {
                uVar10 = puVar13[-2];
                puVar15[1] = puVar13[-1];
                *puVar15 = uVar10;
                uVar10 = *puVar13;
                puVar15[3] = puVar13[1];
                puVar15[2] = uVar10;
                puVar15 = puVar15 + 4;
                puVar13 = puVar13 + 4;
              } while (puVar15 < puVar21);
            }
            else {
              do {
                puVar13 = (ulong *)((long)puVar15 + -uVar10);
                uVar18 = puVar13[4];
                uVar11 = puVar13[7];
                uVar24 = puVar13[6];
                uVar26 = puVar13[1];
                uVar25 = *puVar13;
                uVar28 = puVar13[3];
                uVar27 = puVar13[2];
                puVar15[5] = puVar13[5];
                puVar15[4] = uVar18;
                puVar15[7] = uVar11;
                puVar15[6] = uVar24;
                puVar13 = puVar15 + 8;
                puVar15[1] = uVar26;
                *puVar15 = uVar25;
                puVar15[3] = uVar28;
                puVar15[2] = uVar27;
                puVar15 = puVar13;
              } while (puVar13 < puVar21);
            }
          }
          else {
            uVar24 = (uVar24 & 0xf) + 4;
            puVar21 = (ulong *)((long)puVar15 + uVar24);
            if (puVar12 <= puVar21) goto LAB_008d9f54;
            if ((puVar22 < param_2) || (uVar5 < 8)) goto LAB_008d9980;
            *puVar15 = *puVar22;
            puVar15[1] = puVar22[1];
            *(short *)(puVar15 + 2) = (short)puVar22[2];
            puVar23 = puVar13;
          }
LAB_008d9884:
          puVar13 = (ulong *)((long)puVar23 + 1);
          uVar24 = (ulong)(byte)*puVar23;
          uVar10 = (ulong)(byte)((byte)*puVar23 >> 4);
        } while (puVar13 <= pbVar2 + -0x11);
      }
      if (uVar10 == 0xf) goto LAB_008d9dcc;
LAB_008d9e00:
      puVar15 = (ulong *)((long)puVar21 + uVar10);
LAB_008d9e04:
      if ((puVar15 <= (ulong *)((long)puVar1 + -0xc)) &&
         (puVar14 = (ushort *)((long)puVar13 + uVar10), puVar14 <= pbVar2 + -8)) {
        puVar23 = puVar15;
        if (puVar15 <= puVar21 + 1) {
          puVar23 = puVar21 + 1;
        }
        if ((0x17 < (long)puVar23 + ~(ulong)puVar21) &&
           (0x1f < (ulong)((long)puVar21 - (long)puVar13))) {
          puVar12 = puVar21 + 2;
          puVar22 = puVar13 + 2;
          uVar10 = ((long)puVar23 + ~(ulong)puVar21 >> 3) + 1;
          uVar18 = uVar10 & 0x3ffffffffffffffc;
          uVar11 = uVar18;
          do {
            puVar23 = puVar22 + -1;
            uVar25 = puVar22[-2];
            uVar27 = puVar22[1];
            uVar26 = *puVar22;
            uVar11 = uVar11 - 4;
            puVar22 = puVar22 + 4;
            puVar12[-1] = *puVar23;
            puVar12[-2] = uVar25;
            puVar12[1] = uVar27;
            *puVar12 = uVar26;
            puVar12 = puVar12 + 4;
          } while (uVar11 != 0);
          puVar13 = puVar13 + uVar18;
          puVar21 = puVar21 + uVar18;
          if (uVar10 == uVar18) goto LAB_008d9f00;
        }
        do {
          puVar23 = puVar21 + 1;
          *puVar21 = *puVar13;
          puVar13 = puVar13 + 1;
          puVar21 = puVar23;
        } while (puVar23 < puVar15);
LAB_008d9f00:
        puVar13 = (ulong *)(puVar14 + 1);
        uVar10 = (ulong)*puVar14;
        uVar24 = uVar24 & 0xf;
        puVar22 = (ulong *)((long)puVar15 - uVar10);
        do {
          if (uVar24 == 0xf) {
            if (pbVar2 + -6 <= puVar13) goto LAB_008d9d40;
            uVar11 = (ulong)(byte)*puVar13;
            uVar24 = uVar11;
            while (puVar13 = (ulong *)((long)puVar13 + 1), uVar24 == 0xff) {
              if (pbVar2 + -6 <= puVar13) goto LAB_008d9d40;
              uVar24 = (ulong)*(byte *)puVar13;
              uVar11 = uVar11 + uVar24;
            }
            uVar24 = uVar11 + 0xf;
            if ((uVar11 == 0xffffffffffffffff) || (CARRY8((ulong)puVar15,uVar24)))
            goto LAB_008d9d40;
          }
          uVar24 = uVar24 + 4;
LAB_008d9f54:
          if ((param_7 >> 0x10 == 0) && ((ulong *)((long)puVar22 + param_7) < param_2))
          goto LAB_008d9d40;
          puVar21 = (ulong *)((long)puVar15 + uVar24);
          if (puVar22 < param_2) {
            uVar10 = uVar24;
            if ((ulong)((long)puVar1 - (long)puVar15) <= uVar24) {
              uVar10 = (long)puVar1 - (long)puVar15;
            }
            uVar11 = (long)param_2 - (long)puVar22;
            if ((ulong *)((long)puVar1 + -5) < puVar21) {
              uVar24 = uVar10;
            }
            sVar6 = uVar24 - uVar11;
            if (uVar24 < uVar11 || sVar6 == 0) {
              memmove(puVar15,(void *)(lVar3 - uVar11),uVar24);
            }
            else {
              memcpy(puVar15,(void *)(lVar3 - uVar11),uVar11);
              puVar23 = (ulong *)((long)puVar15 + uVar11);
              if ((ulong)((long)puVar23 - (long)param_2) < sVar6) {
                puVar12 = (ulong *)((long)puVar15 + uVar24);
                lVar17 = ((long)puVar15 + (long)param_2) - (long)puVar22;
                puVar21 = puVar12;
                if (puVar12 < (ulong *)(lVar17 + 1)) {
                  puVar21 = (ulong *)(lVar17 + 1);
                }
                uVar10 = ((long)puVar21 + (long)puVar22) - ((long)puVar15 + (long)param_2);
                puVar16 = param_2;
                if ((0x1f < uVar10) && (0x1f < (ulong)((long)puVar23 - (long)param_2))) {
                  puVar16 = param_2 + 2;
                  uVar11 = uVar10 & 0xffffffffffffffe0;
                  puVar21 = (ulong *)((long)puVar23 + uVar11);
                  puVar15 = (ulong *)((long)puVar15 + ((long)puVar16 - (long)puVar22));
                  uVar24 = uVar11;
                  do {
                    puVar23 = puVar16 + -1;
                    uVar18 = puVar16[-2];
                    uVar26 = puVar16[1];
                    uVar25 = *puVar16;
                    uVar24 = uVar24 - 0x20;
                    puVar16 = puVar16 + 4;
                    puVar15[-1] = *puVar23;
                    puVar15[-2] = uVar18;
                    puVar15[1] = uVar26;
                    *puVar15 = uVar25;
                    puVar15 = puVar15 + 4;
                  } while (uVar24 != 0);
                  puVar16 = (ulong *)((long)param_2 + uVar11);
                  puVar23 = puVar21;
                  if (uVar10 == uVar11) goto LAB_008da204;
                }
                do {
                  puVar21 = (ulong *)((long)puVar23 + 1);
                  *(char *)puVar23 = (char)*puVar16;
                  puVar16 = (ulong *)((long)puVar16 + 1);
                  puVar23 = puVar21;
                } while (puVar21 < puVar12);
                goto LAB_008da204;
              }
              memcpy(puVar23,param_2,sVar6);
            }
            puVar21 = (ulong *)((long)puVar15 + uVar24);
          }
          else if ((ulong *)((long)puVar1 + -0xc) < puVar21) {
            if ((ulong)((long)puVar1 - (long)puVar15) <= uVar24) {
              uVar24 = (long)puVar1 - (long)puVar15;
            }
            puVar21 = (ulong *)((long)puVar15 + uVar24);
            if (puVar15 < (ulong *)((long)puVar22 + uVar24)) {
              if (uVar24 != 0) {
                uVar24 = uVar24 + (long)puVar15;
                if (uVar24 <= (long)puVar15 + 1U) {
                  uVar24 = (long)puVar15 + 1;
                }
                uVar24 = uVar24 - (long)puVar15;
                if ((uVar24 < 8) || ((ulong)((long)puVar15 - (long)puVar22) < 0x20)) {
                  puVar23 = puVar15;
                  puVar12 = puVar22;
                }
                else {
                  uVar10 = 0;
                  if (0x1f < uVar24) {
                    uVar10 = uVar24 & 0xffffffffffffffe0;
                    puVar23 = puVar22 + 2;
                    puVar12 = puVar15 + 2;
                    uVar11 = uVar10;
                    do {
                      puVar16 = puVar23 + -1;
                      uVar18 = puVar23[-2];
                      uVar26 = puVar23[1];
                      uVar25 = *puVar23;
                      uVar11 = uVar11 - 0x20;
                      puVar23 = puVar23 + 4;
                      puVar12[-1] = *puVar16;
                      puVar12[-2] = uVar18;
                      puVar12[1] = uVar26;
                      *puVar12 = uVar25;
                      puVar12 = puVar12 + 4;
                    } while (uVar11 != 0);
                    if (uVar24 == uVar10) goto LAB_008da1dc;
                    puVar23 = (ulong *)((long)puVar15 + uVar10);
                    puVar12 = (ulong *)((long)puVar22 + uVar10);
                    if ((uVar24 & 0x18) == 0) goto LAB_008da1cc;
                  }
                  uVar11 = uVar24 & 0xfffffffffffffff8;
                  lVar17 = uVar10 - uVar11;
                  puVar19 = (undefined8 *)((long)puVar22 + uVar10);
                  puVar20 = (undefined8 *)((long)puVar15 + uVar10);
                  do {
                    lVar17 = lVar17 + 8;
                    *puVar20 = *puVar19;
                    puVar19 = puVar19 + 1;
                    puVar20 = puVar20 + 1;
                  } while (lVar17 != 0);
                  puVar23 = (ulong *)((long)puVar15 + uVar11);
                  puVar12 = (ulong *)((long)puVar22 + uVar11);
                  if (uVar24 == uVar11) goto LAB_008da1dc;
                }
LAB_008da1cc:
                do {
                  puVar15 = (ulong *)((long)puVar23 + 1);
                  *(char *)puVar23 = (char)*puVar12;
                  puVar23 = puVar15;
                  puVar12 = (ulong *)((long)puVar12 + 1);
                } while (puVar15 < puVar21);
              }
            }
            else {
              memcpy(puVar15,puVar22,uVar24);
            }
LAB_008da1dc:
            if (puVar21 == puVar1) {
              puVar15 = puVar1;
              goto LAB_008da274;
            }
          }
          else {
            if (uVar10 < 8) {
              *(uint *)puVar15 = 0;
              *(char *)puVar15 = (char)*puVar22;
              *(undefined1 *)((long)puVar15 + 1) = *(undefined1 *)((long)puVar22 + 1);
              *(undefined1 *)((long)puVar15 + 2) = *(undefined1 *)((long)puVar22 + 2);
              *(undefined1 *)((long)puVar15 + 3) = *(undefined1 *)((long)puVar22 + 3);
              uVar4 = *(uint *)(&DAT_00364e30 + uVar10 * 4);
              *(uint *)((long)puVar15 + 4) = *(uint *)((long)puVar22 + (ulong)uVar4);
              puVar23 = (ulong *)((long)((long)puVar22 + (ulong)uVar4) -
                                 (long)*(int *)(&DAT_00364dd0 + uVar10 * 4));
            }
            else {
              puVar23 = puVar22 + 1;
              *puVar15 = *puVar22;
            }
            puVar15[1] = *puVar23;
            if (0x10 < uVar24) {
              puVar12 = (ulong *)(uVar24 + (long)puVar15);
              if ((ulong *)(uVar24 + (long)puVar15) <= puVar15 + 3) {
                puVar12 = puVar15 + 3;
              }
              uVar10 = (long)puVar12 + (-0x11 - (long)puVar15);
              puVar12 = puVar15 + 2;
              if ((0x27 < uVar10) && (0x1f < (ulong)((long)puVar15 + (8 - (long)puVar23)))) {
                puVar22 = puVar23 + 3;
                uVar10 = (uVar10 >> 3) + 1;
                uVar11 = uVar10 & 0x3ffffffffffffffc;
                puVar23 = puVar23 + uVar11;
                puVar12 = puVar12 + uVar11;
                uVar24 = uVar11;
                do {
                  puVar16 = puVar22 + -1;
                  uVar18 = puVar22[-2];
                  uVar26 = puVar22[1];
                  uVar25 = *puVar22;
                  uVar24 = uVar24 - 4;
                  puVar22 = puVar22 + 4;
                  puVar15[3] = *puVar16;
                  puVar15[2] = uVar18;
                  puVar15[5] = uVar26;
                  puVar15[4] = uVar25;
                  puVar15 = puVar15 + 4;
                } while (uVar24 != 0);
                if (uVar10 == uVar11) goto LAB_008da204;
              }
              do {
                puVar23 = puVar23 + 1;
                puVar15 = puVar12 + 1;
                *puVar12 = *puVar23;
                puVar12 = puVar15;
              } while (puVar15 < puVar21);
            }
          }
LAB_008da204:
          bVar8 = (byte)*puVar13;
          puVar13 = (ulong *)((long)puVar13 + 1);
          while( true ) {
            uVar10 = (ulong)(bVar8 >> 4);
            uVar24 = (ulong)bVar8;
            if (uVar10 == 0xf) goto LAB_008d9dcc;
            if ((pbVar2 + -0x10 <= puVar13) || (puVar1 + -4 < puVar21)) goto LAB_008d9e00;
            uVar11 = *puVar13;
            puVar14 = (ushort *)((long)puVar13 + uVar10);
            uVar24 = uVar24 & 0xf;
            puVar15 = (ulong *)((long)puVar21 + uVar10);
            puVar21[1] = puVar13[1];
            *puVar21 = uVar11;
            puVar13 = (ulong *)(puVar14 + 1);
            uVar10 = (ulong)*puVar14;
            puVar22 = (ulong *)((long)puVar15 - uVar10);
            if ((uVar24 == 0xf) || ((*puVar14 < 8 || (puVar22 < param_2)))) break;
            puVar13 = (ulong *)((long)puVar14 + 3);
            puVar21 = (ulong *)((long)puVar15 + uVar24 + 4);
            *puVar15 = *puVar22;
            puVar15[1] = puVar22[1];
            *(short *)(puVar15 + 2) = (short)puVar22[2];
            bVar8 = (byte)puVar14[1];
          }
        } while( true );
      }
      puVar23 = (ulong *)((long)puVar21 + ((long)pbVar2 - (long)puVar13));
      if ((byte *)((long)puVar13 + uVar10) <= pbVar2) {
        puVar23 = puVar15;
      }
      if (puVar1 < puVar23) {
        memmove(puVar21,puVar13,(long)puVar1 - (long)puVar21);
        puVar15 = puVar1;
      }
      else {
        sVar6 = (long)pbVar2 - (long)puVar13;
        if ((byte *)((long)puVar13 + uVar10) <= pbVar2) {
          sVar6 = uVar10;
        }
        memmove(puVar21,puVar13,sVar6);
        puVar15 = (ulong *)((long)puVar21 + sVar6);
        if ((puVar23 != puVar1) &&
           (puVar14 = (ushort *)((long)puVar13 + sVar6), puVar14 < pbVar2 + -2)) goto LAB_008d9f00;
      }
LAB_008da274:
      iVar9 = (int)puVar15 - (int)param_2;
    }
  }
  return iVar9;
LAB_008d9dcc:
  if (pbVar2 + -0xf <= puVar13) {
LAB_008d9d40:
    return ~(uint)puVar13 + (int)param_1;
  }
  uVar10 = (ulong)(byte)*puVar13;
  puVar23 = (ulong *)((long)puVar13 + 1);
  puVar13 = (ulong *)((long)puVar13 + 1);
  if (uVar10 == 0xff) {
    do {
      puVar13 = puVar23;
      if (pbVar2 + -0xf <= puVar23) goto LAB_008d9d40;
      puVar13 = (ulong *)((long)puVar23 + 1);
      uVar11 = *puVar23;
      uVar10 = uVar10 + (byte)uVar11;
      puVar23 = puVar13;
    } while ((ulong)(byte)uVar11 == 0xff);
    if (uVar10 == 0xffffffffffffffff) goto LAB_008d9d40;
  }
  uVar10 = uVar10 + 0xf;
  if ((CARRY8((ulong)puVar21,uVar10)) || (CARRY8((ulong)puVar13,uVar10))) goto LAB_008d9d40;
  goto LAB_008d9e00;
}

