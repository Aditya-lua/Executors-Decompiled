
void FUN_001fd750(void)

{
  code *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong *puVar6;
  undefined *puVar7;
  long *plVar8;
  long lVar9;
  long unaff_x19;
  long *unaff_x21;
  long lVar10;
  ulong uVar11;
  long lVar12;
  long unaff_x25;
  ulong *unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  long *in_stack_00000000;
  long in_stack_00000008;
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
  
  if (unaff_x28 == 0) {
    uVar4 = 1;
  }
  else {
    uVar4 = func_0x00187bd0();
    if (uVar4 == 0) {
      func_0x007a1f00(1);
      goto code_r0x001fd974;
    }
  }
  _memcpy(uVar4);
  lVar10 = *unaff_x21;
  lVar5 = *(long *)(lVar10 + 0x2d8);
  if (lVar5 == -0x8000000000000000 || lVar5 == 0) {
    *(ulong *)(lVar10 + 0x2d8) = unaff_x28;
    *(ulong *)(lVar10 + 0x2e0) = uVar4;
    *(ulong *)(lVar10 + 0x2e8) = unaff_x28;
    if (unaff_x28 != 0x8000000000000000) goto code_r0x001fd7fc;
LAB_001fd634:
    if (in_stack_00000008 != 0) {
      uStack0000000000000050 = 0x8000000000000023;
      in_stack_00000140 = 4;
      uStack0000000000000088 = 0x8000000000000001;
      uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
      func_0x00248ae4(lVar10,&uStack0000000000000088,*(char *)(lVar10 + 0x49) == '\x02');
      *(undefined1 *)(lVar10 + 0x335) = 1;
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
      goto code_r0x001fd4a8;
    }
  }
  else {
    func_0x00187bd4(*(undefined8 *)(lVar10 + 0x2e0),lVar5,1);
    *(ulong *)(lVar10 + 0x2d8) = unaff_x28;
    *(ulong *)(lVar10 + 0x2e0) = uVar4;
    *(ulong *)(lVar10 + 0x2e8) = unaff_x28;
    if (unaff_x28 == 0x8000000000000000) goto LAB_001fd634;
code_r0x001fd7fc:
    uStack0000000000000050 = uVar4;
    func_0x001ac08c(&uStack0000000000000090,&uStack0000000000000050,1);
    uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,4);
    lVar5 = in_stack_00000000[2];
    if (lVar5 == *in_stack_00000000) {
      func_0x001d9010(in_stack_00000000,&UNK_009c5d00);
    }
    puVar6 = (ulong *)(in_stack_00000000[1] + lVar5 * 0x28);
    puVar6[1] = uStack0000000000000090;
    *puVar6 = uStack0000000000000088;
    puVar6[3] = in_stack_000000a0;
    puVar6[2] = in_stack_00000098;
    puVar6[4] = in_stack_000000a8;
    in_stack_00000000[2] = lVar5 + 1;
    in_stack_00000058 = unaff_x28;
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000030 << 4,8);
  }
  if ((*(byte *)(lVar10 + 0x339) & 1) == 0) goto LAB_001fcfdc;
  if (*(long *)(lVar10 + 0x2d8) == -0x8000000000000000) {
    uStack0000000000000050 = 0x8000000000000023;
    in_stack_00000140 = 4;
    uStack0000000000000088 = 0x8000000000000001;
    uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x210001);
    func_0x00248ae4(lVar10,&uStack0000000000000088,*(char *)(lVar10 + 0x49) == '\x02');
    *(undefined1 *)(lVar10 + 0x335) = 1;
    in_stack_00000040[1] = in_stack_00000058;
    *in_stack_00000040 = uStack0000000000000050;
    in_stack_00000040[3] = in_stack_00000068;
    in_stack_00000040[2] = in_stack_00000060;
    in_stack_00000040[5] = in_stack_00000078;
    in_stack_00000040[4] = in_stack_00000070;
    in_stack_00000040[6] = in_stack_00000080;
    goto code_r0x001fd4a8;
  }
  if (unaff_x27 != 0) {
    lVar12 = unaff_x27 << 6;
    lVar5 = lVar12;
    puVar6 = unaff_x26;
    do {
      uVar3 = *puVar6;
      uVar4 = uVar3 + 0x7fffffffffffffff;
      if (0x16 < uVar4) {
        uVar4 = 0x13;
      }
      if (((0xe < uVar4) && (5 < uVar4 - 0x10)) && ((uVar4 != 0x16 || ((short)puVar6[4] == 0x23))))
      goto code_r0x001fcebc;
      lVar5 = lVar5 + -0x40;
      puVar6 = puVar6 + 8;
    } while (lVar5 != 0);
    puVar6 = unaff_x26;
    do {
      uVar3 = *puVar6;
      uVar4 = uVar3 + 0x7fffffffffffffff;
      if (0x16 < uVar4) {
        uVar4 = 0x13;
      }
      if (((0xf < uVar4) && (4 < uVar4 - 0x11)) && ((uVar4 != 0x16 || ((short)puVar6[4] == 0x27))))
      goto code_r0x001fcebc;
      lVar12 = lVar12 + -0x40;
      puVar6 = puVar6 + 8;
    } while (lVar12 != 0);
  }
  goto code_r0x001fcf0c;
  while( true ) {
    lVar9 = *plVar8;
    lVar5 = lVar5 + -0x28;
    plVar8 = plVar8 + 5;
    if (lVar9 == 1) break;
code_r0x001fd050:
    if (lVar5 == 0) {
      uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,1);
      lVar5 = in_stack_00000000[2];
      if (lVar5 == *in_stack_00000000) {
        func_0x001d9010(in_stack_00000000,&UNK_009c5d18);
      }
      puVar6 = (ulong *)(in_stack_00000000[1] + lVar5 * 0x28);
      puVar6[1] = uStack0000000000000090;
      *puVar6 = uStack0000000000000088;
      puVar6[3] = in_stack_000000a0;
      puVar6[2] = in_stack_00000098;
      puVar6[4] = in_stack_000000a8;
      in_stack_00000000[2] = lVar5 + 1;
      break;
    }
  }
