
void FUN_0042065c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x420660);
  (*pcVar1)();
}

