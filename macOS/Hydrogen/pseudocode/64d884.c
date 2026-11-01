
undefined8 FUN_0064d884(void)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x23;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long *in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  long *in_stack_00000048;
  long *in_stack_00000050;
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
  
  *(undefined1 *)(unaff_x27 + 0xe8) = 1;
  func_0x005fef78(unaff_x29 + -0xa8);
  iVar2 = (**(code **)(*in_stack_00000050 + 0x30))();
  if (iVar2 != 0) {
    (**(code **)(*in_stack_00000050 + 0x28))();
  }
  func_0x005fdd18(unaff_x29 + -0xd8);
  func_0x005fdd18(&uStack0000000000000118);
  uVar4 = (**(code **)(*in_stack_00000048 + 0xa0))(in_stack_00000048);
  iVar2 = (**(code **)(*in_stack_00000040 + 0x38))();
  if (iVar2 == 0) {
    func_0x005fe1e8(&uStack00000000000000e8,1);
    uVar5 = (**(code **)(*in_stack_00000048 + 0xa0))();
    func_0x005fe1e8(&uStack0000000000000088,1);
    func_0x00607398(&uStack00000000000000b8,uVar5,&uStack0000000000000088);
    func_0x00602f68(unaff_x29 + -0xd8,in_stack_00000050,&uStack00000000000000e8,
                    &uStack00000000000000b8);
    uStack00000000000000b8 = &UNK_009f5d60;
    uVar8 = in_stack_000000c8;
    if (in_stack_000000d0 <= in_stack_000000c8) {
      uVar8 = in_stack_000000d0;
    }
    if (in_stack_000000d8 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(in_stack_000000d8 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
    uStack0000000000000088 = &UNK_009f5d60;
    uVar8 = in_stack_00000098;
    if (in_stack_000000a0 <= in_stack_00000098) {
      uVar8 = in_stack_000000a0;
    }
    if (in_stack_000000a8 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(in_stack_000000a8 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
    uStack00000000000000e8 = &UNK_009f5d60;
    uVar8 = in_stack_000000f8;
    if (in_stack_00000100 <= in_stack_000000f8) {
      uVar8 = in_stack_00000100;
    }
    if (in_stack_00000108 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(in_stack_00000108 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
  }
  else {
    uVar5 = (**(code **)(*in_stack_00000030 + 0x20))();
    plVar6 = (long *)___dynamic_cast(in_stack_00000040,&UNK_009ff238,&UNK_009ff260,
                                     0xfffffffffffffffe);
    if (plVar6 == (long *)0x0) {
      ___cxa_bad_cast();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x64ddac);
      (*pcVar1)();
    }
    (**(code **)(*plVar6 + 0x10))(&uStack00000000000000e8,plVar6,uVar5,uVar4,unaff_x29 + -0xa8);
    func_0x005ffccc(unaff_x29 + -0xd8,&uStack00000000000000e8);
    uStack00000000000000e8 = &UNK_009f5d60;
    uVar8 = in_stack_000000f8;
    if (in_stack_00000100 <= in_stack_000000f8) {
      uVar8 = in_stack_00000100;
    }
    if (in_stack_00000108 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(in_stack_00000108 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
  }
  func_0x006072ac(&uStack00000000000000e8,unaff_x29 + -0xd8,uVar4);
  func_0x005ffccc(&uStack0000000000000118,&uStack00000000000000e8);
  uStack00000000000000e8 = &UNK_009f5d60;
  uVar8 = in_stack_000000f8;
  if (in_stack_00000100 <= in_stack_000000f8) {
    uVar8 = in_stack_00000100;
  }
  if (in_stack_00000108 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_00000108 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  iVar2 = func_0x00602288(&uStack0000000000000118);
  iVar3 = func_0x00602288(uVar4);
  if (iVar2 == iVar3) {
    func_0x00603158(&uStack0000000000000118,uVar4);
  }
  func_0x005fdd18(&uStack00000000000000e8);
  func_0x005fdd18(&uStack00000000000000b8);
  (**(code **)(*in_stack_00000048 + 0x78))
            (&uStack0000000000000058,in_stack_00000048,&uStack0000000000000118);
  (**(code **)(*in_stack_00000048 + 0xd8))
            (&uStack0000000000000088,in_stack_00000048,&uStack0000000000000058);
  func_0x005ffccc(&uStack00000000000000e8,&uStack0000000000000088);
  uStack0000000000000088 = &UNK_009f5d60;
  uVar8 = in_stack_00000098;
  if (in_stack_000000a0 <= in_stack_00000098) {
    uVar8 = in_stack_000000a0;
  }
  if (in_stack_000000a8 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000058 = &UNK_009f5d60;
  uVar8 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar8 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  uVar4 = (**(code **)(*in_stack_00000030 + 0x20))();
  (**(code **)(*in_stack_00000040 + 0x10))
            (in_stack_00000040,in_stack_00000048,uVar4,unaff_x29 + -0xd8,unaff_x29 + -0xa8,
             &uStack00000000000000e8,&uStack00000000000000b8);
  lVar7 = (**(code **)(*in_stack_00000040 + 0x28))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000e8,in_stack_00000020,lVar7,0);
  uVar4 = (**(code **)(*in_stack_00000040 + 0x30))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000b8,in_stack_00000020 + lVar7,uVar4,0);
  uVar4 = (**(code **)(*in_stack_00000038 + 0x10))();
  uStack00000000000000b8 = &UNK_009f5d60;
  uVar8 = in_stack_000000c8;
  if (in_stack_000000d0 <= in_stack_000000c8) {
    uVar8 = in_stack_000000d0;
  }
  if (in_stack_000000d8 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_000000d8 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  uStack00000000000000e8 = &UNK_009f5d60;
  uVar8 = in_stack_000000f8;
  if (in_stack_00000100 <= in_stack_000000f8) {
    uVar8 = in_stack_00000100;
  }
  if (in_stack_00000108 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_00000108 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000118 = &UNK_009f5d60;
  uVar8 = in_stack_00000128;
  if (in_stack_00000130 <= in_stack_00000128) {
    uVar8 = in_stack_00000130;
  }
  if (in_stack_00000138 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(in_stack_00000138 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xd8) = &UNK_009f5d60;
  lVar7 = *(long *)(unaff_x29 + -0xb8);
  uVar8 = *(ulong *)(unaff_x29 + -200);
  if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
    uVar8 = *(ulong *)(unaff_x29 + -0xc0);
  }
  if (lVar7 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(lVar7 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_009f5d60;
  lVar7 = *(long *)(unaff_x29 + -0x88);
  uVar8 = *(ulong *)(unaff_x29 + -0x98);
  if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
    uVar8 = *(ulong *)(unaff_x29 + -0x90);
  }
  if (lVar7 != 0) {
    if (uVar8 != 0) {
      do {
        *(undefined8 *)(lVar7 + -8 + uVar8 * 8) = 0;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
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
  return uVar4;
}

