/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab965c
 */

int PEM_write_bio_PKCS8(BIO *bp,X509_SIG *x)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write_bio(i2d_X509_SIG,"ENCRYPTED PRIVATE KEY",bp,x,(EVP_CIPHER *)0x0,
                             (uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

