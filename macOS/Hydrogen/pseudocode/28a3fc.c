
long FUN_0028a3fc(int param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  
  if (param_1 == 0) {
    uVar4 = 0xb6;
  }
  else {
    lVar2 = func_0x0028a00c(&uStack0000000000000010);
    if (lVar2 == 0) {
      func_0x0028f83c(0x1d,0,0x66,"/aws-lc/crypto/digest_extra/digest_extra.c",0xbc);
      return 0;
    }
    lVar3 = func_0x00283ac4(&uStack0000000000000020);
    if (lVar3 == 0) {
      return lVar2;
    }
    iVar1 = func_0x002843d4(&uStack0000000000000020);
    if (((iVar1 != 0) && (lVar3 = func_0x00283ac4(), lVar3 == 0)) &&
       (lVar3 = func_0x00283ac4(&uStack0000000000000020), lVar3 == 0)) {
      return lVar2;
    }
    uVar4 = 0xc9;
  }
  func_0x0028f83c(0x1d,0,0x65,"/aws-lc/crypto/digest_extra/digest_extra.c",uVar4);
  return 0;
}

