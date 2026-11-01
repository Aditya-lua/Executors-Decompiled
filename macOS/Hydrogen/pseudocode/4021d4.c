
void thunk_FUN_00402204(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x402208);
  (*pcVar1)();
}

