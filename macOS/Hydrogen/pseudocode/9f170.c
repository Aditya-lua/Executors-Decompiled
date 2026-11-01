
int FUN_0009f170(ulong *param_1,undefined8 param_2,long param_3,ulong *param_4,undefined8 param_5,
                long param_6,ulong *param_7)

{
  char *pcVar1;
  uint uVar2;
  ulong *puVar3;
  uint uVar4;
  ulong *puVar5;
  uint uVar6;
  uint uVar7;
  ulong in_x11;
  ulong uVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong *in_x16;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  short *unaff_x22;
  short *psVar16;
  ulong *unaff_x23;
  ulong *unaff_x24;
  uint unaff_w25;
  long lVar17;
  ulong *unaff_x26;
  int iVar18;
  undefined4 uVar19;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong *in_stack_00000010;
  ulong *in_stack_00000018;
  ulong in_stack_00000020;
  uint in_stack_00000028;
  ulong uStack0000000000000030;
  ulong *puStack0000000000000038;
  ulong *puStack0000000000000040;
  long lStack0000000000000048;
  ulong *puStack0000000000000050;
  long in_stack_00000058;
  ulong *in_stack_00000060;
  uint in_stack_00000068;
  long in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  char *in_stack_00000090;
  
code_r0x0009f170:
  uStack0000000000000030 = in_x11;
  puStack0000000000000038 = in_x16;
  puStack0000000000000040 = param_7;
  lStack0000000000000048 = param_6;
  puStack0000000000000050 = param_4;
  _memset(param_1,param_2,param_3);
  param_4 = puStack0000000000000050;
  param_6 = lStack0000000000000048;
  param_7 = puStack0000000000000040;
  uVar4 = *(uint *)(unaff_x29 + -0x80);
  puVar3 = *(ulong **)(unaff_x29 + -0x60);
  in_stack_00000028 = in_stack_00000028 + (int)in_stack_00000020;
  puVar5 = (ulong *)((long)unaff_x22 + in_stack_00000020 + 2);
  in_x11 = uStack0000000000000030;
  in_x16 = puStack0000000000000038;
code_r0x0009f1bc:
  param_1 = (ulong *)((long)puVar5 + 1);
  *(char *)puVar5 = (char)in_stack_00000028;
LAB_0009f1cc:
  puVar5 = (ulong *)((long)param_1 + in_x11);
  puVar14 = puVar5;
  if (puVar5 <= param_1 + 1) {
    puVar14 = param_1 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar14 + ~(ulong)param_1)) &&
     (0x3f < (ulong)((long)param_1 - (long)in_x16))) {
    uVar8 = ((long)puVar14 + ~(ulong)param_1 >> 3) + 1;
    uVar10 = uVar8 & 0x3ffffffffffffff8;
    puVar14 = in_x16 + 4;
    puVar9 = param_1 + 4;
    uVar13 = uVar10;
    do {
      uVar20 = puVar14[-4];
      uVar22 = puVar14[-1];
      uVar21 = puVar14[-2];
      uVar24 = puVar14[1];
      uVar23 = *puVar14;
      uVar26 = puVar14[3];
      uVar25 = puVar14[2];
      puVar9[-3] = puVar14[-3];
      puVar9[-4] = uVar20;
      puVar9[-1] = uVar22;
      puVar9[-2] = uVar21;
      puVar9[1] = uVar24;
      *puVar9 = uVar23;
      puVar9[3] = uVar26;
      puVar9[2] = uVar25;
      uVar13 = uVar13 - 8;
      puVar14 = puVar14 + 8;
      puVar9 = puVar9 + 8;
    } while (uVar13 != 0);
    in_x16 = in_x16 + uVar10;
    param_1 = param_1 + uVar10;
    if (uVar8 == uVar10) goto LAB_0009f258;
  }
  do {
    puVar14 = param_1 + 1;
    *param_1 = *in_x16;
    in_x16 = in_x16 + 1;
    param_1 = puVar14;
  } while (puVar14 < puVar5);
