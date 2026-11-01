
ulong FUN_00155750(ulong param_1)

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
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  ulong *in_x9;
  undefined8 *puVar14;
  ulong in_x10;
  uint in_w11;
  undefined8 *puVar15;
  undefined8 *puVar16;
  uint uVar17;
  ulong unaff_x19;
  undefined8 *puVar18;
  long lVar19;
  int unaff_w22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar20;
  undefined8 *in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 *in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  ulong uStack0000000000000038;
  uint uStack0000000000000040;
  ulong *puStack0000000000000048;
  ulong *in_stack_00000050;
  ulong *in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
  puStack0000000000000048 = in_x9;
code_r0x00155750:
  puStack0000000000000048 = (ulong *)((long)puStack0000000000000048 - in_x10);
  uStack0000000000000040 = in_w11 + (int)in_x10 * -8;
  do {
    uStack0000000000000038 = *puStack0000000000000048;
code_r0x0015577c:
    do {
      puVar15 = *(undefined8 **)(unaff_x29 + -0x78);
      puVar18 = (undefined8 *)((long)unaff_x26 + param_1);
      puVar14 = (undefined8 *)((long)puVar18 - unaff_x19);
      Hint_Prefetch(puVar14,0,0,0);
      if ((in_stack_00000030 < (long)puVar15 + param_1) ||
         (uVar11 = param_1 + unaff_x27, unaff_x24 < (long)unaff_x26 + uVar11)) {
        *(ulong *)(unaff_x29 + -0x70) = param_1;
        *(ulong *)(unaff_x29 + -0x68) = unaff_x27;
        *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
        uVar11 = func_0x00155c78(unaff_x26,in_stack_00000008,unaff_x29 + -0x70,unaff_x29 + -0x78,
                                 in_stack_00000030);
      }
      else {
        uVar20 = *puVar15;
        unaff_x26[1] = puVar15[1];
        *unaff_x26 = uVar20;
        if (0x10 < param_1) {
          uVar20 = puVar15[2];
          unaff_x26[3] = puVar15[3];
          unaff_x26[2] = uVar20;
          if (0x10 < param_1 - 0x10) {
            puVar12 = unaff_x26 + 4;
            puVar16 = puVar15 + 6;
            do {
              uVar20 = puVar16[-2];
              puVar12[1] = puVar16[-1];
              *puVar12 = uVar20;
              uVar20 = *puVar16;
              puVar12[3] = puVar16[1];
              puVar12[2] = uVar20;
              puVar12 = puVar12 + 4;
              puVar16 = puVar16 + 4;
            } while (puVar12 < puVar18);
          }
        }
        *(ulong *)(unaff_x29 + -0x78) = (long)puVar15 + param_1;
        if ((ulong)((long)puVar18 - (long)unaff_x23) < unaff_x19) {
          if ((ulong)((long)puVar18 - in_stack_00000028) < unaff_x19) {
            return 0xffffffffffffffec;
          }
          lVar19 = (long)puVar14 - (long)unaff_x23;
          lVar13 = in_stack_00000020 + lVar19;
          if (lVar13 + unaff_x27 <= in_stack_00000020) {
            _memmove(puVar18,lVar13,unaff_x27);
            goto LAB_0015585c;
          }
          _memmove(puVar18,lVar13,-lVar19);
          puVar18 = (undefined8 *)((long)puVar18 - lVar19);
          unaff_x27 = lVar19 + unaff_x27;
          puVar14 = unaff_x23;
        }
        if (unaff_x19 < 0x10) {
          if (unaff_x19 < 8) {
            iVar1 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
            *(undefined1 *)puVar18 = *(undefined1 *)puVar14;
            *(undefined1 *)((long)puVar18 + 1) = *(undefined1 *)((long)puVar14 + 1);
            *(undefined1 *)((long)puVar18 + 2) = *(undefined1 *)((long)puVar14 + 2);
            *(undefined1 *)((long)puVar18 + 3) = *(undefined1 *)((long)puVar14 + 3);
            puVar5 = (undefined4 *)((long)puVar14 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4))
            ;
            puVar14 = (undefined8 *)((long)puVar5 - (long)iVar1);
            *(undefined4 *)((long)puVar18 + 4) = *puVar5;
          }
          else {
            *puVar18 = *puVar14;
          }
          if (8 < unaff_x27) {
            puVar15 = puVar14 + 1;
            puVar12 = puVar18 + 1;
            if ((long)puVar12 - (long)puVar15 < 0x10) {
              do {
                puVar14 = puVar12 + 1;
                *puVar12 = *puVar15;
                puVar15 = puVar15 + 1;
                puVar12 = puVar14;
              } while (puVar14 < (undefined8 *)((long)puVar18 + unaff_x27));
            }
            else {
              uVar20 = *puVar15;
              puVar18[2] = puVar14[2];
              *puVar12 = uVar20;
              if (0x10 < unaff_x27 - 8) {
                puVar15 = puVar18 + 3;
                puVar14 = puVar14 + 5;
                do {
                  uVar20 = puVar14[-2];
                  puVar15[1] = puVar14[-1];
                  *puVar15 = uVar20;
                  uVar20 = *puVar14;
                  puVar15[3] = puVar14[1];
                  puVar15[2] = uVar20;
                  puVar15 = puVar15 + 4;
                  puVar14 = puVar14 + 4;
                } while (puVar15 < (undefined8 *)((long)puVar18 + unaff_x27));
              }
            }
          }
        }
        else {
          uVar20 = *puVar14;
          puVar18[1] = puVar14[1];
          *puVar18 = uVar20;
          if (0x10 < unaff_x27) {
            puVar15 = puVar18 + 2;
            do {
              uVar20 = puVar14[2];
              puVar15[1] = puVar14[3];
              *puVar15 = uVar20;
              uVar20 = puVar14[4];
              puVar15[3] = puVar14[5];
              puVar15[2] = uVar20;
              puVar15 = puVar15 + 4;
              puVar14 = puVar14 + 4;
            } while (puVar15 < (undefined8 *)((long)puVar18 + unaff_x27));
          }
        }
      }
LAB_0015585c:
      if (0xffffffffffffff88 < uVar11) {
        return uVar11;
      }
      unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar11);
      unaff_w22 = unaff_w22 + -1;
      if (unaff_w22 == 0) {
        if (puStack0000000000000048 != in_stack_00000050) {
          return 0xffffffffffffffec;
        }
        if (uStack0000000000000040 != 0x40) {
          return 0xffffffffffffffec;
        }
        *in_stack_00000000 = CONCAT44((int)in_stack_00000098,(int)uStack0000000000000090);
        *(int *)(in_stack_00000000 + 1) = (int)in_stack_000000a0;
        in_stack_00000030 = in_stack_00000030 - *(long *)(unaff_x29 + -0x78);
        if ((ulong)(in_stack_00000008 - (long)unaff_x26) < in_stack_00000030) {
          return 0xffffffffffffffba;
        }
        if (unaff_x26 == (undefined8 *)0x0) {
          lVar13 = 0;
        }
        else {
          _memcpy(unaff_x26,*(long *)(unaff_x29 + -0x78),in_stack_00000030);
          lVar13 = (long)unaff_x26 + in_stack_00000030;
        }
        return lVar13 - in_stack_00000010;
      }
      puVar2 = (ushort *)(in_stack_00000068 + in_stack_00000060 * 8);
      puVar3 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
      puVar4 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
      unaff_x27 = (ulong)*(uint *)(puVar3 + 2);
      param_1 = (ulong)*(uint *)(puVar2 + 2);
      uVar6 = *(uint *)(puVar4 + 2);
      bVar7 = (byte)puVar2[1];
      bVar8 = (byte)puVar3[1];
      bVar9 = (byte)puVar4[1];
      uVar17 = (uint)bVar9;
      puVar18 = in_stack_00000018;
      if (bVar9 < 2) {
        bVar10 = *(uint *)(puVar2 + 2) == 0;
        if (bVar9 != 0) {
          if (bVar10) {
            uVar6 = uVar6 + 1;
          }
          uVar11 = (ulong)uStack0000000000000040;
          uStack0000000000000040 = uStack0000000000000040 + 1;
          lVar13 = (ulong)uVar6 - ((long)(uStack0000000000000038 << (uVar11 & 0x3f)) >> 0x3f);
          if (lVar13 == 3) {
            unaff_x19 = (uStack0000000000000090 - 1) - (ulong)(uStack0000000000000090 - 1 == 0);
          }
          else {
            unaff_x19 = (&uStack0000000000000090)[lVar13] -
                        (ulong)((&uStack0000000000000090)[lVar13] == 0);
            if (lVar13 == 1) goto code_r0x00155644;
          }
          goto code_r0x0015561c;
        }
        unaff_x19 = *(ulong *)(unaff_x25 + (ulong)bVar10 * 8);
        puVar18 = (undefined8 *)(unaff_x25 + (ulong)!bVar10 * 8);
      }
      else {
        uVar11 = (ulong)uStack0000000000000040;
        uStack0000000000000040 = uStack0000000000000040 + uVar17;
        unaff_x19 = ((uStack0000000000000038 << (uVar11 & 0x3f)) >> ((ulong)-uVar17 & 0x3f)) +
                    (ulong)uVar6;
code_r0x0015561c:
        in_stack_000000a0 = in_stack_00000098;
      }
