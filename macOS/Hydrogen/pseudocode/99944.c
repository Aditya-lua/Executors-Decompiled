
/* WARNING: Type propagation algorithm not settling */

int FUN_00099944(short *param_1,undefined8 param_2,int param_3)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  ushort uVar4;
  short sVar5;
  int *piVar6;
  int *piVar7;
  int *piVar8;
  bool bVar9;
  short *psVar11;
  short *psVar10;
  int *piVar12;
  ulong uVar13;
  int *piVar14;
  int iVar15;
  int *piVar16;
  short *in_x9;
  uint uVar17;
  uint in_w10;
  ulong uVar18;
  ulong *puVar19;
  ulong uVar20;
  ulong *puVar21;
  undefined8 *puVar22;
  long lVar23;
  uint in_w16;
  undefined4 in_w17;
  ulong unaff_x19;
  long lVar24;
  int *unaff_x20;
  long unaff_x21;
  int *piVar25;
  int *unaff_x22;
  int unaff_w23;
  short *unaff_x24;
  char *unaff_x26;
  ulong uVar26;
  ulong *unaff_x27;
  uint uVar27;
  long unaff_x29;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  long in_stack_00000030;
  ulong *in_stack_00000038;
  ulong *in_stack_00000040;
  ulong *in_stack_00000048;
  uint in_stack_00000050;
  long in_stack_00000058;
  int in_stack_00000060;
  long in_stack_00000068;
  
  do {
    if (unaff_x26 < (char *)((long)param_1 + ((ulong)in_w10 * (ulong)in_w16 >> 0x27) + 8)) {
      return 0;
    }
    uVar17 = (uint)unaff_x19;
    uVar27 = uVar17 - 0xf;
    if (uVar17 < 0xf) {
      *(char *)unaff_x24 = (char)*unaff_x24 + (char)unaff_x19;
      unaff_x24 = in_x9;
    }
    else {
      *(char *)unaff_x24 = (char)*unaff_x24 + '\x0f';
      *(undefined4 *)in_x9 = in_w17;
      if (0x3fb < uVar27) {
        uVar27 = (uint)((ulong)(uVar17 - 0x40b) * (ulong)in_w16 >> 0x29);
        uVar26 = (ulong)(uVar27 << 2);
        _memset(param_1 + 3,0xff,uVar26 + 4);
        param_3 = 0x8081;
        in_w17 = 0xffffffff;
        in_w16 = 0x80808081;
        uVar27 = (uVar17 - 0x40b) + uVar27 * -0x3fc;
        in_x9 = (short *)((long)(param_1 + 3) + uVar26);
        unaff_w23 = -0x61c8864f;
      }
      uVar17 = (uVar27 & 0xffff) * param_3 >> 0x17;
      pcVar2 = (char *)((long)in_x9 + (ulong)uVar17);
      *pcVar2 = (char)uVar27 + (char)uVar17;
      unaff_x24 = (short *)(pcVar2 + 1);
    }
    uVar26 = unaff_x19 & 0xffffffff;
    piVar16 = (int *)((long)unaff_x22 + uVar26 + 4);
    if (unaff_x20 <= piVar16) {
      lVar24 = *(long *)(unaff_x29 + -0x58);
code_r0x0009a138:
      uVar26 = in_stack_00000068 - (long)piVar16;
      if (unaff_x26 < (char *)((long)unaff_x24 + (uVar26 + 0xf0) / 0xff + uVar26 + 1)) {
        return 0;
      }
      uVar18 = uVar26 - 0xf;
      if (uVar26 < 0xf) {
        *(char *)unaff_x24 = (char)((int)uVar26 << 4);
      }
      else {
        psVar10 = (short *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = -0x10;
        if (0xfe < uVar18) {
          uVar18 = ((lVar24 + in_stack_00000058) - (long)piVar16) - 0x10e;
          uVar20 = uVar18 / 0xff;
          _memset(psVar10,0xff,uVar20 + 1);
          uVar18 = uVar18 % 0xff;
          psVar10 = (short *)((long)unaff_x24 + uVar20 + 2);
        }
        *(char *)psVar10 = (char)uVar18;
        unaff_x24 = psVar10;
      }
      _memcpy((char *)((long)unaff_x24 + 1),piVar16,uVar26);
      return ((int)(char *)((long)unaff_x24 + 1) + (int)uVar26) - in_stack_00000060;
    }
    piVar14 = (int *)((long)unaff_x22 + uVar26 + 2);
    lVar23 = *(long *)(unaff_x29 + -0x58);
    sVar5 = (short)lVar23;
    *(short *)(unaff_x21 + (ulong)((uint)(*piVar14 * unaff_w23) >> 0x13) * 2) =
         (short)piVar14 - sVar5;
    iVar15 = *piVar16;
    lVar24 = (ulong)((uint)(iVar15 * unaff_w23) >> 0x13) * 2;
    piVar14 = (int *)(lVar23 + (ulong)*(ushort *)(unaff_x21 + lVar24));
    *(short *)(unaff_x21 + lVar24) = (short)piVar16 - sVar5;
    if (*piVar14 == iVar15) {
      param_1 = (short *)((long)unaff_x24 + 1);
      *(char *)unaff_x24 = '\0';
      piVar25 = piVar16;
    }
    else {
      lVar24 = *(long *)(unaff_x29 + -0x58);
      piVar14 = (int *)((long)unaff_x22 + uVar26 + 5);
      uVar18 = 1;
      iVar15 = *piVar14;
      uVar27 = in_stack_00000050;
      do {
        piVar12 = piVar14;
        piVar14 = (int *)((long)piVar12 + uVar18);
        if (unaff_x20 < piVar14) goto code_r0x0009a138;
        uVar18 = (ulong)(uVar27 >> 6);
        uVar27 = uVar27 + 1;
        lVar23 = (ulong)((uint)(iVar15 * unaff_w23) >> 0x13) * 2;
        uVar4 = *(ushort *)(unaff_x21 + lVar23);
        uVar20 = (ulong)uVar4;
        iVar3 = *piVar14;
        *(short *)(unaff_x21 + lVar23) = (short)piVar12 - (short)lVar24;
        bVar9 = *(int *)(lVar24 + uVar20) != iVar15;
        iVar15 = iVar3;
      } while (bVar9);
      piVar14 = (int *)(lVar24 + uVar20);
      if ((uVar4 == 0) || (*(char *)((long)piVar12 - 1) != *(char *)((long)piVar14 + -1))) {
        piVar25 = piVar12;
      }
      else {
        piVar6 = (int *)(in_stack_00000030 + uVar20);
        piVar7 = (int *)((long)piVar12 - 1U);
        piVar8 = (int *)((long)piVar12 - 1U);
        do {
          piVar12 = piVar8;
          piVar25 = piVar7;
          piVar14 = piVar6;
          if ((piVar14 <= *(int **)(unaff_x29 + -0x58)) || (piVar25 <= piVar16)) break;
          piVar6 = (int *)((long)piVar14 + -1);
          piVar7 = (int *)((long)piVar25 + -1);
          piVar8 = (int *)((long)piVar12 - 1);
        } while (*(char *)((long)piVar25 + -1) == *(char *)((long)piVar14 + -1));
      }
      psVar10 = (short *)((long)unaff_x24 + 1);
      uVar18 = (long)piVar12 - (long)piVar16 & 0xffffffff;
      if (unaff_x26 < (char *)((long)psVar10 + (uVar18 * in_w16 >> 0x27) + uVar18 + 8)) {
        return 0;
      }
      uVar17 = (uint)((long)piVar12 - (long)piVar16);
      uVar27 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)unaff_x24 = (char)(uVar17 << 4);
      }
      else {
        *(char *)unaff_x24 = -0x10;
        psVar11 = psVar10;
        if (0xfe < uVar27) {
          uVar27 = ((int)piVar12 - (int)piVar16) - 0x10e;
          uVar20 = (ulong)uVar27 * (ulong)in_w16;
          uVar13 = uVar20 >> 0x27;
          _memset(psVar10,0xff,uVar13 + 1);
          param_3 = 0x8081;
          in_w17 = 0xffffffff;
          in_w16 = 0x80808081;
          uVar27 = uVar27 + (uint)(uVar20 >> 0x27);
          psVar11 = (short *)((long)unaff_x24 + uVar13 + 2);
        }
        psVar10 = (short *)((long)psVar11 + 1);
        *(char *)psVar11 = (char)uVar27;
      }
      param_1 = (short *)((long)psVar10 + uVar18);
      psVar11 = param_1;
      if (param_1 <= psVar10 + 4) {
        psVar11 = psVar10 + 4;
      }
      if (((char *)((long)psVar11 + ~(ulong)psVar10) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)psVar10 - (long)piVar16) < 0x40)) {
        psVar11 = psVar10;
      }
      else {
        uVar18 = ((long)psVar11 + ~(ulong)psVar10 >> 3) + 1;
        uVar20 = uVar18 & 0x3ffffffffffffff8;
        piVar16 = piVar16 + uVar20 * 2;
        psVar11 = psVar10 + uVar20 * 4;
        puVar22 = (undefined8 *)((long)unaff_x22 + uVar26 + 0x24);
        psVar10 = psVar10 + 0x10;
        uVar26 = uVar20;
        do {
          uVar28 = puVar22[-4];
          uVar30 = puVar22[-1];
          uVar29 = puVar22[-2];
          uVar32 = puVar22[1];
          uVar31 = *puVar22;
          uVar34 = puVar22[3];
          uVar33 = puVar22[2];
          *(undefined8 *)(psVar10 + -0xc) = puVar22[-3];
          *(undefined8 *)(psVar10 + -0x10) = uVar28;
          *(undefined8 *)(psVar10 + -4) = uVar30;
          *(undefined8 *)(psVar10 + -8) = uVar29;
          *(undefined8 *)(psVar10 + 4) = uVar32;
          *(undefined8 *)psVar10 = uVar31;
          *(undefined8 *)(psVar10 + 0xc) = uVar34;
          *(undefined8 *)(psVar10 + 8) = uVar33;
          uVar26 = uVar26 - 8;
          puVar22 = puVar22 + 8;
          psVar10 = psVar10 + 0x20;
        } while (uVar26 != 0);
        if (uVar18 == uVar20) goto code_r0x0009985c;
      }
      do {
        psVar10 = psVar11 + 4;
        *(undefined8 *)psVar11 = *(undefined8 *)piVar16;
        piVar16 = piVar16 + 2;
        psVar11 = psVar10;
      } while (psVar10 < param_1);
    }
