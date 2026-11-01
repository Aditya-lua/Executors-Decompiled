
void FUN_00533d68(void)

{
  code *pcVar1;
  undefined8 in_x5;
  
  func_0x007a2570(in_x5);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

