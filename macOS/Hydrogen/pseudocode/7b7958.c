
void FUN_007b7958(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b795c);
  (*pcVar1)();
}

