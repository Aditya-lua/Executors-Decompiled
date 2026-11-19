/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09bb8
 */

long X509_chain_up_ref(void)

{
  int iVar1;
  int iVar2;
  long lVar3;
  X509 *a;
  
  lVar3 = OPENSSL_sk_dup();
  if ((lVar3 != 0) && (iVar1 = OPENSSL_sk_num(lVar3), 0 < iVar1)) {
    iVar1 = 0;
    do {
      OPENSSL_sk_value(lVar3,iVar1);
      iVar2 = X509_up_ref();
      if (iVar2 == 0) {
        if (iVar1 != 0) {
          iVar1 = iVar1 + 1;
          do {
            a = (X509 *)OPENSSL_sk_value(lVar3,iVar1 + -2);
            X509_free(a);
            iVar1 = iVar1 + -1;
          } while (1 < iVar1);
        }
        OPENSSL_sk_free(lVar3);
        return 0;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(lVar3);
    } while (iVar1 < iVar2);
  }
  return lVar3;
}

