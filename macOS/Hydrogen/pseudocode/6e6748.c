
long FUN_006e6748(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  
  lVar2 = func_0x006e2ce4();
  if (lVar2 != 0) {
    return lVar2;
  }
  auVar4 = func_0x006e694c();
  lVar2 = func_0x006e2ce4();
  if (lVar2 != 0) {
    return lVar2;
  }
  auVar4 = func_0x006e694c(auVar4._0_8_,auVar4._8_8_,5);
  uVar3 = auVar4._0_8_;
  func_0x006e3d18(uVar3,0xffffd8f0,auVar4._8_8_);
  iVar1 = func_0x006e21f8(uVar3,0xffffffff);
  if (iVar1 == 0) {
    func_0x006e1d54(uVar3,0xfffffffe);
    func_0x006e4118(uVar3,0,0);
    func_0x006e2154(uVar3,0xffffffff);
    func_0x006e45a4(uVar3,0xffffd8f0,auVar4._8_8_);
    return 1;
  }
  return 0;
}

