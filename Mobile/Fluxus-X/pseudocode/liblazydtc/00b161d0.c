/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b161d0
 */

int i2d_RSAPublicKey_bio(BIO *bp,RSA *rsa)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)RSAPublicKey_it();
  iVar1 = ASN1_item_i2d_bio(it,bp,rsa);
  return iVar1;
}

