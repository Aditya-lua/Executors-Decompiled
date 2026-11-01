
void FUN_00594ce8(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000040;
  
  func_0x007a2420(&uStack0000000000000040);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x594d0c);
  (*pcVar1)();
}

