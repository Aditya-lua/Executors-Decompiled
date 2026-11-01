
/* WARNING: Type propagation algorithm not settling */

int FUN_0009c530(ulong param_1,undefined8 param_2,ulong *param_3,uint param_4)

{
  char *pcVar1;
  uint uVar2;
  int *piVar3;
  int iVar4;
  ulong *puVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong *puVar8;
  long lVar9;
  char *pcVar10;
  ulong *puVar11;
  long lVar12;
  ulong *puVar13;
  ulong *puVar14;
  long *plVar15;
  ulong *puVar16;
  uint uVar17;
  ulong *in_x9;
  ulong uVar18;
  ulong *puVar19;
  ulong uVar20;
  ulong *puVar21;
  uint uVar22;
  ulong *puVar23;
  ulong *puVar24;
  int iVar25;
  int iVar26;
  ulong uVar27;
  ulong *puVar28;
  ulong *puVar29;
  uint uVar30;
  uint uVar31;
  ulong uVar32;
  int *piVar33;
  long unaff_x21;
  int unaff_w24;
  int iVar34;
  long lVar35;
  short *unaff_x25;
  ulong *puVar36;
  uint *unaff_x26;
  short *psVar37;
  uint unaff_w27;
  long lVar38;
  uint unaff_w28;
  long unaff_x29;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  uint uStack0000000000000084;
  
  puVar8 = (ulong *)((long)in_x9 - param_1);
  *(ulong **)(unaff_x21 + 0x4000) = puVar8;
  *(ulong **)(unaff_x29 + -0x60) = param_3;
  uVar22 = (uint)param_1;
  iVar4 = (int)unaff_x25;
  uStack0000000000000084 = unaff_w28;
  if (in_x9 == param_3) {
    puVar7 = param_3;
    puVar8 = param_3;
    if (((param_1 & 0xffff0000) == 0) && (uVar22 < param_4)) {
      if (0x7e000000 < unaff_w27) {
        return 0;
      }
      if (unaff_w27 == 0) goto LAB_0009d2dc;
      uVar27 = (ulong)unaff_w27;
      *(ulong *)(unaff_x29 + -0x78) = (long)param_3 + uVar27;
      pcVar10 = (char *)((long)unaff_x25 + (long)unaff_w24);
      unaff_x26[2] = uVar22 + unaff_w27;
      *unaff_x26 = param_4 + unaff_w27;
      unaff_x26[1] = 2;
      if (0xc < unaff_w27) {
        lVar35 = (long)param_3 - (ulong)param_4;
        lVar9 = *(long *)(unaff_x29 + -0x78);
        puVar13 = (ulong *)(lVar9 + -0xb);
        *(ulong *)(unaff_x29 + -0x88) = (long)param_3 - (param_1 & 0xffffffff);
        puVar11 = (ulong *)((long)param_3 + 2);
        *(uint *)(unaff_x21 + (*param_3 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = param_4;
        uVar31 = unaff_w28 << 6 | 1;
        puVar21 = (ulong *)(lVar9 + -0xc);
        *(char **)(unaff_x29 + -0x70) = pcVar10;
        *(uint *)(unaff_x29 + -0x80) = uVar31;
code_r0x0009dd48:
        uVar18 = *(ulong *)((long)puVar8 + 1U);
        puVar16 = (ulong *)((long)puVar8 + 1U);
        uVar30 = uStack0000000000000084;
        while( true ) {
          uVar32 = uVar18 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar17 = *(uint *)(unaff_x21 + uVar32);
          uVar20 = (ulong)uVar17;
          iVar34 = (int)lVar35;
          uVar2 = (int)puVar16 - iVar34;
          uVar18 = *puVar11;
          *(uint *)(unaff_x21 + uVar32) = uVar2;
          if ((param_4 - uVar22 <= uVar17 && uVar2 <= uVar17 + 0xffff) &&
             (*(int *)(lVar35 + uVar20) == (int)*puVar16)) break;
          puVar29 = (ulong *)((long)puVar11 + (ulong)uVar30);
          uVar30 = uVar31 >> 6;
          uVar31 = uVar31 + 1;
          puVar16 = puVar11;
          puVar11 = puVar29;
          if (puVar13 < puVar29) goto code_r0x0009c5e0;
        }
        piVar33 = (int *)(lVar35 + uVar20);
        if ((*(int **)(unaff_x29 + -0x88) < piVar33) &&
           (*(char *)((long)puVar16 - 1) == *(char *)((long)piVar33 - 1))) {
          piVar3 = (int *)((long)param_3 + uVar20 + ~(ulong)param_4);
          puVar29 = (ulong *)((long)puVar16 - 1U);
          puVar19 = (ulong *)((long)puVar16 - 1U);
          do {
            puVar11 = puVar19;
            puVar16 = puVar29;
            piVar33 = piVar3;
            if ((piVar33 <= *(int **)(unaff_x29 + -0x88)) || (puVar16 <= puVar8)) break;
            piVar3 = (int *)((long)piVar33 + -1);
            puVar29 = (ulong *)((long)puVar16 + -1);
            puVar19 = (ulong *)((long)puVar11 - 1);
          } while (*(char *)((long)puVar16 + -1) == *(char *)((long)piVar33 + -1));
        }
        else {
          puVar11 = puVar16;
        }
        puVar29 = (ulong *)((long)unaff_x25 + 1);
        uVar18 = (long)puVar11 - (long)puVar8 & 0xffffffff;
        if (pcVar10 < (char *)((long)puVar29 + uVar18 / 0xff + uVar18 + 8)) {
          return 0;
        }
        uVar30 = (uint)((long)puVar11 - (long)puVar8);
        uVar31 = uVar30 - 0xf;
        if (uVar30 < 0xf) {
          *(char *)unaff_x25 = (char)(uVar30 << 4);
        }
        else {
          *(char *)unaff_x25 = -0x10;
          puVar19 = puVar29;
          if (0xfe < uVar31) {
            uVar30 = ((int)puVar11 - (int)puVar8) - 0x10e;
            *(ulong **)(unaff_x29 + -0x68) = puVar16;
            _memset(puVar29,0xff,(ulong)uVar30 / 0xff + 1);
            puVar16 = *(ulong **)(unaff_x29 + -0x68);
            puVar7 = *(ulong **)(unaff_x29 + -0x60);
            uVar31 = uVar30 + uVar30 / 0xff;
            puVar19 = (ulong *)((long)unaff_x25 + (ulong)uVar30 / 0xff + 2);
          }
          puVar29 = (ulong *)((long)puVar19 + 1);
          *(char *)puVar19 = (char)uVar31;
        }
        puVar11 = (ulong *)((long)puVar29 + uVar18);
        puVar19 = puVar11;
        if (puVar11 <= puVar29 + 1) {
          puVar19 = puVar29 + 1;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar19 + ~(ulong)puVar29)) &&
           (0x3f < (ulong)((long)puVar29 - (long)puVar8))) {
          uVar18 = ((long)puVar19 + ~(ulong)puVar29 >> 3) + 1;
          uVar32 = uVar18 & 0x3ffffffffffffff8;
          puVar19 = puVar8 + 4;
          puVar23 = puVar29 + 4;
          uVar20 = uVar32;
          do {
            uVar39 = puVar19[-4];
            uVar41 = puVar19[-1];
            uVar40 = puVar19[-2];
            uVar43 = puVar19[1];
            uVar42 = *puVar19;
            uVar45 = puVar19[3];
            uVar44 = puVar19[2];
            puVar23[-3] = puVar19[-3];
            puVar23[-4] = uVar39;
            puVar23[-1] = uVar41;
            puVar23[-2] = uVar40;
            puVar23[1] = uVar43;
            *puVar23 = uVar42;
            puVar23[3] = uVar45;
            puVar23[2] = uVar44;
            uVar20 = uVar20 - 8;
            puVar19 = puVar19 + 8;
            puVar23 = puVar23 + 8;
          } while (uVar20 != 0);
          puVar8 = puVar8 + uVar32;
          puVar29 = puVar29 + uVar32;
          if (uVar18 == uVar32) goto code_r0x0009df0c;
        }
        do {
          puVar19 = puVar29 + 1;
          *puVar29 = *puVar8;
          puVar8 = puVar8 + 1;
          puVar29 = puVar19;
        } while (puVar19 < puVar11);
code_r0x0009df0c:
        do {
          psVar37 = (short *)((long)puVar11 + 2);
          *(short *)puVar11 = (short)puVar16 - (short)piVar33;
          puVar8 = (ulong *)((long)puVar16 + 4);
          puVar19 = (ulong *)(piVar33 + 1);
          puVar29 = puVar8;
          if (puVar8 < puVar21) {
            uVar18 = *puVar8 ^ *puVar19;
            if (uVar18 == 0) {
              puVar19 = (ulong *)(piVar33 + 3);
              puVar29 = (ulong *)((long)puVar16 + 0xc);
              goto joined_r0x0009e178;
            }
            uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
            uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
            uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
            uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
            uVar31 = (uint)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
          }
          else {
joined_r0x0009e178:
            if (puVar29 < puVar21) {
              iVar25 = ((int)puVar29 - (int)puVar16) + -4;
              do {
                uVar18 = *puVar29 ^ *puVar19;
                if (uVar18 != 0) {
                  uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
                  uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
                  uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
                  uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10
                  ;
                  uVar31 = (int)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) + iVar25;
                  goto code_r0x0009dff8;
                }
                puVar29 = puVar29 + 1;
                puVar19 = puVar19 + 1;
                iVar25 = iVar25 + 8;
              } while (puVar29 < puVar21);
            }
            if (puVar29 < (ulong *)(lVar9 + -8)) {
              if ((int)*puVar19 == (int)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 4);
                puVar19 = (ulong *)((long)puVar19 + 4);
              }
            }
            if (puVar29 < (ulong *)(lVar9 + -6)) {
              if ((short)*puVar19 == (short)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 2);
                puVar19 = (ulong *)((long)puVar19 + 2);
              }
            }
            if (puVar29 < (ulong *)(lVar9 + -5)) {
              if ((char)*puVar19 == (char)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 1);
              }
            }
            uVar31 = (int)puVar29 - (int)puVar8;
          }
code_r0x0009dff8:
          if (pcVar10 < (char *)((long)puVar11 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar30 = uVar31 - 0xf;
          if (uVar31 < 0xf) {
            *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar31;
            unaff_x25 = psVar37;
          }
          else {
            *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
            psVar37[0] = -1;
            psVar37[1] = -1;
            if (0x3fb < uVar30) {
              *(short **)(unaff_x29 + -0x68) = (short *)((long)puVar11 + 6);
              uVar18 = (ulong)((uVar31 - 0x40b) / 0x3fc << 2);
              _memset((short *)((long)puVar11 + 6),0xff,uVar18 + 4);
              uVar30 = (uVar31 - 0x40b) % 0x3fc;
              pcVar10 = *(char **)(unaff_x29 + -0x70);
              puVar7 = *(ulong **)(unaff_x29 + -0x60);
              psVar37 = (short *)(*(long *)(unaff_x29 + -0x68) + uVar18);
            }
            uVar17 = (uVar30 & 0xffff) / 0xff;
            pcVar1 = (char *)((long)psVar37 + (ulong)uVar17);
            *pcVar1 = (char)uVar30 + (char)uVar17;
            unaff_x25 = (short *)(pcVar1 + 1);
          }
          puVar8 = (ulong *)((long)puVar16 + (ulong)uVar31 + 4);
          if (puVar13 <= puVar8) break;
          plVar15 = (long *)((long)puVar16 + (ulong)uVar31 + 2);
          *(int *)(unaff_x21 + ((ulong)(*plVar15 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar15 - iVar34;
          uVar18 = *puVar8 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar30 = *(uint *)(unaff_x21 + uVar18);
          uVar17 = (int)puVar8 - iVar34;
          *(uint *)(unaff_x21 + uVar18) = uVar17;
          if ((uVar30 < param_4 - uVar22 || uVar30 + 0xffff < uVar17) ||
             (piVar33 = (int *)(lVar35 + (ulong)uVar30), *piVar33 != (int)*puVar8))
          goto code_r0x0009dd38;
          puVar11 = (ulong *)((long)unaff_x25 + 1);
          *(char *)unaff_x25 = '\0';
          puVar16 = puVar8;
        } while( true );
      }
code_r0x0009c5e0:
      uVar18 = *(long *)(unaff_x29 + -0x78) - (long)puVar8;
      if (pcVar10 < (char *)((long)unaff_x25 + (uVar18 + 0xf0) / 0xff + uVar18 + 1)) {
        return 0;
      }
      uVar20 = uVar18 - 0xf;
      if (uVar18 < 0xf) goto LAB_0009e6e0;
      psVar37 = (short *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = -0x10;
      if (0xfe < uVar20) goto LAB_0009c8a8;
    }
    else {
      if (0x7e000000 < unaff_w27) {
        return 0;
      }
      if (unaff_w27 == 0) {
LAB_0009d2dc:
        if (unaff_w24 < 1) {
          return 0;
        }
        *(char *)unaff_x25 = '\0';
        return 1;
      }
      *(ulong *)(unaff_x29 + -0x88) = (ulong)unaff_w27;
      *(ulong *)(unaff_x29 + -0x70) = (long)param_3 + (ulong)unaff_w27;
      pcVar10 = (char *)((long)unaff_x25 + (long)unaff_w24);
      unaff_x26[2] = uVar22 + unaff_w27;
      *unaff_x26 = param_4 + unaff_w27;
      unaff_x26[1] = 2;
      if (0xc < unaff_w27) {
        lVar35 = (long)param_3 - (ulong)param_4;
        lVar9 = *(long *)(unaff_x29 + -0x70);
        puVar13 = (ulong *)(lVar9 + -0xb);
        *(ulong *)(unaff_x29 + -0x78) = (long)param_3 - (param_1 & 0xffffffff);
        puVar11 = (ulong *)((long)param_3 + 2);
        *(uint *)(unaff_x21 + (*param_3 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = param_4;
        uVar22 = unaff_w28 << 6 | 1;
        puVar21 = (ulong *)(lVar9 + -0xc);
        *(ulong **)(unaff_x29 + -0x68) = puVar13;
        *(uint *)(unaff_x29 + -0x80) = uVar22;
code_r0x0009e26c:
        uVar18 = *(ulong *)((long)puVar8 + 1U);
        puVar16 = (ulong *)((long)puVar8 + 1U);
        uVar31 = uStack0000000000000084;
        while( true ) {
          uVar27 = uVar18 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar30 = *(uint *)(unaff_x21 + uVar27);
          uVar20 = (ulong)uVar30;
          iVar34 = (int)lVar35;
          uVar17 = (int)puVar16 - iVar34;
          uVar18 = *puVar11;
          *(uint *)(unaff_x21 + uVar27) = uVar17;
          if ((uVar17 <= uVar30 + 0xffff) && (*(int *)(lVar35 + uVar20) == (int)*puVar16)) break;
          puVar29 = (ulong *)((long)puVar11 + (ulong)uVar31);
          uVar31 = uVar22 >> 6;
          uVar22 = uVar22 + 1;
          puVar16 = puVar11;
          puVar11 = puVar29;
          if (puVar13 < puVar29) goto LAB_0009c85c;
        }
        piVar33 = (int *)(lVar35 + uVar20);
        if ((*(int **)(unaff_x29 + -0x78) < piVar33) &&
           (*(char *)((long)puVar16 - 1) == *(char *)((long)piVar33 - 1))) {
          piVar3 = (int *)((long)param_3 + uVar20 + ~(ulong)param_4);
          puVar29 = (ulong *)((long)puVar16 - 1U);
          puVar19 = (ulong *)((long)puVar16 - 1U);
          do {
            puVar16 = puVar19;
            puVar11 = puVar29;
            piVar33 = piVar3;
            if ((piVar33 <= *(int **)(unaff_x29 + -0x78)) || (puVar11 <= puVar8)) break;
            piVar3 = (int *)((long)piVar33 + -1);
            puVar29 = (ulong *)((long)puVar11 + -1);
            puVar19 = (ulong *)((long)puVar16 - 1);
          } while (*(char *)((long)puVar11 + -1) == *(char *)((long)piVar33 + -1));
        }
        else {
          puVar11 = puVar16;
        }
        puVar29 = (ulong *)((long)unaff_x25 + 1);
        uVar18 = (long)puVar16 - (long)puVar8 & 0xffffffff;
        if (pcVar10 < (char *)((long)puVar29 + uVar18 / 0xff + uVar18 + 8)) {
          return 0;
        }
        uVar31 = (uint)((long)puVar16 - (long)puVar8);
        uVar22 = uVar31 - 0xf;
        if (uVar31 < 0xf) {
          *(char *)unaff_x25 = (char)(uVar31 << 4);
        }
        else {
          *(char *)unaff_x25 = -0x10;
          puVar19 = puVar29;
          if (0xfe < uVar22) {
            uVar22 = ((int)puVar16 - (int)puVar8) - 0x10e;
            uVar20 = (ulong)uVar22 / 0xff;
            _memset(puVar29,0xff,uVar20 + 1);
            puVar7 = *(ulong **)(unaff_x29 + -0x60);
            uVar22 = uVar22 + (int)uVar20;
            puVar19 = (ulong *)((long)unaff_x25 + uVar20 + 2);
          }
          puVar29 = (ulong *)((long)puVar19 + 1);
          *(char *)puVar19 = (char)uVar22;
        }
        puVar16 = (ulong *)((long)puVar29 + uVar18);
        puVar19 = puVar16;
        if (puVar16 <= puVar29 + 1) {
          puVar19 = puVar29 + 1;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar19 + ~(ulong)puVar29)) &&
           (0x3f < (ulong)((long)puVar29 - (long)puVar8))) {
          uVar18 = ((long)puVar19 + ~(ulong)puVar29 >> 3) + 1;
          uVar27 = uVar18 & 0x3ffffffffffffff8;
          puVar19 = puVar8 + 4;
          puVar23 = puVar29 + 4;
          uVar20 = uVar27;
          do {
            uVar32 = puVar19[-4];
            uVar40 = puVar19[-1];
            uVar39 = puVar19[-2];
            uVar42 = puVar19[1];
            uVar41 = *puVar19;
            uVar44 = puVar19[3];
            uVar43 = puVar19[2];
            puVar23[-3] = puVar19[-3];
            puVar23[-4] = uVar32;
            puVar23[-1] = uVar40;
            puVar23[-2] = uVar39;
            puVar23[1] = uVar42;
            *puVar23 = uVar41;
            puVar23[3] = uVar44;
            puVar23[2] = uVar43;
            uVar20 = uVar20 - 8;
            puVar19 = puVar19 + 8;
            puVar23 = puVar23 + 8;
          } while (uVar20 != 0);
          puVar8 = puVar8 + uVar27;
          puVar29 = puVar29 + uVar27;
          if (uVar18 == uVar27) goto code_r0x0009e424;
        }
        do {
          puVar19 = puVar29 + 1;
          *puVar29 = *puVar8;
          puVar8 = puVar8 + 1;
          puVar29 = puVar19;
        } while (puVar19 < puVar16);
code_r0x0009e424:
        do {
          psVar37 = (short *)((long)puVar16 + 2);
          *(short *)puVar16 = (short)puVar11 - (short)piVar33;
          puVar8 = (ulong *)((long)puVar11 + 4);
          puVar19 = (ulong *)(piVar33 + 1);
          puVar29 = puVar8;
          if (puVar8 < puVar21) {
            uVar18 = *puVar8 ^ *puVar19;
            if (uVar18 == 0) {
              puVar19 = (ulong *)(piVar33 + 3);
              puVar29 = (ulong *)((long)puVar11 + 0xc);
              goto joined_r0x0009e680;
            }
            uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
            uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
            uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
            uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
            uVar22 = (uint)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
          }
          else {
joined_r0x0009e680:
            if (puVar29 < puVar21) {
              iVar25 = ((int)puVar29 - (int)puVar11) + -4;
              do {
                uVar18 = *puVar29 ^ *puVar19;
                if (uVar18 != 0) {
                  uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
                  uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
                  uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
                  uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10
                  ;
                  uVar22 = (int)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) + iVar25;
                  goto code_r0x0009e510;
                }
                puVar29 = puVar29 + 1;
                puVar19 = puVar19 + 1;
                iVar25 = iVar25 + 8;
              } while (puVar29 < puVar21);
            }
            if (puVar29 < (ulong *)(lVar9 + -8)) {
              if ((int)*puVar19 == (int)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 4);
                puVar19 = (ulong *)((long)puVar19 + 4);
              }
            }
            if (puVar29 < (ulong *)(lVar9 + -6)) {
              if ((short)*puVar19 == (short)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 2);
                puVar19 = (ulong *)((long)puVar19 + 2);
              }
            }
            if (puVar29 < (ulong *)(lVar9 + -5)) {
              if ((char)*puVar19 == (char)*puVar29) {
                puVar29 = (ulong *)((long)puVar29 + 1);
              }
            }
            uVar22 = (int)puVar29 - (int)puVar8;
          }
code_r0x0009e510:
          if (pcVar10 < (char *)((long)puVar16 + (ulong)(uVar22 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar31 = uVar22 - 0xf;
          if (uVar22 < 0xf) {
            *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar22;
            unaff_x25 = psVar37;
          }
          else {
            *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
            psVar37[0] = -1;
            psVar37[1] = -1;
            if (0x3fb < uVar31) {
              uVar18 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
              _memset((short *)((long)puVar16 + 6),0xff,uVar18 + 4);
              uVar31 = (uVar22 - 0x40b) % 0x3fc;
              puVar13 = *(ulong **)(unaff_x29 + -0x68);
              puVar7 = *(ulong **)(unaff_x29 + -0x60);
              psVar37 = (short *)((long)puVar16 + 6 + uVar18);
            }
            uVar30 = (uVar31 & 0xffff) / 0xff;
            pcVar1 = (char *)((long)psVar37 + (ulong)uVar30);
            *pcVar1 = (char)uVar31 + (char)uVar30;
            unaff_x25 = (short *)(pcVar1 + 1);
          }
          puVar8 = (ulong *)((long)puVar11 + (ulong)uVar22 + 4);
          if (puVar13 <= puVar8) break;
          plVar15 = (long *)((long)puVar11 + (ulong)uVar22 + 2);
          *(int *)(unaff_x21 + ((ulong)(*plVar15 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar15 - iVar34;
          uVar30 = (int)puVar8 - iVar34;
          uVar18 = *puVar8 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar31 = *(uint *)(unaff_x21 + uVar18);
          *(uint *)(unaff_x21 + uVar18) = uVar30;
          if ((uVar31 + 0xffff < uVar30) ||
             (piVar33 = (int *)(lVar35 + (ulong)uVar31), *piVar33 != (int)*puVar8))
          goto LAB_0009e25c;
          puVar16 = (ulong *)((long)unaff_x25 + 1);
          *(char *)unaff_x25 = '\0';
          puVar11 = puVar8;
        } while( true );
      }
LAB_0009c85c:
      uVar18 = *(long *)(unaff_x29 + -0x70) - (long)puVar8;
      if (pcVar10 < (char *)((long)unaff_x25 + (uVar18 + 0xf0) / 0xff + uVar18 + 1)) {
        return 0;
      }
      uVar20 = uVar18 - 0xf;
      if (uVar18 < 0xf) {
LAB_0009e6e0:
        *(char *)unaff_x25 = (char)((int)uVar18 << 4);
        goto code_r0x0009e6e8;
      }
      psVar37 = (short *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = -0x10;
      if (0xfe < uVar20) {
        uVar27 = *(ulong *)(unaff_x29 + -0x88);
LAB_0009c8a8:
        uVar20 = (long)puVar7 + (uVar27 - (long)puVar8) + -0x10e;
        uVar27 = uVar20 / 0xff;
        _memset(psVar37,0xff,uVar27 + 1);
        uVar20 = uVar20 % 0xff;
        psVar37 = (short *)((long)unaff_x25 + uVar27 + 2);
      }
    }
    *(char *)psVar37 = (char)uVar20;
    unaff_x25 = psVar37;
code_r0x0009e6e8:
    _memcpy((char *)((long)unaff_x25 + 1),puVar8,uVar18);
    return ((int)(char *)((long)unaff_x25 + 1) + (int)uVar18) - iVar4;
  }
  lVar9 = *(long *)(&UNK_00004008 + unaff_x21);
  *(uint *)(unaff_x29 + -0x70) = unaff_w27;
  *(uint **)(unaff_x29 + -0x68) = unaff_x26;
  puVar7 = param_3;
  if (lVar9 == 0) {
    if ((uVar22 >> 0x10 == 0) && (uVar31 = param_4 - uVar22, uVar22 < param_4)) {
      if (unaff_w27 < 0x7e000001) {
        if (unaff_w27 != 0) {
          lVar9 = (long)puVar8 + (param_1 & 0xffffffff);
          uVar18 = (ulong)unaff_w27;
          lVar35 = 0;
          if (puVar8 != (ulong *)0x0) {
            lVar35 = lVar9 - (ulong)param_4;
          }
          *(char **)(unaff_x29 + -0x78) = (char *)((long)unaff_x25 + (long)unaff_w24);
          unaff_x26[2] = uVar22 + unaff_w27;
          *unaff_x26 = param_4 + unaff_w27;
          unaff_x26[1] = 2;
          puVar11 = param_3;
          if (0xc < unaff_w27) {
            lVar12 = (long)param_3 - (ulong)param_4;
            puVar13 = (ulong *)((long)param_3 + (uVar18 - 0xb));
            puVar21 = (ulong *)((long)param_3 + (uVar18 - 5));
            lVar38 = 0;
            if (puVar8 != (ulong *)0x0) {
              lVar38 = lVar9;
            }
            *(uint *)(unaff_x21 + (*param_3 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = param_4;
            puVar16 = (ulong *)((long)param_3 + 2);
            puVar29 = (ulong *)((long)param_3 + 1);
            uVar22 = param_4 + 1;
            puVar19 = (ulong *)((long)param_3 + (uVar18 - 0xc));
            puVar23 = (ulong *)((long)param_3 + (uVar18 - 8));
            puVar36 = (ulong *)((long)param_3 + (uVar18 - 6));
            *(uint *)(unaff_x29 + -0x80) = param_4;
code_r0x0009e7f8:
            uVar30 = unaff_w28 << 6 | 1;
            uVar20 = *(ulong *)((long)puVar11 + 1);
            uVar17 = uStack0000000000000084;
            do {
              puVar6 = puVar16;
              uVar27 = uVar20 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
              uVar2 = *(uint *)(unaff_x21 + uVar27);
              uVar32 = (ulong)uVar2;
              uVar20 = *puVar6;
              *(uint *)(unaff_x21 + uVar27) = uVar22;
              iVar34 = (int)lVar12;
              if (uVar31 <= uVar2 && uVar22 <= uVar2 + 0xffff) {
                lVar9 = lVar35;
                if (param_4 <= uVar2) {
                  lVar9 = lVar12;
                }
                if (*(int *)(lVar9 + uVar32) == (int)*puVar29) goto code_r0x0009e864;
              }
              uVar22 = (int)puVar6 - iVar34;
              uVar27 = (ulong)uVar17;
              uVar17 = uVar30 >> 6;
              uVar30 = uVar30 + 1;
              puVar16 = (ulong *)((long)puVar6 + uVar27);
              puVar29 = puVar6;
              if (puVar13 < (ulong *)((long)puVar6 + uVar27)) {
                unaff_x26 = *(uint **)(unaff_x29 + -0x68);
                break;
              }
            } while( true );
          }
code_r0x0009c6c0:
          uVar20 = (long)param_3 + (uVar18 - (long)puVar11);
          if ((char *)((long)unaff_x25 + (uVar20 + 0xf0) / 0xff + uVar20 + 1) <=
              *(char **)(unaff_x29 + -0x78)) {
            uVar27 = uVar20 - 0xf;
            if (uVar20 < 0xf) {
              *(char *)unaff_x25 = (char)((int)uVar20 << 4);
            }
            else {
              psVar37 = (short *)((long)unaff_x25 + 1);
              *(char *)unaff_x25 = -0x10;
              if (0xfe < uVar27) {
                uVar27 = (long)puVar7 + (uVar18 - (long)puVar11) + -0x10e;
                uVar18 = uVar27 / 0xff;
                _memset(psVar37,0xff,uVar18 + 1);
                uVar27 = uVar27 % 0xff;
                psVar37 = (short *)((long)unaff_x25 + uVar18 + 2);
              }
              *(char *)psVar37 = (char)uVar27;
              unaff_x25 = psVar37;
            }
            _memcpy((char *)((long)unaff_x25 + 1),puVar11,uVar20);
            iVar34 = (int)(char *)((long)unaff_x25 + 1) + (int)uVar20;
            goto code_r0x0009f898;
          }
          goto LAB_0009efc8;
        }
        goto LAB_0009d2c8;
      }
    }
    else if (unaff_w27 < 0x7e000001) {
      if (unaff_w27 != 0) {
        lVar9 = (long)puVar8 + (param_1 & 0xffffffff);
        uVar18 = (ulong)unaff_w27;
        lVar35 = 0;
        if (puVar8 != (ulong *)0x0) {
          lVar35 = lVar9 - (ulong)param_4;
        }
        pcVar10 = (char *)((long)unaff_x25 + (long)unaff_w24);
        unaff_x26[2] = uVar22 + unaff_w27;
        *unaff_x26 = param_4 + unaff_w27;
        unaff_x26[1] = 2;
        puVar11 = param_3;
        if (0xc < unaff_w27) {
          lVar12 = (long)param_3 - (ulong)param_4;
          puVar13 = (ulong *)((long)param_3 + (uVar18 - 0xb));
          *(ulong *)(unaff_x29 + -0x78) = (long)param_3 + (uVar18 - 5);
          lVar38 = 0;
          if (puVar8 != (ulong *)0x0) {
            lVar38 = lVar9;
          }
          *(long *)(unaff_x29 + -0x88) = lVar38;
          *(uint *)(unaff_x21 + (*param_3 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = param_4;
          puVar21 = (ulong *)((long)param_3 + 2);
          puVar16 = (ulong *)((long)param_3 + 1);
          uVar22 = param_4 + 1;
          puVar29 = (ulong *)((long)param_3 + (uVar18 - 0xc));
          puVar23 = (ulong *)((long)param_3 + (uVar18 - 8));
          puVar19 = (ulong *)((long)param_3 + (uVar18 - 6));
          *(uint *)(unaff_x29 + -0x80) = param_4;
code_r0x0009f084:
          uVar31 = unaff_w28 << 6 | 1;
          uVar20 = *(ulong *)((long)puVar11 + 1);
          uVar30 = uStack0000000000000084;
          do {
            puVar36 = puVar21;
            uVar27 = uVar20 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
            uVar17 = *(uint *)(unaff_x21 + uVar27);
            uVar32 = (ulong)uVar17;
            uVar20 = *puVar36;
            *(uint *)(unaff_x21 + uVar27) = uVar22;
            iVar34 = (int)lVar12;
            if (uVar22 <= uVar17 + 0xffff) {
              lVar9 = lVar35;
              if (param_4 <= uVar17) {
                lVar9 = lVar12;
              }
              if (*(int *)(lVar9 + uVar32) == (int)*puVar16) goto code_r0x0009f0f0;
            }
            uVar22 = (int)puVar36 - iVar34;
            uVar27 = (ulong)uVar30;
            uVar30 = uVar31 >> 6;
            uVar31 = uVar31 + 1;
            puVar21 = (ulong *)((long)puVar36 + uVar27);
            puVar16 = puVar36;
            if (puVar13 < (ulong *)((long)puVar36 + uVar27)) break;
          } while( true );
        }
LAB_0009c948:
        uVar20 = (long)param_3 + (uVar18 - (long)puVar11);
        if (pcVar10 < (char *)((long)unaff_x25 + (uVar20 + 0xf0) / 0xff + uVar20 + 1))
        goto LAB_0009d2b8;
        uVar27 = uVar20 - 0xf;
        if (uVar20 < 0xf) {
          *(char *)unaff_x25 = (char)((int)uVar20 << 4);
          unaff_w27 = *(uint *)(unaff_x29 + -0x70);
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
        }
        else {
          psVar37 = (short *)((long)unaff_x25 + 1);
          *(char *)unaff_x25 = -0x10;
          if (0xfe < uVar27) {
            uVar27 = (long)puVar7 + (uVar18 - (long)puVar11) + -0x10e;
            uVar18 = uVar27 / 0xff;
            _memset(psVar37,0xff,uVar18 + 1);
            uVar27 = uVar27 % 0xff;
            psVar37 = (short *)((long)unaff_x25 + uVar18 + 2);
          }
          unaff_w27 = *(uint *)(unaff_x29 + -0x70);
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
          *(char *)psVar37 = (char)uVar27;
          unaff_x25 = psVar37;
        }
        _memcpy((char *)((long)unaff_x25 + 1),puVar11,uVar20);
        iVar34 = (int)(char *)((long)unaff_x25 + 1) + (int)uVar20;
code_r0x0009f898:
        iVar4 = iVar34 - iVar4;
        goto LAB_0009f89c;
      }
LAB_0009d2c8:
      if (0 < unaff_w24) {
        *(char *)unaff_x25 = '\0';
        iVar4 = 1;
        goto LAB_0009f8a0;
      }
    }
LAB_0009efc8:
    iVar4 = 0;
    goto LAB_0009f8a0;
  }
  if (0x1000 < (int)unaff_w27) {
    _memcpy();
    if (unaff_w27 < 0x7e000001) {
      uVar22 = *unaff_x26;
      puVar8 = *(ulong **)(unaff_x29 + -0x60);
      lVar38 = (long)puVar8 - (ulong)uVar22;
      puVar11 = *(ulong **)(unaff_x21 + 0x4000);
      uVar31 = unaff_x26[2];
      uVar18 = (ulong)unaff_w27;
      puVar13 = (ulong *)((long)puVar8 + (uVar18 - 0xb));
      *(ulong *)(unaff_x29 + -0x78) = (long)puVar8 + (uVar18 - 5);
      lVar9 = (long)puVar11 + (ulong)uVar31;
      lVar35 = 0;
      if (puVar11 != (ulong *)0x0) {
        lVar35 = lVar9 - (ulong)uVar22;
      }
      pcVar10 = (char *)((long)unaff_x25 + (long)unaff_w24);
      unaff_x26[2] = uVar31 + unaff_w27;
      *(uint *)(unaff_x21 + (*puVar8 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar22;
      *unaff_x26 = uVar22 + unaff_w27;
      unaff_x26[1] = 2;
      puVar21 = (ulong *)((long)puVar8 + 2);
      puVar16 = (ulong *)((long)puVar8 + 1);
      uVar31 = uVar22 + 1;
      lVar12 = 0;
      if (puVar11 != (ulong *)0x0) {
        lVar12 = lVar9;
      }
      *(long *)(unaff_x29 + -0x80) = lVar12;
      puVar36 = (ulong *)((long)puVar8 + (uVar18 - 0xc));
      puVar23 = (ulong *)((long)puVar8 + (uVar18 - 8));
      puVar19 = (ulong *)((long)puVar8 + (uVar18 - 6));
      *(char **)(unaff_x29 + -0x88) = pcVar10;
      puVar7 = puVar8;
      puVar29 = puVar8;
code_r0x0009cae8:
      uVar30 = unaff_w28 << 6 | 1;
      uVar20 = *(ulong *)((long)puVar29 + 1);
      uVar17 = uStack0000000000000084;
      do {
        puVar6 = puVar21;
        uVar27 = uVar20 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
        uVar2 = *(uint *)(unaff_x21 + uVar27);
        uVar32 = (ulong)uVar2;
        uVar20 = *puVar6;
        *(uint *)(unaff_x21 + uVar27) = uVar31;
        iVar34 = (int)lVar38;
        if (uVar31 <= uVar2 + 0xffff) {
          lVar9 = lVar35;
          if (uVar22 <= uVar2) {
            lVar9 = lVar38;
          }
          if (*(int *)(lVar9 + uVar32) == (int)*puVar16) goto code_r0x0009cb50;
        }
        uVar31 = (int)puVar6 - iVar34;
        uVar27 = (ulong)uVar17;
        uVar17 = uVar30 >> 6;
        uVar30 = uVar30 + 1;
        puVar21 = (ulong *)((long)puVar6 + uVar27);
        puVar16 = puVar6;
        if (puVar13 < (ulong *)((long)puVar6 + uVar27)) goto code_r0x0009d28c;
      } while( true );
    }
    iVar4 = 0;
    goto LAB_0009f89c;
  }
  if (0x7e000000 < unaff_w27) goto LAB_0009efc8;
  if (unaff_w27 == 0) goto LAB_0009d2c8;
  puVar8 = *(ulong **)(lVar9 + 0x4000);
  uVar22 = *(uint *)(&UNK_00004018 + lVar9);
  uVar18 = (ulong)unaff_w27;
  uVar31 = *(uint *)(&UNK_00004010 + lVar9);
  lVar35 = 0;
  if (puVar8 != (ulong *)0x0) {
    lVar35 = ((long)puVar8 + (ulong)uVar22) - (ulong)uVar31;
  }
  *(char **)(unaff_x29 + -0x78) = (char *)((long)unaff_x25 + (long)unaff_w24);
  *(undefined8 *)(&UNK_00004008 + unaff_x21) = 0;
  *unaff_x26 = param_4 + unaff_w27;
  unaff_x26[1] = 2;
  unaff_x26[2] = unaff_w27;
  puVar11 = param_3;
  if (unaff_w27 < 0xd) {
code_r0x0009c7d0:
    uVar20 = (long)param_3 + (uVar18 - (long)puVar11);
    if (*(char **)(unaff_x29 + -0x78) <
        (char *)((long)unaff_x25 + (uVar20 + 0xf0) / 0xff + uVar20 + 1)) {
code_r0x0009c800:
      iVar4 = 0;
      unaff_w27 = *(uint *)(unaff_x29 + -0x70);
    }
    else {
      uVar27 = uVar20 - 0xf;
      if (uVar20 < 0xf) {
        *(char *)unaff_x25 = (char)((int)uVar20 << 4);
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
      }
      else {
        psVar37 = (short *)((long)unaff_x25 + 1);
        *(char *)unaff_x25 = -0x10;
        if (0xfe < uVar27) {
          uVar27 = (long)puVar7 + (uVar18 - (long)puVar11) + -0x10e;
          uVar18 = uVar27 / 0xff;
          _memset(psVar37,0xff,uVar18 + 1);
          uVar27 = uVar27 % 0xff;
          psVar37 = (short *)((long)unaff_x25 + uVar18 + 2);
        }
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
        *(char *)psVar37 = (char)uVar27;
        unaff_x25 = psVar37;
      }
      _memcpy((char *)((long)unaff_x25 + 1),puVar11,uVar20);
      iVar4 = ((int)(char *)((long)unaff_x25 + 1) + (int)uVar20) - iVar4;
LAB_0009f89c:
      puVar7 = *(ulong **)(unaff_x29 + -0x60);
    }
    goto LAB_0009f8a0;
  }
  lVar12 = (long)param_3 - (ulong)param_4;
  iVar34 = param_4 - uVar31;
  puVar13 = (ulong *)((long)param_3 + (uVar18 - 0xb));
  puVar21 = (ulong *)((long)param_3 + (uVar18 - 5));
  lVar38 = 0;
  if (puVar8 != (ulong *)0x0) {
    lVar38 = (long)puVar8 + (ulong)uVar22;
  }
  *(uint *)(unaff_x21 + (*param_3 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = param_4;
  puVar16 = (ulong *)((long)param_3 + 2);
  puVar29 = (ulong *)((long)param_3 + 1);
  uVar22 = param_4 + 1;
  puVar36 = (ulong *)((long)param_3 + (uVar18 - 0xc));
  puVar23 = (ulong *)((long)param_3 + (uVar18 - 8));
  puVar19 = (ulong *)((long)param_3 + (uVar18 - 6));
  *(uint *)(unaff_x29 + -0x80) = param_4;
code_r0x0009d418:
  uVar31 = unaff_w28 << 6 | 1;
  uVar20 = *(ulong *)((long)puVar11 + 1);
  uVar30 = uStack0000000000000084;
  while( true ) {
    puVar6 = puVar16;
    uVar27 = uVar20 * -0x30e4432345000000 >> 0x34;
    uVar17 = *(uint *)(unaff_x21 + uVar27 * 4);
    iVar25 = (int)lVar12;
    if (uVar17 < param_4) {
      uVar17 = *(uint *)(lVar9 + uVar27 * 4);
      puVar16 = (ulong *)(lVar35 + (ulong)uVar17);
      uVar17 = uVar17 + iVar34;
      uVar20 = *puVar6;
      *(uint *)(unaff_x21 + uVar27 * 4) = uVar22;
      puVar5 = puVar8;
    }
    else {
      puVar16 = (ulong *)(lVar12 + (ulong)uVar17);
      uVar20 = *puVar6;
      *(uint *)(unaff_x21 + uVar27 * 4) = uVar22;
      puVar5 = puVar7;
    }
    if ((uVar22 <= uVar17 + 0xffff) && ((int)*puVar16 == (int)*puVar29)) break;
    uVar22 = (int)puVar6 - iVar25;
    uVar27 = (ulong)uVar30;
    uVar30 = uVar31 >> 6;
    uVar31 = uVar31 + 1;
    puVar16 = (ulong *)((long)puVar6 + uVar27);
    puVar29 = puVar6;
    if (puVar13 < (ulong *)((long)puVar6 + uVar27)) {
      unaff_x26 = *(uint **)(unaff_x29 + -0x68);
      goto code_r0x0009c7d0;
    }
  }
  if ((puVar5 < puVar16) && (*(char *)((long)puVar29 - 1) == *(char *)((long)puVar16 + -1))) {
    puVar6 = (ulong *)((long)puVar29 - 1);
    puVar14 = (ulong *)((long)puVar16 + -1);
    do {
      puVar16 = puVar14;
      puVar29 = puVar6;
      if ((puVar16 <= puVar5) || (puVar29 <= puVar11)) break;
      puVar6 = (ulong *)((long)puVar29 + -1);
      puVar14 = (ulong *)((long)puVar16 + -1);
    } while (*(char *)((long)puVar29 + -1) == *(char *)((long)puVar16 + -1));
  }
  puVar6 = (ulong *)((long)unaff_x25 + 1);
  uVar20 = (long)puVar29 - (long)puVar11 & 0xffffffff;
  if ((char *)((long)puVar6 + uVar20 / 0xff + uVar20 + 8) <= *(char **)(unaff_x29 + -0x78)) {
    uVar30 = (uint)((long)puVar29 - (long)puVar11);
    uVar31 = uVar30 - 0xf;
    if (uVar30 < 0xf) {
      *(char *)unaff_x25 = (char)(uVar30 << 4);
    }
    else {
      *(char *)unaff_x25 = -0x10;
      puVar14 = puVar6;
      if (0xfe < uVar31) {
        uVar31 = ((int)puVar29 - (int)puVar11) - 0x10e;
        uVar27 = (ulong)uVar31 / 0xff;
        *(ulong **)(unaff_x29 + -0x88) = puVar11;
        _memset(puVar6,0xff,uVar27 + 1);
        puVar11 = *(ulong **)(unaff_x29 + -0x88);
        param_4 = *(uint *)(unaff_x29 + -0x80);
        puVar7 = *(ulong **)(unaff_x29 + -0x60);
        uVar31 = uVar31 + (int)uVar27;
        puVar14 = (ulong *)((long)unaff_x25 + uVar27 + 2);
      }
      puVar6 = (ulong *)((long)puVar14 + 1);
      *(char *)puVar14 = (char)uVar31;
    }
    puVar14 = (ulong *)((long)puVar6 + uVar20);
    puVar28 = puVar14;
    if (puVar14 <= puVar6 + 1) {
      puVar28 = puVar6 + 1;
    }
    if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar28 + ~(ulong)puVar6)) &&
       (0x3f < (ulong)((long)puVar6 - (long)puVar11))) {
      uVar20 = ((long)puVar28 + ~(ulong)puVar6 >> 3) + 1;
      uVar32 = uVar20 & 0x3ffffffffffffff8;
      puVar28 = puVar11 + 4;
      puVar24 = puVar6 + 4;
      uVar27 = uVar32;
      do {
        uVar39 = puVar28[-4];
        uVar41 = puVar28[-1];
        uVar40 = puVar28[-2];
        uVar43 = puVar28[1];
        uVar42 = *puVar28;
        uVar45 = puVar28[3];
        uVar44 = puVar28[2];
        puVar24[-3] = puVar28[-3];
        puVar24[-4] = uVar39;
        puVar24[-1] = uVar41;
        puVar24[-2] = uVar40;
        puVar24[1] = uVar43;
        *puVar24 = uVar42;
        puVar24[3] = uVar45;
        puVar24[2] = uVar44;
        uVar27 = uVar27 - 8;
        puVar28 = puVar28 + 8;
        puVar24 = puVar24 + 8;
      } while (uVar27 != 0);
      puVar11 = puVar11 + uVar32;
      puVar6 = puVar6 + uVar32;
      if (uVar20 == uVar32) goto code_r0x0009d640;
    }
    do {
      puVar28 = puVar6 + 1;
      *puVar6 = *puVar11;
      puVar11 = puVar11 + 1;
      puVar6 = puVar28;
    } while (puVar28 < puVar14);
code_r0x0009d640:
    psVar37 = (short *)((long)puVar14 + 2);
    *(short *)puVar14 = (short)uVar22 - (short)uVar17;
    puVar11 = puVar29;
    if (puVar5 == puVar8) goto code_r0x0009d79c;
    do {
      puVar29 = (ulong *)((long)puVar11 + 4);
      puVar6 = (ulong *)((long)puVar16 + 4);
      if (puVar29 < puVar36) {
        uVar20 = *puVar29 ^ *puVar6;
        if (uVar20 == 0) {
          puVar5 = (ulong *)((long)puVar11 + 0xc);
          puVar6 = (ulong *)((long)puVar16 + 0xc);
          if (puVar5 < puVar36) goto code_r0x0009d6a0;
          goto code_r0x0009d754;
        }
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
        unaff_x26 = *(uint **)(unaff_x29 + -0x68);
      }
      else {
        puVar5 = puVar29;
        if (puVar29 < puVar36) {
code_r0x0009d6a0:
          iVar26 = ((int)puVar5 - (int)puVar11) + -4;
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
          do {
            uVar20 = *puVar5 ^ *puVar6;
            if (uVar20 != 0) {
              uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
              uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
              uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                    iVar26);
              goto code_r0x0009d73c;
            }
            puVar5 = puVar5 + 1;
            puVar6 = puVar6 + 1;
            iVar26 = iVar26 + 8;
          } while (puVar5 < puVar36);
        }
        else {
code_r0x0009d754:
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
        }
        if (puVar5 < puVar23) {
          if ((int)*puVar6 == (int)*puVar5) {
            puVar5 = (ulong *)((long)puVar5 + 4);
            puVar6 = (ulong *)((long)puVar6 + 4);
          }
        }
        if (puVar5 < puVar19) {
          if ((short)*puVar6 == (short)*puVar5) {
            puVar5 = (ulong *)((long)puVar5 + 2);
            puVar6 = (ulong *)((long)puVar6 + 2);
          }
        }
        if (puVar5 < puVar21) {
          if ((char)*puVar6 == (char)*puVar5) {
            puVar5 = (ulong *)((long)puVar5 + 1);
          }
        }
        uVar20 = (ulong)(uint)((int)puVar5 - (int)puVar29);
      }
code_r0x0009d73c:
      puVar11 = (ulong *)((long)puVar11 + uVar20 + 4);
      while( true ) {
        uVar22 = (uint)uVar20;
        if (*(char **)(unaff_x29 + -0x78) <
            (char *)((long)puVar14 + (ulong)(uVar22 + 0xf0) / 0xff + 8)) goto code_r0x0009c800;
        uVar31 = uVar22 - 0xf;
        if (uVar22 < 0xf) {
          *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar20;
          unaff_x25 = psVar37;
        }
        else {
          *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
          psVar37[0] = -1;
          psVar37[1] = -1;
          if (0x3fb < uVar31) {
            uVar20 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
            *(ulong **)(unaff_x29 + -0x88) = puVar11;
            _memset((short *)((long)puVar14 + 6),0xff,uVar20 + 4);
            puVar11 = *(ulong **)(unaff_x29 + -0x88);
            unaff_x26 = *(uint **)(unaff_x29 + -0x68);
            puVar7 = *(ulong **)(unaff_x29 + -0x60);
            param_4 = *(uint *)(unaff_x29 + -0x80);
            uVar31 = (uVar22 - 0x40b) % 0x3fc;
            psVar37 = (short *)((long)puVar14 + 6 + uVar20);
          }
          uVar22 = (uVar31 & 0xffff) / 0xff;
          pcVar10 = (char *)((long)psVar37 + (ulong)uVar22);
          *pcVar10 = (char)uVar31 + (char)uVar22;
          unaff_x25 = (short *)(pcVar10 + 1);
        }
        if (puVar13 <= puVar11) goto code_r0x0009c7d0;
        *(int *)(unaff_x21 +
                ((ulong)(*(long *)((long)puVar11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)puVar11 + -2) - iVar25;
        uVar20 = *puVar11 * -0x30e4432345000000 >> 0x34;
        uVar22 = *(uint *)(unaff_x21 + uVar20 * 4);
        if (uVar22 < param_4) {
          uVar22 = *(uint *)(lVar9 + uVar20 * 4);
          puVar16 = (ulong *)(lVar35 + (ulong)uVar22);
          uVar22 = uVar22 + iVar34;
          puVar6 = puVar8;
        }
        else {
          puVar16 = (ulong *)(lVar12 + (ulong)uVar22);
          puVar6 = puVar7;
        }
        uVar31 = (int)puVar11 - iVar25;
        *(uint *)(unaff_x21 + uVar20 * 4) = uVar31;
        if ((uVar22 + 0xffff < uVar31) || ((int)*puVar16 != (int)*puVar11)) {
          puVar29 = (ulong *)((long)puVar11 + 1);
          uVar22 = (int)puVar29 - iVar25;
          puVar16 = (ulong *)((long)puVar11 + 2);
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
          if (puVar13 < puVar16) goto code_r0x0009c7d0;
          goto code_r0x0009d418;
        }
        puVar14 = (ulong *)((long)unaff_x25 + 1);
        *(char *)unaff_x25 = '\0';
        psVar37 = (short *)((long)unaff_x25 + 3);
        *(short *)puVar14 = (short)uVar31 - (short)uVar22;
        puVar29 = puVar11;
        if (puVar6 != puVar8) break;
code_r0x0009d79c:
        puVar11 = (ulong *)((long)puVar29 + (lVar38 - (long)puVar16));
        puVar6 = puVar21;
        if (puVar11 <= puVar21) {
          puVar6 = puVar11;
        }
        puVar11 = (ulong *)((long)puVar29 + 4);
        puVar5 = (ulong *)((long)puVar16 + 4);
        puVar28 = (ulong *)((long)puVar6 - 7);
        if (puVar11 < puVar28) {
          uVar20 = *puVar11 ^ *puVar5;
          if (uVar20 == 0) {
            puVar24 = (ulong *)((long)puVar29 + 0xc);
            puVar5 = (ulong *)((long)puVar16 + 0xc);
            if (puVar24 < puVar28) goto code_r0x0009d7f8;
            goto code_r0x0009db68;
          }
          uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
          uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
          uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
          uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
          uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
        }
        else {
          puVar24 = puVar11;
          if (puVar11 < puVar28) {
code_r0x0009d7f8:
            iVar26 = ((int)puVar24 - (int)puVar29) + -4;
            do {
              uVar20 = *puVar24 ^ *puVar5;
              if (uVar20 != 0) {
                uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
                uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
                uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
                uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
                uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                      iVar26);
                goto code_r0x0009d8a8;
              }
              puVar24 = puVar24 + 1;
              puVar5 = puVar5 + 1;
              iVar26 = iVar26 + 8;
            } while (puVar24 < puVar28);
            if ((ulong *)((long)puVar6 - 3U) <= puVar24) goto code_r0x0009db78;
code_r0x0009d834:
            if ((int)*puVar5 == (int)*puVar24) {
              puVar24 = (ulong *)((long)puVar24 + 4);
              puVar5 = (ulong *)((long)puVar5 + 4);
            }
            if (puVar24 < (ulong *)((long)puVar6 - 1U)) {
code_r0x0009db8c:
              if ((short)*puVar5 == (short)*puVar24) {
                puVar24 = (ulong *)((long)puVar24 + 2);
                puVar5 = (ulong *)((long)puVar5 + 2);
              }
            }
          }
          else {
code_r0x0009db68:
            if (puVar24 < (ulong *)((long)puVar6 - 3U)) goto code_r0x0009d834;
code_r0x0009db78:
            if (puVar24 < (ulong *)((long)puVar6 - 1U)) goto code_r0x0009db8c;
          }
          if (puVar24 < puVar6) {
            if ((char)*puVar5 == (char)*puVar24) {
              puVar24 = (ulong *)((long)puVar24 + 1);
            }
          }
          uVar20 = (ulong)(uint)((int)puVar24 - (int)puVar11);
        }
code_r0x0009d8a8:
        puVar11 = (ulong *)((long)puVar29 + uVar20 + 4);
        if (puVar11 == puVar6) {
          puVar11 = puVar6;
          puVar5 = puVar7;
          if (puVar6 < puVar36) {
            uVar27 = *puVar6 ^ *puVar7;
            if (uVar27 == 0) {
              puVar11 = puVar6 + 1;
              puVar5 = param_3 + 1;
              goto code_r0x0009d900;
            }
            uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
            uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
            uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
            uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
            uVar22 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
            unaff_x26 = *(uint **)(unaff_x29 + -0x68);
          }
          else {
code_r0x0009d900:
            if (puVar11 < puVar36) {
              puVar29 = (ulong *)((long)puVar29 + (lVar38 - (long)puVar16));
              if (puVar21 <= puVar29) {
                puVar29 = puVar21;
              }
              iVar26 = (int)puVar11 - (int)puVar29;
              unaff_x26 = *(uint **)(unaff_x29 + -0x68);
              do {
                uVar27 = *puVar11 ^ *puVar5;
                if (uVar27 != 0) {
                  uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
                  uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
                  uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
                  uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10
                  ;
                  uVar22 = (int)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3) + iVar26;
                  goto code_r0x0009d9b8;
                }
                puVar11 = puVar11 + 1;
                puVar5 = puVar5 + 1;
                iVar26 = iVar26 + 8;
              } while (puVar11 < puVar36);
            }
            else {
              unaff_x26 = *(uint **)(unaff_x29 + -0x68);
            }
            if (puVar11 < puVar23) {
              if ((int)*puVar5 == (int)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 4);
                puVar5 = (ulong *)((long)puVar5 + 4);
              }
            }
            if (puVar11 < puVar19) {
              if ((short)*puVar5 == (short)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 2);
                puVar5 = (ulong *)((long)puVar5 + 2);
              }
            }
            if (puVar11 < puVar21) {
              if ((char)*puVar5 == (char)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 1);
              }
            }
            uVar22 = (int)puVar11 - (int)puVar6;
          }
code_r0x0009d9b8:
          uVar20 = (ulong)(uVar22 + (int)uVar20);
          puVar11 = (ulong *)((long)puVar6 + (ulong)uVar22);
        }
        else {
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
        }
      }
    } while( true );
  }
  goto LAB_0009d2b8;
code_r0x0009dd38:
  puVar11 = (ulong *)((long)puVar16 + (ulong)uVar31 + 6);
  uVar31 = *(uint *)(unaff_x29 + -0x80);
  if (puVar13 < puVar11) goto code_r0x0009c5e0;
  goto code_r0x0009dd48;
LAB_0009e25c:
  puVar11 = (ulong *)((long)puVar11 + (ulong)uVar22 + 6);
  uVar22 = *(uint *)(unaff_x29 + -0x80);
  if (puVar13 < puVar11) goto LAB_0009c85c;
  goto code_r0x0009e26c;
code_r0x0009e864:
  puVar16 = puVar8;
  if (param_4 <= uVar2) {
    puVar16 = puVar7;
  }
  puVar6 = (ulong *)(lVar9 + uVar32);
  if ((puVar16 < puVar6) && (*(char *)((long)puVar29 - 1) == *(char *)((long)puVar6 - 1))) {
    puVar5 = (ulong *)((long)puVar29 - 1);
    puVar14 = (ulong *)(lVar9 + uVar32 + -1);
    do {
      puVar6 = puVar14;
      puVar29 = puVar5;
      if ((puVar6 <= puVar16) || (puVar29 <= puVar11)) break;
      puVar5 = (ulong *)((long)puVar29 + -1);
      puVar14 = (ulong *)((long)puVar6 + -1);
    } while (*(char *)((long)puVar29 + -1) == *(char *)((long)puVar6 + -1));
  }
  puVar5 = (ulong *)((long)unaff_x25 + 1);
  uVar20 = (long)puVar29 - (long)puVar11 & 0xffffffff;
  if (*(char **)(unaff_x29 + -0x78) < (char *)((long)puVar5 + uVar20 / 0xff + uVar20 + 8))
  goto LAB_0009d2b8;
  uVar17 = (uint)((long)puVar29 - (long)puVar11);
  uVar30 = uVar17 - 0xf;
  if (uVar17 < 0xf) {
    *(char *)unaff_x25 = (char)(uVar17 << 4);
  }
  else {
    *(char *)unaff_x25 = -0x10;
    puVar14 = puVar5;
    if (0xfe < uVar30) {
      uVar30 = ((int)puVar29 - (int)puVar11) - 0x10e;
      uVar27 = (ulong)uVar30 / 0xff;
      *(ulong **)(unaff_x29 + -0x88) = puVar11;
      _memset(puVar5,0xff,uVar27 + 1);
      puVar11 = *(ulong **)(unaff_x29 + -0x88);
      param_4 = *(uint *)(unaff_x29 + -0x80);
      puVar7 = *(ulong **)(unaff_x29 + -0x60);
      uVar30 = uVar30 + (int)uVar27;
      puVar14 = (ulong *)((long)unaff_x25 + uVar27 + 2);
    }
    puVar5 = (ulong *)((long)puVar14 + 1);
    *(char *)puVar14 = (char)uVar30;
  }
  puVar14 = (ulong *)((long)puVar5 + uVar20);
  puVar28 = puVar14;
  if (puVar14 <= puVar5 + 1) {
    puVar28 = puVar5 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar28 + ~(ulong)puVar5)) &&
     (0x3f < (ulong)((long)puVar5 - (long)puVar11))) {
    uVar20 = ((long)puVar28 + ~(ulong)puVar5 >> 3) + 1;
    uVar32 = uVar20 & 0x3ffffffffffffff8;
    puVar28 = puVar11 + 4;
    puVar24 = puVar5 + 4;
    uVar27 = uVar32;
    do {
      uVar39 = puVar28[-4];
      uVar41 = puVar28[-1];
      uVar40 = puVar28[-2];
      uVar43 = puVar28[1];
      uVar42 = *puVar28;
      uVar45 = puVar28[3];
      uVar44 = puVar28[2];
      puVar24[-3] = puVar28[-3];
      puVar24[-4] = uVar39;
      puVar24[-1] = uVar41;
      puVar24[-2] = uVar40;
      puVar24[1] = uVar43;
      *puVar24 = uVar42;
      puVar24[3] = uVar45;
      puVar24[2] = uVar44;
      uVar27 = uVar27 - 8;
      puVar28 = puVar28 + 8;
      puVar24 = puVar24 + 8;
    } while (uVar27 != 0);
    puVar11 = puVar11 + uVar32;
    puVar5 = puVar5 + uVar32;
    if (uVar20 == uVar32) goto code_r0x0009e9ec;
  }
  do {
    puVar28 = puVar5 + 1;
    *puVar5 = *puVar11;
    puVar11 = puVar11 + 1;
    puVar5 = puVar28;
  } while (puVar28 < puVar14);
code_r0x0009e9ec:
  unaff_x26 = *(uint **)(unaff_x29 + -0x68);
  psVar37 = (short *)((long)puVar14 + 2);
  *(short *)puVar14 = (short)uVar22 - (short)uVar2;
  puVar11 = puVar29;
  if (puVar16 == puVar8) goto code_r0x0009eb4c;
  do {
    puVar16 = (ulong *)((long)puVar11 + 4);
    puVar29 = (ulong *)((long)puVar6 + 4);
    if (puVar16 < puVar19) {
      uVar20 = *puVar16 ^ *puVar29;
      if (uVar20 == 0) {
        puVar5 = (ulong *)((long)puVar11 + 0xc);
        puVar29 = (ulong *)((long)puVar6 + 0xc);
        if (puVar5 < puVar19) goto code_r0x0009ea50;
        goto code_r0x0009eb04;
      }
      uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
      uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
      unaff_w27 = *(uint *)(unaff_x29 + -0x70);
    }
    else {
      puVar5 = puVar16;
      if (puVar16 < puVar19) {
code_r0x0009ea50:
        iVar25 = ((int)puVar5 - (int)puVar11) + -4;
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
        do {
          uVar20 = *puVar5 ^ *puVar29;
          if (uVar20 != 0) {
            uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
            uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
            uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                  iVar25);
            goto code_r0x0009eaec;
          }
          puVar5 = puVar5 + 1;
          puVar29 = puVar29 + 1;
          iVar25 = iVar25 + 8;
        } while (puVar5 < puVar19);
      }
      else {
code_r0x0009eb04:
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
      }
      if (puVar5 < puVar23) {
        if ((int)*puVar29 == (int)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 4);
          puVar29 = (ulong *)((long)puVar29 + 4);
        }
      }
      if (puVar5 < puVar36) {
        if ((short)*puVar29 == (short)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 2);
          puVar29 = (ulong *)((long)puVar29 + 2);
        }
      }
      if (puVar5 < puVar21) {
        if ((char)*puVar29 == (char)*puVar5) {
          puVar5 = (ulong *)((long)puVar5 + 1);
        }
      }
      uVar20 = (ulong)(uint)((int)puVar5 - (int)puVar16);
    }
code_r0x0009eaec:
    puVar11 = (ulong *)((long)puVar11 + uVar20 + 4);
    while( true ) {
      uVar22 = (uint)uVar20;
      if (*(char **)(unaff_x29 + -0x78) <
          (char *)((long)puVar14 + (ulong)(uVar22 + 0xf0) / 0xff + 8)) goto LAB_0009efc8;
      uVar30 = uVar22 - 0xf;
      if (uVar22 < 0xf) {
        *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar20;
        unaff_x25 = psVar37;
      }
      else {
        *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
        psVar37[0] = -1;
        psVar37[1] = -1;
        if (0x3fb < uVar30) {
          uVar20 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
          *(ulong **)(unaff_x29 + -0x88) = puVar11;
          _memset((short *)((long)puVar14 + 6),0xff,uVar20 + 4);
          puVar11 = *(ulong **)(unaff_x29 + -0x88);
          param_4 = *(uint *)(unaff_x29 + -0x80);
          uVar30 = (uVar22 - 0x40b) % 0x3fc;
          psVar37 = (short *)((long)puVar14 + 6 + uVar20);
          unaff_x26 = *(uint **)(unaff_x29 + -0x68);
          puVar7 = *(ulong **)(unaff_x29 + -0x60);
        }
        uVar22 = (uVar30 & 0xffff) / 0xff;
        pcVar10 = (char *)((long)psVar37 + (ulong)uVar22);
        *pcVar10 = (char)uVar30 + (char)uVar22;
        unaff_x25 = (short *)(pcVar10 + 1);
      }
      if (puVar13 <= puVar11) goto code_r0x0009c6c0;
      *(int *)(unaff_x21 +
              ((ulong)(*(long *)((long)puVar11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar11 + -2) - iVar34;
      uVar30 = (int)puVar11 - iVar34;
      uVar20 = *puVar11 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar22 = *(uint *)(unaff_x21 + uVar20);
      puVar16 = puVar8;
      lVar9 = lVar35;
      if (param_4 <= uVar22) {
        puVar16 = puVar7;
        lVar9 = lVar12;
      }
      *(uint *)(unaff_x21 + uVar20) = uVar30;
      if ((uVar22 < uVar31 || uVar22 + 0xffff < uVar30) ||
         (puVar6 = (ulong *)(lVar9 + (ulong)uVar22), (int)*puVar6 != (int)*puVar11)) {
        puVar29 = (ulong *)((long)puVar11 + 1);
        uVar22 = (int)puVar29 - iVar34;
        puVar16 = (ulong *)((long)puVar11 + 2);
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
        if (puVar13 < puVar16) goto code_r0x0009c6c0;
        goto code_r0x0009e7f8;
      }
      puVar14 = (ulong *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = '\0';
      psVar37 = (short *)((long)unaff_x25 + 3);
      *(short *)puVar14 = (short)uVar30 - (short)uVar22;
      puVar29 = puVar11;
      if (puVar16 != puVar8) break;
code_r0x0009eb4c:
      puVar11 = (ulong *)((long)puVar29 + (lVar38 - (long)puVar6));
      puVar16 = puVar21;
      if (puVar11 <= puVar21) {
        puVar16 = puVar11;
      }
      puVar11 = (ulong *)((long)puVar29 + 4);
      puVar5 = (ulong *)((long)puVar6 + 4);
      puVar28 = (ulong *)((long)puVar16 - 7);
      if (puVar11 < puVar28) {
        uVar20 = *puVar11 ^ *puVar5;
        if (uVar20 == 0) {
          puVar24 = (ulong *)((long)puVar29 + 0xc);
          puVar5 = (ulong *)((long)puVar6 + 0xc);
          if (puVar24 < puVar28) goto code_r0x0009eba8;
          goto code_r0x0009eef8;
        }
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
      }
      else {
        puVar24 = puVar11;
        if (puVar11 < puVar28) {
code_r0x0009eba8:
          iVar25 = ((int)puVar24 - (int)puVar29) + -4;
          do {
            uVar20 = *puVar24 ^ *puVar5;
            if (uVar20 != 0) {
              uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
              uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
              uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                    iVar25);
              goto code_r0x0009ec48;
            }
            puVar24 = puVar24 + 1;
            puVar5 = puVar5 + 1;
            iVar25 = iVar25 + 8;
          } while (puVar24 < puVar28);
          if ((ulong *)((long)puVar16 - 3U) <= puVar24) goto code_r0x0009ef08;
code_r0x0009ebe4:
          if ((int)*puVar5 == (int)*puVar24) {
            puVar24 = (ulong *)((long)puVar24 + 4);
            puVar5 = (ulong *)((long)puVar5 + 4);
          }
          if (puVar24 < (ulong *)((long)puVar16 - 1U)) {
code_r0x0009ef14:
            if ((short)*puVar5 == (short)*puVar24) {
              puVar24 = (ulong *)((long)puVar24 + 2);
              puVar5 = (ulong *)((long)puVar5 + 2);
            }
          }
        }
        else {
code_r0x0009eef8:
          if (puVar24 < (ulong *)((long)puVar16 - 3U)) goto code_r0x0009ebe4;
code_r0x0009ef08:
          if (puVar24 < (ulong *)((long)puVar16 - 1U)) goto code_r0x0009ef14;
        }
        if (puVar24 < puVar16) {
          if ((char)*puVar5 == (char)*puVar24) {
            puVar24 = (ulong *)((long)puVar24 + 1);
          }
        }
        uVar20 = (ulong)(uint)((int)puVar24 - (int)puVar11);
      }
code_r0x0009ec48:
      puVar11 = (ulong *)((long)puVar29 + uVar20 + 4);
      if (puVar11 == puVar16) {
        puVar11 = puVar16;
        puVar5 = puVar7;
        if (puVar16 < puVar19) {
          uVar27 = *puVar16 ^ *puVar7;
          if (uVar27 == 0) {
            puVar11 = puVar16 + 1;
            puVar5 = param_3 + 1;
            goto code_r0x0009eca0;
          }
          uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
          uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
          uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
          uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
          uVar22 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
          unaff_w27 = *(uint *)(unaff_x29 + -0x70);
        }
        else {
code_r0x0009eca0:
          if (puVar11 < puVar19) {
            puVar29 = (ulong *)((long)puVar29 + (lVar38 - (long)puVar6));
            if (puVar21 <= puVar29) {
              puVar29 = puVar21;
            }
            iVar25 = (int)puVar11 - (int)puVar29;
            unaff_w27 = *(uint *)(unaff_x29 + -0x70);
            do {
              uVar27 = *puVar11 ^ *puVar5;
              if (uVar27 != 0) {
                uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
                uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
                uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
                uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
                uVar22 = (int)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3) + iVar25;
                goto code_r0x0009ed58;
              }
              puVar11 = puVar11 + 1;
              puVar5 = puVar5 + 1;
              iVar25 = iVar25 + 8;
            } while (puVar11 < puVar19);
          }
          else {
            unaff_w27 = *(uint *)(unaff_x29 + -0x70);
          }
          if (puVar11 < puVar23) {
            if ((int)*puVar5 == (int)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 4);
              puVar5 = (ulong *)((long)puVar5 + 4);
            }
          }
          if (puVar11 < puVar36) {
            if ((short)*puVar5 == (short)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 2);
              puVar5 = (ulong *)((long)puVar5 + 2);
            }
          }
          if (puVar11 < puVar21) {
            if ((char)*puVar5 == (char)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 1);
            }
          }
          uVar22 = (int)puVar11 - (int)puVar16;
        }
code_r0x0009ed58:
        uVar20 = (ulong)(uVar22 + (int)uVar20);
        puVar11 = (ulong *)((long)puVar16 + (ulong)uVar22);
      }
      else {
        unaff_w27 = *(uint *)(unaff_x29 + -0x70);
      }
    }
  } while( true );
code_r0x0009f0f0:
  puVar21 = puVar8;
  if (param_4 <= uVar17) {
    puVar21 = puVar7;
  }
  puVar36 = (ulong *)(lVar9 + uVar32);
  if ((puVar21 < puVar36) && (*(char *)((long)puVar16 - 1) == *(char *)((long)puVar36 - 1))) {
    puVar6 = (ulong *)((long)puVar16 - 1);
    puVar5 = (ulong *)(lVar9 + uVar32 + -1);
    do {
      puVar36 = puVar5;
      puVar16 = puVar6;
      if ((puVar36 <= puVar21) || (puVar16 <= puVar11)) break;
      puVar6 = (ulong *)((long)puVar16 + -1);
      puVar5 = (ulong *)((long)puVar36 + -1);
    } while (*(char *)((long)puVar16 + -1) == *(char *)((long)puVar36 + -1));
  }
  puVar6 = (ulong *)((long)unaff_x25 + 1);
  uVar20 = (long)puVar16 - (long)puVar11 & 0xffffffff;
  if (pcVar10 < (char *)((long)puVar6 + uVar20 / 0xff + uVar20 + 8)) goto LAB_0009d2b8;
  uVar30 = (uint)((long)puVar16 - (long)puVar11);
  uVar31 = uVar30 - 0xf;
  if (uVar30 < 0xf) {
    *(char *)unaff_x25 = (char)(uVar30 << 4);
  }
  else {
    *(char *)unaff_x25 = -0x10;
    puVar5 = puVar6;
    if (0xfe < uVar31) {
      uVar31 = ((int)puVar16 - (int)puVar11) - 0x10e;
      uVar27 = (ulong)uVar31 / 0xff;
      _memset(puVar6,0xff,uVar27 + 1);
      param_4 = *(uint *)(unaff_x29 + -0x80);
      puVar7 = *(ulong **)(unaff_x29 + -0x60);
      uVar31 = uVar31 + (int)uVar27;
      puVar5 = (ulong *)((long)unaff_x25 + uVar27 + 2);
    }
    puVar6 = (ulong *)((long)puVar5 + 1);
    *(char *)puVar5 = (char)uVar31;
  }
  puVar5 = (ulong *)((long)puVar6 + uVar20);
  puVar14 = puVar5;
  if (puVar5 <= puVar6 + 1) {
    puVar14 = puVar6 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar14 + ~(ulong)puVar6)) &&
     (0x3f < (ulong)((long)puVar6 - (long)puVar11))) {
    uVar20 = ((long)puVar14 + ~(ulong)puVar6 >> 3) + 1;
    uVar32 = uVar20 & 0x3ffffffffffffff8;
    puVar14 = puVar11 + 4;
    puVar28 = puVar6 + 4;
    uVar27 = uVar32;
    do {
      uVar39 = puVar14[-4];
      uVar41 = puVar14[-1];
      uVar40 = puVar14[-2];
      uVar43 = puVar14[1];
      uVar42 = *puVar14;
      uVar45 = puVar14[3];
      uVar44 = puVar14[2];
      puVar28[-3] = puVar14[-3];
      puVar28[-4] = uVar39;
      puVar28[-1] = uVar41;
      puVar28[-2] = uVar40;
      puVar28[1] = uVar43;
      *puVar28 = uVar42;
      puVar28[3] = uVar45;
      puVar28[2] = uVar44;
      uVar27 = uVar27 - 8;
      puVar14 = puVar14 + 8;
      puVar28 = puVar28 + 8;
    } while (uVar27 != 0);
    puVar11 = puVar11 + uVar32;
    puVar6 = puVar6 + uVar32;
    if (uVar20 == uVar32) goto code_r0x0009f258;
  }
  do {
    puVar14 = puVar6 + 1;
    *puVar6 = *puVar11;
    puVar11 = puVar11 + 1;
    puVar6 = puVar14;
  } while (puVar14 < puVar5);
