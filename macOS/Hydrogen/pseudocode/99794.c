
/* WARNING: Type propagation algorithm not settling */

int FUN_00099794(short *param_1,undefined8 param_2,long param_3)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  ushort uVar4;
  uint uVar5;
  short sVar6;
  int *piVar7;
  int *piVar8;
  bool bVar9;
  int *piVar10;
  int *piVar11;
  short *psVar12;
  int iVar13;
  uint uVar14;
  uint uVar15;
  short *psVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong uVar19;
  ulong uVar20;
  ulong *puVar21;
  long lVar22;
  short *psVar23;
  int *unaff_x19;
  long lVar24;
  int *unaff_x20;
  long unaff_x21;
  int *unaff_x22;
  int unaff_w23;
  short *unaff_x24;
  short *psVar25;
  int *unaff_x25;
  char *unaff_x26;
  ulong *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  ulong in_stack_00000020;
  uint in_stack_00000028;
  long in_stack_00000030;
  ulong *in_stack_00000038;
  ulong *in_stack_00000040;
  ulong *in_stack_00000048;
  uint in_stack_00000050;
  long in_stack_00000058;
  int in_stack_00000060;
  long in_stack_00000068;
  
code_r0x00099794:
  _memset(param_1,param_2,param_3);
  in_stack_00000028 = in_stack_00000028 + (int)in_stack_00000020;
  psVar12 = (short *)((long)unaff_x24 + in_stack_00000020 + 2);
code_r0x000997c0:
  param_1 = (short *)((long)psVar12 + 1);
  *(char *)psVar12 = (char)in_stack_00000028;
LAB_000997d0:
  psVar12 = (short *)((long)param_1 + unaff_x28);
  psVar16 = psVar12;
  if (psVar12 <= param_1 + 4) {
    psVar16 = param_1 + 4;
  }
  psVar25 = unaff_x24;
  if (((char *)((long)psVar16 + ~(ulong)param_1) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)param_1 - (long)unaff_x25) < 0x40)) {
    piVar11 = unaff_x25;
    psVar16 = param_1;
  }
  else {
    uVar17 = ((long)psVar16 + ~(ulong)param_1 >> 3) + 1;
    uVar20 = uVar17 & 0x3ffffffffffffff8;
    piVar11 = unaff_x25 + uVar20 * 2;
    psVar16 = param_1 + uVar20 * 4;
    piVar10 = unaff_x25 + 8;
    psVar23 = param_1 + 0x10;
    uVar19 = uVar20;
    do {
      uVar26 = *(undefined8 *)(piVar10 + -8);
      uVar28 = *(undefined8 *)(piVar10 + -2);
      uVar27 = *(undefined8 *)(piVar10 + -4);
      uVar30 = *(undefined8 *)(piVar10 + 2);
      uVar29 = *(undefined8 *)piVar10;
      uVar32 = *(undefined8 *)(piVar10 + 6);
      uVar31 = *(undefined8 *)(piVar10 + 4);
      *(undefined8 *)(psVar23 + -0xc) = *(undefined8 *)(piVar10 + -6);
      *(undefined8 *)(psVar23 + -0x10) = uVar26;
      *(undefined8 *)(psVar23 + -4) = uVar28;
      *(undefined8 *)(psVar23 + -8) = uVar27;
      *(undefined8 *)(psVar23 + 4) = uVar30;
      *(undefined8 *)psVar23 = uVar29;
      *(undefined8 *)(psVar23 + 0xc) = uVar32;
      *(undefined8 *)(psVar23 + 8) = uVar31;
      uVar19 = uVar19 - 8;
      piVar10 = piVar10 + 0x10;
      psVar23 = psVar23 + 0x20;
    } while (uVar19 != 0);
    if (uVar17 == uVar20) goto LAB_0009985c;
  }
  do {
    psVar23 = psVar16 + 4;
    *(undefined8 *)psVar16 = *(undefined8 *)piVar11;
    piVar11 = piVar11 + 2;
    psVar16 = psVar23;
  } while (psVar23 < psVar12);
