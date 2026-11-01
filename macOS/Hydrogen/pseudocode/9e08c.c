
/* WARNING: Type propagation algorithm not settling */

int FUN_0009e08c(undefined8 param_1,undefined8 param_2,int param_3,ulong param_4)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  long *plVar7;
  long *plVar6;
  long lVar8;
  long *plVar9;
  long *plVar10;
  ulong uVar11;
  uint uVar12;
  uint in_w10;
  ulong uVar13;
  ulong *puVar14;
  long lVar15;
  ulong *puVar16;
  long *plVar17;
  ulong uVar18;
  uint in_w16;
  long in_x17;
  char *unaff_x19;
  uint uVar19;
  int *piVar20;
  ulong unaff_x20;
  long unaff_x21;
  short *psVar21;
  short *psVar22;
  long *unaff_x23;
  int iVar23;
  long unaff_x24;
  ulong uVar24;
  ulong unaff_x25;
  long *unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long in_stack_00000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  
code_r0x0009e08c:
  lVar8 = *(long *)(unaff_x29 + -0x60);
  psVar21 = (short *)(*(long *)(unaff_x29 + -0x68) + unaff_x25);
code_r0x0009e094:
  uVar19 = (in_w10 & 0xffff) / 0xff;
  pcVar2 = (char *)((long)psVar21 + (ulong)uVar19);
  *pcVar2 = (char)in_w10 + (char)uVar19;
  psVar22 = (short *)(pcVar2 + 1);
  plVar17 = unaff_x23;
  do {
    uVar13 = unaff_x20 & 0xffffffff;
    plVar10 = (long *)((long)plVar17 + uVar13 + 4);
    if (unaff_x27 <= plVar10) {
LAB_0009c5e0:
      uVar13 = *(long *)(unaff_x29 + -0x78) - (long)plVar10;
      if (unaff_x19 < (char *)((long)psVar22 + (uVar13 + 0xf0) / 0xff + uVar13 + 1)) {
        return 0;
      }
      uVar11 = uVar13 - 0xf;
      if (uVar13 < 0xf) {
        *(char *)psVar22 = (char)((int)uVar13 << 4);
      }
      else {
        psVar21 = (short *)((long)psVar22 + 1);
        *(char *)psVar22 = -0x10;
        if (0xfe < uVar11) {
          uVar11 = ((lVar8 + in_stack_00000090) - (long)plVar10) - 0x10e;
          uVar18 = uVar11 / 0xff;
          _memset(psVar21,0xff,uVar18 + 1);
          uVar11 = uVar11 % 0xff;
          psVar21 = (short *)((long)psVar22 + uVar18 + 2);
        }
        *(char *)psVar21 = (char)uVar11;
        psVar22 = psVar21;
      }
      _memcpy((char *)((long)psVar22 + 1),plVar10,uVar13);
      return ((int)(char *)((long)psVar22 + 1) + (int)uVar13) - in_stack_00000078;
    }
    plVar9 = (long *)((long)plVar17 + uVar13 + 2);
    iVar23 = (int)unaff_x24;
    *(int *)(unaff_x21 + ((ulong)(*plVar9 * in_x17) >> 0x32 & 0x3ffc)) = (int)plVar9 - iVar23;
    uVar11 = (ulong)(*plVar10 * in_x17) >> 0x32 & 0x3ffc;
    uVar19 = *(uint *)(unaff_x21 + uVar11);
    uVar12 = (int)plVar10 - iVar23;
    *(uint *)(unaff_x21 + uVar11) = uVar12;
    if ((uVar19 < in_w16 || uVar19 + param_3 < uVar12) ||
       (piVar20 = (int *)(unaff_x24 + (ulong)uVar19), *piVar20 != (int)*plVar10)) {
      plVar9 = (long *)((long)plVar17 + uVar13 + 6);
      uVar19 = *(uint *)(unaff_x29 + -0x80);
      if (unaff_x27 < plVar9) goto LAB_0009c5e0;
      unaff_x23 = (long *)((long)plVar17 + uVar13 + 5);
      lVar15 = *unaff_x23;
      uVar12 = in_stack_00000080._4_4_;
      while( true ) {
        uVar18 = (ulong)(lVar15 * in_x17) >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar18);
        uVar11 = (ulong)uVar3;
        uVar4 = (int)unaff_x23 - iVar23;
        lVar15 = *plVar9;
        *(uint *)(unaff_x21 + uVar18) = uVar4;
        if ((in_w16 <= uVar3 && uVar4 <= uVar3 + param_3) &&
           (*(int *)(unaff_x24 + uVar11) == (int)*unaff_x23)) break;
        plVar6 = (long *)((long)plVar9 + (ulong)uVar12);
        uVar12 = uVar19 >> 6;
        uVar19 = uVar19 + 1;
        unaff_x23 = plVar9;
        plVar9 = plVar6;
        if (unaff_x27 < plVar6) goto LAB_0009c5e0;
      }
      piVar20 = (int *)(unaff_x24 + uVar11);
      if ((*(int **)(unaff_x29 + -0x88) < piVar20) &&
         (*(char *)((long)unaff_x23 - 1) == *(char *)((long)piVar20 - 1))) {
        piVar5 = (int *)(in_stack_00000050 + uVar11);
        plVar6 = (long *)((long)unaff_x23 - 1U);
        plVar7 = (long *)((long)unaff_x23 - 1U);
        do {
          plVar9 = plVar7;
          unaff_x23 = plVar6;
          piVar20 = piVar5;
          if ((piVar20 <= *(int **)(unaff_x29 + -0x88)) || (unaff_x23 <= plVar10)) break;
          piVar5 = (int *)((long)piVar20 + -1);
          plVar6 = (long *)((long)unaff_x23 + -1);
          plVar7 = (long *)((long)plVar9 - 1);
        } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)piVar20 + -1));
      }
      else {
        plVar9 = unaff_x23;
      }
      plVar6 = (long *)((long)psVar22 + 1);
      uVar11 = (long)plVar9 - (long)plVar10 & 0xffffffff;
      if (unaff_x19 <
          (char *)((long)plVar6 + (uVar11 * (param_4 & 0xffffffff) >> 0x27) + uVar11 + 8)) {
        return 0;
      }
      uVar12 = (uint)((long)plVar9 - (long)plVar10);
      uVar19 = uVar12 - 0xf;
      if (uVar12 < 0xf) {
        *(char *)psVar22 = (char)(uVar12 << 4);
      }
      else {
        *(char *)psVar22 = -0x10;
        plVar7 = plVar6;
        if (0xfe < uVar19) {
          uVar19 = ((int)plVar9 - (int)plVar10) - 0x10e;
          uVar18 = (ulong)uVar19 * (param_4 & 0xffffffff);
          uVar24 = uVar18 >> 0x27;
          *(long **)(unaff_x29 + -0x68) = unaff_x23;
          _memset(plVar6,0xff,uVar24 + 1);
          unaff_x23 = *(long **)(unaff_x29 + -0x68);
          lVar8 = *(long *)(unaff_x29 + -0x60);
          param_4 = 0x80808081;
          param_3 = 0xffff;
          in_x17 = -0x30e4432345000000;
          uVar19 = uVar19 + (uint)(uVar18 >> 0x27);
          plVar7 = (long *)((long)psVar22 + uVar24 + 2);
        }
        plVar6 = (long *)((long)plVar7 + 1);
        *(char *)plVar7 = (char)uVar19;
      }
      plVar9 = (long *)((long)plVar6 + uVar11);
      plVar7 = plVar9;
      if (plVar9 <= plVar6 + 1) {
        plVar7 = plVar6 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar7 + ~(ulong)plVar6)) &&
         (0x3f < (ulong)((long)plVar6 - (long)plVar10))) {
        uVar11 = ((long)plVar7 + ~(ulong)plVar6 >> 3) + 1;
        uVar18 = uVar11 & 0x3ffffffffffffff8;
        plVar17 = (long *)((long)plVar17 + uVar13 + 0x24);
        plVar7 = plVar6 + 4;
        uVar13 = uVar18;
        do {
          lVar15 = plVar17[-4];
          lVar26 = plVar17[-1];
          lVar25 = plVar17[-2];
          lVar28 = plVar17[1];
          lVar27 = *plVar17;
          lVar30 = plVar17[3];
          lVar29 = plVar17[2];
          plVar7[-3] = plVar17[-3];
          plVar7[-4] = lVar15;
          plVar7[-1] = lVar26;
          plVar7[-2] = lVar25;
          plVar7[1] = lVar28;
          *plVar7 = lVar27;
          plVar7[3] = lVar30;
          plVar7[2] = lVar29;
          uVar13 = uVar13 - 8;
          plVar17 = plVar17 + 8;
          plVar7 = plVar7 + 8;
        } while (uVar13 != 0);
        plVar10 = plVar10 + uVar18;
        plVar6 = plVar6 + uVar18;
        if (uVar11 == uVar18) goto LAB_0009df14;
      }
      do {
        plVar17 = plVar6 + 1;
        *plVar6 = *plVar10;
        plVar10 = plVar10 + 1;
        plVar6 = plVar17;
      } while (plVar17 < plVar9);
    }
    else {
      plVar9 = (long *)((long)psVar22 + 1);
      *(char *)psVar22 = '\0';
      unaff_x23 = plVar10;
    }
