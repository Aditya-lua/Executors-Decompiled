
int FUN_0009a2d0(int *param_1)

{
  ulong *puVar1;
  char *pcVar2;
  ushort uVar3;
  uint uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  int *piVar8;
  int *piVar9;
  short *psVar10;
  ulong uVar11;
  ulong uVar12;
  int *piVar13;
  short *psVar14;
  int *in_x9;
  uint uVar15;
  uint uVar16;
  ulong *puVar17;
  int iVar18;
  ulong *puVar19;
  ulong uVar20;
  short *psVar21;
  uint in_w16;
  int *piVar22;
  uint in_w17;
  long unaff_x19;
  long unaff_x21;
  int *unaff_x22;
  int *piVar23;
  ulong *unaff_x24;
  uint unaff_w25;
  int unaff_w26;
  int *unaff_x27;
  short *unaff_x28;
  long unaff_x29;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  long in_stack_00000000;
  ulong *in_stack_00000008;
  ulong *in_stack_00000010;
  ulong *in_stack_00000018;
  long in_stack_00000038;
  uint in_stack_00000040;
  long in_stack_00000048;
  uint in_stack_00000050;
  char *in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
code_r0x0009a2d0:
  iVar18 = *(int *)((long)param_1 + 1U);
  piVar13 = (int *)((long)param_1 + 1U);
  uVar15 = in_stack_00000068;
  while( true ) {
    lVar5 = (ulong)((uint)(iVar18 * unaff_w26) >> 0x13) * 2;
    uVar3 = *(ushort *)(unaff_x21 + lVar5);
    uVar20 = (ulong)uVar3;
    sVar6 = (short)unaff_x19;
    iVar18 = *in_x9;
    *(short *)(unaff_x21 + lVar5) = (short)piVar13 - sVar6;
    if ((unaff_w25 <= uVar3) && (*(int *)(unaff_x19 + uVar20) == *piVar13)) break;
    piVar23 = (int *)((long)in_x9 + (ulong)uVar15);
    uVar15 = in_w16 >> 6;
    in_w16 = in_w16 + 1;
    piVar13 = in_x9;
    in_x9 = piVar23;
    if (unaff_x27 < piVar23) goto LAB_000995ac;
  }
  piVar23 = (int *)(unaff_x19 + uVar20);
  if ((*(int **)(unaff_x29 + -0x58) < piVar23) &&
     (*(char *)((long)piVar13 - 1) == *(char *)((long)piVar23 - 1))) {
    piVar7 = (int *)(in_stack_00000000 + uVar20);
    piVar8 = (int *)((long)piVar13 - 1U);
    piVar9 = (int *)((long)piVar13 - 1U);
    do {
      piVar13 = piVar9;
      piVar22 = piVar8;
      piVar23 = piVar7;
      if ((piVar23 <= *(int **)(unaff_x29 + -0x58)) || (piVar22 <= unaff_x22)) break;
      piVar7 = (int *)((long)piVar23 + -1);
      piVar8 = (int *)((long)piVar22 + -1);
      piVar9 = (int *)((long)piVar13 - 1);
    } while (*(char *)((long)piVar22 + -1) == *(char *)((long)piVar23 + -1));
  }
  else {
    piVar22 = piVar13;
  }
  psVar10 = (short *)((long)unaff_x28 + 1);
  uVar20 = (long)piVar13 - (long)unaff_x22 & 0xffffffff;
  if ((char *)((long)psVar10 + (uVar20 * in_w17 >> 0x27) + uVar20 + 8) <= in_stack_00000058) {
    uVar16 = (uint)((long)piVar13 - (long)unaff_x22);
    uVar15 = uVar16 - 0xf;
    if (uVar16 < 0xf) {
      *(char *)unaff_x28 = (char)(uVar16 << 4);
    }
    else {
      *(char *)unaff_x28 = -0x10;
      psVar14 = psVar10;
      if (0xfe < uVar15) {
        uVar15 = ((int)piVar13 - (int)unaff_x22) - 0x10e;
        uVar11 = (ulong)uVar15 * (ulong)in_w17;
        uVar12 = uVar11 >> 0x27;
        _memset(psVar10,0xff,uVar12 + 1);
        in_w17 = 0x80808081;
        uVar15 = uVar15 + (uint)(uVar11 >> 0x27);
        psVar14 = (short *)((long)unaff_x28 + uVar12 + 2);
      }
      psVar10 = (short *)((long)psVar14 + 1);
      *(char *)psVar14 = (char)uVar15;
    }
    psVar14 = (short *)((long)psVar10 + uVar20);
    psVar21 = psVar14;
    if (psVar14 <= psVar10 + 4) {
      psVar21 = psVar10 + 4;
    }
    if ((&segment_command_00000020.vmaddr <= (char *)((long)psVar21 + ~(ulong)psVar10)) &&
       (0x3f < (ulong)((long)psVar10 - (long)unaff_x22))) {
      uVar20 = ((long)psVar21 + ~(ulong)psVar10 >> 3) + 1;
      uVar12 = uVar20 & 0x3ffffffffffffff8;
      piVar13 = unaff_x22 + 8;
      psVar21 = psVar10 + 0x10;
      uVar11 = uVar12;
      do {
        uVar24 = *(undefined8 *)(piVar13 + -8);
        uVar26 = *(undefined8 *)(piVar13 + -2);
        uVar25 = *(undefined8 *)(piVar13 + -4);
        uVar28 = *(undefined8 *)(piVar13 + 2);
        uVar27 = *(undefined8 *)piVar13;
        uVar30 = *(undefined8 *)(piVar13 + 6);
        uVar29 = *(undefined8 *)(piVar13 + 4);
        *(undefined8 *)(psVar21 + -0xc) = *(undefined8 *)(piVar13 + -6);
        *(undefined8 *)(psVar21 + -0x10) = uVar24;
        *(undefined8 *)(psVar21 + -4) = uVar26;
        *(undefined8 *)(psVar21 + -8) = uVar25;
        *(undefined8 *)(psVar21 + 4) = uVar28;
        *(undefined8 *)psVar21 = uVar27;
        *(undefined8 *)(psVar21 + 0xc) = uVar30;
        *(undefined8 *)(psVar21 + 8) = uVar29;
        uVar11 = uVar11 - 8;
        piVar13 = piVar13 + 0x10;
        psVar21 = psVar21 + 0x20;
      } while (uVar11 != 0);
      unaff_x22 = unaff_x22 + uVar12 * 2;
      psVar10 = psVar10 + uVar12 * 4;
      if (uVar20 == uVar12) goto LAB_0009a47c;
    }
    do {
      psVar21 = psVar10 + 4;
      *(undefined8 *)psVar10 = *(undefined8 *)unaff_x22;
      unaff_x22 = unaff_x22 + 2;
      psVar10 = psVar21;
    } while (psVar21 < psVar14);
LAB_0009a47c:
    do {
      psVar10 = psVar14 + 1;
      *psVar14 = (short)piVar22 - (short)piVar23;
      puVar1 = (ulong *)(piVar22 + 1);
      puVar19 = (ulong *)(piVar23 + 1);
      puVar17 = puVar1;
      if (puVar1 < unaff_x24) {
        uVar20 = *puVar1 ^ *puVar19;
        if (uVar20 == 0) {
          puVar19 = (ulong *)(piVar23 + 3);
          puVar17 = (ulong *)(piVar22 + 3);
          goto joined_r0x0009a6c8;
        }
        uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
        uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar15 = (uint)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3);
      }
      else {
joined_r0x0009a6c8:
        if (puVar17 < unaff_x24) {
          iVar18 = ((int)puVar17 - (int)piVar22) + -4;
          do {
            uVar20 = *puVar17 ^ *puVar19;
            if (uVar20 != 0) {
              uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
              uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
              uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar15 = (int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) + iVar18;
              goto LAB_0009a568;
            }
            puVar17 = puVar17 + 1;
            puVar19 = puVar19 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar17 < unaff_x24);
        }
        if (puVar17 < in_stack_00000010) {
          if ((int)*puVar19 == (int)*puVar17) {
            puVar17 = (ulong *)((long)puVar17 + 4);
            puVar19 = (ulong *)((long)puVar19 + 4);
          }
        }
        if (puVar17 < in_stack_00000008) {
          if ((short)*puVar19 == (short)*puVar17) {
            puVar17 = (ulong *)((long)puVar17 + 2);
            puVar19 = (ulong *)((long)puVar19 + 2);
          }
        }
        if (puVar17 < in_stack_00000018) {
          if ((char)*puVar19 == (char)*puVar17) {
            puVar17 = (ulong *)((long)puVar17 + 1);
          }
        }
        uVar15 = (int)puVar17 - (int)puVar1;
      }
LAB_0009a568:
      if (in_stack_00000058 <
          (char *)((long)psVar14 + ((ulong)(uVar15 + 0xf0) * (ulong)in_w17 >> 0x27) + 8)) break;
      uVar16 = uVar15 - 0xf;
      if (uVar15 < 0xf) {
        *(char *)unaff_x28 = (char)*unaff_x28 + (char)uVar15;
        unaff_x28 = psVar10;
      }
      else {
        *(char *)unaff_x28 = (char)*unaff_x28 + '\x0f';
        psVar10[0] = -1;
        psVar10[1] = -1;
        if (0x3fb < uVar16) {
          uVar16 = (uint)((ulong)(uVar15 - 0x40b) * (ulong)in_w17 >> 0x29);
          uVar20 = (ulong)(uVar16 << 2);
          _memset(psVar14 + 3,0xff,uVar20 + 4);
          in_w17 = 0x80808081;
          uVar16 = (uVar15 - 0x40b) + uVar16 * -0x3fc;
          unaff_w26 = -0x61c8864f;
          psVar10 = (short *)((long)(psVar14 + 3) + uVar20);
          unaff_w25 = in_stack_00000050;
        }
        uVar4 = (uVar16 & 0xffff) / 0xff;
        pcVar2 = (char *)((long)psVar10 + (ulong)uVar4);
        *pcVar2 = (char)uVar16 + (char)uVar4;
        unaff_x28 = (short *)(pcVar2 + 1);
      }
      param_1 = (int *)((long)piVar22 + (ulong)uVar15 + 4);
      unaff_x22 = param_1;
      if (unaff_x27 <= param_1) goto LAB_000995ac;
      piVar13 = (int *)((long)piVar22 + (ulong)uVar15 + 2);
      *(short *)(unaff_x21 + (ulong)((uint)(*piVar13 * unaff_w26) >> 0x13) * 2) =
           (short)piVar13 - sVar6;
      iVar18 = *param_1;
      lVar5 = (ulong)((uint)(iVar18 * unaff_w26) >> 0x13) * 2;
      uVar3 = *(ushort *)(unaff_x21 + lVar5);
      *(short *)(unaff_x21 + lVar5) = (short)param_1 - sVar6;
      if ((uVar3 < unaff_w25) || (piVar23 = (int *)(unaff_x19 + (ulong)uVar3), *piVar23 != iVar18))
      goto LAB_0009a2bc;
      psVar14 = (short *)((long)unaff_x28 + 1);
      *(char *)unaff_x28 = '\0';
      piVar22 = param_1;
    } while( true );
  }
  goto LAB_0009a168;
