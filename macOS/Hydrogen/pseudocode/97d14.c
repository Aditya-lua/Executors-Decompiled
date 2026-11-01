
int FUN_00097d14(void)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  int *piVar4;
  long *plVar5;
  long *plVar6;
  long *in_x9;
  long *plVar7;
  ulong uVar8;
  uint in_w10;
  uint uVar9;
  uint uVar10;
  uint in_w11;
  ulong *puVar11;
  long in_x12;
  ulong uVar12;
  ulong *puVar13;
  long *in_x13;
  long *plVar14;
  ulong uVar15;
  long *plVar16;
  long *unaff_x20;
  long *unaff_x21;
  int *piVar17;
  int unaff_w23;
  short *unaff_x24;
  short *psVar18;
  long unaff_x25;
  long unaff_x26;
  int iVar19;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long in_stack_00000008;
  ulong *in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000048;
  uint in_stack_00000050;
  int in_stack_00000058;
  uint in_stack_00000060;
  
  do {
    plVar7 = in_x9;
    uVar9 = in_w10;
    if (unaff_x20 < plVar7) {
LAB_00098590:
      uVar15 = in_stack_00000048 - (long)unaff_x21;
      uVar8 = uVar15 - 0xf;
      if (uVar15 < 0xf) {
        *(char *)unaff_x24 = (char)((int)uVar15 << 4);
      }
      else {
        psVar18 = (short *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = -0x10;
        if (0xfe < uVar8) {
          uVar8 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000028) - (long)unaff_x21) - 0x10e;
          uVar12 = uVar8 / 0xff;
          _memset(psVar18,0xff,uVar12 + 1);
          uVar8 = uVar8 % 0xff;
          psVar18 = (short *)((long)unaff_x24 + uVar12 + 2);
        }
        *(char *)psVar18 = (char)uVar8;
        unaff_x24 = psVar18;
      }
      _memcpy((char *)((long)unaff_x24 + 1),unaff_x21,uVar15);
      return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar15) - in_stack_00000058;
    }
code_r0x00097d20:
    uVar15 = (ulong)(in_x12 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar10 = *(uint *)(unaff_x25 + uVar15);
    uVar8 = (ulong)uVar10;
    iVar19 = (int)unaff_x27;
    uVar3 = (int)in_x13 - iVar19;
    in_x12 = *plVar7;
    *(uint *)(unaff_x25 + uVar15) = uVar3;
    if ((uVar3 <= uVar10 + unaff_w23) && (*(int *)(unaff_x27 + uVar8) == (int)*in_x13)) {
      piVar17 = (int *)(unaff_x27 + uVar8);
      if ((*(int **)(unaff_x29 + -0x58) < piVar17) &&
         (*(char *)((long)in_x13 - 1) == *(char *)((long)piVar17 - 1))) {
        piVar4 = (int *)(in_stack_00000008 + uVar8);
        plVar5 = (long *)((long)in_x13 - 1U);
        plVar6 = (long *)((long)in_x13 - 1U);
        do {
          in_x13 = plVar6;
          plVar7 = plVar5;
          piVar17 = piVar4;
          if ((piVar17 <= *(int **)(unaff_x29 + -0x58)) || (plVar7 <= unaff_x21)) break;
          piVar4 = (int *)((long)piVar17 + -1);
          plVar5 = (long *)((long)plVar7 + -1);
          plVar6 = (long *)((long)in_x13 - 1);
        } while (*(char *)((long)plVar7 + -1) == *(char *)((long)piVar17 + -1));
      }
      else {
        plVar7 = in_x13;
      }
      plVar5 = (long *)((long)unaff_x24 + 1);
      uVar10 = (uint)((long)in_x13 - (long)unaff_x21);
      uVar9 = uVar10 - 0xf;
      if (uVar10 < 0xf) {
        *(char *)unaff_x24 = (char)(uVar10 << 4);
      }
      else {
        *(char *)unaff_x24 = -0x10;
        plVar6 = plVar5;
        if (0xfe < uVar9) {
          uVar9 = ((int)in_x13 - (int)unaff_x21) - 0x10e;
          uVar8 = (ulong)uVar9 / 0xff;
          _memset(plVar5,0xff,uVar8 + 1);
          uVar9 = uVar9 + (int)uVar8;
          plVar6 = (long *)((long)unaff_x24 + uVar8 + 2);
        }
        plVar5 = (long *)((long)plVar6 + 1);
        *(char *)plVar6 = (char)uVar9;
      }
      plVar6 = (long *)((long)plVar5 + ((long)in_x13 - (long)unaff_x21 & 0xffffffffU));
      plVar14 = plVar6;
      if (plVar6 <= plVar5 + 1) {
        plVar14 = plVar5 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar14 + ~(ulong)plVar5)) &&
         (0x3f < (ulong)((long)plVar5 - (long)unaff_x21))) {
        uVar8 = ((long)plVar14 + ~(ulong)plVar5 >> 3) + 1;
        uVar12 = uVar8 & 0x3ffffffffffffff8;
        plVar14 = unaff_x21 + 4;
        plVar16 = plVar5 + 4;
        uVar15 = uVar12;
        do {
          lVar20 = plVar14[-4];
          lVar22 = plVar14[-1];
          lVar21 = plVar14[-2];
          lVar24 = plVar14[1];
          lVar23 = *plVar14;
          lVar26 = plVar14[3];
          lVar25 = plVar14[2];
          plVar16[-3] = plVar14[-3];
          plVar16[-4] = lVar20;
          plVar16[-1] = lVar22;
          plVar16[-2] = lVar21;
          plVar16[1] = lVar24;
          *plVar16 = lVar23;
          plVar16[3] = lVar26;
          plVar16[2] = lVar25;
          uVar15 = uVar15 - 8;
          plVar14 = plVar14 + 8;
          plVar16 = plVar16 + 8;
        } while (uVar15 != 0);
        unaff_x21 = unaff_x21 + uVar12;
        plVar5 = plVar5 + uVar12;
        if (uVar8 == uVar12) goto code_r0x00097e88;
      }
      do {
        plVar14 = plVar5 + 1;
        *plVar5 = *unaff_x21;
        unaff_x21 = unaff_x21 + 1;
        plVar5 = plVar14;
      } while (plVar14 < plVar6);
