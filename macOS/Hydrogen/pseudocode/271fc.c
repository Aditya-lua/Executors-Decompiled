
void FUN_000271fc(undefined8 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)((long)param_1 + 9);
  *(undefined8 *)((long)param_2 + 0x11) = *(undefined8 *)((long)param_1 + 0x11);
  *(undefined8 *)((long)param_2 + 9) = uVar2;
  uVar2 = *param_1;
  param_2[1] = param_1[1];
  *param_2 = uVar2;
  *(undefined1 *)((long)param_2 + 0x19) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x2725c);
  (*pcVar1)();
}

