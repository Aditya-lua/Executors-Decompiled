
int FUN_0009d058(ulong *param_1,undefined8 param_2,ulong *param_3,long param_4,uint param_5,
                char *param_6,ulong *param_7,ulong *param_8,long param_9,undefined8 param_10,
                undefined8 param_11,long param_12,ulong *param_13,ulong *param_14)

{
  char *pcVar1;
  uint uVar2;
  ulong *puVar3;
  short *psVar4;
  uint uVar5;
  short *in_x9;
  uint uVar6;
  ulong *puVar7;
  ulong in_x11;
  ulong *puVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong *in_x16;
  ulong uVar11;
  uint uVar12;
  ulong uVar13;
  long unaff_x21;
  ulong uVar14;
  ulong *puVar15;
  ulong *unaff_x25;
  short *unaff_x26;
  long lVar16;
  int iVar17;
  undefined4 uVar18;
  long unaff_x27;
  int unaff_w28;
  long unaff_x29;
  uint unaff_w30;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  long in_stack_00000060;
  ulong *in_stack_00000068;
  uint in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  ulong *in_stack_00000090;
  
code_r0x0009d058:
  uVar6 = (uint)in_x11;
  uVar12 = uVar6 - 0xf;
  if (0xe < uVar6) {
    *(char *)in_x9 = (char)*in_x9 + '\x0f';
    unaff_x26[0] = -1;
    unaff_x26[1] = -1;
    if (0x3fb < uVar12) {
      uVar12 = (uint)((ulong)(uVar6 - 0x40b) * (ulong)unaff_w30 >> 0x29);
      uVar14 = (ulong)(uVar12 << 2);
      _memset((short *)((long)param_1 + 6),0xff,uVar14 + 4);
      unaff_w30 = 0x80808081;
      unaff_w28 = 0xffff;
      param_6 = *(char **)(unaff_x29 + -0x88);
      param_4 = -0x30e4432345000000;
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar12 = (uVar6 - 0x40b) + uVar12 * -0x3fc;
      unaff_x26 = (short *)((long)param_1 + 6 + uVar14);
      unaff_x25 = in_stack_00000090;
      unaff_x27 = in_stack_00000088;
    }
    uVar6 = (uVar12 & 0xffff) / 0xff;
    pcVar1 = (char *)((long)unaff_x26 + (ulong)uVar6);
    unaff_x26 = (short *)(pcVar1 + 1);
    *pcVar1 = (char)uVar12 + (char)uVar6;
    in_x9 = unaff_x26;
    if (param_8 <= in_x16) goto code_r0x0009d28c;
LAB_0009d138:
    iVar17 = (int)unaff_x27;
    *(int *)(unaff_x21 + ((ulong)(*(long *)((long)in_x16 + -2) * param_4) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)in_x16 + -2) - iVar17;
    uVar6 = (int)in_x16 - iVar17;
    uVar14 = *in_x16 * param_4 >> 0x32 & 0x3ffc;
    uVar12 = *(uint *)(unaff_x21 + uVar14);
    puVar9 = param_7;
    lVar16 = param_9;
    if (param_5 <= uVar12) {
      puVar9 = param_3;
      lVar16 = unaff_x27;
    }
    *(uint *)(unaff_x21 + uVar14) = uVar6;
    if ((uVar12 + unaff_w28 < uVar6) ||
       (puVar15 = (ulong *)(lVar16 + (ulong)uVar12), (int)*puVar15 != (int)*in_x16)) {
      uVar12 = (int)(ulong *)((long)in_x16 + 1U) - iVar17;
      unaff_x26 = in_x9;
      if ((ulong *)((long)in_x16 + 2U) <= param_8) {
        uVar14 = *(ulong *)((long)in_x16 + 1);
        puVar9 = (ulong *)((long)in_x16 + 2U);
        puVar7 = (ulong *)((long)in_x16 + 1U);
        uVar5 = in_stack_00000080._4_4_;
        uVar6 = in_stack_00000070;
        do {
          puVar15 = puVar9;
          uVar11 = uVar14 * param_4 >> 0x32 & 0x3ffc;
          uVar2 = *(uint *)(unaff_x21 + uVar11);
          uVar13 = (ulong)uVar2;
          uVar14 = *puVar15;
          *(uint *)(unaff_x21 + uVar11) = uVar12;
          if (uVar12 <= uVar2 + unaff_w28) {
            lVar16 = param_9;
            if (param_5 <= uVar2) {
              lVar16 = unaff_x27;
            }
            if (*(int *)(lVar16 + uVar13) == (int)*puVar7) goto code_r0x0009cb50;
          }
          uVar12 = (int)puVar15 - iVar17;
          uVar11 = (ulong)uVar5;
          uVar5 = uVar6 >> 6;
          uVar6 = uVar6 + 1;
          puVar9 = (ulong *)((long)puVar15 + uVar11);
          puVar7 = puVar15;
          if (param_8 < (ulong *)((long)puVar15 + uVar11)) break;
        } while( true );
      }
      goto code_r0x0009d28c;
    }
    param_1 = (ulong *)((long)in_x9 + 1);
    *(char *)in_x9 = '\0';
    unaff_x26 = (short *)((long)in_x9 + 3);
    *(short *)param_1 = (short)uVar6 - (short)uVar12;
    goto joined_r0x0009cce0;
  }
  *(char *)in_x9 = (char)*in_x9 + (char)in_x11;
  in_x9 = unaff_x26;
  if (in_x16 < param_8) goto LAB_0009d138;
code_r0x0009d28c:
  uVar14 = in_stack_00000060 - (long)in_x16;
  if ((char *)((long)unaff_x26 + (uVar14 + 0xf0) / 0xff + uVar14 + 1) <= param_6) {
    uVar11 = uVar14 - 0xf;
    if (uVar14 < 0xf) {
      *(char *)unaff_x26 = (char)((int)uVar14 << 4);
      uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
    }
    else {
      psVar4 = (short *)((long)unaff_x26 + 1);
      *(char *)unaff_x26 = -0x10;
      if (0xfe < uVar11) {
        uVar11 = (long)param_3 + (param_12 - (long)in_x16) + -0x10e;
        uVar13 = uVar11 / 0xff;
        _memset(psVar4,0xff,uVar13 + 1);
        uVar11 = uVar11 % 0xff;
        psVar4 = (short *)((long)unaff_x26 + uVar13 + 2);
      }
      uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
      *(char *)psVar4 = (char)uVar11;
      unaff_x26 = psVar4;
    }
    _memcpy((char *)((long)unaff_x26 + 1),in_x16,uVar14);
    in_stack_00000078 = ((int)(char *)((long)unaff_x26 + 1) + (int)uVar14) - in_stack_00000078;
    lVar16 = *(long *)(unaff_x29 + -0x68);
    param_3 = *(ulong **)(unaff_x29 + -0x60);
    goto LAB_0009f8a0;
  }
  goto code_r0x0009d2b8;
code_r0x0009cb50:
  puVar9 = param_7;
  if (param_5 <= uVar2) {
    puVar9 = param_3;
  }
  puVar15 = (ulong *)(lVar16 + uVar13);
  if ((puVar9 < puVar15) && (*(char *)((long)puVar7 - 1) == *(char *)((long)puVar15 - 1))) {
    puVar3 = (ulong *)((long)puVar7 - 1);
    puVar10 = (ulong *)(lVar16 + uVar13 + -1);
    do {
      puVar15 = puVar10;
      puVar7 = puVar3;
      if ((puVar15 <= puVar9) || (puVar7 <= in_x16)) break;
      puVar3 = (ulong *)((long)puVar7 + -1);
      puVar10 = (ulong *)((long)puVar15 + -1);
    } while (*(char *)((long)puVar7 + -1) == *(char *)((long)puVar15 + -1));
  }
  puVar3 = (ulong *)((long)in_x9 + 1);
  uVar14 = (long)puVar7 - (long)in_x16 & 0xffffffff;
  if (param_6 < (char *)((long)puVar3 + (uVar14 * unaff_w30 >> 0x27) + uVar14 + 8))
  goto code_r0x0009d2b8;
  uVar5 = (uint)((long)puVar7 - (long)in_x16);
  uVar6 = uVar5 - 0xf;
  if (uVar5 < 0xf) {
    *(char *)in_x9 = (char)(uVar5 << 4);
  }
  else {
    *(char *)in_x9 = -0x10;
    puVar10 = puVar3;
    if (0xfe < uVar6) {
      uVar6 = ((int)puVar7 - (int)in_x16) - 0x10e;
      uVar11 = (ulong)uVar6 * (ulong)unaff_w30;
      uVar13 = uVar11 >> 0x27;
      _memset(puVar3,0xff,uVar13 + 1);
      unaff_w30 = 0x80808081;
      unaff_w28 = 0xffff;
      param_6 = *(char **)(unaff_x29 + -0x88);
      param_4 = -0x30e4432345000000;
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar6 = uVar6 + (uint)(uVar11 >> 0x27);
      puVar10 = (ulong *)((long)in_x9 + uVar13 + 2);
    }
    puVar3 = (ulong *)((long)puVar10 + 1);
    *(char *)puVar10 = (char)uVar6;
  }
  param_1 = (ulong *)((long)puVar3 + uVar14);
  puVar10 = param_1;
  if (param_1 <= puVar3 + 1) {
    puVar10 = puVar3 + 1;
  }
  if (((char *)((long)puVar10 + ~(ulong)puVar3) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar3 - (long)in_x16) < 0x40)) {
code_r0x0009ccb8:
    do {
      puVar10 = puVar3 + 1;
      *puVar3 = *in_x16;
      in_x16 = in_x16 + 1;
      puVar3 = puVar10;
    } while (puVar10 < param_1);
  }
  else {
    uVar14 = ((long)puVar10 + ~(ulong)puVar3 >> 3) + 1;
    uVar13 = uVar14 & 0x3ffffffffffffff8;
    puVar10 = in_x16 + 4;
    puVar8 = puVar3 + 4;
    uVar11 = uVar13;
    do {
      uVar19 = puVar10[-4];
      uVar21 = puVar10[-1];
      uVar20 = puVar10[-2];
      uVar23 = puVar10[1];
      uVar22 = *puVar10;
      uVar25 = puVar10[3];
      uVar24 = puVar10[2];
      puVar8[-3] = puVar10[-3];
      puVar8[-4] = uVar19;
      puVar8[-1] = uVar21;
      puVar8[-2] = uVar20;
      puVar8[1] = uVar23;
      *puVar8 = uVar22;
      puVar8[3] = uVar25;
      puVar8[2] = uVar24;
      uVar11 = uVar11 - 8;
      puVar10 = puVar10 + 8;
      puVar8 = puVar8 + 8;
    } while (uVar11 != 0);
    in_x16 = in_x16 + uVar13;
    puVar3 = puVar3 + uVar13;
    if (uVar14 != uVar13) goto code_r0x0009ccb8;
  }
  unaff_x26 = (short *)((long)param_1 + 2);
  *(short *)param_1 = (short)uVar12 - (short)uVar2;
  in_x16 = puVar7;
