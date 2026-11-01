
void FUN_006159f4(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x615a1c);
  (*pcVar1)();
}

