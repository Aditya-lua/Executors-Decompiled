
void FUN_005f26b8(long param_1)

{
  code *pcVar1;
  long *unaff_x19;
  
  *unaff_x19 = param_1 + 0xea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f26dc);
  (*pcVar1)();
}

