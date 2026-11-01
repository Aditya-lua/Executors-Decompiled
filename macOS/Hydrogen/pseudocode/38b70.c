
void FUN_00038b70(void)

{
  code *pcVar1;
  
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x38bdc);
  (*pcVar1)();
}

