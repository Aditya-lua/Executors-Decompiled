
void FUN_0070f440(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  
  if (in_stack_00000030 < 0) {
    func_0x00017634();
  }
  else {
    in_stack_00000008 = in_stack_00000028;
    in_stack_00000000 = in_stack_00000020;
    in_stack_00000010 = in_stack_00000030;
  }
  *param_1 = &UNK_00a1df28;
  uVar2 = *unaff_x20;
  param_1[2] = unaff_x20[1];
  param_1[1] = uVar2;
  param_1[4] = in_stack_00000008;
  param_1[3] = in_stack_00000000;
  param_1[5] = in_stack_00000010;
  ___cxa_throw(param_1,&DAT_00a1df40,&DAT_0070f508);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x70f4b4);
  (*pcVar1)();
}

