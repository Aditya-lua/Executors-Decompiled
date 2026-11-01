
long * FUN_00289358(void)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  long *plVar5;
  undefined1 auVar6 [16];
  undefined1 auStack_90 [48];
  undefined8 uStack_60;
  long *plStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_38;
  undefined1 auStack_30 [16];
  undefined1 auStack_6 [6];
  
  uVar2 = ___stack_chk_fail();
  plVar3 = (long *)func_0x002bf86c();
  if (plVar3 == (long *)0x0) {
    return (long *)0x0;
  }
  iVar1 = func_0x002843d4(uVar2,auStack_30,0x20000010);
  if (iVar1 == 0) goto LAB_00289414;
  if (*plVar3 == 0) {
    lVar4 = func_0x0029bbb8();
    *plVar3 = lVar4;
    if ((lVar4 == 0) || (iVar1 = func_0x00280c0c(auStack_30,lVar4), iVar1 == 0)) {
LAB_00289414:
      func_0x0028f83c(5,0,0x68,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x78);
      func_0x002bf97c(plVar3);
      return (long *)0x0;
    }
    if (plVar3[1] == 0) {
      lVar4 = func_0x0029bbb8();
      plVar3[1] = lVar4;
      if ((lVar4 != 0) && (iVar1 = func_0x00280c0c(auStack_30,lVar4), iVar1 != 0)) {
        lVar4 = func_0x00283ac4(auStack_30);
        if (lVar4 != 0) {
          iVar1 = func_0x0028457c(auStack_30,&uStack_38);
          if ((iVar1 == 0) || (uStack_38 >> 0x20 != 0)) goto LAB_00289414;
          *(int *)(plVar3 + 5) = (int)uStack_38;
        }
        lVar4 = func_0x00283ac4(auStack_30);
        if ((lVar4 == 0) && (iVar1 = func_0x002beed4(plVar3), iVar1 != 0)) {
          return plVar3;
        }
      }
      goto LAB_00289414;
    }
  }
  else {
    func_0x0079d4e8();
  }
  auVar6 = func_0x0079d4e8();
  plVar5 = auVar6._8_8_;
  puStack_48 = &_aws_lc_0_24_0_DH_marshal_parameters;
  uStack_60 = uVar2;
  plStack_58 = plVar3;
  puStack_50 = auStack_6 + -10;
  iVar1 = func_0x002823f4(auVar6._0_8_,auStack_90,0x20000010);
  if (iVar1 == 0) goto LAB_0028950c;
  if (*plVar5 != 0) {
    iVar1 = func_0x00280ce4(auStack_90);
    if (iVar1 == 0) goto LAB_0028950c;
    if (plVar5[1] != 0) {
      iVar1 = func_0x00280ce4(auStack_90);
      if ((iVar1 != 0) &&
         ((((int)plVar5[5] == 0 || (iVar1 = func_0x00282cf4(auStack_90), iVar1 != 0)) &&
          (iVar1 = func_0x00281fbc(auVar6._0_8_), iVar1 != 0)))) {
        return (long *)((long)&MACH_HEADER.magic + 1);
      }
      goto LAB_0028950c;
    }
  }
  func_0x0028f83c(5,0,0x43,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x51);
LAB_0028950c:
  func_0x0028f83c(5,0,0x69,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x85);
  return (long *)0x0;
}

