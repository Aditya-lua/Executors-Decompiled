
void FUN_007b1c9c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b1ca0);
  (*pcVar1)();
}

