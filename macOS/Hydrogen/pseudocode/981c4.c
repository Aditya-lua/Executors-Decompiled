
/* WARNING: Type propagation algorithm not settling */

int FUN_000981c4(long *param_1,long *param_2,uint param_3)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  undefined1 in_ZR;
  undefined1 in_CY;
  short *psVar6;
  ulong uVar7;
  ulong uVar8;
  long *plVar9;
  uint uVar10;
  ulong in_x10;
  uint uVar11;
  ulong *puVar12;
  long lVar13;
  ulong uVar14;
  ulong *puVar15;
  long *plVar16;
  long *plVar17;
  long *in_x16;
  int in_w17;
  long unaff_x19;
  ulong *unaff_x20;
  long *unaff_x21;
  int *unaff_x22;
  char *unaff_x23;
  int iVar18;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  short *unaff_x27;
  short *psVar19;
  long *unaff_x28;
  long unaff_x29;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
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
  
code_r0x000981c4:
  if ((bool)in_CY && !(bool)in_ZR) {
    return 0;
  }
  uVar10 = (uint)in_x10;
  uVar11 = uVar10 - 0xf;
  if (uVar10 < 0xf) {
    *(char *)unaff_x27 = (char)(uVar10 << 4);
  }
  else {
    *(char *)unaff_x27 = -0x10;
    plVar9 = param_2;
    if (0xfe < uVar11) {
      uVar11 = ((int)param_1 - (int)unaff_x21) - 0x10e;
      uVar7 = (ulong)uVar11 * (ulong)param_3;
      uVar8 = uVar7 >> 0x27;
      _memset(param_2,0xff,uVar8 + 1);
      param_3 = 0x80808081;
      in_w17 = 0xffff;
      uVar11 = uVar11 + (uint)(uVar7 >> 0x27);
      plVar9 = (long *)((long)unaff_x27 + uVar8 + 2);
    }
    param_2 = (long *)((long)plVar9 + 1);
    *(char *)plVar9 = (char)uVar11;
  }
  plVar9 = (long *)((long)param_2 + unaff_x26);
  plVar16 = plVar9;
  if (plVar9 <= param_2 + 1) {
    plVar16 = param_2 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar16 + ~(ulong)param_2)) &&
     (0x3f < (ulong)((long)param_2 - (long)unaff_x21))) {
    uVar7 = ((long)plVar16 + ~(ulong)param_2 >> 3) + 1;
    uVar14 = uVar7 & 0x3ffffffffffffff8;
    plVar16 = unaff_x21 + 4;
    plVar17 = param_2 + 4;
    uVar8 = uVar14;
    do {
      lVar13 = plVar16[-4];
      lVar21 = plVar16[-1];
      lVar20 = plVar16[-2];
      lVar23 = plVar16[1];
      lVar22 = *plVar16;
      lVar25 = plVar16[3];
      lVar24 = plVar16[2];
      plVar17[-3] = plVar16[-3];
      plVar17[-4] = lVar13;
      plVar17[-1] = lVar21;
      plVar17[-2] = lVar20;
      plVar17[1] = lVar23;
      *plVar17 = lVar22;
      plVar17[3] = lVar25;
      plVar17[2] = lVar24;
      uVar8 = uVar8 - 8;
      plVar16 = plVar16 + 8;
      plVar17 = plVar17 + 8;
    } while (uVar8 != 0);
    unaff_x21 = unaff_x21 + uVar14;
    param_2 = param_2 + uVar14;
    if (uVar7 == uVar14) goto code_r0x000982cc;
  }
  do {
    plVar16 = param_2 + 1;
    *param_2 = *unaff_x21;
    unaff_x21 = unaff_x21 + 1;
    param_2 = plVar16;
  } while (plVar16 < plVar9);
