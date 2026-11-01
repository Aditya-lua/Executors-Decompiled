
undefined8 FUN_000946f0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  
  lVar2 = func_0x007b7e00(param_3);
  if (lVar2 == 10) {
    uVar3 = func_0x007b6ee0();
    if ((uVar3 & 0xffff0000) == 0x100000) {
      uVar4 = func_0x007b6520();
      auVar5 = func_0x007b6e40();
      if (auVar5._0_8_ == 1) {
        uVar1 = func_0x007b6500(uVar4,auVar5._8_8_,0);
        if ((uVar1 & 0xffffffdf) == 0x41) {
          func_0x007b7460();
          return 1;
        }
        if ((uVar1 & 0xffffffdf) == 0x56) {
          func_0x007b70e0();
          return 1;
        }
      }
    }
  }
  uVar4 = _objc_msgSendSuper2();
  return uVar4;
}

