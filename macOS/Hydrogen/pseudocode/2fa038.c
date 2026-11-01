
undefined8 FUN_002fa038(undefined8 param_1,undefined8 param_2,long param_3)

{
  bool in_ZR;
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000018;
  
  if (in_ZR) {
    if ((param_3 == 0) || (iVar1 = _memcmp(), iVar1 == 0)) {
      uVar2 = 1;
      func_0x0036e3d8();
      goto joined_r0x002fa098;
    }
    uVar2 = 0xf8;
    uVar3 = 0x3cc;
  }
  else {
    uVar2 = 0x69;
    uVar3 = 0x3c6;
  }
  func_0x0028f83c(4,0,uVar2,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",uVar3);
  uVar2 = 0;
  func_0x0036e3d8();
joined_r0x002fa098:
  if (in_stack_00000000._4_4_ != 0) {
    func_0x0036e3d8(in_stack_00000018);
  }
  return uVar2;
}

