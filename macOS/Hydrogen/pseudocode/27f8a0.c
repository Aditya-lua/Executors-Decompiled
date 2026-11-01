
undefined8 FUN_0027f8a0(long param_1,ulong param_2)

{
  uint uVar1;
  long lVar2;
  long *unaff_x19;
  ulong *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined1 uStack000000000000000a;
  
  if (param_1 == 0 && param_2 <= unaff_x22) {
    *unaff_x21 = param_2;
    lVar2 = func_0x0036e274();
    *unaff_x19 = lVar2;
    if (lVar2 == 0) {
      return 0;
    }
    _memcpy(lVar2,&uStack000000000000000a);
    if (unaff_x23 == 0) {
      return 1;
    }
    uVar1 = func_0x0027e418();
    if (0 < (int)uVar1) {
      lVar2 = unaff_x23 - (ulong)uVar1;
      if (lVar2 == 0) {
        return 1;
      }
      while (uVar1 = func_0x0027e418(), 0 < (int)uVar1) {
        lVar2 = lVar2 - (ulong)uVar1;
        if (lVar2 == 0) {
          return 1;
        }
      }
    }
    func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x30c);
    func_0x0036e3d8(*unaff_x19);
  }
  else {
    func_0x0028f83c(0xc,0,0xb1,"/aws-lc/crypto/bio/bio.c",0x300);
  }
  return 0;
}

