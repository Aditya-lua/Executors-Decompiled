
void FUN_006c7208(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  long in_stack_00000000;
  undefined4 in_stack_00000008;
  
  uVar2 = func_0x006b1354(*unaff_x20);
  if ((int)uVar2 < 0) {
    func_0x006bc388(unaff_x21 + 0xc,"Exceeded constant limit; simplify the code to compile");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6c7304);
    (*pcVar1)();
  }
  func_0x006c5ed4();
  if (0 < *(int *)((long)unaff_x20 + 0xc)) {
    func_0x006b2e98(*unaff_x20,*(int *)(*(long *)(unaff_x21 + 0x28) + 0xc) + 1);
  }
  uVar3 = *unaff_x20;
  func_0x006b401c();
  func_0x006b1ccc(uVar3,0xf);
  func_0x006b24c4(*unaff_x20,uVar2);
  *(undefined4 *)(in_stack_00000000 + 0x484) = in_stack_00000008;
  return;
}

