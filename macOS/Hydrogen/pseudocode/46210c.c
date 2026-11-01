
undefined8 FUN_0046210c(ulong param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  code *pcVar3;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  while( true ) {
    if ((param_1 & 1) != 0) {
      return 1;
    }
    unaff_x24 = unaff_x24 + -1;
    if (unaff_x24 == 0) break;
    uStack0000000000000020 = (undefined *)unaff_x19;
    in_stack_00000028 = unaff_x27;
    in_stack_00000030 = unaff_x28;
    in_stack_00000038 = unaff_x27;
    param_1 = func_0x0046849c();
  }
  func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
  if (uStack0000000000000020 != (undefined *)0x0) {
    pcVar3 = *(code **)(unaff_x21 + 0x18);
    do {
      lVar1 = in_stack_00000038;
      uVar2 = (*pcVar3)();
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      if ((lVar1 != 0) && (uVar2 = (*pcVar3)(), (uVar2 & 1) != 0)) {
        return 1;
      }
      func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
    } while (uStack0000000000000020 != (undefined *)0x0);
  }
  if (unaff_x23 != 0) {
    do {
      uStack0000000000000020 = &UNK_007fc120;
      in_stack_00000028 = 1;
      in_stack_00000038 = 1;
      in_stack_00000030 = (long)register0x00000008 + 0x50;
      uVar2 = func_0x0046849c();
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      unaff_x23 = unaff_x23 + -1;
    } while (unaff_x23 != 0);
  }
  return 0;
}

