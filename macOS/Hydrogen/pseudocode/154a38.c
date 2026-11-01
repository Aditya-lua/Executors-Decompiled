
ulong FUN_00154a38(ulong param_1)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort *puVar4;
  undefined4 *puVar5;
  uint uVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  bool in_ZR;
  bool in_CY;
  bool bVar10;
  ulong uVar11;
  undefined *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong in_x4;
  undefined8 *in_x6;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined8 *in_x9;
  undefined8 *puVar18;
  undefined8 in_x10;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined8 *in_x12;
  uint uVar21;
  ulong unaff_x19;
  long lVar22;
  long unaff_x21;
  long unaff_x22;
  long lVar23;
  undefined8 *unaff_x23;
  undefined8 *puVar24;
  int unaff_w24;
  undefined *unaff_x25;
  undefined8 *unaff_x26;
  int unaff_w27;
  ulong uVar25;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar26;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong uStack0000000000000028;
  undefined8 *in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  ulong in_stack_00000048;
  uint in_stack_00000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  uStack0000000000000028 = in_x4;
  if ((in_CY && !in_ZR) || (uVar15 = param_1 + unaff_x28, in_x4 < (long)unaff_x26 + uVar15)) {
    *(ulong *)(unaff_x29 + -0x70) = param_1;
    *(ulong *)(unaff_x29 + -0x68) = unaff_x28;
    *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
    uVar15 = func_0x00155c78();
    uVar14 = uStack0000000000000028;
  }
  else {
    uVar26 = *in_x12;
    unaff_x26[1] = in_x12[1];
    *unaff_x26 = uVar26;
    if (0x10 < param_1) {
      uVar26 = in_x12[2];
      unaff_x26[3] = in_x12[3];
      unaff_x26[2] = uVar26;
      if (0x10 < param_1 - 0x10) {
        puVar17 = unaff_x26 + 4;
        puVar24 = in_x12 + 6;
        do {
          uVar26 = puVar24[-2];
          puVar17[1] = puVar24[-1];
          *puVar17 = uVar26;
          uVar26 = *puVar24;
          puVar17[3] = puVar24[1];
          puVar17[2] = uVar26;
          puVar17 = puVar17 + 4;
          puVar24 = puVar24 + 4;
        } while (puVar17 < unaff_x23);
      }
    }
    *(undefined8 *)(unaff_x29 + -0x78) = in_x10;
    if ((ulong)((long)unaff_x23 - (long)in_x6) < unaff_x19) {
      if ((ulong)((long)unaff_x23 - in_stack_00000040) < unaff_x19) {
        return 0xffffffffffffffec;
      }
      lVar23 = (long)in_x9 - (long)in_x6;
      if (in_stack_00000038 + lVar23 + unaff_x28 <= in_stack_00000038) {
        _memmove();
        unaff_x22 = in_stack_00000018;
        uVar14 = uStack0000000000000028;
        goto joined_r0x00154b24;
      }
      _memmove();
      unaff_x23 = (undefined8 *)((long)unaff_x23 - lVar23);
      unaff_x28 = lVar23 + unaff_x28;
      in_x9 = in_x6;
      unaff_x22 = in_stack_00000018;
    }
    uVar14 = uStack0000000000000028;
    if (unaff_x19 < 0x10) {
      if (unaff_x19 < 8) {
        iVar1 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
        *(undefined1 *)unaff_x23 = *(undefined1 *)in_x9;
        *(undefined1 *)((long)unaff_x23 + 1) = *(undefined1 *)((long)in_x9 + 1);
        *(undefined1 *)((long)unaff_x23 + 2) = *(undefined1 *)((long)in_x9 + 2);
        *(undefined1 *)((long)unaff_x23 + 3) = *(undefined1 *)((long)in_x9 + 3);
        puVar5 = (undefined4 *)((long)in_x9 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4));
        in_x9 = (undefined8 *)((long)puVar5 - (long)iVar1);
        *(undefined4 *)((long)unaff_x23 + 4) = *puVar5;
      }
      else {
        *unaff_x23 = *in_x9;
      }
      unaff_x22 = in_stack_00000018;
      if (8 < unaff_x28) {
        puVar17 = in_x9 + 1;
        puVar24 = unaff_x23 + 1;
        if ((long)puVar24 - (long)puVar17 < 0x10) {
          do {
            puVar18 = puVar24 + 1;
            *puVar24 = *puVar17;
            puVar17 = puVar17 + 1;
            puVar24 = puVar18;
          } while (puVar18 < (undefined8 *)((long)unaff_x23 + unaff_x28));
        }
        else {
          uVar26 = *puVar17;
          unaff_x23[2] = in_x9[2];
          *puVar24 = uVar26;
          if (0x10 < unaff_x28 - 8) {
            puVar17 = unaff_x23 + 3;
            puVar24 = in_x9 + 5;
            do {
              uVar26 = puVar24[-2];
              puVar17[1] = puVar24[-1];
              *puVar17 = uVar26;
              uVar26 = *puVar24;
              puVar17[3] = puVar24[1];
              puVar17[2] = uVar26;
              puVar17 = puVar17 + 4;
              puVar24 = puVar24 + 4;
            } while (puVar17 < (undefined8 *)((long)unaff_x23 + unaff_x28));
          }
        }
      }
    }
    else {
      uVar26 = *in_x9;
      unaff_x23[1] = in_x9[1];
      *unaff_x23 = uVar26;
      if (0x10 < unaff_x28) {
        puVar17 = unaff_x23 + 2;
        do {
          uVar26 = in_x9[2];
          puVar17[1] = in_x9[3];
          *puVar17 = uVar26;
          uVar26 = in_x9[4];
          puVar17[3] = in_x9[5];
          puVar17[2] = uVar26;
          puVar17 = puVar17 + 4;
          in_x9 = in_x9 + 4;
        } while (puVar17 < (undefined8 *)((long)unaff_x23 + unaff_x28));
      }
    }
  }
