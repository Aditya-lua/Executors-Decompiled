
void FUN_00211d60(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  
  func_0x007a1f00(1,2,param_3 + 0x4a8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x211d8c);
  (*pcVar1)();
}

