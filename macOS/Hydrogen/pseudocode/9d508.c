
/* WARNING: Type propagation algorithm not settling */

int FUN_0009d508(ulong *param_1,ulong *param_2,uint param_3,ulong *param_4,long param_5,long param_6
                ,int param_7,ulong *param_8,undefined8 param_9,ulong *param_10,ulong *param_11)

{
  char *pcVar1;
  uint uVar2;
  undefined1 in_CY;
  int iVar3;
  char cVar4;
  uint in_w8;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  uint uVar8;
  ulong in_x11;
  ulong *puVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *in_x16;
  uint in_w17;
  ulong unaff_x19;
  uint unaff_w20;
  uint uVar15;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong *unaff_x24;
  short *unaff_x25;
  short *psVar16;
  ulong *unaff_x26;
  long lVar17;
  uint unaff_w27;
  undefined4 uVar18;
  ulong *unaff_x28;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  long in_stack_00000048;
  ulong *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  uint in_stack_00000068;
  long in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  ulong *in_stack_00000088;
  
code_r0x0009d508:
  cVar4 = (char)in_w8;
  puVar7 = param_1;
  if ((bool)in_CY) {
    uVar8 = ((int)unaff_x24 - (int)in_x16) - 0x10e;
    uVar5 = (ulong)uVar8 * (ulong)in_w17;
    uVar6 = uVar5 >> 0x27;
    *(ulong **)(unaff_x29 + -0x88) = in_x16;
    _memset(param_1,0xff,uVar6 + 1);
    in_x16 = *(ulong **)(unaff_x29 + -0x88);
    in_w17 = 0x80808081;
    unaff_x22 = -0x30e4432345000000;
    param_3 = *(uint *)(unaff_x29 + -0x80);
    param_2 = *(ulong **)(unaff_x29 + -0x60);
    cVar4 = (char)uVar8 + (char)(uVar5 >> 0x27);
    puVar7 = (ulong *)((long)unaff_x25 + uVar6 + 2);
    unaff_w27 = in_stack_00000068;
  }
  param_1 = (ulong *)((long)puVar7 + 1);
  *(char *)puVar7 = cVar4;
LAB_0009d5ac:
  puVar7 = (ulong *)((long)param_1 + in_x11);
  puVar13 = puVar7;
  if (puVar7 <= param_1 + 1) {
    puVar13 = param_1 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar13 + ~(ulong)param_1)) &&
     (0x3f < (ulong)((long)param_1 - (long)in_x16))) {
    uVar5 = ((long)puVar13 + ~(ulong)param_1 >> 3) + 1;
    uVar10 = uVar5 & 0x3ffffffffffffff8;
    puVar13 = in_x16 + 4;
    puVar11 = param_1 + 4;
    uVar6 = uVar10;
    do {
      uVar19 = puVar13[-4];
      uVar21 = puVar13[-1];
      uVar20 = puVar13[-2];
      uVar23 = puVar13[1];
      uVar22 = *puVar13;
      uVar25 = puVar13[3];
      uVar24 = puVar13[2];
      puVar11[-3] = puVar13[-3];
      puVar11[-4] = uVar19;
      puVar11[-1] = uVar21;
      puVar11[-2] = uVar20;
      puVar11[1] = uVar23;
      *puVar11 = uVar22;
      puVar11[3] = uVar25;
      puVar11[2] = uVar24;
      uVar6 = uVar6 - 8;
      puVar13 = puVar13 + 8;
      puVar11 = puVar11 + 8;
    } while (uVar6 != 0);
    in_x16 = in_x16 + uVar10;
    param_1 = param_1 + uVar10;
    if (uVar5 == uVar10) goto code_r0x0009d640;
  }
  do {
    puVar13 = param_1 + 1;
    *param_1 = *in_x16;
    in_x16 = in_x16 + 1;
    param_1 = puVar13;
  } while (puVar13 < puVar7);
