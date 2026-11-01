
int FUN_000a03ec(undefined8 param_1,ulong *param_2,uint param_3,ulong *param_4,ulong *param_5,
                long param_6,ulong *param_7,int param_8,undefined8 param_9,ulong *param_10,
                ulong *param_11)

{
  char *pcVar1;
  long lVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *puVar6;
  uint uVar7;
  uint uVar8;
  ulong in_x10;
  ulong *puVar9;
  char cVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong uVar15;
  ulong *unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  int iVar16;
  long unaff_x22;
  ulong *unaff_x23;
  short *unaff_x24;
  short *psVar17;
  uint unaff_w25;
  ulong unaff_x26;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  long in_stack_00000060;
  int in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  
code_r0x000a03ec:
  puVar3 = (ulong *)((long)unaff_x24 + 1);
  uVar7 = (uint)in_x10;
  uVar8 = uVar7 - 0xf;
  if (uVar7 < 0xf) {
    *(char *)unaff_x24 = (char)(uVar7 << 4);
  }
  else {
    *(char *)unaff_x24 = -0x10;
    puVar6 = puVar3;
    if (0xfe < uVar8) {
      uVar8 = ((int)unaff_x23 - (int)unaff_x30) - 0x10e;
      uVar5 = (ulong)uVar8 / 0xff;
      _memset(puVar3,0xff,uVar5 + 1);
      param_8 = 0xffff;
      param_6 = -0x30e4432345000000;
      param_3 = *(uint *)(unaff_x29 + -100);
      param_2 = *(ulong **)(unaff_x29 + -0x60);
      uVar8 = uVar8 + (int)uVar5;
      puVar6 = (ulong *)((long)unaff_x24 + uVar5 + 2);
    }
    puVar3 = (ulong *)((long)puVar6 + 1);
    *(char *)puVar6 = (char)uVar8;
  }
  puVar6 = (ulong *)((long)puVar3 + (in_x10 & 0xffffffff));
  puVar9 = puVar6;
  if (puVar6 <= puVar3 + 1) {
    puVar9 = puVar3 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar9 + ~(ulong)puVar3)) &&
     (0x3f < (ulong)((long)puVar3 - (long)unaff_x30))) {
    uVar5 = ((long)puVar9 + ~(ulong)puVar3 >> 3) + 1;
    uVar11 = uVar5 & 0x3ffffffffffffff8;
    puVar9 = unaff_x30 + 4;
    puVar12 = puVar3 + 4;
    uVar15 = uVar11;
    do {
      uVar4 = puVar9[-4];
      uVar19 = puVar9[-1];
      uVar18 = puVar9[-2];
      uVar21 = puVar9[1];
      uVar20 = *puVar9;
      uVar23 = puVar9[3];
      uVar22 = puVar9[2];
      puVar12[-3] = puVar9[-3];
      puVar12[-4] = uVar4;
      puVar12[-1] = uVar19;
      puVar12[-2] = uVar18;
      puVar12[1] = uVar21;
      *puVar12 = uVar20;
      puVar12[3] = uVar23;
      puVar12[2] = uVar22;
      uVar15 = uVar15 - 8;
      puVar9 = puVar9 + 8;
      puVar12 = puVar12 + 8;
    } while (uVar15 != 0);
    unaff_x30 = unaff_x30 + uVar11;
    puVar3 = puVar3 + uVar11;
    if (uVar5 == uVar11) goto LAB_000a0518;
  }
  do {
    puVar9 = puVar3 + 1;
    *puVar3 = *unaff_x30;
    unaff_x30 = unaff_x30 + 1;
    puVar3 = puVar9;
  } while (puVar9 < puVar6);
LAB_000a0518:
  psVar17 = (short *)((long)puVar6 + 2);
  *(short *)puVar6 = (short)unaff_w20 - (short)unaff_x26;
  unaff_x30 = unaff_x23;
  if (unaff_x19 == param_4) goto LAB_000a0734;
