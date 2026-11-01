
void thunk_FUN_001fc4c8(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1fc4cc);
  (*pcVar1)();
}

