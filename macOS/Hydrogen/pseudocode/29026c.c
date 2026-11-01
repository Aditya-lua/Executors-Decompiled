
long FUN_0029026c(void)

{
  int iVar1;
  long lVar2;
  code *pcVar3;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  
  iVar1 = func_0x00283bdc(&uStack0000000000000010,(long)&uStack0000000000000008 + 7);
  if ((iVar1 == 0) || (uStack0000000000000008._7_1_ != '\0')) {
    func_0x0028f83c(6,0,0x66,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x8d);
  }
  else {
    lVar2 = func_0x002d8dc0();
    if (lVar2 != 0) {
      func_0x002d9050(lVar2);
      pcVar3 = *(code **)(*(long *)(lVar2 + 0x10) + 0x20);
      if (pcVar3 == (code *)0x0) {
        func_0x0028f83c(6,0,0x80,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x9a);
      }
      else {
        iVar1 = (*pcVar3)(lVar2,&uStack0000000000000020,&uStack0000000000000010);
        if (iVar1 != 0) {
          return lVar2;
        }
      }
    }
    func_0x002d8de8(lVar2);
  }
  return 0;
}

