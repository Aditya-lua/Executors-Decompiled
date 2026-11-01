
void FUN_006158d4(long param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar2 = *(undefined8 *)(param_1 + 1099);
  *(undefined8 *)((long)param_2 + 0x33) = *(undefined8 *)(param_1 + 0x453);
  *(undefined8 *)((long)param_2 + 0x2b) = uVar2;
  uVar6 = *(undefined8 *)(param_1 + 0x448);
  uVar5 = *(undefined8 *)(param_1 + 0x440);
  uVar4 = *(undefined8 *)(param_1 + 0x428);
  uVar3 = *(undefined8 *)(param_1 + 0x420);
  uVar2 = *(undefined8 *)(param_1 + 0x430);
  param_2[3] = *(undefined8 *)(param_1 + 0x438);
  param_2[2] = uVar2;
  param_2[5] = uVar6;
  param_2[4] = uVar5;
  param_2[1] = uVar4;
  *param_2 = uVar3;
  *(undefined1 *)((long)param_2 + 0x3b) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61593c);
  (*pcVar1)();
}

