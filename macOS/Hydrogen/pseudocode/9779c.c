
/* WARNING: Type propagation algorithm not settling */

int FUN_0009779c(int *param_1,undefined8 param_2,uint param_3,undefined4 param_4,int param_5,
                int *param_6)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  bool bVar8;
  short *psVar9;
  ulong uVar10;
  ulong uVar11;
  int *piVar12;
  short *psVar13;
  uint uVar14;
  int iVar15;
  uint uVar16;
  ulong in_x10;
  short *psVar17;
  ulong *puVar18;
  ulong *puVar19;
  int *piVar20;
  int in_w17;
  ulong uVar21;
  long unaff_x20;
  int *unaff_x21;
  int *unaff_x22;
  ulong *unaff_x23;
  short *unaff_x24;
  short *psVar22;
  long unaff_x25;
  char *unaff_x26;
  int unaff_w27;
  int *unaff_x28;
  long unaff_x29;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  ulong *in_stack_00000038;
  uint in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  int in_stack_00000058;
  int *in_stack_00000060;
  
code_r0x0009779c:
  psVar9 = (short *)((long)unaff_x24 + 1);
  uVar21 = in_x10 & 0xffffffff;
  if (unaff_x26 < (char *)((long)psVar9 + (uVar21 * param_3 >> 0x27) + uVar21 + 8)) {
    return 0;
  }
  uVar16 = (uint)in_x10;
  uVar14 = uVar16 - 0xf;
  if (uVar16 < 0xf) {
    *(char *)unaff_x24 = (char)(uVar16 << 4);
  }
  else {
    *(char *)unaff_x24 = -0x10;
    psVar13 = psVar9;
    if (0xfe < uVar14) {
      uVar14 = ((int)param_1 - (int)param_6) - 0x10e;
      uVar10 = (ulong)uVar14 * (ulong)param_3;
      uVar11 = uVar10 >> 0x27;
      _memset(psVar9,0xff,uVar11 + 1);
      param_5 = 0x8081;
      param_4 = 0xffffffff;
      param_3 = 0x80808081;
      in_w17 = -0x61c8864f;
      uVar14 = uVar14 + (uint)(uVar10 >> 0x27);
      psVar13 = (short *)((long)unaff_x24 + uVar11 + 2);
    }
    psVar9 = (short *)((long)psVar13 + 1);
    *(char *)psVar13 = (char)uVar14;
  }
  psVar13 = (short *)((long)psVar9 + uVar21);
  psVar17 = psVar13;
  if (psVar13 <= psVar9 + 4) {
    psVar17 = psVar9 + 4;
  }
  psVar22 = unaff_x24;
  if (((char *)((long)psVar17 + ~(ulong)psVar9) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)psVar9 - (long)param_6) < 0x40)) {
    piVar12 = param_6;
    psVar17 = psVar9;
  }
  else {
    uVar21 = ((long)psVar17 + ~(ulong)psVar9 >> 3) + 1;
    uVar11 = uVar21 & 0x3ffffffffffffff8;
    piVar12 = param_6 + uVar11 * 2;
    psVar17 = psVar9 + uVar11 * 4;
    piVar20 = param_6 + 8;
    psVar9 = psVar9 + 0x10;
    uVar10 = uVar11;
    do {
      uVar23 = *(undefined8 *)(piVar20 + -8);
      uVar25 = *(undefined8 *)(piVar20 + -2);
      uVar24 = *(undefined8 *)(piVar20 + -4);
      uVar27 = *(undefined8 *)(piVar20 + 2);
      uVar26 = *(undefined8 *)piVar20;
      uVar29 = *(undefined8 *)(piVar20 + 6);
      uVar28 = *(undefined8 *)(piVar20 + 4);
      *(undefined8 *)(psVar9 + -0xc) = *(undefined8 *)(piVar20 + -6);
      *(undefined8 *)(psVar9 + -0x10) = uVar23;
      *(undefined8 *)(psVar9 + -4) = uVar25;
      *(undefined8 *)(psVar9 + -8) = uVar24;
      *(undefined8 *)(psVar9 + 4) = uVar27;
      *(undefined8 *)psVar9 = uVar26;
      *(undefined8 *)(psVar9 + 0xc) = uVar29;
      *(undefined8 *)(psVar9 + 8) = uVar28;
      uVar10 = uVar10 - 8;
      piVar20 = piVar20 + 0x10;
      psVar9 = psVar9 + 0x20;
    } while (uVar10 != 0);
    if (uVar21 == uVar11) goto code_r0x000978cc;
  }
  do {
    psVar9 = psVar17 + 4;
    *(undefined8 *)psVar17 = *(undefined8 *)piVar12;
    piVar12 = piVar12 + 2;
    psVar17 = psVar9;
  } while (psVar9 < psVar13);
