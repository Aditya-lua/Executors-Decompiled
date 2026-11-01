
void FUN_006c7e70(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  uVar2 = func_0x006c5a34();
  func_0x006b1ccc(*unaff_x19,3);
  uVar3 = func_0x006b2784(*unaff_x19);
  func_0x006b1ccc(*unaff_x19,3);
  uVar4 = func_0x006b2794(*unaff_x19,uVar2,uVar3);
  if ((uVar4 & 1) == 0) {
    func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6c832c);
    (*pcVar1)();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

