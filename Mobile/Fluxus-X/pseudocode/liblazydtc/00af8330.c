/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af8330
 */

undefined8 X509v3_addr_validate_resource_set(long param_1,long param_2,int param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  if (param_2 == 0) {
    uVar3 = 1;
  }
  else if (param_1 == 0) {
LAB_00af83cc:
    uVar3 = 0;
  }
  else {
    uVar3 = OPENSSL_sk_num(param_1);
    if ((int)uVar3 != 0) {
      if ((param_3 == 0) && (iVar1 = OPENSSL_sk_num(param_2), 0 < iVar1)) {
        iVar1 = 0;
        do {
          lVar4 = OPENSSL_sk_value(param_2,iVar1);
          if (**(int **)(lVar4 + 8) == 0) goto LAB_00af83cc;
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(param_2);
        } while (iVar1 < iVar2);
      }
      uVar3 = FUN_00af7ed4(0,param_1,param_2);
      return uVar3;
    }
  }
  return uVar3;
}

