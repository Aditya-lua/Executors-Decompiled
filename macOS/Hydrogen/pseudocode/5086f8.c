
void FUN_005086f8(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5086fc);
  (*pcVar1)();
}

