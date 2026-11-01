
int FUN_0009af70(undefined8 param_1,int param_2,uint param_3,undefined4 param_4,int param_5)

{
  ulong *puVar1;
  int *piVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  long *plVar4;
  long *plVar3;
  short *psVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  char *pcVar11;
  int iVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  long lVar16;
  char cVar17;
  ulong in_x11;
  ulong *puVar18;
  ulong *puVar19;
  long *plVar20;
  long *plVar21;
  ulong uVar22;
  long in_x17;
  ulong *unaff_x19;
  ulong uVar23;
  long *unaff_x21;
  long unaff_x22;
  char *pcVar24;
  long *unaff_x23;
  short *unaff_x24;
  int *unaff_x25;
  short *unaff_x26;
  int iVar25;
  long unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  ulong *in_stack_00000028;
  ulong *in_stack_00000030;
  long in_stack_00000040;
  int in_stack_00000048;
  int *in_stack_00000050;
  int in_stack_00000058;
  short *in_stack_00000060;
  
code_r0x0009af70:
  plVar10 = unaff_x23;
  plVar20 = unaff_x23;
  if ((!(!(bool)in_CY || (bool)in_ZR)) &&
     (*(char *)((long)unaff_x23 + -1) == *(char *)((long)unaff_x25 - 1))) {
    piVar2 = (int *)(in_stack_00000018 + in_x11);
    plVar3 = (long *)((long)unaff_x23 + -1);
    plVar4 = (long *)((long)unaff_x23 + -1);
    do {
      plVar10 = plVar4;
      plVar20 = plVar3;
      unaff_x25 = piVar2;
      if (unaff_x25 <= *(int **)(unaff_x29 + -0x58)) break;
      if (plVar20 <= unaff_x21) break;
      piVar2 = (int *)((long)unaff_x25 + -1);
      plVar3 = (long *)((long)plVar20 + -1);
      plVar4 = (long *)((long)plVar10 + -1);
    } while (*(char *)((long)plVar20 + -1) == *(char *)((long)unaff_x25 + -1));
  }
  plVar3 = (long *)((long)unaff_x24 + 1);
  uVar14 = (uint)((long)plVar10 - (long)unaff_x21);
  uVar23 = (long)plVar10 - (long)unaff_x21 & 0xffffffff;
  if ((short *)((long)plVar3 + uVar23 + ((ulong)(uVar14 + 0xf0) * (ulong)param_3 >> 0x27) + 0xb) <=
      unaff_x26) {
    uVar13 = uVar14 - 0xf;
    if (uVar14 < 0xf) {
      *(char *)unaff_x24 = (char)(uVar14 << 4);
    }
    else {
      *(char *)unaff_x24 = -0x10;
      plVar4 = plVar3;
      if (0xfe < uVar13) {
        uVar13 = ((int)plVar10 - (int)unaff_x21) - 0x10e;
        uVar8 = (ulong)uVar13 * (ulong)param_3;
        uVar9 = uVar8 >> 0x27;
        _memset(plVar3,0xff,uVar9 + 1);
        param_5 = 0x8081;
        param_4 = 0xffffffff;
        param_3 = 0x80808081;
        param_2 = 0xffff;
        in_x17 = -0x30e4432345000000;
        uVar13 = uVar13 + (uint)(uVar8 >> 0x27);
        plVar4 = (long *)((long)unaff_x24 + uVar9 + 2);
      }
      plVar3 = (long *)((long)plVar4 + 1);
      *(char *)plVar4 = (char)uVar13;
    }
    plVar10 = (long *)((long)plVar3 + uVar23);
    plVar4 = plVar10;
    if (plVar10 <= plVar3 + 1) {
      plVar4 = plVar3 + 1;
    }
    if (((char *)((long)plVar4 + ~(ulong)plVar3) < &segment_command_00000020.vmaddr) ||
       ((ulong)((long)plVar3 - (long)unaff_x21) < 0x40)) {
      plVar4 = unaff_x21;
code_r0x0009b114:
      do {
        plVar21 = plVar3 + 1;
        *plVar3 = *plVar4;
        plVar4 = plVar4 + 1;
        plVar3 = plVar21;
      } while (plVar21 < plVar10);
    }
    else {
      uVar23 = ((long)plVar4 + ~(ulong)plVar3 >> 3) + 1;
      uVar9 = uVar23 & 0x3ffffffffffffff8;
      plVar4 = unaff_x21 + 4;
      plVar21 = plVar3 + 4;
      uVar8 = uVar9;
      do {
        lVar16 = plVar4[-4];
        lVar7 = plVar4[-1];
        lVar6 = plVar4[-2];
        lVar27 = plVar4[1];
        lVar26 = *plVar4;
        lVar29 = plVar4[3];
        lVar28 = plVar4[2];
        plVar21[-3] = plVar4[-3];
        plVar21[-4] = lVar16;
        plVar21[-1] = lVar7;
        plVar21[-2] = lVar6;
        plVar21[1] = lVar27;
        *plVar21 = lVar26;
        plVar21[3] = lVar29;
        plVar21[2] = lVar28;
        uVar8 = uVar8 - 8;
        plVar4 = plVar4 + 8;
        plVar21 = plVar21 + 8;
      } while (uVar8 != 0);
      plVar4 = unaff_x21 + uVar9;
      plVar3 = plVar3 + uVar9;
      if (uVar23 != uVar9) goto code_r0x0009b114;
    }
    if ((short *)((long)plVar10 + 0xb) <= unaff_x26) {
      psVar5 = unaff_x24;
      do {
        unaff_x24 = (short *)((long)plVar10 + 2);
        *(short *)plVar10 = (short)plVar20 - (short)unaff_x25;
        puVar1 = (ulong *)((long)plVar20 + 4);
        puVar19 = (ulong *)(unaff_x25 + 1);
        puVar18 = puVar1;
        if (puVar1 < unaff_x19) {
          uVar23 = *puVar1 ^ *puVar19;
          if (uVar23 == 0) {
            puVar19 = (ulong *)(unaff_x25 + 3);
            puVar18 = (ulong *)((long)plVar20 + 0xc);
            goto joined_r0x0009b318;
          }
          uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
          uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
          uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
          uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
          uVar23 = (ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3;
        }
        else {
joined_r0x0009b318:
          if (puVar18 < unaff_x19) {
            iVar25 = ((int)puVar18 - (int)plVar20) + -4;
            do {
              uVar23 = *puVar18 ^ *puVar19;
              if (uVar23 != 0) {
                uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
                uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
                uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
                uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
                uVar23 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) +
                                      iVar25);
                goto FUN_0009b220;
              }
              puVar18 = puVar18 + 1;
              puVar19 = puVar19 + 1;
              iVar25 = iVar25 + 8;
            } while (puVar18 < unaff_x19);
          }
          if (puVar18 < in_stack_00000028) {
            if ((int)*puVar19 == (int)*puVar18) {
              puVar18 = (ulong *)((long)puVar18 + 4);
              puVar19 = (ulong *)((long)puVar19 + 4);
            }
          }
          if (puVar18 < in_stack_00000020) {
            if ((short)*puVar19 == (short)*puVar18) {
              puVar18 = (ulong *)((long)puVar18 + 2);
              puVar19 = (ulong *)((long)puVar19 + 2);
            }
          }
          if (puVar18 < in_stack_00000030) {
            if ((char)*puVar19 == (char)*puVar18) {
              puVar18 = (ulong *)((long)puVar18 + 1);
            }
          }
          uVar23 = (ulong)(uint)((int)puVar18 - (int)puVar1);
        }
FUN_0009b220:
        unaff_x21 = (long *)((long)plVar20 + uVar23 + 4);
        uVar14 = (uint)uVar23;
        if (unaff_x26 <
            (short *)((long)plVar10 + ((ulong)(uVar14 + 0xf0) * (ulong)param_3 >> 0x27) + 8)) {
          iVar25 = ((int)unaff_x26 - (int)unaff_x24) * 0xff;
          uVar13 = iVar25 - 0x5ec;
          uVar8 = (ulong)(uVar14 - uVar13);
          unaff_x21 = (long *)((long)unaff_x21 - uVar8);
          if (unaff_x23 < unaff_x21) {
            cVar17 = (char)*psVar5;
          }
          else {
            uVar9 = (((long)plVar20 + uVar23) - uVar8) + 5;
            if (uVar9 <= (long)unaff_x23 + 1U) {
              uVar9 = (long)unaff_x23 + 1U;
            }
            uVar9 = ((uVar9 + uVar8) - ((long)plVar20 + uVar23)) - 4;
            plVar3 = unaff_x21;
            if (uVar9 < 4) {
LAB_0009b4a4:
              do {
                plVar20 = (long *)((long)plVar3 + 1);
                *(undefined4 *)
                 (unaff_x22 + ((ulong)(*plVar3 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                plVar3 = plVar20;
              } while (plVar20 <= unaff_x23);
            }
            else {
              uVar22 = uVar9 & 0xfffffffffffffffc;
              plVar20 = (long *)((long)plVar20 + (uVar23 - uVar8) + 7);
              uVar23 = uVar22;
              do {
                lVar16 = *(long *)((long)plVar20 + -2);
                lVar6 = *(long *)((long)plVar20 + -1);
                lVar7 = *plVar20;
                *(undefined4 *)
                 (unaff_x22 +
                 ((ulong)(*(long *)((long)plVar20 + -3) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
                     0;
                *(undefined4 *)
                 (unaff_x22 + ((ulong)(lVar16 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                *(undefined4 *)(unaff_x22 + ((ulong)(lVar6 * -0x30e4432345000000) >> 0x32 & 0x3ffc))
                     = 0;
                *(undefined4 *)(unaff_x22 + ((ulong)(lVar7 * -0x30e4432345000000) >> 0x32 & 0x3ffc))
                     = 0;
                uVar23 = uVar23 - 4;
                plVar20 = (long *)((long)plVar20 + 4);
              } while (uVar23 != 0);
              plVar3 = (long *)((long)unaff_x21 + uVar22);
              if (uVar9 != uVar22) goto LAB_0009b4a4;
            }
            in_x17 = -0x30e4432345000000;
            param_2 = 0xffff;
            param_3 = 0x80808081;
            param_4 = 0xffffffff;
            param_5 = 0x8081;
            cVar17 = (char)*psVar5;
            unaff_x26 = in_stack_00000060;
          }
          uVar15 = iVar25 - 0x5fb;
          if (uVar13 < 0xf) goto LAB_0009b354;
LAB_0009b254:
          *(char *)psVar5 = cVar17 + '\x0f';
          *(undefined4 *)unaff_x24 = param_4;
          if (0x3fb < uVar15) {
            uVar14 = (uint)((ulong)(uVar13 - 0x40b) * (ulong)param_3 >> 0x29);
            uVar23 = (ulong)(uVar14 << 2);
            _memset((short *)((long)plVar10 + 6),0xff,uVar23 + 4);
            param_5 = 0x8081;
            param_4 = 0xffffffff;
            param_3 = 0x80808081;
            param_2 = 0xffff;
            in_x17 = -0x30e4432345000000;
            uVar15 = (uVar13 - 0x40b) + uVar14 * -0x3fc;
            unaff_x24 = (short *)((long)plVar10 + 6 + uVar23);
            unaff_x26 = in_stack_00000060;
          }
          uVar14 = (uVar15 & 0xffff) * param_5 >> 0x17;
          pcVar24 = (char *)((long)unaff_x24 + (ulong)uVar14);
          unaff_x24 = (short *)(pcVar24 + 1);
          *pcVar24 = (char)uVar15 + (char)uVar14;
        }
        else {
          cVar17 = (char)*psVar5;
          uVar15 = uVar14 - 0xf;
          uVar13 = uVar14;
          if (0xe < uVar14) goto LAB_0009b254;
LAB_0009b354:
          *(char *)psVar5 = cVar17 + (char)uVar13;
        }
        if (unaff_x28 <= unaff_x21) break;
        iVar25 = (int)unaff_x27;
        *(int *)(unaff_x22 + ((ulong)(*(long *)((long)unaff_x21 + -2) * in_x17) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)unaff_x21 + -2) - iVar25;
        uVar13 = (int)unaff_x21 - iVar25;
        uVar23 = (ulong)(*unaff_x21 * in_x17) >> 0x32 & 0x3ffc;
        uVar14 = *(uint *)(unaff_x22 + uVar23);
        *(uint *)(unaff_x22 + uVar23) = uVar13;
        if ((uVar14 + param_2 < uVar13) ||
           (unaff_x25 = (int *)(unaff_x27 + (ulong)uVar14), *unaff_x25 != (int)*unaff_x21))
        goto code_r0x0009b4fc;
        plVar10 = (long *)((long)unaff_x24 + 1);
        *(char *)unaff_x24 = '\0';
        plVar20 = unaff_x21;
        psVar5 = unaff_x24;
        if (unaff_x26 < unaff_x24 + 6) break;
      } while( true );
    }
  }
LAB_0009b508:
  pcVar24 = (char *)(in_stack_00000040 - (long)unaff_x21);
  if (unaff_x26 < (short *)((long)unaff_x24 + (long)(pcVar24 + (ulong)(pcVar24 + 0xf0) / 0xff + 1)))
  {
    pcVar24 = (char *)((long)unaff_x26 +
                      (~(ulong)unaff_x24 -
                      ((ulong)((long)unaff_x26 + ~(ulong)unaff_x24 + 0xf1) >> 8)));
  }
  pcVar11 = pcVar24 + -0xf;
  iVar25 = (int)pcVar24;
  if (pcVar24 < "") {
    *(char *)unaff_x24 = (char)(iVar25 << 4);
  }
  else {
    psVar5 = (short *)((long)unaff_x24 + 1);
    *(char *)unaff_x24 = -0x10;
    if ("" < pcVar11) {
      uVar23 = (ulong)(pcVar24 + -0x10e) / 0xff;
      _memset(psVar5,0xff,uVar23 + 1);
      pcVar11 = (char *)((ulong)(pcVar24 + -0x10e) % 0xff);
      psVar5 = (short *)((long)unaff_x24 + uVar23 + 2);
    }
    *(char *)psVar5 = (char)pcVar11;
    unaff_x24 = psVar5;
  }
  _memcpy((char *)((long)unaff_x24 + 1),unaff_x21,pcVar24);
  *in_stack_00000050 = ((int)unaff_x21 + iVar25) - (int)*(undefined8 *)(unaff_x29 + -0x58);
  return ((int)(char *)((long)unaff_x24 + 1) + iVar25) - in_stack_00000058;
code_r0x0009b4fc:
  if (unaff_x28 < (long *)((long)unaff_x21 + 2U)) goto LAB_0009b508;
  lVar16 = *(long *)((long)unaff_x21 + 1U);
  plVar10 = (long *)((long)unaff_x21 + 2U);
  unaff_x23 = (long *)((long)unaff_x21 + 1U);
  iVar12 = in_stack_00000048;
  while( true ) {
    plVar20 = plVar10;
    uVar23 = (ulong)(lVar16 * in_x17) >> 0x32 & 0x3ffc;
    uVar14 = *(uint *)(unaff_x22 + uVar23);
    in_x11 = (ulong)uVar14;
    uVar13 = (int)unaff_x23 - iVar25;
    lVar16 = *plVar20;
    *(uint *)(unaff_x22 + uVar23) = uVar13;
    if ((uVar13 <= uVar14 + param_2) && (*(int *)(unaff_x27 + in_x11) == (int)*unaff_x23)) break;
    plVar10 = (long *)((long)plVar20 + (long)(iVar12 >> 6));
    iVar12 = iVar12 + 1;
    unaff_x23 = plVar20;
    if (unaff_x28 < plVar10) goto LAB_0009b508;
  }
  unaff_x25 = (int *)(unaff_x27 + in_x11);
  in_CY = *(int **)(unaff_x29 + -0x58) <= unaff_x25;
  in_ZR = unaff_x25 == *(int **)(unaff_x29 + -0x58);
  goto code_r0x0009af70;
}

