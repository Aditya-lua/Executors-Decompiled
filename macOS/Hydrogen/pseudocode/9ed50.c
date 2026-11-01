
/* WARNING: Type propagation algorithm not settling */

int FUN_0009ed50(ulong *param_1,undefined8 param_2,ulong *param_3,uint param_4,ulong *param_5,
                long param_6,ulong *param_7,long param_8,ulong *param_9,undefined8 param_10,
                undefined8 param_11,ulong *param_12,ulong *param_13)

{
  char *pcVar1;
  long lVar2;
  uint uVar3;
  short *psVar4;
  ulong *puVar5;
  int iVar6;
  ulong uVar7;
  uint uVar8;
  short *in_x9;
  ulong *in_x10;
  uint uVar9;
  ulong in_x11;
  ulong *puVar10;
  ulong in_x12;
  ulong uVar11;
  int in_w14;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  uint unaff_w19;
  int unaff_w20;
  long unaff_x21;
  long unaff_x22;
  short *unaff_x24;
  uint uVar16;
  ulong uVar17;
  long unaff_x26;
  undefined4 unaff_w27;
  ulong *puVar18;
  long unaff_x29;
  uint unaff_w30;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  long in_stack_00000040;
  ulong *in_stack_00000048;
  uint in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  ulong *in_stack_00000088;
  
code_r0x0009ed50:
  uVar11 = (ulong)(uint)((int)(in_x12 >> 3) + in_w14);
code_r0x0009ed58:
  in_x11 = (ulong)(uint)((int)uVar11 + (int)in_x11);
  puVar15 = (ulong *)((long)in_x10 + uVar11);
code_r0x0009ed60:
  uVar9 = (uint)in_x11;
  if (*(char **)(unaff_x29 + -0x78) <
      (char *)((long)param_1 + ((ulong)(uVar9 + 0xf0) * (ulong)unaff_w30 >> 0x27) + 8)) {
LAB_0009efc8:
    in_stack_00000078 = 0;
    goto code_r0x0009f8a0;
  }
  uVar16 = uVar9 - 0xf;
  if (uVar9 < 0xf) {
    *(char *)in_x9 = (char)*in_x9 + (char)in_x11;
    in_x9 = unaff_x24;
  }
  else {
    *(char *)in_x9 = (char)*in_x9 + '\x0f';
    unaff_x24[0] = -1;
    unaff_x24[1] = -1;
    if (0x3fb < uVar16) {
      uVar16 = (uint)((ulong)(uVar9 - 0x40b) * (ulong)unaff_w30 >> 0x29);
      uVar11 = (ulong)(uVar16 << 2);
      *(ulong **)(unaff_x29 + -0x88) = puVar15;
      _memset((short *)((long)param_1 + 6),0xff,uVar11 + 4);
      puVar15 = *(ulong **)(unaff_x29 + -0x88);
      unaff_w30 = 0x80808081;
      param_8 = -0x30e4432345000000;
      unaff_w20 = 0xffff;
      param_4 = *(uint *)(unaff_x29 + -0x80);
      uVar16 = (uVar9 - 0x40b) + uVar16 * -0x3fc;
      unaff_x24 = (short *)((long)param_1 + 6 + uVar11);
      unaff_x26 = *(long *)(unaff_x29 + -0x68);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      unaff_x22 = in_stack_00000068;
    }
    uVar9 = (uVar16 & 0xffff) / 0xff;
    pcVar1 = (char *)((long)unaff_x24 + (ulong)uVar9);
    *pcVar1 = (char)uVar16 + (char)uVar9;
    in_x9 = (short *)(pcVar1 + 1);
  }
  if (param_7 <= puVar15) {
code_r0x0009c6c0:
    uVar11 = in_stack_00000060 - (long)puVar15;
    if ((char *)((long)in_x9 + (uVar11 + 0xf0) / 0xff + uVar11 + 1) <= *(char **)(unaff_x29 + -0x78)
       ) {
      uVar7 = uVar11 - 0xf;
      if (uVar11 < 0xf) {
        *(char *)in_x9 = (char)((int)uVar11 << 4);
      }
      else {
        psVar4 = (short *)((long)in_x9 + 1);
        *(char *)in_x9 = -0x10;
        if (0xfe < uVar7) {
          uVar7 = (long)param_3 + (in_stack_00000040 - (long)puVar15) + -0x10e;
          uVar17 = uVar7 / 0xff;
          _memset(psVar4,0xff,uVar17 + 1);
          uVar7 = uVar7 % 0xff;
          psVar4 = (short *)((long)in_x9 + uVar17 + 2);
        }
        *(char *)psVar4 = (char)uVar7;
        in_x9 = psVar4;
      }
      _memcpy((char *)((long)in_x9 + 1),puVar15,uVar11);
      in_stack_00000078 = ((int)(char *)((long)in_x9 + 1) + (int)uVar11) - in_stack_00000078;
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      goto code_r0x0009f8a0;
    }
    goto LAB_0009efc8;
  }
  iVar6 = (int)param_6;
  *(int *)(unaff_x21 + ((ulong)(*(long *)((long)puVar15 + -2) * param_8) >> 0x32 & 0x3ffc)) =
       (int)(long *)((long)puVar15 + -2) - iVar6;
  uVar16 = (int)puVar15 - iVar6;
  uVar11 = *puVar15 * param_8 >> 0x32 & 0x3ffc;
  uVar9 = *(uint *)(unaff_x21 + uVar11);
  puVar10 = param_5;
  lVar2 = unaff_x22;
  if (param_4 <= uVar9) {
    puVar10 = param_3;
    lVar2 = param_6;
  }
  *(uint *)(unaff_x21 + uVar11) = uVar16;
  if ((uVar9 < unaff_w19 || uVar9 + unaff_w20 < uVar16) ||
     (puVar18 = (ulong *)(lVar2 + (ulong)uVar9), (int)*puVar18 != (int)*puVar15)) {
    uVar9 = (int)(ulong *)((long)puVar15 + 1U) - iVar6;
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
    if ((ulong *)((long)puVar15 + 2U) <= param_7) {
      uVar11 = *(ulong *)((long)puVar15 + 1);
      puVar10 = (ulong *)((long)puVar15 + 2U);
      puVar14 = (ulong *)((long)puVar15 + 1U);
      uVar8 = in_stack_00000080._4_4_;
      uVar16 = in_stack_00000058;
      do {
        puVar18 = puVar10;
        uVar7 = uVar11 * param_8 >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar7);
        uVar17 = (ulong)uVar3;
        uVar11 = *puVar18;
        *(uint *)(unaff_x21 + uVar7) = uVar9;
        if (unaff_w19 <= uVar3 && uVar9 <= uVar3 + unaff_w20) {
          lVar2 = unaff_x22;
          if (param_4 <= uVar3) {
            lVar2 = param_6;
          }
          if (*(int *)(lVar2 + uVar17) == (int)*puVar14) goto code_r0x0009e864;
        }
        uVar9 = (int)puVar18 - iVar6;
        uVar7 = (ulong)uVar8;
        uVar8 = uVar16 >> 6;
        uVar16 = uVar16 + 1;
        puVar10 = (ulong *)((long)puVar18 + uVar7);
        puVar14 = puVar18;
        if (param_7 < (ulong *)((long)puVar18 + uVar7)) {
          unaff_x26 = *(long *)(unaff_x29 + -0x68);
          break;
        }
      } while( true );
    }
    goto code_r0x0009c6c0;
  }
  param_1 = (ulong *)((long)in_x9 + 1);
  *(char *)in_x9 = '\0';
  unaff_x24 = (short *)((long)in_x9 + 3);
  *(short *)param_1 = (short)uVar16 - (short)uVar9;
  puVar14 = puVar15;
  goto joined_r0x0009ea08;
