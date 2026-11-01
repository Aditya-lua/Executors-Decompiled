
ulong FUN_002b2704(ulong param_1)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  long *unaff_x19;
  undefined1 uStack0000000000000020;
  
  if (param_1 >> 0x10 == 0) {
    uVar3 = 0;
    if (*unaff_x19 != 0) {
      uVar3 = (ulong)*(ushort *)(*unaff_x19 + 4);
    }
    if (param_1 == uVar3) {
      iVar1 = func_0x002843d4(&uStack0000000000000020);
      if (iVar1 == 0) {
        func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/aead.c",0x197);
        return 0;
      }
      if (*(code **)(*unaff_x19 + 0x58) == (code *)0x0) {
        lVar2 = func_0x00283ac4();
        return (ulong)(lVar2 == 0);
      }
      uVar3 = (**(code **)(*unaff_x19 + 0x58))();
      return uVar3;
    }
  }
  func_0x0028f83c(0x1e,0,0x90,"/aws-lc/crypto/fipsmodule/cipher/aead.c",0x192);
  return 0;
}

