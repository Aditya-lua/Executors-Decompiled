
ulong FUN_000a25c8(ushort *param_1,int param_2,long param_3,ulong param_4)

{
  uint uVar1;
  byte bVar2;
  ushort uVar3;
  undefined1 in_ZR;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ushort *puVar10;
  undefined8 *in_x9;
  ulong uVar11;
  long in_x10;
  byte *in_x11;
  long in_x12;
  ushort *in_x13;
  undefined8 *in_x14;
  ulong in_x15;
  undefined8 *puVar12;
  ushort *in_x16;
  undefined8 *puVar13;
  ushort *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  ulong unaff_x24;
  ulong uVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  
  while (!(bool)in_ZR) {
    if ((in_x13 <= in_x16) || (in_x14 < in_x9)) {
      uVar4 = in_x15 + param_4;
      puVar6 = (undefined8 *)(param_3 + uVar4);
      param_1 = in_x16;
      if (puVar6 <= (undefined8 *)(in_x12 + -0xc)) goto LAB_000a269c;
      goto LAB_000a2910;
    }
    uVar19 = *(undefined8 *)in_x16;
    in_x9[1] = *(undefined8 *)(in_x16 + 4);
    *in_x9 = uVar19;
    puVar14 = (ushort *)((long)in_x16 + param_4);
    puVar10 = puVar14 + 1;
    uVar17 = (ulong)*puVar14;
    uVar4 = in_x15 + param_4;
    lVar18 = uVar4 - uVar17;
    if (((unaff_x24 & 0xf) == 0xf) || (*puVar14 < 8)) goto LAB_000a2758;
    puVar6 = (undefined8 *)(param_3 + uVar4);
    puVar15 = (undefined8 *)(param_3 + lVar18);
    *puVar6 = *puVar15;
    puVar6[1] = puVar15[1];
    *(undefined2 *)(puVar6 + 2) = *(undefined2 *)(puVar15 + 2);
    in_x15 = (unaff_x24 & 0xf) + uVar4 + 4;
    in_x16 = (ushort *)((long)puVar14 + 3);
    bVar2 = (byte)puVar14[1];
    param_1 = puVar10;
LAB_000a25c0:
    in_x9 = (undefined8 *)(param_3 + in_x15);
    unaff_x24 = (ulong)bVar2;
    param_4 = (ulong)(bVar2 >> 4);
    in_ZR = param_4 == 0xf;
  }
  puVar14 = (ushort *)(in_x11 + -0xf);
  if (in_x16 < puVar14) {
    param_1 = param_1 + 1;
    if (param_1 <= puVar14) {
      param_4 = (ulong)(byte)*in_x16;
      if (param_4 == 0xff) {
        do {
          puVar10 = param_1;
          param_1 = (ushort *)((long)puVar10 + 1);
          if (puVar14 < param_1) goto LAB_000a29e8;
          param_4 = param_4 + (byte)*puVar10;
        } while ((ulong)(byte)*puVar10 == 0xff);
        if (param_4 == 0xffffffffffffffff) {
          param_1 = (ushort *)((long)puVar10 + 1);
          goto LAB_000a29e8;
        }
      }
      param_4 = param_4 + 0xf;
      if ((!CARRY8((ulong)in_x9,param_4)) && (!CARRY8((ulong)param_1,param_4))) {
        uVar4 = in_x15 + param_4;
        puVar6 = (undefined8 *)(param_3 + uVar4);
        if (puVar6 <= (undefined8 *)(in_x12 + -0xc)) {
LAB_000a269c:
          puVar15 = (undefined8 *)(param_3 + in_x15);
          puVar14 = (ushort *)((long)param_1 + param_4);
          if (puVar14 <= in_x11 + -8) {
            uVar17 = in_x15 + param_3 + 8;
            uVar7 = uVar4 + param_3;
            if (uVar4 + param_3 <= uVar17) {
              uVar7 = uVar17;
            }
            uVar17 = (uVar7 + ~in_x15) - param_3;
            if ((uVar17 < 0x38) || ((in_x15 + param_3) - (long)param_1 < 0x40)) {
LAB_000a2738:
              do {
                puVar12 = puVar15 + 1;
                *puVar15 = *(undefined8 *)param_1;
                param_1 = param_1 + 4;
                puVar15 = puVar12;
              } while (puVar12 < puVar6);
            }
            else {
              uVar17 = (uVar17 >> 3) + 1;
              uVar11 = uVar17 & 0x3ffffffffffffff8;
              uVar7 = uVar11;
              puVar10 = param_1 + 0x10;
              puVar12 = (undefined8 *)(in_x15 + param_3 + 0x20);
              do {
                uVar19 = *(undefined8 *)(puVar10 + -0x10);
                uVar21 = *(undefined8 *)(puVar10 + -4);
                uVar20 = *(undefined8 *)(puVar10 + -8);
                uVar23 = *(undefined8 *)(puVar10 + 4);
                uVar22 = *(undefined8 *)puVar10;
                uVar25 = *(undefined8 *)(puVar10 + 0xc);
                uVar24 = *(undefined8 *)(puVar10 + 8);
                puVar12[-3] = *(undefined8 *)(puVar10 + -0xc);
                puVar12[-4] = uVar19;
                puVar12[-1] = uVar21;
                puVar12[-2] = uVar20;
                puVar12[1] = uVar23;
                *puVar12 = uVar22;
                puVar12[3] = uVar25;
                puVar12[2] = uVar24;
                uVar7 = uVar7 - 8;
                puVar10 = puVar10 + 0x20;
                puVar12 = puVar12 + 8;
              } while (uVar7 != 0);
              param_1 = param_1 + uVar11 * 4;
              puVar15 = puVar15 + uVar11;
              if (uVar17 != uVar11) goto LAB_000a2738;
            }
            puVar10 = puVar14 + 1;
            uVar17 = (ulong)*puVar14;
            lVar18 = uVar4 - uVar17;
LAB_000a2758:
            uVar7 = unaff_x24 & 0xf;
            param_1 = puVar10;
            if (uVar7 == 0xf) {
              param_1 = (ushort *)((long)puVar10 + 1);
              if (in_x11 + -4 < param_1) {
                goto LAB_000a29e8;
              }
              uVar11 = (ulong)(byte)*puVar10;
              puVar14 = param_1;
              if (uVar11 == 0xff) {
                do {
                  param_1 = (ushort *)((long)puVar14 + 1);
                  if (in_x11 + -4 < param_1) goto LAB_000a29e8;
                  uVar3 = *puVar14;
                  uVar11 = uVar11 + (byte)uVar3;
                  puVar14 = param_1;
                } while ((ulong)(byte)uVar3 == 0xff);
              }
              uVar7 = uVar11 + 0xf;
              if ((uVar11 == 0xffffffffffffffff) || (CARRY8(param_3 + uVar4,uVar7)))
              goto LAB_000a29e8;
            }
            if (-0x10001 < lVar18) {
              puVar6 = (undefined8 *)(param_3 + uVar4);
              puVar15 = (undefined8 *)(param_3 + lVar18);
              in_x15 = uVar4 + uVar7 + 4;
              puVar12 = (undefined8 *)(param_3 + in_x15);
              if (uVar17 < 8) {
                *(undefined4 *)puVar6 = 0;
                *(undefined1 *)puVar6 = *(undefined1 *)puVar15;
                *(undefined1 *)((long)puVar6 + 1) = *(undefined1 *)((long)puVar15 + 1);
                *(undefined1 *)((long)puVar6 + 2) = *(undefined1 *)((long)puVar15 + 2);
                *(undefined1 *)((long)puVar6 + 3) = *(undefined1 *)((long)puVar15 + 3);
                uVar1 = *(uint *)(&UNK_0080bed8 + uVar17 * 4);
                *(undefined4 *)((long)puVar6 + 4) = *(undefined4 *)((long)puVar15 + (ulong)uVar1);
                puVar13 = (undefined8 *)
                          ((long)((long)puVar15 + (ulong)uVar1) -
                          (long)*(int *)(&UNK_0080bef8 + uVar17 * 4));
                if ((undefined8 *)(in_x12 + -0xc) < puVar12) goto LAB_000a2990;
LAB_000a27e0:
                puVar6[1] = *puVar13;
                if (0x10 < uVar7 + 4) {
                  puVar6 = puVar6 + 2;
                  lVar18 = uVar4 + param_3;
                  uVar17 = in_x15 + param_3;
                  if (in_x15 + param_3 <= lVar18 + 0x18U) {
                    uVar17 = lVar18 + 0x18U;
                  }
                  uVar17 = (uVar17 - lVar18) - 0x11;
                  if ((0x47 < uVar17) && (0x3f < (lVar18 - (long)puVar13) + 8U)) {
                    uVar17 = (uVar17 >> 3) + 1;
                    uVar7 = uVar17 & 0x3ffffffffffffff8;
                    puVar6 = puVar6 + uVar7;
                    puVar15 = (undefined8 *)(uVar4 + param_3 + 0x20);
                    uVar4 = uVar7;
                    puVar5 = puVar13 + 5;
                    do {
                      uVar19 = puVar5[-4];
                      uVar21 = puVar5[-1];
                      uVar20 = puVar5[-2];
                      uVar23 = puVar5[1];
                      uVar22 = *puVar5;
                      uVar25 = puVar5[3];
                      uVar24 = puVar5[2];
                      puVar15[-1] = puVar5[-3];
                      puVar15[-2] = uVar19;
                      puVar15[1] = uVar21;
                      *puVar15 = uVar20;
                      puVar15[3] = uVar23;
                      puVar15[2] = uVar22;
                      puVar15[5] = uVar25;
                      puVar15[4] = uVar24;
                      puVar15 = puVar15 + 8;
                      uVar4 = uVar4 - 8;
                      puVar5 = puVar5 + 8;
                    } while (uVar4 != 0);
                    puVar13 = puVar13 + uVar7;
                    if (uVar17 == uVar7) goto LAB_000a2840;
                  }
                  do {
                    puVar15 = puVar6 + 1;
                    *puVar6 = puVar13[1];
                    puVar6 = puVar15;
                    puVar13 = puVar13 + 1;
                  } while (puVar15 < puVar12);
                }
              }
              else {
                puVar13 = puVar15 + 1;
                *puVar6 = *puVar15;
                if (puVar12 <= (undefined8 *)(in_x12 + -0xc)) goto LAB_000a27e0;
LAB_000a2990:
                puVar6 = puVar6 + 1;
                if ((undefined8 *)(in_x12 + -5) < puVar12) goto LAB_000a29e8;
                puVar15 = (undefined8 *)(in_x12 + -7);
                if (puVar6 < puVar15) {
                  uVar17 = (param_3 + in_x10) - 7;
                  lVar18 = uVar4 + param_3;
                  if (uVar17 <= lVar18 + 0x10U) {
                    uVar17 = lVar18 + 0x10U;
                  }
                  uVar17 = (uVar17 - lVar18) - 9;
                  puVar5 = puVar13;
                  if (uVar17 < 0x38) {
                    puVar8 = puVar6;
LAB_000a2a78:
                    do {
                      puVar9 = puVar8 + 1;
                      *puVar8 = *puVar5;
                      puVar5 = puVar5 + 1;
                      puVar8 = puVar9;
                    } while (puVar9 < puVar15);
                  }
                  else {
                    puVar8 = puVar6;
                    if ((lVar18 - (long)puVar13) + 8U < 0x40) goto LAB_000a2a78;
                    uVar17 = (uVar17 >> 3) + 1;
                    uVar11 = uVar17 & 0x3ffffffffffffff8;
                    puVar5 = puVar13 + uVar11;
                    puVar8 = puVar6 + uVar11;
                    puVar9 = puVar13 + 4;
                    puVar16 = (undefined8 *)(uVar4 + param_3 + 0x28);
                    uVar7 = uVar11;
                    do {
                      uVar19 = puVar9[-4];
                      uVar21 = puVar9[-1];
                      uVar20 = puVar9[-2];
                      uVar23 = puVar9[1];
                      uVar22 = *puVar9;
                      uVar25 = puVar9[3];
                      uVar24 = puVar9[2];
                      puVar16[-3] = puVar9[-3];
                      puVar16[-4] = uVar19;
                      puVar16[-1] = uVar21;
                      puVar16[-2] = uVar20;
                      puVar16[1] = uVar23;
                      *puVar16 = uVar22;
                      puVar16[3] = uVar25;
                      puVar16[2] = uVar24;
                      uVar7 = uVar7 - 8;
                      puVar9 = puVar9 + 8;
                      puVar16 = puVar16 + 8;
                    } while (uVar7 != 0);
                    if (uVar17 != uVar11) goto LAB_000a2a78;
                  }
                  puVar13 = (undefined8 *)((long)puVar13 + ((long)puVar15 - (long)puVar6));
                  puVar6 = puVar15;
                }
                if (puVar6 < puVar12) {
                  uVar17 = (param_3 + in_x10) - 7;
                  uVar4 = uVar4 + param_3 + 8;
                  if (uVar17 <= uVar4) {
                    uVar17 = uVar4;
                  }
                  uVar4 = (in_x15 + param_3) - uVar17;
                  if ((uVar4 < 8) || (uVar17 - (long)puVar13 < 0x40)) {
                    puVar15 = puVar6;
                    puVar5 = puVar13;
                  }
                  else {
                    uVar17 = 0;
                    if (0x3f < uVar4) {
                      uVar17 = uVar4 & 0xffffffffffffffc0;
                      puVar15 = puVar6 + 4;
                      puVar5 = puVar13 + 4;
                      uVar7 = uVar17;
                      do {
                        uVar19 = puVar5[-4];
                        uVar21 = puVar5[-1];
                        uVar20 = puVar5[-2];
                        uVar23 = puVar5[1];
                        uVar22 = *puVar5;
                        uVar25 = puVar5[3];
                        uVar24 = puVar5[2];
                        puVar15[-3] = puVar5[-3];
                        puVar15[-4] = uVar19;
                        puVar15[-1] = uVar21;
                        puVar15[-2] = uVar20;
                        puVar15[1] = uVar23;
                        *puVar15 = uVar22;
                        puVar15[3] = uVar25;
                        puVar15[2] = uVar24;
                        uVar7 = uVar7 - 0x40;
                        puVar15 = puVar15 + 8;
                        puVar5 = puVar5 + 8;
                      } while (uVar7 != 0);
                      if (uVar4 == uVar17) goto LAB_000a2840;
                      puVar15 = (undefined8 *)((long)puVar6 + uVar17);
                      puVar5 = (undefined8 *)((long)puVar13 + uVar17);
                      if ((uVar4 & 0x38) == 0) goto LAB_000a2b54;
                    }
                    uVar7 = uVar4 & 0xfffffffffffffff8;
                    lVar18 = uVar17 - uVar7;
                    puVar15 = (undefined8 *)((long)puVar13 + uVar17);
                    puVar5 = (undefined8 *)((long)puVar6 + uVar17);
                    do {
                      *puVar5 = *puVar15;
                      lVar18 = lVar18 + 8;
                      puVar15 = puVar15 + 1;
                      puVar5 = puVar5 + 1;
                    } while (lVar18 != 0);
                    puVar15 = (undefined8 *)((long)puVar6 + uVar7);
                    puVar5 = (undefined8 *)((long)puVar13 + uVar7);
                    if (uVar4 == uVar7) goto LAB_000a2840;
                  }
LAB_000a2b54:
                  do {
                    puVar6 = (undefined8 *)((long)puVar15 + 1);
                    *(undefined1 *)puVar15 = *(undefined1 *)puVar5;
                    puVar15 = puVar6;
                    puVar5 = (undefined8 *)((long)puVar5 + 1);
                  } while (puVar6 < puVar12);
                }
              }
LAB_000a2840:
              in_x16 = (ushort *)((long)param_1 + 1);
              bVar2 = (byte)*param_1;
              goto LAB_000a25c0;
            }
            goto LAB_000a29e8;
          }
        }
LAB_000a2910:
        if (((byte *)((long)param_1 + param_4) == in_x11) && ((long)uVar4 <= in_x10)) {
          _memmove(param_3 + in_x15,param_1);
          return uVar4;
        }
      }
    }
  }
  else {
    param_1 = in_x16;
  }
LAB_000a29e8:
  return (ulong)(~(uint)param_1 + param_2);
}

