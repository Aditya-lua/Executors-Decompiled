
long FUN_0028d458(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lVar4;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  
  lVar2 = func_0x0029bbb8();
  lVar4 = 0;
  if ((((unaff_x22 == 0) || (unaff_x23 == 0)) || (unaff_x24 == 0)) ||
     ((param_1 == 0 || (lVar2 == 0)))) goto LAB_0028d5bc;
  lVar4 = func_0x002c52bc();
  func_0x002c4ecc();
  iVar1 = func_0x0028da80();
  if (iVar1 == 0) {
    lVar4 = func_0x002c54c0();
    func_0x002c4ecc();
    iVar1 = func_0x0028da80();
    if (iVar1 != 0) goto LAB_0028d508;
    lVar4 = func_0x002c56d0();
    func_0x002c4ecc();
    iVar1 = func_0x0028da80();
    if (iVar1 != 0) goto LAB_0028d508;
    lVar4 = func_0x002c58fc();
    func_0x002c4ecc();
    iVar1 = func_0x0028da80();
    if (iVar1 != 0) goto LAB_0028d508;
    lVar4 = func_0x002c5b30();
    func_0x002c4ecc();
    iVar1 = func_0x0028da80();
    if (iVar1 != 0) goto LAB_0028d508;
LAB_0028d59c:
    func_0x0028f83c(0xf,0,0x7b,"/aws-lc/crypto/ec_extra/ec_asn1.c",0x1a0);
  }
  else {
LAB_0028d508:
    iVar1 = func_0x002c7378(lVar4);
    if (iVar1 != 0) {
      iVar1 = func_0x0028da80(&uStack0000000000000010);
      if (((iVar1 != 0) && (iVar1 = func_0x0028da80(), iVar1 != 0)) &&
         (iVar1 = func_0x0028da80(), iVar1 != 0)) {
        uVar3 = func_0x002c7164(lVar4);
        iVar1 = func_0x002c85bc(lVar4,uVar3,param_1,lVar2,0);
        if (iVar1 == 0) goto LAB_0028d5b8;
        iVar1 = func_0x0028da80();
        if (((iVar1 != 0) && (iVar1 = func_0x0028da80(in_stack_00000008,lVar2), iVar1 != 0)) &&
           (lVar4 != 0)) goto LAB_0028d5bc;
      }
      goto LAB_0028d59c;
    }
  }
LAB_0028d5b8:
  lVar4 = 0;
LAB_0028d5bc:
  func_0x0029bc0c();
  func_0x0029bc0c();
  func_0x0029bc0c();
  func_0x0029bc0c(param_1);
  func_0x0029bc0c(lVar2);
  return lVar4;
}

