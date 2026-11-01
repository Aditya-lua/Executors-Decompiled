
void FUN_001fd61c(long *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong *puVar4;
  undefined *puVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long unaff_x19;
  long unaff_x20;
  ulong uVar9;
  long *unaff_x21;
  long unaff_x23;
  ulong uVar10;
  ulong uVar11;
  ulong unaff_x24;
  long lVar12;
  long unaff_x25;
  ulong *unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000030;
  ulong in_stack_00000038;
  ulong *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  undefined2 in_stack_00000140;
  
  *(ulong *)(unaff_x23 + 0x2d8) = unaff_x28;
  *(ulong *)(unaff_x23 + 0x2e0) = unaff_x24;
  *(ulong *)(unaff_x23 + 0x2e8) = unaff_x28;
  if (unaff_x28 == 0x8000000000000000) {
    if (unaff_x20 != 0) {
      uStack0000000000000050 = 0x8000000000000023;
      in_stack_00000140 = 4;
      uStack0000000000000088 = 0x8000000000000001;
      uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
      func_0x00248ae4();
      *(undefined1 *)(unaff_x23 + 0x335) = 1;
      in_stack_00000040[1] = in_stack_00000058;
      *in_stack_00000040 = uStack0000000000000050;
      in_stack_00000040[3] = in_stack_00000068;
      in_stack_00000040[2] = in_stack_00000060;
      in_stack_00000040[5] = in_stack_00000078;
      in_stack_00000040[4] = in_stack_00000070;
      in_stack_00000040[6] = in_stack_00000080;
      if (in_stack_00000030 != 0) {
        func_0x00187bd4(in_stack_00000018,in_stack_00000030 << 4,8);
      }
      goto LAB_001fd4a8;
    }
  }
  else {
    uStack0000000000000050 = unaff_x24;
    in_stack_00000058 = unaff_x28;
    func_0x001ac08c(&uStack0000000000000090,&uStack0000000000000050,1);
    uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,4);
    lVar8 = unaff_x21[2];
    if (lVar8 == *unaff_x21) {
      func_0x001d9010();
    }
    puVar4 = (ulong *)(unaff_x21[1] + lVar8 * 0x28);
    puVar4[1] = uStack0000000000000090;
    *puVar4 = uStack0000000000000088;
    puVar4[3] = in_stack_000000a0;
    puVar4[2] = in_stack_00000098;
    puVar4[4] = in_stack_000000a8;
    unaff_x21[2] = lVar8 + 1;
    param_1 = unaff_x21;
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000030 << 4,8);
    param_1 = unaff_x21;
  }
  if ((*(byte *)(unaff_x23 + 0x339) & 1) == 0) goto LAB_001fcfdc;
  if (*(long *)(unaff_x23 + 0x2d8) == -0x8000000000000000) {
    uStack0000000000000050 = 0x8000000000000023;
    in_stack_00000140 = 4;
    uStack0000000000000088 = 0x8000000000000001;
    uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
    func_0x00248ae4();
    *(undefined1 *)(unaff_x23 + 0x335) = 1;
    in_stack_00000040[1] = in_stack_00000058;
    *in_stack_00000040 = uStack0000000000000050;
    in_stack_00000040[3] = in_stack_00000068;
    in_stack_00000040[2] = in_stack_00000060;
    in_stack_00000040[5] = in_stack_00000078;
    in_stack_00000040[4] = in_stack_00000070;
    in_stack_00000040[6] = in_stack_00000080;
    goto LAB_001fd4a8;
  }
  if (unaff_x27 != 0) {
    lVar12 = unaff_x27 << 6;
    lVar8 = lVar12;
    puVar4 = unaff_x26;
    do {
      uVar9 = *puVar4;
      uVar10 = uVar9 + 0x7fffffffffffffff;
      if (0x16 < uVar10) {
        uVar10 = 0x13;
      }
      if (((0xe < uVar10) && (5 < uVar10 - 0x10)) &&
         ((uVar10 != 0x16 || ((short)puVar4[4] == 0x23)))) goto code_r0x001fcebc;
      lVar8 = lVar8 + -0x40;
      puVar4 = puVar4 + 8;
    } while (lVar8 != 0);
    puVar4 = unaff_x26;
    do {
      uVar9 = *puVar4;
      uVar10 = uVar9 + 0x7fffffffffffffff;
      if (0x16 < uVar10) {
        uVar10 = 0x13;
      }
      if (((0xf < uVar10) && (4 < uVar10 - 0x11)) &&
         ((uVar10 != 0x16 || ((short)puVar4[4] == 0x27)))) goto code_r0x001fcebc;
      lVar12 = lVar12 + -0x40;
      puVar4 = puVar4 + 8;
    } while (lVar12 != 0);
  }
  goto code_r0x001fcf0c;
  while( true ) {
    lVar7 = *plVar6;
    lVar8 = lVar8 + -0x28;
    plVar6 = plVar6 + 5;
    if (lVar7 == 1) break;
code_r0x001fd050:
    if (lVar8 == 0) {
      uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,1);
      lVar8 = param_1[2];
      if (lVar8 == *param_1) {
        func_0x001d9010();
      }
      puVar4 = (ulong *)(param_1[1] + lVar8 * 0x28);
      puVar4[1] = uStack0000000000000090;
      *puVar4 = uStack0000000000000088;
      puVar4[3] = in_stack_000000a0;
      puVar4[2] = in_stack_00000098;
      puVar4[4] = in_stack_000000a8;
      param_1[2] = lVar8 + 1;
      break;
    }
  }
