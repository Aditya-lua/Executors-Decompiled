
int FUN_0009aa5c(int *param_1)

{
  ulong *puVar1;
  char *pcVar2;
  ushort uVar3;
  long lVar4;
  short sVar5;
  int *piVar6;
  int *piVar7;
  int *piVar8;
  short *psVar9;
  int *piVar10;
  short *psVar11;
  int in_w9;
  int *piVar12;
  uint uVar13;
  uint uVar14;
  ulong uVar15;
  ulong *puVar16;
  int iVar17;
  ulong *puVar18;
  short *psVar19;
  int *piVar20;
  long unaff_x19;
  int unaff_w20;
  ulong uVar21;
  ulong uVar22;
  long unaff_x21;
  int *unaff_x22;
  int *unaff_x24;
  uint unaff_w25;
  ulong *unaff_x26;
  short *unaff_x28;
  long unaff_x29;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  long in_stack_00000048;
  uint in_stack_00000050;
  long in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
  do {
    sVar5 = (short)unaff_x19;
    *(short *)(unaff_x21 + (ulong)((uint)(in_w9 * unaff_w20) >> 0x13) * 2) = (short)param_1 - sVar5;
    iVar17 = *unaff_x22;
    lVar4 = (ulong)((uint)(iVar17 * unaff_w20) >> 0x13) * 2;
    uVar3 = *(ushort *)(unaff_x21 + lVar4);
    *(short *)(unaff_x21 + lVar4) = (short)unaff_x22 - sVar5;
    if ((uVar3 < unaff_w25) || (piVar12 = (int *)(unaff_x19 + (ulong)uVar3), *piVar12 != iVar17)) {
      if (unaff_x24 < (int *)((long)unaff_x22 + 2U)) {
code_r0x00099b6c:
        uVar22 = in_stack_00000058 - (long)unaff_x22;
        uVar15 = uVar22 - 0xf;
        if (uVar22 < 0xf) {
          *(char *)unaff_x28 = (char)((int)uVar22 << 4);
        }
        else {
          psVar9 = (short *)((long)unaff_x28 + 1);
          *(char *)unaff_x28 = -0x10;
          if (0xfe < uVar15) {
            uVar15 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000048) - (long)unaff_x22) - 0x10e;
            uVar21 = uVar15 / 0xff;
            _memset(psVar9,0xff,uVar21 + 1);
            uVar15 = uVar15 % 0xff;
            psVar9 = (short *)((long)unaff_x28 + uVar21 + 2);
          }
          *(char *)psVar9 = (char)uVar15;
          unaff_x28 = psVar9;
        }
        _memcpy((char *)((long)unaff_x28 + 1),unaff_x22,uVar22);
        return ((int)(char *)((long)unaff_x28 + 1) + (int)uVar22) - in_stack_00000060;
      }
      iVar17 = *(int *)((long)unaff_x22 + 1U);
      piVar10 = (int *)((long)unaff_x22 + 1U);
      piVar12 = (int *)((long)unaff_x22 + 2U);
      uVar14 = in_stack_00000050;
      uVar13 = in_stack_00000068;
      while( true ) {
        lVar4 = (ulong)((uint)(iVar17 * unaff_w20) >> 0x13) * 2;
        uVar3 = *(ushort *)(unaff_x21 + lVar4);
        uVar15 = (ulong)uVar3;
        iVar17 = *piVar12;
        *(short *)(unaff_x21 + lVar4) = (short)piVar10 - sVar5;
        if ((unaff_w25 <= uVar3) && (*(int *)(unaff_x19 + uVar15) == *piVar10)) break;
        piVar20 = (int *)((long)piVar12 + (ulong)uVar13);
        uVar13 = uVar14 >> 6;
        uVar14 = uVar14 + 1;
        piVar10 = piVar12;
        piVar12 = piVar20;
        if (unaff_x24 < piVar20) goto code_r0x00099b6c;
      }
      piVar12 = (int *)(unaff_x19 + uVar15);
      if ((*(int **)(unaff_x29 + -0x58) < piVar12) &&
         (*(char *)((long)piVar10 - 1) == *(char *)((long)piVar12 - 1))) {
        piVar6 = (int *)(in_stack_00000010 + uVar15);
        piVar7 = (int *)((long)piVar10 - 1U);
        piVar8 = (int *)((long)piVar10 - 1U);
        do {
          piVar10 = piVar8;
          piVar20 = piVar7;
          piVar12 = piVar6;
          if ((piVar12 <= *(int **)(unaff_x29 + -0x58)) || (piVar20 <= unaff_x22)) break;
          piVar6 = (int *)((long)piVar12 + -1);
          piVar7 = (int *)((long)piVar20 + -1);
          piVar8 = (int *)((long)piVar10 - 1);
        } while (*(char *)((long)piVar20 + -1) == *(char *)((long)piVar12 + -1));
      }
      else {
        piVar20 = piVar10;
      }
      psVar9 = (short *)((long)unaff_x28 + 1);
      uVar13 = (uint)((long)piVar10 - (long)unaff_x22);
      uVar14 = uVar13 - 0xf;
      if (uVar13 < 0xf) {
        *(char *)unaff_x28 = (char)(uVar13 << 4);
      }
      else {
        *(char *)unaff_x28 = -0x10;
        psVar11 = psVar9;
        if (0xfe < uVar14) {
          uVar14 = ((int)piVar10 - (int)unaff_x22) - 0x10e;
          uVar15 = (ulong)uVar14 / 0xff;
          _memset(psVar9,0xff,uVar15 + 1);
          uVar14 = uVar14 + (int)uVar15;
          psVar11 = (short *)((long)unaff_x28 + uVar15 + 2);
        }
        psVar9 = (short *)((long)psVar11 + 1);
        *(char *)psVar11 = (char)uVar14;
      }
      psVar11 = (short *)((long)psVar9 + ((long)piVar10 - (long)unaff_x22 & 0xffffffffU));
      psVar19 = psVar11;
      if (psVar11 <= psVar9 + 4) {
        psVar19 = psVar9 + 4;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)psVar19 + ~(ulong)psVar9)) &&
         (0x3f < (ulong)((long)psVar9 - (long)unaff_x22))) {
        uVar15 = ((long)psVar19 + ~(ulong)psVar9 >> 3) + 1;
        uVar21 = uVar15 & 0x3ffffffffffffff8;
        piVar10 = unaff_x22 + 8;
        psVar19 = psVar9 + 0x10;
        uVar22 = uVar21;
        do {
          uVar23 = *(undefined8 *)(piVar10 + -8);
          uVar25 = *(undefined8 *)(piVar10 + -2);
          uVar24 = *(undefined8 *)(piVar10 + -4);
          uVar27 = *(undefined8 *)(piVar10 + 2);
          uVar26 = *(undefined8 *)piVar10;
          uVar29 = *(undefined8 *)(piVar10 + 6);
          uVar28 = *(undefined8 *)(piVar10 + 4);
          *(undefined8 *)(psVar19 + -0xc) = *(undefined8 *)(piVar10 + -6);
          *(undefined8 *)(psVar19 + -0x10) = uVar23;
          *(undefined8 *)(psVar19 + -4) = uVar25;
          *(undefined8 *)(psVar19 + -8) = uVar24;
          *(undefined8 *)(psVar19 + 4) = uVar27;
          *(undefined8 *)psVar19 = uVar26;
          *(undefined8 *)(psVar19 + 0xc) = uVar29;
          *(undefined8 *)(psVar19 + 8) = uVar28;
          uVar22 = uVar22 - 8;
          piVar10 = piVar10 + 0x10;
          psVar19 = psVar19 + 0x20;
        } while (uVar22 != 0);
        unaff_x22 = unaff_x22 + uVar21 * 2;
        psVar9 = psVar9 + uVar21 * 4;
        if (uVar15 == uVar21) goto LAB_0009a934;
      }
      do {
        psVar19 = psVar9 + 4;
        *(undefined8 *)psVar9 = *(undefined8 *)unaff_x22;
        unaff_x22 = unaff_x22 + 2;
        psVar9 = psVar19;
      } while (psVar19 < psVar11);
    }
    else {
      psVar11 = (short *)((long)unaff_x28 + 1);
      *(char *)unaff_x28 = '\0';
      piVar20 = unaff_x22;
    }
