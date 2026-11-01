
ulong FUN_001540d0(ulong *param_1)

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
  undefined8 *in_x6;
  undefined8 *puVar14;
  uint uVar15;
  ulong in_x9;
  ulong uVar16;
  undefined8 *puVar17;
  int iVar18;
  long in_x10;
  ulong *puVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  undefined8 *puVar22;
  ulong in_x12;
  undefined *puVar23;
  ulong uVar24;
  long in_x13;
  ulong uVar25;
  undefined1 *puVar26;
  undefined8 *puVar27;
  long in_x14;
  ulong *puVar28;
  uint uVar29;
  undefined1 *puVar30;
  long lVar31;
  ulong uVar32;
  undefined1 *puVar33;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long lVar34;
  undefined8 *unaff_x23;
  int iVar35;
  undefined *unaff_x25;
  int unaff_w27;
  ulong uVar36;
  long unaff_x29;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 *puStack0000000000000008;
  undefined8 *puStack0000000000000028;
  undefined8 *puStack0000000000000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  ulong in_stack_00000048;
  uint uStack0000000000000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  long in_stack_00000070;
  long lStack0000000000000078;
  ulong uStack0000000000000080;
  long lStack0000000000000088;
  ulong uStack0000000000000090;
  long lStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  uStack0000000000000050 = (uint)in_x12;
  if (in_x13 < 8) {
    puVar19 = in_x3;
    if (in_x13 != 0) {
      uVar16 = in_x12 >> 3 & 0x1fffffff;
      uVar15 = (uint)in_x13;
      if (in_x3 <= (ulong *)((long)in_x3 + (in_x13 - uVar16))) {
        uVar15 = (uint)uVar16;
      }
      uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
      goto LAB_0015412c;
    }
  }
  else {
    uVar15 = uStack0000000000000050 >> 3;
    uStack0000000000000050 = uStack0000000000000050 & 7;
LAB_0015412c:
    in_stack_00000058 = (ulong *)((long)in_x3 + (in_x13 - (ulong)uVar15));
    in_x9 = *in_stack_00000058;
    puVar19 = in_stack_00000058;
    in_stack_00000048 = in_x9;
  }
  lStack0000000000000078 = in_x14 + 8;
  uVar15 = *(uint *)(*(long *)(unaff_x21 + 0x10) + 4);
  uStack0000000000000050 = uVar15 + uStack0000000000000050;
  uStack0000000000000080 =
       in_x9 >> ((ulong)-uStack0000000000000050 & 0x3f) &
       (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar15 * 4);
  if (uStack0000000000000050 < 0x41) {
    if (puVar19 < param_1) {
      puVar28 = in_x3;
      if (puVar19 == in_x3) goto LAB_001541c4;
      uVar15 = (int)puVar19 - (int)in_x3;
      if (in_x3 <= (ulong *)((long)puVar19 - (ulong)(uStack0000000000000050 >> 3))) {
        uVar15 = uStack0000000000000050 >> 3;
      }
      puVar28 = (ulong *)((long)puVar19 - (ulong)uVar15);
      in_x9 = *puVar28;
      uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
    }
    else {
      puVar28 = (ulong *)((long)puVar19 - (ulong)(uStack0000000000000050 >> 3));
      in_x9 = *puVar28;
      uStack0000000000000050 = uStack0000000000000050 & 7;
    }
    in_stack_00000048 = in_x9;
    in_stack_00000058 = puVar28;
  }
  else {
    puVar28 = (ulong *)&UNK_00814388;
    in_stack_00000058 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  puStack0000000000000008 = (undefined8 *)(unaff_x21 + in_x10);
  puStack0000000000000030 = &uStack00000000000000a0;
  lStack0000000000000088 = *(long *)(unaff_x21 + 0x10) + 8;
  uVar15 = *(uint *)(*(long *)(unaff_x21 + 8) + 4);
  uStack0000000000000050 = uVar15 + uStack0000000000000050;
  uStack0000000000000090 =
       in_x9 >> ((ulong)-uStack0000000000000050 & 0x3f) &
       (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar15 * 4);
  if (uStack0000000000000050 < 0x41) {
    if (puVar28 < param_1) {
      if (puVar28 != in_x3) {
        uVar15 = (int)puVar28 - (int)in_x3;
        if (in_x3 <= (ulong *)((long)puVar28 - (ulong)(uStack0000000000000050 >> 3))) {
          uVar15 = uStack0000000000000050 >> 3;
        }
        in_stack_00000058 = (ulong *)((long)puVar28 - (ulong)uVar15);
        uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
        in_stack_00000048 = *in_stack_00000058;
      }
    }
    else {
      in_stack_00000058 = (ulong *)((long)puVar28 - (ulong)(uStack0000000000000050 >> 3));
      uStack0000000000000050 = uStack0000000000000050 & 7;
      in_stack_00000048 = *in_stack_00000058;
    }
  }
  else {
    in_stack_00000058 = (ulong *)&UNK_00814388;
  }
  lStack0000000000000098 = *(long *)(unaff_x21 + 8) + 8;
  puStack0000000000000028 = &uStack00000000000000a0;
  puVar10 = unaff_x19;
  do {
    puVar2 = (ushort *)(lStack0000000000000078 + in_stack_00000070 * 8);
    puVar3 = (ushort *)(lStack0000000000000098 + uStack0000000000000090 * 8);
    puVar4 = (ushort *)(lStack0000000000000088 + uStack0000000000000080 * 8);
    uVar36 = (ulong)*(uint *)(puVar3 + 2);
    uVar16 = (ulong)*(uint *)(puVar2 + 2);
    uVar15 = *(uint *)(puVar4 + 2);
    bVar6 = (byte)puVar2[1];
    bVar7 = (byte)puVar3[1];
    bVar8 = (byte)puVar4[1];
    uVar29 = (uint)bVar8;
    puVar20 = puStack0000000000000030;
    if (bVar8 < 2) {
      bVar9 = *(uint *)(puVar2 + 2) == 0;
      if (bVar8 != 0) {
        if (bVar9) {
          uVar15 = uVar15 + 1;
        }
        uVar13 = (ulong)uStack0000000000000050;
        uStack0000000000000050 = uStack0000000000000050 + 1;
        lVar31 = (ulong)uVar15 - ((long)(in_stack_00000048 << (uVar13 & 0x3f)) >> 0x3f);
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
      puVar20 = puStack0000000000000028 + !bVar9;
    }
    else {
      uVar13 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + uVar29;
      uVar13 = ((in_stack_00000048 << (uVar13 & 0x3f)) >> ((ulong)-uVar29 & 0x3f)) + (ulong)uVar15;
code_r0x001542f4:
      in_stack_000000b0 = in_stack_000000a8;
    }
LAB_00154320:
    uStack00000000000000a0 = uVar13;
    in_stack_000000a8 = *puVar20;
    if (bVar7 != 0) {
      uVar11 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + bVar7;
      uVar36 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar36;
    }
    iVar18 = (int)in_stack_00000060;
    if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar29 & 0xff)) {
      if (uStack0000000000000050 < 0x41) {
        if (in_stack_00000058 < in_stack_00000068) {
          if (in_stack_00000058 == in_stack_00000060) goto code_r0x00154360;
          uVar15 = (int)in_stack_00000058 - iVar18;
          if (in_stack_00000060 <=
              (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
            uVar15 = uStack0000000000000050 >> 3;
          }
          uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
        }
        else {
          uVar15 = uStack0000000000000050 >> 3;
          uStack0000000000000050 = uStack0000000000000050 & 7;
        }
        in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar15);
        in_stack_00000048 = *in_stack_00000058;
      }
      else {
        in_stack_00000058 = (ulong *)&UNK_00814388;
      }
    }
code_r0x00154360:
    if (bVar6 != 0) {
      uVar11 = (ulong)uStack0000000000000050;
      uStack0000000000000050 = uStack0000000000000050 + bVar6;
      uVar16 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) + uVar16;
    }
    iVar35 = unaff_w27 + -1;
    if (iVar35 != 0) {
      iVar1 = uStack0000000000000050 + *(byte *)((long)puVar2 + 3);
      in_stack_00000070 =
           (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
           (ulong)*puVar2;
      iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
      uStack0000000000000090 =
           (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
           (ulong)*puVar3;
      uStack0000000000000050 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
      uStack0000000000000080 =
           (in_stack_00000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
           (ulong)*puVar4;
      if (uStack0000000000000050 < 0x41) {
        if (in_stack_00000058 < in_stack_00000068) {
          if (in_stack_00000058 != in_stack_00000060) {
            uVar15 = (int)in_stack_00000058 - iVar18;
            if (in_stack_00000060 <=
                (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
              uVar15 = uStack0000000000000050 >> 3;
            }
            uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar15 = uStack0000000000000050 >> 3;
          uStack0000000000000050 = uStack0000000000000050 & 7;
code_r0x00154464:
          in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar15);
          in_stack_00000048 = *in_stack_00000058;
        }
        puVar20 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar23 = *(undefined **)(&UNK_00007698 + unaff_x21);
        puVar12 = (undefined *)((long)puVar20 + uVar16);
        if (puVar12 <= puVar23) goto code_r0x00154484;
      }
      else {
        in_stack_00000058 = (ulong *)&UNK_00814388;
        puVar20 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar23 = *(undefined **)(&UNK_00007698 + unaff_x21);
        puVar12 = (undefined *)((long)puVar20 + uVar16);
        if (puVar12 <= puVar23) goto code_r0x00154484;
      }
      if (unaff_w27 < 1) {
        return 0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar11 = (long)puVar23 - (long)puVar20;
      if (uVar11 == 0) goto code_r0x00154a08;
      if ((ulong)(unaff_x22 - (long)puVar10) < uVar11) {
        return 0xffffffffffffffba;
      }
      uVar25 = (long)puVar10 - (long)puVar20;
      puVar17 = (undefined8 *)((long)puVar10 + uVar11);
      if (((long)uVar25 < -7) && (7 < uVar11)) {
        if (uVar25 < 0xfffffffffffffff0) {
          puVar27 = puVar17 + -4;
          if (puVar10 <= puVar27) {
            uVar37 = *puVar20;
            puVar10[1] = puVar20[1];
            *puVar10 = uVar37;
            if (0x10 < (ulong)((long)puVar27 - (long)puVar10)) {
              puVar21 = puVar10 + 2;
              puVar14 = puVar20;
              do {
                uVar37 = puVar14[2];
                puVar21[1] = puVar14[3];
                *puVar21 = uVar37;
                uVar37 = puVar14[4];
                puVar21[3] = puVar14[5];
                puVar21[2] = uVar37;
                puVar21 = puVar21 + 4;
                puVar14 = puVar14 + 4;
              } while (puVar21 < puVar27);
            }
            puVar20 = (undefined8 *)((long)puVar20 + ((long)puVar27 - (long)puVar10));
code_r0x001548ac:
            puVar26 = (undefined1 *)((long)puVar10 + (uVar11 - (long)puVar27));
            if ((puVar26 < (undefined1 *)0x8) || ((ulong)((long)puVar27 - (long)puVar20) < 0x40)) {
              puVar10 = puVar27;
            }
            else {
              if (puVar26 < (undefined1 *)0x40) {
                puVar30 = (undefined1 *)0x0;
              }
              else {
                puVar30 = (undefined1 *)((ulong)puVar26 & 0xffffffffffffffc0);
                puVar10 = puVar27 + 4;
                puVar21 = puVar20 + 4;
                puVar33 = puVar30;
                do {
                  uVar37 = puVar21[-4];
                  uVar39 = puVar21[-1];
                  uVar38 = puVar21[-2];
                  uVar41 = puVar21[1];
                  uVar40 = *puVar21;
                  uVar43 = puVar21[3];
                  uVar42 = puVar21[2];
                  puVar10[-3] = puVar21[-3];
                  puVar10[-4] = uVar37;
                  puVar10[-1] = uVar39;
                  puVar10[-2] = uVar38;
                  puVar10[1] = uVar41;
                  *puVar10 = uVar40;
                  puVar10[3] = uVar43;
                  puVar10[2] = uVar42;
                  puVar33 = puVar33 + -0x40;
                  puVar10 = puVar10 + 8;
                  puVar21 = puVar21 + 8;
                } while (puVar33 != (undefined1 *)0x0);
                if (puVar26 == puVar30) goto code_r0x00154a00;
                if (((ulong)puVar26 & 0x38) == 0) {
                  puVar20 = (undefined8 *)((long)puVar20 + (long)puVar30);
                  puVar10 = (undefined8 *)((long)puVar27 + (long)puVar30);
                  goto code_r0x001549d0;
                }
              }
              puVar33 = (undefined1 *)((ulong)puVar26 & 0xfffffffffffffff8);
              lVar31 = (long)puVar30 - (long)puVar33;
              puVar10 = (undefined8 *)((long)puVar27 + (long)puVar30);
              puVar21 = (undefined8 *)((long)puVar20 + (long)puVar30);
              do {
                *puVar10 = *puVar21;
                lVar31 = lVar31 + 8;
                puVar10 = puVar10 + 1;
                puVar21 = puVar21 + 1;
              } while (lVar31 != 0);
              puVar10 = (undefined8 *)((long)puVar27 + (long)puVar33);
              puVar20 = (undefined8 *)((long)puVar20 + (long)puVar33);
              if (puVar26 == puVar33) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              puVar21 = (undefined8 *)((long)puVar10 + 1);
              *(undefined1 *)puVar10 = *(undefined1 *)puVar20;
              puVar10 = puVar21;
              puVar20 = (undefined8 *)((long)puVar20 + 1);
            } while (puVar21 != (undefined8 *)((long)puVar27 + (long)puVar26));
            goto code_r0x00154a00;
          }
        }
        puVar27 = puVar10;
        if (0 < (long)uVar11) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar11 < 1) goto code_r0x00154a00;
      puVar12 = (undefined *)((long)puVar10 + (long)puVar23) + -(long)puVar20;
      if (puVar12 <= (undefined *)((long)puVar10 + 1)) {
        puVar12 = (undefined *)((long)puVar10 + 1);
      }
      uVar24 = (long)puVar12 - (long)puVar10;
      if ((uVar24 < 8) || (uVar25 < 0x40)) goto code_r0x001549f0;
      if (uVar24 < 0x40) {
        uVar25 = 0;
        goto code_r0x00154994;
      }
      uVar25 = uVar24 & 0xffffffffffffffc0;
      puVar27 = puVar10 + 4;
      puVar21 = puVar20 + 4;
      uVar32 = uVar25;
      do {
        uVar37 = puVar21[-4];
        uVar39 = puVar21[-1];
        uVar38 = puVar21[-2];
        uVar41 = puVar21[1];
        uVar40 = *puVar21;
        uVar43 = puVar21[3];
        uVar42 = puVar21[2];
        puVar27[-3] = puVar21[-3];
        puVar27[-4] = uVar37;
        puVar27[-1] = uVar39;
        puVar27[-2] = uVar38;
        puVar27[1] = uVar41;
        *puVar27 = uVar40;
        puVar27[3] = uVar43;
        puVar27[2] = uVar42;
        uVar32 = uVar32 - 0x40;
        puVar27 = puVar27 + 8;
        puVar21 = puVar21 + 8;
      } while (uVar32 != 0);
      if (uVar24 != uVar25) {
        if ((uVar24 & 0x38) == 0) {
          puVar20 = (undefined8 *)((long)puVar20 + uVar25);
          puVar10 = (undefined8 *)((long)puVar10 + uVar25);
        }
        else {
code_r0x00154994:
          uVar32 = uVar24 & 0xfffffffffffffff8;
          lVar31 = uVar25 - uVar32;
          puVar27 = (undefined8 *)((long)puVar20 + uVar25);
          puVar21 = (undefined8 *)((long)puVar10 + uVar25);
          do {
            *puVar21 = *puVar27;
            lVar31 = lVar31 + 8;
            puVar27 = puVar27 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar31 != 0);
          puVar10 = (undefined8 *)((long)puVar10 + uVar32);
          puVar20 = (undefined8 *)((long)puVar20 + uVar32);
          if (uVar24 == uVar32) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          puVar27 = (undefined8 *)((long)puVar10 + 1);
          *(undefined1 *)puVar10 = *(undefined1 *)puVar20;
          puVar10 = puVar27;
          puVar20 = (undefined8 *)((long)puVar20 + 1);
        } while (puVar27 < puVar17);
      }
code_r0x00154a00:
      uVar16 = uVar16 - uVar11;
      puVar10 = puVar17;
code_r0x00154a08:
      *(undefined8 **)(unaff_x29 + -0x78) = puStack0000000000000008;
      unaff_x25 = &UNK_000176a4 + unaff_x21;
      *(undefined4 *)((long)unaff_x23 + 0xe64) = 0;
      puVar20 = (undefined8 *)((long)puVar10 + uVar16);
      puVar17 = (undefined8 *)((long)puVar20 - uVar13);
      Hint_Prefetch(puVar17,0,0,0);
      puStack0000000000000028 = (undefined8 *)(unaff_x22 + -0x20);
      if ((unaff_x25 < (undefined *)((long)puStack0000000000000008 + uVar16)) ||
         (uVar11 = uVar16 + uVar36, puStack0000000000000028 < (undefined8 *)((long)puVar10 + uVar11)
         )) {
        *(ulong *)(unaff_x29 + -0x70) = uVar16;
        *(ulong *)(unaff_x29 + -0x68) = uVar36;
        *(ulong *)(unaff_x29 + -0x60) = uVar13;
        uVar11 = func_0x00155c78(puVar10,unaff_x22,unaff_x29 + -0x70,unaff_x29 + -0x78,unaff_x25,
                                 in_x6,in_stack_00000040,in_stack_00000038);
        puVar27 = puStack0000000000000028;
      }
      else {
        uVar37 = *puStack0000000000000008;
        puVar10[1] = puStack0000000000000008[1];
        *puVar10 = uVar37;
        if (0x10 < uVar16) {
          uVar37 = puStack0000000000000008[2];
          puVar10[3] = puStack0000000000000008[3];
          puVar10[2] = uVar37;
          if (0x10 < uVar16 - 0x10) {
            puVar27 = puVar10 + 4;
            puVar21 = puStack0000000000000008 + 6;
            do {
              uVar37 = puVar21[-2];
              puVar27[1] = puVar21[-1];
              *puVar27 = uVar37;
              uVar37 = *puVar21;
              puVar27[3] = puVar21[1];
              puVar27[2] = uVar37;
              puVar27 = puVar27 + 4;
              puVar21 = puVar21 + 4;
            } while (puVar27 < puVar20);
          }
        }
        *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)puStack0000000000000008 + uVar16);
        if ((ulong)((long)puVar20 - (long)in_x6) < uVar13) {
          if ((ulong)((long)puVar20 - in_stack_00000040) < uVar13) {
            return 0xffffffffffffffec;
          }
          lVar34 = (long)puVar17 - (long)in_x6;
          lVar31 = in_stack_00000038 + lVar34;
          puStack0000000000000008 = in_x6;
          if (lVar31 + uVar36 <= in_stack_00000038) {
            _memmove(puVar20,lVar31,uVar36);
            in_x6 = puStack0000000000000008;
            puVar27 = puStack0000000000000028;
            goto joined_r0x00155150;
          }
          _memmove(puVar20,lVar31,-lVar34);
          puVar20 = (undefined8 *)((long)puVar20 - lVar34);
          uVar36 = lVar34 + uVar36;
          in_x6 = puStack0000000000000008;
          puVar17 = puStack0000000000000008;
        }
        puVar27 = puStack0000000000000028;
        if (uVar13 < 0x10) {
          if (uVar13 < 8) {
            iVar1 = *(int *)(&UNK_008143b0 + uVar13 * 4);
            *(undefined1 *)puVar20 = *(undefined1 *)puVar17;
            *(undefined1 *)((long)puVar20 + 1) = *(undefined1 *)((long)puVar17 + 1);
            *(undefined1 *)((long)puVar20 + 2) = *(undefined1 *)((long)puVar17 + 2);
            *(undefined1 *)((long)puVar20 + 3) = *(undefined1 *)((long)puVar17 + 3);
            puVar5 = (undefined4 *)((long)puVar17 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
            puVar17 = (undefined8 *)((long)puVar5 - (long)iVar1);
            *(undefined4 *)((long)puVar20 + 4) = *puVar5;
          }
          else {
            *puVar20 = *puVar17;
          }
          if (8 < uVar36) {
            puVar21 = puVar17 + 1;
            puVar14 = puVar20 + 1;
            if ((long)puVar14 - (long)puVar21 < 0x10) {
              do {
                puVar17 = puVar14 + 1;
                *puVar14 = *puVar21;
                puVar21 = puVar21 + 1;
                puVar14 = puVar17;
              } while (puVar17 < (undefined8 *)((long)puVar20 + uVar36));
            }
            else {
              uVar37 = *puVar21;
              puVar20[2] = puVar17[2];
              *puVar14 = uVar37;
              if (0x10 < uVar36 - 8) {
                puVar21 = puVar20 + 3;
                puVar17 = puVar17 + 5;
                do {
                  uVar37 = puVar17[-2];
                  puVar21[1] = puVar17[-1];
                  *puVar21 = uVar37;
                  uVar37 = *puVar17;
                  puVar21[3] = puVar17[1];
                  puVar21[2] = uVar37;
                  puVar21 = puVar21 + 4;
                  puVar17 = puVar17 + 4;
                } while (puVar21 < (undefined8 *)((long)puVar20 + uVar36));
              }
            }
          }
        }
        else {
          uVar37 = *puVar17;
          puVar20[1] = puVar17[1];
          *puVar20 = uVar37;
          if (0x10 < uVar36) {
            puVar21 = puVar20 + 2;
            do {
              uVar37 = puVar17[2];
              puVar21[1] = puVar17[3];
              *puVar21 = uVar37;
              uVar37 = puVar17[4];
              puVar21[3] = puVar17[5];
              puVar21[2] = uVar37;
              puVar21 = puVar21 + 4;
              puVar17 = puVar17 + 4;
            } while (puVar21 < (undefined8 *)((long)puVar20 + uVar36));
          }
        }
      }
joined_r0x00155150:
      if (0xffffffffffffff88 < uVar11) {
        return uVar11;
      }
      puVar10 = (undefined8 *)((long)puVar10 + uVar11);
      puStack0000000000000028 = puVar27;
      if (unaff_w27 < 2) {
        if (iVar35 != 0) {
          return 0xffffffffffffffec;
        }
        goto code_r0x00155070;
      }
      puStack0000000000000008 = &uStack00000000000000a0;
      do {
        puVar2 = (ushort *)(lStack0000000000000078 + in_stack_00000070 * 8);
        puVar3 = (ushort *)(lStack0000000000000098 + uStack0000000000000090 * 8);
        puVar4 = (ushort *)(lStack0000000000000088 + uStack0000000000000080 * 8);
        uVar36 = (ulong)*(uint *)(puVar3 + 2);
        uVar16 = (ulong)*(uint *)(puVar2 + 2);
        uVar15 = *(uint *)(puVar4 + 2);
        bVar6 = (byte)puVar2[1];
        bVar7 = (byte)puVar3[1];
        bVar8 = (byte)puVar4[1];
        uVar29 = (uint)bVar8;
        puVar20 = puStack0000000000000030;
        if (bVar8 < 2) {
          bVar9 = *(uint *)(puVar2 + 2) == 0;
          if (bVar8 != 0) {
            if (bVar9) {
              uVar15 = uVar15 + 1;
            }
            uVar13 = (ulong)uStack0000000000000050;
            uStack0000000000000050 = uStack0000000000000050 + 1;
            lVar31 = (ulong)uVar15 - ((long)(in_stack_00000048 << (uVar13 & 0x3f)) >> 0x3f);
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
          puVar20 = puStack0000000000000008 + !bVar9;
        }
        else {
          uVar13 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + uVar29;
          uVar13 = ((in_stack_00000048 << (uVar13 & 0x3f)) >> ((ulong)-uVar29 & 0x3f)) +
                   (ulong)uVar15;
code_r0x00154bb0:
          in_stack_000000b0 = in_stack_000000a8;
        }
LAB_00154bdc:
        uStack00000000000000a0 = uVar13;
        in_stack_000000a8 = *puVar20;
        if (bVar7 != 0) {
          uVar11 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + bVar7;
          uVar36 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar36
          ;
        }
        if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar29 & 0xff)) {
          if (uStack0000000000000050 < 0x41) {
            if (in_stack_00000058 < in_stack_00000068) {
              puVar27 = puStack0000000000000028;
              if (in_stack_00000058 != in_stack_00000060) {
                uVar15 = (int)in_stack_00000058 - iVar18;
                if (in_stack_00000060 <=
                    (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
                  uVar15 = uStack0000000000000050 >> 3;
                }
                in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar15);
                uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
                in_stack_00000048 = *in_stack_00000058;
              }
            }
            else {
              in_stack_00000058 =
                   (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3));
              uStack0000000000000050 = uStack0000000000000050 & 7;
              in_stack_00000048 = *in_stack_00000058;
              puVar27 = puStack0000000000000028;
            }
          }
          else {
            in_stack_00000058 = (ulong *)&UNK_00814388;
            puVar27 = puStack0000000000000028;
          }
        }
        if (bVar6 != 0) {
          uVar11 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + bVar6;
          uVar16 = ((in_stack_00000048 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) + uVar16
          ;
        }
        if (iVar35 != 1) {
          iVar1 = uStack0000000000000050 + *(byte *)((long)puVar2 + 3);
          in_stack_00000070 =
               (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
               (ulong)*puVar2;
          iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
          uStack0000000000000090 =
               (in_stack_00000048 >> ((ulong)(uint)-iVar1 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
               (ulong)*puVar3;
          uStack0000000000000050 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
          uStack0000000000000080 =
               (in_stack_00000048 >> ((ulong)-uStack0000000000000050 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
               (ulong)*puVar4;
          if (uStack0000000000000050 < 0x41) {
            if (in_stack_00000058 < in_stack_00000068) {
              if (in_stack_00000058 == in_stack_00000060) goto LAB_00154d14;
              uVar15 = (int)in_stack_00000058 - iVar18;
              if (in_stack_00000060 <=
                  (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
                uVar15 = uStack0000000000000050 >> 3;
              }
              uStack0000000000000050 = uStack0000000000000050 + uVar15 * -8;
            }
            else {
              uVar15 = uStack0000000000000050 >> 3;
              uStack0000000000000050 = uStack0000000000000050 & 7;
            }
            in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar15);
            in_stack_00000048 = *in_stack_00000058;
          }
          else {
            in_stack_00000058 = (ulong *)&UNK_00814388;
          }
        }
LAB_00154d14:
        puVar21 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar20 = (undefined8 *)((long)puVar10 + uVar16);
        puVar17 = (undefined8 *)((long)puVar20 - uVar13);
        Hint_Prefetch(puVar17,0,0,0);
        if ((unaff_x25 < (undefined *)((long)puVar21 + uVar16)) ||
           (uVar11 = uVar16 + uVar36, puVar27 < (undefined8 *)((long)puVar10 + uVar11))) {
          *(ulong *)(unaff_x29 + -0x70) = uVar16;
          *(ulong *)(unaff_x29 + -0x68) = uVar36;
          *(ulong *)(unaff_x29 + -0x60) = uVar13;
          uVar11 = func_0x00155c78(puVar10,unaff_x22,unaff_x29 + -0x70,unaff_x29 + -0x78,unaff_x25,
                                   in_x6,in_stack_00000040,in_stack_00000038);
          puVar27 = puStack0000000000000028;
        }
        else {
          uVar37 = *puVar21;
          puVar10[1] = puVar21[1];
          *puVar10 = uVar37;
          if (0x10 < uVar16) {
            uVar37 = puVar21[2];
            puVar10[3] = puVar21[3];
            puVar10[2] = uVar37;
            if (0x10 < uVar16 - 0x10) {
              puVar14 = puVar10 + 4;
              puVar22 = puVar21 + 6;
              do {
                uVar37 = puVar22[-2];
                puVar14[1] = puVar22[-1];
                *puVar14 = uVar37;
                uVar37 = *puVar22;
                puVar14[3] = puVar22[1];
                puVar14[2] = uVar37;
                puVar14 = puVar14 + 4;
                puVar22 = puVar22 + 4;
              } while (puVar14 < puVar20);
            }
          }
          *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)puVar21 + uVar16);
          if ((ulong)((long)puVar20 - (long)in_x6) < uVar13) {
            if ((ulong)((long)puVar20 - in_stack_00000040) < uVar13) {
              return 0xffffffffffffffec;
            }
            lVar34 = (long)puVar17 - (long)in_x6;
            lVar31 = in_stack_00000038 + lVar34;
            if (lVar31 + uVar36 <= in_stack_00000038) {
              _memmove(puVar20,lVar31,uVar36);
              puVar27 = puStack0000000000000028;
              goto joined_r0x00154e58;
            }
            _memmove(puVar20,lVar31,-lVar34);
            puVar20 = (undefined8 *)((long)puVar20 - lVar34);
            uVar36 = lVar34 + uVar36;
            puVar27 = puStack0000000000000028;
            puVar17 = in_x6;
          }
          if (uVar13 < 0x10) {
            if (uVar13 < 8) {
              iVar1 = *(int *)(&UNK_008143b0 + uVar13 * 4);
              *(undefined1 *)puVar20 = *(undefined1 *)puVar17;
              *(undefined1 *)((long)puVar20 + 1) = *(undefined1 *)((long)puVar17 + 1);
              *(undefined1 *)((long)puVar20 + 2) = *(undefined1 *)((long)puVar17 + 2);
              *(undefined1 *)((long)puVar20 + 3) = *(undefined1 *)((long)puVar17 + 3);
              puVar5 = (undefined4 *)((long)puVar17 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
              puVar17 = (undefined8 *)((long)puVar5 - (long)iVar1);
              *(undefined4 *)((long)puVar20 + 4) = *puVar5;
            }
            else {
              *puVar20 = *puVar17;
            }
            puVar27 = puStack0000000000000028;
            if (8 < uVar36) {
              puVar21 = puVar17 + 1;
              puVar14 = puVar20 + 1;
              if ((long)puVar14 - (long)puVar21 < 0x10) {
                do {
                  puVar17 = puVar14 + 1;
                  *puVar14 = *puVar21;
                  puVar21 = puVar21 + 1;
                  puVar14 = puVar17;
                } while (puVar17 < (undefined8 *)((long)puVar20 + uVar36));
              }
              else {
                uVar37 = *puVar21;
                puVar20[2] = puVar17[2];
                *puVar14 = uVar37;
                if (0x10 < uVar36 - 8) {
                  puVar21 = puVar20 + 3;
                  puVar17 = puVar17 + 5;
                  do {
                    uVar37 = puVar17[-2];
                    puVar21[1] = puVar17[-1];
                    *puVar21 = uVar37;
                    uVar37 = *puVar17;
                    puVar21[3] = puVar17[1];
                    puVar21[2] = uVar37;
                    puVar21 = puVar21 + 4;
                    puVar17 = puVar17 + 4;
                  } while (puVar21 < (undefined8 *)((long)puVar20 + uVar36));
                }
              }
            }
          }
          else {
            uVar37 = *puVar17;
            puVar20[1] = puVar17[1];
            *puVar20 = uVar37;
            if (0x10 < uVar36) {
              puVar21 = puVar20 + 2;
              do {
                uVar37 = puVar17[2];
                puVar21[1] = puVar17[3];
                *puVar21 = uVar37;
                uVar37 = puVar17[4];
                puVar21[3] = puVar17[5];
                puVar21[2] = uVar37;
                puVar21 = puVar21 + 4;
                puVar17 = puVar17 + 4;
              } while (puVar21 < (undefined8 *)((long)puVar20 + uVar36));
            }
          }
        }
joined_r0x00154e58:
        if (0xffffffffffffff88 < uVar11) {
          return uVar11;
        }
        puVar10 = (undefined8 *)((long)puVar10 + uVar11);
        iVar35 = iVar35 + -1;
      } while (iVar35 != 0);
code_r0x00155070:
      if (in_stack_00000058 != in_stack_00000060) {
        return 0xffffffffffffffec;
      }
      if (uStack0000000000000050 != 0x40) {
        return 0xffffffffffffffec;
      }
      *unaff_x23 = CONCAT44((int)in_stack_000000a8,(int)uStack00000000000000a0);
      *(int *)(unaff_x23 + 1) = (int)in_stack_000000b0;
      puVar12 = *(undefined **)(unaff_x29 + -0x78);
      if (*(int *)((long)unaff_x23 + 0xe64) == 2) {
        uVar16 = (long)unaff_x25 - (long)puVar12;
        if ((ulong)(unaff_x22 - (long)puVar10) < uVar16) {
          return 0xffffffffffffffba;
        }
        if (puVar10 != (undefined8 *)0x0) {
          _memmove(puVar10,puVar12,uVar16);
          puVar10 = (undefined8 *)((long)puVar10 + uVar16);
        }
        puVar12 = &UNK_000076a4 + unaff_x21;
        unaff_x25 = &UNK_000176a4 + unaff_x21;
        *(undefined4 *)((long)unaff_x23 + 0xe64) = 0;
      }
      uVar16 = (long)unaff_x25 - (long)puVar12;
      if ((ulong)(unaff_x22 - (long)puVar10) < uVar16) {
        return 0xffffffffffffffba;
      }
      if (puVar10 == (undefined8 *)0x0) {
        puVar26 = (undefined1 *)0x0;
      }
      else {
        _memcpy(puVar10,puVar12,uVar16);
        puVar26 = (undefined1 *)((long)puVar10 + uVar16);
      }
      return (long)puVar26 - (long)unaff_x19;
    }
    puVar20 = *(undefined8 **)(unaff_x29 + -0x78);
    puVar23 = *(undefined **)(&UNK_00007698 + unaff_x21);
    puVar12 = (undefined *)((long)puVar20 + uVar16);
    if (puVar23 < puVar12) goto code_r0x001547d8;
code_r0x00154484:
    if ((unaff_x25 < puVar12) ||
       (uVar11 = uVar16 + uVar36, puVar12 + -0x20 < (undefined *)((long)puVar10 + uVar11))) {
      *(ulong *)(unaff_x29 + -0x70) = uVar16;
      *(ulong *)(unaff_x29 + -0x68) = uVar36;
      *(ulong *)(unaff_x29 + -0x60) = uVar13;
      uVar11 = func_0x00156308(puVar10,unaff_x22,puVar12 + -0x20,unaff_x29 + -0x70,unaff_x29 + -0x78
                               ,unaff_x25,in_x6,in_stack_00000040);
    }
    else {
      puVar17 = (undefined8 *)((long)puVar10 + uVar16);
      uVar37 = *puVar20;
      puVar10[1] = puVar20[1];
      *puVar10 = uVar37;
      if (0x10 < uVar16) {
        uVar37 = puVar20[2];
        puVar10[3] = puVar20[3];
        puVar10[2] = uVar37;
        if (0x10 < uVar16 - 0x10) {
          puVar27 = puVar10 + 4;
          puVar20 = puVar20 + 6;
          do {
            uVar37 = puVar20[-2];
            puVar27[1] = puVar20[-1];
            *puVar27 = uVar37;
            uVar37 = *puVar20;
            puVar27[3] = puVar20[1];
            puVar27[2] = uVar37;
            puVar27 = puVar27 + 4;
            puVar20 = puVar20 + 4;
          } while (puVar27 < puVar17);
        }
      }
      *(undefined **)(unaff_x29 + -0x78) = puVar12;
      puVar20 = (undefined8 *)((long)puVar17 - uVar13);
      if ((ulong)((long)puVar17 - (long)in_x6) < uVar13) {
        if ((ulong)((long)puVar17 - in_stack_00000040) < uVar13) {
          return 0xffffffffffffffec;
        }
        lVar34 = (long)((long)puVar17 - uVar13) - (long)in_x6;
        lVar31 = in_stack_00000038 + lVar34;
        if (lVar31 + uVar36 <= in_stack_00000038) {
          _memmove(puVar17,lVar31,uVar36);
          goto LAB_00154570;
        }
        _memmove(puVar17,lVar31,-lVar34);
        puVar17 = (undefined8 *)((long)puVar17 - lVar34);
        uVar36 = lVar34 + uVar36;
        puVar20 = in_x6;
      }
      if (uVar13 < 0x10) {
        if (uVar13 < 8) {
          iVar18 = *(int *)(&UNK_008143b0 + uVar13 * 4);
          *(undefined1 *)puVar17 = *(undefined1 *)puVar20;
          *(undefined1 *)((long)puVar17 + 1) = *(undefined1 *)((long)puVar20 + 1);
          *(undefined1 *)((long)puVar17 + 2) = *(undefined1 *)((long)puVar20 + 2);
          *(undefined1 *)((long)puVar17 + 3) = *(undefined1 *)((long)puVar20 + 3);
          puVar5 = (undefined4 *)((long)puVar20 + (ulong)*(uint *)(&UNK_00814390 + uVar13 * 4));
          puVar20 = (undefined8 *)((long)puVar5 - (long)iVar18);
          *(undefined4 *)((long)puVar17 + 4) = *puVar5;
        }
        else {
          *puVar17 = *puVar20;
        }
        if (8 < uVar36) {
          puVar27 = puVar20 + 1;
          puVar21 = puVar17 + 1;
          if ((long)puVar21 - (long)puVar27 < 0x10) {
            do {
              puVar20 = puVar21 + 1;
              *puVar21 = *puVar27;
              puVar27 = puVar27 + 1;
              puVar21 = puVar20;
            } while (puVar20 < (undefined8 *)((long)puVar17 + uVar36));
          }
          else {
            uVar37 = *puVar27;
            puVar17[2] = puVar20[2];
            *puVar21 = uVar37;
            if (0x10 < uVar36 - 8) {
              puVar27 = puVar17 + 3;
              puVar20 = puVar20 + 5;
              do {
                uVar37 = puVar20[-2];
                puVar27[1] = puVar20[-1];
                *puVar27 = uVar37;
                uVar37 = *puVar20;
                puVar27[3] = puVar20[1];
                puVar27[2] = uVar37;
                puVar27 = puVar27 + 4;
                puVar20 = puVar20 + 4;
              } while (puVar27 < (undefined8 *)((long)puVar17 + uVar36));
            }
          }
        }
      }
      else {
        uVar37 = *puVar20;
        puVar17[1] = puVar20[1];
        *puVar17 = uVar37;
        if (0x10 < uVar36) {
          puVar27 = puVar17 + 2;
          do {
            uVar37 = puVar20[2];
            puVar27[1] = puVar20[3];
            *puVar27 = uVar37;
            uVar37 = puVar20[4];
            puVar27[3] = puVar20[5];
            puVar27[2] = uVar37;
            puVar27 = puVar27 + 4;
            puVar20 = puVar20 + 4;
          } while (puVar27 < (undefined8 *)((long)puVar17 + uVar36));
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

