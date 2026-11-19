/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16b28
 */

EVP_PKEY * d2i_PrivateKey_fp(FILE *fp,EVP_PKEY **a)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = ASN1_d2i_fp(EVP_PKEY_new,d2i_AutoPrivateKey,fp,a);
  return pEVar1;
}

