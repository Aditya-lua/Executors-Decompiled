
undefined8 FUN_004620c0(void)

{
  ulong uVar1;
  code *pcVar2;
  long unaff_x21;
  long lVar3;
  long unaff_x23;
  long unaff_x24;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  
  if (unaff_x24 == 0) {
    lVar3 = *(long *)(unaff_x21 + 8);
    func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
  }
  else {
    lVar3 = *(long *)(unaff_x21 + 8);
    do {
      uStack0000000000000020 = &UNK_007fc120;
      in_stack_00000028 = 1;
      in_stack_00000038 = 1;
      in_stack_00000040 = 0;
      in_stack_00000030 = (long)register0x00000008 + 0x50;
      uVar1 = func_0x0046849c();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      unaff_x24 = unaff_x24 + -1;
    } while (unaff_x24 != 0);
    func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
  }
  if (uStack0000000000000020 != (undefined *)0x0) {
    pcVar2 = *(code **)(lVar3 + 0x18);
    do {
      lVar3 = in_stack_00000038;
      uVar1 = (*pcVar2)();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      if ((lVar3 != 0) && (uVar1 = (*pcVar2)(), (uVar1 & 1) != 0)) {
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
      in_stack_00000040 = 0;
      in_stack_00000030 = (long)register0x00000008 + 0x50;
      uVar1 = func_0x0046849c();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      unaff_x23 = unaff_x23 + -1;
    } while (unaff_x23 != 0);
  }
  return 0;
}

