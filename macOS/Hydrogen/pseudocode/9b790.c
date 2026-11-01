
int FUN_0009b790(int *param_1,short *param_2,uint param_3,undefined4 param_4,int param_5,
                int *param_6)

{
  ulong *puVar1;
  int iVar2;
  long lVar3;
  short sVar4;
  int *piVar5;
  bool bVar6;
  short *psVar7;
  char *pcVar8;
  ulong uVar9;
  ulong uVar10;
  int iVar11;
  uint in_w9;
  int *piVar12;
  int iVar13;
  uint uVar14;
  uint uVar15;
  char cVar16;
  int iVar17;
  ulong *puVar18;
  uint uVar19;
  ulong uVar20;
  ulong *puVar21;
  int *piVar22;
  short *psVar23;
  ulong uVar24;
  int in_w17;
  long unaff_x19;
  int *unaff_x20;
  int *unaff_x21;
  char *pcVar25;
  long unaff_x22;
  int *unaff_x23;
  int *unaff_x24;
  ulong unaff_x25;
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
  int in_stack_00000040;
  short *in_stack_00000048;
  int *in_stack_00000050;
  int in_stack_00000058;
  long in_stack_00000060;
  
code_r0x0009b790:
  *(char *)unaff_x27 = -0x10;
  psVar7 = param_2;
  if (0xfe < in_w9) {
    uVar14 = ((int)param_1 - (int)param_6) - 0x10e;
    uVar9 = (ulong)uVar14 * (ulong)param_3;
    uVar10 = uVar9 >> 0x27;
    _memset(param_2,0xff,uVar10 + 1);
    param_5 = 0x8081;
    param_4 = 0xffffffff;
    param_3 = 0x80808081;
    in_w17 = -0x61c8864f;
    in_w9 = uVar14 + (uint)(uVar9 >> 0x27);
    psVar7 = (short *)((long)unaff_x27 + uVar10 + 2);
  }
  param_2 = (short *)((long)psVar7 + 1);
  *(char *)psVar7 = (char)in_w9;
LAB_0009b80c:
  psVar7 = (short *)((long)param_2 + unaff_x25);
  psVar23 = psVar7;
  if (psVar7 <= param_2 + 4) {
    psVar23 = param_2 + 4;
  }
  if (((char *)((long)psVar23 + ~(ulong)param_2) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)param_2 - (long)param_6) < 0x40)) {
    piVar12 = param_6;
LAB_0009b888:
    do {
      psVar23 = param_2 + 4;
      *(undefined8 *)param_2 = *(undefined8 *)piVar12;
      piVar12 = piVar12 + 2;
      param_2 = psVar23;
    } while (psVar23 < psVar7);
  }
  else {
    uVar9 = ((long)psVar23 + ~(ulong)param_2 >> 3) + 1;
    uVar20 = uVar9 & 0x3ffffffffffffff8;
    piVar12 = param_6 + 8;
    psVar23 = param_2 + 0x10;
    uVar10 = uVar20;
    do {
      uVar26 = *(undefined8 *)(piVar12 + -8);
      uVar28 = *(undefined8 *)(piVar12 + -2);
      uVar27 = *(undefined8 *)(piVar12 + -4);
      uVar30 = *(undefined8 *)(piVar12 + 2);
      uVar29 = *(undefined8 *)piVar12;
      uVar32 = *(undefined8 *)(piVar12 + 6);
      uVar31 = *(undefined8 *)(piVar12 + 4);
      *(undefined8 *)(psVar23 + -0xc) = *(undefined8 *)(piVar12 + -6);
      *(undefined8 *)(psVar23 + -0x10) = uVar26;
      *(undefined8 *)(psVar23 + -4) = uVar28;
      *(undefined8 *)(psVar23 + -8) = uVar27;
      *(undefined8 *)(psVar23 + 4) = uVar30;
      *(undefined8 *)psVar23 = uVar29;
      *(undefined8 *)(psVar23 + 0xc) = uVar32;
      *(undefined8 *)(psVar23 + 8) = uVar31;
      uVar10 = uVar10 - 8;
      piVar12 = piVar12 + 0x10;
      psVar23 = psVar23 + 0x20;
    } while (uVar10 != 0);
    piVar12 = param_6 + uVar20 * 2;
    param_2 = param_2 + uVar20 * 4;
    if (uVar9 != uVar20) goto LAB_0009b888;
  }
  if ((short *)((long)psVar7 + 0xb) <= unaff_x28) {
    psVar23 = unaff_x27;
    do {
      unaff_x27 = psVar7 + 1;
      *psVar7 = (short)unaff_x23 - (short)unaff_x24;
      puVar1 = (ulong *)(unaff_x23 + 1);
      puVar21 = (ulong *)(unaff_x24 + 1);
      puVar18 = puVar1;
      if (puVar1 < unaff_x26) {
        uVar9 = *puVar1 ^ *puVar21;
        if (uVar9 == 0) {
          puVar21 = (ulong *)(unaff_x24 + 3);
          puVar18 = (ulong *)(unaff_x23 + 3);
          goto joined_r0x0009ba80;
        }
        uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
        uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
        uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
      }
      else {
joined_r0x0009ba80:
        if (puVar18 < unaff_x26) {
          iVar17 = ((int)puVar18 - (int)unaff_x23) + -4;
          do {
            uVar9 = *puVar18 ^ *puVar21;
            if (uVar9 != 0) {
              uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
              uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
              uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
              uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
              uVar9 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) +
                                   iVar17);
              goto LAB_0009b990;
            }
            puVar18 = puVar18 + 1;
            puVar21 = puVar21 + 1;
            iVar17 = iVar17 + 8;
          } while (puVar18 < unaff_x26);
        }
        if (puVar18 < in_stack_00000028) {
          if ((int)*puVar21 == (int)*puVar18) {
            puVar18 = (ulong *)((long)puVar18 + 4);
            puVar21 = (ulong *)((long)puVar21 + 4);
          }
        }
        if (puVar18 < in_stack_00000020) {
          if ((short)*puVar21 == (short)*puVar18) {
            puVar18 = (ulong *)((long)puVar18 + 2);
            puVar21 = (ulong *)((long)puVar21 + 2);
          }
        }
        if (puVar18 < in_stack_00000030) {
          if ((char)*puVar21 == (char)*puVar18) {
            puVar18 = (ulong *)((long)puVar18 + 1);
          }
        }
        uVar9 = (ulong)(uint)((int)puVar18 - (int)puVar1);
      }