code_r0x00155644:
      uStack0000000000000090 = unaff_x19;
      in_stack_00000098 = *puVar18;
      if (bVar8 != 0) {
        uVar11 = (ulong)uStack0000000000000040;
        uStack0000000000000040 = uStack0000000000000040 + bVar8;
        unaff_x27 = ((uStack0000000000000038 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                    unaff_x27;
      }
      if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar17 & 0xff)) {
        if (uStack0000000000000040 < 0x41) {
          if (puStack0000000000000048 < in_stack_00000058) {
            if (puStack0000000000000048 == in_stack_00000050) goto LAB_00155684;
            uVar6 = (int)puStack0000000000000048 - (int)in_stack_00000050;
            if (in_stack_00000050 <=
                (ulong *)((long)puStack0000000000000048 - (ulong)(uStack0000000000000040 >> 3))) {
              uVar6 = uStack0000000000000040 >> 3;
            }
            uStack0000000000000040 = uStack0000000000000040 + uVar6 * -8;
          }
          else {
            uVar6 = uStack0000000000000040 >> 3;
            uStack0000000000000040 = uStack0000000000000040 & 7;
          }
          puStack0000000000000048 = (ulong *)((long)puStack0000000000000048 - (ulong)uVar6);
          uStack0000000000000038 = *puStack0000000000000048;
        }
        else {
          puStack0000000000000048 = (ulong *)&UNK_00814388;
        }
      }
