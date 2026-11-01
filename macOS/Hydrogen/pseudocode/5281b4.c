
void FUN_005281b4(long param_1,long param_2,undefined8 param_3)

{
  long *plVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long unaff_x19;
  undefined *unaff_x20;
  long *plVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined8 unaff_x21;
  long *plVar12;
  long lVar13;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar14;
  ulong unaff_x25;
  long lVar15;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000030;
  undefined8 in_stack_00000040;
  ulong in_stack_00000048;
  long *in_stack_00000060;
  undefined8 uStack00000000000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  undefined1 uStack00000000000000c0;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long *in_stack_00000120;
  long in_stack_00000128;
  
code_r0x005281b4:
  func_0x0050d6e0(param_1,param_2,param_3,1);
  uVar14 = *(undefined8 *)(unaff_x29 + -0xa8);
  uVar5 = *(ulong *)(unaff_x29 + -0xa0);
  if ((ulong)(uStack00000000000000a0 - in_stack_000000b0) < uVar5) {
    func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar5,1,1);
  }
  lVar8 = in_stack_000000b0;
  _memcpy(in_stack_000000a8 + in_stack_000000b0,uVar14,uVar5);
  in_stack_000000b0 = lVar8 + uVar5;
  if (*(long *)(unaff_x29 + -0xb0) != 0) {
    func_0x00187bd4(uVar14,*(long *)(unaff_x29 + -0xb0),1);
  }
  *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
  *(undefined **)(unaff_x29 + -0xb8) = unaff_x20;
  *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea838;
  *(undefined8 *)(unaff_x29 + -0xa8) = 2;
  *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
  *(undefined8 *)(unaff_x29 + -0x88) = 2;
  *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
  *(undefined8 *)(unaff_x29 + -0x98) = unaff_x21;
  func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
  param_2 = unaff_x24;
  do {
    lVar15 = in_stack_000000b0;
    lVar13 = in_stack_000000a8;
    lVar8 = uStack00000000000000a0;
    if (*(ulong *)(unaff_x29 + -200) <= unaff_x25) {
      func_0x007a2570(unaff_x25,*(ulong *)(unaff_x29 + -200),&UNK_009ea858);
LAB_00528948:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x52894c);
      (*pcVar3)();
    }
    plVar12 = (long *)(*(long *)(unaff_x29 + -0xd0) + unaff_x25 * 0x18);
    lVar7 = *plVar12;
    if (lVar7 != unaff_x28 && lVar7 != 0) {
      func_0x00187bd4(plVar12[1],lVar7,1);
    }
    *plVar12 = lVar8;
    plVar12[1] = lVar13;
    plVar12[2] = lVar15;
code_r0x00528288:
    if (((in_stack_00000048 & 0x100000000) == 0) && ((*(uint *)(param_2 + 0x250) >> 8 & 1) != 0)) {
      if (*(ulong *)(unaff_x29 + -200) <= unaff_x25) {
        func_0x007a2570(unaff_x25,*(ulong *)(unaff_x29 + -200),&UNK_009ea870);
        goto LAB_00528948;
      }
      plVar12 = (long *)(*(long *)(unaff_x29 + -0xd0) + unaff_x25 * 0x18);
      lVar8 = *plVar12;
      if (lVar8 != unaff_x28 && lVar8 != 0) {
        func_0x00187bd4(plVar12[1],lVar8,1);
      }
      *plVar12 = unaff_x28;
    }
    while( true ) {
      do {
        param_2 = unaff_x23;
        if (param_2 == unaff_x19) {
          if (in_stack_00000048._4_4_ == 0) goto code_r0x00528628;
          lVar8 = *(long *)(unaff_x29 + -0xf0);
          plVar10 = *(long **)(unaff_x29 + -0xe8);
          plVar9 = plVar10 + *(long *)(unaff_x29 + -0xe0) * 3;
          *(long **)(unaff_x29 + -0xb0) = plVar10;
          *(long **)(unaff_x29 + -0xa8) = plVar10;
          *(long *)(unaff_x29 + -0xa0) = lVar8;
          *(long **)(unaff_x29 + -0x98) = plVar9;
          plVar12 = plVar10;
          plVar1 = plVar10;
          if (*(long *)(unaff_x29 + -0xe0) != 0) goto code_r0x00528360;
          goto code_r0x00528444;
        }
        unaff_x23 = param_2 + 600;
      } while (((*(long *)(param_2 + 0x228) != 0) || (*(int *)(param_2 + 0x248) != 0x110000)) ||
              ((*(byte *)(param_2 + 0x250) >> 2 & 1) != 0));
      if (in_stack_00000110 == 0) break;
      lVar13 = *(long *)(param_2 + 0x220);
      uVar14 = *(undefined8 *)(param_2 + 0x218);
      plVar12 = (long *)(in_stack_00000108 + 8);
      lVar8 = in_stack_00000110 << 4;
      while ((*plVar12 != lVar13 || (iVar4 = _memcmp(plVar12[-1],uVar14,lVar13), iVar4 != 0))) {
        plVar12 = plVar12 + 2;
        lVar8 = lVar8 + -0x10;
        if (lVar8 == 0) goto code_r0x00527fbc;
      }
    }