code_r0x001fd0c4:
  puVar4 = unaff_x26 + 4;
  do {
    uVar10 = puVar4[-4] + 0x7fffffffffffffff;
    if (0x16 < uVar10) {
      uVar10 = 0x13;
    }
    if (((1L << (uVar10 & 0x3f) & 0x3fefffU) == 0) && ((uVar10 != 0x16 || ((short)*puVar4 == 5)))) {
      if ((*in_stack_00000020 != 0) && (*(short *)(unaff_x23 + 0x328) != 5)) {
        uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,8);
        lVar8 = param_1[2];
        if (lVar8 == *param_1) {
          func_0x001d9010();
        }
        puVar4 = (ulong *)(param_1[1] + lVar8 * 0x28);
        puVar4[1] = uStack0000000000000090;
        *puVar4 = uStack0000000000000088;
        puVar4[3] = in_stack_000000a0;
        puVar4[2] = in_stack_00000098;
        puVar4[4] = in_stack_000000a8;
        param_1[2] = lVar8 + 1;
      }
      goto code_r0x001fd194;
    }
    puVar4 = puVar4 + 8;
    lVar12 = lVar12 + -0x40;
  } while (lVar12 != 0);
code_r0x001fd190:
  *in_stack_00000020 = 0;
code_r0x001fd194:
  lVar8 = *(long *)(unaff_x19 + 0x80);
  lVar12 = *(long *)(unaff_x19 + 0x88);
  if (unaff_x27 == 0) {
code_r0x001fd270:
    uVar9 = 0;
    uVar10 = 1;
  }
  else {
    puVar4 = unaff_x26 + 4;
    lVar7 = unaff_x27 << 6;
    uVar10 = 1;
    do {
      uVar9 = puVar4[-4] + 0x7fffffffffffffff;
      uVar3 = uVar9;
      if (0x16 < uVar9) {
        uVar3 = 0x13;
      }
      if (((1L << (uVar3 & 0x3f) & 0x3fdfffU) == 0) && ((uVar3 != 0x16 || ((short)*puVar4 == 0x13)))
         ) {
        if (uVar9 != 0xd) goto code_r0x001fd270;
        uVar9 = puVar4[-1];
        uVar3 = uVar9 << 1;
        if ((long)(uVar3 | uVar9) < 0) goto code_r0x001fd8f4;
        uVar11 = puVar4[-2];
        in_stack_00000038 = uVar3;
        if (uVar3 == 0) {
          uVar9 = 0;
          uVar10 = 1;
        }
        else {
          uVar10 = func_0x00187bd0(uVar3,1);
          if (uVar10 == 0) goto code_r0x001fd924;
        }
        _memcpy(uVar10,uVar11,uVar3);
        goto code_r0x001fd280;
      }
      puVar4 = puVar4 + 8;
      lVar7 = lVar7 + -0x40;
    } while (lVar7 != 0);
    uVar9 = 0;
  }
