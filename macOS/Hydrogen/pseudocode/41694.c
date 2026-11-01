
void FUN_00041694(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined8 *param_4)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  param_4[3] = param_1._8_8_;
  param_4[2] = param_1._0_8_;
  param_4[5] = param_3._8_8_;
  param_4[4] = param_3._0_8_;
  param_4[1] = param_2._8_8_;
  *param_4 = param_2._0_8_;
  *(undefined1 *)((long)param_4 + 0x3f) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x416e8);
  (*pcVar1)();
}

