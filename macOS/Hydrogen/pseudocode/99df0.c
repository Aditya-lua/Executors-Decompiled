
int thunk_FUN_00099e0c(short *param_1,undefined8 param_2,int param_3)

{
  int *piVar1;
  ulong *puVar2;
  char *pcVar3;
  int iVar4;
  ushort uVar5;
  long lVar6;
  short sVar7;
  int *piVar8;
  int *piVar9;
  bool bVar10;
  short *psVar12;
  short *psVar11;
  short *psVar13;
  int *piVar14;
  int iVar15;
  uint uVar16;
  int *in_x9;
  uint uVar17;
  short *in_x10;
  ulong uVar18;
  ulong *puVar19;
  ulong uVar20;
  ulong uVar21;
  ulong *puVar22;
  int *piVar23;
  undefined4 in_w17;
  int *unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  int *unaff_x22;
  int *unaff_x23;
  int unaff_w24;
  short *unaff_x26;
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
  long in_stack_00000038;
  ulong *in_stack_00000040;
  ulong *in_stack_00000048;
  ulong *in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  long in_stack_00000068;
  
  do {
    do {
      psVar11 = in_x10 + 4;
      *(undefined8 *)in_x10 = *(undefined8 *)in_x9;
      in_x9 = in_x9 + 2;
      in_x10 = psVar11;
      psVar13 = unaff_x26;
    } while (psVar11 < param_1);
LAB_00099e1c:
    do {
      unaff_x26 = param_1 + 1;
      *param_1 = (short)unaff_x22 - (short)unaff_x20;
      puVar2 = (ulong *)(unaff_x22 + 1);
      puVar22 = (ulong *)(unaff_x20 + 1);
      if (puVar2 < unaff_x28) {
        uVar18 = *puVar2 ^ *puVar22;
        if (uVar18 == 0) {
          puVar22 = (ulong *)(unaff_x20 + 3);
          puVar19 = (ulong *)(unaff_x22 + 3);
          goto LAB_00099e68;
        }
        uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
        uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
        uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
        uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
        uVar17 = (uint)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
        piVar23 = (int *)((long)unaff_x22 + (ulong)(uVar17 + 4));
LAB_00099f24:
        *(char *)psVar13 = (char)*psVar13 + (char)uVar17;
      }
      else {
        puVar19 = puVar2;
LAB_00099e68:
        for (; puVar19 < unaff_x28; puVar19 = puVar19 + 1) {
          uVar18 = *puVar19 ^ *puVar22;
          if (uVar18 != 0) {
            uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
            uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
            uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
            uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
            puVar19 = (ulong *)((long)puVar19 +
                               ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3));
            goto LAB_00099e98;
          }
          puVar22 = puVar22 + 1;
        }
        if (puVar19 < in_stack_00000048) {
          if ((int)*puVar22 == (int)*puVar19) {
            puVar19 = (ulong *)((long)puVar19 + 4);
            puVar22 = (ulong *)((long)puVar22 + 4);
          }
        }
        if (puVar19 < in_stack_00000040) {
          if ((short)*puVar22 == (short)*puVar19) {
            puVar19 = (ulong *)((long)puVar19 + 2);
            puVar22 = (ulong *)((long)puVar22 + 2);
          }
        }
        if (puVar19 < in_stack_00000050) {
          if ((char)*puVar22 == (char)*puVar19) {
            puVar19 = (ulong *)((long)puVar19 + 1);
          }
        }
LAB_00099e98:
        piVar23 = (int *)((long)unaff_x22 + ((long)puVar19 - (long)puVar2 & 0xffffffffU) + 4);
        uVar17 = (uint)((long)puVar19 - (long)puVar2);
        uVar16 = uVar17 - 0xf;
        if (uVar17 < 0xf) goto LAB_00099f24;
        *(char *)psVar13 = (char)*psVar13 + '\x0f';
        *(undefined4 *)unaff_x26 = in_w17;
        if (0x3fb < uVar16) {
          uVar18 = (ulong)((uVar17 - 0x40b) / 0x3fc << 2);
          _memset(param_1 + 3,0xff,uVar18 + 4);
          param_3 = 0x8081;
          in_w17 = 0xffffffff;
          uVar16 = (uVar17 - 0x40b) % 0x3fc;
          unaff_x19 = *(int **)(unaff_x29 + -0x58);
          unaff_x26 = (short *)((long)(param_1 + 3) + uVar18);
        }
        uVar17 = (uVar16 & 0xffff) * param_3 >> 0x17;
        pcVar3 = (char *)((long)unaff_x26 + (ulong)uVar17);
        unaff_x26 = (short *)(pcVar3 + 1);
        *pcVar3 = (char)uVar16 + (char)uVar17;
      }
      if (unaff_x23 <= piVar23) {
code_r0x0009a09c:
        uVar20 = in_stack_00000068 - (long)piVar23;
        uVar18 = uVar20 - 0xf;
        if (uVar20 < 0xf) {
          *(char *)unaff_x26 = (char)((int)uVar20 << 4);
        }
        else {
          psVar13 = (short *)((long)unaff_x26 + 1);
          *(char *)unaff_x26 = -0x10;
          if (0xfe < uVar18) {
            uVar18 = (long)unaff_x19 + (unaff_x27 - (long)piVar23) + -0x10e;
            uVar21 = uVar18 / 0xff;
            _memset(psVar13,0xff,uVar21 + 1);
            uVar18 = uVar18 % 0xff;
            psVar13 = (short *)((long)unaff_x26 + uVar21 + 2);
          }
          *(char *)psVar13 = (char)uVar18;
          unaff_x26 = psVar13;
        }
        _memcpy((char *)((long)unaff_x26 + 1),piVar23,uVar20);
        return ((int)(char *)((long)unaff_x26 + 1) + (int)uVar20) - in_stack_00000060;
      }
      sVar7 = (short)unaff_x19;
      *(short *)(unaff_x21 + (ulong)((uint)(*(int *)((long)piVar23 + -2) * unaff_w24) >> 0x13) * 2)
           = (short)(int *)((long)piVar23 + -2) - sVar7;
      iVar15 = *piVar23;
      lVar6 = (ulong)((uint)(iVar15 * unaff_w24) >> 0x13) * 2;
      unaff_x20 = (int *)((long)unaff_x19 + (ulong)*(ushort *)(unaff_x21 + lVar6));
      *(short *)(unaff_x21 + lVar6) = (short)piVar23 - sVar7;
      psVar13 = unaff_x26;
      if (*unaff_x20 == iVar15) {
        param_1 = (short *)((long)unaff_x26 + 1);
        *(char *)unaff_x26 = '\0';
        unaff_x22 = piVar23;
        goto LAB_00099e1c;
      }
      uVar18 = 1;
      piVar1 = (int *)((long)piVar23 + 1U);
      iVar15 = *(int *)((long)piVar23 + 1U);
      uVar16 = in_stack_00000058;
      do {
        piVar14 = piVar1;
        piVar1 = (int *)((long)piVar14 + uVar18);
        if (unaff_x23 < piVar1) goto code_r0x0009a09c;
        uVar18 = (ulong)(uVar16 >> 6);
        uVar16 = uVar16 + 1;
        lVar6 = (ulong)((uint)(iVar15 * unaff_w24) >> 0x13) * 2;
        uVar5 = *(ushort *)(unaff_x21 + lVar6);
        uVar20 = (ulong)uVar5;
        iVar4 = *piVar1;
        *(short *)(unaff_x21 + lVar6) = (short)piVar14 - sVar7;
        bVar10 = *(int *)((long)unaff_x19 + uVar20) != iVar15;
        iVar15 = iVar4;
      } while (bVar10);
      unaff_x20 = (int *)((long)unaff_x19 + uVar20);
      if ((uVar5 == 0) || (*(char *)((long)piVar14 - 1) != *(char *)((long)unaff_x20 + -1))) {
        unaff_x22 = piVar14;
      }
      else {
        piVar1 = (int *)(in_stack_00000038 + uVar20);
        piVar8 = (int *)((long)piVar14 - 1U);
        piVar9 = (int *)((long)piVar14 - 1U);
        do {
          piVar14 = piVar9;
          unaff_x22 = piVar8;
          unaff_x20 = piVar1;
          if ((unaff_x20 <= unaff_x19) || (unaff_x22 <= piVar23)) break;
          piVar1 = (int *)((long)unaff_x20 + -1);
          piVar8 = (int *)((long)unaff_x22 + -1);
          piVar9 = (int *)((long)piVar14 - 1);
        } while (*(char *)((long)unaff_x22 + -1) == *(char *)((long)unaff_x20 + -1));
      }
      psVar11 = (short *)((long)unaff_x26 + 1);
      uVar17 = (uint)((long)piVar14 - (long)piVar23);
      uVar16 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)unaff_x26 = (char)(uVar17 << 4);
      }
      else {
        *(char *)unaff_x26 = -0x10;
        psVar12 = psVar11;
        if (0xfe < uVar16) {
          uVar17 = ((int)piVar14 - (int)piVar23) - 0x10e;
          _memset(psVar11,0xff,(ulong)uVar17 / 0xff + 1);
          param_3 = 0x8081;
          in_w17 = 0xffffffff;
          uVar16 = uVar17 + uVar17 / 0xff;
          psVar12 = (short *)((long)unaff_x26 + (ulong)uVar17 / 0xff + 2);
        }
        psVar11 = (short *)((long)psVar12 + 1);
        *(char *)psVar12 = (char)uVar16;
      }
      param_1 = (short *)((long)psVar11 + ((long)piVar14 - (long)piVar23 & 0xffffffffU));
      psVar12 = param_1;
      if (param_1 <= psVar11 + 4) {
        psVar12 = psVar11 + 4;
      }
      in_x9 = piVar23;
      if ((char *)((long)psVar12 + ~(ulong)psVar11) < &segment_command_00000020.vmaddr) {
        unaff_x19 = *(int **)(unaff_x29 + -0x58);
        in_x10 = psVar11;
        break;
      }
      unaff_x19 = *(int **)(unaff_x29 + -0x58);
      if ((ulong)((long)psVar11 - (long)piVar23) < 0x40) {
        in_x10 = psVar11;
        break;
      }
      uVar18 = ((long)psVar12 + ~(ulong)psVar11 >> 3) + 1;
      uVar21 = uVar18 & 0x3ffffffffffffff8;
      in_x9 = piVar23 + uVar21 * 2;
      in_x10 = psVar11 + uVar21 * 4;
      piVar23 = piVar23 + 8;
      psVar11 = psVar11 + 0x10;
      uVar20 = uVar21;
      do {
        uVar24 = *(undefined8 *)(piVar23 + -8);
        uVar26 = *(undefined8 *)(piVar23 + -2);
        uVar25 = *(undefined8 *)(piVar23 + -4);
        uVar28 = *(undefined8 *)(piVar23 + 2);
        uVar27 = *(undefined8 *)piVar23;
        uVar30 = *(undefined8 *)(piVar23 + 6);
        uVar29 = *(undefined8 *)(piVar23 + 4);
        *(undefined8 *)(psVar11 + -0xc) = *(undefined8 *)(piVar23 + -6);
        *(undefined8 *)(psVar11 + -0x10) = uVar24;
        *(undefined8 *)(psVar11 + -4) = uVar26;
        *(undefined8 *)(psVar11 + -8) = uVar25;
        *(undefined8 *)(psVar11 + 4) = uVar28;
        *(undefined8 *)psVar11 = uVar27;
        *(undefined8 *)(psVar11 + 0xc) = uVar30;
        *(undefined8 *)(psVar11 + 8) = uVar29;
        uVar20 = uVar20 - 8;
        piVar23 = piVar23 + 0x10;
        psVar11 = psVar11 + 0x20;
      } while (uVar20 != 0);
    } while (uVar18 == uVar21);
  } while( true );
}

