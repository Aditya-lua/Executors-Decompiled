
undefined8 FUN_00293d0c(undefined8 param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined1 auStack_150 [48];
  undefined1 auStack_120 [48];
  undefined1 auStack_f0 [48];
  undefined1 auStack_c0 [48];
  undefined1 auStack_90 [48];
  undefined1 auStack_60 [48];
  
  lVar4 = *(long *)(param_2 + 8);
  if (*(char *)(lVar4 + 0x40) == '\0') {
    uVar2 = 0x82;
    uVar3 = 0xe5;
  }
  else {
    iVar1 = func_0x002823f4(param_1,auStack_60,0x20000010);
    if (((((iVar1 != 0) && (iVar1 = func_0x00282cf4(auStack_60,1), iVar1 != 0)) &&
         (iVar1 = func_0x002823f4(auStack_60,auStack_90,0x20000010), iVar1 != 0)) &&
        ((((iVar1 = func_0x002823f4(auStack_90,auStack_c0,6), iVar1 != 0 &&
           (iVar1 = func_0x00282698(auStack_c0,&UNK_009ce9fc,3), iVar1 != 0)) &&
          ((iVar1 = func_0x002823f4(auStack_60,auStack_f0,4), iVar1 != 0 &&
           ((iVar1 = func_0x002823f4(auStack_f0,auStack_120,4), iVar1 != 0 &&
            (iVar1 = func_0x00282698(auStack_120,lVar4,0x20), iVar1 != 0)))))) &&
         (iVar1 = func_0x002823f4(auStack_60,auStack_150,0x80000001), iVar1 != 0)))) &&
       (((iVar1 = func_0x002824fc(auStack_150,0), iVar1 != 0 &&
         (iVar1 = func_0x00282698(auStack_150,lVar4 + 0x20,0x20), iVar1 != 0)) &&
        (iVar1 = func_0x00281fbc(param_1), iVar1 != 0)))) {
      return 1;
    }
    uVar2 = 0x69;
    uVar3 = 0xf9;
  }
  func_0x0028f83c(6,0,uVar2,"/aws-lc/crypto/evp_extra/p_ed25519_asn1.c",uVar3);
  return 0;
}

