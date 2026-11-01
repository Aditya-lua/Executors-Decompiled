
void FUN_0049be34(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  *(undefined8 **)(unaff_x29 + -0x28) = &uStack0000000000000020;
  *(undefined **)(unaff_x29 + -0x20) = &UNK_009e2ad8;
  iVar2 = func_0x00476678(&uStack0000000000000018,unaff_x29 + -0x28);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0089f5a4,0x37);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
    (*pcVar1)();
  }
  unaff_x19[1] = in_stack_00000028;
  *unaff_x19 = uStack0000000000000020;
  unaff_x19[2] = in_stack_00000030;
  return;
}

