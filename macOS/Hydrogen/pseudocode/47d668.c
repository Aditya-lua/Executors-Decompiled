
void FUN_0047d668(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  
  func_0x007a2570(param_1,param_2,param_3 + 0x100);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x47da74);
  (*pcVar1)();
}