code_r0x000978cc:
  do {
    unaff_x24 = psVar13 + 1;
    *psVar13 = (short)unaff_x21 - (short)unaff_x28;
    puVar1 = (ulong *)(unaff_x21 + 1);
    puVar19 = (ulong *)(unaff_x28 + 1);
    puVar18 = puVar1;
    if (puVar1 < unaff_x23) {
      uVar21 = *puVar1 ^ *puVar19;
      if (uVar21 == 0) {
        puVar19 = (ulong *)(unaff_x28 + 3);
        puVar18 = (ulong *)(unaff_x21 + 3);
        goto joined_r0x00097b0c;
      }
      uVar21 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
      uVar21 = (uVar21 & 0xcccccccccccccccc) >> 2 | (uVar21 & 0x3333333333333333) << 2;
      uVar21 = (uVar21 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar21 = (uVar21 & 0xff00ff00ff00ff00) >> 8 | (uVar21 & 0xff00ff00ff00ff) << 8;
      uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
      uVar14 = (uint)((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3);
    }
    else {
joined_r0x00097b0c:
      if (puVar18 < unaff_x23) {
        iVar15 = ((int)puVar18 - (int)unaff_x21) + -4;
        do {
          uVar21 = *puVar18 ^ *puVar19;
          if (uVar21 != 0) {
            uVar21 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
            uVar21 = (uVar21 & 0xcccccccccccccccc) >> 2 | (uVar21 & 0x3333333333333333) << 2;
            uVar21 = (uVar21 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar21 = (uVar21 & 0xff00ff00ff00ff00) >> 8 | (uVar21 & 0xff00ff00ff00ff) << 8;
            uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
            uVar14 = (int)((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) + iVar15;
            goto code_r0x000979b0;
          }
          puVar18 = puVar18 + 1;
          puVar19 = puVar19 + 1;
          iVar15 = iVar15 + 8;
        } while (puVar18 < unaff_x23);
      }
      if (puVar18 < in_stack_00000030) {
        if ((int)*puVar19 == (int)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 4);
          puVar19 = (ulong *)((long)puVar19 + 4);
        }
      }
      if (puVar18 < in_stack_00000028) {
        if ((short)*puVar19 == (short)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 2);
          puVar19 = (ulong *)((long)puVar19 + 2);
        }
      }
      if (puVar18 < in_stack_00000038) {
        if ((char)*puVar19 == (char)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 1);
        }
      }
      uVar14 = (int)puVar18 - (int)puVar1;
    }
code_r0x000979b0:
    if (unaff_x26 < (char *)((long)psVar13 + ((ulong)(uVar14 + 0xf0) * (ulong)param_3 >> 0x27) + 8))
    {
      return 0;
    }
    uVar16 = uVar14 - 0xf;
    if (uVar14 < 0xf) {
      *(char *)psVar22 = (char)*psVar22 + (char)uVar14;
    }
    else {
      *(char *)psVar22 = (char)*psVar22 + '\x0f';
      *(undefined4 *)unaff_x24 = param_4;
      if (0x3fb < uVar16) {
        uVar16 = (uint)((ulong)(uVar14 - 0x40b) * (ulong)param_3 >> 0x29);
        uVar21 = (ulong)(uVar16 << 2);
        _memset(psVar13 + 3,0xff,uVar21 + 4);
        param_5 = 0x8081;
        param_4 = 0xffffffff;
        param_3 = 0x80808081;
        in_w17 = -0x61c8864f;
        uVar16 = (uVar14 - 0x40b) + uVar16 * -0x3fc;
        unaff_x24 = (short *)((long)(psVar13 + 3) + uVar21);
        unaff_x22 = in_stack_00000060;
        unaff_w27 = in_stack_00000058;
      }
      uVar4 = (uVar16 & 0xffff) * param_5 >> 0x17;
      pcVar2 = (char *)((long)unaff_x24 + (ulong)uVar4);
      unaff_x24 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar16 + (char)uVar4;
    }
    param_6 = (int *)((long)unaff_x21 + (ulong)uVar14 + 4);
    if (unaff_x22 <= param_6) goto code_r0x00098770;
    piVar12 = (int *)((long)unaff_x21 + (ulong)uVar14 + 2);
    sVar6 = (short)unaff_x20;
    *(short *)(unaff_x25 + (ulong)((uint)(*piVar12 * in_w17) >> 0x13) * 2) = (short)piVar12 - sVar6;
    iVar15 = *param_6;
    lVar5 = (ulong)((uint)(iVar15 * in_w17) >> 0x13) * 2;
    unaff_x28 = (int *)(unaff_x20 + (ulong)*(ushort *)(unaff_x25 + lVar5));
    *(short *)(unaff_x25 + lVar5) = (short)param_6 - sVar6;
    if (*unaff_x28 != iVar15) break;
    psVar13 = (short *)((long)unaff_x24 + 1);
    *(char *)unaff_x24 = '\0';
    unaff_x21 = param_6;
    psVar22 = unaff_x24;
  } while( true );
  piVar12 = (int *)((long)unaff_x21 + (ulong)uVar14 + 5);
  uVar21 = 1;
  iVar15 = *piVar12;
  uVar14 = in_stack_00000040;
  do {
    param_1 = piVar12;
    piVar12 = (int *)((long)param_1 + uVar21);
    if (unaff_x22 < piVar12) {
code_r0x00098770:
      uVar21 = in_stack_00000050 - (long)param_6;
      if (unaff_x26 < (char *)((long)unaff_x24 + (uVar21 + 0xf0) / 0xff + uVar21 + 1)) {
        return 0;
      }
      uVar10 = uVar21 - 0xf;
      if (uVar21 < 0xf) {
        *(char *)unaff_x24 = (char)((int)uVar21 << 4);
      }
      else {
        psVar9 = (short *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = -0x10;
        if (0xfe < uVar10) {
          uVar10 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000048) - (long)param_6) - 0x10e;
          uVar11 = uVar10 / 0xff;
          _memset(psVar9,0xff,uVar11 + 1);
          uVar10 = uVar10 % 0xff;
          psVar9 = (short *)((long)unaff_x24 + uVar11 + 2);
        }
        *(char *)psVar9 = (char)uVar10;
        unaff_x24 = psVar9;
      }
      _memcpy((char *)((long)unaff_x24 + 1),param_6,uVar21);
      return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar21) - unaff_w27;
    }
    uVar21 = (ulong)(uVar14 >> 6);
    uVar14 = uVar14 + 1;
    lVar5 = (ulong)((uint)(iVar15 * in_w17) >> 0x13) * 2;
    uVar10 = (ulong)*(ushort *)(unaff_x25 + lVar5);
    iVar3 = *piVar12;
    *(short *)(unaff_x25 + lVar5) = (short)param_1 - sVar6;
    bVar8 = *(int *)(unaff_x20 + uVar10) != iVar15;
    iVar15 = iVar3;
  } while (bVar8);
  unaff_x28 = (int *)(unaff_x20 + uVar10);
  if ((*(int **)(unaff_x29 + -0x58) < unaff_x28) &&
     (*(char *)((long)param_1 - 1) == *(char *)((long)unaff_x28 - 1))) {
    piVar12 = (int *)(in_stack_00000020 + uVar10);
    piVar20 = (int *)((long)param_1 - 1U);
    piVar7 = (int *)((long)param_1 - 1U);
    do {
      param_1 = piVar7;
      unaff_x21 = piVar20;
      unaff_x28 = piVar12;
      if ((unaff_x28 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x21 <= param_6)) break;
      piVar12 = (int *)((long)unaff_x28 + -1);
      piVar20 = (int *)((long)unaff_x21 + -1);
      piVar7 = (int *)((long)param_1 - 1);
    } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)unaff_x28 + -1));
  }
  else {
    unaff_x21 = param_1;
  }
  in_x10 = (long)param_1 - (long)param_6;
  goto code_r0x0009779c;
}

