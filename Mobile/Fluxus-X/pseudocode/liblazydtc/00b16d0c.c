/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16d0c
 */

int i2d_PKCS8_PRIV_KEY_INFO_bio(BIO *bp,PKCS8_PRIV_KEY_INFO *p8inf)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_PKCS8_PRIV_KEY_INFO,bp,(uchar *)p8inf);
  return iVar1;
}

