/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16d74
 */

int i2d_PrivateKey_bio(BIO *bp,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_PrivateKey,bp,(uchar *)pkey);
  return iVar1;
}