code_r0x0009d640:
  psVar16 = (short *)((long)puVar7 + 2);
  *(short *)puVar7 = (short)unaff_w20 - (short)unaff_x19;
  in_x16 = unaff_x24;
  if (unaff_x28 == param_4) goto code_r0x0009d79c;
  do {
    puVar13 = (ulong *)((long)in_x16 + 4);
    puVar11 = (ulong *)((long)unaff_x26 + 4);
    if (puVar13 < unaff_x30) {
      uVar5 = *puVar13 ^ *puVar11;
      if (uVar5 == 0) {
        puVar9 = (ulong *)((long)in_x16 + 0xc);
        puVar11 = (ulong *)((long)unaff_x26 + 0xc);
        if (puVar9 < unaff_x30) goto code_r0x0009d6a0;
        goto code_r0x0009d754;
      }
      uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
      uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
      uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      lVar17 = *(long *)(unaff_x29 + -0x68);
    }
    else {
      puVar9 = puVar13;
      if (puVar13 < unaff_x30) {
code_r0x0009d6a0:
        iVar3 = ((int)puVar9 - (int)in_x16) + -4;
        lVar17 = *(long *)(unaff_x29 + -0x68);
        do {
          uVar5 = *puVar9 ^ *puVar11;
          if (uVar5 != 0) {
            uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
            uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
            uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
            uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
            uVar5 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) + iVar3)
            ;
            goto code_r0x0009d73c;
          }
          puVar9 = puVar9 + 1;
          puVar11 = puVar11 + 1;
          iVar3 = iVar3 + 8;
        } while (puVar9 < unaff_x30);
      }
      else {
code_r0x0009d754:
        lVar17 = *(long *)(unaff_x29 + -0x68);
      }
      if (puVar9 < param_11) {
        if ((int)*puVar11 == (int)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 4);
          puVar11 = (ulong *)((long)puVar11 + 4);
        }
      }
      if (puVar9 < param_10) {
        if ((short)*puVar11 == (short)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 2);
          puVar11 = (ulong *)((long)puVar11 + 2);
        }
      }
      if (puVar9 < in_stack_00000088) {
        if ((char)*puVar11 == (char)*puVar9) {
          puVar9 = (ulong *)((long)puVar9 + 1);
        }
      }
      uVar5 = (ulong)(uint)((int)puVar9 - (int)puVar13);
    }
