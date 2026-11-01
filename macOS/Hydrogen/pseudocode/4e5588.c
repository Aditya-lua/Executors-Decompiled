
void FUN_004e5588(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  func_0x00509580(&uStack0000000000000008);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e55b0);
  (*pcVar1)();
}