code_r0x000a0538:
  puVar3 = (ulong *)((long)unaff_x30 + 4);
  puVar12 = (ulong *)((long)unaff_x28 + 4);
  puVar9 = puVar3;
  if (puVar3 < param_7) {
    uVar5 = *puVar3 ^ *puVar12;
    if (uVar5 == 0) {
      puVar12 = (ulong *)((long)unaff_x28 + 0xc);
      puVar9 = (ulong *)((long)unaff_x30 + 0xc);
      goto joined_r0x000a072c;
    }
    uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
    uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
    uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
    uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
    uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
  }
  else {
joined_r0x000a072c:
    if (puVar9 < param_7) {
      iVar16 = ((int)puVar9 - (int)unaff_x30) + -4;
      do {
        uVar5 = *puVar9 ^ *puVar12;
        if (uVar5 != 0) {
          uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
          uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
          uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          uVar5 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) + iVar16);
          goto code_r0x000a0610;
        }
        puVar9 = puVar9 + 1;
        puVar12 = puVar12 + 1;
        iVar16 = iVar16 + 8;
      } while (puVar9 < param_7);
    }
    if (puVar9 < param_11) {
      if ((int)*puVar12 == (int)*puVar9) {
        puVar9 = (ulong *)((long)puVar9 + 4);
        puVar12 = (ulong *)((long)puVar12 + 4);
      }
      if (puVar9 < param_10) goto code_r0x000a06f8;
code_r0x000a05d8:
      if (puVar9 < *(ulong **)(unaff_x29 + -0x70)) {
code_r0x000a05e4:
        if ((char)*puVar12 == (char)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 1);
        }
      }
    }
    else {
      if (param_10 <= puVar9) goto code_r0x000a05d8;
code_r0x000a06f8:
      if ((short)*puVar12 == (short)*puVar9) {
        puVar9 = (ulong *)((long)puVar9 + 2);
        puVar12 = (ulong *)((long)puVar12 + 2);
      }
      if (puVar9 < *(ulong **)(unaff_x29 + -0x70)) goto code_r0x000a05e4;
    }
    uVar5 = (ulong)(uint)((int)puVar9 - (int)puVar3);
  }
code_r0x000a0610:
  unaff_x30 = (ulong *)((long)unaff_x30 + uVar5 + 4);
  cVar10 = (char)*unaff_x24;
  uVar8 = (uint)uVar5;
  if (uVar8 < 0xf) goto code_r0x000a0840;
code_r0x000a0624:
  uVar8 = uVar8 - 0xf;
  *(char *)unaff_x24 = cVar10 + '\x0f';
  psVar17[0] = -1;
  psVar17[1] = -1;
  if (0x3fb < uVar8) {
    uVar8 = (int)uVar5 - 0x40b;
    uVar5 = (ulong)(uVar8 / 0x3fc << 2);
    _memset((short *)((long)puVar6 + 6),0xff,uVar5 + 4);
    param_8 = 0xffff;
    param_6 = -0x30e4432345000000;
    unaff_w25 = *(uint *)(unaff_x29 + -0x80);
    param_3 = *(uint *)(unaff_x29 + -100);
    param_2 = *(ulong **)(unaff_x29 + -0x60);
    uVar8 = uVar8 % 0x3fc;
    psVar17 = (short *)((long)puVar6 + 6 + uVar5);
    unaff_x22 = in_stack_00000088;
    unaff_x27 = in_stack_00000080;
  }
  uVar7 = (uVar8 & 0xffff) / 0xff;
  pcVar1 = (char *)((long)psVar17 + (ulong)uVar7);
  unaff_x24 = (short *)(pcVar1 + 1);
  *pcVar1 = (char)uVar8 + (char)uVar7;
  if (unaff_x30 < param_5) {
    do {
      iVar16 = (int)unaff_x22;
      *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x30 + -2) * param_6) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)unaff_x30 + -2) - iVar16;
      uVar7 = (int)unaff_x30 - iVar16;
      uVar5 = *unaff_x30 * param_6 >> 0x32 & 0x3ffc;
      uVar8 = *(uint *)(unaff_x21 + uVar5);
      puVar3 = param_4;
      lVar2 = unaff_x27;
      if (param_3 <= uVar8) {
        puVar3 = param_2;
        lVar2 = unaff_x22;
      }
      *(uint *)(unaff_x21 + uVar5) = uVar7;
      if ((uVar8 < unaff_w25 || uVar8 + param_8 < uVar7) ||
         (unaff_x28 = (ulong *)(lVar2 + (ulong)uVar8), (int)*unaff_x28 != (int)*unaff_x30)) {
        unaff_w20 = (int)(ulong *)((long)unaff_x30 + 1U) - iVar16;
        if (param_5 < (ulong *)((long)unaff_x30 + 2U)) break;
        uVar15 = *(ulong *)((long)unaff_x30 + 1);
        uVar11 = 1;
        uVar5 = 0x41;
        puVar3 = (ulong *)((long)unaff_x30 + 2U);
        unaff_x23 = (ulong *)((long)unaff_x30 + 1U);
        goto code_r0x000a0380;
      }
      puVar6 = (ulong *)((long)unaff_x24 + 1);
      *(char *)unaff_x24 = '\0';
      psVar17 = (short *)((long)unaff_x24 + 3);
      *(short *)puVar6 = (short)uVar7 - (short)uVar8;
      if (puVar3 != param_4) goto code_r0x000a0538;