code_r0x001fd0c4:
  puVar6 = unaff_x26 + 4;
  do {
    uVar4 = puVar6[-4] + 0x7fffffffffffffff;
    if (0x16 < uVar4) {
      uVar4 = 0x13;
    }
    if (((1L << (uVar4 & 0x3f) & 0x3fefffU) == 0) && ((uVar4 != 0x16 || ((short)*puVar6 == 5)))) {
      if ((*in_stack_00000020 != 0) && (*(short *)(lVar10 + 0x328) != 5)) {
        uStack0000000000000088 = CONCAT71(uStack0000000000000088._1_7_,8);
        lVar5 = in_stack_00000000[2];
        if (lVar5 == *in_stack_00000000) {
          func_0x001d9010(in_stack_00000000,&UNK_009c5d30);
        }
        puVar6 = (ulong *)(in_stack_00000000[1] + lVar5 * 0x28);
        puVar6[1] = uStack0000000000000090;
        *puVar6 = uStack0000000000000088;
        puVar6[3] = in_stack_000000a0;
        puVar6[2] = in_stack_00000098;
        puVar6[4] = in_stack_000000a8;
        in_stack_00000000[2] = lVar5 + 1;
      }
      goto code_r0x001fd194;
    }
    puVar6 = puVar6 + 8;
    lVar12 = lVar12 + -0x40;
  } while (lVar12 != 0);
code_r0x001fd190:
  *in_stack_00000020 = 0;
