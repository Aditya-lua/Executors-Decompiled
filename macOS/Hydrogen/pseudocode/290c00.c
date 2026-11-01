
long FUN_00290c00(int param_1,long *param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  
  lVar2 = func_0x002d8dc0();
  if (lVar2 != 0) {
    func_0x00283a8c();
    if (param_1 == 6) {
      lVar3 = func_0x00370860();
      if ((lVar3 != 0) && (iVar1 = func_0x002d94ec(lVar2,lVar3), iVar1 != 0)) {
        uVar4 = func_0x00283abc();
        *param_3 = uVar4;
        if (param_2 == (long *)0x0) {
          return lVar2;
        }
        func_0x002d8de8(*param_2);
        *param_2 = lVar2;
        return lVar2;
      }
      func_0x002f7efc(lVar3);
    }
    else {
      func_0x0028f83c(6,0,0x81,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x1b6);
    }
    func_0x002d8de8(lVar2);
  }
  return 0;
}

