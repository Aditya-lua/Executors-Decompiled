
void FUN_007248b4(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined7 uStack0000000000000038;
  
  if (_uStack0000000000000038 < 0) {
    func_0x00017634(&uStack0000000000000010,in_stack_00000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = in_stack_00000028;
    in_stack_00000020 = _uStack0000000000000038;
  }
  *param_1 = &UNK_00a1df28;
  uVar2 = *unaff_x19;
  param_1[2] = unaff_x19[1];
  param_1[1] = uVar2;
  param_1[4] = in_stack_00000018;
  param_1[3] = uStack0000000000000010;
  param_1[5] = in_stack_00000020;
  in_stack_00000018 = 0;
  in_stack_00000020 = 0;
  uStack0000000000000010 = 0;
  ___cxa_throw(param_1,&DAT_00a1df40,&DAT_0070f508);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x724940);
  (*pcVar1)();
}

