
ulong FUN_00666880(long param_1)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  long in_x9;
  uint unaff_w20;
  ulong uVar4;
  uint unaff_w21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e0;
  ulong in_stack_00000100;
  ulong in_stack_00000108;
  long in_stack_00000110;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  *(undefined8 *)(unaff_x29 + -0xc0) = unaff_x22;
  lVar2 = *(long *)(unaff_x29 + -0xa0);
  uVar4 = *(ulong *)(unaff_x29 + -0xb0);
  if (*(ulong *)(unaff_x29 + -0xa8) <= *(ulong *)(unaff_x29 + -0xb0)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xa8);
  }
  if (lVar2 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000078 <= in_stack_00000070) {
    in_stack_00000070 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (in_stack_00000070 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + in_stack_00000070 * 8) = 0;
        in_stack_00000070 = in_stack_00000070 - 1;
      } while (in_stack_00000070 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
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
  *(long *)(unaff_x29 + -0xf0) = unaff_x23 + 0x10;
  lVar2 = *(long *)(unaff_x29 + -0xd0);
  uVar4 = *(ulong *)(unaff_x29 + -0xe0);
  if (*(ulong *)(unaff_x29 + -0xd8) <= *(ulong *)(unaff_x29 + -0xe0)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xd8);
  }
  if (lVar2 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000108 <= in_stack_00000100) {
    in_stack_00000100 = in_stack_00000108;
  }
  if (in_stack_00000110 != 0) {
    if (in_stack_00000100 != 0) {
      do {
        *(undefined8 *)(in_stack_00000110 + -8 + in_stack_00000100 * 8) = 0;
        in_stack_00000100 = in_stack_00000100 - 1;
      } while (in_stack_00000100 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000d8 <= in_stack_000000d0) {
    in_stack_000000d0 = in_stack_000000d8;
  }
  if (in_stack_000000e0 != 0) {
    if (in_stack_000000d0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e0 + -8 + in_stack_000000d0 * 8) = 0;
        in_stack_000000d0 = in_stack_000000d0 - 1;
      } while (in_stack_000000d0 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000a8 <= in_stack_000000a0) {
    in_stack_000000a0 = in_stack_000000a8;
  }
  if (in_stack_000000b0 != 0) {
    if (in_stack_000000a0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + in_stack_000000a0 * 8) = 0;
        in_stack_000000a0 = in_stack_000000a0 - 1;
      } while (in_stack_000000a0 != 0);
    }
    func_0x00611644();
  }
  uVar1 = 0;
  if (unaff_w20 < 2) {
    uVar1 = unaff_w21;
  }
  uVar4 = (ulong)uVar1;
  if ((unaff_w20 >= 2) && (((unaff_w21 ^ 1) & 1) == 0)) {
    uVar4 = func_0x0068d964();
  }
  *(long *)(unaff_x29 + -0x60) = unaff_x23 + 0x10;
  lVar2 = *(long *)(unaff_x29 + -0x40);
  uVar3 = *(ulong *)(unaff_x29 + -0x50);
  if (*(ulong *)(unaff_x29 + -0x48) <= *(ulong *)(unaff_x29 + -0x50)) {
    uVar3 = *(ulong *)(unaff_x29 + -0x48);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return uVar4;
}