code_r0x0009985c:
    in_x9 = param_1 + 1;
    *param_1 = (short)piVar25 - (short)piVar14;
    puVar1 = (ulong *)(piVar25 + 1);
    puVar21 = (ulong *)(piVar14 + 1);
    puVar19 = puVar1;
    if (puVar1 < unaff_x27) {
      uVar26 = *puVar1 ^ *puVar21;
      if (uVar26 == 0) {
        puVar21 = (ulong *)(piVar14 + 3);
        puVar19 = (ulong *)(piVar25 + 3);
        goto joined_r0x00099a94;
      }
      uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
      uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
      uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
      uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
      unaff_x19 = (ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3;
    }
    else {
joined_r0x00099a94:
      if (puVar19 < unaff_x27) {
        iVar15 = ((int)puVar19 - (int)piVar25) + -4;
        do {
          uVar26 = *puVar19 ^ *puVar21;
          if (uVar26 != 0) {
            uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
            uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
            uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
            uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
            unaff_x19 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) +
                                     iVar15);
            goto code_r0x00099940;
          }
          puVar19 = puVar19 + 1;
          puVar21 = puVar21 + 1;
          iVar15 = iVar15 + 8;
        } while (puVar19 < unaff_x27);
      }
      if (puVar19 < in_stack_00000040) {
        if ((int)*puVar21 == (int)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 4);
          puVar21 = (ulong *)((long)puVar21 + 4);
        }
      }
      if (puVar19 < in_stack_00000038) {
        if ((short)*puVar21 == (short)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 2);
          puVar21 = (ulong *)((long)puVar21 + 2);
        }
      }
      if (puVar19 < in_stack_00000048) {
        if ((char)*puVar21 == (char)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 1);
        }
      }
      unaff_x19 = (ulong)(uint)((int)puVar19 - (int)puVar1);
    }
code_r0x00099940:
    in_w10 = (int)unaff_x19 + 0xf0;
    unaff_x22 = piVar25;
  } while( true );
}

