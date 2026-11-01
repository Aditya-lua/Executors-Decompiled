
void FUN_005217a4(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack000000000000003f;
  
  func_0x007a2810(param_1,0x37,&uStack000000000000003f,&UNK_009ea478,&UNK_009ea448);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5217c4);
  (*pcVar1)();
}

