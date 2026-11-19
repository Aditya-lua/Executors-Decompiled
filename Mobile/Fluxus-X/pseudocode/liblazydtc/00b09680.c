/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09680
 */

X509 * X509_find_by_subject(stack_st_X509 *sk,X509_NAME *name)

{
  int iVar1;
  int iVar2;
  X509 *pXVar3;
  
  iVar1 = OPENSSL_sk_num();
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      pXVar3 = (X509 *)OPENSSL_sk_value(sk,iVar1);
      iVar2 = X509_NAME_cmp((X509_NAME *)pXVar3->ex_flags,name);
      if (iVar2 == 0) {
        return pXVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(sk);
    } while (iVar1 < iVar2);
  }
  return (X509 *)0x0;
}

