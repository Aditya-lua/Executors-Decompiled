
void FUN_0061de48(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  func_0x00017634();
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61de74);
  (*pcVar1)();
}