joined_r0x0009cce0:
  if (puVar9 == param_7) {
    puVar9 = (ulong *)((long)in_x16 + (*(long *)(unaff_x29 + -0x80) - (long)puVar15));
    puVar7 = *(ulong **)(unaff_x29 + -0x78);
    if (puVar9 <= *(ulong **)(unaff_x29 + -0x78)) {
      puVar7 = puVar9;
    }
    puVar9 = (ulong *)((long)in_x16 + 4);
    puVar3 = (ulong *)((long)puVar15 + 4);
    puVar10 = (ulong *)((long)puVar7 - 7);
    if (puVar9 < puVar10) {
      uVar14 = *puVar9 ^ *puVar3;
      if (uVar14 == 0) {
        puVar8 = (ulong *)((long)in_x16 + 0xc);
        puVar3 = (ulong *)((long)puVar15 + 0xc);
        if (puVar8 < puVar10) goto code_r0x0009ce80;
        goto code_r0x0009d204;
      }
      uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
      uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
      uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3;
    }
    else {
      puVar8 = puVar9;
      if (puVar9 < puVar10) {
code_r0x0009ce80:
        iVar17 = ((int)puVar8 - (int)in_x16) + -4;
        do {
          uVar14 = *puVar8 ^ *puVar3;
          if (uVar14 != 0) {
            uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
            uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
            uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
            uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
            in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) +
                                  iVar17);
            goto code_r0x0009cf20;
          }
          puVar8 = puVar8 + 1;
          puVar3 = puVar3 + 1;
          iVar17 = iVar17 + 8;
        } while (puVar8 < puVar10);
        if (puVar8 < (ulong *)((long)puVar7 - 3U)) goto code_r0x0009cebc;
code_r0x0009d214:
        if (puVar8 < (ulong *)((long)puVar7 - 1U)) {
code_r0x0009d220:
          if ((short)*puVar3 == (short)*puVar8) {
            puVar8 = (ulong *)((long)puVar8 + 2);
            puVar3 = (ulong *)((long)puVar3 + 2);
          }
        }
      }
      else {
code_r0x0009d204:
        if ((ulong *)((long)puVar7 - 3U) <= puVar8) goto code_r0x0009d214;
code_r0x0009cebc:
        if ((int)*puVar3 == (int)*puVar8) {
          puVar8 = (ulong *)((long)puVar8 + 4);
          puVar3 = (ulong *)((long)puVar3 + 4);
        }
        if (puVar8 < (ulong *)((long)puVar7 - 1U)) goto code_r0x0009d220;
      }
      if (puVar8 < puVar7) {
        if ((char)*puVar3 == (char)*puVar8) {
          puVar8 = (ulong *)((long)puVar8 + 1);
        }
      }
      in_x11 = (ulong)(uint)((int)puVar8 - (int)puVar9);
    }
