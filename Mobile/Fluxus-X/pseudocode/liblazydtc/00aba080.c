/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba080
 */

int PEM_write_bio_X509_AUX(BIO *bp,X509 *x)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write_bio(i2d_X509_AUX,"TRUSTED CERTIFICATE",bp,x,(EVP_CIPHER *)0x0,(uchar *)0x0,
                             0,(undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