LAB_00155684:
      if (bVar7 != 0) {
        uVar11 = (ulong)uStack0000000000000040;
        uStack0000000000000040 = uStack0000000000000040 + bVar7;
        param_1 = ((uStack0000000000000038 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                  param_1;
      }
    } while (unaff_w22 == 1);
    iVar1 = uStack0000000000000040 + *(byte *)((long)puVar2 + 3);
    in_stack_00000060 =
         (uStack0000000000000038 >> ((ulong)(uint)-iVar1 & 0x3f) &
         (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
         (ulong)*puVar2;
    iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
    in_stack_00000080 =
         (uStack0000000000000038 >> ((ulong)(uint)-iVar1 & 0x3f) &
         (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
         (ulong)*puVar3;
    in_w11 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
    in_stack_00000070 =
         (uStack0000000000000038 >> ((ulong)-in_w11 & 0x3f) &
         (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
         (ulong)*puVar4;
    uStack0000000000000040 = in_w11;
    if (0x40 < in_w11) {
      puStack0000000000000048 = (ulong *)&UNK_00814388;
      goto code_r0x0015577c;
    }
    if (puStack0000000000000048 < in_stack_00000058) {
      if (puStack0000000000000048 != in_stack_00000050) {
        uVar6 = (int)puStack0000000000000048 - (int)in_stack_00000050;
        if (in_stack_00000050 <= (ulong *)((long)puStack0000000000000048 - (ulong)(in_w11 >> 3))) {
          uVar6 = in_w11 >> 3;
        }
        in_x10 = (ulong)uVar6;
        goto code_r0x00155750;
      }
      goto code_r0x0015577c;
    }
    puStack0000000000000048 = (ulong *)((long)puStack0000000000000048 - (ulong)(in_w11 >> 3));
    uStack0000000000000040 = in_w11 & 7;
  } while( true );
}

