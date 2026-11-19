/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d6bec
 */

int LZ4_decompress_safe(ulong *param_1,ulong *param_2,int param_3,uint param_4)

{
  byte *pbVar1;
  ulong *puVar2;
  uint uVar3;
  ushort uVar4;
  ulong *puVar5;
  byte bVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong *puVar11;
  int iVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *__src;
  ulong uVar15;
  ulong *puVar16;
  undefined8 *puVar17;
  ulong *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  ulong *puVar21;
  long lVar22;
  ulong uVar23;
  ulong uVar24;
  ushort *puVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  
  iVar12 = -1;
  if ((param_1 != (ulong *)0x0) && (-1 < (int)param_4)) {
    if (param_4 == 0) {
      if (param_3 == 1) {
        iVar12 = -(uint)((byte)*param_1 != 0);
      }
    }
    else if (param_3 != 0) {
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      uVar15 = (ulong)param_4;
      puVar2 = (ulong *)((long)param_2 + uVar15);
      __src = param_1;
      puVar14 = param_2;
      if (param_4 < 0x40) goto LAB_008d724c;
      puVar16 = (ulong *)((long)param_1 + 1);
      uVar24 = (ulong)(byte)*param_1;
      uVar23 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar18 = puVar2 + -8;
        puVar13 = param_1;
        __src = puVar16;
        do {
          if (uVar23 == 0xf) {
            if (pbVar1 + -0xf <= __src) goto LAB_008d700c;
            uVar23 = (ulong)(byte)*__src;
            __src = (ulong *)((long)puVar13 + 2);
            puVar16 = __src;
            if (uVar23 == 0xff) {
              do {
                __src = puVar16;
                if (pbVar1 + -0xf <= puVar16) goto LAB_008d700c;
                __src = (ulong *)((long)puVar16 + 1);
                uVar20 = *puVar16;
                uVar23 = uVar23 + (byte)uVar20;
                puVar16 = __src;
              } while ((ulong)(byte)uVar20 == 0xff);
              if (uVar23 == 0xffffffffffffffff) goto LAB_008d700c;
            }
            uVar23 = uVar23 + 0xf;
            if (CARRY8((ulong)__src,uVar23)) goto LAB_008d700c;
            puVar13 = (ulong *)((long)puVar14 + uVar23);
            if (puVar18 < puVar13) goto LAB_008d70cc;
            puVar25 = (ushort *)((long)__src + uVar23);
            if (pbVar1 + -0x40 < puVar25) goto LAB_008d70cc;
            do {
              uVar8 = __src[4];
              uVar20 = __src[7];
              uVar23 = __src[6];
              uVar27 = __src[1];
              uVar26 = *__src;
              uVar29 = __src[3];
              uVar28 = __src[2];
              puVar14[5] = __src[5];
              puVar14[4] = uVar8;
              puVar14[7] = uVar20;
              puVar14[6] = uVar23;
              puVar16 = puVar14 + 8;
              puVar14[1] = uVar27;
              *puVar14 = uVar26;
              puVar14[3] = uVar29;
              puVar14[2] = uVar28;
              __src = __src + 8;
              puVar14 = puVar16;
            } while (puVar16 < puVar13);
          }
          else {
            uVar20 = *__src;
            puVar25 = (ushort *)((long)__src + uVar23);
            puVar13 = (ulong *)((long)puVar14 + uVar23);
            puVar14[1] = __src[1];
            *puVar14 = uVar20;
          }
          __src = (ulong *)(puVar25 + 1);
          uVar4 = *puVar25;
          uVar23 = (ulong)uVar4;
          puVar16 = (ulong *)((long)puVar13 - uVar23);
          if ((uVar24 & 0xf) == 0xf) {
            if (pbVar1 + -6 <= __src) goto LAB_008d700c;
            uVar24 = (ulong)(byte)puVar25[1];
            __src = (ulong *)((long)puVar25 + 3);
            puVar14 = __src;
            if (uVar24 == 0xff) {
              do {
                __src = puVar14;
                if (pbVar1 + -6 <= puVar14) goto LAB_008d700c;
                __src = (ulong *)((long)puVar14 + 1);
                uVar20 = *puVar14;
                uVar24 = uVar24 + (byte)uVar20;
                puVar14 = __src;
              } while ((ulong)(byte)uVar20 == 0xff);
              if (uVar24 == 0xffffffffffffffff) goto LAB_008d700c;
            }
            uVar24 = uVar24 + 0x13;
            if (CARRY8((ulong)puVar13,uVar24)) goto LAB_008d700c;
            if (puVar18 <= (ulong *)((long)puVar13 + uVar24)) goto LAB_008d71c4;
LAB_008d6d9c:
            if (puVar16 < param_2) goto LAB_008d700c;
            puVar14 = (ulong *)((long)puVar13 + uVar24);
            if (uVar4 < 0x10) {
              if (uVar4 == 4) {
                uVar8 = (ulong)(uint)*puVar16;
                uVar23 = (ulong)((uint)*puVar16 >> 0x10);
                uVar20 = uVar8 & 0xffff;
              }
              else {
                if (uVar4 == 2) {
                  uVar4 = (ushort)*puVar16;
                  uVar3 = CONCAT22(uVar4,uVar4);
                }
                else {
                  if (uVar4 != 1) {
                    if (uVar4 < 8) {
                      *(uint *)puVar13 = 0;
                      *(short *)puVar13 = (short)*puVar16;
                      *(undefined2 *)((long)puVar13 + 2) = *(undefined2 *)((long)puVar16 + 2);
                      uVar3 = *(uint *)(&DAT_00364e30 + uVar23 * 4);
                      *(uint *)((long)puVar13 + 4) = *(uint *)((long)puVar16 + (ulong)uVar3);
                      puVar21 = (ulong *)((long)((long)puVar16 + (ulong)uVar3) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar23 * 4));
                    }
                    else {
                      puVar21 = puVar16 + 1;
                      *puVar13 = *puVar16;
                    }
                    puVar16 = (ulong *)(uVar24 + (long)puVar13);
                    if ((ulong *)(uVar24 + (long)puVar13) <= puVar13 + 2) {
                      puVar16 = puVar13 + 2;
                    }
                    uVar23 = (long)puVar16 + (-9 - (long)puVar13);
                    puVar16 = puVar13 + 1;
                    puVar7 = puVar21;
                    if (uVar23 < 0x18) {
                    }
                    else if (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar21))) {
                      puVar13 = puVar13 + 3;
                      uVar23 = (uVar23 >> 3) + 1;
                      uVar20 = uVar23 & 0x3ffffffffffffffc;
                      puVar7 = puVar21 + uVar20;
                      puVar16 = puVar16 + uVar20;
                      puVar21 = puVar21 + 2;
                      uVar24 = uVar20;
                      do {
                        puVar9 = puVar21 + -1;
                        uVar8 = puVar21[-2];
                        uVar27 = puVar21[1];
                        uVar26 = *puVar21;
                        uVar24 = uVar24 - 4;
                        puVar21 = puVar21 + 4;
                        puVar13[-1] = *puVar9;
                        puVar13[-2] = uVar8;
                        puVar13[1] = uVar27;
                        *puVar13 = uVar26;
                        puVar13 = puVar13 + 4;
                      } while (uVar24 != 0);
                      if (uVar23 == uVar20) goto LAB_008d6cac;
                    }
                    do {
                      puVar13 = puVar16 + 1;
                      *puVar16 = *puVar7;
                      puVar16 = puVar13;
                      puVar7 = puVar7 + 1;
                    } while (puVar13 < puVar14);
                    goto LAB_008d6cac;
                  }
                  bVar6 = (byte)*puVar16;
                  uVar4 = CONCAT11(bVar6,bVar6);
                  uVar3 = (uint)bVar6 * 0x1010101;
                }
                uVar8 = (ulong)uVar3;
                uVar20 = (ulong)uVar4;
                uVar23 = uVar20;
              }
              uVar23 = uVar20 | uVar23 << 0x10 | uVar8 << 0x20;
              *puVar13 = uVar23;
              if (8 < uVar24) {
                puVar16 = (ulong *)(uVar24 + (long)puVar13);
                if ((ulong *)(uVar24 + (long)puVar13) <= puVar13 + 2) {
                  puVar16 = puVar13 + 2;
                }
                uVar24 = (long)puVar16 + (-9 - (long)puVar13);
                puVar16 = puVar13 + 1;
                if (0x17 < uVar24) {
                  puVar16 = puVar13 + 3;
                  uVar24 = (uVar24 >> 3) + 1;
                  uVar8 = uVar24 & 0x3ffffffffffffffc;
                  uVar20 = uVar8;
                  do {
                    uVar20 = uVar20 - 4;
                    puVar16[-1] = uVar23;
                    puVar16[-2] = uVar23;
                    puVar16[1] = uVar23;
                    *puVar16 = uVar23;
                    puVar16 = puVar16 + 4;
                  } while (uVar20 != 0);
                  puVar16 = puVar13 + 1 + uVar8;
                  if (uVar24 == uVar8) goto LAB_008d6cac;
                }
                do {
                  puVar13 = puVar16 + 1;
                  *puVar16 = uVar23;
                  puVar16 = puVar13;
                } while (puVar13 < puVar14);
              }
            }
            else if (uVar4 < 0x40) {
              puVar16 = (ulong *)((long)puVar13 + -uVar23 + 0x10);
              do {
                uVar23 = puVar16[-2];
                puVar13[1] = puVar16[-1];
                *puVar13 = uVar23;
                uVar23 = *puVar16;
                puVar13[3] = puVar16[1];
                puVar13[2] = uVar23;
                puVar13 = puVar13 + 4;
                puVar16 = puVar16 + 4;
              } while (puVar13 < puVar14);
            }
            else {
              do {
                puVar16 = (ulong *)((long)puVar13 + -uVar23);
                uVar8 = puVar16[4];
                uVar20 = puVar16[7];
                uVar24 = puVar16[6];
                uVar27 = puVar16[1];
                uVar26 = *puVar16;
                uVar29 = puVar16[3];
                uVar28 = puVar16[2];
                puVar13[5] = puVar16[5];
                puVar13[4] = uVar8;
                puVar13[7] = uVar20;
                puVar13[6] = uVar24;
                puVar16 = puVar13 + 8;
                puVar13[1] = uVar27;
                *puVar13 = uVar26;
                puVar13[3] = uVar29;
                puVar13[2] = uVar28;
                puVar13 = puVar16;
              } while (puVar16 < puVar14);
            }
          }
          else {
            uVar24 = (uVar24 & 0xf) + 4;
            puVar14 = (ulong *)((long)puVar13 + uVar24);
            if (puVar18 <= puVar14) goto LAB_008d71c4;
            if ((puVar16 < param_2) || (uVar4 < 8)) goto LAB_008d6d9c;
            *puVar13 = *puVar16;
            puVar13[1] = puVar16[1];
            *(short *)(puVar13 + 2) = (short)puVar16[2];
          }
LAB_008d6cac:
          puVar16 = (ulong *)((long)__src + 1);
          uVar24 = (ulong)(byte)*__src;
          uVar23 = (ulong)(byte)((byte)*__src >> 4);
          puVar13 = __src;
          __src = puVar16;
        } while (puVar16 <= pbVar1 + -0x11);
      }
      __src = puVar16;
      if (uVar23 == 0xf) goto LAB_008d7094;
