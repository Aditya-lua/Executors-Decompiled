
void FUN_007b1714(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7b1718);
  (*pcVar1)();
}