code_r0x0009f258:
  psVar37 = (short *)((long)puVar5 + 2);
  *(short *)puVar5 = (short)uVar22 - (short)uVar17;
  puVar11 = puVar16;
  if (puVar21 == puVar8) goto LAB_0009f3b8;
LAB_0009f274:
  puVar21 = (ulong *)((long)puVar11 + 4);
  puVar6 = (ulong *)((long)puVar36 + 4);
  puVar16 = puVar21;
  if (puVar21 < puVar29) {
    uVar20 = *puVar21 ^ *puVar6;
    if (uVar20 != 0) {
      uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
      uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
      goto code_r0x0009f34c;
    }
    puVar6 = (ulong *)((long)puVar36 + 0xc);
    puVar16 = (ulong *)((long)puVar11 + 0xc);
  }
  if (puVar16 < puVar29) {
    iVar25 = ((int)puVar16 - (int)puVar11) + -4;
    do {
      uVar20 = *puVar16 ^ *puVar6;
      if (uVar20 != 0) {
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) + iVar25)
        ;
        goto code_r0x0009f34c;
      }
      puVar16 = puVar16 + 1;
      puVar6 = puVar6 + 1;
      iVar25 = iVar25 + 8;
    } while (puVar16 < puVar29);
  }
  if (puVar16 < puVar23) {
    if ((int)*puVar6 == (int)*puVar16) {
      puVar16 = (ulong *)((long)puVar16 + 4);
      puVar6 = (ulong *)((long)puVar6 + 4);
    }
    if (puVar16 < puVar19) goto code_r0x0009f37c;
code_r0x0009f314:
    if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009f320:
      if ((char)*puVar6 == (char)*puVar16) {
        puVar16 = (ulong *)((long)puVar16 + 1);
      }
    }
  }
  else {
    if (puVar19 <= puVar16) goto code_r0x0009f314;
code_r0x0009f37c:
    if ((short)*puVar6 == (short)*puVar16) {
      puVar16 = (ulong *)((long)puVar16 + 2);
      puVar6 = (ulong *)((long)puVar6 + 2);
    }
    if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009f320;
  }
  uVar20 = (ulong)(uint)((int)puVar16 - (int)puVar21);
