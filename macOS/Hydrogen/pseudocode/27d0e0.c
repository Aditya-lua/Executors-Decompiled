
bool FUN_0027d0e0(void)

{
  code *pcVar1;
  int iVar2;
  ulong unaff_x22;
  ulong in_stack_00000038;
  
  iVar2 = func_0x002d8acc();
  if ((iVar2 == 1) && (unaff_x22 < in_stack_00000038)) {
    func_0x007a28b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x27d114);
    (*pcVar1)();
  }
  func_0x002c1364();
  return iVar2 != 1;
}

