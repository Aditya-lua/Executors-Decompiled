
int FUN_000a0634(ulong *param_1,undefined8 param_2,ulong *param_3,uint param_4,ulong *param_5,
                ulong *param_6,long param_7,ulong *param_8,int param_9,undefined8 param_10,
                ulong *param_11,ulong *param_12)

{
  char *pcVar1;
  long lVar2;
  char cVar3;
  short *psVar4;
  ulong *puVar6;
  ulong *puVar5;
  uint uVar7;
  ulong uVar8;
  uint uVar9;
  uint in_w10;
  uint uVar10;
  ulong in_x11;
  uint uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong uVar15;
  long unaff_x21;
  int iVar16;
  ulong uVar17;
  long unaff_x22;
  ulong *puVar18;
  ulong uVar19;
  short *unaff_x24;
  short *psVar20;
  uint unaff_w25;
  int unaff_w26;
  ulong uVar21;
  long unaff_x27;
  ulong *puVar22;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  long in_stack_00000060;
  int in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  
code_r0x000a0634:
  if (0x3fb < in_w10) {
    uVar10 = (int)in_x11 - 0x40b;
    uVar19 = (ulong)(uVar10 / 0x3fc << 2);
    _memset((short *)((long)param_1 + 6),0xff,uVar19 + 4);
    param_9 = 0xffff;
    param_7 = -0x30e4432345000000;
    unaff_w25 = *(uint *)(unaff_x29 + -0x80);
    param_4 = *(uint *)(unaff_x29 + -100);
    param_3 = *(ulong **)(unaff_x29 + -0x60);
    in_w10 = uVar10 % 0x3fc;
    unaff_x24 = (short *)((long)param_1 + 6 + uVar19);
    unaff_x22 = in_stack_00000088;
    unaff_x27 = in_stack_00000080;
  }
  uVar10 = (in_w10 & 0xffff) / 0xff;
  pcVar1 = (char *)((long)unaff_x24 + (ulong)uVar10);
  *pcVar1 = (char)in_w10 + (char)uVar10;
  psVar20 = (short *)(pcVar1 + 1);
joined_r0x000a06e4:
  if (param_6 <= unaff_x30) {
LAB_0009f9fc:
    uVar15 = in_stack_00000060 - (long)unaff_x30;
    uVar19 = uVar15 - 0xf;
    if (uVar15 < 0xf) {
      *(char *)psVar20 = (char)((int)uVar15 << 4);
    }
    else {
      psVar4 = (short *)((long)psVar20 + 1);
      *(char *)psVar20 = -0x10;
      if (0xfe < uVar19) {
        uVar19 = (long)param_3 + (in_stack_00000050 - (long)unaff_x30) + -0x10e;
        uVar17 = uVar19 / 0xff;
        _memset(psVar4,0xff,uVar17 + 1);
        uVar19 = uVar19 % 0xff;
        psVar4 = (short *)((long)psVar20 + uVar17 + 2);
      }
      *(char *)psVar4 = (char)uVar19;
      psVar20 = psVar4;
    }
    _memcpy((char *)((long)psVar20 + 1),unaff_x30,uVar15);
    *(undefined8 *)(unaff_x21 + 0x4000) = *(undefined8 *)(unaff_x29 + -0x60);
    *(undefined4 *)(in_stack_00000070 + 8) = in_stack_00000078._4_4_;
    return ((int)(char *)((long)psVar20 + 1) + (int)uVar15) - unaff_w26;
  }
  iVar16 = (int)unaff_x22;
  *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x30 + -2) * param_7) >> 0x32 & 0x3ffc)) =
       (int)(long *)((long)unaff_x30 + -2) - iVar16;
  uVar11 = (int)unaff_x30 - iVar16;
  uVar19 = *unaff_x30 * param_7 >> 0x32 & 0x3ffc;
  uVar10 = *(uint *)(unaff_x21 + uVar19);
  puVar12 = param_5;
  lVar2 = unaff_x27;
  if (param_4 <= uVar10) {
    puVar12 = param_3;
    lVar2 = unaff_x22;
  }
  *(uint *)(unaff_x21 + uVar19) = uVar11;
  if ((uVar10 < unaff_w25 || uVar10 + param_9 < uVar11) ||
     (puVar22 = (ulong *)(lVar2 + (ulong)uVar10), (int)*puVar22 != (int)*unaff_x30)) {
    uVar10 = (int)(ulong *)((long)unaff_x30 + 1U) - iVar16;
    if ((ulong *)((long)unaff_x30 + 2U) <= param_6) {
      uVar15 = *(ulong *)((long)unaff_x30 + 1);
      uVar17 = 1;
      uVar19 = 0x41;
      puVar12 = (ulong *)((long)unaff_x30 + 2U);
      puVar18 = (ulong *)((long)unaff_x30 + 1U);
      do {
        puVar22 = puVar12;
        uVar8 = uVar15 * param_7 >> 0x32 & 0x3ffc;
        uVar11 = *(uint *)(unaff_x21 + uVar8);
        uVar21 = (ulong)uVar11;
        uVar15 = *puVar22;
        *(uint *)(unaff_x21 + uVar8) = uVar10;
        unaff_w26 = in_stack_00000068;
        if (unaff_w25 <= uVar11 && uVar10 <= uVar11 + param_9) {
          lVar2 = unaff_x27;
          if (param_4 <= uVar11) {
            lVar2 = unaff_x22;
          }
          if (*(int *)(lVar2 + uVar21) == (int)*puVar18) goto code_r0x000a03c4;
        }
        uVar10 = (int)puVar22 - iVar16;
        puVar12 = (ulong *)((long)puVar22 + uVar17);
        uVar17 = uVar19 >> 6;
        uVar19 = uVar19 + 1;
        puVar18 = puVar22;
        if (param_6 < puVar12) break;
      } while( true );
    }
    goto LAB_0009f9fc;
  }
  param_1 = (ulong *)((long)psVar20 + 1);
  *(char *)psVar20 = '\0';
  unaff_x24 = (short *)((long)psVar20 + 3);
  *(short *)param_1 = (short)uVar11 - (short)uVar10;
  puVar18 = unaff_x30;
  goto joined_r0x000a08d4;
