
int FUN_000a0740(ulong *param_1,undefined8 param_2,ulong *param_3,uint param_4,ulong *param_5,
                ulong *param_6,long param_7,ulong *param_8,int param_9,undefined8 param_10,
                ulong *param_11,ulong *param_12)

{
  char *pcVar1;
  long lVar2;
  short *psVar3;
  ulong *puVar4;
  uint uVar5;
  ulong uVar6;
  ulong *puVar7;
  short *in_x9;
  uint uVar8;
  uint uVar9;
  ulong *in_x10;
  uint uVar10;
  ulong *puVar11;
  ulong *in_x11;
  char cVar12;
  ulong uVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  long unaff_x21;
  int iVar17;
  ulong uVar18;
  long unaff_x22;
  short *unaff_x24;
  uint unaff_w25;
  int unaff_w26;
  ulong uVar19;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  long in_stack_00000060;
  int in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  
code_r0x000a0740:
  if (in_x10 <= in_x11) {
    in_x11 = in_x10;
  }
  puVar7 = (ulong *)((long)unaff_x30 + 4);
  puVar4 = (ulong *)((long)unaff_x28 + 4);
  puVar15 = (ulong *)((long)in_x11 - 7);
  puVar11 = puVar7;
  if (puVar7 < puVar15) {
    uVar13 = *puVar7 ^ *puVar4;
    if (uVar13 == 0) {
      puVar4 = (ulong *)((long)unaff_x28 + 0xc);
      puVar11 = (ulong *)((long)unaff_x30 + 0xc);
      goto joined_r0x000a0a50;
    }
    uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
    uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
    uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
    uVar13 = (ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3;
  }
  else {
joined_r0x000a0a50:
    if (puVar11 < puVar15) {
      iVar17 = ((int)puVar11 - (int)unaff_x30) + -4;
      do {
        uVar13 = *puVar11 ^ *puVar4;
        if (uVar13 != 0) {
          uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar13 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) +
                                iVar17);
          goto LAB_000a0820;
        }
        puVar11 = puVar11 + 1;
        puVar4 = puVar4 + 1;
        iVar17 = iVar17 + 8;
      } while (puVar11 < puVar15);
    }
    if (puVar11 < (ulong *)((long)in_x11 - 3U)) {
      if ((int)*puVar4 == (int)*puVar11) {
        puVar11 = (ulong *)((long)puVar11 + 4);
        puVar4 = (ulong *)((long)puVar4 + 4);
      }
      if (puVar11 < (ulong *)((long)in_x11 - 1U)) goto LAB_000a09e8;
    }
    else if (puVar11 < (ulong *)((long)in_x11 - 1U)) {
LAB_000a09e8:
      if ((short)*puVar4 == (short)*puVar11) {
        puVar11 = (ulong *)((long)puVar11 + 2);
        puVar4 = (ulong *)((long)puVar4 + 2);
      }
    }
    if (puVar11 < in_x11) {
      if ((char)*puVar4 == (char)*puVar11) {
        puVar11 = (ulong *)((long)puVar11 + 1);
      }
    }
    uVar13 = (ulong)(uint)((int)puVar11 - (int)puVar7);
  }
LAB_000a0820:
  uVar10 = (uint)uVar13;
  puVar7 = (ulong *)((long)unaff_x30 + uVar13 + 4);
  if (puVar7 != in_x11) {
    cVar12 = (char)*in_x9;
    goto joined_r0x000a083c;
  }
  puVar7 = in_x11;
  puVar11 = param_3;
  if (in_x11 < param_8) {
    uVar13 = *in_x11 ^ *param_3;
    if (uVar13 == 0) {
      puVar7 = in_x11 + 1;
      puVar11 = in_stack_00000058;
      goto LAB_000a0914;
    }
    uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
    uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
    uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
    uVar9 = (uint)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3);
  }
  else {
LAB_000a0914:
    if (puVar7 < param_8) {
      uVar13 = (long)unaff_x30 + (*(long *)(unaff_x29 + -0x78) - (long)unaff_x28);
      if (*(ulong *)(unaff_x29 + -0x70) <= uVar13) {
        uVar13 = *(ulong *)(unaff_x29 + -0x70);
      }
      iVar17 = (int)puVar7 - (int)uVar13;
      do {
        uVar13 = *puVar7 ^ *puVar11;
        if (uVar13 != 0) {
          uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar9 = (int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) + iVar17;
          goto LAB_000a09c4;
        }
        puVar7 = puVar7 + 1;
        puVar11 = puVar11 + 1;
        iVar17 = iVar17 + 8;
      } while (puVar7 < param_8);
    }
    if (puVar7 < param_12) {
      if ((int)*puVar11 == (int)*puVar7) {
        puVar7 = (ulong *)((long)puVar7 + 4);
        puVar11 = (ulong *)((long)puVar11 + 4);
      }
      if (puVar7 < param_11) goto LAB_000a0a1c;
LAB_000a098c:
      if (puVar7 < *(ulong **)(unaff_x29 + -0x70)) {
LAB_000a0998:
        if ((char)*puVar11 == (char)*puVar7) {
          puVar7 = (ulong *)((long)puVar7 + 1);
        }
      }
    }
    else {
      if (param_11 <= puVar7) goto LAB_000a098c;
LAB_000a0a1c:
      if ((short)*puVar11 == (short)*puVar7) {
        puVar7 = (ulong *)((long)puVar7 + 2);
        puVar11 = (ulong *)((long)puVar11 + 2);
      }
      if (puVar7 < *(ulong **)(unaff_x29 + -0x70)) goto LAB_000a0998;
    }
    uVar9 = (int)puVar7 - (int)in_x11;
  }
