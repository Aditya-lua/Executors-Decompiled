
void FUN_004f3fe4(long param_1)

{
  code *pcVar1;
  
  func_0x007a247c(param_1 + 0xc73,0x35,&UNK_009e83d0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4f4038);
  (*pcVar1)();
}

