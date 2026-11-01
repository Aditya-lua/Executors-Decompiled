
/* WARNING: Type propagation algorithm not settling */

int FUN_0009e024(long *param_1,undefined8 param_2,long param_3,int param_4,ulong param_5)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  short *psVar6;
  long *plVar8;
  long *plVar7;
  long *plVar9;
  long *plVar10;
  ulong uVar11;
  uint uVar12;
  uint in_w10;
  ulong *puVar13;
  long lVar14;
  ulong *puVar15;
  long *plVar16;
  ulong uVar17;
  uint in_w16;
  long in_x17;
  char *unaff_x19;
  uint uVar18;
  int *piVar19;
  ulong unaff_x20;
  long unaff_x21;
  short *unaff_x22;
  short *psVar20;
  long *unaff_x23;
  int iVar21;
  long unaff_x24;
  ulong uVar22;
  ulong uVar23;
  long *unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  
code_r0x0009e024:
  unaff_x22[0] = -1;
  unaff_x22[1] = -1;
  if (0x3fb < in_w10) {
    *(short **)(unaff_x29 + -0x68) = (short *)((long)param_1 + 6);
    uVar18 = (int)unaff_x20 - 0x40b;
    uVar12 = (uint)((ulong)uVar18 * (param_5 & 0xffffffff) >> 0x29);
    uVar23 = (ulong)(uVar12 << 2);
    _memset((short *)((long)param_1 + 6),0xff,uVar23 + 4);
    param_5 = 0x80808081;
    param_4 = 0xffff;
    in_x17 = -0x30e4432345000000;
    in_w10 = uVar18 + uVar12 * -0x3fc;
    unaff_x19 = *(char **)(unaff_x29 + -0x70);
    param_3 = *(long *)(unaff_x29 + -0x60);
    unaff_x22 = (short *)(*(long *)(unaff_x29 + -0x68) + uVar23);
  }
  uVar18 = (in_w10 & 0xffff) / 0xff;
  pcVar2 = (char *)((long)unaff_x22 + (ulong)uVar18);
  *pcVar2 = (char)in_w10 + (char)uVar18;
  psVar20 = (short *)(pcVar2 + 1);
  plVar16 = unaff_x23;
  do {
    uVar23 = unaff_x20 & 0xffffffff;
    plVar10 = (long *)((long)plVar16 + uVar23 + 4);
    if (unaff_x27 <= plVar10) {
LAB_0009c5e0:
      uVar23 = *(long *)(unaff_x29 + -0x78) - (long)plVar10;
      if (unaff_x19 < (char *)((long)psVar20 + (uVar23 + 0xf0) / 0xff + uVar23 + 1)) {
        return 0;
      }
      uVar11 = uVar23 - 0xf;
      if (uVar23 < 0xf) {
        *(char *)psVar20 = (char)((int)uVar23 << 4);
      }
      else {
        psVar6 = (short *)((long)psVar20 + 1);
        *(char *)psVar20 = -0x10;
        if (0xfe < uVar11) {
          uVar11 = ((param_3 + in_stack_00000090) - (long)plVar10) - 0x10e;
          uVar17 = uVar11 / 0xff;
          _memset(psVar6,0xff,uVar17 + 1);
          uVar11 = uVar11 % 0xff;
          psVar6 = (short *)((long)psVar20 + uVar17 + 2);
        }
        *(char *)psVar6 = (char)uVar11;
        psVar20 = psVar6;
      }
      _memcpy((char *)((long)psVar20 + 1),plVar10,uVar23);
      return ((int)(char *)((long)psVar20 + 1) + (int)uVar23) - in_stack_00000078;
    }
    plVar9 = (long *)((long)plVar16 + uVar23 + 2);
    iVar21 = (int)unaff_x24;
    *(int *)(unaff_x21 + ((ulong)(*plVar9 * in_x17) >> 0x32 & 0x3ffc)) = (int)plVar9 - iVar21;
    uVar11 = (ulong)(*plVar10 * in_x17) >> 0x32 & 0x3ffc;
    uVar18 = *(uint *)(unaff_x21 + uVar11);
    uVar12 = (int)plVar10 - iVar21;
    *(uint *)(unaff_x21 + uVar11) = uVar12;
    if ((uVar18 < in_w16 || uVar18 + param_4 < uVar12) ||
       (piVar19 = (int *)(unaff_x24 + (ulong)uVar18), *piVar19 != (int)*plVar10)) {
      plVar9 = (long *)((long)plVar16 + uVar23 + 6);
      uVar18 = *(uint *)(unaff_x29 + -0x80);
      if (unaff_x27 < plVar9) goto LAB_0009c5e0;
      unaff_x23 = (long *)((long)plVar16 + uVar23 + 5);
      lVar14 = *unaff_x23;
      uVar12 = in_stack_00000080._4_4_;
      while( true ) {
        uVar17 = (ulong)(lVar14 * in_x17) >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar17);
        uVar11 = (ulong)uVar3;
        uVar4 = (int)unaff_x23 - iVar21;
        lVar14 = *plVar9;
        *(uint *)(unaff_x21 + uVar17) = uVar4;
        if ((in_w16 <= uVar3 && uVar4 <= uVar3 + param_4) &&
           (*(int *)(unaff_x24 + uVar11) == (int)*unaff_x23)) break;
        plVar7 = (long *)((long)plVar9 + (ulong)uVar12);
        uVar12 = uVar18 >> 6;
        uVar18 = uVar18 + 1;
        unaff_x23 = plVar9;
        plVar9 = plVar7;
        if (unaff_x27 < plVar7) goto LAB_0009c5e0;
      }
      piVar19 = (int *)(unaff_x24 + uVar11);
      if ((*(int **)(unaff_x29 + -0x88) < piVar19) &&
         (*(char *)((long)unaff_x23 - 1) == *(char *)((long)piVar19 - 1))) {
        piVar5 = (int *)(in_stack_00000050 + uVar11);
        plVar7 = (long *)((long)unaff_x23 - 1U);
        plVar8 = (long *)((long)unaff_x23 - 1U);
        do {
          plVar9 = plVar8;
          unaff_x23 = plVar7;
          piVar19 = piVar5;
          if ((piVar19 <= *(int **)(unaff_x29 + -0x88)) || (unaff_x23 <= plVar10)) break;
          piVar5 = (int *)((long)piVar19 + -1);
          plVar7 = (long *)((long)unaff_x23 + -1);
          plVar8 = (long *)((long)plVar9 - 1);
        } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)piVar19 + -1));
      }
      else {
        plVar9 = unaff_x23;
      }
      plVar7 = (long *)((long)psVar20 + 1);
      uVar11 = (long)plVar9 - (long)plVar10 & 0xffffffff;
      if (unaff_x19 <
          (char *)((long)plVar7 + (uVar11 * (param_5 & 0xffffffff) >> 0x27) + uVar11 + 8)) {
        return 0;
      }
      uVar12 = (uint)((long)plVar9 - (long)plVar10);
      uVar18 = uVar12 - 0xf;
      if (uVar12 < 0xf) {
        *(char *)psVar20 = (char)(uVar12 << 4);
      }
      else {
        *(char *)psVar20 = -0x10;
        plVar8 = plVar7;
        if (0xfe < uVar18) {
          uVar18 = ((int)plVar9 - (int)plVar10) - 0x10e;
          uVar17 = (ulong)uVar18 * (param_5 & 0xffffffff);
          uVar22 = uVar17 >> 0x27;
          *(long **)(unaff_x29 + -0x68) = unaff_x23;
          _memset(plVar7,0xff,uVar22 + 1);
          unaff_x23 = *(long **)(unaff_x29 + -0x68);
          param_3 = *(long *)(unaff_x29 + -0x60);
          param_5 = 0x80808081;
          param_4 = 0xffff;
          in_x17 = -0x30e4432345000000;
          uVar18 = uVar18 + (uint)(uVar17 >> 0x27);
          plVar8 = (long *)((long)psVar20 + uVar22 + 2);
        }
        plVar7 = (long *)((long)plVar8 + 1);
        *(char *)plVar8 = (char)uVar18;
      }
      param_1 = (long *)((long)plVar7 + uVar11);
      plVar9 = param_1;
      if (param_1 <= plVar7 + 1) {
        plVar9 = plVar7 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar9 + ~(ulong)plVar7)) &&
         (0x3f < (ulong)((long)plVar7 - (long)plVar10))) {
        uVar11 = ((long)plVar9 + ~(ulong)plVar7 >> 3) + 1;
        uVar17 = uVar11 & 0x3ffffffffffffff8;
        plVar16 = (long *)((long)plVar16 + uVar23 + 0x24);
        plVar9 = plVar7 + 4;
        uVar23 = uVar17;
        do {
          lVar14 = plVar16[-4];
          lVar25 = plVar16[-1];
          lVar24 = plVar16[-2];
          lVar27 = plVar16[1];
          lVar26 = *plVar16;
          lVar29 = plVar16[3];
          lVar28 = plVar16[2];
          plVar9[-3] = plVar16[-3];
          plVar9[-4] = lVar14;
          plVar9[-1] = lVar25;
          plVar9[-2] = lVar24;
          plVar9[1] = lVar27;
          *plVar9 = lVar26;
          plVar9[3] = lVar29;
          plVar9[2] = lVar28;
          uVar23 = uVar23 - 8;
          plVar16 = plVar16 + 8;
          plVar9 = plVar9 + 8;
        } while (uVar23 != 0);
        plVar10 = plVar10 + uVar17;
        plVar7 = plVar7 + uVar17;
        if (uVar11 == uVar17) goto LAB_0009df14;
      }
      do {
        plVar16 = plVar7 + 1;
        *plVar7 = *plVar10;
        plVar10 = plVar10 + 1;
        plVar7 = plVar16;
      } while (plVar16 < param_1);
    }
    else {
      param_1 = (long *)((long)psVar20 + 1);
      *(char *)psVar20 = '\0';
      unaff_x23 = plVar10;
    }
