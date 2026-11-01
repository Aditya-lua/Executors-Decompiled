
undefined1  [16] FUN_0022cf08(long param_1)

{
  code *pcVar1;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000010;
  
  if (param_1 == 0) {
    func_0x007a1f18(8,0x1d0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22cf68);
    (*pcVar1)();
  }
  _memcpy(param_1,&uStack0000000000000010,0x1d0);
  func_0x00187bd4();
  auVar2._8_8_ = &UNK_009c86b8;
  auVar2._0_8_ = param_1;
  return auVar2;
}