LAB_0009b990:
      param_6 = (int *)((long)unaff_x23 + uVar9 + 4);
      uVar14 = (uint)uVar9;
      if (unaff_x28 <
          (short *)((long)psVar7 + ((ulong)(uVar14 + 0xf0) * (ulong)param_3 >> 0x27) + 8)) {
        iVar17 = ((int)unaff_x28 - (int)unaff_x27) * 0xff;
        uVar19 = iVar17 - 0x5ec;
        uVar10 = (ulong)(uVar14 - uVar19);
        param_6 = (int *)((long)param_6 - uVar10);
        if (unaff_x21 < param_6) {
          cVar16 = (char)*psVar23;
        }
        else {
          uVar20 = (((long)unaff_x23 + uVar9) - uVar10) + 5;
          if (uVar20 <= (long)unaff_x21 + 1U) {
            uVar20 = (long)unaff_x21 + 1U;
          }
          uVar20 = ((uVar20 + uVar10) - ((long)unaff_x23 + uVar9)) - 4;
          piVar12 = param_6;
          if (uVar20 < 4) {
code_r0x0009bbdc:
            do {
              piVar22 = (int *)((long)piVar12 + 1);
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(*piVar12 * -0x61c8864f) >> 0x13) * 2) = 0;
              piVar12 = piVar22;
            } while (piVar22 <= unaff_x21);
          }
          else {
            uVar24 = uVar20 & 0xfffffffffffffffc;
            piVar12 = (int *)((long)unaff_x23 + (uVar9 - uVar10) + 7);
            uVar9 = uVar24;
            do {
              iVar13 = *(int *)((long)piVar12 + -2);
              iVar11 = *(int *)((long)piVar12 + -1);
              iVar2 = *piVar12;
              *(undefined2 *)
               (unaff_x22 + (ulong)((uint)(*(int *)((long)piVar12 + -3) * -0x61c8864f) >> 0x13) * 2)
                   = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar13 * -0x61c8864f) >> 0x13) * 2) = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar11 * -0x61c8864f) >> 0x13) * 2) = 0;
              *(undefined2 *)(unaff_x22 + (ulong)((uint)(iVar2 * -0x61c8864f) >> 0x13) * 2) = 0;
              uVar9 = uVar9 - 4;
              piVar12 = piVar12 + 1;
            } while (uVar9 != 0);
            piVar12 = (int *)((long)param_6 + uVar24);
            if (uVar20 != uVar24) goto code_r0x0009bbdc;
          }
          in_w17 = -0x61c8864f;
          param_3 = 0x80808081;
          param_4 = 0xffffffff;
          param_5 = 0x8081;
          cVar16 = (char)*psVar23;
          unaff_x28 = in_stack_00000048;
        }
        uVar15 = iVar17 - 0x5fb;
        if (uVar19 < 0xf) goto LAB_0009babc;
