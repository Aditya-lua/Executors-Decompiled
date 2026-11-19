/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16384
 */

int i2d_EC_PUBKEY_bio(BIO *bp,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_EC_PUBKEY,bp,(uchar *)eckey);
  return iVar1;
}

