
void FUN_00038bc8(void)

{
  code *pcVar1;
  
  func_0x006e63b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x38bdc);
  (*pcVar1)();
}

