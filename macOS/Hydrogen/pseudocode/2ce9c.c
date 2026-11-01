
undefined8 FUN_0002ce9c(long param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  bool bVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined1 *puVar9;
  long *plVar10;
  undefined8 unaff_x19;
  undefined8 uVar11;
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
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined5 uStack0000000000000068;
  undefined3 uStack000000000000006d;
  undefined5 in_stack_00000070;
  undefined1 uStack0000000000000078;
  
  if (param_1 != 0) {
    in_stack_00000040 = param_1;
    __ZdlPv();
  }
  lVar12 = *(long *)(unaff_x29 + -0x68);
  *(undefined4 *)(lVar12 + -0x60) = 0;
  *(long *)(lVar12 + -0x58) = unaff_x20;
  *(long *)(lVar12 + -0x50) = unaff_x20;
  *(long *)(lVar12 + -0x48) = unaff_x26;
  lVar5 = *(long *)(lVar12 + -0x40);
  uVar6 = (ulong)*(uint *)(unaff_x24 + 0x1c);
  lVar7 = *(long *)(lVar12 + -0x38) - lVar5 >> 3;
  bVar3 = uVar6 < (ulong)(lVar7 * -0x5555555555555555);
  lVar7 = uVar6 + lVar7 * 0x5555555555555555;
  if (bVar3 || lVar7 == 0) {
    if (bVar3) {
      *(ulong *)(lVar12 + -0x38) = lVar5 + uVar6 * 0x18;
    }
  }
  else {
    func_0x0002d754((long *)(lVar12 + -0x40),lVar7,&uStack0000000000000078);
    lVar12 = *(long *)(unaff_x29 + -0x68);
  }
  lVar7 = *(long *)(lVar12 + -0x28);
  uVar6 = (ulong)*(uint *)(unaff_x24 + 0x20);
  uVar8 = *(long *)(lVar12 + -0x20) - lVar7 >> 4;
  if (uVar6 < uVar8 || uVar6 - uVar8 == 0) {
    if (uVar6 < uVar8) {
      *(ulong *)(lVar12 + -0x20) = lVar7 + uVar6 * 0x10;
    }
  }
  else {
    func_0x0002d8f4((long *)(lVar12 + -0x28),uVar6 - uVar8);
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
    plVar4 = *(long **)(lVar12 + -0x10);
    if (plVar4 != (long *)0x0) {
      (**(code **)(*plVar4 + 0x10))(plVar4,puVar13);
    }
    switch(*puVar13) {
    case 0xfffffc18:
      lVar7 = *(long *)(lVar12 + -0x50);
      if ((((unaff_w21 >> 5 & 1) != 0) && (lVar7 == unaff_x20)) ||
         (((unaff_w21 >> 0xc & 1) != 0 && (lVar7 != unaff_x26)))) goto code_r0x0002cff8;
      plVar4 = (long *)*unaff_x25;
      *plVar4 = unaff_x20;
      plVar4[1] = lVar7;
      *(undefined1 *)(plVar4 + 2) = 1;
      lVar7 = *(long *)(lVar12 + -0x38) - *(long *)(lVar12 + -0x40);
      if (lVar7 != 0) {
        puVar9 = (undefined1 *)(*(long *)(lVar12 + -0x40) + 0x10);
        uVar6 = 1;
        do {
          plVar10 = plVar4 + uVar6 * 3;
          lVar12 = *(long *)(puVar9 + -0x10);
          plVar10[1] = *(long *)(puVar9 + -8);
          *plVar10 = lVar12;
          *(undefined1 *)(plVar10 + 2) = *puVar9;
          bVar3 = uVar6 < (ulong)((lVar7 >> 3) * -0x5555555555555555);
          puVar9 = puVar9 + 0x18;
          uVar6 = (ulong)((int)uVar6 + 1);
        } while (bVar3);
      }
      uVar11 = 1;
      lVar7 = *(long *)(unaff_x29 + -0x70);
      if (lVar7 == 0) {
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
        puVar1[5] = in_stack_00000040;
        puVar1[4] = in_stack_00000038;
        puVar1[6] = in_stack_00000048;
        in_stack_00000038 = 0;
        in_stack_00000040 = 0;
        in_stack_00000048 = 0;
        puVar1[8] = 0;
        puVar1[9] = 0;
        puVar1[8] = in_stack_00000058;
        puVar1[7] = in_stack_00000050;
        puVar1[9] = in_stack_00000060;
        in_stack_00000050 = 0;
        in_stack_00000058 = 0;
        in_stack_00000060 = 0;
        *(ulong *)((long)puVar1 + 0x55) = CONCAT53(in_stack_00000070,uStack000000000000006d);
        puVar1[10] = CONCAT35(uStack000000000000006d,uStack0000000000000068);
        *(undefined8 **)(unaff_x29 + -0x68) = puVar1 + 0xc;
      }
      else {
        uVar11 = func_0x0002d570(unaff_x29 + -0x70,&uStack0000000000000018);
        *(undefined8 *)(unaff_x29 + -0x68) = uVar11;
        if (in_stack_00000050 != 0) {
          in_stack_00000058 = in_stack_00000050;
          __ZdlPv();
        }
      }
      if (in_stack_00000038 != 0) {
        in_stack_00000040 = in_stack_00000038;
        __ZdlPv();
      }
    }
    lVar7 = *(long *)(unaff_x29 + -0x70);
    lVar12 = *(long *)(unaff_x29 + -0x68);
    uVar14 = uVar14 + 1;
  } while (lVar7 != lVar12);
  uVar11 = 0;
  if (lVar7 != 0) {
code_r0x0002d10c:
    lVar5 = *(long *)(unaff_x29 + -0x68);
    lVar12 = lVar7;
    if (lVar5 != lVar7) {
      do {
        if (*(long *)(lVar5 + -0x28) != 0) {
          *(long *)(lVar5 + -0x20) = *(long *)(lVar5 + -0x28);
          __ZdlPv();
        }
        if (*(long *)(lVar5 + -0x40) != 0) {
          *(long *)(lVar5 + -0x38) = *(long *)(lVar5 + -0x40);
          __ZdlPv();
        }
        lVar5 = lVar5 + -0x60;
      } while (lVar5 != lVar7);
      lVar12 = *(long *)(unaff_x29 + -0x70);
    }
    *(long *)(unaff_x29 + -0x68) = lVar7;
    __ZdlPv(lVar12);
  }
  return uVar11;
}

