
void FUN_00043778(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined8 *param_5)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar4 = param_1[1];
  uVar3 = *param_1;
  uVar2 = param_1[2];
  param_5[3] = param_1[3];
  param_5[2] = uVar2;
  param_5[5] = param_4._8_8_;
  param_5[4] = param_4._0_8_;
  param_5[1] = uVar4;
  *param_5 = uVar3;
  *(undefined1 *)((long)param_5 + 0x39) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x437d0);
  (*pcVar1)();
}

