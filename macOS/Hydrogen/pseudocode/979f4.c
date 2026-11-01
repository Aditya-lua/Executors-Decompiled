
/* WARNING: Type propagation algorithm not settling */

int FUN_000979f4(long param_1)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  long lVar4;
  short sVar5;
  int *piVar6;
  int *piVar7;
  int *piVar8;
  bool bVar9;
  short *psVar10;
  int *piVar11;
  int *piVar12;
  short *psVar13;
  int *piVar14;
  short *psVar15;
  int iVar16;
  uint uVar17;
  short *psVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong *puVar21;
  ulong uVar22;
  undefined8 *puVar23;
  short *unaff_x19;
  long unaff_x20;
  int *unaff_x21;
  int *piVar24;
  ulong *unaff_x23;
  uint unaff_w24;
  long unaff_x25;
  uint uVar25;
  char *unaff_x26;
  ulong uVar26;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  long in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  ulong *in_stack_00000038;
  uint in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  int in_stack_00000058;
  int *in_stack_00000060;
  
code_r0x000979f4:
  uVar25 = (uint)((ulong)param_1 >> 0x29);
  uVar26 = (ulong)(uVar25 << 2);
  _memset(unaff_x19,0xff,uVar26 + 4);
  uVar25 = unaff_w24 + uVar25 * -0x3fc;
  psVar10 = (short *)((long)unaff_x19 + uVar26);
