
void FUN_001b3050(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1b3054);
  (*pcVar1)();
}

