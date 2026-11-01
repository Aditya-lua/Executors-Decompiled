
undefined8 FUN_0028c0f4(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  
  iVar1 = func_0x0029b308(unaff_x19[3]);
  if ((iVar1 != 0) || (iVar1 = func_0x0029db84(unaff_x19[3],*unaff_x19), -1 < iVar1)) {
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

