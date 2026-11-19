/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b163bc
 */

int i2d_ECPrivateKey_bio(BIO *bp,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_ECPrivateKey,bp,(uchar *)eckey);
  return iVar1;
}

