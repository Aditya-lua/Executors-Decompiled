
long FUN_006e6d70(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  
  iVar1 = func_0x006e21f8();
  if ((iVar1 < 1) || (param_3 = func_0x006e30bc(param_1,param_2), param_3 != 0)) {
    return param_3;
  }
  uVar4 = 4;
  uVar2 = func_0x006e694c(param_1,param_2,4);
  lVar3 = func_0x006e4310();
  if ((int)lVar3 != 0) {
    func_0x006e3964(uVar2,uVar4);
    func_0x006e3ee0(uVar2,0xfffffffe);
    iVar1 = func_0x006e21f8(uVar2,0xffffffff);
    if (iVar1 == 0) {
      func_0x006e1d54(uVar2,0xfffffffd);
      return 0;
    }
    func_0x006e1e44(uVar2,0xfffffffe);
    lVar3 = 1;
  }
  return lVar3;
}