LAB_0009f258:
  psVar16 = (short *)((long)puVar5 + 2);
  *(short *)puVar5 = (short)unaff_w25 - (short)unaff_x20;
  in_x16 = unaff_x23;
  if (unaff_x28 == param_4) goto code_r0x0009f3b8;
code_r0x0009f274:
  puVar14 = (ulong *)((long)in_x16 + 4);
  puVar11 = (ulong *)((long)unaff_x24 + 4);
  puVar9 = puVar14;
  if (puVar14 < param_7) {
    uVar8 = *puVar14 ^ *puVar11;
    if (uVar8 != 0) {
      uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
      uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
      uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar8 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
      goto code_r0x0009f34c;
    }
    puVar11 = (ulong *)((long)unaff_x24 + 0xc);
    puVar9 = (ulong *)((long)in_x16 + 0xc);
  }
  if (puVar9 < param_7) {
    iVar18 = ((int)puVar9 - (int)in_x16) + -4;
    do {
      uVar8 = *puVar9 ^ *puVar11;
      if (uVar8 != 0) {
        uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
        uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
        uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) + iVar18);
        goto code_r0x0009f34c;
      }
      puVar9 = puVar9 + 1;
      puVar11 = puVar11 + 1;
      iVar18 = iVar18 + 8;
    } while (puVar9 < param_7);
  }
  if (puVar9 < in_stack_00000018) {
    if ((int)*puVar11 == (int)*puVar9) {
      puVar9 = (ulong *)((long)puVar9 + 4);
      puVar11 = (ulong *)((long)puVar11 + 4);
    }
    if (puVar9 < in_stack_00000010) goto code_r0x0009f37c;
code_r0x0009f314:
    if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009f320:
      if ((char)*puVar11 == (char)*puVar9) {
        puVar9 = (ulong *)((long)puVar9 + 1);
      }
    }
  }
  else {
    if (in_stack_00000010 <= puVar9) goto code_r0x0009f314;
code_r0x0009f37c:
    if ((short)*puVar11 == (short)*puVar9) {
      puVar9 = (ulong *)((long)puVar9 + 2);
      puVar11 = (ulong *)((long)puVar11 + 2);
    }
    if (puVar9 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009f320;
  }
  uVar8 = (ulong)(uint)((int)puVar9 - (int)puVar14);
code_r0x0009f34c:
  pcVar1 = (char *)((long)puVar5 + (ulong)((int)uVar8 + 0xf0) / 0xff + 8);
  in_x16 = (ulong *)((long)in_x16 + uVar8 + 4);
joined_r0x0009f368:
  if (pcVar1 <= in_stack_00000090) {
    do {
      uVar7 = (uint)uVar8;
      uVar6 = uVar7 - 0xf;
      if (uVar7 < 0xf) {
        *(char *)unaff_x22 = (char)*unaff_x22 + (char)uVar8;
        unaff_x22 = psVar16;
      }
      else {
        *(char *)unaff_x22 = (char)*unaff_x22 + '\x0f';
        psVar16[0] = -1;
        psVar16[1] = -1;
        if (0x3fb < uVar6) {
          uVar8 = (ulong)((uVar7 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar5 + 6),0xff,uVar8 + 4);
          unaff_x19 = -0x30e4432345000000;
          uVar4 = *(uint *)(unaff_x29 + -0x80);
          puVar3 = *(ulong **)(unaff_x29 + -0x60);
          uVar6 = (uVar7 - 0x40b) % 0x3fc;
          psVar16 = (short *)((long)puVar5 + 6 + uVar8);
          unaff_x27 = in_stack_00000088;
        }
        uVar7 = (uVar6 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)psVar16 + (ulong)uVar7);
        *pcVar1 = (char)uVar6 + (char)uVar7;
        unaff_x22 = (short *)(pcVar1 + 1);
      }
      if (unaff_x26 <= in_x16) goto code_r0x0009c948;
      iVar18 = (int)unaff_x27;
      *(int *)(unaff_x21 + ((ulong)(*(long *)((long)in_x16 + -2) * unaff_x19) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)in_x16 + -2) - iVar18;
      uVar7 = (int)in_x16 - iVar18;
      uVar8 = *in_x16 * unaff_x19 >> 0x32 & 0x3ffc;
      uVar6 = *(uint *)(unaff_x21 + uVar8);
      puVar14 = param_4;
      lVar17 = param_6;
      if (uVar4 <= uVar6) {
        puVar14 = puVar3;
        lVar17 = unaff_x27;
      }
      *(uint *)(unaff_x21 + uVar8) = uVar7;
      if ((uVar6 + 0xffff < uVar7) ||
         (unaff_x24 = (ulong *)(lVar17 + (ulong)uVar6), (int)*unaff_x24 != (int)*in_x16)) {
        unaff_w25 = (int)(ulong *)((long)in_x16 + 1U) - iVar18;
        if (unaff_x26 < (ulong *)((long)in_x16 + 2U)) goto code_r0x0009c948;
        uVar8 = *(ulong *)((long)in_x16 + 1);
        puVar5 = (ulong *)((long)in_x16 + 2U);
        unaff_x23 = (ulong *)((long)in_x16 + 1U);
        uVar7 = in_stack_00000080._4_4_;
        uVar6 = in_stack_00000068;
        goto code_r0x0009f0b0;
      }
      puVar5 = (ulong *)((long)unaff_x22 + 1);
      *(char *)unaff_x22 = '\0';
      psVar16 = (short *)((long)unaff_x22 + 3);
      *(short *)puVar5 = (short)uVar7 - (short)uVar6;
      if (puVar14 != param_4) goto code_r0x0009f274;
code_r0x0009f3b8:
      puVar14 = (ulong *)((long)in_x16 + (*(long *)(unaff_x29 + -0x88) - (long)unaff_x24));
      puVar9 = *(ulong **)(unaff_x29 + -0x78);
      if (puVar14 <= *(ulong **)(unaff_x29 + -0x78)) {
        puVar9 = puVar14;
      }
      puVar14 = (ulong *)((long)in_x16 + 4);
      puVar11 = (ulong *)((long)unaff_x24 + 4);
      puVar15 = (ulong *)((long)puVar9 - 7);
      if (puVar14 < puVar15) {
        uVar8 = *puVar14 ^ *puVar11;
        if (uVar8 == 0) {
          puVar12 = (ulong *)((long)in_x16 + 0xc);
          puVar11 = (ulong *)((long)unaff_x24 + 0xc);
          if (puVar12 < puVar15) goto code_r0x0009f414;
          goto code_r0x0009f78c;
        }
        uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
        uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
        uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
      }
      else {
        puVar12 = puVar14;
        if (puVar14 < puVar15) {
code_r0x0009f414:
          iVar18 = ((int)puVar12 - (int)in_x16) + -4;
          do {
            uVar8 = *puVar12 ^ *puVar11;
            if (uVar8 != 0) {
              uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
              uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
              uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
              uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
              uVar8 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) +
                                   iVar18);
              goto code_r0x0009f4b4;
            }
            puVar12 = puVar12 + 1;
            puVar11 = puVar11 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar12 < puVar15);
          if ((ulong *)((long)puVar9 - 3U) <= puVar12) goto code_r0x0009f79c;
code_r0x0009f450:
          if ((int)*puVar11 == (int)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 4);
            puVar11 = (ulong *)((long)puVar11 + 4);
          }
          if (puVar12 < (ulong *)((long)puVar9 - 1U)) {
code_r0x0009f7a8:
            if ((short)*puVar11 == (short)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 2);
              puVar11 = (ulong *)((long)puVar11 + 2);
            }
          }
        }
        else {
code_r0x0009f78c:
          if (puVar12 < (ulong *)((long)puVar9 - 3U)) goto code_r0x0009f450;
code_r0x0009f79c:
          if (puVar12 < (ulong *)((long)puVar9 - 1U)) goto code_r0x0009f7a8;
        }
        if (puVar12 < puVar9) {
          if ((char)*puVar11 == (char)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 1);
          }
        }
        uVar8 = (ulong)(uint)((int)puVar12 - (int)puVar14);
      }
