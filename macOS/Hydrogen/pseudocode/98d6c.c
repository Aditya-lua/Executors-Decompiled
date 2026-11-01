
/* WARNING: Type propagation algorithm not settling */

int FUN_00098d6c(long *param_1,undefined8 param_2,int param_3,uint param_4)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  long *plVar7;
  long *plVar6;
  short *psVar8;
  long *plVar9;
  long *plVar10;
  short *in_x9;
  uint uVar11;
  char *in_x10;
  ulong *puVar12;
  long lVar13;
  ulong *puVar14;
  long *in_x16;
  long unaff_x19;
  ulong uVar15;
  int *piVar16;
  ulong unaff_x20;
  ulong uVar17;
  long unaff_x21;
  long *unaff_x22;
  short *unaff_x23;
  ulong *unaff_x24;
  int iVar18;
  long unaff_x25;
  uint uVar19;
  char *unaff_x27;
  ulong uVar20;
  long unaff_x29;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  long in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
  do {
    if (unaff_x27 < in_x10 + 8) {
      return 0;
    }
    uVar11 = (uint)unaff_x20;
    uVar19 = uVar11 - 0xf;
    if (uVar11 < 0xf) {
      *(char *)in_x9 = (char)*in_x9 + (char)unaff_x20;
      in_x9 = unaff_x23;
    }
    else {
      *(char *)in_x9 = (char)*in_x9 + '\x0f';
      unaff_x23[0] = -1;
      unaff_x23[1] = -1;
      if (0x3fb < uVar19) {
        uVar19 = (uint)((ulong)(uVar11 - 0x40b) * (ulong)param_4 >> 0x29);
        uVar20 = (ulong)(uVar19 << 2);
        _memset((short *)((long)param_1 + 6),0xff,uVar20 + 4);
        param_4 = 0x80808081;
        param_3 = 0xffff;
        uVar19 = (uVar11 - 0x40b) + uVar19 * -0x3fc;
        unaff_x21 = *(long *)(unaff_x29 + -0x60);
        unaff_x19 = -0x30e4432345000000;
        unaff_x23 = (short *)((long)param_1 + 6 + uVar20);
      }
      uVar11 = (uVar19 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)unaff_x23 + (ulong)uVar11);
      in_x9 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar19 + (char)uVar11;
    }
    plVar10 = (long *)((long)unaff_x22 + (unaff_x20 & 0xffffffff) + 4);
    if (in_x16 <= plVar10) {
LAB_00098f40:
      uVar20 = in_stack_00000050 - (long)plVar10;
      if (unaff_x27 < (char *)((long)in_x9 + (uVar20 + 0xf0) / 0xff + uVar20 + 1)) {
        return 0;
      }
      uVar15 = uVar20 - 0xf;
      if (uVar20 < 0xf) {
        *(char *)in_x9 = (char)((int)uVar20 << 4);
      }
      else {
        psVar8 = (short *)((long)in_x9 + 1);
        *(char *)in_x9 = -0x10;
        if (0xfe < uVar15) {
          uVar15 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000018) - (long)plVar10) - 0x10e;
          uVar17 = uVar15 / 0xff;
          _memset(psVar8,0xff,uVar17 + 1);
          uVar15 = uVar15 % 0xff;
          psVar8 = (short *)((long)in_x9 + uVar17 + 2);
        }
        *(char *)psVar8 = (char)uVar15;
        in_x9 = psVar8;
      }
      _memcpy((char *)((long)in_x9 + 1),plVar10,uVar20);
      return ((int)(char *)((long)in_x9 + 1) + (int)uVar20) - in_stack_00000060;
    }
    iVar18 = (int)unaff_x25;
    *(int *)(unaff_x21 + ((ulong)(*(long *)((long)plVar10 + -2) * unaff_x19) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)plVar10 + -2) - iVar18;
    uVar11 = (int)plVar10 - iVar18;
    uVar20 = (ulong)(*plVar10 * unaff_x19) >> 0x32 & 0x3ffc;
    uVar19 = *(uint *)(unaff_x21 + uVar20);
    *(uint *)(unaff_x21 + uVar20) = uVar11;
    if ((uVar19 + param_3 < uVar11) ||
       (piVar16 = (int *)(unaff_x25 + (ulong)uVar19), *piVar16 != *(int *)plVar10)) {
      if (in_x16 < (long *)((long)plVar10 + 2U)) goto LAB_00098f40;
      lVar13 = *(long *)((long)plVar10 + 1U);
      plVar9 = (long *)((long)plVar10 + 1U);
      plVar6 = (long *)((long)plVar10 + 2U);
      uVar11 = in_stack_00000068;
      uVar19 = in_stack_00000058;
      while( true ) {
        uVar15 = (ulong)(lVar13 * unaff_x19) >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar15);
        uVar20 = (ulong)uVar3;
        uVar4 = (int)plVar9 - iVar18;
        lVar13 = *plVar6;
        *(uint *)(unaff_x21 + uVar15) = uVar4;
        if ((uVar4 <= uVar3 + param_3) && (*(int *)(unaff_x25 + uVar20) == (int)*plVar9)) break;
        plVar7 = (long *)((long)plVar6 + (ulong)uVar11);
        uVar11 = uVar19 >> 6;
        uVar19 = uVar19 + 1;
        plVar9 = plVar6;
        plVar6 = plVar7;
        if (in_x16 < plVar7) goto LAB_00098f40;
      }
      piVar16 = (int *)(unaff_x25 + uVar20);
      if ((*(int **)(unaff_x29 + -0x58) < piVar16) &&
         (*(char *)((long)plVar9 - 1) == *(char *)((long)piVar16 - 1))) {
        piVar5 = (int *)(in_stack_00000010 + uVar20);
        plVar6 = (long *)((long)plVar9 - 1U);
        plVar7 = (long *)((long)plVar9 - 1U);
        do {
          plVar9 = plVar7;
          unaff_x22 = plVar6;
          piVar16 = piVar5;
          if ((piVar16 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x22 <= plVar10)) break;
          piVar5 = (int *)((long)piVar16 + -1);
          plVar6 = (long *)((long)unaff_x22 + -1);
          plVar7 = (long *)((long)plVar9 - 1);
        } while (*(char *)((long)unaff_x22 + -1) == *(char *)((long)piVar16 + -1));
      }
      else {
        unaff_x22 = plVar9;
      }
      plVar6 = (long *)((long)in_x9 + 1);
      uVar20 = (long)plVar9 - (long)plVar10 & 0xffffffff;
      if (unaff_x27 < (char *)((long)plVar6 + (uVar20 * param_4 >> 0x27) + uVar20 + 8)) {
        return 0;
      }
      uVar11 = (uint)((long)plVar9 - (long)plVar10);
      uVar19 = uVar11 - 0xf;
      if (uVar11 < 0xf) {
        *(char *)in_x9 = (char)(uVar11 << 4);
      }
      else {
        *(char *)in_x9 = -0x10;
        plVar7 = plVar6;
        if (0xfe < uVar19) {
          uVar19 = ((int)plVar9 - (int)plVar10) - 0x10e;
          uVar15 = (ulong)uVar19 * (ulong)param_4;
          uVar17 = uVar15 >> 0x27;
          _memset(plVar6,0xff,uVar17 + 1);
          param_4 = 0x80808081;
          param_3 = 0xffff;
          uVar19 = uVar19 + (uint)(uVar15 >> 0x27);
          plVar7 = (long *)((long)in_x9 + uVar17 + 2);
        }
        plVar6 = (long *)((long)plVar7 + 1);
        *(char *)plVar7 = (char)uVar19;
      }
      param_1 = (long *)((long)plVar6 + uVar20);
      plVar9 = param_1;
      if (param_1 <= plVar6 + 1) {
        plVar9 = plVar6 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar9 + ~(ulong)plVar6)) &&
         (0x3f < (ulong)((long)plVar6 - (long)plVar10))) {
        uVar20 = ((long)plVar9 + ~(ulong)plVar6 >> 3) + 1;
        uVar17 = uVar20 & 0x3ffffffffffffff8;
        plVar9 = (long *)((long)plVar10 + 0x20);
        plVar7 = plVar6 + 4;
        uVar15 = uVar17;
        do {
          lVar13 = plVar9[-4];
          lVar22 = plVar9[-1];
          lVar21 = plVar9[-2];
          lVar24 = plVar9[1];
          lVar23 = *plVar9;
          lVar26 = plVar9[3];
          lVar25 = plVar9[2];
          plVar7[-3] = plVar9[-3];
          plVar7[-4] = lVar13;
          plVar7[-1] = lVar22;
          plVar7[-2] = lVar21;
          plVar7[1] = lVar24;
          *plVar7 = lVar23;
          plVar7[3] = lVar26;
          plVar7[2] = lVar25;
          uVar15 = uVar15 - 8;
          plVar9 = plVar9 + 8;
          plVar7 = plVar7 + 8;
        } while (uVar15 != 0);
        plVar10 = (long *)((long)plVar10 + uVar17 * 8);
        plVar6 = plVar6 + uVar17;
        if (uVar20 == uVar17) goto code_r0x00098c7c;
      }
      do {
        plVar9 = plVar6 + 1;
        *plVar6 = *plVar10;
        plVar10 = plVar10 + 1;
        plVar6 = plVar9;
      } while (plVar9 < param_1);
    }
    else {
      param_1 = (long *)((long)in_x9 + 1);
      *(char *)in_x9 = '\0';
      unaff_x22 = plVar10;
    }
