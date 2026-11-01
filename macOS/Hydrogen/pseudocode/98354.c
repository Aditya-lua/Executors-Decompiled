
/* WARNING: Type propagation algorithm not settling */

int FUN_00098354(long *param_1,undefined8 param_2,uint param_3)

{
  char *pcVar1;
  uint uVar2;
  uint uVar3;
  int *piVar4;
  undefined1 in_CY;
  long *plVar6;
  long *plVar5;
  short *psVar7;
  long *plVar8;
  long *plVar9;
  short *in_x9;
  uint uVar10;
  ulong *in_x10;
  ulong *in_x11;
  long lVar11;
  ulong *in_x12;
  int in_w17;
  long unaff_x19;
  ulong *unaff_x20;
  ulong uVar12;
  long *unaff_x21;
  int *piVar13;
  char *unaff_x23;
  int iVar14;
  long unaff_x24;
  long unaff_x25;
  uint uVar15;
  ulong uVar16;
  short *unaff_x27;
  long *unaff_x28;
  ulong uVar17;
  long unaff_x29;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long in_stack_00000000;
  long in_stack_00000008;
  ulong *in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  long in_stack_00000040;
  uint in_stack_00000048;
  uint in_stack_00000050;
  int in_stack_00000058;
  long *in_stack_00000060;
  
  do {
    if (!(bool)in_CY) {
      if ((int)*in_x12 == (int)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 4);
        in_x12 = (ulong *)((long)in_x12 + 4);
      }
    }
    if (in_x11 < in_stack_00000010) {
      if ((short)*in_x12 == (short)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 2);
        in_x12 = (ulong *)((long)in_x12 + 2);
      }
    }
    if (in_x11 < in_stack_00000020) {
      if ((char)*in_x12 == (char)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 1);
      }
    }
    uVar16 = (ulong)(uint)((int)in_x11 - (int)in_x10);
