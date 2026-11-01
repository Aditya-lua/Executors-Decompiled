
int thunk_FUN_000990a8(long *param_1)

{
  ulong *puVar1;
  char *pcVar2;
  int *piVar3;
  long *plVar4;
  long *plVar5;
  uint uVar6;
  long *in_x9;
  ulong uVar7;
  uint in_w10;
  uint uVar8;
  uint in_w11;
  ulong *puVar9;
  long in_x12;
  ulong uVar10;
  ulong *puVar11;
  long *plVar12;
  ulong uVar13;
  long *plVar14;
  long *plVar15;
  int *unaff_x19;
  int *piVar16;
  long unaff_x21;
  long *unaff_x22;
  short *unaff_x23;
  short *psVar17;
  long *unaff_x24;
  int unaff_w25;
  long unaff_x26;
  int iVar18;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
FUN_000990a8:
  do {
    uVar13 = (ulong)(in_x12 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar6 = *(uint *)(unaff_x21 + uVar13);
    uVar7 = (ulong)uVar6;
    iVar18 = (int)unaff_x27;
    uVar8 = (int)param_1 - iVar18;
    in_x12 = *in_x9;
    *(uint *)(unaff_x21 + uVar13) = uVar8;
    if ((uVar8 <= uVar6 + unaff_w25) && (*(int *)(unaff_x27 + uVar7) == (int)*param_1)) {
      piVar16 = (int *)(unaff_x27 + uVar7);
      if ((unaff_x19 < piVar16) && (*(char *)((long)param_1 - 1) == *(char *)((long)piVar16 - 1))) {
        piVar3 = (int *)(in_stack_00000010 + uVar7);
        plVar4 = (long *)((long)param_1 - 1U);
        plVar5 = (long *)((long)param_1 - 1U);
        do {
          param_1 = plVar5;
          plVar15 = plVar4;
          piVar16 = piVar3;
          if ((piVar16 <= unaff_x19) || (plVar15 <= unaff_x22)) break;
          piVar3 = (int *)((long)piVar16 + -1);
          plVar4 = (long *)((long)plVar15 + -1);
          plVar5 = (long *)((long)param_1 - 1);
        } while (*(char *)((long)plVar15 + -1) == *(char *)((long)piVar16 + -1));
      }
      else {
        plVar15 = param_1;
      }
      plVar4 = (long *)((long)unaff_x23 + 1);
      uVar8 = (uint)((long)param_1 - (long)unaff_x22);
      uVar6 = uVar8 - 0xf;
      if (uVar8 < 0xf) {
        *(char *)unaff_x23 = (char)(uVar8 << 4);
      }
      else {
        *(char *)unaff_x23 = -0x10;
        plVar5 = plVar4;
        if (0xfe < uVar6) {
          uVar6 = ((int)param_1 - (int)unaff_x22) - 0x10e;
          uVar7 = (ulong)uVar6 / 0xff;
          _memset(plVar4,0xff,uVar7 + 1);
          uVar6 = uVar6 + (int)uVar7;
          plVar5 = (long *)((long)unaff_x23 + uVar7 + 2);
        }
        plVar4 = (long *)((long)plVar5 + 1);
        *(char *)plVar5 = (char)uVar6;
      }
      plVar5 = (long *)((long)plVar4 + ((long)param_1 - (long)unaff_x22 & 0xffffffffU));
      plVar12 = plVar5;
      if (plVar5 <= plVar4 + 1) {
        plVar12 = plVar4 + 1;
      }
      if ((char *)((long)plVar12 + ~(ulong)plVar4) < &segment_command_00000020.vmaddr) {
        unaff_x19 = *(int **)(unaff_x29 + -0x58);
      }
      else {
        unaff_x19 = *(int **)(unaff_x29 + -0x58);
        if (0x3f < (ulong)((long)plVar4 - (long)unaff_x22)) {
          uVar7 = ((long)plVar12 + ~(ulong)plVar4 >> 3) + 1;
          uVar10 = uVar7 & 0x3ffffffffffffff8;
          plVar12 = unaff_x22 + 4;
          plVar14 = plVar4 + 4;
          uVar13 = uVar10;
          do {
            lVar19 = plVar12[-4];
            lVar21 = plVar12[-1];
            lVar20 = plVar12[-2];
            lVar23 = plVar12[1];
            lVar22 = *plVar12;
            lVar25 = plVar12[3];
            lVar24 = plVar12[2];
            plVar14[-3] = plVar12[-3];
            plVar14[-4] = lVar19;
            plVar14[-1] = lVar21;
            plVar14[-2] = lVar20;
            plVar14[1] = lVar23;
            *plVar14 = lVar22;
            plVar14[3] = lVar25;
            plVar14[2] = lVar24;
            uVar13 = uVar13 - 8;
            plVar12 = plVar12 + 8;
            plVar14 = plVar14 + 8;
          } while (uVar13 != 0);
          unaff_x22 = unaff_x22 + uVar10;
          plVar4 = plVar4 + uVar10;
          if (uVar7 == uVar10) goto code_r0x00099220;
        }
      }
      do {
        plVar12 = plVar4 + 1;
        *plVar4 = *unaff_x22;
        unaff_x22 = unaff_x22 + 1;
        plVar4 = plVar12;
      } while (plVar12 < plVar5);
code_r0x00099220:
      unaff_x22 = plVar15;
      do {
        psVar17 = (short *)((long)plVar5 + 2);
        *(short *)plVar5 = (short)unaff_x22 - (short)piVar16;
        puVar1 = (ulong *)((long)unaff_x22 + 4);
        puVar11 = (ulong *)(piVar16 + 1);
        if (puVar1 < unaff_x28) {
          uVar7 = *puVar1 ^ *puVar11;
          if (uVar7 == 0) {
            puVar11 = (ulong *)(piVar16 + 3);
            puVar9 = (ulong *)((long)unaff_x22 + 0xc);
            goto code_r0x00099274;
          }
          uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
          uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
          uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
          uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
          uVar8 = (uint)((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3);
          unaff_x22 = (long *)((long)unaff_x22 + (ulong)(uVar8 + 4));
code_r0x0009933c:
          *(char *)unaff_x23 = (char)*unaff_x23 + (char)uVar8;
          unaff_x23 = psVar17;
        }
        else {
          puVar9 = puVar1;
code_r0x00099274:
          for (; puVar9 < unaff_x28; puVar9 = puVar9 + 1) {
            uVar7 = *puVar9 ^ *puVar11;
            if (uVar7 != 0) {
              uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
              uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
              uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
              uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
              puVar9 = (ulong *)((long)puVar9 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3)
                                );
              goto code_r0x000992a4;
            }
            puVar11 = puVar11 + 1;
          }
          if (puVar9 < in_stack_00000020) {
            if ((int)*puVar11 == (int)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 4);
              puVar11 = (ulong *)((long)puVar11 + 4);
            }
          }
          if (puVar9 < in_stack_00000018) {
            if ((short)*puVar11 == (short)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 2);
              puVar11 = (ulong *)((long)puVar11 + 2);
            }
          }
          if (puVar9 < in_stack_00000028) {
            if ((char)*puVar11 == (char)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 1);
            }
          }
code_r0x000992a4:
          unaff_x22 = (long *)((long)unaff_x22 + ((long)puVar9 - (long)puVar1 & 0xffffffffU) + 4);
          uVar8 = (uint)((long)puVar9 - (long)puVar1);
          uVar6 = uVar8 - 0xf;
          if (uVar8 < 0xf) goto code_r0x0009933c;
          *(char *)unaff_x23 = (char)*unaff_x23 + '\x0f';
          psVar17[0] = -1;
          psVar17[1] = -1;
          if (0x3fb < uVar6) {
            uVar7 = (ulong)((uVar8 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar5 + 6),0xff,uVar7 + 4);
            uVar6 = (uVar8 - 0x40b) % 0x3fc;
            unaff_x19 = *(int **)(unaff_x29 + -0x58);
            psVar17 = (short *)((long)plVar5 + 6 + uVar7);
            unaff_w25 = 0xffff;
          }
          uVar8 = (uVar6 & 0xffff) / 0xff;
          pcVar2 = (char *)((long)psVar17 + (ulong)uVar8);
          *pcVar2 = (char)uVar6 + (char)uVar8;
          unaff_x23 = (short *)(pcVar2 + 1);
        }
        if (unaff_x24 <= unaff_x22) goto LAB_0009949c;
        *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x22 + -2) * unaff_x26) >> 0x32 & 0x3ffc)
                ) = (int)(long *)((long)unaff_x22 + -2) - iVar18;
        uVar8 = (int)unaff_x22 - iVar18;
        uVar7 = (ulong)(*unaff_x22 * unaff_x26) >> 0x32 & 0x3ffc;
        uVar6 = *(uint *)(unaff_x21 + uVar7);
        *(uint *)(unaff_x21 + uVar7) = uVar8;
        if ((uVar6 + unaff_w25 < uVar8) ||
           (piVar16 = (int *)(unaff_x27 + (ulong)uVar6), *piVar16 != (int)*unaff_x22))
        goto LAB_00099068;
        plVar5 = (long *)((long)unaff_x23 + 1);
        *(char *)unaff_x23 = '\0';
      } while( true );
    }
    plVar15 = (long *)((long)in_x9 + (ulong)in_w10);
    param_1 = in_x9;
    in_x9 = plVar15;
    in_w10 = in_w11 >> 6;
    in_w11 = in_w11 + 1;
  } while (plVar15 <= unaff_x24);
