
void FUN_005ef744(undefined1 param_1 [16],undefined8 *param_2)

{
  code *pcVar1;
  long unaff_x29;
  
  *(long *)(unaff_x29 + -0x38) = param_1._8_8_;
  *(long *)(unaff_x29 + -0x40) = param_1._0_8_;
  param_2[1] = 0;
  param_2[2] = 0;
  *param_2 = 0;
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5ef780);
  (*pcVar1)();
}

