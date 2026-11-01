
/* WARNING: Type propagation algorithm not settling */

int FUN_0009e540(long *param_1,undefined8 param_2,long param_3,uint param_4)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  short *psVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  long *plVar10;
  undefined4 in_w9;
  long *plVar11;
  uint uVar12;
  uint in_w10;
  ulong uVar13;
  ulong *puVar14;
  long lVar15;
  ulong *puVar16;
  long *plVar17;
  ulong uVar18;
  int in_w17;
  char *unaff_x19;
  long unaff_x21;
  short *unaff_x22;
  short *psVar19;
  long *unaff_x23;
  int iVar20;
  long unaff_x24;
  uint uVar21;
  int *piVar22;
  ulong unaff_x25;
  long *unaff_x26;
  long unaff_x27;
  ulong uVar23;
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
  
code_r0x0009e540:
  *(undefined4 *)unaff_x22 = in_w9;
  if (0x3fb < in_w10) {
    uVar21 = (int)unaff_x25 - 0x40b;
    uVar12 = (uint)((ulong)uVar21 * (ulong)param_4 >> 0x29);
    uVar23 = (ulong)(uVar12 << 2);
    _memset((short *)((long)param_1 + 6),0xff,uVar23 + 4);
    param_4 = 0x80808081;
    in_w17 = 0xffff;
    in_w10 = uVar21 + uVar12 * -0x3fc;
    unaff_x26 = *(long **)(unaff_x29 + -0x68);
    param_3 = *(long *)(unaff_x29 + -0x60);
    unaff_x22 = (short *)((long)param_1 + 6 + uVar23);
    unaff_x27 = -0x30e4432345000000;
  }
  uVar21 = (in_w10 & 0xffff) / 0xff;
  pcVar2 = (char *)((long)unaff_x22 + (ulong)uVar21);
  *pcVar2 = (char)in_w10 + (char)uVar21;
  psVar19 = (short *)(pcVar2 + 1);
  plVar17 = unaff_x23;
  do {
    uVar23 = unaff_x25 & 0xffffffff;
    plVar11 = (long *)((long)plVar17 + uVar23 + 4);
    if (unaff_x26 <= plVar11) {
LAB_0009c85c:
      uVar23 = *(long *)(unaff_x29 + -0x70) - (long)plVar11;
      if (unaff_x19 < (char *)((long)psVar19 + (uVar23 + 0xf0) / 0xff + uVar23 + 1)) {
        return 0;
      }
      uVar13 = uVar23 - 0xf;
      if (uVar23 < 0xf) {
        *(char *)psVar19 = (char)((int)uVar23 << 4);
      }
      else {
        psVar6 = (short *)((long)psVar19 + 1);
        *(char *)psVar19 = -0x10;
        if (0xfe < uVar13) {
          uVar13 = ((param_3 + *(long *)(unaff_x29 + -0x88)) - (long)plVar11) - 0x10e;
          uVar18 = uVar13 / 0xff;
          _memset(psVar6,0xff,uVar18 + 1);
          uVar13 = uVar13 % 0xff;
          psVar6 = (short *)((long)psVar19 + uVar18 + 2);
        }
        *(char *)psVar6 = (char)uVar13;
        psVar19 = psVar6;
      }
      _memcpy((char *)((long)psVar19 + 1),plVar11,uVar23);
      return ((int)(char *)((long)psVar19 + 1) + (int)uVar23) - in_stack_00000078;
    }
    plVar10 = (long *)((long)plVar17 + uVar23 + 2);
    iVar20 = (int)unaff_x24;
    *(int *)(unaff_x21 + ((ulong)(*plVar10 * unaff_x27) >> 0x32 & 0x3ffc)) = (int)plVar10 - iVar20;
    uVar12 = (int)plVar11 - iVar20;
    uVar13 = (ulong)(*plVar11 * unaff_x27) >> 0x32 & 0x3ffc;
    uVar21 = *(uint *)(unaff_x21 + uVar13);
    *(uint *)(unaff_x21 + uVar13) = uVar12;
    if ((uVar21 + in_w17 < uVar12) ||
       (piVar22 = (int *)(unaff_x24 + (ulong)uVar21), *piVar22 != (int)*plVar11)) {
      plVar10 = (long *)((long)plVar17 + uVar23 + 6);
      uVar21 = *(uint *)(unaff_x29 + -0x80);
      if (unaff_x26 < plVar10) goto LAB_0009c85c;
      plVar8 = (long *)((long)plVar17 + uVar23 + 5);
      lVar15 = *plVar8;
      uVar12 = in_stack_00000080._4_4_;
      while( true ) {
        uVar18 = (ulong)(lVar15 * unaff_x27) >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar18);
        uVar13 = (ulong)uVar3;
        uVar4 = (int)plVar8 - iVar20;
        lVar15 = *plVar10;
        *(uint *)(unaff_x21 + uVar18) = uVar4;
        if ((uVar4 <= uVar3 + in_w17) && (*(int *)(unaff_x24 + uVar13) == (int)*plVar8)) break;
        plVar7 = (long *)((long)plVar10 + (ulong)uVar12);
        uVar12 = uVar21 >> 6;
        uVar21 = uVar21 + 1;
        plVar8 = plVar10;
        plVar10 = plVar7;
        if (unaff_x26 < plVar7) goto LAB_0009c85c;
      }
      piVar22 = (int *)(unaff_x24 + uVar13);
      if ((*(int **)(unaff_x29 + -0x78) < piVar22) &&
         (*(char *)((long)plVar8 - 1) == *(char *)((long)piVar22 - 1))) {
        piVar5 = (int *)(in_stack_00000050 + uVar13);
        plVar10 = (long *)((long)plVar8 - 1U);
        plVar7 = (long *)((long)plVar8 - 1U);
        do {
          plVar8 = plVar7;
          unaff_x23 = plVar10;
          piVar22 = piVar5;
          if ((piVar22 <= *(int **)(unaff_x29 + -0x78)) || (unaff_x23 <= plVar11)) break;
          piVar5 = (int *)((long)piVar22 + -1);
          plVar10 = (long *)((long)unaff_x23 + -1);
          plVar7 = (long *)((long)plVar8 - 1);
        } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)piVar22 + -1));
      }
      else {
        unaff_x23 = plVar8;
      }
      plVar10 = (long *)((long)psVar19 + 1);
      uVar13 = (long)plVar8 - (long)plVar11 & 0xffffffff;
      if (unaff_x19 < (char *)((long)plVar10 + (uVar13 * param_4 >> 0x27) + uVar13 + 8)) {
        return 0;
      }
      uVar12 = (uint)((long)plVar8 - (long)plVar11);
      uVar21 = uVar12 - 0xf;
      if (uVar12 < 0xf) {
        *(char *)psVar19 = (char)(uVar12 << 4);
      }
      else {
        *(char *)psVar19 = -0x10;
        plVar7 = plVar10;
        if (0xfe < uVar21) {
          uVar21 = ((int)plVar8 - (int)plVar11) - 0x10e;
          uVar18 = (ulong)uVar21 * (ulong)param_4;
          uVar9 = uVar18 >> 0x27;
          _memset(plVar10,0xff,uVar9 + 1);
          param_4 = 0x80808081;
          in_w17 = 0xffff;
          param_3 = *(long *)(unaff_x29 + -0x60);
          uVar21 = uVar21 + (uint)(uVar18 >> 0x27);
          plVar7 = (long *)((long)psVar19 + uVar9 + 2);
        }
        plVar10 = (long *)((long)plVar7 + 1);
        *(char *)plVar7 = (char)uVar21;
      }
      param_1 = (long *)((long)plVar10 + uVar13);
      plVar8 = param_1;
      if (param_1 <= plVar10 + 1) {
        plVar8 = plVar10 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar8 + ~(ulong)plVar10)) &&
         (0x3f < (ulong)((long)plVar10 - (long)plVar11))) {
        uVar13 = ((long)plVar8 + ~(ulong)plVar10 >> 3) + 1;
        uVar18 = uVar13 & 0x3ffffffffffffff8;
        plVar17 = (long *)((long)plVar17 + uVar23 + 0x24);
        plVar8 = plVar10 + 4;
        uVar23 = uVar18;
        do {
          lVar15 = plVar17[-4];
          lVar25 = plVar17[-1];
          lVar24 = plVar17[-2];
          lVar27 = plVar17[1];
          lVar26 = *plVar17;
          lVar29 = plVar17[3];
          lVar28 = plVar17[2];
          plVar8[-3] = plVar17[-3];
          plVar8[-4] = lVar15;
          plVar8[-1] = lVar25;
          plVar8[-2] = lVar24;
          plVar8[1] = lVar27;
          *plVar8 = lVar26;
          plVar8[3] = lVar29;
          plVar8[2] = lVar28;
          uVar23 = uVar23 - 8;
          plVar17 = plVar17 + 8;
          plVar8 = plVar8 + 8;
        } while (uVar23 != 0);
        plVar11 = plVar11 + uVar18;
        plVar10 = plVar10 + uVar18;
        if (uVar13 == uVar18) goto LAB_0009e42c;
      }
      do {
        plVar17 = plVar10 + 1;
        *plVar10 = *plVar11;
        plVar11 = plVar11 + 1;
        plVar10 = plVar17;
      } while (plVar17 < param_1);
    }
    else {
      param_1 = (long *)((long)psVar19 + 1);
      *(char *)psVar19 = '\0';
      unaff_x23 = plVar11;
    }
