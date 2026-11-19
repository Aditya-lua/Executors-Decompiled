/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b162dc
 */

int i2d_DSA_PUBKEY_bio(BIO *bp,DSA *dsa)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_DSA_PUBKEY,bp,(uchar *)dsa);
  return iVar1;
}

