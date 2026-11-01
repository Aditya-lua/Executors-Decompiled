
void FUN_00594cd0(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack0000000000000040;
  long lStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  lStack0000000000000050 = unaff_x29 + -0x50;
  uStack0000000000000058 = 1;
  uStack0000000000000060 = 0;
  func_0x007a2420(&uStack0000000000000040,&UNK_009f1590);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x594d0c);
  (*pcVar1)();
}

