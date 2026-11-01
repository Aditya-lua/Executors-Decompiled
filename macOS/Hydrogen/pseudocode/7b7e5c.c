
void FUN_007b7e5c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b7e60);
  (*pcVar1)();
}

