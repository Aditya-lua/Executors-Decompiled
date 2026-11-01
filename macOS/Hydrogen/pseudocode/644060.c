
void FUN_00644060(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  
  ___cxa_throw(param_1,param_2,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x644138);
  (*pcVar1)();
}

