
void FUN_00249b0c(void)

{
  code *pcVar1;
  
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x249b20);
  (*pcVar1)();
}