code_r0x00527fbc:
    if (*(int *)(param_2 + 0x28) != 1) {
      func_0x007a23bc(&UNK_009ea778);
      goto LAB_00528948;
    }
    unaff_x25 = *(ulong *)(param_2 + 0x30);
    uVar5 = *(ulong *)(unaff_x29 + -200);
    unaff_x20 = &DAT_00524310;
    if (uVar5 < unaff_x25 + 1) {
      *(long *)(unaff_x29 + -0xb0) = unaff_x28;
      func_0x004e0e50(unaff_x29 + -0xd8,unaff_x25 + 1,unaff_x29 + -0xb0,&UNK_009ea790);
      uVar5 = *(ulong *)(unaff_x29 + -200);
    }
    if (uVar5 <= unaff_x25) {
      func_0x007a2570(unaff_x25,uVar5,&UNK_009ea7a8);
      goto LAB_00528948;
    }
    plVar12 = (long *)(*(long *)(unaff_x29 + -0xd0) + unaff_x25 * 0x18);
    lVar8 = *plVar12;
    if (lVar8 != unaff_x28) {
      if ((*(byte *)(param_2 + 0x251) & 1) != 0) {
        lVar13 = plVar12[1];
        uVar5 = plVar12[2];
        *plVar12 = -0x8000000000000000;
        uStack00000000000000a0 = 0;
        in_stack_000000a8 = 1;
        in_stack_000000b0 = 0;
        *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
        *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
        *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea7c0;
        *(undefined8 *)(unaff_x29 + -0xa8) = 3;
        *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
        *(undefined8 *)(unaff_x29 + -0x88) = 2;
        *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
        *(undefined8 *)(unaff_x29 + -0x98) = 1;
        func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
        if ((ulong)(uStack00000000000000a0 - in_stack_000000b0) < uVar5) {
          func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar5,1,1);
        }
        lVar15 = in_stack_000000b0;
        _memcpy(in_stack_000000a8 + in_stack_000000b0,lVar13,uVar5);
        lVar2 = in_stack_000000a8;
        lVar7 = uStack00000000000000a0;
        lVar15 = lVar15 + uVar5;
        in_stack_000000b0 = lVar15;
        if (*(ulong *)(unaff_x29 + -200) <= unaff_x25) {
          func_0x007a2570(unaff_x25,*(ulong *)(unaff_x29 + -200),&UNK_009ea7f0);
          goto LAB_00528948;
        }
        plVar12 = (long *)(*(long *)(unaff_x29 + -0xd0) + unaff_x25 * 0x18);
        lVar6 = *plVar12;
        if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
          func_0x00187bd4(plVar12[1],lVar6,1);
        }
        *plVar12 = lVar7;
        plVar12[1] = lVar2;
        plVar12[2] = lVar15;
        unaff_x28 = -0x8000000000000000;
        if (lVar8 != 0) {
          func_0x00187bd4(lVar13,lVar8,1);
        }
      }
      goto code_r0x00528288;
    }
    if ((*(byte *)(param_2 + 0x251) & 1) != 0) break;
    func_0x0050d6e0(unaff_x29 + -0xb0,param_2,in_stack_00000040,0);
    in_stack_000000a8 = *(long *)(unaff_x29 + -0xa8);
    uStack00000000000000a0 = *(long *)(unaff_x29 + -0xb0);
    in_stack_000000b0 = *(long *)(unaff_x29 + -0xa0);
  } while( true );
  uStack00000000000000a0 = 0;
  in_stack_000000a8 = 1;
  in_stack_000000b0 = 0;
  *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
  *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
  *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea808;
  *(undefined8 *)(unaff_x29 + -0xa8) = 3;
  *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
  *(undefined8 *)(unaff_x29 + -0x88) = 2;
  *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
  *(undefined8 *)(unaff_x29 + -0x98) = 1;
  unaff_x21 = 1;
  func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
  param_1 = unaff_x29 + -0xb0;
  param_3 = in_stack_00000040;
  unaff_x24 = param_2;
  goto code_r0x005281b4;
  while( true ) {
    lVar7 = plVar1[1];
    uVar5 = plVar1[2];
    lVar15 = in_stack_00000060[2];
    if ((ulong)(*in_stack_00000060 - lVar15) < uVar5) {
      func_0x007a5594(in_stack_00000060,lVar15,uVar5,1,1);
      lVar15 = in_stack_00000060[2];
    }
    _memcpy(in_stack_00000060[1] + lVar15,lVar7,uVar5);
    lVar15 = lVar15 + uVar5;
    in_stack_00000060[2] = lVar15;
    if (*in_stack_00000060 == lVar15) {
      func_0x007a5594(in_stack_00000060,lVar15,1,1,1);
      lVar15 = in_stack_00000060[2];
      *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
      in_stack_00000060[2] = lVar15 + 1;
    }
    else {
      *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
      in_stack_00000060[2] = lVar15 + 1;
    }
    if (lVar13 != 0) {
      func_0x00187bd4(lVar7,lVar13,1);
    }
    plVar1 = plVar12;
    if (plVar12 == plVar9) break;
code_r0x00528360:
    plVar12 = plVar1 + 3;
    lVar13 = *plVar1;
    if (lVar13 == -0x8000000000000000) goto LAB_0052843c;
  }
  plVar12 = plVar9;
