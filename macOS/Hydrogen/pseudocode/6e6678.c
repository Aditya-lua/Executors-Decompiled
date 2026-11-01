
long FUN_006e6678(int param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x21;
  long *unaff_x22;
  long unaff_x23;
  undefined1 auVar4 [16];
  
  if ((param_1 < 1) || (unaff_x21 = func_0x006e2ce4(), unaff_x21 != 0)) {
    lVar2 = *unaff_x22;
    if (lVar2 != 0) {
      unaff_x23 = 0;
      do {
        iVar1 = _strcmp(lVar2,unaff_x21);
        if (iVar1 == 0) {
          return unaff_x23;
        }
        lVar2 = unaff_x22[unaff_x23 + 1];
        unaff_x23 = unaff_x23 + 1;
      } while (lVar2 != 0);
    }
    func_0x006e3a84();
    func_0x006e63b0();
    return unaff_x23;
  }
  lVar2 = 5;
  auVar4 = func_0x006e694c();
  iVar1 = func_0x006e21f8();
  if (iVar1 < 1) {
    if (param_4 != (undefined8 *)0x0) {
      if (lVar2 == 0) {
        *param_4 = 0;
        return 0;
      }
      uVar3 = _strlen(lVar2);
      *param_4 = uVar3;
      return lVar2;
    }
  }
  else {
    lVar2 = func_0x006e2ce4(auVar4._0_8_,auVar4._8_8_,param_4);
    if (lVar2 == 0) {
      auVar4 = func_0x006e694c(auVar4._0_8_,auVar4._8_8_,5);
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
  }
  return lVar2;
}

