
undefined8 FUN_002c3d44(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  long *unaff_x19;
  long unaff_x29;
  undefined1 uStack00000000000000e0;
  undefined1 uStack0000000000000128;
  undefined1 uStack0000000000000170;
  undefined1 uStack00000000000001b8;
  
  iVar1 = (**(code **)(*unaff_x19 + 0x90))();
  if (iVar1 == 0) {
    uVar2 = 0x44;
    uVar3 = 0xac;
  }
  else {
    func_0x002c3ef4();
    func_0x002a4078(&uStack00000000000001b8,&uStack00000000000000e0,&uStack0000000000000128,
                    (long)(int)unaff_x19[0x21],unaff_x19 + 0x1d);
    func_0x002a4078(&uStack0000000000000170,unaff_x29 + -0x88,&uStack0000000000000128,
                    (long)(int)unaff_x19[0x21],unaff_x19 + 0x1d);
    pcVar4 = *(code **)(*unaff_x19 + 0x38);
    if (pcVar4 == (code *)0x0) {
      iVar1 = (**(code **)(*unaff_x19 + 0x40))();
      if (iVar1 == 0) {
        uVar2 = 0xf;
        uVar3 = 0xbb;
        goto LAB_002c3c5c;
      }
    }
    else {
      (*pcVar4)();
    }
    iVar1 = (**(code **)(*unaff_x19 + 0x98))();
    if (iVar1 != 0) {
      return 1;
    }
    uVar2 = 0xcd;
    uVar3 = 0xc0;
  }
LAB_002c3c5c:
  func_0x0028f83c(0x1a,0,uVar2,"/aws-lc/crypto/fipsmodule/ecdsa/ecdsa.c",uVar3);
  return 0;
}

