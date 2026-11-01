
void FUN_007b6594(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b6598);
  (*pcVar1)();
}