code_r0x0009b9c4:
        *(char *)psVar23 = cVar16 + '\x0f';
        *(undefined4 *)unaff_x27 = param_4;
        if (0x3fb < uVar15) {
          uVar14 = (uint)((ulong)(uVar19 - 0x40b) * (ulong)param_3 >> 0x29);
          uVar9 = (ulong)(uVar14 << 2);
          _memset(psVar7 + 3,0xff,uVar9 + 4);
          param_5 = 0x8081;
          param_4 = 0xffffffff;
          param_3 = 0x80808081;
          in_w17 = -0x61c8864f;
          uVar15 = (uVar19 - 0x40b) + uVar14 * -0x3fc;
          unaff_x27 = (short *)((long)(psVar7 + 3) + uVar9);
          unaff_x28 = in_stack_00000048;
        }
        uVar14 = (uVar15 & 0xffff) * param_5 >> 0x17;
        pcVar25 = (char *)((long)unaff_x27 + (ulong)uVar14);
        unaff_x27 = (short *)(pcVar25 + 1);
        *pcVar25 = (char)uVar15 + (char)uVar14;
      }
      else {
        cVar16 = (char)*psVar23;
        uVar15 = uVar14 - 0xf;
        uVar19 = uVar14;
        if (0xe < uVar14) goto code_r0x0009b9c4;
LAB_0009babc:
        *(char *)psVar23 = cVar16 + (char)uVar19;
      }
      if (unaff_x20 <= param_6) break;
      sVar4 = (short)unaff_x19;
      *(short *)(unaff_x22 + (ulong)((uint)(*(int *)((long)param_6 + -2) * in_w17) >> 0x13) * 2) =
           (short)(int *)((long)param_6 + -2) - sVar4;
      iVar17 = *param_6;
      lVar3 = (ulong)((uint)(iVar17 * in_w17) >> 0x13) * 2;
      unaff_x24 = (int *)(unaff_x19 + (ulong)*(ushort *)(unaff_x22 + lVar3));
      *(short *)(unaff_x22 + lVar3) = (short)param_6 - sVar4;
      if (*unaff_x24 != iVar17) goto code_r0x0009b68c;
      psVar7 = (short *)((long)unaff_x27 + 1);
      *(char *)unaff_x27 = '\0';
      unaff_x23 = param_6;
      psVar23 = unaff_x27;
      if (unaff_x28 < unaff_x27 + 6) break;
    } while( true );
  }
  goto code_r0x0009adb0;
