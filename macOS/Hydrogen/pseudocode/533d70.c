
void FUN_00533d70(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  
  func_0x007a2570(param_1,param_2,&UNK_009eb960);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

