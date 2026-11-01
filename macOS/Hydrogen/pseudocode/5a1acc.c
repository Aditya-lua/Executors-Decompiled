
void FUN_005a1acc(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5a1ad4);
  (*pcVar1)();
}

