
void FUN_00533d98(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

