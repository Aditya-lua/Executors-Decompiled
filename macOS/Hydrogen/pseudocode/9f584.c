
int FUN_0009f584(ulong *param_1,undefined8 param_2,ulong *param_3,uint param_4,ulong *param_5,
                char *param_6,long param_7,ulong *param_8,int param_9,undefined8 param_10,
                undefined8 param_11,ulong *param_12,ulong *param_13)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  undefined1 in_ZR;
  short *psVar4;
  ulong *puVar5;
  uint uVar6;
  ulong *puVar7;
  short *in_x9;
  ulong *in_x10;
  uint uVar8;
  ulong *puVar9;
  ulong in_x11;
  ulong *in_x12;
  ulong uVar10;
  ulong uVar11;
  ulong *in_x13;
  ulong *puVar12;
  ulong *puVar13;
  ulong *in_x14;
  ulong *in_x15;
  long unaff_x19;
  ulong uVar14;
  long unaff_x21;
  uint uVar15;
  short *unaff_x22;
  ulong *puVar16;
  long lVar17;
  ulong *unaff_x26;
  int iVar18;
  undefined4 uVar19;
  long unaff_x27;
  long unaff_x29;
  uint unaff_w30;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  long in_stack_00000058;
  ulong *in_stack_00000060;
  uint in_stack_00000068;
  long in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  char *in_stack_00000090;
  
code_r0x0009f584:
  if ((bool)in_ZR) {
    in_x12 = in_x14;
    in_x13 = in_x15;
  }
  if (in_x12 < param_12) goto LAB_0009f754;
code_r0x0009f598:
  if (*(ulong **)(unaff_x29 + -0x78) <= in_x12) goto LAB_0009f5b8;
LAB_0009f5a4:
  if ((char)*in_x13 == (char)*in_x12) {
    in_x12 = (ulong *)((long)in_x12 + 1);
  }
LAB_0009f5b8:
  uVar10 = (ulong)(uint)((int)in_x12 - (int)in_x10);
LAB_0009f5d0:
  uVar15 = (int)uVar10 + (int)in_x11;
  in_x11 = (ulong)uVar15;
  puVar7 = (ulong *)((long)in_x10 + uVar10);
  if (param_6 < (char *)((long)param_1 + ((ulong)(uVar15 + 0xf0) * (ulong)unaff_w30 >> 0x27) + 8)) {
LAB_0009d2b8:
    in_stack_00000078 = 0;
    uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar17 = *(long *)(unaff_x29 + -0x68);
code_r0x0009f8a0:
    *(ulong **)(unaff_x21 + 0x4000) = param_3;
    *(undefined4 *)(lVar17 + 8) = uVar19;
    return in_stack_00000078;
  }
