/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dc0d8
 */

ulong LZ4_decompress_safe_partial_usingDict
                (ulong *param_1,ulong *param_2,int param_3,uint param_4,uint param_5,long param_6,
                int param_7)

{
  byte *pbVar1;
  ulong *puVar2;
  size_t sVar3;
  uint uVar4;
  ushort uVar5;
  ulong *puVar6;
  undefined8 *puVar7;
  byte bVar8;
  ulong uVar9;
  ulong *puVar10;
  undefined8 *puVar11;
  ulong *puVar12;
  ushort *puVar13;
  ulong uVar14;
  long lVar15;
  ulong *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  ulong *puVar19;
  ulong *puVar20;
  ulong uVar21;
  long lVar22;
  undefined8 *puVar23;
  undefined8 *puVar24;
  long lVar25;
  ulong uVar26;
  undefined8 *puVar27;
  int iVar28;
  ulong *puVar29;
  ulong *puVar30;
  ulong uVar31;
  undefined8 uVar32;
  ulong uVar33;
  undefined8 uVar34;
  ulong uVar35;
  undefined8 uVar36;
  ulong uVar37;
  ulong uVar38;
  
  if (param_7 == 0) {
    uVar9 = LZ4_decompress_safe_partial(param_1,param_2);
    return uVar9;
  }
  if ((ulong *)(param_6 + param_7) != param_2) {
    uVar9 = LZ4_decompress_safe_partial_forceExtDict(param_1,param_2);
    return uVar9;
  }
  if ((int)param_5 <= (int)param_4) {
    param_4 = param_5;
  }
  uVar9 = (ulong)param_4;
  iVar28 = (int)param_2;
  puVar29 = param_1;
  if (param_7 < 0xffff) {
    if (param_1 == (ulong *)0x0) {
      return 0xffffffff;
    }
    if ((int)param_4 < 0) {
      return 0xffffffff;
    }
    if (param_4 != 0) {
      if (param_3 == 0) {
        return 0xffffffff;
      }
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      puVar2 = (ulong *)((long)param_2 + (ulong)param_4);
      puVar30 = (ulong *)((long)param_2 - (long)param_7);
      if (param_4 < 0x40) goto LAB_008dd224;
      puVar29 = (ulong *)((long)param_1 + 1);
      uVar17 = (ulong)(byte)*param_1;
      uVar9 = (ulong)(byte)((byte)*param_1 >> 4);
      if (0x11 < param_3) {
        puVar19 = puVar2 + -8;
        puVar12 = param_1;
        do {
          if (uVar9 == 0xf) {
            if (pbVar1 + -0xf <= puVar29) goto LAB_008dc994;
            uVar9 = (ulong)(byte)*puVar29;
            puVar29 = (ulong *)((long)puVar12 + 2);
            puVar12 = puVar29;
            if (uVar9 == 0xff) {
              do {
                puVar29 = puVar12;
                if (pbVar1 + -0xf <= puVar12) goto LAB_008dc994;
                puVar29 = (ulong *)((long)puVar12 + 1);
                uVar21 = *puVar12;
                uVar9 = uVar9 + (byte)uVar21;
                puVar12 = puVar29;
              } while ((ulong)(byte)uVar21 == 0xff);
              if (uVar9 == 0xffffffffffffffff) goto LAB_008dc994;
            }
            uVar9 = uVar9 + 0xf;
            if (CARRY8((ulong)puVar29,uVar9)) goto LAB_008dc994;
            puVar20 = (ulong *)((long)param_2 + uVar9);
            if (puVar19 < puVar20) goto LAB_008dcf58;
            puVar13 = (ushort *)((long)puVar29 + uVar9);
            if (pbVar1 + -0x40 < puVar13) goto LAB_008dcf58;
            do {
              uVar31 = puVar29[4];
              uVar21 = puVar29[7];
              uVar9 = puVar29[6];
              uVar14 = puVar29[1];
              uVar26 = *puVar29;
              uVar35 = puVar29[3];
              uVar33 = puVar29[2];
              param_2[5] = puVar29[5];
              param_2[4] = uVar31;
              param_2[7] = uVar21;
              param_2[6] = uVar9;
              puVar12 = param_2 + 8;
              param_2[1] = uVar14;
              *param_2 = uVar26;
              param_2[3] = uVar35;
              param_2[2] = uVar33;
              puVar29 = puVar29 + 8;
              param_2 = puVar12;
            } while (puVar12 < puVar20);
          }
          else {
            uVar21 = *puVar29;
            puVar13 = (ushort *)((long)puVar29 + uVar9);
            puVar20 = (ulong *)((long)param_2 + uVar9);
            param_2[1] = puVar29[1];
            *param_2 = uVar21;
          }
          puVar29 = (ulong *)(puVar13 + 1);
          uVar5 = *puVar13;
          uVar9 = (ulong)uVar5;
          puVar16 = (ulong *)((long)puVar20 - uVar9);
          if ((uVar17 & 0xf) == 0xf) {
            if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
            uVar17 = (ulong)(byte)puVar13[1];
            puVar29 = (ulong *)((long)puVar13 + 3);
            puVar12 = puVar29;
            if (uVar17 == 0xff) {
              do {
                puVar29 = puVar12;
                if (pbVar1 + -6 <= puVar12) goto LAB_008dc994;
                puVar29 = (ulong *)((long)puVar12 + 1);
                uVar21 = *puVar12;
                uVar17 = uVar17 + (byte)uVar21;
                puVar12 = puVar29;
              } while ((ulong)(byte)uVar21 == 0xff);
              if (uVar17 == 0xffffffffffffffff) goto LAB_008dc994;
            }
            uVar17 = uVar17 + 0x13;
            if (CARRY8((ulong)puVar20,uVar17)) goto LAB_008dc994;
            if (puVar19 <= (ulong *)((long)puVar20 + uVar17)) goto LAB_008dd0a8;
LAB_008dc36c:
            if (puVar16 < puVar30) goto LAB_008dc994;
            param_2 = (ulong *)((long)puVar20 + uVar17);
            puVar12 = puVar29;
            if (uVar5 < 0x10) {
              if (uVar5 == 4) {
                uVar31 = (ulong)(uint)*puVar16;
                uVar9 = (ulong)((uint)*puVar16 >> 0x10);
                uVar21 = uVar31 & 0xffff;
              }
              else {
                if (uVar5 == 2) {
                  uVar5 = (ushort)*puVar16;
                  uVar4 = CONCAT22(uVar5,uVar5);
                }
                else {
                  if (uVar5 != 1) {
                    if (uVar5 < 8) {
                      *(undefined4 *)puVar20 = 0;
                      *(short *)puVar20 = (short)*puVar16;
                      *(undefined2 *)((long)puVar20 + 2) = *(undefined2 *)((long)puVar16 + 2);
                      uVar4 = *(uint *)(&DAT_00364e30 + uVar9 * 4);
                      *(undefined4 *)((long)puVar20 + 4) =
                           *(undefined4 *)((long)puVar16 + (ulong)uVar4);
                      puVar29 = (ulong *)((long)((long)puVar16 + (ulong)uVar4) -
                                         (long)*(int *)(&DAT_00364dd0 + uVar9 * 4));
                    }
                    else {
                      puVar29 = puVar16 + 1;
                      *puVar20 = *puVar16;
                    }
                    puVar16 = (ulong *)(uVar17 + (long)puVar20);
                    if ((ulong *)(uVar17 + (long)puVar20) <= puVar20 + 2) {
                      puVar16 = puVar20 + 2;
                    }
                    uVar9 = (long)puVar16 + (-9 - (long)puVar20);
                    if ((uVar9 < 0x18) || ((ulong)((long)puVar20 + (8 - (long)puVar29)) < 0x20)) {
                      puVar20 = puVar20 + 1;
                      puVar16 = puVar29;
                    }
                    else {
                      puVar10 = puVar20 + 3;
                      uVar9 = (uVar9 >> 3) + 1;
                      uVar21 = uVar9 & 0x3ffffffffffffffc;
                      puVar16 = puVar29 + uVar21;
                      puVar20 = puVar20 + 1 + uVar21;
                      puVar29 = puVar29 + 2;
                      uVar17 = uVar21;
                      do {
                        puVar6 = puVar29 + -1;
                        uVar31 = puVar29[-2];
                        uVar14 = puVar29[1];
                        uVar26 = *puVar29;
                        uVar17 = uVar17 - 4;
                        puVar29 = puVar29 + 4;
                        puVar10[-1] = *puVar6;
                        puVar10[-2] = uVar31;
                        puVar10[1] = uVar14;
                        *puVar10 = uVar26;
                        puVar10 = puVar10 + 4;
                      } while (uVar17 != 0);
                      if (uVar9 == uVar21) goto LAB_008dc27c;
                    }
                    do {
                      puVar29 = puVar20 + 1;
                      *puVar20 = *puVar16;
                      puVar20 = puVar29;
                      puVar16 = puVar16 + 1;
                    } while (puVar29 < param_2);
                    goto LAB_008dc27c;
                  }
                  bVar8 = (byte)*puVar16;
                  uVar5 = CONCAT11(bVar8,bVar8);
                  uVar4 = (uint)bVar8 * 0x1010101;
                }
                uVar9 = (ulong)uVar5;
                uVar31 = (ulong)uVar4;
                uVar21 = uVar9;
              }
              uVar9 = uVar21 | uVar9 << 0x10 | uVar31 << 0x20;
              *puVar20 = uVar9;
              if (8 < uVar17) {
                puVar29 = (ulong *)(uVar17 + (long)puVar20);
                if ((ulong *)(uVar17 + (long)puVar20) <= puVar20 + 2) {
                  puVar29 = puVar20 + 2;
                }
                uVar17 = (long)puVar29 + (-9 - (long)puVar20);
                puVar29 = puVar20 + 1;
                if (0x17 < uVar17) {
                  puVar29 = puVar20 + 3;
                  uVar17 = (uVar17 >> 3) + 1;
                  uVar31 = uVar17 & 0x3ffffffffffffffc;
                  uVar21 = uVar31;
                  do {
                    uVar21 = uVar21 - 4;
                    puVar29[-1] = uVar9;
                    puVar29[-2] = uVar9;
                    puVar29[1] = uVar9;
                    *puVar29 = uVar9;
                    puVar29 = puVar29 + 4;
                  } while (uVar21 != 0);
                  puVar29 = puVar20 + 1 + uVar31;
                  if (uVar17 == uVar31) goto LAB_008dc27c;
                }
                do {
                  puVar20 = puVar29 + 1;
                  *puVar29 = uVar9;
                  puVar29 = puVar20;
                } while (puVar20 < param_2);
              }
            }
            else if (uVar5 < 0x40) {
              puVar29 = (ulong *)((long)puVar20 + -uVar9 + 0x10);
              do {
                uVar9 = puVar29[-2];
                puVar20[1] = puVar29[-1];
                *puVar20 = uVar9;
                uVar9 = *puVar29;
                puVar20[3] = puVar29[1];
                puVar20[2] = uVar9;
                puVar20 = puVar20 + 4;
                puVar29 = puVar29 + 4;
              } while (puVar20 < param_2);
            }
            else {
              do {
                puVar29 = (ulong *)((long)puVar20 + -uVar9);
                uVar31 = puVar29[4];
                uVar21 = puVar29[7];
                uVar17 = puVar29[6];
                uVar14 = puVar29[1];
                uVar26 = *puVar29;
                uVar35 = puVar29[3];
                uVar33 = puVar29[2];
                puVar20[5] = puVar29[5];
                puVar20[4] = uVar31;
                puVar20[7] = uVar21;
                puVar20[6] = uVar17;
                puVar29 = puVar20 + 8;
                puVar20[1] = uVar14;
                *puVar20 = uVar26;
                puVar20[3] = uVar35;
                puVar20[2] = uVar33;
                puVar20 = puVar29;
              } while (puVar29 < param_2);
            }
          }
          else {
            uVar17 = (uVar17 & 0xf) + 4;
            param_2 = (ulong *)((long)puVar20 + uVar17);
            if (puVar19 <= param_2) goto LAB_008dd0a8;
            if ((puVar16 < puVar30) || (uVar5 < 8)) goto LAB_008dc36c;
            *puVar20 = *puVar16;
            puVar20[1] = puVar16[1];
            *(short *)(puVar20 + 2) = (short)puVar16[2];
            puVar12 = puVar29;
          }
LAB_008dc27c:
          puVar29 = (ulong *)((long)puVar12 + 1);
          uVar17 = (ulong)(byte)*puVar12;
          uVar9 = (ulong)(byte)((byte)*puVar12 >> 4);
        } while (puVar29 <= pbVar1 + -0x11);
      }
      if (uVar9 == 0xf) goto LAB_008dcf20;
LAB_008dcf54:
      puVar20 = (ulong *)((long)param_2 + uVar9);
LAB_008dcf58:
      if (((ulong *)((long)puVar2 + -0xc) < puVar20) ||
         (puVar13 = (ushort *)((long)puVar29 + uVar9), pbVar1 + -8 < puVar13)) {
        puVar12 = (ulong *)((long)param_2 + ((long)pbVar1 - (long)puVar29));
        if ((byte *)((long)puVar29 + uVar9) <= pbVar1) {
          puVar12 = puVar20;
        }
        if (puVar2 < puVar12) {
          memmove(param_2,puVar29,(long)puVar2 - (long)param_2);
          puVar20 = puVar2;
        }
        else {
          sVar3 = (long)pbVar1 - (long)puVar29;
          if ((byte *)((long)puVar29 + uVar9) <= pbVar1) {
            sVar3 = uVar9;
          }
          memmove(param_2,puVar29,sVar3);
          puVar20 = (ulong *)((long)param_2 + sVar3);
          if ((puVar12 != puVar2) &&
             (puVar13 = (ushort *)((long)puVar29 + sVar3), puVar13 < pbVar1 + -2))
          goto LAB_008dd054;
        }
LAB_008dd2c4:
        return (ulong)(uint)((int)puVar20 - iVar28);
      }
      puVar12 = puVar20;
      if (puVar20 <= param_2 + 1) {
        puVar12 = param_2 + 1;
      }
      if ((0x17 < (long)puVar12 + ~(ulong)param_2) &&
         (0x1f < (ulong)((long)param_2 - (long)puVar29))) {
        puVar19 = param_2 + 2;
        puVar16 = puVar29 + 2;
        uVar9 = ((long)puVar12 + ~(ulong)param_2 >> 3) + 1;
        uVar31 = uVar9 & 0x3ffffffffffffffc;
        uVar21 = uVar31;
        do {
          puVar12 = puVar16 + -1;
          uVar26 = puVar16[-2];
          uVar33 = puVar16[1];
          uVar14 = *puVar16;
          uVar21 = uVar21 - 4;
          puVar16 = puVar16 + 4;
          puVar19[-1] = *puVar12;
          puVar19[-2] = uVar26;
          puVar19[1] = uVar33;
          *puVar19 = uVar14;
          puVar19 = puVar19 + 4;
        } while (uVar21 != 0);
        puVar29 = puVar29 + uVar31;
        param_2 = param_2 + uVar31;
        if (uVar9 == uVar31) goto LAB_008dd054;
      }
      do {
        puVar12 = param_2 + 1;
        *param_2 = *puVar29;
        puVar29 = puVar29 + 1;
        param_2 = puVar12;
      } while (puVar12 < puVar20);
LAB_008dd054:
      puVar29 = (ulong *)(puVar13 + 1);
      uVar9 = (ulong)*puVar13;
      uVar17 = uVar17 & 0xf;
      puVar16 = (ulong *)((long)puVar20 - uVar9);
      do {
        if (uVar17 == 0xf) {
          if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
          uVar21 = (ulong)(byte)*puVar29;
          uVar17 = uVar21;
          while (puVar29 = (ulong *)((long)puVar29 + 1), uVar17 == 0xff) {
            if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
            uVar17 = (ulong)*(byte *)puVar29;
            uVar21 = uVar21 + uVar17;
          }
          uVar17 = uVar21 + 0xf;
          if ((uVar21 == 0xffffffffffffffff) || (CARRY8((ulong)puVar20,uVar17))) goto LAB_008dc994;
        }
        uVar17 = uVar17 + 4;
LAB_008dd0a8:
        if (puVar16 < puVar30) goto LAB_008dc994;
        param_2 = (ulong *)((long)puVar20 + uVar17);
        if ((ulong *)((long)puVar2 + -0xc) < param_2) {
          if ((ulong)((long)puVar2 - (long)puVar20) <= uVar17) {
            uVar17 = (long)puVar2 - (long)puVar20;
          }
          param_2 = (ulong *)((long)puVar20 + uVar17);
          if (puVar20 < (ulong *)((long)puVar16 + uVar17)) {
            if (uVar17 != 0) {
              uVar17 = uVar17 + (long)puVar20;
              if (uVar17 <= (long)puVar20 + 1U) {
                uVar17 = (long)puVar20 + 1;
              }
              uVar17 = uVar17 - (long)puVar20;
              if ((uVar17 < 8) || ((ulong)((long)puVar20 - (long)puVar16) < 0x20)) {
                puVar12 = puVar20;
                puVar19 = puVar16;
              }
              else {
                uVar9 = 0;
                if (0x1f < uVar17) {
                  uVar9 = uVar17 & 0xffffffffffffffe0;
                  puVar12 = puVar16 + 2;
                  puVar19 = puVar20 + 2;
                  uVar21 = uVar9;
                  do {
                    puVar10 = puVar12 + -1;
                    uVar31 = puVar12[-2];
                    uVar14 = puVar12[1];
                    uVar26 = *puVar12;
                    uVar21 = uVar21 - 0x20;
                    puVar12 = puVar12 + 4;
                    puVar19[-1] = *puVar10;
                    puVar19[-2] = uVar31;
                    puVar19[1] = uVar14;
                    *puVar19 = uVar26;
                    puVar19 = puVar19 + 4;
                  } while (uVar21 != 0);
                  if (uVar17 == uVar9) goto LAB_008dd21c;
                  puVar12 = (ulong *)((long)puVar20 + uVar9);
                  puVar19 = (ulong *)((long)puVar16 + uVar9);
                  if ((uVar17 & 0x18) == 0) goto LAB_008dd20c;
                }
                uVar21 = uVar17 & 0xfffffffffffffff8;
                lVar25 = uVar9 - uVar21;
                puVar11 = (undefined8 *)((long)puVar16 + uVar9);
                puVar24 = (undefined8 *)((long)puVar20 + uVar9);
                do {
                  lVar25 = lVar25 + 8;
                  *puVar24 = *puVar11;
                  puVar11 = puVar11 + 1;
                  puVar24 = puVar24 + 1;
                } while (lVar25 != 0);
                puVar12 = (ulong *)((long)puVar20 + uVar21);
                puVar19 = (ulong *)((long)puVar16 + uVar21);
                if (uVar17 == uVar21) goto LAB_008dd21c;
              }
LAB_008dd20c:
              do {
                puVar20 = (ulong *)((long)puVar12 + 1);
                *(char *)puVar12 = (char)*puVar19;
                puVar12 = puVar20;
                puVar19 = (ulong *)((long)puVar19 + 1);
              } while (puVar20 < param_2);
            }
          }
          else {
            memcpy(puVar20,puVar16,uVar17);
          }
LAB_008dd21c:
          if (param_2 == puVar2) {
            puVar20 = puVar2;
            goto LAB_008dd2c4;
          }
        }
        else {
          if (uVar9 < 8) {
            *(undefined4 *)puVar20 = 0;
            *(char *)puVar20 = (char)*puVar16;
            *(undefined1 *)((long)puVar20 + 1) = *(undefined1 *)((long)puVar16 + 1);
            *(undefined1 *)((long)puVar20 + 2) = *(undefined1 *)((long)puVar16 + 2);
            *(undefined1 *)((long)puVar20 + 3) = *(undefined1 *)((long)puVar16 + 3);
            uVar4 = *(uint *)(&DAT_00364e30 + uVar9 * 4);
            *(undefined4 *)((long)puVar20 + 4) = *(undefined4 *)((long)puVar16 + (ulong)uVar4);
            puVar12 = (ulong *)((long)((long)puVar16 + (ulong)uVar4) -
                               (long)*(int *)(&DAT_00364dd0 + uVar9 * 4));
          }
          else {
            puVar12 = puVar16 + 1;
            *puVar20 = *puVar16;
          }
          puVar20[1] = *puVar12;
          if (0x10 < uVar17) {
            puVar19 = (ulong *)(uVar17 + (long)puVar20);
            if ((ulong *)(uVar17 + (long)puVar20) <= puVar20 + 3) {
              puVar19 = puVar20 + 3;
            }
            uVar9 = (long)puVar19 + (-0x11 - (long)puVar20);
            puVar19 = puVar20 + 2;
            if ((0x27 < uVar9) && (0x1f < (ulong)((long)puVar20 + (8 - (long)puVar12)))) {
              puVar16 = puVar12 + 3;
              uVar9 = (uVar9 >> 3) + 1;
              uVar21 = uVar9 & 0x3ffffffffffffffc;
              puVar12 = puVar12 + uVar21;
              puVar19 = puVar19 + uVar21;
              uVar17 = uVar21;
              do {
                puVar10 = puVar16 + -1;
                uVar31 = puVar16[-2];
                uVar14 = puVar16[1];
                uVar26 = *puVar16;
                uVar17 = uVar17 - 4;
                puVar16 = puVar16 + 4;
                puVar20[3] = *puVar10;
                puVar20[2] = uVar31;
                puVar20[5] = uVar14;
                puVar20[4] = uVar26;
                puVar20 = puVar20 + 4;
              } while (uVar17 != 0);
              if (uVar9 == uVar21) goto LAB_008dd224;
            }
            do {
              puVar12 = puVar12 + 1;
              puVar20 = puVar19 + 1;
              *puVar19 = *puVar12;
              puVar19 = puVar20;
            } while (puVar20 < param_2);
          }
        }
LAB_008dd224:
        bVar8 = (byte)*puVar29;
        puVar29 = (ulong *)((long)puVar29 + 1);
        while( true ) {
          uVar9 = (ulong)(bVar8 >> 4);
          uVar17 = (ulong)bVar8;
          if (uVar9 == 0xf) goto LAB_008dcf20;
          if ((pbVar1 + -0x10 <= puVar29) || (puVar2 + -4 < param_2)) goto LAB_008dcf54;
          uVar21 = *puVar29;
          puVar13 = (ushort *)((long)puVar29 + uVar9);
          uVar17 = uVar17 & 0xf;
          puVar20 = (ulong *)((long)param_2 + uVar9);
          param_2[1] = puVar29[1];
          *param_2 = uVar21;
          puVar29 = (ulong *)(puVar13 + 1);
          uVar9 = (ulong)*puVar13;
          puVar16 = (ulong *)((long)puVar20 - uVar9);
          if (((uVar17 == 0xf) || (*puVar13 < 8)) || (puVar16 < puVar30)) break;
          puVar29 = (ulong *)((long)puVar13 + 3);
          param_2 = (ulong *)((long)puVar20 + uVar17 + 4);
          *puVar20 = *puVar16;
          puVar20[1] = puVar16[1];
          *(short *)(puVar20 + 2) = (short)puVar16[2];
          bVar8 = (byte)puVar13[1];
        }
      } while( true );
    }
  }
  else {
    if (param_1 == (ulong *)0x0) {
      return 0xffffffff;
    }
    if ((int)param_4 < 0) {
      return 0xffffffff;
    }
    if (param_4 != 0) {
      if (param_3 == 0) {
        return 0xffffffff;
      }
      pbVar1 = (byte *)((long)param_1 + (long)param_3);
      puVar2 = (ulong *)((long)param_2 + uVar9);
      if (0x3f < param_4) {
        puVar30 = (ulong *)((long)param_1 + 1);
        uVar21 = (ulong)(byte)*param_1;
        uVar17 = (ulong)(byte)((byte)*param_1 >> 4);
        if (param_3 < 0x12) {
          uVar31 = 0;
        }
        else {
          uVar31 = 0;
          puVar19 = puVar2 + -8;
          puVar12 = param_2;
          do {
            if (uVar17 == 0xf) {
              if (pbVar1 + -0xf <= puVar30) {
                puVar29 = puVar30;
                goto LAB_008dc994;
              }
              uVar17 = (ulong)(byte)*puVar30;
              puVar29 = (ulong *)((long)puVar29 + 2);
              puVar30 = puVar29;
              if (uVar17 == 0xff) {
                do {
                  puVar29 = puVar30;
                  if (pbVar1 + -0xf <= puVar30) goto LAB_008dc994;
                  puVar29 = (ulong *)((long)puVar30 + 1);
                  uVar26 = *puVar30;
                  uVar17 = uVar17 + (byte)uVar26;
                  puVar30 = puVar29;
                } while ((ulong)(byte)uVar26 == 0xff);
                if (uVar17 == 0xffffffffffffffff) goto LAB_008dc994;
              }
              uVar17 = uVar17 + 0xf;
              if (CARRY8((ulong)puVar29,uVar17)) goto LAB_008dc994;
              lVar25 = uVar17 + uVar31;
              if (puVar19 < (ulong *)((long)param_2 + lVar25)) goto LAB_008dca60;
              puVar13 = (ushort *)((long)puVar29 + uVar17);
              if (pbVar1 + -0x40 < puVar13) goto LAB_008dca60;
              do {
                uVar26 = puVar29[4];
                uVar31 = puVar29[7];
                uVar17 = puVar29[6];
                uVar33 = puVar29[1];
                uVar14 = *puVar29;
                uVar37 = puVar29[3];
                uVar35 = puVar29[2];
                puVar12[5] = puVar29[5];
                puVar12[4] = uVar26;
                puVar12[7] = uVar31;
                puVar12[6] = uVar17;
                puVar30 = puVar12 + 8;
                puVar12[1] = uVar33;
                *puVar12 = uVar14;
                puVar12[3] = uVar37;
                puVar12[2] = uVar35;
                puVar12 = puVar30;
                puVar29 = puVar29 + 8;
              } while (puVar30 < (ulong *)((long)param_2 + lVar25));
            }
            else {
              uVar26 = *puVar30;
              puVar13 = (ushort *)((long)puVar30 + uVar17);
              lVar25 = uVar31 + uVar17;
              puVar12[1] = puVar30[1];
              *puVar12 = uVar26;
            }
            puVar30 = (ulong *)((long)param_2 + lVar25);
            puVar29 = (ulong *)(puVar13 + 1);
            uVar5 = *puVar13;
            uVar17 = (ulong)uVar5;
            lVar15 = lVar25 - uVar17;
            puVar12 = (ulong *)((long)param_2 + lVar15);
            if ((uVar21 & 0xf) == 0xf) {
              if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
              uVar21 = (ulong)(byte)puVar13[1];
              puVar29 = (ulong *)((long)puVar13 + 3);
              puVar20 = puVar29;
              if (uVar21 == 0xff) {
                do {
                  puVar29 = puVar20;
                  if (pbVar1 + -6 <= puVar20) goto LAB_008dc994;
                  puVar29 = (ulong *)((long)puVar20 + 1);
                  uVar31 = *puVar20;
                  uVar21 = uVar21 + (byte)uVar31;
                  puVar20 = puVar29;
                } while ((ulong)(byte)uVar31 == 0xff);
                if (uVar21 == 0xffffffffffffffff) goto LAB_008dc994;
              }
              uVar21 = uVar21 + 0x13;
              if (CARRY8((ulong)puVar30,uVar21)) goto LAB_008dc994;
              if (puVar19 <= (ulong *)((long)puVar30 + uVar21)) goto LAB_008dcbe0;
LAB_008dc714:
              if (lVar15 < -0x10000) goto LAB_008dc994;
              uVar31 = uVar21 + lVar25;
              puVar20 = (ulong *)((long)param_2 + uVar31);
              if (uVar5 < 0x10) {
                if (uVar5 == 4) {
                  uVar14 = (ulong)(uint)*puVar12;
                  uVar17 = (ulong)((uint)*puVar12 >> 0x10);
                  uVar26 = uVar14 & 0xffff;
                }
                else {
                  if (uVar5 == 2) {
                    uVar5 = (ushort)*puVar12;
                    uVar4 = CONCAT22(uVar5,uVar5);
                  }
                  else {
                    if (uVar5 != 1) {
                      if (uVar5 < 8) {
                        *(undefined4 *)puVar30 = 0;
                        *(short *)puVar30 = (short)*puVar12;
                        *(undefined2 *)((long)puVar30 + 2) = *(undefined2 *)((long)puVar12 + 2);
                        uVar4 = *(uint *)(&DAT_00364e30 + uVar17 * 4);
                        *(undefined4 *)((long)puVar30 + 4) =
                             *(undefined4 *)((long)puVar12 + (ulong)uVar4);
                        puVar16 = (ulong *)((long)((long)puVar12 + (ulong)uVar4) -
                                           (long)*(int *)(&DAT_00364dd0 + uVar17 * 4));
                      }
                      else {
                        puVar16 = puVar12 + 1;
                        *puVar30 = *puVar12;
                      }
                      uVar17 = (long)param_2 + lVar25 + 0x10;
                      uVar21 = (long)param_2 + lVar25 + uVar21;
                      if (uVar21 <= uVar17) {
                        uVar21 = uVar17;
                      }
                      uVar17 = (uVar21 - (lVar25 + (long)param_2)) - 9;
                      if ((uVar17 < 0x18) ||
                         ((ulong)((long)param_2 + ((lVar25 + 8) - (long)puVar16)) < 0x20)) {
                        puVar30 = puVar30 + 1;
                        puVar12 = puVar16;
                      }
                      else {
                        puVar10 = (ulong *)((long)param_2 + lVar25 + 0x18);
                        uVar17 = (uVar17 >> 3) + 1;
                        uVar26 = uVar17 & 0x3ffffffffffffffc;
                        puVar12 = puVar16 + uVar26;
                        puVar30 = puVar30 + 1 + uVar26;
                        puVar16 = puVar16 + 2;
                        uVar21 = uVar26;
                        do {
                          puVar6 = puVar16 + -1;
                          uVar14 = puVar16[-2];
                          uVar35 = puVar16[1];
                          uVar33 = *puVar16;
                          uVar21 = uVar21 - 4;
                          puVar16 = puVar16 + 4;
                          puVar10[-1] = *puVar6;
                          puVar10[-2] = uVar14;
                          puVar10[1] = uVar35;
                          *puVar10 = uVar33;
                          puVar10 = puVar10 + 4;
                        } while (uVar21 != 0);
                        if (uVar17 == uVar26) goto LAB_008dc618;
                      }
                      do {
                        puVar16 = puVar30 + 1;
                        *puVar30 = *puVar12;
                        puVar30 = puVar16;
                        puVar12 = puVar12 + 1;
                      } while (puVar16 < puVar20);
                      goto LAB_008dc618;
                    }
                    bVar8 = (byte)*puVar12;
                    uVar5 = CONCAT11(bVar8,bVar8);
                    uVar4 = (uint)bVar8 * 0x1010101;
                  }
                  uVar14 = (ulong)uVar4;
                  uVar26 = (ulong)uVar5;
                  uVar17 = uVar26;
                }
                uVar17 = uVar26 | uVar17 << 0x10 | uVar14 << 0x20;
                puVar12 = puVar30 + 1;
                *puVar30 = uVar17;
                if (puVar12 < puVar20) {
                  uVar26 = (long)param_2 + lVar25 + 0x10;
                  uVar21 = (long)param_2 + lVar25 + uVar21;
                  if (uVar21 <= uVar26) {
                    uVar21 = uVar26;
                  }
                  uVar21 = (uVar21 - (lVar25 + (long)param_2)) - 9;
                  if (0x17 < uVar21) {
                    puVar30 = (ulong *)((long)param_2 + lVar25 + 0x18);
                    uVar21 = (uVar21 >> 3) + 1;
                    uVar14 = uVar21 & 0x3ffffffffffffffc;
                    uVar26 = uVar14;
                    do {
                      uVar26 = uVar26 - 4;
                      puVar30[-1] = uVar17;
                      puVar30[-2] = uVar17;
                      puVar30[1] = uVar17;
                      *puVar30 = uVar17;
                      puVar30 = puVar30 + 4;
                    } while (uVar26 != 0);
                    puVar12 = puVar12 + uVar14;
                    if (uVar21 == uVar14) goto LAB_008dc618;
                  }
                  do {
                    puVar30 = puVar12 + 1;
                    *puVar12 = uVar17;
                    puVar12 = puVar30;
                  } while (puVar30 < puVar20);
                }
              }
              else if (uVar5 < 0x40) {
                puVar11 = (undefined8 *)((long)param_2 + lVar25 + 0x10);
                puVar24 = (undefined8 *)((long)param_2 + lVar15 + 0x10);
                do {
                  uVar32 = puVar24[-2];
                  puVar30 = puVar11 + 2;
                  puVar11[-1] = puVar24[-1];
                  puVar11[-2] = uVar32;
                  uVar32 = *puVar24;
                  puVar11[1] = puVar24[1];
                  *puVar11 = uVar32;
                  puVar11 = puVar11 + 4;
                  puVar24 = puVar24 + 4;
                } while (puVar30 < puVar20);
              }
              else {
                do {
                  puVar12 = (ulong *)((long)puVar30 - uVar17);
                  uVar14 = puVar12[4];
                  uVar26 = puVar12[7];
                  uVar21 = puVar12[6];
                  uVar35 = puVar12[1];
                  uVar33 = *puVar12;
                  uVar38 = puVar12[3];
                  uVar37 = puVar12[2];
                  puVar30[5] = puVar12[5];
                  puVar30[4] = uVar14;
                  puVar30[7] = uVar26;
                  puVar30[6] = uVar21;
                  puVar12 = puVar30 + 8;
                  puVar30[1] = uVar35;
                  *puVar30 = uVar33;
                  puVar30[3] = uVar38;
                  puVar30[2] = uVar37;
                  puVar30 = puVar12;
                } while (puVar12 < puVar20);
              }
            }
            else {
              uVar21 = (uVar21 & 0xf) + 4;
              uVar31 = lVar25 + uVar21;
              if (puVar19 <= (ulong *)((long)param_2 + uVar31)) goto LAB_008dcbe0;
              if (uVar5 < 8) goto LAB_008dc714;
              *puVar30 = *puVar12;
              puVar30[1] = puVar12[1];
              *(short *)(puVar30 + 2) = (short)puVar12[2];
            }
LAB_008dc618:
            puVar12 = (ulong *)((long)param_2 + uVar31);
            puVar30 = (ulong *)((long)puVar29 + 1);
            uVar21 = (ulong)(byte)*puVar29;
            uVar17 = (ulong)(byte)((byte)*puVar29 >> 4);
          } while (puVar30 <= pbVar1 + -0x11);
        }
        puVar29 = puVar30;
        if (uVar17 == 0xf) goto LAB_008dca24;
        goto LAB_008dca5c;
      }
      uVar31 = 0;
LAB_008dcde0:
      do {
        puVar30 = (ulong *)((long)puVar29 + 1);
        bVar8 = (byte)*puVar29;
        while( true ) {
          uVar17 = (ulong)(bVar8 >> 4);
          uVar21 = (ulong)bVar8;
          if (uVar17 == 0xf) break;
          puVar29 = puVar30;
          if ((pbVar1 + -0x10 <= puVar30) ||
             (puVar12 = (ulong *)((long)param_2 + uVar31), puVar2 + -4 < puVar12))
          goto LAB_008dca5c;
          uVar26 = *puVar30;
          puVar13 = (ushort *)((long)puVar30 + uVar17);
          uVar21 = uVar21 & 0xf;
          puVar12[1] = puVar30[1];
          *puVar12 = uVar26;
          lVar25 = uVar31 + uVar17;
          puVar29 = (ulong *)(puVar13 + 1);
          uVar17 = (ulong)*puVar13;
          lVar15 = lVar25 - uVar17;
          if ((uVar21 == 0xf) || (*puVar13 < 8)) goto LAB_008dcb98;
          puVar11 = (undefined8 *)((long)param_2 + lVar15);
          puVar24 = (undefined8 *)((long)param_2 + lVar25);
          uVar31 = uVar21 + lVar25 + 4;
          puVar30 = (ulong *)((long)puVar13 + 3);
          *puVar24 = *puVar11;
          puVar24[1] = puVar11[1];
          *(undefined2 *)(puVar24 + 2) = *(undefined2 *)(puVar11 + 2);
          bVar8 = (byte)puVar13[1];
        }
LAB_008dca24:
        puVar29 = puVar30;
        if (pbVar1 + -0xf <= puVar30) {
LAB_008dc994:
          return (ulong)(~(uint)puVar29 + (int)param_1);
        }
        puVar29 = (ulong *)((long)puVar30 + 1);
        uVar17 = (ulong)(byte)*puVar30;
        puVar30 = puVar29;
        if (uVar17 == 0xff) {
          do {
            puVar29 = puVar30;
            if (pbVar1 + -0xf <= puVar30) goto LAB_008dc994;
            puVar29 = (ulong *)((long)puVar30 + 1);
            uVar26 = *puVar30;
            uVar17 = uVar17 + (byte)uVar26;
            puVar30 = puVar29;
          } while ((ulong)(byte)uVar26 == 0xff);
          if (uVar17 == 0xffffffffffffffff) goto LAB_008dc994;
        }
        uVar17 = uVar17 + 0xf;
        if (CARRY8((long)param_2 + uVar31,uVar17)) goto LAB_008dc994;
        if (CARRY8((ulong)puVar29,uVar17)) goto LAB_008dc994;
LAB_008dca5c:
        lVar25 = uVar17 + uVar31;
LAB_008dca60:
        puVar30 = (ulong *)((long)param_2 + lVar25);
        puVar12 = (ulong *)((long)param_2 + uVar31);
        if (((ulong *)((long)puVar2 - 0xcU) < puVar30) ||
           (puVar13 = (ushort *)((long)puVar29 + uVar17), pbVar1 + -8 < puVar13)) {
          puVar19 = (ulong *)((long)puVar12 + ((long)pbVar1 - (long)puVar29));
          if ((byte *)((long)puVar29 + uVar17) <= pbVar1) {
            puVar19 = puVar30;
          }
          if (puVar2 < puVar19) {
            memmove(puVar12,puVar29,uVar9 - uVar31);
            return (ulong)(uint)((int)puVar2 - iVar28);
          }
          sVar3 = (long)pbVar1 - (long)puVar29;
          if ((byte *)((long)puVar29 + uVar17) <= pbVar1) {
            sVar3 = uVar17;
          }
          memmove(puVar12,puVar29,sVar3);
          lVar25 = uVar31 + sVar3;
          puVar11 = (undefined8 *)((long)param_2 + lVar25);
          if ((puVar19 == puVar2) ||
             (puVar13 = (ushort *)((long)puVar29 + sVar3), pbVar1 + -2 <= puVar13))
          goto LAB_008dcdf4;
        }
        else {
          uVar17 = (long)param_2 + uVar31 + 8;
          if (uVar17 <= (ulong)(lVar25 + (long)param_2)) {
            uVar17 = lVar25 + (long)param_2;
          }
          uVar17 = (uVar17 + ~uVar31) - (long)param_2;
          puVar19 = puVar29;
          if (uVar17 < 0x28) {
          }
          else if (0x1f < (long)param_2 + (uVar31 - (long)puVar29)) {
            uVar17 = (uVar17 >> 3) + 1;
            uVar26 = uVar17 & 0x3ffffffffffffffc;
            puVar19 = puVar29 + uVar26;
            puVar12 = puVar12 + uVar26;
            puVar20 = (ulong *)((long)param_2 + uVar31 + 0x10);
            puVar29 = puVar29 + 2;
            uVar31 = uVar26;
            do {
              puVar16 = puVar29 + -1;
              uVar14 = puVar29[-2];
              uVar35 = puVar29[1];
              uVar33 = *puVar29;
              uVar31 = uVar31 - 4;
              puVar29 = puVar29 + 4;
              puVar20[-1] = *puVar16;
              puVar20[-2] = uVar14;
              puVar20[1] = uVar35;
              *puVar20 = uVar33;
              puVar20 = puVar20 + 4;
            } while (uVar31 != 0);
            if (uVar17 == uVar26) goto LAB_008dcb88;
          }
          do {
            puVar29 = puVar12 + 1;
            *puVar12 = *puVar19;
            puVar12 = puVar29;
            puVar19 = puVar19 + 1;
          } while (puVar29 < puVar30);
        }
LAB_008dcb88:
        puVar29 = (ulong *)(puVar13 + 1);
        uVar17 = (ulong)*puVar13;
        uVar21 = uVar21 & 0xf;
        lVar15 = lVar25 - uVar17;
LAB_008dcb98:
        if (uVar21 == 0xf) {
          if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
          uVar31 = (ulong)(byte)*puVar29;
          uVar21 = uVar31;
          while (puVar29 = (ulong *)((long)puVar29 + 1), uVar21 == 0xff) {
            if (pbVar1 + -6 <= puVar29) goto LAB_008dc994;
            uVar21 = (ulong)*(byte *)puVar29;
            uVar31 = uVar31 + uVar21;
          }
          uVar21 = uVar31 + 0xf;
          if ((uVar31 == 0xffffffffffffffff) || (CARRY8((long)param_2 + lVar25,uVar21)))
          goto LAB_008dc994;
        }
        uVar21 = uVar21 + 4;
LAB_008dcbe0:
        if (lVar15 < -0x10000) goto LAB_008dc994;
        uVar31 = lVar25 + uVar21;
        puVar24 = (undefined8 *)((long)param_2 + lVar25);
        puVar27 = (undefined8 *)((long)param_2 + lVar15);
        if ((undefined8 *)((long)puVar2 - 0xcU) < (undefined8 *)((long)param_2 + uVar31))
        goto code_r0x008dcc04;
        if (uVar17 < 8) {
          *(undefined4 *)puVar24 = 0;
          *(undefined1 *)puVar24 = *(undefined1 *)puVar27;
          *(undefined1 *)((long)puVar24 + 1) = *(undefined1 *)((long)puVar27 + 1);
          *(undefined1 *)((long)puVar24 + 2) = *(undefined1 *)((long)puVar27 + 2);
          *(undefined1 *)((long)puVar24 + 3) = *(undefined1 *)((long)puVar27 + 3);
          uVar4 = *(uint *)(&DAT_00364e30 + uVar17 * 4);
          *(undefined4 *)((long)puVar24 + 4) = *(undefined4 *)((long)puVar27 + (ulong)uVar4);
          puVar11 = (undefined8 *)
                    ((long)((long)puVar27 + (ulong)uVar4) -
                    (long)*(int *)(&DAT_00364dd0 + uVar17 * 4));
        }
        else {
          puVar11 = puVar27 + 1;
          *puVar24 = *puVar27;
        }
        puVar24[1] = *puVar11;
      } while (uVar21 < 0x11);
      lVar15 = lVar25 + (long)param_2;
      uVar17 = lVar15 + uVar21;
      if (lVar15 + uVar21 <= lVar15 + 0x18U) {
        uVar17 = lVar15 + 0x18U;
      }
      uVar17 = (uVar17 - lVar15) - 0x11;
      puVar24 = puVar24 + 2;
      if ((0x37 < uVar17) && (0x1f < (lVar15 - (long)puVar11) + 8U)) {
        uVar17 = (uVar17 >> 3) + 1;
        uVar26 = uVar17 & 0x3ffffffffffffffc;
        puVar24 = puVar24 + uVar26;
        puVar27 = puVar11 + 3;
        uVar21 = uVar26;
        puVar18 = (undefined8 *)(lVar25 + (long)param_2);
        do {
          puVar23 = puVar27 + -1;
          uVar32 = puVar27[-2];
          uVar36 = puVar27[1];
          uVar34 = *puVar27;
          uVar21 = uVar21 - 4;
          puVar27 = puVar27 + 4;
          puVar18[3] = *puVar23;
          puVar18[2] = uVar32;
          puVar18[5] = uVar36;
          puVar18[4] = uVar34;
          puVar18 = puVar18 + 4;
        } while (uVar21 != 0);
        puVar11 = puVar11 + uVar26;
        if (uVar17 == uVar26) goto LAB_008dcde0;
      }
      do {
        puVar27 = puVar24 + 1;
        *puVar24 = puVar11[1];
        puVar24 = puVar27;
        puVar11 = puVar11 + 1;
      } while (puVar27 < (undefined8 *)((long)param_2 + uVar31));
      goto LAB_008dcde0;
    }
  }
  return 0;
LAB_008dcf20:
  if (pbVar1 + -0xf <= puVar29) goto LAB_008dc994;
  uVar9 = (ulong)(byte)*puVar29;
  puVar12 = (ulong *)((long)puVar29 + 1);
  puVar29 = (ulong *)((long)puVar29 + 1);
  if (uVar9 == 0xff) {
    do {
      puVar29 = puVar12;
      if (pbVar1 + -0xf <= puVar12) goto LAB_008dc994;
      puVar29 = (ulong *)((long)puVar12 + 1);
      uVar21 = *puVar12;
      uVar9 = uVar9 + (byte)uVar21;
      puVar12 = puVar29;
    } while ((ulong)(byte)uVar21 == 0xff);
    if (uVar9 == 0xffffffffffffffff) goto LAB_008dc994;
  }
  uVar9 = uVar9 + 0xf;
  if ((CARRY8((ulong)param_2,uVar9)) || (CARRY8((ulong)puVar29,uVar9))) goto LAB_008dc994;
  goto LAB_008dcf54;
code_r0x008dcc04:
  if (uVar9 - lVar25 <= uVar21) {
    uVar21 = uVar9 - lVar25;
  }
  uVar31 = uVar21 + lVar25;
  puVar11 = (undefined8 *)((long)param_2 + uVar31);
  if (puVar24 < (undefined8 *)((long)puVar27 + uVar21)) {
    if (0 < (long)uVar21) {
      lVar22 = lVar25 + (long)param_2;
      uVar21 = lVar22 + uVar21;
      if (uVar21 <= lVar22 + 1U) {
        uVar21 = lVar22 + 1;
      }
      uVar21 = uVar21 - lVar22;
      puVar18 = puVar27;
      if (uVar21 < 8) {
        puVar23 = puVar24;
      }
      else {
        puVar23 = puVar24;
        if (0x1f < (ulong)(lVar25 - lVar15)) {
          uVar17 = 0;
          if (0x1f < uVar21) {
            uVar17 = uVar21 & 0xffffffffffffffe0;
            puVar18 = (undefined8 *)((long)param_2 + lVar15 + 0x10);
            puVar23 = (undefined8 *)((long)param_2 + lVar25 + 0x10);
            uVar26 = uVar17;
            do {
              puVar7 = puVar18 + -1;
              uVar32 = puVar18[-2];
              uVar36 = puVar18[1];
              uVar34 = *puVar18;
              uVar26 = uVar26 - 0x20;
              puVar18 = puVar18 + 4;
              puVar23[-1] = *puVar7;
              puVar23[-2] = uVar32;
              puVar23[1] = uVar36;
              *puVar23 = uVar34;
              puVar23 = puVar23 + 4;
            } while (uVar26 != 0);
            if (uVar21 == uVar17) goto LAB_008dcdd8;
            puVar23 = (undefined8 *)((long)puVar24 + uVar17);
            puVar18 = (undefined8 *)((long)puVar27 + uVar17);
            if ((uVar21 & 0x18) == 0) goto LAB_008dcdc8;
          }
          uVar26 = uVar21 & 0xfffffffffffffff8;
          lVar22 = uVar17 - uVar26;
          puVar18 = (undefined8 *)((long)param_2 + lVar15 + uVar17);
          puVar23 = (undefined8 *)((long)param_2 + lVar25 + uVar17);
          do {
            lVar22 = lVar22 + 8;
            *puVar23 = *puVar18;
            puVar18 = puVar18 + 1;
            puVar23 = puVar23 + 1;
          } while (lVar22 != 0);
          puVar23 = (undefined8 *)((long)puVar24 + uVar26);
          puVar18 = (undefined8 *)((long)puVar27 + uVar26);
          if (uVar21 == uVar26) goto LAB_008dcdd8;
        }
      }
LAB_008dcdc8:
      do {
        puVar24 = (undefined8 *)((long)puVar23 + 1);
        *(undefined1 *)puVar23 = *(undefined1 *)puVar18;
        puVar23 = puVar24;
        puVar18 = (undefined8 *)((long)puVar18 + 1);
      } while (puVar24 < puVar11);
    }
  }
  else {
    memcpy(puVar24,puVar27,uVar21);
  }
LAB_008dcdd8:
  if (uVar31 == uVar9) {
LAB_008dcdf4:
    return (ulong)(uint)((int)puVar11 - iVar28);
  }
  goto LAB_008dcde0;
}