LAB_000a09c4:
  uVar10 = uVar9 + uVar10;
  uVar13 = (ulong)uVar10;
  puVar7 = (ulong *)((long)in_x11 + (ulong)uVar9);
  cVar12 = (char)*in_x9;
joined_r0x000a083c:
  if (0xe < uVar10) goto LAB_000a0624;
LAB_000a0840:
  *(char *)in_x9 = cVar12 + (char)uVar13;
  in_x9 = unaff_x24;
joined_r0x000a084c:
  if (param_6 <= puVar7) {
LAB_0009f9fc:
    uVar16 = in_stack_00000060 - (long)puVar7;
    uVar13 = uVar16 - 0xf;
    if (uVar16 < 0xf) {
      *(char *)in_x9 = (char)((int)uVar16 << 4);
    }
    else {
      psVar3 = (short *)((long)in_x9 + 1);
      *(char *)in_x9 = -0x10;
      if (0xfe < uVar13) {
        uVar13 = (long)param_3 + (in_stack_00000050 - (long)puVar7) + -0x10e;
        uVar18 = uVar13 / 0xff;
        _memset(psVar3,0xff,uVar18 + 1);
        uVar13 = uVar13 % 0xff;
        psVar3 = (short *)((long)in_x9 + uVar18 + 2);
      }
      *(char *)psVar3 = (char)uVar13;
      in_x9 = psVar3;
    }
    _memcpy((char *)((long)in_x9 + 1),puVar7,uVar16);
    *(undefined8 *)(unaff_x21 + 0x4000) = *(undefined8 *)(unaff_x29 + -0x60);
    *(undefined4 *)(in_stack_00000070 + 8) = in_stack_00000078._4_4_;
    return ((int)(char *)((long)in_x9 + 1) + (int)uVar16) - unaff_w26;
  }
  iVar17 = (int)unaff_x22;
  *(int *)(unaff_x21 + ((ulong)(*(long *)((long)puVar7 + -2) * param_7) >> 0x32 & 0x3ffc)) =
       (int)(long *)((long)puVar7 + -2) - iVar17;
  uVar9 = (int)puVar7 - iVar17;
  uVar13 = *puVar7 * param_7 >> 0x32 & 0x3ffc;
  uVar10 = *(uint *)(unaff_x21 + uVar13);
  puVar11 = param_5;
  lVar2 = unaff_x27;
  if (param_4 <= uVar10) {
    puVar11 = param_3;
    lVar2 = unaff_x22;
  }
  *(uint *)(unaff_x21 + uVar13) = uVar9;
  if ((uVar10 < unaff_w25 || uVar10 + param_9 < uVar9) ||
     (unaff_x28 = (ulong *)(lVar2 + (ulong)uVar10), (int)*unaff_x28 != (int)*puVar7)) {
    uVar10 = (int)(ulong *)((long)puVar7 + 1U) - iVar17;
    if ((ulong *)((long)puVar7 + 2U) <= param_6) {
      uVar16 = *(ulong *)((long)puVar7 + 1);
      uVar18 = 1;
      uVar13 = 0x41;
      puVar11 = (ulong *)((long)puVar7 + 2U);
      unaff_x30 = (ulong *)((long)puVar7 + 1U);
      do {
        puVar4 = puVar11;
        uVar6 = uVar16 * param_7 >> 0x32 & 0x3ffc;
        uVar9 = *(uint *)(unaff_x21 + uVar6);
        uVar19 = (ulong)uVar9;
        uVar16 = *puVar4;
        *(uint *)(unaff_x21 + uVar6) = uVar10;
        unaff_w26 = in_stack_00000068;
        if (unaff_w25 <= uVar9 && uVar10 <= uVar9 + param_9) {
          lVar2 = unaff_x27;
          if (param_4 <= uVar9) {
            lVar2 = unaff_x22;
          }
          if (*(int *)(lVar2 + uVar19) == (int)*unaff_x30) goto code_r0x000a03c4;
        }
        uVar10 = (int)puVar4 - iVar17;
        puVar11 = (ulong *)((long)puVar4 + uVar18);
        uVar18 = uVar13 >> 6;
        uVar13 = uVar13 + 1;
        unaff_x30 = puVar4;
        if (param_6 < puVar11) break;
      } while( true );
    }
    goto LAB_0009f9fc;
  }
  param_1 = (ulong *)((long)in_x9 + 1);
  *(char *)in_x9 = '\0';
  unaff_x24 = (short *)((long)in_x9 + 3);
  *(short *)param_1 = (short)uVar9 - (short)uVar10;
  unaff_x30 = puVar7;
  goto joined_r0x000a08d4;
