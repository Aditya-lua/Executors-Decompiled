
long FUN_0028d0e0(void)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  undefined1 uStack0000000000000040;
  
  iVar1 = func_0x002c9d5c();
  if (iVar1 != 0) {
    *(uint *)(unaff_x19 + 0x18) = *(uint *)(unaff_x19 + 0x18) | 2;
    lVar2 = func_0x00283ac4(&uStack0000000000000040);
    if (lVar2 == 0) {
      iVar1 = func_0x002cb024();
      if (iVar1 != 0) {
        func_0x0029bc0c();
        return unaff_x19;
      }
    }
    else {
      func_0x0028f83c(0xf,0,0x80,"/aws-lc/crypto/ec_extra/ec_asn1.c",0xb2);
    }
  }
  func_0x002c3420();
  func_0x0029bc0c();
  return 0;
}