code_r0x0009e864:
  puVar10 = param_5;
  if (param_4 <= uVar3) {
    puVar10 = param_3;
  }
  puVar18 = (ulong *)(lVar2 + uVar17);
  if ((puVar10 < puVar18) && (*(char *)((long)puVar14 - 1) == *(char *)((long)puVar18 - 1))) {
    puVar13 = (ulong *)((long)puVar14 - 1);
    puVar5 = (ulong *)(lVar2 + uVar17 + -1);
    do {
      puVar18 = puVar5;
      puVar14 = puVar13;
      if ((puVar18 <= puVar10) || (puVar14 <= puVar15)) break;
      puVar13 = (ulong *)((long)puVar14 + -1);
      puVar5 = (ulong *)((long)puVar18 + -1);
    } while (*(char *)((long)puVar14 + -1) == *(char *)((long)puVar18 + -1));
  }
  puVar13 = (ulong *)((long)in_x9 + 1);
  uVar11 = (long)puVar14 - (long)puVar15 & 0xffffffff;
  if (*(char **)(unaff_x29 + -0x78) <
      (char *)((long)puVar13 + (uVar11 * unaff_w30 >> 0x27) + uVar11 + 8)) {
    in_stack_00000078 = 0;
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
    unaff_x26 = *(long *)(unaff_x29 + -0x68);
code_r0x0009f8a0:
    *(ulong **)(unaff_x21 + 0x4000) = param_3;
    *(undefined4 *)(unaff_x26 + 8) = unaff_w27;
    return in_stack_00000078;
  }
  uVar8 = (uint)((long)puVar14 - (long)puVar15);
  uVar16 = uVar8 - 0xf;
  if (uVar8 < 0xf) {
    *(char *)in_x9 = (char)(uVar8 << 4);
  }
  else {
    *(char *)in_x9 = -0x10;
    puVar5 = puVar13;
    if (0xfe < uVar16) {
      uVar16 = ((int)puVar14 - (int)puVar15) - 0x10e;
      uVar7 = (ulong)uVar16 * (ulong)unaff_w30;
      uVar17 = uVar7 >> 0x27;
      *(ulong **)(unaff_x29 + -0x88) = puVar15;
      _memset(puVar13,0xff,uVar17 + 1);
      puVar15 = *(ulong **)(unaff_x29 + -0x88);
      unaff_w30 = 0x80808081;
      param_8 = -0x30e4432345000000;
      unaff_w20 = 0xffff;
      param_4 = *(uint *)(unaff_x29 + -0x80);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar16 = uVar16 + (uint)(uVar7 >> 0x27);
      puVar5 = (ulong *)((long)in_x9 + uVar17 + 2);
    }
    puVar13 = (ulong *)((long)puVar5 + 1);
    *(char *)puVar5 = (char)uVar16;
  }
  param_1 = (ulong *)((long)puVar13 + uVar11);
  puVar5 = param_1;
  if (param_1 <= puVar13 + 1) {
    puVar5 = puVar13 + 1;
  }
  if (((char *)((long)puVar5 + ~(ulong)puVar13) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar13 - (long)puVar15) < 0x40)) {
code_r0x0009e9dc:
    do {
      puVar5 = puVar13 + 1;
      *puVar13 = *puVar15;
      puVar15 = puVar15 + 1;
      puVar13 = puVar5;
    } while (puVar5 < param_1);
  }
  else {
    uVar11 = ((long)puVar5 + ~(ulong)puVar13 >> 3) + 1;
    uVar17 = uVar11 & 0x3ffffffffffffff8;
    puVar5 = puVar15 + 4;
    puVar12 = puVar13 + 4;
    uVar7 = uVar17;
    do {
      uVar19 = puVar5[-4];
      uVar21 = puVar5[-1];
      uVar20 = puVar5[-2];
      uVar23 = puVar5[1];
      uVar22 = *puVar5;
      uVar25 = puVar5[3];
      uVar24 = puVar5[2];
      puVar12[-3] = puVar5[-3];
      puVar12[-4] = uVar19;
      puVar12[-1] = uVar21;
      puVar12[-2] = uVar20;
      puVar12[1] = uVar23;
      *puVar12 = uVar22;
      puVar12[3] = uVar25;
      puVar12[2] = uVar24;
      uVar7 = uVar7 - 8;
      puVar5 = puVar5 + 8;
      puVar12 = puVar12 + 8;
    } while (uVar7 != 0);
    puVar15 = puVar15 + uVar17;
    puVar13 = puVar13 + uVar17;
    if (uVar11 != uVar17) goto code_r0x0009e9dc;
  }
  unaff_x26 = *(long *)(unaff_x29 + -0x68);
  unaff_x24 = (short *)((long)param_1 + 2);
  *(short *)param_1 = (short)uVar9 - (short)uVar3;
