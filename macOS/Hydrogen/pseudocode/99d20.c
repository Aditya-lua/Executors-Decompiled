
int FUN_00099d20(int *param_1,short *param_2)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  ushort uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  bool bVar8;
  short *psVar9;
  int iVar10;
  uint uVar11;
  int *piVar12;
  uint uVar13;
  short *psVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  int *piVar20;
  short *psVar21;
  ulong unaff_x19;
  int *piVar22;
  int *unaff_x20;
  long unaff_x21;
  int *unaff_x22;
  int *unaff_x23;
  int unaff_w24;
  int *unaff_x25;
  short *unaff_x26;
  short *psVar23;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  uint uStack0000000000000028;
  long lStack0000000000000030;
  long in_stack_00000038;
  ulong *in_stack_00000040;
  ulong *in_stack_00000048;
  ulong *in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  long in_stack_00000068;
  
  lStack0000000000000030 = unaff_x27;
code_r0x00099d20:
  uVar13 = ((int)param_1 - (int)unaff_x25) - 0x10e;
  uStack0000000000000028 = uVar13;
  _memset(param_2,0xff,(ulong)uVar13 / 0xff + 1);
  uVar11 = uStack0000000000000028 + uVar13 / 0xff;
  psVar9 = (short *)((long)unaff_x26 + (ulong)uVar13 / 0xff + 2);
code_r0x00099d6c:
  param_2 = (short *)((long)psVar9 + 1);
  *(char *)psVar9 = (char)uVar11;
LAB_00099d7c:
  psVar9 = (short *)((long)param_2 + (unaff_x19 & 0xffffffff));
  psVar14 = psVar9;
  if (psVar9 <= param_2 + 4) {
    psVar14 = param_2 + 4;
  }
  piVar12 = unaff_x25;
  psVar23 = unaff_x26;
  if ((char *)((long)psVar14 + ~(ulong)param_2) < &segment_command_00000020.vmaddr) {
    piVar22 = *(int **)(unaff_x29 + -0x58);
    psVar14 = param_2;
  }
  else {
    piVar22 = *(int **)(unaff_x29 + -0x58);
    if ((ulong)((long)param_2 - (long)unaff_x25) < 0x40) {
      psVar14 = param_2;
    }
    else {
      uVar15 = ((long)psVar14 + ~(ulong)param_2 >> 3) + 1;
      uVar18 = uVar15 & 0x3ffffffffffffff8;
      piVar12 = unaff_x25 + uVar18 * 2;
      psVar14 = param_2 + uVar18 * 4;
      piVar20 = unaff_x25 + 8;
      psVar21 = param_2 + 0x10;
      uVar17 = uVar18;
      do {
        uVar24 = *(undefined8 *)(piVar20 + -8);
        uVar26 = *(undefined8 *)(piVar20 + -2);
        uVar25 = *(undefined8 *)(piVar20 + -4);
        uVar28 = *(undefined8 *)(piVar20 + 2);
        uVar27 = *(undefined8 *)piVar20;
        uVar30 = *(undefined8 *)(piVar20 + 6);
        uVar29 = *(undefined8 *)(piVar20 + 4);
        *(undefined8 *)(psVar21 + -0xc) = *(undefined8 *)(piVar20 + -6);
        *(undefined8 *)(psVar21 + -0x10) = uVar24;
        *(undefined8 *)(psVar21 + -4) = uVar26;
        *(undefined8 *)(psVar21 + -8) = uVar25;
        *(undefined8 *)(psVar21 + 4) = uVar28;
        *(undefined8 *)psVar21 = uVar27;
        *(undefined8 *)(psVar21 + 0xc) = uVar30;
        *(undefined8 *)(psVar21 + 8) = uVar29;
        uVar17 = uVar17 - 8;
        piVar20 = piVar20 + 0x10;
        psVar21 = psVar21 + 0x20;
      } while (uVar17 != 0);
      unaff_x25 = unaff_x22;
      if (uVar15 == uVar18) goto LAB_00099e1c;
    }
  }
  do {
    psVar21 = psVar14 + 4;
    *(undefined8 *)psVar14 = *(undefined8 *)piVar12;
    piVar12 = piVar12 + 2;
    psVar14 = psVar21;
    unaff_x25 = unaff_x22;
  } while (psVar21 < psVar9);
LAB_00099e1c:
  do {
    unaff_x26 = psVar9 + 1;
    *psVar9 = (short)unaff_x25 - (short)unaff_x20;
    puVar1 = (ulong *)(unaff_x25 + 1);
    puVar19 = (ulong *)(unaff_x20 + 1);
    if (puVar1 < unaff_x28) {
      uVar15 = *puVar1 ^ *puVar19;
      if (uVar15 == 0) {
        puVar19 = (ulong *)(unaff_x20 + 3);
        puVar16 = (ulong *)(unaff_x25 + 3);
        goto LAB_00099e68;
      }
      uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
      uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
      uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
      uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
      uVar13 = (uint)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3);
      unaff_x25 = (int *)((long)unaff_x25 + (ulong)(uVar13 + 4));
LAB_00099f24:
      *(char *)psVar23 = (char)*psVar23 + (char)uVar13;
    }
    else {
      puVar16 = puVar1;
LAB_00099e68:
      for (; puVar16 < unaff_x28; puVar16 = puVar16 + 1) {
        uVar15 = *puVar16 ^ *puVar19;
        if (uVar15 != 0) {
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          puVar16 = (ulong *)((long)puVar16 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3)
                             );
          goto LAB_00099e98;
        }
        puVar19 = puVar19 + 1;
      }
      if (puVar16 < in_stack_00000048) {
        if ((int)*puVar19 == (int)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 4);
          puVar19 = (ulong *)((long)puVar19 + 4);
        }
      }
      if (puVar16 < in_stack_00000040) {
        if ((short)*puVar19 == (short)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 2);
          puVar19 = (ulong *)((long)puVar19 + 2);
        }
      }
      if (puVar16 < in_stack_00000050) {
        if ((char)*puVar19 == (char)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 1);
        }
      }