LAB_0009df14:
    psVar21 = (short *)((long)plVar9 + 2);
    *(short *)plVar9 = (short)unaff_x23 - (short)piVar20;
    puVar1 = (ulong *)((long)unaff_x23 + 4);
    puVar16 = (ulong *)(piVar20 + 1);
    puVar14 = puVar1;
    if (puVar1 < unaff_x28) {
      uVar13 = *puVar1 ^ *puVar16;
      if (uVar13 == 0) {
        puVar16 = (ulong *)(piVar20 + 3);
        puVar14 = (ulong *)((long)unaff_x23 + 0xc);
        goto joined_r0x0009e178;
      }
      uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
      uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
      uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
      uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
      unaff_x20 = (ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3;
    }
    else {
joined_r0x0009e178:
      if (puVar14 < unaff_x28) {
        iVar23 = ((int)puVar14 - (int)unaff_x23) + -4;
        do {
          uVar13 = *puVar14 ^ *puVar16;
          if (uVar13 != 0) {
            uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
            uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
            uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
            uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
            unaff_x20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) +
                                     iVar23);
            goto code_r0x0009dff8;
          }
          puVar14 = puVar14 + 1;
          puVar16 = puVar16 + 1;
          iVar23 = iVar23 + 8;
        } while (puVar14 < unaff_x28);
      }
      if (puVar14 < in_stack_00000060) {
        if ((int)*puVar16 == (int)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 4);
          puVar16 = (ulong *)((long)puVar16 + 4);
        }
      }
      if (puVar14 < in_stack_00000058) {
        if ((short)*puVar16 == (short)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 2);
          puVar16 = (ulong *)((long)puVar16 + 2);
        }
      }
      if (puVar14 < in_stack_00000068) {
        if ((char)*puVar16 == (char)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 1);
        }
      }
      unaff_x20 = (ulong)(uint)((int)puVar14 - (int)puVar1);
    }