joined_r0x0009ea08:
  if (puVar10 == param_5) {
    puVar15 = (ulong *)((long)puVar14 + (in_stack_00000070 - (long)puVar18));
    in_x10 = in_stack_00000088;
    if (puVar15 <= in_stack_00000088) {
      in_x10 = puVar15;
    }
    puVar15 = (ulong *)((long)puVar14 + 4);
    puVar10 = (ulong *)((long)puVar18 + 4);
    puVar13 = (ulong *)((long)in_x10 - 7);
    if (puVar15 < puVar13) {
      uVar11 = *puVar15 ^ *puVar10;
      if (uVar11 != 0) {
        uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        in_x11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
        goto code_r0x0009ec48;
      }
      puVar5 = (ulong *)((long)puVar14 + 0xc);
      puVar10 = (ulong *)((long)puVar18 + 0xc);
      if (puVar5 < puVar13) goto code_r0x0009eba8;
code_r0x0009eef8:
      if (puVar5 < (ulong *)((long)in_x10 - 3U)) goto code_r0x0009ebe4;
code_r0x0009ef08:
      if (puVar5 < (ulong *)((long)in_x10 - 1U)) goto code_r0x0009ef14;
    }
    else {
      puVar5 = puVar15;
      if (puVar13 <= puVar15) goto code_r0x0009eef8;
code_r0x0009eba8:
      iVar6 = ((int)puVar5 - (int)puVar14) + -4;
      do {
        uVar11 = *puVar5 ^ *puVar10;
        if (uVar11 != 0) {
          uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
          uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
          uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
          uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) + iVar6
                                );
          goto code_r0x0009ec48;
        }
        puVar5 = puVar5 + 1;
        puVar10 = puVar10 + 1;
        iVar6 = iVar6 + 8;
      } while (puVar5 < puVar13);
      if ((ulong *)((long)in_x10 - 3U) <= puVar5) goto code_r0x0009ef08;
