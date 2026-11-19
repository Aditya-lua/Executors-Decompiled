/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16dc4
 */

EVP_PKEY * d2i_PUBKEY_bio(BIO *bp,EVP_PKEY **a)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = ASN1_d2i_bio(EVP_PKEY_new,d2i_PUBKEY,bp,a);
  return pEVar1;
}

