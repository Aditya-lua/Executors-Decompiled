
long FUN_006e6cc0(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  int iStack_34;
  
  iVar1 = func_0x006e21f8();
  if ((iVar1 < 1) || (param_3 = func_0x006e2b80(param_1,param_2,&iStack_34), iStack_34 != 0)) {
    return param_3;
  }
  auVar5 = func_0x006e694c(param_1,param_2,3);
  lVar2 = func_0x006e30bc();
  if (lVar2 != 0) {
    return lVar2;
  }
  lVar2 = 4;
  auVar5 = func_0x006e694c(auVar5._0_8_,auVar5._8_8_,4);
  iVar1 = func_0x006e21f8();
  if ((iVar1 < 1) || (lVar2 = func_0x006e30bc(auVar5._0_8_,auVar5._8_8_), lVar2 != 0)) {
    return lVar2;
  }
  uVar4 = 4;
  uVar3 = func_0x006e694c(auVar5._0_8_,auVar5._8_8_,4);
  lVar2 = func_0x006e4310();
  if ((int)lVar2 != 0) {
    func_0x006e3964(uVar3,uVar4);
    func_0x006e3ee0(uVar3,0xfffffffe);
    iVar1 = func_0x006e21f8(uVar3,0xffffffff);
    if (iVar1 == 0) {
      func_0x006e1d54(uVar3,0xfffffffd);
      return 0;
    }
    func_0x006e1e44(uVar3,0xfffffffe);
    lVar2 = 1;
  }
  return lVar2;
}

