
void FUN_0079b364(undefined8 param_1)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uStack0000000000000010 = 1;
  lStack0000000000000018 = unaff_x29 + -0x28;
  uStack0000000000000020 = 0;
  uStack0000000000000028 = 0;
  _uStack0000000000000008 = param_1;
  FUN_007a241c(&uStack0000000000000008,&UNK_009c2aa0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x79b38c);
  (*pcVar1)();
}

