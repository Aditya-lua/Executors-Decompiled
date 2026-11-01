
void FUN_00036518(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3651c);
  (*pcVar1)();
}