LAB_0009985c:
  do {
    unaff_x24 = psVar12 + 1;
    *psVar12 = (short)unaff_x22 - (short)unaff_x19;
    puVar1 = (ulong *)(unaff_x22 + 1);
    puVar21 = (ulong *)(unaff_x19 + 1);
    puVar18 = puVar1;
    if (puVar1 < unaff_x27) {
      uVar17 = *puVar1 ^ *puVar21;
      if (uVar17 == 0) {
        puVar21 = (ulong *)(unaff_x19 + 3);
        puVar18 = (ulong *)(unaff_x22 + 3);
        goto joined_r0x00099a94;
      }
      uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
      uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
      uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
      uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
      uVar14 = (uint)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3);
    }
    else {
joined_r0x00099a94:
      if (puVar18 < unaff_x27) {
        iVar13 = ((int)puVar18 - (int)unaff_x22) + -4;
        do {
          uVar17 = *puVar18 ^ *puVar21;
          if (uVar17 != 0) {
            uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
            uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
            uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
            uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
            uVar14 = (int)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) + iVar13;
            goto LAB_00099940;
          }
          puVar18 = puVar18 + 1;
          puVar21 = puVar21 + 1;
          iVar13 = iVar13 + 8;
        } while (puVar18 < unaff_x27);
      }
      if (puVar18 < in_stack_00000040) {
        if ((int)*puVar21 == (int)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 4);
          puVar21 = (ulong *)((long)puVar21 + 4);
        }
      }
      if (puVar18 < in_stack_00000038) {
        if ((short)*puVar21 == (short)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 2);
          puVar21 = (ulong *)((long)puVar21 + 2);
        }
      }
      if (puVar18 < in_stack_00000048) {
        if ((char)*puVar21 == (char)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 1);
        }
      }
      uVar14 = (int)puVar18 - (int)puVar1;
    }
