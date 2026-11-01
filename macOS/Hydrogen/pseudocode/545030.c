
void FUN_00545030(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  
  func_0x007a2570(param_1,param_2,&UNK_009f0c60);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5450fc);
  (*pcVar1)();
}

