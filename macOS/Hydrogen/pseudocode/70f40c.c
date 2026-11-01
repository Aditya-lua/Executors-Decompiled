
void FUN_0070f40c(undefined8 *param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined7 uStack0000000000000030;
  char cStack0000000000000037;
  undefined1 *puStack0000000000000038;
  undefined1 uStack0000000000000060;
  
  puStack0000000000000038 = &uStack0000000000000060;
  func_0x00798c18(&uStack0000000000000020,param_2,&uStack0000000000000060);
  puVar2 = (undefined8 *)___cxa_allocate_exception(0x30);
  if (cStack0000000000000037 < '\0') {
    func_0x00017634();
  }
  else {
    in_stack_00000008 = in_stack_00000028;
    in_stack_00000000 = uStack0000000000000020;
    in_stack_00000010 = CONCAT17(cStack0000000000000037,uStack0000000000000030);
  }
  *puVar2 = &UNK_00a1df28;
  uVar3 = *param_1;
  puVar2[2] = param_1[1];
  puVar2[1] = uVar3;
  puVar2[4] = in_stack_00000008;
  puVar2[3] = in_stack_00000000;
  puVar2[5] = in_stack_00000010;
  ___cxa_throw(puVar2,&DAT_00a1df40,&DAT_0070f508);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x70f4b4);
  (*pcVar1)();
}

