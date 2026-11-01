
undefined8 FUN_004621ec(void)

{
  long lVar1;
  ulong uVar2;
  code *unaff_x20;
  long unaff_x23;
  undefined1 uStack000000000000001c;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  
  while( true ) {
    lVar1 = in_stack_00000038;
    if (uStack0000000000000020 == (undefined *)0x0) {
      if (unaff_x23 != 0) {
        do {
          in_stack_00000058 =
               &__ZN43__LT_char_u20_as_u20_core__fmt__Display_GT_3fmt17ha5099e7a97893038E;
          uStack0000000000000020 = &UNK_007fc120;
          in_stack_00000028 = 1;
          in_stack_00000038 = 1;
          in_stack_00000040 = 0;
          in_stack_00000030 = &uStack0000000000000050;
          uStack0000000000000050 = &uStack000000000000001c;
          uVar2 = func_0x0046849c();
          if ((uVar2 & 1) != 0) {
            return 1;
          }
          unaff_x23 = unaff_x23 + -1;
        } while (unaff_x23 != 0);
      }
      return 0;
    }
    uVar2 = (*unaff_x20)();
    if ((uVar2 & 1) != 0) {
      return 1;
    }
    if ((lVar1 != 0) && (uVar2 = (*unaff_x20)(), (uVar2 & 1) != 0)) break;
    func_0x0046daac(&uStack0000000000000020,&uStack0000000000000050);
  }
  return 1;
}

