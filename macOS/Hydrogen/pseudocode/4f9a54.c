
void thunk_FUN_004f9ad0(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4f9ad4);
  (*pcVar1)();
}

