
void FUN_005e1d9c(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000060;
  
  uStack0000000000000060 = param_1;
  func_0x007a2810(&UNK_008b916f,0x24,&uStack0000000000000048,&UNK_009f3378,&UNK_009f3480);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5e1e08);
  (*pcVar1)();
}

