
int FUN_000992e4(void)

{
  ulong *puVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  long *plVar7;
  long *plVar6;
  short *psVar8;
  uint in_w8;
  long *plVar9;
  long *plVar10;
  uint uVar11;
  ulong *puVar12;
  long lVar13;
  ulong *puVar14;
  long *plVar15;
  uint unaff_w19;
  int *piVar16;
  uint uVar17;
  int *piVar18;
  ulong uVar19;
  long unaff_x21;
  ulong uVar20;
  long *unaff_x22;
  short *unaff_x23;
  short *psVar21;
  long *unaff_x24;
  ulong uVar22;
  long unaff_x26;
  int iVar23;
  long unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long in_stack_00000010;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000050;
  uint in_stack_00000058;
  int in_stack_00000060;
  uint in_stack_00000068;
  
code_r0x000992e4:
  uVar17 = (uint)((ulong)unaff_w19 * (ulong)in_w8 >> 0x29);
  uVar22 = (ulong)(uVar17 << 2);
  _memset(unaff_x23,0xff,uVar22 + 4);
  uVar17 = unaff_w19 + uVar17 * -0x3fc;
  piVar16 = *(int **)(unaff_x29 + -0x58);
  psVar8 = (short *)((long)unaff_x23 + uVar22);
code_r0x00099314:
  uVar11 = (uVar17 & 0xffff) / 0xff;
  pcVar2 = (char *)((long)psVar8 + (ulong)uVar11);
  *pcVar2 = (char)uVar17 + (char)uVar11;
  psVar21 = (short *)(pcVar2 + 1);
  do {
    if (unaff_x24 <= unaff_x22) {
LAB_0009949c:
      uVar20 = in_stack_00000050 - (long)unaff_x22;
      uVar22 = uVar20 - 0xf;
      if (uVar20 < 0xf) {
        *(char *)psVar21 = (char)((int)uVar20 << 4);
      }
      else {
        psVar8 = (short *)((long)psVar21 + 1);
        *(char *)psVar21 = -0x10;
        if (0xfe < uVar22) {
          uVar22 = (long)piVar16 + (in_stack_00000030 - (long)unaff_x22) + -0x10e;
          uVar19 = uVar22 / 0xff;
          _memset(psVar8,0xff,uVar19 + 1);
          uVar22 = uVar22 % 0xff;
          psVar8 = (short *)((long)psVar21 + uVar19 + 2);
        }
        *(char *)psVar8 = (char)uVar22;
        psVar21 = psVar8;
      }
      _memcpy((char *)((long)psVar21 + 1),unaff_x22,uVar20);
      return ((int)(char *)((long)psVar21 + 1) + (int)uVar20) - in_stack_00000060;
    }
    iVar23 = (int)unaff_x27;
    *(int *)(unaff_x21 + ((ulong)(*(long *)((long)unaff_x22 + -2) * unaff_x26) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)unaff_x22 + -2) - iVar23;
    uVar11 = (int)unaff_x22 - iVar23;
    uVar22 = (ulong)(*unaff_x22 * unaff_x26) >> 0x32 & 0x3ffc;
    uVar17 = *(uint *)(unaff_x21 + uVar22);
    *(uint *)(unaff_x21 + uVar22) = uVar11;
    if ((uVar17 + 0xffff < uVar11) ||
       (piVar18 = (int *)(unaff_x27 + (ulong)uVar17), *piVar18 != (int)*unaff_x22)) {
      if (unaff_x24 < (long *)((long)unaff_x22 + 2U)) goto LAB_0009949c;
      lVar13 = *(long *)((long)unaff_x22 + 1U);
      plVar9 = (long *)((long)unaff_x22 + 1U);
      plVar10 = (long *)((long)unaff_x22 + 2U);
      uVar11 = in_stack_00000068;
      uVar17 = in_stack_00000058;
      while( true ) {
        uVar20 = (ulong)(lVar13 * unaff_x26) >> 0x32 & 0x3ffc;
        uVar3 = *(uint *)(unaff_x21 + uVar20);
        uVar22 = (ulong)uVar3;
        uVar4 = (int)plVar9 - iVar23;
        lVar13 = *plVar10;
        *(uint *)(unaff_x21 + uVar20) = uVar4;
        if ((uVar4 <= uVar3 + 0xffff) && (*(int *)(unaff_x27 + uVar22) == (int)*plVar9)) break;
        plVar6 = (long *)((long)plVar10 + (ulong)uVar11);
        uVar11 = uVar17 >> 6;
        uVar17 = uVar17 + 1;
        plVar9 = plVar10;
        plVar10 = plVar6;
        if (unaff_x24 < plVar6) goto LAB_0009949c;
      }
      piVar18 = (int *)(unaff_x27 + uVar22);
      if ((piVar16 < piVar18) && (*(char *)((long)plVar9 - 1) == *(char *)((long)piVar18 - 1))) {
        piVar5 = (int *)(in_stack_00000010 + uVar22);
        plVar6 = (long *)((long)plVar9 - 1U);
        plVar7 = (long *)((long)plVar9 - 1U);
        do {
          plVar9 = plVar7;
          plVar10 = plVar6;
          piVar18 = piVar5;
          if ((piVar18 <= piVar16) || (plVar10 <= unaff_x22)) break;
          piVar5 = (int *)((long)piVar18 + -1);
          plVar6 = (long *)((long)plVar10 + -1);
          plVar7 = (long *)((long)plVar9 - 1);
        } while (*(char *)((long)plVar10 + -1) == *(char *)((long)piVar18 + -1));
      }
      else {
        plVar10 = plVar9;
      }
      plVar6 = (long *)((long)psVar21 + 1);
      uVar11 = (uint)((long)plVar9 - (long)unaff_x22);
      uVar17 = uVar11 - 0xf;
      if (uVar11 < 0xf) {
        *(char *)psVar21 = (char)(uVar11 << 4);
      }
      else {
        *(char *)psVar21 = -0x10;
        plVar7 = plVar6;
        if (0xfe < uVar17) {
          uVar17 = ((int)plVar9 - (int)unaff_x22) - 0x10e;
          uVar22 = (ulong)uVar17 / 0xff;
          _memset(plVar6,0xff,uVar22 + 1);
          uVar17 = uVar17 + (int)uVar22;
          plVar7 = (long *)((long)psVar21 + uVar22 + 2);
        }
        plVar6 = (long *)((long)plVar7 + 1);
        *(char *)plVar7 = (char)uVar17;
      }
      plVar9 = (long *)((long)plVar6 + ((long)plVar9 - (long)unaff_x22 & 0xffffffffU));
      plVar7 = plVar9;
      if (plVar9 <= plVar6 + 1) {
        plVar7 = plVar6 + 1;
      }
      if ((char *)((long)plVar7 + ~(ulong)plVar6) < &segment_command_00000020.vmaddr) {
        piVar16 = *(int **)(unaff_x29 + -0x58);
      }
      else {
        piVar16 = *(int **)(unaff_x29 + -0x58);
        if (0x3f < (ulong)((long)plVar6 - (long)unaff_x22)) {
          uVar22 = ((long)plVar7 + ~(ulong)plVar6 >> 3) + 1;
          uVar19 = uVar22 & 0x3ffffffffffffff8;
          plVar7 = unaff_x22 + 4;
          plVar15 = plVar6 + 4;
          uVar20 = uVar19;
          do {
            lVar13 = plVar7[-4];
            lVar25 = plVar7[-1];
            lVar24 = plVar7[-2];
            lVar27 = plVar7[1];
            lVar26 = *plVar7;
            lVar29 = plVar7[3];
            lVar28 = plVar7[2];
            plVar15[-3] = plVar7[-3];
            plVar15[-4] = lVar13;
            plVar15[-1] = lVar25;
            plVar15[-2] = lVar24;
            plVar15[1] = lVar27;
            *plVar15 = lVar26;
            plVar15[3] = lVar29;
            plVar15[2] = lVar28;
            uVar20 = uVar20 - 8;
            plVar7 = plVar7 + 8;
            plVar15 = plVar15 + 8;
          } while (uVar20 != 0);
          unaff_x22 = unaff_x22 + uVar19;
          plVar6 = plVar6 + uVar19;
          if (uVar22 == uVar19) goto code_r0x00099228;
        }
      }
      do {
        plVar7 = plVar6 + 1;
        *plVar6 = *unaff_x22;
        unaff_x22 = unaff_x22 + 1;
        plVar6 = plVar7;
      } while (plVar7 < plVar9);
    }
    else {
      plVar9 = (long *)((long)psVar21 + 1);
      *(char *)psVar21 = '\0';
      plVar10 = unaff_x22;
    }
code_r0x00099228:
    psVar8 = (short *)((long)plVar9 + 2);
    *(short *)plVar9 = (short)plVar10 - (short)piVar18;
    puVar1 = (ulong *)((long)plVar10 + 4);
    puVar14 = (ulong *)(piVar18 + 1);
    if (puVar1 < unaff_x28) {
      uVar22 = *puVar1 ^ *puVar14;
      if (uVar22 == 0) {
        puVar14 = (ulong *)(piVar18 + 3);
        puVar12 = (ulong *)((long)plVar10 + 0xc);
        goto code_r0x00099274;
      }
      uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
      uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
      uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
      uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
      uVar11 = (uint)((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3);
      unaff_x22 = (long *)((long)plVar10 + (ulong)(uVar11 + 4));
    }
    else {
      puVar12 = puVar1;
code_r0x00099274:
      for (; puVar12 < unaff_x28; puVar12 = puVar12 + 1) {
        uVar22 = *puVar12 ^ *puVar14;
        if (uVar22 != 0) {
          uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
          uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
          uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          puVar12 = (ulong *)((long)puVar12 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3)
                             );
          goto code_r0x000992a4;
        }
        puVar14 = puVar14 + 1;
      }
      if (puVar12 < in_stack_00000020) {
        if ((int)*puVar14 == (int)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 4);
          puVar14 = (ulong *)((long)puVar14 + 4);
        }
      }
      if (puVar12 < in_stack_00000018) {
        if ((short)*puVar14 == (short)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 2);
          puVar14 = (ulong *)((long)puVar14 + 2);
        }
      }
      if (puVar12 < in_stack_00000028) {
        if ((char)*puVar14 == (char)*puVar12) {
          puVar12 = (ulong *)((long)puVar12 + 1);
        }
      }
code_r0x000992a4:
      unaff_x22 = (long *)((long)plVar10 + ((long)puVar12 - (long)puVar1 & 0xffffffffU) + 4);
      uVar11 = (uint)((long)puVar12 - (long)puVar1);
      uVar17 = uVar11 - 0xf;
      if (0xe < uVar11) break;
    }
    *(char *)psVar21 = (char)*psVar21 + (char)uVar11;
    psVar21 = psVar8;
  } while( true );
  *(char *)psVar21 = (char)*psVar21 + '\x0f';
  psVar8[0] = -1;
  psVar8[1] = -1;
  if (0x3fb < uVar17) goto code_r0x000992d4;
  goto code_r0x00099314;
code_r0x000992d4:
  unaff_x23 = (short *)((long)plVar9 + 6);
  unaff_w19 = uVar11 - 0x40b;
  in_w8 = 0x80808081;
  goto code_r0x000992e4;
}

