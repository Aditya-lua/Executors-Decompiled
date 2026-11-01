
void FUN_00499bf4(void)

{
  code *pcVar1;
  
  func_0x007a23d8();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x499c54);
  (*pcVar1)();
}

