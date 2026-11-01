
void FUN_001fcf88(ulong param_1,long *param_2,long param_3,long *param_4)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  ulong *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined *puVar9;
  undefined8 *puVar10;
  long lVar11;
  long in_x13;
  ulong in_x14;
  long *plVar12;
  long *plVar13;
  undefined8 uVar14;
  ulong unaff_x23;
  long lVar15;
  long lVar16;
  ulong uVar17;
  long unaff_x25;
  ulong *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long *in_stack_00000020;
  long in_stack_00000030;
  ulong in_stack_00000038;
  long *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  long *in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  undefined2 in_stack_00000140;
  
  if (param_1 < in_x13 + in_x14) {
    lVar5 = 0;
  }
  else {
    uVar8 = 4;
    if ((unaff_x23 & 3) != 0) {
      uVar8 = unaff_x23 & 3;
    }
    lVar5 = unaff_x23 - uVar8;
    puVar10 = (undefined8 *)(unaff_x28 + 0x38);
    puVar7 = (undefined8 *)(in_x13 + 0x20);
    lVar11 = lVar5;
    do {
      uVar14 = puVar10[-5];
      uVar3 = puVar10[-3];
      uVar18 = puVar10[-2];
      uVar19 = *puVar10;
      uVar21 = puVar10[1];
      uVar20 = puVar10[3];
      uVar22 = puVar10[4];
      puVar7[-4] = puVar10[-6];
      puVar7[-3] = uVar14;
      puVar7[-2] = uVar3;
      puVar7[-1] = uVar18;
      *puVar7 = uVar19;
      puVar7[1] = uVar21;
      puVar7[2] = uVar20;
      puVar7[3] = uVar22;
      puVar10 = puVar10 + 0xc;
      puVar7 = puVar7 + 8;
      lVar11 = lVar11 + -4;
    } while (lVar11 != 0);
  }
  lVar11 = unaff_x23 - lVar5;
  puVar10 = (undefined8 *)(in_x13 + lVar5 * 0x10 + 8);
  puVar7 = (undefined8 *)(unaff_x28 + lVar5 * 0x18 + 0x10);
  do {
    uVar3 = *puVar7;
    puVar10[-1] = puVar7[-1];
    *puVar10 = uVar3;
    puVar10 = puVar10 + 2;
    puVar7 = puVar7 + 3;
    lVar11 = lVar11 + -1;
  } while (lVar11 != 0);
  uVar8 = in_x14;
  lVar11 = in_x13;
