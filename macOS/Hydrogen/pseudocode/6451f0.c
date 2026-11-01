
bool FUN_006451f0(void)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long *unaff_x21;
  long *unaff_x22;
  uint uVar4;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000070;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  long in_stack_00000090;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 uStack00000000000000d0;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  long in_stack_000000f0;
  
  iVar2 = func_0x00609ec8();
  if (iVar2 < 0) {
    func_0x005fe1e8();
    iVar2 = func_0x00609ec8();
    if ((iVar2 < 0) || (iVar2 = func_0x00609ec8(), -1 < iVar2)) {
      uVar4 = 1;
    }
    else {
      func_0x005fe1e8(unaff_x29 + -0x80,1);
      uVar3 = func_0x00609ec8();
      uVar4 = (uint)(uVar3 >> 0x1f) & 1;
      *(undefined **)(unaff_x29 + -0x80) = &UNK_009f5d60;
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
    }
    uVar3 = in_stack_00000010;
    if (in_stack_00000018 <= in_stack_00000010) {
      uVar3 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)((in_stack_00000020 - 8) + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    if (uVar4 == 0) {
      func_0x0060aaf0(unaff_x29 + -0x80);
      func_0x00608730();
      func_0x0060986c(unaff_x29 + -0xb0);
      uVar3 = in_stack_00000010;
      if (in_stack_00000018 <= in_stack_00000010) {
        uVar3 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)((in_stack_00000020 - 8) + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      func_0x00608730();
      func_0x0060986c(&uStack00000000000000d0);
      if (in_stack_00000018 <= in_stack_00000010) {
        in_stack_00000010 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (in_stack_00000010 != 0) {
          do {
            *(undefined8 *)((in_stack_00000020 - 8) + in_stack_00000010 * 8) = 0;
            in_stack_00000010 = in_stack_00000010 - 1;
          } while (in_stack_00000010 != 0);
        }
        func_0x00611644();
      }
      (**(code **)(*unaff_x22 + 0x38))();
      (**(code **)(*unaff_x21 + 0xd8))(&uStack0000000000000070);
      func_0x0060986c(&uStack00000000000000a0,&uStack0000000000000070);
      iVar2 = func_0x00609ec8();
      uStack00000000000000a0 = &UNK_009f5d60;
      uVar3 = in_stack_000000b0;
      if (in_stack_000000b8 <= in_stack_000000b0) {
        uVar3 = in_stack_000000b8;
      }
      if (in_stack_000000c0 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_000000c0 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      uStack0000000000000070 = &UNK_009f5d60;
      uVar3 = in_stack_00000080;
      if (in_stack_00000088 <= in_stack_00000080) {
        uVar3 = in_stack_00000088;
      }
      if (in_stack_00000090 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_00000090 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
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
      if (in_stack_00000020 <= in_stack_00000018) {
        in_stack_00000018 = in_stack_00000020;
      }
      if (in_stack_00000028 != 0) {
        if (in_stack_00000018 != 0) {
          do {
            *(undefined8 *)(in_stack_00000028 + -8 + in_stack_00000018 * 8) = 0;
            in_stack_00000018 = in_stack_00000018 - 1;
          } while (in_stack_00000018 != 0);
        }
        func_0x00611644();
      }
      uStack00000000000000d0 = &UNK_009f5d60;
      uVar3 = in_stack_000000e0;
      if (in_stack_000000e8 <= in_stack_000000e0) {
        uVar3 = in_stack_000000e8;
      }
      if (in_stack_000000f0 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_000000f0 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      *(undefined **)(unaff_x29 + -0xb0) = &UNK_009f5d60;
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
      *(undefined **)(unaff_x29 + -0x80) = &UNK_009f5d60;
      lVar1 = *(long *)(unaff_x29 + -0x60);
      uVar3 = *(ulong *)(unaff_x29 + -0x70);
      if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
        uVar3 = *(ulong *)(unaff_x29 + -0x68);
      }
      if (lVar1 == 0) {
        return iVar2 == 0;
      }
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
      return iVar2 == 0;
    }
  }
  return false;
}