code_r0x00097a44:
  uVar17 = (uVar25 & 0xffff) / 0xff;
  pcVar2 = (char *)((long)psVar10 + (ulong)uVar17);
  *pcVar2 = (char)uVar25 + (char)uVar17;
  psVar15 = (short *)(pcVar2 + 1);
  piVar24 = unaff_x21;
  do {
    uVar26 = unaff_x28 & 0xffffffff;
    piVar14 = (int *)((long)piVar24 + uVar26 + 4);
    if (in_stack_00000060 <= piVar14) {
code_r0x00098770:
      uVar26 = in_stack_00000050 - (long)piVar14;
      if (unaff_x26 < (char *)((long)psVar15 + (uVar26 + 0xf0) / 0xff + uVar26 + 1)) {
        return 0;
      }
      uVar19 = uVar26 - 0xf;
      if (uVar26 < 0xf) {
        *(char *)psVar15 = (char)((int)uVar26 << 4);
      }
      else {
        psVar10 = (short *)((long)psVar15 + 1);
        *(char *)psVar15 = -0x10;
        if (0xfe < uVar19) {
          uVar19 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000048) - (long)piVar14) - 0x10e;
          uVar22 = uVar19 / 0xff;
          _memset(psVar10,0xff,uVar22 + 1);
          uVar19 = uVar19 % 0xff;
          psVar10 = (short *)((long)psVar15 + uVar22 + 2);
        }
        *(char *)psVar10 = (char)uVar19;
        psVar15 = psVar10;
      }
      _memcpy((char *)((long)psVar15 + 1),piVar14,uVar26);
      return ((int)(char *)((long)psVar15 + 1) + (int)uVar26) - in_stack_00000058;
    }
    piVar12 = (int *)((long)piVar24 + uVar26 + 2);
    sVar5 = (short)unaff_x20;
    *(short *)(unaff_x25 + (ulong)((uint)(*piVar12 * -0x61c8864f) >> 0x13) * 2) =
         (short)piVar12 - sVar5;
    iVar16 = *piVar14;
    lVar4 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
    piVar12 = (int *)(unaff_x20 + (ulong)*(ushort *)(unaff_x25 + lVar4));
    *(short *)(unaff_x25 + lVar4) = (short)piVar14 - sVar5;
    if (*piVar12 == iVar16) {
      psVar13 = (short *)((long)psVar15 + 1);
      *(char *)psVar15 = '\0';
      unaff_x21 = piVar14;
    }
    else {
      piVar12 = (int *)((long)piVar24 + uVar26 + 5);
      uVar19 = 1;
      iVar16 = *piVar12;
      uVar25 = in_stack_00000040;
      do {
        piVar11 = piVar12;
        piVar12 = (int *)((long)piVar11 + uVar19);
        if (in_stack_00000060 < piVar12) goto code_r0x00098770;
        uVar19 = (ulong)(uVar25 >> 6);
        uVar25 = uVar25 + 1;
        lVar4 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
        uVar22 = (ulong)*(ushort *)(unaff_x25 + lVar4);
        iVar3 = *piVar12;
        *(short *)(unaff_x25 + lVar4) = (short)piVar11 - sVar5;
        bVar9 = *(int *)(unaff_x20 + uVar22) != iVar16;
        iVar16 = iVar3;
      } while (bVar9);
      piVar12 = (int *)(unaff_x20 + uVar22);
      if ((*(int **)(unaff_x29 + -0x58) < piVar12) &&
         (*(char *)((long)piVar11 - 1) == *(char *)((long)piVar12 - 1))) {
        piVar6 = (int *)(in_stack_00000020 + uVar22);
        piVar7 = (int *)((long)piVar11 - 1U);
        piVar8 = (int *)((long)piVar11 - 1U);
        do {
          piVar11 = piVar8;
          unaff_x21 = piVar7;
          piVar12 = piVar6;
          if ((piVar12 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x21 <= piVar14)) break;
          piVar6 = (int *)((long)piVar12 + -1);
          piVar7 = (int *)((long)unaff_x21 + -1);
          piVar8 = (int *)((long)piVar11 - 1);
        } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)piVar12 + -1));
      }
      else {
        unaff_x21 = piVar11;
      }
      psVar10 = (short *)((long)psVar15 + 1);
      uVar19 = (long)piVar11 - (long)piVar14 & 0xffffffff;
      if (unaff_x26 < (char *)((long)psVar10 + uVar19 / 0xff + uVar19 + 8)) {
        return 0;
      }
      uVar17 = (uint)((long)piVar11 - (long)piVar14);
      uVar25 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)psVar15 = (char)(uVar17 << 4);
      }
      else {
        *(char *)psVar15 = -0x10;
        psVar13 = psVar10;
        if (0xfe < uVar25) {
          uVar25 = ((int)piVar11 - (int)piVar14) - 0x10e;
          uVar22 = (ulong)uVar25 / 0xff;
          _memset(psVar10,0xff,uVar22 + 1);
          uVar25 = uVar25 + (int)uVar22;
          psVar13 = (short *)((long)psVar15 + uVar22 + 2);
        }
        psVar10 = (short *)((long)psVar13 + 1);
        *(char *)psVar13 = (char)uVar25;
      }
      psVar13 = (short *)((long)psVar10 + uVar19);
      psVar18 = psVar13;
      if (psVar13 <= psVar10 + 4) {
        psVar18 = psVar10 + 4;
      }
      if (((char *)((long)psVar18 + ~(ulong)psVar10) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)psVar10 - (long)piVar14) < 0x40)) {
        psVar18 = psVar10;
      }
      else {
        uVar19 = ((long)psVar18 + ~(ulong)psVar10 >> 3) + 1;
        uVar22 = uVar19 & 0x3ffffffffffffff8;
        piVar14 = piVar14 + uVar22 * 2;
        psVar18 = psVar10 + uVar22 * 4;
        puVar23 = (undefined8 *)((long)piVar24 + uVar26 + 0x24);
        psVar10 = psVar10 + 0x10;
        uVar26 = uVar22;
        do {
          uVar27 = puVar23[-4];
          uVar29 = puVar23[-1];
          uVar28 = puVar23[-2];
          uVar31 = puVar23[1];
          uVar30 = *puVar23;
          uVar33 = puVar23[3];
          uVar32 = puVar23[2];
          *(undefined8 *)(psVar10 + -0xc) = puVar23[-3];
          *(undefined8 *)(psVar10 + -0x10) = uVar27;
          *(undefined8 *)(psVar10 + -4) = uVar29;
          *(undefined8 *)(psVar10 + -8) = uVar28;
          *(undefined8 *)(psVar10 + 4) = uVar31;
          *(undefined8 *)psVar10 = uVar30;
          *(undefined8 *)(psVar10 + 0xc) = uVar33;
          *(undefined8 *)(psVar10 + 8) = uVar32;
          uVar26 = uVar26 - 8;
          puVar23 = puVar23 + 8;
          psVar10 = psVar10 + 0x20;
        } while (uVar26 != 0);
        if (uVar19 == uVar22) goto code_r0x000978cc;
      }
      do {
        psVar10 = psVar18 + 4;
        *(undefined8 *)psVar18 = *(undefined8 *)piVar14;
        piVar14 = piVar14 + 2;
        psVar18 = psVar10;
      } while (psVar10 < psVar13);
    }
