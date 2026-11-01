
void FUN_005eb230(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  func_0x007a2810(param_1,0x2b,&uStack0000000000000008,&UNK_009f3f98,&UNK_009f4050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5eb250);
  (*pcVar1)();
}