LAB_0009df14:
    unaff_x22 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x23 - (short)piVar19;
    puVar1 = (ulong *)((long)unaff_x23 + 4);
    puVar15 = (ulong *)(piVar19 + 1);
    puVar13 = puVar1;
    if (puVar1 < unaff_x28) {
      uVar23 = *puVar1 ^ *puVar15;
      if (uVar23 == 0) {
        puVar15 = (ulong *)(piVar19 + 3);
        puVar13 = (ulong *)((long)unaff_x23 + 0xc);
        goto joined_r0x0009e178;
      }
      uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
      uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
      uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
      uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
      unaff_x20 = (ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3;
    }
    else {
joined_r0x0009e178:
      if (puVar13 < unaff_x28) {
        iVar21 = ((int)puVar13 - (int)unaff_x23) + -4;
        do {
          uVar23 = *puVar13 ^ *puVar15;
          if (uVar23 != 0) {
            uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
            uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
            uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
            uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
            unaff_x20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) +
                                     iVar21);
            goto code_r0x0009dff8;
          }
          puVar13 = puVar13 + 1;
          puVar15 = puVar15 + 1;
          iVar21 = iVar21 + 8;
        } while (puVar13 < unaff_x28);
      }
      if (puVar13 < in_stack_00000060) {
        if ((int)*puVar15 == (int)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 4);
          puVar15 = (ulong *)((long)puVar15 + 4);
        }
      }
      if (puVar13 < in_stack_00000058) {
        if ((short)*puVar15 == (short)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 2);
          puVar15 = (ulong *)((long)puVar15 + 2);
        }
      }
      if (puVar13 < in_stack_00000068) {
        if ((char)*puVar15 == (char)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 1);
        }
      }
      unaff_x20 = (ulong)(uint)((int)puVar13 - (int)puVar1);
    }
code_r0x0009dff8:
    uVar18 = (uint)unaff_x20;
    if (unaff_x19 <
        (char *)((long)param_1 + ((ulong)(uVar18 + 0xf0) * (param_5 & 0xffffffff) >> 0x27) + 8)) {
      return 0;
    }
    in_w10 = uVar18 - 0xf;
    if (0xe < uVar18) break;
    *(char *)psVar20 = (char)*psVar20 + (char)unaff_x20;
    psVar20 = unaff_x22;
    plVar16 = unaff_x23;
  } while( true );
  *(char *)psVar20 = (char)*psVar20 + '\x0f';
  goto code_r0x0009e024;
}