code_r0x001fd5a4:
  if (uVar8 != 0) goto code_r0x001fd5a8;
  lVar11 = *(long *)(param_3 + 0x20);
  if (lVar11 == 0 || unaff_x23 == 0) {
    lVar5 = -0x8000000000000000;
    lVar15 = *param_4;
    lVar4 = *(long *)(lVar15 + 0x2d8);
    plVar12 = in_stack_00000048;
    if (!(lVar4 == -0x8000000000000000 || lVar4 == 0)) goto code_r0x001fd7d4;
    goto FUN_001fd61c;
  }
  lVar4 = *(long *)(param_3 + 0x18);
  lVar15 = lVar4 + lVar11 * 0x18;
  do {
    uVar3 = *(undefined8 *)(lVar4 + 8);
    lVar5 = *(long *)(lVar4 + 0x10);
    plVar12 = (long *)(in_x13 + 8);
    uVar8 = in_x14;
    do {
      if ((*plVar12 == lVar5) && (iVar2 = _memcmp(plVar12[-1],uVar3,lVar5), iVar2 == 0)) {
        if (lVar5 < 0) {
          uVar14 = 0;
LAB_001fd960:
          func_0x007a1f00(uVar14,lVar5,&UNK_009c24c0);
          goto code_r0x001fd974;
        }
        if (lVar5 == 0) {
          plVar12 = (long *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          uVar14 = 1;
          plVar12 = (long *)func_0x00187bd0(lVar5,1);
          if (plVar12 == (long *)0x0) goto LAB_001fd960;
        }
        _memcpy(plVar12,uVar3,lVar5);
        goto code_r0x001fd7b8;
      }
      plVar12 = plVar12 + 2;
      uVar8 = uVar8 - 0x10;
    } while (uVar8 != 0);
    lVar4 = lVar4 + 0x18;
  } while (lVar4 != lVar15);
  lVar5 = -0x8000000000000000;
  plVar12 = (long *)0x0;
code_r0x001fd7b8:
  lVar15 = *param_4;
  lVar4 = *(long *)(lVar15 + 0x2d8);
  in_stack_00000038 = in_x14;
  if (!(lVar4 != -0x8000000000000000 && lVar4 != 0)) {
FUN_001fd61c:
    *(long *)(lVar15 + 0x2d8) = lVar5;
    *(long **)(lVar15 + 0x2e0) = plVar12;
    *(long *)(lVar15 + 0x2e8) = lVar5;
    if (lVar5 != -0x8000000000000000) goto LAB_001fd7fc;
LAB_001fd634:
    if (lVar11 == 0) goto LAB_001fd87c;
    uStack0000000000000050 = (long *)0x8000000000000023;
    in_stack_00000140 = 4;
    uStack0000000000000088 = -0x7fffffffffffffff;
    uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
    func_0x00248ae4(lVar15,&uStack0000000000000088,*(char *)(lVar15 + 0x49) == '\x02');
    *(undefined1 *)(lVar15 + 0x335) = 1;
    in_stack_00000040[1] = in_stack_00000058;
    *in_stack_00000040 = (long)uStack0000000000000050;
    in_stack_00000040[3] = in_stack_00000068;
    in_stack_00000040[2] = (long)in_stack_00000060;
    in_stack_00000040[5] = in_stack_00000078;
    in_stack_00000040[4] = in_stack_00000070;
    in_stack_00000040[6] = in_stack_00000080;
    if (in_stack_00000030 == 0) goto LAB_001fd4a8;
    goto code_r0x001fd6b8;
  }
code_r0x001fd7d4:
  func_0x00187bd4(*(undefined8 *)(lVar15 + 0x2e0),lVar4,1);
  *(long *)(lVar15 + 0x2d8) = lVar5;
  *(long **)(lVar15 + 0x2e0) = plVar12;
  *(long *)(lVar15 + 0x2e8) = lVar5;
  if (lVar5 == -0x8000000000000000) goto LAB_001fd634;
LAB_001fd7fc:
  uStack0000000000000050 = plVar12;
  in_stack_00000058 = lVar5;
  func_0x001ac08c(&uStack0000000000000090,&uStack0000000000000050,1);
  uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,4);
  lVar11 = param_2[2];
  if (lVar11 == *param_2) {
    func_0x001d9010(param_2,&UNK_009c5d00);
  }
  plVar12 = (long *)(param_2[1] + lVar11 * 0x28);
  plVar12[1] = uStack0000000000000090;
  *plVar12 = uStack0000000000000088;
  plVar12[3] = in_stack_000000a0;
  plVar12[2] = in_stack_00000098;
  plVar12[4] = in_stack_000000a8;
  param_2[2] = lVar11 + 1;