LAB_00099940:
    if (unaff_x26 < (char *)((long)psVar12 + (ulong)(uVar14 + 0xf0) / 0xff + 8)) {
      return 0;
    }
    uVar15 = uVar14 - 0xf;
    if (uVar14 < 0xf) {
      *(char *)psVar25 = (char)*psVar25 + (char)uVar14;
    }
    else {
      *(char *)psVar25 = (char)*psVar25 + '\x0f';
      unaff_x24[0] = -1;
      unaff_x24[1] = -1;
      if (0x3fb < uVar15) {
        uVar17 = (ulong)((uVar14 - 0x40b) / 0x3fc << 2);
        _memset(psVar12 + 3,0xff,uVar17 + 4);
        uVar15 = (uVar14 - 0x40b) % 0x3fc;
        unaff_x24 = (short *)((long)(psVar12 + 3) + uVar17);
        unaff_w23 = -0x61c8864f;
      }
      uVar5 = (uVar15 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)unaff_x24 + (ulong)uVar5);
      unaff_x24 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar15 + (char)uVar5;
    }
    unaff_x25 = (int *)((long)unaff_x22 + (ulong)uVar14 + 4);
    if (unaff_x20 <= unaff_x25) {
      lVar24 = *(long *)(unaff_x29 + -0x58);
      goto code_r0x0009a138;
    }
    piVar11 = (int *)((long)unaff_x22 + (ulong)uVar14 + 2);
    lVar22 = *(long *)(unaff_x29 + -0x58);
    sVar6 = (short)lVar22;
    *(short *)(unaff_x21 + (ulong)((uint)(*piVar11 * unaff_w23) >> 0x13) * 2) =
         (short)piVar11 - sVar6;
    iVar13 = *unaff_x25;
    lVar24 = (ulong)((uint)(iVar13 * unaff_w23) >> 0x13) * 2;
    unaff_x19 = (int *)(lVar22 + (ulong)*(ushort *)(unaff_x21 + lVar24));
    *(short *)(unaff_x21 + lVar24) = (short)unaff_x25 - sVar6;
    if (*unaff_x19 != iVar13) break;
    psVar12 = (short *)((long)unaff_x24 + 1);
    *(char *)unaff_x24 = '\0';
    unaff_x22 = unaff_x25;
    psVar25 = unaff_x24;
  } while( true );
  lVar24 = *(long *)(unaff_x29 + -0x58);
  piVar11 = (int *)((long)unaff_x22 + (ulong)uVar14 + 5);
  uVar17 = 1;
  iVar13 = *piVar11;
  uVar14 = in_stack_00000050;
  do {
    piVar10 = piVar11;
    piVar11 = (int *)((long)piVar10 + uVar17);
    if (unaff_x20 < piVar11) {
code_r0x0009a138:
      uVar17 = in_stack_00000068 - (long)unaff_x25;
      if (unaff_x26 < (char *)((long)unaff_x24 + (uVar17 + 0xf0) / 0xff + uVar17 + 1)) {
        return 0;
      }
      uVar19 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)unaff_x24 = (char)((int)uVar17 << 4);
      }
      else {
        psVar12 = (short *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = -0x10;
        if (0xfe < uVar19) {
          uVar19 = ((lVar24 + in_stack_00000058) - (long)unaff_x25) - 0x10e;
          uVar20 = uVar19 / 0xff;
          _memset(psVar12,0xff,uVar20 + 1);
          uVar19 = uVar19 % 0xff;
          psVar12 = (short *)((long)unaff_x24 + uVar20 + 2);
        }
        *(char *)psVar12 = (char)uVar19;
        unaff_x24 = psVar12;
      }
      _memcpy((char *)((long)unaff_x24 + 1),unaff_x25,uVar17);
      return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar17) - in_stack_00000060;
    }
    uVar17 = (ulong)(uVar14 >> 6);
    uVar14 = uVar14 + 1;
    lVar22 = (ulong)((uint)(iVar13 * unaff_w23) >> 0x13) * 2;
    uVar4 = *(ushort *)(unaff_x21 + lVar22);
    uVar19 = (ulong)uVar4;
    iVar3 = *piVar11;
    *(short *)(unaff_x21 + lVar22) = (short)piVar10 - (short)lVar24;
    bVar9 = *(int *)(lVar24 + uVar19) != iVar13;
    iVar13 = iVar3;
  } while (bVar9);
  unaff_x19 = (int *)(lVar24 + uVar19);
  if ((uVar4 == 0) || (*(char *)((long)piVar10 - 1) != *(char *)((long)unaff_x19 + -1))) {
    unaff_x22 = piVar10;
  }
  else {
    piVar11 = (int *)(in_stack_00000030 + uVar19);
    piVar7 = (int *)((long)piVar10 - 1U);
    piVar8 = (int *)((long)piVar10 - 1U);
    do {
      piVar10 = piVar8;
      unaff_x22 = piVar7;
      unaff_x19 = piVar11;
      if ((unaff_x19 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x22 <= unaff_x25)) break;
      piVar11 = (int *)((long)unaff_x19 + -1);
      piVar7 = (int *)((long)unaff_x22 + -1);
      piVar8 = (int *)((long)piVar10 - 1);
    } while (*(char *)((long)unaff_x22 + -1) == *(char *)((long)unaff_x19 + -1));
  }
  param_1 = (short *)((long)unaff_x24 + 1);
  unaff_x28 = (long)piVar10 - (long)unaff_x25 & 0xffffffff;
  if (unaff_x26 < (char *)((long)param_1 + unaff_x28 / 0xff + unaff_x28 + 8)) {
    return 0;
  }
  uVar14 = (uint)((long)piVar10 - (long)unaff_x25);
  in_stack_00000028 = uVar14 - 0xf;
  if (0xe < uVar14) goto code_r0x00099764;
  *(char *)unaff_x24 = (char)(uVar14 << 4);
  goto LAB_000997d0;
code_r0x00099764:
  *(char *)unaff_x24 = -0x10;
  psVar12 = param_1;
  if (0xfe < in_stack_00000028) goto code_r0x00099774;
  goto code_r0x000997c0;
code_r0x00099774:
  in_stack_00000028 = ((int)piVar10 - (int)unaff_x25) - 0x10e;
  in_stack_00000020 = (ulong)in_stack_00000028 / 0xff;
  param_3 = in_stack_00000020 + 1;
  param_2 = 0xff;
  goto code_r0x00099794;
}

