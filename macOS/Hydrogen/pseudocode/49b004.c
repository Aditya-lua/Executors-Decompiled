
void FUN_0049b004(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a23d8(param_1,0x22,&UNK_009e3190);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49b12c);
  (*pcVar1)();
}

