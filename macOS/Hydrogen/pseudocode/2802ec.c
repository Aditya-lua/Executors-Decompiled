
undefined8 FUN_002802ec(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long unaff_x20;
  uint unaff_w21;
  
  if (*(int *)(unaff_x20 + 0x24) != 0) {
    if ((*(int *)(unaff_x20 + 0x20) != 0) && (param_1 != 0)) {
      _fclose(param_1);
      *(undefined8 *)(unaff_x20 + 0x38) = 0;
    }
    *(undefined4 *)(unaff_x20 + 0x20) = 0;
  }
  *(uint *)(unaff_x20 + 0x24) = unaff_w21 & 1;
  if ((((unaff_w21 >> 3 & 1) == 0) && ((unaff_w21 & 6) != 6)) && ((unaff_w21 & 6) == 0)) {
    uVar2 = 100;
    uVar3 = 0xe8;
  }
  else {
    lVar1 = _fopen();
    if (lVar1 != 0) {
      *(long *)(unaff_x20 + 0x38) = lVar1;
      *(undefined4 *)(unaff_x20 + 0x20) = 1;
      return 1;
    }
    func_0x0028f83c(2,0,0,"/aws-lc/crypto/bio/file.c",0xee);
    func_0x0028f918(5);
    uVar2 = 2;
    uVar3 = 0xf0;
  }
  func_0x0028f83c(0x11,0,uVar2,"/aws-lc/crypto/bio/file.c",uVar3);
  return 0;
}

