
void FUN_006c5070(undefined8 param_1,long param_2)

{
  code *pcVar1;
  
  func_0x006bc388(param_1,param_2 + 0x938);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x6c50b0);
  (*pcVar1)();
}

