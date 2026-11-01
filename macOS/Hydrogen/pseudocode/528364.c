
void FUN_00528364(long *param_1)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  long unaff_x20;
  ulong uVar4;
  long *plVar5;
  long *plVar6;
  undefined8 *puVar7;
  long unaff_x21;
  long lVar8;
  long lVar9;
  long lVar10;
  long unaff_x26;
  long unaff_x27;
  undefined1 unaff_w28;
  long unaff_x29;
  long in_stack_00000030;
  ulong in_stack_00000048;
  long *in_stack_00000060;
  long in_stack_00000068;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  long in_stack_00000118;
  long *in_stack_00000120;
  long in_stack_00000128;
  
  while (lVar8 = *(long *)(unaff_x26 + -0x18), lVar8 != unaff_x27) {
    uVar1 = *(undefined8 *)(unaff_x26 + -0x10);
    uVar4 = *(ulong *)(unaff_x26 + -8);
    lVar10 = param_1[2];
    if ((ulong)(*param_1 - lVar10) < uVar4) {
      func_0x007a5594(param_1,lVar10,uVar4,1,1);
      lVar10 = param_1[2];
    }
    _memcpy(param_1[1] + lVar10,uVar1,uVar4);
    lVar10 = lVar10 + uVar4;
    in_stack_00000060[2] = lVar10;
    if (*in_stack_00000060 == lVar10) {
      func_0x007a5594(in_stack_00000060,lVar10,1,1,1);
      lVar10 = in_stack_00000060[2];
      *(undefined1 *)(in_stack_00000060[1] + lVar10) = unaff_w28;
      in_stack_00000060[2] = lVar10 + 1;
    }
    else {
      *(undefined1 *)(in_stack_00000060[1] + lVar10) = unaff_w28;
      in_stack_00000060[2] = lVar10 + 1;
    }
    if (lVar8 != 0) {
      func_0x00187bd4(uVar1,lVar8,1);
    }
    unaff_x21 = unaff_x26 + 0x18;
    if (unaff_x26 == unaff_x20) {
      unaff_x21 = unaff_x20;
      break;
    }
    param_1 = in_stack_00000060;
    unaff_x26 = unaff_x21;
  }
  *(long *)(unaff_x29 + -0xa8) = unaff_x21;
  if (unaff_x20 - unaff_x21 != 0) {
    uVar4 = (ulong)(unaff_x20 - unaff_x21) / 0x18;
    puVar7 = (undefined8 *)(unaff_x21 + 8);
    do {
      if (puVar7[-1] != 0) {
        func_0x00187bd4(*puVar7,puVar7[-1],1);
      }
      puVar7 = puVar7 + 3;
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
  }
  if (in_stack_00000068 != 0) {
    func_0x00187bd4();
  }
  plVar5 = in_stack_00000120 + in_stack_00000128 * 3;
  *(long **)(unaff_x29 + -0xb0) = in_stack_00000120;
  *(long **)(unaff_x29 + -0xa8) = in_stack_00000120;
  *(long *)(unaff_x29 + -0xa0) = in_stack_00000118;
  *(long **)(unaff_x29 + -0x98) = plVar5;
  plVar3 = in_stack_00000120;
  plVar6 = in_stack_00000120;
  if (in_stack_00000128 != 0) {
    do {
      plVar3 = plVar6 + 3;
      lVar8 = *plVar6;
      if (lVar8 == -0x8000000000000000) goto LAB_005285c4;
      lVar9 = plVar6[1];
      uVar4 = plVar6[2];
      lVar10 = in_stack_00000060[2];
      if ((ulong)(*in_stack_00000060 - lVar10) < uVar4) {
        func_0x007a5594(in_stack_00000060,lVar10,uVar4,1,1);
        lVar10 = in_stack_00000060[2];
      }
      _memcpy(in_stack_00000060[1] + lVar10,lVar9,uVar4);
      lVar10 = lVar10 + uVar4;
      in_stack_00000060[2] = lVar10;
      if (*in_stack_00000060 == lVar10) {
        func_0x007a5594(in_stack_00000060,lVar10,1,1,1);
        lVar10 = in_stack_00000060[2];
        *(undefined1 *)(in_stack_00000060[1] + lVar10) = 0x20;
        in_stack_00000060[2] = lVar10 + 1;
      }
      else {
        *(undefined1 *)(in_stack_00000060[1] + lVar10) = 0x20;
        in_stack_00000060[2] = lVar10 + 1;
      }
      if (lVar8 != 0) {
        func_0x00187bd4(lVar9,lVar8,1);
      }
      plVar6 = plVar3;
    } while (plVar3 != plVar5);
    plVar3 = plVar5;
LAB_005285c4:
    *(long **)(unaff_x29 + -0xa8) = plVar3;
  }
  if ((long)plVar5 - (long)plVar3 != 0) {
    uVar4 = (ulong)((long)plVar5 - (long)plVar3) / 0x18;
    plVar3 = plVar3 + 1;
    do {
      if (plVar3[-1] != 0) {
        func_0x00187bd4(*plVar3,plVar3[-1],1);
      }
      plVar3 = plVar3 + 3;
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
  }
  if (in_stack_00000118 != 0) {
    func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
  }
  plVar3 = *(long **)(unaff_x29 + -0xd0);
  lVar8 = *(long *)(unaff_x29 + -200);
  plVar6 = plVar3 + lVar8 * 3;
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar3;
  *(long **)(unaff_x29 + -0x78) = plVar3;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(long **)(unaff_x29 + -0x68) = plVar6;
  if (lVar8 != 0) {
    lVar8 = lVar8 * 0x18;
    lVar10 = *plVar3;
    while( true ) {
      lVar8 = lVar8 + -0x18;
      plVar3 = plVar3 + 3;
      if (lVar10 != -0x8000000000000000) {
        if (lVar10 == -0x7fffffffffffffff) goto LAB_00528764;
        lVar2 = plVar3[-2];
        uVar4 = plVar3[-1];
        lVar9 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar9) < uVar4) {
          func_0x007a5594(in_stack_00000060,lVar9,uVar4,1,1);
          lVar9 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar9,lVar2,uVar4);
        lVar9 = lVar9 + uVar4;
        in_stack_00000060[2] = lVar9;
        if (*in_stack_00000060 == lVar9) {
          func_0x007a5594(in_stack_00000060,lVar9,1,1,1);
          lVar9 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar9) = 0x20;
          in_stack_00000060[2] = lVar9 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar9) = 0x20;
          in_stack_00000060[2] = lVar9 + 1;
        }
        if (lVar10 != 0) {
          func_0x00187bd4(lVar2,lVar10,1);
        }
      }
      if (lVar8 == 0) break;
      lVar10 = *plVar3;
    }
    plVar3 = plVar6;
  }
