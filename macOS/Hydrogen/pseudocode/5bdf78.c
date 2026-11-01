
void FUN_005bdf78(undefined *param_1)

{
  long lVar1;
  code *pcVar2;
  ulong uVar3;
  ulong unaff_x20;
  long *unaff_x22;
  long unaff_x26;
  long unaff_x28;
  long *in_stack_00000000;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000050;
  undefined *puStack0000000000000068;
  
  while( true ) {
    puStack0000000000000068 = param_1 + 0xdd8;
    _uStack0000000000000030 = &UNK_008b4fb8;
    uStack0000000000000050 = 0;
    uVar3 = func_0x0046849c(&uStack0000000000000010);
    if ((uVar3 & 1) != 0) {
      func_0x007a2810(&UNK_008b4f10,0x2b,&uStack0000000000000030,&UNK_009f2130,&UNK_009f21b0);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5be034);
      (*pcVar2)();
    }
    if (unaff_x28 == unaff_x26) break;
    *unaff_x22 = unaff_x28 + 0x30;
    in_stack_00000028 = unaff_x28;
    if ((ulong)(uStack0000000000000010 - in_stack_00000020) < unaff_x20) {
      func_0x007af5a0(&uStack0000000000000010,in_stack_00000020);
    }
    lVar1 = in_stack_00000020;
    _memcpy(in_stack_00000018 + in_stack_00000020);
    in_stack_00000020 = lVar1 + unaff_x20;
    param_1 = &UNK_005c5000;
    unaff_x28 = unaff_x28 + 0x30;
  }
  in_stack_00000000[1] = in_stack_00000018;
  *in_stack_00000000 = uStack0000000000000010;
  in_stack_00000000[2] = in_stack_00000020;
  return;
}

