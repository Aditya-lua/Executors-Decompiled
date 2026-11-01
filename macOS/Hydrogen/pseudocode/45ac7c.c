
void FUN_0045ac7c(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
  func_0x007a297c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x45acd8);
  (*pcVar1)();
}