code_r0x000a03c4:
  puVar12 = param_5;
  if (param_4 <= uVar11) {
    puVar12 = param_3;
  }
  puVar22 = (ulong *)(lVar2 + uVar21);
  if ((puVar12 < puVar22) && (*(char *)((long)puVar18 - 1) == *(char *)((long)puVar22 - 1))) {
    puVar5 = (ulong *)((long)puVar18 - 1);
    puVar6 = (ulong *)(lVar2 + uVar21 + -1);
    do {
      puVar22 = puVar6;
      puVar18 = puVar5;
      if ((puVar22 <= puVar12) || (puVar18 <= unaff_x30)) break;
      puVar5 = (ulong *)((long)puVar18 + -1);
      puVar6 = (ulong *)((long)puVar22 + -1);
    } while (*(char *)((long)puVar18 + -1) == *(char *)((long)puVar22 + -1));
  }
  puVar5 = (ulong *)((long)psVar20 + 1);
  uVar9 = (uint)((long)puVar18 - (long)unaff_x30);
  uVar7 = uVar9 - 0xf;
  if (uVar9 < 0xf) {
    *(char *)psVar20 = (char)(uVar9 << 4);
  }
  else {
    *(char *)psVar20 = -0x10;
    puVar6 = puVar5;
    if (0xfe < uVar7) {
      uVar7 = ((int)puVar18 - (int)unaff_x30) - 0x10e;
      uVar19 = (ulong)uVar7 / 0xff;
      _memset(puVar5,0xff,uVar19 + 1);
      param_9 = 0xffff;
      param_7 = -0x30e4432345000000;
      param_4 = *(uint *)(unaff_x29 + -100);
      param_3 = *(ulong **)(unaff_x29 + -0x60);
      uVar7 = uVar7 + (int)uVar19;
      puVar6 = (ulong *)((long)psVar20 + uVar19 + 2);
    }
    puVar5 = (ulong *)((long)puVar6 + 1);
    *(char *)puVar6 = (char)uVar7;
  }
  param_1 = (ulong *)((long)puVar5 + ((long)puVar18 - (long)unaff_x30 & 0xffffffffU));
  puVar6 = param_1;
  if (param_1 <= puVar5 + 1) {
    puVar6 = puVar5 + 1;
  }
  if (((char *)((long)puVar6 + ~(ulong)puVar5) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar5 - (long)unaff_x30) < 0x40)) {
code_r0x000a0508:
    do {
      puVar6 = puVar5 + 1;
      *puVar5 = *unaff_x30;
      unaff_x30 = unaff_x30 + 1;
      puVar5 = puVar6;
    } while (puVar6 < param_1);
  }
  else {
    uVar19 = ((long)puVar6 + ~(ulong)puVar5 >> 3) + 1;
    uVar17 = uVar19 & 0x3ffffffffffffff8;
    puVar6 = unaff_x30 + 4;
    puVar13 = puVar5 + 4;
    uVar15 = uVar17;
    do {
      uVar8 = puVar6[-4];
      uVar23 = puVar6[-1];
      uVar21 = puVar6[-2];
      uVar25 = puVar6[1];
      uVar24 = *puVar6;
      uVar27 = puVar6[3];
      uVar26 = puVar6[2];
      puVar13[-3] = puVar6[-3];
      puVar13[-4] = uVar8;
      puVar13[-1] = uVar23;
      puVar13[-2] = uVar21;
      puVar13[1] = uVar25;
      *puVar13 = uVar24;
      puVar13[3] = uVar27;
      puVar13[2] = uVar26;
      uVar15 = uVar15 - 8;
      puVar6 = puVar6 + 8;
      puVar13 = puVar13 + 8;
    } while (uVar15 != 0);
    unaff_x30 = unaff_x30 + uVar17;
    puVar5 = puVar5 + uVar17;
    if (uVar19 != uVar17) goto code_r0x000a0508;
  }
  unaff_x24 = (short *)((long)param_1 + 2);
  *(short *)param_1 = (short)uVar10 - (short)uVar11;
