
undefined8 FUN_0064da3c(ulong param_1,long param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong in_x9;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 in_stack_00000018;
  long *in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 uStack00000000000000b8;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  undefined8 uStack00000000000000e8;
  ulong in_stack_000000f8;
  ulong in_stack_00000100;
  long in_stack_00000108;
  undefined8 uStack0000000000000118;
  ulong in_stack_00000128;
  ulong in_stack_00000130;
  long in_stack_00000138;
  
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
  uStack00000000000000e8 = unaff_x21 + 0x10;
  uVar5 = in_stack_000000f8;
  if (in_stack_00000100 <= in_stack_000000f8) {
    uVar5 = in_stack_00000100;
  }
  if (in_stack_00000108 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000108 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  func_0x006072ac(&uStack00000000000000e8,unaff_x29 + -0xd8);
  func_0x005ffccc(&uStack0000000000000118,&uStack00000000000000e8);
  uStack00000000000000e8 = unaff_x21 + 0x10;
  uVar5 = in_stack_000000f8;
  if (in_stack_00000100 <= in_stack_000000f8) {
    uVar5 = in_stack_00000100;
  }
  if (in_stack_00000108 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000108 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  iVar1 = func_0x00602288(&uStack0000000000000118);
  iVar2 = func_0x00602288();
  if (iVar1 == iVar2) {
    func_0x00603158(&uStack0000000000000118);
  }
  func_0x005fdd18(&uStack00000000000000e8);
  func_0x005fdd18(&uStack00000000000000b8);
  (**(code **)(*in_stack_00000048 + 0x78))
            (&uStack0000000000000058,in_stack_00000048,&uStack0000000000000118);
  (**(code **)(*in_stack_00000048 + 0xd8))
            (&uStack0000000000000088,in_stack_00000048,&uStack0000000000000058);
  func_0x005ffccc(&uStack00000000000000e8,&uStack0000000000000088);
  lVar4 = unaff_x21 + 0x10;
  uVar5 = in_stack_00000098;
  if (in_stack_000000a0 <= in_stack_00000098) {
    uVar5 = in_stack_000000a0;
  }
  uStack0000000000000088 = lVar4;
  if (in_stack_000000a8 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uVar5 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar5 = in_stack_00000070;
  }
  uStack0000000000000058 = lVar4;
  if (in_stack_00000078 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uVar3 = (**(code **)(*in_stack_00000030 + 0x20))();
  (**(code **)(*in_stack_00000040 + 0x10))
            (in_stack_00000040,in_stack_00000048,uVar3,unaff_x29 + -0xd8,unaff_x29 + -0xa8,
             &uStack00000000000000e8,&uStack00000000000000b8);
  lVar4 = (**(code **)(*in_stack_00000040 + 0x28))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000e8);
  uVar3 = (**(code **)(*in_stack_00000040 + 0x30))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000b8,unaff_x22 + lVar4,uVar3,0);
  uVar3 = (**(code **)(*in_stack_00000038 + 0x10))();
  lVar4 = unaff_x21 + 0x10;
  uVar5 = in_stack_000000c8;
  if (in_stack_000000d0 <= in_stack_000000c8) {
    uVar5 = in_stack_000000d0;
  }
  uStack00000000000000b8 = lVar4;
  if (in_stack_000000d8 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_000000d8 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uVar5 = in_stack_000000f8;
  if (in_stack_00000100 <= in_stack_000000f8) {
    uVar5 = in_stack_00000100;
  }
  uStack00000000000000e8 = lVar4;
  if (in_stack_00000108 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000108 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  lVar4 = unaff_x21 + 0x10;
  uVar5 = in_stack_00000128;
  if (in_stack_00000130 <= in_stack_00000128) {
    uVar5 = in_stack_00000130;
  }
  uStack0000000000000118 = lVar4;
  if (in_stack_00000138 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000138 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xd8) = lVar4;
  lVar4 = *(long *)(unaff_x29 + -0xb8);
  uVar5 = *(ulong *)(unaff_x29 + -200);
  if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
    uVar5 = *(ulong *)(unaff_x29 + -0xc0);
  }
  if (lVar4 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xa8) = unaff_x21 + 0x10;
  lVar4 = *(long *)(unaff_x29 + -0x88);
  uVar5 = *(ulong *)(unaff_x29 + -0x98);
  if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
    uVar5 = *(ulong *)(unaff_x29 + -0x90);
  }
  if (lVar4 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  if (unaff_x23 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x23 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return uVar3;
}

