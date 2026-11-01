
void FUN_0022123c(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
  func_0x007a1f00(0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x221278);
  (*pcVar1)();
}

