
void FUN_005f256c(undefined8 *param_1,undefined1 param_2 [16],undefined8 *param_3)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  *(long *)((long)param_3 + 0x32) = param_2._8_8_;
  *(long *)((long)param_3 + 0x2a) = param_2._0_8_;
  uVar6 = param_1[5];
  uVar5 = param_1[4];
  uVar4 = param_1[1];
  uVar3 = *param_1;
  uVar2 = param_1[2];
  param_3[3] = param_1[3];
  param_3[2] = uVar2;
  param_3[5] = uVar6;
  param_3[4] = uVar5;
  param_3[1] = uVar4;
  *param_3 = uVar3;
  *(undefined1 *)((long)param_3 + 0x3a) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f25cc);
  (*pcVar1)();
}

