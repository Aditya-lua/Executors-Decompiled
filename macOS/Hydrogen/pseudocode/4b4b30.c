
void FUN_004b4b30(long param_1)

{
  code *pcVar1;
  long unaff_x23;
  undefined1 uStack0000000000000040;
  long lStack0000000000000048;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000088;
  
  lStack0000000000000048 = param_1 + 0x23c;
  _uStack0000000000000040 = &uStack0000000000000070;
  _uStack0000000000000088 = &UNK_009e53a8;
  *(undefined8 *)(unaff_x23 + 8) = 1;
  *(undefined1 **)(unaff_x23 + 0x10) = &uStack0000000000000040;
  *(undefined8 *)(unaff_x23 + 0x18) = 1;
  *(undefined8 *)(unaff_x23 + 0x20) = 0;
  func_0x007a2420(&uStack0000000000000088,&UNK_009e53b8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b4b88);
  (*pcVar1)();
}