code_r0x0009d73c:
    in_x16 = (ulong *)((long)in_x16 + uVar5 + 4);
    while( true ) {
      uVar8 = (uint)uVar5;
      if (*(char **)(unaff_x29 + -0x78) <
          (char *)((long)puVar7 + ((ulong)(uVar8 + 0xf0) * (ulong)in_w17 >> 0x27) + 8))
      goto LAB_0009c800;
      uVar15 = uVar8 - 0xf;
      if (uVar8 < 0xf) {
        *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar5;
        unaff_x25 = psVar16;
      }
      else {
        *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
        psVar16[0] = -1;
        psVar16[1] = -1;
        if (0x3fb < uVar15) {
          uVar15 = (uint)((ulong)(uVar8 - 0x40b) * (ulong)in_w17 >> 0x29);
          uVar5 = (ulong)(uVar15 << 2);
          *(ulong **)(unaff_x29 + -0x88) = in_x16;
          _memset((short *)((long)puVar7 + 6),0xff,uVar5 + 4);
          in_x16 = *(ulong **)(unaff_x29 + -0x88);
          in_w17 = 0x80808081;
          lVar17 = *(long *)(unaff_x29 + -0x68);
          param_2 = *(ulong **)(unaff_x29 + -0x60);
          unaff_x22 = -0x30e4432345000000;
          param_3 = *(uint *)(unaff_x29 + -0x80);
          uVar15 = (uVar8 - 0x40b) + uVar15 * -0x3fc;
          psVar16 = (short *)((long)puVar7 + 6 + uVar5);
          unaff_x23 = in_stack_00000060;
          unaff_w27 = in_stack_00000068;
        }
        uVar8 = (uVar15 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)psVar16 + (ulong)uVar8);
        *pcVar1 = (char)uVar15 + (char)uVar8;
        unaff_x25 = (short *)(pcVar1 + 1);
      }
      if (param_8 <= in_x16) goto code_r0x0009c7d0;
      iVar3 = (int)param_6;
      *(int *)(unaff_x21 + ((ulong)(*(long *)((long)in_x16 + -2) * unaff_x22) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)in_x16 + -2) - iVar3;
      uVar5 = *in_x16 * unaff_x22 >> 0x34;
      uVar8 = *(uint *)(unaff_x21 + uVar5 * 4);
      if (uVar8 < param_3) {
        uVar8 = *(uint *)(param_5 + uVar5 * 4);
        unaff_x26 = (ulong *)(unaff_x23 + (ulong)uVar8);
        uVar8 = uVar8 + param_7;
        puVar13 = param_4;
      }
      else {
        unaff_x26 = (ulong *)(param_6 + (ulong)uVar8);
        puVar13 = param_2;
      }
      uVar15 = (int)in_x16 - iVar3;
      *(uint *)(unaff_x21 + uVar5 * 4) = uVar15;
      if ((uVar8 + 0xffff < uVar15) || ((int)*unaff_x26 != (int)*in_x16)) {
        unaff_w20 = (int)(ulong *)((long)in_x16 + 1U) - iVar3;
        lVar17 = *(long *)(unaff_x29 + -0x68);
        if (param_8 < (ulong *)((long)in_x16 + 2U)) goto code_r0x0009c7d0;
        uVar5 = *(ulong *)((long)in_x16 + 1);
        puVar7 = (ulong *)((long)in_x16 + 2U);
        unaff_x24 = (ulong *)((long)in_x16 + 1U);
        uVar15 = in_stack_00000080._4_4_;
        uVar8 = unaff_w27;
        goto code_r0x0009d454;
      }
      puVar7 = (ulong *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = '\0';
      psVar16 = (short *)((long)unaff_x25 + 3);
      *(short *)puVar7 = (short)uVar15 - (short)uVar8;
      unaff_x24 = in_x16;
      if (puVar13 != param_4) break;
code_r0x0009d79c:
      puVar13 = (ulong *)((long)unaff_x24 + (in_stack_00000070 - (long)unaff_x26));
      puVar11 = in_stack_00000088;
      if (puVar13 <= in_stack_00000088) {
        puVar11 = puVar13;
      }
      puVar13 = (ulong *)((long)unaff_x24 + 4);
      puVar9 = (ulong *)((long)unaff_x26 + 4);
      puVar14 = (ulong *)((long)puVar11 - 7);
      if (puVar13 < puVar14) {
        uVar5 = *puVar13 ^ *puVar9;
        if (uVar5 == 0) {
          puVar12 = (ulong *)((long)unaff_x24 + 0xc);
          puVar9 = (ulong *)((long)unaff_x26 + 0xc);
          if (puVar12 < puVar14) goto code_r0x0009d7f8;
          goto code_r0x0009db68;
        }
        uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
        uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
        uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      }
      else {
        puVar12 = puVar13;
        if (puVar13 < puVar14) {
code_r0x0009d7f8:
          iVar3 = ((int)puVar12 - (int)unaff_x24) + -4;
          do {
            uVar5 = *puVar12 ^ *puVar9;
            if (uVar5 != 0) {
              uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
              uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
              uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
              uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
              uVar5 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) +
                                   iVar3);
              in_w17 = 0x80808081;
              goto code_r0x0009d8a8;
            }
            puVar12 = puVar12 + 1;
            puVar9 = puVar9 + 1;
            iVar3 = iVar3 + 8;
          } while (puVar12 < puVar14);
          if ((ulong *)((long)puVar11 - 3U) <= puVar12) goto code_r0x0009db78;
code_r0x0009d834:
          if ((int)*puVar9 == (int)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 4);
            puVar9 = (ulong *)((long)puVar9 + 4);
          }
          if (puVar12 < (ulong *)((long)puVar11 - 1U)) {
code_r0x0009db8c:
            if ((short)*puVar9 == (short)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 2);
              puVar9 = (ulong *)((long)puVar9 + 2);
            }
          }
        }
        else {
code_r0x0009db68:
          if (puVar12 < (ulong *)((long)puVar11 - 3U)) goto code_r0x0009d834;
code_r0x0009db78:
          if (puVar12 < (ulong *)((long)puVar11 - 1U)) goto code_r0x0009db8c;
        }
        if (puVar12 < puVar11) {
          if ((char)*puVar9 == (char)*puVar12) {
            puVar12 = (ulong *)((long)puVar12 + 1);
          }
        }
        in_w17 = 0x80808081;
        uVar5 = (ulong)(uint)((int)puVar12 - (int)puVar13);
      }
