
bool FUN_00280c24(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  iVar1 = func_0x002843d4(param_1,param_2,2);
  if ((iVar1 == 0) ||
     (iVar1 = func_0x0028489c(&uStack0000000000000010,(long)&uStack0000000000000008 + 4), iVar1 == 0
     )) {
    func_0x0028f83c(3,0,0x75,"/aws-lc/crypto/bn_extra/bn_asn1.c",0x1a);
    return false;
  }
  if (uStack0000000000000008._4_4_ == 0) {
    uVar2 = func_0x00283abc(&uStack0000000000000010);
    uVar3 = func_0x00283ac4(&uStack0000000000000010);
    lVar4 = func_0x0029c764(uVar2,uVar3);
    return lVar4 != 0;
  }
  func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/bn_extra/bn_asn1.c",0x1f);
  return false;
}