code_r0x0009f34c:
  pcVar1 = (char *)((long)puVar5 + (ulong)((int)uVar20 + 0xf0) / 0xff + 8);
  puVar11 = (ulong *)((long)puVar11 + uVar20 + 4);
joined_r0x0009f368:
  if (pcVar1 <= pcVar10) {
    do {
      uVar31 = (uint)uVar20;
      uVar22 = uVar31 - 0xf;
      if (uVar31 < 0xf) {
        *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar20;
        unaff_x25 = psVar37;
      }
      else {
        *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
        psVar37[0] = -1;
        psVar37[1] = -1;
        if (0x3fb < uVar22) {
          uVar20 = (ulong)((uVar31 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar5 + 6),0xff,uVar20 + 4);
          param_4 = *(uint *)(unaff_x29 + -0x80);
          puVar7 = *(ulong **)(unaff_x29 + -0x60);
          uVar22 = (uVar31 - 0x40b) % 0x3fc;
          psVar37 = (short *)((long)puVar5 + 6 + uVar20);
        }
        uVar31 = (uVar22 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)psVar37 + (ulong)uVar31);
        *pcVar1 = (char)uVar22 + (char)uVar31;
        unaff_x25 = (short *)(pcVar1 + 1);
      }
      if (puVar13 <= puVar11) goto LAB_0009c948;
      *(int *)(unaff_x21 +
              ((ulong)(*(long *)((long)puVar11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar11 + -2) - iVar34;
      uVar31 = (int)puVar11 - iVar34;
      uVar20 = *puVar11 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar22 = *(uint *)(unaff_x21 + uVar20);
      puVar21 = puVar8;
      lVar9 = lVar35;
      if (param_4 <= uVar22) {
        puVar21 = puVar7;
        lVar9 = lVar12;
      }
      *(uint *)(unaff_x21 + uVar20) = uVar31;
      if ((uVar22 + 0xffff < uVar31) ||
         (puVar36 = (ulong *)(lVar9 + (ulong)uVar22), (int)*puVar36 != (int)*puVar11)) {
        puVar16 = (ulong *)((long)puVar11 + 1);
        uVar22 = (int)puVar16 - iVar34;
        puVar21 = (ulong *)((long)puVar11 + 2);
        if (puVar13 < puVar21) goto LAB_0009c948;
        goto code_r0x0009f084;
      }
      puVar5 = (ulong *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = '\0';
      psVar37 = (short *)((long)unaff_x25 + 3);
      *(short *)puVar5 = (short)uVar31 - (short)uVar22;
      if (puVar21 != puVar8) goto LAB_0009f274;
LAB_0009f3b8:
      puVar21 = (ulong *)((long)puVar11 + (*(long *)(unaff_x29 + -0x88) - (long)puVar36));
      puVar16 = *(ulong **)(unaff_x29 + -0x78);
      if (puVar21 <= *(ulong **)(unaff_x29 + -0x78)) {
        puVar16 = puVar21;
      }
      puVar21 = (ulong *)((long)puVar11 + 4);
      puVar6 = (ulong *)((long)puVar36 + 4);
      puVar14 = (ulong *)((long)puVar16 - 7);
      if (puVar21 < puVar14) {
        uVar20 = *puVar21 ^ *puVar6;
        if (uVar20 == 0) {
          puVar28 = (ulong *)((long)puVar11 + 0xc);
          puVar6 = (ulong *)((long)puVar36 + 0xc);
          if (puVar28 < puVar14) goto code_r0x0009f414;
          goto code_r0x0009f78c;
        }
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
      }
      else {
        puVar28 = puVar21;
        if (puVar21 < puVar14) {
code_r0x0009f414:
          iVar25 = ((int)puVar28 - (int)puVar11) + -4;
          do {
            uVar20 = *puVar28 ^ *puVar6;
            if (uVar20 != 0) {
              uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
              uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
              uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                    iVar25);
              goto code_r0x0009f4b4;
            }
            puVar28 = puVar28 + 1;
            puVar6 = puVar6 + 1;
            iVar25 = iVar25 + 8;
          } while (puVar28 < puVar14);
          if ((ulong *)((long)puVar16 - 3U) <= puVar28) goto code_r0x0009f79c;
code_r0x0009f450:
          if ((int)*puVar6 == (int)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 4);
            puVar6 = (ulong *)((long)puVar6 + 4);
          }
          if (puVar28 < (ulong *)((long)puVar16 - 1U)) {
code_r0x0009f7a8:
            if ((short)*puVar6 == (short)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 2);
              puVar6 = (ulong *)((long)puVar6 + 2);
            }
          }
        }
        else {
code_r0x0009f78c:
          if (puVar28 < (ulong *)((long)puVar16 - 3U)) goto code_r0x0009f450;
code_r0x0009f79c:
          if (puVar28 < (ulong *)((long)puVar16 - 1U)) goto code_r0x0009f7a8;
        }
        if (puVar28 < puVar16) {
          if ((char)*puVar6 == (char)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 1);
          }
        }
        uVar20 = (ulong)(uint)((int)puVar28 - (int)puVar21);
      }
code_r0x0009f4b4:
      puVar21 = (ulong *)((long)puVar11 + uVar20 + 4);
      if (puVar21 != puVar16) goto code_r0x0009f4c4;
      puVar21 = puVar16;
      puVar6 = puVar7;
      if (puVar16 < puVar29) {
        uVar27 = *puVar16 ^ *puVar7;
        if (uVar27 == 0) {
          puVar21 = puVar16 + 1;
          puVar6 = param_3 + 1;
          goto code_r0x0009f51c;
        }
        uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
        uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
        uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
        uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
        uVar22 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
      }
      else {
code_r0x0009f51c:
        if (puVar21 < puVar29) {
          uVar27 = (long)puVar11 + (*(long *)(unaff_x29 + -0x88) - (long)puVar36);
          if (*(ulong *)(unaff_x29 + -0x78) <= uVar27) {
            uVar27 = *(ulong *)(unaff_x29 + -0x78);
          }
          iVar25 = (int)puVar21 - (int)uVar27;
          do {
            uVar27 = *puVar21 ^ *puVar6;
            if (uVar27 != 0) {
              uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
              uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
              uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
              uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
              uVar22 = (int)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3) + iVar25;
              goto LAB_0009f5d0;
            }
            puVar21 = puVar21 + 1;
            puVar6 = puVar6 + 1;
            iVar25 = iVar25 + 8;
          } while (puVar21 < puVar29);
        }
        if (puVar21 < puVar23) {
          if ((int)*puVar6 == (int)*puVar21) {
            puVar21 = (ulong *)((long)puVar21 + 4);
            puVar6 = (ulong *)((long)puVar6 + 4);
          }
          if (puVar21 < puVar19) goto LAB_0009f754;
code_r0x0009f598:
          if (puVar21 < *(ulong **)(unaff_x29 + -0x78)) {
LAB_0009f5a4:
            if ((char)*puVar6 == (char)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 1);
            }
          }
        }
        else {
          if (puVar19 <= puVar21) goto code_r0x0009f598;
LAB_0009f754:
          if ((short)*puVar6 == (short)*puVar21) {
            puVar21 = (ulong *)((long)puVar21 + 2);
            puVar6 = (ulong *)((long)puVar6 + 2);
          }
          if (puVar21 < *(ulong **)(unaff_x29 + -0x78)) goto LAB_0009f5a4;
        }
        uVar22 = (int)puVar21 - (int)puVar16;
      }
