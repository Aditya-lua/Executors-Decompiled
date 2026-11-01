
void FUN_0004bef0(void)

{
  code *pcVar1;
  
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4bf00);
  (*pcVar1)();
}

