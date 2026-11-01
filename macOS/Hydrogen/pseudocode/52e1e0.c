
void FUN_0052e1e0(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52e2f0);
  (*pcVar1)();
}

