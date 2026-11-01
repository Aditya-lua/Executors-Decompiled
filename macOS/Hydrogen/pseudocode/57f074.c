
void FUN_0057f074(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x57f078);
  (*pcVar1)();
}