LAB_0052843c:
  *(long **)(unaff_x29 + -0xa8) = plVar12;
code_r0x00528444:
  if ((long)plVar9 - (long)plVar12 != 0) {
    uVar5 = (ulong)((long)plVar9 - (long)plVar12) / 0x18;
    plVar12 = plVar12 + 1;
    do {
      if (plVar12[-1] != 0) {
        func_0x00187bd4(*plVar12,plVar12[-1],1);
      }
      plVar12 = plVar12 + 3;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
  }
  if (lVar8 != 0) {
    func_0x00187bd4(plVar10,lVar8 * 0x18,8);
  }
  plVar1 = in_stack_00000120;
  lVar8 = in_stack_00000118;
  plVar9 = in_stack_00000120 + in_stack_00000128 * 3;
  *(long **)(unaff_x29 + -0xb0) = in_stack_00000120;
  *(long **)(unaff_x29 + -0xa8) = in_stack_00000120;
  *(long *)(unaff_x29 + -0xa0) = in_stack_00000118;
  *(long **)(unaff_x29 + -0x98) = plVar9;
  plVar12 = in_stack_00000120;
  plVar10 = in_stack_00000120;
  if (in_stack_00000128 != 0) {
    do {
      plVar12 = plVar10 + 3;
      lVar13 = *plVar10;
      if (lVar13 == -0x8000000000000000) goto LAB_005285c4;
      lVar7 = plVar10[1];
      uVar5 = plVar10[2];
      lVar15 = in_stack_00000060[2];
      if ((ulong)(*in_stack_00000060 - lVar15) < uVar5) {
        func_0x007a5594(in_stack_00000060,lVar15,uVar5,1,1);
        lVar15 = in_stack_00000060[2];
      }
      _memcpy(in_stack_00000060[1] + lVar15,lVar7,uVar5);
      lVar15 = lVar15 + uVar5;
      in_stack_00000060[2] = lVar15;
      if (*in_stack_00000060 == lVar15) {
        func_0x007a5594(in_stack_00000060,lVar15,1,1,1);
        lVar15 = in_stack_00000060[2];
        *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
        in_stack_00000060[2] = lVar15 + 1;
      }
      else {
        *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
        in_stack_00000060[2] = lVar15 + 1;
      }
      if (lVar13 != 0) {
        func_0x00187bd4(lVar7,lVar13,1);
      }
      plVar10 = plVar12;
    } while (plVar12 != plVar9);
    plVar12 = plVar9;
LAB_005285c4:
    *(long **)(unaff_x29 + -0xa8) = plVar12;
  }
  if ((long)plVar9 - (long)plVar12 != 0) {
    uVar5 = (ulong)((long)plVar9 - (long)plVar12) / 0x18;
    plVar12 = plVar12 + 1;
    do {
      if (plVar12[-1] != 0) {
        func_0x00187bd4(*plVar12,plVar12[-1],1);
      }
      plVar12 = plVar12 + 3;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
  }
  if (lVar8 != 0) {
    func_0x00187bd4(plVar1,lVar8 * 0x18,8);
  }
code_r0x00528628:
  plVar12 = *(long **)(unaff_x29 + -0xd0);
  lVar8 = *(long *)(unaff_x29 + -200);
  plVar10 = plVar12 + lVar8 * 3;
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar12;
  *(long **)(unaff_x29 + -0x78) = plVar12;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(long **)(unaff_x29 + -0x68) = plVar10;
  if (lVar8 != 0) {
    lVar8 = lVar8 * 0x18;
    lVar13 = *plVar12;
    while( true ) {
      lVar8 = lVar8 + -0x18;
      plVar12 = plVar12 + 3;
      if (lVar13 != -0x8000000000000000) {
        if (lVar13 == -0x7fffffffffffffff) goto LAB_00528764;
        lVar7 = plVar12[-2];
        uVar5 = plVar12[-1];
        lVar15 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar15) < uVar5) {
          func_0x007a5594(in_stack_00000060,lVar15,uVar5,1,1);
          lVar15 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar15,lVar7,uVar5);
        lVar15 = lVar15 + uVar5;
        in_stack_00000060[2] = lVar15;
        if (*in_stack_00000060 == lVar15) {
          func_0x007a5594(in_stack_00000060,lVar15,1,1,1);
          lVar15 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
          in_stack_00000060[2] = lVar15 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar15) = 0x20;
          in_stack_00000060[2] = lVar15 + 1;
        }
        if (lVar13 != 0) {
          func_0x00187bd4(lVar7,lVar13,1);
        }
      }
      if (lVar8 == 0) break;
      lVar13 = *plVar12;
    }
    plVar12 = plVar10;
  }
LAB_00528764:
  *(long **)(unaff_x29 + -0x78) = plVar12;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar8 = *(long *)(unaff_x29 + -0xe0);
    if (lVar8 != 0) {
      puVar11 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar11[-1] != 0) {
          func_0x00187bd4(*puVar11,puVar11[-1],1);
        }
        puVar11 = puVar11 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      plVar12 = in_stack_00000120 + 1;
      lVar8 = in_stack_00000128;
      do {
        if (plVar12[-1] != 0) {
          func_0x00187bd4(*plVar12,plVar12[-1],1);
        }
        plVar12 = plVar12 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
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
  lVar8 = in_stack_000000d8;
  if (in_stack_00000030 == 0) {
    if (in_stack_000000e0 != 0) {
      puVar11 = (undefined8 *)(in_stack_000000d8 + 8);
      lVar13 = in_stack_000000e0;
      do {
        if (puVar11[-1] != 0) {
          func_0x00187bd4(*puVar11,puVar11[-1] << 3,8);
        }
        puVar11 = puVar11 + 5;
        lVar13 = lVar13 + -1;
      } while (lVar13 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(lVar8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

