
undefined8 FUN_0028c534(undefined8 param_1,long param_2)

{
  int iVar1;
  long unaff_x20;
  
  if (param_2 != 0) {
    iVar1 = func_0x00280ce4();
    if (iVar1 == 0) goto LAB_0028c594;
    if (*(long *)(unaff_x20 + 0x10) != 0) {
      iVar1 = func_0x00280ce4();
      if ((iVar1 != 0) && (iVar1 = func_0x00281fbc(), iVar1 != 0)) {
        return 1;
      }
      goto LAB_0028c594;
    }
  }
  func_0x0028f83c(10,0,0x43,"/aws-lc/crypto/dsa/dsa_asn1.c",0x90);
LAB_0028c594:
  func_0x0028f83c(10,0,0x6a,"/aws-lc/crypto/dsa/dsa_asn1.c",0xd4);
  return 0;
}