LAB_000a0734:
      puVar3 = (ulong *)((long)unaff_x30 + (*(long *)(unaff_x29 + -0x78) - (long)unaff_x28));
      puVar9 = *(ulong **)(unaff_x29 + -0x70);
      if (puVar3 <= *(ulong **)(unaff_x29 + -0x70)) {
        puVar9 = puVar3;
      }
      puVar3 = (ulong *)((long)unaff_x30 + 4);
      puVar13 = (ulong *)((long)unaff_x28 + 4);
      puVar14 = (ulong *)((long)puVar9 - 7);
      puVar12 = puVar3;
      if (puVar3 < puVar14) {
        uVar5 = *puVar3 ^ *puVar13;
        if (uVar5 == 0) {
          puVar13 = (ulong *)((long)unaff_x28 + 0xc);
          puVar12 = (ulong *)((long)unaff_x30 + 0xc);
          goto joined_r0x000a0a50;
        }
        uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
        uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
        uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      }
      else {
joined_r0x000a0a50:
        if (puVar12 < puVar14) {
          iVar16 = ((int)puVar12 - (int)unaff_x30) + -4;
          do {
            uVar5 = *puVar12 ^ *puVar13;
            if (uVar5 != 0) {
              uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
              uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
              uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
              uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
              uVar5 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) +
                                   iVar16);
              goto code_r0x000a0820;
            }
            puVar12 = puVar12 + 1;
            puVar13 = puVar13 + 1;
            iVar16 = iVar16 + 8;
          } while (puVar12 < puVar14);
        }
        if (puVar12 < (ulong *)((long)puVar9 - 3U)) {
          if ((int)*puVar13 == (int)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 4);
            puVar13 = (ulong *)((long)puVar13 + 4);
          }
          if (puVar12 < (ulong *)((long)puVar9 - 1U)) goto code_r0x000a09e8;
        }
        else if (puVar12 < (ulong *)((long)puVar9 - 1U)) {
code_r0x000a09e8:
          if ((short)*puVar13 == (short)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 2);
            puVar13 = (ulong *)((long)puVar13 + 2);
          }
        }
        if (puVar12 < puVar9) {
          if ((char)*puVar13 == (char)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 1);
          }
        }
        uVar5 = (ulong)(uint)((int)puVar12 - (int)puVar3);
      }
code_r0x000a0820:
      puVar3 = (ulong *)((long)unaff_x30 + uVar5 + 4);
      uVar8 = (uint)uVar5;
      if (puVar3 == puVar9) {
        puVar3 = puVar9;
        puVar12 = param_2;
        if (puVar9 < param_7) {
          uVar5 = *puVar9 ^ *param_2;
          if (uVar5 == 0) {
            puVar3 = puVar9 + 1;
            puVar12 = in_stack_00000058;
            goto code_r0x000a0914;
          }
          uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
          uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
          uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          uVar7 = (uint)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3);
        }
        else {
code_r0x000a0914:
          if (puVar3 < param_7) {
            uVar5 = (long)unaff_x30 + (*(long *)(unaff_x29 + -0x78) - (long)unaff_x28);
            if (*(ulong *)(unaff_x29 + -0x70) <= uVar5) {
              uVar5 = *(ulong *)(unaff_x29 + -0x70);
            }
            iVar16 = (int)puVar3 - (int)uVar5;
            do {
              uVar5 = *puVar3 ^ *puVar12;
              if (uVar5 != 0) {
                uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
                uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
                uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
                uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
                uVar7 = (int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) + iVar16;
                goto code_r0x000a09c4;
              }
              puVar3 = puVar3 + 1;
              puVar12 = puVar12 + 1;
              iVar16 = iVar16 + 8;
            } while (puVar3 < param_7);
          }
          if (puVar3 < param_11) {
            if ((int)*puVar12 == (int)*puVar3) {
              puVar3 = (ulong *)((long)puVar3 + 4);
              puVar12 = (ulong *)((long)puVar12 + 4);
            }
            if (puVar3 < param_10) goto code_r0x000a0a1c;
code_r0x000a098c:
            if (puVar3 < *(ulong **)(unaff_x29 + -0x70)) {
code_r0x000a0998:
              if ((char)*puVar12 == (char)*puVar3) {
                puVar3 = (ulong *)((long)puVar3 + 1);
              }
            }
          }
          else {
            if (param_10 <= puVar3) goto code_r0x000a098c;
code_r0x000a0a1c:
            if ((short)*puVar12 == (short)*puVar3) {
              puVar3 = (ulong *)((long)puVar3 + 2);
              puVar12 = (ulong *)((long)puVar12 + 2);
            }
            if (puVar3 < *(ulong **)(unaff_x29 + -0x70)) goto code_r0x000a0998;
          }
          uVar7 = (int)puVar3 - (int)puVar9;
        }
