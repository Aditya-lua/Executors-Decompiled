
void FUN_0061b1f8(undefined1 param_1 [16],undefined1 param_2 [16],undefined8 *param_3)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  param_3[1] = param_2._8_8_;
  *param_3 = param_2._0_8_;
  param_3[3] = param_1._8_8_;
  param_3[2] = param_1._0_8_;
  *(undefined1 *)((long)param_3 + 0x25) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61b24c);
  (*pcVar1)();
}

