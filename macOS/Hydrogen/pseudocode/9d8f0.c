
/* WARNING: Type propagation algorithm not settling */

int FUN_0009d8f0(ulong *param_1,int param_2,ulong *param_3,uint param_4,ulong *param_5,long param_6,
                long param_7,int param_8,ulong *param_9,undefined8 param_10,ulong *param_11,
                ulong *param_12)

{
  char *pcVar1;
  uint uVar2;
  ulong *puVar3;
  short *psVar4;
  int iVar5;
  uint uVar6;
  short *in_x9;
  ulong uVar7;
  ulong *in_x10;
  uint uVar8;
  ulong in_x11;
  ulong *puVar9;
  ulong in_x12;
  ulong *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  uint in_w17;
  uint uVar14;
  long unaff_x21;
  long unaff_x22;
  ulong uVar15;
  long unaff_x23;
  ulong uVar16;
  short *unaff_x25;
  ulong *puVar17;
  long lVar18;
  uint unaff_w27;
  undefined4 uVar19;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  long in_stack_00000048;
  ulong *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  uint in_stack_00000068;
  long in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  ulong *in_stack_00000088;
  
code_r0x0009d8f0:
  lVar18 = *(long *)(unaff_x29 + -0x68);
LAB_0009d9b8:
  in_x11 = (ulong)(uint)((int)in_x12 + (int)in_x11);
  puVar13 = (ulong *)((long)in_x10 + (in_x12 & 0xffffffff));
code_r0x0009d9c0:
  uVar8 = (uint)in_x11;
  if (*(char **)(unaff_x29 + -0x78) <
      (char *)((long)param_1 + ((ulong)(uVar8 + 0xf0) * (ulong)in_w17 >> 0x27) + 8)) {
LAB_0009c800:
    in_stack_00000078 = 0;
    uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
code_r0x0009f8a0:
    *(ulong **)(unaff_x21 + 0x4000) = param_3;
    *(undefined4 *)(lVar18 + 8) = uVar19;
    return in_stack_00000078;
  }
  uVar14 = uVar8 - 0xf;
  if (uVar8 < 0xf) {
    *(char *)in_x9 = (char)*in_x9 + (char)in_x11;
    in_x9 = unaff_x25;
  }
  else {
    *(char *)in_x9 = (char)*in_x9 + '\x0f';
    unaff_x25[0] = -1;
    unaff_x25[1] = -1;
    if (0x3fb < uVar14) {
      uVar14 = (uint)((ulong)(uVar8 - 0x40b) * (ulong)in_w17 >> 0x29);
      uVar16 = (ulong)(uVar14 << 2);
      *(ulong **)(unaff_x29 + -0x88) = puVar13;
      _memset((short *)((long)param_1 + 6),0xff,uVar16 + 4);
      puVar13 = *(ulong **)(unaff_x29 + -0x88);
      in_w17 = 0x80808081;
      param_2 = 0xffff;
      lVar18 = *(long *)(unaff_x29 + -0x68);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      unaff_x22 = -0x30e4432345000000;
      param_4 = *(uint *)(unaff_x29 + -0x80);
      uVar14 = (uVar8 - 0x40b) + uVar14 * -0x3fc;
      unaff_x25 = (short *)((long)param_1 + 6 + uVar16);
      unaff_x23 = in_stack_00000060;
      unaff_w27 = in_stack_00000068;
    }
    uVar8 = (uVar14 & 0xffff) / 0xff;
    pcVar1 = (char *)((long)unaff_x25 + (ulong)uVar8);
    *pcVar1 = (char)uVar14 + (char)uVar8;
    in_x9 = (short *)(pcVar1 + 1);
  }
  if (param_9 <= puVar13) {
code_r0x0009c7d0:
    uVar16 = in_stack_00000058 - (long)puVar13;
    if ((char *)((long)in_x9 + (uVar16 + 0xf0) / 0xff + uVar16 + 1) <= *(char **)(unaff_x29 + -0x78)
       ) {
      uVar7 = uVar16 - 0xf;
      if (uVar16 < 0xf) {
        *(char *)in_x9 = (char)((int)uVar16 << 4);
        uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
      }
      else {
        psVar4 = (short *)((long)in_x9 + 1);
        *(char *)in_x9 = -0x10;
        if (0xfe < uVar7) {
          uVar7 = (long)param_3 + (in_stack_00000048 - (long)puVar13) + -0x10e;
          uVar15 = uVar7 / 0xff;
          _memset(psVar4,0xff,uVar15 + 1);
          uVar7 = uVar7 % 0xff;
          psVar4 = (short *)((long)in_x9 + uVar15 + 2);
        }
        uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
        *(char *)psVar4 = (char)uVar7;
        in_x9 = psVar4;
      }
      _memcpy((char *)((long)in_x9 + 1),puVar13,uVar16);
      in_stack_00000078 = ((int)(char *)((long)in_x9 + 1) + (int)uVar16) - in_stack_00000078;
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      goto code_r0x0009f8a0;
    }
    goto LAB_0009c800;
  }
  iVar5 = (int)param_7;
  *(int *)(unaff_x21 + ((ulong)(*(long *)((long)puVar13 + -2) * unaff_x22) >> 0x32 & 0x3ffc)) =
       (int)(long *)((long)puVar13 + -2) - iVar5;
  uVar16 = *puVar13 * unaff_x22 >> 0x34;
  uVar8 = *(uint *)(unaff_x21 + uVar16 * 4);
  if (uVar8 < param_4) {
    uVar8 = *(uint *)(param_6 + uVar16 * 4);
    puVar17 = (ulong *)(unaff_x23 + (ulong)uVar8);
    uVar8 = uVar8 + param_8;
    puVar9 = param_5;
  }
  else {
    puVar17 = (ulong *)(param_7 + (ulong)uVar8);
    puVar9 = param_3;
  }
  uVar14 = (int)puVar13 - iVar5;
  *(uint *)(unaff_x21 + uVar16 * 4) = uVar14;
  if ((uVar8 + param_2 < uVar14) || ((int)*puVar17 != (int)*puVar13)) {
    uVar8 = (int)(ulong *)((long)puVar13 + 1U) - iVar5;
    lVar18 = *(long *)(unaff_x29 + -0x68);
    if (param_9 < (ulong *)((long)puVar13 + 2U)) goto code_r0x0009c7d0;
    uVar16 = *(ulong *)((long)puVar13 + 1);
    puVar17 = (ulong *)((long)puVar13 + 2U);
    puVar12 = (ulong *)((long)puVar13 + 1U);
    uVar6 = in_stack_00000080._4_4_;
    uVar14 = unaff_w27;
    while( true ) {
      puVar11 = puVar17;
      uVar7 = uVar16 * unaff_x22 >> 0x34;
      uVar2 = *(uint *)(unaff_x21 + uVar7 * 4);
      if (uVar2 < param_4) {
        uVar2 = *(uint *)(param_6 + uVar7 * 4);
        puVar17 = (ulong *)(unaff_x23 + (ulong)uVar2);
        uVar2 = uVar2 + param_8;
        uVar16 = *puVar11;
        *(uint *)(unaff_x21 + uVar7 * 4) = uVar8;
        puVar9 = param_5;
      }
      else {
        puVar17 = (ulong *)(param_7 + (ulong)uVar2);
        uVar16 = *puVar11;
        *(uint *)(unaff_x21 + uVar7 * 4) = uVar8;
        puVar9 = param_3;
      }
      if ((uVar8 <= uVar2 + param_2) && ((int)*puVar17 == (int)*puVar12)) break;
      uVar8 = (int)puVar11 - iVar5;
      uVar7 = (ulong)uVar6;
      uVar6 = uVar14 >> 6;
      uVar14 = uVar14 + 1;
      puVar17 = (ulong *)((long)puVar11 + uVar7);
      puVar12 = puVar11;
      if (param_9 < (ulong *)((long)puVar11 + uVar7)) {
        lVar18 = *(long *)(unaff_x29 + -0x68);
        goto code_r0x0009c7d0;
      }
    }
    if ((puVar9 < puVar17) && (*(char *)((long)puVar12 - 1) == *(char *)((long)puVar17 + -1))) {
      puVar11 = (ulong *)((long)puVar12 - 1);
      puVar3 = (ulong *)((long)puVar17 + -1);
      do {
        puVar17 = puVar3;
        puVar12 = puVar11;
        if ((puVar17 <= puVar9) || (puVar12 <= puVar13)) break;
        puVar11 = (ulong *)((long)puVar12 + -1);
        puVar3 = (ulong *)((long)puVar17 + -1);
      } while (*(char *)((long)puVar12 + -1) == *(char *)((long)puVar17 + -1));
    }
    puVar11 = (ulong *)((long)in_x9 + 1);
    uVar16 = (long)puVar12 - (long)puVar13 & 0xffffffff;
    if (*(char **)(unaff_x29 + -0x78) <
        (char *)((long)puVar11 + (uVar16 * in_w17 >> 0x27) + uVar16 + 8)) {
      in_stack_00000078 = 0;
      uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
      lVar18 = *(long *)(unaff_x29 + -0x68);
      goto code_r0x0009f8a0;
    }
    uVar6 = (uint)((long)puVar12 - (long)puVar13);
    uVar14 = uVar6 - 0xf;
    if (uVar6 < 0xf) {
      *(char *)in_x9 = (char)(uVar6 << 4);
    }
    else {
      *(char *)in_x9 = -0x10;
      puVar3 = puVar11;
      if (0xfe < uVar14) {
        uVar14 = ((int)puVar12 - (int)puVar13) - 0x10e;
        uVar7 = (ulong)uVar14 * (ulong)in_w17;
        uVar15 = uVar7 >> 0x27;
        *(ulong **)(unaff_x29 + -0x88) = puVar13;
        _memset(puVar11,0xff,uVar15 + 1);
        puVar13 = *(ulong **)(unaff_x29 + -0x88);
        in_w17 = 0x80808081;
        unaff_x22 = -0x30e4432345000000;
        param_4 = *(uint *)(unaff_x29 + -0x80);
        param_3 = *(ulong **)(unaff_x29 + -0x60);
        uVar14 = uVar14 + (uint)(uVar7 >> 0x27);
        puVar3 = (ulong *)((long)in_x9 + uVar15 + 2);
        unaff_w27 = in_stack_00000068;
      }
      puVar11 = (ulong *)((long)puVar3 + 1);
      *(char *)puVar3 = (char)uVar14;
    }
    param_1 = (ulong *)((long)puVar11 + uVar16);
    puVar3 = param_1;
    if (param_1 <= puVar11 + 1) {
      puVar3 = puVar11 + 1;
    }
    if (((char *)((long)puVar3 + ~(ulong)puVar11) < &segment_command_00000020.vmaddr) ||
       ((ulong)((long)puVar11 - (long)puVar13) < 0x40)) {
code_r0x0009d630:
      do {
        puVar3 = puVar11 + 1;
        *puVar11 = *puVar13;
        puVar13 = puVar13 + 1;
        puVar11 = puVar3;
      } while (puVar3 < param_1);
    }
    else {
      uVar16 = ((long)puVar3 + ~(ulong)puVar11 >> 3) + 1;
      uVar15 = uVar16 & 0x3ffffffffffffff8;
      puVar3 = puVar13 + 4;
      puVar10 = puVar11 + 4;
      uVar7 = uVar15;
      do {
        uVar20 = puVar3[-4];
        uVar22 = puVar3[-1];
        uVar21 = puVar3[-2];
        uVar24 = puVar3[1];
        uVar23 = *puVar3;
        uVar26 = puVar3[3];
        uVar25 = puVar3[2];
        puVar10[-3] = puVar3[-3];
        puVar10[-4] = uVar20;
        puVar10[-1] = uVar22;
        puVar10[-2] = uVar21;
        puVar10[1] = uVar24;
        *puVar10 = uVar23;
        puVar10[3] = uVar26;
        puVar10[2] = uVar25;
        uVar7 = uVar7 - 8;
        puVar3 = puVar3 + 8;
        puVar10 = puVar10 + 8;
      } while (uVar7 != 0);
      puVar13 = puVar13 + uVar15;
      puVar11 = puVar11 + uVar15;
      if (uVar16 != uVar15) goto code_r0x0009d630;
    }
    param_2 = 0xffff;
    unaff_x25 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)uVar8 - (short)uVar2;
  }
  else {
    param_1 = (ulong *)((long)in_x9 + 1);
    *(char *)in_x9 = '\0';
    unaff_x25 = (short *)((long)in_x9 + 3);
    *(short *)param_1 = (short)uVar14 - (short)uVar8;
    puVar12 = puVar13;
  }
  if (puVar9 != param_5) {
    puVar13 = (ulong *)((long)puVar12 + 4);
    puVar9 = (ulong *)((long)puVar17 + 4);
    if (puVar13 < unaff_x30) {
      uVar16 = *puVar13 ^ *puVar9;
      if (uVar16 == 0) {
        puVar11 = (ulong *)((long)puVar12 + 0xc);
        puVar9 = (ulong *)((long)puVar17 + 0xc);
        if (puVar11 < unaff_x30) goto code_r0x0009d6a0;
        goto code_r0x0009d754;
      }
      uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
      uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
      uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
      uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3;
      lVar18 = *(long *)(unaff_x29 + -0x68);
    }
    else {
      puVar11 = puVar13;
      if (puVar13 < unaff_x30) {
code_r0x0009d6a0:
        iVar5 = ((int)puVar11 - (int)puVar12) + -4;
        lVar18 = *(long *)(unaff_x29 + -0x68);
        do {
          uVar16 = *puVar11 ^ *puVar9;
          if (uVar16 != 0) {
            uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
            uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
            uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
            uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
            in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) +
                                  iVar5);
            goto code_r0x0009d73c;
          }
          puVar11 = puVar11 + 1;
          puVar9 = puVar9 + 1;
          iVar5 = iVar5 + 8;
        } while (puVar11 < unaff_x30);
      }
      else {
code_r0x0009d754:
        lVar18 = *(long *)(unaff_x29 + -0x68);
      }
      if (puVar11 < param_12) {
        if ((int)*puVar9 == (int)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 4);
          puVar9 = (ulong *)((long)puVar9 + 4);
        }
      }
      if (puVar11 < param_11) {
        if ((short)*puVar9 == (short)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 2);
          puVar9 = (ulong *)((long)puVar9 + 2);
        }
      }
      else {
      }
      if (puVar11 < in_stack_00000088) {
        if ((char)*puVar9 == (char)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 1);
        }
      }
      in_x11 = (ulong)(uint)((int)puVar11 - (int)puVar13);
    }
