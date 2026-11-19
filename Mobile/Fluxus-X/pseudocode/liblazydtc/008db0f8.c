/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008db0f8
 */

int FUN_008db0f8(ulong *param_1,ulong *param_2,int param_3,uint param_4,long param_5)

{
  byte *pbVar1;
  ulong *puVar2;
  uint uVar3;
  ushort uVar4;
  ulong *puVar5;
  byte bVar6;
  ulong *puVar7;
  ulong *puVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong *puVar11;
  int iVar12;
  ulong *puVar13;
  ulong *__src;
  ulong *puVar14;
  ulong uVar15;
  ulong *puVar16;
  undefined8 *puVar17;
  ulong *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  ulong *puVar21;
  long lVar22;
  ulong uVar23;
  ulong *puVar24;
  ulong uVar25;
  ushort *puVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  
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
      puVar14 = (ulong *)((long)param_2 - param_5);
      puVar2 = (ulong *)((long)param_2 + uVar15);
      __src = param_1;
      puVar7 = param_2;
      if (param_4 < 0x40) goto LAB_008db760;
      puVar16 = (ulong *)((long)param_1 + 1);
      uVar25 = (ulong)(byte)*param_1;
      uVar23 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar18 = puVar2 + -8;
        puVar13 = param_1;
        __src = puVar16;
        do {
          if (uVar23 == 0xf) {
            if (pbVar1 + -0xf <= __src) goto LAB_008db520;
            uVar23 = (ulong)(byte)*__src;
            __src = (ulong *)((long)puVar13 + 2);
            puVar16 = __src;
            if (uVar23 == 0xff) {
              do {
                __src = puVar16;
                if (pbVar1 + -0xf <= puVar16) goto LAB_008db520;
                __src = (ulong *)((long)puVar16 + 1);
                uVar20 = *puVar16;
                uVar23 = uVar23 + (byte)uVar20;
                puVar16 = __src;
              } while ((ulong)(byte)uVar20 == 0xff);
              if (uVar23 == 0xffffffffffffffff) goto LAB_008db520;
            }
            uVar23 = uVar23 + 0xf;
            if (CARRY8((ulong)__src,uVar23)) goto LAB_008db520;
            puVar13 = (ulong *)((long)puVar7 + uVar23);
            if (puVar18 < puVar13) goto LAB_008db5e0;
            puVar26 = (ushort *)((long)__src + uVar23);
            if (pbVar1 + -0x40 < puVar26) goto LAB_008db5e0;
            do {
              uVar9 = __src[4];
              uVar20 = __src[7];
              uVar23 = __src[6];
              uVar28 = __src[1];
              uVar27 = *__src;
              uVar30 = __src[3];
              uVar29 = __src[2];
              puVar7[5] = __src[5];
              puVar7[4] = uVar9;
              puVar7[7] = uVar20;
              puVar7[6] = uVar23;
              puVar16 = puVar7 + 8;
              puVar7[1] = uVar28;
              *puVar7 = uVar27;
              puVar7[3] = uVar30;
              puVar7[2] = uVar29;
              __src = __src + 8;
              puVar7 = puVar16;
            } while (puVar16 < puVar13);
          }
          else {
            uVar20 = *__src;
            puVar26 = (ushort *)((long)__src + uVar23);
            puVar13 = (ulong *)((long)puVar7 + uVar23);
            puVar7[1] = __src[1];
            *puVar7 = uVar20;
          }
          __src = (ulong *)(puVar26 + 1);
          uVar4 = *puVar26;
          uVar23 = (ulong)uVar4;
          puVar16 = (ulong *)((long)puVar13 - uVar23);
          if ((uVar25 & 0xf) == 0xf) {
            if (pbVar1 + -6 <= __src) goto LAB_008db520;
            uVar25 = (ulong)(byte)puVar26[1];
            __src = (ulong *)((long)puVar26 + 3);
            puVar7 = __src;
            if (uVar25 == 0xff) {
              do {
                __src = puVar7;
                if (pbVar1 + -6 <= puVar7) goto LAB_008db520;
                __src = (ulong *)((long)puVar7 + 1);
                uVar20 = *puVar7;
                uVar25 = uVar25 + (byte)uVar20;
                puVar7 = __src;
              } while ((ulong)(byte)uVar20 == 0xff);
              if (uVar25 == 0xffffffffffffffff) goto LAB_008db520;
            }
            uVar25 = uVar25 + 0x13;
            if (CARRY8((ulong)puVar13,uVar25)) goto LAB_008db520;
            if (puVar18 <= (ulong *)((long)puVar13 + uVar25)) goto LAB_008db6d8;
LAB_008db2b0:
            if (puVar16 < puVar14) goto LAB_008db520;
            puVar7 = (ulong *)((long)puVar13 + uVar25);
            if (uVar4 < 0x10) {
              if (uVar4 == 4) {
                uVar9 = (ulong)(uint)*puVar16;
                uVar23 = (ulong)((uint)*puVar16 >> 0x10);
                uVar20 = uVar9 & 0xffff;
              }
              else {
                if (uVar4 == 2) {
                  uVar4 = (ushort)*puVar16;
                  uVar3 = CONCAT22(uVar4,uVar4);
                }
                else {
                  if (uVar4 != 1) {
                    if (uVar4 < 8) {
                      *(undefined4 *)puVar13 = 0;
                      *(short *)puVar13 = (short)*puVar16;
                      *(undefined2 *)((long)puVar13 + 2) = *(undefined2 *)((long)puVar16 + 2);
                      uVar3 = *(uint *)(&DAT_00364e30 + uVar23 * 4);
                      *(undefined4 *)((long)puVar13 + 4) =
                           *(undefined4 *)((long)puVar16 + (ulong)uVar3);
                      puVar21 = (ulong *)((long)((long)puVar16 + (ulong)uVar3) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar23 * 4));
                    }
                    else {
                      puVar21 = puVar16 + 1;
                      *puVar13 = *puVar16;
                    }
                    puVar16 = (ulong *)(uVar25 + (long)puVar13);
                    if ((ulong *)(uVar25 + (long)puVar13) <= puVar13 + 2) {
                      puVar16 = puVar13 + 2;
                    }
                    uVar23 = (long)puVar16 + (-9 - (long)puVar13);
                    puVar16 = puVar13 + 1;
                    puVar8 = puVar21;
                    if (uVar23 < 0x18) {
                    }
                    else if (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar21))) {
                      puVar13 = puVar13 + 3;
                      uVar23 = (uVar23 >> 3) + 1;
                      uVar20 = uVar23 & 0x3ffffffffffffffc;
                      puVar8 = puVar21 + uVar20;
                      puVar16 = puVar16 + uVar20;
                      puVar21 = puVar21 + 2;
                      uVar25 = uVar20;
                      do {
                        puVar10 = puVar21 + -1;
                        uVar9 = puVar21[-2];
                        uVar28 = puVar21[1];
                        uVar27 = *puVar21;
                        uVar25 = uVar25 - 4;
                        puVar21 = puVar21 + 4;
                        puVar13[-1] = *puVar10;
                        puVar13[-2] = uVar9;
                        puVar13[1] = uVar28;
                        *puVar13 = uVar27;
                        puVar13 = puVar13 + 4;
                      } while (uVar25 != 0);
                      if (uVar23 == uVar20) goto LAB_008db1c0;
                    }
                    do {
                      puVar13 = puVar16 + 1;
                      *puVar16 = *puVar8;
                      puVar16 = puVar13;
                      puVar8 = puVar8 + 1;
                    } while (puVar13 < puVar7);
                    goto LAB_008db1c0;
                  }
                  bVar6 = (byte)*puVar16;
                  uVar4 = CONCAT11(bVar6,bVar6);
                  uVar3 = (uint)bVar6 * 0x1010101;
                }
                uVar9 = (ulong)uVar3;
                uVar20 = (ulong)uVar4;
                uVar23 = uVar20;
              }
              uVar23 = uVar20 | uVar23 << 0x10 | uVar9 << 0x20;
              *puVar13 = uVar23;
              if (8 < uVar25) {
                puVar16 = (ulong *)(uVar25 + (long)puVar13);
                if ((ulong *)(uVar25 + (long)puVar13) <= puVar13 + 2) {
                  puVar16 = puVar13 + 2;
                }
                uVar25 = (long)puVar16 + (-9 - (long)puVar13);
                puVar16 = puVar13 + 1;
                if (0x17 < uVar25) {
                  puVar16 = puVar13 + 3;
                  uVar25 = (uVar25 >> 3) + 1;
                  uVar9 = uVar25 & 0x3ffffffffffffffc;
                  uVar20 = uVar9;
                  do {
                    uVar20 = uVar20 - 4;
                    puVar16[-1] = uVar23;
                    puVar16[-2] = uVar23;
                    puVar16[1] = uVar23;
                    *puVar16 = uVar23;
                    puVar16 = puVar16 + 4;
                  } while (uVar20 != 0);
                  puVar16 = puVar13 + 1 + uVar9;
                  if (uVar25 == uVar9) goto LAB_008db1c0;
                }
                do {
                  puVar13 = puVar16 + 1;
                  *puVar16 = uVar23;
                  puVar16 = puVar13;
                } while (puVar13 < puVar7);
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
              } while (puVar13 < puVar7);
            }
            else {
              do {
                puVar16 = (ulong *)((long)puVar13 + -uVar23);
                uVar9 = puVar16[4];
                uVar20 = puVar16[7];
                uVar25 = puVar16[6];
                uVar28 = puVar16[1];
                uVar27 = *puVar16;
                uVar30 = puVar16[3];
                uVar29 = puVar16[2];
                puVar13[5] = puVar16[5];
                puVar13[4] = uVar9;
                puVar13[7] = uVar20;
                puVar13[6] = uVar25;
                puVar16 = puVar13 + 8;
                puVar13[1] = uVar28;
                *puVar13 = uVar27;
                puVar13[3] = uVar30;
                puVar13[2] = uVar29;
                puVar13 = puVar16;
              } while (puVar16 < puVar7);
            }
          }
          else {
            uVar25 = (uVar25 & 0xf) + 4;
            puVar7 = (ulong *)((long)puVar13 + uVar25);
            if (puVar18 <= puVar7) goto LAB_008db6d8;
            if ((puVar16 < puVar14) || (uVar4 < 8)) goto LAB_008db2b0;
            *puVar13 = *puVar16;
            puVar13[1] = puVar16[1];
            *(short *)(puVar13 + 2) = (short)puVar16[2];
          }