LAB_0009e42c:
    unaff_x22 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x23 - (short)piVar22;
    puVar1 = (ulong *)((long)unaff_x23 + 4);
    puVar16 = (ulong *)(piVar22 + 1);
    puVar14 = puVar1;
    if (puVar1 < unaff_x28) {
      uVar23 = *puVar1 ^ *puVar16;
      if (uVar23 == 0) {
        puVar16 = (ulong *)(piVar22 + 3);
        puVar14 = (ulong *)((long)unaff_x23 + 0xc);
        goto joined_r0x0009e680;
      }
      uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
      uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
      uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
      uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
      unaff_x25 = (ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3;
    }
    else {
joined_r0x0009e680:
      if (puVar14 < unaff_x28) {
        iVar20 = ((int)puVar14 - (int)unaff_x23) + -4;
        do {
          uVar23 = *puVar14 ^ *puVar16;
          if (uVar23 != 0) {
            uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
            uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
            uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
            uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
            unaff_x25 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) +
                                     iVar20);
            goto code_r0x0009e510;
          }
          puVar14 = puVar14 + 1;
          puVar16 = puVar16 + 1;
          iVar20 = iVar20 + 8;
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
      unaff_x25 = (ulong)(uint)((int)puVar14 - (int)puVar1);
    }
code_r0x0009e510:
    uVar21 = (uint)unaff_x25;
    if (unaff_x19 < (char *)((long)param_1 + ((ulong)(uVar21 + 0xf0) * (ulong)param_4 >> 0x27) + 8))
    {
      return 0;
    }
    in_w10 = uVar21 - 0xf;
    if (0xe < uVar21) break;
    *(char *)psVar19 = (char)*psVar19 + (char)unaff_x25;
    psVar19 = unaff_x22;
    plVar17 = unaff_x23;
  } while( true );
  *(char *)psVar19 = (char)*psVar19 + '\x0f';
  in_w9 = 0xffffffff;
  goto code_r0x0009e540;
}