code_r0x0009f5f0:
  uVar8 = (uint)in_x11;
  uVar15 = uVar8 - 0xf;
  if (uVar8 < 0xf) {
    *(char *)in_x9 = (char)*in_x9 + (char)in_x11;
    in_x9 = unaff_x22;
  }
  else {
    *(char *)in_x9 = (char)*in_x9 + '\x0f';
    unaff_x22[0] = -1;
    unaff_x22[1] = -1;
    if (0x3fb < uVar15) {
      uVar15 = (uint)((ulong)(uVar8 - 0x40b) * (ulong)unaff_w30 >> 0x29);
      uVar10 = (ulong)(uVar15 << 2);
      _memset((short *)((long)param_1 + 6),0xff,uVar10 + 4);
      unaff_w30 = 0x80808081;
      param_9 = 0xffff;
      unaff_x19 = -0x30e4432345000000;
      param_4 = *(uint *)(unaff_x29 + -0x80);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar15 = (uVar8 - 0x40b) + uVar15 * -0x3fc;
      unaff_x22 = (short *)((long)param_1 + 6 + uVar10);
      param_6 = in_stack_00000090;
      unaff_x27 = in_stack_00000088;
    }
    uVar8 = (uVar15 & 0xffff) / 0xff;
    pcVar2 = (char *)((long)unaff_x22 + (ulong)uVar8);
    *pcVar2 = (char)uVar15 + (char)uVar8;
    in_x9 = (short *)(pcVar2 + 1);
  }
  if (puVar7 < unaff_x26) {
    iVar18 = (int)unaff_x27;
    *(int *)(unaff_x21 + ((ulong)(*(long *)((long)puVar7 + -2) * unaff_x19) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar7 + -2) - iVar18;
    uVar8 = (int)puVar7 - iVar18;
    uVar10 = *puVar7 * unaff_x19 >> 0x32 & 0x3ffc;
    uVar15 = *(uint *)(unaff_x21 + uVar10);
    puVar1 = param_5;
    lVar17 = param_7;
    if (param_4 <= uVar15) {
      puVar1 = param_3;
      lVar17 = unaff_x27;
    }
    *(uint *)(unaff_x21 + uVar10) = uVar8;
    if ((uVar15 + param_9 < uVar8) ||
       (puVar16 = (ulong *)(lVar17 + (ulong)uVar15), (int)*puVar16 != (int)*puVar7)) {
      uVar15 = (int)(ulong *)((long)puVar7 + 1U) - iVar18;
      if ((ulong *)((long)puVar7 + 2U) <= unaff_x26) {
        uVar10 = *(ulong *)((long)puVar7 + 1);
        puVar1 = (ulong *)((long)puVar7 + 2U);
        puVar9 = (ulong *)((long)puVar7 + 1U);
        uVar6 = in_stack_00000080._4_4_;
        uVar8 = in_stack_00000068;
        do {
          puVar16 = puVar1;
          uVar11 = uVar10 * unaff_x19 >> 0x32 & 0x3ffc;
          uVar3 = *(uint *)(unaff_x21 + uVar11);
          uVar14 = (ulong)uVar3;
          uVar10 = *puVar16;
          *(uint *)(unaff_x21 + uVar11) = uVar15;
          if (uVar15 <= uVar3 + param_9) {
            lVar17 = param_7;
            if (param_4 <= uVar3) {
              lVar17 = unaff_x27;
            }
            if (*(int *)(lVar17 + uVar14) == (int)*puVar9) goto code_r0x0009f0f0;
          }
          uVar15 = (int)puVar16 - iVar18;
          uVar11 = (ulong)uVar6;
          uVar6 = uVar8 >> 6;
          uVar8 = uVar8 + 1;
          puVar1 = (ulong *)((long)puVar16 + uVar11);
          puVar9 = puVar16;
          if (unaff_x26 < (ulong *)((long)puVar16 + uVar11)) break;
        } while( true );
      }
      goto LAB_0009c948;
    }
    param_1 = (ulong *)((long)in_x9 + 1);
    *(char *)in_x9 = '\0';
    unaff_x22 = (short *)((long)in_x9 + 3);
    *(short *)param_1 = (short)uVar8 - (short)uVar15;
    goto joined_r0x0009f270;
  }
LAB_0009c948:
  uVar10 = in_stack_00000070 - (long)puVar7;
  if (param_6 < (char *)((long)in_x9 + (uVar10 + 0xf0) / 0xff + uVar10 + 1)) goto LAB_0009d2b8;
  uVar11 = uVar10 - 0xf;
  if (uVar10 < 0xf) {
    *(char *)in_x9 = (char)((int)uVar10 << 4);
    uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar17 = *(long *)(unaff_x29 + -0x68);
  }
  else {
    psVar4 = (short *)((long)in_x9 + 1);
    *(char *)in_x9 = -0x10;
    if (0xfe < uVar11) {
      uVar11 = (long)param_3 + (in_stack_00000058 - (long)puVar7) + -0x10e;
      uVar14 = uVar11 / 0xff;
      _memset(psVar4,0xff,uVar14 + 1);
      uVar11 = uVar11 % 0xff;
      psVar4 = (short *)((long)in_x9 + uVar14 + 2);
    }
    uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar17 = *(long *)(unaff_x29 + -0x68);
    *(char *)psVar4 = (char)uVar11;
    in_x9 = psVar4;
  }
  _memcpy((char *)((long)in_x9 + 1),puVar7,uVar10);
  in_stack_00000078 = ((int)(char *)((long)in_x9 + 1) + (int)uVar10) - in_stack_00000078;
  param_3 = *(ulong **)(unaff_x29 + -0x60);
  goto code_r0x0009f8a0;
code_r0x0009f0f0:
  puVar1 = param_5;
  if (param_4 <= uVar3) {
    puVar1 = param_3;
  }
  puVar16 = (ulong *)(lVar17 + uVar14);
  if ((puVar1 < puVar16) && (*(char *)((long)puVar9 - 1) == *(char *)((long)puVar16 - 1))) {
    puVar13 = (ulong *)((long)puVar9 - 1);
    puVar5 = (ulong *)(lVar17 + uVar14 + -1);
    do {
      puVar16 = puVar5;
      puVar9 = puVar13;
      if ((puVar16 <= puVar1) || (puVar9 <= puVar7)) break;
      puVar13 = (ulong *)((long)puVar9 + -1);
      puVar5 = (ulong *)((long)puVar16 + -1);
    } while (*(char *)((long)puVar9 + -1) == *(char *)((long)puVar16 + -1));
  }
  puVar13 = (ulong *)((long)in_x9 + 1);
  uVar10 = (long)puVar9 - (long)puVar7 & 0xffffffff;
  if (param_6 < (char *)((long)puVar13 + (uVar10 * unaff_w30 >> 0x27) + uVar10 + 8))
  goto LAB_0009d2b8;
  uVar6 = (uint)((long)puVar9 - (long)puVar7);
  uVar8 = uVar6 - 0xf;
  if (uVar6 < 0xf) {
    *(char *)in_x9 = (char)(uVar6 << 4);
  }
  else {
    *(char *)in_x9 = -0x10;
    puVar5 = puVar13;
    if (0xfe < uVar8) {
      uVar8 = ((int)puVar9 - (int)puVar7) - 0x10e;
      uVar11 = (ulong)uVar8 * (ulong)unaff_w30;
      uVar14 = uVar11 >> 0x27;
      _memset(puVar13,0xff,uVar14 + 1);
      unaff_w30 = 0x80808081;
      param_9 = 0xffff;
      param_4 = *(uint *)(unaff_x29 + -0x80);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar8 = uVar8 + (uint)(uVar11 >> 0x27);
      puVar5 = (ulong *)((long)in_x9 + uVar14 + 2);
      param_6 = in_stack_00000090;
    }
    puVar13 = (ulong *)((long)puVar5 + 1);
    *(char *)puVar5 = (char)uVar8;
  }
  param_1 = (ulong *)((long)puVar13 + uVar10);
  puVar5 = param_1;
  if (param_1 <= puVar13 + 1) {
    puVar5 = puVar13 + 1;
  }
  if (((char *)((long)puVar5 + ~(ulong)puVar13) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar13 - (long)puVar7) < 0x40)) {
code_r0x0009f248:
    do {
      puVar5 = puVar13 + 1;
      *puVar13 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar13 = puVar5;
    } while (puVar5 < param_1);
  }
  else {
    uVar10 = ((long)puVar5 + ~(ulong)puVar13 >> 3) + 1;
    uVar14 = uVar10 & 0x3ffffffffffffff8;
    puVar5 = puVar7 + 4;
    puVar12 = puVar13 + 4;
    uVar11 = uVar14;
    do {
      uVar20 = puVar5[-4];
      uVar22 = puVar5[-1];
      uVar21 = puVar5[-2];
      uVar24 = puVar5[1];
      uVar23 = *puVar5;
      uVar26 = puVar5[3];
      uVar25 = puVar5[2];
      puVar12[-3] = puVar5[-3];
      puVar12[-4] = uVar20;
      puVar12[-1] = uVar22;
      puVar12[-2] = uVar21;
      puVar12[1] = uVar24;
      *puVar12 = uVar23;
      puVar12[3] = uVar26;
      puVar12[2] = uVar25;
      uVar11 = uVar11 - 8;
      puVar5 = puVar5 + 8;
      puVar12 = puVar12 + 8;
    } while (uVar11 != 0);
    puVar7 = puVar7 + uVar14;
    puVar13 = puVar13 + uVar14;
    if (uVar10 != uVar14) goto code_r0x0009f248;
  }
  unaff_x22 = (short *)((long)param_1 + 2);
  *(short *)param_1 = (short)uVar15 - (short)uVar3;
  puVar7 = puVar9;
