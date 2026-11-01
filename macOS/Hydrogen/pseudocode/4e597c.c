
void FUN_004e597c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e5980);
  (*pcVar1)();
}

