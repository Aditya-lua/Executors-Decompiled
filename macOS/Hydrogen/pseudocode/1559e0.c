
ulong FUN_001559e0(ulong param_1)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort *puVar4;
  undefined4 *puVar5;
  uint uVar6;
  byte bVar7;
  byte bVar8;
  bool bVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong in_x9;
  uint in_w10;
  undefined8 *puVar13;
  undefined8 *puVar14;
  ulong in_x11;
  uint in_w12;
  ulong in_x13;
  uint in_w14;
  uint in_w15;
  uint uVar15;
  ulong uVar16;
  ulong unaff_x19;
  undefined8 *puVar17;
  long lVar18;
  int unaff_w22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 *in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 *in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  uint in_stack_00000040;
  ulong *in_stack_00000048;
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
  
LAB_00155684:
  do {
    if (in_w15 != 0) {
      uVar16 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + in_w15;
      param_1 = ((in_stack_00000038 << (uVar16 & 0x3f)) >> ((ulong)-in_w15 & 0x3f)) + param_1;
    }
    if (unaff_w22 != 1) {
      in_stack_00000060 =
           (in_stack_00000038 >> ((ulong)-(in_stack_00000040 + in_w14) & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)in_w14 * 4)) + in_x13;
      iVar1 = in_stack_00000040 + in_w14 + in_w12;
      in_stack_00000080 =
           (in_stack_00000038 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)in_w12 * 4)) + in_x11;
      in_stack_00000040 = iVar1 + in_w10;
      in_stack_00000070 =
           (in_stack_00000038 >> ((ulong)-in_stack_00000040 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)in_w10 * 4)) + in_x9;
      if (in_stack_00000040 < 0x41) {
        if (in_stack_00000048 < in_stack_00000058) {
          if (in_stack_00000048 == in_stack_00000050) goto code_r0x0015577c;
          uVar6 = (int)in_stack_00000048 - (int)in_stack_00000050;
          if (in_stack_00000050 <=
              (ulong *)((long)in_stack_00000048 - (ulong)(in_stack_00000040 >> 3))) {
            uVar6 = in_stack_00000040 >> 3;
          }
          in_stack_00000040 = in_stack_00000040 + uVar6 * -8;
        }
        else {
          uVar6 = in_stack_00000040 >> 3;
          in_stack_00000040 = in_stack_00000040 & 7;
        }
        in_stack_00000048 = (ulong *)((long)in_stack_00000048 - (ulong)uVar6);
        in_stack_00000038 = *in_stack_00000048;
      }
      else {
        in_stack_00000048 = (ulong *)&UNK_00814388;
      }
    }
