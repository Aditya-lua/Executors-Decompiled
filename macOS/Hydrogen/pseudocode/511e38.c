
void FUN_00511e38(void)

{
  code *pcVar1;
  
  func_0x007a2570();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x511e94);
  (*pcVar1)();
}