LAB_0009a2bc:
  in_x9 = (int *)((long)piVar22 + (ulong)uVar15 + 6);
  if (unaff_x27 < in_x9) {
LAB_000995ac:
    uVar20 = in_stack_00000048 - (long)unaff_x22;
    if (in_stack_00000058 < (char *)((long)unaff_x28 + (uVar20 + 0xf0) / 0xff + uVar20 + 1)) {
LAB_0009a168:
      in_stack_00000060 = 0;
    }
    else {
      uVar11 = uVar20 - 0xf;
      if (uVar20 < 0xf) {
        *(char *)unaff_x28 = (char)((int)uVar20 << 4);
      }
      else {
        psVar10 = (short *)((long)unaff_x28 + 1);
        *(char *)unaff_x28 = -0x10;
        if (0xfe < uVar11) {
          uVar11 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000038) - (long)unaff_x22) - 0x10e;
          uVar12 = uVar11 / 0xff;
          _memset(psVar10,0xff,uVar12 + 1);
          uVar11 = uVar11 % 0xff;
          psVar10 = (short *)((long)unaff_x28 + uVar12 + 2);
        }
        *(char *)psVar10 = (char)uVar11;
        unaff_x28 = psVar10;
      }
      _memcpy((char *)((long)unaff_x28 + 1),unaff_x22,uVar20);
      in_stack_00000060 = ((int)(char *)((long)unaff_x28 + 1) + (int)uVar20) - in_stack_00000060;
    }
    return in_stack_00000060;
  }
  in_w16 = in_stack_00000040;
  goto code_r0x0009a2d0;
}

