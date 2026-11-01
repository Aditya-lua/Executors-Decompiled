
void FUN_00542ebc(void)

{
  code *pcVar1;
  
  func_0x007a2334(&UNK_009ecdb0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar1)();
}

