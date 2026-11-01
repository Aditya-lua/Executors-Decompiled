
/* WARNING: Type propagation algorithm not settling */

int FUN_0009dbd0(ulong *param_1,int param_2,ulong *param_3,uint param_4,ulong *param_5,long param_6,
                long param_7,int param_8,ulong *param_9,undefined8 param_10,ulong *param_11,
                ulong *param_12)

{
  char *pcVar1;
  uint uVar2;
  undefined1 in_CY;
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
  ulong uVar10;
  ulong *in_x12;
  ulong *in_x13;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  uint in_w17;
  uint uVar15;
  long unaff_x21;
  long unaff_x22;
  ulong uVar16;
  long unaff_x23;
  short *unaff_x25;
  ulong *puVar17;
  long unaff_x26;
  uint unaff_w27;
  undefined4 uVar18;
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
  
code_r0x0009dbd0:
  if ((bool)in_CY) goto joined_r0x0009dbf8;
  do {
    if ((short)*in_x13 == (short)*in_x12) {
      in_x12 = (ulong *)((long)in_x12 + 2);
      in_x13 = (ulong *)((long)in_x13 + 2);
    }
joined_r0x0009dbf8:
    do {
      if (in_x12 < in_stack_00000088) {
        if ((char)*in_x13 == (char)*in_x12) {
          in_x12 = (ulong *)((long)in_x12 + 1);
        }
      }
      uVar10 = (ulong)(uint)((int)in_x12 - (int)in_x10);
code_r0x0009d9b8:
      in_x11 = (ulong)(uint)((int)uVar10 + (int)in_x11);
      puVar14 = (ulong *)((long)in_x10 + uVar10);
code_r0x0009d9c0:
      uVar8 = (uint)in_x11;
      if (*(char **)(unaff_x29 + -0x78) <
          (char *)((long)param_1 + ((ulong)(uVar8 + 0xf0) * (ulong)in_w17 >> 0x27) + 8)) {
code_r0x0009c800:
        in_stack_00000078 = 0;
        uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
code_r0x0009f8a0:
        *(ulong **)(unaff_x21 + 0x4000) = param_3;
        *(undefined4 *)(unaff_x26 + 8) = uVar18;
        return in_stack_00000078;
      }
      uVar15 = uVar8 - 0xf;
      if (uVar8 < 0xf) {
        *(char *)in_x9 = (char)*in_x9 + (char)in_x11;
        in_x9 = unaff_x25;
      }
      else {
        *(char *)in_x9 = (char)*in_x9 + '\x0f';
        unaff_x25[0] = -1;
        unaff_x25[1] = -1;
        if (0x3fb < uVar15) {
          uVar15 = (uint)((ulong)(uVar8 - 0x40b) * (ulong)in_w17 >> 0x29);
          uVar10 = (ulong)(uVar15 << 2);
          *(ulong **)(unaff_x29 + -0x88) = puVar14;
          _memset((short *)((long)param_1 + 6),0xff,uVar10 + 4);
          puVar14 = *(ulong **)(unaff_x29 + -0x88);
          in_w17 = 0x80808081;
          param_2 = 0xffff;
          unaff_x26 = *(long *)(unaff_x29 + -0x68);
          param_3 = *(ulong **)(unaff_x29 + -0x60);
          unaff_x22 = -0x30e4432345000000;
          param_4 = *(uint *)(unaff_x29 + -0x80);
          uVar15 = (uVar8 - 0x40b) + uVar15 * -0x3fc;
          unaff_x25 = (short *)((long)param_1 + 6 + uVar10);
          unaff_x23 = in_stack_00000060;
          unaff_w27 = in_stack_00000068;
        }
        uVar8 = (uVar15 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)unaff_x25 + (ulong)uVar8);
        *pcVar1 = (char)uVar15 + (char)uVar8;
        in_x9 = (short *)(pcVar1 + 1);
      }
      if (param_9 <= puVar14) {
code_r0x0009c7d0:
        uVar10 = in_stack_00000058 - (long)puVar14;
        if ((char *)((long)in_x9 + (uVar10 + 0xf0) / 0xff + uVar10 + 1) <=
            *(char **)(unaff_x29 + -0x78)) {
          uVar7 = uVar10 - 0xf;
          if (uVar10 < 0xf) {
            *(char *)in_x9 = (char)((int)uVar10 << 4);
            uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
          }
          else {
            psVar4 = (short *)((long)in_x9 + 1);
            *(char *)in_x9 = -0x10;
            if (0xfe < uVar7) {
              uVar7 = (long)param_3 + (in_stack_00000048 - (long)puVar14) + -0x10e;
              uVar16 = uVar7 / 0xff;
              _memset(psVar4,0xff,uVar16 + 1);
              uVar7 = uVar7 % 0xff;
              psVar4 = (short *)((long)in_x9 + uVar16 + 2);
            }
            uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
            *(char *)psVar4 = (char)uVar7;
            in_x9 = psVar4;
          }
          _memcpy((char *)((long)in_x9 + 1),puVar14,uVar10);
          in_stack_00000078 = ((int)(char *)((long)in_x9 + 1) + (int)uVar10) - in_stack_00000078;
          param_3 = *(ulong **)(unaff_x29 + -0x60);
          goto code_r0x0009f8a0;
        }
        goto code_r0x0009c800;
      }
      iVar5 = (int)param_7;
      *(int *)(unaff_x21 + ((ulong)(*(long *)((long)puVar14 + -2) * unaff_x22) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar14 + -2) - iVar5;
      uVar10 = *puVar14 * unaff_x22 >> 0x34;
      uVar8 = *(uint *)(unaff_x21 + uVar10 * 4);
      if (uVar8 < param_4) {
        uVar8 = *(uint *)(param_6 + uVar10 * 4);
        puVar17 = (ulong *)(unaff_x23 + (ulong)uVar8);
        uVar8 = uVar8 + param_8;
        puVar9 = param_5;
      }
      else {
        puVar17 = (ulong *)(param_7 + (ulong)uVar8);
        puVar9 = param_3;
      }
      uVar15 = (int)puVar14 - iVar5;
      *(uint *)(unaff_x21 + uVar10 * 4) = uVar15;
      if ((uVar8 + param_2 < uVar15) || ((int)*puVar17 != (int)*puVar14)) {
        uVar8 = (int)(ulong *)((long)puVar14 + 1U) - iVar5;
        unaff_x26 = *(long *)(unaff_x29 + -0x68);
        if (param_9 < (ulong *)((long)puVar14 + 2U)) goto code_r0x0009c7d0;
        uVar10 = *(ulong *)((long)puVar14 + 1);
        puVar17 = (ulong *)((long)puVar14 + 2U);
        puVar13 = (ulong *)((long)puVar14 + 1U);
        uVar6 = in_stack_00000080._4_4_;
        uVar15 = unaff_w27;
        while( true ) {
          puVar12 = puVar17;
          uVar7 = uVar10 * unaff_x22 >> 0x34;
          uVar2 = *(uint *)(unaff_x21 + uVar7 * 4);
          if (uVar2 < param_4) {
            uVar2 = *(uint *)(param_6 + uVar7 * 4);
            puVar17 = (ulong *)(unaff_x23 + (ulong)uVar2);
            uVar2 = uVar2 + param_8;
            uVar10 = *puVar12;
            *(uint *)(unaff_x21 + uVar7 * 4) = uVar8;
            puVar9 = param_5;
          }
          else {
            puVar17 = (ulong *)(param_7 + (ulong)uVar2);
            uVar10 = *puVar12;
            *(uint *)(unaff_x21 + uVar7 * 4) = uVar8;
            puVar9 = param_3;
          }
          if ((uVar8 <= uVar2 + param_2) && ((int)*puVar17 == (int)*puVar13)) break;
          uVar8 = (int)puVar12 - iVar5;
          uVar7 = (ulong)uVar6;
          uVar6 = uVar15 >> 6;
          uVar15 = uVar15 + 1;
          puVar17 = (ulong *)((long)puVar12 + uVar7);
          puVar13 = puVar12;
          if (param_9 < (ulong *)((long)puVar12 + uVar7)) {
            unaff_x26 = *(long *)(unaff_x29 + -0x68);
            goto code_r0x0009c7d0;
          }
        }
        if ((puVar9 < puVar17) && (*(char *)((long)puVar13 - 1) == *(char *)((long)puVar17 + -1))) {
          puVar12 = (ulong *)((long)puVar13 - 1);
          puVar3 = (ulong *)((long)puVar17 + -1);
          do {
            puVar17 = puVar3;
            puVar13 = puVar12;
            if ((puVar17 <= puVar9) || (puVar13 <= puVar14)) break;
            puVar12 = (ulong *)((long)puVar13 + -1);
            puVar3 = (ulong *)((long)puVar17 + -1);
          } while (*(char *)((long)puVar13 + -1) == *(char *)((long)puVar17 + -1));
        }
        puVar12 = (ulong *)((long)in_x9 + 1);
        uVar10 = (long)puVar13 - (long)puVar14 & 0xffffffff;
        if (*(char **)(unaff_x29 + -0x78) <
            (char *)((long)puVar12 + (uVar10 * in_w17 >> 0x27) + uVar10 + 8)) {
          in_stack_00000078 = 0;
          uVar18 = *(undefined4 *)(unaff_x29 + -0x70);
          unaff_x26 = *(long *)(unaff_x29 + -0x68);
          goto code_r0x0009f8a0;
        }
        uVar6 = (uint)((long)puVar13 - (long)puVar14);
        uVar15 = uVar6 - 0xf;
        if (uVar6 < 0xf) {
          *(char *)in_x9 = (char)(uVar6 << 4);
        }
        else {
          *(char *)in_x9 = -0x10;
          puVar3 = puVar12;
          if (0xfe < uVar15) {
            uVar15 = ((int)puVar13 - (int)puVar14) - 0x10e;
            uVar7 = (ulong)uVar15 * (ulong)in_w17;
            uVar16 = uVar7 >> 0x27;
            *(ulong **)(unaff_x29 + -0x88) = puVar14;
            _memset(puVar12,0xff,uVar16 + 1);
            puVar14 = *(ulong **)(unaff_x29 + -0x88);
            in_w17 = 0x80808081;
            unaff_x22 = -0x30e4432345000000;
            param_4 = *(uint *)(unaff_x29 + -0x80);
            param_3 = *(ulong **)(unaff_x29 + -0x60);
            uVar15 = uVar15 + (uint)(uVar7 >> 0x27);
            puVar3 = (ulong *)((long)in_x9 + uVar16 + 2);
            unaff_w27 = in_stack_00000068;
          }
          puVar12 = (ulong *)((long)puVar3 + 1);
          *(char *)puVar3 = (char)uVar15;
        }
        param_1 = (ulong *)((long)puVar12 + uVar10);
        puVar3 = param_1;
        if (param_1 <= puVar12 + 1) {
          puVar3 = puVar12 + 1;
        }
        if (((char *)((long)puVar3 + ~(ulong)puVar12) < &segment_command_00000020.vmaddr) ||
           ((ulong)((long)puVar12 - (long)puVar14) < 0x40)) {
code_r0x0009d630:
          do {
            puVar3 = puVar12 + 1;
            *puVar12 = *puVar14;
            puVar14 = puVar14 + 1;
            puVar12 = puVar3;
          } while (puVar3 < param_1);
        }
        else {
          uVar10 = ((long)puVar3 + ~(ulong)puVar12 >> 3) + 1;
          uVar16 = uVar10 & 0x3ffffffffffffff8;
          puVar3 = puVar14 + 4;
          puVar11 = puVar12 + 4;
          uVar7 = uVar16;
          do {
            uVar19 = puVar3[-4];
            uVar21 = puVar3[-1];
            uVar20 = puVar3[-2];
            uVar23 = puVar3[1];
            uVar22 = *puVar3;
            uVar25 = puVar3[3];
            uVar24 = puVar3[2];
            puVar11[-3] = puVar3[-3];
            puVar11[-4] = uVar19;
            puVar11[-1] = uVar21;
            puVar11[-2] = uVar20;
            puVar11[1] = uVar23;
            *puVar11 = uVar22;
            puVar11[3] = uVar25;
            puVar11[2] = uVar24;
            uVar7 = uVar7 - 8;
            puVar3 = puVar3 + 8;
            puVar11 = puVar11 + 8;
          } while (uVar7 != 0);
          puVar14 = puVar14 + uVar16;
          puVar12 = puVar12 + uVar16;
          if (uVar10 != uVar16) goto code_r0x0009d630;
        }
        param_2 = 0xffff;
        unaff_x25 = (short *)((long)param_1 + 2);
        *(short *)param_1 = (short)uVar8 - (short)uVar2;
      }
      else {
        param_1 = (ulong *)((long)in_x9 + 1);
        *(char *)in_x9 = '\0';
        unaff_x25 = (short *)((long)in_x9 + 3);
        *(short *)param_1 = (short)uVar15 - (short)uVar8;
        puVar13 = puVar14;
      }
      if (puVar9 != param_5) {
        puVar14 = (ulong *)((long)puVar13 + 4);
        puVar9 = (ulong *)((long)puVar17 + 4);
        if (puVar14 < unaff_x30) {
          uVar10 = *puVar14 ^ *puVar9;
          if (uVar10 == 0) {
            puVar12 = (ulong *)((long)puVar13 + 0xc);
            puVar9 = (ulong *)((long)puVar17 + 0xc);
            if (puVar12 < unaff_x30) goto code_r0x0009d6a0;
            goto code_r0x0009d754;
          }
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          in_x11 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
          unaff_x26 = *(long *)(unaff_x29 + -0x68);
        }
        else {
          puVar12 = puVar14;
          if (puVar14 < unaff_x30) {
code_r0x0009d6a0:
            iVar5 = ((int)puVar12 - (int)puVar13) + -4;
            unaff_x26 = *(long *)(unaff_x29 + -0x68);
            do {
              uVar10 = *puVar12 ^ *puVar9;
              if (uVar10 != 0) {
                uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
                uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
                uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
                uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
                in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) +
                                      iVar5);
                goto code_r0x0009d73c;
              }
              puVar12 = puVar12 + 1;
              puVar9 = puVar9 + 1;
              iVar5 = iVar5 + 8;
            } while (puVar12 < unaff_x30);
          }
          else {
code_r0x0009d754:
            unaff_x26 = *(long *)(unaff_x29 + -0x68);
          }
          if (puVar12 < param_12) {
            if ((int)*puVar9 == (int)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 4);
              puVar9 = (ulong *)((long)puVar9 + 4);
            }
          }
          if (puVar12 < param_11) {
            if ((short)*puVar9 == (short)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 2);
              puVar9 = (ulong *)((long)puVar9 + 2);
            }
          }
          else {
          }
          if (puVar12 < in_stack_00000088) {
            if ((char)*puVar9 == (char)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 1);
            }
          }
          in_x11 = (ulong)(uint)((int)puVar12 - (int)puVar14);
        }
