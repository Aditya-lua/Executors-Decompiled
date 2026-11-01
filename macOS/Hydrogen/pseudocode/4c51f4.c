
void FUN_004c51f4(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