LAB_0009a934:
    psVar9 = psVar11 + 1;
    *psVar11 = (short)piVar20 - (short)piVar12;
    puVar1 = (ulong *)(piVar20 + 1);
    puVar18 = (ulong *)(piVar12 + 1);
    if (puVar1 < unaff_x26) {
      uVar15 = *puVar1 ^ *puVar18;
      if (uVar15 == 0) {
        puVar18 = (ulong *)(piVar12 + 3);
        puVar16 = (ulong *)(piVar20 + 3);
        goto code_r0x0009a980;
      }
      uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
      uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
      uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
      uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
      uVar13 = (uint)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3);
      unaff_x22 = (int *)((long)piVar20 + (ulong)(uVar13 + 4));
code_r0x0009aa40:
      *(char *)unaff_x28 = (char)*unaff_x28 + (char)uVar13;
    }
    else {
      puVar16 = puVar1;
code_r0x0009a980:
      for (; puVar16 < unaff_x26; puVar16 = puVar16 + 1) {
        uVar15 = *puVar16 ^ *puVar18;
        if (uVar15 != 0) {
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          puVar16 = (ulong *)((long)puVar16 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3)
                             );
          goto code_r0x0009a9b0;
        }
        puVar18 = puVar18 + 1;
      }
      if (puVar16 < in_stack_00000020) {
        if ((int)*puVar18 == (int)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 4);
          puVar18 = (ulong *)((long)puVar18 + 4);
        }
      }
      if (puVar16 < in_stack_00000018) {
        if ((short)*puVar18 == (short)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 2);
          puVar18 = (ulong *)((long)puVar18 + 2);
        }
      }
      if (puVar16 < in_stack_00000028) {
        if ((char)*puVar18 == (char)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 1);
        }
      }
code_r0x0009a9b0:
      unaff_x22 = (int *)((long)piVar20 + ((long)puVar16 - (long)puVar1 & 0xffffffffU) + 4);
      uVar13 = (uint)((long)puVar16 - (long)puVar1);
      uVar14 = uVar13 - 0xf;
      if (uVar13 < 0xf) goto code_r0x0009aa40;
      *(char *)unaff_x28 = (char)*unaff_x28 + '\x0f';
      psVar9[0] = -1;
      psVar9[1] = -1;
      if (0x3fb < uVar14) {
        uVar15 = (ulong)((uVar13 - 0x40b) / 0x3fc << 2);
        _memset(psVar11 + 3,0xff,uVar15 + 4);
        uVar14 = (uVar13 - 0x40b) % 0x3fc;
        psVar9 = (short *)((long)(psVar11 + 3) + uVar15);
        unaff_w20 = -0x61c8864f;
      }
      uVar13 = (uVar14 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar9 + (ulong)uVar13);
      psVar9 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar14 + (char)uVar13;
    }
    unaff_x28 = psVar9;
    if (unaff_x24 <= unaff_x22) goto code_r0x00099b6c;
    param_1 = (int *)((long)unaff_x22 + -2);
    in_w9 = *param_1;
  } while( true );
}

