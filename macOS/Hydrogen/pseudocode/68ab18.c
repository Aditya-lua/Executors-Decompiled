
void FUN_0068ab18(void)

{
  code *pcVar1;
  
  func_0x00017514();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x68ab6c);
  (*pcVar1)();
}

