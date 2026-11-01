
long FUN_006e6644(undefined8 param_1,undefined8 param_2,long param_3,long *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  long unaff_x23;
  undefined1 auVar6 [16];
  
  plVar5 = param_4;
  if (((param_3 != 0) && (iVar1 = func_0x006e21f8(param_1,param_2), iVar1 < 1)) ||
     (param_3 = func_0x006e2ce4(param_1,param_2,0), param_3 != 0)) {
    lVar2 = *param_4;
    if (lVar2 != 0) {
      unaff_x23 = 0;
      do {
        iVar1 = _strcmp(lVar2,param_3);
        if (iVar1 == 0) {
          return unaff_x23;
        }
        lVar2 = param_4[unaff_x23 + 1];
        unaff_x23 = unaff_x23 + 1;
      } while (lVar2 != 0);
    }
    uVar3 = func_0x006e3a84(param_1,"invalid option \'%s\'");
    func_0x006e63b0(param_1,param_2,uVar3);
    return unaff_x23;
  }
  lVar2 = 5;
  auVar6 = func_0x006e694c(param_1,param_2);
  iVar1 = func_0x006e21f8();
  if (iVar1 < 1) {
    if (plVar5 != (long *)0x0) {
      if (lVar2 == 0) {
        *plVar5 = 0;
        return 0;
      }
      lVar4 = _strlen(lVar2);
      *plVar5 = lVar4;
      return lVar2;
    }
  }
  else {
    lVar2 = func_0x006e2ce4(auVar6._0_8_,auVar6._8_8_,plVar5);
    if (lVar2 == 0) {
      auVar6 = func_0x006e694c(auVar6._0_8_,auVar6._8_8_,5);
      lVar2 = func_0x006e2ce4();
      if (lVar2 != 0) {
        return lVar2;
      }
      auVar6 = func_0x006e694c(auVar6._0_8_,auVar6._8_8_,5);
      uVar3 = auVar6._0_8_;
      func_0x006e3d18(uVar3,0xffffd8f0,auVar6._8_8_);
      iVar1 = func_0x006e21f8(uVar3,0xffffffff);
      if (iVar1 == 0) {
        func_0x006e1d54(uVar3,0xfffffffe);
        func_0x006e4118(uVar3,0,0);
        func_0x006e2154(uVar3,0xffffffff);
        func_0x006e45a4(uVar3,0xffffd8f0,auVar6._8_8_);
        return 1;
      }
      return 0;
    }
  }
  return lVar2;
}

