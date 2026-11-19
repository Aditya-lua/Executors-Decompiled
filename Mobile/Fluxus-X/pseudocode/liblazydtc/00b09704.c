/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09704
 */

EVP_PKEY * X509_get_pubkey(X509 *x)

{
  EVP_PKEY *pEVar1;
  
  if (x == (X509 *)0x0) {
    return (EVP_PKEY *)0x0;
  }
  pEVar1 = X509_PUBKEY_get((X509_PUBKEY *)x->ex_kusage);
  return pEVar1;
}