code_r0x00098c7c:
    unaff_x23 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x22 - (short)piVar16;
    puVar1 = (ulong *)((long)unaff_x22 + 4);
    puVar14 = (ulong *)(piVar16 + 1);
    puVar12 = puVar1;
    if (puVar1 < unaff_x24) {
      uVar20 = *puVar1 ^ *puVar14;
      if (uVar20 == 0) {
        puVar14 = (ulong *)(piVar16 + 3);
        puVar12 = (ulong *)((long)unaff_x22 + 0xc);
        goto joined_r0x00098ee8;
      }
      uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
      uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      unaff_x20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
    }
    else {
joined_r0x00098ee8:
      if (puVar12 < unaff_x24) {
        iVar18 = ((int)puVar12 - (int)unaff_x22) + -4;
        do {
          uVar20 = *puVar12 ^ *puVar14;
          if (uVar20 != 0) {
            uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
            uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
            uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            unaff_x20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                     iVar18);
            goto code_r0x00098d60;
          }
          puVar12 = puVar12 + 1;
          puVar14 = puVar14 + 1;
          iVar18 = iVar18 + 8;
        } while (puVar12 < unaff_x24);
      }
      if (puVar12 < in_stack_00000028) {
        if ((int)*puVar14 == (int)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 4);
          puVar14 = (ulong *)((long)puVar14 + 4);
        }
      }
      if (puVar12 < in_stack_00000020) {
        if ((short)*puVar14 == (short)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 2);
          puVar14 = (ulong *)((long)puVar14 + 2);
        }
      }
      if (puVar12 < in_stack_00000030) {
        if ((char)*puVar14 == (char)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 1);
        }
      }
      unaff_x20 = (ulong)(uint)((int)puVar12 - (int)puVar1);
    }
code_r0x00098d60:
    in_x10 = (char *)((long)param_1 + ((ulong)((int)unaff_x20 + 0xf0) * (ulong)param_4 >> 0x27));
  } while( true );
}

