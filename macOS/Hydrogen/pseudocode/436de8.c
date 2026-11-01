
void FUN_00436de8(void)

{
  code *pcVar1;
  
  func_0x0079ffa8(0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x436edc);
  (*pcVar1)();
}