code_r0x0009d73c:
    puVar13 = (ulong *)((long)puVar12 + in_x11 + 4);
    goto code_r0x0009d9c0;
  }
  puVar13 = (ulong *)((long)puVar12 + (in_stack_00000070 - (long)puVar17));
  in_x10 = in_stack_00000088;
  if (puVar13 <= in_stack_00000088) {
    in_x10 = puVar13;
  }
  puVar13 = (ulong *)((long)puVar12 + 4);
  puVar9 = (ulong *)((long)puVar17 + 4);
  puVar11 = (ulong *)((long)in_x10 - 7);
  if (puVar13 < puVar11) {
    uVar16 = *puVar13 ^ *puVar9;
    if (uVar16 == 0) {
      puVar3 = (ulong *)((long)puVar12 + 0xc);
      puVar9 = (ulong *)((long)puVar17 + 0xc);
      if (puVar3 < puVar11) goto code_r0x0009d7f8;
      goto code_r0x0009db68;
    }
    uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
    uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
    uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
    uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3;
  }
  else {
    puVar3 = puVar13;
    if (puVar13 < puVar11) {
code_r0x0009d7f8:
      iVar5 = ((int)puVar3 - (int)puVar12) + -4;
      do {
        uVar16 = *puVar3 ^ *puVar9;
        if (uVar16 != 0) {
          uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
          uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
          uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
          uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) + iVar5
                                );
          in_w17 = 0x80808081;
          goto code_r0x0009d8a8;
        }
        puVar3 = puVar3 + 1;
        puVar9 = puVar9 + 1;
        iVar5 = iVar5 + 8;
      } while (puVar3 < puVar11);
      if (puVar3 < (ulong *)((long)in_x10 - 3U)) goto code_r0x0009d834;
