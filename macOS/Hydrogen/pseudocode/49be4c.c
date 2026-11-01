
void FUN_0049be4c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  iVar2 = func_0x00476678();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0089f5a4,0x37);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
    (*pcVar1)();
  }
  unaff_x19[1] = in_stack_00000028;
  *unaff_x19 = in_stack_00000020;
  unaff_x19[2] = in_stack_00000030;
  return;
}

