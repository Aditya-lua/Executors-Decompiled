
void FUN_006c7edc(undefined8 param_1,long param_2)

{
  code *pcVar1;
  
  func_0x006bc388(param_1,param_2 + 0x5c3);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x6c832c);
  (*pcVar1)();
}

