
bool FUN_0068b5a0(long param_1,long param_2)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  int unaff_w21;
  long unaff_x22;
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
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (unaff_w21 < 1) {
    func_0x005fe1e8(unaff_x29 + -0x50,2);
    iVar3 = func_0x00609ec8();
    if (iVar3 == 0) {
      bVar2 = true;
    }
    else {
      func_0x005fe1e8(&uStack0000000000000060,3);
      iVar3 = func_0x00609ec8();
      bVar2 = iVar3 == 0;
      uStack0000000000000060 = unaff_x22 + 0x10;
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
    }
    *(long *)(unaff_x29 + -0x50) = unaff_x22 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x30);
    uVar4 = *(ulong *)(unaff_x29 + -0x40);
    if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x38);
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
    func_0x005fe1e8(&uStack0000000000000030,1);
    func_0x00607398(&uStack0000000000000060);
    func_0x0060a860(unaff_x29 + -0x50);
    func_0x005fe1e8();
    iVar3 = func_0x00609ec8(unaff_x29 + -0x50);
    bVar2 = iVar3 == 0;
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
    *(long *)(unaff_x29 + -0x50) = unaff_x22 + 0x10;
    lVar1 = *(long *)(unaff_x29 + -0x30);
    uVar4 = *(ulong *)(unaff_x29 + -0x40);
    if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
      uVar4 = *(ulong *)(unaff_x29 + -0x38);
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
    lVar1 = unaff_x22 + 0x10;
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
    if (in_stack_00000050 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      uStack0000000000000030 = lVar1;
      func_0x00611644();
    }
  }
  return bVar2;
}