LAB_00099e98:
      unaff_x25 = (int *)((long)unaff_x25 + ((long)puVar16 - (long)puVar1 & 0xffffffffU) + 4);
      uVar13 = (uint)((long)puVar16 - (long)puVar1);
      uVar11 = uVar13 - 0xf;
      if (uVar13 < 0xf) goto LAB_00099f24;
      *(char *)psVar23 = (char)*psVar23 + '\x0f';
      unaff_x26[0] = -1;
      unaff_x26[1] = -1;
      if (0x3fb < uVar11) {
        uVar15 = (ulong)((uVar13 - 0x40b) / 0x3fc << 2);
        _memset(psVar9 + 3,0xff,uVar15 + 4);
        uVar11 = (uVar13 - 0x40b) % 0x3fc;
        piVar22 = *(int **)(unaff_x29 + -0x58);
        unaff_x26 = (short *)((long)(psVar9 + 3) + uVar15);
      }
      uVar13 = (uVar11 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)unaff_x26 + (ulong)uVar13);
      unaff_x26 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar11 + (char)uVar13;
    }
    if (unaff_x23 <= unaff_x25) goto code_r0x0009a09c;
    sVar6 = (short)piVar22;
    *(short *)(unaff_x21 + (ulong)((uint)(*(int *)((long)unaff_x25 + -2) * unaff_w24) >> 0x13) * 2)
         = (short)(int *)((long)unaff_x25 + -2) - sVar6;
    iVar10 = *unaff_x25;
    lVar5 = (ulong)((uint)(iVar10 * unaff_w24) >> 0x13) * 2;
    unaff_x20 = (int *)((long)piVar22 + (ulong)*(ushort *)(unaff_x21 + lVar5));
    *(short *)(unaff_x21 + lVar5) = (short)unaff_x25 - sVar6;
    if (*unaff_x20 != iVar10) break;
    psVar9 = (short *)((long)unaff_x26 + 1);
    *(char *)unaff_x26 = '\0';
    psVar23 = unaff_x26;
  } while( true );
  uVar15 = 1;
  piVar12 = (int *)((long)unaff_x25 + 1U);
  iVar10 = *(int *)((long)unaff_x25 + 1U);
  uVar11 = in_stack_00000058;
  do {
    param_1 = piVar12;
    piVar12 = (int *)((long)param_1 + uVar15);
    if (unaff_x23 < piVar12) {
code_r0x0009a09c:
      uVar17 = in_stack_00000068 - (long)unaff_x25;
      uVar15 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)unaff_x26 = (char)((int)uVar17 << 4);
      }
      else {
        psVar9 = (short *)((long)unaff_x26 + 1);
        *(char *)unaff_x26 = -0x10;
        if (0xfe < uVar15) {
          uVar15 = (long)piVar22 + (lStack0000000000000030 - (long)unaff_x25) + -0x10e;
          uVar18 = uVar15 / 0xff;
          _memset(psVar9,0xff,uVar18 + 1);
          uVar15 = uVar15 % 0xff;
          psVar9 = (short *)((long)unaff_x26 + uVar18 + 2);
        }
        *(char *)psVar9 = (char)uVar15;
        unaff_x26 = psVar9;
      }
      _memcpy((char *)((long)unaff_x26 + 1),unaff_x25,uVar17);
      return ((int)(char *)((long)unaff_x26 + 1) + (int)uVar17) - in_stack_00000060;
    }
    uVar15 = (ulong)(uVar11 >> 6);
    uVar11 = uVar11 + 1;
    lVar5 = (ulong)((uint)(iVar10 * unaff_w24) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar5);
    uVar17 = (ulong)uVar4;
    iVar3 = *piVar12;
    *(short *)(unaff_x21 + lVar5) = (short)param_1 - sVar6;
    bVar8 = *(int *)((long)piVar22 + uVar17) != iVar10;
    iVar10 = iVar3;
  } while (bVar8);
  unaff_x20 = (int *)((long)piVar22 + uVar17);
  if ((uVar4 == 0) || (*(char *)((long)param_1 - 1) != *(char *)((long)unaff_x20 + -1))) {
    unaff_x22 = param_1;
  }
  else {
    piVar12 = (int *)(in_stack_00000038 + uVar17);
    piVar20 = (int *)((long)param_1 - 1U);
    piVar7 = (int *)((long)param_1 - 1U);
    do {
      param_1 = piVar7;
      unaff_x22 = piVar20;
      unaff_x20 = piVar12;
      if ((unaff_x20 <= piVar22) || (unaff_x22 <= unaff_x25)) break;
      piVar12 = (int *)((long)unaff_x20 + -1);
      piVar20 = (int *)((long)unaff_x22 + -1);
      piVar7 = (int *)((long)param_1 - 1);
    } while (*(char *)((long)unaff_x22 + -1) == *(char *)((long)unaff_x20 + -1));
  }
  unaff_x19 = (long)param_1 - (long)unaff_x25;
  param_2 = (short *)((long)unaff_x26 + 1);
  uVar13 = (uint)unaff_x19;
  uVar11 = uVar13 - 0xf;
  if (0xe < uVar13) goto code_r0x00099d10;
  *(char *)unaff_x26 = (char)(uVar13 << 4);
  goto LAB_00099d7c;
code_r0x00099d10:
  *(char *)unaff_x26 = -0x10;
  psVar9 = param_2;
  if (0xfe < uVar11) goto code_r0x00099d20;
  goto code_r0x00099d6c;
}

