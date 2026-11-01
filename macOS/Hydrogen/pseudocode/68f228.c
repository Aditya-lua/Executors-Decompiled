
ulong FUN_0068f228(ulong param_1,long param_2)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  long *unaff_x20;
  uint unaff_w21;
  long unaff_x24;
  undefined2 *unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  undefined2 *unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack00000000000000c8;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 uStack00000000000000f8;
  ulong in_stack_00000108;
  ulong in_stack_00000110;
  long in_stack_00000118;
  
  while( true ) {
    if (param_2 != 0) {
      if (param_1 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
          param_1 = param_1 - 1;
        } while (param_1 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0x88) = unaff_x26 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x68);
    uVar4 = *(ulong *)(unaff_x29 + -0x78);
    if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x70);
    }
    if (lVar1 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    if (unaff_w21 == 0) {
      func_0x005fe1e8(&uStack0000000000000010,*unaff_x25);
      func_0x005ffccc();
      uStack0000000000000010 = unaff_x26 + 0x10;
      if (in_stack_00000028 <= in_stack_00000020) {
        in_stack_00000020 = in_stack_00000028;
      }
      if (in_stack_00000030 != 0) {
        if (in_stack_00000020 != 0) {
          do {
            *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
            in_stack_00000020 = in_stack_00000020 - 1;
          } while (in_stack_00000020 != 0);
        }
        func_0x00611644();
      }
      iVar2 = func_0x00609ec8();
      uVar4 = (ulong)(iVar2 < 1);
      goto LAB_0068efe8;
    }
    unaff_x25 = unaff_x25 + 1;
    if (unaff_x28 <= unaff_x25) break;
    func_0x005fe1e8(unaff_x29 + -0x88,*unaff_x25);
    func_0x0060986c(&uStack0000000000000010);
    iVar2 = func_0x00609ec8(&uStack0000000000000010);
    unaff_w21 = (uint)(iVar2 != 0);
    if ((unaff_x20 != (long *)0x0) && (iVar2 == 0)) {
      func_0x005fe1e8(unaff_x29 + -0xe8,*unaff_x25);
      uVar3 = (**(code **)(*unaff_x20 + 0x10))();
      unaff_w21 = uVar3 ^ 1;
      *(long *)(unaff_x29 + -0xe8) = unaff_x26 + 0x10;
      lVar1 = *(long *)(unaff_x29 + -200);
      uVar4 = *(ulong *)(unaff_x29 + -0xd8);
      if (*(ulong *)(unaff_x29 + -0xd0) <= *(ulong *)(unaff_x29 + -0xd8)) {
        uVar4 = *(ulong *)(unaff_x29 + -0xd0);
      }
      if (lVar1 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
    }
    param_1 = in_stack_00000020;
    if (in_stack_00000028 <= in_stack_00000020) {
      param_1 = in_stack_00000028;
    }
    param_2 = in_stack_00000030;
    uStack0000000000000010 = unaff_x27;
  }
  func_0x005fe1e8(&uStack0000000000000010,unaff_x24 + 1);
  func_0x005ffccc();
  uStack0000000000000010 = unaff_x26 + 0x10;
  uVar4 = in_stack_00000020;
  if (in_stack_00000028 <= in_stack_00000020) {
    uVar4 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  iVar2 = func_0x005ffe3c();
  if (iVar2 == 0) {
    func_0x00607398(unaff_x29 + -0x88);
    func_0x0060986c(&uStack0000000000000010,unaff_x29 + -0x88);
    func_0x00603158();
    lVar1 = unaff_x26 + 0x10;
    if (in_stack_00000028 <= in_stack_00000020) {
      in_stack_00000020 = in_stack_00000028;
    }
    uStack0000000000000010 = lVar1;
    if (in_stack_00000030 != 0) {
      if (in_stack_00000020 != 0) {
        do {
          *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
          in_stack_00000020 = in_stack_00000020 - 1;
        } while (in_stack_00000020 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0x88) = lVar1;
    lVar1 = *(long *)(unaff_x29 + -0x68);
    uVar4 = *(ulong *)(unaff_x29 + -0x78);
    if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x70);
    }
    if (lVar1 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    iVar2 = func_0x00609ec8();
    if (iVar2 < 1) {
      func_0x0068dfac(&uStack0000000000000010);
      do {
        do {
          uVar4 = func_0x0068e4e8(&uStack0000000000000010);
          if ((int)uVar4 == 0) goto code_r0x0068f124;
        } while ((unaff_x20 != (long *)0x0) &&
                (iVar2 = (**(code **)(*unaff_x20 + 0x10))(), iVar2 == 0));
        func_0x005fe1e8(unaff_x29 + -0x88,2);
        iVar2 = func_0x0068b85c();
        *(long *)(unaff_x29 + -0x88) = unaff_x26 + 0x10;
        lVar1 = *(long *)(unaff_x29 + -0x68);
        uVar5 = *(ulong *)(unaff_x29 + -0x78);
        if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
          uVar5 = *(ulong *)(unaff_x29 + -0x70);
        }
        if (lVar1 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
      } while ((iVar2 == 0) || (uVar5 = func_0x0068d674(), (uVar5 & 1) == 0));
code_r0x0068f124:
      func_0x00694398(&uStack0000000000000010);
    }
    else {
      uVar4 = 0;
    }
  }
  else {
    func_0x005fe1e8(unaff_x29 + -0x88,1);
    func_0x005fe1e8(unaff_x29 + -0xe8,2);
    func_0x005fe1e8(&uStack00000000000000f8,1);
    func_0x0068f560(&uStack0000000000000010);
    func_0x0061047c(&uStack00000000000000c8);
    uVar4 = func_0x0068ec9c();
    lVar1 = unaff_x26 + 0x10;
    uVar5 = in_stack_000000d8;
    if (in_stack_000000e0 <= in_stack_000000d8) {
      uVar5 = in_stack_000000e0;
    }
    uStack00000000000000c8 = lVar1;
    if (in_stack_000000e8 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(in_stack_000000e8 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    if (in_stack_00000028 <= in_stack_00000020) {
      in_stack_00000020 = in_stack_00000028;
    }
    uStack0000000000000010 = lVar1;
    if (in_stack_00000030 != 0) {
      if (in_stack_00000020 != 0) {
        do {
          *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
          in_stack_00000020 = in_stack_00000020 - 1;
        } while (in_stack_00000020 != 0);
      }
      func_0x00611644();
    }
    lVar1 = unaff_x26 + 0x10;
    uVar5 = in_stack_00000108;
    if (in_stack_00000110 <= in_stack_00000108) {
      uVar5 = in_stack_00000110;
    }
    uStack00000000000000f8 = lVar1;
    if (in_stack_00000118 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(in_stack_00000118 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0xe8) = lVar1;
    lVar1 = *(long *)(unaff_x29 + -200);
    uVar5 = *(ulong *)(unaff_x29 + -0xd8);
    if (*(ulong *)(unaff_x29 + -0xd0) <= *(ulong *)(unaff_x29 + -0xd8)) {
      uVar5 = *(ulong *)(unaff_x29 + -0xd0);
    }
    if (lVar1 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0x88) = unaff_x26 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x68);
    uVar5 = *(ulong *)(unaff_x29 + -0x78);
    if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
      uVar5 = *(ulong *)(unaff_x29 + -0x70);
    }
    if (lVar1 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
  }
LAB_0068efe8:
  *(long *)(unaff_x29 + -0xb8) = unaff_x26 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar5 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar5 = *(ulong *)(unaff_x29 + -0xa0);
  }
  if (lVar1 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  return uVar4;
}

