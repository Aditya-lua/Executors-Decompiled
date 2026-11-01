
void FUN_00484c74(void)

{
  code *pcVar1;
  
  func_0x007a1f18();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

