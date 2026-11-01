
void thunk_FUN_004e5cf0(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e5cf4);
  (*pcVar1)();
}

