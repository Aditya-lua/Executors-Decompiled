
undefined8 FUN_0002ce68(undefined1 param_1 [16])

{
  undefined8 *puVar1;
  code *pcVar2;
  bool bVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined1 *puVar10;
  long *plVar11;
  undefined8 unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  long lVar12;
  undefined1 unaff_w23;
  undefined4 *puVar13;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  uint uVar14;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  long lStack0000000000000040;
  long lStack0000000000000048;
  long lStack0000000000000050;
  long lStack0000000000000058;
  long lStack0000000000000060;
  undefined5 uStack0000000000000068;
  undefined3 uStack000000000000006d;
  undefined5 uStack0000000000000070;
  undefined1 uStack0000000000000078;
  
  lStack0000000000000048 = param_1._8_8_;
  lStack0000000000000040 = param_1._0_8_;
  uStack0000000000000068 = param_1._8_5_;
  uStack000000000000006d = 0;
  uStack0000000000000070 = 0;
  lStack0000000000000050 = lStack0000000000000040;
  lStack0000000000000058 = lStack0000000000000048;
  lStack0000000000000060 = lStack0000000000000040;
  uVar4 = func_0x0002d570(unaff_x29 + -0x70,&uStack0000000000000018);
  *(undefined8 *)(unaff_x29 + -0x68) = uVar4;
  if (lStack0000000000000050 != 0) {
    lStack0000000000000058 = lStack0000000000000050;
    __ZdlPv();
  }
  if (in_stack_00000038 != 0) {
    lStack0000000000000040 = in_stack_00000038;
    __ZdlPv();
  }
  lVar12 = *(long *)(unaff_x29 + -0x68);
  *(undefined4 *)(lVar12 + -0x60) = 0;
  *(long *)(lVar12 + -0x58) = unaff_x20;
  *(long *)(lVar12 + -0x50) = unaff_x20;
  *(long *)(lVar12 + -0x48) = unaff_x26;
  lVar6 = *(long *)(lVar12 + -0x40);
  uVar7 = (ulong)*(uint *)(unaff_x24 + 0x1c);
  lVar8 = *(long *)(lVar12 + -0x38) - lVar6 >> 3;
  bVar3 = uVar7 < (ulong)(lVar8 * -0x5555555555555555);
  lVar8 = uVar7 + lVar8 * 0x5555555555555555;
  if (bVar3 || lVar8 == 0) {
    if (bVar3) {
      *(ulong *)(lVar12 + -0x38) = lVar6 + uVar7 * 0x18;
    }
  }
  else {
    func_0x0002d754((long *)(lVar12 + -0x40),lVar8,&uStack0000000000000078);
    lVar12 = *(long *)(unaff_x29 + -0x68);
  }
  lVar8 = *(long *)(lVar12 + -0x28);
  uVar7 = (ulong)*(uint *)(unaff_x24 + 0x20);
  uVar9 = *(long *)(lVar12 + -0x20) - lVar8 >> 4;
  if (uVar7 < uVar9 || uVar7 - uVar9 == 0) {
    if (uVar7 < uVar9) {
      *(ulong *)(lVar12 + -0x20) = lVar8 + uVar7 * 0x10;
    }
  }
  else {
    func_0x0002d8f4((long *)(lVar12 + -0x28),uVar7 - uVar9);
    lVar12 = *(long *)(unaff_x29 + -0x68);
  }
  *(undefined8 *)(lVar12 + -0x10) = unaff_x19;
  *(uint *)(lVar12 + -8) = unaff_w21;
  *(undefined1 *)(lVar12 + -4) = unaff_w23;
  uVar14 = 1;
  do {
    if (((uVar14 & 0xfff) == 0) && ((int)unaff_x26 - (int)unaff_x20 <= (int)(uVar14 >> 0xc))) {
      func_0x0002d458();
code_r0x0002d1f8:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x2d1fc);
      (*pcVar2)();
    }
    puVar13 = (undefined4 *)(lVar12 + -0x60);
    plVar5 = *(long **)(lVar12 + -0x10);
    if (plVar5 != (long *)0x0) {
      (**(code **)(*plVar5 + 0x10))(plVar5,puVar13);
    }
    switch(*puVar13) {
    case 0xfffffc18:
      lVar8 = *(long *)(lVar12 + -0x50);
      if ((((unaff_w21 >> 5 & 1) != 0) && (lVar8 == unaff_x20)) ||
         (((unaff_w21 >> 0xc & 1) != 0 && (lVar8 != unaff_x26)))) goto code_r0x0002cff8;
      plVar5 = (long *)*unaff_x25;
      *plVar5 = unaff_x20;
      plVar5[1] = lVar8;
      *(undefined1 *)(plVar5 + 2) = 1;
      lVar8 = *(long *)(lVar12 + -0x38) - *(long *)(lVar12 + -0x40);
      if (lVar8 != 0) {
        puVar10 = (undefined1 *)(*(long *)(lVar12 + -0x40) + 0x10);
        uVar7 = 1;
        do {
          plVar11 = plVar5 + uVar7 * 3;
          lVar12 = *(long *)(puVar10 + -0x10);
          plVar11[1] = *(long *)(puVar10 + -8);
          *plVar11 = lVar12;
          *(undefined1 *)(plVar11 + 2) = *puVar10;
          bVar3 = uVar7 < (ulong)((lVar8 >> 3) * -0x5555555555555555);
          puVar10 = puVar10 + 0x18;
          uVar7 = (ulong)((int)uVar7 + 1);
        } while (bVar3);
      }
      uVar4 = 1;
      lVar8 = *(long *)(unaff_x29 + -0x70);
      if (lVar8 == 0) {
        return 1;
      }
      goto code_r0x0002d10c;
    default:
      func_0x0002d4a4();
      goto code_r0x0002d1f8;
    case 0xfffffc1d:
    case 0xfffffc1e:
    case 0xfffffc21:
      break;
    case 0xfffffc1f:
code_r0x0002cff8:
      lVar12 = *(long *)(unaff_x29 + -0x68);
      if (*(long *)(lVar12 + -0x28) != 0) {
        *(long *)(lVar12 + -0x20) = *(long *)(lVar12 + -0x28);
        __ZdlPv();
      }
      if (*(long *)(lVar12 + -0x40) != 0) {
        *(long *)(lVar12 + -0x38) = *(long *)(lVar12 + -0x40);
        __ZdlPv();
      }
      *(long *)(unaff_x29 + -0x68) = lVar12 + -0x60;
      break;
    case 0xfffffc20:
      func_0x0002da1c(&uStack0000000000000018,puVar13);
      (**(code **)(**(long **)(lVar12 + -0x10) + 0x18))(*(long **)(lVar12 + -0x10),1,puVar13);
      (**(code **)(*(long *)CONCAT35(uStack000000000000006d,uStack0000000000000068) + 0x18))
                ((long *)CONCAT35(uStack000000000000006d,uStack0000000000000068),0,
                 &uStack0000000000000018);
      puVar1 = *(undefined8 **)(unaff_x29 + -0x68);
      if (puVar1 < *(undefined8 **)(unaff_x29 + -0x60)) {
        puVar1[1] = in_stack_00000020;
        *puVar1 = uStack0000000000000018;
        puVar1[3] = in_stack_00000030;
        puVar1[2] = in_stack_00000028;
        puVar1[4] = 0;
        puVar1[5] = 0;
        puVar1[6] = 0;
        puVar1[7] = 0;
        puVar1[5] = lStack0000000000000040;
        puVar1[4] = in_stack_00000038;
        puVar1[6] = lStack0000000000000048;
        in_stack_00000038 = 0;
        lStack0000000000000040 = 0;
        lStack0000000000000048 = 0;
        puVar1[8] = 0;
        puVar1[9] = 0;
        puVar1[8] = lStack0000000000000058;
        puVar1[7] = lStack0000000000000050;
        puVar1[9] = lStack0000000000000060;
        lStack0000000000000050 = 0;
        lStack0000000000000058 = 0;
        lStack0000000000000060 = 0;
        *(ulong *)((long)puVar1 + 0x55) = CONCAT53(uStack0000000000000070,uStack000000000000006d);
        puVar1[10] = CONCAT35(uStack000000000000006d,uStack0000000000000068);
        *(undefined8 **)(unaff_x29 + -0x68) = puVar1 + 0xc;
      }
      else {
        uVar4 = func_0x0002d570(unaff_x29 + -0x70,&uStack0000000000000018);
        *(undefined8 *)(unaff_x29 + -0x68) = uVar4;
        if (lStack0000000000000050 != 0) {
          lStack0000000000000058 = lStack0000000000000050;
          __ZdlPv();
        }
      }
      if (in_stack_00000038 != 0) {
        lStack0000000000000040 = in_stack_00000038;
        __ZdlPv();
      }
    }
    lVar8 = *(long *)(unaff_x29 + -0x70);
    lVar12 = *(long *)(unaff_x29 + -0x68);
    uVar14 = uVar14 + 1;
  } while (lVar8 != lVar12);
  uVar4 = 0;
  if (lVar8 != 0) {
code_r0x0002d10c:
    lVar6 = *(long *)(unaff_x29 + -0x68);
    lVar12 = lVar8;
    if (lVar6 != lVar8) {
      do {
        if (*(long *)(lVar6 + -0x28) != 0) {
          *(long *)(lVar6 + -0x20) = *(long *)(lVar6 + -0x28);
          __ZdlPv();
        }
        if (*(long *)(lVar6 + -0x40) != 0) {
          *(long *)(lVar6 + -0x38) = *(long *)(lVar6 + -0x40);
          __ZdlPv();
        }
        lVar6 = lVar6 + -0x60;
      } while (lVar6 != lVar8);
      lVar12 = *(long *)(unaff_x29 + -0x70);
    }
    *(long *)(unaff_x29 + -0x68) = lVar8;
    __ZdlPv(lVar12);
  }
  return uVar4;
}