code_r0x001fd280:
  uStack0000000000000050 = uVar9;
  in_stack_00000058 = uVar10;
  uVar2 = (**(code **)(lVar12 + 0x28))
                    (lVar8 + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  func_0x001fdd1c(&uStack0000000000000088,param_1,&uStack0000000000000050,uVar2,0x13);
  if (uStack0000000000000088 == 0x8000000000000027) {
    lVar8 = *(long *)(unaff_x19 + 0x90);
    lVar12 = *(long *)(unaff_x19 + 0x98);
    if (unaff_x27 == 0) {
code_r0x001fd3c0:
      uVar9 = 0;
      uVar10 = 1;
    }
    else {
      puVar4 = unaff_x26 + 4;
      lVar7 = unaff_x27 << 6;
      uVar10 = 1;
      do {
        uVar9 = puVar4[-4] + 0x7fffffffffffffff;
        uVar3 = uVar9;
        if (0x16 < uVar9) {
          uVar3 = 0x13;
        }
        if (((1L << (uVar3 & 0x3f) & 0x3fbfffU) == 0) &&
           ((uVar3 != 0x16 || ((short)*puVar4 == 0x12)))) {
          if (uVar9 != 0xe) goto code_r0x001fd3c0;
          uVar9 = puVar4[-1];
          uVar3 = uVar9 << 1;
          if ((long)(uVar3 | uVar9) < 0) goto code_r0x001fd8f4;
          uVar11 = puVar4[-2];
          if (uVar3 == 0) {
            uVar9 = 0;
            uVar10 = 1;
          }
          else {
            uVar10 = func_0x00187bd0(uVar3,1);
            in_stack_00000038 = uVar3;
            if (uVar10 == 0) goto code_r0x001fd924;
          }
          _memcpy(uVar10,uVar11,uVar3);
          goto code_r0x001fd3cc;
        }
        puVar4 = puVar4 + 8;
        lVar7 = lVar7 + -0x40;
      } while (lVar7 != 0);
      uVar9 = 0;
    }
code_r0x001fd3cc:
    uStack0000000000000050 = uVar9;
    in_stack_00000058 = uVar10;
    uVar2 = (**(code **)(lVar12 + 0x58))
                      (lVar8 + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    func_0x001fdd1c(&uStack0000000000000088,param_1,&uStack0000000000000050,uVar2,0x12);
    if (uStack0000000000000088 == 0x8000000000000027) {
      in_stack_00000098 = *in_stack_00000048;
      lVar8 = in_stack_00000048[1];
      uVar10 = in_stack_00000048[2];
      in_stack_000000a0 = lVar8 + uVar10 * 0x28;
      lVar12 = param_1[2];
      uStack0000000000000088 = lVar8;
      uStack0000000000000090 = lVar8;
      if ((ulong)(*param_1 - lVar12) < uVar10) {
        func_0x0079b61c(param_1,lVar12,uVar10,8,0x28);
        lVar12 = param_1[2];
      }
      _memcpy(param_1[1] + lVar12 * 0x28,lVar8,uVar10 * 0x28);
      param_1[2] = lVar12 + uVar10;
      in_stack_000000a0 = lVar8;
      func_0x00219418(&uStack0000000000000088);
      *in_stack_00000040 = 0x8000000000000027;
      return;
    }
    in_stack_00000040[2] = in_stack_00000098;
    in_stack_00000040[1] = uStack0000000000000090;
    in_stack_00000040[4] = in_stack_000000a8;
    in_stack_00000040[3] = in_stack_000000a0;
    in_stack_00000040[6] = in_stack_000000b8;
    in_stack_00000040[5] = in_stack_000000b0;
    *in_stack_00000040 = uStack0000000000000088;
  }
  else {
    in_stack_00000040[2] = in_stack_00000098;
    in_stack_00000040[1] = uStack0000000000000090;
    in_stack_00000040[4] = in_stack_000000a8;
    in_stack_00000040[3] = in_stack_000000a0;
    in_stack_00000040[6] = in_stack_000000b8;
    in_stack_00000040[5] = in_stack_000000b0;
    *in_stack_00000040 = uStack0000000000000088;
  }
  goto LAB_001fd4a8;
code_r0x001fd8f4:
  uVar2 = 0;
  puVar5 = &UNK_009c5968;
  goto code_r0x001fd948;
code_r0x001fd924:
  uVar2 = 1;
  puVar5 = &UNK_009c5968;
code_r0x001fd948:
  func_0x007a1f00(uVar2,in_stack_00000038,puVar5);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1fd978);
  (*pcVar1)();
code_r0x001fcebc:
  if ((uVar9 & 0xfffffffffffffffe) == 0x8000000000000010) {
    uVar10 = puVar4[3];
    if ((long)uVar10 < 0) {
      uVar2 = 0;
code_r0x001fd940:
      puVar5 = &UNK_009c2560;
      in_stack_00000038 = uVar10;
      goto code_r0x001fd948;
    }
    uVar9 = puVar4[2];
    if (uVar10 == 0) {
      lVar8 = 1;
    }
    else {
      lVar8 = func_0x00187bd0(uVar10,1);
      if (lVar8 == 0) {
        uVar2 = 1;
        goto code_r0x001fd940;
      }
    }
    _memcpy(lVar8,uVar9,uVar10);
    lVar12 = *(long *)(unaff_x23 + 0x130);
    if ((lVar12 != -0x8000000000000000) && (lVar12 != 0)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x23 + 0x138),lVar12,1);
    }
    *(ulong *)(unaff_x23 + 0x130) = uVar10;
    *(long *)(unaff_x23 + 0x138) = lVar8;
    *(ulong *)(unaff_x23 + 0x140) = uVar10;
