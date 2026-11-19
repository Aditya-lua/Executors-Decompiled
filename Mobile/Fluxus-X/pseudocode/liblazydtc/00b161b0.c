/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b161b0
 */

RSA * d2i_RSA_PUBKEY_bio(BIO *bp,RSA **rsa)

{
  RSA *pRVar1;
  
  pRVar1 = ASN1_d2i_bio(RSA_new,d2i_RSA_PUBKEY,bp,rsa);
  return pRVar1;
}

