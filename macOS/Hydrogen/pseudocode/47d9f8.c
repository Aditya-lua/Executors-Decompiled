
void FUN_0047d9f8(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a1f18(param_1,0x28);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x47da74);
  (*pcVar1)();
}