LAB_0009f5d0:
      uVar31 = uVar22 + (int)uVar20;
      uVar20 = (ulong)uVar31;
      puVar11 = (ulong *)((long)puVar16 + (ulong)uVar22);
      if (pcVar10 < (char *)((long)puVar5 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) break;
    } while( true );
  }
  goto LAB_0009d2b8;
code_r0x0009f4c4:
  pcVar1 = (char *)((long)puVar5 + (ulong)((int)uVar20 + 0xf0) / 0xff + 8);
  puVar11 = puVar21;
  goto joined_r0x0009f368;
code_r0x0009cb50:
  puVar21 = puVar11;
  if (uVar22 <= uVar2) {
    puVar21 = puVar7;
  }
  puVar6 = (ulong *)(lVar9 + uVar32);
  if ((puVar21 < puVar6) && (*(char *)((long)puVar16 - 1) == *(char *)((long)puVar6 - 1))) {
    puVar5 = (ulong *)((long)puVar16 - 1);
    puVar14 = (ulong *)(lVar9 + uVar32 + -1);
    do {
      puVar6 = puVar14;
      puVar16 = puVar5;
      if ((puVar6 <= puVar21) || (puVar16 <= puVar29)) break;
      puVar5 = (ulong *)((long)puVar16 + -1);
      puVar14 = (ulong *)((long)puVar6 + -1);
    } while (*(char *)((long)puVar16 + -1) == *(char *)((long)puVar6 + -1));
  }
  puVar5 = (ulong *)((long)unaff_x25 + 1);
  uVar20 = (long)puVar16 - (long)puVar29 & 0xffffffff;
  if (pcVar10 < (char *)((long)puVar5 + uVar20 / 0xff + uVar20 + 8)) goto LAB_0009d2b8;
  uVar17 = (uint)((long)puVar16 - (long)puVar29);
  uVar30 = uVar17 - 0xf;
  if (uVar17 < 0xf) {
    *(char *)unaff_x25 = (char)(uVar17 << 4);
  }
  else {
    *(char *)unaff_x25 = -0x10;
    puVar14 = puVar5;
    if (0xfe < uVar30) {
      uVar30 = ((int)puVar16 - (int)puVar29) - 0x10e;
      uVar27 = (ulong)uVar30 / 0xff;
      _memset(puVar5,0xff,uVar27 + 1);
      pcVar10 = *(char **)(unaff_x29 + -0x88);
      puVar7 = *(ulong **)(unaff_x29 + -0x60);
      uVar30 = uVar30 + (int)uVar27;
      puVar14 = (ulong *)((long)unaff_x25 + uVar27 + 2);
    }
    puVar5 = (ulong *)((long)puVar14 + 1);
    *(char *)puVar14 = (char)uVar30;
  }
  puVar14 = (ulong *)((long)puVar5 + uVar20);
  puVar28 = puVar14;
  if (puVar14 <= puVar5 + 1) {
    puVar28 = puVar5 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar28 + ~(ulong)puVar5)) &&
     (0x3f < (ulong)((long)puVar5 - (long)puVar29))) {
    uVar20 = ((long)puVar28 + ~(ulong)puVar5 >> 3) + 1;
    uVar32 = uVar20 & 0x3ffffffffffffff8;
    puVar28 = puVar29 + 4;
    puVar24 = puVar5 + 4;
    uVar27 = uVar32;
    do {
      uVar39 = puVar28[-4];
      uVar41 = puVar28[-1];
      uVar40 = puVar28[-2];
      uVar43 = puVar28[1];
      uVar42 = *puVar28;
      uVar45 = puVar28[3];
      uVar44 = puVar28[2];
      puVar24[-3] = puVar28[-3];
      puVar24[-4] = uVar39;
      puVar24[-1] = uVar41;
      puVar24[-2] = uVar40;
      puVar24[1] = uVar43;
      *puVar24 = uVar42;
      puVar24[3] = uVar45;
      puVar24[2] = uVar44;
      uVar27 = uVar27 - 8;
      puVar28 = puVar28 + 8;
      puVar24 = puVar24 + 8;
    } while (uVar27 != 0);
    puVar29 = puVar29 + uVar32;
    puVar5 = puVar5 + uVar32;
    if (uVar20 == uVar32) goto code_r0x0009ccc8;
  }
  do {
    puVar28 = puVar5 + 1;
    *puVar5 = *puVar29;
    puVar29 = puVar29 + 1;
    puVar5 = puVar28;
  } while (puVar28 < puVar14);