code_r0x000a09c4:
        uVar8 = uVar7 + uVar8;
        uVar5 = (ulong)uVar8;
        cVar10 = (char)*unaff_x24;
        unaff_x30 = (ulong *)((long)puVar9 + (ulong)uVar7);
      }
      else {
        cVar10 = (char)*unaff_x24;
        unaff_x30 = puVar3;
      }
      if (0xe < uVar8) goto code_r0x000a0624;
code_r0x000a0840:
      *(char *)unaff_x24 = cVar10 + (char)uVar8;
      unaff_x24 = psVar17;
      if (param_5 <= unaff_x30) break;
    } while( true );
  }
LAB_0009f9fc:
  uVar15 = in_stack_00000060 - (long)unaff_x30;
  uVar5 = uVar15 - 0xf;
  if (uVar15 < 0xf) {
    *(char *)unaff_x24 = (char)((int)uVar15 << 4);
  }
  else {
    psVar17 = (short *)((long)unaff_x24 + 1);
    *(char *)unaff_x24 = -0x10;
    if (0xfe < uVar5) {
      uVar5 = (long)param_2 + (in_stack_00000050 - (long)unaff_x30) + -0x10e;
      uVar11 = uVar5 / 0xff;
      _memset(psVar17,0xff,uVar11 + 1);
      uVar5 = uVar5 % 0xff;
      psVar17 = (short *)((long)unaff_x24 + uVar11 + 2);
    }
    *(char *)psVar17 = (char)uVar5;
    unaff_x24 = psVar17;
  }
  _memcpy((char *)((long)unaff_x24 + 1),unaff_x30,uVar15);
  *(undefined8 *)(unaff_x21 + 0x4000) = *(undefined8 *)(unaff_x29 + -0x60);
  *(undefined4 *)(in_stack_00000070 + 8) = in_stack_00000078._4_4_;
  return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar15) - in_stack_00000068;
code_r0x000a0380:
  puVar6 = puVar3;
  uVar4 = uVar15 * param_6 >> 0x32 & 0x3ffc;
  uVar8 = *(uint *)(unaff_x21 + uVar4);
  unaff_x26 = (ulong)uVar8;
  uVar15 = *puVar6;
  *(uint *)(unaff_x21 + uVar4) = unaff_w20;
  if (unaff_w25 <= uVar8 && unaff_w20 <= uVar8 + param_8) {
    lVar2 = unaff_x27;
    if (param_3 <= uVar8) {
      lVar2 = unaff_x22;
    }
    if (*(int *)(lVar2 + unaff_x26) == (int)*unaff_x23) goto code_r0x000a03c4;
  }
  unaff_w20 = (int)puVar6 - iVar16;
  puVar3 = (ulong *)((long)puVar6 + uVar11);
  uVar11 = uVar5 >> 6;
  uVar5 = uVar5 + 1;
  unaff_x23 = puVar6;
  if (param_5 < puVar3) goto LAB_0009f9fc;
  goto code_r0x000a0380;
code_r0x000a03c4:
  unaff_x19 = param_4;
  if (param_3 <= uVar8) {
    unaff_x19 = param_2;
  }
  unaff_x28 = (ulong *)(lVar2 + unaff_x26);
  if ((unaff_x19 < unaff_x28) && (*(char *)((long)unaff_x23 - 1) == *(char *)((long)unaff_x28 - 1)))
  {
    puVar3 = (ulong *)((long)unaff_x23 - 1);
    puVar6 = (ulong *)(lVar2 + unaff_x26 + -1);
    do {
      unaff_x28 = puVar6;
      unaff_x23 = puVar3;
      if ((unaff_x28 <= unaff_x19) || (unaff_x23 <= unaff_x30)) break;
      puVar3 = (ulong *)((long)unaff_x23 + -1);
      puVar6 = (ulong *)((long)unaff_x28 + -1);
    } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)unaff_x28 + -1));
  }
  in_x10 = (long)unaff_x23 - (long)unaff_x30;
  goto code_r0x000a03ec;
}