code_r0x0009d73c:
        puVar14 = (ulong *)((long)puVar13 + in_x11 + 4);
        goto code_r0x0009d9c0;
      }
      puVar14 = (ulong *)((long)puVar13 + (in_stack_00000070 - (long)puVar17));
      in_x10 = in_stack_00000088;
      if (puVar14 <= in_stack_00000088) {
        in_x10 = puVar14;
      }
      puVar14 = (ulong *)((long)puVar13 + 4);
      puVar9 = (ulong *)((long)puVar17 + 4);
      puVar12 = (ulong *)((long)in_x10 - 7);
      if (puVar14 < puVar12) {
        uVar10 = *puVar14 ^ *puVar9;
        if (uVar10 == 0) {
          puVar3 = (ulong *)((long)puVar13 + 0xc);
          puVar9 = (ulong *)((long)puVar17 + 0xc);
          if (puVar3 < puVar12) goto code_r0x0009d7f8;
          goto code_r0x0009db68;
        }
        uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        in_x11 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
      }
      else {
        puVar3 = puVar14;
        if (puVar14 < puVar12) {
code_r0x0009d7f8:
          iVar5 = ((int)puVar3 - (int)puVar13) + -4;
          do {
            uVar10 = *puVar3 ^ *puVar9;
            if (uVar10 != 0) {
              uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
              uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
              uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
              uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
              in_x11 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) +
                                    iVar5);
              in_w17 = 0x80808081;
              goto code_r0x0009d8a8;
            }
            puVar3 = puVar3 + 1;
            puVar9 = puVar9 + 1;
            iVar5 = iVar5 + 8;
          } while (puVar3 < puVar12);
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
        in_x11 = (ulong)(uint)((int)puVar3 - (int)puVar14);
      }
