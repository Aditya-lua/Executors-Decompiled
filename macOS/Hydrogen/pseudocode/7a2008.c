
void FUN_007a2008(void)

{
  code *pcVar1;
  
  FUN_007a241c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7a2018);
  (*pcVar1)();
}

