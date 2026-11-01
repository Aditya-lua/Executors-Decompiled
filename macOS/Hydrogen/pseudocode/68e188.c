
void FUN_0068e188(long param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  ushort uVar3;
  undefined2 uVar4;
  int iVar5;
  ulong uVar6;
  long unaff_x19;
  undefined4 unaff_w22;
  long unaff_x24;
  long lVar7;
  long unaff_x29;
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
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
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
  *(long *)(unaff_x29 + -0x80) = unaff_x24 + 0x10;
  lVar2 = *(long *)(unaff_x29 + -0x60);
  uVar6 = *(ulong *)(unaff_x29 + -0x70);
  if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
    uVar6 = *(ulong *)(unaff_x29 + -0x68);
  }
  if (lVar2 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  lVar2 = unaff_x19 + 0xa0;
  *(undefined8 *)(unaff_x19 + 0xa8) = 0;
  func_0x0068ea34(lVar2,unaff_w22,0);
  if (*(int *)(unaff_x19 + 0x90) == 0) {
    lVar7 = 0;
    do {
      uVar4 = *(undefined2 *)(&UNK_008c2a04 + lVar7 * 2);
      func_0x0060b3d0();
      func_0x0068e7f8(lVar2,uVar4);
      lVar7 = lVar7 + 1;
    } while (lVar7 != 0xdb7);
  }
  else {
    func_0x005fe1e8(&uStack0000000000000060);
    func_0x00607398(&uStack0000000000000090);
    func_0x00609afc(unaff_x29 + -0x80,&uStack0000000000000090,1);
    lVar7 = unaff_x24 + 0x10;
    uVar6 = in_stack_000000a0;
    if (in_stack_000000a8 <= in_stack_000000a0) {
      uVar6 = in_stack_000000a8;
    }
    uStack0000000000000090 = lVar7;
    if (in_stack_000000b0 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(in_stack_000000b0 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    uVar6 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar6 = in_stack_00000078;
    }
    uStack0000000000000060 = lVar7;
    if (in_stack_00000080 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    func_0x00609afc(&uStack0000000000000090);
    lVar7 = 0;
    do {
      uVar3 = *(ushort *)(&UNK_008c2a04 + lVar7 * 2);
      iVar5 = func_0x0060b3d0();
      func_0x0068e7f8(lVar2,uVar3);
      uVar1 = 0;
      if ((uint)uVar3 <= (iVar5 * 2 & 0x1fffeU)) {
        uVar1 = (uint)uVar3;
      }
      func_0x0068e7f8(lVar2,uVar3,unaff_x29 + -0x80,&uStack0000000000000090,
                      iVar5 * 2 - uVar1 & 0xffff);
      lVar7 = lVar7 + 1;
    } while (lVar7 != 0xdb7);
    lVar2 = unaff_x24 + 0x10;
    uVar6 = in_stack_000000a0;
    if (in_stack_000000a8 <= in_stack_000000a0) {
      uVar6 = in_stack_000000a8;
    }
    uStack0000000000000090 = lVar2;
    if (in_stack_000000b0 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(in_stack_000000b0 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x29 + -0x80) = lVar2;
    lVar2 = *(long *)(unaff_x29 + -0x60);
    uVar6 = *(ulong *)(unaff_x29 + -0x70);
    if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
      uVar6 = *(ulong *)(unaff_x29 + -0x68);
    }
    if (lVar2 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lVar2 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
  }
  return;
}

