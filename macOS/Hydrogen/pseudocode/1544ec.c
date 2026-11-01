
ulong FUN_001544ec(ulong param_1,undefined8 param_2,long param_3)

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
  bool bVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined *puVar13;
  ulong uVar14;
  undefined8 *in_x6;
  undefined1 *puVar15;
  ulong in_x9;
  undefined8 *puVar16;
  int iVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined *puVar20;
  ulong uVar21;
  undefined8 *puVar22;
  uint uVar23;
  undefined1 *puVar24;
  long lVar25;
  ulong uVar26;
  undefined1 *puVar27;
  ulong unaff_x19;
  ulong uVar28;
  ulong unaff_x20;
  long unaff_x21;
  undefined *unaff_x22;
  long lVar29;
  undefined8 *unaff_x23;
  int iVar30;
  long unaff_x24;
  undefined8 *unaff_x26;
  int unaff_w27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
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
  
code_r0x001544ec:
  if (param_1 <= in_x9) {
    _memmove(unaff_x23,param_3,unaff_x28);
    iVar30 = unaff_w27;
    goto LAB_00154570;
  }
  _memmove(unaff_x23,param_3,-unaff_x24);
  unaff_x23 = (undefined8 *)((long)unaff_x23 - unaff_x24);
  unaff_x28 = unaff_x24 + unaff_x28;
  puVar18 = in_x6;
code_r0x00154518:
  iVar30 = unaff_w27;
  if (unaff_x19 < 0x10) {
    if (unaff_x19 < 8) {
      iVar17 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
      *(undefined1 *)unaff_x23 = *(undefined1 *)puVar18;
      *(undefined1 *)((long)unaff_x23 + 1) = *(undefined1 *)((long)puVar18 + 1);
      *(undefined1 *)((long)unaff_x23 + 2) = *(undefined1 *)((long)puVar18 + 2);
      *(undefined1 *)((long)unaff_x23 + 3) = *(undefined1 *)((long)puVar18 + 3);
      puVar5 = (undefined4 *)((long)puVar18 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4));
      puVar18 = (undefined8 *)((long)puVar5 - (long)iVar17);
      *(undefined4 *)((long)unaff_x23 + 4) = *puVar5;
    }
    else {
      *unaff_x23 = *puVar18;
    }
    if (8 < unaff_x28) {
      puVar16 = puVar18 + 1;
      puVar19 = unaff_x23 + 1;
      if ((long)puVar19 - (long)puVar16 < 0x10) {
        do {
          puVar18 = puVar19 + 1;
          *puVar19 = *puVar16;
          puVar16 = puVar16 + 1;
          puVar19 = puVar18;
        } while (puVar18 < (undefined8 *)((long)unaff_x23 + unaff_x28));
      }
      else {
        uVar31 = *puVar16;
        unaff_x23[2] = puVar18[2];
        *puVar19 = uVar31;
        if (0x10 < unaff_x28 - 8) {
          puVar16 = unaff_x23 + 3;
          puVar18 = puVar18 + 5;
          do {
            uVar31 = puVar18[-2];
            puVar16[1] = puVar18[-1];
            *puVar16 = uVar31;
            uVar31 = *puVar18;
            puVar16[3] = puVar18[1];
            puVar16[2] = uVar31;
            puVar16 = puVar16 + 4;
            puVar18 = puVar18 + 4;
          } while (puVar16 < (undefined8 *)((long)unaff_x23 + unaff_x28));
        }
      }
    }
  }
  else {
    uVar31 = *puVar18;
    unaff_x23[1] = puVar18[1];
    *unaff_x23 = uVar31;
    if (0x10 < unaff_x28) {
      puVar16 = unaff_x23 + 2;
      do {
        uVar31 = puVar18[2];
        puVar16[1] = puVar18[3];
        *puVar16 = uVar31;
        uVar31 = puVar18[4];
        puVar16[3] = puVar18[5];
        puVar16[2] = uVar31;
        puVar16 = puVar16 + 4;
        puVar18 = puVar18 + 4;
      } while (puVar16 < (undefined8 *)((long)unaff_x23 + unaff_x28));
    }
  }