code_r0x0009cf20:
    puVar9 = (ulong *)((long)in_x16 + in_x11 + 4);
    if (puVar9 != puVar7) {
      uVar14 = (ulong)((int)in_x11 + 0xf0) * (ulong)unaff_w30;
      in_x16 = puVar9;
      goto joined_r0x0009cdd8;
    }
    puVar9 = puVar7;
    puVar3 = param_3;
    if (puVar7 < unaff_x25) {
      uVar14 = *puVar7 ^ *param_3;
      if (uVar14 == 0) {
        puVar9 = puVar7 + 1;
        puVar3 = in_stack_00000068;
        goto code_r0x0009cf88;
      }
      uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
      uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
      uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
      uVar12 = (uint)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3);
    }
    else {
code_r0x0009cf88:
      if (puVar9 < unaff_x25) {
        uVar14 = (long)in_x16 + (*(long *)(unaff_x29 + -0x80) - (long)puVar15);
        if (*(ulong *)(unaff_x29 + -0x78) <= uVar14) {
          uVar14 = *(ulong *)(unaff_x29 + -0x78);
        }
        iVar17 = (int)puVar9 - (int)uVar14;
        do {
          uVar14 = *puVar9 ^ *puVar3;
          if (uVar14 != 0) {
            uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
            uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
            uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
            uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
            uVar12 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) + iVar17;
            goto code_r0x0009d038;
          }
          puVar9 = puVar9 + 1;
          puVar3 = puVar3 + 1;
          iVar17 = iVar17 + 8;
        } while (puVar9 < unaff_x25);
      }
      if (puVar9 < param_14) {
        if ((int)*puVar3 == (int)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 4);
          puVar3 = (ulong *)((long)puVar3 + 4);
        }
        if (param_13 <= puVar9) goto code_r0x0009d000;
