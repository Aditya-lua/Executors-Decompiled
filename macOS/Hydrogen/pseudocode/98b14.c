
int FUN_00098b14(long *param_1,undefined8 param_2,int param_3,uint param_4)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  int *piVar4;
  long *plVar5;
  ulong uVar6;
  long *plVar7;
  uint uVar8;
  long *plVar9;
  ulong in_x9;
  uint in_w10;
  uint uVar10;
  uint in_w11;
  ulong *puVar11;
  long in_x12;
  ulong *puVar12;
  int iVar13;
  long *in_x13;
  long *plVar14;
  long *plVar15;
  uint in_w15;
  long *in_x16;
  long unaff_x19;
  int *piVar16;
  long unaff_x21;
  long *unaff_x22;
  short *unaff_x23;
  short *psVar17;
  ulong *unaff_x24;
  int iVar18;
  long unaff_x25;
  ulong uVar19;
  char *unaff_x27;
  ulong uVar20;
  long unaff_x29;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  long in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
code_r0x00098b14:
  iVar18 = (int)unaff_x25;
  if ((in_w15 <= (uint)((int)in_x9 + param_3)) && (*(int *)(unaff_x25 + in_x9) == (int)*param_1)) {
    piVar16 = (int *)(unaff_x25 + in_x9);
    if ((*(int **)(unaff_x29 + -0x58) < piVar16) &&
       (*(char *)((long)param_1 - 1) == *(char *)((long)piVar16 - 1))) {
      piVar4 = (int *)(in_stack_00000010 + in_x9);
      plVar5 = (long *)((long)param_1 - 1U);
      plVar7 = (long *)((long)param_1 - 1U);
      do {
        param_1 = plVar7;
        plVar9 = plVar5;
        piVar16 = piVar4;
        if ((piVar16 <= *(int **)(unaff_x29 + -0x58)) || (plVar9 <= unaff_x22)) break;
        piVar4 = (int *)((long)piVar16 + -1);
        plVar5 = (long *)((long)plVar9 + -1);
        plVar7 = (long *)((long)param_1 - 1);
      } while (*(char *)((long)plVar9 + -1) == *(char *)((long)piVar16 + -1));
    }
    else {
      plVar9 = param_1;
    }
    plVar5 = (long *)((long)unaff_x23 + 1);
    uVar19 = (long)param_1 - (long)unaff_x22 & 0xffffffff;
    if ((char *)((long)plVar5 + (uVar19 * param_4 >> 0x27) + uVar19 + 8) <= unaff_x27) {
      uVar10 = (uint)((long)param_1 - (long)unaff_x22);
      uVar8 = uVar10 - 0xf;
      if (uVar10 < 0xf) {
        *(char *)unaff_x23 = (char)(uVar10 << 4);
      }
      else {
        *(char *)unaff_x23 = -0x10;
        plVar7 = plVar5;
        if (0xfe < uVar8) {
          uVar8 = ((int)param_1 - (int)unaff_x22) - 0x10e;
          uVar6 = (ulong)uVar8 * (ulong)param_4;
          uVar20 = uVar6 >> 0x27;
          _memset(plVar5,0xff,uVar20 + 1);
          param_4 = 0x80808081;
          param_3 = 0xffff;
          uVar8 = uVar8 + (uint)(uVar6 >> 0x27);
          plVar7 = (long *)((long)unaff_x23 + uVar20 + 2);
        }
        plVar5 = (long *)((long)plVar7 + 1);
        *(char *)plVar7 = (char)uVar8;
      }
      plVar7 = (long *)((long)plVar5 + uVar19);
      plVar14 = plVar7;
      if (plVar7 <= plVar5 + 1) {
        plVar14 = plVar5 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar14 + ~(ulong)plVar5)) &&
         (0x3f < (ulong)((long)plVar5 - (long)unaff_x22))) {
        uVar19 = ((long)plVar14 + ~(ulong)plVar5 >> 3) + 1;
        uVar20 = uVar19 & 0x3ffffffffffffff8;
        plVar14 = unaff_x22 + 4;
        plVar15 = plVar5 + 4;
        uVar6 = uVar20;
        do {
          lVar21 = plVar14[-4];
          lVar23 = plVar14[-1];
          lVar22 = plVar14[-2];
          lVar25 = plVar14[1];
          lVar24 = *plVar14;
          lVar27 = plVar14[3];
          lVar26 = plVar14[2];
          plVar15[-3] = plVar14[-3];
          plVar15[-4] = lVar21;
          plVar15[-1] = lVar23;
          plVar15[-2] = lVar22;
          plVar15[1] = lVar25;
          *plVar15 = lVar24;
          plVar15[3] = lVar27;
          plVar15[2] = lVar26;
          uVar6 = uVar6 - 8;
          plVar14 = plVar14 + 8;
          plVar15 = plVar15 + 8;
        } while (uVar6 != 0);
        unaff_x22 = unaff_x22 + uVar20;
        plVar5 = plVar5 + uVar20;
        if (uVar19 == uVar20) goto code_r0x00098c74;
      }
      do {
        plVar14 = plVar5 + 1;
        *plVar5 = *unaff_x22;
        unaff_x22 = unaff_x22 + 1;
        plVar5 = plVar14;
      } while (plVar14 < plVar7);
