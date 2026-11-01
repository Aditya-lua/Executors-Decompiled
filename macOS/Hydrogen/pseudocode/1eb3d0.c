
void thunk_FUN_001eb3ec(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1eb3f0);
  (*pcVar1)();
}