code_r0x000978cc:
    psVar10 = psVar13 + 1;
    *psVar13 = (short)unaff_x21 - (short)piVar12;
    puVar1 = (ulong *)(unaff_x21 + 1);
    puVar21 = (ulong *)(piVar12 + 1);
    puVar20 = puVar1;
    if (puVar1 < unaff_x23) {
      uVar26 = *puVar1 ^ *puVar21;
      if (uVar26 == 0) {
        puVar21 = (ulong *)(piVar12 + 3);
        puVar20 = (ulong *)(unaff_x21 + 3);
        goto joined_r0x00097b0c;
      }
      uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
      uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
      uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
      uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
      unaff_x28 = (ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3;
    }
    else {
joined_r0x00097b0c:
      if (puVar20 < unaff_x23) {
        iVar16 = ((int)puVar20 - (int)unaff_x21) + -4;
        do {
          uVar26 = *puVar20 ^ *puVar21;
          if (uVar26 != 0) {
            uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
            uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
            uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
            uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
            unaff_x28 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) +
                                     iVar16);
            goto code_r0x000979b0;
          }
          puVar20 = puVar20 + 1;
          puVar21 = puVar21 + 1;
          iVar16 = iVar16 + 8;
        } while (puVar20 < unaff_x23);
      }
      if (puVar20 < in_stack_00000030) {
        if ((int)*puVar21 == (int)*puVar20) {
          puVar20 = (ulong *)((long)puVar20 + 4);
          puVar21 = (ulong *)((long)puVar21 + 4);
        }
      }
      if (puVar20 < in_stack_00000028) {
        if ((short)*puVar21 == (short)*puVar20) {
          puVar20 = (ulong *)((long)puVar20 + 2);
          puVar21 = (ulong *)((long)puVar21 + 2);
        }
      }
      if (puVar20 < in_stack_00000038) {
        if ((char)*puVar21 == (char)*puVar20) {
          puVar20 = (ulong *)((long)puVar20 + 1);
        }
      }
      unaff_x28 = (ulong)(uint)((int)puVar20 - (int)puVar1);
    }
code_r0x000979b0:
    uVar17 = (uint)unaff_x28;
    if (unaff_x26 < (char *)((long)psVar13 + (ulong)(uVar17 + 0xf0) / 0xff + 8)) {
      return 0;
    }
    uVar25 = uVar17 - 0xf;
    if (0xe < uVar17) break;
    *(char *)psVar15 = (char)*psVar15 + (char)unaff_x28;
    psVar15 = psVar10;
    piVar24 = unaff_x21;
  } while( true );
  *(char *)psVar15 = (char)*psVar15 + '\x0f';
  psVar10[0] = -1;
  psVar10[1] = -1;
  if (0x3fb < uVar25) goto code_r0x000979e8;
  goto code_r0x00097a44;
code_r0x000979e8:
  unaff_x19 = psVar13 + 3;
  unaff_w24 = uVar17 - 0x40b;
  param_1 = (ulong)unaff_w24 * 0x80808081;
  goto code_r0x000979f4;
}