joined_r0x0009f270:
  if (puVar1 == param_5) {
    puVar1 = (ulong *)((long)puVar7 + (*(long *)(unaff_x29 + -0x88) - (long)puVar16));
    in_x10 = *(ulong **)(unaff_x29 + -0x78);
    if (puVar1 <= *(ulong **)(unaff_x29 + -0x78)) {
      in_x10 = puVar1;
    }
    puVar1 = (ulong *)((long)puVar7 + 4);
    puVar9 = (ulong *)((long)puVar16 + 4);
    puVar13 = (ulong *)((long)in_x10 - 7);
    if (puVar1 < puVar13) {
      uVar10 = *puVar1 ^ *puVar9;
      if (uVar10 == 0) {
        puVar5 = (ulong *)((long)puVar7 + 0xc);
        puVar9 = (ulong *)((long)puVar16 + 0xc);
        if (puVar5 < puVar13) goto code_r0x0009f414;
        goto code_r0x0009f78c;
      }
      uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
      uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
      uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
    }
    else {
      puVar5 = puVar1;
      if (puVar1 < puVar13) {
code_r0x0009f414:
        iVar18 = ((int)puVar5 - (int)puVar7) + -4;
        do {
          uVar10 = *puVar5 ^ *puVar9;
          if (uVar10 != 0) {
            uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
            uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
            uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
            uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
            in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) +
                                  iVar18);
            goto code_r0x0009f4b4;
          }
          puVar5 = puVar5 + 1;
          puVar9 = puVar9 + 1;
          iVar18 = iVar18 + 8;
        } while (puVar5 < puVar13);
        if (puVar5 < (ulong *)((long)in_x10 - 3U)) goto code_r0x0009f450;
code_r0x0009f79c:
        if (puVar5 < (ulong *)((long)in_x10 - 1U)) {
code_r0x0009f7a8:
          if ((short)*puVar9 == (short)*puVar5) {
            puVar5 = (ulong *)((long)puVar5 + 2);
            puVar9 = (ulong *)((long)puVar9 + 2);
          }
        }
      }
      else {
code_r0x0009f78c:
        if ((ulong *)((long)in_x10 - 3U) <= puVar5) goto code_r0x0009f79c;
code_r0x0009f450:
        if ((int)*puVar9 == (int)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 4);
          puVar9 = (ulong *)((long)puVar9 + 4);
        }
        if (puVar5 < (ulong *)((long)in_x10 - 1U)) goto code_r0x0009f7a8;
      }
      if (puVar5 < in_x10) {
        if ((char)*puVar9 == (char)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 1);
        }
      }
      in_x11 = (ulong)(uint)((int)puVar5 - (int)puVar1);
    }
