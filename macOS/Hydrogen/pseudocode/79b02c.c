
void FUN_0079b02c(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  
  lStack0000000000000028 = in_x9 + 0x740;
  uStack0000000000000020 = param_1;
  iVar2 = func_0x0019f594();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x11,&UNK_009c17a0,&UNK_009c1770);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x79b0a0);
    (*pcVar1)();
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = in_stack_00000018;
  func_0x0019fb28();
  return;
}