code_r0x0009d8a8:
      in_x16 = (ulong *)((long)unaff_x24 + uVar5 + 4);
      if (in_x16 == puVar11) {
        puVar13 = puVar11;
        puVar9 = param_2;
        if (puVar11 < unaff_x30) {
          uVar6 = *puVar11 ^ *param_2;
          if (uVar6 == 0) {
            puVar13 = puVar11 + 1;
            puVar9 = in_stack_00000050;
            goto code_r0x0009d900;
          }
          uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
          uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
          uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
          uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
          uVar8 = (uint)((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3);
          lVar17 = *(long *)(unaff_x29 + -0x68);
        }
        else {
code_r0x0009d900:
          if (puVar13 < unaff_x30) {
            puVar14 = (ulong *)((long)unaff_x24 + (in_stack_00000070 - (long)unaff_x26));
            if (in_stack_00000088 <= puVar14) {
              puVar14 = in_stack_00000088;
            }
            iVar3 = (int)puVar13 - (int)puVar14;
            lVar17 = *(long *)(unaff_x29 + -0x68);
            do {
              uVar6 = *puVar13 ^ *puVar9;
              if (uVar6 != 0) {
                uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
                uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
                uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
                uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
                uVar8 = (int)((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) + iVar3;
                goto LAB_0009d9b8;
              }
              puVar13 = puVar13 + 1;
              puVar9 = puVar9 + 1;
              iVar3 = iVar3 + 8;
            } while (puVar13 < unaff_x30);
          }
          else {
            lVar17 = *(long *)(unaff_x29 + -0x68);
          }
          if (puVar13 < param_11) {
            if (*(int *)puVar9 == *(int *)puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 4);
              puVar9 = (ulong *)((long)puVar9 + 4);
            }
          }
          if (puVar13 < param_10) {
            if ((short)*puVar9 == (short)*puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 2);
              puVar9 = (ulong *)((long)puVar9 + 2);
            }
          }
          if (puVar13 < in_stack_00000088) {
            if ((char)*puVar9 == (char)*puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 1);
            }
          }
          uVar8 = (int)puVar13 - (int)puVar11;
        }
LAB_0009d9b8:
        uVar5 = (ulong)(uVar8 + (int)uVar5);
        in_x16 = (ulong *)((long)puVar11 + (ulong)uVar8);
      }
      else {
        lVar17 = *(long *)(unaff_x29 + -0x68);
      }
    }
  } while( true );
