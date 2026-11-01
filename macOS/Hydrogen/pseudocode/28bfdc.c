
undefined8 FUN_0028bfdc(int param_1)

{
  int iVar1;
  uint uVar2;
  undefined8 *unaff_x19;
  
  if ((((param_1 != 0) || (iVar1 = func_0x0029def4(*unaff_x19), iVar1 == 0)) ||
      (iVar1 = func_0x0029def4(unaff_x19[1]), iVar1 == 0)) ||
     (((iVar1 = func_0x0029db84(unaff_x19[1],*unaff_x19), -1 < iVar1 ||
       (iVar1 = func_0x0029c378(unaff_x19[2]), iVar1 != 0)) ||
      ((iVar1 = func_0x0029b308(unaff_x19[2]), iVar1 != 0 ||
       (iVar1 = func_0x0029db84(unaff_x19[2],*unaff_x19), -1 < iVar1)))))) {
    func_0x0028f83c(10,0,0x6b,"/aws-lc/crypto/dsa/dsa_asn1.c",0x5c);
    return 0;
  }
  iVar1 = func_0x0029bf0c(unaff_x19[1]);
  if (((iVar1 != 0xa0) && (iVar1 != 0xe0)) && (iVar1 != 0x100)) {
    func_0x0028f83c(10,0,100,"/aws-lc/crypto/dsa/dsa_asn1.c",99);
    return 0;
  }
  uVar2 = func_0x0029bf0c(*unaff_x19);
  if (10000 < uVar2) {
    func_0x0028f83c(10,0,0x66,"/aws-lc/crypto/dsa/dsa_asn1.c",0x6a);
    return 0;
  }
  if ((unaff_x19[3] != 0) &&
     (((iVar1 = func_0x0029c378(), iVar1 != 0 || (iVar1 = func_0x0029b308(unaff_x19[3]), iVar1 != 0)
       ) || (iVar1 = func_0x0029db84(unaff_x19[3],*unaff_x19), -1 < iVar1)))) {
    func_0x0028f83c(10,0,0x6b,"/aws-lc/crypto/dsa/dsa_asn1.c",0x72);
    return 0;
  }
  if ((unaff_x19[4] == 0) ||
     (((iVar1 = func_0x0029c378(), iVar1 == 0 && (iVar1 = func_0x0029b308(unaff_x19[4]), iVar1 == 0)
       ) && (iVar1 = func_0x0029db84(unaff_x19[4],unaff_x19[1]), iVar1 < 0)))) {
    return 1;
  }
  func_0x0028f83c(10,0,0x6b,"/aws-lc/crypto/dsa/dsa_asn1.c",0x7c);
  return 0;
}

