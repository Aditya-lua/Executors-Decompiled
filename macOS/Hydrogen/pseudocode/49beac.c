
void FUN_0049beac(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
  (*pcVar1)();
}

