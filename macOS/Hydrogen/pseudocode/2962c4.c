
undefined8 FUN_002962c4(undefined8 param_1,long param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000018;
  
  if ((param_2 == 0) || (lVar2 = func_0x002c2900(param_2), lVar2 == 0)) {
    func_0x0028f83c(6,0,0x43,"/aws-lc/crypto/evp_extra/print.c",0xfc);
    return 0;
  }
  uVar3 = func_0x0027f658(param_1,param_3,0x80);
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  iVar1 = func_0x002c7494(lVar2);
  if (iVar1 != 0) {
    func_0x002c7564();
  }
  iVar1 = func_0x00280490(param_1,"%s: (%s)\n");
  if (0 < iVar1) {
    if (param_4 == 2) {
      lVar2 = func_0x002caee8(param_2);
      if ((lVar2 != 0) && (uVar3 = func_0x00295e78(param_1,"priv:",lVar2,param_3), (int)uVar3 == 0))
      {
        return uVar3;
      }
    }
    else if (param_4 < 1) {
      return 1;
    }
    lVar2 = func_0x002c3e68(param_2);
    if (lVar2 == 0) {
      return 1;
    }
    uStack0000000000000018 = 0;
    uVar3 = func_0x002cafe0(param_2);
    lVar2 = func_0x002cb3a0(param_2,uVar3,&uStack0000000000000018,0);
    if (lVar2 != 0) {
      iVar1 = func_0x0027f658(param_1,param_3,0x80);
      if ((iVar1 == 0) || (iVar1 = func_0x0027ea28(param_1,"pub:"), iVar1 < 1)) {
        func_0x0036e3d8(uStack0000000000000018);
      }
      else {
        iVar1 = func_0x00296004(param_1,uStack0000000000000018,lVar2,param_3);
        func_0x0036e3d8(uStack0000000000000018);
        if (iVar1 != 0) {
          return 1;
        }
      }
    }
  }
  return 0;
}