LAB_001fd87c:
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_x13,in_stack_00000030 << 4,8);
  }
  if ((*(byte *)(lVar15 + 0x339) & 1) != 0) {
    if (*(long *)(lVar15 + 0x2d8) == -0x8000000000000000) {
      uStack0000000000000050 = (long *)0x8000000000000023;
      in_stack_00000140 = 4;
      uStack0000000000000088 = -0x7fffffffffffffff;
      uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
      func_0x00248ae4(lVar15,&uStack0000000000000088,*(char *)(lVar15 + 0x49) == '\x02');
      *(undefined1 *)(lVar15 + 0x335) = 1;
      in_stack_00000040[1] = in_stack_00000058;
      *in_stack_00000040 = (long)uStack0000000000000050;
      in_stack_00000040[3] = in_stack_00000068;
      in_stack_00000040[2] = (long)in_stack_00000060;
      in_stack_00000040[5] = in_stack_00000078;
      in_stack_00000040[4] = in_stack_00000070;
      in_stack_00000040[6] = in_stack_00000080;
      goto LAB_001fd4a8;
    }
    if (unaff_x27 != 0) {
      lVar5 = unaff_x27 << 6;
      lVar11 = lVar5;
      puVar6 = unaff_x26;
      do {
        uVar17 = *puVar6;
        uVar8 = uVar17 + 0x7fffffffffffffff;
        if (0x16 < uVar8) {
          uVar8 = 0x13;
        }
        if (((0xe < uVar8) && (5 < uVar8 - 0x10)) && ((uVar8 != 0x16 || ((short)puVar6[4] == 0x23)))
           ) goto code_r0x001fcebc;
        lVar11 = lVar11 + -0x40;
        puVar6 = puVar6 + 8;
      } while (lVar11 != 0);
      puVar6 = unaff_x26;
      while( true ) {
        uVar17 = *puVar6;
        uVar8 = uVar17 + 0x7fffffffffffffff;
        if (0x16 < uVar8) {
          uVar8 = 0x13;
        }
        if (((0xf < uVar8) && (4 < uVar8 - 0x11)) && ((uVar8 != 0x16 || ((short)puVar6[4] == 0x27)))
           ) break;
        lVar5 = lVar5 + -0x40;
        puVar6 = puVar6 + 8;
        if (lVar5 == 0) goto code_r0x001fcf0c;
      }
code_r0x001fcebc:
      if ((uVar17 & 0xfffffffffffffffe) == 0x8000000000000010) {
        uVar8 = puVar6[3];
        if ((long)uVar8 < 0) {
          uVar3 = 0;
code_r0x001fd940:
          puVar9 = &UNK_009c2560;
          in_stack_00000038 = uVar8;
          goto code_r0x001fd948;
        }
        uVar17 = puVar6[2];
        if (uVar8 == 0) {
          lVar11 = 1;
        }
        else {
          lVar11 = func_0x00187bd0(uVar8,1);
          if (lVar11 == 0) {
            uVar3 = 1;
            goto code_r0x001fd940;
          }
        }
        _memcpy(lVar11,uVar17,uVar8);
        lVar5 = *(long *)(lVar15 + 0x130);
        if ((lVar5 != -0x8000000000000000) && (lVar5 != 0)) {
          func_0x00187bd4(*(undefined8 *)(lVar15 + 0x138),lVar5,1);
        }
        *(ulong *)(lVar15 + 0x130) = uVar8;
        *(long *)(lVar15 + 0x138) = lVar11;
        *(ulong *)(lVar15 + 0x140) = uVar8;
        goto LAB_001fcfdc;
      }
    }
code_r0x001fcf0c:
    in_stack_00000140 = 4;
    uStack0000000000000088 = -0x7fffffffffffffff;
    uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x190001);
    func_0x00248ae4(lVar15,&uStack0000000000000088,*(char *)(lVar15 + 0x49) == '\x02');
    *(undefined1 *)(lVar15 + 0x335) = 1;
    *in_stack_00000040 = -0x7fffffffffffffe6;
    *(undefined1 *)(in_stack_00000040 + 1) = 0x21;
    goto LAB_001fd4a8;
  }
LAB_001fcfdc:
  if ((unaff_x25 != 0) || (unaff_x27 == 0)) {
code_r0x001fd190:
    *in_stack_00000020 = 0;
    goto code_r0x001fd194;
  }
  puVar6 = unaff_x26 + 4;
  lVar5 = unaff_x27 << 6;
  lVar11 = lVar5;
  do {
    uVar8 = puVar6[-4] + 0x7fffffffffffffff;
    uVar17 = uVar8;
    if (0x16 < uVar8) {
      uVar17 = 0x13;
    }
    if ((0x11 < uVar17 - 4 && 2 < uVar17) && ((uVar17 != 0x16 || ((short)*puVar6 == 0)))) {
      if (uVar8 == 3) {
        lVar11 = puVar6[-1] * 0x28;
        plVar12 = (long *)puVar6[-2];
        goto code_r0x001fd050;
      }
      break;
    }
    puVar6 = puVar6 + 8;
    lVar11 = lVar11 + -0x40;
  } while (lVar11 != 0);
  goto code_r0x001fd0c4;
code_r0x001fd5a8:
  plVar12 = (long *)(lVar11 + 8);
  lVar11 = lVar11 + 0x10;
  uVar8 = uVar8 - 0x10;
  if (*plVar12 == 0) {
    *in_stack_00000040 = -0x7fffffffffffffe6;
    *(undefined1 *)(in_stack_00000040 + 1) = 0x25;
    if (in_stack_00000030 != 0) {
code_r0x001fd6b8:
      func_0x00187bd4();
    }
LAB_001fd4a8:
    lVar5 = in_stack_00000048[1];
    lVar11 = in_stack_00000048[2] + 1;
    lVar4 = lVar5;
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x0016abd8(lVar4);
      lVar4 = lVar4 + 0x28;
    }
    if (*in_stack_00000048 != 0) {
      func_0x00187bd4(lVar5,*in_stack_00000048 * 0x28,8);
    }
    return;
  }
  goto code_r0x001fd5a4;
  while( true ) {
    lVar4 = *plVar12;
    lVar11 = lVar11 + -0x28;
    plVar12 = plVar12 + 5;
    if (lVar4 == 1) break;
code_r0x001fd050:
    if (lVar11 == 0) {
      uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,1);
      lVar11 = param_2[2];
      if (lVar11 == *param_2) {
        func_0x001d9010(param_2,&UNK_009c5d18);
      }
      plVar12 = (long *)(param_2[1] + lVar11 * 0x28);
      plVar12[1] = uStack0000000000000090;
      *plVar12 = uStack0000000000000088;
      plVar12[3] = in_stack_000000a0;
      plVar12[2] = in_stack_00000098;
      plVar12[4] = in_stack_000000a8;
      param_2[2] = lVar11 + 1;
      break;
    }
  }
