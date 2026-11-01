
undefined1  [16] FUN_0019b43c(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = 0;
  lVar2 = _SecKeyCreateRandomKey(param_1,&uStack0000000000000008);
  if (_uStack0000000000000008 == 0) {
    if (lVar2 == 0) {
      func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cb8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x19b4b4);
      (*pcVar1)();
    }
    uVar3 = 0;
  }
  else {
    uVar3 = 1;
    lVar2 = _uStack0000000000000008;
  }
  _CFRelease(param_1);
  auVar4._8_8_ = lVar2;
  auVar4._0_8_ = uVar3;
  return auVar4;
}

