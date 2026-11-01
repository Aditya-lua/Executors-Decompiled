
void FUN_00067a28(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x67a2c);
  (*pcVar1)();
}

