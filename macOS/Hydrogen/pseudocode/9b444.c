
int FUN_0009b444(long *param_1,long param_2,long param_3,long param_4,undefined8 param_5,
                ulong param_6)

{
  ulong *puVar1;
  uint uVar2;
  int *piVar3;
  long *plVar5;
  long *plVar4;
  short *psVar6;
  ulong uVar7;
  char *pcVar8;
  int iVar9;
  short *in_x9;
  uint uVar10;
  long lVar11;
  ulong in_x10;
  char cVar12;
  ulong *puVar13;
  long *in_x11;
  uint uVar14;
  ulong uVar15;
  ulong *puVar16;
  long *in_x12;
  long *plVar17;
  int iVar18;
  ulong in_x13;
  long *in_x14;
  ulong in_x15;
  long *plVar19;
  ulong uVar20;
  ulong in_x16;
  long in_x17;
  ulong *unaff_x19;
  long unaff_x22;
  char *pcVar21;
  long *unaff_x23;
  short *unaff_x24;
  int *piVar22;
  int iVar23;
  long unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  int in_stack_00000048;
  int *in_stack_00000050;
  int in_stack_00000058;
  short *in_stack_00000060;
  
  while( true ) {
    uVar7 = param_6 & 0xffffffffffff | 0xcf1b000000000000;
    *(undefined4 *)(unaff_x22 + (in_x17 * uVar7 >> 0x32 & 0x3ffc)) = 0;
    *(undefined4 *)(unaff_x22 + (param_2 * uVar7 >> 0x32 & 0x3ffc)) = 0;
    *(undefined4 *)(unaff_x22 + (param_3 * uVar7 >> 0x32 & 0x3ffc)) = 0;
    *(undefined4 *)(unaff_x22 + (param_4 * uVar7 >> 0x32 & 0x3ffc)) = 0;
    in_x16 = in_x16 - 4;
    if (in_x16 == 0) break;
LAB_0009b42c:
    in_x17 = *(long *)((long)in_x14 + -3);
    param_2 = *(long *)((long)in_x14 + -2);
    param_3 = *(long *)((long)in_x14 + -1);
    param_4 = *in_x14;
    param_6 = 0xbcdcbb000000;
    in_x14 = (long *)((long)in_x14 + 4);
  }
  if (in_x13 == in_x15) goto LAB_0009b4c0;
LAB_0009b4a4:
  do {
    plVar17 = (long *)((long)in_x12 + 1);
    *(undefined4 *)(unaff_x22 + ((ulong)(*in_x12 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
    in_x12 = plVar17;
  } while (plVar17 <= unaff_x23);
LAB_0009b4c0:
  cVar12 = (char)*unaff_x24;
  uVar14 = (uint)in_x10;
  uVar10 = uVar14 - 0xf;
  if (uVar14 < 0xf) goto LAB_0009b354;
LAB_0009b254:
  *(char *)unaff_x24 = cVar12 + '\x0f';
  in_x9[0] = -1;
  in_x9[1] = -1;
  if (0x3fb < uVar10) {
    uVar10 = (int)in_x10 - 0x40b;
    uVar7 = (ulong)(uVar10 / 0x3fc << 2);
    _memset((short *)((long)param_1 + 6),0xff,uVar7 + 4);
    uVar10 = uVar10 % 0x3fc;
    in_x9 = (short *)((long)param_1 + 6 + uVar7);
  }
  uVar14 = (uVar10 & 0xffff) / 0xff;
  pcVar21 = (char *)((long)in_x9 + (ulong)uVar14);
  *pcVar21 = (char)uVar10 + (char)uVar14;
  unaff_x24 = (short *)(pcVar21 + 1);
  do {
    iVar18 = (int)in_x11;
    if (unaff_x28 <= in_x11) goto code_r0x0009b508;
    iVar23 = (int)unaff_x27;
    *(int *)(unaff_x22 +
            ((ulong)(*(long *)((long)in_x11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)in_x11 + -2) - iVar23;
    uVar7 = (ulong)(*in_x11 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
    uVar10 = *(uint *)(unaff_x22 + uVar7);
    *(int *)(unaff_x22 + uVar7) = iVar18 - iVar23;
    if ((uVar10 + 0xffff < (uint)(iVar18 - iVar23)) ||
       (piVar22 = (int *)(unaff_x27 + (ulong)uVar10), *piVar22 != (int)*in_x11)) {
      if (unaff_x28 < (long *)((long)in_x11 + 2U)) goto code_r0x0009b508;
      lVar11 = *(long *)((long)in_x11 + 1U);
      plVar17 = (long *)((long)in_x11 + 2U);
      unaff_x23 = (long *)((long)in_x11 + 1U);
      iVar9 = in_stack_00000048;
      while( true ) {
        plVar19 = plVar17;
        uVar7 = (ulong)(lVar11 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar10 = *(uint *)(unaff_x22 + uVar7);
        uVar20 = (ulong)uVar10;
        uVar14 = (int)unaff_x23 - iVar23;
        lVar11 = *plVar19;
        *(uint *)(unaff_x22 + uVar7) = uVar14;
        if ((uVar14 <= uVar10 + 0xffff) && (*(int *)(unaff_x27 + uVar20) == (int)*unaff_x23)) break;
        plVar17 = (long *)((long)plVar19 + (long)(iVar9 >> 6));
        iVar9 = iVar9 + 1;
        unaff_x23 = plVar19;
        if (unaff_x28 < plVar17) goto code_r0x0009b508;
      }
      piVar22 = (int *)(unaff_x27 + uVar20);
      plVar17 = unaff_x23;
      plVar19 = unaff_x23;
      if ((*(int **)(unaff_x29 + -0x58) < piVar22) &&
         (*(char *)((long)unaff_x23 - 1) == *(char *)((long)piVar22 - 1))) {
        piVar3 = (int *)(in_stack_00000018 + uVar20);
        plVar4 = (long *)((long)unaff_x23 - 1U);
        plVar5 = (long *)((long)unaff_x23 - 1U);
        do {
          plVar17 = plVar5;
          plVar19 = plVar4;
          piVar22 = piVar3;
          if (piVar22 <= *(int **)(unaff_x29 + -0x58)) break;
          if (plVar19 <= in_x11) break;
          piVar3 = (int *)((long)piVar22 + -1);
          plVar4 = (long *)((long)plVar19 + -1);
          plVar5 = (long *)((long)plVar17 - 1);
        } while (*(char *)((long)plVar19 + -1) == *(char *)((long)piVar22 + -1));
      }
      plVar4 = (long *)((long)unaff_x24 + 1);
      uVar10 = (uint)((long)plVar17 - (long)in_x11);
      uVar7 = (long)plVar17 - (long)in_x11 & 0xffffffff;
      if (in_stack_00000060 < (short *)((long)plVar4 + uVar7 + (ulong)(uVar10 + 0xf0) / 0xff + 0xb))
      goto code_r0x0009b508;
      uVar14 = uVar10 - 0xf;
      if (uVar10 < 0xf) {
        *(char *)unaff_x24 = (char)(uVar10 << 4);
      }
      else {
        *(char *)unaff_x24 = -0x10;
        plVar5 = plVar4;
        if (0xfe < uVar14) {
          uVar14 = ((int)plVar17 - iVar18) - 0x10e;
          uVar20 = (ulong)uVar14 / 0xff;
          _memset(plVar4,0xff,uVar20 + 1);
          uVar14 = uVar14 + (int)uVar20;
          plVar5 = (long *)((long)unaff_x24 + uVar20 + 2);
        }
        plVar4 = (long *)((long)plVar5 + 1);
        *(char *)plVar5 = (char)uVar14;
      }
      param_1 = (long *)((long)plVar4 + uVar7);
      plVar17 = param_1;
      if (param_1 <= plVar4 + 1) {
        plVar17 = plVar4 + 1;
      }
      if (((char *)((long)plVar17 + ~(ulong)plVar4) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)plVar4 - (long)in_x11) < 0x40)) {
        plVar17 = in_x11;
code_r0x0009b114:
        do {
          plVar5 = plVar4 + 1;
          *plVar4 = *plVar17;
          plVar17 = plVar17 + 1;
          plVar4 = plVar5;
        } while (plVar5 < param_1);
      }
      else {
        uVar7 = ((long)plVar17 + ~(ulong)plVar4 >> 3) + 1;
        uVar15 = uVar7 & 0x3ffffffffffffff8;
        plVar17 = in_x11 + 4;
        plVar5 = plVar4 + 4;
        uVar20 = uVar15;
        do {
          lVar11 = plVar17[-4];
          lVar25 = plVar17[-1];
          lVar24 = plVar17[-2];
          lVar27 = plVar17[1];
          lVar26 = *plVar17;
          lVar29 = plVar17[3];
          lVar28 = plVar17[2];
          plVar5[-3] = plVar17[-3];
          plVar5[-4] = lVar11;
          plVar5[-1] = lVar25;
          plVar5[-2] = lVar24;
          plVar5[1] = lVar27;
          *plVar5 = lVar26;
          plVar5[3] = lVar29;
          plVar5[2] = lVar28;
          uVar20 = uVar20 - 8;
          plVar17 = plVar17 + 8;
          plVar5 = plVar5 + 8;
        } while (uVar20 != 0);
        plVar17 = in_x11 + uVar15;
        plVar4 = plVar4 + uVar15;
        if (uVar7 != uVar15) goto code_r0x0009b114;
      }
      if (in_stack_00000060 < (short *)((long)param_1 + 0xb)) {
code_r0x0009b508:
        pcVar21 = (char *)(in_stack_00000040 - (long)in_x11);
        if (in_stack_00000060 <
            (short *)((long)unaff_x24 + (long)(pcVar21 + (ulong)(pcVar21 + 0xf0) / 0xff + 1))) {
          pcVar21 = (char *)((long)in_stack_00000060 +
                            (~(ulong)unaff_x24 -
                            ((ulong)((long)in_stack_00000060 + ~(ulong)unaff_x24 + 0xf1) >> 8)));
        }
        pcVar8 = pcVar21 + -0xf;
        iVar23 = (int)pcVar21;
        if (pcVar21 < "") {
          *(char *)unaff_x24 = (char)(iVar23 << 4);
        }
        else {
          psVar6 = (short *)((long)unaff_x24 + 1);
          *(char *)unaff_x24 = -0x10;
          if ("" < pcVar8) {
            uVar7 = (ulong)(pcVar21 + -0x10e) / 0xff;
            _memset(psVar6,0xff,uVar7 + 1);
            pcVar8 = (char *)((ulong)(pcVar21 + -0x10e) % 0xff);
            psVar6 = (short *)((long)unaff_x24 + uVar7 + 2);
          }
          *(char *)psVar6 = (char)pcVar8;
          unaff_x24 = psVar6;
        }
        _memcpy((char *)((long)unaff_x24 + 1),in_x11,pcVar21);
        *in_stack_00000050 = (iVar18 + iVar23) - (int)*(undefined8 *)(unaff_x29 + -0x58);
        return ((int)(char *)((long)unaff_x24 + 1) + iVar23) - in_stack_00000058;
      }
      in_stack_00000038 = (long)unaff_x23 + 1;
    }
    else {
      param_1 = (long *)((long)unaff_x24 + 1);
      *(char *)unaff_x24 = '\0';
      plVar19 = in_x11;
      if (in_stack_00000060 < unaff_x24 + 6) goto code_r0x0009b508;
    }
    in_x9 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)plVar19 - (short)piVar22;
    puVar1 = (ulong *)((long)plVar19 + 4);
    puVar16 = (ulong *)(piVar22 + 1);
    puVar13 = puVar1;
    if (puVar1 < unaff_x19) {
      uVar7 = *puVar1 ^ *puVar16;
      if (uVar7 == 0) {
        puVar16 = (ulong *)(piVar22 + 3);
        puVar13 = (ulong *)((long)plVar19 + 0xc);
        goto joined_r0x0009b318;
      }
      uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
      uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
      uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
      uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
      uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
    }
    else {
joined_r0x0009b318:
      if (puVar13 < unaff_x19) {
        iVar18 = ((int)puVar13 - (int)plVar19) + -4;
        do {
          uVar7 = *puVar13 ^ *puVar16;
          if (uVar7 != 0) {
            uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
            uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
            uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
            uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
            uVar7 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) + iVar18
                                 );
            goto code_r0x0009b220;
          }
          puVar13 = puVar13 + 1;
          puVar16 = puVar16 + 1;
          iVar18 = iVar18 + 8;
        } while (puVar13 < unaff_x19);
      }
      if (puVar13 < in_stack_00000028) {
        if ((int)*puVar16 == (int)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 4);
          puVar16 = (ulong *)((long)puVar16 + 4);
        }
      }
      if (puVar13 < in_stack_00000020) {
        if ((short)*puVar16 == (short)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 2);
          puVar16 = (ulong *)((long)puVar16 + 2);
        }
      }
      if (puVar13 < in_stack_00000030) {
        if ((char)*puVar16 == (char)*puVar13) {
          puVar13 = (ulong *)((long)puVar13 + 1);
        }
      }
      uVar7 = (ulong)(uint)((int)puVar13 - (int)puVar1);
    }
code_r0x0009b220:
    in_x11 = (long *)((long)plVar19 + uVar7 + 4);
    uVar14 = (uint)uVar7;
    if (in_stack_00000060 < (short *)((long)param_1 + (ulong)(uVar14 + 0xf0) / 0xff + 8)) {
      iVar18 = ((int)in_stack_00000060 - (int)in_x9) * 0xff;
      uVar2 = iVar18 - 0x5ec;
      in_x10 = (ulong)uVar2;
      uVar20 = (ulong)(uVar14 - uVar2);
      in_x11 = (long *)((long)in_x11 - uVar20);
      if (in_x11 <= unaff_x23) {
        uVar15 = (((long)plVar19 + uVar7) - uVar20) + 5;
        if (uVar15 <= in_stack_00000038) {
          uVar15 = in_stack_00000038;
        }
        in_x13 = ((uVar15 + uVar20) - ((long)plVar19 + uVar7)) - 4;
        in_x12 = in_x11;
        if (in_x13 < 4) goto LAB_0009b4a4;
        in_x15 = in_x13 & 0xfffffffffffffffc;
        in_x12 = (long *)((long)in_x11 + in_x15);
        in_x14 = (long *)((long)plVar19 + (uVar7 - uVar20) + 7);
        in_x16 = in_x15;
        goto LAB_0009b42c;
      }
      cVar12 = (char)*unaff_x24;
      uVar10 = iVar18 - 0x5fb;
      uVar14 = uVar2;
    }
    else {
      cVar12 = (char)*unaff_x24;
      uVar10 = uVar14 - 0xf;
      in_x10 = uVar7;
    }
    if (0xe < uVar14) goto LAB_0009b254;
LAB_0009b354:
    *(char *)unaff_x24 = cVar12 + (char)uVar14;
    unaff_x24 = in_x9;
  } while( true );
}

