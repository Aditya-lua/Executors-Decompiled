
long * FUN_0028c7b8(long *param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined1 auStack_50 [48];
  
  if (param_1 == (long *)0x0) {
    return (long *)0x0;
  }
  iVar1 = func_0x002843d4();
  if ((iVar1 == 0) ||
     (iVar1 = func_0x0028457c(&uStack0000000000000010,&uStack0000000000000008), iVar1 == 0)) {
    uVar4 = 0x69;
    uVar5 = 0x109;
  }
  else if (uStack0000000000000008 == 0) {
    if (*param_1 != 0) {
      func_0x0079d510();
code_r0x0028c924:
      func_0x0079d510();
LAB_0028c928:
      func_0x0079d510();
LAB_0028c92c:
      auVar6 = func_0x0079d510();
      plVar3 = auVar6._8_8_;
      iVar1 = func_0x002823f4(auVar6._0_8_,auStack_50,0x20000010);
      if ((iVar1 == 0) || (iVar1 = func_0x00282cf4(auStack_50,0), iVar1 == 0))
      goto code_r0x0028ca0c;
      if (*plVar3 != 0) {
        iVar1 = func_0x00280ce4(auStack_50);
        if (iVar1 == 0) goto code_r0x0028ca0c;
        if (plVar3[1] != 0) {
          iVar1 = func_0x00280ce4(auStack_50);
          if (iVar1 == 0) goto code_r0x0028ca0c;
          if (plVar3[2] != 0) {
            iVar1 = func_0x00280ce4(auStack_50);
            if (iVar1 == 0) goto code_r0x0028ca0c;
            if (plVar3[3] != 0) {
              iVar1 = func_0x00280ce4(auStack_50);
              if (iVar1 == 0) goto code_r0x0028ca0c;
              if (plVar3[4] != 0) {
                iVar1 = func_0x00280ce4(auStack_50);
                if ((iVar1 != 0) && (iVar1 = func_0x00281fbc(auVar6._0_8_), iVar1 != 0)) {
                  return (long *)((long)&MACH_HEADER.magic + 1);
                }
                goto code_r0x0028ca0c;
              }
            }
          }
        }
      }
      func_0x0028f83c(10,0,0x43,"/aws-lc/crypto/dsa/dsa_asn1.c",0x90);
code_r0x0028ca0c:
      func_0x0028f83c(10,0,0x6a,"/aws-lc/crypto/dsa/dsa_asn1.c",0x130);
      return (long *)0x0;
    }
    lVar2 = func_0x0029bbb8();
    *param_1 = lVar2;
    if ((lVar2 == 0) || (iVar1 = func_0x00280c0c(&uStack0000000000000010,lVar2), iVar1 == 0))
    goto LAB_0028c8f4;
    if (param_1[1] != 0) goto code_r0x0028c924;
    lVar2 = func_0x0029bbb8();
    param_1[1] = lVar2;
    if ((lVar2 == 0) || (iVar1 = func_0x00280c0c(&uStack0000000000000010,lVar2), iVar1 == 0))
    goto LAB_0028c8f4;
    if (param_1[2] != 0) goto LAB_0028c928;
    lVar2 = func_0x0029bbb8();
    param_1[2] = lVar2;
    if ((lVar2 != 0) && (iVar1 = func_0x00280c0c(&uStack0000000000000010,lVar2), iVar1 != 0)) {
      if (param_1[3] != 0) goto LAB_0028c92c;
      lVar2 = func_0x0029bbb8();
      param_1[3] = lVar2;
      if ((((lVar2 != 0) && (iVar1 = func_0x00280c0c(&uStack0000000000000010,lVar2), iVar1 != 0)) &&
          (iVar1 = func_0x0028c2a0(&uStack0000000000000010,param_1 + 4), iVar1 != 0)) &&
         (lVar2 = func_0x00283ac4(&uStack0000000000000010), lVar2 == 0)) {
        iVar1 = func_0x0028bf8c(param_1);
        if (iVar1 != 0) {
          return param_1;
        }
        goto code_r0x0028c828;
      }
    }
LAB_0028c8f4:
    uVar4 = 0x69;
    uVar5 = 0x118;
  }
  else {
    uVar4 = 0x68;
    uVar5 = 0x10e;
  }
  func_0x0028f83c(10,0,uVar4,"/aws-lc/crypto/dsa/dsa_asn1.c",uVar5);
code_r0x0028c828:
  func_0x0028a730(param_1);
  return (long *)0x0;
}