LAB_00154570:
  do {
    if (0xffffffffffffff88 < unaff_x20) {
      return unaff_x20;
    }
    unaff_x26 = (undefined8 *)((long)unaff_x26 + unaff_x20);
    unaff_w27 = iVar30 + -1;
    if (unaff_w27 == 0) goto code_r0x00155070;
    puVar2 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
    puVar3 = (ushort *)(in_stack_00000098 + in_stack_00000090 * 8);
    puVar4 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
    unaff_x28 = (ulong)*(uint *)(puVar3 + 2);
    uVar28 = (ulong)*(uint *)(puVar2 + 2);
    uVar6 = *(uint *)(puVar4 + 2);
    bVar7 = (byte)puVar2[1];
    bVar8 = (byte)puVar3[1];
    bVar9 = (byte)puVar4[1];
    uVar23 = (uint)bVar9;
    puVar18 = in_stack_00000030;
    if (bVar9 < 2) {
      bVar10 = *(uint *)(puVar2 + 2) == 0;
      if (bVar9 != 0) {
        if (bVar10) {
          uVar6 = uVar6 + 1;
        }
        uVar14 = (ulong)in_stack_00000050;
        in_stack_00000050 = in_stack_00000050 + 1;
        lVar25 = (ulong)uVar6 - ((long)(in_stack_00000048 << (uVar14 & 0x3f)) >> 0x3f);
        if (lVar25 == 3) {
          unaff_x19 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
        }
        else {
          unaff_x19 = (&uStack00000000000000a0)[lVar25] -
                      (ulong)((&uStack00000000000000a0)[lVar25] == 0);
          if (lVar25 == 1) goto code_r0x00154320;
        }
        goto code_r0x001542f4;
      }
      unaff_x19 = *(ulong *)(in_stack_00000028 + (ulong)bVar10 * 8);
      puVar18 = (undefined8 *)(in_stack_00000028 + (ulong)!bVar10 * 8);
    }
    else {
      uVar14 = (ulong)in_stack_00000050;
      in_stack_00000050 = in_stack_00000050 + uVar23;
      unaff_x19 = ((in_stack_00000048 << (uVar14 & 0x3f)) >> ((ulong)-uVar23 & 0x3f)) + (ulong)uVar6
      ;
code_r0x001542f4:
      in_stack_000000b0 = in_stack_000000a8;
    }
code_r0x00154320:
    uStack00000000000000a0 = unaff_x19;
    in_stack_000000a8 = *puVar18;
    if (bVar8 != 0) {
      uVar14 = (ulong)in_stack_00000050;
      in_stack_00000050 = in_stack_00000050 + bVar8;
      unaff_x28 = ((in_stack_00000048 << (uVar14 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                  unaff_x28;
    }
    iVar17 = (int)in_stack_00000060;
    if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar23 & 0xff)) {
      if (in_stack_00000050 < 0x41) {
        if (in_stack_00000058 < in_stack_00000068) {
          if (in_stack_00000058 == in_stack_00000060) goto code_r0x00154360;
          uVar6 = (int)in_stack_00000058 - iVar17;
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
code_r0x00154360:
    if (bVar7 != 0) {
      uVar14 = (ulong)in_stack_00000050;
      in_stack_00000050 = in_stack_00000050 + bVar7;
      uVar28 = ((in_stack_00000048 << (uVar14 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar28;
    }
    iVar30 = iVar30 + -2;
    if (iVar30 != 0) {
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
          if (in_stack_00000058 != in_stack_00000060) {
            uVar6 = (int)in_stack_00000058 - iVar17;
            if (in_stack_00000060 <=
                (ulong *)((long)in_stack_00000058 - (ulong)(in_stack_00000050 >> 3))) {
              uVar6 = in_stack_00000050 >> 3;
            }
            in_stack_00000050 = in_stack_00000050 + uVar6 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar6 = in_stack_00000050 >> 3;
          in_stack_00000050 = in_stack_00000050 & 7;
code_r0x00154464:
          in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar6);
          in_stack_00000048 = *in_stack_00000058;
        }
        puVar18 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar20 = *(undefined **)(&UNK_00007698 + unaff_x21);
        puVar13 = (undefined *)((long)puVar18 + uVar28);
        if (puVar13 <= puVar20) goto code_r0x00154484;
      }
      else {
        in_stack_00000058 = (ulong *)&UNK_00814388;
        puVar18 = *(undefined8 **)(unaff_x29 + -0x78);
        puVar20 = *(undefined **)(&UNK_00007698 + unaff_x21);
        puVar13 = (undefined *)((long)puVar18 + uVar28);
        if (puVar13 <= puVar20) goto code_r0x00154484;
      }
      if (unaff_w27 < 1) {
        return 0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar14 = (long)puVar20 - (long)puVar18;
      if (uVar14 == 0) goto code_r0x00154a08;
      if ((ulong)(in_stack_00000018 - (long)unaff_x26) < uVar14) {
        return 0xffffffffffffffba;
      }
      uVar21 = (long)unaff_x26 - (long)puVar18;
      puVar16 = (undefined8 *)((long)unaff_x26 + uVar14);
      if (((long)uVar21 < -7) && (7 < uVar14)) {
        if (uVar21 < 0xfffffffffffffff0) {
          puVar19 = puVar16 + -4;
          if (unaff_x26 <= puVar19) {
            uVar31 = *puVar18;
            unaff_x26[1] = puVar18[1];
            *unaff_x26 = uVar31;
            if (0x10 < (ulong)((long)puVar19 - (long)unaff_x26)) {
              puVar11 = unaff_x26 + 2;
              puVar22 = puVar18;
              do {
                uVar31 = puVar22[2];
                puVar11[1] = puVar22[3];
                *puVar11 = uVar31;
                uVar31 = puVar22[4];
                puVar11[3] = puVar22[5];
                puVar11[2] = uVar31;
                puVar11 = puVar11 + 4;
                puVar22 = puVar22 + 4;
              } while (puVar11 < puVar19);
            }
            puVar18 = (undefined8 *)((long)puVar18 + ((long)puVar19 - (long)unaff_x26));
code_r0x001548ac:
            puVar15 = (undefined1 *)((long)unaff_x26 + (uVar14 - (long)puVar19));
            if ((puVar15 < (undefined1 *)0x8) || ((ulong)((long)puVar19 - (long)puVar18) < 0x40)) {
              puVar11 = puVar19;
            }
            else {
              if (puVar15 < (undefined1 *)0x40) {
                puVar24 = (undefined1 *)0x0;
              }
              else {
                puVar24 = (undefined1 *)((ulong)puVar15 & 0xffffffffffffffc0);
                puVar11 = puVar19 + 4;
                puVar22 = puVar18 + 4;
                puVar27 = puVar24;
                do {
                  uVar31 = puVar22[-4];
                  uVar33 = puVar22[-1];
                  uVar32 = puVar22[-2];
                  uVar35 = puVar22[1];
                  uVar34 = *puVar22;
                  uVar37 = puVar22[3];
                  uVar36 = puVar22[2];
                  puVar11[-3] = puVar22[-3];
                  puVar11[-4] = uVar31;
                  puVar11[-1] = uVar33;
                  puVar11[-2] = uVar32;
                  puVar11[1] = uVar35;
                  *puVar11 = uVar34;
                  puVar11[3] = uVar37;
                  puVar11[2] = uVar36;
                  puVar27 = puVar27 + -0x40;
                  puVar11 = puVar11 + 8;
                  puVar22 = puVar22 + 8;
                } while (puVar27 != (undefined1 *)0x0);
                if (puVar15 == puVar24) goto code_r0x00154a00;
                if (((ulong)puVar15 & 0x38) == 0) {
                  puVar18 = (undefined8 *)((long)puVar18 + (long)puVar24);
                  puVar11 = (undefined8 *)((long)puVar19 + (long)puVar24);
                  goto code_r0x001549d0;
                }
              }
              puVar27 = (undefined1 *)((ulong)puVar15 & 0xfffffffffffffff8);
              lVar25 = (long)puVar24 - (long)puVar27;
              puVar11 = (undefined8 *)((long)puVar19 + (long)puVar24);
              puVar22 = (undefined8 *)((long)puVar18 + (long)puVar24);
              do {
                *puVar11 = *puVar22;
                lVar25 = lVar25 + 8;
                puVar11 = puVar11 + 1;
                puVar22 = puVar22 + 1;
              } while (lVar25 != 0);
              puVar11 = (undefined8 *)((long)puVar19 + (long)puVar27);
              puVar18 = (undefined8 *)((long)puVar18 + (long)puVar27);
              if (puVar15 == puVar27) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              puVar22 = (undefined8 *)((long)puVar11 + 1);
              *(undefined1 *)puVar11 = *(undefined1 *)puVar18;
              puVar11 = puVar22;
              puVar18 = (undefined8 *)((long)puVar18 + 1);
            } while (puVar22 != (undefined8 *)((long)puVar19 + (long)puVar15));
            goto code_r0x00154a00;
          }
        }
        puVar19 = unaff_x26;
        if (0 < (long)uVar14) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar14 < 1) goto code_r0x00154a00;
      puVar13 = (undefined *)((long)unaff_x26 + (long)puVar20) + -(long)puVar18;
      if (puVar13 <= (undefined *)((long)unaff_x26 + 1U)) {
        puVar13 = (undefined *)((long)unaff_x26 + 1);
      }
      uVar12 = (long)puVar13 - (long)unaff_x26;
      if ((uVar12 < 8) || (uVar21 < 0x40)) goto code_r0x001549f0;
      if (uVar12 < 0x40) {
        uVar21 = 0;
        goto code_r0x00154994;
      }
      uVar21 = uVar12 & 0xffffffffffffffc0;
      puVar19 = unaff_x26 + 4;
      puVar11 = puVar18 + 4;
      uVar26 = uVar21;
      do {
        uVar31 = puVar11[-4];
        uVar33 = puVar11[-1];
        uVar32 = puVar11[-2];
        uVar35 = puVar11[1];
        uVar34 = *puVar11;
        uVar37 = puVar11[3];
        uVar36 = puVar11[2];
        puVar19[-3] = puVar11[-3];
        puVar19[-4] = uVar31;
        puVar19[-1] = uVar33;
        puVar19[-2] = uVar32;
        puVar19[1] = uVar35;
        *puVar19 = uVar34;
        puVar19[3] = uVar37;
        puVar19[2] = uVar36;
        uVar26 = uVar26 - 0x40;
        puVar19 = puVar19 + 8;
        puVar11 = puVar11 + 8;
      } while (uVar26 != 0);
      if (uVar12 != uVar21) {
        if ((uVar12 & 0x38) == 0) {
          puVar18 = (undefined8 *)((long)puVar18 + uVar21);
          unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar21);
        }
        else {
code_r0x00154994:
          uVar26 = uVar12 & 0xfffffffffffffff8;
          lVar25 = uVar21 - uVar26;
          puVar19 = (undefined8 *)((long)puVar18 + uVar21);
          puVar11 = (undefined8 *)((long)unaff_x26 + uVar21);
          do {
            *puVar11 = *puVar19;
            lVar25 = lVar25 + 8;
            puVar19 = puVar19 + 1;
            puVar11 = puVar11 + 1;
          } while (lVar25 != 0);
          unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar26);
          puVar18 = (undefined8 *)((long)puVar18 + uVar26);
          if (uVar12 == uVar26) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          puVar19 = (undefined8 *)((long)unaff_x26 + 1);
          *(undefined1 *)unaff_x26 = *(undefined1 *)puVar18;
          unaff_x26 = puVar19;
          puVar18 = (undefined8 *)((long)puVar18 + 1);
        } while (puVar19 < puVar16);
      }
code_r0x00154a00:
      uVar28 = uVar28 - uVar14;
      unaff_x26 = puVar16;
code_r0x00154a08:
      *(undefined8 **)(unaff_x29 + -0x78) = in_stack_00000008;
      unaff_x22 = &UNK_000176a4 + unaff_x21;
      *(undefined4 *)((long)in_stack_00000010 + 0xe64) = 0;
      puVar18 = (undefined8 *)((long)unaff_x26 + uVar28);
      puVar16 = (undefined8 *)((long)puVar18 - unaff_x19);
      Hint_Prefetch(puVar16,0,0,0);
      if ((unaff_x22 < (undefined *)((long)in_stack_00000008 + uVar28)) ||
         (uVar14 = uVar28 + unaff_x28,
         (undefined1 *)(in_stack_00000018 + -0x20) < (undefined1 *)((long)unaff_x26 + uVar14))) {
        *(ulong *)(unaff_x29 + -0x70) = uVar28;
        *(ulong *)(unaff_x29 + -0x68) = unaff_x28;
        *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
        uVar14 = func_0x00155c78(unaff_x26,in_stack_00000018,unaff_x29 + -0x70,unaff_x29 + -0x78,
                                 unaff_x22,in_x6,in_stack_00000040,in_stack_00000038);
      }
      else {
        uVar31 = *in_stack_00000008;
        unaff_x26[1] = in_stack_00000008[1];
        *unaff_x26 = uVar31;
        if (0x10 < uVar28) {
          uVar31 = in_stack_00000008[2];
          unaff_x26[3] = in_stack_00000008[3];
          unaff_x26[2] = uVar31;
          if (0x10 < uVar28 - 0x10) {
            puVar19 = unaff_x26 + 4;
            puVar11 = in_stack_00000008 + 6;
            do {
              uVar31 = puVar11[-2];
              puVar19[1] = puVar11[-1];
              *puVar19 = uVar31;
              uVar31 = *puVar11;
              puVar19[3] = puVar11[1];
              puVar19[2] = uVar31;
              puVar19 = puVar19 + 4;
              puVar11 = puVar11 + 4;
            } while (puVar19 < puVar18);
          }
        }
        *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)in_stack_00000008 + uVar28);
        if ((ulong)((long)puVar18 - (long)in_x6) < unaff_x19) {
          if ((ulong)((long)puVar18 - in_stack_00000040) < unaff_x19) {
            return 0xffffffffffffffec;
          }
          lVar29 = (long)puVar16 - (long)in_x6;
          lVar25 = in_stack_00000038 + lVar29;
          if (lVar25 + unaff_x28 <= in_stack_00000038) {
            _memmove(puVar18,lVar25,unaff_x28);
            goto joined_r0x00154b24;
          }
          _memmove(puVar18,lVar25,-lVar29);
          puVar18 = (undefined8 *)((long)puVar18 - lVar29);
          unaff_x28 = lVar29 + unaff_x28;
          puVar16 = in_x6;
        }
        if (unaff_x19 < 0x10) {
          if (unaff_x19 < 8) {
            iVar1 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
            *(undefined1 *)puVar18 = *(undefined1 *)puVar16;
            *(undefined1 *)((long)puVar18 + 1) = *(undefined1 *)((long)puVar16 + 1);
            *(undefined1 *)((long)puVar18 + 2) = *(undefined1 *)((long)puVar16 + 2);
            *(undefined1 *)((long)puVar18 + 3) = *(undefined1 *)((long)puVar16 + 3);
            puVar5 = (undefined4 *)((long)puVar16 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4))
            ;
            puVar16 = (undefined8 *)((long)puVar5 - (long)iVar1);
            *(undefined4 *)((long)puVar18 + 4) = *puVar5;
          }
          else {
            *puVar18 = *puVar16;
          }
          if (8 < unaff_x28) {
            puVar19 = puVar16 + 1;
            puVar11 = puVar18 + 1;
            if ((long)puVar11 - (long)puVar19 < 0x10) {
              do {
                puVar16 = puVar11 + 1;
                *puVar11 = *puVar19;
                puVar19 = puVar19 + 1;
                puVar11 = puVar16;
              } while (puVar16 < (undefined8 *)((long)puVar18 + unaff_x28));
            }
            else {
              uVar31 = *puVar19;
              puVar18[2] = puVar16[2];
              *puVar11 = uVar31;
              if (0x10 < unaff_x28 - 8) {
                puVar19 = puVar18 + 3;
                puVar16 = puVar16 + 5;
                do {
                  uVar31 = puVar16[-2];
                  puVar19[1] = puVar16[-1];
                  *puVar19 = uVar31;
                  uVar31 = *puVar16;
                  puVar19[3] = puVar16[1];
                  puVar19[2] = uVar31;
                  puVar19 = puVar19 + 4;
                  puVar16 = puVar16 + 4;
                } while (puVar19 < (undefined8 *)((long)puVar18 + unaff_x28));
              }
            }
          }
        }
        else {
          uVar31 = *puVar16;
          puVar18[1] = puVar16[1];
          *puVar18 = uVar31;
          if (0x10 < unaff_x28) {
            puVar19 = puVar18 + 2;
            do {
              uVar31 = puVar16[2];
              puVar19[1] = puVar16[3];
              *puVar19 = uVar31;
              uVar31 = puVar16[4];
              puVar19[3] = puVar16[5];
              puVar19[2] = uVar31;
              puVar19 = puVar19 + 4;
              puVar16 = puVar16 + 4;
            } while (puVar19 < (undefined8 *)((long)puVar18 + unaff_x28));
          }
        }
      }
joined_r0x00154b24:
      if (0xffffffffffffff88 < uVar14) {
        return uVar14;
      }
      unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar14);
      if (unaff_w27 < 2) {
        if (iVar30 != 0) {
          return 0xffffffffffffffec;
        }
        goto code_r0x00155070;
      }
      do {
        puVar2 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
        puVar3 = (ushort *)(in_stack_00000098 + in_stack_00000090 * 8);
        puVar4 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
        uVar14 = (ulong)*(uint *)(puVar3 + 2);
        uVar28 = (ulong)*(uint *)(puVar2 + 2);
        uVar6 = *(uint *)(puVar4 + 2);
        bVar7 = (byte)puVar2[1];
        bVar8 = (byte)puVar3[1];
        bVar9 = (byte)puVar4[1];
        uVar23 = (uint)bVar9;
        puVar18 = in_stack_00000030;
        if (bVar9 < 2) {
          bVar10 = *(uint *)(puVar2 + 2) == 0;
          if (bVar9 != 0) {
            if (bVar10) {
              uVar6 = uVar6 + 1;
            }
            uVar21 = (ulong)in_stack_00000050;
            in_stack_00000050 = in_stack_00000050 + 1;
            lVar25 = (ulong)uVar6 - ((long)(in_stack_00000048 << (uVar21 & 0x3f)) >> 0x3f);
            if (lVar25 == 3) {
              uVar21 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
            }
            else {
              uVar21 = (&uStack00000000000000a0)[lVar25] -
                       (ulong)((&uStack00000000000000a0)[lVar25] == 0);
              if (lVar25 == 1) goto LAB_00154bdc;
            }
            goto code_r0x00154bb0;
          }
          uVar21 = (&uStack00000000000000a0)[bVar10];
          puVar18 = &uStack00000000000000a0 + !bVar10;
        }
        else {
          uVar21 = (ulong)in_stack_00000050;
          in_stack_00000050 = in_stack_00000050 + uVar23;
          uVar21 = ((in_stack_00000048 << (uVar21 & 0x3f)) >> ((ulong)-uVar23 & 0x3f)) +
                   (ulong)uVar6;
code_r0x00154bb0:
          in_stack_000000b0 = in_stack_000000a8;
        }
LAB_00154bdc:
        uStack00000000000000a0 = uVar21;
        in_stack_000000a8 = *puVar18;
        if (bVar8 != 0) {
          uVar12 = (ulong)in_stack_00000050;
          in_stack_00000050 = in_stack_00000050 + bVar8;
          uVar14 = ((in_stack_00000048 << (uVar12 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar14
          ;
        }
        if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar23 & 0xff)) {
          if (in_stack_00000050 < 0x41) {
            if (in_stack_00000058 < in_stack_00000068) {
              if (in_stack_00000058 != in_stack_00000060) {
                uVar6 = (int)in_stack_00000058 - iVar17;
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
              in_stack_00000058 =
                   (ulong *)((long)in_stack_00000058 - (ulong)(in_stack_00000050 >> 3));
              in_stack_00000050 = in_stack_00000050 & 7;
              in_stack_00000048 = *in_stack_00000058;
            }
          }
          else {
            in_stack_00000058 = (ulong *)&UNK_00814388;
          }
        }
        if (bVar7 != 0) {
          uVar12 = (ulong)in_stack_00000050;
          in_stack_00000050 = in_stack_00000050 + bVar7;
          uVar28 = ((in_stack_00000048 << (uVar12 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar28
          ;
        }
        if (iVar30 != 1) {
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
              uVar6 = (int)in_stack_00000058 - iVar17;
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
        puVar18 = (undefined8 *)((long)unaff_x26 + uVar28);
        puVar16 = (undefined8 *)((long)puVar18 - uVar21);
        Hint_Prefetch(puVar16,0,0,0);
        if ((unaff_x22 < (undefined *)((long)puVar19 + uVar28)) ||
           (uVar12 = uVar28 + uVar14,
           (undefined1 *)(in_stack_00000018 + -0x20) < (undefined1 *)((long)unaff_x26 + uVar12))) {
          *(ulong *)(unaff_x29 + -0x70) = uVar28;
          *(ulong *)(unaff_x29 + -0x68) = uVar14;
          *(ulong *)(unaff_x29 + -0x60) = uVar21;
          uVar12 = func_0x00155c78(unaff_x26,in_stack_00000018,unaff_x29 + -0x70,unaff_x29 + -0x78,
                                   unaff_x22,in_x6,in_stack_00000040,in_stack_00000038);
        }
        else {
          uVar31 = *puVar19;
          unaff_x26[1] = puVar19[1];
          *unaff_x26 = uVar31;
          if (0x10 < uVar28) {
            uVar31 = puVar19[2];
            unaff_x26[3] = puVar19[3];
            unaff_x26[2] = uVar31;
            if (0x10 < uVar28 - 0x10) {
              puVar11 = unaff_x26 + 4;
              puVar22 = puVar19 + 6;
              do {
                uVar31 = puVar22[-2];
                puVar11[1] = puVar22[-1];
                *puVar11 = uVar31;
                uVar31 = *puVar22;
                puVar11[3] = puVar22[1];
                puVar11[2] = uVar31;
                puVar11 = puVar11 + 4;
                puVar22 = puVar22 + 4;
              } while (puVar11 < puVar18);
            }
          }
          *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)puVar19 + uVar28);
          if ((ulong)((long)puVar18 - (long)in_x6) < uVar21) {
            if ((ulong)((long)puVar18 - in_stack_00000040) < uVar21) {
              return 0xffffffffffffffec;
            }
            lVar29 = (long)puVar16 - (long)in_x6;
            lVar25 = in_stack_00000038 + lVar29;
            if (lVar25 + uVar14 <= in_stack_00000038) {
              _memmove(puVar18,lVar25,uVar14);
              goto joined_r0x00154e58;
            }
            _memmove(puVar18,lVar25,-lVar29);
            puVar18 = (undefined8 *)((long)puVar18 - lVar29);
            uVar14 = lVar29 + uVar14;
            puVar16 = in_x6;
          }
          if (uVar21 < 0x10) {
            if (uVar21 < 8) {
              iVar1 = *(int *)(&UNK_008143b0 + uVar21 * 4);
              *(undefined1 *)puVar18 = *(undefined1 *)puVar16;
              *(undefined1 *)((long)puVar18 + 1) = *(undefined1 *)((long)puVar16 + 1);
              *(undefined1 *)((long)puVar18 + 2) = *(undefined1 *)((long)puVar16 + 2);
              *(undefined1 *)((long)puVar18 + 3) = *(undefined1 *)((long)puVar16 + 3);
              puVar5 = (undefined4 *)((long)puVar16 + (ulong)*(uint *)(&UNK_00814390 + uVar21 * 4));
              puVar16 = (undefined8 *)((long)puVar5 - (long)iVar1);
              *(undefined4 *)((long)puVar18 + 4) = *puVar5;
            }
            else {
              *puVar18 = *puVar16;
            }
            if (8 < uVar14) {
              puVar19 = puVar16 + 1;
              puVar11 = puVar18 + 1;
              if ((long)puVar11 - (long)puVar19 < 0x10) {
                do {
                  puVar16 = puVar11 + 1;
                  *puVar11 = *puVar19;
                  puVar19 = puVar19 + 1;
                  puVar11 = puVar16;
                } while (puVar16 < (undefined8 *)((long)puVar18 + uVar14));
              }
              else {
                uVar31 = *puVar19;
                puVar18[2] = puVar16[2];
                *puVar11 = uVar31;
                if (0x10 < uVar14 - 8) {
                  puVar19 = puVar18 + 3;
                  puVar16 = puVar16 + 5;
                  do {
                    uVar31 = puVar16[-2];
                    puVar19[1] = puVar16[-1];
                    *puVar19 = uVar31;
                    uVar31 = *puVar16;
                    puVar19[3] = puVar16[1];
                    puVar19[2] = uVar31;
                    puVar19 = puVar19 + 4;
                    puVar16 = puVar16 + 4;
                  } while (puVar19 < (undefined8 *)((long)puVar18 + uVar14));
                }
              }
            }
          }
          else {
            uVar31 = *puVar16;
            puVar18[1] = puVar16[1];
            *puVar18 = uVar31;
            if (0x10 < uVar14) {
              puVar19 = puVar18 + 2;
              do {
                uVar31 = puVar16[2];
                puVar19[1] = puVar16[3];
                *puVar19 = uVar31;
                uVar31 = puVar16[4];
                puVar19[3] = puVar16[5];
                puVar19[2] = uVar31;
                puVar19 = puVar19 + 4;
                puVar16 = puVar16 + 4;
              } while (puVar19 < (undefined8 *)((long)puVar18 + uVar14));
            }
          }
        }
joined_r0x00154e58:
        if (0xffffffffffffff88 < uVar12) {
          return uVar12;
        }
        unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar12);
        iVar30 = iVar30 + -1;
      } while (iVar30 != 0);
code_r0x00155070:
      if (in_stack_00000058 != in_stack_00000060) {
        return 0xffffffffffffffec;
      }
      if (in_stack_00000050 != 0x40) {
        return 0xffffffffffffffec;
      }
      *in_stack_00000010 = CONCAT44((int)in_stack_000000a8,(int)uStack00000000000000a0);
      *(int *)(in_stack_00000010 + 1) = (int)in_stack_000000b0;
      puVar13 = *(undefined **)(unaff_x29 + -0x78);
      if (*(int *)((long)in_stack_00000010 + 0xe64) == 2) {
        uVar28 = (long)unaff_x22 - (long)puVar13;
        if ((ulong)(in_stack_00000018 - (long)unaff_x26) < uVar28) {
          return 0xffffffffffffffba;
        }
        if (unaff_x26 != (undefined8 *)0x0) {
          _memmove(unaff_x26,puVar13,uVar28);
          unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar28);
        }
        puVar13 = &UNK_000076a4 + unaff_x21;
        unaff_x22 = &UNK_000176a4 + unaff_x21;
        *(undefined4 *)((long)in_stack_00000010 + 0xe64) = 0;
      }
      uVar28 = (long)unaff_x22 - (long)puVar13;
      if ((ulong)(in_stack_00000018 - (long)unaff_x26) < uVar28) {
        return 0xffffffffffffffba;
      }
      if (unaff_x26 == (undefined8 *)0x0) {
        puVar15 = (undefined1 *)0x0;
      }
      else {
        _memcpy(unaff_x26,puVar13,uVar28);
        puVar15 = (undefined1 *)((long)unaff_x26 + uVar28);
      }
      return (long)puVar15 - in_stack_00000020;
    }
    puVar18 = *(undefined8 **)(unaff_x29 + -0x78);
    puVar20 = *(undefined **)(&UNK_00007698 + unaff_x21);
    puVar13 = (undefined *)((long)puVar18 + uVar28);
    if (puVar20 < puVar13) goto code_r0x001547d8;
code_r0x00154484:
    if ((puVar13 <= unaff_x22) &&
       (unaff_x20 = uVar28 + unaff_x28,
       (undefined *)((long)unaff_x26 + unaff_x20) <= puVar13 + -0x20)) break;
    *(ulong *)(unaff_x29 + -0x70) = uVar28;
    *(ulong *)(unaff_x29 + -0x68) = unaff_x28;
    *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
    unaff_x20 = func_0x00156308(unaff_x26,in_stack_00000018,puVar13 + -0x20,unaff_x29 + -0x70,
                                unaff_x29 + -0x78,unaff_x22,in_x6,in_stack_00000040);
    iVar30 = unaff_w27;
  } while( true );
  unaff_x23 = (undefined8 *)((long)unaff_x26 + uVar28);
  uVar31 = *puVar18;
  unaff_x26[1] = puVar18[1];
  *unaff_x26 = uVar31;
  if (0x10 < uVar28) {
    uVar31 = puVar18[2];
    unaff_x26[3] = puVar18[3];
    unaff_x26[2] = uVar31;
    if (0x10 < uVar28 - 0x10) {
      puVar16 = unaff_x26 + 4;
      puVar18 = puVar18 + 6;
      do {
        uVar31 = puVar18[-2];
        puVar16[1] = puVar18[-1];
        *puVar16 = uVar31;
        uVar31 = *puVar18;
        puVar16[3] = puVar18[1];
        puVar16[2] = uVar31;
        puVar16 = puVar16 + 4;
        puVar18 = puVar18 + 4;
      } while (puVar16 < unaff_x23);
    }
  }
  puVar18 = (undefined8 *)((long)unaff_x23 - unaff_x19);
  *(undefined **)(unaff_x29 + -0x78) = puVar13;
  if ((ulong)((long)unaff_x23 - (long)in_x6) < unaff_x19) goto code_r0x001544c8;
  goto code_r0x00154518;
code_r0x001544c8:
  if ((ulong)((long)unaff_x23 - in_stack_00000040) < unaff_x19) {
    return 0xffffffffffffffec;
  }
  unaff_x24 = (long)puVar18 - (long)in_x6;
  param_3 = in_stack_00000038 + unaff_x24;
  param_1 = param_3 + unaff_x28;
  in_x9 = in_stack_00000038;
  goto code_r0x001544ec;
}