code_r0x00098c74:
      unaff_x22 = plVar9;
      do {
        psVar17 = (short *)((long)plVar7 + 2);
        *(short *)plVar7 = (short)unaff_x22 - (short)piVar16;
        puVar1 = (ulong *)((long)unaff_x22 + 4);
        puVar12 = (ulong *)(piVar16 + 1);
        puVar11 = puVar1;
        if (puVar1 < unaff_x24) {
          uVar19 = *puVar1 ^ *puVar12;
          if (uVar19 == 0) {
            puVar12 = (ulong *)(piVar16 + 3);
            puVar11 = (ulong *)((long)unaff_x22 + 0xc);
            goto joined_r0x00098ee8;
          }
          uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
          uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
          uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
          uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
          uVar8 = (uint)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3);
        }
        else {
joined_r0x00098ee8:
          if (puVar11 < unaff_x24) {
            iVar13 = ((int)puVar11 - (int)unaff_x22) + -4;
            do {
              uVar19 = *puVar11 ^ *puVar12;
              if (uVar19 != 0) {
                uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
                uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
                uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
                uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
                uVar8 = (int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) + iVar13;
                goto code_r0x00098d60;
              }
              puVar11 = puVar11 + 1;
              puVar12 = puVar12 + 1;
              iVar13 = iVar13 + 8;
            } while (puVar11 < unaff_x24);
          }
          if (puVar11 < in_stack_00000028) {
            if ((int)*puVar12 == (int)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 4);
              puVar12 = (ulong *)((long)puVar12 + 4);
            }
          }
          if (puVar11 < in_stack_00000020) {
            if ((short)*puVar12 == (short)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 2);
              puVar12 = (ulong *)((long)puVar12 + 2);
            }
          }
          if (puVar11 < in_stack_00000030) {
            if ((char)*puVar12 == (char)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 1);
            }
          }
          uVar8 = (int)puVar11 - (int)puVar1;
        }
