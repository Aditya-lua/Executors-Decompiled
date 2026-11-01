
undefined8 FUN_00658c30(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 in_stack_00000018;
  long *in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a8;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  long in_stack_000000c8;
  undefined8 uStack00000000000000d8;
  ulong in_stack_000000e8;
  ulong in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000108;
  ulong in_stack_00000118;
  ulong in_stack_00000120;
  long in_stack_00000128;
  undefined8 uStack0000000000000138;
  ulong in_stack_00000148;
  ulong in_stack_00000150;
  long in_stack_00000158;
  
  iVar2 = (**(code **)(*in_stack_00000040 + 0x38))();
  if (iVar2 == 0) {
    func_0x005fe1e8(&uStack0000000000000058,1);
    uVar4 = (**(code **)(*in_stack_00000048 + 0xa0))();
    func_0x005fe1e8(&uStack00000000000000d8,1);
    func_0x00607398(&uStack0000000000000108,uVar4,&uStack00000000000000d8);
    func_0x00602f68(unaff_x29 + -0xd8,in_stack_00000050,&uStack0000000000000058,
                    &uStack0000000000000108);
    uStack0000000000000108 = &UNK_009f5d60;
    uVar7 = in_stack_00000118;
    if (in_stack_00000120 <= in_stack_00000118) {
      uVar7 = in_stack_00000120;
    }
    if (in_stack_00000128 != 0) {
      if (uVar7 != 0) {
        do {
          *(undefined8 *)(in_stack_00000128 + -8 + uVar7 * 8) = 0;
          uVar7 = uVar7 - 1;
        } while (uVar7 != 0);
      }
      func_0x00611644();
    }
    uStack00000000000000d8 = &UNK_009f5d60;
    uVar7 = in_stack_000000e8;
    if (in_stack_000000f0 <= in_stack_000000e8) {
      uVar7 = in_stack_000000f0;
    }
    if (in_stack_000000f8 != 0) {
      if (uVar7 != 0) {
        do {
          *(undefined8 *)(in_stack_000000f8 + -8 + uVar7 * 8) = 0;
          uVar7 = uVar7 - 1;
        } while (uVar7 != 0);
      }
      func_0x00611644();
    }
    uStack0000000000000058 = &UNK_009f5d60;
    uVar7 = in_stack_00000068;
    if (in_stack_00000070 <= in_stack_00000068) {
      uVar7 = in_stack_00000070;
    }
    if (in_stack_00000078 != 0) {
      if (uVar7 != 0) {
        do {
          *(undefined8 *)(in_stack_00000078 + -8 + uVar7 * 8) = 0;
          uVar7 = uVar7 - 1;
        } while (uVar7 != 0);
      }
      func_0x00611644();
    }
  }
  else {
    uVar4 = (**(code **)(*in_stack_00000030 + 0x20))();
    plVar5 = (long *)___dynamic_cast(in_stack_00000040,&UNK_00a06e50,&UNK_009ff260,
                                     0xfffffffffffffffe);
    if (plVar5 == (long *)0x0) {
      ___cxa_bad_cast();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x659118);
      (*pcVar1)();
    }
    (**(code **)(*plVar5 + 0x10))(&uStack0000000000000058,plVar5,uVar4,param_1,unaff_x29 + -0xa8);
    func_0x005ffccc(unaff_x29 + -0xd8,&uStack0000000000000058);
    uStack0000000000000058 = &UNK_009f5d60;
    uVar7 = in_stack_00000068;
    if (in_stack_00000070 <= in_stack_00000068) {
      uVar7 = in_stack_00000070;
    }
    if (in_stack_00000078 != 0) {
      if (uVar7 != 0) {
        do {
          *(undefined8 *)(in_stack_00000078 + -8 + uVar7 * 8) = 0;
          uVar7 = uVar7 - 1;
        } while (uVar7 != 0);
      }
      func_0x00611644();
    }
  }
  func_0x006072ac(&uStack0000000000000058,unaff_x29 + -0xd8,param_1);
  func_0x005ffccc(&uStack0000000000000138,&uStack0000000000000058);
  uStack0000000000000058 = &UNK_009f5d60;
  uVar7 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar7 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  iVar2 = func_0x00602288(&uStack0000000000000138);
  iVar3 = func_0x00602288(param_1);
  if (iVar2 == iVar3) {
    func_0x00603158(&uStack0000000000000138,param_1);
  }
  func_0x005fdd18(&uStack0000000000000108);
  func_0x005fdd18(&uStack00000000000000d8);
  (**(code **)(*in_stack_00000048 + 0x78))
            (&uStack0000000000000058,in_stack_00000048,&uStack0000000000000138);
  (**(code **)(*in_stack_00000048 + 0xd8))
            (&uStack00000000000000a8,in_stack_00000048,&uStack0000000000000058);
  func_0x005ffccc(&uStack0000000000000108,&uStack00000000000000a8);
  uStack00000000000000a8 = &UNK_009f5d60;
  uVar7 = in_stack_000000b8;
  if (in_stack_000000c0 <= in_stack_000000b8) {
    uVar7 = in_stack_000000c0;
  }
  if (in_stack_000000c8 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_000000c8 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000058 = &UNK_00a09a70;
  uVar7 = in_stack_00000088;
  if (in_stack_00000090 <= in_stack_00000088) {
    uVar7 = in_stack_00000090;
  }
  if (in_stack_00000098 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_00000098 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uVar7 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar7 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uVar4 = (**(code **)(*in_stack_00000030 + 0x20))();
  (**(code **)(*in_stack_00000040 + 0x10))
            (in_stack_00000040,in_stack_00000048,uVar4,unaff_x29 + -0xd8,unaff_x29 + -0xa8,
             &uStack0000000000000108,&uStack00000000000000d8);
  lVar6 = (**(code **)(*in_stack_00000040 + 0x28))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack0000000000000108);
  uVar4 = (**(code **)(*in_stack_00000040 + 0x30))(in_stack_00000040,in_stack_00000048);
  func_0x00602560(&uStack00000000000000d8,unaff_x22 + lVar6,uVar4,0);
  uVar4 = (**(code **)(*in_stack_00000038 + 0x10))();
  uStack00000000000000d8 = &UNK_009f5d60;
  uVar7 = in_stack_000000e8;
  if (in_stack_000000f0 <= in_stack_000000e8) {
    uVar7 = in_stack_000000f0;
  }
  if (in_stack_000000f8 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_000000f8 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000108 = &UNK_009f5d60;
  uVar7 = in_stack_00000118;
  if (in_stack_00000120 <= in_stack_00000118) {
    uVar7 = in_stack_00000120;
  }
  if (in_stack_00000128 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_00000128 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000138 = &UNK_009f5d60;
  uVar7 = in_stack_00000148;
  if (in_stack_00000150 <= in_stack_00000148) {
    uVar7 = in_stack_00000150;
  }
  if (in_stack_00000158 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(in_stack_00000158 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xd8) = &UNK_009f5d60;
  lVar6 = *(long *)(unaff_x29 + -0xb8);
  uVar7 = *(ulong *)(unaff_x29 + -200);
  if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
    uVar7 = *(ulong *)(unaff_x29 + -0xc0);
  }
  if (lVar6 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar6 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_009f5d60;
  lVar6 = *(long *)(unaff_x29 + -0x88);
  uVar7 = *(ulong *)(unaff_x29 + -0x98);
  if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
    uVar7 = *(ulong *)(unaff_x29 + -0x90);
  }
  if (lVar6 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar6 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
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

