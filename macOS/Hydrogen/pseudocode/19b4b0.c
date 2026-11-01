
void FUN_0019b4b0(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19b4b4);
  (*pcVar1)();
}

