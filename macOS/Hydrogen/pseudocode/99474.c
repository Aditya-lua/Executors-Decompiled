
int FUN_00099474(long *param_1)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  long *plVar5;
  ulong uVar6;
  int *piVar7;
  uint uVar8;
  long *plVar9;
  uint uVar10;
  ulong *puVar11;
  long lVar12;
  ulong uVar13;
  ulong *puVar14;
  long *plVar15;
  ulong uVar16;
  long *plVar17;
  long *in_x16;
  int *unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  short *psVar18;
  short *unaff_x23;
  long *unaff_x24;
  int unaff_w25;
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
  long in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
code_r0x00099474:
  if (unaff_x22 < in_x16) {
    plVar9 = (long *)((long)in_x16 - 1);
    piVar7 = (int *)((long)unaff_x20 - 1);
    plVar5 = (long *)((long)param_1 - 1);
    if ((char)*plVar9 == (char)*piVar7) goto LAB_00099460;
  }
LAB_00099104:
  plVar5 = (long *)((long)unaff_x23 + 1);
  uVar8 = (uint)((long)param_1 - (long)unaff_x22);
  uVar10 = uVar8 - 0xf;
  if (uVar8 < 0xf) {
    *(char *)unaff_x23 = (char)(uVar8 << 4);
  }
  else {
    *(char *)unaff_x23 = -0x10;
    plVar9 = plVar5;
    if (0xfe < uVar10) {
      uVar10 = ((int)param_1 - (int)unaff_x22) - 0x10e;
      uVar6 = (ulong)uVar10 / 0xff;
      _memset(plVar5,0xff,uVar6 + 1);
      uVar10 = uVar10 + (int)uVar6;
      plVar9 = (long *)((long)unaff_x23 + uVar6 + 2);
    }
    plVar5 = (long *)((long)plVar9 + 1);
    *(char *)plVar9 = (char)uVar10;
  }
  plVar9 = (long *)((long)plVar5 + ((long)param_1 - (long)unaff_x22 & 0xffffffffU));
  plVar15 = plVar9;
  if (plVar9 <= plVar5 + 1) {
    plVar15 = plVar5 + 1;
  }
  if ((char *)((long)plVar15 + ~(ulong)plVar5) < &segment_command_00000020.vmaddr) {
    unaff_x19 = *(int **)(unaff_x29 + -0x58);
  }
  else {
    unaff_x19 = *(int **)(unaff_x29 + -0x58);
    if (0x3f < (ulong)((long)plVar5 - (long)unaff_x22)) {
      uVar6 = ((long)plVar15 + ~(ulong)plVar5 >> 3) + 1;
      uVar13 = uVar6 & 0x3ffffffffffffff8;
      plVar15 = unaff_x22 + 4;
      plVar17 = plVar5 + 4;
      uVar16 = uVar13;
      do {
        lVar12 = plVar15[-4];
        lVar21 = plVar15[-1];
        lVar20 = plVar15[-2];
        lVar23 = plVar15[1];
        lVar22 = *plVar15;
        lVar25 = plVar15[3];
        lVar24 = plVar15[2];
        plVar17[-3] = plVar15[-3];
        plVar17[-4] = lVar12;
        plVar17[-1] = lVar21;
        plVar17[-2] = lVar20;
        plVar17[1] = lVar23;
        *plVar17 = lVar22;
        plVar17[3] = lVar25;
        plVar17[2] = lVar24;
        uVar16 = uVar16 - 8;
        plVar15 = plVar15 + 8;
        plVar17 = plVar17 + 8;
      } while (uVar16 != 0);
      unaff_x22 = unaff_x22 + uVar13;
      plVar5 = plVar5 + uVar13;
      if (uVar6 == uVar13) goto code_r0x00099220;
    }
  }
  do {
    plVar15 = plVar5 + 1;
    *plVar5 = *unaff_x22;
    unaff_x22 = unaff_x22 + 1;
    plVar5 = plVar15;
  } while (plVar15 < plVar9);
code_r0x00099220:
  unaff_x22 = in_x16;
  do {
    psVar18 = (short *)((long)plVar9 + 2);
    *(short *)plVar9 = (short)unaff_x22 - (short)unaff_x20;
    puVar1 = (ulong *)((long)unaff_x22 + 4);
    puVar14 = (ulong *)(unaff_x20 + 1);
    if (puVar1 < unaff_x28) {
      uVar6 = *puVar1 ^ *puVar14;
      if (uVar6 == 0) {
        puVar14 = (ulong *)(unaff_x20 + 3);
        puVar11 = (ulong *)((long)unaff_x22 + 0xc);
        goto code_r0x00099274;
      }
      uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
      uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
      uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
      uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
      uVar8 = (uint)((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3);
      unaff_x22 = (long *)((long)unaff_x22 + (ulong)(uVar8 + 4));
code_r0x0009933c:
      *(char *)unaff_x23 = (char)*unaff_x23 + (char)uVar8;
      unaff_x23 = psVar18;
    }
    else {
      puVar11 = puVar1;
code_r0x00099274:
      for (; puVar11 < unaff_x28; puVar11 = puVar11 + 1) {
        uVar6 = *puVar11 ^ *puVar14;
        if (uVar6 != 0) {
          uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
          uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
          uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
          uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
          puVar11 = (ulong *)((long)puVar11 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3));
          goto code_r0x000992a4;
        }
        puVar14 = puVar14 + 1;
      }
      if (puVar11 < in_stack_00000020) {
        if ((int)*puVar14 == (int)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 4);
          puVar14 = (ulong *)((long)puVar14 + 4);
        }
      }
      if (puVar11 < in_stack_00000018) {
        if ((short)*puVar14 == (short)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 2);
          puVar14 = (ulong *)((long)puVar14 + 2);
        }
      }
      if (puVar11 < in_stack_00000028) {
        if ((char)*puVar14 == (char)*puVar11) {
          puVar11 = (ulong *)((long)puVar11 + 1);
        }
      }
