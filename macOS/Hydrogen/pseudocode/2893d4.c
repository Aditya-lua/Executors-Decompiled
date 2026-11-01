
long FUN_002893d4(void)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  iVar1 = func_0x00280c0c();
  if (iVar1 != 0) {
    lVar2 = func_0x00283ac4(&uStack0000000000000010);
    if (lVar2 != 0) {
      iVar1 = func_0x0028457c(&uStack0000000000000010,&uStack0000000000000008);
      if ((iVar1 == 0) || (uStack0000000000000008 >> 0x20 != 0)) goto LAB_00289414;
      *(int *)(unaff_x19 + 0x28) = (int)uStack0000000000000008;
    }
    lVar2 = func_0x00283ac4(&uStack0000000000000010);
    if ((lVar2 == 0) && (iVar1 = func_0x002beed4(), iVar1 != 0)) {
      return unaff_x19;
    }
  }
LAB_00289414:
  func_0x0028f83c(5,0,0x68,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x78);
  func_0x002bf97c();
  return 0;
}

