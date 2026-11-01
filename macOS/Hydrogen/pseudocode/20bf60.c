
void FUN_0020bf60(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000048;
  undefined7 uStack0000000000000049;
  
  uVar3 = *param_1;
  func_0x00276e98(&uStack0000000000000010,param_1 + 1);
  in_stack_00000040 = param_1[7];
  uStack0000000000000048 = *(undefined1 *)(param_1 + 8);
  puVar2 = (undefined8 *)func_0x00187bd0(0x48,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x48);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20bff4);
    (*pcVar1)();
  }
  puVar2[5] = in_stack_00000030;
  puVar2[4] = in_stack_00000028;
  puVar2[7] = in_stack_00000040;
  puVar2[6] = in_stack_00000038;
  puVar2[8] = CONCAT71(uStack0000000000000049,uStack0000000000000048);
  puVar2[1] = uStack0000000000000010;
  *puVar2 = uVar3;
  puVar2[3] = in_stack_00000020;
  puVar2[2] = in_stack_00000018;
  return;
}