code_r0x000992a4:
      unaff_x22 = (long *)((long)unaff_x22 + ((long)puVar11 - (long)puVar1 & 0xffffffffU) + 4);
      uVar8 = (uint)((long)puVar11 - (long)puVar1);
      uVar10 = uVar8 - 0xf;
      if (uVar8 < 0xf) goto code_r0x0009933c;
      *(char *)unaff_x23 = (char)*unaff_x23 + '\x0f';
      psVar18[0] = -1;
      psVar18[1] = -1;
      if (0x3fb < uVar10) {
        uVar6 = (ulong)((uVar8 - 0x40b) / 0x3fc << 2);
        _memset((short *)((long)plVar9 + 6),0xff,uVar6 + 4);
        uVar10 = (uVar8 - 0x40b) % 0x3fc;
        unaff_x19 = *(int **)(unaff_x29 + -0x58);
        psVar18 = (short *)((long)plVar9 + 6 + uVar6);
        unaff_w25 = 0xffff;
      }
      uVar8 = (uVar10 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar18 + (ulong)uVar8);
      *pcVar2 = (char)uVar10 + (char)uVar8;
      unaff_x23 = (short *)(pcVar2 + 1);
    }
    if (unaff_x24 <= unaff_x22) goto code_r0x0009949c;
    iVar19 = (int)unaff_x27;
    *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x22 + -2) * unaff_x26) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)unaff_x22 + -2) - iVar19;
    uVar8 = (int)unaff_x22 - iVar19;
    uVar6 = (ulong)(*unaff_x22 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar10 = *(uint *)(unaff_x21 + uVar6);
    *(uint *)(unaff_x21 + uVar6) = uVar8;
    if ((uVar10 + unaff_w25 < uVar8) ||
       (unaff_x20 = (int *)(unaff_x27 + (ulong)uVar10), *unaff_x20 != (int)*unaff_x22)) break;
    plVar9 = (long *)((long)unaff_x23 + 1);
    *(char *)unaff_x23 = '\0';
  } while( true );
  if (unaff_x24 < (long *)((long)unaff_x22 + 2U)) {
code_r0x0009949c:
    uVar16 = in_stack_00000050 - (long)unaff_x22;
    uVar6 = uVar16 - 0xf;
    if (uVar16 < 0xf) {
      *(char *)unaff_x23 = (char)((int)uVar16 << 4);
    }
    else {
      psVar18 = (short *)((long)unaff_x23 + 1);
      *(char *)unaff_x23 = -0x10;
      if (0xfe < uVar6) {
        uVar6 = (long)unaff_x19 + (in_stack_00000030 - (long)unaff_x22) + -0x10e;
        uVar13 = uVar6 / 0xff;
        _memset(psVar18,0xff,uVar13 + 1);
        uVar6 = uVar6 % 0xff;
        psVar18 = (short *)((long)unaff_x23 + uVar13 + 2);
      }
      *(char *)psVar18 = (char)uVar6;
      unaff_x23 = psVar18;
    }
    _memcpy((char *)((long)unaff_x23 + 1),unaff_x22,uVar16);
    return ((int)(char *)((long)unaff_x23 + 1) + (int)uVar16) - in_stack_00000060;
  }
  lVar12 = *(long *)((long)unaff_x22 + 1U);
  param_1 = (long *)((long)unaff_x22 + 1U);
  plVar5 = (long *)((long)unaff_x22 + 2U);
  uVar8 = in_stack_00000068;
  uVar10 = in_stack_00000058;
  while( true ) {
    uVar16 = (ulong)(lVar12 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar3 = *(uint *)(unaff_x21 + uVar16);
    uVar6 = (ulong)uVar3;
    uVar4 = (int)param_1 - iVar19;
    lVar12 = *plVar5;
    *(uint *)(unaff_x21 + uVar16) = uVar4;
    if ((uVar4 <= uVar3 + unaff_w25) && (*(int *)(unaff_x27 + uVar6) == (int)*param_1)) break;
    plVar9 = (long *)((long)plVar5 + (ulong)uVar8);
    uVar8 = uVar10 >> 6;
    uVar10 = uVar10 + 1;
    param_1 = plVar5;
    plVar5 = plVar9;
    if (unaff_x24 < plVar9) goto code_r0x0009949c;
  }
  unaff_x20 = (int *)(unaff_x27 + uVar6);
  if ((unaff_x20 <= unaff_x19) || (*(char *)((long)param_1 - 1) != *(char *)((long)unaff_x20 - 1)))
  {
    in_x16 = param_1;
    goto LAB_00099104;
  }
  piVar7 = (int *)(in_stack_00000010 + uVar6);
  plVar9 = (long *)((long)param_1 - 1);
  plVar5 = plVar9;
LAB_00099460:
  param_1 = plVar5;
  in_x16 = plVar9;
  unaff_x20 = piVar7;
  if (unaff_x19 < piVar7) goto code_r0x00099474;
  goto LAB_00099104;
}