LAB_008db1c0:
          puVar16 = (ulong *)((long)__src + 1);
          uVar25 = (ulong)(byte)*__src;
          uVar23 = (ulong)(byte)((byte)*__src >> 4);
          puVar13 = __src;
          __src = puVar16;
        } while (puVar16 <= pbVar1 + -0x11);
      }
      __src = puVar16;
      if (uVar23 == 0xf) goto LAB_008db5a8;
LAB_008db5dc:
      puVar13 = (ulong *)((long)puVar7 + uVar23);
LAB_008db5e0:
      if ((puVar13 <= (ulong *)((long)puVar2 + -0xc)) &&
         (puVar26 = (ushort *)((long)__src + uVar23), puVar26 <= pbVar1 + -8)) {
        puVar16 = puVar13;
        if (puVar13 <= puVar7 + 1) {
          puVar16 = puVar7 + 1;
        }
        if ((0x17 < (long)puVar16 + ~(ulong)puVar7) && (0x1f < (ulong)((long)puVar7 - (long)__src)))
        {
          puVar18 = puVar7 + 2;
          uVar23 = ((long)puVar16 + ~(ulong)puVar7 >> 3) + 1;
          uVar9 = uVar23 & 0x3ffffffffffffffc;
          puVar16 = __src + 2;
          uVar20 = uVar9;
          do {
            puVar21 = puVar16 + -1;
            uVar27 = puVar16[-2];
            uVar29 = puVar16[1];
            uVar28 = *puVar16;
            uVar20 = uVar20 - 4;
            puVar16 = puVar16 + 4;
            puVar18[-1] = *puVar21;
            puVar18[-2] = uVar27;
            puVar18[1] = uVar29;
            *puVar18 = uVar28;
            puVar18 = puVar18 + 4;
          } while (uVar20 != 0);
          puVar7 = puVar7 + uVar9;
          __src = __src + uVar9;
          if (uVar23 == uVar9) goto LAB_008db684;
        }
        do {
          puVar16 = puVar7 + 1;
          *puVar7 = *__src;
          puVar7 = puVar16;
          __src = __src + 1;
        } while (puVar16 < puVar13);
LAB_008db684:
        __src = (ulong *)(puVar26 + 1);
        uVar23 = (ulong)*puVar26;
        uVar25 = uVar25 & 0xf;
        puVar16 = (ulong *)((long)puVar13 - uVar23);
        do {
          if (uVar25 == 0xf) {
            if (pbVar1 + -6 <= __src) goto LAB_008db520;
            uVar20 = (ulong)(byte)*__src;
            uVar25 = uVar20;
            while (__src = (ulong *)((long)__src + 1), uVar25 == 0xff) {
              if (pbVar1 + -6 <= __src) goto LAB_008db520;
              uVar25 = (ulong)*(byte *)__src;
              uVar20 = uVar20 + uVar25;
            }
            uVar25 = uVar20 + 0xf;
            if ((uVar20 == 0xffffffffffffffff) || (CARRY8((ulong)puVar13,uVar25)))
            goto LAB_008db520;
          }
          uVar25 = uVar25 + 4;
LAB_008db6d8:
          if (puVar16 < puVar14) goto LAB_008db520;
          puVar7 = (ulong *)((long)puVar13 + uVar25);
          if (uVar23 < 8) {
            *(undefined4 *)puVar13 = 0;
            *(char *)puVar13 = (char)*puVar16;
            *(undefined1 *)((long)puVar13 + 1) = *(undefined1 *)((long)puVar16 + 1);
            *(undefined1 *)((long)puVar13 + 2) = *(undefined1 *)((long)puVar16 + 2);
            *(undefined1 *)((long)puVar13 + 3) = *(undefined1 *)((long)puVar16 + 3);
            uVar3 = *(uint *)(&DAT_00364e30 + uVar23 * 4);
            *(undefined4 *)((long)puVar13 + 4) = *(undefined4 *)((long)puVar16 + (ulong)uVar3);
            puVar18 = (ulong *)((long)((long)puVar16 + (ulong)uVar3) -
                               (long)*(int *)(&DAT_00364dd0 + uVar23 * 4));
          }
          else {
            puVar18 = puVar16 + 1;
            *puVar13 = *puVar16;
          }
          puVar16 = puVar13 + 1;
          if ((ulong *)((long)puVar2 + -0xc) < puVar7) {
            if ((ulong *)((long)puVar2 + -5) < puVar7) goto LAB_008db520;
            puVar21 = (ulong *)((long)puVar2 + -7);
            if (puVar16 < puVar21) {
              puVar8 = (ulong *)((long)param_2 + (uVar15 - 7));
              if (puVar8 <= puVar13 + 2) {
                puVar8 = puVar13 + 2;
              }
              uVar23 = (long)puVar8 + (-9 - (long)puVar13);
              puVar8 = puVar18;
              if (uVar23 < 0x28) {
                puVar10 = puVar16;
LAB_008db948:
                do {
                  puVar11 = puVar10 + 1;
                  *puVar10 = *puVar8;
                  puVar8 = puVar8 + 1;
                  puVar10 = puVar11;
                } while (puVar11 < puVar21);
              }
              else {
                puVar10 = puVar16;
                if ((ulong)((long)puVar13 + (8 - (long)puVar18)) < 0x20) goto LAB_008db948;
                puVar11 = puVar13 + 3;
                puVar24 = puVar18 + 2;
                uVar23 = (uVar23 >> 3) + 1;
                uVar9 = uVar23 & 0x3ffffffffffffffc;
                puVar8 = puVar18 + uVar9;
                puVar10 = puVar16 + uVar9;
                uVar20 = uVar9;
                do {
                  puVar5 = puVar24 + -1;
                  uVar27 = puVar24[-2];
                  uVar29 = puVar24[1];
                  uVar28 = *puVar24;
                  uVar20 = uVar20 - 4;
                  puVar24 = puVar24 + 4;
                  puVar11[-1] = *puVar5;
                  puVar11[-2] = uVar27;
                  puVar11[1] = uVar29;
                  *puVar11 = uVar28;
                  puVar11 = puVar11 + 4;
                } while (uVar20 != 0);
                if (uVar23 != uVar9) goto LAB_008db948;
              }
              puVar8 = (ulong *)((long)puVar18 + ((long)puVar21 - (long)puVar16));
              puVar16 = puVar21;
            }
            else {
              puVar8 = puVar18;
            }
            if (puVar16 < puVar7) {
              puVar21 = (ulong *)((long)param_2 + (uVar15 - 7));
              if (puVar21 <= puVar13 + 1) {
                puVar21 = puVar13 + 1;
              }
              uVar23 = (long)puVar13 + (uVar25 - (long)puVar21);
              if ((uVar23 < 8) || ((ulong)((long)puVar13 + (8 - (long)puVar18)) < 0x20)) {
                puVar10 = puVar16;
                puVar11 = puVar8;
              }
              else {
                uVar25 = 0;
                if (0x1f < uVar23) {
                  uVar25 = uVar23 & 0xffffffffffffffe0;
                  puVar10 = puVar16 + 2;
                  puVar11 = (ulong *)((long)puVar18 + (long)puVar21 + (8 - (long)puVar13));
                  uVar20 = uVar25;
                  do {
                    puVar24 = puVar11 + -1;
                    uVar9 = puVar11[-2];
                    uVar28 = puVar11[1];
                    uVar27 = *puVar11;
                    uVar20 = uVar20 - 0x20;
                    puVar11 = puVar11 + 4;
                    puVar10[-1] = *puVar24;
                    puVar10[-2] = uVar9;
                    puVar10[1] = uVar28;
                    *puVar10 = uVar27;
                    puVar10 = puVar10 + 4;
                  } while (uVar20 != 0);
                  if (uVar23 == uVar25) goto LAB_008db760;
                  puVar10 = (ulong *)((long)puVar16 + uVar25);
                  puVar11 = (ulong *)((long)puVar8 + uVar25);
                  if ((uVar23 & 0x18) == 0) goto LAB_008db9a4;
                }
                uVar20 = uVar23 & 0xfffffffffffffff8;
                puVar10 = (ulong *)((long)puVar16 + uVar20);
                puVar11 = (ulong *)((long)puVar8 + uVar20);
                lVar22 = uVar25 - uVar20;
                puVar17 = (undefined8 *)
                          ((long)puVar18 + (long)puVar21 + (uVar25 - (long)puVar13) + -8);
                puVar19 = (undefined8 *)((long)puVar16 + uVar25);
                do {
                  lVar22 = lVar22 + 8;
                  *puVar19 = *puVar17;
                  puVar17 = puVar17 + 1;
                  puVar19 = puVar19 + 1;
                } while (lVar22 != 0);
                if (uVar23 == uVar20) goto LAB_008db760;
              }
LAB_008db9a4:
              do {
                puVar16 = (ulong *)((long)puVar10 + 1);
                *(char *)puVar10 = (char)*puVar11;
                puVar10 = puVar16;
                puVar11 = (ulong *)((long)puVar11 + 1);
              } while (puVar16 < puVar7);
            }
          }
          else {
            *puVar16 = *puVar18;
            if (0x10 < uVar25) {
              puVar16 = (ulong *)(uVar25 + (long)puVar13);
              if ((ulong *)(uVar25 + (long)puVar13) <= puVar13 + 3) {
                puVar16 = puVar13 + 3;
              }
              uVar23 = (long)puVar16 + (-0x11 - (long)puVar13);
              puVar16 = puVar13 + 2;
              if ((0x27 < uVar23) && (0x1f < (ulong)((long)puVar13 + (8 - (long)puVar18)))) {
                uVar23 = (uVar23 >> 3) + 1;
                uVar20 = uVar23 & 0x3ffffffffffffffc;
                puVar16 = puVar16 + uVar20;
                puVar21 = puVar18 + 3;
                uVar25 = uVar20;
                do {
                  puVar8 = puVar21 + -1;
                  uVar9 = puVar21[-2];
                  uVar28 = puVar21[1];
                  uVar27 = *puVar21;
                  uVar25 = uVar25 - 4;
                  puVar21 = puVar21 + 4;
                  puVar13[3] = *puVar8;
                  puVar13[2] = uVar9;
                  puVar13[5] = uVar28;
                  puVar13[4] = uVar27;
                  puVar13 = puVar13 + 4;
                } while (uVar25 != 0);
                puVar18 = puVar18 + uVar20;
                if (uVar23 == uVar20) goto LAB_008db760;
              }
              do {
                puVar13 = puVar16 + 1;
                *puVar16 = puVar18[1];
                puVar16 = puVar13;
                puVar18 = puVar18 + 1;
              } while (puVar13 < puVar7);
            }
          }
LAB_008db760:
          puVar16 = (ulong *)((long)__src + 1);
          bVar6 = (byte)*__src;
          while( true ) {
            uVar23 = (ulong)(bVar6 >> 4);
            uVar25 = (ulong)bVar6;
            if (uVar23 == 0xf) goto LAB_008db5a8;
            __src = puVar16;
            if ((pbVar1 + -0x10 <= puVar16) || (puVar2 + -4 < puVar7)) goto LAB_008db5dc;
            uVar20 = *puVar16;
            puVar26 = (ushort *)((long)puVar16 + uVar23);
            uVar25 = uVar25 & 0xf;
            puVar13 = (ulong *)((long)puVar7 + uVar23);
            puVar7[1] = puVar16[1];
            *puVar7 = uVar20;
            __src = (ulong *)(puVar26 + 1);
            uVar23 = (ulong)*puVar26;
            puVar16 = (ulong *)((long)puVar13 - uVar23);
            if ((uVar25 == 0xf) || ((*puVar26 < 8 || (puVar16 < puVar14)))) break;
            *puVar13 = *puVar16;
            puVar13[1] = puVar16[1];
            *(short *)(puVar13 + 2) = (short)puVar16[2];
            bVar6 = (byte)puVar26[1];
            puVar7 = (ulong *)((long)puVar13 + uVar25 + 4);
            puVar16 = (ulong *)((long)puVar26 + 3);
          }
        } while( true );
      }
      if (((byte *)((long)__src + uVar23) == pbVar1) && (puVar13 <= puVar2)) {
        memmove(puVar7,__src,uVar23);
        return ((int)puVar7 + (int)uVar23) - (int)param_2;
      }
LAB_008db520:
      iVar12 = ~(uint)__src + (int)param_1;
    }
  }
  return iVar12;
LAB_008db5a8:
  __src = puVar16;
  if (pbVar1 + -0xf <= puVar16) goto LAB_008db520;
  __src = (ulong *)((long)puVar16 + 1);
  uVar23 = (ulong)(byte)*puVar16;
  puVar16 = __src;
  if (uVar23 == 0xff) {
    do {
      __src = puVar16;
      if (pbVar1 + -0xf <= puVar16) goto LAB_008db520;
      __src = (ulong *)((long)puVar16 + 1);
      uVar20 = *puVar16;
      uVar23 = uVar23 + (byte)uVar20;
      puVar16 = __src;
    } while ((ulong)(byte)uVar20 == 0xff);
    if (uVar23 == 0xffffffffffffffff) goto LAB_008db520;
  }
  uVar23 = uVar23 + 0xf;
  if (CARRY8((ulong)puVar7,uVar23)) goto LAB_008db520;
  if (CARRY8((ulong)__src,uVar23)) goto LAB_008db520;
  goto LAB_008db5dc;
}

