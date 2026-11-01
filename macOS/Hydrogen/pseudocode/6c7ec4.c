
void FUN_006c7ec4(void)

{
  code *pcVar1;
  ulong uVar2;
  long unaff_x20;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  uVar2 = func_0x006b2794();
  if ((uVar2 & 1) == 0) {
    func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6c832c);
    (*pcVar1)();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

