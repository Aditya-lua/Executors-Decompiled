
int FUN_0009dd70(long *param_1,undefined8 param_2,long param_3,int param_4,ulong param_5)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  int *piVar4;
  undefined1 in_ZR;
  undefined1 in_CY;
  long *plVar6;
  long *plVar5;
  long *plVar7;
  uint uVar8;
  long *in_x9;
  ulong uVar9;
  uint in_w10;
  uint uVar10;
  uint in_w11;
  ulong *puVar11;
  long in_x12;
  ulong *puVar12;
  int iVar13;
  ulong uVar14;
  long *plVar15;
  uint in_w16;
  long in_x17;
  char *unaff_x19;
  int *piVar16;
  long unaff_x21;
  short *unaff_x22;
  short *psVar17;
  long *unaff_x23;
  int iVar18;
  long unaff_x24;
  ulong uVar19;
  long *unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  
  do {
    if ((bool)in_CY && !(bool)in_ZR) {
LAB_0009c5e0:
      uVar9 = *(long *)(unaff_x29 + -0x78) - (long)unaff_x23;
      if (unaff_x19 < (char *)((long)unaff_x22 + (uVar9 + 0xf0) / 0xff + uVar9 + 1)) {
LAB_0009e6d8:
        in_stack_00000078 = 0;
      }
      else {
        uVar14 = uVar9 - 0xf;
        if (uVar9 < 0xf) {
          *(char *)unaff_x22 = (char)((int)uVar9 << 4);
        }
        else {
          psVar17 = (short *)((long)unaff_x22 + 1);
          *(char *)unaff_x22 = -0x10;
          if (0xfe < uVar14) {
            uVar14 = ((param_3 + in_stack_00000090) - (long)unaff_x23) - 0x10e;
            uVar19 = uVar14 / 0xff;
            _memset(psVar17,0xff,uVar19 + 1);
            uVar14 = uVar14 % 0xff;
            psVar17 = (short *)((long)unaff_x22 + uVar19 + 2);
          }
          *(char *)psVar17 = (char)uVar14;
          unaff_x22 = psVar17;
        }
        _memcpy((char *)((long)unaff_x22 + 1),unaff_x23,uVar9);
        in_stack_00000078 = ((int)(char *)((long)unaff_x22 + 1) + (int)uVar9) - in_stack_00000078;
      }
      return in_stack_00000078;
    }
code_r0x0009dd74:
    uVar14 = (ulong)(in_x12 * in_x17) >> 0x32 & 0x3ffc;
    uVar8 = *(uint *)(unaff_x21 + uVar14);
    uVar9 = (ulong)uVar8;
    iVar18 = (int)unaff_x24;
    uVar10 = (int)param_1 - iVar18;
    in_x12 = *in_x9;
    *(uint *)(unaff_x21 + uVar14) = uVar10;
    if ((in_w16 <= uVar8 && uVar10 <= uVar8 + param_4) &&
       (*(int *)(unaff_x24 + uVar9) == (int)*param_1)) {
      piVar16 = (int *)(unaff_x24 + uVar9);
      if ((*(int **)(unaff_x29 + -0x88) < piVar16) &&
         (*(char *)((long)param_1 - 1) == *(char *)((long)piVar16 - 1))) {
        piVar4 = (int *)(in_stack_00000050 + uVar9);
        plVar5 = (long *)((long)param_1 - 1U);
        plVar6 = (long *)((long)param_1 - 1U);
        do {
          plVar7 = plVar6;
          param_1 = plVar5;
          piVar16 = piVar4;
          if ((piVar16 <= *(int **)(unaff_x29 + -0x88)) || (param_1 <= unaff_x23)) break;
          piVar4 = (int *)((long)piVar16 + -1);
          plVar5 = (long *)((long)param_1 + -1);
          plVar6 = (long *)((long)plVar7 - 1);
        } while (*(char *)((long)param_1 + -1) == *(char *)((long)piVar16 + -1));
      }
      else {
        plVar7 = param_1;
      }
      plVar5 = (long *)((long)unaff_x22 + 1);
      uVar9 = (long)plVar7 - (long)unaff_x23 & 0xffffffff;
      if ((char *)((long)plVar5 + (uVar9 * (param_5 & 0xffffffff) >> 0x27) + uVar9 + 8) <= unaff_x19
         ) {
        uVar10 = (uint)((long)plVar7 - (long)unaff_x23);
        uVar8 = uVar10 - 0xf;
        if (uVar10 < 0xf) {
          *(char *)unaff_x22 = (char)(uVar10 << 4);
        }
        else {
          *(char *)unaff_x22 = -0x10;
          plVar6 = plVar5;
          if (0xfe < uVar8) {
            uVar8 = ((int)plVar7 - (int)unaff_x23) - 0x10e;
            uVar14 = (ulong)uVar8 * (param_5 & 0xffffffff);
            uVar19 = uVar14 >> 0x27;
            *(long **)(unaff_x29 + -0x68) = param_1;
            _memset(plVar5,0xff,uVar19 + 1);
            param_1 = *(long **)(unaff_x29 + -0x68);
            param_3 = *(long *)(unaff_x29 + -0x60);
            param_5 = 0x80808081;
            param_4 = 0xffff;
            in_x17 = -0x30e4432345000000;
            uVar8 = uVar8 + (uint)(uVar14 >> 0x27);
            plVar6 = (long *)((long)unaff_x22 + uVar19 + 2);
          }
          plVar5 = (long *)((long)plVar6 + 1);
          *(char *)plVar6 = (char)uVar8;
        }
        plVar7 = (long *)((long)plVar5 + uVar9);
        plVar6 = plVar7;
        if (plVar7 <= plVar5 + 1) {
          plVar6 = plVar5 + 1;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar6 + ~(ulong)plVar5)) &&
           (0x3f < (ulong)((long)plVar5 - (long)unaff_x23))) {
          uVar9 = ((long)plVar6 + ~(ulong)plVar5 >> 3) + 1;
          uVar19 = uVar9 & 0x3ffffffffffffff8;
          plVar6 = unaff_x23 + 4;
          plVar15 = plVar5 + 4;
          uVar14 = uVar19;
          do {
            lVar20 = plVar6[-4];
            lVar22 = plVar6[-1];
            lVar21 = plVar6[-2];
            lVar24 = plVar6[1];
            lVar23 = *plVar6;
            lVar26 = plVar6[3];
            lVar25 = plVar6[2];
            plVar15[-3] = plVar6[-3];
            plVar15[-4] = lVar20;
            plVar15[-1] = lVar22;
            plVar15[-2] = lVar21;
            plVar15[1] = lVar24;
            *plVar15 = lVar23;
            plVar15[3] = lVar26;
            plVar15[2] = lVar25;
            uVar14 = uVar14 - 8;
            plVar6 = plVar6 + 8;
            plVar15 = plVar15 + 8;
          } while (uVar14 != 0);
          unaff_x23 = unaff_x23 + uVar19;
          plVar5 = plVar5 + uVar19;
          if (uVar9 == uVar19) goto LAB_0009df0c;
        }
        do {
          plVar6 = plVar5 + 1;
          *plVar5 = *unaff_x23;
          unaff_x23 = unaff_x23 + 1;
          plVar5 = plVar6;
        } while (plVar6 < plVar7);
LAB_0009df0c:
        do {
          psVar17 = (short *)((long)plVar7 + 2);
          *(short *)plVar7 = (short)param_1 - (short)piVar16;
          puVar1 = (ulong *)((long)param_1 + 4);
          puVar12 = (ulong *)(piVar16 + 1);
          puVar11 = puVar1;
          if (puVar1 < unaff_x28) {
            uVar9 = *puVar1 ^ *puVar12;
            if (uVar9 == 0) {
              puVar12 = (ulong *)(piVar16 + 3);
              puVar11 = (ulong *)((long)param_1 + 0xc);
              goto joined_r0x0009e178;
            }
            uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
            uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
            uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
            uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
            uVar8 = (uint)((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3);
          }
          else {
joined_r0x0009e178:
            if (puVar11 < unaff_x28) {
              iVar13 = ((int)puVar11 - (int)param_1) + -4;
              do {
                uVar9 = *puVar11 ^ *puVar12;
                if (uVar9 != 0) {
                  uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
                  uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
                  uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
                  uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
                  uVar8 = (int)((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) + iVar13;
                  goto LAB_0009dff8;
                }
                puVar11 = puVar11 + 1;
                puVar12 = puVar12 + 1;
                iVar13 = iVar13 + 8;
              } while (puVar11 < unaff_x28);
            }
            if (puVar11 < in_stack_00000060) {
              if ((int)*puVar12 == (int)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 4);
                puVar12 = (ulong *)((long)puVar12 + 4);
              }
            }
            if (puVar11 < in_stack_00000058) {
              if ((short)*puVar12 == (short)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 2);
                puVar12 = (ulong *)((long)puVar12 + 2);
              }
            }
            if (puVar11 < in_stack_00000068) {
              if ((char)*puVar12 == (char)*puVar11) {
                puVar11 = (ulong *)((long)puVar11 + 1);
              }
            }
            uVar8 = (int)puVar11 - (int)puVar1;
          }
LAB_0009dff8:
          if (unaff_x19 <
              (char *)((long)plVar7 + ((ulong)(uVar8 + 0xf0) * (param_5 & 0xffffffff) >> 0x27) + 8))
          break;
          uVar10 = uVar8 - 0xf;
          if (uVar8 < 0xf) {
            *(char *)unaff_x22 = (char)*unaff_x22 + (char)uVar8;
            unaff_x22 = psVar17;
          }
          else {
            *(char *)unaff_x22 = (char)*unaff_x22 + '\x0f';
            psVar17[0] = -1;
            psVar17[1] = -1;
            if (0x3fb < uVar10) {
              *(short **)(unaff_x29 + -0x68) = (short *)((long)plVar7 + 6);
              uVar10 = (uint)((ulong)(uVar8 - 0x40b) * (param_5 & 0xffffffff) >> 0x29);
              uVar9 = (ulong)(uVar10 << 2);
              _memset((short *)((long)plVar7 + 6),0xff,uVar9 + 4);
              param_5 = 0x80808081;
              param_4 = 0xffff;
              in_x17 = -0x30e4432345000000;
              uVar10 = (uVar8 - 0x40b) + uVar10 * -0x3fc;
              unaff_x19 = *(char **)(unaff_x29 + -0x70);
              param_3 = *(long *)(unaff_x29 + -0x60);
              psVar17 = (short *)(*(long *)(unaff_x29 + -0x68) + uVar9);
            }
            uVar3 = (uVar10 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar17 + (ulong)uVar3);
            *pcVar2 = (char)uVar10 + (char)uVar3;
            unaff_x22 = (short *)(pcVar2 + 1);
          }
          unaff_x23 = (long *)((long)param_1 + (ulong)uVar8 + 4);
          if (unaff_x27 <= unaff_x23) goto LAB_0009c5e0;
          plVar7 = (long *)((long)param_1 + (ulong)uVar8 + 2);
          *(int *)(unaff_x21 + ((ulong)(*plVar7 * in_x17) >> 0x32 & 0x3ffc)) = (int)plVar7 - iVar18;
          uVar9 = (ulong)(*unaff_x23 * in_x17) >> 0x32 & 0x3ffc;
          uVar10 = *(uint *)(unaff_x21 + uVar9);
          uVar3 = (int)unaff_x23 - iVar18;
          *(uint *)(unaff_x21 + uVar9) = uVar3;
          if ((uVar10 < in_w16 || uVar10 + param_4 < uVar3) ||
             (piVar16 = (int *)(unaff_x24 + (ulong)uVar10), *piVar16 != (int)*unaff_x23))
          goto LAB_0009dd38;
          plVar7 = (long *)((long)unaff_x22 + 1);
          *(char *)unaff_x22 = '\0';
          param_1 = unaff_x23;
        } while( true );
      }
      goto LAB_0009e6d8;
    }
    plVar7 = (long *)((long)in_x9 + (ulong)in_w10);
    in_w10 = in_w11 >> 6;
    in_w11 = in_w11 + 1;
    in_CY = unaff_x27 <= plVar7;
    in_ZR = plVar7 == unaff_x27;
    param_1 = in_x9;
    in_x9 = plVar7;
  } while( true );
LAB_0009dd38:
  in_x9 = (long *)((long)param_1 + (ulong)uVar8 + 6);
  in_w11 = *(uint *)(unaff_x29 + -0x80);
  if (unaff_x27 < in_x9) goto LAB_0009c5e0;
  param_1 = (long *)((long)param_1 + (ulong)uVar8 + 5);
  in_x12 = *param_1;
  in_w10 = in_stack_00000080._4_4_;
  goto code_r0x0009dd74;
}

