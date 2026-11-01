
void FUN_0007a1c4(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7a1c8);
  (*pcVar1)();
}

