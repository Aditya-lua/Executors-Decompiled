
void FUN_005f26a0(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f26dc);
  (*pcVar1)();
}

