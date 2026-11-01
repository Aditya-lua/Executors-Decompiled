
undefined8 FUN_00289988(void)

{
  char in_NG;
  bool in_ZR;
  char in_OV;
  int iVar1;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  int unaff_w25;
  
  if (in_ZR || in_NG != in_OV) {
    func_0x0028f83c(5,0,100,"/aws-lc/crypto/dh_extra/params.c",0x177);
  }
  else if (unaff_w25 == 5) {
    iVar1 = func_0x0029b3b0();
    if ((iVar1 != 0) && (iVar1 = func_0x0029b3b0(), iVar1 != 0)) {
      unaff_w25 = 5;
      goto code_r0x00289a94;
    }
  }
  else if (unaff_w25 == 2) {
    iVar1 = func_0x0029b3b0();
    if ((iVar1 != 0) && (iVar1 = func_0x0029b3b0(), iVar1 != 0)) {
      unaff_w25 = 2;
      goto code_r0x00289a94;
    }
  }
  else {
    iVar1 = func_0x0029b3b0();
    if ((iVar1 != 0) && (iVar1 = func_0x0029b3b0(), iVar1 != 0)) {
code_r0x00289a94:
      iVar1 = func_0x002ac920(*unaff_x20);
      if ((iVar1 != 0) &&
         ((iVar1 = func_0x002ac8b0(), iVar1 != 0 &&
          (iVar1 = func_0x0029b3b0(unaff_x20[1],unaff_w25), iVar1 != 0)))) {
        uVar2 = 1;
        goto code_r0x002899c8;
      }
    }
  }
  func_0x0028f83c(5,0,3,"/aws-lc/crypto/dh_extra/params.c",0x1a7);
  uVar2 = 0;
code_r0x002899c8:
  func_0x0029e4bc();
  func_0x0029e220();
  return uVar2;
}

