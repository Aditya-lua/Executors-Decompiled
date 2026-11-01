
int FUN_0009a838(int *param_1,short *param_2)

{
  int *piVar1;
  ulong *puVar2;
  char *pcVar3;
  ushort uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  ulong uVar8;
  short *psVar9;
  uint in_w9;
  int *piVar10;
  char in_w10;
  uint uVar11;
  ulong *puVar12;
  int iVar13;
  ulong uVar14;
  ulong *puVar15;
  short *psVar16;
  int *in_x16;
  long unaff_x19;
  int unaff_w20;
  ulong uVar17;
  long unaff_x21;
  int *unaff_x22;
  int *unaff_x23;
  int *unaff_x24;
  uint unaff_w25;
  ulong *unaff_x26;
  uint uVar18;
  ulong unaff_x27;
  short *unaff_x28;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  long in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  long in_stack_00000048;
  uint in_stack_00000050;
  long in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
code_r0x0009a838:
  *(char *)unaff_x28 = in_w10;
  psVar9 = param_2;
  if (0xfe < in_w9) {
    uVar18 = ((int)param_1 - (int)unaff_x22) - 0x10e;
    uVar8 = (ulong)uVar18 / 0xff;
    _memset(param_2,0xff,uVar8 + 1);
    in_w9 = uVar18 + (int)uVar8;
    psVar9 = (short *)((long)unaff_x28 + uVar8 + 2);
  }
  param_2 = (short *)((long)psVar9 + 1);
  *(char *)psVar9 = (char)in_w9;
code_r0x0009a8a0:
  psVar9 = (short *)((long)param_2 + (unaff_x27 & 0xffffffff));
  psVar16 = psVar9;
  if (psVar9 <= param_2 + 4) {
    psVar16 = param_2 + 4;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)psVar16 + ~(ulong)param_2)) &&
     (0x3f < (ulong)((long)param_2 - (long)unaff_x22))) {
    uVar8 = ((long)psVar16 + ~(ulong)param_2 >> 3) + 1;
    uVar14 = uVar8 & 0x3ffffffffffffff8;
    piVar10 = unaff_x22 + 8;
    psVar16 = param_2 + 0x10;
    uVar17 = uVar14;
    do {
      uVar19 = *(undefined8 *)(piVar10 + -8);
      uVar21 = *(undefined8 *)(piVar10 + -2);
      uVar20 = *(undefined8 *)(piVar10 + -4);
      uVar23 = *(undefined8 *)(piVar10 + 2);
      uVar22 = *(undefined8 *)piVar10;
      uVar25 = *(undefined8 *)(piVar10 + 6);
      uVar24 = *(undefined8 *)(piVar10 + 4);
      *(undefined8 *)(psVar16 + -0xc) = *(undefined8 *)(piVar10 + -6);
      *(undefined8 *)(psVar16 + -0x10) = uVar19;
      *(undefined8 *)(psVar16 + -4) = uVar21;
      *(undefined8 *)(psVar16 + -8) = uVar20;
      *(undefined8 *)(psVar16 + 4) = uVar23;
      *(undefined8 *)psVar16 = uVar22;
      *(undefined8 *)(psVar16 + 0xc) = uVar25;
      *(undefined8 *)(psVar16 + 8) = uVar24;
      uVar17 = uVar17 - 8;
      piVar10 = piVar10 + 0x10;
      psVar16 = psVar16 + 0x20;
    } while (uVar17 != 0);
    unaff_x22 = unaff_x22 + uVar14 * 2;
    param_2 = param_2 + uVar14 * 4;
    if (uVar8 == uVar14) goto LAB_0009a92c;
  }
  do {
    psVar16 = param_2 + 4;
    *(undefined8 *)param_2 = *(undefined8 *)unaff_x22;
    unaff_x22 = unaff_x22 + 2;
    param_2 = psVar16;
  } while (psVar16 < psVar9);
LAB_0009a92c:
  unaff_x22 = in_x16;
  do {
    psVar16 = psVar9 + 1;
    *psVar9 = (short)unaff_x22 - (short)unaff_x23;
    puVar2 = (ulong *)(unaff_x22 + 1);
    puVar15 = (ulong *)(unaff_x23 + 1);
    if (puVar2 < unaff_x26) {
      uVar8 = *puVar2 ^ *puVar15;
      if (uVar8 == 0) {
        puVar15 = (ulong *)(unaff_x23 + 3);
        puVar12 = (ulong *)(unaff_x22 + 3);
        goto LAB_0009a980;
      }
      uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
      uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
      uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar11 = (uint)((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3);
      unaff_x22 = (int *)((long)unaff_x22 + (ulong)(uVar11 + 4));
LAB_0009aa40:
      *(char *)unaff_x28 = (char)*unaff_x28 + (char)uVar11;
      unaff_x28 = psVar16;
    }
    else {
      puVar12 = puVar2;
LAB_0009a980:
      for (; puVar12 < unaff_x26; puVar12 = puVar12 + 1) {
        uVar8 = *puVar12 ^ *puVar15;
        if (uVar8 != 0) {
          uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
          uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
          uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
          uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
          puVar12 = (ulong *)((long)puVar12 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3));
          goto code_r0x0009a9b0;
        }
        puVar15 = puVar15 + 1;
      }
      if (puVar12 < in_stack_00000020) {
        if ((int)*puVar15 == (int)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 4);
          puVar15 = (ulong *)((long)puVar15 + 4);
        }
      }
      if (puVar12 < in_stack_00000018) {
        if ((short)*puVar15 == (short)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 2);
          puVar15 = (ulong *)((long)puVar15 + 2);
        }
      }
      if (puVar12 < in_stack_00000028) {
        if ((char)*puVar15 == (char)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 1);
        }
      }
