
void FUN_00413f44(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x413f4c);
  (*pcVar1)();
}

