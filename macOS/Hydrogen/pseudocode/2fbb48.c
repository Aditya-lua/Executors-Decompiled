
undefined8 FUN_002fbb48(void)

{
  long lVar1;
  bool in_CY;
  int iVar2;
  code *pcVar3;
  undefined2 *unaff_x19;
  undefined8 uVar4;
  long *unaff_x20;
  long unaff_x21;
  long *unaff_x23;
  ulong unaff_x24;
  
  if (in_CY) {
    *unaff_x19 = 0x100;
    lVar1 = (unaff_x21 + -3) - unaff_x24;
    if (lVar1 != 0) {
      _memset(unaff_x19 + 1,0xff,lVar1);
    }
    *(undefined1 *)((long)unaff_x19 + unaff_x21 + ~unaff_x24) = 0;
    if (unaff_x24 != 0) {
      _memcpy((long)unaff_x19 + (unaff_x21 - unaff_x24));
    }
    if ((*unaff_x23 == 0) || (pcVar3 = *(code **)(*unaff_x23 + 0x48), pcVar3 == (code *)0x0)) {
      iVar2 = func_0x002fa630();
    }
    else {
      iVar2 = (*pcVar3)();
    }
    if (iVar2 != 0) {
      *unaff_x20 = unaff_x21;
      uVar4 = 1;
      goto LAB_002fbb1c;
    }
  }
  else {
    func_0x0028f83c(4,0,0x76,"/aws-lc/crypto/fipsmodule/rsa/padding.c",0x52);
  }
  uVar4 = 0;
LAB_002fbb1c:
  func_0x0036e3d8();
  return uVar4;
}

