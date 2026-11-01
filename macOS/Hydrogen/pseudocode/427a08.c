
void FUN_00427a08(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  code *pcVar1;
  undefined1 uStack0000000000000040;
  
  func_0x007a2810(param_1,0x2b,&uStack0000000000000040,param_4 + 0x3d8,&UNK_009dac20);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x427b94);
  (*pcVar1)();
}

