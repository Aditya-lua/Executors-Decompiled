
int FUN_0009b908(short *param_1,undefined8 param_2,uint param_3,undefined4 param_4,int param_5)

{
  int iVar1;
  long lVar2;
  short sVar3;
  int *piVar4;
  int *piVar5;
  int *piVar6;
  bool bVar7;
  short *psVar8;
  short *psVar9;
  char *pcVar10;
  ulong uVar11;
  ulong uVar12;
  int iVar13;
  uint uVar14;
  short *in_x9;
  int iVar15;
  uint uVar16;
  uint uVar17;
  ulong *in_x10;
  char cVar18;
  int iVar19;
  ulong *in_x11;
  int *piVar20;
  ulong *in_x12;
  int *piVar22;
  int *piVar21;
  int in_w13;
  ulong in_x14;
  ulong uVar23;
  ulong in_x15;
  ulong uVar24;
  int in_w17;
  long unaff_x19;
  int *unaff_x20;
  int *unaff_x21;
  char *pcVar25;
  long unaff_x22;
  int *unaff_x23;
  ulong *unaff_x26;
  short *unaff_x27;
  short *unaff_x28;
  long unaff_x29;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  ulong in_stack_00000038;
  int in_stack_00000040;
  short *in_stack_00000048;
  int *in_stack_00000050;
  int in_stack_00000058;
  long in_stack_00000060;
  
code_r0x0009b908:
  uVar23 = in_x15 ^ in_x14;
  if (uVar23 != 0) {
    uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
    uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
    uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
    uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
    uVar23 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) + in_w13);
    goto LAB_0009b990;
  }
  in_x11 = in_x11 + 1;
  in_x12 = in_x12 + 1;
  in_w13 = in_w13 + 8;
  if (unaff_x26 <= in_x11) {
code_r0x0009b924:
    if (in_x11 < in_stack_00000028) {
      if ((int)*in_x12 == (int)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 4);
        in_x12 = (ulong *)((long)in_x12 + 4);
      }
    }
    if (in_x11 < in_stack_00000020) {
      if ((short)*in_x12 == (short)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 2);
        in_x12 = (ulong *)((long)in_x12 + 2);
      }
    }
    else {
    }
    if (in_x11 < in_stack_00000030) {
      if ((char)*in_x12 == (char)*in_x11) {
        in_x11 = (ulong *)((long)in_x11 + 1);
      }
    }
    uVar23 = (ulong)(uint)((int)in_x11 - (int)in_x10);
LAB_0009b990:
    do {
      piVar20 = (int *)((long)unaff_x23 + uVar23 + 4);
      uVar16 = (uint)uVar23;
      if (unaff_x28 <
          (short *)((long)param_1 + ((ulong)(uVar16 + 0xf0) * (ulong)param_3 >> 0x27) + 8)) {
        iVar19 = ((int)unaff_x28 - (int)in_x9) * 0xff;
        uVar14 = iVar19 - 0x5ec;
        uVar11 = (ulong)(uVar16 - uVar14);
        piVar20 = (int *)((long)piVar20 - uVar11);
        if (unaff_x21 < piVar20) {
          cVar18 = (char)*unaff_x27;
        }
        else {
          uVar12 = (((long)unaff_x23 + uVar23) - uVar11) + 5;
          if (uVar12 <= in_stack_00000038) {
            uVar12 = in_stack_00000038;
          }
          uVar12 = ((uVar12 + uVar11) - ((long)unaff_x23 + uVar23)) - 4;
          piVar22 = piVar20;
          if (uVar12 < 4) {
code_r0x0009bbdc:
            do {
              piVar21 = (int *)((long)piVar22 + 1);
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(*piVar22 * -0x61c8864f) >> 0x13) * 2) = 0;
              piVar22 = piVar21;
            } while (piVar21 <= unaff_x21);
          }
          else {
            uVar24 = uVar12 & 0xfffffffffffffffc;
            piVar22 = (int *)((long)unaff_x23 + (uVar23 - uVar11) + 7);
            uVar23 = uVar24;
            do {
              iVar15 = *(int *)((long)piVar22 + -2);
              iVar13 = *(int *)((long)piVar22 + -1);
              iVar1 = *piVar22;
              *(undefined2 *)
               (unaff_x22 + (ulong)((uint)(*(int *)((long)piVar22 + -3) * -0x61c8864f) >> 0x13) * 2)
                   = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar15 * -0x61c8864f) >> 0x13) * 2) = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar13 * -0x61c8864f) >> 0x13) * 2) = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar1 * -0x61c8864f) >> 0x13) * 2) = 0;
              uVar23 = uVar23 - 4;
              piVar22 = piVar22 + 1;
            } while (uVar23 != 0);
            piVar22 = (int *)((long)piVar20 + uVar24);
            if (uVar12 != uVar24) goto code_r0x0009bbdc;
          }
          in_w17 = -0x61c8864f;
          param_3 = 0x80808081;
          param_4 = 0xffffffff;
          param_5 = 0x8081;
          cVar18 = (char)*unaff_x27;
          unaff_x28 = in_stack_00000048;
        }
        uVar17 = iVar19 - 0x5fb;
        if (uVar14 < 0xf) goto LAB_0009babc;
