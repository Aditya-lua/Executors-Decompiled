
undefined8 FUN_0029323c(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  
  lVar2 = func_0x00283ac4();
  if (lVar2 == 0) {
    lVar2 = func_0x002c2a30();
    if ((lVar2 == 0) || (iVar1 = func_0x002c2ae8(lVar2,param_1), iVar1 == 0)) {
      lVar5 = 0;
    }
    else {
      lVar5 = func_0x002c7664(param_1);
      if (lVar5 != 0) {
        uVar3 = func_0x00283abc();
        uVar4 = func_0x00283ac4();
        iVar1 = func_0x002d2dc0(param_1,lVar5,uVar3,uVar4,0);
        if ((iVar1 != 0) && (iVar1 = func_0x002c2b7c(lVar2,lVar5), iVar1 != 0)) {
          func_0x002c7740(lVar5);
          func_0x002d98c8();
          return 1;
        }
      }
    }
  }
  else {
    func_0x0028f83c(6,0,0x66,"/aws-lc/crypto/evp_extra/p_ec_asn1.c",0x65);
    lVar5 = 0;
    lVar2 = 0;
  }
  func_0x002c7740(lVar5);
  func_0x002c3420(lVar2);
  return 0;
}