LAB_000983b8:
    uVar15 = (uint)uVar16;
    if (unaff_x23 < (char *)((long)param_1 + ((ulong)(uVar15 + 0xf0) * (ulong)param_3 >> 0x27) + 8))
    {
      return 0;
    }
    uVar10 = uVar15 - 0xf;
    if (uVar15 < 0xf) {
      *(char *)in_x9 = (char)*in_x9 + (char)uVar16;
      plVar9 = (long *)((long)unaff_x21 + uVar16 + 4);
      in_x9 = unaff_x27;
      if (unaff_x28 <= plVar9) goto code_r0x00098604;
    }
    else {
      *(char *)in_x9 = (char)*in_x9 + '\x0f';
      unaff_x27[0] = -1;
      unaff_x27[1] = -1;
      if (0x3fb < uVar10) {
        uVar10 = (uint)((ulong)(uVar15 - 0x40b) * (ulong)param_3 >> 0x29);
        uVar17 = (ulong)(uVar10 << 2);
        _memset((short *)((long)param_1 + 6),0xff,uVar17 + 4);
        param_3 = 0x80808081;
        in_w17 = 0xffff;
        uVar10 = (uVar15 - 0x40b) + uVar10 * -0x3fc;
        unaff_x19 = -0x30e4432345000000;
        unaff_x27 = (short *)((long)param_1 + 6 + uVar17);
        unaff_x28 = in_stack_00000060;
      }
      uVar15 = (uVar10 & 0xffff) / 0xff;
      pcVar1 = (char *)((long)unaff_x27 + (ulong)uVar15);
      unaff_x27 = (short *)(pcVar1 + 1);
      *pcVar1 = (char)uVar10 + (char)uVar15;
      plVar9 = (long *)((long)unaff_x21 + uVar16 + 4);
      in_x9 = unaff_x27;
      if (unaff_x28 <= plVar9) goto code_r0x00098604;
    }
    iVar14 = (int)unaff_x24;
    *(int *)(unaff_x25 + ((ulong)(*(long *)((long)plVar9 + -2) * unaff_x19) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)plVar9 + -2) - iVar14;
    uVar10 = (int)plVar9 - iVar14;
    uVar16 = (ulong)(*plVar9 * unaff_x19) >> 0x32 & 0x3ffc;
    uVar15 = *(uint *)(unaff_x25 + uVar16);
    *(uint *)(unaff_x25 + uVar16) = uVar10;
    if ((uVar15 + in_w17 < uVar10) ||
       (piVar13 = (int *)(unaff_x24 + (ulong)uVar15), *piVar13 != (int)*plVar9)) {
      unaff_x27 = in_x9;
      if (unaff_x28 < (long *)((long)plVar9 + 2U)) {
code_r0x00098604:
        uVar16 = in_stack_00000040 - (long)plVar9;
        if (unaff_x23 < (char *)((long)unaff_x27 + (uVar16 + 0xf0) / 0xff + uVar16 + 1)) {
          return 0;
        }
        uVar17 = uVar16 - 0xf;
        if (uVar16 < 0xf) {
          *(char *)unaff_x27 = (char)((int)uVar16 << 4);
        }
        else {
          psVar7 = (short *)((long)unaff_x27 + 1);
          *(char *)unaff_x27 = -0x10;
          if (0xfe < uVar17) {
            uVar17 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000008) - (long)plVar9) - 0x10e;
            uVar12 = uVar17 / 0xff;
            _memset(psVar7,0xff,uVar12 + 1);
            uVar17 = uVar17 % 0xff;
            psVar7 = (short *)((long)unaff_x27 + uVar12 + 2);
          }
          *(char *)psVar7 = (char)uVar17;
          unaff_x27 = psVar7;
        }
        _memcpy((char *)((long)unaff_x27 + 1),plVar9,uVar16);
        return ((int)(char *)((long)unaff_x27 + 1) + (int)uVar16) - in_stack_00000058;
      }
      lVar11 = *(long *)((long)plVar9 + 1U);
      plVar8 = (long *)((long)plVar9 + 1U);
      plVar5 = (long *)((long)plVar9 + 2U);
      uVar10 = in_stack_00000050;
      uVar15 = in_stack_00000048;
      while( true ) {
        uVar17 = (ulong)(lVar11 * unaff_x19) >> 0x32 & 0x3ffc;
        uVar2 = *(uint *)(unaff_x25 + uVar17);
        uVar16 = (ulong)uVar2;
        uVar3 = (int)plVar8 - iVar14;
        lVar11 = *plVar5;
        *(uint *)(unaff_x25 + uVar17) = uVar3;
        if ((uVar3 <= uVar2 + in_w17) && (*(int *)(unaff_x24 + uVar16) == (int)*plVar8)) break;
        plVar6 = (long *)((long)plVar5 + (ulong)uVar10);
        uVar10 = uVar15 >> 6;
        uVar15 = uVar15 + 1;
        plVar8 = plVar5;
        plVar5 = plVar6;
        if (unaff_x28 < plVar6) goto code_r0x00098604;
      }
      piVar13 = (int *)(unaff_x24 + uVar16);
      if ((*(int **)(unaff_x29 + -0x58) < piVar13) &&
         (*(char *)((long)plVar8 - 1) == *(char *)((long)piVar13 - 1))) {
        piVar4 = (int *)(in_stack_00000000 + uVar16);
        plVar5 = (long *)((long)plVar8 - 1U);
        plVar6 = (long *)((long)plVar8 - 1U);
        do {
          plVar8 = plVar6;
          unaff_x21 = plVar5;
          piVar13 = piVar4;
          if ((piVar13 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x21 <= plVar9)) break;
          piVar4 = (int *)((long)piVar13 + -1);
          plVar5 = (long *)((long)unaff_x21 + -1);
          plVar6 = (long *)((long)plVar8 - 1);
        } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)piVar13 + -1));
      }
      else {
        unaff_x21 = plVar8;
      }
      plVar5 = (long *)((long)in_x9 + 1);
      uVar16 = (long)plVar8 - (long)plVar9 & 0xffffffff;
      if (unaff_x23 < (char *)((long)plVar5 + (uVar16 * param_3 >> 0x27) + uVar16 + 8)) {
        return 0;
      }
      uVar10 = (uint)((long)plVar8 - (long)plVar9);
      uVar15 = uVar10 - 0xf;
      if (uVar10 < 0xf) {
        *(char *)in_x9 = (char)(uVar10 << 4);
      }
      else {
        *(char *)in_x9 = -0x10;
        plVar6 = plVar5;
        if (0xfe < uVar15) {
          uVar15 = ((int)plVar8 - (int)plVar9) - 0x10e;
          uVar17 = (ulong)uVar15 * (ulong)param_3;
          uVar12 = uVar17 >> 0x27;
          _memset(plVar5,0xff,uVar12 + 1);
          param_3 = 0x80808081;
          in_w17 = 0xffff;
          uVar15 = uVar15 + (uint)(uVar17 >> 0x27);
          plVar6 = (long *)((long)in_x9 + uVar12 + 2);
        }
        plVar5 = (long *)((long)plVar6 + 1);
        *(char *)plVar6 = (char)uVar15;
      }
      param_1 = (long *)((long)plVar5 + uVar16);
      plVar8 = param_1;
      if (param_1 <= plVar5 + 1) {
        plVar8 = plVar5 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar8 + ~(ulong)plVar5)) &&
         (0x3f < (ulong)((long)plVar5 - (long)plVar9))) {
        uVar16 = ((long)plVar8 + ~(ulong)plVar5 >> 3) + 1;
        uVar12 = uVar16 & 0x3ffffffffffffff8;
        plVar8 = plVar9 + 4;
        plVar6 = plVar5 + 4;
        uVar17 = uVar12;
        do {
          lVar11 = plVar8[-4];
          lVar19 = plVar8[-1];
          lVar18 = plVar8[-2];
          lVar21 = plVar8[1];
          lVar20 = *plVar8;
          lVar23 = plVar8[3];
          lVar22 = plVar8[2];
          plVar6[-3] = plVar8[-3];
          plVar6[-4] = lVar11;
          plVar6[-1] = lVar19;
          plVar6[-2] = lVar18;
          plVar6[1] = lVar21;
          *plVar6 = lVar20;
          plVar6[3] = lVar23;
          plVar6[2] = lVar22;
          uVar17 = uVar17 - 8;
          plVar8 = plVar8 + 8;
          plVar6 = plVar6 + 8;
        } while (uVar17 != 0);
        plVar9 = plVar9 + uVar12;
        plVar5 = plVar5 + uVar12;
        if (uVar16 == uVar12) goto code_r0x000982d4;
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
code_r0x000982d4:
    unaff_x27 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x21 - (short)piVar13;
    in_x10 = (ulong *)((long)unaff_x21 + 4);
    in_x12 = (ulong *)(piVar13 + 1);
    in_x11 = in_x10;
    if (in_x10 < unaff_x20) {
      uVar16 = *in_x10 ^ *in_x12;
      if (uVar16 == 0) {
        in_x12 = (ulong *)(piVar13 + 3);
        in_x11 = (ulong *)((long)unaff_x21 + 0xc);
        goto joined_r0x0009831c;
      }
      uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
      uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
      uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
      uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
      uVar16 = (ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3;
      goto LAB_000983b8;
    }
joined_r0x0009831c:
    if (in_x11 < unaff_x20) {
      iVar14 = ((int)in_x11 - (int)unaff_x21) + -4;
      while (uVar16 = *in_x11 ^ *in_x12, uVar16 == 0) {
        in_x11 = in_x11 + 1;
        in_x12 = in_x12 + 1;
        iVar14 = iVar14 + 8;
        if (unaff_x20 <= in_x11) goto code_r0x0009834c;
      }
      uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
      uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
      uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
      uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
      uVar16 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) + iVar14);
      goto LAB_000983b8;
    }
code_r0x0009834c:
    in_CY = in_stack_00000018 <= in_x11;
  } while( true );
}