LAB_008d70c8:
      puVar13 = (ulong *)((long)puVar14 + uVar23);
LAB_008d70cc:
      if ((puVar13 <= (ulong *)((long)puVar2 + -0xc)) &&
         (puVar25 = (ushort *)((long)__src + uVar23), puVar25 <= pbVar1 + -8)) {
        puVar16 = puVar13;
        if (puVar13 <= puVar14 + 1) {
          puVar16 = puVar14 + 1;
        }
        if ((0x17 < (long)puVar16 + ~(ulong)puVar14) &&
           (0x1f < (ulong)((long)puVar14 - (long)__src))) {
          puVar18 = puVar14 + 2;
          uVar23 = ((long)puVar16 + ~(ulong)puVar14 >> 3) + 1;
          uVar8 = uVar23 & 0x3ffffffffffffffc;
          puVar16 = __src + 2;
          uVar20 = uVar8;
          do {
            puVar21 = puVar16 + -1;
            uVar26 = puVar16[-2];
            uVar28 = puVar16[1];
            uVar27 = *puVar16;
            uVar20 = uVar20 - 4;
            puVar16 = puVar16 + 4;
            puVar18[-1] = *puVar21;
            puVar18[-2] = uVar26;
            puVar18[1] = uVar28;
            *puVar18 = uVar27;
            puVar18 = puVar18 + 4;
          } while (uVar20 != 0);
          __src = __src + uVar8;
          puVar14 = puVar14 + uVar8;
          if (uVar23 == uVar8) goto LAB_008d7170;
        }
        do {
          puVar16 = puVar14 + 1;
          *puVar14 = *__src;
          __src = __src + 1;
          puVar14 = puVar16;
        } while (puVar16 < puVar13);
LAB_008d7170:
        __src = (ulong *)(puVar25 + 1);
        uVar23 = (ulong)*puVar25;
        uVar24 = uVar24 & 0xf;
        puVar16 = (ulong *)((long)puVar13 - uVar23);
        do {
          if (uVar24 == 0xf) {
            if (pbVar1 + -6 <= __src) goto LAB_008d700c;
            uVar20 = (ulong)(byte)*__src;
            uVar24 = uVar20;
            while (__src = (ulong *)((long)__src + 1), uVar24 == 0xff) {
              if (pbVar1 + -6 <= __src) goto LAB_008d700c;
              uVar24 = (ulong)*(byte *)__src;
              uVar20 = uVar20 + uVar24;
            }
            uVar24 = uVar20 + 0xf;
            if ((uVar20 == 0xffffffffffffffff) || (CARRY8((ulong)puVar13,uVar24)))
            goto LAB_008d700c;
          }
          uVar24 = uVar24 + 4;
LAB_008d71c4:
          if (puVar16 < param_2) goto LAB_008d700c;
          puVar14 = (ulong *)((long)puVar13 + uVar24);
          if (uVar23 < 8) {
            *(uint *)puVar13 = 0;
            *(char *)puVar13 = (char)*puVar16;
            *(undefined1 *)((long)puVar13 + 1) = *(undefined1 *)((long)puVar16 + 1);
            *(undefined1 *)((long)puVar13 + 2) = *(undefined1 *)((long)puVar16 + 2);
            *(undefined1 *)((long)puVar13 + 3) = *(undefined1 *)((long)puVar16 + 3);
            uVar3 = *(uint *)(&DAT_00364e30 + uVar23 * 4);
            *(uint *)((long)puVar13 + 4) = *(uint *)((long)puVar16 + (ulong)uVar3);
            puVar18 = (ulong *)((long)((long)puVar16 + (ulong)uVar3) -
                               (long)*(int *)(&DAT_00364dd0 + uVar23 * 4));
          }
          else {
            puVar18 = puVar16 + 1;
            *puVar13 = *puVar16;
          }
          puVar16 = puVar13 + 1;
          if ((ulong *)((long)puVar2 + -0xc) < puVar14) {
            if ((ulong *)((long)puVar2 + -5) < puVar14) goto LAB_008d700c;
            puVar21 = (ulong *)((long)puVar2 + -7);
            if (puVar16 < puVar21) {
              puVar7 = (ulong *)((long)param_2 + (uVar15 - 7));
              if (puVar7 <= puVar13 + 2) {
                puVar7 = puVar13 + 2;
              }
              uVar23 = (long)puVar7 + (-9 - (long)puVar13);
              puVar7 = puVar18;
              if (uVar23 < 0x28) {
                puVar9 = puVar16;
LAB_008d7430:
                do {
                  puVar10 = puVar9 + 1;
                  *puVar9 = *puVar7;
                  puVar7 = puVar7 + 1;
                  puVar9 = puVar10;
                } while (puVar10 < puVar21);
              }
              else {
                puVar9 = puVar16;
                if ((ulong)((long)puVar13 + (8 - (long)puVar18)) < 0x20) goto LAB_008d7430;
                puVar10 = puVar13 + 3;
                puVar11 = puVar18 + 2;
                uVar23 = (uVar23 >> 3) + 1;
                uVar8 = uVar23 & 0x3ffffffffffffffc;
                puVar7 = puVar18 + uVar8;
                puVar9 = puVar16 + uVar8;
                uVar20 = uVar8;
                do {
                  puVar5 = puVar11 + -1;
                  uVar26 = puVar11[-2];
                  uVar28 = puVar11[1];
                  uVar27 = *puVar11;
                  uVar20 = uVar20 - 4;
                  puVar11 = puVar11 + 4;
                  puVar10[-1] = *puVar5;
                  puVar10[-2] = uVar26;
                  puVar10[1] = uVar28;
                  *puVar10 = uVar27;
                  puVar10 = puVar10 + 4;
                } while (uVar20 != 0);
                if (uVar23 != uVar8) goto LAB_008d7430;
              }
              puVar7 = (ulong *)((long)puVar18 + ((long)puVar21 - (long)puVar16));
              puVar16 = puVar21;
            }
            else {
              puVar7 = puVar18;
            }
            if (puVar16 < puVar14) {
              puVar21 = (ulong *)((long)param_2 + (uVar15 - 7));
              if (puVar21 <= puVar13 + 1) {
                puVar21 = puVar13 + 1;
              }
              uVar23 = (long)puVar13 + (uVar24 - (long)puVar21);
              if ((uVar23 < 8) || ((ulong)((long)puVar13 + (8 - (long)puVar18)) < 0x20)) {
                puVar9 = puVar16;
                puVar10 = puVar7;
              }
              else {
                uVar24 = 0;
                if (0x1f < uVar23) {
                  uVar24 = uVar23 & 0xffffffffffffffe0;
                  puVar9 = puVar16 + 2;
                  puVar10 = (ulong *)((long)puVar18 + (long)puVar21 + (8 - (long)puVar13));
                  uVar20 = uVar24;
                  do {
                    puVar11 = puVar10 + -1;
                    uVar8 = puVar10[-2];
                    uVar27 = puVar10[1];
                    uVar26 = *puVar10;
                    uVar20 = uVar20 - 0x20;
                    puVar10 = puVar10 + 4;
                    puVar9[-1] = *puVar11;
                    puVar9[-2] = uVar8;
                    puVar9[1] = uVar27;
                    *puVar9 = uVar26;
                    puVar9 = puVar9 + 4;
                  } while (uVar20 != 0);
                  if (uVar23 == uVar24) goto LAB_008d724c;
                  puVar9 = (ulong *)((long)puVar16 + uVar24);
                  puVar10 = (ulong *)((long)puVar7 + uVar24);
                  if ((uVar23 & 0x18) == 0) goto LAB_008d748c;
                }
                uVar20 = uVar23 & 0xfffffffffffffff8;
                puVar9 = (ulong *)((long)puVar16 + uVar20);
                puVar10 = (ulong *)((long)puVar7 + uVar20);
                lVar22 = uVar24 - uVar20;
                puVar17 = (undefined8 *)
                          ((long)puVar18 + (long)puVar21 + (uVar24 - (long)puVar13) + -8);
                puVar19 = (undefined8 *)((long)puVar16 + uVar24);
                do {
                  lVar22 = lVar22 + 8;
                  *puVar19 = *puVar17;
                  puVar17 = puVar17 + 1;
                  puVar19 = puVar19 + 1;
                } while (lVar22 != 0);
                if (uVar23 == uVar20) goto LAB_008d724c;
              }
LAB_008d748c:
              do {
                puVar16 = (ulong *)((long)puVar9 + 1);
                *(char *)puVar9 = (char)*puVar10;
                puVar9 = puVar16;
                puVar10 = (ulong *)((long)puVar10 + 1);
              } while (puVar16 < puVar14);
            }
          }
          else {
            *puVar16 = *puVar18;
            if (0x10 < uVar24) {
              puVar16 = (ulong *)(uVar24 + (long)puVar13);
              if ((ulong *)(uVar24 + (long)puVar13) <= puVar13 + 3) {
                puVar16 = puVar13 + 3;
              }
              uVar23 = (long)puVar16 + (-0x11 - (long)puVar13);
              puVar16 = puVar13 + 2;
              if ((0x27 < uVar23) && (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar18)))) {
                uVar23 = (uVar23 >> 3) + 1;
                uVar20 = uVar23 & 0x3ffffffffffffffc;
                puVar16 = puVar16 + uVar20;
                puVar21 = puVar18 + 3;
                uVar24 = uVar20;
                do {
                  puVar7 = puVar21 + -1;
                  uVar8 = puVar21[-2];
                  uVar27 = puVar21[1];
                  uVar26 = *puVar21;
                  uVar24 = uVar24 - 4;
                  puVar21 = puVar21 + 4;
                  puVar13[3] = *puVar7;
                  puVar13[2] = uVar8;
                  puVar13[5] = uVar27;
                  puVar13[4] = uVar26;
                  puVar13 = puVar13 + 4;
                } while (uVar24 != 0);
                puVar18 = puVar18 + uVar20;
                if (uVar23 == uVar20) goto LAB_008d724c;
              }
              do {
                puVar13 = puVar16 + 1;
                *puVar16 = puVar18[1];
                puVar16 = puVar13;
                puVar18 = puVar18 + 1;
              } while (puVar13 < puVar14);
            }
          }
