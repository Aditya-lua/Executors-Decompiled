
void FUN_001a8584(long param_1,undefined1 param_2 [16])

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long lVar2;
  long lVar3;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  
  uStack0000000000000038 = param_2._8_8_;
  uStack0000000000000030 = param_2._0_8_;
  while( true ) {
    lVar2 = in_stack_00000028;
    uStack0000000000000040 = *(undefined8 *)(unaff_x21 + 0x18);
    if (param_1 == unaff_x23) {
      unaff_x19[2] = uStack0000000000000038;
      unaff_x19[1] = uStack0000000000000030;
      unaff_x19[3] = uStack0000000000000040;
      *unaff_x19 = 1;
      if (in_stack_00000028 != 0) {
        lVar2 = in_stack_00000020;
        lVar3 = in_stack_00000028;
        do {
          func_0x0016ad38(lVar2);
          lVar2 = lVar2 + 0x20;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      if (uStack0000000000000018 != 0) {
        func_0x00187bd4(in_stack_00000020,uStack0000000000000018 << 5,8);
      }
      return;
    }
    *(long *)(unaff_x29 + -0x50) = param_1;
    *(undefined8 *)(unaff_x22 + 0x10) = uStack0000000000000038;
    *(undefined8 *)(unaff_x22 + 8) = uStack0000000000000030;
    *(undefined8 *)(unaff_x22 + 0x18) = uStack0000000000000040;
    if (in_stack_00000028 == uStack0000000000000018) {
      func_0x001d8840(&uStack0000000000000018);
    }
    puVar1 = (undefined8 *)(in_stack_00000020 + lVar2 * 0x20);
    uVar4 = *(undefined8 *)(unaff_x29 + -0x50);
    uVar6 = *(undefined8 *)(unaff_x29 + -0x38);
    uVar5 = *(undefined8 *)(unaff_x29 + -0x40);
    puVar1[1] = *(undefined8 *)(unaff_x29 + -0x48);
    *puVar1 = uVar4;
    puVar1[3] = uVar6;
    puVar1[2] = uVar5;
    in_stack_00000028 = lVar2 + 1;
    if (in_stack_00000008 <= in_stack_00000010) break;
    func_0x001b87e8(&uStack0000000000000050);
    uStack0000000000000038 = *(undefined8 *)(unaff_x21 + 0x10);
    uStack0000000000000030 = *(undefined8 *)(unaff_x21 + 8);
    param_1 = uStack0000000000000050;
  }
  unaff_x19[2] = in_stack_00000020;
  unaff_x19[1] = uStack0000000000000018;
  unaff_x19[3] = in_stack_00000028;
  *unaff_x19 = 0;
  return;
}

