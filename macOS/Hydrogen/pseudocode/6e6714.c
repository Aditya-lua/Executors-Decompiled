
long FUN_006e6714(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *in_x3;
  undefined1 auVar4 [16];
  
  lVar3 = 5;
  auVar4 = func_0x006e694c();
  iVar1 = func_0x006e21f8();
  if (iVar1 < 1) {
    if (in_x3 != (undefined8 *)0x0) {
      if (lVar3 == 0) {
        *in_x3 = 0;
        return 0;
      }
      uVar2 = _strlen(lVar3);
      *in_x3 = uVar2;
      return lVar3;
    }
  }
  else {
    lVar3 = func_0x006e2ce4(auVar4._0_8_,auVar4._8_8_,in_x3);
    if (lVar3 == 0) {
      auVar4 = func_0x006e694c(auVar4._0_8_,auVar4._8_8_,5);
      lVar3 = func_0x006e2ce4();
      if (lVar3 != 0) {
        return lVar3;
      }
      auVar4 = func_0x006e694c(auVar4._0_8_,auVar4._8_8_,5);
      uVar2 = auVar4._0_8_;
      func_0x006e3d18(uVar2,0xffffd8f0,auVar4._8_8_);
      iVar1 = func_0x006e21f8(uVar2,0xffffffff);
      if (iVar1 == 0) {
        func_0x006e1d54(uVar2,0xfffffffe);
        func_0x006e4118(uVar2,0,0);
        func_0x006e2154(uVar2,0xffffffff);
        func_0x006e45a4(uVar2,0xffffd8f0,auVar4._8_8_);
        return 1;
      }
      return 0;
    }
  }
  return lVar3;
}

