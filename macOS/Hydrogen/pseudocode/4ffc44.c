
void FUN_004ffc44(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4ffc48);
  (*pcVar1)();
}