code_r0x0015577c:
    puVar13 = *(undefined8 **)(unaff_x29 + -0x78);
    puVar17 = (undefined8 *)((long)unaff_x26 + param_1);
    puVar12 = (undefined8 *)((long)puVar17 - unaff_x19);
    Hint_Prefetch(puVar12,0,0,0);
    if ((in_stack_00000030 < (long)puVar13 + param_1) ||
       (uVar16 = param_1 + unaff_x27, unaff_x24 < (long)unaff_x26 + uVar16)) {
      *(ulong *)(unaff_x29 + -0x70) = param_1;
      *(ulong *)(unaff_x29 + -0x68) = unaff_x27;
      *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
      uVar16 = func_0x00155c78(unaff_x26,in_stack_00000008,unaff_x29 + -0x70,unaff_x29 + -0x78,
                               in_stack_00000030);
    }
    else {
      uVar19 = *puVar13;
      unaff_x26[1] = puVar13[1];
      *unaff_x26 = uVar19;
      if (0x10 < param_1) {
        uVar19 = puVar13[2];
        unaff_x26[3] = puVar13[3];
        unaff_x26[2] = uVar19;
        if (0x10 < param_1 - 0x10) {
          puVar10 = unaff_x26 + 4;
          puVar14 = puVar13 + 6;
          do {
            uVar19 = puVar14[-2];
            puVar10[1] = puVar14[-1];
            *puVar10 = uVar19;
            uVar19 = *puVar14;
            puVar10[3] = puVar14[1];
            puVar10[2] = uVar19;
            puVar10 = puVar10 + 4;
            puVar14 = puVar14 + 4;
          } while (puVar10 < puVar17);
        }
      }
      *(ulong *)(unaff_x29 + -0x78) = (long)puVar13 + param_1;
      if ((ulong)((long)puVar17 - (long)unaff_x23) < unaff_x19) {
        if ((ulong)((long)puVar17 - in_stack_00000028) < unaff_x19) {
          return 0xffffffffffffffec;
        }
        lVar18 = (long)puVar12 - (long)unaff_x23;
        lVar11 = in_stack_00000020 + lVar18;
        if (lVar11 + unaff_x27 <= in_stack_00000020) {
          _memmove(puVar17,lVar11,unaff_x27);
          goto code_r0x0015585c;
        }
        _memmove(puVar17,lVar11,-lVar18);
        puVar17 = (undefined8 *)((long)puVar17 - lVar18);
        unaff_x27 = lVar18 + unaff_x27;
        puVar12 = unaff_x23;
      }
      if (unaff_x19 < 0x10) {
        if (unaff_x19 < 8) {
          iVar1 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
          *(undefined1 *)puVar17 = *(undefined1 *)puVar12;
          *(undefined1 *)((long)puVar17 + 1) = *(undefined1 *)((long)puVar12 + 1);
          *(undefined1 *)((long)puVar17 + 2) = *(undefined1 *)((long)puVar12 + 2);
          *(undefined1 *)((long)puVar17 + 3) = *(undefined1 *)((long)puVar12 + 3);
          puVar5 = (undefined4 *)((long)puVar12 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4));
          puVar12 = (undefined8 *)((long)puVar5 - (long)iVar1);
          *(undefined4 *)((long)puVar17 + 4) = *puVar5;
        }
        else {
          *puVar17 = *puVar12;
        }
        if (8 < unaff_x27) {
          puVar13 = puVar12 + 1;
          puVar10 = puVar17 + 1;
          if ((long)puVar10 - (long)puVar13 < 0x10) {
            do {
              puVar12 = puVar10 + 1;
              *puVar10 = *puVar13;
              puVar13 = puVar13 + 1;
              puVar10 = puVar12;
            } while (puVar12 < (undefined8 *)((long)puVar17 + unaff_x27));
          }
          else {
            uVar19 = *puVar13;
            puVar17[2] = puVar12[2];
            *puVar10 = uVar19;
            if (0x10 < unaff_x27 - 8) {
              puVar13 = puVar17 + 3;
              puVar12 = puVar12 + 5;
              do {
                uVar19 = puVar12[-2];
                puVar13[1] = puVar12[-1];
                *puVar13 = uVar19;
                uVar19 = *puVar12;
                puVar13[3] = puVar12[1];
                puVar13[2] = uVar19;
                puVar13 = puVar13 + 4;
                puVar12 = puVar12 + 4;
              } while (puVar13 < (undefined8 *)((long)puVar17 + unaff_x27));
            }
          }
        }
      }
      else {
        uVar19 = *puVar12;
        puVar17[1] = puVar12[1];
        *puVar17 = uVar19;
        if (0x10 < unaff_x27) {
          puVar13 = puVar17 + 2;
          do {
            uVar19 = puVar12[2];
            puVar13[1] = puVar12[3];
            *puVar13 = uVar19;
            uVar19 = puVar12[4];
            puVar13[3] = puVar12[5];
            puVar13[2] = uVar19;
            puVar13 = puVar13 + 4;
            puVar12 = puVar12 + 4;
          } while (puVar13 < (undefined8 *)((long)puVar17 + unaff_x27));
        }
      }
    }
