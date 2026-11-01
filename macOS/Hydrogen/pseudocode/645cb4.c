
bool FUN_00645cb4(void)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x25;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000050;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000090;
  ulong in_stack_00000098;
  long in_stack_000000a0;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  long in_stack_000000d0;
  
  iVar3 = func_0x00609ec8();
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
  uVar4 = in_stack_00000010;
  if (in_stack_00000018 <= in_stack_00000010) {
    uVar4 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (iVar3 < 0) {
    bVar2 = false;
  }
  else {
    func_0x0060aaf0(unaff_x29 + -0x80);
    func_0x00608730();
    func_0x0060986c(unaff_x29 + -0xb0);
    uVar4 = in_stack_00000010;
    if (in_stack_00000018 <= in_stack_00000010) {
      uVar4 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    func_0x00608730();
    func_0x0060986c(&uStack00000000000000b0);
    uVar4 = in_stack_00000010;
    if (in_stack_00000018 <= in_stack_00000010) {
      uVar4 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    (**(code **)(*unaff_x22 + 0x38))();
    (**(code **)(*unaff_x21 + 0xd8))(&uStack0000000000000050);
    func_0x0060986c(&uStack0000000000000080,&uStack0000000000000050);
    iVar3 = func_0x00609ec8();
    bVar2 = iVar3 == 0;
    lVar1 = unaff_x25 + 0x10;
    uVar4 = in_stack_00000090;
    if (in_stack_00000098 <= in_stack_00000090) {
      uVar4 = in_stack_00000098;
    }
    uStack0000000000000080 = lVar1;
    if (in_stack_000000a0 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_000000a0 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    uVar4 = in_stack_00000060;
    if (in_stack_00000068 <= in_stack_00000060) {
      uVar4 = in_stack_00000068;
    }
    uStack0000000000000050 = lVar1;
    if (in_stack_00000070 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000070 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    if (in_stack_00000038 <= in_stack_00000030) {
      in_stack_00000030 = in_stack_00000038;
    }
    if (in_stack_00000040 != 0) {
      if (in_stack_00000030 != 0) {
        do {
          *(undefined8 *)(in_stack_00000040 + -8 + in_stack_00000030 * 8) = 0;
          in_stack_00000030 = in_stack_00000030 - 1;
        } while (in_stack_00000030 != 0);
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
    lVar1 = unaff_x25 + 0x10;
    uVar4 = in_stack_000000c0;
    if (in_stack_000000c8 <= in_stack_000000c0) {
      uVar4 = in_stack_000000c8;
    }
    uStack00000000000000b0 = lVar1;
    if (in_stack_000000d0 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_000000d0 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0xb0) = lVar1;
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
  return bVar2;
}