code_r0x0009f4b4:
      puVar14 = (ulong *)((long)in_x16 + uVar8 + 4);
      if (puVar14 != puVar9) goto code_r0x0009f4c4;
      puVar14 = puVar9;
      puVar11 = puVar3;
      if (puVar9 < param_7) {
        uVar13 = *puVar9 ^ *puVar3;
        if (uVar13 == 0) {
          puVar14 = puVar9 + 1;
          puVar11 = in_stack_00000060;
          goto code_r0x0009f51c;
        }
        uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
        uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar6 = (uint)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3);
      }
      else {
code_r0x0009f51c:
        if (puVar14 < param_7) {
          uVar13 = (long)in_x16 + (*(long *)(unaff_x29 + -0x88) - (long)unaff_x24);
          if (*(ulong *)(unaff_x29 + -0x78) <= uVar13) {
            uVar13 = *(ulong *)(unaff_x29 + -0x78);
          }
          iVar18 = (int)puVar14 - (int)uVar13;
          do {
            uVar13 = *puVar14 ^ *puVar11;
            if (uVar13 != 0) {
              uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
              uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
              uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
              uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
              uVar6 = (int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) + iVar18;
              goto code_r0x0009f5d0;
            }
            puVar14 = puVar14 + 1;
            puVar11 = puVar11 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar14 < param_7);
        }
        if (puVar14 < in_stack_00000018) {
          if ((int)*puVar11 == (int)*puVar14) {
            puVar14 = (ulong *)((long)puVar14 + 4);
            puVar11 = (ulong *)((long)puVar11 + 4);
          }
          if (puVar14 < in_stack_00000010) goto code_r0x0009f754;
code_r0x0009f598:
          if (puVar14 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009f5a4:
            if ((char)*puVar11 == (char)*puVar14) {
              puVar14 = (ulong *)((long)puVar14 + 1);
            }
          }
        }
        else {
          if (in_stack_00000010 <= puVar14) goto code_r0x0009f598;
code_r0x0009f754:
          if ((short)*puVar11 == (short)*puVar14) {
            puVar14 = (ulong *)((long)puVar14 + 2);
            puVar11 = (ulong *)((long)puVar11 + 2);
          }
          if (puVar14 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009f5a4;
        }
        uVar6 = (int)puVar14 - (int)puVar9;
      }
code_r0x0009f5d0:
      uVar7 = uVar6 + (int)uVar8;
      uVar8 = (ulong)uVar7;
      in_x16 = (ulong *)((long)puVar9 + (ulong)uVar6);
      if (in_stack_00000090 < (char *)((long)puVar5 + (ulong)(uVar7 + 0xf0) / 0xff + 8)) break;
    } while( true );
  }
  goto code_r0x0009d2b8;
