
void FUN_0004951c(long param_1)

{
  code *pcVar1;
  long *unaff_x19;
  
  *unaff_x19 = param_1 + 0xec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = (long)&UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49564);
  (*pcVar1)();
}