LAB_001fcfdc:
    if ((unaff_x25 == 0) && (unaff_x27 != 0)) {
      puVar4 = unaff_x26 + 4;
      lVar12 = unaff_x27 << 6;
      lVar8 = lVar12;
      do {
        uVar10 = puVar4[-4] + 0x7fffffffffffffff;
        uVar9 = uVar10;
        if (0x16 < uVar10) {
          uVar9 = 0x13;
        }
        if ((0x11 < uVar9 - 4 && 2 < uVar9) && ((uVar9 != 0x16 || ((short)*puVar4 == 0)))) {
          if (uVar10 == 3) {
            lVar8 = puVar4[-1] * 0x28;
            plVar6 = (long *)puVar4[-2];
            goto code_r0x001fd050;
          }
          break;
        }
        puVar4 = puVar4 + 8;
        lVar8 = lVar8 + -0x40;
      } while (lVar8 != 0);
      goto code_r0x001fd0c4;
    }
    goto code_r0x001fd190;
  }
code_r0x001fcf0c:
  in_stack_00000140 = 4;
  uStack0000000000000088 = 0x8000000000000001;
  uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x190001);
  func_0x00248ae4();
  *(undefined1 *)(unaff_x23 + 0x335) = 1;
  *in_stack_00000040 = 0x800000000000001a;
  *(undefined1 *)(in_stack_00000040 + 1) = 0x21;
LAB_001fd4a8:
  lVar12 = in_stack_00000048[1];
  lVar8 = in_stack_00000048[2] + 1;
  lVar7 = lVar12;
  while (lVar8 = lVar8 + -1, lVar8 != 0) {
    func_0x0016abd8(lVar7);
    lVar7 = lVar7 + 0x28;
  }
  if (*in_stack_00000048 != 0) {
    func_0x00187bd4(lVar12,*in_stack_00000048 * 0x28,8);
  }
  return;
}

