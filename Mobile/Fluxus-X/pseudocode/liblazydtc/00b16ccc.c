/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16ccc
 */

EVP_PKEY * d2i_PUBKEY_fp(FILE *fp,EVP_PKEY **a)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = ASN1_d2i_fp(EVP_PKEY_new,d2i_PUBKEY,fp,a);
  return pEVar1;
}

