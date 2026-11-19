/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d7fc4
 */

int LZ4_decompress_safe_withPrefix64k(ushort *param_1,undefined8 *param_2,int param_3,uint param_4)

{
  byte *pbVar1;
  ulong *puVar2;
  uint uVar3;
  ulong *puVar4;
  ushort *puVar5;
  undefined8 *puVar6;
  byte bVar7;
  ushort uVar8;
  ushort uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  int iVar17;
  ushort *__src;
  ushort *puVar18;
  ushort *puVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  ulong *puVar23;
  ulong *puVar24;
  ulong uVar25;
  ulong uVar26;
  undefined8 *puVar27;
  ulong *puVar28;
  undefined8 *puVar29;
  undefined8 *puVar30;
  long lVar31;
  ulong *puVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  ulong uVar36;
  ulong uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  ulong uVar41;
  undefined8 uVar42;
  ulong uVar43;
  
  iVar17 = -1;
  if ((param_1 != (ushort *)0x0) && (-1 < (int)param_4)) {
    if (param_4 == 0) {
      if (param_3 == 1) {
        iVar17 = -(uint)((byte)*param_1 != 0);
      }
    }
    else if (param_3 != 0) {
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      uVar20 = (ulong)param_4;
      if (0x3f < param_4) {
        puVar19 = (ushort *)((long)param_1 + 1);
        uVar26 = (ulong)(byte)*param_1;
        uVar25 = (ulong)(byte)((byte)*param_1 >> 4);
        if (param_3 < 0x12) {
          lVar21 = 0;
        }
        else {
          lVar21 = 0;
          puVar11 = (undefined8 *)((long)param_2 + (uVar20 - 0x40));
          puVar18 = param_1;
          __src = puVar19;
          puVar10 = param_2;
          do {
            if (uVar25 == 0xf) {
              if (pbVar1 + -0xf <= __src) goto LAB_008d8424;
              uVar25 = (ulong)(byte)*__src;
              __src = puVar18 + 1;
              puVar19 = __src;
              if (uVar25 == 0xff) {
                do {
                  __src = puVar19;
                  if (pbVar1 + -0xf <= puVar19) goto LAB_008d8424;
                  __src = (ushort *)((long)puVar19 + 1);
                  uVar9 = *puVar19;
                  uVar25 = uVar25 + (byte)uVar9;
                  puVar19 = __src;
                } while ((ulong)(byte)uVar9 == 0xff);
                if (uVar25 == 0xffffffffffffffff) goto LAB_008d8424;
              }
              uVar25 = uVar25 + 0xf;
              if (CARRY8((ulong)__src,uVar25)) goto LAB_008d8424;
              lVar14 = uVar25 + lVar21;
              if (puVar11 < (undefined8 *)((long)param_2 + lVar14)) goto LAB_008d84f0;
              puVar19 = (ushort *)((long)__src + uVar25);
              if (pbVar1 + -0x40 < puVar19) goto LAB_008d84f0;
              do {
                uVar35 = *(undefined8 *)(__src + 0x10);
                uVar34 = *(undefined8 *)(__src + 0x1c);
                uVar33 = *(undefined8 *)(__src + 0x18);
                uVar39 = *(undefined8 *)(__src + 4);
                uVar38 = *(undefined8 *)__src;
                uVar42 = *(undefined8 *)(__src + 0xc);
                uVar40 = *(undefined8 *)(__src + 8);
                puVar10[5] = *(undefined8 *)(__src + 0x14);
                puVar10[4] = uVar35;
                puVar10[7] = uVar34;
                puVar10[6] = uVar33;
                puVar15 = puVar10 + 8;
                puVar10[1] = uVar39;
                *puVar10 = uVar38;
                puVar10[3] = uVar42;
                puVar10[2] = uVar40;
                __src = __src + 0x20;
                puVar10 = puVar15;
              } while (puVar15 < (undefined8 *)((long)param_2 + lVar14));
            }
            else {
              uVar33 = *(undefined8 *)__src;
              puVar19 = (ushort *)((long)__src + uVar25);
              lVar14 = uVar25 + lVar21;
              puVar10[1] = *(undefined8 *)(__src + 4);
              *puVar10 = uVar33;
            }
            puVar23 = (ulong *)((long)param_2 + lVar14);
            __src = puVar19 + 1;
            uVar9 = *puVar19;
            uVar25 = (ulong)uVar9;
            lVar31 = lVar14 - uVar25;
            puVar28 = (ulong *)((long)param_2 + lVar31);
            if ((uVar26 & 0xf) == 0xf) {
              if (pbVar1 + -6 <= __src) goto LAB_008d8424;
              uVar26 = (ulong)(byte)puVar19[1];
              __src = (ushort *)((long)puVar19 + 3);
              puVar19 = __src;
              if (uVar26 == 0xff) {
                do {
                  __src = puVar19;
                  if (pbVar1 + -6 <= puVar19) goto LAB_008d8424;
                  __src = (ushort *)((long)puVar19 + 1);
                  uVar8 = *puVar19;
                  uVar26 = uVar26 + (byte)uVar8;
                  puVar19 = __src;
                } while ((ulong)(byte)uVar8 == 0xff);
                if (uVar26 == 0xffffffffffffffff) goto LAB_008d8424;
              }
              uVar26 = uVar26 + 0x13;
              if (CARRY8((ulong)puVar23,uVar26)) goto LAB_008d8424;
              if (puVar11 <= (undefined8 *)((long)puVar23 + uVar26)) goto LAB_008d85f4;
LAB_008d819c:
              if (lVar31 < -0x10000) goto LAB_008d8424;
              lVar21 = uVar26 + lVar14;
              puVar2 = (ulong *)((long)param_2 + lVar21);
              if (uVar9 < 0x10) {
                if (uVar9 == 4) {
                  uVar12 = (ulong)(uint)*puVar28;
                  uVar25 = (ulong)((uint)*puVar28 >> 0x10);
                  uVar22 = uVar12 & 0xffff;
                }
                else {
                  if (uVar9 == 2) {
                    uVar9 = (ushort)*puVar28;
                    uVar3 = CONCAT22(uVar9,uVar9);
                  }
                  else {
                    if (uVar9 != 1) {
                      if (uVar9 < 8) {
                        *(undefined4 *)puVar23 = 0;
                        *(short *)puVar23 = (short)*puVar28;
                        *(undefined2 *)((long)puVar23 + 2) = *(undefined2 *)((long)puVar28 + 2);
                        uVar3 = *(uint *)(&DAT_00364e30 + uVar25 * 4);
                        *(undefined4 *)((long)puVar23 + 4) =
                             *(undefined4 *)((long)puVar28 + (ulong)uVar3);
                        puVar32 = (ulong *)((long)((long)puVar28 + (ulong)uVar3) -
                                           (long)*(int *)(&DAT_00364dd0 + uVar25 * 4));
                      }
                      else {
                        puVar32 = puVar28 + 1;
                        *puVar23 = *puVar28;
                      }
                      uVar25 = (long)param_2 + lVar14 + 0x10;
                      uVar26 = (long)param_2 + lVar14 + uVar26;
                      if (uVar26 <= uVar25) {
                        uVar26 = uVar25;
                      }
                      uVar25 = (uVar26 - (lVar14 + (long)param_2)) - 9;
                      puVar23 = puVar23 + 1;
                      puVar28 = puVar32;
                      if (uVar25 < 0x18) {
                      }
                      else if (0x1f < (ulong)((long)param_2 + ((lVar14 + 8) - (long)puVar32))) {
                        puVar24 = (ulong *)((long)param_2 + lVar14 + 0x18);
                        uVar25 = (uVar25 >> 3) + 1;
                        uVar22 = uVar25 & 0x3ffffffffffffffc;
                        puVar28 = puVar32 + uVar22;
                        puVar23 = puVar23 + uVar22;
                        puVar32 = puVar32 + 2;
                        uVar26 = uVar22;
                        do {
                          puVar4 = puVar32 + -1;
                          uVar12 = puVar32[-2];
                          uVar37 = puVar32[1];
                          uVar36 = *puVar32;
                          uVar26 = uVar26 - 4;
                          puVar32 = puVar32 + 4;
                          puVar24[-1] = *puVar4;
                          puVar24[-2] = uVar12;
                          puVar24[1] = uVar37;
                          *puVar24 = uVar36;
                          puVar24 = puVar24 + 4;
                        } while (uVar26 != 0);
                        if (uVar25 == uVar22) goto LAB_008d80a0;
                      }
                      do {
                        puVar32 = puVar23 + 1;
                        *puVar23 = *puVar28;
                        puVar23 = puVar32;
                        puVar28 = puVar28 + 1;
                      } while (puVar32 < puVar2);
                      goto LAB_008d80a0;
                    }
                    bVar7 = (byte)*puVar28;
                    uVar9 = CONCAT11(bVar7,bVar7);
                    uVar3 = (uint)bVar7 * 0x1010101;
                  }
                  uVar12 = (ulong)uVar3;
                  uVar22 = (ulong)uVar9;
                  uVar25 = uVar22;
                }
                uVar25 = uVar22 | uVar25 << 0x10 | uVar12 << 0x20;
                puVar28 = puVar23 + 1;
                *puVar23 = uVar25;
                if (puVar28 < puVar2) {
                  uVar22 = (long)param_2 + lVar14 + 0x10;
                  uVar26 = (long)param_2 + lVar14 + uVar26;
                  if (uVar26 <= uVar22) {
                    uVar26 = uVar22;
                  }
                  uVar26 = (uVar26 - (lVar14 + (long)param_2)) - 9;
                  if (0x17 < uVar26) {
                    puVar23 = (ulong *)((long)param_2 + lVar14 + 0x18);
                    uVar26 = (uVar26 >> 3) + 1;
                    uVar12 = uVar26 & 0x3ffffffffffffffc;
                    uVar22 = uVar12;
                    do {
                      uVar22 = uVar22 - 4;
                      puVar23[-1] = uVar25;
                      puVar23[-2] = uVar25;
                      puVar23[1] = uVar25;
                      *puVar23 = uVar25;
                      puVar23 = puVar23 + 4;
                    } while (uVar22 != 0);
                    puVar28 = puVar28 + uVar12;
                    if (uVar26 == uVar12) goto LAB_008d80a0;
                  }
                  do {
                    puVar23 = puVar28 + 1;
                    *puVar28 = uVar25;
                    puVar28 = puVar23;
                  } while (puVar23 < puVar2);
                }
              }
              else if (uVar9 < 0x40) {
                puVar10 = (undefined8 *)((long)param_2 + lVar31 + 0x10);
                puVar15 = (undefined8 *)((long)param_2 + lVar14 + 0x10);
                do {
                  uVar33 = puVar10[-2];
                  puVar23 = puVar15 + 2;
                  puVar15[-1] = puVar10[-1];
                  puVar15[-2] = uVar33;
                  uVar33 = *puVar10;
                  puVar15[1] = puVar10[1];
                  *puVar15 = uVar33;
                  puVar10 = puVar10 + 4;
                  puVar15 = puVar15 + 4;
                } while (puVar23 < puVar2);
              }
              else {
                do {
                  puVar28 = (ulong *)((long)puVar23 - uVar25);
                  uVar12 = puVar28[4];
                  uVar22 = puVar28[7];
                  uVar26 = puVar28[6];
                  uVar37 = puVar28[1];
                  uVar36 = *puVar28;
                  uVar43 = puVar28[3];
                  uVar41 = puVar28[2];
                  puVar23[5] = puVar28[5];
                  puVar23[4] = uVar12;
                  puVar23[7] = uVar22;
                  puVar23[6] = uVar26;
                  puVar28 = puVar23 + 8;
                  puVar23[1] = uVar37;
                  *puVar23 = uVar36;
                  puVar23[3] = uVar43;
                  puVar23[2] = uVar41;
                  puVar23 = puVar28;
                } while (puVar28 < puVar2);
              }
            }
            else {
              uVar26 = (uVar26 & 0xf) + 4;
              lVar21 = lVar14 + uVar26;
              if (puVar11 <= (undefined8 *)((long)param_2 + lVar21)) goto LAB_008d85f4;
              if (uVar9 < 8) goto LAB_008d819c;
              *puVar23 = *puVar28;
              puVar23[1] = puVar28[1];
              *(short *)(puVar23 + 2) = (short)puVar28[2];
            }
LAB_008d80a0:
            puVar10 = (undefined8 *)((long)param_2 + lVar21);
            puVar19 = (ushort *)((long)__src + 1);
            uVar26 = (ulong)(byte)*__src;
            uVar25 = (ulong)(byte)((byte)*__src >> 4);
            puVar18 = __src;
            __src = puVar19;
          } while (puVar19 <= pbVar1 + -0x11);
        }
        __src = puVar19;
        if (uVar25 == 0xf) goto LAB_008d84b0;
        goto LAB_008d84e8;
      }
      lVar21 = 0;
      __src = param_1;
LAB_008d868c:
      do {
        puVar19 = (ushort *)((long)__src + 1);
        bVar7 = (byte)*__src;
        while( true ) {
          uVar25 = (ulong)(bVar7 >> 4);
          uVar26 = (ulong)bVar7;
          if (uVar25 == 0xf) break;
          __src = puVar19;
          if ((pbVar1 + -0x10 <= puVar19) ||
             (puVar10 = (undefined8 *)((long)param_2 + lVar21),
             (undefined8 *)((long)param_2 + (uVar20 - 0x20)) < puVar10)) goto LAB_008d84e8;
          uVar33 = *(undefined8 *)puVar19;
          puVar18 = (ushort *)((long)puVar19 + uVar25);
          uVar26 = uVar26 & 0xf;
          puVar10[1] = *(undefined8 *)(puVar19 + 4);
          *puVar10 = uVar33;
          lVar14 = lVar21 + uVar25;
          __src = puVar18 + 1;
          uVar25 = (ulong)*puVar18;
          lVar31 = lVar14 - uVar25;
          if ((uVar26 == 0xf) || (*puVar18 < 8)) goto LAB_008d85ac;
          puVar10 = (undefined8 *)((long)param_2 + lVar31);
          puVar11 = (undefined8 *)((long)param_2 + lVar14);
          *puVar11 = *puVar10;
          puVar11[1] = puVar10[1];
          *(undefined2 *)(puVar11 + 2) = *(undefined2 *)(puVar10 + 2);
          bVar7 = (byte)puVar18[1];
          lVar21 = uVar26 + lVar14 + 4;
          puVar19 = (ushort *)((long)puVar18 + 3);
        }
LAB_008d84b0:
        __src = puVar19;
        if (pbVar1 + -0xf <= puVar19) goto LAB_008d8424;
        __src = (ushort *)((long)puVar19 + 1);
        uVar25 = (ulong)(byte)*puVar19;
        puVar19 = __src;
        if (uVar25 == 0xff) {
          do {
            __src = puVar19;
            if (pbVar1 + -0xf <= puVar19) goto LAB_008d8424;
            __src = (ushort *)((long)puVar19 + 1);
            uVar9 = *puVar19;
            uVar25 = uVar25 + (byte)uVar9;
            puVar19 = __src;
          } while ((ulong)(byte)uVar9 == 0xff);
          if (uVar25 == 0xffffffffffffffff) goto LAB_008d8424;
        }
        uVar25 = uVar25 + 0xf;
        if (CARRY8((long)param_2 + lVar21,uVar25)) goto LAB_008d8424;
        if (CARRY8((ulong)__src,uVar25)) goto LAB_008d8424;
LAB_008d84e8:
        puVar10 = (undefined8 *)((long)param_2 + lVar21);
        lVar14 = uVar25 + lVar21;
LAB_008d84f0:
        if (((undefined8 *)((long)param_2 + (uVar20 - 0xc)) < (undefined8 *)((long)param_2 + lVar14)
            ) || (puVar19 = (ushort *)((long)__src + uVar25), pbVar1 + -8 < puVar19)) {
          if (((byte *)((long)__src + uVar25) == pbVar1) && (lVar14 <= (long)uVar20)) {
            memmove(puVar10,__src,uVar25);
            return ((int)puVar10 + (int)uVar25) - (int)param_2;
          }
LAB_008d8424:
          return ~(uint)__src + (int)param_1;
        }
        puVar11 = (undefined8 *)(lVar14 + (long)param_2);
        if ((undefined8 *)(lVar14 + (long)param_2) <= puVar10 + 1) {
          puVar11 = puVar10 + 1;
        }
        if (((long)puVar11 + ~(ulong)puVar10 < 0x18) ||
           ((ulong)((long)puVar10 - (long)__src) < 0x20)) {
LAB_008d858c:
          do {
            puVar11 = puVar10 + 1;
            *puVar10 = *(undefined8 *)__src;
            puVar10 = puVar11;
            __src = __src + 4;
          } while (puVar11 < (undefined8 *)((long)param_2 + lVar14));
        }
        else {
          puVar15 = puVar10 + 2;
          uVar25 = ((long)puVar11 + ~(ulong)puVar10 >> 3) + 1;
          uVar12 = uVar25 & 0x3ffffffffffffffc;
          puVar18 = __src + 8;
          uVar22 = uVar12;
          do {
            puVar5 = puVar18 + -4;
            uVar33 = *(undefined8 *)(puVar18 + -8);
            uVar35 = *(undefined8 *)(puVar18 + 4);
            uVar34 = *(undefined8 *)puVar18;
            uVar22 = uVar22 - 4;
            puVar18 = puVar18 + 0x10;
            puVar15[-1] = *(undefined8 *)puVar5;
            puVar15[-2] = uVar33;
            puVar15[1] = uVar35;
            *puVar15 = uVar34;
            puVar15 = puVar15 + 4;
          } while (uVar22 != 0);
          puVar10 = puVar10 + uVar12;
          __src = __src + uVar12 * 4;
          if (uVar25 != uVar12) goto LAB_008d858c;
        }
        __src = puVar19 + 1;
        uVar25 = (ulong)*puVar19;
        uVar26 = uVar26 & 0xf;
        lVar31 = lVar14 - uVar25;
LAB_008d85ac:
        if (uVar26 == 0xf) {
          if (pbVar1 + -6 <= __src) goto LAB_008d8424;
          uVar22 = (ulong)(byte)*__src;
          uVar26 = uVar22;
          while (__src = (ushort *)((long)__src + 1), uVar26 == 0xff) {
            if (pbVar1 + -6 <= __src) goto LAB_008d8424;
            uVar26 = (ulong)*(byte *)__src;
            uVar22 = uVar22 + uVar26;
          }
          uVar26 = uVar22 + 0xf;
          if ((uVar22 == 0xffffffffffffffff) || (CARRY8((long)param_2 + lVar14,uVar26)))
          goto LAB_008d8424;
        }
        uVar26 = uVar26 + 4;
LAB_008d85f4:
        if (lVar31 < -0x10000) goto LAB_008d8424;
        lVar21 = lVar14 + uVar26;
        puVar10 = (undefined8 *)((long)param_2 + lVar14);
        puVar11 = (undefined8 *)((long)param_2 + lVar31);
        puVar15 = (undefined8 *)((long)param_2 + lVar21);
        if (uVar25 < 8) {
          *(undefined4 *)puVar10 = 0;
          *(undefined1 *)puVar10 = *(undefined1 *)puVar11;
          *(undefined1 *)((long)puVar10 + 1) = *(undefined1 *)((long)puVar11 + 1);
          *(undefined1 *)((long)puVar10 + 2) = *(undefined1 *)((long)puVar11 + 2);
          *(undefined1 *)((long)puVar10 + 3) = *(undefined1 *)((long)puVar11 + 3);
          uVar3 = *(uint *)(&DAT_00364e30 + uVar25 * 4);
          *(undefined4 *)((long)puVar10 + 4) = *(undefined4 *)((long)puVar11 + (ulong)uVar3);
          puVar27 = (undefined8 *)
                    ((long)((long)puVar11 + (ulong)uVar3) -
                    (long)*(int *)(&DAT_00364dd0 + uVar25 * 4));
        }
        else {
          puVar27 = puVar11 + 1;
          *puVar10 = *puVar11;
        }
        puVar11 = puVar10 + 1;
        if ((undefined8 *)((long)param_2 + (uVar20 - 0xc)) < puVar15) {
          if ((undefined8 *)((long)param_2 + (uVar20 - 5)) < puVar15) goto LAB_008d8424;
          puVar10 = (undefined8 *)((long)param_2 + (uVar20 - 7));
          if (puVar11 < puVar10) {
            lVar31 = lVar14 + (long)param_2;
            uVar25 = (long)param_2 + (uVar20 - 7);
            if (uVar25 <= lVar31 + 0x10U) {
              uVar25 = lVar31 + 0x10U;
            }
            uVar25 = (uVar25 - lVar31) - 9;
            puVar13 = puVar27;
            if (uVar25 < 0x38) {
              puVar16 = puVar11;
LAB_008d8880:
              do {
                puVar30 = puVar16 + 1;
                *puVar16 = *puVar13;
                puVar13 = puVar13 + 1;
                puVar16 = puVar30;
              } while (puVar30 < puVar10);
            }
            else {
              puVar16 = puVar11;
              if ((lVar31 - (long)puVar27) + 8U < 0x20) goto LAB_008d8880;
              puVar30 = puVar27 + 2;
              puVar29 = (undefined8 *)((long)param_2 + lVar14 + 0x18);
              uVar25 = (uVar25 >> 3) + 1;
              uVar12 = uVar25 & 0x3ffffffffffffffc;
              puVar13 = puVar27 + uVar12;
              puVar16 = puVar11 + uVar12;
              uVar22 = uVar12;
              do {
                puVar6 = puVar30 + -1;
                uVar33 = puVar30[-2];
                uVar35 = puVar30[1];
                uVar34 = *puVar30;
                uVar22 = uVar22 - 4;
                puVar30 = puVar30 + 4;
                puVar29[-1] = *puVar6;
                puVar29[-2] = uVar33;
                puVar29[1] = uVar35;
                *puVar29 = uVar34;
                puVar29 = puVar29 + 4;
              } while (uVar22 != 0);
              if (uVar25 != uVar12) goto LAB_008d8880;
            }
            puVar27 = (undefined8 *)((long)puVar27 + ((long)puVar10 - (long)puVar11));
            puVar11 = puVar10;
          }
          if (puVar11 < puVar15) {
            uVar12 = (long)param_2 + (uVar20 - 7);
            uVar25 = (long)param_2 + lVar14 + 8;
            uVar22 = uVar12;
            if (uVar12 <= uVar25) {
              uVar22 = uVar25;
            }
            uVar26 = (long)param_2 + ((uVar26 + lVar14) - uVar22);
            if (uVar26 < 8) {
LAB_008d88dc:
              puVar10 = puVar11;
              puVar13 = puVar27;
            }
            else {
              if (uVar12 <= uVar25) {
                uVar12 = uVar25;
              }
              if (uVar12 - (long)puVar27 < 0x20) goto LAB_008d88dc;
              uVar25 = 0;
              if (uVar26 < 0x20) {
LAB_008d8944:
                uVar22 = uVar26 & 0xfffffffffffffff8;
                puVar10 = (undefined8 *)((long)puVar11 + uVar22);
                puVar13 = (undefined8 *)((long)puVar27 + uVar22);
                lVar14 = uVar25 - uVar22;
                puVar11 = (undefined8 *)((long)puVar11 + uVar25);
                puVar27 = (undefined8 *)((long)puVar27 + uVar25);
                do {
                  lVar14 = lVar14 + 8;
                  *puVar11 = *puVar27;
                  puVar11 = puVar11 + 1;
                  puVar27 = puVar27 + 1;
                } while (lVar14 != 0);
                if (uVar26 == uVar22) goto LAB_008d868c;
              }
              else {
                uVar25 = uVar26 & 0xffffffffffffffe0;
                puVar10 = puVar27 + 2;
                puVar13 = puVar11 + 2;
                uVar22 = uVar25;
                do {
                  puVar16 = puVar10 + -1;
                  uVar33 = puVar10[-2];
                  uVar35 = puVar10[1];
                  uVar34 = *puVar10;
                  uVar22 = uVar22 - 0x20;
                  puVar10 = puVar10 + 4;
                  puVar13[-1] = *puVar16;
                  puVar13[-2] = uVar33;
                  puVar13[1] = uVar35;
                  *puVar13 = uVar34;
                  puVar13 = puVar13 + 4;
                } while (uVar22 != 0);
                if (uVar26 == uVar25) goto LAB_008d868c;
                puVar10 = (undefined8 *)((long)puVar11 + uVar25);
                puVar13 = (undefined8 *)((long)puVar27 + uVar25);
                if ((uVar26 & 0x18) != 0) goto LAB_008d8944;
              }
            }
            do {
              puVar11 = (undefined8 *)((long)puVar10 + 1);
              *(undefined1 *)puVar10 = *(undefined1 *)puVar13;
              puVar10 = puVar11;
              puVar13 = (undefined8 *)((long)puVar13 + 1);
            } while (puVar11 < puVar15);
          }
          goto LAB_008d868c;
        }
        *puVar11 = *puVar27;
      } while (uVar26 < 0x11);
      lVar31 = lVar14 + (long)param_2;
      puVar10 = puVar10 + 2;
      uVar25 = lVar31 + uVar26;
      if (lVar31 + uVar26 <= lVar31 + 0x18U) {
        uVar25 = lVar31 + 0x18U;
      }
      uVar25 = (uVar25 - lVar31) - 0x11;
      if ((0x37 < uVar25) && (0x1f < (lVar31 - (long)puVar27) + 8U)) {
        uVar25 = (uVar25 >> 3) + 1;
        uVar22 = uVar25 & 0x3ffffffffffffffc;
        puVar10 = puVar10 + uVar22;
        puVar11 = puVar27 + 3;
        uVar26 = uVar22;
        puVar13 = (undefined8 *)(lVar14 + (long)param_2);
        do {
          puVar16 = puVar11 + -1;
          uVar33 = puVar11[-2];
          uVar35 = puVar11[1];
          uVar34 = *puVar11;
          uVar26 = uVar26 - 4;
          puVar11 = puVar11 + 4;
          puVar13[3] = *puVar16;
          puVar13[2] = uVar33;
          puVar13[5] = uVar35;
          puVar13[4] = uVar34;
          puVar13 = puVar13 + 4;
        } while (uVar26 != 0);
        puVar27 = puVar27 + uVar22;
        if (uVar25 == uVar22) goto LAB_008d868c;
      }
      do {
        puVar11 = puVar10 + 1;
        *puVar10 = puVar27[1];
        puVar10 = puVar11;
        puVar27 = puVar27 + 1;
      } while (puVar11 < puVar15);
      goto LAB_008d868c;
    }
  }
  return iVar17;
}