code_r0x000982cc:
  unaff_x21 = in_x16;
  do {
    psVar19 = (short *)((long)plVar9 + 2);
    *(short *)plVar9 = (short)unaff_x21 - (short)unaff_x22;
    puVar1 = (ulong *)((long)unaff_x21 + 4);
    puVar15 = (ulong *)(unaff_x22 + 1);
    puVar12 = puVar1;
    if (puVar1 < unaff_x20) {
      uVar7 = *puVar1 ^ *puVar15;
      if (uVar7 == 0) {
        puVar15 = (ulong *)(unaff_x22 + 3);
        puVar12 = (ulong *)((long)unaff_x21 + 0xc);
        goto joined_r0x00098538;
      }
      uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
      uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
      uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
      uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
      uVar11 = (uint)((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3);
    }
    else {
joined_r0x00098538:
      if (puVar12 < unaff_x20) {
        iVar18 = ((int)puVar12 - (int)unaff_x21) + -4;
        do {
          uVar7 = *puVar12 ^ *puVar15;
          if (uVar7 != 0) {
            uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
            uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
            uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
            uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
            uVar11 = (int)((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) + iVar18;
            goto LAB_000983b8;
          }
          puVar12 = puVar12 + 1;
          puVar15 = puVar15 + 1;
          iVar18 = iVar18 + 8;
        } while (puVar12 < unaff_x20);
      }
      if (puVar12 < in_stack_00000018) {
        if ((int)*puVar15 == (int)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 4);
          puVar15 = (ulong *)((long)puVar15 + 4);
        }
      }
      if (puVar12 < in_stack_00000010) {
        if ((short)*puVar15 == (short)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 2);
          puVar15 = (ulong *)((long)puVar15 + 2);
        }
      }
      if (puVar12 < in_stack_00000020) {
        if ((char)*puVar15 == (char)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 1);
        }
      }
      uVar11 = (int)puVar12 - (int)puVar1;
    }
