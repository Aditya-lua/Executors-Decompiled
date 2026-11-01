
void FUN_004014a0(long param_1)

{
  code *pcVar1;
  
  func_0x007a247c(param_1 + 0x2a4,0x30,&UNK_009d94f0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4014b8);
  (*pcVar1)();
}

