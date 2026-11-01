
void FUN_00527350(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52741c);
  (*pcVar1)();
}