code_r0x00098d60:
        if (unaff_x27 <
            (char *)((long)plVar7 + ((ulong)(uVar8 + 0xf0) * (ulong)param_4 >> 0x27) + 8)) break;
        uVar10 = uVar8 - 0xf;
        if (uVar8 < 0xf) {
          *(char *)unaff_x23 = (char)*unaff_x23 + (char)uVar8;
          unaff_x23 = psVar17;
        }
        else {
          *(char *)unaff_x23 = (char)*unaff_x23 + '\x0f';
          psVar17[0] = -1;
          psVar17[1] = -1;
          if (0x3fb < uVar10) {
            uVar10 = (uint)((ulong)(uVar8 - 0x40b) * (ulong)param_4 >> 0x29);
            uVar19 = (ulong)(uVar10 << 2);
            _memset((short *)((long)plVar7 + 6),0xff,uVar19 + 4);
            param_4 = 0x80808081;
            param_3 = 0xffff;
            uVar10 = (uVar8 - 0x40b) + uVar10 * -0x3fc;
            unaff_x21 = *(long *)(unaff_x29 + -0x60);
            unaff_x19 = -0x30e4432345000000;
            psVar17 = (short *)((long)plVar7 + 6 + uVar19);
          }
          uVar3 = (uVar10 & 0xffff) / 0xff;
          pcVar2 = (char *)((long)psVar17 + (ulong)uVar3);
          unaff_x23 = (short *)(pcVar2 + 1);
          *pcVar2 = (char)uVar10 + (char)uVar3;
        }
        unaff_x22 = (long *)((long)unaff_x22 + (ulong)uVar8 + 4);
        if (in_x16 <= unaff_x22) goto LAB_00098f40;
        *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x22 + -2) * unaff_x19) >> 0x32 & 0x3ffc)
                ) = (int)(long *)((long)unaff_x22 + -2) - iVar18;
        uVar10 = (int)unaff_x22 - iVar18;
        uVar19 = (ulong)(*unaff_x22 * unaff_x19) >> 0x32 & 0x3ffc;
        uVar8 = *(uint *)(unaff_x21 + uVar19);
        *(uint *)(unaff_x21 + uVar19) = uVar10;
        if ((uVar8 + param_3 < uVar10) ||
           (piVar16 = (int *)(unaff_x25 + (ulong)uVar8), *piVar16 != (int)*unaff_x22))
        goto code_r0x00098ab4;
        plVar7 = (long *)((long)unaff_x23 + 1);
        *(char *)unaff_x23 = '\0';
      } while( true );
    }
    goto LAB_0009a168;
  }
  plVar9 = (long *)((long)in_x13 + (ulong)in_w10);
  in_w10 = in_w11 >> 6;
  in_w11 = in_w11 + 1;
  if (plVar9 <= in_x16) goto code_r0x00098af4;
  goto LAB_00098f40;
code_r0x00098ab4:
  plVar9 = (long *)((long)unaff_x22 + 2);
  if (in_x16 < plVar9) {
LAB_00098f40:
    uVar19 = in_stack_00000050 - (long)unaff_x22;
    if (unaff_x27 < (char *)((long)unaff_x23 + (uVar19 + 0xf0) / 0xff + uVar19 + 1)) {
LAB_0009a168:
      in_stack_00000060 = 0;
    }
    else {
      uVar6 = uVar19 - 0xf;
      if (uVar19 < 0xf) {
        *(char *)unaff_x23 = (char)((int)uVar19 << 4);
      }
      else {
        psVar17 = (short *)((long)unaff_x23 + 1);
        *(char *)unaff_x23 = -0x10;
        if (0xfe < uVar6) {
          uVar6 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000018) - (long)unaff_x22) - 0x10e;
          uVar20 = uVar6 / 0xff;
          _memset(psVar17,0xff,uVar20 + 1);
          uVar6 = uVar6 % 0xff;
          psVar17 = (short *)((long)unaff_x23 + uVar20 + 2);
        }
        *(char *)psVar17 = (char)uVar6;
        unaff_x23 = psVar17;
      }
      _memcpy((char *)((long)unaff_x23 + 1),unaff_x22,uVar19);
      in_stack_00000060 = ((int)(char *)((long)unaff_x23 + 1) + (int)uVar19) - in_stack_00000060;
    }
    return in_stack_00000060;
  }
  in_x13 = (long *)((long)unaff_x22 + 1);
  in_x12 = *in_x13;
  in_w10 = in_stack_00000068;
  in_w11 = in_stack_00000058;
code_r0x00098af4:
  uVar19 = (ulong)(in_x12 * unaff_x19) >> 0x32 & 0x3ffc;
  in_x9 = (ulong)*(uint *)(unaff_x21 + uVar19);
  in_w15 = (int)in_x13 - iVar18;
  in_x12 = *plVar9;
  *(uint *)(unaff_x21 + uVar19) = in_w15;
  param_1 = in_x13;
  in_x13 = plVar9;
  goto code_r0x00098b14;
}

