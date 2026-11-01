
void FUN_0061b1f4(undefined8 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar4 = *param_1;
  uVar3 = param_1[3];
  uVar2 = param_1[2];
  param_2[1] = param_1[1];
  *param_2 = uVar4;
  param_2[3] = uVar3;
  param_2[2] = uVar2;
  *(undefined1 *)((long)param_2 + 0x25) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61b24c);
  (*pcVar1)();
}

