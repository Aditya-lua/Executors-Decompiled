
int FUN_0009a8e4(short *param_1,short *param_2)

{
  int *piVar1;
  ulong *puVar2;
  char *pcVar3;
  ushort uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  short *psVar8;
  int *piVar9;
  int *piVar10;
  int *in_x9;
  uint uVar11;
  short *in_x10;
  uint uVar12;
  ulong in_x11;
  ulong uVar13;
  ulong *puVar14;
  int iVar15;
  ulong in_x12;
  ulong *puVar16;
  int *in_x16;
  long unaff_x19;
  int unaff_w20;
  ulong uVar17;
  ulong uVar18;
  long unaff_x21;
  int *unaff_x22;
  int *unaff_x23;
  int *unaff_x24;
  uint unaff_w25;
  ulong *unaff_x26;
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
  
code_r0x0009a8e4:
  piVar9 = unaff_x22 + 8;
  psVar8 = param_2 + 0x10;
  uVar13 = in_x12;
  do {
    uVar19 = *(undefined8 *)(piVar9 + -8);
    uVar21 = *(undefined8 *)(piVar9 + -2);
    uVar20 = *(undefined8 *)(piVar9 + -4);
    uVar23 = *(undefined8 *)(piVar9 + 2);
    uVar22 = *(undefined8 *)piVar9;
    uVar25 = *(undefined8 *)(piVar9 + 6);
    uVar24 = *(undefined8 *)(piVar9 + 4);
    *(undefined8 *)(psVar8 + -0xc) = *(undefined8 *)(piVar9 + -6);
    *(undefined8 *)(psVar8 + -0x10) = uVar19;
    *(undefined8 *)(psVar8 + -4) = uVar21;
    *(undefined8 *)(psVar8 + -8) = uVar20;
    *(undefined8 *)(psVar8 + 4) = uVar23;
    *(undefined8 *)psVar8 = uVar22;
    *(undefined8 *)(psVar8 + 0xc) = uVar25;
    *(undefined8 *)(psVar8 + 8) = uVar24;
    uVar13 = uVar13 - 8;
    piVar9 = piVar9 + 0x10;
    psVar8 = psVar8 + 0x20;
  } while (uVar13 != 0);
  if (in_x11 != in_x12) goto LAB_0009a91c;
LAB_0009a92c:
  unaff_x22 = in_x16;
  do {
    psVar8 = param_1 + 1;
    *param_1 = (short)unaff_x22 - (short)unaff_x23;
    puVar2 = (ulong *)(unaff_x22 + 1);
    puVar16 = (ulong *)(unaff_x23 + 1);
    if (puVar2 < unaff_x26) {
      uVar13 = *puVar2 ^ *puVar16;
      if (uVar13 == 0) {
        puVar16 = (ulong *)(unaff_x23 + 3);
        puVar14 = (ulong *)(unaff_x22 + 3);
        goto LAB_0009a980;
      }
      uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
      uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
      uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
      uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
      uVar11 = (uint)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3);
      unaff_x22 = (int *)((long)unaff_x22 + (ulong)(uVar11 + 4));
LAB_0009aa40:
      *(char *)unaff_x28 = (char)*unaff_x28 + (char)uVar11;
      unaff_x28 = psVar8;
    }
    else {
      puVar14 = puVar2;
LAB_0009a980:
      for (; puVar14 < unaff_x26; puVar14 = puVar14 + 1) {
        uVar13 = *puVar14 ^ *puVar16;
        if (uVar13 != 0) {
          uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          puVar14 = (ulong *)((long)puVar14 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3)
                             );
          goto code_r0x0009a9b0;
        }
        puVar16 = puVar16 + 1;
      }
      if (puVar14 < in_stack_00000020) {
        if ((int)*puVar16 == (int)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 4);
          puVar16 = (ulong *)((long)puVar16 + 4);
        }
      }
      if (puVar14 < in_stack_00000018) {
        if ((short)*puVar16 == (short)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 2);
          puVar16 = (ulong *)((long)puVar16 + 2);
        }
      }
      if (puVar14 < in_stack_00000028) {
        if ((char)*puVar16 == (char)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 1);
        }
      }
