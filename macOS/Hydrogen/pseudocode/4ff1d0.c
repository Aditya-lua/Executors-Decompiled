
void FUN_004ff1d0(code *param_1)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long in_x9;
  long in_x10;
  undefined8 *unaff_x19;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined1 auVar3 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  auVar1._8_8_ = unaff_x22;
  auVar1._0_8_ = unaff_x23;
  auVar3 = (*param_1)(in_x9 + (in_x10 - 1U & 0xfffffffffffffff0) + 0x10);
  if (auVar3 != auVar1) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4ff278);
    (*pcVar2)();
  }
  func_0x00523f08();
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = in_stack_00000010;
  return;
}