code_r0x0009f4b4:
    puVar1 = (ulong *)((long)puVar7 + in_x11 + 4);
    if (puVar1 == in_x10) goto code_r0x0009f4e4;
    uVar10 = (ulong)((int)in_x11 + 0xf0) * (ulong)unaff_w30;
    puVar7 = puVar1;
    goto joined_r0x0009f368;
  }
  puVar1 = (ulong *)((long)puVar7 + 4);
  puVar13 = (ulong *)((long)puVar16 + 4);
  puVar9 = puVar1;
  if (puVar1 < param_8) {
    uVar10 = *puVar1 ^ *puVar13;
    if (uVar10 == 0) {
      puVar13 = (ulong *)((long)puVar16 + 0xc);
      puVar9 = (ulong *)((long)puVar7 + 0xc);
      goto joined_r0x0009f3b0;
    }
    uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
    uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
    uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
  }
  else {
joined_r0x0009f3b0:
    if (puVar9 < param_8) {
      iVar18 = ((int)puVar9 - (int)puVar7) + -4;
      do {
        uVar10 = *puVar9 ^ *puVar13;
        if (uVar10 != 0) {
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) +
                                iVar18);
          goto code_r0x0009f34c;
        }
        puVar9 = puVar9 + 1;
        puVar13 = puVar13 + 1;
        iVar18 = iVar18 + 8;
      } while (puVar9 < param_8);
    }
    if (puVar9 < param_13) {
      if ((int)*puVar13 == (int)*puVar9) {
        puVar9 = (ulong *)((long)puVar9 + 4);
        puVar13 = (ulong *)((long)puVar13 + 4);
      }
      if (param_12 <= puVar9) goto code_r0x0009f314;
code_r0x0009f37c:
      if ((short)*puVar13 == (short)*puVar9) {
        puVar9 = (ulong *)((long)puVar9 + 2);
        puVar13 = (ulong *)((long)puVar13 + 2);
      }
      if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009f320:
        if ((char)*puVar13 == (char)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 1);
        }
      }
    }
    else {
      if (puVar9 < param_12) goto code_r0x0009f37c;
code_r0x0009f314:
      if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009f320;
    }
    in_x11 = (ulong)(uint)((int)puVar9 - (int)puVar1);
  }