LAB_0009949c:
  uVar13 = in_stack_00000050 - (long)unaff_x22;
  uVar7 = uVar13 - 0xf;
  if (uVar13 < 0xf) {
    *(char *)unaff_x23 = (char)((int)uVar13 << 4);
  }
  else {
    psVar17 = (short *)((long)unaff_x23 + 1);
    *(char *)unaff_x23 = -0x10;
    if (0xfe < uVar7) {
      uVar7 = (long)unaff_x19 + (in_stack_00000030 - (long)unaff_x22) + -0x10e;
      uVar10 = uVar7 / 0xff;
      _memset(psVar17,0xff,uVar10 + 1);
      uVar7 = uVar7 % 0xff;
      psVar17 = (short *)((long)unaff_x23 + uVar10 + 2);
    }
    *(char *)psVar17 = (char)uVar7;
    unaff_x23 = psVar17;
  }
  _memcpy((char *)((long)unaff_x23 + 1),unaff_x22,uVar13);
  return ((int)(char *)((long)unaff_x23 + 1) + (int)uVar13) - in_stack_00000060;
LAB_00099068:
  in_x9 = (long *)((long)unaff_x22 + 2);
  if (unaff_x24 < in_x9) goto LAB_0009949c;
  param_1 = (long *)((long)unaff_x22 + 1);
  in_x12 = *param_1;
  in_w10 = in_stack_00000068;
  in_w11 = in_stack_00000058;
  goto FUN_000990a8;
}

