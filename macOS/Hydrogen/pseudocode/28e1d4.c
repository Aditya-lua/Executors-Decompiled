
uint FUN_0028e1d4(long param_1)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000038;
  
  iVar1 = func_0x002826e4(&uStack0000000000000008,&uStack0000000000000038,param_1);
  if ((iVar1 == 0) || (lVar3 = func_0x002cb544(), lVar3 != param_1)) {
    func_0x00281ecc(&uStack0000000000000008);
    return 0xffffffff;
  }
  uVar2 = func_0x00281d3c(&uStack0000000000000008);
  return uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
}

