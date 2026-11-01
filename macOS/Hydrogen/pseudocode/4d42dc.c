
void thunk_FUN_004d4324(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4d4328);
  (*pcVar1)();
}

