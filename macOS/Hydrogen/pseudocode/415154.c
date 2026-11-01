
void FUN_00415154(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  func_0x007a2810(param_1,0x2b,&uStack0000000000000008,param_4,param_5 + 0x1f8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x415168);
  (*pcVar1)();
}

