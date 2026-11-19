/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b161fc
 */

int i2d_RSA_PUBKEY_bio(BIO *bp,RSA *rsa)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_RSA_PUBKEY,bp,(uchar *)rsa);
  return iVar1;
}

