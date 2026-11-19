/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b741c
 */

undefined8 FUN_009b741c(long *param_1,long param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  X509_NAME *pXVar4;
  
  if (param_2 == 0) {
    *param_1 = 0;
  }
  else {
    lVar3 = OPENSSL_sk_new_null();
    if (lVar3 == 0) {
      return 0;
    }
    iVar1 = OPENSSL_sk_num(param_2);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        pXVar4 = (X509_NAME *)OPENSSL_sk_value(param_2,iVar1);
        pXVar4 = X509_NAME_dup(pXVar4);
        if (pXVar4 == (X509_NAME *)0x0) {
LAB_009b74b8:
          OPENSSL_sk_pop_free(lVar3,X509_NAME_free);
          return 0;
        }
        iVar2 = OPENSSL_sk_insert(lVar3,pXVar4,iVar1);
        if (iVar2 == 0) {
          X509_NAME_free(pXVar4);
          goto LAB_009b74b8;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2);
      } while (iVar1 < iVar2);
    }
    *param_1 = lVar3;
  }
  return 1;
}

