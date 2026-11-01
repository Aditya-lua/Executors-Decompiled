
long FUN_0028c630(long param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  undefined1 auVar4 [16];
  undefined1 auStack_50 [48];
  
  if ((param_1 != 0) && (iVar1 = func_0x00280c0c(), iVar1 != 0)) {
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      auVar4 = func_0x0079d510();
      plVar3 = auVar4._8_8_;
      iVar1 = func_0x002823f4(auVar4._0_8_,auStack_50,0x20000010);
      if (iVar1 == 0) goto LAB_0028c770;
      if (*plVar3 != 0) {
        iVar1 = func_0x00280ce4(auStack_50);
        if (iVar1 == 0) goto LAB_0028c770;
        if (plVar3[1] != 0) {
          iVar1 = func_0x00280ce4(auStack_50);
          if (iVar1 == 0) goto LAB_0028c770;
          if (plVar3[2] != 0) {
            iVar1 = func_0x00280ce4(auStack_50);
            if ((iVar1 != 0) && (iVar1 = func_0x00281fbc(auVar4._0_8_), iVar1 != 0)) {
              return 1;
            }
            goto LAB_0028c770;
          }
        }
      }
      func_0x0028f83c(10,0,0x43,"/aws-lc/crypto/dsa/dsa_asn1.c",0x90);
LAB_0028c770:
      func_0x0028f83c(10,0,0x6a,"/aws-lc/crypto/dsa/dsa_asn1.c",0xf9);
      return 0;
    }
    lVar2 = func_0x0029bbb8();
    *(long *)(unaff_x19 + 0x10) = lVar2;
    if (((lVar2 != 0) && (iVar1 = func_0x00280c0c(), iVar1 != 0)) &&
       (lVar2 = func_0x00283ac4(), lVar2 == 0)) {
      iVar1 = func_0x0028bf8c();
      if (iVar1 != 0) {
        return unaff_x19;
      }
      goto code_r0x0028c690;
    }
  }
  func_0x0028f83c(10,0,0x69,"/aws-lc/crypto/dsa/dsa_asn1.c",0xe5);
code_r0x0028c690:
  func_0x0028a730();
  return 0;
}