code_r0x0009b9c4:
        *(char *)unaff_x27 = cVar18 + '\x0f';
        *(undefined4 *)in_x9 = param_4;
        if (0x3fb < uVar17) {
          uVar16 = (uint)((ulong)(uVar14 - 0x40b) * (ulong)param_3 >> 0x29);
          uVar23 = (ulong)(uVar16 << 2);
          _memset(param_1 + 3,0xff,uVar23 + 4);
          param_5 = 0x8081;
          param_4 = 0xffffffff;
          param_3 = 0x80808081;
          in_w17 = -0x61c8864f;
          uVar17 = (uVar14 - 0x40b) + uVar16 * -0x3fc;
          in_x9 = (short *)((long)(param_1 + 3) + uVar23);
          unaff_x28 = in_stack_00000048;
        }
        uVar16 = (uVar17 & 0xffff) * param_5 >> 0x17;
        pcVar25 = (char *)((long)in_x9 + (ulong)uVar16);
        *pcVar25 = (char)uVar17 + (char)uVar16;
        unaff_x27 = (short *)(pcVar25 + 1);
      }
      else {
        cVar18 = (char)*unaff_x27;
        uVar17 = uVar16 - 0xf;
        uVar14 = uVar16;
        if (0xe < uVar16) goto code_r0x0009b9c4;
LAB_0009babc:
        *(char *)unaff_x27 = cVar18 + (char)uVar14;
        unaff_x27 = in_x9;
      }
      if (unaff_x20 <= piVar20) goto code_r0x0009adb0;
      sVar3 = (short)unaff_x19;
      *(short *)(unaff_x22 + (ulong)((uint)(*(int *)((long)piVar20 + -2) * in_w17) >> 0x13) * 2) =
           (short)(int *)((long)piVar20 + -2) - sVar3;
      iVar19 = *piVar20;
      lVar2 = (ulong)((uint)(iVar19 * in_w17) >> 0x13) * 2;
      piVar22 = (int *)(unaff_x19 + (ulong)*(ushort *)(unaff_x22 + lVar2));
      *(short *)(unaff_x22 + lVar2) = (short)piVar20 - sVar3;
      if (*piVar22 == iVar19) {
        param_1 = (short *)((long)unaff_x27 + 1);
        *(char *)unaff_x27 = '\0';
        unaff_x23 = piVar20;
        if (unaff_x28 < unaff_x27 + 6) goto code_r0x0009adb0;
      }
      else {
        iVar15 = 1;
        piVar22 = (int *)((long)piVar20 + 1U);
        iVar13 = *(int *)((long)piVar20 + 1U);
        iVar19 = in_stack_00000040;
        do {
          unaff_x21 = piVar22;
          piVar22 = (int *)((long)unaff_x21 + (long)iVar15);
          if (unaff_x20 < piVar22) goto code_r0x0009adb0;
          iVar15 = iVar19 >> 6;
          iVar19 = iVar19 + 1;
          lVar2 = (ulong)((uint)(iVar13 * in_w17) >> 0x13) * 2;
          uVar23 = (ulong)*(ushort *)(unaff_x22 + lVar2);
          iVar1 = *piVar22;
          *(short *)(unaff_x22 + lVar2) = (short)unaff_x21 - sVar3;
          bVar7 = *(int *)(unaff_x19 + uVar23) != iVar13;
          iVar13 = iVar1;
        } while (bVar7);
        piVar22 = (int *)(unaff_x19 + uVar23);
        piVar21 = unaff_x21;
        unaff_x23 = unaff_x21;
        if ((*(int **)(unaff_x29 + -0x58) < piVar22) &&
           (*(char *)((long)unaff_x21 - 1) == *(char *)((long)piVar22 - 1))) {
          piVar4 = (int *)(in_stack_00000018 + uVar23);
          piVar5 = (int *)((long)unaff_x21 - 1U);
          piVar6 = (int *)((long)unaff_x21 - 1U);
          do {
            piVar21 = piVar6;
            unaff_x23 = piVar5;
            piVar22 = piVar4;
            if (piVar22 <= *(int **)(unaff_x29 + -0x58)) break;
            if (unaff_x23 <= piVar20) break;
            piVar4 = (int *)((long)piVar22 + -1);
            piVar5 = (int *)((long)unaff_x23 + -1);
            piVar6 = (int *)((long)piVar21 - 1);
          } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)piVar22 + -1));
        }
        psVar8 = (short *)((long)unaff_x27 + 1);
        uVar16 = (uint)((long)piVar21 - (long)piVar20);
        uVar23 = (long)piVar21 - (long)piVar20 & 0xffffffff;
        if (unaff_x28 <
            (short *)((long)psVar8 +
                     uVar23 + ((ulong)(uVar16 + 0xf0) * (ulong)param_3 >> 0x27) + 0xb))
        goto code_r0x0009adb0;
        uVar14 = uVar16 - 0xf;
        if (uVar16 < 0xf) {
          *(char *)unaff_x27 = (char)(uVar16 << 4);
        }
        else {
          *(char *)unaff_x27 = -0x10;
          psVar9 = psVar8;
          if (0xfe < uVar14) {
            uVar14 = ((int)piVar21 - (int)piVar20) - 0x10e;
            uVar11 = (ulong)uVar14 * (ulong)param_3;
            uVar12 = uVar11 >> 0x27;
            _memset(psVar8,0xff,uVar12 + 1);
            param_5 = 0x8081;
            param_4 = 0xffffffff;
            param_3 = 0x80808081;
            in_w17 = -0x61c8864f;
            uVar14 = uVar14 + (uint)(uVar11 >> 0x27);
            psVar9 = (short *)((long)unaff_x27 + uVar12 + 2);
          }
          psVar8 = (short *)((long)psVar9 + 1);
          *(char *)psVar9 = (char)uVar14;
        }
        param_1 = (short *)((long)psVar8 + uVar23);
        psVar9 = param_1;
        if (param_1 <= psVar8 + 4) {
          psVar9 = psVar8 + 4;
        }
        if (((char *)((long)psVar9 + ~(ulong)psVar8) < &segment_command_00000020.vmaddr) ||
           ((ulong)((long)psVar8 - (long)piVar20) < 0x40)) {
          piVar21 = piVar20;
code_r0x0009b888:
          do {
            psVar9 = psVar8 + 4;
            *(undefined8 *)psVar8 = *(undefined8 *)piVar21;
            piVar21 = piVar21 + 2;
            psVar8 = psVar9;
          } while (psVar9 < param_1);
        }
        else {
          uVar23 = ((long)psVar9 + ~(ulong)psVar8 >> 3) + 1;
          uVar12 = uVar23 & 0x3ffffffffffffff8;
          piVar21 = piVar20 + 8;
          psVar9 = psVar8 + 0x10;
          uVar11 = uVar12;
          do {
            uVar26 = *(undefined8 *)(piVar21 + -8);
            uVar28 = *(undefined8 *)(piVar21 + -2);
            uVar27 = *(undefined8 *)(piVar21 + -4);
            uVar30 = *(undefined8 *)(piVar21 + 2);
            uVar29 = *(undefined8 *)piVar21;
            uVar32 = *(undefined8 *)(piVar21 + 6);
            uVar31 = *(undefined8 *)(piVar21 + 4);
            *(undefined8 *)(psVar9 + -0xc) = *(undefined8 *)(piVar21 + -6);
            *(undefined8 *)(psVar9 + -0x10) = uVar26;
            *(undefined8 *)(psVar9 + -4) = uVar28;
            *(undefined8 *)(psVar9 + -8) = uVar27;
            *(undefined8 *)(psVar9 + 4) = uVar30;
            *(undefined8 *)psVar9 = uVar29;
            *(undefined8 *)(psVar9 + 0xc) = uVar32;
            *(undefined8 *)(psVar9 + 8) = uVar31;
            uVar11 = uVar11 - 8;
            piVar21 = piVar21 + 0x10;
            psVar9 = psVar9 + 0x20;
          } while (uVar11 != 0);
          piVar21 = piVar20 + uVar12 * 2;
          psVar8 = psVar8 + uVar12 * 4;
          if (uVar23 != uVar12) goto code_r0x0009b888;
        }
        if (unaff_x28 < (short *)((long)param_1 + 0xb)) {
code_r0x0009adb0:
          pcVar25 = (char *)(in_stack_00000060 - (long)piVar20);
          if (unaff_x28 <
              (short *)((long)unaff_x27 + (long)(pcVar25 + (ulong)(pcVar25 + 0xf0) / 0xff + 1))) {
            pcVar25 = (char *)((long)unaff_x28 +
                              (~(ulong)unaff_x27 -
                              ((ulong)((long)unaff_x28 + ~(ulong)unaff_x27 + 0xf1) >> 8)));
          }
          pcVar10 = pcVar25 + -0xf;
          iVar19 = (int)pcVar25;
          if (pcVar25 < "") {
            *(char *)unaff_x27 = (char)(iVar19 << 4);
          }
          else {
            psVar8 = (short *)((long)unaff_x27 + 1);
            *(char *)unaff_x27 = -0x10;
            if ("" < pcVar10) {
              uVar23 = (ulong)(pcVar25 + -0x10e) / 0xff;
              _memset(psVar8,0xff,uVar23 + 1);
              pcVar10 = (char *)((ulong)(pcVar25 + -0x10e) % 0xff);
              psVar8 = (short *)((long)unaff_x27 + uVar23 + 2);
            }
            *(char *)psVar8 = (char)pcVar10;
            unaff_x27 = psVar8;
          }
          _memcpy((char *)((long)unaff_x27 + 1),piVar20,pcVar25);
          *in_stack_00000050 = ((int)piVar20 + iVar19) - (int)*(undefined8 *)(unaff_x29 + -0x58);
          return ((int)(char *)((long)unaff_x27 + 1) + iVar19) - in_stack_00000058;
        }
        in_stack_00000038 = (long)unaff_x21 + 1;
      }
      in_x9 = param_1 + 1;
      *param_1 = (short)unaff_x23 - (short)piVar22;
      in_x10 = (ulong *)(unaff_x23 + 1);
      in_x12 = (ulong *)(piVar22 + 1);
      in_x11 = in_x10;
      if (unaff_x26 <= in_x10) goto joined_r0x0009ba80;
      uVar23 = *in_x10 ^ *in_x12;
      if (uVar23 == 0) goto code_r0x0009b8e8;
      uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
      uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
      uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
      uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
      uVar23 = (ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3;
    } while( true );
  }
  goto LAB_0009b900;
code_r0x0009b8e8:
  in_x12 = (ulong *)(piVar22 + 3);
  in_x11 = (ulong *)(unaff_x23 + 3);
joined_r0x0009ba80:
  if (in_x11 < unaff_x26) goto code_r0x0009b8f8;
  goto code_r0x0009b924;
code_r0x0009b8f8:
  in_w13 = ((int)in_x11 - (int)unaff_x23) + -4;
LAB_0009b900:
  in_x14 = *in_x12;
  in_x15 = *in_x11;
  goto code_r0x0009b908;
}