code_r0x0009a9b0:
      unaff_x22 = (int *)((long)unaff_x22 + ((long)puVar12 - (long)puVar2 & 0xffffffffU) + 4);
      uVar11 = (uint)((long)puVar12 - (long)puVar2);
      uVar18 = uVar11 - 0xf;
      if (uVar11 < 0xf) goto LAB_0009aa40;
      *(char *)unaff_x28 = (char)*unaff_x28 + '\x0f';
      psVar16[0] = -1;
      psVar16[1] = -1;
      if (0x3fb < uVar18) {
        uVar8 = (ulong)((uVar11 - 0x40b) / 0x3fc << 2);
        _memset(psVar9 + 3,0xff,uVar8 + 4);
        uVar18 = (uVar11 - 0x40b) % 0x3fc;
        psVar16 = (short *)((long)(psVar9 + 3) + uVar8);
        unaff_w20 = -0x61c8864f;
      }
      uVar11 = (uVar18 & 0xffff) / 0xff;
      pcVar3 = (char *)((long)psVar16 + (ulong)uVar11);
      unaff_x28 = (short *)(pcVar3 + 1);
      *pcVar3 = (char)uVar18 + (char)uVar11;
    }
    if (unaff_x24 <= unaff_x22) goto LAB_00099b6c;
    sVar6 = (short)unaff_x19;
    *(short *)(unaff_x21 + (ulong)((uint)(*(int *)((long)unaff_x22 + -2) * unaff_w20) >> 0x13) * 2)
         = (short)(int *)((long)unaff_x22 + -2) - sVar6;
    iVar13 = *unaff_x22;
    lVar5 = (ulong)((uint)(iVar13 * unaff_w20) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar5);
    *(short *)(unaff_x21 + lVar5) = (short)unaff_x22 - sVar6;
    if ((uVar4 < unaff_w25) || (unaff_x23 = (int *)(unaff_x19 + (ulong)uVar4), *unaff_x23 != iVar13)
       ) break;
    psVar9 = (short *)((long)unaff_x28 + 1);
    *(char *)unaff_x28 = '\0';
  } while( true );
  if (unaff_x24 < (int *)((long)unaff_x22 + 2U)) {
LAB_00099b6c:
    uVar17 = in_stack_00000058 - (long)unaff_x22;
    uVar8 = uVar17 - 0xf;
    if (uVar17 < 0xf) {
      *(char *)unaff_x28 = (char)((int)uVar17 << 4);
    }
    else {
      psVar9 = (short *)((long)unaff_x28 + 1);
      *(char *)unaff_x28 = -0x10;
      if (0xfe < uVar8) {
        uVar8 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000048) - (long)unaff_x22) - 0x10e;
        uVar14 = uVar8 / 0xff;
        _memset(psVar9,0xff,uVar14 + 1);
        uVar8 = uVar8 % 0xff;
        psVar9 = (short *)((long)unaff_x28 + uVar14 + 2);
      }
      *(char *)psVar9 = (char)uVar8;
      unaff_x28 = psVar9;
    }
    _memcpy((char *)((long)unaff_x28 + 1),unaff_x22,uVar17);
    return ((int)(char *)((long)unaff_x28 + 1) + (int)uVar17) - in_stack_00000060;
  }
  iVar13 = *(int *)((long)unaff_x22 + 1U);
  param_1 = (int *)((long)unaff_x22 + 1U);
  piVar10 = (int *)((long)unaff_x22 + 2U);
  uVar18 = in_stack_00000050;
  uVar11 = in_stack_00000068;
  while( true ) {
    lVar5 = (ulong)((uint)(iVar13 * unaff_w20) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar5);
    uVar8 = (ulong)uVar4;
    iVar13 = *piVar10;
    *(short *)(unaff_x21 + lVar5) = (short)param_1 - sVar6;
    if ((unaff_w25 <= uVar4) && (*(int *)(unaff_x19 + uVar8) == *param_1)) break;
    piVar1 = (int *)((long)piVar10 + (ulong)uVar11);
    uVar11 = uVar18 >> 6;
    uVar18 = uVar18 + 1;
    param_1 = piVar10;
    piVar10 = piVar1;
    if (unaff_x24 < piVar1) goto LAB_00099b6c;
  }
  unaff_x23 = (int *)(unaff_x19 + uVar8);
  if ((*(int **)(unaff_x29 + -0x58) < unaff_x23) &&
     (*(char *)((long)param_1 - 1) == *(char *)((long)unaff_x23 - 1))) {
    piVar10 = (int *)(in_stack_00000010 + uVar8);
    piVar1 = (int *)((long)param_1 - 1U);
    piVar7 = (int *)((long)param_1 - 1U);
    do {
      param_1 = piVar7;
      in_x16 = piVar1;
      unaff_x23 = piVar10;
      if ((unaff_x23 <= *(int **)(unaff_x29 + -0x58)) || (in_x16 <= unaff_x22)) break;
      piVar10 = (int *)((long)unaff_x23 + -1);
      piVar1 = (int *)((long)in_x16 + -1);
      piVar7 = (int *)((long)param_1 - 1);
    } while (*(char *)((long)in_x16 + -1) == *(char *)((long)unaff_x23 + -1));
  }
  else {
    in_x16 = param_1;
  }
  unaff_x27 = (long)param_1 - (long)unaff_x22;
  param_2 = (short *)((long)unaff_x28 + 1);
  uVar18 = (uint)unaff_x27;
  in_w9 = uVar18 - 0xf;
  if (0xe < uVar18) goto code_r0x0009a834;
  *(char *)unaff_x28 = (char)(uVar18 << 4);
  goto code_r0x0009a8a0;
code_r0x0009a834:
  in_w10 = -0x10;
  goto code_r0x0009a838;
}

