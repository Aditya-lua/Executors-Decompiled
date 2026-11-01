
int FUN_00097ea4(long *param_1)

{
  char *pcVar1;
  uint uVar2;
  uint uVar3;
  int *piVar4;
  long *plVar6;
  long *plVar5;
  short *psVar7;
  long *plVar8;
  long *plVar9;
  short *in_x9;
  uint uVar10;
  ulong *in_x10;
  uint uVar11;
  ulong uVar12;
  ulong *puVar13;
  long lVar14;
  ulong uVar15;
  ulong *in_x12;
  ulong uVar16;
  long *unaff_x20;
  long *unaff_x21;
  int *unaff_x22;
  int unaff_w23;
  short *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  int iVar17;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
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
    if (in_x10 < unaff_x28) {
      uVar12 = *in_x10 ^ *in_x12;
      if (uVar12 == 0) {
        in_x12 = (ulong *)(unaff_x22 + 3);
        puVar13 = (ulong *)((long)unaff_x21 + 0xc);
        goto LAB_00097edc;
      }
      uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
      uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
      uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
      uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
      uVar10 = (uint)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3);
      plVar9 = (long *)((long)unaff_x21 + (ulong)(uVar10 + 4));
LAB_00097fa0:
      *(char *)in_x9 = (char)*in_x9 + (char)uVar10;
      in_x9 = unaff_x24;
    }
    else {
      puVar13 = in_x10;
LAB_00097edc:
      for (; puVar13 < unaff_x28; puVar13 = puVar13 + 1) {
        uVar12 = *puVar13 ^ *in_x12;
        if (uVar12 != 0) {
          uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
          uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
          uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
          uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
          puVar13 = (ulong *)((long)puVar13 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3)
                             );
          goto code_r0x00097f0c;
        }
        in_x12 = in_x12 + 1;
      }
      if (puVar13 < in_stack_00000018) {
        if ((int)*in_x12 == (int)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 4);
          in_x12 = (ulong *)((long)in_x12 + 4);
        }
      }
      if (puVar13 < in_stack_00000010) {
        if ((short)*in_x12 == (short)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 2);
          in_x12 = (ulong *)((long)in_x12 + 2);
        }
      }
      if (puVar13 < in_stack_00000020) {
        if ((char)*in_x12 == (char)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 1);
        }
      }