LAB_008d724c:
          puVar16 = (ulong *)((long)__src + 1);
          bVar6 = (byte)*__src;
          while( true ) {
            uVar23 = (ulong)(bVar6 >> 4);
            uVar24 = (ulong)bVar6;
            if (uVar23 == 0xf) goto LAB_008d7094;
            __src = puVar16;
            if ((pbVar1 + -0x10 <= puVar16) || (puVar2 + -4 < puVar14)) goto LAB_008d70c8;
            uVar20 = *puVar16;
            puVar25 = (ushort *)((long)puVar16 + uVar23);
            uVar24 = uVar24 & 0xf;
            puVar13 = (ulong *)((long)puVar14 + uVar23);
            puVar14[1] = puVar16[1];
            *puVar14 = uVar20;
            __src = (ulong *)(puVar25 + 1);
            uVar23 = (ulong)*puVar25;
            puVar16 = (ulong *)((long)puVar13 - uVar23);
            if ((uVar24 == 0xf) || ((*puVar25 < 8 || (puVar16 < param_2)))) break;
            *puVar13 = *puVar16;
            puVar13[1] = puVar16[1];
            *(short *)(puVar13 + 2) = (short)puVar16[2];
            bVar6 = (byte)puVar25[1];
            puVar14 = (ulong *)((long)puVar13 + uVar24 + 4);
            puVar16 = (ulong *)((long)puVar25 + 3);
          }
        } while( true );
      }
      if (((byte *)((long)__src + uVar23) == pbVar1) && (puVar13 <= puVar2)) {
        memmove(puVar14,__src,uVar23);
        return ((int)puVar14 + (int)uVar23) - (int)param_2;
      }
LAB_008d700c:
      iVar12 = ~(uint)__src + (int)param_1;
    }
  }
  return iVar12;
LAB_008d7094:
  __src = puVar16;
  if (pbVar1 + -0xf <= puVar16) goto LAB_008d700c;
  __src = (ulong *)((long)puVar16 + 1);
  uVar23 = (ulong)(byte)*puVar16;
  puVar16 = __src;
  if (uVar23 == 0xff) {
    do {
      __src = puVar16;
      if (pbVar1 + -0xf <= puVar16) goto LAB_008d700c;
      __src = (ulong *)((long)puVar16 + 1);
      uVar20 = *puVar16;
      uVar23 = uVar23 + (byte)uVar20;
      puVar16 = __src;
    } while ((ulong)(byte)uVar20 == 0xff);
    if (uVar23 == 0xffffffffffffffff) goto LAB_008d700c;
  }
  uVar23 = uVar23 + 0xf;
  if (CARRY8((ulong)puVar14,uVar23)) goto LAB_008d700c;
  if (CARRY8((ulong)__src,uVar23)) goto LAB_008d700c;
  goto LAB_008d70c8;
}

