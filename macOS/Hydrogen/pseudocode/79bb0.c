
void FUN_00079bb0(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x79bb4);
  (*pcVar1)();
}