code_r0x00097f0c:
      plVar9 = (long *)((long)unaff_x21 + ((long)puVar13 - (long)in_x10 & 0xffffffffU) + 4);
      uVar10 = (uint)((long)puVar13 - (long)in_x10);
      uVar11 = uVar10 - 0xf;
      if (uVar10 < 0xf) goto LAB_00097fa0;
      *(char *)in_x9 = (char)*in_x9 + '\x0f';
      unaff_x24[0] = -1;
      unaff_x24[1] = -1;
      if (0x3fb < uVar11) {
        uVar12 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
        _memset((short *)((long)param_1 + 6),0xff,uVar12 + 4);
        uVar11 = (uVar10 - 0x40b) % 0x3fc;
        unaff_x24 = (short *)((long)param_1 + 6 + uVar12);
        unaff_w23 = 0xffff;
      }
      uVar10 = (uVar11 & 0xffff) / 0xff;
      pcVar1 = (char *)((long)unaff_x24 + (ulong)uVar10);
      *pcVar1 = (char)uVar11 + (char)uVar10;
      in_x9 = (short *)(pcVar1 + 1);
    }
    if (unaff_x20 <= plVar9) goto code_r0x00098590;
    iVar17 = (int)unaff_x27;
    *(int *)(unaff_x25 + ((ulong)(*(long *)((long)plVar9 + -2) * unaff_x26) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)plVar9 + -2) - iVar17;
    uVar10 = (int)plVar9 - iVar17;
    uVar12 = (ulong)(*plVar9 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar11 = *(uint *)(unaff_x25 + uVar12);
    *(uint *)(unaff_x25 + uVar12) = uVar10;
    if ((uVar11 + unaff_w23 < uVar10) ||
       (unaff_x22 = (int *)(unaff_x27 + (ulong)uVar11), *unaff_x22 != (int)*plVar9)) {
      if (unaff_x20 < (long *)((long)plVar9 + 2U)) {
code_r0x00098590:
        uVar16 = in_stack_00000048 - (long)plVar9;
        uVar12 = uVar16 - 0xf;
        if (uVar16 < 0xf) {
          *(char *)in_x9 = (char)((int)uVar16 << 4);
        }
        else {
          psVar7 = (short *)((long)in_x9 + 1);
          *(char *)in_x9 = -0x10;
          if (0xfe < uVar12) {
            uVar12 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000028) - (long)plVar9) - 0x10e;
            uVar15 = uVar12 / 0xff;
            _memset(psVar7,0xff,uVar15 + 1);
            uVar12 = uVar12 % 0xff;
            psVar7 = (short *)((long)in_x9 + uVar15 + 2);
          }
          *(char *)psVar7 = (char)uVar12;
          in_x9 = psVar7;
        }
        _memcpy((char *)((long)in_x9 + 1),plVar9,uVar16);
        return ((int)(char *)((long)in_x9 + 1) + (int)uVar16) - in_stack_00000058;
      }
      lVar14 = *(long *)((long)plVar9 + 1U);
      plVar8 = (long *)((long)plVar9 + 1U);
      plVar5 = (long *)((long)plVar9 + 2U);
      uVar10 = in_stack_00000050;
      uVar11 = in_stack_00000060;
      while( true ) {
        uVar16 = (ulong)(lVar14 * unaff_x26) >> 0x32 & 0x3ffc;
        uVar2 = *(uint *)(unaff_x25 + uVar16);
        uVar12 = (ulong)uVar2;
        uVar3 = (int)plVar8 - iVar17;
        lVar14 = *plVar5;
        *(uint *)(unaff_x25 + uVar16) = uVar3;
        if ((uVar3 <= uVar2 + unaff_w23) && (*(int *)(unaff_x27 + uVar12) == (int)*plVar8)) break;
        plVar6 = (long *)((long)plVar5 + (ulong)uVar10);
        uVar10 = uVar11 >> 6;
        uVar11 = uVar11 + 1;
        plVar8 = plVar5;
        plVar5 = plVar6;
        if (unaff_x20 < plVar6) goto code_r0x00098590;
      }
      unaff_x22 = (int *)(unaff_x27 + uVar12);
      if ((*(int **)(unaff_x29 + -0x58) < unaff_x22) &&
         (*(char *)((long)plVar8 - 1) == *(char *)((long)unaff_x22 - 1))) {
        piVar4 = (int *)(in_stack_00000008 + uVar12);
        plVar5 = (long *)((long)plVar8 - 1U);
        plVar6 = (long *)((long)plVar8 - 1U);
        do {
          plVar8 = plVar6;
          unaff_x21 = plVar5;
          unaff_x22 = piVar4;
          if ((unaff_x22 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x21 <= plVar9)) break;
          piVar4 = (int *)((long)unaff_x22 + -1);
          plVar5 = (long *)((long)unaff_x21 + -1);
          plVar6 = (long *)((long)plVar8 - 1);
        } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)unaff_x22 + -1));
      }
      else {
        unaff_x21 = plVar8;
      }
      plVar5 = (long *)((long)in_x9 + 1);
      uVar10 = (uint)((long)plVar8 - (long)plVar9);
      uVar11 = uVar10 - 0xf;
      if (uVar10 < 0xf) {
        *(char *)in_x9 = (char)(uVar10 << 4);
      }
      else {
        *(char *)in_x9 = -0x10;
        plVar6 = plVar5;
        if (0xfe < uVar11) {
          uVar11 = ((int)plVar8 - (int)plVar9) - 0x10e;
          uVar12 = (ulong)uVar11 / 0xff;
          _memset(plVar5,0xff,uVar12 + 1);
          uVar11 = uVar11 + (int)uVar12;
          plVar6 = (long *)((long)in_x9 + uVar12 + 2);
        }
        plVar5 = (long *)((long)plVar6 + 1);
        *(char *)plVar6 = (char)uVar11;
      }
      param_1 = (long *)((long)plVar5 + ((long)plVar8 - (long)plVar9 & 0xffffffffU));
      plVar8 = param_1;
      if (param_1 <= plVar5 + 1) {
        plVar8 = plVar5 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar8 + ~(ulong)plVar5)) &&
         (0x3f < (ulong)((long)plVar5 - (long)plVar9))) {
        uVar12 = ((long)plVar8 + ~(ulong)plVar5 >> 3) + 1;
        uVar15 = uVar12 & 0x3ffffffffffffff8;
        plVar8 = plVar9 + 4;
        plVar6 = plVar5 + 4;
        uVar16 = uVar15;
        do {
          lVar14 = plVar8[-4];
          lVar19 = plVar8[-1];
          lVar18 = plVar8[-2];
          lVar21 = plVar8[1];
          lVar20 = *plVar8;
          lVar23 = plVar8[3];
          lVar22 = plVar8[2];
          plVar6[-3] = plVar8[-3];
          plVar6[-4] = lVar14;
          plVar6[-1] = lVar19;
          plVar6[-2] = lVar18;
          plVar6[1] = lVar21;
          *plVar6 = lVar20;
          plVar6[3] = lVar23;
          plVar6[2] = lVar22;
          uVar16 = uVar16 - 8;
          plVar8 = plVar8 + 8;
          plVar6 = plVar6 + 8;
        } while (uVar16 != 0);
        plVar9 = plVar9 + uVar15;
        plVar5 = plVar5 + uVar15;
        if (uVar12 == uVar15) goto code_r0x00097e90;
      }
      do {
        plVar8 = plVar5 + 1;
        *plVar5 = *plVar9;
        plVar9 = plVar9 + 1;
        plVar5 = plVar8;
      } while (plVar8 < param_1);
    }
    else {
      param_1 = (long *)((long)in_x9 + 1);
      *(char *)in_x9 = '\0';
      unaff_x21 = plVar9;
    }
code_r0x00097e90:
    unaff_x24 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x21 - (short)unaff_x22;
    in_x10 = (ulong *)((long)unaff_x21 + 4);
    in_x12 = (ulong *)(unaff_x22 + 1);
  } while( true );
}

