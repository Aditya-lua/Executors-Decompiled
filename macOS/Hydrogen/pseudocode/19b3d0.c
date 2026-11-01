
undefined1  [16] FUN_0019b3d0(ulong param_1)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  
  if (param_1 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cb8);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x19b41c);
    (*pcVar2)();
  }
  _CFRelease();
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_1;
  return auVar1 << 0x40;
}

