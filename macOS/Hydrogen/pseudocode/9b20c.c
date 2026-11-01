
int thunk_FUN_0009b220(long *param_1,undefined8 param_2,int param_3,uint param_4,undefined4 param_5,
                      int param_6)

{
  ulong *puVar1;
  int *piVar2;
  long *plVar4;
  long *plVar3;
  short *psVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  char *pcVar10;
  int iVar11;
  uint uVar12;
  short *in_x9;
  uint uVar13;
  uint uVar14;
  long lVar15;
  char cVar16;
  ulong uVar17;
  ulong *puVar18;
  long *plVar19;
  ulong *puVar20;
  ulong in_x12;
  int iVar21;
  ulong uVar22;
  ulong uVar23;
  long in_x17;
  ulong *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  char *pcVar24;
  long *unaff_x23;
  short *unaff_x24;
  int *piVar25;
  short *unaff_x26;
  int iVar26;
  long unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
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
  
FUN_0009b220:
  do {
    uVar22 = in_x12 & 0xffffffff;
    plVar19 = (long *)((long)unaff_x21 + uVar22 + 4);
    uVar13 = (uint)in_x12;
    if (unaff_x26 < (short *)((long)param_1 + ((ulong)(uVar13 + 0xf0) * (ulong)param_4 >> 0x27) + 8)
       ) {
      iVar21 = ((int)unaff_x26 - (int)in_x9) * 0xff;
      uVar12 = iVar21 - 0x5ec;
      uVar17 = (ulong)(uVar13 - uVar12);
      plVar19 = (long *)((long)plVar19 - uVar17);
      if (unaff_x23 < plVar19) {
        cVar16 = (char)*unaff_x24;
      }
      else {
        uVar9 = (((long)unaff_x21 + uVar22) - uVar17) + 5;
        if (uVar9 <= in_stack_00000038) {
          uVar9 = in_stack_00000038;
        }
        uVar9 = ((uVar9 + uVar17) - ((long)unaff_x21 + uVar22)) - 4;
        plVar8 = plVar19;
        if (uVar9 < 4) {
LAB_0009b4a4:
          do {
            plVar3 = (long *)((long)plVar8 + 1);
            *(undefined4 *)(unaff_x22 + ((ulong)(*plVar8 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
                 0;
            plVar8 = plVar3;
          } while (plVar3 <= unaff_x23);
        }
        else {
          uVar23 = uVar9 & 0xfffffffffffffffc;
          plVar8 = (long *)((long)unaff_x21 + (uVar22 - uVar17) + 7);
          uVar22 = uVar23;
          do {
            lVar15 = *(long *)((long)plVar8 + -2);
            lVar6 = *(long *)((long)plVar8 + -1);
            lVar7 = *plVar8;
            *(undefined4 *)
             (unaff_x22 +
             ((ulong)(*(long *)((long)plVar8 + -3) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
            *(undefined4 *)(unaff_x22 + ((ulong)(lVar15 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
                 0;
            *(undefined4 *)(unaff_x22 + ((ulong)(lVar6 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0
            ;
            *(undefined4 *)(unaff_x22 + ((ulong)(lVar7 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0
            ;
            uVar22 = uVar22 - 4;
            plVar8 = (long *)((long)plVar8 + 4);
          } while (uVar22 != 0);
          plVar8 = (long *)((long)plVar19 + uVar23);
          if (uVar9 != uVar23) goto LAB_0009b4a4;
        }
        in_x17 = -0x30e4432345000000;
        param_3 = 0xffff;
        param_4 = 0x80808081;
        param_5 = 0xffffffff;
        param_6 = 0x8081;
        cVar16 = (char)*unaff_x24;
        unaff_x26 = in_stack_00000060;
      }
      uVar14 = iVar21 - 0x5fb;
      if (uVar12 < 0xf) goto LAB_0009b354;
LAB_0009b254:
      *(char *)unaff_x24 = cVar16 + '\x0f';
      *(undefined4 *)in_x9 = param_5;
      if (0x3fb < uVar14) {
        uVar13 = (uint)((ulong)(uVar12 - 0x40b) * (ulong)param_4 >> 0x29);
        uVar22 = (ulong)(uVar13 << 2);
        _memset((short *)((long)param_1 + 6),0xff,uVar22 + 4);
        param_6 = 0x8081;
        param_5 = 0xffffffff;
        param_4 = 0x80808081;
        param_3 = 0xffff;
        in_x17 = -0x30e4432345000000;
        uVar14 = (uVar12 - 0x40b) + uVar13 * -0x3fc;
        in_x9 = (short *)((long)param_1 + 6 + uVar22);
        unaff_x26 = in_stack_00000060;
      }
      uVar13 = (uVar14 & 0xffff) * param_6 >> 0x17;
      pcVar24 = (char *)((long)in_x9 + (ulong)uVar13);
      *pcVar24 = (char)uVar14 + (char)uVar13;
      unaff_x24 = (short *)(pcVar24 + 1);
    }
    else {
      cVar16 = (char)*unaff_x24;
      uVar14 = uVar13 - 0xf;
      uVar12 = uVar13;
      if (0xe < uVar13) goto LAB_0009b254;
LAB_0009b354:
      *(char *)unaff_x24 = cVar16 + (char)uVar12;
      unaff_x24 = in_x9;
    }
    iVar21 = (int)plVar19;
    if (unaff_x28 <= plVar19) goto code_r0x0009b508;
    iVar26 = (int)unaff_x27;
    *(int *)(unaff_x22 + ((ulong)(*(long *)((long)plVar19 + -2) * in_x17) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)plVar19 + -2) - iVar26;
    uVar22 = (ulong)(*plVar19 * in_x17) >> 0x32 & 0x3ffc;
    uVar13 = *(uint *)(unaff_x22 + uVar22);
    *(int *)(unaff_x22 + uVar22) = iVar21 - iVar26;
    if ((uVar13 + param_3 < (uint)(iVar21 - iVar26)) ||
       (piVar25 = (int *)(unaff_x27 + (ulong)uVar13), *piVar25 != (int)*plVar19)) {
      if (unaff_x28 < (long *)((long)plVar19 + 2U)) {
code_r0x0009b508:
        pcVar24 = (char *)(in_stack_00000040 - (long)plVar19);
        if (unaff_x26 <
            (short *)((long)unaff_x24 + (long)(pcVar24 + (ulong)(pcVar24 + 0xf0) / 0xff + 1))) {
          pcVar24 = (char *)((long)unaff_x26 +
                            (~(ulong)unaff_x24 -
                            ((ulong)((long)unaff_x26 + ~(ulong)unaff_x24 + 0xf1) >> 8)));
        }
        pcVar10 = pcVar24 + -0xf;
        iVar26 = (int)pcVar24;
        if (pcVar24 < "") {
          *(char *)unaff_x24 = (char)(iVar26 << 4);
        }
        else {
          psVar5 = (short *)((long)unaff_x24 + 1);
          *(char *)unaff_x24 = -0x10;
          if ("" < pcVar10) {
            uVar22 = (ulong)(pcVar24 + -0x10e) / 0xff;
            _memset(psVar5,0xff,uVar22 + 1);
            pcVar10 = (char *)((ulong)(pcVar24 + -0x10e) % 0xff);
            psVar5 = (short *)((long)unaff_x24 + uVar22 + 2);
          }
          *(char *)psVar5 = (char)pcVar10;
          unaff_x24 = psVar5;
        }
        _memcpy((char *)((long)unaff_x24 + 1),plVar19,pcVar24);
        *in_stack_00000050 = (iVar21 + iVar26) - (int)*(undefined8 *)(unaff_x29 + -0x58);
        return ((int)(char *)((long)unaff_x24 + 1) + iVar26) - in_stack_00000058;
      }
      lVar15 = *(long *)((long)plVar19 + 1U);
      plVar8 = (long *)((long)plVar19 + 2U);
      unaff_x23 = (long *)((long)plVar19 + 1U);
      iVar11 = in_stack_00000048;
      while( true ) {
        plVar3 = plVar8;
        uVar22 = (ulong)(lVar15 * in_x17) >> 0x32 & 0x3ffc;
        uVar13 = *(uint *)(unaff_x22 + uVar22);
        uVar17 = (ulong)uVar13;
        uVar12 = (int)unaff_x23 - iVar26;
        lVar15 = *plVar3;
        *(uint *)(unaff_x22 + uVar22) = uVar12;
        if ((uVar12 <= uVar13 + param_3) && (*(int *)(unaff_x27 + uVar17) == (int)*unaff_x23))
        break;
        plVar8 = (long *)((long)plVar3 + (long)(iVar11 >> 6));
        iVar11 = iVar11 + 1;
        unaff_x23 = plVar3;
        if (unaff_x28 < plVar8) goto code_r0x0009b508;
      }
      piVar25 = (int *)(unaff_x27 + uVar17);
      plVar8 = unaff_x23;
      unaff_x21 = unaff_x23;
      if ((*(int **)(unaff_x29 + -0x58) < piVar25) &&
         (*(char *)((long)unaff_x23 - 1) == *(char *)((long)piVar25 - 1))) {
        piVar2 = (int *)(in_stack_00000018 + uVar17);
        plVar3 = (long *)((long)unaff_x23 - 1U);
        plVar4 = (long *)((long)unaff_x23 - 1U);
        do {
          plVar8 = plVar4;
          unaff_x21 = plVar3;
          piVar25 = piVar2;
          if (piVar25 <= *(int **)(unaff_x29 + -0x58)) break;
          if (unaff_x21 <= plVar19) break;
          piVar2 = (int *)((long)piVar25 + -1);
          plVar3 = (long *)((long)unaff_x21 + -1);
          plVar4 = (long *)((long)plVar8 - 1);
        } while (*(char *)((long)unaff_x21 + -1) == *(char *)((long)piVar25 + -1));
      }
      plVar3 = (long *)((long)unaff_x24 + 1);
      uVar13 = (uint)((long)plVar8 - (long)plVar19);
      uVar22 = (long)plVar8 - (long)plVar19 & 0xffffffff;
      if (unaff_x26 <
          (short *)((long)plVar3 + uVar22 + ((ulong)(uVar13 + 0xf0) * (ulong)param_4 >> 0x27) + 0xb)
         ) goto code_r0x0009b508;
      uVar12 = uVar13 - 0xf;
      if (uVar13 < 0xf) {
        *(char *)unaff_x24 = (char)(uVar13 << 4);
      }
      else {
        *(char *)unaff_x24 = -0x10;
        plVar4 = plVar3;
        if (0xfe < uVar12) {
          uVar12 = ((int)plVar8 - iVar21) - 0x10e;
          uVar17 = (ulong)uVar12 * (ulong)param_4;
          uVar9 = uVar17 >> 0x27;
          _memset(plVar3,0xff,uVar9 + 1);
          param_6 = 0x8081;
          param_5 = 0xffffffff;
          param_4 = 0x80808081;
          param_3 = 0xffff;
          in_x17 = -0x30e4432345000000;
          uVar12 = uVar12 + (uint)(uVar17 >> 0x27);
          plVar4 = (long *)((long)unaff_x24 + uVar9 + 2);
        }
        plVar3 = (long *)((long)plVar4 + 1);
        *(char *)plVar4 = (char)uVar12;
      }
      param_1 = (long *)((long)plVar3 + uVar22);
      plVar8 = param_1;
      if (param_1 <= plVar3 + 1) {
        plVar8 = plVar3 + 1;
      }
      if (((char *)((long)plVar8 + ~(ulong)plVar3) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)plVar3 - (long)plVar19) < 0x40)) {
        plVar8 = plVar19;
code_r0x0009b114:
        do {
          plVar4 = plVar3 + 1;
          *plVar3 = *plVar8;
          plVar8 = plVar8 + 1;
          plVar3 = plVar4;
        } while (plVar4 < param_1);
      }
      else {
        uVar22 = ((long)plVar8 + ~(ulong)plVar3 >> 3) + 1;
        uVar9 = uVar22 & 0x3ffffffffffffff8;
        plVar8 = plVar19 + 4;
        plVar4 = plVar3 + 4;
        uVar17 = uVar9;
        do {
          lVar15 = plVar8[-4];
          lVar7 = plVar8[-1];
          lVar6 = plVar8[-2];
          lVar28 = plVar8[1];
          lVar27 = *plVar8;
          lVar30 = plVar8[3];
          lVar29 = plVar8[2];
          plVar4[-3] = plVar8[-3];
          plVar4[-4] = lVar15;
          plVar4[-1] = lVar7;
          plVar4[-2] = lVar6;
          plVar4[1] = lVar28;
          *plVar4 = lVar27;
          plVar4[3] = lVar30;
          plVar4[2] = lVar29;
          uVar17 = uVar17 - 8;
          plVar8 = plVar8 + 8;
          plVar4 = plVar4 + 8;
        } while (uVar17 != 0);
        plVar8 = plVar19 + uVar9;
        plVar3 = plVar3 + uVar9;
        if (uVar22 != uVar9) goto code_r0x0009b114;
      }
      if (unaff_x26 < (short *)((long)param_1 + 0xb)) goto code_r0x0009b508;
      in_stack_00000038 = (long)unaff_x23 + 1;
    }
    else {
      param_1 = (long *)((long)unaff_x24 + 1);
      *(char *)unaff_x24 = '\0';
      unaff_x21 = plVar19;
      if (unaff_x26 < unaff_x24 + 6) goto code_r0x0009b508;
    }
    in_x9 = (short *)((long)param_1 + 2);
    *(short *)param_1 = (short)unaff_x21 - (short)piVar25;
    puVar1 = (ulong *)((long)unaff_x21 + 4);
    puVar20 = (ulong *)(piVar25 + 1);
    puVar18 = puVar1;
    if (puVar1 < unaff_x19) {
      uVar22 = *puVar1 ^ *puVar20;
      if (uVar22 == 0) {
        puVar20 = (ulong *)(piVar25 + 3);
        puVar18 = (ulong *)((long)unaff_x21 + 0xc);
        goto joined_r0x0009b184;
      }
      uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
      uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
      uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
      uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
      in_x12 = (ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
    }
    else {
joined_r0x0009b184:
      if (puVar18 < unaff_x19) {
        iVar21 = ((int)puVar18 - (int)unaff_x21) + -4;
        do {
          uVar22 = *puVar18 ^ *puVar20;
          if (uVar22 != 0) {
            uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
            uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
            uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
            uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
            in_x12 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) +
                                  iVar21);
            goto FUN_0009b220;
          }
          puVar18 = puVar18 + 1;
          puVar20 = puVar20 + 1;
          iVar21 = iVar21 + 8;
        } while (puVar18 < unaff_x19);
      }
      if (puVar18 < in_stack_00000028) {
        if ((int)*puVar20 == (int)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 4);
          puVar20 = (ulong *)((long)puVar20 + 4);
        }
      }
      if (puVar18 < in_stack_00000020) {
        if ((short)*puVar20 == (short)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 2);
          puVar20 = (ulong *)((long)puVar20 + 2);
        }
      }
      if (puVar18 < in_stack_00000030) {
        if ((char)*puVar20 == (char)*puVar18) {
          puVar18 = (ulong *)((long)puVar18 + 1);
        }
      }
      in_x12 = (ulong)(uint)((int)puVar18 - (int)puVar1);
    }
  } while( true );
}

