
void FUN_006928f4(void)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long unaff_x25;
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
  
  iVar2 = func_0x0068c6f4();
  func_0x005fe1e8(&uStack0000000000000090,(long)iVar2);
  func_0x00607398(unaff_x29 + -0xb0);
  uStack0000000000000090 = unaff_x25 + 0x10;
  uVar3 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar3 = in_stack_000000a8;
  }
  if (in_stack_000000b0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0(&uStack0000000000000060);
  func_0x0068c96c(&uStack0000000000000090,&uStack0000000000000060);
  uStack0000000000000060 = unaff_x25 + 0x10;
  uVar3 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar3 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  iVar2 = func_0x0068c6f4(unaff_x29 + -0x80);
  func_0x005fe1e8(&uStack0000000000000030,(long)iVar2);
  func_0x00607398(&uStack0000000000000060);
  uStack0000000000000030 = unaff_x25 + 0x10;
  uVar3 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar3 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0();
  func_0x0068c96c(&uStack0000000000000030);
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
  func_0x0068f560(&uStack0000000000000090);
  lVar1 = unaff_x25 + 0x10;
  uVar3 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar3 = in_stack_00000048;
  }
  uStack0000000000000030 = lVar1;
  if (in_stack_00000050 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  uVar3 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar3 = in_stack_00000078;
  }
  uStack0000000000000060 = lVar1;
  if (in_stack_00000080 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  lVar1 = unaff_x25 + 0x10;
  uVar3 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar3 = in_stack_000000a8;
  }
  uStack0000000000000090 = lVar1;
  if (in_stack_000000b0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xb0) = lVar1;
  lVar1 = *(long *)(unaff_x29 + -0x90);
  uVar3 = *(ulong *)(unaff_x29 + -0xa0);
  if (*(ulong *)(unaff_x29 + -0x98) <= *(ulong *)(unaff_x29 + -0xa0)) {
    uVar3 = *(ulong *)(unaff_x29 + -0x98);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x80) = unaff_x25 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x60);
  uVar3 = *(ulong *)(unaff_x29 + -0x70);
  if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
    uVar3 = *(ulong *)(unaff_x29 + -0x68);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return;
}

