
void FUN_0003d6ac(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3da40);
  (*pcVar1)();
}

