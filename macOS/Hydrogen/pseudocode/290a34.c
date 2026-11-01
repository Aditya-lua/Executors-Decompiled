
long FUN_00290a34(long *param_1,undefined8 *param_2,long param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  
  if (param_3 < 0) {
    func_0x0028f83c(6,0,0x66,"/aws-lc/crypto/evp_extra/evp_asn1.c",0x170);
    return 0;
  }
  func_0x00283a8c();
  lVar2 = func_0x002905fc();
  if (lVar2 != 0) {
    if (param_1 != (long *)0x0) {
      func_0x002d8de8(*param_1);
      *param_1 = lVar2;
    }
    uVar3 = func_0x00283abc();
    *param_2 = uVar3;
    return lVar2;
  }
  func_0x0028f0e4();
  func_0x00283a8c(&uStack0000000000000020,*param_2,param_3);
  iVar1 = func_0x002843d4(&uStack0000000000000020,&uStack0000000000000010,0x20000010);
  if ((iVar1 != 0) && (lVar2 = func_0x00283ac4(&uStack0000000000000010), lVar2 != 0)) {
    lVar2 = -1;
    do {
      iVar1 = func_0x00284390(&uStack0000000000000010,0,0,0);
      if (iVar1 == 0) goto LAB_00290b4c;
      lVar4 = func_0x00283ac4(&uStack0000000000000010);
      lVar2 = lVar2 + 1;
    } while (lVar4 != 0);
    if (lVar2 == 5) {
      uVar3 = 0x74;
      goto LAB_00290b50;
    }
    if (lVar2 == 3) {
      uVar3 = 0x198;
      goto LAB_00290b50;
    }
  }
LAB_00290b4c:
  uVar3 = 6;
LAB_00290b50:
  lVar2 = func_0x00290864(uVar3,param_1,param_2,param_3);
  return lVar2;
}

