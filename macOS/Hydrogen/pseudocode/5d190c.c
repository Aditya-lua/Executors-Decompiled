
void FUN_005d190c(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5d1910);
  (*pcVar1)();
}

