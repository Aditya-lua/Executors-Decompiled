/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d8b34
 */

int LZ4_decompress_safe_forceExtDict
              (ulong *param_1,ulong *param_2,int param_3,uint param_4,long param_5,ulong param_6)

{
  byte *pbVar1;
  ulong *puVar2;
  long lVar3;
  uint uVar4;
  ushort uVar5;
  size_t sVar6;
  ulong *puVar7;
  byte bVar8;
  int iVar9;
  ulong *puVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong *puVar14;
  undefined8 *puVar15;
  ulong *puVar16;
  ushort *puVar17;
  ulong uVar18;
  long lVar19;
  undefined8 *puVar20;
  ulong *puVar21;
  ulong *puVar22;
  ulong uVar23;
  ulong *puVar24;
  ulong *puVar25;
  ulong *puVar26;
  ulong *puVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  
  iVar9 = -1;
  if ((param_1 != (ulong *)0x0) && (-1 < (int)param_4)) {
    lVar3 = 0;
    if (param_5 != 0) {
      lVar3 = param_5 + param_6;
    }
    if (param_4 == 0) {
      if (param_3 == 1) {
        iVar9 = -(uint)((byte)*param_1 != 0);
      }
    }
    else if (param_3 != 0) {
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      uVar18 = (ulong)param_4;
      puVar2 = (ulong *)((long)param_2 + uVar18);
      puVar16 = param_1;
      puVar21 = param_2;
      if (param_4 < 0x40) goto LAB_008d950c;
      puVar16 = (ulong *)((long)param_1 + 1);
      uVar11 = (ulong)(byte)*param_1;
      uVar28 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar14 = puVar2 + -8;
        puVar24 = param_1;
        do {
          if (uVar28 == 0xf) {
            if (pbVar1 + -0xf <= puVar16) goto LAB_008d9110;
            uVar28 = (ulong)(byte)*puVar16;
            puVar16 = (ulong *)((long)puVar24 + 2);
            puVar24 = puVar16;
            if (uVar28 == 0xff) {
              do {
                puVar16 = puVar24;
                if (pbVar1 + -0xf <= puVar24) goto LAB_008d9110;
                puVar16 = (ulong *)((long)puVar24 + 1);
                uVar13 = *puVar24;
                uVar28 = uVar28 + (byte)uVar13;
                puVar24 = puVar16;
              } while ((ulong)(byte)uVar13 == 0xff);
              if (uVar28 == 0xffffffffffffffff) goto LAB_008d9110;
            }
            uVar28 = uVar28 + 0xf;
            if (CARRY8((ulong)puVar16,uVar28)) goto LAB_008d9110;
            puVar12 = (ulong *)((long)puVar21 + uVar28);
            if (puVar14 < puVar12) goto LAB_008d91d4;
            puVar17 = (ushort *)((long)puVar16 + uVar28);
            if (pbVar1 + -0x40 < puVar17) goto LAB_008d91d4;
            do {
              uVar23 = puVar16[4];
              uVar13 = puVar16[7];
              uVar28 = puVar16[6];
              uVar30 = puVar16[1];
              uVar29 = *puVar16;
              uVar32 = puVar16[3];
              uVar31 = puVar16[2];
              puVar21[5] = puVar16[5];
              puVar21[4] = uVar23;
              puVar21[7] = uVar13;
              puVar21[6] = uVar28;
              puVar24 = puVar21 + 8;
              puVar21[1] = uVar30;
              *puVar21 = uVar29;
              puVar21[3] = uVar32;
              puVar21[2] = uVar31;
              puVar16 = puVar16 + 8;
              puVar21 = puVar24;
            } while (puVar24 < puVar12);
          }
          else {
            uVar13 = *puVar16;
            puVar17 = (ushort *)((long)puVar16 + uVar28);
            puVar12 = (ulong *)((long)puVar21 + uVar28);
            puVar21[1] = puVar16[1];
            *puVar21 = uVar13;
          }
          puVar16 = (ulong *)(puVar17 + 1);
          uVar5 = *puVar17;
          uVar28 = (ulong)uVar5;
          puVar27 = (ulong *)((long)puVar12 - uVar28);
          if ((uVar11 & 0xf) == 0xf) {
            if (pbVar1 + -6 <= puVar16) goto LAB_008d9110;
            uVar11 = (ulong)(byte)puVar17[1];
            puVar16 = (ulong *)((long)puVar17 + 3);
            puVar21 = puVar16;
            if (uVar11 == 0xff) {
              do {
                puVar16 = puVar21;
                if (pbVar1 + -6 <= puVar21) goto LAB_008d9110;
                puVar16 = (ulong *)((long)puVar21 + 1);
                uVar13 = *puVar21;
                uVar11 = uVar11 + (byte)uVar13;
                puVar21 = puVar16;
              } while ((ulong)(byte)uVar13 == 0xff);
              if (uVar11 == 0xffffffffffffffff) goto LAB_008d9110;
            }
            uVar11 = uVar11 + 0x13;
            if (CARRY8((ulong)puVar12,uVar11)) goto LAB_008d9110;
            if (puVar14 <= (ulong *)((long)puVar12 + uVar11)) goto LAB_008d92cc;
LAB_008d8d38:
            if ((param_6 >> 0x10 == 0) && ((ulong *)((long)puVar27 + param_6) < param_2))
            goto LAB_008d9110;
            puVar21 = (ulong *)((long)puVar12 + uVar11);
            puVar24 = puVar16;
            if (puVar27 < param_2) {
              if ((ulong *)((long)puVar2 + -5) < puVar21) goto LAB_008d9110;
              uVar13 = (long)param_2 - (long)puVar27;
              sVar6 = uVar11 - uVar13;
              if (uVar11 < uVar13 || sVar6 == 0) {
                memmove(puVar12,(void *)(lVar3 - uVar13),uVar11);
              }
              else {
                memcpy(puVar12,(void *)(lVar3 - uVar13),uVar13);
                puVar16 = (ulong *)((long)puVar12 + uVar13);
                if ((ulong)((long)puVar16 - (long)param_2) < sVar6) {
                  uVar13 = (long)param_2 + uVar28 + 1;
                  if (uVar13 <= uVar11 + (long)puVar12) {
                    uVar13 = uVar11 + (long)puVar12;
                  }
                  uVar13 = uVar13 - ((long)param_2 + uVar28);
                  puVar12 = param_2;
                  if ((uVar13 < 0x20) || (uVar5 < 0x20)) {
LAB_008d8eb8:
                    do {
                      puVar27 = (ulong *)((long)puVar16 + 1);
                      *(char *)puVar16 = (char)*puVar12;
                      puVar16 = puVar27;
                      puVar12 = (ulong *)((long)puVar12 + 1);
                    } while (puVar27 < puVar21);
                  }
                  else {
                    uVar11 = uVar13 & 0xffffffffffffffe0;
                    puVar27 = (ulong *)((long)puVar16 + uVar11);
                    puVar12 = (ulong *)((long)(param_2 + 2) + uVar28);
                    puVar16 = param_2 + 2;
                    uVar28 = uVar11;
                    do {
                      puVar10 = puVar16 + -1;
                      uVar23 = puVar16[-2];
                      uVar30 = puVar16[1];
                      uVar29 = *puVar16;
                      uVar28 = uVar28 - 0x20;
                      puVar16 = puVar16 + 4;
                      puVar12[-1] = *puVar10;
                      puVar12[-2] = uVar23;
                      puVar12[1] = uVar30;
                      *puVar12 = uVar29;
                      puVar12 = puVar12 + 4;
                    } while (uVar28 != 0);
                    puVar16 = puVar27;
                    puVar12 = (ulong *)((long)param_2 + uVar11);
                    if (uVar13 != uVar11) goto LAB_008d8eb8;
                  }
                  puVar21 = puVar27;
                }
                else {
                  memcpy(puVar16,param_2,sVar6);
                }
              }
            }
            else if (uVar5 < 0x10) {
              if (uVar5 == 4) {
                uVar23 = (ulong)(uint)*puVar27;
                uVar28 = (ulong)((uint)*puVar27 >> 0x10);
                uVar13 = uVar23 & 0xffff;
              }
              else {
                if (uVar5 == 2) {
                  uVar5 = (ushort)*puVar27;
                  uVar4 = CONCAT22(uVar5,uVar5);
                }
                else {
                  if (uVar5 != 1) {
                    if (uVar5 < 8) {
                      *(uint *)puVar12 = 0;
                      *(short *)puVar12 = (short)*puVar27;
                      *(undefined2 *)((long)puVar12 + 2) = *(undefined2 *)((long)puVar27 + 2);
                      uVar4 = *(uint *)(&DAT_00364e30 + uVar28 * 4);
                      *(uint *)((long)puVar12 + 4) = *(uint *)((long)puVar27 + (ulong)uVar4);
                      puVar16 = (ulong *)((long)((long)puVar27 + (ulong)uVar4) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar28 * 4));
                    }
                    else {
                      puVar16 = puVar27 + 1;
                      *puVar12 = *puVar27;
                    }
                    puVar27 = (ulong *)(uVar11 + (long)puVar12);
                    if ((ulong *)(uVar11 + (long)puVar12) <= puVar12 + 2) {
                      puVar27 = puVar12 + 2;
                    }
                    uVar28 = (long)puVar27 + (-9 - (long)puVar12);
                    if ((uVar28 < 0x18) || ((ulong)((long)puVar12 + (8 - (long)puVar16)) < 0x20)) {
                      puVar27 = puVar12 + 1;
                    }
                    else {
                      puVar10 = puVar16 + 2;
                      uVar28 = (uVar28 >> 3) + 1;
                      uVar13 = uVar28 & 0x3ffffffffffffffc;
                      puVar16 = puVar16 + uVar13;
                      puVar27 = puVar12 + 1 + uVar13;
                      puVar12 = puVar12 + 3;
                      uVar11 = uVar13;
                      do {
                        puVar22 = puVar10 + -1;
                        uVar23 = puVar10[-2];
                        uVar30 = puVar10[1];
                        uVar29 = *puVar10;
                        uVar11 = uVar11 - 4;
                        puVar10 = puVar10 + 4;
                        puVar12[-1] = *puVar22;
                        puVar12[-2] = uVar23;
                        puVar12[1] = uVar30;
                        *puVar12 = uVar29;
                        puVar12 = puVar12 + 4;
                      } while (uVar11 != 0);
                      if (uVar28 == uVar13) goto LAB_008d8c3c;
                    }
                    do {
                      puVar12 = puVar27 + 1;
                      *puVar27 = *puVar16;
                      puVar27 = puVar12;
                      puVar16 = puVar16 + 1;
                    } while (puVar12 < puVar21);
                    goto LAB_008d8c3c;
                  }
                  bVar8 = (byte)*puVar27;
                  uVar5 = CONCAT11(bVar8,bVar8);
                  uVar4 = (uint)bVar8 * 0x1010101;
                }
                uVar23 = (ulong)uVar4;
                uVar13 = (ulong)uVar5;
                uVar28 = uVar13;
              }
              uVar28 = uVar13 | uVar28 << 0x10 | uVar23 << 0x20;
              *puVar12 = uVar28;
              if (8 < uVar11) {
                puVar16 = (ulong *)(uVar11 + (long)puVar12);
                if ((ulong *)(uVar11 + (long)puVar12) <= puVar12 + 2) {
                  puVar16 = puVar12 + 2;
                }
                uVar11 = (long)puVar16 + (-9 - (long)puVar12);
                puVar16 = puVar12 + 1;
                if (0x17 < uVar11) {
                  puVar16 = puVar12 + 3;
                  uVar11 = (uVar11 >> 3) + 1;
                  uVar23 = uVar11 & 0x3ffffffffffffffc;
                  uVar13 = uVar23;
                  do {
                    uVar13 = uVar13 - 4;
                    puVar16[-1] = uVar28;
                    puVar16[-2] = uVar28;
                    puVar16[1] = uVar28;
                    *puVar16 = uVar28;
                    puVar16 = puVar16 + 4;
                  } while (uVar13 != 0);
                  puVar16 = puVar12 + 1 + uVar23;
                  if (uVar11 == uVar23) goto LAB_008d8c3c;
                }
                do {
                  puVar12 = puVar16 + 1;
                  *puVar16 = uVar28;
                  puVar16 = puVar12;
                } while (puVar12 < puVar21);
              }
            }
            else if (uVar5 < 0x40) {
              puVar16 = (ulong *)((long)puVar12 + -uVar28 + 0x10);
              do {
                uVar28 = puVar16[-2];
                puVar12[1] = puVar16[-1];
                *puVar12 = uVar28;
                uVar28 = *puVar16;
                puVar12[3] = puVar16[1];
                puVar12[2] = uVar28;
                puVar12 = puVar12 + 4;
                puVar16 = puVar16 + 4;
              } while (puVar12 < puVar21);
            }
            else {
              do {
                puVar16 = (ulong *)((long)puVar12 + -uVar28);
                uVar23 = puVar16[4];
                uVar13 = puVar16[7];
                uVar11 = puVar16[6];
                uVar30 = puVar16[1];
                uVar29 = *puVar16;
                uVar32 = puVar16[3];
                uVar31 = puVar16[2];
                puVar12[5] = puVar16[5];
                puVar12[4] = uVar23;
                puVar12[7] = uVar13;
                puVar12[6] = uVar11;
                puVar16 = puVar12 + 8;
                puVar12[1] = uVar30;
                *puVar12 = uVar29;
                puVar12[3] = uVar32;
                puVar12[2] = uVar31;
                puVar12 = puVar16;
              } while (puVar16 < puVar21);
            }
          }
          else {
            uVar11 = (uVar11 & 0xf) + 4;
            puVar21 = (ulong *)((long)puVar12 + uVar11);
            if (puVar14 <= puVar21) goto LAB_008d92cc;
            if ((puVar27 < param_2) || (uVar5 < 8)) goto LAB_008d8d38;
            *puVar12 = *puVar27;
            puVar12[1] = puVar27[1];
            *(short *)(puVar12 + 2) = (short)puVar27[2];
            puVar24 = puVar16;
          }
LAB_008d8c3c:
          puVar16 = (ulong *)((long)puVar24 + 1);
          uVar11 = (ulong)(byte)*puVar24;
          uVar28 = (ulong)(byte)((byte)*puVar24 >> 4);
        } while (puVar16 <= pbVar1 + -0x11);
      }
      if (uVar28 == 0xf) goto LAB_008d919c;
LAB_008d91d0:
      puVar12 = (ulong *)((long)puVar21 + uVar28);
LAB_008d91d4:
      if ((puVar12 <= (ulong *)((long)puVar2 + -0xc)) &&
         (puVar17 = (ushort *)((long)puVar16 + uVar28), puVar17 <= pbVar1 + -8)) {
        puVar24 = puVar12;
        if (puVar12 <= puVar21 + 1) {
          puVar24 = puVar21 + 1;
        }
        if ((0x17 < (long)puVar24 + ~(ulong)puVar21) &&
           (0x1f < (ulong)((long)puVar21 - (long)puVar16))) {
          puVar14 = puVar21 + 2;
          puVar27 = puVar16 + 2;
          uVar28 = ((long)puVar24 + ~(ulong)puVar21 >> 3) + 1;
          uVar23 = uVar28 & 0x3ffffffffffffffc;
          uVar13 = uVar23;
          do {
            puVar24 = puVar27 + -1;
            uVar29 = puVar27[-2];
            uVar31 = puVar27[1];
            uVar30 = *puVar27;
            uVar13 = uVar13 - 4;
            puVar27 = puVar27 + 4;
            puVar14[-1] = *puVar24;
            puVar14[-2] = uVar29;
            puVar14[1] = uVar31;
            *puVar14 = uVar30;
            puVar14 = puVar14 + 4;
          } while (uVar13 != 0);
          puVar16 = puVar16 + uVar23;
          puVar21 = puVar21 + uVar23;
          if (uVar28 == uVar23) goto LAB_008d9278;
        }
        do {
          puVar24 = puVar21 + 1;
          *puVar21 = *puVar16;
          puVar16 = puVar16 + 1;
          puVar21 = puVar24;
        } while (puVar24 < puVar12);
LAB_008d9278:
        puVar16 = (ulong *)(puVar17 + 1);
        uVar28 = (ulong)*puVar17;
        uVar11 = uVar11 & 0xf;
        puVar27 = (ulong *)((long)puVar12 - uVar28);
        do {
          if (uVar11 == 0xf) {
            if (pbVar1 + -6 <= puVar16) goto LAB_008d9110;
            uVar13 = (ulong)(byte)*puVar16;
            uVar11 = uVar13;
            while (puVar16 = (ulong *)((long)puVar16 + 1), uVar11 == 0xff) {
              if (pbVar1 + -6 <= puVar16) goto LAB_008d9110;
              uVar11 = (ulong)*(byte *)puVar16;
              uVar13 = uVar13 + uVar11;
            }
            uVar11 = uVar13 + 0xf;
            if ((uVar13 == 0xffffffffffffffff) || (CARRY8((ulong)puVar12,uVar11)))
            goto LAB_008d9110;
          }
          uVar11 = uVar11 + 4;
LAB_008d92cc:
          if ((param_6 >> 0x10 == 0) && ((ulong *)((long)puVar27 + param_6) < param_2))
          goto LAB_008d9110;
          puVar21 = (ulong *)((long)puVar12 + uVar11);
          if (puVar27 < param_2) {
            if ((ulong *)((long)puVar2 + -5) < puVar21) goto LAB_008d9110;
            uVar28 = (long)param_2 - (long)puVar27;
            sVar6 = uVar11 - uVar28;
            if (uVar11 < uVar28 || sVar6 == 0) {
              memmove(puVar12,(void *)(lVar3 - uVar28),uVar11);
            }
            else {
              memcpy(puVar12,(void *)(lVar3 - uVar28),uVar28);
              puVar24 = (ulong *)((long)puVar12 + uVar28);
              if ((ulong)((long)puVar24 - (long)param_2) < sVar6) {
                uVar11 = uVar11 + (long)puVar12;
                lVar19 = ((long)puVar12 + (long)param_2) - (long)puVar27;
                if (uVar11 < lVar19 + 1U) {
                  uVar11 = lVar19 + 1;
                }
                uVar28 = (long)puVar27 + (uVar11 - ((long)puVar12 + (long)param_2));
                puVar14 = param_2;
                if ((uVar28 < 0x20) || ((ulong)((long)puVar24 - (long)param_2) < 0x20)) {
LAB_008d94f4:
                  do {
                    puVar10 = (ulong *)((long)puVar24 + 1);
                    *(char *)puVar24 = (char)*puVar14;
                    puVar24 = puVar10;
                    puVar14 = (ulong *)((long)puVar14 + 1);
                  } while (puVar10 < puVar21);
                }
                else {
                  puVar14 = param_2 + 2;
                  uVar13 = uVar28 & 0xffffffffffffffe0;
                  puVar10 = (ulong *)((long)puVar24 + uVar13);
                  puVar12 = (ulong *)((long)puVar12 + ((long)puVar14 - (long)puVar27));
                  uVar11 = uVar13;
                  do {
                    puVar24 = puVar14 + -1;
                    uVar23 = puVar14[-2];
                    uVar30 = puVar14[1];
                    uVar29 = *puVar14;
                    uVar11 = uVar11 - 0x20;
                    puVar14 = puVar14 + 4;
                    puVar12[-1] = *puVar24;
                    puVar12[-2] = uVar23;
                    puVar12[1] = uVar30;
                    *puVar12 = uVar29;
                    puVar12 = puVar12 + 4;
                  } while (uVar11 != 0);
                  puVar24 = puVar10;
                  puVar14 = (ulong *)((long)param_2 + uVar13);
                  if (uVar28 != uVar13) goto LAB_008d94f4;
                }
                puVar21 = puVar10;
              }
              else {
                memcpy(puVar24,param_2,sVar6);
              }
            }
          }
          else {
            if (uVar28 < 8) {
              *(uint *)puVar12 = 0;
              *(char *)puVar12 = (char)*puVar27;
              *(undefined1 *)((long)puVar12 + 1) = *(undefined1 *)((long)puVar27 + 1);
              *(undefined1 *)((long)puVar12 + 2) = *(undefined1 *)((long)puVar27 + 2);
              *(undefined1 *)((long)puVar12 + 3) = *(undefined1 *)((long)puVar27 + 3);
              uVar4 = *(uint *)(&DAT_00364e30 + uVar28 * 4);
              *(uint *)((long)puVar12 + 4) = *(uint *)((long)puVar27 + (ulong)uVar4);
              puVar24 = (ulong *)((long)((long)puVar27 + (ulong)uVar4) -
                                 (long)*(int *)(&DAT_00364dd0 + uVar28 * 4));
            }
            else {
              puVar24 = puVar27 + 1;
              *puVar12 = *puVar27;
            }
            puVar14 = puVar12 + 1;
            if (puVar21 <= (ulong *)((long)puVar2 + -0xc)) {
              *puVar14 = *puVar24;
              if (0x10 < uVar11) {
                puVar14 = (ulong *)(uVar11 + (long)puVar12);
                if ((ulong *)(uVar11 + (long)puVar12) <= puVar12 + 3) {
                  puVar14 = puVar12 + 3;
                }
                uVar28 = (long)puVar14 + (-0x11 - (long)puVar12);
                puVar14 = puVar12 + 2;
                if ((0x27 < uVar28) && (0x1f < (ulong)((long)puVar12 + (8 - (long)puVar24)))) {
                  puVar27 = puVar24 + 3;
                  uVar28 = (uVar28 >> 3) + 1;
                  uVar13 = uVar28 & 0x3ffffffffffffffc;
                  puVar24 = puVar24 + uVar13;
                  puVar14 = puVar14 + uVar13;
                  uVar11 = uVar13;
                  do {
                    puVar10 = puVar27 + -1;
                    uVar23 = puVar27[-2];
                    uVar30 = puVar27[1];
                    uVar29 = *puVar27;
                    uVar11 = uVar11 - 4;
                    puVar27 = puVar27 + 4;
                    puVar12[3] = *puVar10;
                    puVar12[2] = uVar23;
                    puVar12[5] = uVar30;
                    puVar12[4] = uVar29;
                    puVar12 = puVar12 + 4;
                  } while (uVar11 != 0);
                  if (uVar28 == uVar13) goto LAB_008d950c;
                }
                do {
                  puVar24 = puVar24 + 1;
                  puVar12 = puVar14 + 1;
                  *puVar14 = *puVar24;
                  puVar14 = puVar12;
                } while (puVar12 < puVar21);
              }
              goto LAB_008d950c;
            }
            if ((ulong *)((long)puVar2 + -5) < puVar21) goto LAB_008d9110;
            puVar27 = (ulong *)((long)puVar2 + -7);
            if (puVar14 < puVar27) {
              puVar10 = (ulong *)((long)param_2 + (uVar18 - 7));
              if (puVar10 <= puVar12 + 2) {
                puVar10 = puVar12 + 2;
              }
              uVar28 = (long)puVar10 + (-9 - (long)puVar12);
              puVar10 = puVar24;
              if (uVar28 < 0x28) {
                puVar22 = puVar14;
LAB_008d9664:
                do {
                  puVar25 = puVar22 + 1;
                  *puVar22 = *puVar10;
                  puVar10 = puVar10 + 1;
                  puVar22 = puVar25;
                } while (puVar25 < puVar27);
              }
              else {
                puVar22 = puVar14;
                if ((ulong)((long)puVar12 + (8 - (long)puVar24)) < 0x20) goto LAB_008d9664;
                puVar25 = puVar12 + 3;
                puVar26 = puVar24 + 2;
                uVar28 = (uVar28 >> 3) + 1;
                uVar23 = uVar28 & 0x3ffffffffffffffc;
                puVar10 = puVar24 + uVar23;
                puVar22 = puVar14 + uVar23;
                uVar13 = uVar23;
                do {
                  puVar7 = puVar26 + -1;
                  uVar29 = puVar26[-2];
                  uVar31 = puVar26[1];
                  uVar30 = *puVar26;
                  uVar13 = uVar13 - 4;
                  puVar26 = puVar26 + 4;
                  puVar25[-1] = *puVar7;
                  puVar25[-2] = uVar29;
                  puVar25[1] = uVar31;
                  *puVar25 = uVar30;
                  puVar25 = puVar25 + 4;
                } while (uVar13 != 0);
                if (uVar28 != uVar23) goto LAB_008d9664;
              }
              lVar19 = (long)puVar27 - (long)puVar14;
              puVar14 = puVar27;
              puVar27 = (ulong *)((long)puVar24 + lVar19);
            }
            else {
              puVar27 = puVar24;
            }
            if (puVar14 < puVar21) {
              puVar10 = (ulong *)((long)param_2 + (uVar18 - 7));
              if (puVar10 <= puVar12 + 1) {
                puVar10 = puVar12 + 1;
              }
              uVar28 = (long)puVar12 + (uVar11 - (long)puVar10);
              if ((uVar28 < 8) || ((ulong)((long)puVar12 + (8 - (long)puVar24)) < 0x20)) {
                puVar22 = puVar14;
                puVar25 = puVar27;
              }
              else {
                uVar11 = 0;
                if (0x1f < uVar28) {
                  uVar11 = uVar28 & 0xffffffffffffffe0;
                  puVar22 = puVar14 + 2;
                  puVar25 = (ulong *)((long)puVar24 + (long)puVar10 + (8 - (long)puVar12));
                  uVar13 = uVar11;
                  do {
                    puVar26 = puVar25 + -1;
                    uVar23 = puVar25[-2];
                    uVar30 = puVar25[1];
                    uVar29 = *puVar25;
                    uVar13 = uVar13 - 0x20;
                    puVar25 = puVar25 + 4;
                    puVar22[-1] = *puVar26;
                    puVar22[-2] = uVar23;
                    puVar22[1] = uVar30;
                    *puVar22 = uVar29;
                    puVar22 = puVar22 + 4;
                  } while (uVar13 != 0);
                  if (uVar28 == uVar11) goto LAB_008d950c;
                  puVar22 = (ulong *)((long)puVar14 + uVar11);
                  puVar25 = (ulong *)((long)puVar27 + uVar11);
                  if ((uVar28 & 0x18) == 0) goto LAB_008d96c4;
                }
                uVar13 = uVar28 & 0xfffffffffffffff8;
                puVar25 = (ulong *)((long)puVar27 + uVar13);
                puVar22 = (ulong *)((long)puVar14 + uVar13);
                lVar19 = uVar11 - uVar13;
                puVar15 = (undefined8 *)((long)puVar14 + uVar11);
                puVar20 = (undefined8 *)
                          ((long)puVar24 + (long)puVar10 + (uVar11 - (long)puVar12) + -8);
                do {
                  lVar19 = lVar19 + 8;
                  *puVar15 = *puVar20;
                  puVar15 = puVar15 + 1;
                  puVar20 = puVar20 + 1;
                } while (lVar19 != 0);
                if (uVar28 == uVar13) goto LAB_008d950c;
              }
LAB_008d96c4:
              do {
                puVar24 = (ulong *)((long)puVar22 + 1);
                *(char *)puVar22 = (char)*puVar25;
                puVar22 = puVar24;
                puVar25 = (ulong *)((long)puVar25 + 1);
              } while (puVar24 < puVar21);
            }
          }
LAB_008d950c:
          bVar8 = (byte)*puVar16;
          puVar16 = (ulong *)((long)puVar16 + 1);
          while( true ) {
            uVar28 = (ulong)(bVar8 >> 4);
            uVar11 = (ulong)bVar8;
            if (uVar28 == 0xf) goto LAB_008d919c;
            if ((pbVar1 + -0x10 <= puVar16) || (puVar2 + -4 < puVar21)) goto LAB_008d91d0;
            uVar13 = *puVar16;
            puVar17 = (ushort *)((long)puVar16 + uVar28);
            uVar11 = uVar11 & 0xf;
            puVar12 = (ulong *)((long)puVar21 + uVar28);
            puVar21[1] = puVar16[1];
            *puVar21 = uVar13;
            puVar16 = (ulong *)(puVar17 + 1);
            uVar28 = (ulong)*puVar17;
            puVar27 = (ulong *)((long)puVar12 - uVar28);
            if (((uVar11 == 0xf) || (*puVar17 < 8)) || (puVar27 < param_2)) break;
            puVar16 = (ulong *)((long)puVar17 + 3);
            puVar21 = (ulong *)((long)puVar12 + uVar11 + 4);
            *puVar12 = *puVar27;
            puVar12[1] = puVar27[1];
            *(short *)(puVar12 + 2) = (short)puVar27[2];
            bVar8 = (byte)puVar17[1];
          }
        } while( true );
      }
      if (((byte *)((long)puVar16 + uVar28) == pbVar1) && (puVar12 <= puVar2)) {
        memmove(puVar21,puVar16,uVar28);
        return ((int)puVar21 + (int)uVar28) - (int)param_2;
      }
LAB_008d9110:
      iVar9 = ~(uint)puVar16 + (int)param_1;
    }
  }
  return iVar9;
LAB_008d919c:
  if (pbVar1 + -0xf <= puVar16) goto LAB_008d9110;
  uVar28 = (ulong)(byte)*puVar16;
  puVar24 = (ulong *)((long)puVar16 + 1);
  puVar16 = (ulong *)((long)puVar16 + 1);
  if (uVar28 == 0xff) {
    do {
      puVar16 = puVar24;
      if (pbVar1 + -0xf <= puVar24) goto LAB_008d9110;
      puVar16 = (ulong *)((long)puVar24 + 1);
      uVar13 = *puVar24;
      uVar28 = uVar28 + (byte)uVar13;
      puVar24 = puVar16;
    } while ((ulong)(byte)uVar13 == 0xff);
    if (uVar28 == 0xffffffffffffffff) goto LAB_008d9110;
  }
  uVar28 = uVar28 + 0xf;
  if ((CARRY8((ulong)puVar21,uVar28)) || (CARRY8((ulong)puVar16,uVar28))) goto LAB_008d9110;
  goto LAB_008d91d0;
}