LAB_000983b8:
    if (unaff_x23 < (char *)((long)plVar9 + ((ulong)(uVar11 + 0xf0) * (ulong)param_3 >> 0x27) + 8))
    {
      return 0;
    }
    uVar10 = uVar11 - 0xf;
    if (uVar11 < 0xf) {
      *(char *)unaff_x27 = (char)*unaff_x27 + (char)uVar11;
      unaff_x21 = (long *)((long)unaff_x21 + (ulong)uVar11 + 4);
      unaff_x27 = psVar19;
      if (unaff_x28 <= unaff_x21) goto code_r0x00098604;
    }
    else {
      *(char *)unaff_x27 = (char)*unaff_x27 + '\x0f';
      psVar19[0] = -1;
      psVar19[1] = -1;
      if (0x3fb < uVar10) {
        uVar10 = (uint)((ulong)(uVar11 - 0x40b) * (ulong)param_3 >> 0x29);
        uVar7 = (ulong)(uVar10 << 2);
        _memset((short *)((long)plVar9 + 6),0xff,uVar7 + 4);
        param_3 = 0x80808081;
        in_w17 = 0xffff;
        uVar10 = (uVar11 - 0x40b) + uVar10 * -0x3fc;
        unaff_x19 = -0x30e4432345000000;
        psVar19 = (short *)((long)plVar9 + 6 + uVar7);
        unaff_x28 = in_stack_00000060;
      }
      uVar3 = (uVar10 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar19 + (ulong)uVar3);
      psVar19 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar10 + (char)uVar3;
      unaff_x21 = (long *)((long)unaff_x21 + (ulong)uVar11 + 4);
      unaff_x27 = psVar19;
      if (unaff_x28 <= unaff_x21) goto code_r0x00098604;
    }
    iVar18 = (int)unaff_x24;
    *(int *)(unaff_x25 + ((ulong)(*(long *)((long)unaff_x21 + -2) * unaff_x19) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)unaff_x21 + -2) - iVar18;
    uVar10 = (int)unaff_x21 - iVar18;
    uVar7 = (ulong)(*unaff_x21 * unaff_x19) >> 0x32 & 0x3ffc;
    uVar11 = *(uint *)(unaff_x25 + uVar7);
    *(uint *)(unaff_x25 + uVar7) = uVar10;
    if ((uVar11 + in_w17 < uVar10) ||
       (unaff_x22 = (int *)(unaff_x24 + (ulong)uVar11), *unaff_x22 != (int)*unaff_x21)) break;
    plVar9 = (long *)((long)unaff_x27 + 1);
    *(char *)unaff_x27 = '\0';
  } while( true );
  psVar19 = unaff_x27;
  if (unaff_x28 < (long *)((long)unaff_x21 + 2U)) {
code_r0x00098604:
    uVar7 = in_stack_00000040 - (long)unaff_x21;
    if (unaff_x23 < (char *)((long)psVar19 + (uVar7 + 0xf0) / 0xff + uVar7 + 1)) {
      return 0;
    }
    uVar8 = uVar7 - 0xf;
    if (uVar7 < 0xf) {
      *(char *)psVar19 = (char)((int)uVar7 << 4);
    }
    else {
      psVar6 = (short *)((long)psVar19 + 1);
      *(char *)psVar19 = -0x10;
      if (0xfe < uVar8) {
        uVar8 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000008) - (long)unaff_x21) - 0x10e;
        uVar14 = uVar8 / 0xff;
        _memset(psVar6,0xff,uVar14 + 1);
        uVar8 = uVar8 % 0xff;
        psVar6 = (short *)((long)psVar19 + uVar14 + 2);
      }
      *(char *)psVar6 = (char)uVar8;
      psVar19 = psVar6;
    }
    _memcpy((char *)((long)psVar19 + 1),unaff_x21,uVar7);
    return ((int)(char *)((long)psVar19 + 1) + (int)uVar7) - in_stack_00000058;
  }
  lVar13 = *(long *)((long)unaff_x21 + 1U);
  param_1 = (long *)((long)unaff_x21 + 1U);
  plVar9 = (long *)((long)unaff_x21 + 2U);
  uVar10 = in_stack_00000050;
  uVar11 = in_stack_00000048;
  while( true ) {
    uVar8 = (ulong)(lVar13 * unaff_x19) >> 0x32 & 0x3ffc;
    uVar3 = *(uint *)(unaff_x25 + uVar8);
    uVar7 = (ulong)uVar3;
    uVar4 = (int)param_1 - iVar18;
    lVar13 = *plVar9;
    *(uint *)(unaff_x25 + uVar8) = uVar4;
    if ((uVar4 <= uVar3 + in_w17) && (*(int *)(unaff_x24 + uVar7) == (int)*param_1)) break;
    plVar16 = (long *)((long)plVar9 + (ulong)uVar10);
    uVar10 = uVar11 >> 6;
    uVar11 = uVar11 + 1;
    param_1 = plVar9;
    plVar9 = plVar16;
    if (unaff_x28 < plVar16) goto code_r0x00098604;
  }
  unaff_x22 = (int *)(unaff_x24 + uVar7);
  if ((*(int **)(unaff_x29 + -0x58) < unaff_x22) &&
     (*(char *)((long)param_1 - 1) == *(char *)((long)unaff_x22 - 1))) {
    piVar5 = (int *)(in_stack_00000000 + uVar7);
    plVar9 = (long *)((long)param_1 - 1U);
    plVar16 = (long *)((long)param_1 - 1U);
    do {
      param_1 = plVar16;
      in_x16 = plVar9;
      unaff_x22 = piVar5;
      if ((unaff_x22 <= *(int **)(unaff_x29 + -0x58)) || (in_x16 <= unaff_x21)) break;
      piVar5 = (int *)((long)unaff_x22 + -1);
      plVar9 = (long *)((long)in_x16 + -1);
      plVar16 = (long *)((long)param_1 - 1);
    } while (*(char *)((long)in_x16 + -1) == *(char *)((long)unaff_x22 + -1));
  }
  else {
    in_x16 = param_1;
  }
  in_x10 = (long)param_1 - (long)unaff_x21;
  param_2 = (long *)((long)unaff_x27 + 1);
  unaff_x26 = in_x10 & 0xffffffff;
  pcVar2 = (char *)((long)param_2 + (unaff_x26 * param_3 >> 0x27) + unaff_x26 + 8);
  in_CY = unaff_x23 <= pcVar2;
  in_ZR = pcVar2 == unaff_x23;
  goto code_r0x000981c4;
}

