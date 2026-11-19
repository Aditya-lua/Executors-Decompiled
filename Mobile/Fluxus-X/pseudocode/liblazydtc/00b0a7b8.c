/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a7b8
 */

X509_LOOKUP * X509_STORE_add_lookup(X509_STORE *v,X509_LOOKUP_METHOD *m)

{
  int iVar1;
  int iVar2;
  X509_LOOKUP *pXVar3;
  _func_1835 *p_Var4;
  stack_st_X509_LOOKUP *psVar5;
  
  psVar5 = v->get_cert_methods;
  iVar1 = OPENSSL_sk_num(psVar5);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      pXVar3 = (X509_LOOKUP *)OPENSSL_sk_value(psVar5,iVar1);
      if (pXVar3->method == m) {
        return pXVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(psVar5);
    } while (iVar1 < iVar2);
  }
  pXVar3 = X509_LOOKUP_new(m);
  if (pXVar3 == (X509_LOOKUP *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x118,"X509_STORE_add_lookup");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    pXVar3->store_ctx = v;
    iVar1 = OPENSSL_sk_push(v->get_cert_methods,pXVar3);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509_lu.c",0x120,"X509_STORE_add_lookup");
      ERR_set_error(0xb,0xc0100,0);
      if ((pXVar3->method != (X509_LOOKUP_METHOD *)0x0) &&
         (p_Var4 = pXVar3->method->free, p_Var4 != (_func_1835 *)0x0)) {
        (*p_Var4)(pXVar3);
      }
      CRYPTO_free(pXVar3);
      pXVar3 = (X509_LOOKUP *)0x0;
    }
  }
  return pXVar3;
}