code_r0x0009db78:
      if (puVar3 < (ulong *)((long)in_x10 - 1U)) {
code_r0x0009db8c:
        if ((short)*puVar9 == (short)*puVar3) {
          puVar3 = (ulong *)((long)puVar3 + 2);
          puVar9 = (ulong *)((long)puVar9 + 2);
        }
      }
    }
    else {
code_r0x0009db68:
      if ((ulong *)((long)in_x10 - 3U) <= puVar3) goto code_r0x0009db78;
code_r0x0009d834:
      if ((int)*puVar9 == (int)*puVar3) {
        puVar3 = (ulong *)((long)puVar3 + 4);
        puVar9 = (ulong *)((long)puVar9 + 4);
      }
      if (puVar3 < (ulong *)((long)in_x10 - 1U)) goto code_r0x0009db8c;
    }
    if (puVar3 < in_x10) {
      if ((char)*puVar9 == (char)*puVar3) {
        puVar3 = (ulong *)((long)puVar3 + 1);
      }
    }
    in_w17 = 0x80808081;
    in_x11 = (ulong)(uint)((int)puVar3 - (int)puVar13);
  }
code_r0x0009d8a8:
  puVar13 = (ulong *)((long)puVar12 + in_x11 + 4);
  if (puVar13 != in_x10) {
    lVar18 = *(long *)(unaff_x29 + -0x68);
    goto code_r0x0009d9c0;
  }
  puVar13 = in_x10;
  puVar9 = param_3;
  if (in_x10 < unaff_x30) {
    uVar16 = *in_x10 ^ *param_3;
    if (uVar16 != 0) goto code_r0x0009d8e4;
    puVar13 = in_x10 + 1;
    puVar9 = in_stack_00000050;
  }
  if (puVar13 < unaff_x30) {
    puVar12 = (ulong *)((long)puVar12 + (in_stack_00000070 - (long)puVar17));
    if (in_stack_00000088 <= puVar12) {
      puVar12 = in_stack_00000088;
    }
    iVar5 = (int)puVar13 - (int)puVar12;
    lVar18 = *(long *)(unaff_x29 + -0x68);
    do {
      uVar16 = *puVar13 ^ *puVar9;
      if (uVar16 != 0) {
        uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
        uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
        uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
        uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
        in_x12 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) + iVar5);
        goto LAB_0009d9b8;
      }
      puVar13 = puVar13 + 1;
      puVar9 = puVar9 + 1;
      iVar5 = iVar5 + 8;
    } while (puVar13 < unaff_x30);
  }
  else {
    lVar18 = *(long *)(unaff_x29 + -0x68);
  }
  if (puVar13 < param_12) {
    if ((int)*puVar9 == (int)*puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 4);
      puVar9 = (ulong *)((long)puVar9 + 4);
    }
  }
  else {
  }
  if (puVar13 < param_11) {
    if ((short)*puVar9 == (short)*puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 2);
      puVar9 = (ulong *)((long)puVar9 + 2);
    }
  }
  else {
  }
  if (puVar13 < in_stack_00000088) {
    if ((char)*puVar9 == (char)*puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 1);
    }
  }
  in_x12 = (ulong)(uint)((int)puVar13 - (int)in_x10);
  goto LAB_0009d9b8;
code_r0x0009d8e4:
  uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
  uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
  uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
  uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
  in_x12 = (ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3;
  goto code_r0x0009d8f0;
}