code_r0x0009ccc8:
  psVar37 = (short *)((long)puVar14 + 2);
  *(short *)puVar14 = (short)uVar31 - (short)uVar2;
  puVar29 = puVar16;
  if (puVar21 == puVar11) goto code_r0x0009ce28;
  do {
    puVar21 = (ulong *)((long)puVar29 + 4);
    puVar5 = (ulong *)((long)puVar6 + 4);
    puVar16 = puVar21;
    if (puVar21 < puVar36) {
      uVar20 = *puVar21 ^ *puVar5;
      if (uVar20 == 0) {
        puVar5 = (ulong *)((long)puVar6 + 0xc);
        puVar16 = (ulong *)((long)puVar29 + 0xc);
        goto joined_r0x0009ce20;
      }
      uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
      uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
    }
    else {
joined_r0x0009ce20:
      if (puVar16 < puVar36) {
        iVar25 = ((int)puVar16 - (int)puVar29) + -4;
        do {
          uVar20 = *puVar16 ^ *puVar5;
          if (uVar20 != 0) {
            uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
            uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
            uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                  iVar25);
            goto code_r0x0009cdbc;
          }
          puVar16 = puVar16 + 1;
          puVar5 = puVar5 + 1;
          iVar25 = iVar25 + 8;
        } while (puVar16 < puVar36);
      }
      if (puVar16 < puVar23) {
        if ((int)*puVar5 == (int)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 4);
          puVar5 = (ulong *)((long)puVar5 + 4);
        }
        if (puVar16 < puVar19) goto code_r0x0009cdec;
code_r0x0009cd84:
        if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009cd90:
          if ((char)*puVar5 == (char)*puVar16) {
            puVar16 = (ulong *)((long)puVar16 + 1);
          }
        }
      }
      else {
        if (puVar19 <= puVar16) goto code_r0x0009cd84;
code_r0x0009cdec:
        if ((short)*puVar5 == (short)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 2);
          puVar5 = (ulong *)((long)puVar5 + 2);
        }
        if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009cd90;
      }
      uVar20 = (ulong)(uint)((int)puVar16 - (int)puVar21);
    }
