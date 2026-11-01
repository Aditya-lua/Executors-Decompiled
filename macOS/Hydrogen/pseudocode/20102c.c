
void FUN_0020102c(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a1f00(param_1,0x11);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x201038);
  (*pcVar1)();
}