code_r0x0009ebe4:
      if ((int)*puVar10 == (int)*puVar5) {
        puVar5 = (ulong *)((long)puVar5 + 4);
        puVar10 = (ulong *)((long)puVar10 + 4);
      }
      if (puVar5 < (ulong *)((long)in_x10 - 1U)) {
code_r0x0009ef14:
        if ((short)*puVar10 == (short)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 2);
          puVar10 = (ulong *)((long)puVar10 + 2);
        }
      }
    }
    if (puVar5 < in_x10) {
      if ((char)*puVar10 == (char)*puVar5) {
        puVar5 = (ulong *)((long)puVar5 + 1);
      }
    }
    in_x11 = (ulong)(uint)((int)puVar5 - (int)puVar15);
code_r0x0009ec48:
    puVar15 = (ulong *)((long)puVar14 + in_x11 + 4);
    if (puVar15 == in_x10) goto code_r0x0009ec64;
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
    goto code_r0x0009ed60;
  }
  puVar15 = (ulong *)((long)puVar14 + 4);
  puVar10 = (ulong *)((long)puVar18 + 4);
  if (puVar15 < param_9) {
    uVar11 = *puVar15 ^ *puVar10;
    if (uVar11 != 0) {
      uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
      uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
      uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
      uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
      unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
      goto code_r0x0009eaec;
    }
    puVar13 = (ulong *)((long)puVar14 + 0xc);
    puVar10 = (ulong *)((long)puVar18 + 0xc);
    if (puVar13 < param_9) goto code_r0x0009ea50;
code_r0x0009eb04:
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
  }
  else {
    puVar13 = puVar15;
    if (param_9 <= puVar15) goto code_r0x0009eb04;
code_r0x0009ea50:
    iVar6 = ((int)puVar13 - (int)puVar14) + -4;
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
    do {
      uVar11 = *puVar13 ^ *puVar10;
      if (uVar11 != 0) {
        uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) + iVar6);
        goto code_r0x0009eaec;
      }
      puVar13 = puVar13 + 1;
      puVar10 = puVar10 + 1;
      iVar6 = iVar6 + 8;
    } while (puVar13 < param_9);
  }
  if (puVar13 < param_13) {
    if (*(int *)puVar10 == *(int *)puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 4);
      puVar10 = (ulong *)((long)puVar10 + 4);
    }
  }
  if (puVar13 < param_12) {
    if (*(short *)puVar10 == *(short *)puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 2);
      puVar10 = (ulong *)((long)puVar10 + 2);
    }
  }
  if (puVar13 < in_stack_00000088) {
    if ((char)*puVar10 == (char)*puVar13) {
      puVar13 = (ulong *)((long)puVar13 + 1);
    }
  }
  in_x11 = (ulong)(uint)((int)puVar13 - (int)puVar15);