code_r0x001fd0c4:
  puVar6 = unaff_x26 + 4;
  while( true ) {
    uVar8 = puVar6[-4] + 0x7fffffffffffffff;
    if (0x16 < uVar8) {
      uVar8 = 0x13;
    }
    if (((1L << (uVar8 & 0x3f) & 0x3fefffU) == 0) && ((uVar8 != 0x16 || ((short)*puVar6 == 5))))
    break;
    puVar6 = puVar6 + 8;
    lVar5 = lVar5 + -0x40;
    if (lVar5 == 0) goto code_r0x001fd190;
  }
  if ((*in_stack_00000020 != 0) && (*(short *)(lVar15 + 0x328) != 5)) {
    uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,8);
    lVar11 = param_2[2];
    if (lVar11 == *param_2) {
      func_0x001d9010(param_2,&UNK_009c5d30);
    }
    plVar12 = (long *)(param_2[1] + lVar11 * 0x28);
    plVar12[1] = uStack0000000000000090;
    *plVar12 = uStack0000000000000088;
    plVar12[3] = in_stack_000000a0;
    plVar12[2] = in_stack_00000098;
    plVar12[4] = in_stack_000000a8;
    param_2[2] = lVar11 + 1;
  }
code_r0x001fd194:
  lVar11 = *(long *)(param_3 + 0x80);
  lVar5 = *(long *)(param_3 + 0x88);
  if (unaff_x27 != 0) {
    puVar6 = unaff_x26 + 4;
    lVar4 = unaff_x27 << 6;
    lVar16 = 1;
    while( true ) {
      uVar8 = puVar6[-4] + 0x7fffffffffffffff;
      uVar17 = uVar8;
      if (0x16 < uVar8) {
        uVar17 = 0x13;
      }
      if (((1L << (uVar17 & 0x3f) & 0x3fdfffU) == 0) &&
         ((uVar17 != 0x16 || ((short)*puVar6 == 0x13)))) break;
      puVar6 = puVar6 + 8;
      lVar4 = lVar4 + -0x40;
      if (lVar4 == 0) {
        plVar12 = (long *)0x0;
        plVar13 = (long *)0x0;
        goto code_r0x001fd280;
      }
    }
    if (uVar8 != 0xd) goto code_r0x001fd270;
    plVar12 = (long *)puVar6[-1];
    uVar8 = (long)plVar12 << 1;
    if (-1 < (long)(uVar8 | (ulong)plVar12)) {
      uVar17 = puVar6[-2];
      in_stack_00000038 = uVar8;
      if (uVar8 == 0) {
        plVar13 = (long *)0x0;
        lVar16 = 1;
code_r0x001fd514:
        _memcpy(lVar16,uVar17,uVar8);
        goto code_r0x001fd280;
      }
      lVar16 = func_0x00187bd0(uVar8,1);
      if (lVar16 != 0) {
        plVar13 = plVar12;
        goto code_r0x001fd514;
      }
code_r0x001fd924:
      uVar3 = 1;
      puVar9 = &UNK_009c5968;
      goto code_r0x001fd948;
    }
code_r0x001fd8f4:
    uVar3 = 0;
    puVar9 = &UNK_009c5968;
code_r0x001fd948:
    func_0x007a1f00(uVar3,in_stack_00000038,puVar9);
code_r0x001fd974:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1fd978);
    (*pcVar1)();
  }
code_r0x001fd270:
  plVar12 = (long *)0x0;
  plVar13 = (long *)0x0;
  lVar16 = 1;
