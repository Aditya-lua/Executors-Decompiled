
bool FUN_00624bf8(ulong param_1,long param_2)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  ulong in_x9;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x80) = unaff_x25 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x60);
  uVar4 = *(ulong *)(unaff_x29 + -0x70);
  if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
    uVar4 = *(ulong *)(unaff_x29 + -0x68);
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
  if ((unaff_x26 & 1) == 0) {
    func_0x0060aaf0(unaff_x29 + -0x80);
    func_0x00608730(&uStack0000000000000090);
    func_0x0060986c(unaff_x29 + -0xb0,&uStack0000000000000090);
    uStack0000000000000090 = unaff_x25 + 0x10;
    uVar4 = in_stack_000000a0;
    if (in_stack_000000a8 <= in_stack_000000a0) {
      uVar4 = in_stack_000000a8;
    }
    if (in_stack_000000b0 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_000000b0 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    func_0x00608730(&uStack0000000000000060);
    func_0x0060986c(&uStack0000000000000090,&uStack0000000000000060);
    uStack0000000000000060 = unaff_x25 + 0x10;
    uVar4 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar4 = in_stack_00000078;
    }
    if (in_stack_00000080 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    (**(code **)(*unaff_x22 + 0x38))();
    (**(code **)(*unaff_x21 + 0xd8))(&uStack0000000000000030);
    func_0x0060986c(&uStack0000000000000060,&uStack0000000000000030);
    iVar3 = func_0x00609ec8();
    bVar2 = iVar3 == 0;
    lVar1 = unaff_x25 + 0x10;
    uVar4 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar4 = in_stack_00000078;
    }
    uStack0000000000000060 = lVar1;
    if (in_stack_00000080 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    uVar4 = in_stack_00000040;
    if (in_stack_00000048 <= in_stack_00000040) {
      uVar4 = in_stack_00000048;
    }
    uStack0000000000000030 = lVar1;
    if (in_stack_00000050 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    if (in_stack_00000018 <= in_stack_00000010) {
      in_stack_00000010 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (in_stack_00000010 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
          in_stack_00000010 = in_stack_00000010 - 1;
        } while (in_stack_00000010 != 0);
      }
      func_0x00611644();
    }
    uVar4 = in_stack_000000a0;
    if (in_stack_000000a8 <= in_stack_000000a0) {
      uVar4 = in_stack_000000a8;
    }
    uStack0000000000000090 = unaff_x25 + 0x10;
    if (in_stack_000000b0 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_000000b0 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0xb0) = unaff_x25 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x90);
    uVar4 = *(ulong *)(unaff_x29 + -0xa0);
    if (*(ulong *)(unaff_x29 + -0x98) <= *(ulong *)(unaff_x29 + -0xa0)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x98);
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
    *(long *)(unaff_x29 + -0x80) = unaff_x25 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x60);
    uVar4 = *(ulong *)(unaff_x29 + -0x70);
    if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x68);
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
  else {
    bVar2 = false;
  }
  return bVar2;
}