code_r0x0009cdbc:
    puVar29 = (ulong *)((long)puVar29 + uVar20 + 4);
    if (pcVar10 < (char *)((long)puVar14 + (ulong)((int)uVar20 + 0xf0) / 0xff + 8))
    goto LAB_0009d2b8;
    while( true ) {
      uVar30 = (uint)uVar20;
      uVar31 = uVar30 - 0xf;
      if (uVar30 < 0xf) {
        *(char *)unaff_x25 = (char)*unaff_x25 + (char)uVar20;
        unaff_x25 = psVar37;
      }
      else {
        *(char *)unaff_x25 = (char)*unaff_x25 + '\x0f';
        psVar37[0] = -1;
        psVar37[1] = -1;
        if (0x3fb < uVar31) {
          uVar20 = (ulong)((uVar30 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar14 + 6),0xff,uVar20 + 4);
          pcVar10 = *(char **)(unaff_x29 + -0x88);
          puVar7 = *(ulong **)(unaff_x29 + -0x60);
          uVar31 = (uVar30 - 0x40b) % 0x3fc;
          psVar37 = (short *)((long)puVar14 + 6 + uVar20);
        }
        uVar30 = (uVar31 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)psVar37 + (ulong)uVar30);
        unaff_x25 = (short *)(pcVar1 + 1);
        *pcVar1 = (char)uVar31 + (char)uVar30;
      }
      if (puVar13 <= puVar29) goto code_r0x0009d28c;
      *(int *)(unaff_x21 +
              ((ulong)(*(long *)((long)puVar29 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar29 + -2) - iVar34;
      uVar30 = (int)puVar29 - iVar34;
      uVar20 = *puVar29 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar31 = *(uint *)(unaff_x21 + uVar20);
      puVar21 = puVar11;
      lVar9 = lVar35;
      if (uVar22 <= uVar31) {
        puVar21 = puVar7;
        lVar9 = lVar38;
      }
      *(uint *)(unaff_x21 + uVar20) = uVar30;
      if ((uVar31 + 0xffff < uVar30) ||
         (puVar6 = (ulong *)(lVar9 + (ulong)uVar31), (int)*puVar6 != (int)*puVar29)) {
        puVar16 = (ulong *)((long)puVar29 + 1);
        uVar31 = (int)puVar16 - iVar34;
        puVar21 = (ulong *)((long)puVar29 + 2);
        if (puVar13 < puVar21) goto code_r0x0009d28c;
        goto code_r0x0009cae8;
      }
      puVar14 = (ulong *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = '\0';
      psVar37 = (short *)((long)unaff_x25 + 3);
      *(short *)puVar14 = (short)uVar30 - (short)uVar31;
      if (puVar21 != puVar11) break;
code_r0x0009ce28:
      puVar21 = (ulong *)((long)puVar29 + (*(long *)(unaff_x29 + -0x80) - (long)puVar6));
      puVar16 = *(ulong **)(unaff_x29 + -0x78);
      if (puVar21 <= *(ulong **)(unaff_x29 + -0x78)) {
        puVar16 = puVar21;
      }
      puVar21 = (ulong *)((long)puVar29 + 4);
      puVar5 = (ulong *)((long)puVar6 + 4);
      puVar28 = (ulong *)((long)puVar16 - 7);
      if (puVar21 < puVar28) {
        uVar20 = *puVar21 ^ *puVar5;
        if (uVar20 == 0) {
          puVar24 = (ulong *)((long)puVar29 + 0xc);
          puVar5 = (ulong *)((long)puVar6 + 0xc);
          if (puVar24 < puVar28) goto code_r0x0009ce80;
          goto code_r0x0009d204;
        }
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
      }
      else {
        puVar24 = puVar21;
        if (puVar21 < puVar28) {
code_r0x0009ce80:
          iVar25 = ((int)puVar24 - (int)puVar29) + -4;
          do {
            uVar20 = *puVar24 ^ *puVar5;
            if (uVar20 != 0) {
              uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
              uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
              uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                    iVar25);
              goto code_r0x0009cf20;
            }
            puVar24 = puVar24 + 1;
            puVar5 = puVar5 + 1;
            iVar25 = iVar25 + 8;
          } while (puVar24 < puVar28);
          if ((ulong *)((long)puVar16 - 3U) <= puVar24) goto code_r0x0009d214;
code_r0x0009cebc:
          if ((int)*puVar5 == (int)*puVar24) {
            puVar24 = (ulong *)((long)puVar24 + 4);
            puVar5 = (ulong *)((long)puVar5 + 4);
          }
          if (puVar24 < (ulong *)((long)puVar16 - 1U)) {
code_r0x0009d220:
            if ((short)*puVar5 == (short)*puVar24) {
              puVar24 = (ulong *)((long)puVar24 + 2);
              puVar5 = (ulong *)((long)puVar5 + 2);
            }
          }
        }
        else {
code_r0x0009d204:
          if (puVar24 < (ulong *)((long)puVar16 - 3U)) goto code_r0x0009cebc;
code_r0x0009d214:
          if (puVar24 < (ulong *)((long)puVar16 - 1U)) goto code_r0x0009d220;
        }
        if (puVar24 < puVar16) {
          if ((char)*puVar5 == (char)*puVar24) {
            puVar24 = (ulong *)((long)puVar24 + 1);
          }
        }
        uVar20 = (ulong)(uint)((int)puVar24 - (int)puVar21);
      }
code_r0x0009cf20:
      puVar21 = (ulong *)((long)puVar29 + uVar20 + 4);
      uVar31 = (uint)uVar20;
      if (puVar21 == puVar16) {
        puVar21 = puVar16;
        puVar5 = puVar7;
        if (puVar16 < puVar36) {
          uVar20 = *puVar16 ^ *puVar7;
          if (uVar20 == 0) {
            puVar21 = puVar16 + 1;
            puVar5 = puVar8 + 1;
            goto code_r0x0009cf88;
          }
          uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
          uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
          uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
          uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
          uVar30 = (uint)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3);
        }
        else {
code_r0x0009cf88:
          if (puVar21 < puVar36) {
            uVar20 = (long)puVar29 + (*(long *)(unaff_x29 + -0x80) - (long)puVar6);
            if (*(ulong *)(unaff_x29 + -0x78) <= uVar20) {
              uVar20 = *(ulong *)(unaff_x29 + -0x78);
            }
            iVar25 = (int)puVar21 - (int)uVar20;
            do {
              uVar20 = *puVar21 ^ *puVar5;
              if (uVar20 != 0) {
                uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
                uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
                uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
                uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
                uVar30 = (int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) + iVar25;
                goto code_r0x0009d038;
              }
              puVar21 = puVar21 + 1;
              puVar5 = puVar5 + 1;
              iVar25 = iVar25 + 8;
            } while (puVar21 < puVar36);
          }
          if (puVar21 < puVar23) {
            if ((int)*puVar5 == (int)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 4);
              puVar5 = (ulong *)((long)puVar5 + 4);
            }
            if (puVar21 < puVar19) goto code_r0x0009d1cc;
code_r0x0009d000:
            if (puVar21 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009d00c:
              if ((char)*puVar5 == (char)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 1);
              }
            }
          }
          else {
            if (puVar19 <= puVar21) goto code_r0x0009d000;
code_r0x0009d1cc:
            if ((short)*puVar5 == (short)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 2);
              puVar5 = (ulong *)((long)puVar5 + 2);
            }
            if (puVar21 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009d00c;
          }
          uVar30 = (int)puVar21 - (int)puVar16;
        }
code_r0x0009d038:
        uVar31 = uVar30 + uVar31;
        uVar20 = (ulong)uVar31;
        puVar21 = (ulong *)((long)puVar16 + (ulong)uVar30);
      }
      puVar29 = puVar21;
      if (pcVar10 < (char *)((long)puVar14 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) goto LAB_0009d2b8;
    }
  } while( true );
