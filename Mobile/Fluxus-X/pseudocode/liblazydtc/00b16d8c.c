/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16d8c
 */

EVP_PKEY * d2i_PrivateKey_bio(BIO *bp,EVP_PKEY **a)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = ASN1_d2i_bio(EVP_PKEY_new,d2i_AutoPrivateKey,bp,a);
  return pEVar1;
}

