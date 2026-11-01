
void FUN_0052b018(void)

{
  code *pcVar1;
  
  func_0x007a1f18();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52b020);
  (*pcVar1)();
}

