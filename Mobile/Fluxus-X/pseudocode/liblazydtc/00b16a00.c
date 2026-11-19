/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16a00
 */

int i2d_PKCS8_bio(BIO *bp,X509_SIG *p8)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_X509_SIG,bp,(uchar *)p8);
  return iVar1;
}

