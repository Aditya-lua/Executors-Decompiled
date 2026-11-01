
ulong FUN_006a743c(long param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  uint uVar5;
  ulong in_x9;
  uint unaff_w19;
  int unaff_w27;
  long unaff_x29;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  undefined8 uStack00000000000000c8;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  long in_stack_000000e8;
  
  uVar4 = in_stack_00000078;
  if (in_x9 <= in_stack_00000078) {
    uVar4 = in_x9;
  }
  if (param_1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(param_1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000050 <= in_stack_00000048) {
    in_stack_00000048 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (in_stack_00000048 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + in_stack_00000048 * 8) = 0;
        in_stack_00000048 = in_stack_00000048 - 1;
      } while (in_stack_00000048 != 0);
    }
    func_0x00611644();
  }
  uStack00000000000000c8 = &UNK_009f5d60;
  uVar4 = in_stack_000000d8;
  if (in_stack_000000e0 <= in_stack_000000d8) {
    uVar4 = in_stack_000000e0;
  }
  if (in_stack_000000e8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000098 = &UNK_009f5d60;
  uVar4 = in_stack_000000a8;
  if (in_stack_000000b0 <= in_stack_000000a8) {
    uVar4 = in_stack_000000b0;
  }
  if (in_stack_000000b8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xb8) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar4 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xa0);
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
  if (unaff_w27 == 0) {
    func_0x005fe1e8(unaff_x29 + -0xe8,1);
    func_0x00607398(unaff_x29 + -0xb8);
    func_0x0060986c(unaff_x29 + -0x88);
    iVar3 = func_0x00609ec8();
    if (iVar3 == 0) {
      func_0x005fe1e8(&uStack0000000000000068,1);
      func_0x00607398(&uStack0000000000000098);
      func_0x0060986c(&uStack00000000000000c8);
      iVar3 = func_0x00609ec8();
      bVar2 = iVar3 == 0;
      uStack00000000000000c8 = &UNK_009f5d60;
      uVar4 = in_stack_000000d8;
      if (in_stack_000000e0 <= in_stack_000000d8) {
        uVar4 = in_stack_000000e0;
      }
      if (in_stack_000000e8 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(in_stack_000000e8 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
      uStack0000000000000098 = &UNK_009f5d60;
      uVar4 = in_stack_000000a8;
      if (in_stack_000000b0 <= in_stack_000000a8) {
        uVar4 = in_stack_000000b0;
      }
      if (in_stack_000000b8 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(in_stack_000000b8 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
      uStack0000000000000068 = &UNK_009f5d60;
      uVar4 = in_stack_00000078;
      if (in_stack_00000080 <= in_stack_00000078) {
        uVar4 = in_stack_00000080;
      }
      if (in_stack_00000088 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(in_stack_00000088 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
    }
    else {
      bVar2 = false;
    }
    *(undefined **)(unaff_x29 + -0x88) = &UNK_009f5d60;
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
    *(undefined **)(unaff_x29 + -0xb8) = &UNK_009f5d60;
    lVar1 = *(long *)(unaff_x29 + -0x98);
    uVar4 = *(ulong *)(unaff_x29 + -0xa8);
    if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
      uVar4 = *(ulong *)(unaff_x29 + -0xa0);
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
    *(undefined **)(unaff_x29 + -0xe8) = &UNK_009f5d60;
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
    if (bVar2) {
      func_0x00608730(unaff_x29 + -0xb8);
      func_0x0060986c(unaff_x29 + -0x88,unaff_x29 + -0xb8);
      func_0x005fe1e8(unaff_x29 + -0xe8,1);
      iVar3 = func_0x00609ec8(unaff_x29 + -0x88,unaff_x29 + -0xe8);
      *(undefined **)(unaff_x29 + -0xe8) = &UNK_009f5d60;
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
      *(undefined **)(unaff_x29 + -0x88) = &UNK_009f5d60;
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
      *(undefined **)(unaff_x29 + -0xb8) = &UNK_009f5d60;
      lVar1 = *(long *)(unaff_x29 + -0x98);
      uVar4 = *(ulong *)(unaff_x29 + -0xa8);
      if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
        uVar4 = *(ulong *)(unaff_x29 + -0xa0);
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
      uVar5 = 0;
      if (iVar3 == 0) {
        uVar5 = (uint)(unaff_w19 < 2);
      }
      if (unaff_w19 < 2) {
        return (ulong)uVar5;
      }
      if (iVar3 != 0) {
        return (ulong)uVar5;
      }
      uVar4 = func_0x0068d964(unaff_w19 < 2);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      uVar4 = func_0x0068d964();
      return uVar4;
    }
  }
  return 0;
}

