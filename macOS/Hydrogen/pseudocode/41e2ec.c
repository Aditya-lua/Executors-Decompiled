
void FUN_0041e2ec(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 in_x9;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  *(undefined8 *)(unaff_x29 + -0x30) = param_1;
  *(undefined8 *)(unaff_x29 + -0x28) = in_x9;
  *(undefined1 **)(unaff_x29 + -0x20) = &uStack0000000000000018;
  *(undefined **)(unaff_x29 + -0x18) =
       &__ZN60__LT_std__io__error__Error_u20_as_u20_core__fmt__Display_GT_3fmt17h9733ac9ba32fce92E;
  _uStack0000000000000020 = &UNK_009da6a8;
  uStack0000000000000038 = 2;
  uStack0000000000000040 = 0;
  lStack0000000000000030 = unaff_x29 + -0x30;
  uStack0000000000000028 = 2;
  _uStack0000000000000018 = param_2;
  func_0x007a2420(&uStack0000000000000020,&UNK_009da6c8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x41e330);
  (*pcVar1)();
}

