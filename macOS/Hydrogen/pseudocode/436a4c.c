
void FUN_00436a4c(void)

{
  code *pcVar1;
  undefined8 in_x9;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x90) = 1;
  *(undefined8 *)(unaff_x29 + -0x88) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x80) = 1;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  func_0x007a2420();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x436edc);
  (*pcVar1)();
}

