/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16044
 */

RSA * d2i_RSAPrivateKey_fp(FILE *fp,RSA **rsa)

{
  ASN1_ITEM *it;
  RSA *pRVar1;
  
  it = (ASN1_ITEM *)RSAPrivateKey_it();
  pRVar1 = ASN1_item_d2i_fp(it,fp,rsa);
  return pRVar1;
}

