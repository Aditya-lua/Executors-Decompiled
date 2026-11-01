
void FUN_0041e2a4(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  
  _uStack0000000000000010 = 0xa3c000;
  _uStack0000000000000020 = &uStack0000000000000010;
  uStack0000000000000018 = func_0x0041c61c(&uStack0000000000000020);
  if (uStack0000000000000018 != 0) {
    *(BADSPACEBASE **)(unaff_x29 + -0x30) = register0x00000008;
    *(undefined **)(unaff_x29 + -0x28) = &DAT_003f40f4;
    *(undefined8 **)(unaff_x29 + -0x20) = &uStack0000000000000018;
    *(undefined **)(unaff_x29 + -0x18) =
         &__ZN60__LT_std__io__error__Error_u20_as_u20_core__fmt__Display_GT_3fmt17h9733ac9ba32fce92E
    ;
    _uStack0000000000000020 = &UNK_009da6a8;
    in_stack_00000038 = 2;
    in_stack_00000040 = 0;
    in_stack_00000030 = unaff_x29 + -0x30;
    in_stack_00000028 = 2;
    func_0x007a2420(&uStack0000000000000020,&UNK_009da6c8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x41e330);
    (*pcVar1)();
  }
  return;
}

