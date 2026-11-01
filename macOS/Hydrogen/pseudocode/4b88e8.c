
ulong FUN_004b88e8(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined1 uStack0000000000000010;
  ulong uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  
  uStack0000000000000018 = 0;
  _uStack0000000000000010 = param_1;
  iVar2 = func_0x0046849c(&uStack0000000000000010,&UNK_009e5628,param_2);
  if (iVar2 == 0) {
    if ((uStack0000000000000018 & 3) == 1) {
      puVar3 = (undefined8 *)(uStack0000000000000018 - 1);
      uVar4 = *puVar3;
      puVar5 = *(undefined8 **)(uStack0000000000000018 + 7);
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(uVar4);
      }
      if (puVar5[1] != 0) {
        func_0x00187bd4(uVar4,puVar5[1],puVar5[2]);
      }
      func_0x00187bd4(puVar3,0x18,8);
    }
    uStack0000000000000018 = 0;
  }
  else if (uStack0000000000000018 == 0) {
    uStack0000000000000020 = &UNK_009e5658;
    in_stack_00000028 = 1;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    in_stack_00000030 = 8;
    func_0x007a2420(&uStack0000000000000020,&UNK_009e5668);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4b8948);
    (*pcVar1)();
  }
  return uStack0000000000000018;
}

