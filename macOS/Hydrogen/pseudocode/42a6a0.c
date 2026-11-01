
undefined * FUN_0042a6a0(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  undefined8 uVar1;
  int iVar2;
  undefined *puVar3;
  uint *puVar4;
  ulong unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined4 uStack0000000000000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined1 uStack00000000000001b8;
  
  if (unaff_x21 < 0x180) {
    _memcpy(&uStack0000000000000010);
    (&uStack0000000000000010)[unaff_x21] = 0;
    func_0x00462a54(&uStack0000000000000190,&uStack0000000000000010,unaff_x21 + 1);
    uVar1 = in_stack_00000198;
    if ((uStack0000000000000190 & 1) == 0) {
      in_stack_000001a8 = in_stack_00000198;
      in_stack_000001b0 = in_stack_000001a0;
      if (0x17f < param_4) {
        param_2 = param_3;
        goto code_r0x0042a7a4;
      }
      _memcpy(&uStack00000000000001b8,param_3,param_4);
      (&uStack00000000000001b8)[param_4] = 0;
      func_0x00462a54(unaff_x29 + -0x48,&uStack00000000000001b8,param_4 + 1);
      if ((*(uint *)(unaff_x29 + -0x48) & 1) == 0) {
        iVar2 = _linkat(0xfffffffe,uVar1,0xfffffffe,*(undefined8 *)(unaff_x29 + -0x40),0);
        if (iVar2 == -1) {
          puVar4 = (uint *)___error();
          return (undefined *)((ulong)*puVar4 << 0x20 | 2);
        }
        return (undefined *)0x0;
      }
    }
    puVar3 = &UNK_009dae48;
  }
  else {
code_r0x0042a7a4:
    puVar3 = (undefined *)func_0x007a0e0c(param_2);
  }
  return puVar3;
}