code_r0x0009eaec:
  puVar15 = (ulong *)((long)puVar14 + in_x11 + 4);
  goto code_r0x0009ed60;
code_r0x0009ec64:
  puVar15 = in_x10;
  puVar10 = param_3;
  if (in_x10 < param_9) {
    uVar11 = *in_x10 ^ *param_3;
    if (uVar11 != 0) {
      uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
      uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
      uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
      uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
      uVar11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
      unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
      goto code_r0x0009ed58;
    }
    puVar15 = in_x10 + 1;
    puVar10 = in_stack_00000048;
  }
  if (puVar15 < param_9) {
    puVar14 = (ulong *)((long)puVar14 + (in_stack_00000070 - (long)puVar18));
    if (in_stack_00000088 <= puVar14) {
      puVar14 = in_stack_00000088;
    }
    in_w14 = (int)puVar15 - (int)puVar14;
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
    do {
      uVar11 = *puVar15 ^ *puVar10;
      if (uVar11 != 0) {
        uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        in_x12 = LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20);
        goto code_r0x0009ed50;
      }
      puVar15 = puVar15 + 1;
      puVar10 = puVar10 + 1;
      in_w14 = in_w14 + 8;
    } while (puVar15 < param_9);
  }
  else {
    unaff_w27 = *(undefined4 *)(unaff_x29 + -0x70);
  }
  if (puVar15 < param_13) {
    if ((int)*puVar10 == (int)*puVar15) {
      puVar15 = (ulong *)((long)puVar15 + 4);
      puVar10 = (ulong *)((long)puVar10 + 4);
    }
  }
  else {
  }
  if (puVar15 < param_12) {
    if ((short)*puVar10 == (short)*puVar15) {
      puVar15 = (ulong *)((long)puVar15 + 2);
      puVar10 = (ulong *)((long)puVar10 + 2);
    }
  }
  else {
  }
  if (puVar15 < in_stack_00000088) {
    if ((char)*puVar10 == (char)*puVar15) {
      puVar15 = (ulong *)((long)puVar15 + 1);
    }
  }
  uVar11 = (ulong)(uint)((int)puVar15 - (int)in_x10);
  goto code_r0x0009ed58;
}

