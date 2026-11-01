
long FUN_006e6610(undefined8 param_1,undefined8 param_2,long param_3,long *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  long *plVar7;
  long unaff_x23;
  long unaff_x29;
  undefined1 auVar8 [16];
  
  lVar2 = func_0x006e3a84();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return lVar2;
  }
  auVar8 = ___stack_chk_fail();
  uVar6 = auVar8._8_8_;
  uVar3 = auVar8._0_8_;
  plVar7 = param_4;
  if (((param_3 != 0) && (iVar1 = func_0x006e21f8(uVar3,uVar6), iVar1 < 1)) ||
     (param_3 = func_0x006e2ce4(uVar3,uVar6), param_3 != 0)) {
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
    uVar4 = func_0x006e3a84(uVar3,"invalid option \'%s\'");
    func_0x006e63b0(uVar3,uVar6,uVar4);
    return unaff_x23;
  }
  lVar2 = 5;
  auVar8 = func_0x006e694c(uVar3,uVar6);
  iVar1 = func_0x006e21f8();
  if (iVar1 < 1) {
    if (plVar7 != (long *)0x0) {
      if (lVar2 == 0) {
        *plVar7 = 0;
        return 0;
      }
      lVar5 = _strlen(lVar2);
      *plVar7 = lVar5;
      return lVar2;
    }
  }
  else {
    lVar2 = func_0x006e2ce4(auVar8._0_8_,auVar8._8_8_,plVar7);
    if (lVar2 == 0) {
      auVar8 = func_0x006e694c(auVar8._0_8_,auVar8._8_8_,5);
      lVar2 = func_0x006e2ce4();
      if (lVar2 != 0) {
        return lVar2;
      }
      auVar8 = func_0x006e694c(auVar8._0_8_,auVar8._8_8_,5);
      uVar3 = auVar8._0_8_;
      func_0x006e3d18(uVar3,0xffffd8f0,auVar8._8_8_);
      iVar1 = func_0x006e21f8(uVar3,0xffffffff);
      if (iVar1 == 0) {
        func_0x006e1d54(uVar3,0xfffffffe);
        func_0x006e4118(uVar3,0,0);
        func_0x006e2154(uVar3,0xffffffff);
        func_0x006e45a4(uVar3,0xffffd8f0,auVar8._8_8_);
        return 1;
      }
      return 0;
    }
  }
  return lVar2;
}

