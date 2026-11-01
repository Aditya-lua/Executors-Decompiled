
undefined8 FUN_00305e08(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long unaff_x19;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  
  iVar1 = func_0x002843d4(param_1,param_2,0x20000010);
  if (iVar1 == 0) {
    func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x67e);
    return 0;
  }
  iVar1 = func_0x0028457c(&uStack0000000000000020,&uStack0000000000000018);
  if ((iVar1 == 0) || (uStack0000000000000018 != 1)) {
    func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x685);
    return 0;
  }
  iVar1 = func_0x0028457c(&uStack0000000000000020,&uStack0000000000000010);
  if (iVar1 == 0) {
    func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x68b);
    return 0;
  }
  *(undefined8 *)(unaff_x19 + 0x228) = uStack0000000000000010;
  iVar1 = func_0x0028457c(&uStack0000000000000020,&uStack0000000000000008);
  if (iVar1 == 0) {
    func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x692);
    return 0;
  }
  *(undefined8 *)(unaff_x19 + 0x230) = uStack0000000000000008;
  iVar1 = func_0x002848ec(&uStack0000000000000020,(long)&uStack0000000000000000 + 4);
  if (iVar1 == 0) {
    func_0x0028f83c(0x1e,0,0x8d,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x699);
    return 0;
  }
  *(bool *)(unaff_x19 + 0x238) = uStack0000000000000000._4_4_ != 0;
  return 1;
}

