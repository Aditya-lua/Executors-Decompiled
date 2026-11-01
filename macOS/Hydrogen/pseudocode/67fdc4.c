
void FUN_0067fdc4(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x67fe00);
  (*pcVar1)();
}

