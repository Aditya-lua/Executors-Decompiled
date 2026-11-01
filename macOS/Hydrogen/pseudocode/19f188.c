
void FUN_0019f188(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1,0x22,&UNK_009c2268);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19f19c);
  (*pcVar1)();
}

