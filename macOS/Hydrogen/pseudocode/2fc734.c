
undefined8 FUN_002fc734(void)

{
  uint uVar1;
  long lVar2;
  uint unaff_w21;
  
  lVar2 = func_0x002f8ac4(0);
  if (lVar2 != 0) {
    func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
    uVar1 = func_0x0028edc4();
    func_0x002f7efc(lVar2);
    if ((uVar1 & 0xff000fff) == unaff_w21) {
      func_0x0028f0e4();
      lVar2 = func_0x002f8ac4(0);
      if (lVar2 != 0) {
        func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
        uVar1 = func_0x0028edc4();
        func_0x002f7efc(lVar2);
        if ((uVar1 & 0xff000fff) == unaff_w21) {
          func_0x0028f0e4();
          lVar2 = func_0x002f8ac4(0);
          if (lVar2 != 0) {
            func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
            func_0x0028edc4();
            func_0x002f7efc(lVar2);
          }
        }
      }
    }
  }
  func_0x002f7efc(0);
  return 0;
}

