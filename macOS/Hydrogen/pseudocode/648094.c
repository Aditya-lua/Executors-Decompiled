
void FUN_00648094(undefined8 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar4 = *param_1;
  uVar3 = param_1[3];
  uVar2 = param_1[2];
  param_2[1] = param_1[1];
  *param_2 = uVar4;
  param_2[3] = uVar3;
  param_2[2] = uVar2;
  uVar2 = *(undefined8 *)((long)param_1 + 0x49);
  *(undefined8 *)((long)param_2 + 0x51) = *(undefined8 *)((long)param_1 + 0x51);
  *(undefined8 *)((long)param_2 + 0x49) = uVar2;
  uVar6 = param_1[9];
  uVar5 = param_1[8];
  uVar4 = param_1[5];
  uVar3 = param_1[4];
  uVar2 = param_1[6];
  param_2[7] = param_1[7];
  param_2[6] = uVar2;
  param_2[9] = uVar6;
  param_2[8] = uVar5;
  param_2[5] = uVar4;
  param_2[4] = uVar3;
  *(undefined1 *)((long)param_2 + 0x59) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x648100);
  (*pcVar1)();
}