code_r0x0009f0b0:
  puVar14 = puVar5;
  uVar13 = uVar8 * unaff_x19 >> 0x32 & 0x3ffc;
  uVar2 = *(uint *)(unaff_x21 + uVar13);
  unaff_x20 = (ulong)uVar2;
  uVar8 = *puVar14;
  *(uint *)(unaff_x21 + uVar13) = unaff_w25;
  if (unaff_w25 <= uVar2 + 0xffff) {
    lVar17 = param_6;
    if (uVar4 <= uVar2) {
      lVar17 = unaff_x27;
    }
    if (*(int *)(lVar17 + unaff_x20) == (int)*unaff_x23) goto code_r0x0009f0f0;
  }
  unaff_w25 = (int)puVar14 - iVar18;
  uVar13 = (ulong)uVar7;
  uVar7 = uVar6 >> 6;
  uVar6 = uVar6 + 1;
  puVar5 = (ulong *)((long)puVar14 + uVar13);
  unaff_x23 = puVar14;
  if (unaff_x26 < (ulong *)((long)puVar14 + uVar13)) goto code_r0x0009c948;
  goto code_r0x0009f0b0;
code_r0x0009f0f0:
  unaff_x28 = param_4;
  if (uVar4 <= uVar2) {
    unaff_x28 = puVar3;
  }
  unaff_x24 = (ulong *)(lVar17 + unaff_x20);
  if ((unaff_x28 < unaff_x24) && (*(char *)((long)unaff_x23 - 1) == *(char *)((long)unaff_x24 - 1)))
  {
    puVar5 = (ulong *)((long)unaff_x23 - 1);
    puVar14 = (ulong *)(lVar17 + unaff_x20 + -1);
    do {
      unaff_x24 = puVar14;
      unaff_x23 = puVar5;
      if ((unaff_x24 <= unaff_x28) || (unaff_x23 <= in_x16)) break;
      puVar5 = (ulong *)((long)unaff_x23 + -1);
      puVar14 = (ulong *)((long)unaff_x24 + -1);
    } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)unaff_x24 + -1));
  }
  param_1 = (ulong *)((long)unaff_x22 + 1);
  in_x11 = (long)unaff_x23 - (long)in_x16 & 0xffffffff;
  if ((char *)((long)param_1 + in_x11 / 0xff + in_x11 + 8) <= in_stack_00000090) {
    uVar6 = (uint)((long)unaff_x23 - (long)in_x16);
    in_stack_00000028 = uVar6 - 0xf;
    if (0xe < uVar6) goto code_r0x0009f140;
    *(char *)unaff_x22 = (char)(uVar6 << 4);
    goto LAB_0009f1cc;
  }
  goto code_r0x0009d2b8;