code_r0x0009dff8:
    uVar19 = (uint)unaff_x20;
    if (unaff_x19 <
        (char *)((long)plVar9 + ((ulong)(uVar19 + 0xf0) * (param_4 & 0xffffffff) >> 0x27) + 8)) {
      return 0;
    }
    in_w10 = uVar19 - 0xf;
    if (0xe < uVar19) break;
    *(char *)psVar22 = (char)*psVar22 + (char)unaff_x20;
    psVar22 = psVar21;
    plVar17 = unaff_x23;
  } while( true );
  *(char *)psVar22 = (char)*psVar22 + '\x0f';
  psVar21[0] = -1;
  psVar21[1] = -1;
  if (0x3fb < in_w10) goto code_r0x0009e034;
  goto code_r0x0009e094;
code_r0x0009e034:
  *(short **)(unaff_x29 + -0x68) = (short *)((long)plVar9 + 6);
  uVar12 = (uint)((ulong)(uVar19 - 0x40b) * (param_4 & 0xffffffff) >> 0x29);
  unaff_x25 = (ulong)(uVar12 << 2);
  _memset((short *)((long)plVar9 + 6),0xff,unaff_x25 + 4);
  param_4 = 0x80808081;
  param_3 = 0xffff;
  in_x17 = -0x30e4432345000000;
  in_w10 = (uVar19 - 0x40b) + uVar12 * -0x3fc;
  unaff_x19 = *(char **)(unaff_x29 + -0x70);
  goto code_r0x0009e08c;
}

