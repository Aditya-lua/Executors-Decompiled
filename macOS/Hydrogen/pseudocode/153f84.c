
ulong FUN_00153f84(ulong *param_1)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort *puVar4;
  undefined4 *puVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  bool bVar9;
  undefined8 *puVar10;
  ulong uVar11;
  undefined *puVar12;
  ulong uVar13;
  ulong *in_x3;
  ulong in_x4;
  undefined8 *in_x6;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  uint uVar17;
  int iVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  ulong *puVar22;
  undefined1 *puVar23;
  ulong uVar24;
  ulong uVar25;
  undefined1 *puVar26;
  undefined8 *puVar27;
  ulong *puVar28;
  uint uVar29;
  undefined1 *puVar30;
  long lVar31;
  ulong uVar32;
  undefined8 *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long lVar33;
  undefined8 *unaff_x23;
  undefined1 *unaff_x25;
  int unaff_w27;
  ulong uVar34;
  long unaff_x29;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 *puStack0000000000000008;
  undefined8 *puStack0000000000000028;
  undefined8 *puStack0000000000000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  ulong uStack0000000000000048;
  uint uStack0000000000000050;
  ulong *puStack0000000000000058;
  ulong *puStack0000000000000060;
  ulong *puStack0000000000000068;
  ulong uStack0000000000000070;
  long lStack0000000000000078;
  ulong uStack0000000000000080;
  long lStack0000000000000088;
  ulong uStack0000000000000090;
  long lStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  lVar31 = in_x4 - 8;
  if (in_x4 < 8) {
    uStack0000000000000048 = (ulong)(byte)*in_x3;
    switch(in_x4) {
    case 7:
      uStack0000000000000048 = uStack0000000000000048 | (ulong)*(byte *)((long)in_x3 + 6) << 0x30;
    case 6:
      uStack0000000000000048 = uStack0000000000000048 + ((ulong)*(byte *)((long)in_x3 + 5) << 0x28);
    case 5:
      uStack0000000000000048 = uStack0000000000000048 + ((ulong)*(byte *)((long)in_x3 + 4) << 0x20);
    case 4:
      uStack0000000000000048 =
           uStack0000000000000048 + (ulong)*(byte *)((long)in_x3 + 3) * 0x1000000;
    case 3:
      uStack0000000000000048 = uStack0000000000000048 + (ulong)*(byte *)((long)in_x3 + 2) * 0x10000;
    case 2:
      uStack0000000000000048 = uStack0000000000000048 + (ulong)*(byte *)((long)in_x3 + 1) * 0x100;
    }
    uVar17 = (uint)*(byte *)((long)in_x3 + (in_x4 - 1));
    if (uVar17 == 0) {
      return 0xffffffffffffffec;
    }
    lVar31 = 0;
    iVar18 = (int)LZCOUNT(uVar17) + (int)in_x4 * -8 + 0x29;
    puStack0000000000000058 = in_x3;
  }
  else {
    puStack0000000000000058 = (ulong *)((long)in_x3 + lVar31);
    uStack0000000000000048 = *puStack0000000000000058;
    if ((uStack0000000000000048 >> 0x38 == 0) || (0xffffffffffffff88 < in_x4)) {
      return 0xffffffffffffffec;
    }
    iVar18 = (int)LZCOUNT((uint)(byte)(uStack0000000000000048 >> 0x38)) + -0x17;
  }
  uVar17 = *(uint *)(*unaff_x21 + 4);
  uStack0000000000000050 = uVar17 + iVar18;
  uStack0000000000000070 =
       uStack0000000000000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
       (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar17 * 4);
  if (uStack0000000000000050 < 0x41) {
    if (lVar31 < 8) {
      puVar22 = in_x3;
      if (lVar31 == 0) goto LAB_00154138;
      uVar17 = (uint)lVar31;
      if (in_x3 <= (ulong *)((long)in_x3 + (lVar31 - (ulong)(uStack0000000000000050 >> 3)))) {
        uVar17 = uStack0000000000000050 >> 3;
      }
      uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
    }
    else {
      uVar17 = uStack0000000000000050 >> 3;
      uStack0000000000000050 = uStack0000000000000050 & 7;
    }
    puStack0000000000000058 = (ulong *)((long)in_x3 + (lVar31 - (ulong)uVar17));
    uStack0000000000000048 = *puStack0000000000000058;
    puVar22 = puStack0000000000000058;
  }
  else {
    puVar22 = (ulong *)&UNK_00814388;
    puStack0000000000000058 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lStack0000000000000078 = *unaff_x21 + 8;
  uVar17 = *(uint *)(unaff_x21[2] + 4);
  uStack0000000000000050 = uVar17 + uStack0000000000000050;
  uStack0000000000000080 =
       uStack0000000000000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
       (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar17 * 4);
  if (uStack0000000000000050 < 0x41) {
    if (puVar22 < param_1) {
      puVar28 = in_x3;
      if (puVar22 == in_x3) goto LAB_001541c4;
      uVar17 = (int)puVar22 - (int)in_x3;
      if (in_x3 <= (ulong *)((long)puVar22 - (ulong)(uStack0000000000000050 >> 3))) {
        uVar17 = uStack0000000000000050 >> 3;
      }
      puVar28 = (ulong *)((long)puVar22 - (ulong)uVar17);
      uStack0000000000000048 = *puVar28;
      uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
    }
    else {
      puVar28 = (ulong *)((long)puVar22 - (ulong)(uStack0000000000000050 >> 3));
      uStack0000000000000048 = *puVar28;
      uStack0000000000000050 = uStack0000000000000050 & 7;
    }
    puStack0000000000000058 = puVar28;
  }
  else {
    puVar28 = (ulong *)&UNK_00814388;
    puStack0000000000000058 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  puStack0000000000000008 = (undefined8 *)((long)unaff_x21 + 0x76a4);
  puStack0000000000000030 = &uStack00000000000000a0;
  lStack0000000000000088 = unaff_x21[2] + 8;
  uVar17 = *(uint *)(unaff_x21[1] + 4);
  uStack0000000000000050 = uVar17 + uStack0000000000000050;
  uStack0000000000000090 =
       uStack0000000000000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
       (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar17 * 4);
  if (uStack0000000000000050 < 0x41) {
    if (puVar28 < param_1) {
      if (puVar28 != in_x3) {
        uVar17 = (int)puVar28 - (int)in_x3;
        if (in_x3 <= (ulong *)((long)puVar28 - (ulong)(uStack0000000000000050 >> 3))) {
          uVar17 = uStack0000000000000050 >> 3;
        }
        puStack0000000000000058 = (ulong *)((long)puVar28 - (ulong)uVar17);
        uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
        uStack0000000000000048 = *puStack0000000000000058;
      }
    }
    else {
      puStack0000000000000058 = (ulong *)((long)puVar28 - (ulong)(uStack0000000000000050 >> 3));
      uStack0000000000000050 = uStack0000000000000050 & 7;
      uStack0000000000000048 = *puStack0000000000000058;
    }
  }
  else {
    puStack0000000000000058 = (ulong *)&UNK_00814388;
  }
  lStack0000000000000098 = unaff_x21[1] + 8;
  puStack0000000000000028 = &uStack00000000000000a0;
  puVar10 = unaff_x19;
  puStack0000000000000060 = in_x3;
  puStack0000000000000068 = param_1;
  do {
    puVar2 = (ushort *)(lStack0000000000000078 + uStack0000000000000070 * 8);
    puVar3 = (ushort *)(lStack0000000000000098 + uStack0000000000000090 * 8);
    puVar4 = (ushort *)(lStack0000000000000088 + uStack0000000000000080 * 8);
    uVar34 = (ulong)*(uint *)(puVar3 + 2);
    uVar14 = (ulong)*(uint *)(puVar2 + 2);
    uVar17 = *(uint *)(puVar4 + 2);
    bVar6 = (byte)puVar2[1];
    bVar7 = (byte)puVar3[1];
    bVar8 = (byte)puVar4[1];
    uVar29 = (uint)bVar8;
    puVar19 = puStack0000000000000030;
    if (bVar8 < 2) {
      bVar9 = *(uint *)(puVar2 + 2) == 0;
      if (bVar8 != 0) {
        if (bVar9) {
          uVar17 = uVar17 + 1;
        }
        uVar13 = (ulong)uStack0000000000000050;
        uStack0000000000000050 = uStack0000000000000050 + 1;
        lVar31 = (ulong)uVar17 - ((long)(uStack0000000000000048 << (uVar13 & 0x3f)) >> 0x3f);
        if (lVar31 == 3) {
          uVar13 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
        }
        else {
          uVar13 = (&uStack00000000000000a0)[lVar31] -
                   (ulong)((&uStack00000000000000a0)[lVar31] == 0);
          if (lVar31 == 1) goto LAB_00154320;
        }
        goto code_r0x001542f4;
      }
      uVar13 = puStack0000000000000028[bVar9];
      puVar19 = puStack0000000000000028 + !bVar9;
    }
    else {
      uVar13 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + uVar29;
      uVar13 = ((uStack0000000000000048 << (uVar13 & 0x3f)) >> ((ulong)-uVar29 & 0x3f)) +
               (ulong)uVar17;
code_r0x001542f4:
      in_stack_000000b0 = in_stack_000000a8;
    }
LAB_00154320:
    uStack00000000000000a0 = uVar13;
    in_stack_000000a8 = *puVar19;
    if (bVar7 != 0) {
      uVar11 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + bVar7;
      uVar34 = ((uStack0000000000000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
               uVar34;
    }
    if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar29 & 0xff)) {
      if (uStack0000000000000050 < 0x41) {
        if (puStack0000000000000058 < puStack0000000000000068) {
          if (puStack0000000000000058 == puStack0000000000000060) goto code_r0x00154360;
          uVar17 = (int)puStack0000000000000058 - (int)puStack0000000000000060;
          if (puStack0000000000000060 <=
              (ulong *)((long)puStack0000000000000058 - (ulong)(uStack0000000000000050 >> 3))) {
            uVar17 = uStack0000000000000050 >> 3;
          }
          uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
        }
        else {
          uVar17 = uStack0000000000000050 >> 3;
          uStack0000000000000050 = uStack0000000000000050 & 7;
        }
        puStack0000000000000058 = (ulong *)((long)puStack0000000000000058 - (ulong)uVar17);
        uStack0000000000000048 = *puStack0000000000000058;
      }
      else {
        puStack0000000000000058 = (ulong *)&UNK_00814388;
      }
    }
code_r0x00154360:
    if (bVar6 != 0) {
      uVar11 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + bVar6;
      uVar14 = ((uStack0000000000000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) +
               uVar14;
    }
    iVar18 = unaff_w27 + -1;
    if (iVar18 != 0) {
      iVar1 = uStack0000000000000050 + *(byte *)((long)puVar2 + 3);
      uStack0000000000000070 =
           (uStack0000000000000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
           (ulong)*puVar2;
      iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
      uStack0000000000000090 =
           (uStack0000000000000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
           (ulong)*puVar3;
      uStack0000000000000050 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
      uStack0000000000000080 =
           (uStack0000000000000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
           (ulong)*puVar4;
      if (uStack0000000000000050 < 0x41) {
        if (puStack0000000000000058 < puStack0000000000000068) {
          if (puStack0000000000000058 != puStack0000000000000060) {
            uVar17 = (int)puStack0000000000000058 - (int)puStack0000000000000060;
            if (puStack0000000000000060 <=
                (ulong *)((long)puStack0000000000000058 - (ulong)(uStack0000000000000050 >> 3))) {
              uVar17 = uStack0000000000000050 >> 3;
            }
            uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar17 = uStack0000000000000050 >> 3;
          uStack0000000000000050 = uStack0000000000000050 & 7;
code_r0x00154464:
          puStack0000000000000058 = (ulong *)((long)puStack0000000000000058 - (ulong)uVar17);
          uStack0000000000000048 = *puStack0000000000000058;
        }
        puVar19 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar23 = (undefined1 *)unaff_x21[0xed3];
        puVar26 = (undefined1 *)((long)puVar19 + uVar14);
        if (puVar26 <= puVar23) goto code_r0x00154484;
      }
      else {
        puStack0000000000000058 = (ulong *)&UNK_00814388;
        puVar19 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar23 = (undefined1 *)unaff_x21[0xed3];
        puVar26 = (undefined1 *)((long)puVar19 + uVar14);
        if (puVar26 <= puVar23) goto code_r0x00154484;
      }
      if (unaff_w27 < 1) {
        return 0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar11 = (long)puVar23 - (long)puVar19;
      if (uVar11 == 0) goto code_r0x00154a08;
      if ((ulong)(unaff_x22 - (long)puVar10) < uVar11) {
        return 0xffffffffffffffba;
      }
      uVar25 = (long)puVar10 - (long)puVar19;
      puVar16 = (undefined8 *)((long)puVar10 + uVar11);
      if (((long)uVar25 < -7) && (7 < uVar11)) {
        if (uVar25 < 0xfffffffffffffff0) {
          puVar27 = puVar16 + -4;
          if (puVar10 <= puVar27) {
            uVar35 = *puVar19;
            puVar10[1] = puVar19[1];
            *puVar10 = uVar35;
            if (0x10 < (ulong)((long)puVar27 - (long)puVar10)) {
              puVar20 = puVar10 + 2;
              puVar15 = puVar19;
              do {
                uVar35 = puVar15[2];
                puVar20[1] = puVar15[3];
                *puVar20 = uVar35;
                uVar35 = puVar15[4];
                puVar20[3] = puVar15[5];
                puVar20[2] = uVar35;
                puVar20 = puVar20 + 4;
                puVar15 = puVar15 + 4;
              } while (puVar20 < puVar27);
            }
            puVar19 = (undefined8 *)((long)puVar19 + ((long)puVar27 - (long)puVar10));
code_r0x001548ac:
            puVar26 = (undefined1 *)((long)puVar10 + (uVar11 - (long)puVar27));
            if ((puVar26 < (undefined1 *)0x8) || ((ulong)((long)puVar27 - (long)puVar19) < 0x40)) {
              puVar10 = puVar27;
            }
            else {
              if (puVar26 < (undefined1 *)0x40) {
                puVar30 = (undefined1 *)0x0;
              }
              else {
                puVar30 = (undefined1 *)((ulong)puVar26 & 0xffffffffffffffc0);
                puVar10 = puVar27 + 4;
                puVar20 = puVar19 + 4;
                puVar23 = puVar30;
                do {
                  uVar35 = puVar20[-4];
                  uVar37 = puVar20[-1];
                  uVar36 = puVar20[-2];
                  uVar39 = puVar20[1];
                  uVar38 = *puVar20;
                  uVar41 = puVar20[3];
                  uVar40 = puVar20[2];
                  puVar10[-3] = puVar20[-3];
                  puVar10[-4] = uVar35;
                  puVar10[-1] = uVar37;
                  puVar10[-2] = uVar36;
                  puVar10[1] = uVar39;
                  *puVar10 = uVar38;
                  puVar10[3] = uVar41;
                  puVar10[2] = uVar40;
                  puVar23 = puVar23 + -0x40;
                  puVar10 = puVar10 + 8;
                  puVar20 = puVar20 + 8;
                } while (puVar23 != (undefined1 *)0x0);
                if (puVar26 == puVar30) goto code_r0x00154a00;
                if (((ulong)puVar26 & 0x38) == 0) {
                  puVar19 = (undefined8 *)((long)puVar19 + (long)puVar30);
                  puVar10 = (undefined8 *)((long)puVar27 + (long)puVar30);
                  goto code_r0x001549d0;
                }
              }
              puVar23 = (undefined1 *)((ulong)puVar26 & 0xfffffffffffffff8);
              lVar31 = (long)puVar30 - (long)puVar23;
              puVar10 = (undefined8 *)((long)puVar27 + (long)puVar30);
              puVar20 = (undefined8 *)((long)puVar19 + (long)puVar30);
              do {
                *puVar10 = *puVar20;
                lVar31 = lVar31 + 8;
                puVar10 = puVar10 + 1;
                puVar20 = puVar20 + 1;
              } while (lVar31 != 0);
              puVar10 = (undefined8 *)((long)puVar27 + (long)puVar23);
              puVar19 = (undefined8 *)((long)puVar19 + (long)puVar23);
              if (puVar26 == puVar23) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              puVar20 = (undefined8 *)((long)puVar10 + 1);
              *(undefined1 *)puVar10 = *(undefined1 *)puVar19;
              puVar10 = puVar20;
              puVar19 = (undefined8 *)((long)puVar19 + 1);
            } while (puVar20 != (undefined8 *)((long)puVar27 + (long)puVar26));
            goto code_r0x00154a00;
          }
        }
        puVar27 = puVar10;
        if (0 < (long)uVar11) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar11 < 1) goto code_r0x00154a00;
      puVar26 = (undefined1 *)((long)puVar10 + (long)puVar23) + -(long)puVar19;
      if (puVar26 <= (undefined1 *)((long)puVar10 + 1U)) {
        puVar26 = (undefined1 *)((long)puVar10 + 1);
      }
      uVar24 = (long)puVar26 - (long)puVar10;
      if ((uVar24 < 8) || (uVar25 < 0x40)) goto code_r0x001549f0;
      if (uVar24 < 0x40) {
        uVar25 = 0;
        goto code_r0x00154994;
      }
      uVar25 = uVar24 & 0xffffffffffffffc0;
      puVar27 = puVar10 + 4;
      puVar20 = puVar19 + 4;
      uVar32 = uVar25;
      do {
        uVar35 = puVar20[-4];
        uVar37 = puVar20[-1];
        uVar36 = puVar20[-2];
        uVar39 = puVar20[1];
        uVar38 = *puVar20;
        uVar41 = puVar20[3];
        uVar40 = puVar20[2];
        puVar27[-3] = puVar20[-3];
        puVar27[-4] = uVar35;
        puVar27[-1] = uVar37;
        puVar27[-2] = uVar36;
        puVar27[1] = uVar39;
        *puVar27 = uVar38;
        puVar27[3] = uVar41;
        puVar27[2] = uVar40;
        uVar32 = uVar32 - 0x40;
        puVar27 = puVar27 + 8;
        puVar20 = puVar20 + 8;
      } while (uVar32 != 0);
      if (uVar24 != uVar25) {
        if ((uVar24 & 0x38) == 0) {
          puVar19 = (undefined8 *)((long)puVar19 + uVar25);
          puVar10 = (undefined8 *)((long)puVar10 + uVar25);
        }
        else {
code_r0x00154994:
          uVar32 = uVar24 & 0xfffffffffffffff8;
          lVar31 = uVar25 - uVar32;
          puVar27 = (undefined8 *)((long)puVar19 + uVar25);
          puVar20 = (undefined8 *)((long)puVar10 + uVar25);
          do {
            *puVar20 = *puVar27;
            lVar31 = lVar31 + 8;
            puVar27 = puVar27 + 1;
            puVar20 = puVar20 + 1;
          } while (lVar31 != 0);
          puVar10 = (undefined8 *)((long)puVar10 + uVar32);
          puVar19 = (undefined8 *)((long)puVar19 + uVar32);
          if (uVar24 == uVar32) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          puVar27 = (undefined8 *)((long)puVar10 + 1);
          *(undefined1 *)puVar10 = *(undefined1 *)puVar19;
          puVar10 = puVar27;
          puVar19 = (undefined8 *)((long)puVar19 + 1);
        } while (puVar27 < puVar16);
      }
code_r0x00154a00:
      uVar14 = uVar14 - uVar11;
      puVar10 = puVar16;
code_r0x00154a08:
      *(undefined8 **)(unaff_x29 + -0x78) = puStack0000000000000008;
      unaff_x25 = (undefined1 *)((long)unaff_x21 + 0x176a4);
      *(undefined4 *)((long)unaff_x23 + 0xe64) = 0;
      puVar19 = (undefined8 *)((long)puVar10 + uVar14);
      puVar16 = (undefined8 *)((long)puVar19 - uVar13);
      Hint_Prefetch(puVar16,0,0,0);
      puStack0000000000000028 = (undefined8 *)(unaff_x22 + -0x20);
      if ((unaff_x25 < (undefined1 *)((long)puStack0000000000000008 + uVar14)) ||
         (uVar11 = uVar14 + uVar34, puStack0000000000000028 < (undefined8 *)((long)puVar10 + uVar11)
         )) {
        *(ulong *)(unaff_x29 + -0x70) = uVar14;
        *(ulong *)(unaff_x29 + -0x68) = uVar34;
        *(ulong *)(unaff_x29 + -0x60) = uVar13;
        uVar11 = func_0x00155c78(puVar10,unaff_x22,unaff_x29 + -0x70,unaff_x29 + -0x78,unaff_x25,
                                 in_x6,in_stack_00000040,in_stack_00000038);
        puVar27 = puStack0000000000000028;
      }
      else {
        uVar35 = *puStack0000000000000008;
        puVar10[1] = puStack0000000000000008[1];
        *puVar10 = uVar35;
        if (0x10 < uVar14) {
          uVar35 = puStack0000000000000008[2];
          puVar10[3] = puStack0000000000000008[3];
          puVar10[2] = uVar35;
          if (0x10 < uVar14 - 0x10) {
            puVar27 = puVar10 + 4;
            puVar20 = puStack0000000000000008 + 6;
            do {
              uVar35 = puVar20[-2];
              puVar27[1] = puVar20[-1];
              *puVar27 = uVar35;
              uVar35 = *puVar20;
              puVar27[3] = puVar20[1];
              puVar27[2] = uVar35;
              puVar27 = puVar27 + 4;
              puVar20 = puVar20 + 4;
            } while (puVar27 < puVar19);
          }
        }
        *(undefined1 **)(unaff_x29 + -0x78) = (undefined1 *)((long)puStack0000000000000008 + uVar14)
        ;
        if ((ulong)((long)puVar19 - (long)in_x6) < uVar13) {
          if ((ulong)((long)puVar19 - in_stack_00000040) < uVar13) {
            return 0xffffffffffffffec;
          }
          lVar33 = (long)puVar16 - (long)in_x6;
          lVar31 = in_stack_00000038 + lVar33;
          puStack0000000000000008 = in_x6;
          if (lVar31 + uVar34 <= in_stack_00000038) {
            _memmove(puVar19,lVar31,uVar34);
            in_x6 = puStack0000000000000008;
            puVar27 = puStack0000000000000028;
            goto joined_r0x00154b24;
          }
          _memmove(puVar19,lVar31,-lVar33);
          puVar19 = (undefined8 *)((long)puVar19 - lVar33);
          uVar34 = lVar33 + uVar34;
          in_x6 = puStack0000000000000008;
          puVar16 = puStack0000000000000008;
        }
        puVar27 = puStack0000000000000028;
        if (uVar13 < 0x10) {
          if (uVar13 < 8) {
            iVar1 = *(int *)(&UNK_008143b0 + uVar13 * 4);
            *(undefined1 *)puVar19 = *(undefined1 *)puVar16;
            *(undefined1 *)((long)puVar19 + 1) = *(undefined1 *)((long)puVar16 + 1);
            *(undefined1 *)((long)puVar19 + 2) = *(undefined1 *)((long)puVar16 + 2);
            *(undefined1 *)((long)puVar19 + 3) = *(undefined1 *)((long)puVar16 + 3);
            puVar5 = (undefined4 *)((long)puVar16 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
            puVar16 = (undefined8 *)((long)puVar5 - (long)iVar1);
            *(undefined4 *)((long)puVar19 + 4) = *puVar5;
          }
          else {
            *puVar19 = *puVar16;
          }
          if (8 < uVar34) {
            puVar20 = puVar16 + 1;
            puVar15 = puVar19 + 1;
            if ((long)puVar15 - (long)puVar20 < 0x10) {
              do {
                puVar16 = puVar15 + 1;
                *puVar15 = *puVar20;
                puVar20 = puVar20 + 1;
                puVar15 = puVar16;
              } while (puVar16 < (undefined8 *)((long)puVar19 + uVar34));
            }
            else {
              uVar35 = *puVar20;
              puVar19[2] = puVar16[2];
              *puVar15 = uVar35;
              if (0x10 < uVar34 - 8) {
                puVar20 = puVar19 + 3;
                puVar16 = puVar16 + 5;
                do {
                  uVar35 = puVar16[-2];
                  puVar20[1] = puVar16[-1];
                  *puVar20 = uVar35;
                  uVar35 = *puVar16;
                  puVar20[3] = puVar16[1];
                  puVar20[2] = uVar35;
                  puVar20 = puVar20 + 4;
                  puVar16 = puVar16 + 4;
                } while (puVar20 < (undefined8 *)((long)puVar19 + uVar34));
              }
            }
          }
        }
        else {
          uVar35 = *puVar16;
          puVar19[1] = puVar16[1];
          *puVar19 = uVar35;
          if (0x10 < uVar34) {
            puVar20 = puVar19 + 2;
            do {
              uVar35 = puVar16[2];
              puVar20[1] = puVar16[3];
              *puVar20 = uVar35;
              uVar35 = puVar16[4];
              puVar20[3] = puVar16[5];
              puVar20[2] = uVar35;
              puVar20 = puVar20 + 4;
              puVar16 = puVar16 + 4;
            } while (puVar20 < (undefined8 *)((long)puVar19 + uVar34));
          }
        }
      }
joined_r0x00154b24:
      if (0xffffffffffffff88 < uVar11) {
        return uVar11;
      }
      puVar10 = (undefined8 *)((long)puVar10 + uVar11);
      puStack0000000000000028 = puVar27;
      if (unaff_w27 < 2) {
        if (iVar18 != 0) {
          return 0xffffffffffffffec;
        }
        goto code_r0x00155070;
      }
      puStack0000000000000008 = &uStack00000000000000a0;
      do {
        puVar2 = (ushort *)(lStack0000000000000078 + uStack0000000000000070 * 8);
        puVar3 = (ushort *)(lStack0000000000000098 + uStack0000000000000090 * 8);
        puVar4 = (ushort *)(lStack0000000000000088 + uStack0000000000000080 * 8);
        uVar34 = (ulong)*(uint *)(puVar3 + 2);
        uVar14 = (ulong)*(uint *)(puVar2 + 2);
        uVar17 = *(uint *)(puVar4 + 2);
        bVar6 = (byte)puVar2[1];
        bVar7 = (byte)puVar3[1];
        bVar8 = (byte)puVar4[1];
        uVar29 = (uint)bVar8;
        puVar19 = puStack0000000000000030;
        if (bVar8 < 2) {
          bVar9 = *(uint *)(puVar2 + 2) == 0;
          if (bVar8 != 0) {
            if (bVar9) {
              uVar17 = uVar17 + 1;
            }
            uVar13 = (ulong)uStack0000000000000050;
            uStack0000000000000050 = uStack0000000000000050 + 1;
            lVar31 = (ulong)uVar17 - ((long)(uStack0000000000000048 << (uVar13 & 0x3f)) >> 0x3f);
            if (lVar31 == 3) {
              uVar13 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
              puVar27 = puStack0000000000000028;
            }
            else {
              uVar13 = (&uStack00000000000000a0)[lVar31] -
                       (ulong)((&uStack00000000000000a0)[lVar31] == 0);
              puVar27 = puStack0000000000000028;
              if (lVar31 == 1) goto LAB_00154bdc;
            }
            goto code_r0x00154bb0;
          }
          uVar13 = puStack0000000000000008[bVar9];
          puVar19 = puStack0000000000000008 + !bVar9;
        }
        else {
          uVar13 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + uVar29;
          uVar13 = ((uStack0000000000000048 << (uVar13 & 0x3f)) >> ((ulong)-uVar29 & 0x3f)) +
                   (ulong)uVar17;
code_r0x00154bb0:
          in_stack_000000b0 = in_stack_000000a8;
        }
LAB_00154bdc:
        uStack00000000000000a0 = uVar13;
        in_stack_000000a8 = *puVar19;
        if (bVar7 != 0) {
          uVar11 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + bVar7;
          uVar34 = ((uStack0000000000000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                   uVar34;
        }
        if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar29 & 0xff)) {
          if (uStack0000000000000050 < 0x41) {
            if (puStack0000000000000058 < puStack0000000000000068) {
              puVar27 = puStack0000000000000028;
              if (puStack0000000000000058 != puStack0000000000000060) {
                uVar17 = (int)puStack0000000000000058 - (int)puStack0000000000000060;
                if (puStack0000000000000060 <=
                    (ulong *)((long)puStack0000000000000058 - (ulong)(uStack0000000000000050 >> 3)))
                {
                  uVar17 = uStack0000000000000050 >> 3;
                }
                puStack0000000000000058 = (ulong *)((long)puStack0000000000000058 - (ulong)uVar17);
                uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
                uStack0000000000000048 = *puStack0000000000000058;
              }
            }
            else {
              puStack0000000000000058 =
                   (ulong *)((long)puStack0000000000000058 - (ulong)(uStack0000000000000050 >> 3));
              uStack0000000000000050 = uStack0000000000000050 & 7;
              uStack0000000000000048 = *puStack0000000000000058;
              puVar27 = puStack0000000000000028;
            }
          }
          else {
            puStack0000000000000058 = (ulong *)&UNK_00814388;
            puVar27 = puStack0000000000000028;
          }
        }
        if (bVar6 != 0) {
          uVar11 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + bVar6;
          uVar14 = ((uStack0000000000000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) +
                   uVar14;
        }
        if (iVar18 != 1) {
          iVar1 = uStack0000000000000050 + *(byte *)((long)puVar2 + 3);
          uStack0000000000000070 =
               (uStack0000000000000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
               (ulong)*puVar2;
          iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
          uStack0000000000000090 =
               (uStack0000000000000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
               (ulong)*puVar3;
          uStack0000000000000050 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
          uStack0000000000000080 =
               (uStack0000000000000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
               (ulong)*puVar4;
          if (uStack0000000000000050 < 0x41) {
            if (puStack0000000000000058 < puStack0000000000000068) {
              if (puStack0000000000000058 == puStack0000000000000060) goto LAB_00154d14;
              uVar17 = (int)puStack0000000000000058 - (int)puStack0000000000000060;
              if (puStack0000000000000060 <=
                  (ulong *)((long)puStack0000000000000058 - (ulong)(uStack0000000000000050 >> 3))) {
                uVar17 = uStack0000000000000050 >> 3;
              }
              uStack0000000000000050 = uStack0000000000000050 + uVar17 * -8;
            }
            else {
              uVar17 = uStack0000000000000050 >> 3;
              uStack0000000000000050 = uStack0000000000000050 & 7;
            }
            puStack0000000000000058 = (ulong *)((long)puStack0000000000000058 - (ulong)uVar17);
            uStack0000000000000048 = *puStack0000000000000058;
          }
          else {
            puStack0000000000000058 = (ulong *)&UNK_00814388;
          }
        }
LAB_00154d14:
        puVar20 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar19 = (undefined8 *)((long)puVar10 + uVar14);
        puVar16 = (undefined8 *)((long)puVar19 - uVar13);
        Hint_Prefetch(puVar16,0,0,0);
        if ((unaff_x25 < (undefined1 *)((long)puVar20 + uVar14)) ||
           (uVar11 = uVar14 + uVar34, puVar27 < (undefined8 *)((long)puVar10 + uVar11))) {
          *(ulong *)(unaff_x29 + -0x70) = uVar14;
          *(ulong *)(unaff_x29 + -0x68) = uVar34;
          *(ulong *)(unaff_x29 + -0x60) = uVar13;
          uVar11 = func_0x00155c78(puVar10,unaff_x22,unaff_x29 + -0x70,unaff_x29 + -0x78,unaff_x25,
                                   in_x6,in_stack_00000040,in_stack_00000038);
          puVar27 = puStack0000000000000028;
        }
        else {
          uVar35 = *puVar20;
          puVar10[1] = puVar20[1];
          *puVar10 = uVar35;
          if (0x10 < uVar14) {
            uVar35 = puVar20[2];
            puVar10[3] = puVar20[3];
            puVar10[2] = uVar35;
            if (0x10 < uVar14 - 0x10) {
              puVar15 = puVar10 + 4;
              puVar21 = puVar20 + 6;
              do {
                uVar35 = puVar21[-2];
                puVar15[1] = puVar21[-1];
                *puVar15 = uVar35;
                uVar35 = *puVar21;
                puVar15[3] = puVar21[1];
                puVar15[2] = uVar35;
                puVar15 = puVar15 + 4;
                puVar21 = puVar21 + 4;
              } while (puVar15 < puVar19);
            }
          }
          *(undefined1 **)(unaff_x29 + -0x78) = (undefined1 *)((long)puVar20 + uVar14);
          if ((ulong)((long)puVar19 - (long)in_x6) < uVar13) {
            if ((ulong)((long)puVar19 - in_stack_00000040) < uVar13) {
              return 0xffffffffffffffec;
            }
            lVar33 = (long)puVar16 - (long)in_x6;
            lVar31 = in_stack_00000038 + lVar33;
            if (lVar31 + uVar34 <= in_stack_00000038) {
              _memmove(puVar19,lVar31,uVar34);
              puVar27 = puStack0000000000000028;
              goto joined_r0x00154e58;
            }
            _memmove(puVar19,lVar31,-lVar33);
            puVar19 = (undefined8 *)((long)puVar19 - lVar33);
            uVar34 = lVar33 + uVar34;
            puVar27 = puStack0000000000000028;
            puVar16 = in_x6;
          }
          if (uVar13 < 0x10) {
            if (uVar13 < 8) {
              iVar1 = *(int *)(&UNK_008143b0 + uVar13 * 4);
              *(undefined1 *)puVar19 = *(undefined1 *)puVar16;
              *(undefined1 *)((long)puVar19 + 1) = *(undefined1 *)((long)puVar16 + 1);
              *(undefined1 *)((long)puVar19 + 2) = *(undefined1 *)((long)puVar16 + 2);
              *(undefined1 *)((long)puVar19 + 3) = *(undefined1 *)((long)puVar16 + 3);
              puVar5 = (undefined4 *)((long)puVar16 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
              puVar16 = (undefined8 *)((long)puVar5 - (long)iVar1);
              *(undefined4 *)((long)puVar19 + 4) = *puVar5;
            }
            else {
              *puVar19 = *puVar16;
            }
            puVar27 = puStack0000000000000028;
            if (8 < uVar34) {
              puVar20 = puVar16 + 1;
              puVar15 = puVar19 + 1;
              if ((long)puVar15 - (long)puVar20 < 0x10) {
                do {
                  puVar16 = puVar15 + 1;
                  *puVar15 = *puVar20;
                  puVar20 = puVar20 + 1;
                  puVar15 = puVar16;
                } while (puVar16 < (undefined8 *)((long)puVar19 + uVar34));
              }
              else {
                uVar35 = *puVar20;
                puVar19[2] = puVar16[2];
                *puVar15 = uVar35;
                if (0x10 < uVar34 - 8) {
                  puVar20 = puVar19 + 3;
                  puVar16 = puVar16 + 5;
                  do {
                    uVar35 = puVar16[-2];
                    puVar20[1] = puVar16[-1];
                    *puVar20 = uVar35;
                    uVar35 = *puVar16;
                    puVar20[3] = puVar16[1];
                    puVar20[2] = uVar35;
                    puVar20 = puVar20 + 4;
                    puVar16 = puVar16 + 4;
                  } while (puVar20 < (undefined8 *)((long)puVar19 + uVar34));
                }
              }
            }
          }
          else {
            uVar35 = *puVar16;
            puVar19[1] = puVar16[1];
            *puVar19 = uVar35;
            if (0x10 < uVar34) {
              puVar20 = puVar19 + 2;
              do {
                uVar35 = puVar16[2];
                puVar20[1] = puVar16[3];
                *puVar20 = uVar35;
                uVar35 = puVar16[4];
                puVar20[3] = puVar16[5];
                puVar20[2] = uVar35;
                puVar20 = puVar20 + 4;
                puVar16 = puVar16 + 4;
              } while (puVar20 < (undefined8 *)((long)puVar19 + uVar34));
            }
          }
        }
joined_r0x00154e58:
        if (0xffffffffffffff88 < uVar11) {
          return uVar11;
        }
        puVar10 = (undefined8 *)((long)puVar10 + uVar11);
        iVar18 = iVar18 + -1;
      } while (iVar18 != 0);
code_r0x00155070:
      if (puStack0000000000000058 != puStack0000000000000060) {
        return 0xffffffffffffffec;
      }
      if (uStack0000000000000050 != 0x40) {
        return 0xffffffffffffffec;
      }
      *unaff_x23 = CONCAT44((int)in_stack_000000a8,(int)uStack00000000000000a0);
      *(int *)(unaff_x23 + 1) = (int)in_stack_000000b0;
      puVar12 = *(undefined **)(unaff_x29 + -0x78);
      if (*(int *)((long)unaff_x23 + 0xe64) == 2) {
        uVar14 = (long)unaff_x25 - (long)puVar12;
        if ((ulong)(unaff_x22 - (long)puVar10) < uVar14) {
          return 0xffffffffffffffba;
        }
        if (puVar10 != (undefined8 *)0x0) {
          _memmove(puVar10,puVar12,uVar14);
          puVar10 = (undefined8 *)((long)puVar10 + uVar14);
        }
        puVar12 = &UNK_000076a4 + (long)unaff_x21;
        unaff_x25 = (undefined1 *)((long)unaff_x21 + 0x176a4);
        *(undefined4 *)((long)unaff_x23 + 0xe64) = 0;
      }
      uVar14 = (long)unaff_x25 - (long)puVar12;
      if ((ulong)(unaff_x22 - (long)puVar10) < uVar14) {
        return 0xffffffffffffffba;
      }
      if (puVar10 == (undefined8 *)0x0) {
        puVar26 = (undefined1 *)0x0;
      }
      else {
        _memcpy(puVar10,puVar12,uVar14);
        puVar26 = (undefined1 *)((long)puVar10 + uVar14);
      }
      return (long)puVar26 - (long)unaff_x19;
    }
    puVar19 = *(undefined8 **)(unaff_x29 + -0x78);
    puVar23 = (undefined1 *)unaff_x21[0xed3];
    puVar26 = (undefined1 *)((long)puVar19 + uVar14);
    if (puVar23 < puVar26) goto code_r0x001547d8;
code_r0x00154484:
    if ((unaff_x25 < puVar26) ||
       (uVar11 = uVar14 + uVar34, puVar26 + -0x20 < (undefined1 *)((long)puVar10 + uVar11))) {
      *(ulong *)(unaff_x29 + -0x70) = uVar14;
      *(ulong *)(unaff_x29 + -0x68) = uVar34;
      *(ulong *)(unaff_x29 + -0x60) = uVar13;
      uVar11 = func_0x00156308(puVar10,unaff_x22,puVar26 + -0x20,unaff_x29 + -0x70,unaff_x29 + -0x78
                               ,unaff_x25,in_x6,in_stack_00000040);
    }
    else {
      puVar16 = (undefined8 *)((long)puVar10 + uVar14);
      uVar35 = *puVar19;
      puVar10[1] = puVar19[1];
      *puVar10 = uVar35;
      if (0x10 < uVar14) {
        uVar35 = puVar19[2];
        puVar10[3] = puVar19[3];
        puVar10[2] = uVar35;
        if (0x10 < uVar14 - 0x10) {
          puVar27 = puVar10 + 4;
          puVar19 = puVar19 + 6;
          do {
            uVar35 = puVar19[-2];
            puVar27[1] = puVar19[-1];
            *puVar27 = uVar35;
            uVar35 = *puVar19;
            puVar27[3] = puVar19[1];
            puVar27[2] = uVar35;
            puVar27 = puVar27 + 4;
            puVar19 = puVar19 + 4;
          } while (puVar27 < puVar16);
        }
      }
      *(undefined1 **)(unaff_x29 + -0x78) = puVar26;
      puVar19 = (undefined8 *)((long)puVar16 - uVar13);
      if ((ulong)((long)puVar16 - (long)in_x6) < uVar13) {
        if ((ulong)((long)puVar16 - in_stack_00000040) < uVar13) {
          return 0xffffffffffffffec;
        }
        lVar33 = (long)((long)puVar16 - uVar13) - (long)in_x6;
        lVar31 = in_stack_00000038 + lVar33;
        if (lVar31 + uVar34 <= in_stack_00000038) {
          _memmove(puVar16,lVar31,uVar34);
          goto LAB_00154570;
        }
        _memmove(puVar16,lVar31,-lVar33);
        puVar16 = (undefined8 *)((long)puVar16 - lVar33);
        uVar34 = lVar33 + uVar34;
        puVar19 = in_x6;
      }
      if (uVar13 < 0x10) {
        if (uVar13 < 8) {
          iVar18 = *(int *)(&UNK_008143b0 + uVar13 * 4);
          *(undefined1 *)puVar16 = *(undefined1 *)puVar19;
          *(undefined1 *)((long)puVar16 + 1) = *(undefined1 *)((long)puVar19 + 1);
          *(undefined1 *)((long)puVar16 + 2) = *(undefined1 *)((long)puVar19 + 2);
          *(undefined1 *)((long)puVar16 + 3) = *(undefined1 *)((long)puVar19 + 3);
          puVar5 = (undefined4 *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
          puVar19 = (undefined8 *)((long)puVar5 - (long)iVar18);
          *(undefined4 *)((long)puVar16 + 4) = *puVar5;
        }
        else {
          *puVar16 = *puVar19;
        }
        if (8 < uVar34) {
          puVar27 = puVar19 + 1;
          puVar20 = puVar16 + 1;
          if ((long)puVar20 - (long)puVar27 < 0x10) {
            do {
              puVar19 = puVar20 + 1;
              *puVar20 = *puVar27;
              puVar27 = puVar27 + 1;
              puVar20 = puVar19;
            } while (puVar19 < (undefined8 *)((long)puVar16 + uVar34));
          }
          else {
            uVar35 = *puVar27;
            puVar16[2] = puVar19[2];
            *puVar20 = uVar35;
            if (0x10 < uVar34 - 8) {
              puVar27 = puVar16 + 3;
              puVar19 = puVar19 + 5;
              do {
                uVar35 = puVar19[-2];
                puVar27[1] = puVar19[-1];
                *puVar27 = uVar35;
                uVar35 = *puVar19;
                puVar27[3] = puVar19[1];
                puVar27[2] = uVar35;
                puVar27 = puVar27 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar27 < (undefined8 *)((long)puVar16 + uVar34));
            }
          }
        }
      }
      else {
        uVar35 = *puVar19;
        puVar16[1] = puVar19[1];
        *puVar16 = uVar35;
        if (0x10 < uVar34) {
          puVar27 = puVar16 + 2;
          do {
            uVar35 = puVar19[2];
            puVar27[1] = puVar19[3];
            *puVar27 = uVar35;
            uVar35 = puVar19[4];
            puVar27[3] = puVar19[5];
            puVar27[2] = uVar35;
            puVar27 = puVar27 + 4;
            puVar19 = puVar19 + 4;
          } while (puVar27 < (undefined8 *)((long)puVar16 + uVar34));
        }
      }
    }
LAB_00154570:
    if (0xffffffffffffff88 < uVar11) {
      return uVar11;
    }
    puVar10 = (undefined8 *)((long)puVar10 + uVar11);
    unaff_w27 = unaff_w27 + -1;
    if (unaff_w27 == 0) goto code_r0x00155070;
  } while( true );
}

