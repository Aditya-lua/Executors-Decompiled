
void FUN_00270050(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x270054);
  (*pcVar1)();
}

