
void FUN_007b6298(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b629c);
  (*pcVar1)();
}

