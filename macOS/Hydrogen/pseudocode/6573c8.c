
undefined8 FUN_006573c8(long param_1)

{
  undefined1 in_ZR;
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long in_x9;
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
  long in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 uStack00000000000000c8;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 uStack00000000000000f8;
  ulong in_stack_00000108;
  ulong in_stack_00000110;
  long in_stack_00000118;
  undefined8 uStack0000000000000128;
  ulong in_stack_00000138;
  ulong in_stack_00000140;
  long in_stack_00000148;
  undefined8 uStack0000000000000158;
  ulong in_stack_00000168;
  ulong in_stack_00000170;
  long in_stack_00000178;
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  uVar5 = in_stack_00000108;
  if (in_stack_00000110 <= in_stack_00000108) {
    uVar5 = in_stack_00000110;
  }
  if (in_stack_00000118 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000118 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000058 = (undefined *)(unaff_x21 + 0x10);
  uVar5 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar5 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)((in_stack_00000078 - 8) + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  func_0x006072ac(&uStack0000000000000058,unaff_x29 + -0xd8);
  func_0x005ffccc(&uStack0000000000000158,&uStack0000000000000058);
  uStack0000000000000058 = (undefined *)(unaff_x21 + 0x10);
  uVar5 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar5 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)((in_stack_00000078 - 8) + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  iVar1 = func_0x00602288(&uStack0000000000000158);
  iVar2 = func_0x00602288();
  if (iVar1 == iVar2) {
    func_0x00603158(&uStack0000000000000158);
  }
  func_0x005fdd18(&uStack0000000000000128);
  func_0x005fdd18(&uStack00000000000000f8);
  (**(code **)(*in_stack_00000048 + 0x78))
            (&uStack0000000000000058,in_stack_00000048,&uStack0000000000000158);
  (**(code **)(*in_stack_00000048 + 0xd8))
            (&uStack00000000000000c8,in_stack_00000048,&uStack0000000000000058);
  func_0x005ffccc(&uStack0000000000000128,&uStack00000000000000c8);
  lVar4 = unaff_x21 + 0x10;
  uVar5 = in_stack_000000d8;
  if (in_stack_000000e0 <= in_stack_000000d8) {
    uVar5 = in_stack_000000e0;
  }
  uStack00000000000000c8 = lVar4;
  if (in_stack_000000e8 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e8 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000058 = &UNK_00a09a40;
  uVar5 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar5 = in_stack_000000a8;
  }
  in_stack_00000090 = lVar4;
  if (in_stack_000000b0 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  in_stack_00000060 = unaff_x21 + 0x10;
  uVar5 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar5 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uVar3 = (**(code **)(*in_stack_00000030 + 0x20))();
  (**(code **)(*in_stack_00000040 + 0x10))
            (in_stack_00000040,in_stack_00000048,uVar3,unaff_x29 + -0xd8,unaff_x29 + -0xa8,
             &uStack0000000000000128,&uStack00000000000000f8);
  lVar4 = (**(code **)(*in_stack_00000040 + 0x28))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack0000000000000128);
  uVar3 = (**(code **)(*in_stack_00000040 + 0x30))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000f8,unaff_x22 + lVar4,uVar3,0);
  uVar3 = (**(code **)(*in_stack_00000038 + 0x10))();
  lVar4 = unaff_x21 + 0x10;
  if (in_stack_00000110 <= in_stack_00000108) {
    in_stack_00000108 = in_stack_00000110;
  }
  uStack00000000000000f8 = lVar4;
  if (in_stack_00000118 != 0) {
    if (in_stack_00000108 != 0) {
      do {
        *(undefined8 *)(in_stack_00000118 + -8 + in_stack_00000108 * 8) = 0;
        in_stack_00000108 = in_stack_00000108 - 1;
      } while (in_stack_00000108 != 0);
    }
    func_0x00611644();
  }
  uVar5 = in_stack_00000138;
  if (in_stack_00000140 <= in_stack_00000138) {
    uVar5 = in_stack_00000140;
  }
  uStack0000000000000128 = lVar4;
  if (in_stack_00000148 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000148 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  lVar4 = unaff_x21 + 0x10;
  uVar5 = in_stack_00000168;
  if (in_stack_00000170 <= in_stack_00000168) {
    uVar5 = in_stack_00000170;
  }
  uStack0000000000000158 = lVar4;
  if (in_stack_00000178 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000178 + -8 + uVar5 * 8) = 0;
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

