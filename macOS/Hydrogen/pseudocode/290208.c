
long FUN_00290208(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  
  iVar1 = func_0x002843d4(unaff_x29 + -0x20,&uStack0000000000000010,3);
  if ((iVar1 == 0) || (lVar2 = func_0x00283ac4(unaff_x29 + -0x20), lVar2 != 0)) {
    uVar4 = 0x66;
    uVar5 = 0x80;
  }
  else {
    lVar2 = func_0x00290320(&uStack0000000000000020);
    if (lVar2 == 0) {
      uVar4 = 0x80;
      uVar5 = 0x86;
    }
    else {
      iVar1 = func_0x00283bdc(&uStack0000000000000010,(long)&uStack0000000000000008 + 7);
      if ((iVar1 != 0) && (uStack0000000000000008._7_1_ == '\0')) {
        lVar3 = func_0x002d8dc0();
        if (lVar3 != 0) {
          func_0x002d9050(lVar3,lVar2);
          pcVar6 = *(code **)(*(long *)(lVar3 + 0x10) + 0x20);
          if (pcVar6 == (code *)0x0) {
            func_0x0028f83c(6,0,0x80,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x9a);
          }
          else {
            iVar1 = (*pcVar6)(lVar3,&uStack0000000000000020,&uStack0000000000000010);
            if (iVar1 != 0) {
              return lVar3;
            }
          }
        }
        func_0x002d8de8(lVar3);
        return 0;
      }
      uVar4 = 0x66;
      uVar5 = 0x8d;
    }
  }
  func_0x0028f83c(6,0,uVar4,"/aws-lc/crypto/evp_extra/evp_asn1.c",uVar5);
  return 0;
}

