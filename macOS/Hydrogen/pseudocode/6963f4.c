
undefined8 FUN_006963f4(undefined8 param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x21;
  long *unaff_x23;
  long *unaff_x24;
  long *unaff_x25;
  long *unaff_x28;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000070;
  long lStack0000000000000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  
  uStack0000000000000070 = param_1;
  lStack0000000000000078 = param_2;
  if (param_2 == 0) {
    lVar1 = 0;
  }
  else {
    lVar1 = func_0x006115d0();
  }
  in_stack_00000080 = lVar1;
  (**(code **)(*unaff_x25 + 0xa0))();
  plVar2 = (long *)(**(code **)(*unaff_x23 + 0x10))();
  (**(code **)(*plVar2 + 0x18))(&uStack0000000000000088);
  func_0x00602288(&uStack0000000000000088);
  uStack0000000000000088 = &UNK_009f5d60;
  uVar4 = in_stack_00000098;
  if (in_stack_000000a0 <= in_stack_00000098) {
    uVar4 = in_stack_000000a0;
  }
  if (in_stack_000000a8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  (**(code **)(*unaff_x28 + 0x38))();
  *(undefined1 *)(unaff_x25 + 0x1d) = 1;
  func_0x005fef78(&uStack0000000000000088,lVar1);
  uVar3 = (**(code **)(*unaff_x24 + 0x10))();
  plVar2 = (long *)(**(code **)(*unaff_x23 + 0x18))();
  (**(code **)(*plVar2 + 0x10))
            (&uStack0000000000000038,plVar2,in_stack_00000030,&uStack0000000000000088);
  func_0x00602560(&uStack0000000000000038,in_stack_00000010,uVar3,0);
  uStack0000000000000038 = &UNK_009f5d60;
  uVar4 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar4 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000088 = &UNK_009f5d60;
  uVar4 = in_stack_00000098;
  if (in_stack_000000a0 <= in_stack_00000098) {
    uVar4 = in_stack_000000a0;
  }
  if (in_stack_000000a8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000a8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (lVar1 != 0) {
    if (unaff_x21 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + unaff_x21) = 0;
        unaff_x21 = unaff_x21 + -1;
      } while (unaff_x21 != 0);
    }
    func_0x00611644(lVar1);
  }
  return uVar3;
}

