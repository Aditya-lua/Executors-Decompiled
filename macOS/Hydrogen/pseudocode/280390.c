
undefined8 FUN_00280390(long param_1)

{
  long unaff_x20;
  
  if (param_1 == 0) {
    func_0x0028f83c(2,0,0,"/aws-lc/crypto/bio/file.c",0xee);
    func_0x0028f918(5);
    func_0x0028f83c(0x11,0,2,"/aws-lc/crypto/bio/file.c",0xf0);
    return 0;
  }
  *(long *)(unaff_x20 + 0x38) = param_1;
  *(undefined4 *)(unaff_x20 + 0x20) = 1;
  return 1;
}