code_r0x000a03c4:
  puVar11 = param_5;
  if (param_4 <= uVar9) {
    puVar11 = param_3;
  }
  unaff_x28 = (ulong *)(lVar2 + uVar19);
  if ((puVar11 < unaff_x28) && (*(char *)((long)unaff_x30 - 1) == *(char *)((long)unaff_x28 - 1))) {
    puVar4 = (ulong *)((long)unaff_x30 - 1);
    puVar15 = (ulong *)(lVar2 + uVar19 + -1);
    do {
      unaff_x28 = puVar15;
      unaff_x30 = puVar4;
      if ((unaff_x28 <= puVar11) || (unaff_x30 <= puVar7)) break;
      puVar4 = (ulong *)((long)unaff_x30 + -1);
      puVar15 = (ulong *)((long)unaff_x28 + -1);
    } while (*(char *)((long)unaff_x30 + -1) == *(char *)((long)unaff_x28 + -1));
  }
  puVar4 = (ulong *)((long)in_x9 + 1);
  uVar8 = (uint)((long)unaff_x30 - (long)puVar7);
  uVar5 = uVar8 - 0xf;
  if (uVar8 < 0xf) {
    *(char *)in_x9 = (char)(uVar8 << 4);
  }
  else {
    *(char *)in_x9 = -0x10;
    puVar15 = puVar4;
    if (0xfe < uVar5) {
      uVar5 = ((int)unaff_x30 - (int)puVar7) - 0x10e;
      uVar13 = (ulong)uVar5 / 0xff;
      _memset(puVar4,0xff,uVar13 + 1);
      param_9 = 0xffff;
      param_7 = -0x30e4432345000000;
      param_4 = *(uint *)(unaff_x29 + -100);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar5 = uVar5 + (int)uVar13;
      puVar15 = (ulong *)((long)in_x9 + uVar13 + 2);
    }
    puVar4 = (ulong *)((long)puVar15 + 1);
    *(char *)puVar15 = (char)uVar5;
  }
  param_1 = (ulong *)((long)puVar4 + ((long)unaff_x30 - (long)puVar7 & 0xffffffffU));
  puVar15 = param_1;
  if (param_1 <= puVar4 + 1) {
    puVar15 = puVar4 + 1;
  }
  if (((char *)((long)puVar15 + ~(ulong)puVar4) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar4 - (long)puVar7) < 0x40)) {
code_r0x000a0508:
    do {
      puVar15 = puVar4 + 1;
      *puVar4 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar4 = puVar15;
    } while (puVar15 < param_1);
  }
  else {
    uVar13 = ((long)puVar15 + ~(ulong)puVar4 >> 3) + 1;
    uVar18 = uVar13 & 0x3ffffffffffffff8;
    puVar15 = puVar7 + 4;
    puVar14 = puVar4 + 4;
    uVar16 = uVar18;
    do {
      uVar6 = puVar15[-4];
      uVar20 = puVar15[-1];
      uVar19 = puVar15[-2];
      uVar22 = puVar15[1];
      uVar21 = *puVar15;
      uVar24 = puVar15[3];
      uVar23 = puVar15[2];
      puVar14[-3] = puVar15[-3];
      puVar14[-4] = uVar6;
      puVar14[-1] = uVar20;
      puVar14[-2] = uVar19;
      puVar14[1] = uVar22;
      *puVar14 = uVar21;
      puVar14[3] = uVar24;
      puVar14[2] = uVar23;
      uVar16 = uVar16 - 8;
      puVar15 = puVar15 + 8;
      puVar14 = puVar14 + 8;
    } while (uVar16 != 0);
    puVar7 = puVar7 + uVar18;
    puVar4 = puVar4 + uVar18;
    if (uVar13 != uVar18) goto code_r0x000a0508;
  }
  unaff_x24 = (short *)((long)param_1 + 2);
  *(short *)param_1 = (short)uVar10 - (short)uVar9;
