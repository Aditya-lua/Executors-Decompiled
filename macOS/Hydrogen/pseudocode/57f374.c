
void FUN_0057f374(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a247c(param_1,0x58,&UNK_009f05b8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x57f388);
  (*pcVar1)();
}

