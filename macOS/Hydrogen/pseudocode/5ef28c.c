
void FUN_005ef28c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5ef290);
  (*pcVar1)();
}

