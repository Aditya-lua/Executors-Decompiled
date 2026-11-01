
void FUN_0056a328(void)

{
  code *pcVar1;
  
  func_0x007a1f18();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar1)();
}

