/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35804
 */

EVP_PKEY * b2i_PrivateKey_bio(BIO *in)

{
  EVP_PKEY *pEVar1;
  undefined4 local_14;
  
  local_14 = 0;
  pEVar1 = (EVP_PKEY *)ossl_b2i_bio(in,&local_14);
  return pEVar1;
}