joined_r0x00154b24:
  if (0xffffffffffffff88 < uVar15) {
    return uVar15;
  }
  puVar17 = (undefined8 *)((long)unaff_x26 + uVar15);
  uStack0000000000000028 = uVar14;
  if (unaff_w27 < 2) {
    if (unaff_w24 != 0) {
      return 0xffffffffffffffec;
    }
  }
  else {
    do {
      puVar2 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
      puVar3 = (ushort *)(in_stack_00000098 + in_stack_00000090 * 8);
      puVar4 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
      uVar25 = (ulong)*(uint *)(puVar3 + 2);
      uVar15 = (ulong)*(uint *)(puVar2 + 2);
      uVar6 = *(uint *)(puVar4 + 2);
      bVar7 = (byte)puVar2[1];
      bVar8 = (byte)puVar3[1];
      bVar9 = (byte)puVar4[1];
      uVar21 = (uint)bVar9;
      puVar24 = in_stack_00000030;
      if (bVar9 < 2) {
        bVar10 = *(uint *)(puVar2 + 2) == 0;
        if (bVar9 != 0) {
          if (bVar10) {
            uVar6 = uVar6 + 1;
          }
          uVar14 = (ulong)in_stack_00000050;
          in_stack_00000050 = in_stack_00000050 + 1;
          lVar23 = (ulong)uVar6 - ((long)(in_stack_00000048 << (uVar14 & 0x3f)) >> 0x3f);
          if (lVar23 == 3) {
            uVar13 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
            uVar14 = uStack0000000000000028;
          }
          else {
            uVar13 = (&uStack00000000000000a0)[lVar23] -
                     (ulong)((&uStack00000000000000a0)[lVar23] == 0);
            uVar14 = uStack0000000000000028;
            if (lVar23 == 1) goto LAB_00154bdc;
          }
          goto code_r0x00154bb0;
        }
        uVar13 = (&uStack00000000000000a0)[bVar10];
        puVar24 = &uStack00000000000000a0 + !bVar10;
      }
      else {
        uVar13 = (ulong)in_stack_00000050;
        in_stack_00000050 = in_stack_00000050 + uVar21;
        uVar13 = ((in_stack_00000048 << (uVar13 & 0x3f)) >> ((ulong)-uVar21 & 0x3f)) + (ulong)uVar6;
code_r0x00154bb0:
        in_stack_000000b0 = in_stack_000000a8;
      }
LAB_00154bdc:
      uStack00000000000000a0 = uVar13;
      in_stack_000000a8 = *puVar24;
      if (bVar8 != 0) {
        uVar11 = (ulong)in_stack_00000050;
        in_stack_00000050 = in_stack_00000050 + bVar8;
        uVar25 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar25;
      }
      if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar21 & 0xff)) {
        if (in_stack_00000050 < 0x41) {
          if (in_stack_00000058 < in_stack_00000068) {
            uVar14 = uStack0000000000000028;
            if (in_stack_00000058 != in_stack_00000060) {
              uVar6 = (int)in_stack_00000058 - (int)in_stack_00000060;
              if (in_stack_00000060 <=
                  (ulong *)((long)in_stack_00000058 - (ulong)(in_stack_00000050 >> 3))) {
                uVar6 = in_stack_00000050 >> 3;
              }
              in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar6);
              in_stack_00000050 = in_stack_00000050 + uVar6 * -8;
              in_stack_00000048 = *in_stack_00000058;
            }
          }
          else {
            in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)(in_stack_00000050 >> 3))
            ;
            in_stack_00000050 = in_stack_00000050 & 7;
            in_stack_00000048 = *in_stack_00000058;
            uVar14 = uStack0000000000000028;
          }
        }
        else {
          in_stack_00000058 = (ulong *)&UNK_00814388;
          uVar14 = uStack0000000000000028;
        }
      }
      if (bVar7 != 0) {
        uVar11 = (ulong)in_stack_00000050;
        in_stack_00000050 = in_stack_00000050 + bVar7;
        uVar15 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar15;
      }
      if (unaff_w24 != 1) {
        iVar1 = in_stack_00000050 + *(byte *)((long)puVar2 + 3);
        in_stack_00000070 =
             (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
             (ulong)*puVar2;
        iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
        in_stack_00000090 =
             (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
             (ulong)*puVar3;
        in_stack_00000050 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
        in_stack_00000080 =
             (in_stack_00000048 >> ((ulong)-in_stack_00000050 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
             (ulong)*puVar4;
        if (in_stack_00000050 < 0x41) {
          if (in_stack_00000058 < in_stack_00000068) {
            if (in_stack_00000058 == in_stack_00000060) goto LAB_00154d14;
            uVar6 = (int)in_stack_00000058 - (int)in_stack_00000060;
            if (in_stack_00000060 <=
                (ulong *)((long)in_stack_00000058 - (ulong)(in_stack_00000050 >> 3))) {
              uVar6 = in_stack_00000050 >> 3;
            }
            in_stack_00000050 = in_stack_00000050 + uVar6 * -8;
          }
          else {
            uVar6 = in_stack_00000050 >> 3;
            in_stack_00000050 = in_stack_00000050 & 7;
          }
          in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar6);
          in_stack_00000048 = *in_stack_00000058;
        }
        else {
          in_stack_00000058 = (ulong *)&UNK_00814388;
        }
      }
LAB_00154d14:
      puVar19 = *(undefined8 **)(unaff_x29 + -0x78);
      puVar24 = (undefined8 *)((long)puVar17 + uVar15);
      puVar18 = (undefined8 *)((long)puVar24 - uVar13);
      Hint_Prefetch(puVar18,0,0,0);
      if ((unaff_x25 < (undefined *)((long)puVar19 + uVar15)) ||
         (uVar11 = uVar15 + uVar25, uVar14 < (long)puVar17 + uVar11)) {
        *(ulong *)(unaff_x29 + -0x70) = uVar15;
        *(ulong *)(unaff_x29 + -0x68) = uVar25;
        *(ulong *)(unaff_x29 + -0x60) = uVar13;
        uVar11 = func_0x00155c78(puVar17,in_stack_00000018,unaff_x29 + -0x70,unaff_x29 + -0x78);
        uVar14 = uStack0000000000000028;
      }
      else {
        uVar26 = *puVar19;
        puVar17[1] = puVar19[1];
        *puVar17 = uVar26;
        if (0x10 < uVar15) {
          uVar26 = puVar19[2];
          puVar17[3] = puVar19[3];
          puVar17[2] = uVar26;
          if (0x10 < uVar15 - 0x10) {
            puVar16 = puVar17 + 4;
            puVar20 = puVar19 + 6;
            do {
              uVar26 = puVar20[-2];
              puVar16[1] = puVar20[-1];
              *puVar16 = uVar26;
              uVar26 = *puVar20;
              puVar16[3] = puVar20[1];
              puVar16[2] = uVar26;
              puVar16 = puVar16 + 4;
              puVar20 = puVar20 + 4;
            } while (puVar16 < puVar24);
          }
        }
        *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)puVar19 + uVar15);
        if ((ulong)((long)puVar24 - (long)in_x6) < uVar13) {
          if ((ulong)((long)puVar24 - in_stack_00000040) < uVar13) {
            return 0xffffffffffffffec;
          }
          lVar22 = (long)puVar18 - (long)in_x6;
          lVar23 = in_stack_00000038 + lVar22;
          if (lVar23 + uVar25 <= in_stack_00000038) {
            _memmove(puVar24,lVar23,uVar25);
            uVar14 = uStack0000000000000028;
            goto joined_r0x00154e58;
          }
          _memmove(puVar24,lVar23,-lVar22);
          puVar24 = (undefined8 *)((long)puVar24 - lVar22);
          uVar25 = lVar22 + uVar25;
          uVar14 = uStack0000000000000028;
          puVar18 = in_x6;
        }
        if (uVar13 < 0x10) {
          if (uVar13 < 8) {
            iVar1 = *(int *)(&UNK_008143b0 + uVar13 * 4);
            *(undefined1 *)puVar24 = *(undefined1 *)puVar18;
            *(undefined1 *)((long)puVar24 + 1) = *(undefined1 *)((long)puVar18 + 1);
            *(undefined1 *)((long)puVar24 + 2) = *(undefined1 *)((long)puVar18 + 2);
            *(undefined1 *)((long)puVar24 + 3) = *(undefined1 *)((long)puVar18 + 3);
            puVar5 = (undefined4 *)((long)puVar18 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
            puVar18 = (undefined8 *)((long)puVar5 - (long)iVar1);
            *(undefined4 *)((long)puVar24 + 4) = *puVar5;
          }
          else {
            *puVar24 = *puVar18;
          }
          uVar14 = uStack0000000000000028;
          if (8 < uVar25) {
            puVar19 = puVar18 + 1;
            puVar16 = puVar24 + 1;
            if ((long)puVar16 - (long)puVar19 < 0x10) {
              do {
                puVar18 = puVar16 + 1;
                *puVar16 = *puVar19;
                puVar19 = puVar19 + 1;
                puVar16 = puVar18;
              } while (puVar18 < (undefined8 *)((long)puVar24 + uVar25));
            }
            else {
              uVar26 = *puVar19;
              puVar24[2] = puVar18[2];
              *puVar16 = uVar26;
              if (0x10 < uVar25 - 8) {
                puVar19 = puVar24 + 3;
                puVar18 = puVar18 + 5;
                do {
                  uVar26 = puVar18[-2];
                  puVar19[1] = puVar18[-1];
                  *puVar19 = uVar26;
                  uVar26 = *puVar18;
                  puVar19[3] = puVar18[1];
                  puVar19[2] = uVar26;
                  puVar19 = puVar19 + 4;
                  puVar18 = puVar18 + 4;
                } while (puVar19 < (undefined8 *)((long)puVar24 + uVar25));
              }
            }
          }
        }
        else {
          uVar26 = *puVar18;
          puVar24[1] = puVar18[1];
          *puVar24 = uVar26;
          if (0x10 < uVar25) {
            puVar19 = puVar24 + 2;
            do {
              uVar26 = puVar18[2];
              puVar19[1] = puVar18[3];
              *puVar19 = uVar26;
              uVar26 = puVar18[4];
              puVar19[3] = puVar18[5];
              puVar19[2] = uVar26;
              puVar19 = puVar19 + 4;
              puVar18 = puVar18 + 4;
            } while (puVar19 < (undefined8 *)((long)puVar24 + uVar25));
          }
        }
      }
joined_r0x00154e58:
      if (0xffffffffffffff88 < uVar11) {
        return uVar11;
      }
      puVar17 = (undefined8 *)((long)puVar17 + uVar11);
      unaff_w24 = unaff_w24 + -1;
    } while (unaff_w24 != 0);
    unaff_x22 = in_stack_00000018;
  }
  if (in_stack_00000058 != in_stack_00000060) {
    return 0xffffffffffffffec;
  }
  if (in_stack_00000050 != 0x40) {
    return 0xffffffffffffffec;
  }
  *in_stack_00000010 = CONCAT44((int)in_stack_000000a8,(int)uStack00000000000000a0);
  *(int *)(in_stack_00000010 + 1) = (int)in_stack_000000b0;
  puVar12 = *(undefined **)(unaff_x29 + -0x78);
  if (*(int *)((long)in_stack_00000010 + 0xe64) == 2) {
    uVar15 = (long)unaff_x25 - (long)puVar12;
    if ((ulong)(unaff_x22 - (long)puVar17) < uVar15) {
      return 0xffffffffffffffba;
    }
    if (puVar17 != (undefined8 *)0x0) {
      _memmove(puVar17,puVar12,uVar15);
      puVar17 = (undefined8 *)((long)puVar17 + uVar15);
    }
    puVar12 = &UNK_000076a4 + unaff_x21;
    unaff_x25 = &UNK_000176a4 + unaff_x21;
    *(undefined4 *)((long)in_stack_00000010 + 0xe64) = 0;
  }
  uVar15 = (long)unaff_x25 - (long)puVar12;
  if ((ulong)(unaff_x22 - (long)puVar17) < uVar15) {
    return 0xffffffffffffffba;
  }
  if (puVar17 == (undefined8 *)0x0) {
    lVar23 = 0;
  }
  else {
    _memcpy(puVar17,puVar12,uVar15);
    lVar23 = (long)puVar17 + uVar15;
  }
  return lVar23 - in_stack_00000020;
}