code_r0x0009d28c:
  uVar20 = (long)puVar8 + (uVar18 - (long)puVar29);
  if ((char *)((long)unaff_x25 + (uVar20 + 0xf0) / 0xff + uVar20 + 1) <= pcVar10) {
    uVar27 = uVar20 - 0xf;
    if (uVar20 < 0xf) {
      *(char *)unaff_x25 = (char)((int)uVar20 << 4);
      unaff_w27 = *(uint *)(unaff_x29 + -0x70);
    }
    else {
      psVar37 = (short *)((long)unaff_x25 + 1);
      *(char *)unaff_x25 = -0x10;
      if (0xfe < uVar27) {
        uVar27 = (long)puVar7 + (uVar18 - (long)puVar29) + -0x10e;
        uVar18 = uVar27 / 0xff;
        _memset(psVar37,0xff,uVar18 + 1);
        uVar27 = uVar27 % 0xff;
        psVar37 = (short *)((long)unaff_x25 + uVar18 + 2);
      }
      unaff_w27 = *(uint *)(unaff_x29 + -0x70);
      *(char *)psVar37 = (char)uVar27;
      unaff_x25 = psVar37;
    }
    _memcpy((char *)((long)unaff_x25 + 1),puVar29,uVar20);
    iVar4 = ((int)(char *)((long)unaff_x25 + 1) + (int)uVar20) - iVar4;
    unaff_x26 = *(uint **)(unaff_x29 + -0x68);
    puVar7 = *(ulong **)(unaff_x29 + -0x60);
    goto LAB_0009f8a0;
  }
LAB_0009d2b8:
  iVar4 = 0;
  unaff_w27 = *(uint *)(unaff_x29 + -0x70);
  unaff_x26 = *(uint **)(unaff_x29 + -0x68);
LAB_0009f8a0:
  *(ulong **)(unaff_x21 + 0x4000) = puVar7;
  unaff_x26[2] = unaff_w27;
  return iVar4;
}

