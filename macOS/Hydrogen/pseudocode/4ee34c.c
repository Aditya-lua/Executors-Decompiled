
void FUN_004ee34c(void)

{
  code *pcVar1;
  
  func_0x007a23d8();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4ee660);
  (*pcVar1)();
}