code_r0x001fd194:
  lVar5 = *(long *)(unaff_x19 + 0x80);
  lVar12 = *(long *)(unaff_x19 + 0x88);
  if (unaff_x27 == 0) {
code_r0x001fd270:
    uVar4 = 0;
  }
  else {
    puVar6 = unaff_x26 + 4;
    lVar9 = unaff_x27 << 6;
    do {
      uVar4 = puVar6[-4] + 0x7fffffffffffffff;
      uVar3 = uVar4;
      if (0x16 < uVar4) {
        uVar3 = 0x13;
      }
      if (((1L << (uVar3 & 0x3f) & 0x3fdfffU) == 0) && ((uVar3 != 0x16 || ((short)*puVar6 == 0x13)))
         ) {
        if (uVar4 != 0xd) goto code_r0x001fd270;
        uVar4 = puVar6[-1];
        uVar3 = uVar4 << 1;
        if ((long)(uVar3 | uVar4) < 0) goto code_r0x001fd8f4;
        uVar11 = puVar6[-2];
        in_stack_00000038 = uVar3;
        if (uVar3 == 0) {
          uVar4 = 0;
          lVar9 = 1;
        }
        else {
          lVar9 = func_0x00187bd0(uVar3,1);
          if (lVar9 == 0) goto code_r0x001fd924;
        }
        _memcpy(lVar9,uVar11,uVar3);
        goto code_r0x001fd280;
      }
      puVar6 = puVar6 + 8;
      lVar9 = lVar9 + -0x40;
    } while (lVar9 != 0);
    uVar4 = 0;
  }
