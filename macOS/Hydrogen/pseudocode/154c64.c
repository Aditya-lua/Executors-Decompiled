
ulong FUN_00154c64(ulong param_1,undefined *param_2)

{
  ushort *puVar1;
  ushort *puVar2;
  ushort *puVar3;
  undefined4 *puVar4;
  uint uVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  int iVar9;
  bool bVar10;
  undefined *puVar11;
  ulong in_x4;
  undefined8 *in_x6;
  long lVar12;
  undefined8 *puVar13;
  ulong in_x9;
  undefined8 *puVar14;
  uint in_w10;
  ulong in_x11;
  undefined8 *puVar15;
  undefined8 *puVar16;
  uint in_w12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  uint uVar17;
  int in_w16;
  ulong in_x17;
  long lVar18;
  ulong uVar19;
  long unaff_x21;
  undefined8 *puVar20;
  int unaff_w24;
  undefined *unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar21;
  long in_stack_00000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 *in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  ulong in_stack_00000048;
  uint uStack0000000000000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  long lStack0000000000000070;
  long in_stack_00000078;
  long lStack0000000000000080;
  long in_stack_00000088;
  long lStack0000000000000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  do {
    lStack0000000000000070 = (in_x17 & *(uint *)(param_2 + (in_x14 & 0xffffffff) * 4)) + in_x13;
    lStack0000000000000090 =
         (in_x15 >> ((ulong)-(in_w16 + in_w12) & 0x3f) &
         (ulong)*(uint *)(param_2 + (ulong)in_w12 * 4)) + in_x11;
    uStack0000000000000050 = in_w16 + in_w12 + in_w10;
    lStack0000000000000080 =
         (in_x15 >> ((ulong)-uStack0000000000000050 & 0x3f) &
         (ulong)*(uint *)(param_2 + (ulong)in_w10 * 4)) + in_x9;
    if (uStack0000000000000050 < 0x41) {
      if (in_stack_00000058 < in_stack_00000068) {
        if (in_stack_00000058 == in_stack_00000060) goto LAB_00154d14;
        uVar5 = (int)in_stack_00000058 - (int)in_stack_00000060;
        if (in_stack_00000060 <=
            (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
          uVar5 = uStack0000000000000050 >> 3;
        }
        uStack0000000000000050 = uStack0000000000000050 + uVar5 * -8;
      }
      else {
        uVar5 = uStack0000000000000050 >> 3;
        uStack0000000000000050 = uStack0000000000000050 & 7;
      }
      in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar5);
      in_stack_00000048 = *in_stack_00000058;
    }
    else {
      in_stack_00000058 = (ulong *)&UNK_00814388;
    }
LAB_00154d14:
    do {
      puVar15 = *(undefined8 **)(unaff_x29 + -0x78);
      puVar20 = (undefined8 *)((long)unaff_x26 + param_1);
      puVar14 = (undefined8 *)((long)puVar20 - unaff_x28);
      Hint_Prefetch(puVar14,0,0,0);
      if ((unaff_x25 < (undefined *)((long)puVar15 + param_1)) ||
         (uVar19 = param_1 + unaff_x27, in_x4 < (long)unaff_x26 + uVar19)) {
        *(ulong *)(unaff_x29 + -0x70) = param_1;
        *(ulong *)(unaff_x29 + -0x68) = unaff_x27;
        *(ulong *)(unaff_x29 + -0x60) = unaff_x28;
        uVar19 = func_0x00155c78(unaff_x26,in_stack_00000018,unaff_x29 + -0x70,unaff_x29 + -0x78);
        in_x4 = in_stack_00000028;
      }
      else {
        uVar21 = *puVar15;
        unaff_x26[1] = puVar15[1];
        *unaff_x26 = uVar21;
        if (0x10 < param_1) {
          uVar21 = puVar15[2];
          unaff_x26[3] = puVar15[3];
          unaff_x26[2] = uVar21;
          if (0x10 < param_1 - 0x10) {
            puVar13 = unaff_x26 + 4;
            puVar16 = puVar15 + 6;
            do {
              uVar21 = puVar16[-2];
              puVar13[1] = puVar16[-1];
              *puVar13 = uVar21;
              uVar21 = *puVar16;
              puVar13[3] = puVar16[1];
              puVar13[2] = uVar21;
              puVar13 = puVar13 + 4;
              puVar16 = puVar16 + 4;
            } while (puVar13 < puVar20);
          }
        }
        *(undefined **)(unaff_x29 + -0x78) = (undefined *)((long)puVar15 + param_1);
        if ((ulong)((long)puVar20 - (long)in_x6) < unaff_x28) {
          if ((ulong)((long)puVar20 - in_stack_00000040) < unaff_x28) {
            return 0xffffffffffffffec;
          }
          lVar18 = (long)puVar14 - (long)in_x6;
          lVar12 = in_stack_00000038 + lVar18;
          if (lVar12 + unaff_x27 <= in_stack_00000038) {
            _memmove(puVar20,lVar12,unaff_x27);
            in_x4 = in_stack_00000028;
            goto joined_r0x00154e58;
          }
          _memmove(puVar20,lVar12,-lVar18);
          puVar20 = (undefined8 *)((long)puVar20 - lVar18);
          unaff_x27 = lVar18 + unaff_x27;
          in_x4 = in_stack_00000028;
          puVar14 = in_x6;
        }
        if (unaff_x28 < 0x10) {
          if (unaff_x28 < 8) {
            iVar9 = *(int *)(&UNK_008143b0 + unaff_x28 * 4);
            *(undefined1 *)puVar20 = *(undefined1 *)puVar14;
            *(undefined1 *)((long)puVar20 + 1) = *(undefined1 *)((long)puVar14 + 1);
            *(undefined1 *)((long)puVar20 + 2) = *(undefined1 *)((long)puVar14 + 2);
            *(undefined1 *)((long)puVar20 + 3) = *(undefined1 *)((long)puVar14 + 3);
            puVar4 = (undefined4 *)((long)puVar14 + (ulong)*(uint *)(&UNK_00814390 + unaff_x28 * 4))
            ;
            puVar14 = (undefined8 *)((long)puVar4 - (long)iVar9);
            *(undefined4 *)((long)puVar20 + 4) = *puVar4;
          }
          else {
            *puVar20 = *puVar14;
          }
          in_x4 = in_stack_00000028;
          if (8 < unaff_x27) {
            puVar15 = puVar14 + 1;
            puVar13 = puVar20 + 1;
            if ((long)puVar13 - (long)puVar15 < 0x10) {
              do {
                puVar14 = puVar13 + 1;
                *puVar13 = *puVar15;
                puVar15 = puVar15 + 1;
                puVar13 = puVar14;
              } while (puVar14 < (undefined8 *)((long)puVar20 + unaff_x27));
            }
            else {
              uVar21 = *puVar15;
              puVar20[2] = puVar14[2];
              *puVar13 = uVar21;
              if (0x10 < unaff_x27 - 8) {
                puVar15 = puVar20 + 3;
                puVar14 = puVar14 + 5;
                do {
                  uVar21 = puVar14[-2];
                  puVar15[1] = puVar14[-1];
                  *puVar15 = uVar21;
                  uVar21 = *puVar14;
                  puVar15[3] = puVar14[1];
                  puVar15[2] = uVar21;
                  puVar15 = puVar15 + 4;
                  puVar14 = puVar14 + 4;
                } while (puVar15 < (undefined8 *)((long)puVar20 + unaff_x27));
              }
            }
          }
        }
        else {
          uVar21 = *puVar14;
          puVar20[1] = puVar14[1];
          *puVar20 = uVar21;
          if (0x10 < unaff_x27) {
            puVar15 = puVar20 + 2;
            do {
              uVar21 = puVar14[2];
              puVar15[1] = puVar14[3];
              *puVar15 = uVar21;
              uVar21 = puVar14[4];
              puVar15[3] = puVar14[5];
              puVar15[2] = uVar21;
              puVar15 = puVar15 + 4;
              puVar14 = puVar14 + 4;
            } while (puVar15 < (undefined8 *)((long)puVar20 + unaff_x27));
          }
        }
      }
joined_r0x00154e58:
      if (0xffffffffffffff88 < uVar19) {
        return uVar19;
      }
      unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar19);
      unaff_w24 = unaff_w24 + -1;
      if (unaff_w24 == 0) {
        if (in_stack_00000058 != in_stack_00000060) {
          return 0xffffffffffffffec;
        }
        if (uStack0000000000000050 != 0x40) {
          return 0xffffffffffffffec;
        }
        *in_stack_00000010 = CONCAT44((int)in_stack_000000a8,(int)uStack00000000000000a0);
        *(int *)(in_stack_00000010 + 1) = (int)in_stack_000000b0;
        puVar11 = *(undefined **)(unaff_x29 + -0x78);
        if (*(int *)((long)in_stack_00000010 + 0xe64) == 2) {
          uVar19 = (long)unaff_x25 - (long)puVar11;
          if ((ulong)(in_stack_00000018 - (long)unaff_x26) < uVar19) {
            return 0xffffffffffffffba;
          }
          if (unaff_x26 != (undefined8 *)0x0) {
            _memmove(unaff_x26,puVar11,uVar19);
            unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar19);
          }
          puVar11 = &UNK_000076a4 + unaff_x21;
          unaff_x25 = &UNK_000176a4 + unaff_x21;
          *(undefined4 *)((long)in_stack_00000010 + 0xe64) = 0;
        }
        uVar19 = (long)unaff_x25 - (long)puVar11;
        if ((ulong)(in_stack_00000018 - (long)unaff_x26) < uVar19) {
          return 0xffffffffffffffba;
        }
        if (unaff_x26 == (undefined8 *)0x0) {
          lVar12 = 0;
        }
        else {
          _memcpy(unaff_x26,puVar11,uVar19);
          lVar12 = (long)unaff_x26 + uVar19;
        }
        return lVar12 - in_stack_00000020;
      }
      puVar1 = (ushort *)(in_stack_00000078 + lStack0000000000000070 * 8);
      puVar2 = (ushort *)(in_stack_00000098 + lStack0000000000000090 * 8);
      puVar3 = (ushort *)(in_stack_00000088 + lStack0000000000000080 * 8);
      unaff_x27 = (ulong)*(uint *)(puVar2 + 2);
      param_1 = (ulong)*(uint *)(puVar1 + 2);
      uVar5 = *(uint *)(puVar3 + 2);
      bVar6 = (byte)puVar1[1];
      bVar7 = (byte)puVar2[1];
      bVar8 = (byte)puVar3[1];
      in_x13 = (ulong)*puVar1;
      in_x11 = (ulong)*puVar2;
      in_x9 = (ulong)*puVar3;
      in_x14 = (ulong)*(byte *)((long)puVar1 + 3);
      in_w12 = (uint)*(byte *)((long)puVar2 + 3);
      in_w10 = (uint)*(byte *)((long)puVar3 + 3);
      uVar17 = (uint)bVar8;
      puVar20 = in_stack_00000030;
      if (bVar8 < 2) {
        bVar10 = *(uint *)(puVar1 + 2) == 0;
        if (bVar8 != 0) {
          if (bVar10) {
            uVar5 = uVar5 + 1;
          }
          uVar19 = (ulong)uStack0000000000000050;
          uStack0000000000000050 = uStack0000000000000050 + 1;
          lVar12 = (ulong)uVar5 - ((long)(in_stack_00000048 << (uVar19 & 0x3f)) >> 0x3f);
          if (lVar12 == 3) {
            unaff_x28 = (uStack00000000000000a0 - 1) - (ulong)(uStack00000000000000a0 - 1 == 0);
            in_x4 = in_stack_00000028;
          }
          else {
            unaff_x28 = (&uStack00000000000000a0)[lVar12] -
                        (ulong)((&uStack00000000000000a0)[lVar12] == 0);
            in_x4 = in_stack_00000028;
            if (lVar12 == 1) goto code_r0x00154bdc;
          }
          goto code_r0x00154bb0;
        }
        unaff_x28 = *(ulong *)(in_stack_00000008 + (ulong)bVar10 * 8);
        puVar20 = (undefined8 *)(in_stack_00000008 + (ulong)!bVar10 * 8);
      }
      else {
        uVar19 = (ulong)uStack0000000000000050;
        uStack0000000000000050 = uStack0000000000000050 + uVar17;
        unaff_x28 = ((in_stack_00000048 << (uVar19 & 0x3f)) >> ((ulong)-uVar17 & 0x3f)) +
                    (ulong)uVar5;
code_r0x00154bb0:
        in_stack_000000b0 = in_stack_000000a8;
      }
code_r0x00154bdc:
      uStack00000000000000a0 = unaff_x28;
      in_stack_000000a8 = *puVar20;
      if (bVar7 != 0) {
        uVar19 = (ulong)uStack0000000000000050;
        uStack0000000000000050 = uStack0000000000000050 + bVar7;
        unaff_x27 = ((in_stack_00000048 << (uVar19 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                    unaff_x27;
      }
      if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar17 & 0xff)) {
        if (uStack0000000000000050 < 0x41) {
          if (in_stack_00000058 < in_stack_00000068) {
            in_x4 = in_stack_00000028;
            if (in_stack_00000058 != in_stack_00000060) {
              uVar5 = (int)in_stack_00000058 - (int)in_stack_00000060;
              if (in_stack_00000060 <=
                  (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3))) {
                uVar5 = uStack0000000000000050 >> 3;
              }
              in_stack_00000058 = (ulong *)((long)in_stack_00000058 - (ulong)uVar5);
              uStack0000000000000050 = uStack0000000000000050 + uVar5 * -8;
              in_stack_00000048 = *in_stack_00000058;
            }
          }
          else {
            in_stack_00000058 =
                 (ulong *)((long)in_stack_00000058 - (ulong)(uStack0000000000000050 >> 3));
            uStack0000000000000050 = uStack0000000000000050 & 7;
            in_stack_00000048 = *in_stack_00000058;
            in_x4 = in_stack_00000028;
          }
        }
        else {
          in_stack_00000058 = (ulong *)&UNK_00814388;
          in_x4 = in_stack_00000028;
        }
      }
      if (bVar6 != 0) {
        uVar19 = (ulong)uStack0000000000000050;
        uStack0000000000000050 = uStack0000000000000050 + bVar6;
        param_1 = ((in_stack_00000048 << (uVar19 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) + param_1
        ;
      }
    } while (unaff_w24 == 1);
    in_w16 = uStack0000000000000050 + *(byte *)((long)puVar1 + 3);
    in_x17 = in_stack_00000048 >> ((ulong)(uint)-in_w16 & 0x3f);
    param_2 = &UNK_00814304;
    in_x15 = in_stack_00000048;
  } while( true );
}

