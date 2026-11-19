/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008da394
 */

ulong LZ4_decompress_safe_continue
                (long *param_1,ulong *param_2,ulong *param_3,int param_4,uint param_5)

{
  byte *pbVar1;
  ulong *puVar2;
  uint uVar3;
  ushort uVar4;
  size_t sVar5;
  ulong *puVar6;
  byte bVar7;
  int iVar8;
  ulong *puVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  undefined8 *puVar16;
  ulong uVar17;
  ulong *puVar18;
  ushort *puVar19;
  ulong *puVar20;
  undefined8 *puVar21;
  ulong *__dest;
  long lVar22;
  ulong *puVar23;
  ulong uVar24;
  ulong *puVar25;
  ulong *puVar26;
  ulong *puVar27;
  ulong *__src;
  ulong *puVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  
  uVar10 = param_1[3];
  if (uVar10 == 0) {
    uVar10 = LZ4_decompress_safe(param_2,param_3,param_4,param_5);
    iVar8 = (int)uVar10;
  }
  else {
    if ((ulong *)param_1[1] == param_3) {
      if (uVar10 < 0xffff) {
        uVar12 = param_1[2];
        if (uVar12 == 0) {
          uVar10 = FUN_008db0f8(param_2,param_3,param_4,param_5,uVar10);
        }
        else {
          if (param_2 == (ulong *)0x0) {
            return 0xffffffff;
          }
          if ((int)param_5 < 0) {
            return 0xffffffff;
          }
          lVar11 = 0;
          if (*param_1 != 0) {
            lVar11 = *param_1 + uVar12;
          }
          if (param_5 == 0) {
            if (param_4 == 1) {
              return (ulong)-(uint)((byte)*param_2 != 0);
            }
            return 0xffffffff;
          }
          if (param_4 == 0) {
            return 0xffffffff;
          }
          pbVar1 = (byte *)((long)param_2 + (long)param_4);
          uVar17 = (ulong)param_5;
          puVar2 = (ulong *)((long)param_3 + uVar17);
          __src = (ulong *)((long)param_3 - uVar10);
          iVar8 = (int)param_2;
          puVar28 = param_2;
          __dest = param_3;
          if (param_5 < 0x40) goto LAB_008dae90;
          puVar18 = (ulong *)((long)param_2 + 1);
          uVar13 = (ulong)(byte)*param_2;
          uVar29 = (ulong)(byte)((byte)*param_2 >> 4);
          if (0x11 < param_4) {
            puVar15 = puVar2 + -8;
            do {
              if (uVar29 == 0xf) {
                if (pbVar1 + -0xf <= puVar18) {
                  puVar28 = puVar18;
                  goto LAB_008daa60;
                }
                uVar29 = (ulong)(byte)*puVar18;
                puVar18 = (ulong *)((long)param_2 + 2);
                puVar28 = puVar18;
                if (uVar29 == 0xff) {
                  do {
                    if (pbVar1 + -0xf <= puVar28) goto LAB_008daa60;
                    puVar18 = (ulong *)((long)puVar28 + 1);
                    uVar14 = *puVar28;
                    uVar29 = uVar29 + (byte)uVar14;
                    puVar28 = puVar18;
                  } while ((ulong)(byte)uVar14 == 0xff);
                  if (uVar29 == 0xffffffffffffffff) goto LAB_008daa60;
                }
                uVar29 = uVar29 + 0xf;
                puVar28 = puVar18;
                if (CARRY8((ulong)puVar18,uVar29)) goto LAB_008daa60;
                puVar9 = (ulong *)((long)__dest + uVar29);
                if (puVar15 < puVar9) goto LAB_008dab20;
                puVar19 = (ushort *)((long)puVar18 + uVar29);
                if (pbVar1 + -0x40 < puVar19) goto LAB_008dab20;
                do {
                  uVar24 = puVar18[4];
                  uVar14 = puVar18[7];
                  uVar29 = puVar18[6];
                  uVar31 = puVar18[1];
                  uVar30 = *puVar18;
                  uVar33 = puVar18[3];
                  uVar32 = puVar18[2];
                  __dest[5] = puVar18[5];
                  __dest[4] = uVar24;
                  __dest[7] = uVar14;
                  __dest[6] = uVar29;
                  puVar28 = __dest + 8;
                  __dest[1] = uVar31;
                  *__dest = uVar30;
                  __dest[3] = uVar33;
                  __dest[2] = uVar32;
                  puVar18 = puVar18 + 8;
                  __dest = puVar28;
                } while (puVar28 < puVar9);
              }
              else {
                uVar14 = *puVar18;
                puVar19 = (ushort *)((long)puVar18 + uVar29);
                puVar9 = (ulong *)((long)__dest + uVar29);
                __dest[1] = puVar18[1];
                *__dest = uVar14;
              }
              param_2 = (ulong *)(puVar19 + 1);
              uVar4 = *puVar19;
              uVar29 = (ulong)uVar4;
              puVar27 = (ulong *)((long)puVar9 - uVar29);
              puVar28 = param_2;
              if ((uVar13 & 0xf) == 0xf) {
                if (pbVar1 + -6 <= param_2) goto LAB_008daa60;
                uVar13 = (ulong)(byte)puVar19[1];
                param_2 = (ulong *)((long)puVar19 + 3);
                puVar28 = param_2;
                if (uVar13 == 0xff) {
                  do {
                    if (pbVar1 + -6 <= puVar28) goto LAB_008daa60;
                    param_2 = (ulong *)((long)puVar28 + 1);
                    uVar14 = *puVar28;
                    uVar13 = uVar13 + (byte)uVar14;
                    puVar28 = param_2;
                  } while ((ulong)(byte)uVar14 == 0xff);
                  if (uVar13 == 0xffffffffffffffff) goto LAB_008daa60;
                }
                uVar13 = uVar13 + 0x13;
                puVar28 = param_2;
                if (CARRY8((ulong)puVar9,uVar13)) goto LAB_008daa60;
                if (puVar15 <= (ulong *)((long)puVar9 + uVar13)) goto LAB_008dac18;
LAB_008da668:
                puVar28 = param_2;
                if ((uVar12 >> 0x10 == 0) && ((ulong *)((long)puVar27 + uVar12) < __src))
                goto LAB_008daa60;
                __dest = (ulong *)((long)puVar9 + uVar13);
                if (puVar27 < __src) {
                  if ((ulong *)((long)puVar2 + -5) < __dest) goto LAB_008daa60;
                  uVar14 = (long)__src - (long)puVar27;
                  sVar5 = uVar13 - uVar14;
                  if (uVar13 < uVar14 || sVar5 == 0) {
                    memmove(puVar9,(void *)(lVar11 - uVar14),uVar13);
                  }
                  else {
                    memcpy(puVar9,(void *)(lVar11 - uVar14),uVar14);
                    puVar28 = (ulong *)((long)puVar9 + uVar14);
                    if ((ulong)((long)puVar28 - (long)__src) < sVar5) {
                      uVar14 = (long)__src + uVar29 + 1;
                      if (uVar14 <= uVar13 + (long)puVar9) {
                        uVar14 = uVar13 + (long)puVar9;
                      }
                      uVar13 = (uVar10 + uVar14) - ((long)param_3 + uVar29);
                      puVar18 = __src;
                      if ((uVar13 < 0x20) || (uVar4 < 0x20)) {
LAB_008da7f8:
                        do {
                          puVar9 = (ulong *)((long)puVar28 + 1);
                          *(char *)puVar28 = (char)*puVar18;
                          puVar28 = puVar9;
                          puVar18 = (ulong *)((long)puVar18 + 1);
                        } while (puVar9 < __dest);
                      }
                      else {
                        uVar14 = uVar13 & 0xffffffffffffffe0;
                        puVar9 = (ulong *)((long)puVar28 + uVar14);
                        puVar18 = (ulong *)((long)(__src + 2) + uVar29);
                        puVar28 = __src + 2;
                        uVar29 = uVar14;
                        do {
                          puVar27 = puVar28 + -1;
                          uVar24 = puVar28[-2];
                          uVar31 = puVar28[1];
                          uVar30 = *puVar28;
                          uVar29 = uVar29 - 0x20;
                          puVar28 = puVar28 + 4;
                          puVar18[-1] = *puVar27;
                          puVar18[-2] = uVar24;
                          puVar18[1] = uVar31;
                          *puVar18 = uVar30;
                          puVar18 = puVar18 + 4;
                        } while (uVar29 != 0);
                        puVar28 = puVar9;
                        puVar18 = (ulong *)((long)__src + uVar14);
                        if (uVar13 != uVar14) goto LAB_008da7f8;
                      }
                      __dest = puVar9;
                    }
                    else {
                      memcpy(puVar28,__src,sVar5);
                    }
                  }
                }
                else if (uVar4 < 0x10) {
                  if (uVar4 == 4) {
                    uVar24 = (ulong)(uint)*puVar27;
                    uVar29 = (ulong)((uint)*puVar27 >> 0x10);
                    uVar14 = uVar24 & 0xffff;
                  }
                  else {
                    if (uVar4 == 2) {
                      uVar4 = (ushort)*puVar27;
                      uVar3 = CONCAT22(uVar4,uVar4);
                    }
                    else {
                      if (uVar4 != 1) {
                        if (uVar4 < 8) {
                          *(undefined4 *)puVar9 = 0;
                          *(short *)puVar9 = (short)*puVar27;
                          *(undefined2 *)((long)puVar9 + 2) = *(undefined2 *)((long)puVar27 + 2);
                          uVar3 = *(uint *)(&DAT_00364e30 + uVar29 * 4);
                          *(undefined4 *)((long)puVar9 + 4) =
                               *(undefined4 *)((long)puVar27 + (ulong)uVar3);
                          puVar28 = (ulong *)((long)((long)puVar27 + (ulong)uVar3) -
                                             (long)*(int *)(&DAT_00364dd0 + uVar29 * 4));
                        }
                        else {
                          puVar28 = puVar27 + 1;
                          *puVar9 = *puVar27;
                        }
                        puVar18 = (ulong *)(uVar13 + (long)puVar9);
                        if ((ulong *)(uVar13 + (long)puVar9) <= puVar9 + 2) {
                          puVar18 = puVar9 + 2;
                        }
                        uVar29 = (long)puVar18 + (-9 - (long)puVar9);
                        puVar18 = puVar9 + 1;
                        if (uVar29 < 0x18) {
                        }
                        else if (0x1f < (ulong)((long)puVar9 + (8 - (long)puVar28))) {
                          puVar27 = puVar28 + 2;
                          uVar29 = (uVar29 >> 3) + 1;
                          uVar14 = uVar29 & 0x3ffffffffffffffc;
                          puVar28 = puVar28 + uVar14;
                          puVar18 = puVar18 + uVar14;
                          puVar9 = puVar9 + 3;
                          uVar13 = uVar14;
                          do {
                            puVar20 = puVar27 + -1;
                            uVar24 = puVar27[-2];
                            uVar31 = puVar27[1];
                            uVar30 = *puVar27;
                            uVar13 = uVar13 - 4;
                            puVar27 = puVar27 + 4;
                            puVar9[-1] = *puVar20;
                            puVar9[-2] = uVar24;
                            puVar9[1] = uVar31;
                            *puVar9 = uVar30;
                            puVar9 = puVar9 + 4;
                          } while (uVar13 != 0);
                          if (uVar29 == uVar14) goto LAB_008da56c;
                        }
                        do {
                          puVar9 = puVar18 + 1;
                          *puVar18 = *puVar28;
                          puVar18 = puVar9;
                          puVar28 = puVar28 + 1;
                        } while (puVar9 < __dest);
                        goto LAB_008da56c;
                      }
                      bVar7 = (byte)*puVar27;
                      uVar4 = CONCAT11(bVar7,bVar7);
                      uVar3 = (uint)bVar7 * 0x1010101;
                    }
                    uVar24 = (ulong)uVar3;
                    uVar14 = (ulong)uVar4;
                    uVar29 = uVar14;
                  }
                  uVar29 = uVar14 | uVar29 << 0x10 | uVar24 << 0x20;
                  *puVar9 = uVar29;
                  if (8 < uVar13) {
                    puVar28 = (ulong *)(uVar13 + (long)puVar9);
                    if ((ulong *)(uVar13 + (long)puVar9) <= puVar9 + 2) {
                      puVar28 = puVar9 + 2;
                    }
                    uVar13 = (long)puVar28 + (-9 - (long)puVar9);
                    puVar28 = puVar9 + 1;
                    if (0x17 < uVar13) {
                      puVar28 = puVar9 + 3;
                      uVar13 = (uVar13 >> 3) + 1;
                      uVar24 = uVar13 & 0x3ffffffffffffffc;
                      uVar14 = uVar24;
                      do {
                        uVar14 = uVar14 - 4;
                        puVar28[-1] = uVar29;
                        puVar28[-2] = uVar29;
                        puVar28[1] = uVar29;
                        *puVar28 = uVar29;
                        puVar28 = puVar28 + 4;
                      } while (uVar14 != 0);
                      puVar28 = puVar9 + 1 + uVar24;
                      if (uVar13 == uVar24) goto LAB_008da56c;
                    }
                    do {
                      puVar18 = puVar28 + 1;
                      *puVar28 = uVar29;
                      puVar28 = puVar18;
                    } while (puVar18 < __dest);
                  }
                }
                else if (uVar4 < 0x40) {
                  puVar28 = (ulong *)((long)puVar9 + -uVar29 + 0x10);
                  do {
                    uVar29 = puVar28[-2];
                    puVar9[1] = puVar28[-1];
                    *puVar9 = uVar29;
                    uVar29 = *puVar28;
                    puVar9[3] = puVar28[1];
                    puVar9[2] = uVar29;
                    puVar9 = puVar9 + 4;
                    puVar28 = puVar28 + 4;
                  } while (puVar9 < __dest);
                }
                else {
                  do {
                    puVar28 = (ulong *)((long)puVar9 + -uVar29);
                    uVar24 = puVar28[4];
                    uVar14 = puVar28[7];
                    uVar13 = puVar28[6];
                    uVar31 = puVar28[1];
                    uVar30 = *puVar28;
                    uVar33 = puVar28[3];
                    uVar32 = puVar28[2];
                    puVar9[5] = puVar28[5];
                    puVar9[4] = uVar24;
                    puVar9[7] = uVar14;
                    puVar9[6] = uVar13;
                    puVar28 = puVar9 + 8;
                    puVar9[1] = uVar31;
                    *puVar9 = uVar30;
                    puVar9[3] = uVar33;
                    puVar9[2] = uVar32;
                    puVar9 = puVar28;
                  } while (puVar28 < __dest);
                }
              }
              else {
                uVar13 = (uVar13 & 0xf) + 4;
                __dest = (ulong *)((long)puVar9 + uVar13);
                if (puVar15 <= __dest) goto LAB_008dac18;
                if ((puVar27 < __src) || (uVar4 < 8)) goto LAB_008da668;
                *puVar9 = *puVar27;
                puVar9[1] = puVar27[1];
                *(short *)(puVar9 + 2) = (short)puVar27[2];
              }
LAB_008da56c:
              puVar18 = (ulong *)((long)param_2 + 1);
              uVar13 = (ulong)(byte)*param_2;
              uVar29 = (ulong)(byte)((byte)*param_2 >> 4);
            } while (puVar18 <= pbVar1 + -0x11);
          }
          if (uVar29 == 0xf) goto LAB_008daae8;
LAB_008dab1c:
          puVar9 = (ulong *)((long)__dest + uVar29);
LAB_008dab20:
          if ((puVar9 <= (ulong *)((long)puVar2 + -0xc)) &&
             (puVar19 = (ushort *)((long)puVar18 + uVar29), puVar19 <= pbVar1 + -8)) {
            puVar28 = puVar9;
            if (puVar9 <= __dest + 1) {
              puVar28 = __dest + 1;
            }
            if ((0x17 < (long)puVar28 + ~(ulong)__dest) &&
               (0x1f < (ulong)((long)__dest - (long)puVar18))) {
              puVar15 = __dest + 2;
              puVar27 = puVar18 + 2;
              uVar29 = ((long)puVar28 + ~(ulong)__dest >> 3) + 1;
              uVar24 = uVar29 & 0x3ffffffffffffffc;
              uVar14 = uVar24;
              do {
                puVar28 = puVar27 + -1;
                uVar30 = puVar27[-2];
                uVar32 = puVar27[1];
                uVar31 = *puVar27;
                uVar14 = uVar14 - 4;
                puVar27 = puVar27 + 4;
                puVar15[-1] = *puVar28;
                puVar15[-2] = uVar30;
                puVar15[1] = uVar32;
                *puVar15 = uVar31;
                puVar15 = puVar15 + 4;
              } while (uVar14 != 0);
              puVar18 = puVar18 + uVar24;
              __dest = __dest + uVar24;
              if (uVar29 == uVar24) goto LAB_008dabc4;
            }
            do {
              puVar28 = __dest + 1;
              *__dest = *puVar18;
              puVar18 = puVar18 + 1;
              __dest = puVar28;
            } while (puVar28 < puVar9);
LAB_008dabc4:
            puVar28 = (ulong *)(puVar19 + 1);
            uVar29 = (ulong)*puVar19;
            uVar13 = uVar13 & 0xf;
            puVar27 = (ulong *)((long)puVar9 - uVar29);
            do {
              if (uVar13 == 0xf) {
                if (pbVar1 + -6 <= puVar28) goto LAB_008daa60;
                uVar14 = (ulong)(byte)*puVar28;
                uVar13 = uVar14;
                while (puVar28 = (ulong *)((long)puVar28 + 1), uVar13 == 0xff) {
                  if (pbVar1 + -6 <= puVar28) goto LAB_008daa60;
                  uVar13 = (ulong)*(byte *)puVar28;
                  uVar14 = uVar14 + uVar13;
                }
                uVar13 = uVar14 + 0xf;
                if ((uVar14 == 0xffffffffffffffff) || (CARRY8((ulong)puVar9,uVar13)))
                goto LAB_008daa60;
              }
              uVar13 = uVar13 + 4;
LAB_008dac18:
              if ((uVar12 >> 0x10 == 0) && ((ulong *)((long)puVar27 + uVar12) < __src))
              goto LAB_008daa60;
              __dest = (ulong *)((long)puVar9 + uVar13);
              if (puVar27 < __src) {
                if ((ulong *)((long)puVar2 + -5) < __dest) goto LAB_008daa60;
                uVar29 = (long)__src - (long)puVar27;
                sVar5 = uVar13 - uVar29;
                if (uVar13 < uVar29 || sVar5 == 0) {
                  memmove(puVar9,(void *)(lVar11 - uVar29),uVar13);
                }
                else {
                  memcpy(puVar9,(void *)(lVar11 - uVar29),uVar29);
                  puVar18 = (ulong *)((long)puVar9 + uVar29);
                  if ((ulong)((long)puVar18 - (long)__src) < sVar5) {
                    uVar13 = uVar13 + (long)puVar9;
                    lVar22 = ((long)puVar9 + (long)param_3) - (uVar10 + (long)puVar27);
                    if (uVar13 < lVar22 + 1U) {
                      uVar13 = lVar22 + 1;
                    }
                    uVar13 = (uVar10 + (long)puVar27 + uVar13) - ((long)puVar9 + (long)param_3);
                    puVar15 = __src;
                    if ((uVar13 < 0x20) || ((ulong)((long)puVar18 - (long)__src) < 0x20)) {
LAB_008dae78:
                      do {
                        puVar27 = (ulong *)((long)puVar18 + 1);
                        *(char *)puVar18 = (char)*puVar15;
                        puVar18 = puVar27;
                        puVar15 = (ulong *)((long)puVar15 + 1);
                      } while (puVar27 < __dest);
                    }
                    else {
                      uVar14 = uVar13 & 0xffffffffffffffe0;
                      puVar15 = __src + 2;
                      puVar27 = (ulong *)((long)puVar18 + uVar14);
                      puVar9 = (ulong *)((long)puVar9 + uVar29 + 0x10);
                      uVar29 = uVar14;
                      do {
                        puVar18 = puVar15 + -1;
                        uVar24 = puVar15[-2];
                        uVar31 = puVar15[1];
                        uVar30 = *puVar15;
                        uVar29 = uVar29 - 0x20;
                        puVar15 = puVar15 + 4;
                        puVar9[-1] = *puVar18;
                        puVar9[-2] = uVar24;
                        puVar9[1] = uVar31;
                        *puVar9 = uVar30;
                        puVar9 = puVar9 + 4;
                      } while (uVar29 != 0);
                      puVar18 = puVar27;
                      puVar15 = (ulong *)((long)__src + uVar14);
                      if (uVar13 != uVar14) goto LAB_008dae78;
                    }
                    __dest = puVar27;
                  }
                  else {
                    memcpy(puVar18,__src,sVar5);
                  }
                }
              }
              else {
                if (uVar29 < 8) {
                  *(undefined4 *)puVar9 = 0;
                  *(char *)puVar9 = (char)*puVar27;
                  *(undefined1 *)((long)puVar9 + 1) = *(undefined1 *)((long)puVar27 + 1);
                  *(undefined1 *)((long)puVar9 + 2) = *(undefined1 *)((long)puVar27 + 2);
                  *(undefined1 *)((long)puVar9 + 3) = *(undefined1 *)((long)puVar27 + 3);
                  uVar3 = *(uint *)(&DAT_00364e30 + uVar29 * 4);
                  *(undefined4 *)((long)puVar9 + 4) = *(undefined4 *)((long)puVar27 + (ulong)uVar3);
                  puVar18 = (ulong *)((long)((long)puVar27 + (ulong)uVar3) -
                                     (long)*(int *)(&DAT_00364dd0 + uVar29 * 4));
                }
                else {
                  puVar18 = puVar27 + 1;
                  *puVar9 = *puVar27;
                }
                puVar15 = puVar9 + 1;
                if (__dest <= (ulong *)((long)puVar2 + -0xc)) {
                  *puVar15 = *puVar18;
                  if (0x10 < uVar13) {
                    puVar15 = (ulong *)(uVar13 + (long)puVar9);
                    if ((ulong *)(uVar13 + (long)puVar9) <= puVar9 + 3) {
                      puVar15 = puVar9 + 3;
                    }
                    uVar29 = (long)puVar15 + (-0x11 - (long)puVar9);
                    puVar15 = puVar9 + 2;
                    if ((0x27 < uVar29) && (0x1f < (ulong)((long)puVar9 + (8 - (long)puVar18)))) {
                      puVar27 = puVar18 + 3;
                      uVar29 = (uVar29 >> 3) + 1;
                      uVar14 = uVar29 & 0x3ffffffffffffffc;
                      puVar18 = puVar18 + uVar14;
                      puVar15 = puVar15 + uVar14;
                      uVar13 = uVar14;
                      do {
                        puVar20 = puVar27 + -1;
                        uVar24 = puVar27[-2];
                        uVar31 = puVar27[1];
                        uVar30 = *puVar27;
                        uVar13 = uVar13 - 4;
                        puVar27 = puVar27 + 4;
                        puVar9[3] = *puVar20;
                        puVar9[2] = uVar24;
                        puVar9[5] = uVar31;
                        puVar9[4] = uVar30;
                        puVar9 = puVar9 + 4;
                      } while (uVar13 != 0);
                      if (uVar29 == uVar14) goto LAB_008dae90;
                    }
                    do {
                      puVar18 = puVar18 + 1;
                      puVar9 = puVar15 + 1;
                      *puVar15 = *puVar18;
                      puVar15 = puVar9;
                    } while (puVar9 < __dest);
                  }
                  goto LAB_008dae90;
                }
                if ((ulong *)((long)puVar2 + -5) < __dest) goto LAB_008daa60;
                puVar27 = (ulong *)((long)puVar2 + -7);
                if (puVar15 < puVar27) {
                  puVar20 = (ulong *)((long)param_3 + (uVar17 - 7));
                  if (puVar20 <= puVar9 + 2) {
                    puVar20 = puVar9 + 2;
                  }
                  uVar29 = (long)puVar20 + (-9 - (long)puVar9);
                  puVar20 = puVar18;
                  if (uVar29 < 0x28) {
                    puVar23 = puVar15;
LAB_008dafec:
                    do {
                      puVar25 = puVar23 + 1;
                      *puVar23 = *puVar20;
                      puVar20 = puVar20 + 1;
                      puVar23 = puVar25;
                    } while (puVar25 < puVar27);
                  }
                  else {
                    puVar23 = puVar15;
                    if ((ulong)((long)puVar9 + (8 - (long)puVar18)) < 0x20) goto LAB_008dafec;
                    puVar25 = puVar9 + 3;
                    puVar26 = puVar18 + 2;
                    uVar29 = (uVar29 >> 3) + 1;
                    uVar24 = uVar29 & 0x3ffffffffffffffc;
                    puVar20 = puVar18 + uVar24;
                    puVar23 = puVar15 + uVar24;
                    uVar14 = uVar24;
                    do {
                      puVar6 = puVar26 + -1;
                      uVar30 = puVar26[-2];
                      uVar32 = puVar26[1];
                      uVar31 = *puVar26;
                      uVar14 = uVar14 - 4;
                      puVar26 = puVar26 + 4;
                      puVar25[-1] = *puVar6;
                      puVar25[-2] = uVar30;
                      puVar25[1] = uVar32;
                      *puVar25 = uVar31;
                      puVar25 = puVar25 + 4;
                    } while (uVar14 != 0);
                    if (uVar29 != uVar24) goto LAB_008dafec;
                  }
                  lVar22 = (long)puVar27 - (long)puVar15;
                  puVar15 = puVar27;
                  puVar27 = (ulong *)((long)puVar18 + lVar22);
                }
                else {
                  puVar27 = puVar18;
                }
                if (puVar15 < __dest) {
                  puVar20 = (ulong *)((long)param_3 + (uVar17 - 7));
                  if (puVar20 <= puVar9 + 1) {
                    puVar20 = puVar9 + 1;
                  }
                  uVar29 = (long)puVar9 + (uVar13 - (long)puVar20);
                  if ((uVar29 < 8) || ((ulong)((long)puVar9 + (8 - (long)puVar18)) < 0x20)) {
                    puVar23 = puVar15;
                    puVar25 = puVar27;
                  }
                  else {
                    uVar13 = 0;
                    if (0x1f < uVar29) {
                      uVar13 = uVar29 & 0xffffffffffffffe0;
                      puVar23 = puVar15 + 2;
                      puVar25 = (ulong *)((long)puVar18 + (long)puVar20 + (8 - (long)puVar9));
                      uVar14 = uVar13;
                      do {
                        puVar26 = puVar25 + -1;
                        uVar24 = puVar25[-2];
                        uVar31 = puVar25[1];
                        uVar30 = *puVar25;
                        uVar14 = uVar14 - 0x20;
                        puVar25 = puVar25 + 4;
                        puVar23[-1] = *puVar26;
                        puVar23[-2] = uVar24;
                        puVar23[1] = uVar31;
                        *puVar23 = uVar30;
                        puVar23 = puVar23 + 4;
                      } while (uVar14 != 0);
                      if (uVar29 == uVar13) goto LAB_008dae90;
                      puVar23 = (ulong *)((long)puVar15 + uVar13);
                      puVar25 = (ulong *)((long)puVar27 + uVar13);
                      if ((uVar29 & 0x18) == 0) goto LAB_008db050;
                    }
                    uVar14 = uVar29 & 0xfffffffffffffff8;
                    puVar25 = (ulong *)((long)puVar27 + uVar14);
                    puVar23 = (ulong *)((long)puVar15 + uVar14);
                    lVar22 = uVar13 - uVar14;
                    puVar16 = (undefined8 *)((long)puVar15 + uVar13);
                    puVar21 = (undefined8 *)
                              ((long)puVar18 + (long)puVar20 + (uVar13 - (long)puVar9) + -8);
                    do {
                      lVar22 = lVar22 + 8;
                      *puVar16 = *puVar21;
                      puVar16 = puVar16 + 1;
                      puVar21 = puVar21 + 1;
                    } while (lVar22 != 0);
                    if (uVar29 == uVar14) goto LAB_008dae90;
                  }
LAB_008db050:
                  do {
                    puVar18 = (ulong *)((long)puVar23 + 1);
                    *(char *)puVar23 = (char)*puVar25;
                    puVar23 = puVar18;
                    puVar25 = (ulong *)((long)puVar25 + 1);
                  } while (puVar18 < __dest);
                }
              }
LAB_008dae90:
              puVar18 = (ulong *)((long)puVar28 + 1);
              bVar7 = (byte)*puVar28;
              while( true ) {
                uVar29 = (ulong)(bVar7 >> 4);
                uVar13 = (ulong)bVar7;
                if (uVar29 == 0xf) goto LAB_008daae8;
                if ((pbVar1 + -0x10 <= puVar18) || (puVar2 + -4 < __dest)) goto LAB_008dab1c;
                uVar14 = *puVar18;
                puVar19 = (ushort *)((long)puVar18 + uVar29);
                uVar13 = uVar13 & 0xf;
                puVar9 = (ulong *)((long)__dest + uVar29);
                __dest[1] = puVar18[1];
                *__dest = uVar14;
                puVar28 = (ulong *)(puVar19 + 1);
                uVar29 = (ulong)*puVar19;
                puVar27 = (ulong *)((long)puVar9 - uVar29);
                if ((uVar13 == 0xf) || ((*puVar19 < 8 || (puVar27 < __src)))) break;
                puVar18 = (ulong *)((long)puVar19 + 3);
                __dest = (ulong *)((long)puVar9 + uVar13 + 4);
                *puVar9 = *puVar27;
                puVar9[1] = puVar27[1];
                *(short *)(puVar9 + 2) = (short)puVar27[2];
                bVar7 = (byte)puVar19[1];
              }
            } while( true );
          }
          puVar28 = puVar18;
          if (((byte *)((long)puVar18 + uVar29) == pbVar1) && (puVar9 <= puVar2)) {
            memmove(__dest,puVar18,uVar29);
            uVar10 = (ulong)(uint)(((int)__dest + (int)uVar29) - (int)param_3);
            goto LAB_008dae28;
          }
LAB_008daa60:
          uVar10 = (ulong)(~(uint)puVar28 + iVar8);
        }
      }
      else {
        uVar10 = LZ4_decompress_safe_withPrefix64k(param_2,param_3,param_4,param_5);
      }
LAB_008dae28:
      if ((int)uVar10 < 1) {
        return uVar10;
      }
      param_1[3] = param_1[3] + (uVar10 & 0xffffffff);
      param_1[1] = param_1[1] + (uVar10 & 0xffffffff);
      return uVar10;
    }
    lVar11 = param_1[1] - uVar10;
    param_1[2] = uVar10;
    *param_1 = lVar11;
    uVar10 = LZ4_decompress_safe_forceExtDict(param_2,param_3,param_4,param_5,lVar11);
    iVar8 = (int)uVar10;
  }
  if (0 < iVar8) {
    param_1[3] = uVar10 & 0xffffffff;
    param_1[1] = (long)param_3 + (uVar10 & 0xffffffff);
  }
  return uVar10;
LAB_008daae8:
  puVar28 = puVar18;
  if (pbVar1 + -0xf <= puVar18) goto LAB_008daa60;
  puVar28 = (ulong *)((long)puVar18 + 1);
  uVar29 = (ulong)(byte)*puVar18;
  puVar18 = puVar28;
  if (uVar29 == 0xff) {
    do {
      puVar28 = puVar18;
      if (pbVar1 + -0xf <= puVar18) goto LAB_008daa60;
      puVar28 = (ulong *)((long)puVar18 + 1);
      uVar14 = *puVar18;
      uVar29 = uVar29 + (byte)uVar14;
      puVar18 = puVar28;
    } while ((ulong)(byte)uVar14 == 0xff);
    if (uVar29 == 0xffffffffffffffff) goto LAB_008daa60;
  }
  uVar29 = uVar29 + 0xf;
  if (CARRY8((ulong)__dest,uVar29)) goto LAB_008daa60;
  puVar18 = puVar28;
  if (CARRY8((ulong)puVar28,uVar29)) goto LAB_008daa60;
  goto LAB_008dab1c;
}

