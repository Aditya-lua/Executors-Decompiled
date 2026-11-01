
void FUN_00278594(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x278598);
  (*pcVar1)();
}