code_r0x0009a9b0:
      unaff_x22 = (int *)((long)unaff_x22 + ((long)puVar14 - (long)puVar2 & 0xffffffffU) + 4);
      uVar11 = (uint)((long)puVar14 - (long)puVar2);
      uVar12 = uVar11 - 0xf;
      if (uVar11 < 0xf) goto LAB_0009aa40;
      *(char *)unaff_x28 = (char)*unaff_x28 + '\x0f';
      psVar8[0] = -1;
      psVar8[1] = -1;
      if (0x3fb < uVar12) {
        uVar13 = (ulong)((uVar11 - 0x40b) / 0x3fc << 2);
        _memset(param_1 + 3,0xff,uVar13 + 4);
        uVar12 = (uVar11 - 0x40b) % 0x3fc;
        psVar8 = (short *)((long)(param_1 + 3) + uVar13);
        unaff_w20 = -0x61c8864f;
      }
      uVar11 = (uVar12 & 0xffff) / 0xff;
      pcVar3 = (char *)((long)psVar8 + (ulong)uVar11);
      unaff_x28 = (short *)(pcVar3 + 1);
      *pcVar3 = (char)uVar12 + (char)uVar11;
    }
    if (unaff_x24 <= unaff_x22) goto LAB_00099b6c;
    sVar6 = (short)unaff_x19;
    *(short *)(unaff_x21 + (ulong)((uint)(*(int *)((long)unaff_x22 + -2) * unaff_w20) >> 0x13) * 2)
         = (short)(int *)((long)unaff_x22 + -2) - sVar6;
    iVar15 = *unaff_x22;
    lVar5 = (ulong)((uint)(iVar15 * unaff_w20) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar5);
    *(short *)(unaff_x21 + lVar5) = (short)unaff_x22 - sVar6;
    if ((uVar4 < unaff_w25) || (unaff_x23 = (int *)(unaff_x19 + (ulong)uVar4), *unaff_x23 != iVar15)
       ) break;
    param_1 = (short *)((long)unaff_x28 + 1);
    *(char *)unaff_x28 = '\0';
  } while( true );
  if (unaff_x24 < (int *)((long)unaff_x22 + 2U)) {
LAB_00099b6c:
    uVar18 = in_stack_00000058 - (long)unaff_x22;
    uVar13 = uVar18 - 0xf;
    if (uVar18 < 0xf) {
      *(char *)unaff_x28 = (char)((int)uVar18 << 4);
    }
    else {
      psVar8 = (short *)((long)unaff_x28 + 1);
      *(char *)unaff_x28 = -0x10;
      if (0xfe < uVar13) {
        uVar13 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000048) - (long)unaff_x22) - 0x10e;
        uVar17 = uVar13 / 0xff;
        _memset(psVar8,0xff,uVar17 + 1);
        uVar13 = uVar13 % 0xff;
        psVar8 = (short *)((long)unaff_x28 + uVar17 + 2);
      }
      *(char *)psVar8 = (char)uVar13;
      unaff_x28 = psVar8;
    }
    _memcpy((char *)((long)unaff_x28 + 1),unaff_x22,uVar18);
    return ((int)(char *)((long)unaff_x28 + 1) + (int)uVar18) - in_stack_00000060;
  }
  iVar15 = *(int *)((long)unaff_x22 + 1U);
  piVar9 = (int *)((long)unaff_x22 + 1U);
  piVar10 = (int *)((long)unaff_x22 + 2U);
  uVar12 = in_stack_00000050;
  uVar11 = in_stack_00000068;
  while( true ) {
    lVar5 = (ulong)((uint)(iVar15 * unaff_w20) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar5);
    uVar13 = (ulong)uVar4;
    iVar15 = *piVar10;
    *(short *)(unaff_x21 + lVar5) = (short)piVar9 - sVar6;
    if ((unaff_w25 <= uVar4) && (*(int *)(unaff_x19 + uVar13) == *piVar9)) break;
    piVar1 = (int *)((long)piVar10 + (ulong)uVar11);
    uVar11 = uVar12 >> 6;
    uVar12 = uVar12 + 1;
    piVar9 = piVar10;
    piVar10 = piVar1;
    if (unaff_x24 < piVar1) goto LAB_00099b6c;
  }
  unaff_x23 = (int *)(unaff_x19 + uVar13);
  if ((*(int **)(unaff_x29 + -0x58) < unaff_x23) &&
     (*(char *)((long)piVar9 - 1) == *(char *)((long)unaff_x23 - 1))) {
    piVar10 = (int *)(in_stack_00000010 + uVar13);
    piVar1 = (int *)((long)piVar9 - 1U);
    piVar7 = (int *)((long)piVar9 - 1U);
    do {
      piVar9 = piVar7;
      in_x16 = piVar1;
      unaff_x23 = piVar10;
      if ((unaff_x23 <= *(int **)(unaff_x29 + -0x58)) || (in_x16 <= unaff_x22)) break;
      piVar10 = (int *)((long)unaff_x23 + -1);
      piVar1 = (int *)((long)in_x16 + -1);
      piVar7 = (int *)((long)piVar9 - 1);
    } while (*(char *)((long)in_x16 + -1) == *(char *)((long)unaff_x23 + -1));
  }
  else {
    in_x16 = piVar9;
  }
  param_2 = (short *)((long)unaff_x28 + 1);
  uVar11 = (uint)((long)piVar9 - (long)unaff_x22);
  uVar12 = uVar11 - 0xf;
  if (uVar11 < 0xf) {
    *(char *)unaff_x28 = (char)(uVar11 << 4);
  }
  else {
    *(char *)unaff_x28 = -0x10;
    psVar8 = param_2;
    if (0xfe < uVar12) {
      uVar12 = ((int)piVar9 - (int)unaff_x22) - 0x10e;
      uVar13 = (ulong)uVar12 / 0xff;
      _memset(param_2,0xff,uVar13 + 1);
      uVar12 = uVar12 + (int)uVar13;
      psVar8 = (short *)((long)unaff_x28 + uVar13 + 2);
    }
    param_2 = (short *)((long)psVar8 + 1);
    *(char *)psVar8 = (char)uVar12;
  }
  param_1 = (short *)((long)param_2 + ((long)piVar9 - (long)unaff_x22 & 0xffffffffU));
  psVar8 = param_1;
  if (param_1 <= param_2 + 4) {
    psVar8 = param_2 + 4;
  }
  if ((segment_command_00000020.segname + 0xf < (char *)((long)psVar8 + ~(ulong)param_2)) &&
     (0x3f < (ulong)((long)param_2 - (long)unaff_x22))) goto code_r0x0009a8cc;
  in_x9 = unaff_x22;
  in_x10 = param_2;
LAB_0009a91c:
  do {
    psVar8 = in_x10 + 4;
    *(undefined8 *)in_x10 = *(undefined8 *)in_x9;
    in_x9 = in_x9 + 2;
    in_x10 = psVar8;
  } while (psVar8 < param_1);
  goto LAB_0009a92c;
code_r0x0009a8cc:
  in_x11 = ((long)psVar8 + ~(ulong)param_2 >> 3) + 1;
  in_x12 = in_x11 & 0x3ffffffffffffff8;
  in_x9 = unaff_x22 + in_x12 * 2;
  in_x10 = param_2 + in_x12 * 4;
  goto code_r0x0009a8e4;
}

