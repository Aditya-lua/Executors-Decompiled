
long FUN_0028cffc(void)

{
  int iVar1;
  long lVar2;
  byte *pbVar3;
  undefined8 uVar4;
  long unaff_x19;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000040;
  
  lVar2 = func_0x00283ac4();
  if (lVar2 == 0) {
LAB_0028d044:
    uVar4 = 0x9e;
  }
  else {
    func_0x00283abc(&uStack0000000000000008);
    func_0x00283ac4(&uStack0000000000000008);
    iVar1 = func_0x002d2dc0();
    if ((iVar1 == 0) || (lVar2 = func_0x00283ac4(&uStack0000000000000018), lVar2 != 0))
    goto LAB_0028d044;
    pbVar3 = (byte *)func_0x00283abc(&uStack0000000000000008);
    *(uint *)(unaff_x19 + 0x1c) = *pbVar3 & 0xfe;
    lVar2 = func_0x00283ac4(&uStack0000000000000040);
    if (lVar2 == 0) {
      iVar1 = func_0x002cb024();
      if (iVar1 != 0) {
        func_0x0029bc0c();
        return unaff_x19;
      }
      goto LAB_0028d0cc;
    }
    uVar4 = 0xb2;
  }
  func_0x0028f83c(0xf,0,0x80,"/aws-lc/crypto/ec_extra/ec_asn1.c",uVar4);
LAB_0028d0cc:
  func_0x002c3420();
  func_0x0029bc0c();
  return 0;
}

