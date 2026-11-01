
void FUN_004e3e24(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = 0;
  func_0x007a1f00(0,param_2,&UNK_009e7fe0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
  (*pcVar1)();
}