code_r0x0009d454:
  puVar13 = puVar7;
  uVar6 = uVar5 * unaff_x22 >> 0x34;
  uVar2 = *(uint *)(unaff_x21 + uVar6 * 4);
  unaff_x19 = (ulong)uVar2;
  if (uVar2 < param_3) {
    uVar2 = *(uint *)(param_5 + uVar6 * 4);
    unaff_x26 = (ulong *)(unaff_x23 + (ulong)uVar2);
    uVar2 = uVar2 + param_7;
    unaff_x19 = (ulong)uVar2;
    uVar5 = *puVar13;
    *(uint *)(unaff_x21 + uVar6 * 4) = unaff_w20;
    unaff_x28 = param_4;
  }
  else {
    unaff_x26 = (ulong *)(param_6 + unaff_x19);
    uVar5 = *puVar13;
    *(uint *)(unaff_x21 + uVar6 * 4) = unaff_w20;
    unaff_x28 = param_2;
  }
  if ((unaff_w20 <= uVar2 + 0xffff) && ((int)*unaff_x26 == (int)*unaff_x24)) goto code_r0x0009d4b4;
  unaff_w20 = (int)puVar13 - iVar3;
  uVar6 = (ulong)uVar15;
  uVar15 = uVar8 >> 6;
  uVar8 = uVar8 + 1;
  puVar7 = (ulong *)((long)puVar13 + uVar6);
  unaff_x24 = puVar13;
  if (param_8 < (ulong *)((long)puVar13 + uVar6)) {
    lVar17 = *(long *)(unaff_x29 + -0x68);
code_r0x0009c7d0:
    uVar5 = in_stack_00000058 - (long)in_x16;
    if (*(char **)(unaff_x29 + -0x78) <
        (char *)((long)unaff_x25 + (uVar5 + 0xf0) / 0xff + uVar5 + 1)) {
LAB_0009c800:
      in_stack_00000078 = 0;
      uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
    }
    else {
      uVar6 = uVar5 - 0xf;
      if (uVar5 < 0xf) {
        *(char *)unaff_x25 = (char)((int)uVar5 << 4);
        uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
      }
      else {
        psVar16 = (short *)((long)unaff_x25 + 1);
        *(char *)unaff_x25 = -0x10;
        if (0xfe < uVar6) {
          uVar6 = (long)param_2 + (in_stack_00000048 - (long)in_x16) + -0x10e;
          uVar10 = uVar6 / 0xff;
          _memset(psVar16,0xff,uVar10 + 1);
          uVar6 = uVar6 % 0xff;
          psVar16 = (short *)((long)unaff_x25 + uVar10 + 2);
        }
        uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
        *(char *)psVar16 = (char)uVar6;
        unaff_x25 = psVar16;
      }
      _memcpy((char *)((long)unaff_x25 + 1),in_x16,uVar5);
      in_stack_00000078 = ((int)(char *)((long)unaff_x25 + 1) + (int)uVar5) - in_stack_00000078;
      param_2 = *(ulong **)(unaff_x29 + -0x60);
    }
    goto code_r0x0009f8a0;
  }
  goto code_r0x0009d454;
code_r0x0009d4b4:
  if ((unaff_x28 < unaff_x26) && (*(char *)((long)unaff_x24 - 1) == *(char *)((long)unaff_x26 + -1))
     ) {
    puVar7 = (ulong *)((long)unaff_x24 - 1);
    puVar13 = (ulong *)((long)unaff_x26 + -1);
    do {
      unaff_x26 = puVar13;
      unaff_x24 = puVar7;
      if ((unaff_x26 <= unaff_x28) || (unaff_x24 <= in_x16)) break;
      puVar7 = (ulong *)((long)unaff_x24 + -1);
      puVar13 = (ulong *)((long)unaff_x26 + -1);
    } while (*(char *)((long)unaff_x24 + -1) == *(char *)((long)unaff_x26 + -1));
  }
  param_1 = (ulong *)((long)unaff_x25 + 1);
  in_x11 = (long)unaff_x24 - (long)in_x16 & 0xffffffff;
  if (*(char **)(unaff_x29 + -0x78) <
      (char *)((long)param_1 + (in_x11 * in_w17 >> 0x27) + in_x11 + 8)) {
    in_stack_00000078 = 0;
    uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar17 = *(long *)(unaff_x29 + -0x68);
code_r0x0009f8a0:
    *(ulong **)(unaff_x21 + 0x4000) = param_2;
    *(undefined4 *)(lVar17 + 8) = uVar18;
    return in_stack_00000078;
  }
  uVar8 = (uint)((long)unaff_x24 - (long)in_x16);
  in_w8 = uVar8 - 0xf;
  if (0xe < uVar8) goto code_r0x0009d4fc;
  *(char *)unaff_x25 = (char)(uVar8 << 4);
  goto LAB_0009d5ac;
code_r0x0009d4fc:
  *(char *)unaff_x25 = -0x10;
  in_CY = 0xfe < in_w8;
  goto code_r0x0009d508;
}