code_r0x0015585c:
    if (0xffffffffffffff88 < uVar16) {
      return uVar16;
    }
    unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar16);
    unaff_w22 = unaff_w22 + -1;
    if (unaff_w22 == 0) {
      uVar16 = 0xffffffffffffffec;
      if ((in_stack_00000048 == in_stack_00000050) && (in_stack_00000040 == 0x40)) {
        *in_stack_00000000 = CONCAT44((int)in_stack_00000098,(int)uStack0000000000000090);
        *(int *)(in_stack_00000000 + 1) = (int)in_stack_000000a0;
        in_stack_00000030 = in_stack_00000030 - *(long *)(unaff_x29 + -0x78);
        if ((ulong)(in_stack_00000008 - (long)unaff_x26) < in_stack_00000030) {
          uVar16 = 0xffffffffffffffba;
        }
        else {
          if (unaff_x26 == (undefined8 *)0x0) {
            lVar11 = 0;
          }
          else {
            _memcpy(unaff_x26,*(long *)(unaff_x29 + -0x78),in_stack_00000030);
            lVar11 = (long)unaff_x26 + in_stack_00000030;
          }
          uVar16 = lVar11 - in_stack_00000010;
        }
      }
      return uVar16;
    }
    puVar2 = (ushort *)(in_stack_00000068 + in_stack_00000060 * 8);
    puVar3 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
    puVar4 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
    unaff_x27 = (ulong)*(uint *)(puVar3 + 2);
    param_1 = (ulong)*(uint *)(puVar2 + 2);
    uVar6 = *(uint *)(puVar4 + 2);
    in_w15 = (uint)(byte)puVar2[1];
    bVar7 = (byte)puVar3[1];
    bVar8 = (byte)puVar4[1];
    in_x13 = (ulong)*puVar2;
    in_x11 = (ulong)*puVar3;
    in_x9 = (ulong)*puVar4;
    in_w14 = (uint)*(byte *)((long)puVar2 + 3);
    in_w12 = (uint)*(byte *)((long)puVar3 + 3);
    in_w10 = (uint)*(byte *)((long)puVar4 + 3);
    uVar15 = (uint)bVar8;
    puVar17 = in_stack_00000018;
    if (bVar8 < 2) {
      bVar9 = *(uint *)(puVar2 + 2) == 0;
      if (bVar8 != 0) {
        if (bVar9) {
          uVar6 = uVar6 + 1;
        }
        uVar16 = (ulong)in_stack_00000040;
        in_stack_00000040 = in_stack_00000040 + 1;
        lVar11 = (ulong)uVar6 - ((long)(in_stack_00000038 << (uVar16 & 0x3f)) >> 0x3f);
        if (lVar11 == 3) {
          unaff_x19 = (uStack0000000000000090 - 1) - (ulong)(uStack0000000000000090 - 1 == 0);
        }
        else {
          unaff_x19 = (&uStack0000000000000090)[lVar11] -
                      (ulong)((&uStack0000000000000090)[lVar11] == 0);
          if (lVar11 == 1) goto code_r0x00155644;
        }
        goto code_r0x0015561c;
      }
      unaff_x19 = *(ulong *)(unaff_x25 + (ulong)bVar9 * 8);
      puVar17 = (undefined8 *)(unaff_x25 + (ulong)!bVar9 * 8);
    }
    else {
      uVar16 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + uVar15;
      unaff_x19 = ((in_stack_00000038 << (uVar16 & 0x3f)) >> ((ulong)-uVar15 & 0x3f)) + (ulong)uVar6
      ;
code_r0x0015561c:
      in_stack_000000a0 = in_stack_00000098;
    }
code_r0x00155644:
    uStack0000000000000090 = unaff_x19;
    in_stack_00000098 = *puVar17;
    if (bVar7 != 0) {
      uVar16 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + bVar7;
      unaff_x27 = ((in_stack_00000038 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                  unaff_x27;
    }
  } while (((uint)bVar7 + (uint)(byte)puVar2[1] + uVar15 & 0xff) < 0x1f);
  if (0x40 < in_stack_00000040) {
    in_stack_00000048 = (ulong *)&UNK_00814388;
    goto LAB_00155684;
  }
  if (in_stack_00000048 < in_stack_00000058) {
    if (in_stack_00000048 == in_stack_00000050) goto LAB_00155684;
    uVar6 = (int)in_stack_00000048 - (int)in_stack_00000050;
    if (in_stack_00000050 <= (ulong *)((long)in_stack_00000048 - (ulong)(in_stack_00000040 >> 3))) {
      uVar6 = in_stack_00000040 >> 3;
    }
    in_stack_00000040 = in_stack_00000040 + uVar6 * -8;
  }
  else {
    uVar6 = in_stack_00000040 >> 3;
    in_stack_00000040 = in_stack_00000040 & 7;
  }
  in_stack_00000048 = (ulong *)((long)in_stack_00000048 - (ulong)uVar6);
  in_stack_00000038 = *in_stack_00000048;
  goto LAB_00155684;
}