code_r0x0009f34c:
  uVar10 = (ulong)((int)in_x11 + 0xf0) * (ulong)unaff_w30;
  puVar7 = (ulong *)((long)puVar7 + in_x11 + 4);
joined_r0x0009f368:
  if (param_6 < (char *)((long)param_1 + (uVar10 >> 0x27) + 8)) goto LAB_0009d2b8;
  goto code_r0x0009f5f0;
code_r0x0009f4e4:
  in_x12 = in_x10;
  in_x13 = param_3;
  if (in_x10 < param_8) {
    uVar10 = *in_x10 ^ *param_3;
    if (uVar10 != 0) {
      uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
      uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
      uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
      goto LAB_0009f5d0;
    }
    in_x12 = in_x10 + 1;
    in_x13 = in_stack_00000060;
  }
  if (in_x12 < param_8) {
    uVar10 = (long)puVar7 + (*(long *)(unaff_x29 + -0x88) - (long)puVar16);
    if (*(ulong *)(unaff_x29 + -0x78) <= uVar10) {
      uVar10 = *(ulong *)(unaff_x29 + -0x78);
    }
    iVar18 = (int)in_x12 - (int)uVar10;
    while (uVar10 = *in_x12 ^ *in_x13, uVar10 == 0) {
      in_x12 = in_x12 + 1;
      in_x13 = in_x13 + 1;
      iVar18 = iVar18 + 8;
      if (param_8 <= in_x12) goto code_r0x0009f564;
    }
    uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
    uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
    uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    uVar10 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) + iVar18);
    goto LAB_0009f5d0;
  }
code_r0x0009f564:
  if (in_x12 < param_13) {
    in_ZR = (int)*in_x13 == (int)*in_x12;
    in_x14 = (ulong *)((long)in_x12 + 4);
    in_x15 = (ulong *)((long)in_x13 + 4);
    goto code_r0x0009f584;
  }
  if (param_12 <= in_x12) goto code_r0x0009f598;
LAB_0009f754:
  if ((short)*in_x13 == (short)*in_x12) {
    in_x12 = (ulong *)((long)in_x12 + 2);
    in_x13 = (ulong *)((long)in_x13 + 2);
  }
  if (in_x12 < *(ulong **)(unaff_x29 + -0x78)) goto LAB_0009f5a4;
  goto LAB_0009f5b8;
}

