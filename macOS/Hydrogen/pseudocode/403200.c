
void FUN_00403200(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  long lStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 uStack00000000000000e8;
  
  _uStack00000000000000c8 = &UNK_009d9508;
  uStack00000000000000d0 = 1;
  lStack00000000000000d8 = unaff_x29 + -0x60;
  uStack00000000000000e0 = 0;
  uStack00000000000000e8 = 0;
  func_0x007a2420(&uStack00000000000000c8,&UNK_009d9518);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x403230);
  (*pcVar1)();
}

