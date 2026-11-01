
undefined8 FUN_006e6dcc(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = func_0x006e4310();
  if ((int)uVar2 != 0) {
    func_0x006e3964(param_1,param_3);
    func_0x006e3ee0(param_1,0xfffffffe);
    iVar1 = func_0x006e21f8(param_1,0xffffffff);
    if (iVar1 == 0) {
      func_0x006e1d54(param_1,0xfffffffd);
      return 0;
    }
    func_0x006e1e44(param_1,0xfffffffe);
    uVar2 = 1;
  }
  return uVar2;
}