joined_r0x000a08d4:
  if (puVar12 != param_5) {
    puVar12 = (ulong *)((long)puVar18 + 4);
    puVar6 = (ulong *)((long)puVar22 + 4);
    puVar5 = puVar12;
    if (puVar12 < param_8) {
      uVar19 = *puVar12 ^ *puVar6;
      if (uVar19 == 0) {
        puVar6 = (ulong *)((long)puVar22 + 0xc);
        puVar5 = (ulong *)((long)puVar18 + 0xc);
        goto joined_r0x000a072c;
      }
      uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
      uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
      uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
      uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3;
    }
    else {
joined_r0x000a072c:
      if (puVar5 < param_8) {
        iVar16 = ((int)puVar5 - (int)puVar18) + -4;
        do {
          uVar19 = *puVar5 ^ *puVar6;
          if (uVar19 != 0) {
            uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
            uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
            uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
            uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
            in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) +
                                  iVar16);
            goto code_r0x000a0610;
          }
          puVar5 = puVar5 + 1;
          puVar6 = puVar6 + 1;
          iVar16 = iVar16 + 8;
        } while (puVar5 < param_8);
      }
      if (puVar5 < param_12) {
        if ((int)*puVar6 == (int)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 4);
          puVar6 = (ulong *)((long)puVar6 + 4);
        }
        if (param_11 <= puVar5) goto code_r0x000a05d8;
code_r0x000a06f8:
        if ((short)*puVar6 == (short)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 2);
          puVar6 = (ulong *)((long)puVar6 + 2);
        }
        if (puVar5 < *(ulong **)(unaff_x29 + -0x70)) {
code_r0x000a05e4:
          if ((char)*puVar6 == (char)*puVar5) {
            puVar5 = (ulong *)((long)puVar5 + 1);
          }
        }
      }
      else {
        if (puVar5 < param_11) goto code_r0x000a06f8;
code_r0x000a05d8:
        if (puVar5 < *(ulong **)(unaff_x29 + -0x70)) goto code_r0x000a05e4;
      }
      in_x11 = (ulong)(uint)((int)puVar5 - (int)puVar12);
    }
code_r0x000a0610:
    unaff_x30 = (ulong *)((long)puVar18 + in_x11 + 4);
    cVar3 = (char)*psVar20;
    uVar10 = (uint)in_x11;
    goto joined_r0x000a09d4;
  }
  puVar12 = (ulong *)((long)puVar18 + (*(long *)(unaff_x29 + -0x78) - (long)puVar22));
  puVar5 = *(ulong **)(unaff_x29 + -0x70);
  if (puVar12 <= *(ulong **)(unaff_x29 + -0x70)) {
    puVar5 = puVar12;
  }
  puVar12 = (ulong *)((long)puVar18 + 4);
  puVar13 = (ulong *)((long)puVar22 + 4);
  puVar14 = (ulong *)((long)puVar5 - 7);
  puVar6 = puVar12;
  if (puVar12 < puVar14) {
    uVar19 = *puVar12 ^ *puVar13;
    if (uVar19 == 0) {
      puVar13 = (ulong *)((long)puVar22 + 0xc);
      puVar6 = (ulong *)((long)puVar18 + 0xc);
      goto joined_r0x000a0a50;
    }
    uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
    uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
    uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
    uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3;
  }
  else {
joined_r0x000a0a50:
    if (puVar6 < puVar14) {
      iVar16 = ((int)puVar6 - (int)puVar18) + -4;
      do {
        uVar19 = *puVar6 ^ *puVar13;
        if (uVar19 != 0) {
          uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
          uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
          uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
          uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) +
                                iVar16);
          goto code_r0x000a0820;
        }
        puVar6 = puVar6 + 1;
        puVar13 = puVar13 + 1;
        iVar16 = iVar16 + 8;
      } while (puVar6 < puVar14);
    }
    if (puVar6 < (ulong *)((long)puVar5 - 3U)) {
      if ((int)*puVar13 == (int)*puVar6) {
        puVar6 = (ulong *)((long)puVar6 + 4);
        puVar13 = (ulong *)((long)puVar13 + 4);
      }
      if (puVar6 < (ulong *)((long)puVar5 - 1U)) goto code_r0x000a09e8;
    }
    else if (puVar6 < (ulong *)((long)puVar5 - 1U)) {
code_r0x000a09e8:
      if ((short)*puVar13 == (short)*puVar6) {
        puVar6 = (ulong *)((long)puVar6 + 2);
        puVar13 = (ulong *)((long)puVar13 + 2);
      }
    }
    if (puVar6 < puVar5) {
      if ((char)*puVar13 == (char)*puVar6) {
        puVar6 = (ulong *)((long)puVar6 + 1);
      }
    }
    in_x11 = (ulong)(uint)((int)puVar6 - (int)puVar12);
  }
