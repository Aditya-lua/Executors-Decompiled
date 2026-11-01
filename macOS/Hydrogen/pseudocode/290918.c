
long FUN_00290918(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  int unaff_w22;
  
  lVar2 = func_0x00370bc0();
  if ((lVar2 == 0) || (iVar1 = func_0x002d94ec(), iVar1 == 0)) {
    func_0x002f7efc(lVar2);
    func_0x002d8de8();
    func_0x0028f0e4();
    func_0x00283a8c();
    unaff_x20 = func_0x002905fc();
    if (unaff_x20 == 0) {
      return 0;
    }
    if (*(int *)(unaff_x20 + 4) != unaff_w22) {
      func_0x0028f83c(6,0,0x67,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x14a);
      func_0x002d8de8(unaff_x20);
      return 0;
    }
  }
  if (unaff_x21 != (long *)0x0) {
    func_0x002d8de8(*unaff_x21);
    *unaff_x21 = unaff_x20;
  }
  uVar3 = func_0x00283abc();
  *unaff_x19 = uVar3;
  return unaff_x20;
}

