
void FUN_005153fc(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x515400);
  (*pcVar1)();
}

