
long * FUN_0028c3e4(void)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long *unaff_x19;
  undefined1 auVar4 [16];
  undefined1 auStack_50 [48];
  
  if (unaff_x19[3] == 0) {
    lVar2 = func_0x0029bbb8();
    unaff_x19[3] = lVar2;
    if ((lVar2 == 0) || (iVar1 = func_0x00280c0c(), iVar1 == 0)) goto LAB_0028c480;
    if (*unaff_x19 != 0) goto LAB_0028c4d0;
    lVar2 = func_0x0029bbb8();
    *unaff_x19 = lVar2;
    if ((lVar2 == 0) || (iVar1 = func_0x00280c0c(), iVar1 == 0)) goto LAB_0028c480;
    if (unaff_x19[1] != 0) goto LAB_0028c4d4;
    lVar2 = func_0x0029bbb8();
    unaff_x19[1] = lVar2;
    if ((lVar2 != 0) && (iVar1 = func_0x00280c0c(), iVar1 != 0)) {
      if (unaff_x19[2] != 0) goto LAB_0028c4d8;
      lVar2 = func_0x0029bbb8();
      unaff_x19[2] = lVar2;
      if (((lVar2 != 0) && (iVar1 = func_0x00280c0c(), iVar1 != 0)) &&
         (lVar2 = func_0x00283ac4(), lVar2 == 0)) {
        iVar1 = func_0x0028bf8c();
        if (iVar1 != 0) {
          return unaff_x19;
        }
        goto LAB_0028c49c;
      }
    }
LAB_0028c480:
    func_0x0028f83c(10,0,0x69,"/aws-lc/crypto/dsa/dsa_asn1.c",0xbf);
LAB_0028c49c:
    func_0x0028a730();
    return (long *)0x0;
  }
  func_0x0079d510();
LAB_0028c4d0:
  func_0x0079d510();
LAB_0028c4d4:
  func_0x0079d510();
LAB_0028c4d8:
  auVar4 = func_0x0079d510();
  plVar3 = auVar4._8_8_;
  iVar1 = func_0x002823f4(auVar4._0_8_,auStack_50,0x20000010);
  if (iVar1 == 0) goto LAB_0028c594;
  if (plVar3[3] != 0) {
    iVar1 = func_0x00280ce4(auStack_50);
    if (iVar1 == 0) goto LAB_0028c594;
    if (*plVar3 != 0) {
      iVar1 = func_0x00280ce4(auStack_50);
      if (iVar1 == 0) goto LAB_0028c594;
      if (plVar3[1] != 0) {
        iVar1 = func_0x00280ce4(auStack_50);
        if (iVar1 == 0) goto LAB_0028c594;
        if (plVar3[2] != 0) {
          iVar1 = func_0x00280ce4(auStack_50);
          if ((iVar1 != 0) && (iVar1 = func_0x00281fbc(auVar4._0_8_), iVar1 != 0)) {
            return (long *)((long)&MACH_HEADER.magic + 1);
          }
          goto LAB_0028c594;
        }
      }
    }
  }
  func_0x0028f83c(10,0,0x43,"/aws-lc/crypto/dsa/dsa_asn1.c",0x90);
LAB_0028c594:
  func_0x0028f83c(10,0,0x6a,"/aws-lc/crypto/dsa/dsa_asn1.c",0xd4);
  return (long *)0x0;
}

