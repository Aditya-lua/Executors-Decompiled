
void FUN_00484f64(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

