/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1609c
 */

RSA * d2i_RSAPublicKey_fp(FILE *fp,RSA **rsa)

{
  ASN1_ITEM *it;
  RSA *pRVar1;
  
  it = (ASN1_ITEM *)RSAPublicKey_it();
  pRVar1 = ASN1_item_d2i_fp(it,fp,rsa);
  return pRVar1;
}

