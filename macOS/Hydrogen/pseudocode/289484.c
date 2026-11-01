
undefined8 FUN_00289484(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long *unaff_x20;
  
  iVar1 = func_0x002823f4(param_1,param_2,0x20000010);
  if (iVar1 == 0) goto LAB_0028950c;
  if (*unaff_x20 != 0) {
    iVar1 = func_0x00280ce4();
    if (iVar1 == 0) goto LAB_0028950c;
    if (unaff_x20[1] != 0) {
      iVar1 = func_0x00280ce4();
      if ((iVar1 != 0) &&
         ((((int)unaff_x20[5] == 0 || (iVar1 = func_0x00282cf4(), iVar1 != 0)) &&
          (iVar1 = func_0x00281fbc(), iVar1 != 0)))) {
        return 1;
      }
      goto LAB_0028950c;
    }
  }
  func_0x0028f83c(5,0,0x43,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x51);
LAB_0028950c:
  func_0x0028f83c(5,0,0x69,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x85);
  return 0;
}