code_r0x0009d8a8:
      puVar14 = (ulong *)((long)puVar13 + in_x11 + 4);
      if (puVar14 != in_x10) {
        unaff_x26 = *(long *)(unaff_x29 + -0x68);
        goto code_r0x0009d9c0;
      }
      in_x12 = in_x10;
      in_x13 = param_3;
      if (in_x10 < unaff_x30) {
        uVar10 = *in_x10 ^ *param_3;
        if (uVar10 == 0) {
          in_x12 = in_x10 + 1;
          in_x13 = in_stack_00000050;
          goto code_r0x0009d900;
        }
        uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
        unaff_x26 = *(long *)(unaff_x29 + -0x68);
        goto code_r0x0009d9b8;
      }
code_r0x0009d900:
      if (in_x12 < unaff_x30) {
        puVar13 = (ulong *)((long)puVar13 + (in_stack_00000070 - (long)puVar17));
        if (in_stack_00000088 <= puVar13) {
          puVar13 = in_stack_00000088;
        }
        iVar5 = (int)in_x12 - (int)puVar13;
        unaff_x26 = *(long *)(unaff_x29 + -0x68);
        while (uVar10 = *in_x12 ^ *in_x13, uVar10 == 0) {
          in_x12 = in_x12 + 1;
          in_x13 = in_x13 + 1;
          iVar5 = iVar5 + 8;
          if (unaff_x30 <= in_x12) {
            if (in_x12 < param_12) goto code_r0x0009d958;
            goto code_r0x0009dbc8;
          }
        }
        uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) + iVar5);
        goto code_r0x0009d9b8;
      }
      unaff_x26 = *(long *)(unaff_x29 + -0x68);
      if (param_12 <= in_x12) goto code_r0x0009dbc8;
code_r0x0009d958:
      if ((int)*in_x13 == (int)*in_x12) {
        in_x12 = (ulong *)((long)in_x12 + 4);
        in_x13 = (ulong *)((long)in_x13 + 4);
      }
    } while (param_11 <= in_x12);
  } while( true );
code_r0x0009dbc8:
  in_CY = param_11 <= in_x12;
  goto code_r0x0009dbd0;
}

