
void FUN_00484d70(void)

{
  code *pcVar1;
  
  func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

