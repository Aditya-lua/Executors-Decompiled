/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cc30
 */

undefined8 FUN_00b0cc30(int param_1,X509 *param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  ASN1_OBJECT *pAVar3;
  undefined8 uVar4;
  stack_st_GENERAL_NAME *psVar5;
  
  psVar5 = param_2[1].altname;
  if (psVar5 != (stack_st_GENERAL_NAME *)0x0) {
    if (((psVar5->stack).data != (char **)0x0) && (iVar1 = OPENSSL_sk_num(), 0 < iVar1)) {
      iVar1 = 0;
      do {
        pAVar3 = (ASN1_OBJECT *)OPENSSL_sk_value((psVar5->stack).data,iVar1);
        iVar2 = OBJ_obj2nid(pAVar3);
        if (iVar2 == param_1) {
          return 2;
        }
        if (((param_3 >> 4 & 1) != 0) && (iVar2 == 0x38e)) {
          return 2;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num((psVar5->stack).data);
      } while (iVar1 < iVar2);
    }
    if (*(long *)&psVar5->stack != 0) {
      iVar1 = OPENSSL_sk_num();
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          pAVar3 = (ASN1_OBJECT *)OPENSSL_sk_value(*(undefined8 *)&psVar5->stack,iVar1);
          iVar2 = OBJ_obj2nid(pAVar3);
          if ((iVar2 == param_1) || (((param_3 >> 4 & 1) != 0 && (iVar2 == 0x38e))))
          goto LAB_00b0cd30;
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(*(undefined8 *)&psVar5->stack);
        } while (iVar1 < iVar2);
      }
      return 2;
    }
  }
  if (((((param_3 >> 3 & 1) == 0) || (iVar1 = X509_check_purpose(param_2,-1,0), iVar1 != 1)) ||
      ((param_3 >> 2 & 1) != 0)) || ((*(byte *)((long)&param_2[1].name + 1) >> 5 & 1) == 0)) {
    uVar4 = 3;
  }
  else {
LAB_00b0cd30:
    uVar4 = 1;
  }
  return uVar4;
}

