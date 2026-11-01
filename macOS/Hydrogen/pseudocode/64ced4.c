
undefined1  [16] FUN_0064ced4(void)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  long unaff_x19;
  ulong uVar6;
  long *unaff_x23;
  long *unaff_x24;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000028;
  long *in_stack_00000030;
  long *in_stack_00000050;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  
  func_0x005fef78();
  uVar1 = (**(code **)(*in_stack_00000050 + 0xc0))(in_stack_00000050,0);
  uVar6 = (ulong)uVar1;
  uVar5 = unaff_x23[0xb];
  lVar2 = unaff_x23[0xc];
  if (uVar5 != uVar6) {
    if (lVar2 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + uVar5) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    if (uVar1 == 0) {
      lVar2 = 0;
    }
    else {
      lVar2 = func_0x006115d0(uVar6);
    }
  }
  unaff_x23[0xb] = uVar6;
  unaff_x23[0xc] = lVar2;
  unaff_x23[10] = -1;
  func_0x005fef78(&uStack0000000000000088,unaff_x23[0x10],unaff_x23[0xf],0,1);
  (**(code **)(*in_stack_00000030 + 0x20))
            (&uStack0000000000000058,in_stack_00000030,in_stack_00000050,in_stack_00000028,
             &uStack0000000000000088,unaff_x23 + 0x17);
  func_0x00602560(&uStack0000000000000058,unaff_x23[0xc],unaff_x23[0xb],0);
  uStack0000000000000058 = &UNK_009f5d60;
  uVar5 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar5 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  plVar3 = (long *)(**(code **)(*unaff_x24 + 0xa0))();
  uVar4 = (**(code **)(*unaff_x23 + 0xa0))();
  auVar7 = (**(code **)(*unaff_x24 + 0xa8))();
  auVar7 = (**(code **)(*plVar3 + 0x50))
                     (plVar3,uVar4,auVar7._0_8_,auVar7._8_8_,unaff_x23[0xc],unaff_x23[0xb],
                      unaff_x23[0x10],unaff_x23[0xf]);
  uStack0000000000000088 = &UNK_009f5d60;
  uVar5 = in_stack_00000098;
  if (in_stack_000000a0 <= in_stack_00000098) {
    uVar5 = in_stack_000000a0;
  }
  if (in_stack_000000a8 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_009f5d60;
  lVar2 = *(long *)(unaff_x29 + -0x88);
  uVar5 = *(ulong *)(unaff_x29 + -0x98);
  if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
    uVar5 = *(ulong *)(unaff_x29 + -0x90);
  }
  if (lVar2 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  if (unaff_x26 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x26 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return auVar7;
}

