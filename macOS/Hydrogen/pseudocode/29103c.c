
undefined8 FUN_0029103c(void)

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  long unaff_x19;
  
  iVar1 = func_0x002d96c0();
  if (iVar1 != 0) {
    iVar1 = func_0x00281e30();
    if (iVar1 != 0) {
      if ((*(long *)(unaff_x19 + 0x10) == 0) ||
         (pcVar3 = *(code **)(*(long *)(unaff_x19 + 0x10) + 0x28), pcVar3 == (code *)0x0)) {
        func_0x0028f83c(6,0,0x80,"/aws-lc/crypto/evp_extra/evp_asn1.c",0xac);
      }
      else {
        iVar1 = (*pcVar3)();
        if (iVar1 != 0) {
          uVar2 = func_0x00281d3c();
          goto LAB_002910d0;
        }
      }
    }
    func_0x00281ecc();
  }
  uVar2 = 0xffffffff;
LAB_002910d0:
  func_0x002d8de8();
  return uVar2;
}