code_r0x001fd280:
  uStack0000000000000050 = uVar4;
  uVar2 = (**(code **)(lVar12 + 0x28))
                    (lVar5 + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  func_0x001fdd1c(&uStack0000000000000088,in_stack_00000000,&uStack0000000000000050,uVar2,0x13,
                  lVar10);
  if (uStack0000000000000088 == 0x8000000000000027) {
    lVar5 = *(long *)(unaff_x19 + 0x90);
    lVar12 = *(long *)(unaff_x19 + 0x98);
    if (unaff_x27 == 0) {
code_r0x001fd3c0:
      uVar4 = 0;
    }
    else {
      puVar6 = unaff_x26 + 4;
      lVar9 = unaff_x27 << 6;
      do {
        uVar4 = puVar6[-4] + 0x7fffffffffffffff;
        uVar3 = uVar4;
        if (0x16 < uVar4) {
          uVar3 = 0x13;
        }
        if (((1L << (uVar3 & 0x3f) & 0x3fbfffU) == 0) &&
           ((uVar3 != 0x16 || ((short)*puVar6 == 0x12)))) {
          if (uVar4 != 0xe) goto code_r0x001fd3c0;
          uVar4 = puVar6[-1];
          uVar3 = uVar4 << 1;
          if ((long)(uVar3 | uVar4) < 0) goto code_r0x001fd8f4;
          uVar11 = puVar6[-2];
          if (uVar3 == 0) {
            uVar4 = 0;
            lVar9 = 1;
          }
          else {
            lVar9 = func_0x00187bd0(uVar3,1);
            in_stack_00000038 = uVar3;
            if (lVar9 == 0) goto code_r0x001fd924;
          }
          _memcpy(lVar9,uVar11,uVar3);
          goto code_r0x001fd3cc;
        }
        puVar6 = puVar6 + 8;
        lVar9 = lVar9 + -0x40;
      } while (lVar9 != 0);
      uVar4 = 0;
    }
code_r0x001fd3cc:
    uStack0000000000000050 = uVar4;
    uVar2 = (**(code **)(lVar12 + 0x58))
                      (lVar5 + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    func_0x001fdd1c(&uStack0000000000000088,in_stack_00000000,&uStack0000000000000050,uVar2,0x12,
                    lVar10);
    if (uStack0000000000000088 == 0x8000000000000027) {
      in_stack_00000098 = *in_stack_00000048;
      lVar5 = in_stack_00000048[1];
      uVar4 = in_stack_00000048[2];
      in_stack_000000a0 = lVar5 + uVar4 * 0x28;
      lVar10 = in_stack_00000000[2];
      uStack0000000000000088 = lVar5;
      uStack0000000000000090 = lVar5;
      if ((ulong)(*in_stack_00000000 - lVar10) < uVar4) {
        func_0x0079b61c(in_stack_00000000,lVar10,uVar4,8,0x28);
        lVar10 = in_stack_00000000[2];
      }
      _memcpy(in_stack_00000000[1] + lVar10 * 0x28,lVar5,uVar4 * 0x28);
      in_stack_00000000[2] = lVar10 + uVar4;
      in_stack_000000a0 = lVar5;
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
  goto code_r0x001fd4a8;
code_r0x001fd8f4:
  uVar2 = 0;
  puVar7 = &UNK_009c5968;
  goto code_r0x001fd948;
code_r0x001fd924:
  uVar2 = 1;
  puVar7 = &UNK_009c5968;
code_r0x001fd948:
  func_0x007a1f00(uVar2,in_stack_00000038,puVar7);
code_r0x001fd974:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1fd978);
  (*pcVar1)();
code_r0x001fcebc:
  if ((uVar3 & 0xfffffffffffffffe) == 0x8000000000000010) {
    uVar4 = puVar6[3];
    if ((long)uVar4 < 0) {
      uVar2 = 0;
code_r0x001fd940:
      puVar7 = &UNK_009c2560;
      in_stack_00000038 = uVar4;
      goto code_r0x001fd948;
    }
    uVar3 = puVar6[2];
    if (uVar4 == 0) {
      lVar5 = 1;
    }
    else {
      lVar5 = func_0x00187bd0(uVar4,1);
      if (lVar5 == 0) {
        uVar2 = 1;
        goto code_r0x001fd940;
      }
    }
    _memcpy(lVar5,uVar3,uVar4);
    lVar12 = *(long *)(lVar10 + 0x130);
    if ((lVar12 != -0x8000000000000000) && (lVar12 != 0)) {
      func_0x00187bd4(*(undefined8 *)(lVar10 + 0x138),lVar12,1);
    }
    *(ulong *)(lVar10 + 0x130) = uVar4;
    *(long *)(lVar10 + 0x138) = lVar5;
    *(ulong *)(lVar10 + 0x140) = uVar4;
LAB_001fcfdc:
    if ((unaff_x25 == 0) && (unaff_x27 != 0)) {
      puVar6 = unaff_x26 + 4;
      lVar12 = unaff_x27 << 6;
      lVar5 = lVar12;
      do {
        uVar4 = puVar6[-4] + 0x7fffffffffffffff;
        uVar3 = uVar4;
        if (0x16 < uVar4) {
          uVar3 = 0x13;
        }
        if ((0x11 < uVar3 - 4 && 2 < uVar3) && ((uVar3 != 0x16 || ((short)*puVar6 == 0)))) {
          if (uVar4 == 3) {
            lVar5 = puVar6[-1] * 0x28;
            plVar8 = (long *)puVar6[-2];
            goto code_r0x001fd050;
          }
          break;
        }
        puVar6 = puVar6 + 8;
        lVar5 = lVar5 + -0x40;
      } while (lVar5 != 0);
      goto code_r0x001fd0c4;
    }
    goto code_r0x001fd190;
  }
code_r0x001fcf0c:
  in_stack_00000140 = 4;
  uStack0000000000000088 = 0x8000000000000001;
  uStack0000000000000090 = CONCAT44(uStack0000000000000090._4_4_,0x190001);
  func_0x00248ae4(lVar10,&uStack0000000000000088,*(char *)(lVar10 + 0x49) == '\x02');
  *(undefined1 *)(lVar10 + 0x335) = 1;
  *in_stack_00000040 = 0x800000000000001a;
  *(undefined1 *)(in_stack_00000040 + 1) = 0x21;
code_r0x001fd4a8:
  lVar10 = in_stack_00000048[1];
  lVar5 = in_stack_00000048[2] + 1;
  lVar12 = lVar10;
  while (lVar5 = lVar5 + -1, lVar5 != 0) {
    func_0x0016abd8(lVar12);
    lVar12 = lVar12 + 0x28;
  }
  if (*in_stack_00000048 != 0) {
    func_0x00187bd4(lVar10,*in_stack_00000048 * 0x28,8);
  }
  return;
}

