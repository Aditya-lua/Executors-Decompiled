
void FUN_0042d148(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 *unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  
  uStack0000000000000048 = *(undefined8 *)(param_1 + 0x28);
  uStack0000000000000040 = *(undefined8 *)(param_1 + 0x20);
  _uStack0000000000000020 = param_2;
  uStack0000000000000030 = param_3;
  func_0x0046849c(&uStack0000000000000008,&UNK_009d9a80,&uStack0000000000000020);
  uStack0000000000000028 = in_stack_00000010;
  _uStack0000000000000020 = uStack0000000000000008;
  uStack0000000000000030 = in_stack_00000018;
  unaff_x20[1] = in_stack_00000010;
  *unaff_x20 = uStack0000000000000008;
  unaff_x20[2] = in_stack_00000018;
  uVar5 = *unaff_x20;
  uVar1 = unaff_x20[1];
  uVar2 = unaff_x20[2];
  *unaff_x20 = 0;
  unaff_x20[1] = 1;
  unaff_x20[2] = 0;
  puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x42d1e4);
    (*pcVar3)();
  }
  *puVar4 = uVar5;
  puVar4[1] = uVar1;
  puVar4[2] = uVar2;
  return;
}

