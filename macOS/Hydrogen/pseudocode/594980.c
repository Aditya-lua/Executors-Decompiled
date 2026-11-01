
void FUN_00594980(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x594984);
  (*pcVar1)();
}