code_r0x00097e88:
      unaff_x21 = plVar7;
      do {
        psVar18 = (short *)((long)plVar6 + 2);
        *(short *)plVar6 = (short)unaff_x21 - (short)piVar17;
        puVar1 = (ulong *)((long)unaff_x21 + 4);
        puVar13 = (ulong *)(piVar17 + 1);
        if (puVar1 < unaff_x28) {
          uVar8 = *puVar1 ^ *puVar13;
          if (uVar8 == 0) {
            puVar13 = (ulong *)(piVar17 + 3);
            puVar11 = (ulong *)((long)unaff_x21 + 0xc);
            goto LAB_00097edc;
          }
          uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
          uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
          uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
          uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
          uVar10 = (uint)((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3);
          unaff_x21 = (long *)((long)unaff_x21 + (ulong)(uVar10 + 4));
LAB_00097fa0:
          *(char *)unaff_x24 = (char)*unaff_x24 + (char)uVar10;
          unaff_x24 = psVar18;
        }
        else {
          puVar11 = puVar1;
LAB_00097edc:
          for (; puVar11 < unaff_x28; puVar11 = puVar11 + 1) {
            uVar8 = *puVar11 ^ *puVar13;
            if (uVar8 != 0) {
              uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
              uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
              uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
              uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
              puVar11 = (ulong *)((long)puVar11 +
                                 ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3));
              goto code_r0x00097f0c;
            }
            puVar13 = puVar13 + 1;
          }
          if (puVar11 < in_stack_00000018) {
            if ((int)*puVar13 == (int)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 4);
              puVar13 = (ulong *)((long)puVar13 + 4);
            }
          }
          if (puVar11 < in_stack_00000010) {
            if ((short)*puVar13 == (short)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 2);
              puVar13 = (ulong *)((long)puVar13 + 2);
            }
          }
          if (puVar11 < in_stack_00000020) {
            if ((char)*puVar13 == (char)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 1);
            }
          }
code_r0x00097f0c:
          unaff_x21 = (long *)((long)unaff_x21 + ((long)puVar11 - (long)puVar1 & 0xffffffffU) + 4);
          uVar10 = (uint)((long)puVar11 - (long)puVar1);
          uVar9 = uVar10 - 0xf;
          if (uVar10 < 0xf) goto LAB_00097fa0;
          *(char *)unaff_x24 = (char)*unaff_x24 + '\x0f';
          psVar18[0] = -1;
          psVar18[1] = -1;
          if (0x3fb < uVar9) {
            uVar8 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar6 + 6),0xff,uVar8 + 4);
            uVar9 = (uVar10 - 0x40b) % 0x3fc;
            psVar18 = (short *)((long)plVar6 + 6 + uVar8);
            unaff_w23 = 0xffff;
          }
          uVar10 = (uVar9 & 0xffff) / 0xff;
          pcVar2 = (char *)((long)psVar18 + (ulong)uVar10);
          *pcVar2 = (char)uVar9 + (char)uVar10;
          unaff_x24 = (short *)(pcVar2 + 1);
        }
        if (unaff_x20 <= unaff_x21) goto LAB_00098590;
        *(int *)(unaff_x25 + ((ulong)(*(long *)((long)unaff_x21 + -2) * unaff_x26) >> 0x32 & 0x3ffc)
                ) = (int)(long *)((long)unaff_x21 + -2) - iVar19;
        uVar10 = (int)unaff_x21 - iVar19;
        uVar8 = (ulong)(*unaff_x21 * unaff_x26) >> 0x32 & 0x3ffc;
        uVar9 = *(uint *)(unaff_x25 + uVar8);
        *(uint *)(unaff_x25 + uVar8) = uVar10;
        if ((uVar9 + unaff_w23 < uVar10) ||
           (piVar17 = (int *)(unaff_x27 + (ulong)uVar9), *piVar17 != (int)*unaff_x21))
        goto code_r0x00097ce0;
        plVar6 = (long *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = '\0';
      } while( true );
    }
    in_w10 = in_w11 >> 6;
    in_w11 = in_w11 + 1;
    in_x9 = (long *)((long)plVar7 + (ulong)uVar9);
    in_x13 = plVar7;
  } while( true );
code_r0x00097ce0:
  plVar7 = (long *)((long)unaff_x21 + 2);
  if (unaff_x20 < plVar7) goto LAB_00098590;
  in_x13 = (long *)((long)unaff_x21 + 1);
  in_x12 = *in_x13;
  uVar9 = in_stack_00000050;
  in_w11 = in_stack_00000060;
  goto code_r0x00097d20;
}

