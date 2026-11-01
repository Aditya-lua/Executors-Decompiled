
undefined8 FUN_0027f970(long param_1)

{
  uint uVar1;
  undefined8 *unaff_x19;
  long unaff_x23;
  
  param_1 = unaff_x23 - param_1;
  if (param_1 != 0) {
    do {
      uVar1 = func_0x0027e418();
      if ((int)uVar1 < 1) {
        func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x30c);
        func_0x0036e3d8(*unaff_x19);
        return 0;
      }
      param_1 = param_1 - (ulong)uVar1;
    } while (param_1 != 0);
  }
  return 1;
}