code_r0x0009f140:
  *(char *)unaff_x22 = -0x10;
  puVar5 = param_1;
  if (0xfe < in_stack_00000028) goto code_r0x0009f150;
  goto code_r0x0009f1bc;
code_r0x0009f150:
  in_stack_00000028 = ((int)unaff_x23 - (int)in_x16) - 0x10e;
  in_stack_00000020 = (ulong)in_stack_00000028 / 0xff;
  param_3 = in_stack_00000020 + 1;
  param_2 = 0xff;
  goto code_r0x0009f170;
code_r0x0009f4c4:
  pcVar1 = (char *)((long)puVar5 + (ulong)((int)uVar8 + 0xf0) / 0xff + 8);
  in_x16 = puVar14;
  goto joined_r0x0009f368;
code_r0x0009c948:
  uVar8 = in_stack_00000070 - (long)in_x16;
  if ((char *)((long)unaff_x22 + (uVar8 + 0xf0) / 0xff + uVar8 + 1) <= in_stack_00000090) {
    uVar13 = uVar8 - 0xf;
    if (uVar8 < 0xf) {
      *(char *)unaff_x22 = (char)((int)uVar8 << 4);
      uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
      lVar17 = *(long *)(unaff_x29 + -0x68);
    }
    else {
      psVar16 = (short *)((long)unaff_x22 + 1);
      *(char *)unaff_x22 = -0x10;
      if (0xfe < uVar13) {
        uVar13 = (long)puVar3 + (in_stack_00000058 - (long)in_x16) + -0x10e;
        uVar10 = uVar13 / 0xff;
        _memset(psVar16,0xff,uVar10 + 1);
        uVar13 = uVar13 % 0xff;
        psVar16 = (short *)((long)unaff_x22 + uVar10 + 2);
      }
      uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
      lVar17 = *(long *)(unaff_x29 + -0x68);
      *(char *)psVar16 = (char)uVar13;
      unaff_x22 = psVar16;
    }
    _memcpy((char *)((long)unaff_x22 + 1),in_x16,uVar8);
    in_stack_00000078 = ((int)(char *)((long)unaff_x22 + 1) + (int)uVar8) - in_stack_00000078;
    puVar3 = *(ulong **)(unaff_x29 + -0x60);
    goto code_r0x0009f8a0;
  }
code_r0x0009d2b8:
  in_stack_00000078 = 0;
  uVar19 = *(undefined4 *)(unaff_x29 + -0x70);
  lVar17 = *(long *)(unaff_x29 + -0x68);
code_r0x0009f8a0:
  *(ulong **)(unaff_x21 + 0x4000) = puVar3;
  *(undefined4 *)(lVar17 + 8) = uVar19;
  return in_stack_00000078;
}

