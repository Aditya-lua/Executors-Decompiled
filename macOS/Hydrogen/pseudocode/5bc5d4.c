
void FUN_005bc5d4(long param_1)

{
  code *pcVar1;
  int iVar2;
  long unaff_x19;
  long unaff_x21;
  long unaff_x29;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  
  _memcpy(*(long *)(param_1 + 8) + unaff_x21);
  *(long *)(param_1 + 0x10) = unaff_x21 + unaff_x19;
  *(BADSPACEBASE **)(unaff_x29 + -0x30) = register0x00000008;
  *(undefined **)(unaff_x29 + -0x28) = &DAT_005bd394;
  uStack0000000000000020 = &UNK_008b4fb8;
  in_stack_00000028 = 1;
  in_stack_00000038 = 1;
  in_stack_00000040 = 0;
  in_stack_00000030 = unaff_x29 + -0x30;
  iVar2 = func_0x0046849c(param_1,&UNK_009f20e8,&uStack0000000000000020);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008b4f10,0x2b,&uStack0000000000000020,&UNK_009f2130,&UNK_009f21b0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5bc5b4);
    (*pcVar1)();
  }
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  return;
}

