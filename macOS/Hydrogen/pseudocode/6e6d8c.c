
long FUN_006e6d8c(void)

{
  char in_NG;
  char in_OV;
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x21;
  
  if ((in_NG != in_OV) || (unaff_x21 = func_0x006e30bc(), unaff_x21 != 0)) {
    return unaff_x21;
  }
  uVar4 = 4;
  uVar2 = func_0x006e694c();
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

