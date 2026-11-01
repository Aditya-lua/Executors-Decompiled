
void FUN_004f17a0(long param_1)

{
  code *pcVar1;
  
  func_0x007a23d8(param_1 + 0x952,99,&UNK_009e8258);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4f17b8);
  (*pcVar1)();
}

