
void FUN_00528448(ulong param_1)

{
  long lVar1;
  bool in_ZR;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  long *plVar5;
  undefined8 *puVar6;
  long unaff_x21;
  long unaff_x22;
  long lVar7;
  long lVar8;
  long lVar9;
  long unaff_x29;
  long in_stack_00000030;
  ulong in_stack_00000048;
  long *in_stack_00000060;
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
  
  if (!in_ZR) {
    param_1 = param_1 / 0x18;
    puVar6 = (undefined8 *)(unaff_x21 + 8);
    do {
      if (puVar6[-1] != 0) {
        func_0x00187bd4(*puVar6,puVar6[-1],1);
      }
      puVar6 = puVar6 + 3;
      param_1 = param_1 - 1;
    } while (param_1 != 0);
  }
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  plVar3 = in_stack_00000120 + in_stack_00000128 * 3;
  *(long **)(unaff_x29 + -0xb0) = in_stack_00000120;
  *(long **)(unaff_x29 + -0xa8) = in_stack_00000120;
  *(long *)(unaff_x29 + -0xa0) = in_stack_00000118;
  *(long **)(unaff_x29 + -0x98) = plVar3;
  plVar2 = in_stack_00000120;
  plVar5 = in_stack_00000120;
  if (in_stack_00000128 != 0) {
    do {
      plVar2 = plVar5 + 3;
      lVar7 = *plVar5;
      if (lVar7 == -0x8000000000000000) goto LAB_005285c4;
      lVar8 = plVar5[1];
      uVar4 = plVar5[2];
      lVar9 = in_stack_00000060[2];
      if ((ulong)(*in_stack_00000060 - lVar9) < uVar4) {
        func_0x007a5594(in_stack_00000060,lVar9,uVar4,1,1);
        lVar9 = in_stack_00000060[2];
      }
      _memcpy(in_stack_00000060[1] + lVar9,lVar8,uVar4);
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
      if (lVar7 != 0) {
        func_0x00187bd4(lVar8,lVar7,1);
      }
      plVar5 = plVar2;
    } while (plVar2 != plVar3);
    plVar2 = plVar3;
LAB_005285c4:
    *(long **)(unaff_x29 + -0xa8) = plVar2;
  }
  if ((long)plVar3 - (long)plVar2 != 0) {
    uVar4 = (ulong)((long)plVar3 - (long)plVar2) / 0x18;
    plVar2 = plVar2 + 1;
    do {
      if (plVar2[-1] != 0) {
        func_0x00187bd4(*plVar2,plVar2[-1],1);
      }
      plVar2 = plVar2 + 3;
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
  }
  if (in_stack_00000118 != 0) {
    func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
  }
  plVar2 = *(long **)(unaff_x29 + -0xd0);
  lVar7 = *(long *)(unaff_x29 + -200);
  plVar5 = plVar2 + lVar7 * 3;
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar2;
  *(long **)(unaff_x29 + -0x78) = plVar2;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(long **)(unaff_x29 + -0x68) = plVar5;
  if (lVar7 != 0) {
    lVar7 = lVar7 * 0x18;
    lVar9 = *plVar2;
    while( true ) {
      lVar7 = lVar7 + -0x18;
      plVar2 = plVar2 + 3;
      if (lVar9 != -0x8000000000000000) {
        if (lVar9 == -0x7fffffffffffffff) goto LAB_00528764;
        lVar1 = plVar2[-2];
        uVar4 = plVar2[-1];
        lVar8 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar8) < uVar4) {
          func_0x007a5594(in_stack_00000060,lVar8,uVar4,1,1);
          lVar8 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar8,lVar1,uVar4);
        lVar8 = lVar8 + uVar4;
        in_stack_00000060[2] = lVar8;
        if (*in_stack_00000060 == lVar8) {
          func_0x007a5594(in_stack_00000060,lVar8,1,1,1);
          lVar8 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar8) = 0x20;
          in_stack_00000060[2] = lVar8 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar8) = 0x20;
          in_stack_00000060[2] = lVar8 + 1;
        }
        if (lVar9 != 0) {
          func_0x00187bd4(lVar1,lVar9,1);
        }
      }
      if (lVar7 == 0) break;
      lVar9 = *plVar2;
    }
    plVar2 = plVar5;
  }
LAB_00528764:
  *(long **)(unaff_x29 + -0x78) = plVar2;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar7 = *(long *)(unaff_x29 + -0xe0);
    if (lVar7 != 0) {
      puVar6 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar6[-1] != 0) {
          func_0x00187bd4(*puVar6,puVar6[-1],1);
        }
        puVar6 = puVar6 + 3;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      plVar2 = in_stack_00000120 + 1;
      do {
        if (plVar2[-1] != 0) {
          func_0x00187bd4(*plVar2,plVar2[-1],1);
        }
        plVar2 = plVar2 + 3;
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
      puVar6 = (undefined8 *)(in_stack_000000d8 + 8);
      do {
        if (puVar6[-1] != 0) {
          func_0x00187bd4(*puVar6,puVar6[-1] << 3,8);
        }
        puVar6 = puVar6 + 5;
        in_stack_000000e0 = in_stack_000000e0 + -1;
      } while (in_stack_000000e0 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

