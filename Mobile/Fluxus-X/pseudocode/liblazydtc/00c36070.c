/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36070
 */

int PEM_ASN1_write_bio(undefined1 *i2d,char *name,BIO *bp,void *x,EVP_CIPHER *enc,uchar *kstr,
                      int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write_bio(i2d,name,bp,x,enc,kstr,klen,cb,u);
  return iVar1;
}

