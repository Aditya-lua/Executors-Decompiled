
void FUN_00436dc4(void)

{
  code *pcVar1;
  undefined8 in_x9;
  long unaff_x29;
  undefined1 uStack0000000000000098;
  undefined1 uStack00000000000000a8;
  
  *(undefined1 **)(unaff_x29 + -0x88) = &uStack00000000000000a8;
  *(undefined8 *)(unaff_x29 + -0x80) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  func_0x0079ffa8(0,&UNK_008884c8,&uStack0000000000000098,unaff_x29 + -0x98,&UNK_009dc078);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x436edc);
  (*pcVar1)();
}

