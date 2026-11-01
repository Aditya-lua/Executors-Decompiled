
void FUN_0067fcc0(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined8 *param_4)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  param_4[5] = param_2._8_8_;
  param_4[4] = param_2._0_8_;
  param_4[7] = param_3._8_8_;
  param_4[6] = param_3._0_8_;
  uVar2 = param_1[8];
  param_4[9] = param_1[9];
  param_4[8] = uVar2;
  uVar4 = *param_1;
  uVar3 = param_1[3];
  uVar2 = param_1[2];
  param_4[1] = param_1[1];
  *param_4 = uVar4;
  param_4[3] = uVar3;
  param_4[2] = uVar2;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x67fd1c);
  (*pcVar1)();
}