code_r0x000a0820:
  unaff_x30 = (ulong *)((long)puVar18 + in_x11 + 4);
  uVar10 = (uint)in_x11;
  if (unaff_x30 != puVar5) {
    cVar3 = (char)*psVar20;
    goto joined_r0x000a09d4;
  }
  puVar12 = puVar5;
  puVar6 = param_3;
  if (puVar5 < param_8) {
    uVar19 = *puVar5 ^ *param_3;
    if (uVar19 == 0) {
      puVar12 = puVar5 + 1;
      puVar6 = in_stack_00000058;
      goto code_r0x000a0914;
    }
    uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
    uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
    uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
    uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
    uVar11 = (uint)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3);
  }
  else {
code_r0x000a0914:
    if (puVar12 < param_8) {
      uVar19 = (long)puVar18 + (*(long *)(unaff_x29 + -0x78) - (long)puVar22);
      if (*(ulong *)(unaff_x29 + -0x70) <= uVar19) {
        uVar19 = *(ulong *)(unaff_x29 + -0x70);
      }
      iVar16 = (int)puVar12 - (int)uVar19;
      do {
        uVar19 = *puVar12 ^ *puVar6;
        if (uVar19 != 0) {
          uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
          uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
          uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
          uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
          uVar11 = (int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) + iVar16;
          goto code_r0x000a09c4;
        }
        puVar12 = puVar12 + 1;
        puVar6 = puVar6 + 1;
        iVar16 = iVar16 + 8;
      } while (puVar12 < param_8);
    }
    if (puVar12 < param_12) {
      if ((int)*puVar6 == (int)*puVar12) {
        puVar12 = (ulong *)((long)puVar12 + 4);
        puVar6 = (ulong *)((long)puVar6 + 4);
      }
      if (param_11 <= puVar12) goto code_r0x000a098c;
code_r0x000a0a1c:
      if ((short)*puVar6 == (short)*puVar12) {
        puVar12 = (ulong *)((long)puVar12 + 2);
        puVar6 = (ulong *)((long)puVar6 + 2);
      }
      if (puVar12 < *(ulong **)(unaff_x29 + -0x70)) {
code_r0x000a0998:
        if ((char)*puVar6 == (char)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 1);
        }
      }
    }
    else {
      if (puVar12 < param_11) goto code_r0x000a0a1c;
code_r0x000a098c:
      if (puVar12 < *(ulong **)(unaff_x29 + -0x70)) goto code_r0x000a0998;
    }
    uVar11 = (int)puVar12 - (int)puVar5;
  }
code_r0x000a09c4:
  uVar10 = uVar11 + uVar10;
  in_x11 = (ulong)uVar10;
  unaff_x30 = (ulong *)((long)puVar5 + (ulong)uVar11);
  cVar3 = (char)*psVar20;
joined_r0x000a09d4:
  if (0xe < uVar10) goto code_r0x000a0624;
  *(char *)psVar20 = cVar3 + (char)uVar10;
  psVar20 = unaff_x24;
  goto joined_r0x000a06e4;
code_r0x000a0624:
  in_w10 = uVar10 - 0xf;
  *(char *)psVar20 = cVar3 + '\x0f';
  unaff_x24[0] = -1;
  unaff_x24[1] = -1;
  goto code_r0x000a0634;
}