code_r0x001fd280:
  uStack0000000000000050 = plVar13;
  in_stack_00000058 = lVar16;
  in_stack_00000060 = plVar12;
  uVar3 = (**(code **)(lVar5 + 0x28))
                    (lVar11 + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  func_0x001fdd1c(&uStack0000000000000088,param_2,&uStack0000000000000050,uVar3,0x13,lVar15);
  if (uStack0000000000000088 != -0x7fffffffffffffd9) {
    in_stack_00000040[2] = in_stack_00000098;
    in_stack_00000040[1] = uStack0000000000000090;
    in_stack_00000040[4] = in_stack_000000a8;
    in_stack_00000040[3] = in_stack_000000a0;
    in_stack_00000040[6] = in_stack_000000b8;
    in_stack_00000040[5] = in_stack_000000b0;
    *in_stack_00000040 = uStack0000000000000088;
    goto LAB_001fd4a8;
  }
  lVar11 = *(long *)(param_3 + 0x90);
  lVar5 = *(long *)(param_3 + 0x98);
  if (unaff_x27 == 0) {
code_r0x001fd3c0:
    plVar13 = (long *)0x0;
    plVar12 = (long *)0x0;
    lVar16 = 1;
  }
  else {
    puVar6 = unaff_x26 + 4;
    lVar4 = unaff_x27 << 6;
    lVar16 = 1;
    do {
      uVar8 = puVar6[-4] + 0x7fffffffffffffff;
      uVar17 = uVar8;
      if (0x16 < uVar8) {
        uVar17 = 0x13;
      }
      if (((1L << (uVar17 & 0x3f) & 0x3fbfffU) == 0) &&
         ((uVar17 != 0x16 || ((short)*puVar6 == 0x12)))) {
        if (uVar8 != 0xe) goto code_r0x001fd3c0;
        plVar13 = (long *)puVar6[-1];
        uVar8 = (long)plVar13 << 1;
        if ((long)(uVar8 | (ulong)plVar13) < 0) goto code_r0x001fd8f4;
        uVar17 = puVar6[-2];
        if (uVar8 == 0) {
          plVar12 = (long *)0x0;
          lVar16 = 1;
        }
        else {
          lVar16 = func_0x00187bd0(uVar8,1);
          in_stack_00000038 = uVar8;
          if (lVar16 == 0) goto code_r0x001fd924;
          plVar12 = plVar13;
        }
        _memcpy(lVar16,uVar17,uVar8);
        goto code_r0x001fd3cc;
      }
      puVar6 = puVar6 + 8;
      lVar4 = lVar4 + -0x40;
    } while (lVar4 != 0);
    plVar13 = (long *)0x0;
    plVar12 = (long *)0x0;
  }
code_r0x001fd3cc:
  uStack0000000000000050 = plVar12;
  in_stack_00000058 = lVar16;
  in_stack_00000060 = plVar13;
  uVar3 = (**(code **)(lVar5 + 0x58))
                    (lVar11 + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  func_0x001fdd1c(&uStack0000000000000088,param_2,&uStack0000000000000050,uVar3,0x12,lVar15);
  if (uStack0000000000000088 == -0x7fffffffffffffd9) {
    in_stack_00000098 = *in_stack_00000048;
    lVar11 = in_stack_00000048[1];
    uVar8 = in_stack_00000048[2];
    in_stack_000000a0 = lVar11 + uVar8 * 0x28;
    lVar5 = param_2[2];
    uStack0000000000000088 = lVar11;
    uStack0000000000000090 = lVar11;
    if ((ulong)(*param_2 - lVar5) < uVar8) {
      func_0x0079b61c(param_2,lVar5,uVar8,8,0x28);
      lVar5 = param_2[2];
    }
    _memcpy(param_2[1] + lVar5 * 0x28,lVar11,uVar8 * 0x28);
    param_2[2] = lVar5 + uVar8;
    in_stack_000000a0 = lVar11;
    func_0x00219418(&uStack0000000000000088);
    *in_stack_00000040 = -0x7fffffffffffffd9;
    return;
  }
  in_stack_00000040[2] = in_stack_00000098;
  in_stack_00000040[1] = uStack0000000000000090;
  in_stack_00000040[4] = in_stack_000000a8;
  in_stack_00000040[3] = in_stack_000000a0;
  in_stack_00000040[6] = in_stack_000000b8;
  in_stack_00000040[5] = in_stack_000000b0;
  *in_stack_00000040 = uStack0000000000000088;
  goto LAB_001fd4a8;
}

