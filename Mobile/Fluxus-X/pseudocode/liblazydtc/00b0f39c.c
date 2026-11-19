/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f39c
 */

void X509_STORE_CTX_set0_crls(X509_STORE_CTX *c,stack_st_X509_CRL *sk)

{
  c->untrusted = (stack_st_X509 *)sk;
  return;
}

