
long FUN_004305a4(long param_1)

{
  code *pcVar1;
  bool in_ZR;
  bool in_CY;
  ulong in_x9;
  undefined1 uStack0000000000000018;
  
  if (!in_CY || in_ZR) {
    return param_1 - (in_x9 & 1);
  }
  _uStack0000000000000018 = &UNK_009db9f8;
  func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000018,&UNK_009d93d8,&UNK_009dba28);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x430630);
  (*pcVar1)();
}