joined_r0x000a08d4:
  if (puVar11 == param_5) {
    in_x11 = *(ulong **)(unaff_x29 + -0x70);
    in_x10 = (ulong *)((long)unaff_x30 + (*(long *)(unaff_x29 + -0x78) - (long)unaff_x28));
    goto code_r0x000a0740;
  }
  puVar7 = (ulong *)((long)unaff_x30 + 4);
  puVar4 = (ulong *)((long)unaff_x28 + 4);
  puVar11 = puVar7;
  if (puVar7 < param_8) {
    uVar13 = *puVar7 ^ *puVar4;
    if (uVar13 != 0) {
      uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
      uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
      uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
      uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
      uVar13 = (ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3;
      goto code_r0x000a0610;
    }
    puVar4 = (ulong *)((long)unaff_x28 + 0xc);
    puVar11 = (ulong *)((long)unaff_x30 + 0xc);
  }
  if (puVar11 < param_8) {
    iVar17 = ((int)puVar11 - (int)unaff_x30) + -4;
    do {
      uVar13 = *puVar11 ^ *puVar4;
      if (uVar13 != 0) {
        uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
        uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) + iVar17)
        ;
        goto code_r0x000a0610;
      }
      puVar11 = puVar11 + 1;
      puVar4 = puVar4 + 1;
      iVar17 = iVar17 + 8;
    } while (puVar11 < param_8);
  }
  if (puVar11 < param_12) {
    if ((int)*puVar4 == (int)*puVar11) {
      puVar11 = (ulong *)((long)puVar11 + 4);
      puVar4 = (ulong *)((long)puVar4 + 4);
    }
    if (puVar11 < param_11) goto code_r0x000a06f8;
code_r0x000a05d8:
    if (puVar11 < *(ulong **)(unaff_x29 + -0x70)) {
code_r0x000a05e4:
      if ((char)*puVar4 == (char)*puVar11) {
        puVar11 = (ulong *)((long)puVar11 + 1);
      }
    }
  }
  else {
    if (param_11 <= puVar11) goto code_r0x000a05d8;
code_r0x000a06f8:
    if ((short)*puVar4 == (short)*puVar11) {
      puVar11 = (ulong *)((long)puVar11 + 2);
      puVar4 = (ulong *)((long)puVar4 + 2);
    }
    if (puVar11 < *(ulong **)(unaff_x29 + -0x70)) goto code_r0x000a05e4;
  }
  uVar13 = (ulong)(uint)((int)puVar11 - (int)puVar7);
code_r0x000a0610:
  puVar7 = (ulong *)((long)unaff_x30 + uVar13 + 4);
  cVar12 = (char)*in_x9;
  uVar10 = (uint)uVar13;
  if (uVar10 < 0xf) goto LAB_000a0840;
LAB_000a0624:
  uVar9 = uVar10 - 0xf;
  *(char *)in_x9 = cVar12 + '\x0f';
  unaff_x24[0] = -1;
  unaff_x24[1] = -1;
  if (0x3fb < uVar9) {
    uVar13 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
    _memset((short *)((long)param_1 + 6),0xff,uVar13 + 4);
    param_9 = 0xffff;
    param_7 = -0x30e4432345000000;
    unaff_w25 = *(uint *)(unaff_x29 + -0x80);
    param_4 = *(uint *)(unaff_x29 + -100);
    param_3 = *(ulong **)(unaff_x29 + -0x60);
    uVar9 = (uVar10 - 0x40b) % 0x3fc;
    unaff_x24 = (short *)((long)param_1 + 6 + uVar13);
    unaff_x22 = in_stack_00000088;
    unaff_x27 = in_stack_00000080;
  }
  uVar10 = (uVar9 & 0xffff) / 0xff;
  pcVar1 = (char *)((long)unaff_x24 + (ulong)uVar10);
  in_x9 = (short *)(pcVar1 + 1);
  *pcVar1 = (char)uVar9 + (char)uVar10;
  goto joined_r0x000a084c;
}