LAB_00528764:
  *(long **)(unaff_x29 + -0x78) = plVar3;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar8 = *(long *)(unaff_x29 + -0xe0);
    if (lVar8 != 0) {
      puVar7 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar7[-1] != 0) {
          func_0x00187bd4(*puVar7,puVar7[-1],1);
        }
        puVar7 = puVar7 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      plVar3 = in_stack_00000120 + 1;
      do {
        if (plVar3[-1] != 0) {
          func_0x00187bd4(*plVar3,plVar3[-1],1);
        }
        plVar3 = plVar3 + 3;
        in_stack_00000128 = in_stack_00000128 + -1;
      } while (in_stack_00000128 != 0);
    }
    if (in_stack_00000118 != 0) {
      func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
    }
  }
  if (in_stack_00000100 != 0) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100 << 4,8);
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 << 4,8);
  }
  if (in_stack_00000030 == 0) {
    if (in_stack_000000e0 != 0) {
      puVar7 = (undefined8 *)(in_stack_000000d8 + 8);
      do {
        if (puVar7[-1] != 0) {
          func_0x00187bd4(*puVar7,puVar7[-1] << 3,8);
        }
        puVar7 = puVar7 + 5;
        in_stack_000000e0 = in_stack_000000e0 + -1;
      } while (in_stack_000000e0 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

