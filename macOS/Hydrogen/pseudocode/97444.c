
int FUN_00097444(short *param_1,undefined8 param_2,undefined4 param_3,int param_4)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  short sVar4;
  int *piVar5;
  int *piVar6;
  int *piVar7;
  bool bVar8;
  short *psVar10;
  short *psVar9;
  int *piVar11;
  uint uVar12;
  short *in_x9;
  int iVar13;
  uint uVar14;
  ulong *in_x10;
  ulong *in_x11;
  ulong uVar15;
  ulong *in_x12;
  ulong uVar16;
  int *piVar17;
  ulong uVar18;
  int *piVar19;
  int *unaff_x21;
  long unaff_x22;
  int *unaff_x23;
  short *unaff_x24;
  long unaff_x25;
  int unaff_w26;
  ulong *unaff_x28;
  long unaff_x29;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  long in_stack_00000028;
  ulong *in_stack_00000030;
  ulong *in_stack_00000038;
  ulong *in_stack_00000040;
  uint in_stack_00000048;
  long in_stack_00000050;
  int in_stack_00000058;
  long in_stack_00000060;
  
LAB_00097424:
  if (in_x11 < unaff_x28) {
    uVar18 = *in_x11 ^ *in_x12;
    if (uVar18 == 0) {
      in_x11 = in_x11 + 1;
      in_x12 = in_x12 + 1;
      goto LAB_00097424;
    }
    uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
    uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
    uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
    uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong *)((long)in_x11 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3));
  }
  else {
    if (in_x11 < in_stack_00000038) {
      if ((int)*in_x12 == (int)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 4);
        in_x12 = (ulong *)((long)in_x12 + 4);
      }
    }
    if (in_x11 < in_stack_00000030) {
      if ((short)*in_x12 == (short)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 2);
        in_x12 = (ulong *)((long)in_x12 + 2);
      }
    }
    if (in_x11 < in_stack_00000040) {
      if ((char)*in_x12 == (char)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 1);
      }
    }
  }
  piVar17 = (int *)((long)unaff_x21 + ((long)in_x11 - (long)in_x10 & 0xffffffffU) + 4);
  uVar14 = (uint)((long)in_x11 - (long)in_x10);
  uVar12 = uVar14 - 0xf;
  if (uVar14 < 0xf) goto code_r0x000974dc;
  *(char *)unaff_x24 = (char)*unaff_x24 + '\x0f';
  *(undefined4 *)in_x9 = param_3;
  if (0x3fb < uVar12) {
    uVar18 = (ulong)((uVar14 - 0x40b) / 0x3fc << 2);
    _memset(param_1 + 3,0xff,uVar18 + 4);
    param_4 = 0x8081;
    param_3 = 0xffffffff;
    uVar12 = (uVar14 - 0x40b) % 0x3fc;
    in_x9 = (short *)((long)(param_1 + 3) + uVar18);
  }
  uVar14 = (uVar12 & 0xffff) * param_4 >> 0x17;
  pcVar1 = (char *)((long)in_x9 + (ulong)uVar14);
  *pcVar1 = (char)uVar12 + (char)uVar14;
  unaff_x24 = (short *)(pcVar1 + 1);
  do {
    if (unaff_x23 <= piVar17) {
code_r0x000986e0:
      uVar16 = in_stack_00000050 - (long)piVar17;
      uVar18 = uVar16 - 0xf;
      if (uVar16 < 0xf) {
        *(char *)unaff_x24 = (char)((int)uVar16 << 4);
      }
      else {
        psVar9 = (short *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = -0x10;
        if (0xfe < uVar18) {
          uVar18 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000060) - (long)piVar17) - 0x10e;
          uVar15 = uVar18 / 0xff;
          _memset(psVar9,0xff,uVar15 + 1);
          uVar18 = uVar18 % 0xff;
          psVar9 = (short *)((long)unaff_x24 + uVar15 + 2);
        }
        *(char *)psVar9 = (char)uVar18;
        unaff_x24 = psVar9;
      }
      _memcpy((char *)((long)unaff_x24 + 1),piVar17,uVar16);
      return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar16) - in_stack_00000058;
    }
    sVar4 = (short)unaff_x22;
    *(short *)(unaff_x25 + (ulong)((uint)(*(int *)((long)piVar17 + -2) * unaff_w26) >> 0x13) * 2) =
         (short)(int *)((long)piVar17 + -2) - sVar4;
    iVar13 = *piVar17;
    lVar3 = (ulong)((uint)(iVar13 * unaff_w26) >> 0x13) * 2;
    piVar19 = (int *)(unaff_x22 + (ulong)*(ushort *)(unaff_x25 + lVar3));
    *(short *)(unaff_x25 + lVar3) = (short)piVar17 - sVar4;
    if (*piVar19 == iVar13) {
      param_1 = (short *)((long)unaff_x24 + 1);
      *(char *)unaff_x24 = '\0';
      unaff_x21 = piVar17;
    }
    else {
      uVar18 = 1;
      piVar19 = (int *)((long)piVar17 + 1U);
      iVar13 = *(int *)((long)piVar17 + 1U);
      uVar12 = in_stack_00000048;
      do {
        piVar11 = piVar19;
        piVar19 = (int *)((long)piVar11 + uVar18);
        if (unaff_x23 < piVar19) goto code_r0x000986e0;
        uVar18 = (ulong)(uVar12 >> 6);
        uVar12 = uVar12 + 1;
        lVar3 = (ulong)((uint)(iVar13 * unaff_w26) >> 0x13) * 2;
        uVar16 = (ulong)*(ushort *)(unaff_x25 + lVar3);
        iVar2 = *piVar19;
        *(short *)(unaff_x25 + lVar3) = (short)piVar11 - sVar4;
        bVar8 = *(int *)(unaff_x22 + uVar16) != iVar13;
        iVar13 = iVar2;
      } while (bVar8);
      piVar19 = (int *)(unaff_x22 + uVar16);
      if ((*(int **)(unaff_x29 + -0x58) < piVar19) &&
         (*(char *)((long)piVar11 - 1) == *(char *)((long)piVar19 - 1))) {
        piVar5 = (int *)(in_stack_00000028 + uVar16);
        piVar6 = (int *)((long)piVar11 - 1U);
        piVar7 = (int *)((long)piVar11 - 1U);
        do {
          piVar11 = piVar7;
          unaff_x21 = piVar6;
          piVar19 = piVar5;
          if ((piVar19 <= *(int **)(unaff_x29 + -0x58)) || (unaff_x21 <= piVar17)) break;
          piVar5 = (int *)((long)piVar19 + -1);
          piVar6 = (int *)((long)unaff_x21 + -1);
          piVar7 = (int *)((long)piVar11 - 1);
        } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)piVar19 + -1));
      }
      else {
        unaff_x21 = piVar11;
      }
      psVar9 = (short *)((long)unaff_x24 + 1);
      uVar14 = (uint)((long)piVar11 - (long)piVar17);
      uVar12 = uVar14 - 0xf;
      if (uVar14 < 0xf) {
        *(char *)unaff_x24 = (char)(uVar14 << 4);
      }
      else {
        *(char *)unaff_x24 = -0x10;
        psVar10 = psVar9;
        if (0xfe < uVar12) {
          uVar12 = ((int)piVar11 - (int)piVar17) - 0x10e;
          uVar18 = (ulong)uVar12 / 0xff;
          _memset(psVar9,0xff,uVar18 + 1);
          param_4 = 0x8081;
          param_3 = 0xffffffff;
          uVar12 = uVar12 + (int)uVar18;
          psVar10 = (short *)((long)unaff_x24 + uVar18 + 2);
        }
        psVar9 = (short *)((long)psVar10 + 1);
        *(char *)psVar10 = (char)uVar12;
      }
      param_1 = (short *)((long)psVar9 + ((long)piVar11 - (long)piVar17 & 0xffffffffU));
      psVar10 = param_1;
      if (param_1 <= psVar9 + 4) {
        psVar10 = psVar9 + 4;
      }
      if (((char *)((long)psVar10 + ~(ulong)psVar9) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)psVar9 - (long)piVar17) < 0x40)) {
        piVar11 = piVar17;
        psVar10 = psVar9;
      }
      else {
        uVar18 = ((long)psVar10 + ~(ulong)psVar9 >> 3) + 1;
        uVar15 = uVar18 & 0x3ffffffffffffff8;
        piVar11 = piVar17 + uVar15 * 2;
        psVar10 = psVar9 + uVar15 * 4;
        piVar17 = piVar17 + 8;
        psVar9 = psVar9 + 0x10;
        uVar16 = uVar15;
        do {
          uVar20 = *(undefined8 *)(piVar17 + -8);
          uVar22 = *(undefined8 *)(piVar17 + -2);
          uVar21 = *(undefined8 *)(piVar17 + -4);
          uVar24 = *(undefined8 *)(piVar17 + 2);
          uVar23 = *(undefined8 *)piVar17;
          uVar26 = *(undefined8 *)(piVar17 + 6);
          uVar25 = *(undefined8 *)(piVar17 + 4);
          *(undefined8 *)(psVar9 + -0xc) = *(undefined8 *)(piVar17 + -6);
          *(undefined8 *)(psVar9 + -0x10) = uVar20;
          *(undefined8 *)(psVar9 + -4) = uVar22;
          *(undefined8 *)(psVar9 + -8) = uVar21;
          *(undefined8 *)(psVar9 + 4) = uVar24;
          *(undefined8 *)psVar9 = uVar23;
          *(undefined8 *)(psVar9 + 0xc) = uVar26;
          *(undefined8 *)(psVar9 + 8) = uVar25;
          uVar16 = uVar16 - 8;
          piVar17 = piVar17 + 0x10;
          psVar9 = psVar9 + 0x20;
        } while (uVar16 != 0);
        if (uVar18 == uVar15) goto code_r0x000973d8;
      }
      do {
        psVar9 = psVar10 + 4;
        *(undefined8 *)psVar10 = *(undefined8 *)piVar11;
        piVar11 = piVar11 + 2;
        psVar10 = psVar9;
      } while (psVar9 < param_1);
    }
code_r0x000973d8:
    in_x9 = param_1 + 1;
    *param_1 = (short)unaff_x21 - (short)piVar19;
    in_x10 = (ulong *)(unaff_x21 + 1);
    in_x12 = (ulong *)(piVar19 + 1);
    if (unaff_x28 <= in_x10) {
      in_x11 = in_x10;
      goto LAB_00097424;
    }
    uVar18 = *in_x10 ^ *in_x12;
    if (uVar18 == 0) break;
    uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
    uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
    uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
    uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
    uVar14 = (uint)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
    piVar17 = (int *)((long)unaff_x21 + (ulong)(uVar14 + 4));
code_r0x000974dc:
    *(char *)unaff_x24 = (char)*unaff_x24 + (char)uVar14;
    unaff_x24 = in_x9;
  } while( true );
  in_x12 = (ulong *)(piVar19 + 3);
  in_x11 = (ulong *)(unaff_x21 + 3);
  goto LAB_00097424;
}