code_r0x0009b68c:
  iVar13 = 1;
  piVar12 = (int *)((long)param_6 + 1U);
  iVar11 = *(int *)((long)param_6 + 1U);
  iVar17 = in_stack_00000040;
  do {
    unaff_x21 = piVar12;
    piVar12 = (int *)((long)unaff_x21 + (long)iVar13);
    if (unaff_x20 < piVar12) goto code_r0x0009adb0;
    iVar13 = iVar17 >> 6;
    iVar17 = iVar17 + 1;
    lVar3 = (ulong)((uint)(iVar11 * in_w17) >> 0x13) * 2;
    uVar9 = (ulong)*(ushort *)(unaff_x22 + lVar3);
    iVar2 = *piVar12;
    *(short *)(unaff_x22 + lVar3) = (short)unaff_x21 - sVar4;
    bVar6 = *(int *)(unaff_x19 + uVar9) != iVar11;
    iVar11 = iVar2;
  } while (bVar6);
  unaff_x24 = (int *)(unaff_x19 + uVar9);
  param_1 = unaff_x21;
  unaff_x23 = unaff_x21;
  if ((*(int **)(unaff_x29 + -0x58) < unaff_x24) &&
     (*(char *)((long)unaff_x21 - 1) == *(char *)((long)unaff_x24 - 1))) {
    piVar12 = (int *)(in_stack_00000018 + uVar9);
    piVar22 = (int *)((long)unaff_x21 - 1U);
    piVar5 = (int *)((long)unaff_x21 - 1U);
    do {
      param_1 = piVar5;
      unaff_x23 = piVar22;
      unaff_x24 = piVar12;
      if (unaff_x24 <= *(int **)(unaff_x29 + -0x58)) break;
      if (unaff_x23 <= param_6) break;
      piVar12 = (int *)((long)unaff_x24 + -1);
      piVar22 = (int *)((long)unaff_x23 + -1);
      piVar5 = (int *)((long)param_1 - 1);
    } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)unaff_x24 + -1));
  }
  param_2 = (short *)((long)unaff_x27 + 1);
  uVar14 = (uint)((long)param_1 - (long)param_6);
  unaff_x25 = (long)param_1 - (long)param_6 & 0xffffffff;
  if (unaff_x28 <
      (short *)((long)param_2 + unaff_x25 + ((ulong)(uVar14 + 0xf0) * (ulong)param_3 >> 0x27) + 0xb)
     ) {
code_r0x0009adb0:
    pcVar25 = (char *)(in_stack_00000060 - (long)param_6);
    if (unaff_x28 <
        (short *)((long)unaff_x27 + (long)(pcVar25 + (ulong)(pcVar25 + 0xf0) / 0xff + 1))) {
      pcVar25 = (char *)((long)unaff_x28 +
                        (~(ulong)unaff_x27 -
                        ((ulong)((long)unaff_x28 + ~(ulong)unaff_x27 + 0xf1) >> 8)));
    }
    pcVar8 = pcVar25 + -0xf;
    iVar17 = (int)pcVar25;
    if (pcVar25 < "") {
      *(char *)unaff_x27 = (char)(iVar17 << 4);
    }
    else {
      psVar7 = (short *)((long)unaff_x27 + 1);
      *(char *)unaff_x27 = -0x10;
      if ("" < pcVar8) {
        uVar9 = (ulong)(pcVar25 + -0x10e) / 0xff;
        _memset(psVar7,0xff,uVar9 + 1);
        pcVar8 = (char *)((ulong)(pcVar25 + -0x10e) % 0xff);
        psVar7 = (short *)((long)unaff_x27 + uVar9 + 2);
      }
      *(char *)psVar7 = (char)pcVar8;
      unaff_x27 = psVar7;
    }
    _memcpy((char *)((long)unaff_x27 + 1),param_6,pcVar25);
    *in_stack_00000050 = ((int)param_6 + iVar17) - (int)*(undefined8 *)(unaff_x29 + -0x58);
    return ((int)(char *)((long)unaff_x27 + 1) + iVar17) - in_stack_00000058;
  }
  in_w9 = uVar14 - 0xf;
  if (0xe < uVar14) goto code_r0x0009b790;
  *(char *)unaff_x27 = (char)(uVar14 << 4);
  goto LAB_0009b80c;
}