code_r0x0009d1cc:
        if ((short)*puVar3 == (short)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 2);
          puVar3 = (ulong *)((long)puVar3 + 2);
        }
        if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009d00c:
          if ((char)*puVar3 == (char)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 1);
          }
        }
      }
      else {
        if (puVar9 < param_13) goto code_r0x0009d1cc;
code_r0x0009d000:
        if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009d00c;
      }
      uVar12 = (int)puVar9 - (int)puVar7;
    }
code_r0x0009d038:
    uVar6 = uVar12 + (int)in_x11;
    in_x11 = (ulong)uVar6;
    in_x16 = (ulong *)((long)puVar7 + (ulong)uVar12);
    uVar14 = (ulong)(uVar6 + 0xf0) * (ulong)unaff_w30;
    goto joined_r0x0009cdd8;
  }
  puVar9 = (ulong *)((long)in_x16 + 4);
  puVar3 = (ulong *)((long)puVar15 + 4);
  puVar7 = puVar9;
  if (puVar9 < unaff_x25) {
    uVar14 = *puVar9 ^ *puVar3;
    if (uVar14 == 0) {
      puVar3 = (ulong *)((long)puVar15 + 0xc);
      puVar7 = (ulong *)((long)in_x16 + 0xc);
      goto joined_r0x0009ce20;
    }
    uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3;
  }
  else {
joined_r0x0009ce20:
    if (puVar7 < unaff_x25) {
      iVar17 = ((int)puVar7 - (int)in_x16) + -4;
      do {
        uVar14 = *puVar7 ^ *puVar3;
        if (uVar14 != 0) {
          uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
          uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
          uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
          uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) +
                                iVar17);
          goto code_r0x0009cdbc;
        }
        puVar7 = puVar7 + 1;
        puVar3 = puVar3 + 1;
        iVar17 = iVar17 + 8;
      } while (puVar7 < unaff_x25);
    }
    if (puVar7 < param_14) {
      if ((int)*puVar3 == (int)*puVar7) {
        puVar7 = (ulong *)((long)puVar7 + 4);
        puVar3 = (ulong *)((long)puVar3 + 4);
      }
      if (param_13 <= puVar7) goto code_r0x0009cd84;
code_r0x0009cdec:
      if ((short)*puVar3 == (short)*puVar7) {
        puVar7 = (ulong *)((long)puVar7 + 2);
        puVar3 = (ulong *)((long)puVar3 + 2);
      }
      if (puVar7 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009cd90:
        if ((char)*puVar3 == (char)*puVar7) {
          puVar7 = (ulong *)((long)puVar7 + 1);
        }
      }
    }
    else {
      if (puVar7 < param_13) goto code_r0x0009cdec;
code_r0x0009cd84:
      if (puVar7 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009cd90;
    }
    in_x11 = (ulong)(uint)((int)puVar7 - (int)puVar9);
  }
code_r0x0009cdbc:
  uVar14 = (ulong)((int)in_x11 + 0xf0) * (ulong)unaff_w30;
  in_x16 = (ulong *)((long)in_x16 + in_x11 + 4);
joined_r0x0009cdd8:
  if (param_6 < (char *)((long)param_1 + (uVar14 >> 0x27) + 8)) {
code_r0x0009d2b8:
    in_stack_00000078 = 0;
    uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar16 = *(long *)(unaff_x29 + -0x68);
LAB_0009f8a0:
    *(ulong **)(unaff_x21 + 0x4000) = param_3;
    *(undefined4 *)(lVar16 + 8) = uVar18;
    return in_stack_00000078;
  }
  goto code_r0x0009d058;
}

